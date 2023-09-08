package com.tencent.p014mm.plugin.patmsg.p086ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.patmsg.ui.PatPopupWindow */
public class PatPopupWindow extends PopupWindow {

    /* renamed from: a */
    public FrameLayout f202261a;

    /* renamed from: b */
    public int f202262b;

    /* renamed from: c */
    public int f202263c;

    /* renamed from: d */
    public int f202264d;

    /* renamed from: e */
    public int f202265e;

    public PatPopupWindow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    /* renamed from: a */
    public void mo96448a(View view, int i, int i2, FrameLayout.LayoutParams layoutParams) {
        if (getBackground() == null) {
            setBackgroundDrawable(new ColorDrawable(0));
        }
        View contentView = getContentView();
        if (contentView != null) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams2.leftMargin = layoutParams.leftMargin;
            layoutParams2.rightMargin = layoutParams.rightMargin;
            layoutParams2.topMargin = layoutParams.topMargin;
            layoutParams2.bottomMargin = layoutParams.bottomMargin;
            contentView.setLayoutParams(layoutParams2);
            int i3 = C85875k4.m106204s().widthPixels;
            int i4 = C85875k4.m106204s().heightPixels;
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            setWidth(-2);
            setHeight(-2);
            if (i == 0) {
                this.f202264d = i3;
            } else if (i == 1) {
                this.f202264d = iArr[0];
            } else if (i == 2) {
                this.f202264d = (i3 - iArr[0]) - view.getWidth();
            } else if (i == 3) {
                this.f202264d = i3 - iArr[0];
            } else if (i == 4) {
                this.f202264d = iArr[0] + view.getWidth();
            }
            if (i2 == 0) {
                this.f202265e = i4;
            } else if (i2 == 1) {
                this.f202265e = iArr[1];
            } else if (i2 == 2) {
                this.f202265e = (i4 - iArr[1]) - view.getHeight();
            } else if (i2 == 3) {
                this.f202265e = (i4 - iArr[1]) + view.getHeight();
            } else if (i2 == 4) {
                this.f202265e = iArr[1] + view.getHeight();
            }
            this.f202261a.measure(View.MeasureSpec.makeMeasureSpec(this.f202264d, View.MeasureSpec.getMode(Integer.MIN_VALUE)), View.MeasureSpec.makeMeasureSpec(this.f202265e, View.MeasureSpec.getMode(Integer.MIN_VALUE)));
            setWidth(Math.min(this.f202261a.getMeasuredWidth(), this.f202264d));
            setHeight(Math.min(this.f202261a.getMeasuredHeight(), this.f202265e));
            Log.m105919d("MicroMsg.PatPopupWindow", "show contentView size (%d,%d)", Integer.valueOf(this.f202261a.getMeasuredWidth()), Integer.valueOf(this.f202261a.getMeasuredHeight()));
            view.getLocationInWindow(new int[2]);
            this.f202262b = 0;
            this.f202263c = 0;
            if (i == 0) {
                this.f202262b = (-(this.f202261a.getMeasuredWidth() - view.getWidth())) / 2;
            } else if (i == 1) {
                this.f202262b = -this.f202261a.getMeasuredWidth();
            } else if (i == 2) {
                this.f202262b = view.getWidth();
            } else if (i == 4) {
                this.f202262b = view.getWidth() - this.f202261a.getMeasuredWidth();
            }
            if (i2 == 0) {
                this.f202263c = (-view.getHeight()) - ((this.f202261a.getMeasuredHeight() - view.getHeight()) / 2);
            } else if (i2 == 1) {
                this.f202263c = (-this.f202261a.getMeasuredHeight()) - view.getHeight();
            } else if (i2 == 3) {
                this.f202263c = -view.getHeight();
            } else if (i2 == 4) {
                this.f202263c = -this.f202261a.getMeasuredHeight();
            }
            Log.m105919d("MicroMsg.PatPopupWindow", "show at fix location (%d,%d)", Integer.valueOf(this.f202262b), Integer.valueOf(this.f202263c));
            if (isShowing()) {
                update(view, this.f202262b, this.f202263c, getWidth(), getHeight());
                return;
            }
            showAsDropDown(view, this.f202262b, this.f202263c);
        }
    }

    public View getContentView() {
        return this.f202261a.getChildAt(0);
    }

    public void setContentView(View view) {
        this.f202261a.removeAllViews();
        this.f202261a.addView(view);
    }

    public PatPopupWindow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f202261a = frameLayout;
        super.setContentView(frameLayout);
    }

    public PatPopupWindow(View view) {
        this(view.getContext(), (AttributeSet) null);
        FrameLayout frameLayout = new FrameLayout(view.getContext());
        this.f202261a = frameLayout;
        super.setContentView(frameLayout);
        setContentView(view);
    }
}
