package com.tencent.p014mm.plugin.wallet_core.id_verify;

import b63.C67210w;
import com.tencent.p014mm.autogen.events.WalletGetUserInfoEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.wallet_core.id_verify.model.RealNameBundle;
import com.tencent.p014mm.plugin.wallet_core.model.BindCardOrder;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import cr3.C75282g;
import cr3.C75296i;
import di3.C86312j;
import ob0.C117747y;
import p281yz.C79173v;
import u53.C78131b;
import z53.C79308f;
import z53.C79313l;

/* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.RealNameVerifyProcess$$c */
public class RealNameVerifyProcess$$c extends C75282g {

    /* renamed from: c */
    public final /* synthetic */ RealNameVerifyProcess f209033c;

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.RealNameVerifyProcess$$c$a */
    public class C72062a implements Runnable {
        public C72062a(RealNameVerifyProcess$$c realNameVerifyProcess$$c) {
        }

        public void run() {
            Log.m105924i("MicroMsg.RealNameVerifyProcess", "update user info succ,end process");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.RealNameVerifyProcess$$c$b */
    public class C72063b implements Runnable {
        public C72063b(RealNameVerifyProcess$$c realNameVerifyProcess$$c) {
        }

        public void run() {
            Log.m105924i("MicroMsg.RealNameVerifyProcess", "update user info succ,end process");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RealNameVerifyProcess$$c(RealNameVerifyProcess realNameVerifyProcess, MMActivity mMActivity, C75296i iVar) {
        super(mMActivity, iVar);
        this.f209033c = realNameVerifyProcess;
    }

    /* renamed from: d */
    public boolean mo91271d(Object... objArr) {
        C67210w wVar = objArr[0];
        String string = this.f209033c.f232423c.getString("key_real_name_token");
        String string2 = this.f209033c.f232423c.getString("realname_verify_process_face_token");
        String string3 = this.f209033c.f232423c.getString("key_realname_sessionid");
        boolean z = this.f209033c.f232423c.getBoolean("key_marketing_switch_closed", false);
        RealNameBundle realNameBundle = (RealNameBundle) this.f209033c.f232423c.getParcelable("realname_verify_process_bundle");
        if (wVar == null || Util.isNullOrNil(wVar.f192984b)) {
            Log.m105920e("MicroMsg.RealNameVerifyProcess", "get pwd error");
        } else if (this.f209033c.f232423c.containsKey("kreq_token")) {
            Log.m105924i("MicroMsg.RealNameVerifyProcess", "bindcard verify");
            this.f221419b.mo95362b(new C78131b(wVar, this.f209033c.f232423c.getInt("entry_scene", -1), string3, realNameBundle), true);
        } else {
            this.f221419b.mo95362b(new C79308f(1, wVar.f192984b, string, string2, this.f209033c.f232423c.getInt("entry_scene", -1), string3, realNameBundle, z), true);
        }
        return true;
    }

    /* renamed from: e */
    public boolean mo91272e(int i, int i2, String str, C117747y yVar) {
        C117747y yVar2 = yVar;
        Class cls = C79173v.class;
        if (yVar2 instanceof C79308f) {
            if (i == 0 && i2 == 0) {
                C79308f fVar = (C79308f) yVar2;
                if (fVar.f232829g == 0) {
                    this.f209033c.f232423c.putInt("realname_verify_process_ret", -1);
                }
                this.f209033c.f232423c.putString("realname_verify_process_finish_title", fVar.f232826d);
                this.f209033c.f232423c.putString("realname_verify_process_finish_desc", fVar.f232827e);
                this.f209033c.f232423c.putString("realname_verify_process_finish_page", fVar.f232828f);
                this.f209033c.f232423c.putInt("realname_verify_process_finish_err_jump", fVar.f232829g);
                Log.m105924i("MicroMsg.RealNameVerifyProcess", "real name reg succ ,update user info");
                ((C79173v) C86312j.m106911c(cls)).Ex0().mo91312B();
                WalletGetUserInfoEvent walletGetUserInfoEvent = new WalletGetUserInfoEvent();
                walletGetUserInfoEvent.f194038d.f194040a = 16;
                walletGetUserInfoEvent.callback = new C72062a(this);
                walletGetUserInfoEvent.publish();
                this.f209033c.mo107969F(this.f221419b);
                RealNameVerifyProcess realNameVerifyProcess = this.f209033c;
                if (realNameVerifyProcess.f209020e == 2) {
                    realNameVerifyProcess.mo91259f(this.f221418a, realNameVerifyProcess.f232423c);
                } else {
                    realNameVerifyProcess.mo91264o(this.f221418a, 0, realNameVerifyProcess.f232423c);
                }
                return true;
            }
        } else if (yVar2 instanceof C78131b) {
            if (i == 0 && i2 == 0) {
                C78131b bVar = (C78131b) yVar2;
                if (bVar.f228974h == 0) {
                    this.f209033c.f232423c.putInt("realname_verify_process_ret", -1);
                }
                this.f209033c.f232423c.putString("realname_verify_process_finish_title", bVar.f228971e);
                this.f209033c.f232423c.putString("realname_verify_process_finish_desc", bVar.f228972f);
                this.f209033c.f232423c.putString("realname_verify_process_finish_page", bVar.f228973g);
                this.f209033c.f232423c.putInt("realname_verify_process_finish_err_jump", bVar.f228974h);
                Log.m105924i("MicroMsg.RealNameVerifyProcess", "bind card verify succ ,update user info");
                BindCardOrder bindCardOrder = bVar.f228970d;
                if (bindCardOrder != null) {
                    this.f209033c.f232423c.putParcelable("key_bindcard_value_result", bindCardOrder);
                }
                ((C79173v) C86312j.m106911c(cls)).Ex0().mo91312B();
                WalletGetUserInfoEvent walletGetUserInfoEvent2 = new WalletGetUserInfoEvent();
                walletGetUserInfoEvent2.f194038d.f194040a = 16;
                walletGetUserInfoEvent2.callback = new C72063b(this);
                walletGetUserInfoEvent2.publish();
                this.f209033c.mo107969F(this.f221419b);
                RealNameVerifyProcess realNameVerifyProcess2 = this.f209033c;
                if (realNameVerifyProcess2.f209020e == 2) {
                    realNameVerifyProcess2.mo91259f(this.f221418a, realNameVerifyProcess2.f232423c);
                } else {
                    realNameVerifyProcess2.mo91264o(this.f221418a, 0, realNameVerifyProcess2.f232423c);
                }
                return true;
            }
        } else if (yVar2 instanceof C79313l) {
            return true;
        }
        return false;
    }
}
