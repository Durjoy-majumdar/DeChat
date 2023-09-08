package com.tencent.p014mm.plugin.honey_pay.p063ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.OfflineUpdateCardListEvent;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C45121z0;
import com.tencent.p014mm.wallet_core.model.C75113f0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletTextView;
import hi3.C87515a;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import ob0.C117747y;
import q02.C47747k;
import t02.C48527c;
import te3.C50843pk3;
import te3.eh4;

/* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardBackUI */
public class HoneyPayCardBackUI extends HoneyPayBaseUI {

    /* renamed from: f */
    public CdnImageView f114715f;

    /* renamed from: g */
    public WalletTextView f114716g;

    /* renamed from: h */
    public TextView f114717h;

    /* renamed from: i */
    public TextView f114718i;

    /* renamed from: j */
    public TextView f114719j;

    /* renamed from: n */
    public String f114720n;

    /* renamed from: o */
    public eh4 f114721o;

    /* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardBackUI$a */
    public class C42410a implements MenuItem.OnMenuItemClickListener {
        public C42410a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            HoneyPayCardBackUI.this.hideVKB();
            HoneyPayCardBackUI.this.hideTenpayKB();
            HoneyPayCardBackUI.this.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardBackUI$b */
    public class C42411b implements C75113f0.C75114a {

        /* renamed from: a */
        public final /* synthetic */ C47747k f114723a;

        public C42411b(C47747k kVar) {
            this.f114723a = kVar;
        }

        /* renamed from: a */
        public void mo66496a(int i, int i2, String str, C117747y yVar) {
            HoneyPayCardBackUI honeyPayCardBackUI = HoneyPayCardBackUI.this;
            C50843pk3 pk32 = this.f114723a.f128264r;
            honeyPayCardBackUI.f114721o = pk32.f139811j;
            honeyPayCardBackUI.f114715f.setImageDrawable(C87515a.m108835e(honeyPayCardBackUI.getResources(), C0966R.raw.honey_pay_bank_logo, 0.0f));
            if (!Util.isNullOrNil(pk32.f139814p)) {
                honeyPayCardBackUI.f114715f.mo100288c(pk32.f139814p, 0, 0, C0966R.raw.honey_pay_bank_logo);
            }
            honeyPayCardBackUI.f114718i.setText(pk32.f139812n);
            C75228t.m90249h0(honeyPayCardBackUI.f114719j, pk32.f139807f, 10);
            honeyPayCardBackUI.f114716g.setText(C48527c.m53905a(pk32.f139808g));
            honeyPayCardBackUI.f114717h.setText(honeyPayCardBackUI.getString(C0966R.string.fks, new Object[]{C45121z0.m49962b() + C48527c.m53905a(pk32.f139809h)}));
            C48527c.m53912h(honeyPayCardBackUI, pk32.f139810i, honeyPayCardBackUI.f114720n, 1, honeyPayCardBackUI.f114721o);
            View findViewById = honeyPayCardBackUI.findViewById(C0966R.C0970id.exn);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardBackUI", "updateView", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayCardDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardBackUI", "updateView", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayCardDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.azc;
    }

    public void initView() {
        this.f114715f = (CdnImageView) findViewById(C0966R.C0970id.exl);
        this.f114716g = (WalletTextView) findViewById(C0966R.C0970id.exp);
        this.f114717h = (TextView) findViewById(C0966R.C0970id.exq);
        this.f114718i = (TextView) findViewById(C0966R.C0970id.exm);
        this.f114719j = (TextView) findViewById(C0966R.C0970id.exo);
        this.f114716g.mo105015b();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1 && i2 == -1) {
            Log.m105924i(this.f114712d, "unbind success");
            OfflineUpdateCardListEvent offlineUpdateCardListEvent = new OfflineUpdateCardListEvent();
            OfflineUpdateCardListEvent.C28784a aVar = offlineUpdateCardListEvent.f78882d;
            aVar.f78883a = 2;
            aVar.f78884b = this.f114720n;
            offlineUpdateCardListEvent.publish();
            finish();
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        this.f114713e = C0966R.color.f3567xy;
        fixStatusbar(true);
        super.onCreate(bundle);
        setMMTitle("");
        setBackBtn(new C42410a());
        addSceneEndListener(2851);
        this.f114720n = getIntent().getStringExtra("key_card_no");
        initView();
        Log.m105925i(this.f114712d, "do qry card detail: %s", this.f114720n);
        C47747k kVar = new C47747k(this.f114720n);
        kVar.mo104821m1(this);
        doSceneProgress(kVar, true);
    }

    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(2851);
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (!(yVar instanceof C47747k)) {
            return true;
        }
        C47747k kVar = (C47747k) yVar;
        kVar.mo104823q1(new C42411b(kVar));
        return true;
    }
}
