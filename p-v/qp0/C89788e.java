package qp0;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandUI;
import com.tencent.p014mm.plugin.appbrand.utils.C84777q1;
import d92.C107028a;
import d92.C45293c;
import k92.C108974b;

/* renamed from: qp0.e */
public class C89788e extends C45293c {

    /* renamed from: g */
    public final AppBrandRuntimeWC f258169g;

    public C89788e(AppBrandRuntimeWC appBrandRuntimeWC) {
        super((Activity) null);
        this.f258169g = appBrandRuntimeWC;
    }

    /* renamed from: c */
    public boolean mo70828c() {
        AppBrandRuntimeWC appBrandRuntimeWC = this.f258169g;
        return !(appBrandRuntimeWC != null ? appBrandRuntimeWC.mo121254q1() : false);
    }

    /* renamed from: e */
    public void mo67906e(boolean z, C108974b bVar) {
        if (this.f258169g != null) {
            if (getActivity() instanceof AppBrandUI) {
                ((AppBrandUI) getActivity()).f246506z = !z;
            }
            this.f258169g.mo113172C1();
        }
    }

    public Activity getActivity() {
        return this.f258169g.mo113026R();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0080, code lost:
        if ("UNSPECIFIED".equalsIgnoreCase(r4) == false) goto L_0x0083;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap getBitmap() {
        /*
            r14 = this;
            java.lang.String r0 = "MicroMsg.AppBrandMultiTaskPageAdapter"
            ba2.a r1 = ba2.C39747a.f106638a
            r2 = 1
            boolean r1 = r1.mo62383a(r2)
            r3 = 0
            if (r1 == 0) goto L_0x000d
            return r3
        L_0x000d:
            r1 = 0
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r4 = r14.f258169g     // Catch:{ Exception -> 0x0149 }
            if (r4 == 0) goto L_0x0157
            com.tencent.mm.plugin.appbrand.page.AppBrandPageContainerWC r4 = r4.mo113212m1()     // Catch:{ Exception -> 0x0149 }
            if (r4 == 0) goto L_0x0157
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r4 = r14.f258169g     // Catch:{ Exception -> 0x0149 }
            com.tencent.mm.plugin.appbrand.page.AppBrandPageContainerWC r4 = r4.mo113212m1()     // Catch:{ Exception -> 0x0149 }
            com.tencent.mm.plugin.appbrand.page.i0 r4 = r4.getCurrentPage()     // Catch:{ Exception -> 0x0149 }
            if (r4 == 0) goto L_0x0157
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r4 = r14.f258169g     // Catch:{ Exception -> 0x0149 }
            com.tencent.mm.plugin.appbrand.page.AppBrandPageContainerWC r4 = r4.mo113212m1()     // Catch:{ Exception -> 0x0149 }
            com.tencent.mm.plugin.appbrand.page.i0 r4 = r4.getCurrentPage()     // Catch:{ Exception -> 0x0149 }
            com.tencent.mm.plugin.appbrand.page.d1 r4 = r4.getCurrentPageView()     // Catch:{ Exception -> 0x0149 }
            if (r4 == 0) goto L_0x0157
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r4 = r14.f258169g     // Catch:{ Exception -> 0x0149 }
            com.tencent.mm.plugin.appbrand.page.AppBrandPageContainerWC r4 = r4.mo113212m1()     // Catch:{ Exception -> 0x0149 }
            com.tencent.mm.plugin.appbrand.page.i0 r4 = r4.getCurrentPage()     // Catch:{ Exception -> 0x0149 }
            com.tencent.mm.plugin.appbrand.page.d1 r4 = r4.getCurrentPageView()     // Catch:{ Exception -> 0x0149 }
            java.lang.Class<rq0.e> r5 = rq0.C90086e.class
            java.lang.Object r4 = r4.mo116150E0(r5)     // Catch:{ Exception -> 0x0149 }
            rq0.e r4 = (rq0.C90086e) r4     // Catch:{ Exception -> 0x0149 }
            if (r4 == 0) goto L_0x0051
            java.lang.String r4 = r4.mo116461d()     // Catch:{ Exception -> 0x0149 }
            goto L_0x0052
        L_0x0051:
            r4 = r3
        L_0x0052:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)     // Catch:{ Exception -> 0x0149 }
            java.lang.String r6 = "portrait"
            if (r5 == 0) goto L_0x005c
            goto L_0x0082
        L_0x005c:
            java.lang.String r5 = "appBrandRuntime orientation:%s,isGame:%b"
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0149 }
            r7[r1] = r4     // Catch:{ Exception -> 0x0149 }
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r8 = r14.f258169g     // Catch:{ Exception -> 0x0149 }
            boolean r8 = r8.mo121254q1()     // Catch:{ Exception -> 0x0149 }
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch:{ Exception -> 0x0149 }
            r7[r2] = r8     // Catch:{ Exception -> 0x0149 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r5, r7)     // Catch:{ Exception -> 0x0149 }
            java.lang.String r5 = "auto"
            boolean r5 = r5.equals(r4)     // Catch:{ Exception -> 0x0149 }
            if (r5 != 0) goto L_0x0082
            java.lang.String r5 = "UNSPECIFIED"
            boolean r5 = r5.equalsIgnoreCase(r4)     // Catch:{ Exception -> 0x0149 }
            if (r5 == 0) goto L_0x0083
        L_0x0082:
            r4 = r6
        L_0x0083:
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r5 = r14.f258169g     // Catch:{ Exception -> 0x0149 }
            boolean r5 = r5.mo121254q1()     // Catch:{ Exception -> 0x0149 }
            if (r5 != 0) goto L_0x0092
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r5 = r14.f258169g     // Catch:{ Exception -> 0x0149 }
            android.graphics.Bitmap r5 = r5.mo113173D1()     // Catch:{ Exception -> 0x0149 }
            goto L_0x00ee
        L_0x0092:
            java.lang.Class<h81.h> r5 = h81.C32735h.class
            di3.d r5 = di3.C86312j.m106911c(r5)     // Catch:{ Exception -> 0x0149 }
            h81.h r5 = (h81.C32735h) r5     // Catch:{ Exception -> 0x0149 }
            h81.h$c r7 = h81.C32735h.C32737c.clicfg_android_appbrand_multitask_game_close_getbitmap     // Catch:{ Exception -> 0x0149 }
            int r5 = r5.mo58779Qe(r7, r1)     // Catch:{ Exception -> 0x0149 }
            if (r5 != r2) goto L_0x00a4
            r5 = 1
            goto L_0x00a5
        L_0x00a4:
            r5 = 0
        L_0x00a5:
            java.lang.String r7 = "closeGame:%b"
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0149 }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)     // Catch:{ Exception -> 0x0149 }
            r8[r1] = r9     // Catch:{ Exception -> 0x0149 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r7, r8)     // Catch:{ Exception -> 0x0149 }
            if (r5 == 0) goto L_0x00b5
            return r3
        L_0x00b5:
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r5 = r14.f258169g     // Catch:{ Exception -> 0x0149 }
            com.tencent.mm.plugin.appbrand.page.t1 r5 = r5.mo113178J1()     // Catch:{ Exception -> 0x0149 }
            if (r5 != 0) goto L_0x00c3
            java.lang.String r4 = "current page view released"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r4)     // Catch:{ Exception -> 0x0149 }
            return r3
        L_0x00c3:
            java.lang.Class<hb.c> r7 = p547hb.C87464c.class
            java.lang.Object r5 = r5.mo116150E0(r7)     // Catch:{ Exception -> 0x0149 }
            hb.c r5 = (p547hb.C87464c) r5     // Catch:{ Exception -> 0x0149 }
            if (r5 == 0) goto L_0x0142
            com.tencent.magicbrush.ui.MagicBrushView r7 = r5.mo111251c()     // Catch:{ Exception -> 0x0149 }
            if (r7 != 0) goto L_0x00d4
            goto L_0x0142
        L_0x00d4:
            com.tencent.magicbrush.ui.MagicBrushView r7 = r5.mo111251c()     // Catch:{ Exception -> 0x0149 }
            com.tencent.magicbrush.a r7 = r7.getMagicBrush()     // Catch:{ Exception -> 0x0149 }
            od.b r8 = r7.f235098n     // Catch:{ Exception -> 0x0149 }
            com.tencent.magicbrush.ui.MagicBrushView r5 = r5.mo111251c()     // Catch:{ Exception -> 0x0149 }
            int r9 = r5.getVirtualElementId()     // Catch:{ Exception -> 0x0149 }
            r10 = -1
            r11 = 1
            r12 = 200(0xc8, double:9.9E-322)
            android.graphics.Bitmap r5 = r8.mo123492a(r9, r10, r11, r12)     // Catch:{ Exception -> 0x0149 }
        L_0x00ee:
            if (r5 != 0) goto L_0x00f1
            return r3
        L_0x00f1:
            boolean r3 = r6.equals(r4)     // Catch:{ Exception -> 0x0149 }
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r3 == 0) goto L_0x010f
            int r3 = r5.getWidth()     // Catch:{ Exception -> 0x0149 }
            float r3 = (float) r3     // Catch:{ Exception -> 0x0149 }
            float r3 = r3 / r4
            int r3 = (int) r3     // Catch:{ Exception -> 0x0149 }
            int r6 = r5.getHeight()     // Catch:{ Exception -> 0x0149 }
            float r6 = (float) r6     // Catch:{ Exception -> 0x0149 }
            float r6 = r6 / r4
            int r4 = (int) r6     // Catch:{ Exception -> 0x0149 }
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createScaledBitmap(r5, r3, r4, r2)     // Catch:{ Exception -> 0x0149 }
            r5.recycle()     // Catch:{ Exception -> 0x0149 }
            return r3
        L_0x010f:
            int r3 = r5.getWidth()     // Catch:{ Exception -> 0x0149 }
            float r3 = (float) r3     // Catch:{ Exception -> 0x0149 }
            float r3 = r3 / r4
            int r3 = (int) r3     // Catch:{ Exception -> 0x0149 }
            int r6 = r5.getHeight()     // Catch:{ Exception -> 0x0149 }
            float r6 = (float) r6     // Catch:{ Exception -> 0x0149 }
            float r6 = r6 / r4
            int r4 = (int) r6     // Catch:{ Exception -> 0x0149 }
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createScaledBitmap(r5, r3, r4, r2)     // Catch:{ Exception -> 0x0149 }
            r5.recycle()     // Catch:{ Exception -> 0x0149 }
            android.graphics.Matrix r11 = new android.graphics.Matrix     // Catch:{ Exception -> 0x0149 }
            r11.<init>()     // Catch:{ Exception -> 0x0149 }
            r4 = 1119092736(0x42b40000, float:90.0)
            r11.postRotate(r4)     // Catch:{ Exception -> 0x0149 }
            int r9 = r3.getWidth()     // Catch:{ Exception -> 0x0149 }
            int r10 = r3.getHeight()     // Catch:{ Exception -> 0x0149 }
            r7 = 0
            r8 = 0
            r12 = 1
            r6 = r3
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x0149 }
            r3.recycle()     // Catch:{ Exception -> 0x0149 }
            return r4
        L_0x0142:
            java.lang.String r4 = "page is not game!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r4)     // Catch:{ Exception -> 0x0149 }
            return r3
        L_0x0149:
            r3 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r4 = r3.getMessage()
            r2[r1] = r4
            java.lang.String r1 = "appbrand getBitmap fail exception:%s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r3, r1, r2)
        L_0x0157:
            android.graphics.Bitmap r0 = super.getBitmap()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qp0.C89788e.getBitmap():android.graphics.Bitmap");
    }

    public View getContentView() {
        AppBrandRuntimeWC appBrandRuntimeWC = this.f258169g;
        if (appBrandRuntimeWC != null) {
            return appBrandRuntimeWC.f238153r;
        }
        return null;
    }

    public View getMaskView() {
        return getContentView();
    }

    /* renamed from: n */
    public void mo67912n(C107028a.C45291b bVar) {
        super.mo67912n(bVar);
        if (C84777q1.m104442b(getActivity()) && getActivity().getResources().getConfiguration().orientation != 2) {
            ((ViewGroup) getContentView().getParent()).setBackground((Drawable) null);
        }
    }
}
