package com.tencent.p014mm.plugin.wallet_core.id_verify;

import android.content.Intent;
import b63.C67210w;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.RequestFaceVerifyForPayEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.wallet_core.model.BindCardOrder;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import cr3.C75282g;
import cr3.C75296i;
import di3.C86312j;
import ob0.C117747y;
import p281yz.C79173v;
import u53.C78130a;
import v53.C78355w;
import z53.C79313l;

/* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.RealNameVerifyProcess$$f */
public class RealNameVerifyProcess$$f extends C75282g {

    /* renamed from: c */
    public final /* synthetic */ RealNameVerifyProcess f209037c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RealNameVerifyProcess$$f(RealNameVerifyProcess realNameVerifyProcess, MMActivity mMActivity, C75296i iVar) {
        super(mMActivity, iVar);
        this.f209037c = realNameVerifyProcess;
    }

    /* renamed from: a */
    public CharSequence mo91282a(int i) {
        return this.f221418a.getString(C0966R.string.l_5);
    }

    /* renamed from: b */
    public void mo99282b(int i, int i2, Intent intent) {
        Log.m105925i("MicroMsg.RealNameVerifyProcess", "onActivityResult: %s, %s", Integer.valueOf(i), Integer.valueOf(i2));
        if (i == 1 && i2 == -1 && intent != null && intent.getExtras() != null) {
            this.f209037c.f232423c.putString("realname_verify_process_face_token", intent.getExtras().getString(XWalkReaderBasePlugin.PARAM_KEY_TOKEN));
            RealNameVerifyProcess realNameVerifyProcess = this.f209037c;
            realNameVerifyProcess.mo91264o(this.f221418a, 0, realNameVerifyProcess.f232423c);
        }
    }

    /* renamed from: d */
    public boolean mo91271d(Object... objArr) {
        this.f209037c.mo109107a("WalletVerifyCodeUI onNext", objArr);
        Log.m105924i("MicroMsg.RealNameVerifyProcess", "onNext, do bind verify!");
        C67210w wVar = objArr[1];
        if (!((C79173v) C86312j.m106911c(C79173v.class)).Ex0().mo91341w() || "rename".equals(this.f209037c.f232423c.getString("key_realname_scene"))) {
            wVar.f192983a = "1";
        } else {
            wVar.f192983a = "2";
        }
        this.f209037c.getClass();
        this.f221419b.mo105625d(new C78355w(wVar, this.f209037c.f232423c.getInt("entry_scene", -1), this.f209037c.f232423c.getString("key_realname_sessionid")), true);
        return true;
    }

    /* renamed from: e */
    public boolean mo91272e(int i, int i2, String str, C117747y yVar) {
        if (i == 0 && i2 == 0) {
            if (yVar instanceof C78130a) {
                Log.m105924i("MicroMsg.RealNameVerifyProcess", "verify code success!");
                this.f209037c.f232423c.putString("kreq_token", ((C78130a) yVar).f228968g);
                return true;
            } else if (yVar instanceof C78355w) {
                this.f209037c.mo107969F(this.f221419b);
                C78355w wVar = (C78355w) yVar;
                BindCardOrder bindCardOrder = wVar.f229612d;
                if (bindCardOrder != null) {
                    this.f209037c.f232423c.putParcelable("key_bindcard_value_result", bindCardOrder);
                }
                this.f209037c.f232423c.putString("key_resetpwd", wVar.f229613e);
                boolean z = this.f209037c.f232423c.getBoolean("realname_verify_process_need_face", false);
                Log.m105925i("MicroMsg.RealNameVerifyProcess", "forward: %s", Boolean.valueOf(z));
                if (z) {
                    RequestFaceVerifyForPayEvent requestFaceVerifyForPayEvent = new RequestFaceVerifyForPayEvent();
                    RequestFaceVerifyForPayEvent.C1117a aVar = requestFaceVerifyForPayEvent.f9431d;
                    aVar.f9441i = this.f221418a;
                    aVar.f9433a = (int) this.f209037c.f232423c.getLong("realname_verify_process_face_scene");
                    requestFaceVerifyForPayEvent.f9431d.f9434b = this.f209037c.f232423c.getString("realname_verify_process_face_package");
                    requestFaceVerifyForPayEvent.f9431d.f9435c = this.f209037c.f232423c.getString("realname_verify_process_face_package_sign");
                    requestFaceVerifyForPayEvent.f9431d.f9440h = 1;
                    requestFaceVerifyForPayEvent.publish();
                } else {
                    RealNameVerifyProcess realNameVerifyProcess = this.f209037c;
                    realNameVerifyProcess.mo91264o(this.f221418a, 0, realNameVerifyProcess.f232423c);
                }
                return true;
            } else if (yVar instanceof C79313l) {
                return true;
            }
        }
        return false;
    }
}
