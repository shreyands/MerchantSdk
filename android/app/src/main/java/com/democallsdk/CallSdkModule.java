package com.democallsdk; // replace com.democallsdk with your app’s name

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.util.Map;
import com.ds.merchant.MerchantAcquisition;
import java.util.HashMap;



public class CallSdkModule extends ReactContextBaseJavaModule{
    CallSdkModule(ReactApplicationContext context) {
        super(context);
    }

    @Override
    public String getName() {
        return "CallSdkModule";
    }

    @ReactMethod
    public void call(){
        // call SDK method from here
        MerchantAcquisition.startApp(
                            getCurrentActivity(),
                            "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwiZmlyc3ROYW1lIjoiRGF0YVN1dHJhbSIsImxhc3ROYW1lIjoiU0RLIiwiZW1haWwiOiJkYXRhc3V0cmFtQGRhdGFzdXRyYW0uY29tIiwidHlwZSI6ImFwaWtleSIsInJvbGVzIjpbImJhc2ljIiwibWVyY2hhbnRfYWNxdWlzaXRpb24iXSwiaWF0IjoxNjcwOTk4NDE0LCJleHAiOjE2NzA5OTg0MTd9.NkGgBceiKI9hRw93GPX3wFwnW6h57sz7gCu6xKiPuVo",
                            45);
    }

}
