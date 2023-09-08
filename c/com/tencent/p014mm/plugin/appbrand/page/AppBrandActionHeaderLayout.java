package com.tencent.p014mm.plugin.appbrand.page;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;

/* renamed from: com.tencent.mm.plugin.appbrand.page.AppBrandActionHeaderLayout */
public class AppBrandActionHeaderLayout extends LinearLayout {

    /* renamed from: d */
    public LinearLayout f11820d;

    /* renamed from: e */
    public HorizontalScrollView f11821e;

    /* renamed from: f */
    public AppBrandActionSingleHeaderView f11822f;

    /* renamed from: g */
    public AppBrandActionMultipleHeaderView f11823g;

    /* renamed from: h */
    public AppBrandActionMultipleHeaderView f11824h;

    /* renamed from: i */
    public AppBrandActionMultipleHeaderView f11825i;

    /* renamed from: j */
    public AppBrandActionMultipleHeaderView f11826j;

    /* renamed from: n */
    public TextView f11827n;

    /* renamed from: o */
    public Context f11828o;

    /* renamed from: p */
    public int f11829p = -1;

    public AppBrandActionHeaderLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo1826a(context);
    }

    /* renamed from: a */
    public final void mo1826a(Context context) {
        this.f11828o = context;
        View.inflate(context, C0966R.C0971layout.f6501gj, this);
        this.f11820d = (LinearLayout) findViewById(C0966R.C0970id.f6074wk);
        this.f11821e = (HorizontalScrollView) findViewById(C0966R.C0970id.f6072wi);
        this.f11822f = (AppBrandActionSingleHeaderView) findViewById(C0966R.C0970id.f6084wu);
        this.f11823g = (AppBrandActionMultipleHeaderView) findViewById(C0966R.C0970id.f6078wo);
        this.f11824h = (AppBrandActionMultipleHeaderView) findViewById(C0966R.C0970id.f6079wp);
        this.f11825i = (AppBrandActionMultipleHeaderView) findViewById(C0966R.C0970id.f6080wq);
        this.f11826j = (AppBrandActionMultipleHeaderView) findViewById(C0966R.C0970id.f6081wr);
        this.f11827n = (TextView) findViewById(C0966R.C0970id.f6075wl);
        this.f11823g.setVisibility(8);
        this.f11824h.setVisibility(8);
        this.f11825i.setVisibility(8);
        this.f11826j.setVisibility(8);
        this.f11827n.setVisibility(8);
    }

    public TextView getStatusTextView() {
        return this.f11827n;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = this.f11829p;
        if (i > 0) {
            setForceHeight(i);
        }
    }

    public void onMeasure(int i, int i2) {
        int i3 = this.f11829p;
        if (i3 > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        super.onMeasure(i, i2);
        if (this.f11829p > 0 && getMeasuredHeight() > this.f11829p) {
            super.setMeasuredDimension(getMeasuredWidth(), this.f11829p);
        }
    }

    public void setActionHeaderStyle(boolean z) {
        if (z) {
            this.f11822f.setTextViewTextColor(this.f11828o.getResources().getColor(C0966R.color.al_));
            this.f11823g.setTextViewTextColor(this.f11828o.getResources().getColor(C0966R.color.al_));
            this.f11824h.setTextViewTextColor(this.f11828o.getResources().getColor(C0966R.color.al_));
            this.f11825i.setTextViewTextColor(this.f11828o.getResources().getColor(C0966R.color.al_));
            this.f11826j.setTextViewTextColor(this.f11828o.getResources().getColor(C0966R.color.al_));
            this.f11827n.setTextColor(this.f11828o.getResources().getColor(C0966R.color.al_));
            return;
        }
        this.f11822f.setTextViewTextColor(this.f11828o.getResources().getColor(C0966R.color.f3147gw));
        this.f11823g.setTextViewTextColor(this.f11828o.getResources().getColor(C0966R.color.f3147gw));
        this.f11824h.setTextViewTextColor(this.f11828o.getResources().getColor(C0966R.color.f3147gw));
        this.f11825i.setTextViewTextColor(this.f11828o.getResources().getColor(C0966R.color.f3147gw));
        this.f11826j.setTextViewTextColor(this.f11828o.getResources().getColor(C0966R.color.f3147gw));
        this.f11827n.setTextColor(this.f11828o.getResources().getColor(C0966R.color.f3147gw));
    }

    @Deprecated
    public void setAppId(String str) {
    }

    public void setForceHeight(int i) {
        this.f11829p = Math.max(i, -1);
        if (getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) getParent();
            int i2 = this.f11829p;
            if (i2 > 0) {
                viewGroup.setMinimumHeight(i2);
            }
            requestLayout();
        }
    }

    public void setStatusDescription(CharSequence charSequence) {
        this.f11827n.setText(charSequence);
        this.f11827n.setVisibility(0);
        this.f11820d.setVisibility(8);
        this.f11821e.setVisibility(8);
    }

    public AppBrandActionHeaderLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo1826a(context);
    }
}
