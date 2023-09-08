package com.tencent.p014mm.plugin.setting.p102ui.setting;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.C73244a;
import com.tencent.p014mm.p136ui.base.preference.SummaryTextPreference;
import m53.C10762h;
import pj3.C47511g;
import te3.C50943qc2;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.z2 */
public class C5413z2 implements C10762h<C50943qc2> {

    /* renamed from: a */
    public final /* synthetic */ SummaryTextPreference f21099a;

    /* renamed from: b */
    public final /* synthetic */ String f21100b;

    /* renamed from: c */
    public final /* synthetic */ SettingsPersonalInfoUI f21101c;

    public C5413z2(SettingsPersonalInfoUI settingsPersonalInfoUI, SummaryTextPreference summaryTextPreference, String str) {
        this.f21101c = settingsPersonalInfoUI;
        this.f21099a = summaryTextPreference;
        this.f21100b = str;
    }

    /* renamed from: a */
    public void mo605a(int i, int i2, String str) {
    }

    public void onSuccess(Object obj) {
        String str;
        C50943qc2 qc22 = (C50943qc2) obj;
        if (qc22.f140242e) {
            str = this.f21101c.getString(C0966R.string.f361305m60);
        } else if (qc22.f140241d > 0) {
            str = qc22.f140241d + " " + this.f21101c.getString(C0966R.string.j2b);
        } else {
            str = "";
        }
        this.f21099a.mo7741E(str);
        if (!str.equals(this.f21100b)) {
            C47511g gVar = this.f21101c.f20912d;
            if (gVar instanceof C73244a) {
                ((C73244a) gVar).notifyDataSetChanged();
            }
        }
    }
}
