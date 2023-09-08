package com.tencent.p014mm.p136ui.base.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C85875k4;
import yo3.C79142a;

/* renamed from: com.tencent.mm.ui.base.preference.ButtonPreference */
public class ButtonPreference extends Preference {

    /* renamed from: J */
    public View f215019J;

    /* renamed from: K */
    public ImageView f215020K;

    /* renamed from: L */
    public TextView f215021L;

    /* renamed from: M */
    public int f215022M;

    /* renamed from: N */
    public int f215023N;

    /* renamed from: P */
    public String f215024P;

    /* renamed from: Q */
    public Drawable f215025Q;

    /* renamed from: R */
    public Context f215026R;

    /* renamed from: S */
    public boolean f215027S = true;

    /* renamed from: T */
    public int f215028T;

    public ButtonPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f121271G = C0966R.C0971layout.bcy;
        mo101915I(context, attributeSet);
    }

    /* renamed from: I */
    public final void mo101915I(Context context, AttributeSet attributeSet) {
        this.f215026R = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C79142a.f232402a);
        this.f215022M = obtainStyledAttributes.getColor(2, 0);
        this.f215023N = obtainStyledAttributes.getColor(3, 0);
        this.f215024P = context.getString(obtainStyledAttributes.getResourceId(1, 0));
        this.f215025Q = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: J */
    public void mo101916J(int i) {
        View view = this.f215019J;
        if (view != null) {
            view.setBackground(this.f215026R.getResources().getDrawable(i));
        }
    }

    /* renamed from: K */
    public void mo101917K(String str, int i) {
        this.f215024P = str;
        this.f215023N = i;
        TextView textView = this.f215021L;
        if (textView != null) {
            textView.setText(str);
            this.f215021L.setTextColor(i);
            if (this.f215027S) {
                C85875k4.m106189j0(this.f215021L.getPaint(), 0.8f);
            }
        }
    }

    /* renamed from: L */
    public void mo101918L(boolean z) {
        this.f215027S = z;
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        int i;
        super.mo1086w(view);
        this.f215020K = (ImageView) view.findViewById(C0966R.C0970id.f15);
        this.f215021L = (TextView) view.findViewById(C0966R.C0970id.khj);
        ImageView imageView = this.f215020K;
        if (!(imageView == null || this.f215025Q == null)) {
            imageView.setVisibility(0);
            ImageView imageView2 = this.f215020K;
            Drawable drawable = this.f215025Q;
            C74933u4.m89769f(drawable, this.f215022M);
            imageView2.setImageDrawable(drawable);
        }
        TextView textView = this.f215021L;
        if (textView != null) {
            textView.setText(this.f215024P);
            this.f215021L.setTextColor(this.f215023N);
            if (this.f215027S) {
                C85875k4.m106189j0(this.f215021L.getPaint(), 0.8f);
            }
        }
        View view2 = this.f215019J;
        if (view2 != null && (i = this.f215028T) != 0) {
            view2.setId(i);
        }
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(this.f121274d).inflate(C0966R.C0971layout.bni, (ViewGroup) null);
        this.f215019J = inflate;
        return inflate;
    }

    public ButtonPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f121271G = C0966R.C0971layout.bcy;
        mo101915I(context, attributeSet);
    }
}
