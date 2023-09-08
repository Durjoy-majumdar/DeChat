package com.tencent.p014mm.sdk.http;

import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.vfs.C86015s1;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.zip.GZIPInputStream;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.message.BasicNameValuePair;

/* renamed from: com.tencent.mm.sdk.http.HttpClientWrapper */
public class HttpClientWrapper extends HttpWrapperBase {
    public static final String DEF_ATTACH_NAME = "default_attach_name";
    private static final int MAX_CONTENT_LENGTH = 5242880;
    public static final int RET_CODE_CONTENT_TOO_LARGE = -10000;
    public static final int RET_CODE_FILE_NOT_FOUND = -10004;
    public static final int RET_CODE_ILLEGAL_STATE = -10003;
    public static final int RET_CODE_PROTOCOL = -10002;
    public static final int RET_CODE_UNKOWN_HOST = -10005;
    public static final int RET_CODE_UNSUPPORT_ENCODE = -10001;
    public static final int RET_NETWORK_UNAVAILABLE = -10006;
    public static final int RET_SDCARD_UNAVAILABLE = -10007;
    private static final String TAG = "MicroMsg.HttpClientWrapper";
    private HttpClient client;
    private HttpRequestBase httpRequest = null;
    private HttpResponse httpResponse = null;
    private boolean isCancelled = false;
    private int result = 0;

    public HttpClientWrapper(HttpClient httpClient) {
        this.client = httpClient;
    }

    private void writePostStringContent(HttpWrapperBase.Request request, HttpRequestBase httpRequestBase) {
        if (request.params != null) {
            ArrayList arrayList = new ArrayList();
            for (String next : request.params.keySet()) {
                arrayList.add(new BasicNameValuePair(next, request.params.get(next)));
            }
            ((HttpPost) httpRequestBase).setEntity(new UrlEncodedFormEntity(arrayList, "utf-8"));
        }
    }

    public void cancel() {
        Log.m105918d(TAG, "cancel conection.");
        this.isCancelled = true;
        HttpRequestBase httpRequestBase = this.httpRequest;
        if (httpRequestBase != null && !httpRequestBase.isAborted()) {
            this.httpRequest.abort();
        }
        HttpClient httpClient = this.client;
        if (httpClient != null) {
            httpClient.getConnectionManager().shutdown();
        }
    }

    public void send(HttpWrapperBase.Request request, HttpWrapperBase.Response response) {
        HttpClient httpClient;
        int read;
        Log.m105919d(TAG, "request: %s", request);
        int i = 503;
        try {
            this.isCancelled = false;
            if (request.method == 0) {
                this.httpRequest = new HttpGet(request.getUrl());
            } else {
                this.httpRequest = new HttpPost(request.getUrl());
            }
            this.httpRequest.addHeader("User-Agent", "weixin/android");
            this.httpRequest.addHeader("Host", request.host);
            System.setProperty("http.keepAlive", "false");
            this.httpRequest.addHeader("Accept-Charset", "utf-8");
            this.httpRequest.addHeader("Accept-Encoding", HttpWrapperBase.ACCEPT_ENCODING);
            this.httpRequest.addHeader("Content-Type", "text/html");
            this.httpRequest.addHeader("Cookie", HttpWrapperBase.getCookie(request.cookie));
            if (request.method == 1) {
                writePostStringContent(request, this.httpRequest);
            }
            HttpResponse execute = this.client.execute(this.httpRequest);
            this.httpResponse = execute;
            this.result = execute.getStatusLine().getStatusCode();
            String str = null;
            String value = this.httpResponse.getFirstHeader("set-cookie") != null ? this.httpResponse.getFirstHeader("set-cookie").getValue() : null;
            if (this.httpResponse.getFirstHeader("Content-Encoding") != null) {
                str = this.httpResponse.getFirstHeader("Content-Encoding").getValue();
            }
            if (this.httpResponse.getFirstHeader("Content-Disposition") != null) {
                this.httpResponse.getFirstHeader("Content-Disposition").getValue();
            }
            HttpEntity entity = this.httpResponse.getEntity();
            long contentLength = entity.getContentLength();
            InputStream content = entity.getContent();
            if (str != null && str.contains("gzip")) {
                content = new GZIPInputStream(content);
            }
            HttpWrapperBase.Attachment attachment = response.attachment;
            OutputStream byteArrayOutputStream = (attachment == null || Util.isNullOrNil(attachment.filePath)) ? new ByteArrayOutputStream() : C86013q1.m106427I(new C86009m1(response.attachment.filePath), true);
            byte[] bArr = new byte[1024];
            while (!this.isCancelled && (read = content.read(bArr)) > 0) {
                byteArrayOutputStream.write(bArr, 0, read);
                byteArrayOutputStream.flush();
            }
            if (this.isCancelled) {
                byteArrayOutputStream.flush();
                byteArrayOutputStream.close();
                HttpClient httpClient2 = this.client;
                if (httpClient2 != null) {
                    httpClient2.getConnectionManager().shutdown();
                    return;
                }
                return;
            }
            response.status = this.result;
            response.cookie = HttpWrapperBase.parseCookie(value);
            response.content = byteArrayOutputStream instanceof C86015s1 ? "" : new String(((ByteArrayOutputStream) byteArrayOutputStream).toByteArray());
            response.contentLength = contentLength;
            byteArrayOutputStream.flush();
            byteArrayOutputStream.close();
            entity.consumeContent();
            Log.m105919d(TAG, "response:%s", response);
            httpClient = this.client;
            if (httpClient == null) {
                return;
            }
            httpClient.getConnectionManager().shutdown();
        } catch (UnsupportedEncodingException unused) {
            response.status = -10001;
            response.content = "unsupported ecoding";
            httpClient = this.client;
            if (httpClient == null) {
            }
        } catch (UnknownHostException unused2) {
            response.status = -10005;
            response.content = "unknow host";
            httpClient = this.client;
            if (httpClient == null) {
            }
        } catch (ClientProtocolException unused3) {
            response.status = -10002;
            response.content = "client protocol error";
            httpClient = this.client;
            if (httpClient == null) {
            }
        } catch (IllegalStateException unused4) {
            response.status = -10003;
            response.content = "illegal state";
            httpClient = this.client;
            if (httpClient == null) {
            }
        } catch (FileNotFoundException unused5) {
            response.status = -10004;
            response.content = "output file not found";
            httpClient = this.client;
            if (httpClient == null) {
            }
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "http unavailable", new Object[0]);
            int i2 = this.result;
            if (i2 != 0) {
                i = i2;
            }
            response.status = i;
            httpClient = this.client;
            if (httpClient == null) {
            }
        } catch (OutOfMemoryError e2) {
            Log.printErrStackTrace(TAG, e2, "http unavailable", new Object[0]);
            int i3 = this.result;
            if (i3 != 0) {
                i = i3;
            }
            response.status = i;
            httpClient = this.client;
            if (httpClient == null) {
            }
        } catch (Throwable th) {
            HttpClient httpClient3 = this.client;
            if (httpClient3 != null) {
                httpClient3.getConnectionManager().shutdown();
            }
            throw th;
        }
    }
}
