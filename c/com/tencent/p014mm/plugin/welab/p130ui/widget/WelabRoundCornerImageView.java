package com.tencent.p014mm.plugin.welab.p130ui.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import p1162x2.C112020b;
import p1162x2.C112021c;

/* renamed from: com.tencent.mm.plugin.welab.ui.widget.WelabRoundCornerImageView */
public class WelabRoundCornerImageView extends ImageView {

    /* renamed from: d */
    public float f318430d;

    public WelabRoundCornerImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Bitmap getDisplayingBitmap() {
        Drawable drawable = getDrawable();
        if (drawable == null || !(drawable instanceof C112021c)) {
            return null;
        }
        return ((C112021c) drawable).f335330a;
    }

    public void setCornerRadiusPercent(float f) {
        this.f318430d = f;
    }

    public void setImageBitmap(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled() || bitmap.getWidth() < 0 || bitmap.getHeight() < 0) {
            super.setImageBitmap(bitmap);
        } else if (this.f318430d <= 0.0f) {
            super.setImageBitmap(bitmap);
        } else {
            C112020b bVar = new C112020b(getResources(), bitmap);
            bVar.mo163680c(Math.min(((float) bitmap.getWidth()) * this.f318430d, ((float) bitmap.getHeight()) * this.f318430d));
            super.setImageDrawable(bVar);
        }
    }

    public WelabRoundCornerImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
