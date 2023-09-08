package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.CookieManager;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.zip.GZIPInputStream;
import org.json.JSONException;
import org.json.JSONObject;
import p828wa.C53095a;
import p828wa.C53096b;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.m1 */
public class C43618m1<T extends C53095a> extends C43620m2<T> {

    /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.m1$a */
    public class C43619a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C53096b.C53097a f117870d;

        public C43619a(C43618m1 m1Var, C53096b.C53097a aVar) {
            this.f117870d = aVar;
        }

        public void run() {
            String responseMessage;
            InputStream bufferedInputStream;
            InputStreamReader inputStreamReader;
            StringWriter stringWriter;
            C53096b.C53097a aVar;
            String optString = this.f117870d.f148190b.f129368c.optString("url");
            JSONObject optJSONObject = this.f117870d.f148190b.f129368c.optJSONObject("header");
            String optString2 = this.f117870d.f148190b.f129368c.optString(FirebaseAnalytics.C113379b.METHOD);
            String optString3 = this.f117870d.f148190b.f129368c.optString("body");
            JSONObject jSONObject = new JSONObject();
            if (Util.isNullOrNil(optString)) {
                try {
                    jSONObject.put("errMsg", "url is null");
                } catch (JSONException unused) {
                }
                this.f117870d.mo73778c("fail", jSONObject);
            } else if (Util.isNullOrNil(optString2) || (!optString2.equalsIgnoreCase("GET") && !optString2.equalsIgnoreCase("POST"))) {
                try {
                    jSONObject.put("errMsg", "method is valid");
                } catch (JSONException unused2) {
                }
                this.f117870d.mo73778c("fail", jSONObject);
            } else {
                try {
                    URL url = new URL(optString);
                    CookieManager instance = CookieManager.getInstance();
                    String cookie = instance.getCookie("." + url.getHost());
                    HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                    httpURLConnection.setConnectTimeout(10000);
                    httpURLConnection.setReadTimeout(10000);
                    httpURLConnection.setUseCaches(false);
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.setInstanceFollowRedirects(true);
                    if (optJSONObject != null) {
                        Iterator<String> keys = optJSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            httpURLConnection.addRequestProperty(next, optJSONObject.optString(next));
                        }
                    }
                    httpURLConnection.addRequestProperty("user-agent", ((C53095a) this.f117870d.f148189a).getRuntime().mo73585d());
                    if (cookie != null) {
                        httpURLConnection.addRequestProperty("cookie", cookie);
                    }
                    if (optString2.equalsIgnoreCase("GET")) {
                        httpURLConnection.setRequestMethod("GET");
                    } else if (optString2.equalsIgnoreCase("POST")) {
                        httpURLConnection.setRequestMethod("POST");
                        httpURLConnection.setDoOutput(true);
                        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(httpURLConnection.getOutputStream(), "UTF-8"));
                        bufferedWriter.write(optString3);
                        bufferedWriter.flush();
                        bufferedWriter.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    responseMessage = httpURLConnection.getResponseMessage();
                    if (responseCode == 200 || responseCode == 206) {
                        String contentEncoding = httpURLConnection.getContentEncoding();
                        InputStream inputStream = httpURLConnection.getInputStream();
                        bufferedInputStream = (contentEncoding == null || !contentEncoding.toLowerCase().contains("gzip")) ? new BufferedInputStream(inputStream) : new GZIPInputStream(inputStream);
                        inputStreamReader = new InputStreamReader(bufferedInputStream);
                        char[] cArr = new char[4096];
                        stringWriter = new StringWriter();
                        while (true) {
                            try {
                                int read = inputStreamReader.read(cArr);
                                if (-1 == read) {
                                    break;
                                }
                                stringWriter.write(cArr, 0, read);
                            } catch (Exception e) {
                                Log.m105921e("MicroMsg.JsApiRequest", "convertStreamToString: read, %s", e.getMessage());
                                jSONObject.put("errMsg", e.getMessage());
                                this.f117870d.mo73778c("fail", jSONObject);
                                Util.qualityClose(inputStreamReader);
                                Util.qualityClose(bufferedInputStream);
                                jSONObject.put("responseMsg", responseMessage);
                                jSONObject.put("data", stringWriter.toString());
                                aVar = this.f117870d;
                            }
                        }
                        Util.qualityClose(inputStreamReader);
                        Util.qualityClose(bufferedInputStream);
                        jSONObject.put("responseMsg", responseMessage);
                        jSONObject.put("data", stringWriter.toString());
                        aVar = this.f117870d;
                        aVar.mo73780e(jSONObject);
                        return;
                    }
                    jSONObject.put("responseMsg", responseMessage);
                    this.f117870d.mo73778c("fail", jSONObject);
                } catch (Exception e2) {
                    Log.m105920e("MicroMsg.JsApiRequest", e2.getMessage());
                    try {
                        jSONObject.put("errMsg", e2.getMessage());
                    } catch (JSONException unused3) {
                    }
                    this.f117870d.mo73778c("fail", jSONObject);
                } catch (Throwable th) {
                    Util.qualityClose(inputStreamReader);
                    Util.qualityClose(bufferedInputStream);
                    jSONObject.put("responseMsg", responseMessage);
                    jSONObject.put("data", stringWriter.toString());
                    this.f117870d.mo73780e(jSONObject);
                    throw th;
                }
            }
        }
    }

    /* renamed from: b */
    public String mo5382b() {
        return "request";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 0;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
    }

    /* renamed from: e */
    public void mo5385e(C53096b<T>.a aVar) {
        ((C119157j) C119157j.f356862d).mo183875f(new C43619a(this, aVar));
    }
}
