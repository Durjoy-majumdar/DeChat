package com.tencent.p014mm.p136ui.matrix.recyclerview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;

/* renamed from: com.tencent.mm.ui.matrix.recyclerview.JsonItemView */
public class JsonItemView extends LinearLayout {

    /* renamed from: d */
    public Context f56342d;

    /* renamed from: e */
    public TextView f56343e;

    /* renamed from: f */
    public TextView f56344f;

    /* renamed from: g */
    public ImageView f56345g;

    public JsonItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public void mo26280a(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null && (layoutParams = generateDefaultLayoutParams()) == null) {
            throw new IllegalArgumentException("generateDefaultLayoutParams() cannot return null");
        }
        addViewInLayout(view, -1, layoutParams);
    }

    /* renamed from: b */
    public void mo26281b(boolean z) {
        this.f56345g.setVisibility(0);
        this.f56345g.setImageResource(z ? C0966R.C0969drawable.aae : C0966R.C0969drawable.aad);
    }

    /* renamed from: c */
    public void mo26282c(CharSequence charSequence) {
        this.f56344f.setVisibility(0);
        if (charSequence != null) {
            this.f56344f.setText(charSequence);
        }
    }

    public CharSequence getRightText() {
        return this.f56344f.getText();
    }

    public void setIconClickListener(View.OnClickListener onClickListener) {
        this.f56345g.setOnClickListener(onClickListener);
    }

    public void setRightColor(int i) {
        this.f56344f.setTextColor(i);
    }

    public void setTextSize(float f) {
    }

    public JsonItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f56342d = context;
        setOrientation(1);
        LayoutInflater.from(this.f56342d).inflate(C0966R.C0971layout.b2x, this, true);
        this.f56343e = (TextView) findViewById(C0966R.C0970id.kwz);
        this.f56344f = (TextView) findViewById(C0966R.C0970id.kxx);
        this.f56345g = (ImageView) findViewById(C0966R.C0970id.f358476fd0);
    }
}
