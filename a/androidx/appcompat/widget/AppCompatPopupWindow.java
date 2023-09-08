package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

class AppCompatPopupWindow extends PopupWindow {
    public AppCompatPopupWindow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo143964a(context, attributeSet, i, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        r4 = r3.getResourceId(0, 0);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo143964a(android.content.Context r2, android.util.AttributeSet r3, int r4, int r5) {
        /*
            r1 = this;
            int[] r0 = p433g.C107593a.f321923w
            android.content.res.TypedArray r3 = r2.obtainStyledAttributes(r3, r0, r4, r5)
            r4 = 2
            boolean r5 = r3.hasValue(r4)
            r0 = 0
            if (r5 == 0) goto L_0x0015
            boolean r4 = r3.getBoolean(r4, r0)
            androidx.core.widget.C103729f.m138093a(r1, r4)
        L_0x0015:
            boolean r4 = r3.hasValue(r0)
            if (r4 == 0) goto L_0x0026
            int r4 = r3.getResourceId(r0, r0)
            if (r4 == 0) goto L_0x0026
            android.graphics.drawable.Drawable r2 = p1115h.C107922a.m146228b(r2, r4)
            goto L_0x002a
        L_0x0026:
            android.graphics.drawable.Drawable r2 = r3.getDrawable(r0)
        L_0x002a:
            r1.setBackgroundDrawable(r2)
            r3.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatPopupWindow.mo143964a(android.content.Context, android.util.AttributeSet, int, int):void");
    }

    public void showAsDropDown(View view, int i, int i2) {
        super.showAsDropDown(view, i, i2);
    }

    public void update(View view, int i, int i2, int i3, int i4) {
        super.update(view, i, i2, i3, i4);
    }

    public void showAsDropDown(View view, int i, int i2, int i3) {
        super.showAsDropDown(view, i, i2, i3);
    }

    public AppCompatPopupWindow(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo143964a(context, attributeSet, i, i2);
    }
}
