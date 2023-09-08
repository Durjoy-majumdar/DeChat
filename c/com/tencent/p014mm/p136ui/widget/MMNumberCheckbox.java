package com.tencent.p014mm.p136ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckBox;

/* renamed from: com.tencent.mm.ui.widget.MMNumberCheckbox */
public class MMNumberCheckbox extends AppCompatCheckBox {

    /* renamed from: e */
    public int f285486e;

    public MMNumberCheckbox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public int getNumber() {
        return this.f285486e;
    }

    public void setChecked(boolean z) {
        int i;
        super.setChecked(z);
        if (z && (i = this.f285486e) > 0 && !String.valueOf(i).contentEquals(getText())) {
            setText(String.valueOf(this.f285486e));
        }
        if (!z) {
            this.f285486e = 0;
            setText("");
        }
    }

    public void setCheckedNumber(int i) {
        if (i > 0 && i != this.f285486e) {
            this.f285486e = i;
            setText(String.valueOf(i));
            setChecked(true);
        }
    }

    public void setNumber(int i) {
        if (this.f285486e > 0) {
            this.f285486e = i;
        }
    }

    public MMNumberCheckbox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
