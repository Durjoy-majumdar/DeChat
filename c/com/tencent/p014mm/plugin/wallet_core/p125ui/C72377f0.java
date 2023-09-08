package com.tencent.p014mm.plugin.wallet_core.p125ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import b63.C67210w;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import cr3.C75282g;
import cr3.C75296i;
import ob0.C117747y;
import v53.C78346i0;
import v53.C78357y;
import yq3.C79148e;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.f0 */
public class C72377f0 extends C79148e {

    /* renamed from: d */
    public String f210529d;

    /* renamed from: e */
    public String f210530e;

    /* renamed from: f */
    public String f210531f;

    /* renamed from: g */
    public int f210532g;

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.f0$a */
    public class C72378a extends C75282g {

        /* renamed from: c */
        public final /* synthetic */ C75296i f210533c;

        /* renamed from: d */
        public final /* synthetic */ MMActivity f210534d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C72378a(MMActivity mMActivity, C75296i iVar, C75296i iVar2, MMActivity mMActivity2) {
            super(mMActivity, iVar);
            this.f210533c = iVar2;
            this.f210534d = mMActivity2;
        }

        /* renamed from: d */
        public boolean mo91271d(Object... objArr) {
            if (objArr.length == 2) {
                C67210w wVar = objArr[1];
                wVar.f192986d = C72377f0.this.f210531f;
                Log.m105924i("MicroMsg.WalletJSApiVerifyCodeProcess", "do NetSceneTenpayVerifySmsByPasswd");
                this.f210533c.mo105625d(new C78346i0(wVar, C72377f0.this.f210529d), true);
                return true;
            }
            Log.m105920e("MicroMsg.WalletJSApiVerifyCodeProcess", "arguments is error");
            return false;
        }

        /* renamed from: e */
        public boolean mo91272e(int i, int i2, String str, C117747y yVar) {
            if (i != 0 || i2 != 0) {
                if (yVar instanceof C78346i0) {
                    Log.m105920e("MicroMsg.WalletJSApiVerifyCodeProcess", "send sms fail,errType=" + i + ",errCode=" + i2 + ",errMsg=" + str);
                }
                return false;
            } else if (!(yVar instanceof C78346i0)) {
                return yVar instanceof C78357y;
            } else {
                Log.m105924i("MicroMsg.WalletJSApiVerifyCodeProcess", "send sms succ");
                Bundle bundle = C72377f0.this.f232423c;
                bundle.putString("key_jsapi_token", ((C78346i0) yVar).f229581d);
                C72377f0.this.mo91259f(this.f210534d, bundle);
                return true;
            }
        }

        /* renamed from: f */
        public boolean mo91281f(Object... objArr) {
            Log.m105924i("MicroMsg.WalletJSApiVerifyCodeProcess", "resend sms");
            C72377f0 f0Var = C72377f0.this;
            this.f210533c.mo105625d(new C78357y(f0Var.f210530e, f0Var.f210531f, true), true);
            return true;
        }
    }

    /* renamed from: A */
    public C79148e mo91260A(Activity activity, Bundle bundle) {
        Log.m105924i("MicroMsg.WalletJSApiVerifyCodeProcess", "start WalletJSApiVerifyCodeProcess");
        this.f210529d = bundle.getString("key_relation_key");
        this.f210530e = bundle.getString("key_pwd1");
        this.f210531f = bundle.getString("key_jsapi_token");
        this.f210532g = bundle.getInt("key_verify_scene");
        mo109103B(activity, WalletVerifyCodeUI.class, bundle);
        return this;
    }

    /* renamed from: c */
    public void mo91257c(Activity activity, int i) {
    }

    /* renamed from: e */
    public String mo91258e() {
        return null;
    }

    /* renamed from: f */
    public void mo91259f(Activity activity, Bundle bundle) {
        Log.m105924i("MicroMsg.WalletJSApiVerifyCodeProcess", "end WalletJSApiVerifyCodeProcess");
        if (this.f210532g == 8) {
            mo109113k(activity, "wallet", ".pay.ui.WalletLoanRepaymentUI", -1, (Intent) null, false);
            return;
        }
        mo109110h(activity, WalletCheckPwdUI.class, -1, (Intent) null, false);
    }

    /* renamed from: o */
    public void mo91264o(Activity activity, int i, Bundle bundle) {
    }

    /* renamed from: p */
    public C75282g mo91265p(MMActivity mMActivity, C75296i iVar) {
        return new C72378a(mMActivity, iVar, iVar, mMActivity);
    }

    /* renamed from: t */
    public boolean mo91267t(Activity activity, Bundle bundle) {
        return false;
    }
}
