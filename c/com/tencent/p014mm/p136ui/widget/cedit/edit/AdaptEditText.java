package com.tencent.p014mm.p136ui.widget.cedit.edit;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatEditText;

/* renamed from: com.tencent.mm.ui.widget.cedit.edit.AdaptEditText */
public class AdaptEditText extends AppCompatEditText {
    public AdaptEditText(Context context) {
        super(context);
    }

    public boolean hasFocus() {
        return true;
    }

    public AdaptEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AdaptEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
