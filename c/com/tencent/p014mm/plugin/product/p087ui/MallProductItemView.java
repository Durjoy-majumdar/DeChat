package com.tencent.p014mm.plugin.product.p087ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import tb3.C77881d;

/* renamed from: com.tencent.mm.plugin.product.ui.MallProductItemView */
public class MallProductItemView extends LinearLayout {

    /* renamed from: d */
    public TextView f20093d;

    /* renamed from: e */
    public TextView f20094e;

    /* renamed from: f */
    public String f20095f;

    /* renamed from: g */
    public String f20096g;

    /* renamed from: h */
    public int f20097h;

    public MallProductItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.f20097h = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C77881d.f226911e, i, 0);
        int resourceId = obtainStyledAttributes.getResourceId(3, 0);
        if (resourceId != 0) {
            this.f20095f = context.getString(resourceId);
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(2, 0);
        if (resourceId2 != 0) {
            this.f20096g = context.getString(resourceId2);
        }
        this.f20097h = obtainStyledAttributes.getInt(0, 1);
        obtainStyledAttributes.recycle();
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.bo5, this, true);
        this.f20093d = (TextView) inflate.findViewById(C0966R.C0970id.kpm);
        this.f20094e = (TextView) inflate.findViewById(C0966R.C0970id.ka6);
        ImageView imageView = (ImageView) inflate.findViewById(C0966R.C0970id.f6g);
        this.f20093d.setText(this.f20095f);
        this.f20094e.setText(this.f20096g);
        this.f20094e.setLines(this.f20097h);
    }

    public Object getData() {
        return null;
    }

    public int getType() {
        return 0;
    }

    public void setSummary(String str) {
        this.f20096g = str;
        this.f20094e.setText(str);
    }

    public void setTitle(String str) {
        this.f20095f = str;
        this.f20093d.setText(str);
    }

    public void setSummary(Spanned spanned) {
        String obj = spanned.toString();
        this.f20096g = obj;
        this.f20094e.setText(obj);
    }

    public MallProductItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
