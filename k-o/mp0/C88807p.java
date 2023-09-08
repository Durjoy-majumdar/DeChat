package mp0;

import android.content.Context;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1727m;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import gy3.C87412m;
import lp0.C88620b;

/* renamed from: mp0.p */
public final class C88807p implements C88620b<C83928t1> {

    /* renamed from: a */
    public static final C88807p f256212a = new C88807p();

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x001a, code lost:
        r5 = (p958eb.C86474e) r5.mo125517G0(p958eb.C86474e.class);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo115970a(android.content.Context r4, com.tencent.p014mm.plugin.appbrand.page.C83780d1 r5, java.lang.String r6) {
        /*
            r3 = this;
            com.tencent.mm.plugin.appbrand.page.t1 r5 = (com.tencent.p014mm.plugin.appbrand.page.C83928t1) r5
            java.lang.String r6 = "context"
            gy3.C87412m.m108594g(r4, r6)
            java.lang.String r6 = "pageView"
            gy3.C87412m.m108594g(r5, r6)
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r5 = r5.getRuntime()
            com.tencent.mm.plugin.appbrand.i2 r5 = r5.f238150p
            kr0.e r5 = (kr0.C88267e) r5
            boolean r6 = r5 instanceof p284zb.C91635f
            r0 = 0
            if (r6 == 0) goto L_0x0029
            java.lang.Class<eb.e> r6 = p958eb.C86474e.class
            java.lang.Object r5 = r5.mo125517G0(r6)
            eb.e r5 = (p958eb.C86474e) r5
            if (r5 == 0) goto L_0x0029
            com.tencent.magicbrush.a r5 = r5.mo120910U()
            goto L_0x002a
        L_0x0029:
            r5 = r0
        L_0x002a:
            if (r5 == 0) goto L_0x0035
            com.tencent.magicbrush.handler.glfont.IMBFontHandler r5 = r5.f235056e
            if (r5 == 0) goto L_0x0035
            android.graphics.Bitmap r5 = r5.getBitmapAtlas()
            goto L_0x0036
        L_0x0035:
            r5 = r0
        L_0x0036:
            if (r5 != 0) goto L_0x0040
            java.lang.String r4 = "GameGlyphBitmap"
            java.lang.String r5 = "bitmap is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            goto L_0x009c
        L_0x0040:
            android.app.Activity r4 = (android.app.Activity) r4
            java.lang.String r6 = "MicroMsg.GameGlyphBitmap"
            java.lang.String r1 = "dl: attachOnRootView"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            r6 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r6 = r4.findViewById(r6)
            java.lang.String r1 = "null cannot be cast to non-null type android.widget.FrameLayout"
            gy3.C87412m.m108592e(r6, r1)
            android.widget.FrameLayout r6 = (android.widget.FrameLayout) r6
            com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView r1 = new com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView
            r1.<init>(r4, r0)
            com.davemorrissey.labs.subscaleview.view.ImageSource r5 = com.davemorrissey.labs.subscaleview.view.ImageSource.bitmap(r5)
            r1.setImage(r5)
            r5 = -13224394(0xffffffffff363636, float:-2.4220097E38)
            r1.setBackgroundColor(r5)
            r5 = 1065353216(0x3f800000, float:1.0)
            r1.setScaleRate(r5)
            r5 = -1
            r6.addView(r1, r5, r5)
            android.widget.Button r1 = new android.widget.Button
            r2 = 16843563(0x101032b, float:2.369583E-38)
            r1.<init>(r4, r0, r2)
            java.lang.String r0 = "EXIT"
            r1.setText(r0)
            r1.setTextColor(r5)
            mp0.o r5 = new mp0.o
            r5.<init>(r4)
            r1.setOnClickListener(r5)
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            r5 = -2
            r4.<init>(r5, r5)
            r5 = 100
            r4.setMarginStart(r5)
            r4.topMargin = r5
            rx3.b0 r5 = rx3.C13598b0.f38549a
            r6.addView(r1, r4)
        L_0x009c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mp0.C88807p.mo115970a(android.content.Context, com.tencent.mm.plugin.appbrand.page.d1, java.lang.String):void");
    }

    /* renamed from: b */
    public String mo115971b(Context context, C83780d1 d1Var, String str) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g((C83928t1) d1Var, "pageView");
        C87412m.m108594g(str, "appId");
        return "Glyph Bitmap";
    }

    /* renamed from: c */
    public boolean mo115972c(Context context, C83780d1 d1Var, String str) {
        C83928t1 t1Var = (C83928t1) d1Var;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(t1Var, "pageView");
        C87412m.m108594g(str, "appId");
        C1727m p = t1Var.mo109671p(AppBrandSysConfigWC.class);
        C87412m.m108593f(p, "pageView.getConfig(AppBr…dSysConfigWC::class.java)");
        AppBrandSysConfigWC appBrandSysConfigWC = (AppBrandSysConfigWC) p;
        if ((appBrandSysConfigWC.f261072r.f238585d == 1 || appBrandSysConfigWC.f261072r.f238585d == 2 || WeChatEnvironment.hasDebugger() || WeChatEnvironment.isMonkeyEnv() || BuildInfo.IS_FLAVOR_RED) && t1Var.getRuntime() != null) {
            AppBrandRuntimeWC J1 = t1Var.getRuntime();
            C87412m.m108592e(J1, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC");
            if (J1.mo121254q1()) {
                return true;
            }
        }
        return false;
    }
}
