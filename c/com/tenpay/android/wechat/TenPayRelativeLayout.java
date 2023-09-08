package com.tenpay.android.wechat;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.tenpay.C7112R;

public class TenPayRelativeLayout extends RelativeLayout {
    private String accessibilityClassName;

    public TenPayRelativeLayout(Context context) {
        super(context);
        init(context, (AttributeSet) null);
    }

    private void init(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7112R.styleable.TenPayRelativeLayout);
            this.accessibilityClassName = obtainStyledAttributes.getString(C7112R.styleable.TenPayRelativeLayout_TenPayAccessibilityClassName);
            obtainStyledAttributes.recycle();
        }
    }

    public CharSequence getAccessibilityClassName() {
        return TextUtils.isEmpty(this.accessibilityClassName) ? super.getAccessibilityClassName() : this.accessibilityClassName;
    }

    public TenPayRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    public TenPayRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet);
    }

    public TenPayRelativeLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init(context, attributeSet);
    }
}
