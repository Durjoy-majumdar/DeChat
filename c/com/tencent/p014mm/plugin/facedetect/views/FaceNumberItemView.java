package com.tencent.p014mm.plugin.facedetect.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import java.lang.ref.WeakReference;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.facedetect.views.FaceNumberItemView */
public class FaceNumberItemView extends View {

    /* renamed from: d */
    public MTimerHandler f197975d;

    /* renamed from: e */
    public Paint f197976e;

    /* renamed from: f */
    public RectF f197977f;

    /* renamed from: g */
    public Bitmap f197978g;

    /* renamed from: h */
    public int f197979h;

    /* renamed from: i */
    public int f197980i;

    /* renamed from: j */
    public Runnable f197981j;

    /* renamed from: com.tencent.mm.plugin.facedetect.views.FaceNumberItemView$b */
    public static class C29921b implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final WeakReference<Runnable> f81043d;

        public C29921b(Runnable runnable) {
            this.f81043d = new WeakReference<>(runnable);
        }

        public boolean onTimerExpired() {
            Runnable runnable = this.f81043d.get();
            if (runnable == null) {
                return false;
            }
            runnable.run();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.facedetect.views.FaceNumberItemView$a */
    public class C68889a implements Runnable {
        public C68889a() {
        }

        public void run() {
            FaceNumberItemView faceNumberItemView = FaceNumberItemView.this;
            int i = faceNumberItemView.f197980i;
            if (i <= 30) {
                faceNumberItemView.f197980i = i + 1;
                faceNumberItemView.invalidate();
                return;
            }
            faceNumberItemView.f197975d.stopped();
        }
    }

    public FaceNumberItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void onDraw(Canvas canvas) {
        float f;
        float f2;
        int height;
        int height2;
        super.onDraw(canvas);
        int i = this.f197979h;
        if (i == 17) {
            f2 = (float) ((getWidth() - this.f197978g.getWidth()) >> 1);
            height = getHeight();
            height2 = this.f197978g.getHeight();
        } else if (i == 3) {
            f = (float) ((getHeight() - this.f197978g.getHeight()) >> 1);
            f2 = 0.0f;
            canvas.drawBitmap(this.f197978g, f2, f, (Paint) null);
            this.f197977f.set(f2, 0.0f, ((((float) this.f197978g.getWidth()) * ((float) this.f197980i)) / 30.0f) + f2, (float) getHeight());
            canvas.drawRect(this.f197977f, this.f197976e);
        } else if (i == 5) {
            f2 = (float) (getWidth() - this.f197978g.getWidth());
            height = getHeight();
            height2 = this.f197978g.getHeight();
        } else {
            Log.m105920e("MicroMsg.FaceNumberItemView", "hy: not support gravity! treat as center");
            f2 = (float) ((getWidth() - this.f197978g.getWidth()) >> 1);
            height = getHeight();
            height2 = this.f197978g.getHeight();
        }
        f = (float) ((height - height2) >> 1);
        canvas.drawBitmap(this.f197978g, f2, f, (Paint) null);
        this.f197977f.set(f2, 0.0f, ((((float) this.f197978g.getWidth()) * ((float) this.f197980i)) / 30.0f) + f2, (float) getHeight());
        canvas.drawRect(this.f197977f, this.f197976e);
    }

    public void setGravity(int i) {
        Log.m105924i("MicroMsg.FaceNumberItemView", "hy: setting gravity");
        this.f197979h = i;
    }

    public void setImageResource(int i) {
        Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), i);
        if (i == C0966R.C0969drawable.c0j) {
            int dimensionPixelSize = (getResources().getDimensionPixelSize(C0966R.dimen.a5h) - C76577a.m92151b(getContext(), 8)) / 2;
            Bitmap createBitmap = Bitmap.createBitmap(decodeResource.getWidth() + (dimensionPixelSize * 2), decodeResource.getHeight() + 0, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawARGB(0, 255, 255, 255);
            canvas.drawBitmap(decodeResource, (float) dimensionPixelSize, (float) 0, (Paint) null);
            this.f197978g = createBitmap;
            return;
        }
        this.f197978g = Bitmap.createScaledBitmap(decodeResource, C76577a.m92151b(getContext(), 48), decodeResource.getHeight(), false);
    }

    public FaceNumberItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f197975d = null;
        this.f197976e = null;
        this.f197977f = null;
        this.f197978g = null;
        this.f197979h = 17;
        this.f197980i = 0;
        this.f197981j = new C68889a();
        setLayerType(1, (Paint) null);
        Paint paint = new Paint();
        this.f197976e = paint;
        paint.setColor(context.getResources().getColor(C0966R.color.f3360po));
        this.f197976e.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        this.f197977f = new RectF();
    }
}
