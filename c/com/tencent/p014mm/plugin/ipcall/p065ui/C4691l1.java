package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.sdk.platformtools.Util;
import ke3.C88144b;
import nj3.C76879j;
import t12.C110899d;
import te3.C49828ic2;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.l1 */
public class C4691l1 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ IPCallShareCouponUI f19679d;

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.l1$a */
    public class C4692a implements C76879j.C11180n {
        public C4692a() {
        }

        /* renamed from: j */
        public void mo782j(int i) {
            IPCallShareCouponUI iPCallShareCouponUI = C4691l1.this.f19679d;
            if (!iPCallShareCouponUI.f19592G) {
                i++;
            }
            if (i == 0) {
                iPCallShareCouponUI.getClass();
                C49828ic2 e = C110899d.m151191e();
                if (e != null && !Util.isNullOrNil(e.f135219t)) {
                    Intent intent = new Intent();
                    intent.putExtra("rawUrl", e.f135219t);
                    intent.putExtra("showShare", false);
                    C88144b.m109791i(iPCallShareCouponUI, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                }
            } else if (i == 1) {
                IPCallShareCouponUI.m4929H7(iPCallShareCouponUI);
            } else if (i == 2) {
                IPCallShareCouponUI.m4930I7(iPCallShareCouponUI);
            }
        }
    }

    public C4691l1(IPCallShareCouponUI iPCallShareCouponUI) {
        this.f19679d = iPCallShareCouponUI;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0058  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onMenuItemClick(android.view.MenuItem r10) {
        /*
            r9 = this;
            te3.ic2 r10 = t12.C110899d.m151191e()
            r0 = 0
            r1 = 1
            if (r10 == 0) goto L_0x002b
            java.lang.String r10 = r10.f135219t
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r10 != 0) goto L_0x002b
            java.lang.Class<lc3.b> r10 = lc3.C10485b.class
            k40.a r10 = f40.C86709a0.m107533q(r10)
            lc3.b r10 = (lc3.C10485b) r10
            pj.f r10 = r10.vh0()
            java.lang.String r2 = "WCOWebPayListSwitch"
            int r10 = r10.mo107404b(r2, r0)
            if (r10 <= 0) goto L_0x0026
            r10 = 1
            goto L_0x0027
        L_0x0026:
            r10 = 0
        L_0x0027:
            if (r10 == 0) goto L_0x002b
            r10 = 1
            goto L_0x002c
        L_0x002b:
            r10 = 0
        L_0x002c:
            r2 = 2131831539(0x7f112af3, float:1.9296106E38)
            r3 = 2131831560(0x7f112b08, float:1.929615E38)
            r4 = 2
            if (r10 == 0) goto L_0x0058
            r10 = 3
            java.lang.String[] r10 = new java.lang.String[r10]
            com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponUI r5 = r9.f19679d
            r6 = 2131831617(0x7f112b41, float:1.9296265E38)
            java.lang.String r5 = r5.getString(r6)
            r10[r0] = r5
            com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponUI r0 = r9.f19679d
            java.lang.String r0 = r0.getString(r3)
            r10[r1] = r0
            com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponUI r0 = r9.f19679d
            java.lang.String r0 = r0.getString(r2)
            r10[r4] = r0
            com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponUI r0 = r9.f19679d
            r0.f19592G = r1
            goto L_0x006e
        L_0x0058:
            java.lang.String[] r10 = new java.lang.String[r4]
            com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponUI r4 = r9.f19679d
            java.lang.String r3 = r4.getString(r3)
            r10[r0] = r3
            com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponUI r3 = r9.f19679d
            java.lang.String r2 = r3.getString(r2)
            r10[r1] = r2
            com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponUI r2 = r9.f19679d
            r2.f19592G = r0
        L_0x006e:
            r5 = r10
            com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponUI r10 = r9.f19679d
            androidx.appcompat.app.AppCompatActivity r3 = r10.getContext()
            r4 = 0
            r6 = 0
            r7 = 0
            com.tencent.mm.plugin.ipcall.ui.l1$a r8 = new com.tencent.mm.plugin.ipcall.ui.l1$a
            r8.<init>()
            nj3.C76879j.m92737h(r3, r4, r5, r6, r7, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.ipcall.p065ui.C4691l1.onMenuItemClick(android.view.MenuItem):boolean");
    }
}
