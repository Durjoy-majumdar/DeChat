package com.tencent.p014mm.plugin.wallet.balance.model.lqt;

import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C71617b1;
import com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt.WalletLqtCheckPwdInputDialogUI;
import com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt.WalletLqtSaveFetchUI;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import f40.C86709a0;
import hp3.C87581a;
import java.util.HashMap;
import java.util.Map;
import lp3.C46888b;
import lp3.C88631d;
import lp3.C88633e;
import lp3.C88643g;
import ob0.C89132b;
import te3.C78002u53;
import te3.C78005vk3;
import te3.C78015xr2;
import te3.C78016y53;

/* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.d1 */
public class C71624d1 {

    /* renamed from: a */
    public C71617b1 f207602a = null;

    /* renamed from: b */
    public WalletBaseUI f207603b = null;

    /* renamed from: c */
    public String f207604c;

    /* renamed from: d */
    public String f207605d;

    /* renamed from: e */
    public int f207606e;

    /* renamed from: f */
    public int f207607f;

    /* renamed from: g */
    public String f207608g;

    /* renamed from: h */
    public int f207609h;

    /* renamed from: i */
    public Bankcard f207610i;

    /* renamed from: j */
    public int f207611j;

    /* renamed from: k */
    public int f207612k;

    /* renamed from: l */
    public C46888b f207613l;

    /* renamed from: m */
    public Map<String, String> f207614m = new HashMap();

    /* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.d1$a */
    public class C71625a implements C87581a<Void, C89132b.C89134c<C78002u53>> {

        /* renamed from: a */
        public final /* synthetic */ int f207615a;

        public C71625a(int i) {
            this.f207615a = i;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            Log.m105925i("MicroMsg.LqtSaveFetchLogic", "CgiLqtOnClickPurchase end, errType: %s, errCode: %s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
            if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                C71648n1.m84125c(((C78002u53) cVar.f256796d).f228281B);
                C71654w wVar = C71654w.f207659q;
                wVar.mo98822e(((C78002u53) cVar.f256796d).f228284f, true, false, "");
                wVar.mo98823f((C78002u53) cVar.f256796d, this.f207615a);
            }
            C46888b bVar = C71624d1.this.f207613l;
            if (bVar == null) {
                return null;
            }
            bVar.resume();
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.d1$b */
    public class C71626b implements C87581a<Void, C89132b.C89134c<C78016y53>> {
        public C71626b() {
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            Log.m105925i("MicroMsg.LqtSaveFetchLogic", "CgiLqtOnClickRedeem end, errType: %s, errCode: %s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
            if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                C71648n1.m84125c(((C78016y53) cVar.f256796d).f228550C);
                C71647n0.m84120b().mo98816c((C78016y53) cVar.f256796d);
                C71654w.f207659q.mo98822e(((C78016y53) cVar.f256796d).f228557j, false, false, "");
            }
            C46888b bVar = C71624d1.this.f207613l;
            if (bVar == null) {
                return null;
            }
            bVar.resume();
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.d1$c */
    public class C71627c implements C88631d.C76721a {
        public C71627c() {
        }

        /* renamed from: a */
        public void mo1720a(Object obj) {
            Log.m105925i("MicroMsg.LqtSaveFetchLogic", "doQueryPurchaseResult interrupt: %s", obj);
            C71624d1.this.f207603b.hideLoading();
            WalletBaseUI walletBaseUI = C71624d1.this.f207603b;
            if (walletBaseUI instanceof WalletLqtSaveFetchUI) {
                ((WalletLqtSaveFetchUI) walletBaseUI).f208172S0 = false;
                MMHandlerThread.postToMainThreadDelayed(((WalletLqtSaveFetchUI) walletBaseUI).f208202j1, 300);
            }
            C46888b bVar = C71624d1.this.f207613l;
            if (bVar != null) {
                bVar.mo72091a(obj);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.d1$d */
    public class C71628d implements C87581a<Void, C78005vk3> {

        /* renamed from: a */
        public final /* synthetic */ String f207619a;

        public C71628d(String str) {
            this.f207619a = str;
        }

        public Object call(Object obj) {
            C78005vk3 vk32 = (C78005vk3) obj;
            Log.m105925i("MicroMsg.LqtSaveFetchLogic", "doQueryPurchaseResult finish: %s", vk32);
            C71624d1.this.f207603b.hideLoading();
            C71624d1.this.mo98811c(this.f207619a);
            C46888b bVar = C71624d1.this.f207613l;
            if (bVar == null) {
                return null;
            }
            bVar.mo72093c(vk32);
            return null;
        }
    }

    public C71624d1(C71615a1 a1Var, C71617b1 b1Var, WalletBaseUI walletBaseUI, int i, int i2) {
        this.f207602a = b1Var;
        this.f207603b = walletBaseUI;
        this.f207611j = i;
    }

    /* renamed from: a */
    public void mo98809a() {
        Log.m105925i("MicroMsg.LqtSaveFetchLogic", "%s pre redeem finish get redeemListId: %s", Integer.valueOf(hashCode()), this.f207608g);
        Intent intent = new Intent(this.f207603b, WalletLqtCheckPwdInputDialogUI.class);
        intent.putExtra("lqt_fetch_pwd_title", this.f207603b.getString(C0966R.string.kx4));
        intent.putExtra("lqt_fetch_pwd_money", (((double) this.f207607f) / 100.0d) + "");
        intent.putExtra("lqt_redeem_listid", this.f207608g);
        this.f207603b.startActivityForResult(intent, 456);
    }

    /* renamed from: b */
    public final void mo98810b(String str, int i) {
        Log.m105924i("MicroMsg.LqtSaveFetchLogic", "doQueryPurchaseResult");
        this.f207603b.showLoading(false);
        String stringExtra = this.f207603b.getIntent().getStringExtra("operate_id");
        C71617b1.C71619b bVar = this.f207602a.f207591c;
        String str2 = this.f207604c;
        String str3 = this.f207605d;
        int i2 = this.f207606e;
        int i3 = this.f207609h;
        int i4 = this.f207612k;
        bVar.getClass();
        ((C88633e) C88643g.m110552j(str2, str3, Integer.valueOf(i2), Integer.valueOf(i3), stringExtra, Integer.valueOf(i4), Integer.valueOf(i))).mo123061d(bVar).mo123062e(new C71628d(str)).mo123065b(new C71627c());
    }

    /* renamed from: c */
    public void mo98811c(String str) {
        if (this.f207611j == 1) {
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_LQT_DEFAULTCARD_SAVE_STRING_SYNC, str);
        } else {
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_LQT_DEFAULTCARD_FETCH_STRING_SYNC, str);
        }
        C71654w wVar = C71654w.f207659q;
        boolean z = false;
        boolean z2 = this.f207611j == 1;
        wVar.mo98818a(z2);
        C78015xr2 xr22 = z2 ? wVar.f207662a : wVar.f207663b;
        if (xr22 != null) {
            Log.m105925i("MicroMsg.LqtBindQueryInfoCache", "isReqAgainAfterDeal: %s", Boolean.valueOf(xr22.f228540i));
            z = xr22.f228540i;
        }
        if (z) {
            Log.m105924i("MicroMsg.LqtSaveFetchLogic", "saveOrfetchDone, req again after deal");
            mo98812d(this.f207611j, this.f207609h, 1);
        }
    }

    /* renamed from: d */
    public void mo98812d(int i, int i2, int i3) {
        Log.m105925i("MicroMsg.LqtSaveFetchLogic", "updateBindBankcard, mode: %s, accountType: %s", Integer.valueOf(i), Integer.valueOf(i2));
        C46888b b = C88643g.m110544b();
        this.f207613l = b;
        b.mo72092b();
        if (i == 1) {
            new C43301j(i2, i3).mo9225i().mo123062e(new C71625a(i3));
        } else {
            new C43303k(i2, i3).mo9225i().mo123062e(new C71626b());
        }
    }
}
