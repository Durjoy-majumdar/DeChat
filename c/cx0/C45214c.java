package cx0;

import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebViewClient;
import te3.C52267zi;

/* renamed from: cx0.c */
public class C45214c extends WebViewClient {
    public C45214c(C52267zi ziVar, C45218e eVar) {
    }

    public void onPageFinished(WebView webView, String str) {
        Log.m105925i("MicroMsg.Box.BoxWebChromeClient", "onPageFinished %s  %d", str, Long.valueOf(Thread.currentThread().getId()));
        super.onPageFinished(webView, str);
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        Log.m105925i("MicroMsg.Box.BoxWebChromeClient", "onPageStarted %s %d", str, Long.valueOf(Thread.currentThread().getId()));
        super.onPageStarted(webView, str, bitmap);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Log.m105925i("MicroMsg.Box.BoxWebChromeClient", "shouldOverrideUrlLoading %s", str);
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
