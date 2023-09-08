package com.tencent.p014mm.plugin.offline.p085ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.TextUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.offline.C69962l;
import com.tencent.p014mm.plugin.offline.C69963m;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72379f1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import cr3.C75283h;
import di3.C86312j;
import id2.C46217g;
import id2.C76313t;
import kd2.C46690e;
import kd2.C76558d;
import kd2.C76559f;
import nj3.C76879j;
import ob0.C117747y;
import p281yz.C79173v;
import yq3.C79143a;
import yq3.C79148e;

/* renamed from: com.tencent.mm.plugin.offline.ui.w */
public class C70034w {

    /* renamed from: a */
    public Activity f202060a;

    /* renamed from: b */
    public C69990b f202061b;

    /* renamed from: c */
    public C72379f1 f202062c;

    /* renamed from: d */
    public Vibrator f202063d;

    /* renamed from: com.tencent.mm.plugin.offline.ui.w$a */
    public class C70035a implements DialogInterface.OnClickListener {
        public C70035a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            Activity activity = C70034w.this.f202060a;
            C76559f.m92129y(activity, "freeze", activity.getString(C0966R.string.law), 0, -1);
            Log.m105924i("MicroMsg.OfflineLogicMgr", "doFreezeOffline");
        }
    }

    /* renamed from: com.tencent.mm.plugin.offline.ui.w$b */
    public class C70036b implements DialogInterface.OnClickListener {
        public C70036b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            C70034w.this.f202060a.finish();
        }
    }

    public C70034w(Activity activity, C69990b bVar) {
        this.f202060a = activity;
        this.f202061b = bVar;
    }

    /* renamed from: a */
    public final String mo96359a(int i) {
        return this.f202060a.getString(i);
    }

    /* renamed from: b */
    public void mo96360b(C117747y yVar, int i, String str, C76313t.C76319g gVar) {
        int i2 = i;
        String str2 = str;
        C76313t.C76319g gVar2 = gVar;
        Class cls = C79173v.class;
        Log.m105924i("MicroMsg.OfflineLogicMgr", "handleErrorEvent errCode :" + i2 + " msg:" + str2);
        C72379f1 f1Var = this.f202062c;
        if (f1Var != null) {
            f1Var.dismiss();
            this.f202062c = null;
        }
        if (i2 == 409) {
            Log.m105924i("MicroMsg.OfflineLogicMgr", "goLimitChangeUI msg:" + str2);
            C76879j.m92707A(this.f202060a, str, "", mo96359a(C0966R.string.lb5), mo96359a(C0966R.string.f7926wf), new C70012j0(this), new C70028t(this));
        } else if (i2 == 410) {
            Log.m105924i("MicroMsg.OfflineLogicMgr", "showBindNewBankcardDialog msg:" + str2);
            C76879j.m92707A(this.f202060a, str, "", mo96359a(C0966R.string.l3j), mo96359a(C0966R.string.f7926wf), new C70007h0(this), new C70008i0(this));
        } else if (i2 == 413) {
            Log.m105924i("MicroMsg.OfflineLogicMgr", "goChangeBankcard msg:" + str2);
            C76879j.m92707A(this.f202060a, str, "", mo96359a(C0966R.string.lag), mo96359a(C0966R.string.f7926wf), new C70030u(this), new C70031v(this));
        } else if (i2 != 411) {
            Activity activity = this.f202060a;
            if (!(activity instanceof WalletBaseUI)) {
                C70021r.m82512a(activity, str2, gVar2);
            } else if (!C75283h.m90311a((WalletBaseUI) activity, yVar, 1000, i2, str2)) {
                C70021r.m82512a(this.f202060a, str2, gVar2);
            }
        } else if (((C79173v) C86312j.m106911c(cls)).Ex0().mo91343y() || ((C79173v) C86312j.m106911c(cls)).Ex0().mo91342x()) {
            Log.m105924i("MicroMsg.OfflineLogicMgr", "is unreg or simplereg");
        } else {
            if (C69963m.f201787j) {
                Activity activity2 = this.f202060a;
                if (activity2 instanceof WalletOfflineCoinPurseUI) {
                    WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = (WalletOfflineCoinPurseUI) activity2;
                    walletOfflineCoinPurseUI.f201819E.setVisibility(4);
                    walletOfflineCoinPurseUI.f201887m1.mo96283f(walletOfflineCoinPurseUI.f201907w, new C69994c1(walletOfflineCoinPurseUI), 6);
                    C115669n.INSTANCE.idkeyStat(135, 1, 1, true);
                }
            }
            Activity activity3 = this.f202060a;
            C76879j.m92717K(activity3, false, str, "", activity3.getString(C0966R.string.lbd), activity3.getString(C0966R.string.f7926wf), new C76558d(activity3), new C46690e(activity3));
            C115669n.INSTANCE.idkeyStat(135, 1, 1, true);
        }
    }

    /* renamed from: c */
    public boolean mo96361c(int i, int i2, String str, C117747y yVar) {
        RealnameGuideHelper realnameGuideHelper;
        Log.m105924i("MicroMsg.OfflineLogicMgr", "errType:" + i + "  errCode" + i2 + " errMsg:" + str + " cgi type:" + yVar.getType());
        if (i == 0 && i2 == 0) {
            boolean z = yVar instanceof C46217g;
            if (z) {
                C46217g gVar = (C46217g) yVar;
                String str2 = gVar.f124578f;
                C72379f1 f1Var = this.f202062c;
                if (f1Var != null) {
                    f1Var.dismiss();
                    this.f202062c = null;
                }
                if (gVar.f124580h == 0 && !TextUtils.isEmpty(str2)) {
                    Activity activity = this.f202060a;
                    Log.m105924i("MicroMsg.WalletOfflineUtil", "hy: only transid coming. do old way");
                    if (TextUtils.isEmpty(str2)) {
                        Log.m105920e("MicroMsg.WalletOfflineUtil", "transid == null");
                    } else if (C76559f.m92117m()) {
                        Bundle bundle = new Bundle();
                        if (z && (realnameGuideHelper = gVar.f124583n) != null) {
                            bundle.putParcelable("key_realname_guide_helper", realnameGuideHelper);
                        }
                        bundle.putString("key_trans_id", str2);
                        bundle.putInt("key_pay_type", 2);
                        if (activity instanceof WalletOfflineCoinPurseUI) {
                            Intent intent = activity.getIntent();
                            bundle.putString("key_appid", intent.getStringExtra("key_appid"));
                            bundle.putInt("key_from_scene", intent.getIntExtra("key_from_scene", 0));
                        }
                        C79143a.m95771j(activity, C69962l.class, bundle, (C79148e.C79149a) null);
                    }
                    this.f202060a.setResult(-1);
                    this.f202060a.finish();
                    return true;
                } else if (gVar.f124580h == 0 || gVar.f124579g == 0 || gVar.f124582j != 1) {
                    return true;
                } else {
                    Log.m105924i("MicroMsg.OfflineLogicMgr", "input pwd, but respon exist error!");
                    mo96360b(gVar, gVar.f124580h, gVar.f124581i, (C76313t.C76319g) null);
                    return true;
                }
            }
        } else if (yVar instanceof C46217g) {
            C46217g gVar2 = (C46217g) yVar;
            C72379f1 f1Var2 = this.f202062c;
            if (f1Var2 != null) {
                f1Var2.dismiss();
                this.f202062c = null;
            }
            if (gVar2.f124582j != 1) {
                return true;
            }
            Log.m105924i("MicroMsg.OfflineLogicMgr", "input pwd, but respon exist error!");
            mo96360b(yVar, i2, str, (C76313t.C76319g) null);
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public void mo96362d(C76313t.C76315c cVar) {
        if (cVar != null) {
            Log.m105924i("MicroMsg.OfflineLogicMgr", "showFreeMsg");
            if ("1".equals(cVar.f223556d)) {
                C76879j.m92717K(this.f202060a, false, cVar.f223557e, "", mo96359a(C0966R.string.lav), mo96359a(C0966R.string.f7926wf), new C70035a(), new C70036b());
            }
        }
    }
}
