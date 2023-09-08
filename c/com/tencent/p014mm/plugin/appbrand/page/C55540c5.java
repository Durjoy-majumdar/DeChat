package com.tencent.p014mm.plugin.appbrand.page;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.tencent.mm.plugin.appbrand.page.c5 */
public class C55540c5 {
    /* renamed from: a */
    public static void m63171a(Canvas canvas, View view, float f, float f2) {
        if (view.getVisibility() == 0) {
            if (view instanceof TextureView) {
                Bitmap bitmap = ((TextureView) view).getBitmap(view.getWidth(), view.getHeight());
                if (bitmap != null && !bitmap.isRecycled()) {
                    canvas.drawBitmap(bitmap, f, f2, (Paint) null);
                }
            } else if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    View childAt = viewGroup.getChildAt(i);
                    m63171a(canvas, childAt, childAt.getX() + f, childAt.getY() + f2);
                }
            } else {
                canvas.save();
                canvas.translate(f, f2);
                view.draw(canvas);
                canvas.restore();
            }
        }
    }

    /* renamed from: b */
    public static boolean m63172b(ViewGroup viewGroup) {
        if (viewGroup == null || viewGroup.getChildCount() == 0) {
            return false;
        }
        int childCount = viewGroup.getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof TextureView) {
                z = true;
            }
            if (childAt instanceof ViewGroup) {
                z = m63172b((ViewGroup) childAt);
            }
            if (z) {
                break;
            }
        }
        return z;
    }
}
