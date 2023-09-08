package com.tencent.p014mm.plugin.wallet_payu.bind.model;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.wallet_payu.bind.model.NetScenePayUElementQuery;
import com.tencent.p014mm.plugin.wallet_payu.bind.p892ui.WalletPayUBankcardManageUI;
import com.tencent.p014mm.plugin.wallet_payu.bind.p892ui.WalletPayUCardElementUI;
import com.tencent.p014mm.plugin.wallet_payu.pwd.p894ui.WalletPayUCheckPwdUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import cr3.C75282g;
import cr3.C75296i;
import nj3.C76912y0;
import ob0.C117747y;
import r63.C77487a;
import x63.C78771a;
import yq3.C79148e;

/* renamed from: com.tencent.mm.plugin.wallet_payu.bind.model.a */
public class C72574a extends C79148e {

    /* renamed from: com.tencent.mm.plugin.wallet_payu.bind.model.a$a */
    public class C72575a extends C78771a {
        public C72575a(C72574a aVar, MMActivity mMActivity, C75296i iVar, Bundle bundle) {
            super(mMActivity, iVar, bundle);
        }

        /* renamed from: a */
        public CharSequence mo91282a(int i) {
            if (i == 0) {
                return this.f221418a.getString(C0966R.string.kqw);
            }
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_payu.bind.model.a$b */
    public class C72576b extends C75282g {
        public C72576b(MMActivity mMActivity, C75296i iVar) {
            super(mMActivity, iVar);
        }

        /* renamed from: d */
        public boolean mo91271d(Object... objArr) {
            NetScenePayUElementQuery.PayUBankcardElement payUBankcardElement = (NetScenePayUElementQuery.PayUBankcardElement) C72574a.this.f232423c.getParcelable("key_card_element");
            this.f221419b.mo95362b(new C77487a(payUBankcardElement.f211136e, payUBankcardElement.f211137f, C72574a.this.f232423c.getString("key_bank_username"), C72574a.this.f232423c.getString("key_card_id"), C72574a.this.f232423c.getString("key_expire_data"), payUBankcardElement.f211138g, C72574a.this.f232423c.getString("key_cvv"), C72574a.this.f232423c.getString("key_pwd1")), true);
            return false;
        }

        /* renamed from: e */
        public boolean mo91272e(int i, int i2, String str, C117747y yVar) {
            if ((yVar instanceof C77487a) && i == 0 && i2 == 0) {
                C72574a.this.f232423c.putInt("key_errcode_payu", 0);
                C72574a aVar = C72574a.this;
                aVar.mo91259f(this.f221418a, aVar.f232423c);
            }
            if (yVar instanceof NetScenePayUElementQuery) {
                if (i == 0 && i2 == 0) {
                    NetScenePayUElementQuery netScenePayUElementQuery = (NetScenePayUElementQuery) yVar;
                    NetScenePayUElementQuery.PayUBankcardElement payUBankcardElement = netScenePayUElementQuery.f211134e;
                    if (Util.isNullOrNil(payUBankcardElement.f211135d)) {
                        payUBankcardElement.f211137f = MMApplicationContext.getContext().getString(C0966R.string.l4x);
                    }
                    C72574a.this.f232423c.putParcelable("key_card_element", netScenePayUElementQuery.f211134e);
                } else {
                    NetScenePayUElementQuery.PayUBankcardElement payUBankcardElement2 = new NetScenePayUElementQuery.PayUBankcardElement();
                    if (Util.isNullOrNil(str)) {
                        str = "err card element";
                    }
                    payUBankcardElement2.f211137f = str;
                    C72574a.this.f232423c.putParcelable("key_card_element", payUBankcardElement2);
                }
            }
            return false;
        }
    }

    /* renamed from: A */
    public C79148e mo91260A(Activity activity, Bundle bundle) {
        Log.m105918d("MicroMsg.PayUBindProcess", "hy: start process: PayUBindProcess");
        mo109103B(activity, WalletPayUCheckPwdUI.class, bundle);
        return this;
    }

    /* renamed from: c */
    public void mo91257c(Activity activity, int i) {
        mo96262m(activity);
    }

    /* renamed from: e */
    public String mo91258e() {
        return "PayUBindProcess";
    }

    /* renamed from: f */
    public void mo91259f(Activity activity, Bundle bundle) {
        Class<WalletPayUBankcardManageUI> cls = WalletPayUBankcardManageUI.class;
        if (this.f232423c.getInt("key_errcode_payu", -1) == 0) {
            C76912y0.makeText((Context) activity, (int) C0966R.string.l0y, 0).show();
            mo109111i(activity, cls, -1, false);
            return;
        }
        C76912y0.makeText((Context) activity, (int) C0966R.string.kso, 0).show();
        mo109111i(activity, cls, 0, false);
    }

    /* renamed from: o */
    public void mo91264o(Activity activity, int i, Bundle bundle) {
        if (activity instanceof WalletPayUCheckPwdUI) {
            mo109103B(activity, WalletPayUCardElementUI.class, bundle);
        }
    }

    /* renamed from: p */
    public C75282g mo91265p(MMActivity mMActivity, C75296i iVar) {
        if (mMActivity instanceof WalletPayUCheckPwdUI) {
            return new C72575a(this, mMActivity, iVar, this.f232423c);
        }
        if (mMActivity instanceof WalletPayUCardElementUI) {
            return new C72576b(mMActivity, iVar);
        }
        return null;
    }

    /* renamed from: t */
    public boolean mo91267t(Activity activity, Bundle bundle) {
        return false;
    }
}
