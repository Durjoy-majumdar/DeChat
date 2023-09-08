package com.tencent.p014mm.plugin.wallet.pwd.p122ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import cr3.C75296i;
import f40.C86709a0;
import f62.C75700k0;
import g62.C32330n;
import java.util.regex.Pattern;
import kg3.C76577a;
import ob0.C11385n;
import ob0.C117747y;
import pj3.C47511g;
import qo3.C101218e0;
import tc0.C77885p;
import te3.C49490fz2;
import v53.C78348k0;

/* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletDelayTransferSettingUI */
public class WalletDelayTransferSettingUI extends MMPreference implements C11385n {

    /* renamed from: u */
    public static final /* synthetic */ int f208757u = 0;

    /* renamed from: d */
    public C47511g f208758d;

    /* renamed from: e */
    public long f208759e;

    /* renamed from: f */
    public WalletDelayTransferUISelectPreference f208760f;

    /* renamed from: g */
    public WalletDelayTransferUISelectPreference f208761g;

    /* renamed from: h */
    public WalletDelayTransferUISelectPreference f208762h;

    /* renamed from: i */
    public TextView f208763i;

    /* renamed from: j */
    public TextView f208764j;

    /* renamed from: n */
    public String f208765n;

    /* renamed from: o */
    public String f208766o;

    /* renamed from: p */
    public String f208767p;

    /* renamed from: q */
    public int f208768q = 0;

    /* renamed from: r */
    public String f208769r;

    /* renamed from: s */
    public int f208770s = 1;

    /* renamed from: t */
    public int f208771t = 0;

    /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletDelayTransferSettingUI$a */
    public class C71968a implements MenuItem.OnMenuItemClickListener {
        public C71968a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            C75228t.m90219L(WalletDelayTransferSettingUI.this.getContext(), WalletDelayTransferSettingUI.this.f208769r, false);
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletDelayTransferSettingUI$b */
    public class C71969b implements MenuItem.OnMenuItemClickListener {
        public C71969b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            WalletDelayTransferSettingUI.this.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletDelayTransferSettingUI$c */
    public class C71970c extends C7089c0 {
        public C71970c() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            WalletDelayTransferSettingUI walletDelayTransferSettingUI = WalletDelayTransferSettingUI.this;
            int i = WalletDelayTransferSettingUI.f208757u;
            String string = walletDelayTransferSettingUI.mo99188H7(16) ? walletDelayTransferSettingUI.getString(C0966R.string.krz) : walletDelayTransferSettingUI.mo99188H7(32) ? walletDelayTransferSettingUI.getString(C0966R.string.krx) : walletDelayTransferSettingUI.getString(C0966R.string.ks4);
            if (!TextUtils.isEmpty(string)) {
                C101218e0 e0Var = new C101218e0(walletDelayTransferSettingUI.getContext(), 1, 2);
                View inflate = View.inflate(walletDelayTransferSettingUI.getContext(), C0966R.C0971layout.ayz, (ViewGroup) null);
                TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.kpi);
                textView.setText(string);
                C85875k4.m106189j0(textView.getPaint(), 0.8f);
                e0Var.mo140672r(inflate);
                String str = walletDelayTransferSettingUI.f208766o;
                if (TextUtils.isEmpty(str)) {
                    str = walletDelayTransferSettingUI.getString(C0966R.string.f361559ks3);
                }
                LinearLayout linearLayout = new LinearLayout(walletDelayTransferSettingUI.getContext());
                linearLayout.setOrientation(1);
                TextView textView2 = new TextView(walletDelayTransferSettingUI.getContext());
                linearLayout.addView(textView2);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(textView2.getLayoutParams());
                layoutParams.width = -1;
                layoutParams.height = -2;
                layoutParams.topMargin = C76577a.m92155f(walletDelayTransferSettingUI.getContext(), C0966R.dimen.f3703bv);
                layoutParams.bottomMargin = C76577a.m92155f(walletDelayTransferSettingUI.getContext(), C0966R.dimen.f3736cp);
                textView2.setTextColor(walletDelayTransferSettingUI.getResources().getColor(C0966R.color.f3139gn));
                textView2.setTextSize(1, 15.0f);
                textView2.setText(str);
                textView2.setLayoutParams(layoutParams);
                e0Var.mo140663j(linearLayout);
                e0Var.mo140667n(walletDelayTransferSettingUI.getResources().getString(C0966R.string.f7926wf), walletDelayTransferSettingUI.getResources().getString(C0966R.string.a18));
                e0Var.mo140668o(0);
                C72027a aVar = new C72027a(walletDelayTransferSettingUI, e0Var);
                C72029b bVar = new C72029b(walletDelayTransferSettingUI, e0Var);
                e0Var.f296373D = aVar;
                e0Var.f296374E = bVar;
                e0Var.mo140655A();
            }
        }
    }

    /* renamed from: H7 */
    public final boolean mo99188H7(int i) {
        return (this.f208759e & ((long) i)) != 0;
    }

    /* renamed from: I7 */
    public final void mo99189I7() {
        if (this.f208768q != 1 || Util.isNullOrNil(this.f208769r)) {
            removeAllOptionMenu();
        } else {
            addIconOptionMenu(0, C0966R.C0969drawable.cf_, new C71968a());
        }
    }

    /* renamed from: J7 */
    public final void mo99190J7(boolean z) {
        if (mo99188H7(16)) {
            this.f208760f.f21826K = false;
            this.f208761g.f21826K = true;
            this.f208762h.f21826K = false;
            if (!z) {
                this.f208771t = 2;
                C115669n.INSTANCE.mo160131h(23319, Integer.valueOf(this.f208770s), Integer.valueOf(this.f208771t), 0);
            }
        } else if (mo99188H7(32)) {
            this.f208760f.f21826K = false;
            this.f208761g.f21826K = false;
            this.f208762h.f21826K = true;
            if (!z) {
                this.f208771t = 3;
                C115669n.INSTANCE.mo160131h(23319, Integer.valueOf(this.f208770s), Integer.valueOf(this.f208771t), 0);
            }
        } else {
            this.f208760f.f21826K = true;
            this.f208761g.f21826K = false;
            this.f208762h.f21826K = false;
            if (!z) {
                this.f208771t = 1;
                C115669n.INSTANCE.mo160131h(23319, Integer.valueOf(this.f208770s), Integer.valueOf(this.f208771t), 0);
            }
        }
    }

    public View getBottomView() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setPadding(0, 0, 0, C76577a.m92155f(getContext(), C0966R.dimen.f3709c2));
        linearLayout.setOrientation(1);
        Button button = new Button(getContext());
        linearLayout.addView(button);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(button.getLayoutParams());
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.gravity = 17;
        button.setTextColor(getResources().getColor(C0966R.color.f3257l0));
        button.setBackground(getDrawable(C0966R.C0969drawable.f4653j6));
        button.setTextSize(1, 17.0f);
        button.setPadding(C76577a.m92155f(getContext(), C0966R.dimen.f3891i2), 0, C76577a.m92155f(getContext(), C0966R.dimen.f3891i2), 0);
        button.setMinHeight(C76577a.m92155f(getContext(), C0966R.dimen.f3910in));
        button.setMinWidth(C76577a.m92155f(getContext(), C0966R.dimen.f3912ip));
        button.setText(getString(C0966R.string.f361533km0));
        button.setGravity(17);
        button.setLayoutParams(layoutParams);
        button.setOnClickListener(new C71970c());
        return linearLayout;
    }

    public int getHeaderResourceId() {
        return C0966R.C0971layout.cel;
    }

    public int getResourceId() {
        return -1;
    }

    public void initView() {
        this.f208760f = (WalletDelayTransferUISelectPreference) this.f208758d.mo72519a("wallet_transfer_realtime");
        this.f208761g = (WalletDelayTransferUISelectPreference) this.f208758d.mo72519a("wallet_transfer_2h");
        this.f208762h = (WalletDelayTransferUISelectPreference) this.f208758d.mo72519a("wallet_transfer_24h");
        TextView textView = (TextView) findViewById(C0966R.C0970id.f357841c13);
        this.f208763i = textView;
        C85875k4.m106189j0(textView.getPaint(), 0.8f);
        this.f208764j = (TextView) findViewById(C0966R.C0970id.f357840c12);
        this.f208760f.mo69921C(8);
        this.f208761g.mo69921C(8);
        this.f208762h.mo69921C(8);
        mo99190J7(false);
        setBackBtn(new C71969b());
    }

    public void onCreate(Bundle bundle) {
        boolean z;
        fixStatusbar(true);
        super.onCreate(bundle);
        setMMTitle("");
        setActionbarColor(getContext().getResources().getColor(C0966R.color.f2929c));
        setBackGroundColorResource(C0966R.color.f2929c);
        hideActionbarLine();
        this.f208758d = getPreferenceScreen();
        this.f208770s = getIntent().getIntExtra("key_scene", 1);
        if (getListView() != null) {
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3749d0);
            getListView().setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
            getListView().setBackgroundColor(getContext().getResources().getColor(C0966R.color.f2929c));
        }
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(C0966R.C0970id.gv5);
        if (relativeLayout != null) {
            relativeLayout.setBackgroundColor(getContext().getResources().getColor(C0966R.color.f2929c));
        }
        this.f208758d.mo72520b(C0966R.xml.f8986d9);
        C86709a0.m107528h();
        this.f208759e = ((Long) C86709a0.m107535s().mo121142i().mo119684e(147457, 0L)).longValue();
        initView();
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(385, this);
        C86709a0.m107528h();
        this.f208765n = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_DELAY_TRANSFER_REMIND_WORDING_STRING, "");
        C86709a0.m107528h();
        this.f208766o = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_DELAY_TRANSFER_HALF_PAGE_WORDING_STRING, "");
        C86709a0.m107528h();
        this.f208767p = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_DELAY_TRANSFER_SWITCH_WORDING_STRING, "");
        C86709a0.m107528h();
        this.f208769r = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_DELAY_TRANSFER_DESC_URL_STRING, "");
        C86709a0.m107528h();
        this.f208768q = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_DELAY_TRANSFER_DESC_URL_FLAG_INT, 0)).intValue();
        if (Util.isNullOrNil(this.f208765n) || Util.isNullOrNil(this.f208767p) || Util.isNullOrNil(this.f208769r) || Util.isNullOrNil(this.f208766o)) {
            z = C78348k0.m94629j1(true, (C75296i) null, (C78348k0.C78349a) null);
        } else {
            this.f208764j.setText(this.f208765n);
            this.f208763i.setText(this.f208767p);
            mo99189I7();
            z = C78348k0.m94629j1(false, (C75296i) null, (C78348k0.C78349a) null);
        }
        Pattern pattern = C75228t.f221346a;
        if (!z) {
            Log.m105924i("MicroMsg.WalletDelayTransferSettingUI", "no need do scene, remove listener");
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123470p(385, this);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        int i = 1;
        Log.m105925i("MicroMsg.WalletDelayTransferSettingUI", "do oplog, %s", Long.valueOf(this.f208759e));
        if (!mo99188H7(16)) {
            i = mo99188H7(32) ? 2 : 0;
        }
        C49490fz2 fz22 = new C49490fz2();
        fz22.f133752d = i;
        ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C32330n(205, fz22));
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(385, this);
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        String str = preference.f121285r;
        if ("wallet_transfer_realtime".equals(str)) {
            this.f208759e = -17 & this.f208759e & -33;
        } else if ("wallet_transfer_2h".equals(str)) {
            this.f208759e = (this.f208759e & -33) | 16;
        } else if ("wallet_transfer_24h".equals(str)) {
            this.f208759e = (this.f208759e & -17) | 32;
        }
        mo99190J7(true);
        gVar.notifyDataSetChanged();
        return true;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar instanceof C78348k0) {
            if (i == 0 && i2 == 0) {
                C78348k0 k0Var = (C78348k0) yVar;
                String str2 = k0Var.f229587f;
                this.f208765n = str2;
                this.f208767p = k0Var.f229586e;
                this.f208769r = k0Var.f229590i;
                this.f208768q = k0Var.f229591j;
                this.f208766o = k0Var.f229588g;
                if (!Util.isNullOrNil(str2)) {
                    this.f208764j.setText(this.f208765n);
                } else {
                    Log.m105924i("MicroMsg.WalletDelayTransferSettingUI", "use hardcode wording");
                    this.f208764j.setText(C0966R.string.ks6);
                }
                if (!Util.isNullOrNil(this.f208767p)) {
                    this.f208763i.setText(this.f208767p);
                } else {
                    Log.m105924i("MicroMsg.WalletDelayTransferSettingUI", "use hardcode title wording");
                    this.f208763i.setText(C0966R.string.l1v);
                }
                mo99189I7();
            } else {
                Log.m105924i("MicroMsg.WalletDelayTransferSettingUI", "net error, use hardcode wording");
                this.f208764j.setText(C0966R.string.ks6);
                this.f208763i.setText(C0966R.string.l1v);
            }
            this.f208758d.notifyDataSetChanged();
            return;
        }
        Log.m105924i("MicroMsg.WalletDelayTransferSettingUI", "other scene");
    }
}
