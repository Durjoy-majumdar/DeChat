package com.tencent.p014mm.plugin.wallet_core.p125ui.cashier;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.p125ui.cashier.WcPayCashierFingerprintDialog;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.wallet_core.model.C75155x0;
import di3.C86312j;
import f63.C75727q;
import org.json.JSONException;
import org.json.JSONObject;
import p281yz.C79173v;
import pv2.C77290d;
import tt1.C78089c;
import tt1.C78090d;
import tt1.C78091e;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.cashier.g */
public class C72370g implements C78090d {

    /* renamed from: a */
    public final /* synthetic */ WcPayCashierFingerprintDialog.C72360c f210507a;

    public C72370g(WcPayCashierFingerprintDialog.C72360c cVar) {
        this.f210507a = cVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0062, code lost:
        r4 = r4.f210473i;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onFail(tt1.C78091e r7) {
        /*
            r6 = this;
            com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierFingerprintDialog$c r0 = r6.f210507a
            int r1 = r7.f228891b
            r0.f210481e = r1
            r0 = 2
            pv2.C77290d.m93108f(r0)
            tt1.c r0 = r7.f228892c
            int r0 = r0.f228884a
            r1 = 2005(0x7d5, float:2.81E-42)
            if (r0 == r1) goto L_0x0016
            r1 = 2007(0x7d7, float:2.812E-42)
            if (r0 != r1) goto L_0x001f
        L_0x0016:
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1 = 1104(0x450, float:1.547E-42)
            r2 = 36
            r0.mo175911u(r1, r2)
        L_0x001f:
            com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierFingerprintDialog$c r0 = r6.f210507a
            com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierFingerprintDialog r0 = com.tencent.p014mm.plugin.wallet_core.p125ui.cashier.WcPayCashierFingerprintDialog.this
            r0.dismiss()
            com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierFingerprintDialog$c r0 = r6.f210507a
            com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierFingerprintDialog r0 = com.tencent.p014mm.plugin.wallet_core.p125ui.cashier.WcPayCashierFingerprintDialog.this
            com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierFingerprintDialog$d r0 = r0.f210474j
            if (r0 == 0) goto L_0x00aa
            boolean r7 = r7.f228893d
            com.tencent.mm.plugin.wallet_core.ui.cashier.e r0 = (com.tencent.p014mm.plugin.wallet_core.p125ui.cashier.C72368e) r0
            r0.getClass()
            java.lang.String r1 = "MicroMsg.WcPayCashierDialog"
            java.lang.String r2 = "verify failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog r1 = r0.f210505a
            int r2 = com.tencent.p014mm.plugin.wallet_core.p125ui.cashier.WcPayCashierDialog.f210409y0
            r2 = 1
            r1.mo99693D(r2)
            com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog r1 = r0.f210505a
            android.widget.TextView r1 = r1.f210447r
            r2 = 2131839091(0x7f114873, float:1.9311424E38)
            r1.setText(r2)
            com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog r1 = r0.f210505a
            android.widget.TextView r1 = r1.f210447r
            r2 = 0
            r1.setVisibility(r2)
            com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog r1 = r0.f210505a
            com.tencent.mm.pluginsdk.wallet.PayInfo r3 = r1.f210421L
            r3.f212603x = r2
            com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierFingerprintDialog r4 = r1.f210414E
            if (r4 != 0) goto L_0x0062
            goto L_0x0066
        L_0x0062:
            com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierFingerprintDialog$c r4 = r4.f210473i
            if (r4 != 0) goto L_0x0068
        L_0x0066:
            r4 = 0
            goto L_0x006a
        L_0x0068:
            int r4 = r4.f210481e
        L_0x006a:
            r3.f212573D = r4
            boolean r4 = r3.f212605z
            r7 = r7 | r4
            r3.f212605z = r7
            android.view.ViewGroup r7 = r1.f210435d
            r7.setVisibility(r2)
            com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog r7 = r0.f210505a
            r1 = 0
            r7.f210414E = r1
            com.tencent.mm.pluginsdk.wallet.PayInfo r7 = r7.f210421L
            if (r7 != 0) goto L_0x0081
            r3 = 0
            goto L_0x0083
        L_0x0081:
            int r3 = r7.f212587e
        L_0x0083:
            java.lang.String r4 = ""
            if (r7 != 0) goto L_0x0089
            r7 = r4
            goto L_0x008b
        L_0x0089:
            java.lang.String r7 = r7.f212592j
        L_0x008b:
            r5 = 23
            com.tencent.p014mm.wallet_core.model.C75155x0.m90135a(r3, r7, r5, r4)
            com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog r7 = r0.f210505a
            com.tencent.mm.pluginsdk.wallet.PayInfo r7 = r7.f210421L
            if (r7 != 0) goto L_0x0097
            goto L_0x0099
        L_0x0097:
            int r2 = r7.f212587e
        L_0x0099:
            if (r7 != 0) goto L_0x009d
            r7 = r4
            goto L_0x009f
        L_0x009d:
            java.lang.String r7 = r7.f212592j
        L_0x009f:
            r0 = 25
            com.tencent.p014mm.wallet_core.model.C75155x0.m90135a(r2, r7, r0, r4)
            com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierFingerprintDialog$c r7 = r6.f210507a
            com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierFingerprintDialog r7 = com.tencent.p014mm.plugin.wallet_core.p125ui.cashier.WcPayCashierFingerprintDialog.this
            r7.f210474j = r1
        L_0x00aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wallet_core.p125ui.cashier.C72370g.onFail(tt1.e):void");
    }

    public void onRetry(C78091e eVar) {
        WcPayCashierFingerprintDialog wcPayCashierFingerprintDialog = WcPayCashierFingerprintDialog.this;
        wcPayCashierFingerprintDialog.f210471g.setImageDrawable(C74933u4.m89768e(wcPayCashierFingerprintDialog.getContext(), C0966R.raw.icons_outlined_pay_fingerprint_android, wcPayCashierFingerprintDialog.getContext().getResources().getColor(C0966R.color.f2966ao)));
        wcPayCashierFingerprintDialog.f210472h.setTextColor(wcPayCashierFingerprintDialog.getContext().getResources().getColor(C0966R.color.f2966ao));
        wcPayCashierFingerprintDialog.f210470f.setVisibility(0);
        wcPayCashierFingerprintDialog.f210470f.setOnClickListener(new C72369f(wcPayCashierFingerprintDialog));
        MMHandlerThread.postToMainThreadDelayed(new C75727q(wcPayCashierFingerprintDialog), 500);
        this.f210507a.f210481e = eVar.f228891b;
        C77290d.m93108f(1);
    }

    public void onSuccess(C78091e eVar) {
        WcPayCashierFingerprintDialog.this.mo99722d();
        WcPayCashierFingerprintDialog.C72360c cVar = this.f210507a;
        cVar.f210481e = eVar.f228891b;
        WcPayCashierFingerprintDialog.this.dismiss();
        WcPayCashierFingerprintDialog.C72361d dVar = WcPayCashierFingerprintDialog.this.f210474j;
        if (dVar != null) {
            C72368e eVar2 = (C72368e) dVar;
            Log.m105925i("MicroMsg.WcPayCashierDialog", "verify succeeded: %s", Boolean.valueOf(eVar2.f210505a.f210425Q));
            WcPayCashierDialog wcPayCashierDialog = eVar2.f210505a;
            if (!wcPayCashierDialog.f210425Q) {
                PayInfo payInfo = wcPayCashierDialog.f210421L;
                C75155x0.m90135a(payInfo == null ? 0 : payInfo.f212587e, payInfo == null ? "" : payInfo.f212592j, 22, "");
                PayInfo payInfo2 = eVar2.f210505a.f210421L;
                payInfo2.f212603x = 1;
                C78089c cVar2 = eVar.f228892c;
                payInfo2.f212570A = cVar2.f228886c;
                payInfo2.f212571B = cVar2.f228887d;
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("json", eVar.f228892c.f228888e);
                    jSONObject.put("signature", eVar.f228892c.f228889f);
                    jSONObject.put("soter_type", ((C79173v) C86312j.m106911c(C79173v.class)).Ex0().mo91317G());
                    eVar2.f210505a.f210421L.f212576G = jSONObject.toString();
                } catch (JSONException e) {
                    Log.printErrStackTrace("MicroMsg.WcPayCashierDialog", e, "", new Object[0]);
                }
                WcPayCashierDialog wcPayCashierDialog2 = eVar2.f210505a;
                PayInfo payInfo3 = wcPayCashierDialog2.f210421L;
                payInfo3.f212572C = eVar.f228892c.f228885b;
                payInfo3.f212573D = eVar.f228891b;
                wcPayCashierDialog2.f210435d.setVisibility(0);
                WcPayCashierDialog wcPayCashierDialog3 = eVar2.f210505a;
                wcPayCashierDialog3.f210414E = null;
                WcPayCashierDialog.m84670d(wcPayCashierDialog3, "", wcPayCashierDialog3.f210421L, wcPayCashierDialog3.f210423N);
            }
            WcPayCashierFingerprintDialog.this.f210474j = null;
        }
        C115669n.INSTANCE.mo175911u(1104, 37);
        C77290d.m93108f(0);
    }
}
