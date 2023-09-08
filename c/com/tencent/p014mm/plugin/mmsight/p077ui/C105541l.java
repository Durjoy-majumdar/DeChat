package com.tencent.p014mm.plugin.mmsight.p077ui;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.tencent.p014mm.plugin.mmsight.p077ui.MMSightCaptureTouchView;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import sn0.C90259e;

/* renamed from: com.tencent.mm.plugin.mmsight.ui.l */
public class C105541l extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: d */
    public final /* synthetic */ MMSightCaptureTouchView f313948d;

    public C105541l(MMSightCaptureTouchView mMSightCaptureTouchView) {
        this.f313948d = mMSightCaptureTouchView;
    }

    public boolean onContextClick(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/mmsight/ui/MMSightCaptureTouchView$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onContextClick = super.onContextClick(motionEvent);
        C117292a.m165362h(onContextClick, this, "com/tencent/mm/plugin/mmsight/ui/MMSightCaptureTouchView$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
        return onContextClick;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/mmsight/ui/MMSightCaptureTouchView$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        Log.m105924i("MicroMsg.MMSightCaptureTouchView", "onDoubleTap");
        long currentTimeMillis = System.currentTimeMillis();
        MMSightCaptureTouchView mMSightCaptureTouchView = this.f313948d;
        if (currentTimeMillis - mMSightCaptureTouchView.f313744d > 1000) {
            MMSightCaptureTouchView.C105491a aVar = mMSightCaptureTouchView.f313747g;
            if (aVar != null) {
                aVar.mo128050c();
            }
            this.f313948d.f313744d = System.currentTimeMillis();
        }
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/mmsight/ui/MMSightCaptureTouchView$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        return false;
    }

    public void onLongPress(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/mmsight/ui/MMSightCaptureTouchView$1", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        super.onLongPress(motionEvent);
        C117292a.m165361g(this, "com/tencent/mm/plugin/mmsight/ui/MMSightCaptureTouchView$1", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        Log.m105924i("MicroMsg.MMSightCaptureTouchView", "onSingleTapConfirmed");
        return true;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/mmsight/ui/MMSightCaptureTouchView$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        Log.m105924i("MicroMsg.MMSightCaptureTouchView", "onSingleTapUp");
        MMSightCaptureTouchView.C105491a aVar = this.f313948d.f313747g;
        if (aVar != null) {
            aVar.mo128051e(motionEvent.getX(), motionEvent.getY());
        }
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/mmsight/ui/MMSightCaptureTouchView$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return false;
    }
}
