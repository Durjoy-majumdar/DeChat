package com.tencent.p014mm.plugin.sns.p106ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import sn0.C90259e;

/* renamed from: com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView */
public class SnsAdTouchProgressView extends FrameLayout {

    /* renamed from: d */
    public Context f281518d;

    /* renamed from: e */
    public GestureDetector f281519e;

    /* renamed from: f */
    public boolean f281520f = false;

    /* renamed from: g */
    public boolean f281521g = false;

    /* renamed from: h */
    public Handler f281522h;

    /* renamed from: i */
    public int f281523i = 500;

    /* renamed from: j */
    public int f281524j = 500;

    /* renamed from: n */
    public C96297b f281525n;

    /* renamed from: com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView$a */
    public class C96295a implements GestureDetector.OnGestureListener {

        /* renamed from: com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView$a$a */
        public class C96296a implements Runnable {
            public C96296a() {
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView$1$1");
                SnsAdTouchProgressView snsAdTouchProgressView = SnsAdTouchProgressView.this;
                C96297b bVar = snsAdTouchProgressView.f281525n;
                if (bVar != null) {
                    snsAdTouchProgressView.f281520f = true;
                    bVar.onFinish();
                }
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView$1$1");
            }
        }

        public C96295a() {
        }

        public boolean onDown(MotionEvent motionEvent) {
            SnsMethodCalculate.markStartTimeMs("onDown", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView$1");
            SnsMethodCalculate.markEndTimeMs("onDown", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView$1");
            return true;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            SnsMethodCalculate.markStartTimeMs("onFling", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView$1");
            SnsMethodCalculate.markEndTimeMs("onFling", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView$1");
            return true;
        }

        public void onLongPress(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/widget/SnsAdTouchProgressView$1", "android/view/GestureDetector$OnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
            SnsMethodCalculate.markStartTimeMs(C90259e.C90260a.NAME, "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView$1");
            Log.m105924i("SnsAdTouchProgressView", C90259e.C90260a.NAME);
            SnsAdTouchProgressView.this.getParent().requestDisallowInterceptTouchEvent(true);
            SnsAdTouchProgressView snsAdTouchProgressView = SnsAdTouchProgressView.this;
            snsAdTouchProgressView.f281521g = true;
            C96297b bVar = snsAdTouchProgressView.f281525n;
            if (bVar != null) {
                bVar.onStart();
            }
            SnsAdTouchProgressView snsAdTouchProgressView2 = SnsAdTouchProgressView.this;
            int i = snsAdTouchProgressView2.f281524j - snsAdTouchProgressView2.f281523i;
            if (i < 0) {
                i = 0;
            }
            snsAdTouchProgressView2.f281522h.postDelayed(new C96296a(), (long) i);
            SnsMethodCalculate.markEndTimeMs(C90259e.C90260a.NAME, "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView$1");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/widget/SnsAdTouchProgressView$1", "android/view/GestureDetector$OnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            SnsMethodCalculate.markStartTimeMs("onScroll", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView$1");
            SnsMethodCalculate.markEndTimeMs("onScroll", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView$1");
            return true;
        }

        public void onShowPress(MotionEvent motionEvent) {
            SnsMethodCalculate.markStartTimeMs("onShowPress", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView$1");
            SnsMethodCalculate.markEndTimeMs("onShowPress", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView$1");
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/widget/SnsAdTouchProgressView$1", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
            SnsMethodCalculate.markStartTimeMs("onSingleTapUp", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView$1");
            SnsAdTouchProgressView snsAdTouchProgressView = SnsAdTouchProgressView.this;
            C96297b bVar = snsAdTouchProgressView.f281525n;
            if (bVar != null) {
                bVar.onClick(snsAdTouchProgressView);
            }
            SnsMethodCalculate.markEndTimeMs("onSingleTapUp", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView$1");
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/sns/ui/widget/SnsAdTouchProgressView$1", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView$b */
    public interface C96297b {
        void onCancel();

        void onClick(View view);

        void onFinish();

        void onStart();
    }

    public SnsAdTouchProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo134054a(context);
    }

    /* renamed from: a */
    public void mo134054a(Context context) {
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView");
        this.f281518d = context;
        this.f281522h = new Handler(Looper.getMainLooper());
        this.f281523i = ViewConfiguration.getLongPressTimeout();
        Log.m105924i("SnsAdTouchProgressView", "init, longPressTimeout=" + this.f281523i);
        if (this.f281523i < 500) {
            this.f281523i = 500;
        }
        this.f281524j = this.f281523i;
        this.f281519e = new GestureDetector(context, new C96295a());
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView");
    }

    public void dispatchDraw(Canvas canvas) {
        SnsMethodCalculate.markStartTimeMs("dispatchDraw", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView");
        super.dispatchDraw(canvas);
        SnsMethodCalculate.markEndTimeMs("dispatchDraw", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView");
    }

    public int getLongPressTime() {
        SnsMethodCalculate.markStartTimeMs("getLongPressTime", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView");
        int i = this.f281523i;
        SnsMethodCalculate.markEndTimeMs("getLongPressTime", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView");
        return i;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C96297b bVar;
        SnsMethodCalculate.markStartTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView");
        int action = motionEvent.getAction();
        GestureDetector gestureDetector = this.f281519e;
        C9556a aVar = new C9556a();
        aVar.mo10233c(motionEvent);
        C117292a.m165358d(gestureDetector, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/widget/SnsAdTouchProgressView", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        boolean onTouchEvent = gestureDetector.onTouchEvent((MotionEvent) aVar.mo10231a(0));
        C117292a.m165360f(gestureDetector, onTouchEvent, "com/tencent/mm/plugin/sns/ui/widget/SnsAdTouchProgressView", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        if (action == 0) {
            this.f281520f = false;
        } else if (action == 1 || action == 3) {
            Log.m105924i("SnsAdTouchProgressView", "onTouchEvent cancel， action=" + action + ", IsLongClicked=" + this.f281521g + ", isSuccFinish=" + this.f281520f);
            getParent().requestDisallowInterceptTouchEvent(false);
            this.f281522h.removeCallbacksAndMessages((Object) null);
            if (!this.f281520f && this.f281521g && (bVar = this.f281525n) != null) {
                bVar.onCancel();
            }
            this.f281521g = false;
            SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView");
            Log.m105924i("SnsAdTouchProgressView", "clear");
            this.f281522h.removeCallbacksAndMessages((Object) null);
            SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView");
        }
        SnsMethodCalculate.markEndTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView");
        return onTouchEvent;
    }

    public void setActionListener(C96297b bVar) {
        SnsMethodCalculate.markStartTimeMs("setActionListener", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView");
        this.f281525n = bVar;
        SnsMethodCalculate.markEndTimeMs("setActionListener", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView");
    }

    public void setPressDuration(int i) {
        SnsMethodCalculate.markStartTimeMs("setPressDuration", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView");
        Log.m105924i("SnsAdTouchProgressView", "setPressDuration:" + i);
        int i2 = this.f281523i;
        if (i < i2) {
            i = i2;
        }
        this.f281524j = i;
        SnsMethodCalculate.markEndTimeMs("setPressDuration", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView");
    }

    public SnsAdTouchProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo134054a(context);
    }
}
