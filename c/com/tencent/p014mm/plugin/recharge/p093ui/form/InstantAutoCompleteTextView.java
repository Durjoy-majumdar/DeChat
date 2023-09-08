package com.tencent.p014mm.plugin.recharge.p093ui.form;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.AutoCompleteTextView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.recharge.ui.form.InstantAutoCompleteTextView */
public class InstantAutoCompleteTextView extends AutoCompleteTextView {

    /* renamed from: d */
    public boolean f203620d;

    public InstantAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void dismissDropDown() {
        super.dismissDropDown();
        Log.m105918d("TestAutoCompleteTextView", "dismiss");
    }

    public boolean enoughToFilter() {
        return this.f203620d || super.enoughToFilter();
    }

    public void setShowAlways(boolean z) {
        this.f203620d = z;
    }

    public InstantAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
