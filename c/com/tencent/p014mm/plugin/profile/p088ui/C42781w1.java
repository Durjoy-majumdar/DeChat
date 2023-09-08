package com.tencent.p014mm.plugin.profile.p088ui;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.profile.p088ui.HelperHeaderPreference;
import com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel;
import eb0.C75592q0;

/* renamed from: com.tencent.mm.plugin.profile.ui.w1 */
public class C42781w1 implements HelperHeaderPreference.C42607a {

    /* renamed from: a */
    public Context f115827a;

    public C42781w1(Context context) {
        this.f115827a = context;
    }

    /* renamed from: a */
    public void mo66739a(HelperHeaderPreference helperHeaderPreference) {
        helperHeaderPreference.mo66738K((C75592q0.m90785o() & TPMediaCodecProfileLevel.HEVCMainTierLevel62) == 0);
    }

    public CharSequence getHint() {
        return this.f115827a.getString(C0966R.string.bnt);
    }

    public void onDetach() {
    }
}
