package p60;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import javax.net.ssl.SSLHandshakeException;
import o60.C100284b;
import t60.C101725g;
import w60.C102351c;
import w60.C102352d;
import x60.C102564a;

/* renamed from: p60.b */
public class C100633b extends C100284b<String> {

    /* renamed from: p60.b$a */
    public static class C100634a {
        /* renamed from: a */
        public static C102352d m131648a(String str) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setConnectTimeout(15000);
            httpURLConnection.setReadTimeout(20000);
            if (httpURLConnection.getResponseCode() >= 300) {
                try {
                    httpURLConnection.getInputStream().close();
                } catch (Exception e) {
                    Log.m105920e("MicroMsg.Loader.DefaultImageDownloader.HttpClientFactory", e.getMessage());
                }
                httpURLConnection.disconnect();
                Log.m105928w("MicroMsg.Loader.DefaultImageDownloader.HttpClientFactory", "dz[httpURLConnectionGet 300]");
                return null;
            }
            InputStream inputStream = httpURLConnection.getInputStream();
            String contentType = httpURLConnection.getContentType();
            byte[] a = C100636f.m131649a(inputStream);
            try {
                httpURLConnection.getInputStream().close();
            } catch (Exception e2) {
                Log.m105920e("MicroMsg.Loader.DefaultImageDownloader.HttpClientFactory", e2.getMessage());
            }
            httpURLConnection.disconnect();
            return new C102352d(a, contentType, new C102351c(a));
        }
    }

    /* renamed from: a */
    public void mo95802a(C102564a<String> aVar, C101725g gVar, C100284b.C100285a aVar2) {
        Log.m105925i("MicroMsg.Loader.DefaultImageDownloader", "[cpan] get image data from url:%s", aVar);
        try {
            aVar2.mo129425b(C100634a.m131648a((String) aVar.f301995a));
        } catch (InterruptedException e) {
            Log.m105921e("MicroMsg.Loader.DefaultImageDownloader", "[cpan] get image data failed.:%s", Util.stackTraceToString(e));
            Log.m105920e("MicroMsg.Loader.DefaultImageDownloader", "[cpan] onError");
            aVar2.mo129424a();
        } catch (UnknownHostException e2) {
            Log.m105921e("MicroMsg.Loader.DefaultImageDownloader", "[cpan] get image data failed.:%s", Util.stackTraceToString(e2));
            Log.m105920e("MicroMsg.Loader.DefaultImageDownloader", "[cpan] onError");
            aVar2.mo129424a();
        } catch (SSLHandshakeException e3) {
            Log.m105921e("MicroMsg.Loader.DefaultImageDownloader", "[cpan] get image data failed.:%s", Util.stackTraceToString(e3));
            Log.m105920e("MicroMsg.Loader.DefaultImageDownloader", "[cpan] onError");
            aVar2.mo129424a();
        } catch (SocketException e4) {
            Log.m105921e("MicroMsg.Loader.DefaultImageDownloader", "[cpan] get image data failed.:%s", Util.stackTraceToString(e4));
            Log.m105920e("MicroMsg.Loader.DefaultImageDownloader", "[cpan] onError");
            aVar2.mo129424a();
        } catch (SocketTimeoutException e5) {
            Log.m105921e("MicroMsg.Loader.DefaultImageDownloader", "[cpan] get image data failed.:%s", Util.stackTraceToString(e5));
            Log.m105920e("MicroMsg.Loader.DefaultImageDownloader", "[cpan] onError");
            aVar2.mo129424a();
        } catch (IOException e6) {
            Log.m105921e("MicroMsg.Loader.DefaultImageDownloader", "[cpan] get image data failed.:%s", Util.stackTraceToString(e6));
            Log.m105920e("MicroMsg.Loader.DefaultImageDownloader", "[cpan] onError");
            aVar2.mo129424a();
        } catch (Exception e7) {
            Log.m105921e("MicroMsg.Loader.DefaultImageDownloader", "[cpan] get image data failed.:%s", Util.stackTraceToString(e7));
            Log.m105920e("MicroMsg.Loader.DefaultImageDownloader", "[cpan] onError");
            aVar2.mo129424a();
        }
    }
}
