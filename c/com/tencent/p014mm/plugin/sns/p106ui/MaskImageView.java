package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.sns.ui.MaskImageView */
public class MaskImageView extends TagImageView {

    /* renamed from: P */
    public static final /* synthetic */ int f276958P = 0;

    /* renamed from: K */
    public MMHandler f276959K;

    /* renamed from: L */
    public Runnable f276960L;

    /* renamed from: M */
    public int f276961M = 90;

    /* renamed from: N */
    public boolean f276962N = true;

    /* renamed from: com.tencent.mm.plugin.sns.ui.MaskImageView$a */
    public class C95349a implements Runnable {
        public C95349a() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.MaskImageView$1");
            MaskImageView.this.setPressed(false);
            MaskImageView.this.invalidate();
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.MaskImageView$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.MaskImageView$b */
    public class C95350b implements View.OnTouchListener {
        public C95350b() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/MaskImageView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            SnsMethodCalculate.markStartTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.MaskImageView$2");
            MaskImageView maskImageView = MaskImageView.this;
            int i = MaskImageView.f276958P;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.MaskImageView");
            boolean z = maskImageView.f276962N;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.MaskImageView");
            if (!z) {
                SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.MaskImageView$2");
                C117292a.m165362h(false, this, "com/tencent/mm/plugin/sns/ui/MaskImageView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            }
            boolean q = MaskImageView.this.mo132229q(view, motionEvent);
            SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.MaskImageView$2");
            C117292a.m165362h(q, this, "com/tencent/mm/plugin/sns/ui/MaskImageView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return q;
        }
    }

    public MaskImageView(Context context) {
        super(context);
        mo132228p();
    }

    public void onAttachedToWindow() {
        SnsMethodCalculate.markStartTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ui.MaskImageView");
        super.onAttachedToWindow();
        SnsMethodCalculate.markEndTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ui.MaskImageView");
    }

    public void onDetachedFromWindow() {
        SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.MaskImageView");
        super.onDetachedFromWindow();
        SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.MaskImageView");
    }

    public void onDraw(Canvas canvas) {
        SnsMethodCalculate.markStartTimeMs("onDraw", "com.tencent.mm.plugin.sns.ui.MaskImageView");
        super.onDraw(canvas);
        if (isPressed()) {
            canvas.drawARGB(this.f276961M, 0, 0, 0);
        }
        SnsMethodCalculate.markEndTimeMs("onDraw", "com.tencent.mm.plugin.sns.ui.MaskImageView");
    }

    /* renamed from: p */
    public final void mo132228p() {
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.MaskImageView");
        this.f276959K = new MMHandler(Looper.getMainLooper());
        this.f276960L = new C95349a();
        super.setOnTouchListener(new C95350b());
        super.setContentDescription(getContext().getResources().getString(C0966R.string.jd8));
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.MaskImageView");
    }

    /* renamed from: q */
    public boolean mo132229q(View view, MotionEvent motionEvent) {
        SnsMethodCalculate.markStartTimeMs("updateState", "com.tencent.mm.plugin.sns.ui.MaskImageView");
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 0) {
            view.setPressed(true);
            view.invalidate();
            this.f276959K.removeCallbacks(this.f276960L);
        } else if (action == 1 || action == 3) {
            this.f276959K.post(this.f276960L);
        }
        if (isClickable() || isLongClickable()) {
            z = false;
        }
        SnsMethodCalculate.markEndTimeMs("updateState", "com.tencent.mm.plugin.sns.ui.MaskImageView");
        return z;
    }

    public void setClickable(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setClickable", "com.tencent.mm.plugin.sns.ui.MaskImageView");
        Log.printInfoStack("MicroMsg.MaskImageView", "setClickable %b", Boolean.valueOf(z));
        super.setClickable(z);
        SnsMethodCalculate.markEndTimeMs("setClickable", "com.tencent.mm.plugin.sns.ui.MaskImageView");
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        SnsMethodCalculate.markStartTimeMs("setOnClickListener", "com.tencent.mm.plugin.sns.ui.MaskImageView");
        Log.printInfoStack("MicroMsg.MaskImageView", "setOnClickListener", new Object[0]);
        super.setOnClickListener(onClickListener);
        SnsMethodCalculate.markEndTimeMs("setOnClickListener", "com.tencent.mm.plugin.sns.ui.MaskImageView");
    }

    public void settouchEnable(boolean z) {
        SnsMethodCalculate.markStartTimeMs("settouchEnable", "com.tencent.mm.plugin.sns.ui.MaskImageView");
        this.f276962N = z;
        SnsMethodCalculate.markEndTimeMs("settouchEnable", "com.tencent.mm.plugin.sns.ui.MaskImageView");
    }

    public MaskImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo132228p();
    }
}
