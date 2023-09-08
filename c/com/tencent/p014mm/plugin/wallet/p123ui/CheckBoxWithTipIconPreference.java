package com.tencent.p014mm.plugin.wallet.p123ui;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;

/* renamed from: com.tencent.mm.plugin.wallet.ui.CheckBoxWithTipIconPreference */
public class CheckBoxWithTipIconPreference extends CheckBoxPreference {

    /* renamed from: Y */
    public TextView f21828Y;

    /* renamed from: Z */
    public int f21829Z;

    /* renamed from: p0 */
    public String f21830p0;

    /* renamed from: x0 */
    public int f21831x0;

    public CheckBoxWithTipIconPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: L */
    public void mo6806L(String str, int i) {
        this.f21829Z = i;
        this.f21830p0 = str;
        TextView textView = this.f21828Y;
        if (textView != null) {
            if (i > 0) {
                textView.setBackgroundResource(i);
            }
            if (!TextUtils.isEmpty(this.f21830p0)) {
                this.f21828Y.setText(this.f21830p0);
            }
        }
    }

    /* renamed from: M */
    public void mo6807M(int i) {
        this.f21831x0 = i;
        TextView textView = this.f21828Y;
        if (textView != null) {
            textView.setVisibility(i);
        }
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        this.f21828Y = (TextView) view.findViewById(C0966R.C0970id.kmw);
        mo6806L(this.f21830p0, this.f21829Z);
        mo6807M(this.f21831x0);
    }

    public CheckBoxWithTipIconPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f21829Z = -1;
        this.f21830p0 = "";
        this.f21831x0 = 8;
        this.f121271G = C0966R.C0971layout.bf_;
    }
}
