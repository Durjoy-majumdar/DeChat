package com.tencent.p014mm.plugin.profile.p088ui.newbizinfo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.preference.Preference;

/* renamed from: com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoMenuPreference */
public class NewBizInfoMenuPreference extends Preference {

    /* renamed from: J */
    public MMActivity f20300J;

    public NewBizInfoMenuPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20300J = (MMActivity) context;
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(C0966R.C0970id.f357769bn0);
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
    }

    public NewBizInfoMenuPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f20300J = (MMActivity) context;
    }
}
