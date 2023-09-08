package com.tencent.p014mm.plugin.account.p024ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;

/* renamed from: com.tencent.mm.plugin.account.ui.MMKeyboardUperView */
public class MMKeyboardUperView extends ScrollView {

    /* renamed from: d */
    public View f10735d;

    public MMKeyboardUperView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setupUperView(View view) {
        this.f10735d = view;
    }

    public MMKeyboardUperView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
