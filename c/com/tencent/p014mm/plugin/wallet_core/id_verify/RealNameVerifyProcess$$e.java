package com.tencent.p014mm.plugin.wallet_core.id_verify;

import android.content.DialogInterface;
import android.content.Intent;
import b63.C67209v;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.wallet_core.model.Authen;
import com.tencent.p014mm.plugin.wallet_core.model.Orders;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import cr3.C75282g;
import cr3.C75296i;
import nj3.C76879j;
import ob0.C117747y;
import u53.C78130a;
import v53.C78342e0;

/* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.RealNameVerifyProcess$$e */
public class RealNameVerifyProcess$$e extends C75282g {

    /* renamed from: c */
    public Authen f209034c;

    /* renamed from: d */
    public final /* synthetic */ RealNameVerifyProcess f209035d;

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.RealNameVerifyProcess$$e$a */
    public class C72064a implements DialogInterface.OnClickListener {
        public C72064a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105924i("MicroMsg.RealNameVerifyProcess", "NetSceneTenpayBindBankcard dialog lOk");
            RealNameVerifyProcess$$e.this.f221419b.mo105625d(new C78130a(RealNameVerifyProcess$$e.this.f209034c, "1", RealNameVerifyProcess$$e.this.f209035d.f232423c.getString("key_realname_sessionid")), true);
            C67209v.m79539a(1);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.RealNameVerifyProcess$$e$b */
    public class C72065b implements DialogInterface.OnClickListener {
        public C72065b(RealNameVerifyProcess$$e realNameVerifyProcess$$e) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105924i("MicroMsg.RealNameVerifyProcess", "NetSceneTenpayBindBankcard dialog lCancel");
            C67209v.m79539a(0);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RealNameVerifyProcess$$e(RealNameVerifyProcess realNameVerifyProcess, MMActivity mMActivity, C75296i iVar) {
        super(mMActivity, iVar);
        this.f209035d = realNameVerifyProcess;
    }

    /* renamed from: b */
    public void mo99282b(int i, int i2, Intent intent) {
        Log.m105925i("MicroMsg.RealNameVerifyProcess", "onActivityResult: %s, %s", Integer.valueOf(i), Integer.valueOf(i2));
        if (i == 1 && i2 == -1 && intent != null && intent.getExtras() != null) {
            this.f209035d.f232423c.putString("realname_verify_process_face_token", intent.getExtras().getString(XWalkReaderBasePlugin.PARAM_KEY_TOKEN));
            RealNameVerifyProcess realNameVerifyProcess = this.f209035d;
            realNameVerifyProcess.mo91264o(this.f221418a, 0, realNameVerifyProcess.f232423c);
        }
    }

    /* renamed from: d */
    public boolean mo91271d(Object... objArr) {
        this.f209035d.mo109107a("onNext", objArr);
        Authen authen = objArr[0];
        this.f209034c = authen;
        Orders orders = objArr[1];
        authen.f209367d = this.f209035d.mo107970G();
        this.f221419b.mo105625d(new C78130a(this.f209034c, "", this.f209035d.f232423c.getString("key_realname_sessionid")), true);
        return true;
    }

    /* renamed from: e */
    public boolean mo91272e(int i, int i2, String str, C117747y yVar) {
        if (i == 0 && i2 == 0) {
            if (yVar instanceof C78130a) {
                C78130a aVar = (C78130a) yVar;
                if (aVar.f228969h == null) {
                    this.f209035d.f232423c.putString("kreq_token", aVar.f228968g);
                    RealNameVerifyProcess realNameVerifyProcess = this.f209035d;
                    if (realNameVerifyProcess.mo91267t(this.f221418a, realNameVerifyProcess.f232423c)) {
                        Log.m105924i("MicroMsg.RealNameVerifyProcess", "need update bankcardlist");
                        this.f221419b.mo95362b(new C78342e0((String) null, 12), true);
                    } else {
                        Log.m105924i("MicroMsg.RealNameVerifyProcess", "not need update bankcardlist");
                        RealNameVerifyProcess realNameVerifyProcess2 = this.f209035d;
                        realNameVerifyProcess2.mo91264o(this.f221418a, 0, realNameVerifyProcess2.f232423c);
                    }
                } else {
                    Log.m105924i("MicroMsg.RealNameVerifyProcess", "NetSceneTenpayBindBankcard show juveniles dialog");
                    MMActivity mMActivity = this.f221418a;
                    C67209v vVar = aVar.f228969h;
                    C76879j.m92707A(mMActivity, vVar.f192980a, "", vVar.f192982c, vVar.f192981b, new C72064a(), new C72065b(this));
                }
                return true;
            } else if (yVar instanceof C78342e0) {
                Log.m105924i("MicroMsg.RealNameVerifyProcess", "update bankcardlist success!");
                RealNameVerifyProcess realNameVerifyProcess3 = this.f209035d;
                realNameVerifyProcess3.mo91264o(this.f221418a, 0, realNameVerifyProcess3.f232423c);
                return true;
            }
        }
        return false;
    }
}
