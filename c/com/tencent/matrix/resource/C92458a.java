package com.tencent.matrix.resource;

import android.view.View;

/* renamed from: com.tencent.matrix.resource.a */
public class C92458a implements View.OnAttachStateChangeListener {
    public void onViewAttachedToWindow(View view) {
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x000b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onViewDetachedFromWindow(android.view.View r3) {
        /*
            r2 = this;
            android.graphics.drawable.Drawable r0 = r3.getBackground()     // Catch:{ all -> 0x000b }
            r1 = 0
            r0.setCallback(r1)     // Catch:{ all -> 0x000b }
            r3.setBackgroundDrawable(r1)     // Catch:{ all -> 0x000b }
        L_0x000b:
            r3.destroyDrawingCache()     // Catch:{ all -> 0x000e }
        L_0x000e:
            r3.removeOnAttachStateChangeListener(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.matrix.resource.C92458a.onViewDetachedFromWindow(android.view.View):void");
    }
}
