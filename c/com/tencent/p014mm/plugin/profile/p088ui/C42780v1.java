package com.tencent.p014mm.plugin.profile.p088ui;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.profile.p088ui.HelperHeaderPreference;
import eb0.C75592q0;

/* renamed from: com.tencent.mm.plugin.profile.ui.v1 */
public class C42780v1 implements HelperHeaderPreference.C42607a {

    /* renamed from: a */
    public Context f115826a;

    public C42780v1(Context context) {
        this.f115826a = context;
    }

    /* renamed from: a */
    public void mo66739a(HelperHeaderPreference helperHeaderPreference) {
        helperHeaderPreference.mo66738K((C75592q0.m90785o() & 32768) == 0);
    }

    public CharSequence getHint() {
        return this.f115826a.getString(C0966R.string.bmm);
    }

    public void onDetach() {
    }
}
