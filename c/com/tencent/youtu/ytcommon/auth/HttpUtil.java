package com.tencent.youtu.ytcommon.auth;

import android.text.TextUtils;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpUtil {
    private static final String CHARSET_UTF8 = "UTF-8";
    private static final int DEFAULT_TIMEOUT_MILLIS = 10000;

    public interface HttpResponseListener {
        void onFail(int i);

        void onSuccess(String str);
    }

    private static HttpURLConnection buildConnection(String str, int i) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setConnectTimeout(i);
        httpURLConnection.setReadTimeout(i);
        return httpURLConnection;
    }

    private static String getResponse(HttpURLConnection httpURLConnection, HttpResponseListener httpResponseListener) {
        try {
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                InputStream inputStream = httpURLConnection.getInputStream();
                StringBuilder sb = new StringBuilder();
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    sb.append(new String(bArr, 0, read));
                }
                inputStream.close();
                String sb4 = sb.toString();
                if (httpResponseListener != null) {
                    httpResponseListener.onSuccess(sb4);
                }
                return sb4;
            }
            if (httpResponseListener != null) {
                httpResponseListener.onFail(responseCode);
            }
            return null;
        } catch (Exception unused) {
        }
    }

    public static String post(String str, String str2, HttpResponseListener httpResponseListener) {
        HttpURLConnection buildConnection = buildConnection(str, 10000);
        buildConnection.setRequestProperty("Content-Type", "application/json");
        buildConnection.setRequestMethod("POST");
        if (!TextUtils.isEmpty(str2)) {
            OutputStream outputStream = buildConnection.getOutputStream();
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
            bufferedWriter.write(str2);
            bufferedWriter.flush();
            bufferedWriter.close();
            outputStream.close();
        }
        return getResponse(buildConnection, httpResponseListener);
    }
}
