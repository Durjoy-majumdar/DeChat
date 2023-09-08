package com.tencent.p014mm.modelimage.loader.impr;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ic0.C21068c;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import javax.net.ssl.SSLHandshakeException;
import jc0.C21210b;

/* renamed from: com.tencent.mm.modelimage.loader.impr.b */
public class C81000b implements C21068c {

    /* renamed from: com.tencent.mm.modelimage.loader.impr.b$a */
    public static class C81001a {
        /* renamed from: a */
        public static C21210b m98905a(String str) {
            String contentType;
            byte[] d;
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setConnectTimeout(15000);
            httpURLConnection.setReadTimeout(20000);
            InputStream inputStream = null;
            if (httpURLConnection.getResponseCode() >= 300) {
                try {
                    httpURLConnection.getInputStream().close();
                } catch (Exception e) {
                    Log.m105920e("MicroMsg.imageload.DefaultImageDownloader.HttpClientFactory", e.getMessage());
                }
                httpURLConnection.disconnect();
                Log.m105928w("MicroMsg.imageload.DefaultImageDownloader.HttpClientFactory", "dz[httpURLConnectionGet 300]");
                return null;
            }
            try {
                inputStream = httpURLConnection.getInputStream();
                contentType = httpURLConnection.getContentType();
                d = C81002e.m98906d(inputStream, false);
                httpURLConnection.getInputStream().close();
            } catch (Exception e2) {
                Log.m105920e("MicroMsg.imageload.DefaultImageDownloader.HttpClientFactory", e2.getMessage());
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Exception unused) {
                    }
                }
                throw th;
            }
            httpURLConnection.disconnect();
            C21210b bVar = new C21210b(d, contentType);
            try {
                inputStream.close();
            } catch (Exception unused2) {
            }
            return bVar;
        }
    }

    /* renamed from: a */
    public C21210b mo32789a(String str) {
        Log.m105919d("MicroMsg.imageload.DefaultImageDownloader", "[cpan] get image data from url:%s", str);
        try {
            return C81001a.m98905a(str);
        } catch (InterruptedException e) {
            Log.m105921e("MicroMsg.imageload.DefaultImageDownloader", "[cpan] get image data failed.:%s", Util.stackTraceToString(e));
            return new C21210b((byte[]) null, (String) null);
        } catch (UnknownHostException e2) {
            Log.m105921e("MicroMsg.imageload.DefaultImageDownloader", "[cpan] get image data failed.:%s", Util.stackTraceToString(e2));
            return new C21210b((byte[]) null, (String) null);
        } catch (SSLHandshakeException e3) {
            Log.m105921e("MicroMsg.imageload.DefaultImageDownloader", "[cpan] get image data failed.:%s", Util.stackTraceToString(e3));
            return new C21210b((byte[]) null, (String) null);
        } catch (SocketException e4) {
            Log.m105921e("MicroMsg.imageload.DefaultImageDownloader", "[cpan] get image data failed.:%s", Util.stackTraceToString(e4));
            return new C21210b((byte[]) null, (String) null);
        } catch (SocketTimeoutException e5) {
            Log.m105921e("MicroMsg.imageload.DefaultImageDownloader", "[cpan] get image data failed.:%s", Util.stackTraceToString(e5));
            return new C21210b((byte[]) null, (String) null);
        } catch (IOException e6) {
            Log.m105921e("MicroMsg.imageload.DefaultImageDownloader", "[cpan] get image data failed.:%s", Util.stackTraceToString(e6));
            return new C21210b((byte[]) null, (String) null);
        } catch (Exception e7) {
            Log.m105921e("MicroMsg.imageload.DefaultImageDownloader", "[cpan] get image data failed.:%s", Util.stackTraceToString(e7));
            return new C21210b((byte[]) null, (String) null);
        }
    }
}
