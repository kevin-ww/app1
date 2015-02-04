package com.example.kevin.app1;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.kevin.app1.model.APIResponse;
import com.example.kevin.app1.model.ConfigurationBO;
import com.example.kevin.app1.model.request.ConfigurationAPIRequest;
import com.kvn.mw.api.ApiRequest;
import com.kvn.mw.api.ApiRequestGenerator;
import com.kvn.mw.api.ApiResponseData;
import com.kvn.mw.api.configuration.RequestParams;
import com.kvn.mw.api.configuration.ResponseData;


public class DisplayMessageActivity extends Activity {

//    public static final TextView textView = new TextView(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_display_message);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        //display the message;
        final TextView textView = new TextView(this);
//        textView.setText(message);
//        //Then add the TextView as the root view of the activity’s layout by passing it to setContentView().
//
//        setContentView(textView);


        //

        //send the message using volley;

        // Instantiate the RequestQueue.
        RequestQueue queue = Volley.newRequestQueue(this);

        queue.start();

        RequestParams requestParams = new RequestParams().setAk("ak-kevin");

        ApiRequest<RequestParams,ResponseData> configurationApiRequest =  ApiRequestGenerator.generateConfigurationApiRequest(requestParams, new Response.Listener<ResponseData>() {
            @Override
            public void onResponse(ResponseData response) {

//                ResponseData responseData = response.getData();

//                textView.setText(JSON.toJSONString(responseData));
                textView.setText(response.toString());
            }
        });

        //
        queue.add(configurationApiRequest);

//        ConfigurationBO configurationBO = null;
//
//        ConfigurationAPIRequest request = new ConfigurationAPIRequest(configurationBO);
//
//        queue.add(request);
//        String url ="http://www.baidu.com";
//
//// Request a string response from the provided URL.
//        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
//                new Response.Listener<String>() {
//                    @Override
//                    public void onResponse(String response) {
//                        // Display the first 500 characters of the response string.
//                        textView.setText("Response is: " + response);
//                    }
//
//                }, new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError error) {
//                textView.setText("That didn't work!");
//            }
//        });
//// Add the request to the RequestQueue.
//        queue.add(stringRequest);

        textView.setText(message);

        setContentView(textView);



    }



//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_display_message, menu);
//        return true;
//    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() { }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_display_message,
                    container, false);
            return rootView;
        }
    }
}
