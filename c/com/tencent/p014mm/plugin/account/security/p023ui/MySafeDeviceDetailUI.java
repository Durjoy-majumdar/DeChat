package com.tencent.p014mm.plugin.account.security.p023ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.ButtonPreference;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import com.tencent.xweb.util.XWebCleaner;
import di3.C86312j;
import f40.C86709a0;
import ft3.C8206g;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import kg3.C76577a;
import kotlin.Metadata;
import l31.C61212e;
import nj3.C76879j;
import o31.C11345b;
import ob0.C11385n;
import ob0.C117747y;
import p156gj.C87203t;
import p214om.C11502f;
import p910lj.C76701a;
import pj3.C47511g;
import rg0.C12997b;
import rg0.C12999d;
import rg0.C13000e;
import rg0.C13003h;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C90364q0;
import ug0.C22644a;
import ug0.C22646b;
import ug0.C22647c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/account/security/ui/MySafeDeviceDetailUI;", "Lcom/tencent/mm/ui/base/preference/MMPreference;", "Lob0/n;", "<init>", "()V", "account-security_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.account.security.ui.MySafeDeviceDetailUI */
public final class MySafeDeviceDetailUI extends MMPreference implements C11385n {

    /* renamed from: j */
    public static final /* synthetic */ int f49167j = 0;

    /* renamed from: d */
    public String f49168d = "";

    /* renamed from: e */
    public final C13601g f49169e = C36568h.m40985a(new C17839b(this));

    /* renamed from: f */
    public final C13601g f49170f = C36568h.m40985a(new C17838a(this));

    /* renamed from: g */
    public final C13601g f49171g = C36568h.m40985a(new C17841d(this));

    /* renamed from: h */
    public final C13601g f49172h = C36568h.m40985a(new C17840c(this));

    /* renamed from: i */
    public ProgressDialog f49173i;

    /* renamed from: com.tencent.mm.plugin.account.security.ui.MySafeDeviceDetailUI$a */
    public static final class C17838a extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ MySafeDeviceDetailUI f49174d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17838a(MySafeDeviceDetailUI mySafeDeviceDetailUI) {
            super(0);
            this.f49174d = mySafeDeviceDetailUI;
        }

        public Object invoke() {
            String stringExtra = this.f49174d.getIntent().getStringExtra("INTENT_Device_Type");
            return stringExtra == null ? "" : stringExtra;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.security.ui.MySafeDeviceDetailUI$b */
    public static final class C17839b extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ MySafeDeviceDetailUI f49175d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17839b(MySafeDeviceDetailUI mySafeDeviceDetailUI) {
            super(0);
            this.f49175d = mySafeDeviceDetailUI;
        }

        public Object invoke() {
            String stringExtra = this.f49175d.getIntent().getStringExtra("INTENT_Device_Uid");
            return stringExtra == null ? "" : stringExtra;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.security.ui.MySafeDeviceDetailUI$c */
    public static final class C17840c extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ MySafeDeviceDetailUI f49176d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17840c(MySafeDeviceDetailUI mySafeDeviceDetailUI) {
            super(0);
            this.f49176d = mySafeDeviceDetailUI;
        }

        public Object invoke() {
            return Boolean.valueOf(this.f49176d.getIntent().getBooleanExtra("INTENT_Device_IsOnline", false));
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.security.ui.MySafeDeviceDetailUI$d */
    public static final class C17841d extends C87413o implements C32224a<Long> {

        /* renamed from: d */
        public final /* synthetic */ MySafeDeviceDetailUI f49177d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17841d(MySafeDeviceDetailUI mySafeDeviceDetailUI) {
            super(0);
            this.f49177d = mySafeDeviceDetailUI;
        }

        public Object invoke() {
            return Long.valueOf(this.f49177d.getIntent().getLongExtra("INTENT_Device_LastActiveTime", 0));
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.security.ui.MySafeDeviceDetailUI$e */
    public static final class C17842e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ MySafeDeviceDetailUI f49178d;

        public C17842e(MySafeDeviceDetailUI mySafeDeviceDetailUI) {
            this.f49178d = mySafeDeviceDetailUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f49178d.finish();
            return true;
        }
    }

    /* renamed from: H7 */
    public final boolean mo22056H7() {
        return C8206g.f27135a.mo9260a((String) ((C36570n) this.f49169e).getValue(), C87203t.m108273i(), "MySafeDeviceListUI", false);
    }

    /* renamed from: I7 */
    public final boolean mo22057I7() {
        return ((Boolean) ((C36570n) this.f49172h).getValue()).booleanValue();
    }

    /* renamed from: J7 */
    public final void mo22058J7() {
        getPreferenceScreen().mo72519a("detail_device_name").mo7741E(this.f49168d);
        Preference a = getPreferenceScreen().mo72519a("detail_device_type");
        a.mo7741E((String) ((C36570n) this.f49170f).getValue());
        a.mo69921C(8);
        Preference a2 = getPreferenceScreen().mo72519a("detail_device_last_active_time");
        a2.mo7741E(C72715f.m85112e(getContext(), ((Number) ((C36570n) this.f49171g).getValue()).longValue() * ((long) 1000), false).toString());
        a2.mo69921C(8);
        Preference a3 = getPreferenceScreen().mo72519a("my_safe_device_detail_delete");
        C87412m.m108592e(a3, "null cannot be cast to non-null type com.tencent.mm.ui.base.preference.ButtonPreference");
        ButtonPreference buttonPreference = (ButtonPreference) a3;
        buttonPreference.mo101917K(getString(C0966R.string.nfc), buttonPreference.f121274d.getResources().getColor(C0966R.color.f2966ao));
        if (mo22057I7()) {
            getPreferenceScreen().mo72529n("detail_device_last_active_time", true);
            getPreferenceScreen().mo72529n("my_safe_device_detail_tip", true);
            getPreferenceScreen().mo72529n("small_divider2", true);
        }
        if (mo22056H7()) {
            getPreferenceScreen().mo72529n("detail_device_last_active_time", true);
            getPreferenceScreen().mo72529n("my_safe_device_detail_delete", true);
        }
        getPreferenceScreen().notifyDataSetChanged();
    }

    public int getResourceId() {
        return C0966R.xml.f8936dj;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.nfh);
        String stringExtra = getIntent().getStringExtra("INTENT_Device_Name");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f49168d = stringExtra;
        setBackBtn(new C17842e(this));
        mo22058J7();
        C61212e eVar = (C61212e) C86312j.m106911c(C61212e.class);
        eVar.mo86178qr(this, C11345b.MySafeDeviceDetailUI);
        eVar.mo86136FZ(this, "MySafeDeviceDetailUI");
        eVar.mo86148No(this, 4, 28198);
        C86709a0.m107524d().mo123455a(361, this);
        C86709a0.m107524d().mo123455a(XWebCleaner.MIN_APK_VERSION_HAS_RESOURCE_CONFIG_FILE, this);
    }

    public void onDestroy() {
        super.onDestroy();
        C86709a0.m107524d().mo123470p(361, this);
        C86709a0.m107524d().mo123470p(XWebCleaner.MIN_APK_VERSION_HAS_RESOURCE_CONFIG_FILE, this);
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        String str;
        Preference preference2 = preference;
        Class cls = C61212e.class;
        if (gVar == null || preference2 == null) {
            return true;
        }
        String str2 = preference2.f121285r;
        if (C87412m.m108589b(str2, "detail_device_name")) {
            ((C61212e) C86312j.m106911c(cls)).mo86153W7("view_clk", preference2, C90364q0.m113147f(new C13604l("view_id", "change_device_name_enter"), new C13604l("is_login", Integer.valueOf(mo22057I7() ? 1 : 0)), new C13604l("is_main_device", Integer.valueOf(mo22056H7() ? 1 : 0))), 28198);
            C76879j.m92720N(getContext(), getString(C0966R.string.f361224ia1), this.f49168d, getString(C0966R.string.ia4), -1, new C22647c(this));
            return true;
        } else if (!C87412m.m108589b(str2, "my_safe_device_detail_delete")) {
            return false;
        } else {
            ((C61212e) C86312j.m106911c(cls)).mo86153W7("view_clk", preference2, C90364q0.m113147f(new C13604l("view_id", "delete_device_btn"), new C13604l("is_login", Integer.valueOf(mo22057I7() ? 1 : 0)), new C13604l("is_main_device", Integer.valueOf(mo22056H7() ? 1 : 0))), 28198);
            AppCompatActivity context = getContext();
            if (mo22057I7()) {
                str = getContext().getString(C0966R.string.nfb);
                C87412m.m108593f(str, "{\n            context.ge…line_del_title)\n        }");
            } else {
                str = getContext().getString(C0966R.string.nfa);
                C87412m.m108593f(str, "{\n            context.ge…line_del_title)\n        }");
            }
            C76879j.m92707A(context, str, "", C76577a.m92166q(getContext(), C0966R.string.i_x), C76577a.m92166q(getContext(), C0966R.string.f7926wf), new C22644a(this), new C22646b(this)).mo107526f(-1).setTextColor(getContext().getResources().getColor(C0966R.color.f2966ao));
            return true;
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        int i3 = i;
        int i4 = i2;
        C117747y yVar2 = yVar;
        Class cls = C11502f.class;
        String str2 = "";
        if ((yVar2 != null && yVar.getType() == 361) && (yVar2 instanceof C12999d)) {
            String str3 = str == null ? str2 : str;
            C12999d dVar = (C12999d) yVar2;
            ProgressDialog progressDialog = this.f49173i;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
            this.f49173i = null;
            if (i3 == 0 && i4 == 0) {
                C13003h.vx0().update(dVar.f37061f, new String[0]);
                C13000e eVar = dVar.f37061f;
                C87412m.m108593f(eVar, "scene.deviceInfo");
                String str4 = eVar.field_name;
                C87412m.m108593f(str4, "deviceInfo.field_name");
                this.f49168d = str4;
                mo22058J7();
                C76879j.m92726T(this, C76577a.m92166q(this, C0966R.string.ia5));
                ((C61212e) C86312j.m106911c(C61212e.class)).mo86153W7("view_clk", dVar, C90364q0.m113147f(new C13604l("view_id", "change_device_name_succ"), new C13604l("is_login", Integer.valueOf(mo22057I7() ? 1 : 0)), new C13604l("is_main_device", Integer.valueOf(mo22056H7() ? 1 : 0))), 28198);
            } else {
                ((C11502f) C86312j.m106911c(cls)).mo11461Sr().mo93163uP(this, i3, i4, str3);
            }
            mo22058J7();
        }
        if ((yVar2 != null && yVar.getType() == 362) && (yVar2 instanceof C12997b)) {
            if (str != null) {
                str2 = str;
            }
            C12997b bVar = (C12997b) yVar2;
            ProgressDialog progressDialog2 = this.f49173i;
            if (progressDialog2 != null) {
                progressDialog2.dismiss();
            }
            this.f49173i = null;
            if (i4 == 0 && i4 == 0) {
                C13003h.vx0().delete(new C13000e((String) ((C36570n) this.f49169e).getValue(), this.f49168d, (String) ((C36570n) this.f49170f).getValue(), ((Number) ((C36570n) this.f49171g).getValue()).longValue(), mo22057I7()), new String[0]);
                finish();
            } else if (!((C11502f) C86312j.m106911c(cls)).mo11461Sr().mo93163uP(getContext(), i3, i4, str2)) {
                C76701a.makeText((Context) getContext(), (CharSequence) getContext().getString(C0966R.string.i_y, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}), 0).show();
            }
        }
    }
}
