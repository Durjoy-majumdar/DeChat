package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.base.preference.SummaryBelowPreference;
import com.tencent.p014mm.plugin.account.p024ui.RegAffiliateAccountUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.protocal.GeneralControlWrapper;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C75592q0;
import j20.C117292a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import ke3.C88144b;
import nc0.C76850a;
import nj3.C76879j;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89144l0;
import ob0.l0$$e;
import p156gj.C87203t;
import pj3.C47511g;
import qg0.C12215a;
import qo3.C89779i0;
import tc2.C118418g;
import te3.C51018qv3;
import te3.C51394tg3;
import te3.C51544ug3;
import te3.lx4;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsSelectCreateAccount */
public class SettingsSelectCreateAccount extends MMPreference {

    /* renamed from: d */
    public C89779i0 f20921d;

    /* renamed from: e */
    public int f20922e = 0;

    /* renamed from: f */
    public String f20923f = null;

    /* renamed from: g */
    public String f20924g = null;

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsSelectCreateAccount$a */
    public class C5309a implements View.OnClickListener {
        public C5309a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/SettingsSelectCreateAccount$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            intent.putExtra("rawUrl", "https://support.weixin.qq.com/cgi-bin/mmsupport-bin/newreadtemplate?t=signup/secondaryid_faq");
            intent.putExtra("showShare", false);
            intent.putExtra("show_bottom", false);
            intent.putExtra("needRedirect", false);
            intent.putExtra("neverGetA8Key", true);
            intent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.f121047h);
            intent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.f121044e);
            C88144b.m109791i(SettingsSelectCreateAccount.this.getContext(), "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, (Bundle) null);
            C115669n.INSTANCE.mo160131h(23530, SettingsSelectCreateAccount.this.f20924g, C87203t.m108273i(), 0, 2, 1001, 10103, null, Integer.valueOf(SettingsSelectCreateAccount.this.f20922e));
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsSelectCreateAccount$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsSelectCreateAccount$b */
    public class C5310b implements MenuItem.OnMenuItemClickListener {
        public C5310b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SettingsSelectCreateAccount.this.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsSelectCreateAccount$c */
    public class C5311c implements l0$$e {
        public C5311c() {
        }

        /* renamed from: a */
        public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
            if (i == 0 && i2 == 0) {
                Intent intent = new Intent();
                intent.putExtra("rawUrl", ((C51544ug3) cVar.f127056b.f127083a).f142851d);
                intent.putExtra("showShare", false);
                intent.putExtra("show_bottom", false);
                C88144b.m109795m(SettingsSelectCreateAccount.this.getContext(), "webview", ".ui.tools.WebViewUI", intent, 702);
            }
            return 0;
        }
    }

    /* renamed from: H7 */
    public final void mo6284H7() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 5298;
        bVar.f127068c = "/cgi-bin/micromsg-bin/precheckaffiliatedacct";
        C51394tg3 tg32 = new C51394tg3();
        tg32.f142214e = this.f20924g;
        C118418g gVar = C118418g.INSTANCE;
        byte[] hd = gVar.mo175821hd();
        Object[] objArr = new Object[1];
        objArr[0] = Integer.valueOf(hd != null ? hd.length : -1);
        Log.m105919d("MicroMsg.SettingsSelectCreateAccount", "[tomys] ccd set on auto auth, len: %s", objArr);
        lx4 lx4 = new lx4();
        C51018qv3 qv32 = new C51018qv3();
        qv32.mo73350k(hd);
        lx4.f354117f = qv32;
        C51018qv3 qv33 = new C51018qv3();
        qv33.mo73350k(gVar.b90());
        lx4.f354121j = qv33;
        Log.m105919d("MicroMsg.SettingsSelectCreateAccount", "[debug] devtok on auto auth, len: %s", Integer.valueOf(qv33.f140572d));
        C51018qv3 qv34 = new C51018qv3();
        qv34.mo73350k(lx4.toByteArray());
        tg32.f142213d = qv34;
        tg32.f142215f = this.f20922e;
        bVar.f127066a = tg32;
        bVar.f127067b = new C51544ug3();
        C89144l0.m111429e(bVar.mo72403a(), new C5311c(), false);
    }

    public View getBottomView() {
        LinearLayout linearLayout = (LinearLayout) C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.bwy, (ViewGroup) null);
        linearLayout.findViewById(C0966R.C0970id.f359177jf3).setOnClickListener(new C5309a());
        return linearLayout;
    }

    public int getHeaderResourceId() {
        return C0966R.C0971layout.bwz;
    }

    public int getResourceId() {
        return this.f20922e == 0 ? C0966R.C0971layout.d5j : C0966R.C0971layout.bxw;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Bundle bundleExtra;
        super.onActivityResult(i, i2, intent);
        if (i == 702) {
            if (intent != null) {
                Map map = (Map) intent.getBundleExtra("result_data").getSerializable("next_params");
                if (map != null) {
                    this.f20923f = (String) map.get("ticket");
                }
                if (this.f20923f != null) {
                    C12215a.m11778c(this, getString(C0966R.string.g5g, new Object[]{LocaleUtil.getApplicationLanguage(), C76850a.m92633e(this, "CN", getString(C0966R.string.bvs)), "reg", 1, 0}), 703, false);
                    C115669n.INSTANCE.mo160131h(23530, this.f20924g, C87203t.m108273i(), 0, 1, 1002, 0, null, Integer.valueOf(this.f20922e));
                }
            }
            C89779i0 i0Var = this.f20921d;
            if (i0Var != null && i0Var.isShowing()) {
                this.f20921d.dismiss();
            }
        } else if (i == 703) {
            if (!(intent == null || (bundleExtra = intent.getBundleExtra("result_data")) == null || !bundleExtra.getString("go_next", "").equals("agree_privacy"))) {
                Intent intent2 = new Intent(this, RegAffiliateAccountUI.class);
                intent2.putExtra("RegTicket", this.f20923f);
                intent2.putExtra("sessionID", this.f20924g);
                intent2.putExtra("RegScene", this.f20922e);
                startActivityForResult(intent2, 704);
            }
            C89779i0 i0Var2 = this.f20921d;
            if (i0Var2 != null && i0Var2.isShowing()) {
                this.f20921d.dismiss();
            }
        } else if (i == 704) {
            C89779i0 i0Var3 = this.f20921d;
            if (i0Var3 != null && i0Var3.isShowing()) {
                this.f20921d.dismiss();
            }
            setResult(i2, intent);
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        this.f20922e = getIntent().getIntExtra("RegScene", 0);
        super.onCreate(bundle);
        setMMTitle("");
        setActionbarColor(getContext().getResources().getColor(C0966R.color.f2929c));
        setBackGroundColorResource(C0966R.color.al6);
        setBackGroundColorResource(C0966R.color.al6);
        if (getListView() != null) {
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3743cv);
            getListView().setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
            getListView().setBackgroundColor(getResources().getColor(C0966R.color.al6));
        }
        String str = System.currentTimeMillis() + "";
        this.f20924g = str;
        C115669n.INSTANCE.mo160131h(23530, str, C87203t.m108273i(), 0, 1, 1001, 0, null, Integer.valueOf(this.f20922e));
        setBackBtn(new C5310b());
        ((SummaryBelowPreference) getPreferenceScreen().mo72519a("register_by_phone")).f121273I = true;
        SummaryBelowPreference summaryBelowPreference = (SummaryBelowPreference) getPreferenceScreen().mo72519a("register_by_weixin");
        summaryBelowPreference.f121273I = true;
        if (this.f20922e == 0) {
            summaryBelowPreference.mo7741E(getString(C0966R.string.n5f, new Object[]{C75592q0.m90783m()}));
            return;
        }
        summaryBelowPreference.mo7741E(getString(C0966R.string.ixq, new Object[]{C75592q0.m90783m()}));
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        String str = preference.f121285r;
        if ("register_by_phone".equals(str)) {
            C115669n.INSTANCE.mo160131h(23530, this.f20924g, C87203t.m108273i(), 0, 2, 1001, 10101, null, Integer.valueOf(this.f20922e));
            setResult(1);
            finish();
        } else if ("register_by_weixin".equals(str)) {
            C115669n nVar = C115669n.INSTANCE;
            Object[] objArr = new Object[8];
            objArr[0] = this.f20924g;
            objArr[1] = C87203t.m108273i();
            objArr[2] = 0;
            objArr[3] = 2;
            objArr[4] = 1001;
            objArr[5] = Integer.valueOf(this.f20922e == 0 ? 10102 : 10104);
            objArr[6] = null;
            objArr[7] = Integer.valueOf(this.f20922e);
            nVar.mo160131h(23530, objArr);
            try {
                this.f20921d = C76879j.m92723Q(getContext(), getString(C0966R.string.a3h), getString(C0966R.string.a4d), true, true, (DialogInterface.OnCancelListener) null);
                mo6284H7();
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.SettingsSelectCreateAccount", e, (String) null, new Object[0]);
            }
        }
        return false;
    }
}
