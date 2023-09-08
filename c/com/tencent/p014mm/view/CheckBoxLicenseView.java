package com.tencent.p014mm.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import zp3.C16381d;

/* renamed from: com.tencent.mm.view.CheckBoxLicenseView */
public class CheckBoxLicenseView extends LinearLayout {

    /* renamed from: d */
    public CompoundButton.OnCheckedChangeListener f24915d;

    /* renamed from: e */
    public View.OnClickListener f24916e;

    public CheckBoxLicenseView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public void setCheckStateChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f24915d = onCheckedChangeListener;
        ((CheckBox) findViewById(C0966R.C0970id.kh6)).setOnCheckedChangeListener(onCheckedChangeListener);
    }

    public void setLicenseClickListener(View.OnClickListener onClickListener) {
        this.f24916e = onClickListener;
        ((TextView) findViewById(C0966R.C0970id.kh9)).setOnClickListener(onClickListener);
    }

    public void setTermText(CharSequence charSequence) {
        ((TextView) findViewById(C0966R.C0970id.kh9)).setText(charSequence);
    }

    public void setTermTip(CharSequence charSequence) {
        ((TextView) findViewById(C0966R.C0970id.kh8)).setText(charSequence);
    }

    public CheckBoxLicenseView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View inflate = View.inflate(getContext(), C0966R.C0971layout.f7036vp, this);
        View findViewById = inflate.findViewById(C0966R.C0970id.kh5);
        CheckBox checkBox = (CheckBox) inflate.findViewById(C0966R.C0970id.kh6);
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.kh9);
        findViewById.setOnClickListener(new C16381d(this, checkBox));
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f24915d;
        if (onCheckedChangeListener != null) {
            checkBox.setOnCheckedChangeListener(onCheckedChangeListener);
        }
        View.OnClickListener onClickListener = this.f24916e;
        if (onClickListener != null) {
            textView.setOnClickListener(onClickListener);
        }
    }
}
