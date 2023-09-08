package com.tencent.p014mm.plugin.appbrand.page;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.tencent.mm.plugin.appbrand.page.r4 */
public class C83907r4 {
    /* renamed from: a */
    public static void m103301a(View view, View view2, Canvas canvas) {
        boolean z = true;
        if (view2.getVisibility() == 0) {
            if (view2 instanceof C83896q4) {
                z = ((C83896q4) view2).mo63301D(canvas);
            } else if (view2 instanceof ViewGroup) {
                z = false;
            } else {
                view2.draw(canvas);
            }
        }
        if (!z && (view2 instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view2;
            viewGroup.draw(canvas);
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                float x = childAt.getX();
                float y = childAt.getY();
                canvas.save();
                canvas.translate(x, y);
                m103301a(view, childAt, canvas);
                canvas.restore();
            }
        }
    }

    /* renamed from: b */
    public static Bitmap m103302b(View view) {
        if (view.getWidth() <= 0 || view.getHeight() <= 0) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        m103301a(view, view, new Canvas(createBitmap));
        return createBitmap;
    }
}
