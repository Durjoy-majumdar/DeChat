package com.tencent.p014mm.plugin.wallet.pwd.p122ui;

import a63.C67008a;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Message;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import b63.C39735i0;
import b63.C67203r0;
import b73.C28273c;
import b73.C67213b;
import com.tencent.kinda.gen.ITransmitKvData;
import com.tencent.kinda.gen.KHbRefundWayType;
import com.tencent.kinda.gen.UseCaseCallback;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.OnSoterInitializedEvent;
import com.tencent.p014mm.autogen.events.StartAppBrandUIFromOuterEvent;
import com.tencent.p014mm.autogen.events.WalletEntryChangeAccountEvent;
import com.tencent.p014mm.autogen.events.WalletGetUserInfoEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.WCPayHongBaoRefundClickReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.WCPayResetPwdClickReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.WCPayTransferToPhoneActionReportStruct;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.p136ui.base.preference.IconPreference;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.base.preference.PreferenceFooterCategory;
import com.tencent.p014mm.p136ui.base.preference.PreferenceSmallCategory;
import com.tencent.p014mm.p136ui.base.preference.PreferenceTitleCategory;
import com.tencent.p014mm.p136ui.base.preference.RightBelowPreference;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.appbrand.jsapi.finder.JsApiNavigateToMiniProgramForFinderProductShare;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.id_verify.RealNameVerifyProcess;
import com.tencent.p014mm.plugin.wallet_core.utils.C43423i0;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.p014mm.wallet_core.model.C75129p;
import com.tencent.p014mm.wallet_core.p137ui.C75197d0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import cr3.C75296i;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import g62.C32330n;
import ie3.C76324c;
import j20.C117292a;
import j53.C46425g;
import j53.C46426h;
import j53.C46430l;
import j53.C76387f;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import k20.C9556a;
import ke3.C88144b;
import l53.C76670a;
import nj3.C76879j;
import nj3.C76912y0;
import ob0.C11385n;
import ob0.C117747y;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p281yz.C79173v;
import p629ny.C76979h;
import pj3.C47511g;
import r43.C12947c;
import t02.C48527c;
import tc0.C77885p;
import te3.C52036xy;
import te3.C64353ez2;
import te3.ij4;
import te3.yi4;
import te3.zf4;
import v53.C78342e0;
import v53.C78348k0;
import vt1.C78473a;
import yq3.C79143a;
import yq3.C79144b;
import yq3.C79148e;

/* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI */
public class WalletPasswordSettingUI extends MMPreference implements C11385n {

    /* renamed from: G */
    public static final /* synthetic */ int f208872G = 0;

    /* renamed from: A */
    public List<Preference> f208873A;

    /* renamed from: B */
    public boolean f208874B;

    /* renamed from: C */
    public boolean f208875C;

    /* renamed from: D */
    public IListener f208876D;

    /* renamed from: E */
    public IListener<OnSoterInitializedEvent> f208877E;

    /* renamed from: F */
    public C79148e.C79149a f208878F;

    /* renamed from: d */
    public C47511g f208879d;

    /* renamed from: e */
    public CheckBoxPreference f208880e;

    /* renamed from: f */
    public RightBelowPreference f208881f;

    /* renamed from: g */
    public CheckBoxPreference f208882g;

    /* renamed from: h */
    public Dialog f208883h = null;

    /* renamed from: i */
    public IconPreference f208884i;

    /* renamed from: j */
    public Preference f208885j;

    /* renamed from: n */
    public String f208886n;

    /* renamed from: o */
    public String f208887o;

    /* renamed from: p */
    public C39735i0 f208888p;

    /* renamed from: q */
    public C39735i0 f208889q;

    /* renamed from: r */
    public C39735i0 f208890r;

    /* renamed from: s */
    public C76387f.C76388a f208891s;

    /* renamed from: t */
    public C46426h.C46427a f208892t;

    /* renamed from: u */
    public int f208893u;

    /* renamed from: v */
    public boolean f208894v;

    /* renamed from: w */
    public boolean f208895w = false;

    /* renamed from: x */
    public int f208896x = 0;

    /* renamed from: y */
    public Dialog f208897y;

    /* renamed from: z */
    public int f208898z;

    /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI$a */
    public class C72006a implements DialogInterface.OnCancelListener {
        public C72006a() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            Dialog dialog = WalletPasswordSettingUI.this.f208897y;
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI$b */
    public class C72007b implements C75129p.C75132c {
        public C72007b() {
        }

        /* renamed from: a */
        public void mo97225a(Object obj) {
            Log.m105924i("MicroMsg.WalletPasswordSettingUI", "jump_win dialog click");
        }

        /* renamed from: c */
        public void mo6028c(Object obj) {
            Log.m105924i("MicroMsg.WalletPasswordSettingUI", "jump_win dialog click jumpItem.action:exit");
            WalletPasswordSettingUI.this.finish();
        }

        /* renamed from: d */
        public void mo6029d(Object obj) {
            Log.m105924i("MicroMsg.WalletPasswordSettingUI", "jump_win dialog click jumpItem.action:JUMPITEM_ACTION_FORMER_PAGE");
        }

        /* renamed from: e */
        public int mo6030e() {
            return JsApiNavigateToMiniProgramForFinderProductShare.CTRL_INDEX;
        }

        /* renamed from: f */
        public void mo97200f(Object obj) {
            Log.m105924i("MicroMsg.WalletPasswordSettingUI", "jump_win dialog click jumpItem.action:continue");
        }

        /* renamed from: g */
        public void mo6031g(Object obj) {
            Log.m105924i("MicroMsg.WalletPasswordSettingUI", "jump_win dialog click jumpItem.action:none");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI$c */
    public class C72008c implements DialogInterface.OnClickListener {
        public C72008c(WalletPasswordSettingUI walletPasswordSettingUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105924i("MicroMsg.WalletPasswordSettingUI", "RealnameVerifyUtil cancel");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI$d */
    public class C72009d implements C75129p.C75132c {
        public C72009d() {
        }

        /* renamed from: a */
        public void mo97225a(Object obj) {
            Log.m105924i("MicroMsg.WalletPasswordSettingUI", "jump_win dialog click");
        }

        /* renamed from: c */
        public void mo6028c(Object obj) {
            Log.m105924i("MicroMsg.WalletPasswordSettingUI", "jump_win dialog click jumpItem.action:exit");
            WalletPasswordSettingUI.this.finish();
        }

        /* renamed from: d */
        public void mo6029d(Object obj) {
            Log.m105924i("MicroMsg.WalletPasswordSettingUI", "jump_win dialog click jumpItem.action:former_page");
        }

        /* renamed from: e */
        public int mo6030e() {
            return JsApiNavigateToMiniProgramForFinderProductShare.CTRL_INDEX;
        }

        /* renamed from: f */
        public void mo97200f(Object obj) {
            Log.m105924i("MicroMsg.WalletPasswordSettingUI", "jump_win dialog click jumpItem.action:continue");
        }

        /* renamed from: g */
        public void mo6031g(Object obj) {
            Log.m105924i("MicroMsg.WalletPasswordSettingUI", "jump_win dialog click jumpItem.action:none");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI$e */
    public class C72010e implements MMHandler.Callback {
        public C72010e() {
        }

        public boolean handleMessage(Message message) {
            Class cls = C78473a.class;
            int i = message.what;
            int i2 = C0966R.string.a18;
            if (i == 1) {
                WalletPasswordSettingUI walletPasswordSettingUI = WalletPasswordSettingUI.this;
                int i3 = WalletPasswordSettingUI.f208872G;
                C76879j.m92717K(walletPasswordSettingUI, false, walletPasswordSettingUI.getResources().getString(C0966R.string.eu9), "", walletPasswordSettingUI.getResources().getString(C0966R.string.a18), walletPasswordSettingUI.getResources().getString(C0966R.string.f7926wf), new C72047o(walletPasswordSettingUI), new C72049p(walletPasswordSettingUI));
            } else if (i == 2) {
                WalletPasswordSettingUI walletPasswordSettingUI2 = WalletPasswordSettingUI.this;
                int i4 = WalletPasswordSettingUI.f208872G;
                walletPasswordSettingUI2.mo99227O7(false);
                C78473a aVar = (C78473a) C86709a0.m107533q(cls);
                String string = walletPasswordSettingUI2.getResources().getString(C0966R.string.l3b);
                Resources resources = walletPasswordSettingUI2.getResources();
                if (aVar.mo107904BE()) {
                    i2 = C0966R.string.l3a;
                }
                C76879j.m92709C(walletPasswordSettingUI2, string, "", resources.getString(i2), walletPasswordSettingUI2.getString(C0966R.string.f7926wf), true, new C72050q(walletPasswordSettingUI2, aVar), new C72051r(walletPasswordSettingUI2));
            } else if (i == 3) {
                WalletPasswordSettingUI walletPasswordSettingUI3 = WalletPasswordSettingUI.this;
                int i5 = WalletPasswordSettingUI.f208872G;
                walletPasswordSettingUI3.mo99227O7(false);
                C78473a aVar2 = (C78473a) C86709a0.m107533q(cls);
                C76879j.m92754y(walletPasswordSettingUI3, walletPasswordSettingUI3.getResources().getString(C0966R.string.l3_), "", walletPasswordSettingUI3.getString(C0966R.string.l39), new C72052s(walletPasswordSettingUI3));
            }
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI$f */
    public class C72011f implements DialogInterface.OnCancelListener {
        public C72011f(WalletPasswordSettingUI walletPasswordSettingUI) {
        }

        public void onCancel(DialogInterface dialogInterface) {
            Log.m105924i("MicroMsg.WalletPasswordSettingUI", "mChangeMobileRemitSwDialog onCancel");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI$g */
    public class C72012g implements MenuItem.OnMenuItemClickListener {
        public C72012g() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            WalletPasswordSettingUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI$h */
    public class C72013h implements C79148e.C79149a {

        /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI$h$a */
        public class C72014a implements Runnable {
            public C72014a() {
            }

            public void run() {
                WalletPasswordSettingUI.this.mo99233U7();
            }
        }

        public C72013h() {
        }

        public Intent onProcessEnd(int i, Bundle bundle) {
            Log.m105924i("MicroMsg.WalletPasswordSettingUI", "end readname process");
            WalletPasswordSettingUI walletPasswordSettingUI = WalletPasswordSettingUI.this;
            int i2 = WalletPasswordSettingUI.f208872G;
            walletPasswordSettingUI.mo99223K7(false);
            WalletGetUserInfoEvent walletGetUserInfoEvent = new WalletGetUserInfoEvent();
            if (i == -1) {
                walletGetUserInfoEvent.f194038d.f194040a = 17;
            } else if (i == 0) {
                walletGetUserInfoEvent.f194038d.f194040a = 18;
            } else {
                walletGetUserInfoEvent.f194038d.f194040a = 0;
            }
            walletGetUserInfoEvent.f194039e.f194055a = new C72014a();
            walletGetUserInfoEvent.publish();
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI$i */
    public class C72015i implements UseCaseCallback {

        /* renamed from: a */
        public final /* synthetic */ C47511g f208908a;

        public C72015i(WalletPasswordSettingUI walletPasswordSettingUI, C47511g gVar) {
            this.f208908a = gVar;
        }

        public void call(ITransmitKvData iTransmitKvData) {
            int i = iTransmitKvData.getInt("refund_way");
            C86709a0.m107528h();
            C85801v1 i2 = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_EXT_PAY_SETTING_LONG_SYNC;
            long longValue = ((Long) i2.mo119685f(aVar, 0L)).longValue();
            if (i == KHbRefundWayType.LQ.ordinal()) {
                longValue = (longValue | 1) & -3;
            } else if (i == KHbRefundWayType.ORIGIN.ordinal()) {
                longValue = (longValue & -2) | 2;
            }
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(aVar, Long.valueOf(longValue));
            C64353ez2 ez22 = new C64353ez2();
            if ((longValue & 1) != 0) {
                ez22.f183059d = 1;
                ez22.f183060e = 2;
            } else if ((longValue & 2) != 0) {
                ez22.f183059d = 2;
                ez22.f183060e = 1;
            }
            Log.m105925i("MicroMsg.WalletPasswordSettingUI", "UseCaseCallback doSettingsOplog: extStatus: %s, set_bitmask: %s, clear_bitmask:%s", Long.toBinaryString(longValue), Long.toBinaryString(ez22.f183059d), Long.toBinaryString(ez22.f183060e));
            ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C32330n(218, ez22));
            this.f208908a.notifyDataSetChanged();
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI$j */
    public class C72016j implements UseCaseCallback {
        public C72016j(WalletPasswordSettingUI walletPasswordSettingUI) {
        }

        public void call(ITransmitKvData iTransmitKvData) {
        }
    }

    public WalletPasswordSettingUI() {
        new MMHandler((MMHandler.Callback) new C72010e());
        this.f208898z = 2;
        this.f208873A = new ArrayList();
        this.f208874B = false;
        this.f208875C = false;
        C40008f fVar = C40008f.f107254d;
        this.f208876D = new IListener<WalletEntryChangeAccountEvent>(fVar) {
            {
                this.__eventId = 92672998;
            }

            public boolean callback(IEvent iEvent) {
                WalletEntryChangeAccountEvent walletEntryChangeAccountEvent = (WalletEntryChangeAccountEvent) iEvent;
                WalletPasswordSettingUI walletPasswordSettingUI = WalletPasswordSettingUI.this;
                int i = WalletPasswordSettingUI.f208872G;
                walletPasswordSettingUI.mo99223K7(true);
                WalletPasswordSettingUI.this.mo99233U7();
                return false;
            }
        };
        this.f208877E = new IListener<OnSoterInitializedEvent>(fVar) {
            {
                this.__eventId = -1482822212;
            }

            public boolean callback(IEvent iEvent) {
                OnSoterInitializedEvent onSoterInitializedEvent = (OnSoterInitializedEvent) iEvent;
                MMHandlerThread.postToMainThreadDelayed(new C72058x(this), 500);
                return false;
            }
        };
        this.f208878F = new C72013h();
    }

    /* renamed from: H7 */
    public static void m84421H7(WalletPasswordSettingUI walletPasswordSettingUI, int i) {
        walletPasswordSettingUI.getClass();
        C78473a aVar = (C78473a) C86709a0.m107533q(C78473a.class);
        if (i == 0) {
            if (walletPasswordSettingUI.f208880e.mo6804J() != aVar.mo107880J3()) {
                walletPasswordSettingUI.mo99227O7(aVar.mo107880J3());
            }
        } else if (i == 1 && walletPasswordSettingUI.f208880e.mo6804J() != aVar.mo107883Zi()) {
            walletPasswordSettingUI.mo99227O7(aVar.mo107883Zi());
        }
    }

    /* renamed from: I7 */
    public final void mo99221I7(int i) {
        Log.m105924i("MicroMsg.WalletPasswordSettingUI", "clickMobileRemitSwitch");
        C46425g gVar = new C46425g(i, this.f208898z);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123460f(gVar);
        Dialog dialog = this.f208883h;
        if (dialog == null) {
            this.f208883h = C76879j.m92721O(this, (String) null, 0, C0966R.style.f8510l3, getString(C0966R.string.gas), true, false, new C72011f(this));
            return;
        }
        dialog.show();
    }

    /* renamed from: J7 */
    public void mo99222J7() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("key_is_paymanager", true);
        bundle.putInt("key_forgot_scene", 2);
        C79144b.m95773a().getClass();
        Log.m105918d("MicroMsg.WalletPasswordSettingUI", "startKindaResetPwd:true");
        ((C76324c) C86312j.m106911c(C76324c.class)).startResetPwdUseCase(this, bundle);
    }

    /* renamed from: K7 */
    public final void mo99223K7(boolean z) {
        C46430l lVar = new C46430l();
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123460f(lVar);
        this.f208895w = true;
        if (z) {
            this.f208897y = C75197d0.m90164e(this, false, new C72006a());
        }
    }

    /* renamed from: L7 */
    public void mo99224L7() {
        ((C76324c) C86312j.m106911c(C76324c.class)).startModifyPwdUseCase(this, new Bundle());
    }

    /* renamed from: M7 */
    public int mo99225M7() {
        return C0966R.xml.f8989db;
    }

    /* renamed from: N7 */
    public final void mo99226N7(C39735i0 i0Var) {
        Class cls = C76324c.class;
        int i = i0Var.field_jump_type;
        if (i == 1) {
            Log.m105925i("MicroMsg.WalletPasswordSettingUI", "jump type h5, url: %s", i0Var.field_pref_url);
            if (!Util.isNullOrNil(i0Var.field_pref_url)) {
                C75228t.m90221N(this, i0Var.field_pref_url, false);
            }
        } else if (i != 2) {
            if (i == 3) {
                Log.m105924i("MicroMsg.WalletPasswordSettingUI", "jump type payment management");
                C88144b.m109789g(this, "wallet", ".pwd.ui.WalletPasswordSettingUI");
            } else if (i == 4) {
                Log.m105924i("MicroMsg.WalletPasswordSettingUI", "jump type payment security");
                Intent intent = new Intent();
                intent.putExtra("wallet_lock_jsapi_scene", 1);
                if (C79144b.m95773a().mo109089d()) {
                    ((C76324c) C86312j.m106911c(cls)).startPaySecurityUseCase(1, (C76324c.C76325a) null);
                } else {
                    C88144b.m109791i(this, "wallet", ".pwd.ui.WalletSecuritySettingUI", intent, (Bundle) null);
                }
                new WCPaySaftyClickReportStruct();
            } else if (i == 5) {
                Log.m105924i("MicroMsg.WalletPasswordSettingUI", "jump type wallet switch");
                C88144b.m109794l(this, "wallet_core", ".ui.WalletSwitchWalletCurrencyUI", 65281);
            } else if (i == 8) {
                Log.m105924i("MicroMsg.WalletPasswordSettingUI", "jump type honey pay");
                if (C48527c.m53911g()) {
                    ((C76324c) C86312j.m106911c(cls)).startUseCase("HoneyPayPayerUseCase", ITransmitKvData.create(), new C72016j(this));
                    return;
                }
                C88144b.m109789g(this, "honey_pay", ".ui.HoneyPayMainUI");
            }
        } else if (!Util.isNullOrNil(i0Var.field_tinyapp_username)) {
            StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new StartAppBrandUIFromOuterEvent();
            StartAppBrandUIFromOuterEvent.C1142a aVar = startAppBrandUIFromOuterEvent.f9522d;
            aVar.f9526a = i0Var.field_tinyapp_username;
            aVar.f9527b = Util.nullAs(i0Var.field_tinyapp_path, "");
            StartAppBrandUIFromOuterEvent.C1142a aVar2 = startAppBrandUIFromOuterEvent.f9522d;
            aVar2.f9529d = 1066;
            aVar2.f9528c = 0;
            startAppBrandUIFromOuterEvent.publish();
        }
    }

    /* renamed from: O7 */
    public final void mo99227O7(boolean z) {
        getDefaultSharedPreferences().edit().putBoolean("wallet_fingerprint_switch", z).commit();
        this.f208880e.mo6805K(z);
        this.f208879d.notifyDataSetChanged();
    }

    /* renamed from: P7 */
    public final void mo99228P7(String str) {
        if (Util.isNullOrNil(str)) {
            Log.m105924i("MicroMsg.WalletPasswordSettingUI", "summaryWording is null");
        } else if (str.contains("wc_custom_link")) {
            SpannableString eo = ((C76979h) C86312j.m106911c(C76979h.class)).mo107066eo(this, str, 10, false, 1, (Object) null);
            CheckBoxPreference checkBoxPreference = this.f208882g;
            checkBoxPreference.f121267C = true;
            checkBoxPreference.mo7741E(eo);
        } else {
            this.f208882g.mo7741E(str);
        }
    }

    /* renamed from: Q7 */
    public final void mo99229Q7(String str, String str2, String str3) {
        this.f208884i.mo69924H(str);
        if (!Util.isNullOrNil(str2) || !Util.isNullOrNil(str3)) {
            this.f208879d.mo72529n("wallet_open_auto_pay", false);
            return;
        }
        this.f208879d.mo72529n("wallet_open_auto_pay", true);
        Log.m105920e("MicroMsg.WalletPasswordSettingUI", "deduct_url is null or tinyappPath is null");
    }

    /* renamed from: R7 */
    public final void mo99230R7() {
        Class cls = C79173v.class;
        if (((C79173v) C86312j.m106911c(cls)).Ex0().mo91343y() || ((C79173v) C86312j.m106911c(cls)).Ex0().mo91342x()) {
            this.f208879d.mo72529n("wallet_biometric_pay", true);
            return;
        }
        C78473a aVar = (C78473a) C86709a0.m107533q(C78473a.class);
        if (C76670a.m92324b() && C76670a.m92323a()) {
            this.f208881f.mo69923G(C0966R.string.l2s);
            this.f208881f.mo7740D(C0966R.string.l2r);
            if (aVar.mo107883Zi()) {
                this.f208881f.f24287K = getString(C0966R.string.knm);
            } else if (aVar.mo107880J3()) {
                this.f208881f.f24287K = getString(C0966R.string.knn);
            } else {
                this.f208881f.f24287K = getString(C0966R.string.jsl);
            }
            this.f208879d.mo72529n("wallet_biometric_pay", false);
        } else if (C76670a.m92324b()) {
            this.f208881f.mo69923G(C0966R.string.l2q);
            this.f208881f.mo7740D(C0966R.string.l2p);
            if (aVar.mo107880J3()) {
                this.f208881f.f24287K = getString(C0966R.string.jsa);
            } else {
                this.f208881f.f24287K = getString(C0966R.string.jsl);
            }
            this.f208879d.mo72529n("wallet_biometric_pay", false);
        } else if (C76670a.m92323a()) {
            this.f208881f.mo69923G(C0966R.string.l2o);
            this.f208881f.mo7740D(C0966R.string.l2n);
            if (aVar.mo107883Zi()) {
                this.f208881f.f24287K = getString(C0966R.string.jsa);
            } else {
                this.f208881f.f24287K = getString(C0966R.string.jsl);
            }
            this.f208879d.mo72529n("wallet_biometric_pay", false);
        } else {
            this.f208879d.mo72529n("wallet_biometric_pay", true);
        }
    }

    /* renamed from: S7 */
    public final void mo99231S7(boolean z) {
        C76387f.C76388a aVar = this.f208891s;
        if (aVar == null) {
            Log.m105924i("MicroMsg.WalletPasswordSettingUI", "updateHbRefundPref() mHbRefundConfig == null");
            this.f208879d.mo72529n("wallet_lucky_money_refund_way", true);
        } else {
            Log.m105925i("MicroMsg.WalletPasswordSettingUI", "updateHbRefundPref() disabled:%s retcode:%s entrance_name:%s", Boolean.valueOf(aVar.f223684k), Integer.valueOf(this.f208891s.f223674a), this.f208891s.f223675b);
            C76387f.C76388a aVar2 = this.f208891s;
            if (aVar2.f223684k || !Util.isEqual(aVar2.f223674a, 0)) {
                this.f208879d.mo72529n("wallet_lucky_money_refund_way", true);
            } else if (Util.isNullOrNil(this.f208891s.f223675b)) {
                this.f208879d.mo72529n("wallet_lucky_money_refund_way", true);
                return;
            } else {
                IconPreference iconPreference = (IconPreference) this.f208879d.mo72519a("wallet_lucky_money_refund_way");
                iconPreference.mo69924H(this.f208891s.f223675b);
                C86709a0.m107528h();
                long longValue = ((Long) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_EXT_PAY_SETTING_LONG_SYNC, 0L)).longValue() & 3;
                Log.m105925i("MicroMsg.WalletPasswordSettingUI", "updateHbRefundPref() extStatus:%s", Long.toBinaryString(longValue));
                if (Util.isEqual(longValue, 2)) {
                    iconPreference.mo7741E(this.f208891s.f223679f);
                } else {
                    iconPreference.mo7741E(this.f208891s.f223677d);
                }
                if (z && this.f208891s.f223676c) {
                    C86709a0.m107528h();
                    C85801v1 i = C86709a0.m107535s().mo121142i();
                    C72994y1.C72995a aVar3 = C72994y1.C72995a.USERINFO_WALLET_HB_REFUND_RED_DOT_BOOLEAN_SYNC;
                    if (!((Boolean) i.mo119685f(aVar3, Boolean.FALSE)).booleanValue()) {
                        iconPreference.mo96250V(0);
                        C86709a0.m107528h();
                        C86709a0.m107535s().mo121142i().mo119677K(aVar3, Boolean.TRUE);
                    } else {
                        iconPreference.mo96250V(8);
                    }
                }
                this.f208879d.mo72529n("wallet_lucky_money_refund_way", false);
            }
        }
        this.f208879d.notifyDataSetChanged();
    }

    /* renamed from: T7 */
    public final void mo99232T7(boolean z) {
        boolean z2 = true;
        Log.m105925i("MicroMsg.WalletPasswordSettingUI", "updateMobileRemitSwitchPref() fromCgi:%s", Boolean.valueOf(z));
        C46426h.C46427a aVar = this.f208892t;
        if (aVar == null) {
            Log.m105924i("MicroMsg.WalletPasswordSettingUI", "updateMobileRemitSwitchPref() mMobileRemitSwitchConfig == null");
            this.f208879d.mo72529n("mobile_remit_switch", true);
        } else if (aVar.f125034a != 0 || !aVar.f125036c) {
            this.f208879d.mo72529n("mobile_remit_switch", true);
            return;
        } else if (Util.isNullOrNil(aVar.f125038e)) {
            this.f208879d.mo72529n("mobile_remit_switch", false);
            return;
        } else {
            this.f208882g.mo69924H(this.f208892t.f125038e);
            mo99228P7(this.f208892t.f125039f);
            if (z) {
                this.f208882g.mo6805K(this.f208892t.f125037d);
            } else {
                C86709a0.m107528h();
                int intValue = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_MOBILE_REMITTANCE_BIND_MOBILE_TRANSFER_INT_SYNC, 0)).intValue();
                Log.m105925i("MicroMsg.WalletPasswordSettingUI", "updateMobileRemitSwitchPref() mobileRemitSw:%s", Integer.valueOf(intValue));
                CheckBoxPreference checkBoxPreference = this.f208882g;
                if (intValue != 1) {
                    z2 = false;
                }
                checkBoxPreference.mo6805K(z2);
            }
            this.f208879d.mo72529n("mobile_remit_switch", false);
        }
        this.f208879d.notifyDataSetChanged();
    }

    /* renamed from: U7 */
    public void mo99233U7() {
        boolean z;
        boolean z2;
        int i;
        Class cls = C79173v.class;
        if (((C79173v) C86312j.m106911c(cls)).Ex0().mo91343y() || ((C79173v) C86312j.m106911c(cls)).Ex0().mo91342x()) {
            this.f208879d.mo72529n("wallet_modify_password", true);
            this.f208879d.mo72529n("wallet_forget_password", true);
            this.f208879d.mo72529n("wallet_realname_verify", false);
            this.f208879d.mo72519a("wallet_realname_verify").mo7740D(C0966R.string.f361594l32);
            this.f208879d.mo72529n("wallet_universal_pay_order", true);
            this.f208879d.mo72529n("wallet_switch_currency", true);
            this.f208879d.mo72529n("wallet_switch_category", true);
            this.f208879d.mo72529n("wallet_biometric_pay", true);
        } else if (((C79173v) C86312j.m106911c(cls)).Ex0().mo91341w()) {
            this.f208879d.mo72529n("wallet_modify_password", false);
            this.f208879d.mo72529n("wallet_forget_password", false);
            this.f208879d.mo72529n("wallet_realname_verify", false);
            this.f208879d.mo72519a("wallet_realname_verify").mo7740D(C0966R.string.l38);
            this.f208879d.mo72529n("wallet_universal_pay_order", true);
            mo99230R7();
        } else {
            Log.m105920e("MicroMsg.WalletPasswordSettingUI", "unknow reg state");
        }
        this.f208879d.mo72529n("wallet_universal_pay_order", true);
        this.f208879d.mo72529n("wallet_digitalcert", true);
        C39735i0 Lo = ((C79173v) C86312j.m106911c(cls)).Ax0().mo71052Lo("wallet_switch_currency");
        this.f208889q = Lo;
        if (Lo == null || Lo.field_is_show != 1) {
            this.f208879d.mo72529n("wallet_switch_currency", true);
            z = true;
        } else {
            this.f208879d.mo72529n("wallet_switch_currency", false);
            Preference a = this.f208879d.mo72519a("wallet_switch_currency");
            a.mo69924H(this.f208889q.field_pref_title);
            a.mo7741E(this.f208889q.field_pref_desc);
            z = false;
        }
        C39735i0 Lo2 = ((C79173v) C86312j.m106911c(cls)).Ax0().mo71052Lo("wallet_im_mch");
        this.f208890r = Lo2;
        if (Lo2 == null || Lo2.field_is_show != 1) {
            this.f208879d.mo72529n("wallet_im_mch", true);
            z2 = true;
        } else {
            this.f208879d.mo72529n("wallet_im_mch", false);
            Preference a2 = this.f208879d.mo72519a("wallet_im_mch");
            a2.mo69924H(this.f208890r.field_pref_title);
            a2.mo7741E(this.f208890r.field_pref_desc);
            z2 = false;
        }
        Log.m105925i("MicroMsg.WalletPasswordSettingUI", "hideSwitch: %s, hideImMch: %s", Boolean.valueOf(z), Boolean.valueOf(z2));
        if (!z || !z2) {
            this.f208879d.mo72529n("wallet_switch_category", false);
        } else {
            this.f208879d.mo72529n("wallet_switch_category", true);
        }
        C86709a0.m107528h();
        long longValue = ((Long) C86709a0.m107535s().mo121142i().mo119684e(147457, 0L)).longValue();
        int i2 = C0966R.string.ks5;
        if ((16 & longValue) != 0) {
            i2 = C0966R.string.f361556ks0;
        } else if ((longValue & 32) != 0) {
            i2 = C0966R.string.kry;
        }
        this.f208879d.mo72519a("wallet_delay_transfer_date").mo7740D(i2);
        this.f208879d.mo72529n("wallet_function_settings", false);
        mo99231S7(false);
        Log.m105924i("MicroMsg.WalletPasswordSettingUI", "updateExtraSectionData()");
        List<Preference> list = this.f208873A;
        if (list != null && ((ArrayList) list).size() > 0) {
            Iterator it = ((ArrayList) this.f208873A).iterator();
            while (it.hasNext()) {
                this.f208879d.mo72526j((Preference) it.next());
            }
            ((ArrayList) this.f208873A).clear();
        }
        int d = this.f208879d.mo72521d("wallet_lucky_money_refund_way");
        C86709a0.m107528h();
        String str = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_PAY_MANAGE_EXTRA_SECTION_DATA_STRING_SYNC, "");
        if (!Util.isNullOrNil(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                    C46430l.C46431a a3 = C46430l.C46431a.m51738a(jSONArray.getJSONObject(i3));
                    if (a3.f125059b != null) {
                        Log.m105924i("MicroMsg.WalletPasswordSettingUI", " Parse header ");
                        zf4 zf4 = a3.f125059b;
                        PreferenceTitleCategory preferenceTitleCategory = new PreferenceTitleCategory(getContext(), (AttributeSet) null);
                        preferenceTitleCategory.f121268D = true;
                        preferenceTitleCategory.mo69924H(C43423i0.m46933d(getContext(), zf4, (C43423i0.C43428e) null));
                        i = d + 1;
                        this.f208879d.mo72524h(preferenceTitleCategory, i);
                        ((ArrayList) this.f208873A).add(preferenceTitleCategory);
                    } else {
                        PreferenceSmallCategory preferenceSmallCategory = new PreferenceSmallCategory(getContext(), (AttributeSet) null);
                        i = d + 1;
                        this.f208879d.mo72524h(preferenceSmallCategory, i);
                        ((ArrayList) this.f208873A).add(preferenceSmallCategory);
                    }
                    Iterator<C39735i0> it4 = a3.f125058a.iterator();
                    while (it4.hasNext()) {
                        C39735i0 next = it4.next();
                        Log.m105925i("MicroMsg.WalletPasswordSettingUI", " mWalletPrefInfo.field_pref_key :%s ", next.field_pref_key);
                        C72053t tVar = new C72053t(this, getContext());
                        tVar.f121271G = C0966R.C0971layout.bcy;
                        tVar.mo69924H(next.field_pref_title);
                        tVar.mo7741E(next.field_pref_desc);
                        tVar.f121276f = new C72055u(this, next);
                        i++;
                        this.f208879d.mo72524h(tVar, i);
                        ((ArrayList) this.f208873A).add(tVar);
                        Log.m105925i("MicroMsg.WalletPasswordSettingUI", " add mWalletPrefInfo.field_pref_key :%s ", next.field_pref_key);
                    }
                    if (a3.f125060c != null) {
                        Log.m105924i("MicroMsg.WalletPasswordSettingUI", " Parse footer ");
                        zf4 zf42 = a3.f125060c;
                        PreferenceFooterCategory preferenceFooterCategory = new PreferenceFooterCategory(getContext());
                        preferenceFooterCategory.f121268D = true;
                        preferenceFooterCategory.mo69924H(C43423i0.m46933d(getContext(), zf42, (C43423i0.C43428e) null));
                        d = i + 1;
                        this.f208879d.mo72524h(preferenceFooterCategory, d);
                        ((ArrayList) this.f208873A).add(preferenceFooterCategory);
                    } else {
                        d = i + 1;
                        PreferenceSmallCategory preferenceSmallCategory2 = new PreferenceSmallCategory(getContext(), (AttributeSet) null);
                        this.f208879d.mo72524h(preferenceSmallCategory2, d);
                        ((ArrayList) this.f208873A).add(preferenceSmallCategory2);
                    }
                }
                this.f208879d.notifyDataSetChanged();
            } catch (JSONException e) {
                Log.m105921e("MicroMsg.WalletPasswordSettingUI", " parse EXTRA_Data failed :%s", e.getMessage());
            }
        }
        this.f208879d.notifyDataSetChanged();
    }

    /* renamed from: V7 */
    public final void mo99234V7() {
        C86709a0.m107528h();
        String str = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_USERINFO_UNREGTITLE_TYPE_STRING_SYNC, "");
        C86709a0.m107528h();
        String str2 = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_USERINFO_UNREGURL_TYPE_STRING_SYNC, "");
        Log.m105925i("MicroMsg.WalletPasswordSettingUI", "updateUnRegPref unreg_title %s unreg_url %s", str, str2);
        if (Util.isNullOrNil(str) || Util.isNullOrNil(str2) || !((C79173v) C86312j.m106911c(C79173v.class)).Ex0().mo91341w()) {
            this.f208879d.mo72529n("wallet_password_setting_un_reg", true);
        } else {
            this.f208879d.mo72529n("wallet_password_setting_un_reg", false);
        }
    }

    public int getResourceId() {
        return -1;
    }

    public void initView() {
        setMMTitle(C75592q0.m90763K() ? getString(C0966R.string.l3d) : getString(C0966R.string.l3c));
        Pattern pattern = C75228t.f221346a;
        C47511g preferenceScreen = getPreferenceScreen();
        this.f208879d = preferenceScreen;
        preferenceScreen.mo72520b(mo99225M7());
        this.f208884i = (IconPreference) this.f208879d.mo72519a("wallet_open_auto_pay");
        this.f208885j = this.f208879d.mo72519a("wallet_delay_transfer_date");
        C86709a0.m107528h();
        C85801v1 i = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_WALLET_PAY_DEDUCT_IS_NEW_BOOLEAN_SYNC;
        Boolean bool = Boolean.TRUE;
        if (!((Boolean) i.mo119685f(aVar, bool)).booleanValue()) {
            this.f208884i.mo101938W(getString(C0966R.string.f360088a12), C0966R.C0969drawable.ake);
            this.f208884i.mo101937U(0);
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(aVar, bool);
        }
        this.f208880e = (CheckBoxPreference) this.f208879d.mo72519a("wallet_fingerprint_switch");
        this.f208881f = (RightBelowPreference) this.f208879d.mo72519a("wallet_biometric_pay");
        this.f208882g = (CheckBoxPreference) this.f208879d.mo72519a("mobile_remit_switch");
        mo99233U7();
        this.f208879d.mo72529n("nfc_idpay", true);
        this.f208879d.mo72529n("wallet_open_auto_pay", true);
        this.f208879d.mo72529n("wallet_universal_pay_order", true);
        this.f208879d.mo72529n("wallet_lucky_money_refund_way", true);
        mo99234V7();
        setBackBtn(new C72012g());
        if (C76670a.m92323a()) {
            C115669n.INSTANCE.mo160131h(15817, 0);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 65281 && i2 == -1) {
            if (C75592q0.m90753A()) {
                finish();
            } else {
                setResult(-1, intent);
                finish();
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        boolean z;
        Class cls = C79173v.class;
        fixStatusbar(true);
        super.onCreate(bundle);
        setActionbarColor(getActionbarColor());
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(385, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(1477, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(1813, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(1724, this);
        this.f208876D.alive();
        this.f208877E.alive();
        this.f208894v = getIntent().getBooleanExtra("key_is_from_system", false);
        this.f208893u = getIntent().getIntExtra("key_enter_scene", 0);
        getIntent().getBooleanExtra("key_default_show_currency", false);
        if (this.f208894v) {
            Log.m105924i("MicroMsg.WalletPasswordSettingUI", "hy: enter password setting from system setting");
            ((C28273c) C86312j.m106911c(C28273c.class)).mo55895Jf().mo91354h(this, (C67213b.C67214b) null);
        }
        initView();
        String str = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_HB_REFUND_CONFIG_REFACTOR_STRING_SYNC, "");
        if (!Util.isNullOrNil(str)) {
            C76387f.C76388a a = C76387f.C76388a.m91812a(str);
            this.f208891s = a;
            Log.m105919d("MicroMsg.WalletPasswordSettingUI", "updateHbRefundConfig() mHbRefundConfig:%s", a);
        } else {
            Log.m105924i("MicroMsg.WalletPasswordSettingUI", "updateHbRefundConfig() jsonString == null");
        }
        mo99231S7(false);
        C76387f fVar = new C76387f();
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123460f(fVar);
        boolean Ix0 = ((C79173v) C86312j.m106911c(cls)).Ix0();
        Log.m105925i("MicroMsg.WalletPasswordSettingUI", "mobileRemitSwitch:%s", Boolean.valueOf(Ix0));
        if (Ix0) {
            String str2 = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_MOBILE_REMITTANCE_SWITCH_CONFIG_STRING_SYNC, "");
            if (!Util.isNullOrNil(str2)) {
                C46426h.C46427a aVar = new C46426h.C46427a();
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    aVar.f125034a = jSONObject.optInt("ret_code");
                    aVar.f125035b = jSONObject.optString("ret_msg");
                    aVar.f125036c = jSONObject.optBoolean("is_show");
                    aVar.f125037d = jSONObject.optBoolean("is_open");
                    aVar.f125038e = jSONObject.optString("entrance_name");
                    aVar.f125039f = jSONObject.optString("wording");
                    aVar.f125040g = jSONObject.optBoolean("is_new_user");
                    aVar.f125041h = jSONObject.optString("compliance_item_wording");
                    aVar.f125042i = jSONObject.optString("compliance_item_title");
                    aVar.f125043j = jSONObject.optString("compliance_item_link");
                } catch (JSONException e) {
                    Log.m105921e("MicroMsg.mobileRemit.NetSceneMobileRemitGetSwitch", "createFromJSONObject() Exception:%s", e.getMessage());
                }
                this.f208892t = aVar;
                Log.m105925i("MicroMsg.WalletPasswordSettingUI", "updateMobileRemitConfig() mMobileRemitSwitchConfig:%s", this.f208891s);
            } else {
                Log.m105924i("MicroMsg.WalletPasswordSettingUI", "updateMobileRemitConfig() jsonString == null");
            }
            mo99232T7(false);
            C86709a0.m107528h();
            int intValue = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_MOBILE_REMITTANCE_SWITCH_GRANT_FLAG_INT_SYNC, 2)).intValue();
            this.f208898z = intValue;
            Log.m105925i("MicroMsg.WalletPasswordSettingUI", "get mobileRemitGrantFlag: %s", Integer.valueOf(intValue));
            if (this.f208898z == 0) {
                this.f208898z = 2;
            }
            C46426h hVar = new C46426h(this.f208898z);
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123460f(hVar);
        } else {
            mo99232T7(false);
        }
        int i = C46430l.f125051j;
        C86709a0.m107528h();
        long longValue = ((Long) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_PREF_INFO_CACHE_TIME_LONG_SYNC, 0L)).longValue();
        C86709a0.m107528h();
        int intValue2 = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_PREF_INFO_EXPIRES_INT_SYNC, 0)).intValue();
        long j = ((long) intValue2) + longValue;
        Log.m105925i("MicroMsg.NetSceneTenpayPayManager", "check isExpire %s %s %s", Long.valueOf(longValue), Integer.valueOf(intValue2), Long.valueOf(j));
        if (longValue <= 0 || Long.valueOf(new Date().getTime() / 1000).longValue() > j) {
            mo99223K7(false);
        } else {
            C86709a0.m107528h();
            this.f208886n = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_REALNAME_URL_STRING_SYNC, "");
            C39735i0 Lo = ((C79173v) C86312j.m106911c(cls)).Ax0().mo71052Lo("wallet_open_auto_pay");
            this.f208888p = Lo;
            if (Lo != null && Lo.field_is_show == 1) {
                Log.m105924i("MicroMsg.WalletPasswordSettingUI", "deduct info from cache is not null");
                C39735i0 i0Var = this.f208888p;
                mo99229Q7(i0Var.field_pref_title, i0Var.field_pref_url, i0Var.field_tinyapp_path);
            } else if (Lo == null) {
                Log.m105924i("MicroMsg.WalletPasswordSettingUI", "deduct info from cache is null");
            } else {
                Log.m105924i("MicroMsg.WalletPasswordSettingUI", "mOpenAutoPayPrefInfo.field_is_show = " + this.f208888p.field_is_show + " and mOpenAutoPayPrefInfo.field_pref_url is null?" + Util.isNullOrNil(this.f208888p.field_pref_url));
            }
        }
        C86709a0.m107528h();
        this.f208896x = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_DELAY_TRANSFER_SHOW_SWITCH_FLAG_INT, 0)).intValue();
        C86709a0.m107528h();
        String str3 = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_DELAY_TRANSFER_SWITCH_WORDING_STRING, "");
        this.f208887o = str3;
        if (Util.isNullOrNil(str3)) {
            z = true;
            C78348k0.m94629j1(true, (C75296i) null, (C78348k0.C78349a) null);
        } else {
            z = true;
            this.f208885j.mo69924H(this.f208887o);
            C78348k0.m94629j1(true, (C75296i) null, (C78348k0.C78349a) null);
        }
        if (this.f208896x == 0) {
            this.f208879d.mo72529n("wallet_delay_transfer_date", z);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f208876D.dead();
        this.f208877E.dead();
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(385, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(1477, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(1813, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(1724, this);
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        Preference preference2 = preference;
        Class cls = C79173v.class;
        if ("wallet_modify_password".equals(preference2.f121285r)) {
            mo99224L7();
            C75228t.m90243e0(24, 1);
            return true;
        }
        boolean z = false;
        String str = "";
        if ("wallet_forget_password".equals(preference2.f121285r)) {
            C86709a0.m107528h();
            String str2 = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_DEDUCT_FORGET_URL_STRING, str);
            if (!Util.isNullOrNil(str2)) {
                Log.m105925i("MicroMsg.WalletPasswordSettingUI", "jump to forget_url %s", str2);
                C75228t.m90221N(getContext(), str2, false);
                WCPayResetPwdClickReportStruct wCPayResetPwdClickReportStruct = new WCPayResetPwdClickReportStruct();
                wCPayResetPwdClickReportStruct.f194679d = 2;
                wCPayResetPwdClickReportStruct.f194680e = 2;
                wCPayResetPwdClickReportStruct.mo86054n();
                return true;
            }
            C67203r0 r0Var = ((C79173v) C86312j.m106911c(cls)).Ex0().f192953f;
            if (r0Var != null) {
                str = r0Var.field_forget_passwd_url;
            }
            if (!Util.isNullOrNil(str)) {
                Log.m105925i("MicroMsg.WalletPasswordSettingUI", "jump to forget url: %s", str);
                C75228t.m90221N(this, str, false);
                return true;
            }
            mo99222J7();
            WCPayResetPwdClickReportStruct wCPayResetPwdClickReportStruct2 = new WCPayResetPwdClickReportStruct();
            wCPayResetPwdClickReportStruct2.f194679d = 2;
            wCPayResetPwdClickReportStruct2.f194680e = 1;
            wCPayResetPwdClickReportStruct2.mo86054n();
            C75228t.m90243e0(25, 1);
            return true;
        } else if ("wallet_realname_verify".equals(preference2.f121285r)) {
            if (!((C79173v) C86312j.m106911c(cls)).Ex0().mo91341w()) {
                Log.m105924i("MicroMsg.WalletPasswordSettingUI", "go to RealNameVerifyProcess");
                Bundle bundle = new Bundle();
                bundle.putInt("real_name_verify_mode", 0);
                bundle.putString("realname_verify_process_jump_plugin", "wallet");
                bundle.putString("realname_verify_process_jump_activity", ".pwd.ui.WalletPasswordSettingUI");
                C79143a.m95771j(this, RealNameVerifyProcess.class, bundle, this.f208878F);
            } else if (!Util.isNullOrNil(this.f208886n)) {
                Log.m105924i("MicroMsg.WalletPasswordSettingUI", "jump to mRealnameUrl");
                Intent intent = new Intent();
                intent.putExtra("rawUrl", this.f208886n);
                intent.putExtra("showShare", false);
                intent.putExtra(C74928u.C45093i.f122326r, true);
                C75228t.m90217J(getContext(), intent);
            } else {
                Log.m105920e("MicroMsg.WalletPasswordSettingUI", "mRealnameUrl is null");
            }
            return true;
        } else {
            int i = 2;
            if ("wallet_lucky_money_refund_way".equals(preference2.f121285r)) {
                ITransmitKvData create = ITransmitKvData.create();
                create.putInt("refund_open_from", 1);
                create.putString("refund_json", this.f208891s.mo106619b());
                create.putString("refund_lingqian_title", this.f208891s.f223677d);
                create.putString("refund_lingqian_desc", this.f208891s.f223678e);
                create.putString("refund_origin_title", this.f208891s.f223679f);
                create.putString("refund_origin_desc", this.f208891s.f223680g);
                create.putString("top_tip", this.f208891s.f223681h);
                create.putString("refund_time_title", this.f208891s.f223682i);
                WCPayHongBaoRefundClickReportStruct wCPayHongBaoRefundClickReportStruct = new WCPayHongBaoRefundClickReportStruct();
                C86709a0.m107528h();
                if (!Util.isEqual(((Long) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_EXT_PAY_SETTING_LONG_SYNC, 0L)).longValue() & 3, 2)) {
                    i = 1;
                }
                if (i == 1) {
                    z = true;
                }
                create.putBool("is_return_to_lq", z);
                ((C76324c) C86312j.m106911c(C76324c.class)).startUseCase("hongbaoRefundWay", create, new C72015i(this, gVar));
                wCPayHongBaoRefundClickReportStruct.f194668f = 1;
                wCPayHongBaoRefundClickReportStruct.f194666d = (long) i;
                wCPayHongBaoRefundClickReportStruct.mo86054n();
                return true;
            } else if ("wallet_biometric_pay".equals(preference2.f121285r)) {
                Intent intent2 = new Intent(this, WalletBiometricPaySettingsUI.class);
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent2);
                C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/wallet/pwd/ui/WalletPasswordSettingUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(this, "com/tencent/mm/plugin/wallet/pwd/ui/WalletPasswordSettingUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return true;
            } else if ("wallet_open_auto_pay".equals(preference2.f121285r)) {
                mo99226N7(this.f208888p);
                this.f208884i.mo101937U(8);
                return true;
            } else if ("wallet_digitalcert".equals(preference2.f121285r)) {
                if (!this.f208895w) {
                    C46430l lVar = new C46430l();
                    C86709a0.m107528h();
                    C86709a0.m107529k().f251779b.mo123460f(lVar);
                }
                C88144b.m109791i(this, "wallet", ".pwd.ui.WalletDigitalCertUI", new Intent(), (Bundle) null);
                return true;
            } else if ("wallet_delay_transfer_date".equals(preference2.f121285r)) {
                Intent intent3 = new Intent(this, WalletDelayTransferSettingUI.class);
                intent3.putExtra("key_scene", 2);
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(intent3);
                C117292a.m165358d(this, aVar2.mo10232b(), "com/tencent/mm/plugin/wallet/pwd/ui/WalletPasswordSettingUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((Intent) aVar2.mo10231a(0));
                C117292a.m165359e(this, "com/tencent/mm/plugin/wallet/pwd/ui/WalletPasswordSettingUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return true;
            } else {
                if ("wallet_password_setting_un_reg".equals(preference2.f121285r)) {
                    C86709a0.m107528h();
                    Intent intent4 = new Intent();
                    intent4.putExtra("rawUrl", (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_USERINFO_UNREGURL_TYPE_STRING_SYNC, str));
                    intent4.putExtra("showShare", false);
                    intent4.putExtra(C74928u.C45093i.f122326r, true);
                    C75228t.m90217J(getContext(), intent4);
                }
                if ("wallet_switch_currency".equals(preference2.f121285r)) {
                    mo99226N7(this.f208889q);
                    return true;
                } else if ("wallet_im_mch".equals(preference2.f121285r)) {
                    mo99226N7(this.f208890r);
                    return true;
                } else if ("wallet_universal_pay_order".equals(preference2.f121285r)) {
                    Intent intent5 = new Intent(getContext(), WalletUniversalPayOrderUI.class);
                    C9556a aVar3 = new C9556a();
                    aVar3.mo10233c(intent5);
                    C117292a.m165358d(this, aVar3.mo10232b(), "com/tencent/mm/plugin/wallet/pwd/ui/WalletPasswordSettingUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((Intent) aVar3.mo10231a(0));
                    C117292a.m165359e(this, "com/tencent/mm/plugin/wallet/pwd/ui/WalletPasswordSettingUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    return true;
                } else if ("wallet_function_settings".equals(preference2.f121285r)) {
                    C88144b.m109789g(getContext(), "mall", ".ui.MallFunctionSettingsUI");
                    return true;
                } else if (!"mobile_remit_switch".equals(preference2.f121285r)) {
                    return false;
                } else {
                    if (((CheckBoxPreference) preference2).mo6804J()) {
                        Log.m105925i("MicroMsg.WalletPasswordSettingUI", "mMobileRemitSwitchConfig.is_new_user ：%s", Boolean.valueOf(this.f208892t.f125040g));
                        C46426h.C46427a aVar4 = this.f208892t;
                        if (aVar4.f125040g) {
                            this.f208875C = false;
                            if (Util.isNullOrNil(aVar4.f125042i) || Util.isNullOrNil(this.f208892t.f125041h)) {
                                Log.m105924i("MicroMsg.WalletPasswordSettingUI", "showProtocalBottomDialog do not have wording");
                                CheckBoxPreference checkBoxPreference = this.f208882g;
                                checkBoxPreference.mo6805K(!checkBoxPreference.mo6804J());
                                this.f208879d.notifyDataSetChanged();
                            } else {
                                C115669n.INSTANCE.mo160131h(24835, 2, 1);
                                AppCompatActivity context = getContext();
                                C46426h.C46427a aVar5 = this.f208892t;
                                C75228t.m90259m0(context, aVar5.f125042i, aVar5.f125041h, aVar5.f125043j, new C72056v(this, 1)).mo140665l(new C72057w(this));
                            }
                        } else {
                            mo99221I7(1);
                        }
                        i = 1;
                    } else {
                        mo99221I7(2);
                    }
                    WCPayTransferToPhoneActionReportStruct wCPayTransferToPhoneActionReportStruct = new WCPayTransferToPhoneActionReportStruct();
                    wCPayTransferToPhoneActionReportStruct.f194684d = (long) i;
                    int i2 = this.f208893u;
                    if (i2 == 0) {
                        wCPayTransferToPhoneActionReportStruct.f194686f = 2;
                    } else if (i2 == 1) {
                        wCPayTransferToPhoneActionReportStruct.f194686f = 1;
                    }
                    wCPayTransferToPhoneActionReportStruct.mo86054n();
                    return true;
                }
            }
        }
    }

    public void onResume() {
        super.onResume();
        if (((C28273c) C86312j.m106911c(C28273c.class)).mo55895Jf().mo91352f()) {
            finish();
        } else {
            mo99233U7();
            if (this.f208874B) {
                this.f208874B = false;
                mo99223K7(false);
            }
        }
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123460f(new C78342e0((String) null, 1));
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_MOBILE_REMITTANCE_BIND_MOBILE_TRANSFER_INT_SYNC;
        C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_MOBILE_REMITTANCE_SWITCH_CONFIG_STRING_SYNC;
        Log.m105924i("MicroMsg.WalletPasswordSettingUI", "errType:" + i + " errCode:" + i2 + " errMsg:" + str + " scenetype:" + yVar.getType());
        if (i == 0 && i2 == 0) {
            if (yVar instanceof C78342e0) {
                mo99233U7();
                mo99234V7();
            } else if (yVar instanceof C46430l) {
                mo99233U7();
                C46430l lVar = (C46430l) yVar;
                Log.m105924i("MicroMsg.WalletPasswordSettingUI", "isShowDeduct=" + lVar.f125052d);
                this.f208886n = lVar.f125056h;
                C39735i0 Lo = ((C79173v) C86312j.m106911c(C79173v.class)).Ax0().mo71052Lo("wallet_open_auto_pay");
                this.f208888p = Lo;
                if (Lo == null || Lo.field_is_show != 1) {
                    this.f208879d.mo72529n("wallet_open_auto_pay", true);
                } else {
                    Log.m105924i("MicroMsg.WalletPasswordSettingUI", "deduct info from cgi is not null");
                    C39735i0 i0Var = this.f208888p;
                    mo99229Q7(i0Var.field_pref_title, i0Var.field_pref_url, i0Var.field_tinyapp_path);
                }
                mo99234V7();
                Dialog dialog = this.f208897y;
                if (dialog != null) {
                    dialog.dismiss();
                }
            } else if (yVar instanceof C78348k0) {
                C78348k0 k0Var = (C78348k0) yVar;
                String str2 = k0Var.f229586e;
                this.f208887o = str2;
                int i3 = k0Var.f229592n;
                this.f208896x = i3;
                if (i3 == 0) {
                    this.f208879d.mo72529n("wallet_delay_transfer_date", true);
                    return;
                }
                if (!Util.isNullOrNil(str2)) {
                    this.f208885j.mo69924H(this.f208887o);
                } else {
                    Log.m105924i("MicroMsg.WalletPasswordSettingUI", "use hardcode wording");
                }
                this.f208879d.mo72529n("wallet_delay_transfer_date", false);
            } else if (yVar instanceof C76387f) {
                this.f208891s = ((C76387f) yVar).mo106618j1();
                mo99231S7(true);
                Log.m105919d("MicroMsg.WalletPasswordSettingUI", "mHbRefundConfig.getJSONObjectString().toString() :%s", this.f208891s.mo106619b());
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_HB_REFUND_CONFIG_REFACTOR_STRING_SYNC, this.f208891s.mo106619b());
            } else if (yVar instanceof C46426h) {
                C46426h hVar = (C46426h) yVar;
                if (hVar.f125033g == null) {
                    C46426h.C46427a aVar3 = new C46426h.C46427a();
                    hVar.f125033g = aVar3;
                    ij4 ij4 = hVar.f125032f;
                    aVar3.f125034a = ij4.f135419d;
                    aVar3.f125035b = ij4.f135420e;
                    aVar3.f125036c = ij4.f135421f;
                    aVar3.f125037d = ij4.f135422g;
                    aVar3.f125038e = ij4.f135423h;
                    aVar3.f125039f = ij4.f135424i;
                    aVar3.f125040g = ij4.f135425j;
                    C52036xy xyVar = ij4.f135426n;
                    if (xyVar != null) {
                        aVar3.f125041h = xyVar.f145016d;
                        aVar3.f125042i = xyVar.f145017e;
                        aVar3.f125043j = xyVar.f145018f;
                    }
                }
                this.f208892t = hVar.f125033g;
                mo99232T7(true);
                Log.m105925i("MicroMsg.WalletPasswordSettingUI", "mMobileRemitSwitchConfig.getJSONObjectString().toString() :%s", this.f208892t.mo71827a());
                C86709a0.m107535s().mo121142i().mo119677K(aVar2, this.f208892t.mo71827a());
            } else if (yVar instanceof C46425g) {
                Dialog dialog2 = this.f208883h;
                if (dialog2 != null && dialog2.isShowing()) {
                    this.f208883h.dismiss();
                }
                yi4 yi4 = ((C46425g) yVar).f125029f;
                if (yi4 == null) {
                    yi4 = new yi4();
                }
                Object[] objArr = new Object[5];
                objArr[0] = Integer.valueOf(yi4.f145317d);
                objArr[1] = yi4.f145318e;
                objArr[2] = Boolean.valueOf(yi4.f145319f == null);
                objArr[3] = Integer.valueOf(yi4.f145321h);
                objArr[4] = yi4.f145322i;
                Log.m105925i("MicroMsg.WalletPasswordSettingUI", "NetSceneMobileRemitChangeSwitch ret_code:%s ret_msg:%s real_name_info:%s resp.grant_flag：%s resp.wording:%s", objArr);
                int i4 = yi4.f145321h;
                String str3 = yi4.f145322i;
                if (Util.isNullOrNil(str3)) {
                    Log.m105924i("MicroMsg.WalletPasswordSettingUI", "summaryWording is null");
                } else {
                    this.f208898z = i4;
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_MOBILE_REMITTANCE_SWITCH_GRANT_FLAG_INT_SYNC, Integer.valueOf(i4));
                    this.f208892t.f125039f = str3;
                    C86709a0.m107535s().mo121142i().mo119677K(aVar2, this.f208892t.mo71827a());
                    mo99228P7(str3);
                    this.f208879d.notifyDataSetChanged();
                }
                int i5 = yi4.f145317d;
                if (i5 != 0) {
                    if (i5 == 416) {
                        if (yi4.f145319f != null) {
                            Bundle bundle = new Bundle();
                            bundle.putString("realname_verify_process_jump_activity", ".pwd.ui.WalletPasswordSettingUI");
                            bundle.putString("realname_verify_process_jump_plugin", "wallet");
                            C67008a.m79170e(this, yi4.f145317d, yi4.f145319f, bundle, true, new C72008c(this), (C79148e.C79149a) null, 1012, 2);
                        } else {
                            C76879j.m92711E(this, Util.isNullOrNil(yi4.f145318e) ? getString(C0966R.string.krp) : yi4.f145318e, "", getResources().getString(C0966R.string.f361038gu1), false, (DialogInterface.OnClickListener) null).show();
                        }
                    } else if (yi4.f145320g != null) {
                        Log.m105924i("MicroMsg.WalletPasswordSettingUI", "NetSceneMobileRemitChangeSwitch show jump_win");
                        C75129p.m90109d(getContext(), yi4.f145320g, null, new C72009d());
                    } else if (i5 != 0) {
                        C76879j.m92711E(this, Util.isNullOrNil(yi4.f145318e) ? getString(C0966R.string.krp) : yi4.f145318e, "", getResources().getString(C0966R.string.f361038gu1), false, (DialogInterface.OnClickListener) null).show();
                    }
                    CheckBoxPreference checkBoxPreference = this.f208882g;
                    checkBoxPreference.mo6805K(!checkBoxPreference.mo6804J());
                    this.f208879d.notifyDataSetChanged();
                } else if (yi4.f145320g != null) {
                    Log.m105924i("MicroMsg.WalletPasswordSettingUI", "NetSceneMobileRemitChangeSwitch show jump_win");
                    C75129p.m90109d(getContext(), yi4.f145320g, null, new C72007b());
                    CheckBoxPreference checkBoxPreference2 = this.f208882g;
                    checkBoxPreference2.mo6805K(!checkBoxPreference2.mo6804J());
                    this.f208879d.notifyDataSetChanged();
                } else if (this.f208882g.mo6804J()) {
                    C86709a0.m107528h();
                    C86709a0.m107535s().mo121142i().mo119677K(aVar, 1);
                } else {
                    C86709a0.m107528h();
                    C86709a0.m107535s().mo121142i().mo119677K(aVar, 0);
                }
            }
        } else if (yVar instanceof C78348k0) {
            Log.m105924i("MicroMsg.WalletPasswordSettingUI", "net error, use hardcode wording");
        } else {
            boolean z = yVar instanceof C76387f;
            if (z) {
                Log.m105924i("MicroMsg.WalletPasswordSettingUI", "wallet_lucky_money_refund_way use cache");
            } else if (z) {
                Log.m105924i("MicroMsg.WalletPasswordSettingUI", "mobile_remit_switch use cache");
            } else if (yVar instanceof C46425g) {
                Log.m105924i("MicroMsg.WalletPasswordSettingUI", "NetSceneMobileRemitChangeSwitch no success");
                Dialog dialog3 = this.f208883h;
                if (dialog3 != null && dialog3.isShowing()) {
                    this.f208883h.dismiss();
                }
                C76912y0.makeText((Context) getContext(), (CharSequence) Util.isNullOrNil(str) ? getString(C0966R.string.f361039gu2) : str, 0).show();
                CheckBoxPreference checkBoxPreference3 = this.f208882g;
                checkBoxPreference3.mo6805K(!checkBoxPreference3.mo6804J());
                this.f208879d.notifyDataSetChanged();
            }
        }
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C12947c.class);
    }
}
