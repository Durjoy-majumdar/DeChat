package com.tencent.p014mm.plugin.remittance.mobile.p097ui;

import android.app.Dialog;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.WCPayTransferToPhoneActionReportStruct;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.plugin.newtips.NormalIconNewTipPreference;
import com.tencent.p014mm.plugin.newtips.model.C115627l;
import com.tencent.p014mm.plugin.wallet_core.utils.C43423i0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C7092q;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import di0.C86299o;
import di0.C86300q;
import di3.C86312j;
import f40.C86709a0;
import h81.C32735h;
import ie3.C76324c;
import j20.C117292a;
import java.io.IOException;
import k20.C9556a;
import ke3.C88144b;
import kr0.C76630x0;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import org.json.JSONException;
import org.json.JSONObject;
import p281yz.C79173v;
import p626nv.C109759g;
import pj3.C47511g;
import te3.C50456mv3;
import te3.C52036xy;
import te3.kj4;
import wi2.C53181d;
import yq3.C79144b;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.BankMobileRemittanceChooseUI */
public class BankMobileRemittanceChooseUI extends MMPreference implements C11385n {

    /* renamed from: i */
    public static final /* synthetic */ int f203834i = 0;

    /* renamed from: d */
    public C47511g f203835d;

    /* renamed from: e */
    public NormalIconNewTipPreference f203836e;

    /* renamed from: f */
    public NormalIconNewTipPreference f203837f;

    /* renamed from: g */
    public Dialog f203838g = null;

    /* renamed from: h */
    public String f203839h;

    /* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.BankMobileRemittanceChooseUI$c */
    public class C5049c implements ValueCallback<String> {
        public C5049c() {
        }

        public void onReceiveValue(Object obj) {
            String str = (String) obj;
            Log.m105925i("MicroMsg.BankMobile.BankMobileRemittanceChooseUI", "on receive value: %s", str);
            if (!Util.isNullOrNil(str)) {
                try {
                    String optString = new JSONObject(str).optString("payState", "");
                    if (!Util.isNullOrNil(optString) && optString.equals("success")) {
                        Log.m105924i("MicroMsg.BankMobile.BankMobileRemittanceChooseUI", "mini program pay success, go to launcherUI");
                        Intent intent = new Intent();
                        intent.setComponent(new ComponentName(MMApplicationContext.getPackageName(), "com.tencent.mm.ui.LauncherUI"));
                        intent.addFlags(67108864);
                        BankMobileRemittanceChooseUI bankMobileRemittanceChooseUI = BankMobileRemittanceChooseUI.this;
                        C9556a aVar = new C9556a();
                        aVar.mo10233c(intent);
                        C117292a.m165358d(bankMobileRemittanceChooseUI, aVar.mo10232b(), "com/tencent/mm/plugin/remittance/mobile/ui/BankMobileRemittanceChooseUI$3", "onReceiveValue", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        bankMobileRemittanceChooseUI.startActivity((Intent) aVar.mo10231a(0));
                        C117292a.m165359e(bankMobileRemittanceChooseUI, "com/tencent/mm/plugin/remittance/mobile/ui/BankMobileRemittanceChooseUI$3", "onReceiveValue", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    }
                } catch (JSONException e) {
                    Log.printErrStackTrace("MicroMsg.BankMobile.BankMobileRemittanceChooseUI", e, "parse mini program response error", e);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.BankMobileRemittanceChooseUI$d */
    public class C5050d implements C76324c.C76325a {

        /* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.BankMobileRemittanceChooseUI$d$a */
        public class C5051a implements Runnable {
            public C5051a() {
            }

            public void run() {
                Log.m105924i("MicroMsg.BankMobile.BankMobileRemittanceChooseUI", "kinda transfer to bank pay success, go to launcherUI");
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(MMApplicationContext.getPackageName(), "com.tencent.mm.ui.LauncherUI"));
                intent.addFlags(67108864);
                BankMobileRemittanceChooseUI bankMobileRemittanceChooseUI = BankMobileRemittanceChooseUI.this;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                BankMobileRemittanceChooseUI bankMobileRemittanceChooseUI2 = bankMobileRemittanceChooseUI;
                C117292a.m165358d(bankMobileRemittanceChooseUI2, aVar.mo10232b(), "com/tencent/mm/plugin/remittance/mobile/ui/BankMobileRemittanceChooseUI$4$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                bankMobileRemittanceChooseUI.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(bankMobileRemittanceChooseUI2, "com/tencent/mm/plugin/remittance/mobile/ui/BankMobileRemittanceChooseUI$4$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }

        public C5050d() {
        }

        /* renamed from: a */
        public void mo5281a(Intent intent) {
            if (intent.getIntExtra("pay_success", 0) == 1) {
                C119179t tVar = C119157j.f356862d;
                C5051a aVar = new C5051a();
                C119157j jVar = (C119157j) tVar;
                jVar.getClass();
                jVar.mo183892w(aVar, 200, false);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.BankMobileRemittanceChooseUI$a */
    public class C70520a implements MenuItem.OnMenuItemClickListener {
        public C70520a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            BankMobileRemittanceChooseUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.BankMobileRemittanceChooseUI$b */
    public class C70521b implements C7092q.C7093a {
        public C70521b() {
        }

        public void onClick(View view) {
            boolean f = ((C79173v) C86312j.m106911c(C79173v.class)).Ex0().mo91334p().mo91306f();
            Log.m105925i("MicroMsg.BankMobile.BankMobileRemittanceChooseUI", "onClick() go to WalletPasswordSettingUI, isNewSetting: %b", Boolean.valueOf(f));
            if (f) {
                C50456mv3 mv32 = new C50456mv3();
                mv32.f138230d = 4;
                mv32.f138231e = "paySettingsUseCase";
                C43423i0.m46932c(BankMobileRemittanceChooseUI.this.getContext(), mv32, (Bundle) null, (C86300q) null, (C43423i0.C43429f) null);
            } else {
                Intent intent = new Intent();
                intent.putExtra("key_enter_scene", 1);
                C88144b.m109791i(BankMobileRemittanceChooseUI.this.getContext(), "wallet", ".pwd.ui.WalletPasswordSettingUI", intent, (Bundle) null);
            }
            BankMobileRemittanceChooseUI bankMobileRemittanceChooseUI = BankMobileRemittanceChooseUI.this;
            int i = BankMobileRemittanceChooseUI.f203834i;
            bankMobileRemittanceChooseUI.getClass();
            WCPayTransferToPhoneActionReportStruct wCPayTransferToPhoneActionReportStruct = new WCPayTransferToPhoneActionReportStruct();
            wCPayTransferToPhoneActionReportStruct.f194684d = (long) 11;
            wCPayTransferToPhoneActionReportStruct.mo86054n();
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.BankMobileRemittanceChooseUI$e */
    public class C70522e implements DialogInterface.OnClickListener {
        public C70522e(BankMobileRemittanceChooseUI bankMobileRemittanceChooseUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105924i("MicroMsg.BankMobile.BankMobileRemittanceChooseUI", "click AlertDialog");
        }
    }

    /* renamed from: H7 */
    public final void mo97193H7() {
        C76879j.m92754y(getContext(), getContext().getString(C0966R.string.l_3), "", getContext().getString(C0966R.string.kke), new C70522e(this));
    }

    public View getBottomView() {
        LinearLayout linearLayout = (LinearLayout) C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.f6547hv, (ViewGroup) null);
        String string = getString(C0966R.string.agn);
        C75228t.m90253j0((TextView) linearLayout.findViewById(C0966R.C0970id.a5s), string, 0, string.length(), new C7092q((C7092q.C7093a) new C70521b(), true), getContext());
        return linearLayout;
    }

    public int getResourceId() {
        return C0966R.xml.f8860m;
    }

    public void initView() {
        Class cls = C109759g.class;
        super.initView();
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(C0966R.color.al6));
        setBackGroundColorResource(C0966R.color.al6);
        if (getListView() != null) {
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3743cv);
            getListView().setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
            getListView().setBackgroundColor(getResources().getColor(C0966R.color.al6));
        }
        setBackBtn(new C70520a());
        C47511g preferenceScreen = getPreferenceScreen();
        this.f203835d = preferenceScreen;
        this.f203836e = (NormalIconNewTipPreference) preferenceScreen.mo72519a("bank_mobile_remit_choose_bank");
        this.f203837f = (NormalIconNewTipPreference) this.f203835d.mo72519a("bank_mobile_remit_choose_mobile");
        NormalIconNewTipPreference normalIconNewTipPreference = this.f203836e;
        normalIconNewTipPreference.f215075a1 = true;
        normalIconNewTipPreference.mo101928J(getString(C0966R.string.agp));
        this.f203836e.mo101929K(0);
        this.f203836e.mo101934R(8);
        this.f203836e.mo96254e0(this.f203835d);
        ((C115627l) ((C109759g) C86312j.m106911c(cls)).V40()).mo175770k(this.f203836e);
        NormalIconNewTipPreference normalIconNewTipPreference2 = this.f203837f;
        normalIconNewTipPreference2.f215075a1 = true;
        normalIconNewTipPreference2.mo101928J(getString(C0966R.string.agr));
        this.f203837f.mo101929K(0);
        this.f203837f.mo101934R(8);
        this.f203837f.mo96254e0(this.f203835d);
        ((C115627l) ((C109759g) C86312j.m106911c(cls)).V40()).mo175770k(this.f203837f);
        this.f203835d.notifyDataSetChanged();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    public void onDestroy() {
        this.f203838g = null;
        C86709a0.m107524d().mo123470p(2952, this);
        super.onDestroy();
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        Class cls = C109759g.class;
        Log.m105925i("MicroMsg.BankMobile.BankMobileRemittanceChooseUI", "onPreferenceTreeClick() key:%s", preference.f121285r);
        if (Util.isEqual("bank_mobile_remit_choose_bank", preference.f121285r)) {
            ((C115627l) ((C109759g) C86312j.m106911c(cls)).V40()).mo175762a(21);
            C79144b.m95773a().getClass();
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_transfer_to_bank_mini_app_switch_android, false)) {
                C86299o oVar = new C86299o();
                oVar.f250930b = "wx0d0c604dfc7193ec";
                oVar.f250934f = "pages/index/index.html?from=native";
                oVar.f250939k = 1249;
                oVar.f250943o = new C5049c();
                ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(getContext(), oVar);
                return true;
            }
            if (!((C76324c) C86312j.m106911c(C76324c.class)).tryStartTransferToBankUseCase((String) null, new C5050d())) {
                C88144b.m109789g(getContext(), "remittance", ".bankcard.ui.BankRemitBankcardInputUI");
            }
            return true;
        } else if (!Util.isEqual("bank_mobile_remit_choose_mobile", preference.f121285r)) {
            return false;
        } else {
            ((C115627l) ((C109759g) C86312j.m106911c(cls)).V40()).mo175762a(22);
            Log.m105924i("MicroMsg.BankMobile.BankMobileRemittanceChooseUI", "doNetSceneMobileRemitGetHomePage() ");
            if (this.f203838g == null) {
                this.f203838g = C76879j.m92721O(getContext(), (String) null, 3, C0966R.style.f8510l3, getContext().getString(C0966R.string.gas), true, true, new C70554a(this));
            }
            C86709a0.m107524d().mo123455a(2952, this);
            C86709a0.m107524d().mo123460f(new C53181d(false));
            WCPayTransferToPhoneActionReportStruct wCPayTransferToPhoneActionReportStruct = new WCPayTransferToPhoneActionReportStruct();
            wCPayTransferToPhoneActionReportStruct.f194684d = (long) 4;
            wCPayTransferToPhoneActionReportStruct.mo86054n();
            return true;
        }
    }

    public void onResume() {
        super.onResume();
        setBackGroundColorResource(C0966R.color.al6);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C52036xy xyVar;
        Log.m105924i("MicroMsg.BankMobile.BankMobileRemittanceChooseUI", "errType:" + i + " errCode:" + i2 + " errMsg:" + str + " scenetype:" + yVar.getType());
        Dialog dialog = this.f203838g;
        if (dialog != null && dialog.isShowing()) {
            this.f203838g.dismiss();
            this.f203838g = null;
        }
        if (yVar instanceof C53181d) {
            C86709a0.m107524d().mo123470p(2952, this);
            if (i == 0 || i2 == 0) {
                kj4 kj4 = ((C53181d) yVar).f148366t;
                if (kj4 == null) {
                    kj4 = null;
                }
                Intent intent = new Intent();
                if (!Util.isNullOrNil(this.f203839h)) {
                    intent.putExtra("key_content", this.f203839h);
                    this.f203839h = "";
                }
                Log.m105925i("MicroMsg.BankMobile.BankMobileRemittanceChooseUI", "mResponse.is_new_user: %s", Boolean.valueOf(kj4.f136830p));
                if (!kj4.f136830p || (xyVar = kj4.f136831q) == null) {
                    C88144b.m109791i(getContext(), "remittance", ".mobile.ui.MobileRemitNumberInputUI", intent, (Bundle) null);
                    return;
                }
                try {
                    intent.putExtra("key_compliance_item ", xyVar.toByteArray());
                    C88144b.m109791i(getContext(), "remittance", ".mobile.ui.MobileRemitWelcomeUI", intent, (Bundle) null);
                } catch (IOException e) {
                    Log.m105921e("MicroMsg.BankMobile.BankMobileRemittanceChooseUI", " mResponse printStackTrace: %s", e.toString());
                    mo97193H7();
                }
            } else {
                mo97193H7();
            }
        }
    }
}
