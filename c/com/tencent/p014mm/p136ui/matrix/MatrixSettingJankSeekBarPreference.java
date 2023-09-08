package com.tencent.p014mm.p136ui.matrix;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;

/* renamed from: com.tencent.mm.ui.matrix.MatrixSettingJankSeekBarPreference */
public class MatrixSettingJankSeekBarPreference extends MatrixSettingAbsSeekBarPreference {

    /* renamed from: R */
    public int f56341R = 700;

    public MatrixSettingJankSeekBarPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: I */
    public int mo26274I() {
        return (int) ((((float) this.f56341R) * 100.0f) / 5000.0f);
    }

    /* renamed from: J */
    public void mo26275J(int i) {
        super.mo26275J(i);
        this.f56341R = Math.max(17, (int) ((((float) i) * 5000.0f) / 100.0f));
        String string = this.f121274d.getResources().getString(C0966R.string.gq4, new Object[]{Integer.valueOf(this.f56341R)});
        this.f56334K = string;
        TextView textView = this.f56338P;
        if (textView != null) {
            textView.setText(string);
        }
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        mo26273A(view.getResources().getString(C0966R.string.gq5));
        String string = this.f121274d.getResources().getString(C0966R.string.gq4, new Object[]{Integer.valueOf(this.f56341R)});
        this.f56334K = string;
        TextView textView = this.f56338P;
        if (textView != null) {
            textView.setText(string);
        }
    }

    public MatrixSettingJankSeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MatrixSettingJankSeekBarPreference(Context context) {
        super(context);
    }
}
