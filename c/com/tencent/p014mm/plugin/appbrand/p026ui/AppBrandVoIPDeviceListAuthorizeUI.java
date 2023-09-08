package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.os.Bundle;
import as0.C39634b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.Iterator;
import ob0.C47350c;
import ob0.C89144l0;
import pj3.C47511g;
import te3.C50911q40;
import te3.q65;
import te3.r65;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandVoIPDeviceListAuthorizeUI */
public class AppBrandVoIPDeviceListAuthorizeUI extends MMPreference {

    /* renamed from: d */
    public C47511g f108912d;

    /* renamed from: e */
    public String f108913e = "";

    /* renamed from: f */
    public ArrayList<C50911q40> f108914f;

    /* renamed from: H7 */
    public final String mo63395H7(C50911q40 q402) {
        String str = q402.f140124e;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String str3 = q402.f140123d;
        if (str3 != null) {
            str2 = str3;
        }
        return str + str2;
    }

    public int getResourceId() {
        return C0966R.xml.f8855e;
    }

    public void onBackPressed() {
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        fixStatusbar(true);
        super.onCreate(bundle);
        this.f108913e = getIntent().getStringExtra("appid");
        ArrayList<C50911q40> arrayList = C39634b.f106396a;
        this.f108914f = C39634b.f106396a;
        setBackBtn(new C40562y3(this));
        if (getIntent() == null || Util.isNullOrNil(getIntent().getStringExtra("key_title"))) {
            setMMTitle((int) C0966R.string.f7618lm);
        } else {
            setMMTitle(getIntent().getStringExtra("key_title"));
        }
        C47511g preferenceScreen = getPreferenceScreen();
        this.f108912d = preferenceScreen;
        preferenceScreen.removeAll();
        Iterator<C50911q40> it = this.f108914f.iterator();
        while (it.hasNext()) {
            C50911q40 next = it.next();
            CheckBoxPreference checkBoxPreference = new CheckBoxPreference(this);
            boolean z = false;
            checkBoxPreference.f121290w = false;
            checkBoxPreference.mo26273A(mo63395H7(next));
            checkBoxPreference.mo69924H(next.f140125f);
            if (next.f140126g == 1) {
                z = true;
            }
            checkBoxPreference.f24210J = z;
            this.f108912d.mo72527k(checkBoxPreference);
        }
        this.f108912d.notifyDataSetChanged();
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        Log.m105925i("MicroMsg.AppBrandVoIPDeviceListAuthorizeUI", "click key :%s", preference.f121285r);
        Iterator<C50911q40> it = this.f108914f.iterator();
        while (it.hasNext()) {
            C50911q40 next = it.next();
            if (mo63395H7(next).equals(preference.f121285r)) {
                next.f140126g = ((CheckBoxPreference) preference).mo6804J() ? 1 : 0;
                C47350c.C47352b bVar = new C47350c.C47352b();
                bVar.f127066a = new q65();
                bVar.f127067b = new r65();
                bVar.f127068c = "/cgi-bin/mmbiz-bin/wxaapp_modvoipdeviceauth";
                bVar.f127069d = 2522;
                bVar.f127070e = 0;
                bVar.f127071f = 0;
                q65 q65 = new q65();
                q65.f140163d = this.f108913e;
                String str = next.f140123d;
                q65.f140164e = str;
                String str2 = next.f140124e;
                q65.f140165f = str2;
                int i = next.f140126g;
                q65.f140166g = i;
                Log.m105925i("MicroMsg.AppBrandVoIPDeviceListAuthorizeUI", "modifyAuthVoipDevice model_id:%s, name:%s, sn:%s, status:%d", str, next.f140125f, str2, Integer.valueOf(i));
                bVar.f127066a = q65;
                C89144l0.m111430f(bVar.mo72403a(), new C40565z3(this), true, this);
                return true;
            }
        }
        return false;
    }
}
