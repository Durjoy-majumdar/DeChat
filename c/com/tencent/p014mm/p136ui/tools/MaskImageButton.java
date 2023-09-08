package com.tencent.p014mm.p136ui.tools;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.view.x2c.X2CImageView;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.tools.MaskImageButton */
public class MaskImageButton extends X2CImageView {

    /* renamed from: f */
    public MMHandler f285317f;

    /* renamed from: g */
    public Runnable f285318g;

    /* renamed from: h */
    public RectF f285319h = new RectF();

    /* renamed from: i */
    public Object f285320i;

    /* renamed from: j */
    public Paint f285321j = null;

    /* renamed from: n */
    public int f285322n = 90;

    /* renamed from: o */
    public int f285323o = 0;

    /* renamed from: p */
    public int f285324p = 0;

    /* renamed from: com.tencent.mm.ui.tools.MaskImageButton$a */
    public class C97236a implements Runnable {
        public C97236a() {
        }

        public void run() {
            MaskImageButton.this.setPressed(false);
            MaskImageButton.this.invalidate();
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.MaskImageButton$b */
    public class C97237b implements View.OnTouchListener {
        public C97237b() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/tools/MaskImageButton$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            int action = motionEvent.getAction();
            boolean z = true;
            if (action == 0) {
                view.setPressed(true);
                view.invalidate();
                MaskImageButton maskImageButton = MaskImageButton.this;
                maskImageButton.f285317f.removeCallbacks(maskImageButton.f285318g);
            } else if (action == 1 || action == 3) {
                MaskImageButton maskImageButton2 = MaskImageButton.this;
                maskImageButton2.f285317f.post(maskImageButton2.f285318g);
            }
            if (MaskImageButton.this.isClickable() || MaskImageButton.this.isLongClickable()) {
                z = false;
            }
            C117292a.m165362h(z, this, "com/tencent/mm/ui/tools/MaskImageButton$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return z;
        }
    }

    public MaskImageButton(Context context) {
        super(context);
        mo136209p();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isPressed()) {
            this.f285319h.set((float) (getPaddingLeft() + 0), (float) (getPaddingTop() + 0), (float) (this.f285323o - getPaddingRight()), (float) (this.f285324p - getPaddingBottom()));
            canvas.drawRoundRect(this.f285319h, (float) (getMeasuredHeight() / 10), (float) (getMeasuredHeight() / 10), this.f285321j);
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f285323o = getMeasuredWidth();
        this.f285324p = getMeasuredHeight();
    }

    /* renamed from: p */
    public final void mo136209p() {
        Paint paint = new Paint();
        this.f285321j = paint;
        paint.setColor(Color.argb(this.f285322n, 0, 0, 0));
        this.f285317f = new MMHandler(Looper.getMainLooper());
        this.f285318g = new C97236a();
        super.setOnTouchListener(new C97237b());
    }

    public MaskImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo136209p();
    }
}
