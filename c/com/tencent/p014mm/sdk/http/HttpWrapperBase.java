package com.tencent.p014mm.sdk.http;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.mm.sdk.http.HttpWrapperBase */
public abstract class HttpWrapperBase {
    public static final String ACCEPT_ENCODING = "compress;q=0.5, gzip;q=1.0";
    public static final String CHARSET = "utf-8";
    public static final int METHOD_GET = 0;
    public static final int METHOD_POST = 1;
    public static final String PROTOCAL_HTTP = "http://";
    public static final String PROTOCAL_HTTPS = "https://";
    private static final String TAG = "MicroMsg.HttpWrapperBase";
    public final String userAgent = "weixin/android";

    /* renamed from: com.tencent.mm.sdk.http.HttpWrapperBase$Attachment */
    public static class Attachment {
        public String filePath;
        public String param;

        public Attachment(String str, String str2) {
            this.param = str;
            this.filePath = str2;
        }
    }

    /* renamed from: com.tencent.mm.sdk.http.HttpWrapperBase$Request */
    public static class Request {
        public Attachment attachment;
        public Map<String, String> cookie;
        public byte[] customPostData;
        public String host;
        public int method;
        public Map<String, String> params;
        public String protocal;
        public int timeout;
        public String uri;

        public Request(int i, Map<String, String> map, Map<String, String> map2, Attachment attachment2) {
            this.method = i;
            this.params = map;
            this.cookie = map2;
            this.attachment = attachment2;
        }

        public String getUrl() {
            StringBuilder sb = new StringBuilder();
            if (!this.uri.startsWith(HttpWrapperBase.PROTOCAL_HTTP) && !this.uri.startsWith(HttpWrapperBase.PROTOCAL_HTTPS)) {
                sb.append(this.protocal + this.host);
            }
            sb.append(this.uri);
            if (this.params == null) {
                return sb.toString();
            }
            sb.append('?');
            boolean z = true;
            for (String next : this.params.keySet()) {
                String str = this.params.get(next);
                sb.append(z ? "" : "&");
                sb.append(URLEncoder.encode(next, "utf-8"));
                sb.append('=');
                sb.append(URLEncoder.encode(Util.nullAsNil(str), "utf-8"));
                z = false;
            }
            return sb.toString();
        }

        public String toString() {
            try {
                return getUrl();
            } catch (UnsupportedEncodingException e) {
                Log.printErrStackTrace(HttpWrapperBase.TAG, e, "", new Object[0]);
                return "";
            }
        }
    }

    /* renamed from: com.tencent.mm.sdk.http.HttpWrapperBase$Response */
    public static class Response {
        public Attachment attachment;
        public String content;
        public long contentLength;
        public Map<String, String> cookie;
        public int status;

        public Response(int i, Map<String, String> map, String str) {
            this.status = i;
            this.cookie = map;
            this.content = str;
        }

        public void onComplete() {
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Response status:");
            sb.append(this.status);
            sb.append(", cookie:");
            Object obj = this.cookie;
            if (obj == null) {
                obj = "";
            }
            sb.append(obj);
            sb.append(", content length :");
            String str = this.content;
            sb.append(str != null ? str.length() : 0);
            return sb.toString();
        }
    }

    public static String getCookie(Map<String, String> map) {
        if (map == null || map.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (String next : map.keySet()) {
            sb.append(URLEncoder.encode(next, "utf-8"));
            sb.append('=');
            sb.append(URLEncoder.encode(map.get(next), "utf-8"));
            i++;
            if (map.size() > i) {
                sb.append("; ");
            }
        }
        return sb.toString();
    }

    public static Map<String, String> parseCookie(String str) {
        HashMap hashMap = new HashMap();
        if (!(str == null || str.length() == 0)) {
            for (String split : str.split(";")) {
                String[] split2 = split.split("=");
                if (split2.length == 2) {
                    hashMap.put(split2[0], split2[1]);
                }
            }
        }
        return hashMap;
    }

    public void asyncSend(final Request request, final Response response, final MMHandler mMHandler) {
        ThreadPool.post(new Runnable() {
            public void run() {
                HttpWrapperBase.this.send(request, response);
                MMHandler mMHandler = mMHandler;
                if (mMHandler != null) {
                    mMHandler.post(new Runnable() {
                        public void run() {
                            response.onComplete();
                        }
                    });
                } else {
                    response.onComplete();
                }
            }
        }, getClass().getName());
    }

    public abstract void cancel();

    public abstract void send(Request request, Response response);
}
