package br0;

import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: br0.d */
public interface C39836d {

    /* renamed from: br0.d$a */
    public static class C39837a {
        /* renamed from: a */
        public static int m42626a(int i) {
            int i2 = i != 0 ? i != 8 ? i != 9 ? 0 : 180 : -90 : 90;
            Log.m105925i("Luggage.WXA.WindowFullscreenHandler.Factory", "convertActivityOrientation2Direction [%d]->[%d]", Integer.valueOf(i), Integer.valueOf(i2));
            return i2;
        }
    }

    @Deprecated
    /* renamed from: br0.d$c */
    public interface C39838c {
    }

    /* renamed from: br0.d$b */
    public interface C39839b {
        /* renamed from: a */
        ViewGroup mo62481a(View view);
    }

    /* renamed from: a */
    void mo62473a(C79773b bVar);

    /* renamed from: b */
    void mo62474b(WebChromeClient.CustomViewCallback customViewCallback);

    /* renamed from: c */
    void mo62475c(View view, int i);

    /* renamed from: d */
    boolean mo62476d();

    /* renamed from: e */
    void mo62477e(int i);

    /* renamed from: f */
    void mo62478f(C79773b bVar);

    /* renamed from: g */
    boolean mo62479g();

    void release();
}
