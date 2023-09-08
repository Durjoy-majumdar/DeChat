package xn0;

import android.webkit.DownloadListener;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: xn0.h */
public final class C91300h implements DownloadListener {

    /* renamed from: d */
    public final /* synthetic */ C91304m f261894d;

    public C91300h(C91304m mVar) {
        this.f261894d = mVar;
    }

    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        Log.m105925i("MicroMsg.AppBrand.HTMLWebViewWithBWC", "onDownloadStart page[%s], downloadUrl[%s], userAgent[%s], contentDisposition[%s], mime[%s], contentLength[%d], allowDownloadByExpt[%b]", this.f261894d.f261900e.mo116162Q0(), str, str2, str3, str4, Long.valueOf(j), Boolean.FALSE);
        this.f261894d.getREPORTER().mo115359a(1097, 0);
    }
}
