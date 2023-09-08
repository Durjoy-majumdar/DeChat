package com.tencent.p014mm.p136ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.Gallery;

/* renamed from: com.tencent.mm.ui.base.MMGallery */
public class MMGallery extends Gallery {
    public MMGallery(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setStaticTransformationsEnabled(true);
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (f > 0.0f) {
            onKeyDown(21, (KeyEvent) null);
            return true;
        }
        onKeyDown(22, (KeyEvent) null);
        return true;
    }

    public MMGallery(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setStaticTransformationsEnabled(true);
    }
}
