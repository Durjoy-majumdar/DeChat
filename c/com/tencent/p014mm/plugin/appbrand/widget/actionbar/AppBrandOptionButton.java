package com.tencent.p014mm.plugin.appbrand.widget.actionbar;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import p385u2.C111105a;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandOptionButton */
public class AppBrandOptionButton extends FrameLayout {

    /* renamed from: d */
    public ImageButton f247516d;

    public AppBrandOptionButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo117730a(context);
    }

    private int getActionBarHeight() {
        return getResources().getDimensionPixelSize(C0966R.dimen.f3677b7);
    }

    /* renamed from: a */
    public final void mo117730a(Context context) {
        ImageButton imageButton = new ImageButton(context);
        this.f247516d = imageButton;
        imageButton.setClickable(false);
        this.f247516d.setBackground((Drawable) null);
        this.f247516d.setImportantForAccessibility(2);
        addView(this.f247516d, new FrameLayout.LayoutParams(getActionBarHeight(), -1, 17));
        setAccessibilityLabel(getDefaultAccessibilityLabel());
    }

    /* renamed from: b */
    public void mo117731b() {
        this.f247516d.setVisibility(0);
        this.f247516d.setAlpha(1.0f);
        this.f247516d.setImageDrawable(getDefaultImageDrawable());
    }

    public CharSequence getAccessibilityClassName() {
        return ImageButton.class.getName();
    }

    public ImageView getButtonImage() {
        return this.f247516d;
    }

    public String getDefaultAccessibilityLabel() {
        return getContext().getString(C0966R.string.f7584kc);
    }

    public Drawable getDefaultImageDrawable() {
        Context context = getContext();
        Object obj = C111105a.f332697a;
        return C111105a.C111110c.m151511b(context, C0966R.C0969drawable.f357092bu0);
    }

    public void onCancelPendingInputEvents() {
        super.onCancelPendingInputEvents();
        setPressed(false);
    }

    public final void setAccessibilityLabel(String str) {
        ImageButton imageButton = this.f247516d;
        if (imageButton != null && imageButton.getVisibility() == 0) {
            this.f247516d.setContentDescription(str);
        }
    }

    public void setColor(int i) {
        this.f247516d.setImageDrawable(getDefaultImageDrawable());
        this.f247516d.setColorFilter(i, PorterDuff.Mode.SRC_ATOP);
        this.f247516d.setBackground(getBackground());
        if (this.f247516d.getBackground() != null) {
            this.f247516d.getBackground().setColorFilter(i, PorterDuff.Mode.SRC_ATOP);
        }
    }

    public void setIcon(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f247516d.setImageDrawable(new BitmapDrawable(getResources(), bitmap));
            this.f247516d.setVisibility(0);
        }
    }

    public AppBrandOptionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo117730a(context);
    }
}
