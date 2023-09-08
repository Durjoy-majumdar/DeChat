package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import j20.C117292a;
import java.util.ArrayList;
import sn0.C90259e;

/* renamed from: com.tencent.mm.plugin.sns.ui.i5 */
public class C95813i5 extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: d */
    public final /* synthetic */ SnsOnlineVideoActivity f279573d;

    public C95813i5(SnsOnlineVideoActivity snsOnlineVideoActivity) {
        this.f279573d = snsOnlineVideoActivity;
    }

    public boolean onContextClick(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity$3", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onContextClick = super.onContextClick(motionEvent);
        C117292a.m165362h(onContextClick, this, "com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity$3", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
        return onContextClick;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity$3", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onDoubleTap = super.onDoubleTap(motionEvent);
        C117292a.m165362h(onDoubleTap, this, "com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity$3", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        return onDoubleTap;
    }

    public void onLongPress(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity$3", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        SnsMethodCalculate.markStartTimeMs(C90259e.C90260a.NAME, "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$3");
        SnsOnlineVideoActivity.m122200O7(this.f279573d, true);
        super.onLongPress(motionEvent);
        SnsMethodCalculate.markEndTimeMs(C90259e.C90260a.NAME, "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$3");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity$3", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        SnsMethodCalculate.markStartTimeMs("onScroll", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$3");
        float rawX = motionEvent2.getRawX() - motionEvent.getRawX();
        float rawY = motionEvent2.getRawY() - motionEvent.getRawY();
        if (Math.abs(rawX) <= ((float) SnsOnlineVideoActivity.m122193H7(this.f279573d).getWidth()) && Math.abs(rawY) <= ((float) SnsOnlineVideoActivity.m122193H7(this.f279573d).getHeight()) && SnsOnlineVideoActivity.m122198M7(this.f279573d)) {
            SnsOnlineVideoActivity.m122199N7(this.f279573d).setTranslationX(rawX);
            SnsOnlineVideoActivity.m122199N7(this.f279573d).setTranslationY(rawY);
        }
        SnsMethodCalculate.markEndTimeMs("onScroll", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$3");
        return true;
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        SnsMethodCalculate.markStartTimeMs("onSingleTapConfirmed", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$3");
        SnsOnlineVideoActivity snsOnlineVideoActivity = this.f279573d;
        int i = SnsOnlineVideoActivity.f278370y0;
        SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        boolean z = snsOnlineVideoActivity.f278401i;
        SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        if (!z) {
            this.f279573d.mo132875W7();
        }
        SnsMethodCalculate.markEndTimeMs("onSingleTapConfirmed", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$3");
        return true;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity$3", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
        C117292a.m165362h(onSingleTapUp, this, "com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity$3", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return onSingleTapUp;
    }
}
