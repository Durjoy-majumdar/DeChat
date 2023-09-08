package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.BizTimeLineUI;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18412m3;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.BizTLRecCardJsEngine;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C19623o0;
import j20.C117292a;
import java.util.ArrayList;
import rb0.C48009v0;
import sn0.C90259e;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.g1 */
public final class C85104g1 extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: d */
    public final /* synthetic */ BizTLRecCardJsEngine f247984d;

    public C85104g1(BizTLRecCardJsEngine bizTLRecCardJsEngine) {
        this.f247984d = bizTLRecCardJsEngine;
    }

    public boolean onContextClick(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardJsEngine$initGestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onContextClick = super.onContextClick(motionEvent);
        C117292a.m165362h(onContextClick, this, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardJsEngine$initGestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
        return onContextClick;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardJsEngine$initGestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onDoubleTap = super.onDoubleTap(motionEvent);
        C117292a.m165362h(onDoubleTap, this, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardJsEngine$initGestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        return onDoubleTap;
    }

    public void onLongPress(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardJsEngine$initGestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        super.onLongPress(motionEvent);
        C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardJsEngine$initGestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardJsEngine$initGestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        if (C112551y.m153811k(this.f247984d.f247973V)) {
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardJsEngine$initGestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
            return false;
        }
        BizTLRecCardJsEngine bizTLRecCardJsEngine = this.f247984d;
        Long l = bizTLRecCardJsEngine.f247970S.get(bizTLRecCardJsEngine.f247973V);
        if (l == null) {
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardJsEngine$initGestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
            return false;
        }
        long longValue = l.longValue();
        BizTLRecCardJsEngine.Companion companion = BizTLRecCardJsEngine.f247961Y;
        Log.m105924i("MicroMsg.BizTLRecCardJsEngine", "onSingleTapUp canvasId=" + this.f247984d.f247973V + ", msgIds=" + longValue);
        C19623o0 kD = C48009v0.Jx0().mo25806kD(longValue);
        if (kD != null) {
            BizTLRecCardJsEngine bizTLRecCardJsEngine2 = this.f247984d;
            if (kD.mo25753A2()) {
                Context context = bizTLRecCardJsEngine2.f247972U.get();
                BizTimeLineUI bizTimeLineUI = context instanceof BizTimeLineUI ? (BizTimeLineUI) context : null;
                if (bizTimeLineUI != null) {
                    C18412m3 m3Var = bizTimeLineUI.f50249v;
                    m3Var.getClass();
                    m3Var.mo22975b(kD, 0, (int) (System.currentTimeMillis() / 1000));
                }
            }
        }
        boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
        C117292a.m165362h(onSingleTapUp, this, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardJsEngine$initGestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return onSingleTapUp;
    }
}
