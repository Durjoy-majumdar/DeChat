package vk2;

import android.os.Looper;
import com.tencent.p014mm.plugin.box.webview.BoxWebView;
import com.tencent.p014mm.pluginsdk.model.C44594n1;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import di3.C86312j;
import h81.C32735h;

/* renamed from: vk2.o */
public final class C37745o {

    /* renamed from: a */
    public static final C37745o f99965a = new C37745o();

    /* renamed from: b */
    public static volatile BoxWebView f99966b;

    /* renamed from: c */
    public static boolean f99967c;

    /* renamed from: d */
    public static boolean f99968d;

    /* renamed from: e */
    public static boolean f99969e;

    /* renamed from: f */
    public static Object f99970f = new Object();

    /* renamed from: g */
    public static MMHandler f99971g = new MMHandler(Looper.getMainLooper());

    static {
        Class cls = C32735h.class;
        f99968d = f99967c;
        boolean z = C44594n1.m49047c() == 0 && ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_close_scan_preload_webview_in_mm, 1) == 1;
        int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_scan_goods_enable_preload_webview, 0);
        int Qe2 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_scan_goods_enable_preload_webview_from_find_tab, 0);
        f99967c = !z && (Qe == 1 || BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED);
        f99969e = Qe2 == 1 || BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED;
        f99968d = f99967c;
        Log.m105924i("MicroMsg.BoxWebViewPreloadManager", "init enablePreloadWebView config: " + Qe + ", configFindTab: " + Qe2 + ", enablePreload: " + f99967c + ", enablePreloadAfterGet: " + f99968d + ", enablePreloadFromFindTab: " + f99969e + ", closePreload:" + z);
        long currentTimeMillis = System.currentTimeMillis();
        Log.m105919d("MicroMsg.BoxWebViewPreloadManager", "createWebViewHandlerThread start cost %d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    /* renamed from: a */
    public static final void m41503a(int i, long j) {
        if (f99967c) {
            if ((i == 1 && f99968d) || (i == 2 && f99969e)) {
                Log.m105927v("MicroMsg.BoxWebViewPreloadManager", "alvinluo preloadBoxWebView delay: %d", Long.valueOf(j));
                C52950m mVar = C52950m.f147793d;
                MMHandler mMHandler = f99971g;
                if (mMHandler != null) {
                    mMHandler.postDelayed(new C37743n(mVar), j);
                }
            }
        }
    }
}
