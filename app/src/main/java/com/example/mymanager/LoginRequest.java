package com.example.mymanager;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class LoginRequest extends StringRequest {

    //서버 url 설정(php파일 연동)
    final static  private String URL="http://cpcp1245.dothome.co.kr/html/Login.php";
    private Map<String,String>parameters;

    public LoginRequest(String userID, String userPass, Response.Listener<String>listener){
        super(Method.POST,URL,listener,null);

        parameters=new HashMap<>();
        parameters.put("userID",userID);
        parameters.put("userPW",userPass);

    }

    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return parameters;
    }
}