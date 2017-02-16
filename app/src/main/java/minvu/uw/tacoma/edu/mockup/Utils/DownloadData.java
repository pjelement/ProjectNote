package minvu.uw.tacoma.edu.mockup.Utils;

import android.os.AsyncTask;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by minhvu on 2/14/17.
 */

public class DownloadData extends AsyncTask<String, Void, String> {

    @Override
    protected String doInBackground(String... urls) {
        String response = "";
        HttpURLConnection urlConnection = null;
        for (String url : urls) {
            try {
                URL urlObject = new URL(url);
                urlConnection = (HttpURLConnection) urlObject.openConnection();

                InputStream content = urlConnection.getInputStream();

                BufferedReader buffer = new BufferedReader(new InputStreamReader(content));
                String s = "";
                while ((s = buffer.readLine()) != null) {
                    response += s;
                }

            } catch (Exception e) {
                response = "Unable to download the list of courses, Reason: "
                        + e.getMessage();
            } finally {
                if (urlConnection != null)
                    urlConnection.disconnect();
            }
        }
        return response;
    }

    @Override
    protected void onPostExecute(String result) {
        // Something wrong with the network or the URL
        if (result.startsWith("Unable to")) {

        } else if (result!=null) {
            System.out.println("Result is ready");
            System.out.println(result);
            // Adding the User model

        }
    }
}
