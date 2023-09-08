package ug0;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.account.security.p023ui.MySafeDeviceDetailUI;
import f40.C86709a0;
import nj3.C76879j;
import rg0.C12999d;

/* renamed from: ug0.c */
public final class C22647c implements C76879j.C47267l {

    /* renamed from: a */
    public final /* synthetic */ MySafeDeviceDetailUI f65134a;

    /* renamed from: ug0.c$a */
    public static final class C22648a implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C12999d f65135d;

        public C22648a(C12999d dVar) {
            this.f65135d = dVar;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            C86709a0.m107524d().mo123458d(this.f65135d);
        }
    }

    public C22647c(MySafeDeviceDetailUI mySafeDeviceDetailUI) {
        this.f65134a = mySafeDeviceDetailUI;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003f, code lost:
        if (r12 == null) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onFinish(java.lang.CharSequence r12) {
        /*
            r11 = this;
            r0 = 1
            r1 = 0
            if (r12 == 0) goto L_0x0041
            java.lang.String r12 = r12.toString()
            if (r12 == 0) goto L_0x0041
            int r2 = r12.length()
            int r2 = r2 - r0
            r3 = 0
            r4 = 0
        L_0x0011:
            if (r3 > r2) goto L_0x0036
            if (r4 != 0) goto L_0x0017
            r5 = r3
            goto L_0x0018
        L_0x0017:
            r5 = r2
        L_0x0018:
            char r5 = r12.charAt(r5)
            r6 = 32
            int r5 = gy3.C87412m.m108596i(r5, r6)
            if (r5 > 0) goto L_0x0026
            r5 = 1
            goto L_0x0027
        L_0x0026:
            r5 = 0
        L_0x0027:
            if (r4 != 0) goto L_0x0030
            if (r5 != 0) goto L_0x002d
            r4 = 1
            goto L_0x0011
        L_0x002d:
            int r3 = r3 + 1
            goto L_0x0011
        L_0x0030:
            if (r5 != 0) goto L_0x0033
            goto L_0x0036
        L_0x0033:
            int r2 = r2 + -1
            goto L_0x0011
        L_0x0036:
            int r2 = r2 + r0
            java.lang.CharSequence r12 = r12.subSequence(r3, r2)
            java.lang.String r12 = r12.toString()
            if (r12 != 0) goto L_0x0043
        L_0x0041:
            java.lang.String r12 = ""
        L_0x0043:
            com.tencent.mm.plugin.account.security.ui.MySafeDeviceDetailUI r2 = r11.f65134a
            java.lang.String r2 = r2.f49168d
            boolean r2 = gy3.C87412m.m108589b(r12, r2)
            if (r2 == 0) goto L_0x004e
            return r0
        L_0x004e:
            int r2 = r12.length()
            if (r2 != 0) goto L_0x0056
            r2 = 1
            goto L_0x0057
        L_0x0056:
            r2 = 0
        L_0x0057:
            if (r2 == 0) goto L_0x006c
            com.tencent.mm.plugin.account.security.ui.MySafeDeviceDetailUI r12 = r11.f65134a
            androidx.appcompat.app.AppCompatActivity r12 = r12.getContext()
            com.tencent.mm.plugin.account.security.ui.MySafeDeviceDetailUI r0 = r11.f65134a
            r2 = 2131835129(0x7f1138f9, float:1.9303388E38)
            java.lang.String r0 = r0.getString(r2)
            nj3.C76879j.m92726T(r12, r0)
            return r1
        L_0x006c:
            rg0.d r1 = new rg0.d
            com.tencent.mm.plugin.account.security.ui.MySafeDeviceDetailUI r2 = r11.f65134a
            r2.getClass()
            rg0.e r10 = new rg0.e
            rx3.g r3 = r2.f49169e
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r3 = r3.getValue()
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = r2.f49168d
            rx3.g r3 = r2.f49170f
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r3 = r3.getValue()
            r6 = r3
            java.lang.String r6 = (java.lang.String) r6
            rx3.g r3 = r2.f49171g
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r3 = r3.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            long r7 = r3.longValue()
            boolean r9 = r2.mo22057I7()
            r3 = r10
            r3.<init>(r4, r5, r6, r7, r9)
            r1.<init>(r10, r12)
            ob0.b0 r12 = f40.C86709a0.m107524d()
            r12.mo123460f(r1)
            com.tencent.mm.plugin.account.security.ui.MySafeDeviceDetailUI r12 = r11.f65134a
            android.app.ProgressDialog r12 = r12.f49173i
            if (r12 == 0) goto L_0x00b6
            r12.dismiss()
        L_0x00b6:
            com.tencent.mm.plugin.account.security.ui.MySafeDeviceDetailUI r12 = r11.f65134a
            r2 = 2131821740(0x7f1104ac, float:1.9276232E38)
            java.lang.String r4 = kg3.C76577a.m92166q(r12, r2)
            r5 = 1
            r6 = 1
            ug0.c$a r7 = new ug0.c$a
            r7.<init>(r1)
            java.lang.String r3 = ""
            r2 = r12
            qo3.i0 r1 = nj3.C76879j.m92723Q(r2, r3, r4, r5, r6, r7)
            r12.f49173i = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ug0.C22647c.onFinish(java.lang.CharSequence):boolean");
    }
}
