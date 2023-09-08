package com.tencent.mapsdk.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.widget.ImageView;

/* renamed from: com.tencent.mapsdk.internal.rq */
public final class C92456rq extends ImageView {
    public C92456rq(Context context) {
        super(context);
        setClickable(true);
    }

    /* renamed from: a */
    public final void mo126461a(Context context, Bitmap bitmap, Bitmap bitmap2) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), bitmap);
        stateListDrawable.addState(View.PRESSED_ENABLED_STATE_SET, new BitmapDrawable(context.getResources(), bitmap2));
        stateListDrawable.addState(View.ENABLED_STATE_SET, bitmapDrawable);
        setBackgroundDrawable(stateListDrawable);
    }

    /* renamed from: a */
    private void m116304a(Bitmap bitmap, Bitmap bitmap2) {
        Bitmap bitmap3 = bitmap;
        NinePatchDrawable ninePatchDrawable = new NinePatchDrawable(getResources(), bitmap3, bitmap.getNinePatchChunk(), new Rect(), (String) null);
        Bitmap bitmap4 = bitmap2;
        NinePatchDrawable ninePatchDrawable2 = new NinePatchDrawable(getResources(), bitmap4, bitmap2.getNinePatchChunk(), new Rect(), (String) null);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(View.PRESSED_ENABLED_STATE_SET, ninePatchDrawable2);
        stateListDrawable.addState(View.ENABLED_STATE_SET, ninePatchDrawable);
        setBackgroundDrawable(stateListDrawable);
    }

    /* renamed from: a */
    private void m116303a() {
        setClickable(false);
        Drawable background = getBackground();
        if (background != null) {
            background.setCallback((Drawable.Callback) null);
        }
        setBackgroundDrawable((Drawable) null);
    }
}
