package com.tencent.p014mm.plugin.wallet.pwd.p122ui;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.WCPayHongBaoRefundClickReportStruct;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import f62.C75700k0;
import g62.C32330n;
import gc0.C20828a;
import hc0.C20937c;
import j20.C117292a;
import j53.C76387f;
import java.util.ArrayList;
import java.util.Iterator;
import kg3.C76577a;
import pj3.C47511g;
import qo3.C77426q;
import tc0.C77885p;
import te3.C64353ez2;

/* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletLuckyMoneyRefundWayUI */
public class WalletLuckyMoneyRefundWayUI extends MMPreference {

    /* renamed from: d */
    public C47511g f208864d;

    /* renamed from: e */
    public long f208865e;

    /* renamed from: f */
    public Preference f208866f;

    /* renamed from: g */
    public RadioBelowSummarytAndIconPreference f208867g;

    /* renamed from: h */
    public RadioBelowSummarytAndIconPreference f208868h;

    /* renamed from: i */
    public C76387f.C76388a f208869i;

    /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletLuckyMoneyRefundWayUI$a */
    public class C72002a implements View.OnClickListener {
        public C72002a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet/pwd/ui/WalletLuckyMoneyRefundWayUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i("MicroMsg.WalletLuckyMoneyRefundWayUI", "mOriginWay click!!");
            WalletLuckyMoneyRefundWayUI walletLuckyMoneyRefundWayUI = WalletLuckyMoneyRefundWayUI.this;
            C72060z zVar = new C72060z(walletLuckyMoneyRefundWayUI, walletLuckyMoneyRefundWayUI.f208869i);
            View inflate = View.inflate(walletLuckyMoneyRefundWayUI, C0966R.C0971layout.cg9, (ViewGroup) null);
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C0966R.C0970id.iwf);
            if (zVar.f209016b.f223683j.size() > 0) {
                Iterator<C76387f.C76389b> it = zVar.f209016b.f223683j.iterator();
                int i = 0;
                while (it.hasNext()) {
                    C76387f.C76389b next = it.next();
                    i++;
                    View inflate2 = View.inflate(zVar.f209015a, C0966R.C0971layout.cg_, (ViewGroup) null);
                    linearLayout.addView(inflate2);
                    if (i != 1) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (LinearLayout.LayoutParams) inflate2.getLayoutParams();
                        if (!(marginLayoutParams instanceof ViewGroup.MarginLayoutParams)) {
                            marginLayoutParams = new ViewGroup.MarginLayoutParams(marginLayoutParams);
                        }
                        marginLayoutParams.setMargins(0, C76577a.m92151b(zVar.f209015a, 24), 0, 0);
                        inflate2.setLayoutParams(marginLayoutParams);
                    }
                    ImageView imageView = (ImageView) inflate2.findViewById(C0966R.C0970id.f15);
                    TextView textView = (TextView) inflate2.findViewById(C0966R.C0970id.knx);
                    TextView textView2 = (TextView) inflate2.findViewById(C0966R.C0970id.k_c);
                    if (Util.isNullOrNil(next.f223688d)) {
                        C20828a.m22825b().mo32519h(next.f223687c, imageView, new C20937c.C20939b().mo32666a());
                    } else {
                        C20828a b = C20828a.m22825b();
                        String str = next.f223687c;
                        C20937c.C20939b bVar = new C20937c.C20939b();
                        bVar.f59352h = next.f223688d;
                        b.mo32519h(str, imageView, bVar.mo32666a());
                    }
                    textView.setText(next.f223685a);
                    textView2.setText(next.f223686b);
                }
            }
            C77426q qVar = new C77426q(zVar.f209015a);
            qVar.mo107606r(zVar.f209016b.f223682i);
            qVar.mo107592d(inflate);
            qVar.mo107602n(zVar.f209015a.getString(C0966R.string.kz4));
            qVar.mo107599k(zVar.f209015a.getResources().getColor(C0966R.color.ajx));
            qVar.mo107600l(new C72059y(zVar));
            qVar.mo107603o();
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/pwd/ui/WalletLuckyMoneyRefundWayUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletLuckyMoneyRefundWayUI$b */
    public class C72003b implements MenuItem.OnMenuItemClickListener {
        public C72003b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            WalletLuckyMoneyRefundWayUI.this.finish();
            return false;
        }
    }

    /* renamed from: H7 */
    public final void mo99218H7(int i) {
        WCPayHongBaoRefundClickReportStruct wCPayHongBaoRefundClickReportStruct = new WCPayHongBaoRefundClickReportStruct();
        wCPayHongBaoRefundClickReportStruct.f194666d = (long) (Util.isEqual(this.f208865e & 3, 2) ? 2 : 1);
        wCPayHongBaoRefundClickReportStruct.f194667e = (long) i;
        wCPayHongBaoRefundClickReportStruct.mo86054n();
    }

    public int getResourceId() {
        return -1;
    }

    public void initView() {
        this.f208866f = this.f208864d.mo72519a("refund_way_detail");
        this.f208867g = (RadioBelowSummarytAndIconPreference) this.f208864d.mo72519a("refund_way_detail_lq");
        this.f208868h = (RadioBelowSummarytAndIconPreference) this.f208864d.mo72519a("refund_way_detail_origin");
        Preference preference = this.f208866f;
        if (preference != null) {
            preference.mo69924H(this.f208869i.f223681h);
        }
        RadioBelowSummarytAndIconPreference radioBelowSummarytAndIconPreference = this.f208867g;
        if (radioBelowSummarytAndIconPreference != null) {
            radioBelowSummarytAndIconPreference.mo69924H(this.f208869i.f223677d);
            this.f208867g.mo7741E(this.f208869i.f223678e);
        }
        RadioBelowSummarytAndIconPreference radioBelowSummarytAndIconPreference2 = this.f208868h;
        if (radioBelowSummarytAndIconPreference2 != null) {
            radioBelowSummarytAndIconPreference2.mo69924H(this.f208869i.f223679f);
            this.f208868h.mo7741E(this.f208869i.f223680g);
            RadioBelowSummarytAndIconPreference radioBelowSummarytAndIconPreference3 = this.f208868h;
            C72002a aVar = new C72002a();
            radioBelowSummarytAndIconPreference3.f208734N = C0966R.C0969drawable.ca_;
            radioBelowSummarytAndIconPreference3.f208735P = aVar;
        }
        if (Util.isEqual(this.f208865e & 3, 2)) {
            this.f208867g.f121272H = C0966R.C0971layout.bev;
            this.f208868h.f121272H = C0966R.C0971layout.beu;
        } else {
            this.f208867g.f121272H = C0966R.C0971layout.beu;
            this.f208868h.f121272H = C0966R.C0971layout.bev;
        }
        setBackBtn(new C72003b());
    }

    public void onCreate(Bundle bundle) {
        fixStatusbar(true);
        super.onCreate(bundle);
        setActionbarColor(getActionbarColor());
        String stringExtra = getIntent().getStringExtra("key_hb_refund_config");
        if (!Util.isNullOrNil(stringExtra)) {
            C76387f.C76388a a = C76387f.C76388a.m91812a(stringExtra);
            this.f208869i = a;
            Log.m105919d("MicroMsg.WalletLuckyMoneyRefundWayUI", "mHbRefundConfig:%s", a);
        } else {
            Log.m105924i("MicroMsg.WalletLuckyMoneyRefundWayUI", "mHbRefundConfig == null");
            finish();
        }
        C47511g preferenceScreen = getPreferenceScreen();
        this.f208864d = preferenceScreen;
        preferenceScreen.mo72520b(C0966R.xml.f8988da);
        setMMTitle(this.f208869i.f223675b);
        C86709a0.m107528h();
        long longValue = ((Long) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_EXT_PAY_SETTING_LONG_SYNC, 0L)).longValue();
        this.f208865e = longValue;
        Log.m105925i("MicroMsg.WalletLuckyMoneyRefundWayUI", "origin extStatus: %s", Long.toBinaryString(longValue));
        initView();
    }

    public void onDestroy() {
        super.onDestroy();
        C64353ez2 ez22 = new C64353ez2();
        long j = this.f208865e;
        if ((((long) 1) & j) != 0) {
            ez22.f183059d = 1;
            ez22.f183060e = 2;
        } else {
            if ((((long) 2) & j) != 0) {
                ez22.f183059d = 2;
                ez22.f183060e = 1;
            }
        }
        Log.m105925i("MicroMsg.WalletLuckyMoneyRefundWayUI", "doSettingsOplog() extStatus: %s, set_bitmask: %s, clear_bitmask:%s", Long.toBinaryString(j), Long.toBinaryString(ez22.f183059d), Long.toBinaryString(ez22.f183060e));
        ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C32330n(218, ez22));
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        String str = preference.f121285r;
        Log.m105925i("MicroMsg.WalletLuckyMoneyRefundWayUI", "onPreferenceTreeClick() key:%s", str);
        if ("refund_way_detail_lq".equals(str)) {
            this.f208867g.f121272H = C0966R.C0971layout.beu;
            this.f208868h.f121272H = C0966R.C0971layout.bev;
            mo99218H7(1);
            this.f208865e = (this.f208865e | 1) & -3;
        } else if ("refund_way_detail_origin".equals(str)) {
            this.f208867g.f121272H = C0966R.C0971layout.bev;
            this.f208868h.f121272H = C0966R.C0971layout.beu;
            mo99218H7(2);
            this.f208865e = (this.f208865e & -2) | 2;
        }
        C86709a0.m107528h();
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_EXT_PAY_SETTING_LONG_SYNC, Long.valueOf(this.f208865e));
        this.f208864d.notifyDataSetChanged();
        finish();
        return true;
    }
}
