package com.tencent.p014mm.sdk.http;

import android.net.Uri;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86001b0;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.InvalidParameterException;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.EntityUtils;

/* renamed from: com.tencent.mm.sdk.http.HttpClientUploadWrapper */
public class HttpClientUploadWrapper extends HttpWrapperBase {
    /* access modifiers changed from: private */
    public static final String BOUNDARY = ("WEIXIN" + System.currentTimeMillis());
    private static final int CHUNK_LEN = 1024;
    private static final String FIX = "--";
    private static final String MULTIPART_FORM_DATA = "multipart/form-data";
    private static final String NEW_LINE = "\r\n";
    private static final String TAG = "MicroMsg.HttpClientWrapper";
    private HttpClient client;
    private HttpPost post;

    /* renamed from: com.tencent.mm.sdk.http.HttpClientUploadWrapper$FileUploadEntity */
    public class FileUploadEntity implements HttpEntity {
        private C86009m1 file;
        private int length;
        private String nextPart;
        private String prePart;

        public FileUploadEntity(String str, String str2, String str3) {
            this.prePart = str;
            this.file = new C86009m1(str2);
            this.nextPart = str3;
            this.length = str.length() + ((int) this.file.mo119980r()) + str3.length();
        }

        public void consumeContent() {
            if (isStreaming()) {
                throw new UnsupportedOperationException("Streaming entity does not implement #consumeContent()");
            }
        }

        public InputStream getContent() {
            throw new UnsupportedOperationException("Multipart form entity does not implement #getContent()");
        }

        public Header getContentEncoding() {
            return null;
        }

        public long getContentLength() {
            return (long) this.length;
        }

        public Header getContentType() {
            return new BasicHeader("Content-Type", "multipart/form-data; boundary=----" + HttpClientUploadWrapper.BOUNDARY);
        }

        public boolean isChunked() {
            return !isRepeatable();
        }

        public boolean isRepeatable() {
            return true;
        }

        public boolean isStreaming() {
            return !isRepeatable();
        }

        public void writeTo(OutputStream outputStream) {
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
            dataOutputStream.writeBytes(this.prePart);
            InputStream inputStream = null;
            try {
                byte[] bArr = new byte[1024];
                InputStream D = C86013q1.m106422D(this.file);
                while (true) {
                    int read = D.read(bArr);
                    if (read > 0) {
                        dataOutputStream.write(bArr, 0, read);
                    } else {
                        dataOutputStream.flush();
                        D.close();
                        dataOutputStream.writeBytes(this.nextPart);
                        return;
                    }
                }
            } catch (Throwable th) {
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        }
    }

    public HttpClientUploadWrapper(HttpClient httpClient) {
        this.client = httpClient;
    }

    private String genNextPart(HttpWrapperBase.Request request) {
        StringBuilder sb = new StringBuilder();
        sb.append("\r\n");
        sb.append("------" + BOUNDARY + FIX + "\r\n");
        return sb.toString();
    }

    private String genPrePart(HttpWrapperBase.Request request) {
        C86001b0 q;
        StringBuilder sb = new StringBuilder();
        for (String next : request.params.keySet()) {
            sb.append("------" + BOUNDARY + "\r\n");
            sb.append("Content-Disposition: form-data; name=\"" + next + FastJsonResponse.QUOTE + "\r\n");
            sb.append("\r\n");
            sb.append(request.params.get(next));
            sb.append("\r\n");
        }
        Uri n = C116299g2.m163858n(request.attachment.filePath);
        String path = n.getPath();
        boolean z = false;
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
        if (l.mo177810a() && (q = l.f348991a.mo119945q(l.f348992b)) != null && !q.f250476f) {
            z = true;
        }
        if (z) {
            String path2 = n.getPath();
            int lastIndexOf = path2.lastIndexOf("/");
            if (lastIndexOf >= 0) {
                path2 = path2.substring(lastIndexOf + 1);
            }
            sb.append("------" + BOUNDARY + "\r\n");
            sb.append("Content-Disposition: form-data; name=\"" + request.attachment.param + "\"; filename=\"" + path2 + FastJsonResponse.QUOTE + "\r\n");
            sb.append("\r\n");
            return sb.toString();
        }
        throw new InvalidParameterException("The path to upload isnot a file.");
    }

    public void cancel() {
        Log.m105918d(TAG, "cancel conection.");
        HttpPost httpPost = this.post;
        if (httpPost != null && !httpPost.isAborted()) {
            this.post.abort();
        }
        this.client.getConnectionManager().shutdown();
    }

    public void send(HttpWrapperBase.Request request, HttpWrapperBase.Response response) {
        int i;
        Log.m105919d(TAG, "request: %s", request);
        try {
            FileUploadEntity fileUploadEntity = new FileUploadEntity(genPrePart(request), request.attachment.filePath, genNextPart(request));
            HttpPost httpPost = new HttpPost(request.getUrl());
            this.post = httpPost;
            httpPost.setHeader("User-Agent", "weixin/android");
            this.post.setHeader("Host", request.host);
            this.post.setHeader("Connection", "Keep-Alive");
            this.post.setHeader("Accept-Charset", "utf-8");
            this.post.setHeader("Cookie", HttpWrapperBase.getCookie(request.cookie));
            this.post.setEntity(fileUploadEntity);
            HttpResponse execute = this.client.execute(this.post);
            i = execute.getStatusLine().getStatusCode();
            try {
                HttpEntity entity = execute.getEntity();
                String value = execute.getFirstHeader("set-cookie").getValue();
                String entityUtils = EntityUtils.toString(entity);
                response.status = i;
                response.cookie = HttpWrapperBase.parseCookie(value);
                response.content = entityUtils;
                Log.m105919d(TAG, "response: %s", response);
            } catch (Exception e) {
                e = e;
            }
        } catch (Exception e2) {
            e = e2;
            i = 0;
            try {
                Log.printErrStackTrace(TAG, e, "", new Object[0]);
                Log.printErrStackTrace(TAG, e, "", new Object[0]);
                if (i == 0) {
                    i = 503;
                }
                response.status = i;
                this.client.getConnectionManager().shutdown();
            } catch (Throwable th) {
                this.client.getConnectionManager().shutdown();
                throw th;
            }
        }
        this.client.getConnectionManager().shutdown();
    }
}
