package com.tencent.p014mm.p136ui.chatting.component;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import fy3.C32227p;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.chatting.component.c3 */
public final class C73451c3 implements GestureDetector.OnDoubleTapListener {

    /* renamed from: d */
    public final /* synthetic */ LoadableTextView f215835d;

    public C73451c3(LoadableTextView loadableTextView) {
        this.f215835d = loadableTextView;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/component/LoadableTextView$gestureDetector$2$1", "android/view/GestureDetector$OnDoubleTapListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        C87412m.m108594g(motionEvent, "e");
        C117292a.m165362h(false, this, "com/tencent/mm/ui/chatting/component/LoadableTextView$gestureDetector$2$1", "android/view/GestureDetector$OnDoubleTapListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        return false;
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "e");
        LoadableTextView loadableTextView = this.f215835d;
        C32227p<? super View, ? super MotionEvent, Boolean> pVar = loadableTextView.f215646i;
        if (pVar != null) {
            return pVar.invoke(loadableTextView, motionEvent).booleanValue();
        }
        return false;
    }
}
