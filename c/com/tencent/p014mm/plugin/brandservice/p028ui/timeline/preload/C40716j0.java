package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload;

import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.vfs.C86009m1;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C36568h;
import te3.zg4;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.j0 */
public final class C40716j0 {

    /* renamed from: a */
    public static final C13601g f109362a = C36568h.m40985a(C29772a.f80781d);

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.j0$a */
    public static final class C29772a extends C87413o implements C32224a<Long> {

        /* renamed from: d */
        public static final C29772a f80781d = new C29772a();

        public C29772a() {
            super(0);
        }

        public Object invoke() {
            return 1L;
        }
    }

    /* renamed from: a */
    public static final String m43973a(zg4 zg4) {
        C87412m.m108594g(zg4, "<this>");
        int i = zg4.f145937d;
        String str = zg4.f145945o;
        C87412m.m108593f(str, "this.Uid");
        String b = C40715i0.m43972b(i, str, "");
        if (m43980h(b)) {
            return b;
        }
        int i2 = zg4.f145937d;
        String str2 = zg4.f145945o;
        C87412m.m108593f(str2, "this.Uid");
        return C40715i0.m43971a(i2, str2);
    }

    /* renamed from: b */
    public static final String m43974b(zg4 zg4) {
        C87412m.m108594g(zg4, "<this>");
        int i = zg4.f145937d;
        String str = zg4.f145945o;
        C87412m.m108593f(str, "this.Uid");
        String b = C40715i0.m43972b(i, str, "index.html");
        if (m43980h(b)) {
            return b;
        }
        int i2 = zg4.f145937d;
        String str2 = zg4.f145945o;
        C87412m.m108593f(str2, "this.Uid");
        return C40715i0.m43971a(i2, str2);
    }

    /* renamed from: c */
    public static final String m43975c(zg4 zg4) {
        C87412m.m108594g(zg4, "<this>");
        return "_tmpl_info_latest_verified_-" + zg4.f145937d + '-' + zg4.f145947q;
    }

    /* renamed from: d */
    public static final String m43976d(zg4 zg4) {
        C87412m.m108594g(zg4, "<this>");
        return "_tmpl_info_latest_verified_time_-" + zg4.f145937d + '-' + zg4.f145947q;
    }

    /* renamed from: e */
    public static final String m43977e(zg4 zg4) {
        C87412m.m108594g(zg4, "<this>");
        return "_tmpl_info_-" + zg4.f145937d + '-' + zg4.f145945o;
    }

    /* renamed from: f */
    public static final String m43978f(zg4 zg4) {
        C87412m.m108594g(zg4, "<this>");
        return "_tmpl_info_version_list_-" + zg4.f145937d + '-' + zg4.f145947q;
    }

    /* renamed from: g */
    public static final MultiProcessMMKV m43979g() {
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("_webview_tmpl_info");
        C87412m.m108593f(mmkv, "getMMKV(ConstantsPreload.MMKV_WEBVIEW_TMPL_INFO)");
        return mmkv;
    }

    /* renamed from: h */
    public static final boolean m43980h(String str) {
        C87412m.m108594g(str, "<this>");
        return m43984l(str).mo119967g();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m43981i(java.lang.String r3) {
        /*
            java.lang.String r0 = "<this>"
            gy3.C87412m.m108594g(r3, r0)
            com.tencent.mm.vfs.m1 r3 = m43984l(r3)
            boolean r0 = r3.mo119977o()
            if (r0 == 0) goto L_0x002e
            boolean r0 = r3.mo119967g()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x002c
            com.tencent.mm.vfs.m1[] r3 = r3.mo119984u()
            if (r3 == 0) goto L_0x0028
            int r3 = r3.length
            if (r3 != 0) goto L_0x0022
            r3 = 1
            goto L_0x0023
        L_0x0022:
            r3 = 0
        L_0x0023:
            if (r3 == 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r3 = 0
            goto L_0x0029
        L_0x0028:
            r3 = 1
        L_0x0029:
            if (r3 != 0) goto L_0x002c
            goto L_0x0032
        L_0x002c:
            r1 = 0
            goto L_0x0032
        L_0x002e:
            boolean r1 = r3.mo119967g()
        L_0x0032:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40716j0.m43981i(java.lang.String):boolean");
    }

    /* renamed from: j */
    public static final boolean m43982j(zg4 zg4) {
        C87412m.m108594g(zg4, "<this>");
        return zg4.f145938e != 0;
    }

    /* renamed from: k */
    public static final boolean m43983k(zg4 zg4) {
        C87412m.m108594g(zg4, "<this>");
        String b = m43974b(zg4);
        int i = zg4.f145937d;
        String str = zg4.f145945o;
        C87412m.m108593f(str, "this.Uid");
        return C87412m.m108589b(b, C40715i0.m43972b(i, str, "index.html"));
    }

    /* renamed from: l */
    public static final C86009m1 m43984l(String str) {
        C87412m.m108594g(str, "<this>");
        return new C86009m1(str);
    }
}
