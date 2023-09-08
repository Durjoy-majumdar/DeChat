package com.tencent.p014mm.plugin.wallet.balance.p119ui;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import b63.C67205s0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.WalletGetUserInfoEvent;
import com.tencent.p014mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.plugin.wallet_core.model.Orders;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import di3.C86312j;
import h81.C32735h;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C88989a;
import ob0.C117747y;
import u43.C78126c;
import y43.C79029b0;
import yq3.C79148e;

@C88989a(19)
/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceResultUI */
public class WalletBalanceResultUI extends WalletBaseUI {

    /* renamed from: h */
    public static final /* synthetic */ int f207824h = 0;

    /* renamed from: d */
    public TextView f207825d;

    /* renamed from: e */
    public Button f207826e;

    /* renamed from: f */
    public Orders f207827f;

    /* renamed from: g */
    public Bankcard f207828g;

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceResultUI$a */
    public class C71690a implements View.OnClickListener {
        public C71690a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceResultUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i("MicroMsg.WalletBalanceResultUI", "click finish btn");
            WalletBalanceResultUI.m84176H7(WalletBalanceResultUI.this);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceResultUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceResultUI$b */
    public class C71691b implements MenuItem.OnMenuItemClickListener {
        public C71691b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            WalletBalanceResultUI.m84176H7(WalletBalanceResultUI.this);
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceResultUI$c */
    public class C71692c implements Runnable {
        public C71692c(WalletBalanceResultUI walletBalanceResultUI) {
        }

        public void run() {
            Log.m105924i("MicroMsg.WalletBalanceResultUI", "update user info succ, end process");
        }
    }

    /* renamed from: H7 */
    public static void m84176H7(WalletBalanceResultUI walletBalanceResultUI) {
        if (walletBalanceResultUI.getInput().containsKey("key_realname_guide_helper")) {
            RealnameGuideHelper realnameGuideHelper = (RealnameGuideHelper) walletBalanceResultUI.getInput().getParcelable("key_realname_guide_helper");
            if (realnameGuideHelper != null) {
                Bundle bundle = new Bundle();
                bundle.putString("realname_verify_process_jump_activity", ".balance.ui.WalletBalanceResultUI");
                bundle.putString("realname_verify_process_jump_plugin", "wallet");
                realnameGuideHelper.mo99370a(walletBalanceResultUI, bundle, new C71857v(walletBalanceResultUI), (C79148e.C79149a) null);
                walletBalanceResultUI.getInput().remove("key_realname_guide_helper");
                return;
            }
            return;
        }
        walletBalanceResultUI.mo98869I7();
    }

    /* renamed from: I7 */
    public final void mo98869I7() {
        int i = getInput().getInt("key_pay_flag", 0);
        String string = getInput().getString("key_pwd1");
        String string2 = getInput().getString("key_verify_code");
        PayInfo payInfo = (PayInfo) getInput().getParcelable("key_pay_info");
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_bindcard_after_save_balance, 1);
        if (payInfo == null || Qe != 1) {
            next();
        } else if (this.f207828g == null) {
            Log.m105919d("MicroMsg.WalletBalanceResultUI", "flag: %s, verifycode: %s, reqkey: %s, payScene: %s, ignoreBind: %s", Integer.valueOf(i), string2, payInfo.f212592j, Integer.valueOf(payInfo.f212587e), "0");
            doSceneProgress(new C78126c(i, string, string2, payInfo.f212592j, payInfo.f212587e, "0"));
        } else {
            Log.m105919d("MicroMsg.WalletBalanceResultUI", "flag: %s, verifycode: %s, reqkey: %s, payScene: %s, ignoreBind: %s", Integer.valueOf(i), string2, payInfo.f212592j, Integer.valueOf(payInfo.f212587e), "1");
            doSceneProgress(new C78126c(i, string, string2, payInfo.f212592j, payInfo.f212587e, "1"), false);
            next();
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cdo;
    }

    public void initView() {
        this.f207825d = (TextView) findViewById(C0966R.C0970id.lkq);
        this.f207826e = (Button) findViewById(C0966R.C0970id.lkp);
        Orders orders = this.f207827f;
        if (orders == null) {
            finish();
            return;
        }
        this.f207825d.setText(C75228t.m90258m(orders.f209566h, orders.f209568j));
        this.f207826e.setOnClickListener(new C71690a());
        setBackBtn(new C71691b());
        this.f207828g = (Bankcard) getInput().getParcelable("key_bankcard");
    }

    public void next() {
        if (!getNetController().mo91271d(this.f207827f)) {
            super.next();
        }
    }

    public void onBackPressed() {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f207827f = (Orders) getInput().getParcelable("key_orders");
        initView();
        setMMTitle("");
        setActionbarColor(getResources().getColor(C0966R.color.al6));
        hideActionbarLine();
        showHomeBtn(false);
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (!(yVar instanceof C78126c)) {
            return false;
        }
        if (!((C78126c) yVar).f228936d) {
            return true;
        }
        if (i == 0 && i2 == 0) {
            C67205s0 wx02 = C79029b0.vx0().wx0();
            wx02.getClass();
            wx02.f192962o = Util.nowSecond();
            WalletGetUserInfoEvent walletGetUserInfoEvent = new WalletGetUserInfoEvent();
            walletGetUserInfoEvent.f194038d.f194040a = 15;
            walletGetUserInfoEvent.callback = new C71692c(this);
            walletGetUserInfoEvent.publish();
        }
        next();
        return true;
    }
}
