package com.tencent.p014mm.p136ui.tools;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.tencent.p014mm.p136ui.tools.C45059m0;
import j20.C117292a;
import java.util.ArrayList;
import sn0.C90259e;

/* renamed from: com.tencent.mm.ui.tools.n0 */
public class C45072n0 extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: d */
    public final /* synthetic */ C45059m0 f122258d;

    public C45072n0(C45059m0 m0Var) {
        this.f122258d = m0Var;
    }

    public boolean onContextClick(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/tools/ImagePreviewAnimation$7", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onContextClick = super.onContextClick(motionEvent);
        C117292a.m165362h(onContextClick, this, "com/tencent/mm/ui/tools/ImagePreviewAnimation$7", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
        return onContextClick;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/tools/ImagePreviewAnimation$7", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onDoubleTap = super.onDoubleTap(motionEvent);
        C117292a.m165362h(onDoubleTap, this, "com/tencent/mm/ui/tools/ImagePreviewAnimation$7", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        return onDoubleTap;
    }

    public void onLongPress(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/tools/ImagePreviewAnimation$7", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        C45059m0 m0Var = this.f122258d;
        m0Var.f122215C = true;
        C45059m0.C45069j jVar = m0Var.f122217E;
        if (jVar != null) {
            jVar.mo68704a();
        }
        super.onLongPress(motionEvent);
        C117292a.m165361g(this, "com/tencent/mm/ui/tools/ImagePreviewAnimation$7", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/tools/ImagePreviewAnimation$7", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        C45059m0.C45071l lVar = this.f122258d.f122218F;
        if (lVar != null) {
            lVar.mo68705a();
        }
        boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
        C117292a.m165362h(onSingleTapUp, this, "com/tencent/mm/ui/tools/ImagePreviewAnimation$7", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return onSingleTapUp;
    }
}
