package com.tencent.p014mm.p136ui.base.preference;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: com.tencent.mm.ui.base.preference.SummaryTextPreference */
public class SummaryTextPreference extends Preference {

    /* renamed from: J */
    public TextView f24293J;

    /* renamed from: K */
    public String f24294K = null;

    public SummaryTextPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        this.f24293J = (TextView) view.findViewById(16908304);
        if (!TextUtils.isEmpty(this.f24294K)) {
            try {
                this.f24293J.setTypeface(Typeface.createFromAsset(MMApplicationContext.getContext().getAssets(), this.f24294K));
                Log.m105925i("MicroMsg.SummaryTextPreference", "setTypeface assets: %s", this.f24294K);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.SummaryTextPreference", "setTypeface assets path exception:%s %s", e.getClass().getSimpleName(), e.getMessage());
            }
        }
    }

    public SummaryTextPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SummaryTextPreference(Context context) {
        super(context);
    }
}
