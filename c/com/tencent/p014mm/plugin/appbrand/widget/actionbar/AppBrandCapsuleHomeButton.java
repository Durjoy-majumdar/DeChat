package com.tencent.p014mm.plugin.appbrand.widget.actionbar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.tencent.p014mm.C0966R;
import p385u2.C111105a;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandCapsuleHomeButton */
public final class AppBrandCapsuleHomeButton extends AppBrandOptionButton {
    public AppBrandCapsuleHomeButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public String getDefaultAccessibilityLabel() {
        return getContext().getString(C0966R.string.f7580k9);
    }

    public Drawable getDefaultImageDrawable() {
        Context context = getContext();
        Object obj = C111105a.f332697a;
        return C111105a.C111110c.m151511b(context, C0966R.C0969drawable.btw);
    }

    public AppBrandCapsuleHomeButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
