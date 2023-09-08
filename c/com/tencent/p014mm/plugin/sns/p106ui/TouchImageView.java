package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.sns.ui.TouchImageView */
public class TouchImageView extends ImageView {

    /* renamed from: j */
    public static final /* synthetic */ int f279055j = 0;

    /* renamed from: d */
    public MMHandler f279056d;

    /* renamed from: e */
    public Runnable f279057e;

    /* renamed from: f */
    public RectF f279058f = new RectF();

    /* renamed from: g */
    public Paint f279059g = new Paint();

    /* renamed from: h */
    public int f279060h = 90;

    /* renamed from: i */
    public boolean f279061i = true;

    /* renamed from: com.tencent.mm.plugin.sns.ui.TouchImageView$a */
    public class C95703a implements Runnable {
        public C95703a() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.TouchImageView$1");
            TouchImageView.this.setPressed(false);
            TouchImageView.this.invalidate();
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.TouchImageView$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.TouchImageView$b */
    public class C95704b implements View.OnTouchListener {
        public C95704b() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/TouchImageView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            SnsMethodCalculate.markStartTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.TouchImageView$2");
            TouchImageView touchImageView = TouchImageView.this;
            int i = TouchImageView.f279055j;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.TouchImageView");
            boolean z = touchImageView.f279061i;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.TouchImageView");
            boolean z2 = false;
            if (!z) {
                SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.TouchImageView$2");
                C117292a.m165362h(false, this, "com/tencent/mm/plugin/sns/ui/TouchImageView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            }
            TouchImageView touchImageView2 = TouchImageView.this;
            touchImageView2.getClass();
            SnsMethodCalculate.markStartTimeMs("updateState", "com.tencent.mm.plugin.sns.ui.TouchImageView");
            int action = motionEvent.getAction();
            if (action == 0) {
                view.setPressed(true);
                view.invalidate();
                touchImageView2.f279056d.removeCallbacks(touchImageView2.f279057e);
            } else if (action == 1 || action == 3) {
                touchImageView2.f279056d.post(touchImageView2.f279057e);
            }
            if (!touchImageView2.isClickable() && !touchImageView2.isLongClickable()) {
                z2 = true;
            }
            SnsMethodCalculate.markEndTimeMs("updateState", "com.tencent.mm.plugin.sns.ui.TouchImageView");
            SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.TouchImageView$2");
            C117292a.m165362h(z2, this, "com/tencent/mm/plugin/sns/ui/TouchImageView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return z2;
        }
    }

    public TouchImageView(Context context) {
        super(context);
        mo133128a();
    }

    /* renamed from: a */
    public final void mo133128a() {
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.TouchImageView");
        this.f279056d = new MMHandler();
        this.f279057e = new C95703a();
        super.setOnTouchListener(new C95704b());
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.TouchImageView");
    }

    public void onAttachedToWindow() {
        SnsMethodCalculate.markStartTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ui.TouchImageView");
        super.onAttachedToWindow();
        Log.m105918d("MicroMsg.MaskImageView", "onAttachedToWindow");
        SnsMethodCalculate.markEndTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ui.TouchImageView");
    }

    public void onDetachedFromWindow() {
        SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.TouchImageView");
        super.onDetachedFromWindow();
        Log.m105918d("MicroMsg.MaskImageView", "onDetachedFromWindow");
        SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.TouchImageView");
    }

    public void onDraw(Canvas canvas) {
        SnsMethodCalculate.markStartTimeMs("onDraw", "com.tencent.mm.plugin.sns.ui.TouchImageView");
        super.onDraw(canvas);
        if (isPressed()) {
            this.f279058f.left = (float) getPaddingLeft();
            this.f279058f.top = (float) getPaddingTop();
            this.f279058f.right = (float) (getWidth() - getPaddingRight());
            this.f279058f.bottom = (float) (getHeight() - getPaddingBottom());
            this.f279059g.setARGB(this.f279060h, 0, 0, 0);
            canvas.drawRoundRect(this.f279058f, (float) (getWidth() / 10), (float) (getHeight() / 10), this.f279059g);
        }
        SnsMethodCalculate.markEndTimeMs("onDraw", "com.tencent.mm.plugin.sns.ui.TouchImageView");
    }

    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        SnsMethodCalculate.markStartTimeMs("setOnTouchListener", "com.tencent.mm.plugin.sns.ui.TouchImageView");
        SnsMethodCalculate.markEndTimeMs("setOnTouchListener", "com.tencent.mm.plugin.sns.ui.TouchImageView");
    }

    public void settouchEnable(boolean z) {
        SnsMethodCalculate.markStartTimeMs("settouchEnable", "com.tencent.mm.plugin.sns.ui.TouchImageView");
        this.f279061i = z;
        SnsMethodCalculate.markEndTimeMs("settouchEnable", "com.tencent.mm.plugin.sns.ui.TouchImageView");
    }

    public TouchImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo133128a();
    }
}
