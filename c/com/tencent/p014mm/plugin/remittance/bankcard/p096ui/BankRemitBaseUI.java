package com.tencent.p014mm.plugin.remittance.bankcard.p096ui;

import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;

/* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBaseUI */
public abstract class BankRemitBaseUI extends WalletBaseUI {

    /* renamed from: d */
    public static final /* synthetic */ int f115918d = 0;

    /* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBaseUI$a */
    public class C42809a implements MenuItem.OnMenuItemClickListener {
        public C42809a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            BankRemitBaseUI bankRemitBaseUI = BankRemitBaseUI.this;
            int i = BankRemitBaseUI.f115918d;
            if (bankRemitBaseUI.needConfirmFinish()) {
                BankRemitBaseUI.this.hideVKB();
                BankRemitBaseUI.this.showDialog(1000);
                return true;
            }
            BankRemitBaseUI.this.finish();
            return true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0065 A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009d A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* renamed from: H7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m46480H7(android.app.Activity r12) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 8192(0x2000, float:1.14794E-41)
            r2 = 2
            r3 = 23
            r4 = 1
            r5 = 0
            if (r0 < r3) goto L_0x0019
            android.view.Window r12 = r12.getWindow()
            android.view.View r12 = r12.getDecorView()
            r12.setSystemUiVisibility(r1)
            r2 = 3
            goto L_0x009e
        L_0x0019:
            android.view.Window r6 = r12.getWindow()
            if (r6 == 0) goto L_0x0062
            java.lang.Class r7 = r6.getClass()
            java.lang.String r8 = "android.view.MiuiWindowManager$LayoutParams"
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r9 = "EXTRA_FLAG_STATUS_BAR_DARK_MODE"
            java.lang.reflect.Field r9 = r8.getField(r9)     // Catch:{ Exception -> 0x0062 }
            int r8 = r9.getInt(r8)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r9 = "setExtraFlags"
            java.lang.Class[] r10 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0062 }
            java.lang.Class r11 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0062 }
            r10[r5] = r11     // Catch:{ Exception -> 0x0062 }
            r10[r4] = r11     // Catch:{ Exception -> 0x0062 }
            java.lang.reflect.Method r7 = r7.getMethod(r9, r10)     // Catch:{ Exception -> 0x0062 }
            java.lang.Object[] r9 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0062 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x0062 }
            r9[r5] = r10     // Catch:{ Exception -> 0x0062 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x0062 }
            r9[r4] = r8     // Catch:{ Exception -> 0x0062 }
            r7.invoke(r6, r9)     // Catch:{ Exception -> 0x0062 }
            if (r0 < r3) goto L_0x0060
            android.view.Window r0 = r12.getWindow()     // Catch:{ Exception -> 0x0060 }
            android.view.View r0 = r0.getDecorView()     // Catch:{ Exception -> 0x0060 }
            r0.setSystemUiVisibility(r1)     // Catch:{ Exception -> 0x0060 }
        L_0x0060:
            r0 = 1
            goto L_0x0063
        L_0x0062:
            r0 = 0
        L_0x0063:
            if (r0 == 0) goto L_0x0067
            r2 = 1
            goto L_0x009e
        L_0x0067:
            android.view.Window r12 = r12.getWindow()
            if (r12 == 0) goto L_0x0099
            android.view.WindowManager$LayoutParams r0 = r12.getAttributes()     // Catch:{ Exception -> 0x0099 }
            java.lang.Class<android.view.WindowManager$LayoutParams> r1 = android.view.WindowManager.LayoutParams.class
            java.lang.String r3 = "MEIZU_FLAG_DARK_STATUS_BAR_ICON"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r3)     // Catch:{ Exception -> 0x0099 }
            java.lang.Class<android.view.WindowManager$LayoutParams> r3 = android.view.WindowManager.LayoutParams.class
            java.lang.String r6 = "meizuFlags"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r6)     // Catch:{ Exception -> 0x0099 }
            r1.setAccessible(r4)     // Catch:{ Exception -> 0x0099 }
            r3.setAccessible(r4)     // Catch:{ Exception -> 0x0099 }
            r6 = 0
            int r1 = r1.getInt(r6)     // Catch:{ Exception -> 0x0099 }
            int r6 = r3.getInt(r0)     // Catch:{ Exception -> 0x0099 }
            r1 = r1 | r6
            r3.setInt(r0, r1)     // Catch:{ Exception -> 0x0099 }
            r12.setAttributes(r0)     // Catch:{ Exception -> 0x0099 }
            goto L_0x009a
        L_0x0099:
            r4 = 0
        L_0x009a:
            if (r4 == 0) goto L_0x009d
            goto L_0x009e
        L_0x009d:
            r2 = 0
        L_0x009e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.remittance.bankcard.p096ui.BankRemitBaseUI.m46480H7(android.app.Activity):int");
    }

    /* renamed from: I7 */
    public void mo66989I7() {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo66989I7();
        setBackBtn(new C42809a());
    }
}
