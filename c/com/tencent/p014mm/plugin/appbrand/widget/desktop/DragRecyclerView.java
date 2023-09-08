package com.tencent.p014mm.plugin.appbrand.widget.desktop;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import sn0.C90259e;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.desktop.DragRecyclerView */
public abstract class DragRecyclerView extends RecyclerView implements GestureDetector.OnGestureListener {

    /* renamed from: A1 */
    public boolean f197325A1 = false;

    /* renamed from: y1 */
    public GestureDetector f197326y1;

    /* renamed from: z1 */
    public DragFeatureView f197327z1;

    public DragRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f197326y1 = new GestureDetector(context, this);
    }

    /* renamed from: A */
    public boolean mo94464A() {
        return this.f197325A1;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DragFeatureView dragFeatureView;
        MotionEvent motionEvent2 = motionEvent;
        Context context = getContext();
        if (Build.VERSION.SDK_INT >= 24 && (context instanceof Activity) && ((Activity) context).isInMultiWindowMode()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        GestureDetector gestureDetector = this.f197326y1;
        C9556a aVar = new C9556a();
        aVar.mo10233c(motionEvent2);
        C117292a.m165358d(gestureDetector, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/widget/desktop/DragRecyclerView", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        C117292a.m165360f(gestureDetector, gestureDetector.onTouchEvent((MotionEvent) aVar.mo10231a(0)), "com/tencent/mm/plugin/appbrand/widget/desktop/DragRecyclerView", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        if (this.f197325A1 || ((motionEvent.getAction() == 3 || motionEvent.getAction() == 1) && (dragFeatureView = this.f197327z1) != null && dragFeatureView.f197311y)) {
            DragFeatureView dragFeatureView2 = this.f197327z1;
            if (dragFeatureView2 != null) {
                dragFeatureView2.onTouch(this, motionEvent2);
            }
            int action = motionEvent.getAction();
            motionEvent2.setAction(3);
            for (int i = 0; i < getChildCount(); i++) {
                getChildAt(i).dispatchTouchEvent(motionEvent2);
            }
            motionEvent2.setAction(action);
        } else if (motionEvent.getAction() == 3) {
            DragFeatureView dragFeatureView3 = this.f197327z1;
            dragFeatureView3.getClass();
            Log.m105924i("MicroMsg.DragFeatureView", "cancelGestureDetector");
            GestureDetector gestureDetector2 = dragFeatureView3.f197297h;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(motionEvent2);
            GestureDetector gestureDetector3 = gestureDetector2;
            C117292a.m165358d(gestureDetector3, aVar2.mo10232b(), "com/tencent/mm/plugin/appbrand/widget/desktop/DragFeatureView", "cancelGestureDetector", "(Landroid/view/MotionEvent;)V", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            C117292a.m165360f(gestureDetector3, gestureDetector2.onTouchEvent((MotionEvent) aVar2.mo10231a(0)), "com/tencent/mm/plugin/appbrand/widget/desktop/DragFeatureView", "cancelGestureDetector", "(Landroid/view/MotionEvent;)V", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        }
        return this.f197325A1 || super.dispatchTouchEvent(motionEvent);
    }

    public DragFeatureView getDragRubbishView() {
        return this.f197327z1;
    }

    public boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public void onLongPress(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/widget/desktop/DragRecyclerView", "android/view/GestureDetector$OnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        if (this.f197325A1) {
            Log.m105924i("DragRecyclerView", "alvinluo onLongPress ignore");
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/widget/desktop/DragRecyclerView", "android/view/GestureDetector$OnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
            return;
        }
        DragFeatureView dragFeatureView = this.f197327z1;
        if (dragFeatureView != null) {
            dragFeatureView.onLongPress(motionEvent);
            this.f197325A1 = this.f197327z1.getVisibility() == 0;
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/widget/desktop/DragRecyclerView", "android/view/GestureDetector$OnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/widget/desktop/DragRecyclerView", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/appbrand/widget/desktop/DragRecyclerView", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return false;
    }

    public void setLongPress(boolean z) {
        this.f197325A1 = z;
    }

    public DragRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f197326y1 = new GestureDetector(context, this);
    }

    public DragRecyclerView(Context context) {
        super(context, (AttributeSet) null);
        this.f197326y1 = new GestureDetector(context, this);
    }
}
