package com.example.x1.app2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.alibaba.fastjson.JSON;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;
import com.example.kevin.app1.R;
import com.kvn.mw.api.ApiRequest;
import com.kvn.mw.api.ApiRequestGenerator;
import com.kvn.mw.api.ApiResponseData;
import com.kvn.mw.api.configuration.RequestParams;
//import com.kvn.mw.api.configuration.RequestParamsBuilder;
import com.kvn.mw.api.configuration.ResponseData;


public class DisplayMessageActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();

        final TextView textView = new TextView(this);


        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);



        RequestQueue requestQueue = Volley.newRequestQueue(this.getApplicationContext());
        requestQueue.start();



        //
        RequestParams requestParams = new RequestParams().setAk("ak-kevin");
//
//        ApiRequest<RequestParams> configurationApiRequest =  ApiRequestGenerator.generateConfigurationApiRequest(requestParams,new Response.Listener<ApiResponseData>() {
//            @Override
//            public void onResponse(ApiResponseData response) {
//
////                ResponseData responseData =   response.getData();
//
////                textView.setText(JSON.toJSONString(responseData));
//                textView.setText("hahhaah,what is the damn");
//            }
//        });

        //
//        requestQueue.add(configurationApiRequest);

        //


//        textView.setText(message);

        //
        setContentView(textView);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_display_message, menu);
        return true;
    }

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
}
