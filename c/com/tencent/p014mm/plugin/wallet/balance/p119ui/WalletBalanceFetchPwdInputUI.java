package com.tencent.p014mm.plugin.wallet.balance.p119ui;

import android.content.DialogInterface;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.p014mm.plugin.wallet_core.p125ui.cashier.WcPayCashierDialog;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import d53.C75326b;
import jm2.C117361f;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C117747y;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchPwdInputUI */
public class WalletBalanceFetchPwdInputUI extends WalletBaseUI {

    /* renamed from: d */
    public String f207684d = "";

    /* renamed from: e */
    public String f207685e = "";

    /* renamed from: f */
    public WcPayCashierDialog f207686f;

    /* renamed from: g */
    public String f207687g;

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchPwdInputUI$a */
    public class C71661a implements DialogInterface.OnClickListener {
        public C71661a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            WalletBalanceFetchPwdInputUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchPwdInputUI$b */
    public class C71662b implements WcPayCashierDialog.C72356i {
        public C71662b() {
        }

        /* renamed from: a */
        public void mo98829a() {
        }

        /* renamed from: b */
        public void mo98830b(String str, PayInfo payInfo, FavorPayInfo favorPayInfo, Bankcard bankcard) {
            if (WalletBalanceFetchPwdInputUI.this.getProcess() != null) {
                WalletBalanceFetchPwdInputUI.this.getNetController().mo91271d(str);
            }
        }

        public void onCancel() {
            WalletBalanceFetchPwdInputUI.this.finish();
            C115669n.INSTANCE.mo160131h(16398, WalletBalanceFetchPwdInputUI.this.f207687g, 8, "", "");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00da  */
    /* renamed from: H7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo98827H7() {
        /*
            r11 = this;
            com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog r0 = r11.f207686f
            if (r0 == 0) goto L_0x000f
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L_0x000f
            com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog r0 = r11.f207686f
            r0.dismiss()
        L_0x000f:
            android.os.Bundle r0 = r11.getInput()
            java.lang.String r1 = "key_orders"
            android.os.Parcelable r0 = r0.getParcelable(r1)
            com.tencent.mm.plugin.wallet_core.model.Orders r0 = (com.tencent.p014mm.plugin.wallet_core.model.Orders) r0
            android.os.Bundle r1 = r11.getInput()
            java.lang.String r2 = "key_fetch_cashier_encode_str"
            java.lang.String r1 = r1.getString(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            java.lang.String r4 = ""
            r5 = 0
            r6 = 1
            if (r3 != 0) goto L_0x00ac
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00a2, IOException -> 0x00a0 }
            r3.<init>(r1)     // Catch:{ JSONException -> 0x00a2, IOException -> 0x00a0 }
            te3.ke0 r1 = new te3.ke0     // Catch:{ JSONException -> 0x00a2, IOException -> 0x00a0 }
            r1.<init>()     // Catch:{ JSONException -> 0x00a2, IOException -> 0x00a0 }
            java.lang.String r7 = "is_open_field_area"
            int r7 = r3.optInt(r7, r5)     // Catch:{ JSONException -> 0x00a2, IOException -> 0x00a0 }
            r1.f136681d = r7     // Catch:{ JSONException -> 0x00a2, IOException -> 0x00a0 }
            java.lang.String r7 = "fetch_fee"
            java.lang.String r7 = r3.optString(r7)     // Catch:{ JSONException -> 0x00a2, IOException -> 0x00a0 }
            r1.f136682e = r7     // Catch:{ JSONException -> 0x00a2, IOException -> 0x00a0 }
            java.lang.String r7 = "fetch_fee_symbol"
            java.lang.String r7 = r3.optString(r7)     // Catch:{ JSONException -> 0x00a2, IOException -> 0x00a0 }
            r1.f136683f = r7     // Catch:{ JSONException -> 0x00a2, IOException -> 0x00a0 }
            int r7 = r1.f136681d     // Catch:{ JSONException -> 0x00a2, IOException -> 0x00a0 }
            if (r7 != r6) goto L_0x00ac
            java.lang.String r7 = r1.f136682e     // Catch:{ JSONException -> 0x009d, IOException -> 0x009b }
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)     // Catch:{ JSONException -> 0x009d, IOException -> 0x009b }
            if (r7 != 0) goto L_0x0077
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x009d, IOException -> 0x009b }
            r7.<init>()     // Catch:{ JSONException -> 0x009d, IOException -> 0x009b }
            java.lang.String r8 = r1.f136683f     // Catch:{ JSONException -> 0x009d, IOException -> 0x009b }
            r7.append(r8)     // Catch:{ JSONException -> 0x009d, IOException -> 0x009b }
            java.lang.String r8 = r1.f136682e     // Catch:{ JSONException -> 0x009d, IOException -> 0x009b }
            r7.append(r8)     // Catch:{ JSONException -> 0x009d, IOException -> 0x009b }
            java.lang.String r7 = r7.toString()     // Catch:{ JSONException -> 0x009d, IOException -> 0x009b }
            r11.f207685e = r7     // Catch:{ JSONException -> 0x009d, IOException -> 0x009b }
        L_0x0077:
            java.lang.String r7 = "encode_field_area_info"
            java.lang.String r3 = r3.optString(r7)     // Catch:{ JSONException -> 0x009d, IOException -> 0x009b }
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)     // Catch:{ JSONException -> 0x009d, IOException -> 0x009b }
            if (r7 != 0) goto L_0x0099
            byte[] r3 = android.util.Base64.decode(r3, r5)     // Catch:{ JSONException -> 0x009d, IOException -> 0x009b }
            te3.le0 r7 = new te3.le0     // Catch:{ JSONException -> 0x009d, IOException -> 0x009b }
            r7.<init>()     // Catch:{ JSONException -> 0x009d, IOException -> 0x009b }
            pe3.a r3 = r7.parseFrom(r3)     // Catch:{ JSONException -> 0x009d, IOException -> 0x009b }
            te3.le0 r3 = (te3.C50250le0) r3     // Catch:{ JSONException -> 0x009d, IOException -> 0x009b }
            r1.field_area_info = r3     // Catch:{ JSONException -> 0x009d, IOException -> 0x009b }
            java.util.LinkedList<te3.te4> r1 = r3.field_info     // Catch:{ JSONException -> 0x009d, IOException -> 0x009b }
            r2.addAll(r1)     // Catch:{ JSONException -> 0x009d, IOException -> 0x009b }
        L_0x0099:
            r3 = 1
            goto L_0x00ad
        L_0x009b:
            r1 = move-exception
            goto L_0x009e
        L_0x009d:
            r1 = move-exception
        L_0x009e:
            r3 = 1
            goto L_0x00a4
        L_0x00a0:
            r1 = move-exception
            goto L_0x00a3
        L_0x00a2:
            r1 = move-exception
        L_0x00a3:
            r3 = 0
        L_0x00a4:
            java.lang.Object[] r7 = new java.lang.Object[r5]
            java.lang.String r8 = "MicroMsg.WalletBalanceFetchPwdInputUI"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r1, r4, r7)
            goto L_0x00ad
        L_0x00ac:
            r3 = 0
        L_0x00ad:
            if (r0 == 0) goto L_0x00f1
            double r7 = r0.f209569n
            r9 = 0
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 <= 0) goto L_0x00f1
            if (r3 != 0) goto L_0x00f1
            android.os.Bundle r1 = r11.getInput()
            java.lang.String r3 = "key_fetch_cashier_desc"
            java.lang.String r1 = r1.getString(r3)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r3 != 0) goto L_0x00da
            java.lang.Object[] r3 = new java.lang.Object[r6]
            double r7 = r0.f209569n
            java.lang.String r0 = r0.f209568j
            java.lang.String r0 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90258m(r7, r0)
            r3[r5] = r0
            java.lang.String r4 = java.lang.String.format(r1, r3)
            goto L_0x00f1
        L_0x00da:
            android.content.res.Resources r1 = r11.getResources()
            r3 = 2131838779(0x7f11473b, float:1.931079E38)
            java.lang.Object[] r4 = new java.lang.Object[r6]
            double r7 = r0.f209569n
            java.lang.String r0 = r0.f209568j
            java.lang.String r0 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90258m(r7, r0)
            r4[r5] = r0
            java.lang.String r4 = r1.getString(r3, r4)
        L_0x00f1:
            com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog r0 = new com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog
            androidx.appcompat.app.AppCompatActivity r1 = r11.getContext()
            r0.<init>(r1)
            r11.f207686f = r0
            java.lang.String r1 = r11.f207684d
            java.lang.String r3 = r11.f207685e
            r0.f210431W = r1
            r0.f210432X = r3
            r0.f210430V = r4
            r0.f210433Y = r6
            r0.f210426R = r5
            r0.mo99707r()
            r0.mo99702o()
            r0.mo99700l()
            r0.mo99708s(r2)
            r0.mo99712v()
            r0.mo99695e()
            com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog r0 = r11.f207686f
            com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchPwdInputUI$b r1 = new com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchPwdInputUI$b
            r1.<init>()
            r0.f210445p0 = r1
            r0.show()
            com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog r0 = r11.f207686f
            r11.addDialog(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wallet.balance.p119ui.WalletBalanceFetchPwdInputUI.mo98827H7():void");
    }

    public void cleanUiData(int i) {
        if (i == 0) {
            finish();
        } else if (i == 1) {
            mo98827H7();
        }
    }

    public int getLayoutId() {
        return -1;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentViewVisibility(4);
        this.f207684d = getInput().getString("key_pwd_cash_title");
        this.f207685e = getInput().getString("key_pwd_cash_money");
        this.f207687g = getInput().getString("key_report_session_id");
        boolean z = true;
        Log.m105925i("MicroMsg.WalletBalanceFetchPwdInputUI", "hy: money : %s, title : %s", Util.nullAsNil(this.f207685e), Util.nullAsNil(this.f207684d));
        if (Util.isNullOrNil(this.f207684d) || Util.isNullOrNil(this.f207685e)) {
            z = false;
        }
        if (!z) {
            C76879j.m92742m(getContext(), C0966R.string.l0d, 0, new C71661a());
            return;
        }
        C117361f.INSTANCE.Tj0();
        mo98827H7();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar, boolean z) {
        super.onSceneEnd(i, i2, str, yVar, z);
        if (yVar instanceof C75326b) {
            setAuthState(false);
        }
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        return false;
    }
}
