package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.C73244a;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.plugin.setting.model.UserAuthItemParcelable;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import java.util.ArrayList;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import pj3.C47511g;
import qo3.C89779i0;
import xm2.C53386q;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsModifyUserAuthUI */
public class SettingsModifyUserAuthUI extends MMPreference implements C11385n {

    /* renamed from: d */
    public C73244a f116326d;

    /* renamed from: e */
    public String f116327e;

    /* renamed from: f */
    public int f116328f;

    /* renamed from: g */
    public C89779i0 f116329g;

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsModifyUserAuthUI$a */
    public class C42965a implements MenuItem.OnMenuItemClickListener {
        public C42965a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SettingsModifyUserAuthUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsModifyUserAuthUI$b */
    public class C42966b implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C53386q f116331d;

        public C42966b(SettingsModifyUserAuthUI settingsModifyUserAuthUI, C53386q qVar) {
            this.f116331d = qVar;
        }

        public void onCancel(DialogInterface dialogInterface) {
            C86709a0.m107524d().mo123458d(this.f116331d);
        }
    }

    public int getResourceId() {
        return -1;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f116326d = (C73244a) getPreferenceScreen();
        ArrayList<UserAuthItemParcelable> parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("app_auth_items");
        this.f116327e = getIntent().getStringExtra("app_id");
        this.f116328f = getIntent().getIntExtra("modify_scene", 1);
        if (parcelableArrayListExtra != null && !parcelableArrayListExtra.isEmpty()) {
            for (UserAuthItemParcelable userAuthItemParcelable : parcelableArrayListExtra) {
                CheckBoxPreference checkBoxPreference = new CheckBoxPreference(this);
                checkBoxPreference.mo69924H(userAuthItemParcelable.f116218e);
                if (userAuthItemParcelable.f116217d.equals("snsapi_friend")) {
                    checkBoxPreference.mo7740D(C0966R.string.iq6);
                }
                checkBoxPreference.mo26273A(userAuthItemParcelable.f116217d);
                checkBoxPreference.f24210J = userAuthItemParcelable.f116219f == 1;
                checkBoxPreference.f121290w = false;
                this.f116326d.mo72524h(checkBoxPreference, -1);
            }
        }
        setMMTitle(getIntent().getStringExtra("app_name"));
        setBackBtn(new C42965a());
    }

    public void onPause() {
        super.onPause();
        C86709a0.m107524d().mo123470p(1144, this);
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        C53386q qVar = new C53386q(this.f116327e, preference.f121285r, ((CheckBoxPreference) preference).mo6804J() ? 1 : 2, this.f116328f);
        C86709a0.m107524d().mo123460f(qVar);
        this.f116329g = C76879j.m92723Q(this, "", getString(C0966R.string.a2w), false, true, new C42966b(this, qVar));
        return true;
    }

    public void onResume() {
        super.onResume();
        C86709a0.m107524d().mo123455a(1144, this);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        boolean z = false;
        Log.m105925i("MicroMsg.SettingsModifyUserAuthUI", "errCode %d, errMsg %s", Integer.valueOf(i2), str);
        C89779i0 i0Var = this.f116329g;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        if (i == 0 && i2 == 0) {
            C53386q qVar = (C53386q) yVar;
            String str2 = qVar.f150219f;
            int i3 = qVar.f150220g;
            if (!Util.isNullOrNil(str2)) {
                CheckBoxPreference checkBoxPreference = (CheckBoxPreference) this.f116326d.mo72519a(str2);
                if (i3 == 1) {
                    z = true;
                }
                checkBoxPreference.mo6805K(z);
                return;
            }
            return;
        }
        C76879j.m92726T(this, str);
    }
}
