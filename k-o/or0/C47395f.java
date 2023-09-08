package or0;

import android.app.Activity;
import com.tencent.p014mm.plugin.appbrand.shortlink.AbsWxaShortLinkLauncher;
import com.tencent.p014mm.plugin.appbrand.shortlink.WxaShortLinkLaunchErrorCode;
import com.tencent.p014mm.plugin.appbrand.shortlink.cgi.WxaShortLinkInfo;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: or0.f */
public final class C47395f extends C87413o implements C32227p<Boolean, WxaShortLinkInfo, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Activity f127161d;

    /* renamed from: e */
    public final /* synthetic */ C32226l<WxaShortLinkLaunchErrorCode, C13598b0> f127162e;

    /* renamed from: f */
    public final /* synthetic */ AbsWxaShortLinkLauncher f127163f;

    /* renamed from: g */
    public final /* synthetic */ String f127164g;

    /* renamed from: h */
    public final /* synthetic */ boolean f127165h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47395f(Activity activity, C32226l<? super WxaShortLinkLaunchErrorCode, C13598b0> lVar, AbsWxaShortLinkLauncher absWxaShortLinkLauncher, String str, boolean z) {
        super(2);
        this.f127161d = activity;
        this.f127162e = lVar;
        this.f127163f = absWxaShortLinkLauncher;
        this.f127164g = str;
        this.f127165h = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        if ((r12 != null) != false) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r11, java.lang.Object r12) {
        /*
            r10 = this;
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            com.tencent.mm.plugin.appbrand.shortlink.cgi.WxaShortLinkInfo r12 = (com.tencent.p014mm.plugin.appbrand.shortlink.cgi.WxaShortLinkInfo) r12
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            android.app.Activity r1 = r10.f127161d
            r0.<init>(r1)
            java.lang.Object r0 = r0.get()
            r6 = r0
            android.app.Activity r6 = (android.app.Activity) r6
            r0 = 1
            r1 = 0
            if (r6 != 0) goto L_0x001c
            r2 = 1
            goto L_0x001d
        L_0x001c:
            r2 = 0
        L_0x001d:
            if (r2 == 0) goto L_0x002a
            fy3.l<com.tencent.mm.plugin.appbrand.shortlink.WxaShortLinkLaunchErrorCode, rx3.b0> r11 = r10.f127162e
            if (r11 == 0) goto L_0x00a1
            com.tencent.mm.plugin.appbrand.shortlink.WxaShortLinkLaunchErrorCode r12 = com.tencent.p014mm.plugin.appbrand.shortlink.WxaShortLinkLaunchErrorCode.CONTEXT_RELEASE
            r11.invoke(r12)
            goto L_0x00a1
        L_0x002a:
            if (r11 == 0) goto L_0x0034
            if (r12 == 0) goto L_0x0030
            r11 = 1
            goto L_0x0031
        L_0x0030:
            r11 = 0
        L_0x0031:
            if (r11 == 0) goto L_0x0034
            goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            com.tencent.mm.plugin.appbrand.shortlink.AbsWxaShortLinkLauncher r11 = r10.f127163f
            boolean r11 = r11.mo63358d(r6, r0)
            if (r11 != 0) goto L_0x0047
            fy3.l<com.tencent.mm.plugin.appbrand.shortlink.WxaShortLinkLaunchErrorCode, rx3.b0> r11 = r10.f127162e
            if (r11 == 0) goto L_0x00a1
            com.tencent.mm.plugin.appbrand.shortlink.WxaShortLinkLaunchErrorCode r12 = com.tencent.p014mm.plugin.appbrand.shortlink.WxaShortLinkLaunchErrorCode.INTERRUPT
            r11.invoke(r12)
            goto L_0x00a1
        L_0x0047:
            if (r0 != 0) goto L_0x0065
            com.tencent.mm.plugin.appbrand.shortlink.AbsWxaShortLinkLauncher r11 = r10.f127163f
            java.lang.String r12 = r10.f127164g
            r11.getClass()
            java.lang.String r11 = "ctx"
            gy3.C87412m.m108594g(r6, r11)
            java.lang.String r11 = "url"
            gy3.C87412m.m108594g(r12, r11)
            fy3.l<com.tencent.mm.plugin.appbrand.shortlink.WxaShortLinkLaunchErrorCode, rx3.b0> r11 = r10.f127162e
            if (r11 == 0) goto L_0x00a1
            com.tencent.mm.plugin.appbrand.shortlink.WxaShortLinkLaunchErrorCode r12 = com.tencent.p014mm.plugin.appbrand.shortlink.WxaShortLinkLaunchErrorCode.DECODE_LINK_FAIL
            r11.invoke(r12)
            goto L_0x00a1
        L_0x0065:
            gy3.C87412m.m108591d(r12)
            com.tencent.mm.plugin.appbrand.shortlink.AbsWxaShortLinkLauncher r11 = r10.f127163f
            or0.l r11 = r11.mo63355a()
            if (r11 == 0) goto L_0x0075
            java.lang.String r0 = r10.f127164g
            r11.mo72420a(r0, r12)
        L_0x0075:
            or0.e r11 = new or0.e
            com.tencent.mm.plugin.appbrand.shortlink.AbsWxaShortLinkLauncher r1 = r10.f127163f
            java.lang.String r4 = r10.f127164g
            fy3.l<com.tencent.mm.plugin.appbrand.shortlink.WxaShortLinkLaunchErrorCode, rx3.b0> r5 = r10.f127162e
            r0 = r11
            r2 = r6
            r3 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            boolean r0 = r10.f127165h
            if (r0 == 0) goto L_0x009e
            or0.d r8 = new or0.d
            android.app.Activity r1 = r10.f127161d
            com.tencent.mm.plugin.appbrand.shortlink.AbsWxaShortLinkLauncher r4 = r10.f127163f
            java.lang.String r7 = r10.f127164g
            fy3.l<com.tencent.mm.plugin.appbrand.shortlink.WxaShortLinkLaunchErrorCode, rx3.b0> r9 = r10.f127162e
            r0 = r8
            r2 = r12
            r3 = r11
            r5 = r6
            r6 = r7
            r7 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            p225rc.C12969d.m12411e(r8)
            goto L_0x00a1
        L_0x009e:
            r11.invoke()
        L_0x00a1:
            rx3.b0 r11 = rx3.C13598b0.f38549a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: or0.C47395f.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
