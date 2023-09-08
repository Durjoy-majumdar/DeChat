package p677rm;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.appusage.C68585h1;
import com.tencent.p014mm.plugin.appbrand.appusage.C68587i1;
import com.tencent.p014mm.plugin.appbrand.widget.desktop.C68685a;
import com.tencent.p014mm.plugin.appbrand.widget.desktop.C68687c;
import di3.C86301e;
import dt0.C75449i;
import dt0.C75450j;
import dt0.C75452l;
import ei3.C86522b;
import p235sm.C77731f0;
import xt0.C78980e;

@C86522b
/* renamed from: rm.c */
public class C77537c extends C86301e implements C77731f0 {
    public int Nb0() {
        return C0966R.C0971layout.f6395do;
    }

    /* renamed from: SJ */
    public C68585h1 mo107697SJ() {
        return C78980e.f231921a.mo108957a();
    }

    /* renamed from: SZ */
    public C75449i mo107698SZ() {
        return new C75452l();
    }

    /* renamed from: hx */
    public C68587i1 mo107699hx() {
        return C78980e.f231921a.mo108958b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0110  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void io0(android.content.Context r17) {
        /*
            r16 = this;
            r1 = r17
            float r0 = xt0.C78981f.f231924a
            r2 = 1
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r4 = 0
            r0[r4] = r3
            java.lang.String r3 = "MicroMsg.AppBrandRecentConfig"
            java.lang.String r5 = "alvinluo DesktopConfig init mCurrentType: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r5, r0)
            r5 = 1082130432(0x40800000, float:4.0)
            xt0.C78981f.f231924a = r5
            r6 = 4
            xt0.C78981f.f231925b = r6
            r0 = 1077936128(0x40400000, float:3.0)
            xt0.C78981f.f231926c = r0
            r7 = 3
            xt0.C78981f.f231927d = r7
            xt0.C78981f.f231929f = r5
            xt0.C78981f.f231930g = r6
            java.lang.String r8 = "MicroMsg.AppBrandRecentSizeHelper"
            r9 = 2
            if (r1 != 0) goto L_0x002f
            r12 = 0
            goto L_0x0139
        L_0x002f:
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics     // Catch:{ Exception -> 0x007c }
            r0.<init>()     // Catch:{ Exception -> 0x007c }
            java.lang.String r10 = "window"
            java.lang.Object r10 = r1.getSystemService(r10)     // Catch:{ Exception -> 0x007c }
            android.view.WindowManager r10 = (android.view.WindowManager) r10     // Catch:{ Exception -> 0x007c }
            android.view.Display r10 = r10.getDefaultDisplay()     // Catch:{ Exception -> 0x007c }
            r10.getMetrics(r0)     // Catch:{ Exception -> 0x007c }
            android.content.res.Resources r10 = r17.getResources()     // Catch:{ Exception -> 0x007c }
            android.content.res.Configuration r10 = r10.getConfiguration()     // Catch:{ Exception -> 0x007c }
            int r10 = r10.orientation     // Catch:{ Exception -> 0x007c }
            if (r10 != r9) goto L_0x006b
            boolean r10 = com.tencent.p014mm.p136ui.C85875k4.m106205t(r1, r4)     // Catch:{ Exception -> 0x007c }
            if (r10 == 0) goto L_0x005d
            android.graphics.Point r0 = com.tencent.p014mm.p136ui.C85875k4.m106184h(r17)     // Catch:{ Exception -> 0x007c }
            int r0 = r0.x     // Catch:{ Exception -> 0x007c }
            goto L_0x0085
        L_0x005d:
            android.content.res.Resources r10 = r17.getResources()     // Catch:{ Exception -> 0x007c }
            android.content.res.Configuration r10 = r10.getConfiguration()     // Catch:{ Exception -> 0x007c }
            int r10 = r10.screenHeightDp     // Catch:{ Exception -> 0x007c }
            float r10 = (float) r10     // Catch:{ Exception -> 0x007c }
            float r0 = r0.density     // Catch:{ Exception -> 0x007c }
            goto L_0x0078
        L_0x006b:
            android.content.res.Resources r10 = r17.getResources()     // Catch:{ Exception -> 0x007c }
            android.content.res.Configuration r10 = r10.getConfiguration()     // Catch:{ Exception -> 0x007c }
            int r10 = r10.screenWidthDp     // Catch:{ Exception -> 0x007c }
            float r10 = (float) r10     // Catch:{ Exception -> 0x007c }
            float r0 = r0.density     // Catch:{ Exception -> 0x007c }
        L_0x0078:
            float r10 = r10 * r0
            int r0 = (int) r10
            goto L_0x0085
        L_0x007c:
            r0 = move-exception
            java.lang.Object[] r10 = new java.lang.Object[r4]
            java.lang.String r11 = "alvinluo getScreenWidth exception"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r0, r11, r10)
            r0 = 0
        L_0x0085:
            r10 = 2131165847(0x7f070297, float:1.7945923E38)
            int r10 = kg3.C76577a.m92155f(r1, r10)
            float r10 = (float) r10
            float r11 = xt0.C78982h.m95497a(r17)
            float r10 = r10 * r11
            int r10 = (int) r10
            xt0.C78982h.f231932a = r4
            android.content.res.Resources r11 = r17.getResources()
            r12 = 2131165848(0x7f070298, float:1.7945925E38)
            int r11 = r11.getDimensionPixelOffset(r12)
            float r12 = xt0.C78982h.m95497a(r17)
            kg3.C76577a.m92172w(r17)
            r13 = 1065353216(0x3f800000, float:1.0)
            int r13 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r13 == 0) goto L_0x00e7
            float r13 = kg3.C76577a.m92173x(r17)
            int r13 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r13 != 0) goto L_0x00b7
            goto L_0x00e7
        L_0x00b7:
            float r11 = kg3.C76577a.m92171v(r17)
            int r11 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
            if (r11 == 0) goto L_0x00dc
            float r11 = kg3.C76577a.m92174y(r17)
            int r11 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
            if (r11 == 0) goto L_0x00dc
            float r11 = kg3.C76577a.m92167r(r17)
            int r11 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
            if (r11 != 0) goto L_0x00d0
            goto L_0x00dc
        L_0x00d0:
            android.content.res.Resources r11 = r17.getResources()
            r12 = 2131165590(0x7f070196, float:1.7945401E38)
            int r11 = r11.getDimensionPixelOffset(r12)
            goto L_0x00e7
        L_0x00dc:
            android.content.res.Resources r11 = r17.getResources()
            r12 = 2131165553(0x7f070171, float:1.7945326E38)
            int r11 = r11.getDimensionPixelOffset(r12)
        L_0x00e7:
            java.lang.Object[] r12 = new java.lang.Object[r2]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r11)
            r12[r4] = r13
            java.lang.String r13 = "alvinluo getLeftRightPadding: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r8, r13, r12)
            int r12 = r11 * 2
            int r12 = r0 - r12
            int r13 = (int) r5
            int r14 = r10 * r13
            int r12 = r12 - r14
            int r15 = r13 + -1
            int r15 = r15 * 2
            int r12 = r12 / r15
            if (r12 <= r11) goto L_0x010c
            int r11 = r0 - r14
            int r13 = r13 * 2
            int r12 = r11 / r13
            xt0.C78982h.f231932a = r2
            goto L_0x010e
        L_0x010c:
            xt0.C78982h.f231932a = r4
        L_0x010e:
            if (r12 >= 0) goto L_0x0111
            r12 = 0
        L_0x0111:
            r11 = 5
            java.lang.Object[] r11 = new java.lang.Object[r11]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r11[r4] = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r12)
            r11[r2] = r10
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r11[r9] = r0
            java.lang.Float r0 = java.lang.Float.valueOf(r5)
            r11[r7] = r0
            boolean r0 = xt0.C78982h.f231932a
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r11[r6] = r0
            java.lang.String r0 = "alvinluo itemWidth: %d, itemPadding: %d, viewWidth: %d, countPerPage: %f, leftRightPaddingZero: %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r8, r0, r11)
        L_0x0139:
            float r0 = (float) r12
            android.content.res.Resources r5 = r17.getResources()
            r8 = 2131165644(0x7f0701cc, float:1.794551E38)
            int r5 = r5.getDimensionPixelSize(r8)
            int r5 = r5 * 2
            float r5 = (float) r5
            float r8 = xt0.C78982h.m95497a(r17)
            float r5 = r5 * r8
            float r0 = r0 + r5
            int r0 = (int) r0
            r5 = 10
            int r1 = kg3.C76577a.m92151b(r1, r5)
            if (r0 > r1) goto L_0x0161
            float r0 = xt0.C78981f.f231926c
            xt0.C78981f.f231929f = r0
            int r0 = xt0.C78981f.f231927d
            xt0.C78981f.f231930g = r0
            goto L_0x0169
        L_0x0161:
            float r0 = xt0.C78981f.f231924a
            xt0.C78981f.f231929f = r0
            int r0 = xt0.C78981f.f231925b
            xt0.C78981f.f231930g = r0
        L_0x0169:
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r1 = h81.C32735h.C32737c.clicfg_appbrand_desktop_recent_max_show_lines
            int r0 = r0.mo58779Qe(r1, r2)
            xt0.C78981f.f231931h = r0
            int r0 = java.lang.Math.max(r0, r2)
            xt0.C78981f.f231931h = r0
            int r0 = java.lang.Math.min(r0, r6)
            xt0.C78981f.f231931h = r0
            java.lang.Object[] r0 = new java.lang.Object[r7]
            float r1 = xt0.C78981f.f231929f
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r0[r4] = r1
            int r1 = xt0.C78981f.f231930g
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r2] = r1
            int r1 = xt0.C78981f.f231931h
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r9] = r1
            java.lang.String r1 = "alvinluo DesktopConfig init showCountPerPage: %f, completelyShowCountPerPage: %d, mRecentAppBrandMaxShowLines: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p677rm.C77537c.io0(android.content.Context):void");
    }

    /* renamed from: j9 */
    public C75449i mo107701j9() {
        return new C75450j();
    }

    /* renamed from: wV */
    public C68685a mo107702wV(View view) {
        return new C68687c(view);
    }
}
