package com.tencent.p014mm.plugin.profile.p088ui;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.profile.p088ui.HelperHeaderPreference;

/* renamed from: com.tencent.mm.plugin.profile.ui.t1 */
public class C42679t1 implements HelperHeaderPreference.C42607a {

    /* renamed from: a */
    public final Context f115536a;

    public C42679t1(Context context) {
        this.f115536a = context;
    }

    /* renamed from: a */
    public void mo66739a(HelperHeaderPreference helperHeaderPreference) {
        helperHeaderPreference.mo66738K(true);
    }

    public CharSequence getHint() {
        return this.f115536a.getString(C0966R.string.bmt);
    }

    public void onDetach() {
    }
}
