package com.tencent.p014mm.plugin.wallet.pwd.p122ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import b73.C28273c;
import com.tencent.kinda.gen.ITransmitKvData;
import com.tencent.kinda.gen.UseCaseCallback;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.StartAppBrandUIFromOuterEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.base.preference.IconPreference;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.pluginsdk.model.app.C72688j0;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.p014mm.wallet_core.model.C75140t0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import di3.C86312j;
import f40.C86709a0;
import ie3.C76324c;
import j53.C76390m;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import ke3.C88144b;
import nj3.C76879j;
import oa1.C117731d;
import ob0.C11385n;
import ob0.C117747y;
import org.json.JSONObject;
import p158gt.C76057w;
import p158gt.C8451i;
import p206nj.C11171e;
import pj3.C47511g;
import pv2.C110259i;
import pv2.C110260j;
import qo3.C77389a;
import qo3.C77398g;
import vt1.C78473a;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletSecuritySettingUI */
public class WalletSecuritySettingUI extends MMPreference implements C11385n {

    /* renamed from: d */
    public boolean f208920d = true;

    /* renamed from: e */
    public C47511g f208921e;

    /* renamed from: f */
    public WalletSecuritySettingHeaderPref f208922f;

    /* renamed from: g */
    public IconPreference f208923g;

    /* renamed from: h */
    public IconPreference f208924h;

    /* renamed from: i */
    public IconPreference f208925i;

    /* renamed from: j */
    public IconPreference f208926j;

    /* renamed from: n */
    public IconPreference f208927n;

    /* renamed from: o */
    public C72021e f208928o;

    /* renamed from: p */
    public C72026j f208929p;

    /* renamed from: q */
    public C72025i f208930q;

    /* renamed from: r */
    public C72022f f208931r;

    /* renamed from: s */
    public C72020d f208932s;

    /* renamed from: t */
    public ProgressDialog f208933t;

    /* renamed from: u */
    public int f208934u = 0;

    /* renamed from: v */
    public Map<String, C76057w.C76058a> f208935v = new HashMap();

    /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletSecuritySettingUI$a */
    public class C72017a implements MenuItem.OnMenuItemClickListener {
        public C72017a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            WalletSecuritySettingUI.this.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletSecuritySettingUI$b */
    public class C72018b implements UseCaseCallback {
        public C72018b(WalletSecuritySettingUI walletSecuritySettingUI) {
        }

        public void call(ITransmitKvData iTransmitKvData) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletSecuritySettingUI$c */
    public class C72019c implements C76057w.C76058a {

        /* renamed from: a */
        public final /* synthetic */ IconPreference f208937a;

        public C72019c(IconPreference iconPreference) {
            this.f208937a = iconPreference;
        }

        /* renamed from: a */
        public void mo25933a(String str, Bitmap bitmap, String str2) {
            Log.m105925i("MicroMsg.WalletSecuritySettingUI", "alvinluo icon url: %s", str);
            this.f208937a.f215053N = new BitmapDrawable(WalletSecuritySettingUI.this.getContext().getResources(), bitmap);
            ((HashMap) WalletSecuritySettingUI.this.f208935v).remove(str);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletSecuritySettingUI$d */
    public class C72020d {

        /* renamed from: a */
        public String f208939a;

        /* renamed from: b */
        public String f208940b;

        /* renamed from: c */
        public String f208941c;

        /* renamed from: d */
        public String f208942d;

        public C72020d(WalletSecuritySettingUI walletSecuritySettingUI, C72017a aVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletSecuritySettingUI$e */
    public class C72021e {

        /* renamed from: a */
        public String f208943a;

        /* renamed from: b */
        public String f208944b;

        public C72021e(WalletSecuritySettingUI walletSecuritySettingUI, C72017a aVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletSecuritySettingUI$f */
    public class C72022f {

        /* renamed from: a */
        public String f208945a;

        /* renamed from: b */
        public String f208946b;

        /* renamed from: c */
        public String f208947c;

        /* renamed from: d */
        public String f208948d;

        /* renamed from: e */
        public String f208949e;

        /* renamed from: f */
        public String f208950f;

        /* renamed from: g */
        public String f208951g;

        /* renamed from: h */
        public int f208952h;

        public C72022f(Context context) {
        }

        /* renamed from: a */
        public final String mo99251a(String str, String str2) {
            return Uri.parse(this.f208951g).buildUpon().appendQueryParameter(str, str2).build().toString();
        }

        /* renamed from: b */
        public String mo99252b() {
            Log.m105919d("MicroMsg.WalletSecuritySettingUI", "check status2: %s, %s", Integer.valueOf(this.f208952h), Integer.valueOf(hashCode()));
            int i = this.f208952h;
            if (i == 0) {
                return this.f208948d;
            }
            if (i == 1) {
                return this.f208949e;
            }
            if (i == 3) {
                return null;
            }
            return this.f208950f;
        }

        /* renamed from: c */
        public String mo99253c() {
            int i = this.f208952h;
            return i == 0 ? mo99251a("qqpimsecurestatus", "not_installed") : i == 2 ? mo99251a("qqpimsecurestatus", "runing") : i == 1 ? mo99251a("qqpimsecurestatus", "not_run") : mo99251a("qqpimsecurestatus", "not_run");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletSecuritySettingUI$g */
    public static class C72023g {

        /* renamed from: a */
        public String f208954a;

        /* renamed from: b */
        public int f208955b;

        /* renamed from: c */
        public String f208956c;

        /* renamed from: d */
        public String f208957d;

        /* renamed from: e */
        public String f208958e;

        /* renamed from: a */
        public static C72023g m84462a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            C72023g gVar = new C72023g();
            gVar.f208954a = jSONObject.optString("button_wording");
            gVar.f208955b = jSONObject.optInt("jump_type");
            gVar.f208956c = jSONObject.optString("jump_h5_url");
            gVar.f208957d = jSONObject.optString("tinyapp_name");
            gVar.f208958e = jSONObject.optString("tinyapp_path");
            return gVar;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletSecuritySettingUI$h */
    public static class C72024h {

        /* renamed from: a */
        public String f208959a;

        /* renamed from: b */
        public String f208960b;

        /* renamed from: c */
        public String f208961c;

        /* renamed from: d */
        public C72023g f208962d;

        /* renamed from: e */
        public C72023g f208963e;
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletSecuritySettingUI$i */
    public class C72025i {

        /* renamed from: a */
        public String f208964a;

        /* renamed from: b */
        public String f208965b;

        /* renamed from: c */
        public String f208966c;

        /* renamed from: d */
        public String f208967d;

        /* renamed from: e */
        public int f208968e;

        /* renamed from: f */
        public String f208969f;

        /* renamed from: g */
        public String f208970g;

        /* renamed from: h */
        public String f208971h;

        public C72025i(WalletSecuritySettingUI walletSecuritySettingUI, C72017a aVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletSecuritySettingUI$j */
    public class C72026j {

        /* renamed from: a */
        public String f208972a;

        /* renamed from: b */
        public String f208973b;

        /* renamed from: c */
        public String f208974c;

        /* renamed from: d */
        public String f208975d;

        public C72026j(WalletSecuritySettingUI walletSecuritySettingUI, C72017a aVar) {
        }
    }

    /* renamed from: H7 */
    public final void mo99242H7(String str, IconPreference iconPreference) {
        if (iconPreference != null) {
            Bitmap bitmap = ((C8451i) C86312j.m106911c(C8451i.class)).get(str);
            if (bitmap != null) {
                iconPreference.f215053N = new BitmapDrawable(getContext().getResources(), bitmap);
            } else if (!Util.isNullOrNil(str)) {
                C72019c cVar = new C72019c(iconPreference);
                ((HashMap) this.f208935v).put(str, cVar);
                ((C76057w) C86312j.m106911c(C76057w.class)).h60(str, cVar);
            }
        }
    }

    /* renamed from: I7 */
    public final void mo99243I7(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (jSONObject2 == null) {
            Log.m105920e("MicroMsg.WalletSecuritySettingUI", "alvinluo security info json is null");
            String string = getString(C0966R.string.f361610l80);
            ProgressDialog progressDialog = this.f208933t;
            if (progressDialog != null && progressDialog.isShowing()) {
                this.f208933t.dismiss();
            }
            C76879j.m92713G(this, string, "", false, new C72036e0(this));
            return;
        }
        try {
            this.f208921e = getPreferenceScreen();
            if (jSONObject2.has("basic_security_item")) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject("basic_security_item");
                C72021e eVar = new C72021e(this, (C72017a) null);
                this.f208928o = eVar;
                eVar.f208943a = jSONObject3.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                this.f208928o.f208944b = jSONObject3.optString("desc");
                C72021e eVar2 = this.f208928o;
                jSONObject3.optString("logo_url");
                eVar2.getClass();
            }
            if (jSONObject2.has("wallet_lock_info")) {
                JSONObject jSONObject4 = jSONObject2.getJSONObject("wallet_lock_info");
                C72026j jVar = new C72026j(this, (C72017a) null);
                this.f208929p = jVar;
                jVar.f208972a = jSONObject4.optString("wallet_lock_title");
                this.f208929p.f208973b = jSONObject4.optString("wallet_lock_desc");
                this.f208929p.f208974c = jSONObject4.getString("wallet_lock_logo_url");
                C72026j jVar2 = this.f208929p;
                jSONObject4.optInt("wallet_lock_status");
                jVar2.getClass();
                this.f208929p.f208975d = jSONObject4.optString("wallet_lock_status_name");
                C72026j jVar3 = this.f208929p;
                jSONObject4.optBoolean("is_open_touch_pay", false);
                jVar3.getClass();
            }
            if (jSONObject2.has("property_security_info")) {
                JSONObject jSONObject5 = jSONObject2.getJSONObject("property_security_info");
                C72025i iVar = new C72025i(this, (C72017a) null);
                this.f208930q = iVar;
                iVar.f208964a = jSONObject5.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE, "");
                this.f208930q.f208965b = jSONObject5.optString("desc", "");
                this.f208930q.f208966c = jSONObject5.optString("logo_url", "");
                C72025i iVar2 = this.f208930q;
                jSONObject5.optInt("status", 0);
                iVar2.getClass();
                this.f208930q.f208967d = jSONObject5.optString("status_name");
                this.f208930q.f208968e = jSONObject5.optInt("jump_type");
                this.f208930q.f208969f = jSONObject5.optString("jump_h5_url");
                this.f208930q.f208970g = jSONObject5.optString("tinyapp_username");
                this.f208930q.f208971h = jSONObject5.optString("tinyapp_path");
            }
            if (jSONObject2.has("safe_manager_info")) {
                JSONObject jSONObject6 = jSONObject2.getJSONObject("safe_manager_info");
                if (this.f208931r == null) {
                    this.f208931r = new C72022f(this);
                }
                this.f208931r.f208945a = jSONObject6.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE, "");
                this.f208931r.f208946b = jSONObject6.optString("desc", "");
                this.f208931r.f208947c = jSONObject6.optString("logo_url", "");
                this.f208931r.f208949e = jSONObject6.optString("installed_status_name");
                this.f208931r.f208948d = jSONObject6.optString("uninstall_status_name");
                this.f208931r.f208950f = jSONObject6.optString("protected_mode_name");
                this.f208931r.f208951g = jSONObject6.optString("jump_h5_url");
                C72022f fVar = this.f208931r;
                fVar.getClass();
                if (C72688j0.m85020f(this, "com.tencent.qqpimsecure")) {
                    fVar.f208952h = 3;
                    ((C119157j) C119157j.f356862d).mo183877h(new C85508f0(fVar), "check_qq_security_status");
                } else {
                    fVar.f208952h = 0;
                }
            }
            if (jSONObject2.has("balance_privacy_info")) {
                JSONObject jSONObject7 = jSONObject2.getJSONObject("balance_privacy_info");
                C72020d dVar = new C72020d(this, (C72017a) null);
                this.f208932s = dVar;
                dVar.f208939a = jSONObject7.optString("icon", "");
                this.f208932s.f208940b = jSONObject7.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE, "");
                this.f208932s.f208941c = jSONObject7.optString("desc", "");
                C72020d dVar2 = this.f208932s;
                jSONObject7.optInt("switch_state");
                dVar2.getClass();
                this.f208932s.f208942d = jSONObject7.optString("switch_state_info");
            }
            C75140t0.m90124c().mo104863d(jSONObject2);
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLETLOCK_CURRENT_JSON_TYPE_STRING_SYNC, jSONObject.toString());
            mo99246L7();
            mo99249O7();
            mo99245K7();
            mo99247M7();
            mo99248N7();
            mo99244J7();
            this.f208921e.notifyDataSetChanged();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WalletSecuritySettingUI", e, "", new Object[0]);
            String string2 = getString(C0966R.string.f361610l80);
            ProgressDialog progressDialog2 = this.f208933t;
            if (progressDialog2 != null && progressDialog2.isShowing()) {
                this.f208933t.dismiss();
            }
            C76879j.m92713G(this, string2, "", false, new C72036e0(this));
        }
        ProgressDialog progressDialog3 = this.f208933t;
        if (progressDialog3 != null && progressDialog3.isShowing()) {
            this.f208933t.dismiss();
        }
    }

    /* renamed from: J7 */
    public final void mo99244J7() {
        if (this.f208932s == null) {
            this.f208921e.mo72529n("balance_privacy_info", true);
            return;
        }
        this.f208921e.mo72529n("balance_privacy_info", false);
        IconPreference iconPreference = (IconPreference) this.f208921e.mo72519a("balance_privacy_info");
        this.f208927n = iconPreference;
        mo99242H7(this.f208932s.f208939a, iconPreference);
        this.f208927n.mo69924H(this.f208932s.f208940b);
        this.f208927n.mo7741E(this.f208932s.f208942d);
        this.f208927n.mo101928J(this.f208932s.f208941c);
        this.f208927n.mo101929K(0);
    }

    /* renamed from: K7 */
    public final void mo99245K7() {
        this.f208921e.mo72529n("wallet_security_digital_certificate", false);
        this.f208923g = (IconPreference) this.f208921e.mo72519a("wallet_security_digital_certificate");
        C75140t0.m90124c().getClass();
        C86709a0.m107528h();
        boolean z = true;
        if (!(((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLETDIGITAL_CERT_SHOW_INT_SYNC, 0)).intValue() > 0)) {
            this.f208921e.mo72529n("wallet_security_digital_certificate", true);
        } else if (this.f208923g != null) {
            C75140t0 c = C75140t0.m90124c();
            c.getClass();
            if (Util.isNullOrNil(C75140t0.m90123b()) || c.f221089a <= 0) {
                z = false;
            }
            if (!z) {
                this.f208923g.mo7740D(C0966R.string.l8b);
            } else if (!Util.isNullOrNil(C75140t0.m90124c().f221092d)) {
                this.f208923g.mo7741E(C75140t0.m90124c().f221092d);
            } else {
                this.f208923g.mo7740D(C0966R.string.l8_);
            }
            mo99242H7(C75140t0.m90124c().f221093e, this.f208923g);
            this.f208923g.mo69924H(C75140t0.m90124c().f221091c);
            this.f208923g.mo101928J(C75140t0.m90124c().f221090b);
            this.f208923g.mo101929K(0);
        }
    }

    /* renamed from: L7 */
    public final void mo99246L7() {
        TextView textView;
        WalletSecuritySettingHeaderPref walletSecuritySettingHeaderPref = (WalletSecuritySettingHeaderPref) this.f208921e.mo72519a("wallet_security_basic_info");
        this.f208922f = walletSecuritySettingHeaderPref;
        C72021e eVar = this.f208928o;
        if (eVar != null) {
            String str = eVar.f208943a;
            String str2 = eVar.f208944b;
            eVar.getClass();
            walletSecuritySettingHeaderPref.f208915P = str;
            walletSecuritySettingHeaderPref.f208916Q = str2;
            walletSecuritySettingHeaderPref.f208917R = null;
            walletSecuritySettingHeaderPref.mo99241I();
            this.f208928o.getClass();
            if (Util.isNullOrNil((String) null) && (textView = this.f208922f.f208913M) != null) {
                textView.setVisibility(8);
            }
        }
    }

    /* renamed from: M7 */
    public final void mo99247M7() {
        this.f208924h = (IconPreference) this.f208921e.mo72519a("wallet_security_pay_guard");
        if (this.f208931r == null) {
            this.f208921e.mo72529n("wallet_security_pay_guard", true);
            return;
        }
        this.f208921e.mo72529n("wallet_security_pay_guard", false);
        mo99242H7(this.f208931r.f208947c, this.f208924h);
        this.f208924h.mo69924H(this.f208931r.f208945a);
        String b = this.f208931r.mo99252b();
        if (!Util.isNullOrNil(b)) {
            this.f208924h.mo7741E(b);
        }
        this.f208924h.mo101928J(this.f208931r.f208946b);
        this.f208924h.mo101929K(0);
    }

    /* renamed from: N7 */
    public final void mo99248N7() {
        C47511g preferenceScreen = getPreferenceScreen();
        this.f208921e = preferenceScreen;
        preferenceScreen.mo72529n("wallet_security_safety_insurance", false);
        IconPreference iconPreference = (IconPreference) this.f208921e.mo72519a("wallet_security_safety_insurance");
        this.f208926j = iconPreference;
        if (iconPreference != null) {
            iconPreference.mo7740D(C0966R.string.l8c);
        }
        C72025i iVar = this.f208930q;
        if (iVar == null) {
            this.f208921e.mo72529n("wallet_security_safety_insurance", true);
            return;
        }
        mo99242H7(iVar.f208966c, this.f208926j);
        this.f208926j.mo69924H(this.f208930q.f208964a);
        this.f208926j.mo7741E(this.f208930q.f208967d);
        this.f208926j.mo101928J(this.f208930q.f208965b);
        this.f208926j.mo101929K(0);
    }

    /* renamed from: O7 */
    public final void mo99249O7() {
        if (this.f208929p == null) {
            this.f208921e.mo72529n("wallet_security_wallet_lock", true);
            return;
        }
        this.f208921e.mo72529n("wallet_security_wallet_lock", false);
        IconPreference iconPreference = (IconPreference) this.f208921e.mo72519a("wallet_security_wallet_lock");
        this.f208925i = iconPreference;
        mo99242H7(this.f208929p.f208974c, iconPreference);
        this.f208925i.mo69924H(this.f208929p.f208972a);
        this.f208925i.mo7741E(this.f208929p.f208975d);
        this.f208925i.mo101928J(this.f208929p.f208973b);
        this.f208925i.mo101929K(0);
    }

    public int getResourceId() {
        return -1;
    }

    public void initView() {
        super.initView();
        C47511g preferenceScreen = getPreferenceScreen();
        this.f208921e = preferenceScreen;
        if (preferenceScreen != null) {
            preferenceScreen.mo72520b(C0966R.xml.f8991dd);
        }
        C86709a0.m107528h();
        String str = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLETLOCK_CURRENT_JSON_TYPE_STRING_SYNC, "");
        if (!Util.isNullOrNil(str)) {
            try {
                mo99243I7(new JSONObject(str));
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.WalletSecuritySettingUI", e, "", new Object[0]);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f208934u = getIntent().getIntExtra("wallet_lock_jsapi_scene", 0);
        WCPaySaftyClickReportStruct wCPaySaftyClickReportStruct = new WCPaySaftyClickReportStruct();
        wCPaySaftyClickReportStruct.f194681d = 11;
        wCPaySaftyClickReportStruct.f194682e = 1;
        wCPaySaftyClickReportStruct.f194683f = (long) this.f208934u;
        wCPaySaftyClickReportStruct.mo86054n();
        initView();
        setBackBtn(new C72017a());
        if (C11171e.m11046c(23)) {
            getWindow().setStatusBarColor(getResources().getColor(C0966R.color.al6));
            updataStatusBarIcon(C85875k4.m106211z());
        }
    }

    public void onDestroy() {
        for (Map.Entry entry : ((HashMap) this.f208935v).entrySet()) {
            ((C76057w) C86312j.m106911c(C76057w.class)).mo106264FL((String) entry.getKey(), (C76057w.C76058a) entry.getValue());
        }
        ((HashMap) this.f208935v).clear();
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(385, this);
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        if ("wallet_security_digital_certificate".equals(preference.f121285r)) {
            WCPaySaftyClickReportStruct wCPaySaftyClickReportStruct = new WCPaySaftyClickReportStruct();
            wCPaySaftyClickReportStruct.f194681d = 12;
            wCPaySaftyClickReportStruct.f194682e = 1;
            wCPaySaftyClickReportStruct.mo86054n();
            C88144b.m109791i(this, "wallet", ".pwd.ui.WalletDigitalCertUI", new Intent(), (Bundle) null);
            return true;
        } else if ("wallet_security_pay_guard".equals(preference.f121285r)) {
            C72022f fVar = this.f208931r;
            if (fVar == null) {
                return true;
            }
            Log.m105925i("MicroMsg.WalletSecuritySettingUI", "jump url %s ", fVar.mo99253c());
            String c = this.f208931r.mo99253c();
            Pattern pattern = C75228t.f221346a;
            Intent intent = new Intent();
            intent.putExtra("rawUrl", c);
            intent.putExtra("showShare", false);
            intent.putExtra("pay_channel", 1);
            intent.putExtra(C74928u.C45093i.f122326r, true);
            C88144b.m109791i(this, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, (Bundle) null);
            return true;
        } else if ("wallet_security_wallet_lock".equals(preference.f121285r)) {
            ((C28273c) C86312j.m106911c(C28273c.class)).mo55895Jf().mo91351e(this, new Intent());
            return true;
        } else if (!"wallet_security_safety_insurance".equals(preference.f121285r)) {
            if ("balance_privacy_info".equals(preference.f121285r)) {
                if (this.f208932s == null) {
                    return true;
                }
                if (C117731d.m166007c().mo182443e("clicfg_open_wallet_entrance_switch_state_cpp_version_android", 0, true, true) == 1) {
                    Log.m105926v("MicroMsg.WalletSecuritySettingUI", "go cpp version WalletEntranceStateUseCase");
                    ((C76324c) C86312j.m106911c(C76324c.class)).startUseCase("WalletEntranceStateUseCase", ITransmitKvData.create(), new C72018b(this));
                } else {
                    Log.m105926v("MicroMsg.WalletSecuritySettingUI", "go java version WalletSecuritySettingUI");
                    C88144b.m109789g(this, "wallet", ".pwd.ui.WalletBalancePrivacyUI");
                }
                WCPaySaftyClickReportStruct wCPaySaftyClickReportStruct2 = new WCPaySaftyClickReportStruct();
                wCPaySaftyClickReportStruct2.f194681d = 16;
                wCPaySaftyClickReportStruct2.f194682e = 1;
                wCPaySaftyClickReportStruct2.mo86054n();
            }
            return false;
        } else if (this.f208930q == null) {
            return true;
        } else {
            WCPaySaftyClickReportStruct wCPaySaftyClickReportStruct3 = new WCPaySaftyClickReportStruct();
            wCPaySaftyClickReportStruct3.f194681d = 15;
            wCPaySaftyClickReportStruct3.f194682e = 1;
            wCPaySaftyClickReportStruct3.mo86054n();
            if (this.f208930q.f208968e == 2) {
                StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new StartAppBrandUIFromOuterEvent();
                StartAppBrandUIFromOuterEvent.C1142a aVar = startAppBrandUIFromOuterEvent.f9522d;
                aVar.f9534i = 0;
                C72025i iVar = this.f208930q;
                aVar.f9526a = iVar.f208970g;
                aVar.f9527b = iVar.f208971h;
                startAppBrandUIFromOuterEvent.publish();
            } else {
                Intent intent2 = new Intent();
                intent2.putExtra("rawUrl", this.f208930q.f208969f);
                Log.m105919d("MicroMsg.WalletSecuritySettingUI", "raw url: %s", intent2.getStringExtra("rawUrl"));
                intent2.putExtra(C74928u.C45093i.f122326r, true);
                C75228t.m90217J(getContext(), intent2);
            }
            return true;
        }
    }

    public void onResume() {
        super.onResume();
        WalletSecuritySettingHeaderPref walletSecuritySettingHeaderPref = (WalletSecuritySettingHeaderPref) this.f208921e.mo72519a("wallet_security_basic_info");
        this.f208922f = walletSecuritySettingHeaderPref;
        if (walletSecuritySettingHeaderPref != null) {
            C72028a0 a0Var = new C72028a0(this);
            Object[] objArr = new Object[1];
            objArr[0] = Boolean.valueOf(walletSecuritySettingHeaderPref.f208913M == null);
            Log.m105927v("MicroMsg.WalletSecuritySettingHeaderPref", "alvinluo details == null: %b", objArr);
            walletSecuritySettingHeaderPref.f208918S = a0Var;
            TextView textView = walletSecuritySettingHeaderPref.f208913M;
            if (textView != null) {
                textView.setOnClickListener(a0Var);
            }
            WalletSecuritySettingHeaderPref walletSecuritySettingHeaderPref2 = this.f208922f;
            C72030b0 b0Var = new C72030b0(this);
            Object[] objArr2 = new Object[1];
            objArr2[0] = Boolean.valueOf(walletSecuritySettingHeaderPref2.f208914N == null);
            Log.m105927v("MicroMsg.WalletSecuritySettingHeaderPref", "alvinluo closeBtn == null: %b", objArr2);
            walletSecuritySettingHeaderPref2.f208919T = b0Var;
            ImageView imageView = walletSecuritySettingHeaderPref2.f208914N;
            if (imageView != null) {
                imageView.setOnClickListener(b0Var);
            }
        }
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(385, this);
        if (this.f208920d) {
            this.f208933t = C76879j.m92723Q(this, "", getString(C0966R.string.a4d), false, false, (DialogInterface.OnCancelListener) null);
            this.f208920d = false;
        }
        boolean J3 = ((C78473a) C86709a0.m107533q(C78473a.class)).mo107880J3();
        C110260j a = C110259i.m149874a();
        String str = a.f329808a;
        String str2 = a.f329809b;
        Log.m105925i("MicroMsg.WalletSecuritySettingUI", "alvinluo getSecurityInfo isOpenTouchPay: %b", Boolean.valueOf(J3));
        C86709a0.m107524d().mo123460f(new C76390m(false, J3, str, str2));
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C72024h hVar;
        Log.m105927v("MicroMsg.WalletSecuritySettingUI", "alvinluo errType: %d, errCode: %d, errMsg: %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (yVar instanceof C76390m) {
            JSONObject jSONObject = ((C76390m) yVar).f223689d;
            Log.m105927v("MicroMsg.WalletSecuritySettingUI", "alvinluo json: %s", jSONObject);
            mo99243I7(jSONObject);
            if (jSONObject != null) {
                C85801v1 i3 = C86709a0.m107535s().mo121142i();
                C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_HAD_SHOW_WALLET_SECURITY_TIPS_BOOLEAN;
                if (!((Boolean) i3.mo119685f(aVar, Boolean.FALSE)).booleanValue()) {
                    JSONObject optJSONObject = jSONObject.optJSONObject("dialog_info");
                    if (optJSONObject == null) {
                        hVar = null;
                    } else {
                        hVar = new C72024h();
                        hVar.f208959a = optJSONObject.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                        hVar.f208960b = optJSONObject.optString("wording");
                        hVar.f208961c = optJSONObject.optString("logo");
                        hVar.f208962d = C72023g.m84462a(optJSONObject.optJSONObject("left_btn"));
                        hVar.f208963e = C72023g.m84462a(optJSONObject.optJSONObject("right_btn"));
                    }
                    if (hVar != null) {
                        C77389a aVar2 = new C77389a();
                        View inflate = LayoutInflater.from(this).inflate(C0966R.C0971layout.cgn, (ViewGroup) null, false);
                        ((CdnImageView) inflate.findViewById(C0966R.C0970id.ltw)).mo100288c(hVar.f208961c, 0, 0, C0966R.C0969drawable.cfa);
                        ((TextView) inflate.findViewById(C0966R.C0970id.ltx)).setText(hVar.f208960b);
                        aVar2.f225669z = true;
                        aVar2.f225668y = false;
                        aVar2.f225627J = inflate;
                        aVar2.f225644a = hVar.f208959a;
                        C72023g gVar = hVar.f208963e;
                        if (gVar != null && !Util.isNullOrNil(gVar.f208954a)) {
                            aVar2.f225663t = hVar.f208963e.f208954a;
                            aVar2.f225620C = new C72032c0(this, hVar);
                            aVar2.f225641X = true;
                        }
                        C72023g gVar2 = hVar.f208962d;
                        if (gVar2 != null && !Util.isNullOrNil(gVar2.f208954a)) {
                            aVar2.f225664u = hVar.f208962d.f208954a;
                            aVar2.f225621D = new C72034d0(this, hVar);
                        }
                        C77398g gVar3 = new C77398g(this, C0966R.style.a66);
                        gVar3.mo107525e(aVar2);
                        gVar3.show();
                        C86709a0.m107535s().mo121142i().mo119677K(aVar, Boolean.TRUE);
                    }
                }
            }
        }
    }
}
