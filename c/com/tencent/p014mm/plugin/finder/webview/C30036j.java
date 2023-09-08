package com.tencent.p014mm.plugin.finder.webview;

import android.os.Looper;
import com.tencent.p014mm.plugin.box.webview.BoxWebView;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import di3.C86312j;
import h81.C32735h;

/* renamed from: com.tencent.mm.plugin.finder.webview.j */
public final class C30036j {

    /* renamed from: a */
    public static final C30036j f81277a = new C30036j();

    /* renamed from: b */
    public static volatile BoxWebView f81278b;

    /* renamed from: c */
    public static boolean f81279c;

    /* renamed from: d */
    public static boolean f81280d;

    /* renamed from: e */
    public static boolean f81281e;

    /* renamed from: f */
    public static Object f81282f = new Object();

    /* renamed from: g */
    public static MMHandler f81283g = new MMHandler(Looper.getMainLooper());

    static {
        Class cls = C32735h.class;
        f81280d = f81279c;
        int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_scan_goods_enable_preload_webview, 0);
        int Qe2 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_scan_goods_enable_preload_webview_from_find_tab, 0);
        f81279c = Qe == 1 || BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED;
        f81281e = Qe2 == 1 || BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED;
        f81280d = f81279c;
        Log.m105925i("MicroMsg.BoxWebViewPreloadManager", "init enablePreloadWebView config: %d, configFindTab: %d, enablePreload: %b, enablePreloadAfterGet: %b, enablePreloadFromFindTab: %b", Integer.valueOf(Qe), Integer.valueOf(Qe2), Boolean.valueOf(f81279c), Boolean.valueOf(f81280d), Boolean.valueOf(f81281e));
        long currentTimeMillis = System.currentTimeMillis();
        Log.m105919d("MicroMsg.BoxWebViewPreloadManager", "createWebViewHandlerThread start cost %d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }
}
