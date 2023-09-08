package com.tencent.p014mm.plugin.offline;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import b63.C67210w;
import com.tencent.p014mm.autogen.events.OfflineBindCardEventEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.offline.p085ui.WalletOfflineEntranceUI;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletPwdConfirmUI;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletVerifyCodeUI;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import cr3.C75282g;
import cr3.C75296i;
import id2.C76307l;
import kd2.C76559f;
import ob0.C117747y;
import t53.C77866b;
import u53.C78131b;
import v53.C78342e0;
import v53.C78355w;
import yq3.C79143a;

/* renamed from: com.tencent.mm.plugin.offline.e */
public class C69949e extends C77866b {

    /* renamed from: com.tencent.mm.plugin.offline.e$a */
    public class C69950a extends C75282g {
        public C69950a(MMActivity mMActivity, C75296i iVar) {
            super(mMActivity, iVar);
        }

        /* renamed from: d */
        public boolean mo91271d(Object... objArr) {
            C67210w wVar = objArr[1];
            wVar.f192983a = "1";
            this.f221419b.mo105625d(new C78355w(wVar), true);
            return true;
        }

        /* renamed from: e */
        public boolean mo91272e(int i, int i2, String str, C117747y yVar) {
            if (i != 0 || i2 != 0) {
                return false;
            }
            if (yVar instanceof C78342e0) {
                if (((WalletBaseUI) this.f221418a).getInput() == null || ((WalletBaseUI) this.f221418a).getInput().getInt("key_bind_scene", -1) != 5 || C76559f.m92115k()) {
                    return false;
                }
                C69949e.m82387H(C69949e.this, this.f221418a);
                return true;
            } else if (!(yVar instanceof C76307l)) {
                return false;
            } else {
                MMActivity mMActivity = this.f221418a;
                C79143a.m95765d(mMActivity, ((WalletBaseUI) mMActivity).getInput());
                C76559f.m92126v(this.f221418a);
                return true;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.offline.e$b */
    public class C69951b extends C75282g {
        public C69951b(MMActivity mMActivity, C75296i iVar) {
            super(mMActivity, iVar);
        }

        /* renamed from: d */
        public boolean mo91271d(Object... objArr) {
            this.f221419b.mo105625d(new C78131b(objArr[0]), true);
            return true;
        }

        /* renamed from: e */
        public boolean mo91272e(int i, int i2, String str, C117747y yVar) {
            if (i != 0 || i2 != 0) {
                return false;
            }
            if (yVar instanceof C78342e0) {
                if (((WalletBaseUI) this.f221418a).getInput() != null && ((WalletBaseUI) this.f221418a).getInput().getInt("key_bind_scene", -1) == 5 && !C76559f.m92115k()) {
                    C69949e.m82387H(C69949e.this, this.f221418a);
                }
                return true;
            } else if (!(yVar instanceof C76307l)) {
                return false;
            } else {
                Bundle input = ((WalletBaseUI) this.f221418a).getInput();
                input.putBoolean("intent_bind_end", true);
                C79143a.m95765d(this.f221418a, input);
                C76559f.m92126v(this.f221418a);
                return true;
            }
        }
    }

    /* renamed from: H */
    public static void m82387H(C69949e eVar, MMActivity mMActivity) {
        eVar.getClass();
        WalletBaseUI walletBaseUI = (WalletBaseUI) mMActivity;
        String string = walletBaseUI.getInput().getString("key_pwd1");
        int i = walletBaseUI.getInput().getInt("offline_add_fee", 0);
        Bankcard d = C76559f.m92108d(true);
        if (d != null) {
            walletBaseUI.doSceneForceProgress(new C76307l(d, string, i));
        }
    }

    /* renamed from: c */
    public void mo91257c(Activity activity, int i) {
        super.mo91257c(activity, i);
    }

    /* renamed from: e */
    public String mo91258e() {
        return "OfflineBindCardRegProcess";
    }

    /* renamed from: f */
    public void mo91259f(Activity activity, Bundle bundle) {
        new OfflineBindCardEventEvent().publish();
        mo109110h(activity, WalletOfflineEntranceUI.class, -1, (Intent) null, true);
        activity.finish();
    }

    /* renamed from: p */
    public C75282g mo91265p(MMActivity mMActivity, C75296i iVar) {
        return mMActivity instanceof WalletVerifyCodeUI ? new C69950a(mMActivity, iVar) : mMActivity instanceof WalletPwdConfirmUI ? new C69951b(mMActivity, iVar) : super.mo91265p(mMActivity, iVar);
    }

    /* renamed from: t */
    public boolean mo91267t(Activity activity, Bundle bundle) {
        return super.mo91267t(activity, bundle);
    }
}
