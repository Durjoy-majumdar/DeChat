package com.tencent.p014mm.plugin.wallet.bind.p120ui;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import b63.C67205s0;
import b73.C28273c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.weishi.C84909g;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import di3.C86312j;
import eb0.C75592q0;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import nj3.C76879j;
import ob0.C117747y;
import w43.C78513a;
import w43.C78514b;
import y43.C79029b0;
import yq3.C79143a;

/* renamed from: com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardDetailUI */
public class WalletBankcardDetailUI extends WalletBaseUI {

    /* renamed from: n */
    public static final /* synthetic */ int f208429n = 0;

    /* renamed from: d */
    public Bankcard f208430d;

    /* renamed from: e */
    public TextView f208431e;

    /* renamed from: f */
    public TextView f208432f;

    /* renamed from: g */
    public View f208433g;

    /* renamed from: h */
    public LinearLayout f208434h;

    /* renamed from: i */
    public LinearLayout f208435i;

    /* renamed from: j */
    public LinearLayout f208436j;

    /* renamed from: com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardDetailUI$e */
    public class C5758e implements C76879j.C11180n {
        public C5758e() {
        }

        /* renamed from: j */
        public void mo782j(int i) {
            if (i == 0) {
                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + WalletBankcardDetailUI.this.getString(C0966R.string.kml)));
                intent.addFlags(268435456);
                WalletBankcardDetailUI walletBankcardDetailUI = WalletBankcardDetailUI.this;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                WalletBankcardDetailUI walletBankcardDetailUI2 = walletBankcardDetailUI;
                C117292a.m165358d(walletBankcardDetailUI2, aVar.mo10232b(), "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardDetailUI$8", "onClick", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                walletBankcardDetailUI.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(walletBankcardDetailUI2, "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardDetailUI$8", "onClick", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardDetailUI$a */
    public class C71865a implements View.OnClickListener {
        public C71865a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardDetailUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WalletBankcardDetailUI walletBankcardDetailUI = WalletBankcardDetailUI.this;
            C75228t.m90219L(walletBankcardDetailUI, walletBankcardDetailUI.f208430d.field_repay_url, false);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardDetailUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardDetailUI$b */
    public class C71866b implements View.OnClickListener {
        public C71866b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardDetailUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WalletBankcardDetailUI.this.showDialog(0);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardDetailUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardDetailUI$c */
    public class C71867c implements View.OnClickListener {
        public C71867c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardDetailUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WalletBankcardDetailUI.this.showDialog(0);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardDetailUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardDetailUI$d */
    public class C71868d implements View.OnClickListener {
        public C71868d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardDetailUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WalletBankcardDetailUI walletBankcardDetailUI = WalletBankcardDetailUI.this;
            C79143a.m95765d(walletBankcardDetailUI, walletBankcardDetailUI.getInput());
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardDetailUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: H7 */
    public final void mo99036H7(boolean z) {
        if (C75592q0.m90763K() || z || ((C28273c) C86312j.m106911c(C28273c.class)).mo55895Jf().mo91349c()) {
            getInput().putBoolean("offline_pay", false);
            C79143a.m95765d(this, getInput());
            return;
        }
        C75228t.m90243e0(0, 1);
        C76879j.m92740k(this, C0966R.string.f361538kn1, -1, C0966R.string.f361537kn0, C0966R.string.f361539kn2, true, new C71887e(this), new C71888f(this));
    }

    /* renamed from: I7 */
    public void mo99037I7(boolean z) {
        if (z) {
            this.f208434h.setVisibility(8);
            this.f208435i.setVisibility(0);
            ((TextView) findViewById(C0966R.C0970id.let)).setOnClickListener(new C71866b());
            ((TextView) findViewById(C0966R.C0970id.lf5)).setText(C75228t.m90258m(this.f208430d.field_onceQuotaKind, (String) null));
            ((TextView) findViewById(C0966R.C0970id.lf6)).setText(C75228t.m90258m(this.f208430d.field_onceQuotaVirtual, (String) null));
            ((TextView) findViewById(C0966R.C0970id.f359544lf3)).setText(C75228t.m90258m(this.f208430d.field_dayQuotaKind, (String) null));
            ((TextView) findViewById(C0966R.C0970id.lf4)).setText(C75228t.m90258m(this.f208430d.field_dayQuotaVirtual, (String) null));
            if (!Util.isNullOrNil(this.f208430d.field_repay_url)) {
                this.f208432f.setVisibility(0);
                View view = this.f208433g;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardDetailUI", "setDomesticView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardDetailUI", "setDomesticView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            return;
        }
        this.f208434h.setVisibility(8);
        this.f208435i.setVisibility(8);
        this.f208436j.setVisibility(0);
    }

    /* renamed from: J7 */
    public void mo99038J7() {
        this.f208434h.setVisibility(0);
        this.f208435i.setVisibility(8);
        ((TextView) findViewById(C0966R.C0970id.lew)).setOnClickListener(new C71867c());
        ((TextView) findViewById(C0966R.C0970id.lf9)).setOnClickListener(new C71868d());
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cdv;
    }

    public void initView() {
        Bankcard bankcard = (Bankcard) getInput().getParcelable("key_bankcard");
        this.f208430d = bankcard;
        if (bankcard != null) {
            this.f208434h = (LinearLayout) findViewById(C0966R.C0970id.lev);
            this.f208435i = (LinearLayout) findViewById(C0966R.C0970id.f359543lf2);
            this.f208436j = (LinearLayout) findViewById(C0966R.C0970id.f359541lf0);
            this.f208432f = (TextView) findViewById(C0966R.C0970id.ley);
            View findViewById = findViewById(C0966R.C0970id.lf7);
            this.f208433g = findViewById;
            findViewById.setOnClickListener(new C71865a());
            Bankcard bankcard2 = this.f208430d;
            if (1 == bankcard2.field_bankcardState) {
                mo99038J7();
                return;
            }
            if (bankcard2.mo99390p2()) {
                mo99037I7(true);
                this.f208431e = (TextView) findViewById(C0966R.C0970id.leu);
                C67205s0 wx02 = C79029b0.vx0().wx0();
                String str = this.f208430d.field_bindSerial;
                wx02.getClass();
                this.f208431e.setVisibility(8);
            } else {
                mo99037I7(false);
                this.f208431e = (TextView) findViewById(C0966R.C0970id.lez);
                C67205s0 wx03 = C79029b0.vx0().wx0();
                String str2 = this.f208430d.field_bindSerial;
                wx03.getClass();
                this.f208431e.setVisibility(8);
            }
            addIconOptionMenu(0, C0966R.raw.icons_outlined_more, new C71885d(this));
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addSceneEndListener(C84909g.CTRL_INDEX);
        setMMTitle((int) C0966R.string.kmz);
        initView();
    }

    @Deprecated
    public Dialog onCreateDialog(int i) {
        C76879j.m92736g(getContext(), getString(C0966R.string.kmm), getResources().getStringArray(C0966R.array.f2610aw), "", new C5758e());
        return null;
    }

    public void onDestroy() {
        removeSceneEndListener(C84909g.CTRL_INDEX);
        super.onDestroy();
    }

    public void onResume() {
        super.onResume();
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (i == 0 && i2 == 0) {
            if (yVar instanceof C78514b) {
                TextView textView = this.f208431e;
                if (textView != null) {
                    textView.setVisibility(0);
                }
            } else if (yVar instanceof C78513a) {
                C78513a aVar = (C78513a) yVar;
                Log.m105920e("MicroMsg.WalletBankcardDetailUI", "NetSceneGetUnbindInfo succ and level = " + aVar.f229967d);
                int i3 = aVar.f229967d;
                if (i3 == 2 || i3 == 3) {
                    C76879j.m92713G(this, aVar.f229968e, (String) null, false, new C71889g(this, i3));
                } else {
                    mo99036H7(false);
                }
            }
        } else if (yVar instanceof C78513a) {
            Log.m105920e("MicroMsg.WalletBankcardDetailUI", "NetSceneGetUnbindInfo error");
            mo99036H7(false);
            return true;
        }
        return false;
    }
}
