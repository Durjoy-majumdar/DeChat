package com.tencent.kinda.framework.widget.base;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

class KindaTextViewImpl extends TextView {
    private static final String TAG = "KindaButtonImpl";
    private boolean hasLastPressed = false;
    private KindaButtonImpl mKindaButton;

    public KindaTextViewImpl(Context context) {
        super(context);
    }

    public void drawableStateChanged() {
        if (this.mKindaButton.isEnabled() || this.mKindaButton.isKindaPressed() || this.hasLastPressed) {
            super.drawableStateChanged();
            this.hasLastPressed = this.mKindaButton.isKindaPressed();
        }
    }

    public void setKindaButton(KindaButtonImpl kindaButtonImpl) {
        this.mKindaButton = kindaButtonImpl;
    }

    public KindaTextViewImpl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public KindaTextViewImpl(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
