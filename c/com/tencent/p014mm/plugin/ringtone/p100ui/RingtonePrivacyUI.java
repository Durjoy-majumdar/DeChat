package com.tencent.p014mm.plugin.ringtone.p100ui;

import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import g62.C32330n;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Map;
import kg3.C76577a;
import kotlin.Metadata;
import pj3.C47511g;
import tc0.C77885p;
import te3.C64266br1;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/ringtone/ui/RingtonePrivacyUI;", "Lcom/tencent/mm/ui/base/preference/MMPreference;", "<init>", "()V", "plugin-ringtone_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.ringtone.ui.RingtonePrivacyUI */
public final class RingtonePrivacyUI extends MMPreference {

    /* renamed from: d */
    public C47511g f20541d;

    /* renamed from: e */
    public long f20542e = C75592q0.m90780j();

    /* renamed from: f */
    public final HashMap<Integer, Integer> f20543f = new HashMap<>();

    /* renamed from: com.tencent.mm.plugin.ringtone.ui.RingtonePrivacyUI$a */
    public static final class C5149a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ RingtonePrivacyUI f20544d;

        public C5149a(RingtonePrivacyUI ringtonePrivacyUI) {
            this.f20544d = ringtonePrivacyUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f20544d.finish();
            return true;
        }
    }

    public int getResourceId() {
        return C0966R.xml.f8931dh;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(C76577a.m92166q(this, C0966R.string.mtu));
        setBackBtn(new C5149a(this));
        C47511g preferenceScreen = getPreferenceScreen();
        C87412m.m108593f(preferenceScreen, "preferenceScreen");
        this.f20541d = preferenceScreen;
        Preference a = preferenceScreen.mo72519a("recommend_switch");
        C87412m.m108592e(a, "null cannot be cast to non-null type com.tencent.mm.ui.base.preference.CheckBoxPreference");
        ((CheckBoxPreference) a).mo6805K((this.f20542e & 2048) == 0);
    }

    public void onPause() {
        super.onPause();
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_EXT_STATUS2_LONG_SYNC, Long.valueOf(this.f20542e));
        for (Map.Entry next : this.f20543f.entrySet()) {
            int intValue = ((Number) next.getKey()).intValue();
            int intValue2 = ((Number) next.getValue()).intValue();
            C64266br1 br12 = new C64266br1();
            br12.f182324d = intValue;
            br12.f182325e = intValue2;
            ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C32330n(23, br12));
            Log.m105918d("MicroMsg.RingtonePrivacyUI", "switch " + intValue + ' ' + intValue2);
        }
        this.f20543f.clear();
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        if (!C87412m.m108589b(preference != null ? preference.f121285r : null, "recommend_switch")) {
            return false;
        }
        Log.m105924i("MicroMsg.RingtonePrivacyUI", "onRecommendSwitch");
        C47511g gVar2 = this.f20541d;
        if (gVar2 != null) {
            Preference a = gVar2.mo72519a("recommend_switch");
            C87412m.m108592e(a, "null cannot be cast to non-null type com.tencent.mm.ui.base.preference.CheckBoxPreference");
            boolean J = ((CheckBoxPreference) a).mo6804J();
            Log.m105924i("MicroMsg.RingtonePrivacyUI", "switchChange isOpen:" + J + ", itemValue:" + 2048 + ", functionId:" + 80);
            this.f20542e = J ? this.f20542e & -2049 : 2048 | this.f20542e;
            this.f20543f.put(80, Integer.valueOf(J ? 1 : 2));
            return true;
        }
        C87412m.m108603p("screen");
        throw null;
    }
}
