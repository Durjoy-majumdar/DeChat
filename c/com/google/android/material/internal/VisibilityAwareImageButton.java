package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

public class VisibilityAwareImageButton extends ImageButton {

    /* renamed from: d */
    public int f309462d;

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: b */
    public final void mo146842b(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.f309462d = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.f309462d;
    }

    public void setVisibility(int i) {
        mo146842b(i, true);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f309462d = getVisibility();
    }
}
