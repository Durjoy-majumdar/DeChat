package com.tencent.p014mm.p136ui.base;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import kg3.C76577a;

/* renamed from: com.tencent.mm.ui.base.MMImageButton */
public class MMImageButton extends FrameLayout {

    /* renamed from: d */
    public TextView f24196d;

    /* renamed from: e */
    public ImageView f24197e;

    public MMImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f24196d.setEnabled(z);
        this.f24197e.setEnabled(z);
    }

    public void setImageDrawable(Drawable drawable) {
        this.f24197e.setImageDrawable(drawable);
        this.f24197e.setVisibility(0);
        this.f24196d.setVisibility(8);
    }

    public void setImageRsource(int i) {
        setImageDrawable(C76577a.m92158i(getContext(), i));
    }

    public void setText(String str) {
        this.f24196d.setText(str);
        this.f24196d.setVisibility(0);
        this.f24197e.setVisibility(8);
    }

    public MMImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        ImageView imageView = new ImageView(context);
        this.f24197e = imageView;
        imageView.setLayoutParams(layoutParams);
        addView(this.f24197e);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        TextView textView = new TextView(context);
        this.f24196d = textView;
        textView.setLayoutParams(layoutParams2);
        this.f24196d.setClickable(false);
        this.f24196d.setFocusable(false);
        this.f24196d.setFocusableInTouchMode(false);
        this.f24196d.setTextColor(C76577a.m92154e(context, C0966R.color.a54));
        addView(this.f24196d);
    }

    public void setText(int i) {
        this.f24196d.setText(i);
        this.f24196d.setVisibility(0);
        this.f24197e.setVisibility(8);
    }
}
