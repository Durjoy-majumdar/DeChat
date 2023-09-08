package com.tencent.p014mm.p136ui.matrix;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;

/* renamed from: com.tencent.mm.ui.matrix.MatrixSettingTopThreadSeekBarPreference */
public class MatrixSettingTopThreadSeekBarPreference extends MatrixSettingAbsSeekBarPreference {
    public MatrixSettingTopThreadSeekBarPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: I */
    public int mo26274I() {
        return 1;
    }

    /* renamed from: J */
    public void mo26275J(int i) {
        String str;
        super.mo26275J(i);
        if (i == 0) {
            str = "1 s";
        } else if (i == 1) {
            str = "5 s";
        } else if (i == 2) {
            str = "10 s";
        } else if (i == 3) {
            str = "1 min";
        } else if (i == 4) {
            str = "10 min";
        } else if (i != 5) {
            str = i + " s";
        } else {
            str = "30 min";
        }
        this.f56334K = str;
        TextView textView = this.f56338P;
        if (textView != null) {
            textView.setText(str);
        }
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        mo26273A(view.getResources().getString(C0966R.string.m8u));
        this.f56336M.setMax(5);
    }

    public MatrixSettingTopThreadSeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MatrixSettingTopThreadSeekBarPreference(Context context) {
        super(context);
    }
}
