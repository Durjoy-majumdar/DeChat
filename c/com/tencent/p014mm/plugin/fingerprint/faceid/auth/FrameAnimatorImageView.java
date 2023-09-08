package com.tencent.p014mm.plugin.fingerprint.faceid.auth;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;

/* renamed from: com.tencent.mm.plugin.fingerprint.faceid.auth.FrameAnimatorImageView */
public class FrameAnimatorImageView extends ImageView {

    /* renamed from: d */
    public Runnable f313120d = null;

    /* renamed from: e */
    public DrawFilter f313121e = new PaintFlagsDrawFilter(0, 3);

    /* renamed from: com.tencent.mm.plugin.fingerprint.faceid.auth.FrameAnimatorImageView$a */
    public interface C105345a {
        void onStart();

        void onStop();
    }

    public FrameAnimatorImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public void mo149945a(int i, C105345a aVar) {
        Drawable drawable = MMApplicationContext.getContext().getResources().getDrawable(i);
        setImageDrawable(drawable);
        if (drawable instanceof AnimationDrawable) {
            AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
            animationDrawable.start();
            if (aVar != null) {
                aVar.onStart();
            }
            if (animationDrawable.isOneShot()) {
                int i2 = 0;
                for (int i3 = 0; i3 < animationDrawable.getNumberOfFrames(); i3++) {
                    i2 += animationDrawable.getDuration(i3);
                }
                if (aVar != null) {
                    C105346a aVar2 = new C105346a(this, aVar);
                    this.f313120d = aVar2;
                    MMHandlerThread.postToMainThreadDelayed(aVar2, (long) i2);
                }
            }
        }
    }

    public void onDraw(Canvas canvas) {
        canvas.setDrawFilter(this.f313121e);
        super.onDraw(canvas);
    }

    public void setImageBitmap(Bitmap bitmap) {
        MMHandlerThread.removeRunnable(this.f313120d);
        super.setImageBitmap(bitmap);
    }

    public void setImageDrawable(Drawable drawable) {
        MMHandlerThread.removeRunnable(this.f313120d);
        super.setImageDrawable(drawable);
    }

    public void setImageResource(int i) {
        MMHandlerThread.removeRunnable(this.f313120d);
        super.setImageResource(i);
    }

    public FrameAnimatorImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
