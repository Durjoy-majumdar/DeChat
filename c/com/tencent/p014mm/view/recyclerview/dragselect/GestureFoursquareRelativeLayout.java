package com.tencent.p014mm.view.recyclerview.dragselect;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.p136ui.widget.FoursquareRelativeLayout;
import com.tencent.p014mm.plugin.gallery.p473ui.C94049a;
import fy3.C32228q;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import kotlin.Metadata;
import rx3.C13598b0;
import sn0.C90259e;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001'B\u001d\b\u0007\u0012\u0006\u0010\"\u001a\u00020!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R<\u0010\u0012\u001a\u001c\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u001a\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0017\u0010 \u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006("}, mo182094d2 = {"Lcom/tencent/mm/view/recyclerview/dragselect/GestureFoursquareRelativeLayout;", "Lcom/tencent/mm/ui/widget/FoursquareRelativeLayout;", "", "d", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "TAG", "Lkotlin/Function3;", "", "Landroid/view/View;", "Lrx3/b0;", "e", "Lfy3/q;", "getOnItemScrollListener", "()Lfy3/q;", "setOnItemScrollListener", "(Lfy3/q;)V", "onItemScrollListener", "Lcom/tencent/mm/view/recyclerview/dragselect/GestureFoursquareRelativeLayout$a;", "f", "Lcom/tencent/mm/view/recyclerview/dragselect/GestureFoursquareRelativeLayout$a;", "getItemGestureListener", "()Lcom/tencent/mm/view/recyclerview/dragselect/GestureFoursquareRelativeLayout$a;", "setItemGestureListener", "(Lcom/tencent/mm/view/recyclerview/dragselect/GestureFoursquareRelativeLayout$a;)V", "itemGestureListener", "Landroid/view/GestureDetector;", "g", "Landroid/view/GestureDetector;", "getGestureDetector", "()Landroid/view/GestureDetector;", "gestureDetector", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.view.recyclerview.dragselect.GestureFoursquareRelativeLayout */
public final class GestureFoursquareRelativeLayout extends FoursquareRelativeLayout {

    /* renamed from: d */
    public final String f220884d = ("GestureFour." + hashCode());

    /* renamed from: e */
    public C32228q<? super Float, ? super Float, ? super View, C13598b0> f220885e;

    /* renamed from: f */
    public C75077a f220886f;

    /* renamed from: g */
    public final GestureDetector f220887g;

    /* renamed from: com.tencent.mm.view.recyclerview.dragselect.GestureFoursquareRelativeLayout$a */
    public interface C75077a {
    }

    /* renamed from: com.tencent.mm.view.recyclerview.dragselect.GestureFoursquareRelativeLayout$b */
    public static final class C75078b extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: d */
        public final /* synthetic */ GestureFoursquareRelativeLayout f220888d;

        public C75078b(GestureFoursquareRelativeLayout gestureFoursquareRelativeLayout) {
            this.f220888d = gestureFoursquareRelativeLayout;
        }

        public boolean onContextClick(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/view/recyclerview/dragselect/GestureFoursquareRelativeLayout$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onContextClick = super.onContextClick(motionEvent);
            C117292a.m165362h(onContextClick, this, "com/tencent/mm/view/recyclerview/dragselect/GestureFoursquareRelativeLayout$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
            return onContextClick;
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/view/recyclerview/dragselect/GestureFoursquareRelativeLayout$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onDoubleTap = super.onDoubleTap(motionEvent);
            C117292a.m165362h(onDoubleTap, this, "com/tencent/mm/view/recyclerview/dragselect/GestureFoursquareRelativeLayout$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
            return onDoubleTap;
        }

        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return super.onDoubleTapEvent(motionEvent);
        }

        public boolean onDown(MotionEvent motionEvent) {
            return super.onDown(motionEvent);
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return super.onFling(motionEvent, motionEvent2, f, f2);
        }

        public void onLongPress(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/view/recyclerview/dragselect/GestureFoursquareRelativeLayout$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
            C75077a itemGestureListener = this.f220888d.getItemGestureListener();
            if (itemGestureListener != null) {
                C94049a.m118872F4(C94049a.this, this.f220888d);
            }
            super.onLongPress(motionEvent);
            C117292a.m165361g(this, "com/tencent/mm/view/recyclerview/dragselect/GestureFoursquareRelativeLayout$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            C75077a itemGestureListener = this.f220888d.getItemGestureListener();
            if (itemGestureListener == null) {
                return super.onScroll(motionEvent, motionEvent2, f, f2);
            }
            GestureFoursquareRelativeLayout gestureFoursquareRelativeLayout = this.f220888d;
            C94049a.C68996b bVar = (C94049a.C68996b) itemGestureListener;
            if (Math.abs(f) > 0.0f) {
                C94049a.m118872F4(C94049a.this, gestureFoursquareRelativeLayout);
            }
            return false;
        }

        public void onShowPress(MotionEvent motionEvent) {
            super.onShowPress(motionEvent);
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            return super.onSingleTapConfirmed(motionEvent);
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/view/recyclerview/dragselect/GestureFoursquareRelativeLayout$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
            C117292a.m165362h(onSingleTapUp, this, "com/tencent/mm/view/recyclerview/dragselect/GestureFoursquareRelativeLayout$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
            return onSingleTapUp;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GestureFoursquareRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        this.f220887g = new GestureDetector(context, new C75078b(this));
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        GestureDetector gestureDetector = this.f220887g;
        C9556a aVar = new C9556a();
        aVar.mo10233c(motionEvent);
        C117292a.m165358d(gestureDetector, aVar.mo10232b(), "com/tencent/mm/view/recyclerview/dragselect/GestureFoursquareRelativeLayout", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        C117292a.m165360f(gestureDetector, gestureDetector.onTouchEvent((MotionEvent) aVar.mo10231a(0)), "com/tencent/mm/view/recyclerview/dragselect/GestureFoursquareRelativeLayout", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        return super.dispatchTouchEvent(motionEvent);
    }

    public final GestureDetector getGestureDetector() {
        return this.f220887g;
    }

    public final C75077a getItemGestureListener() {
        return this.f220886f;
    }

    public final C32228q<Float, Float, View, C13598b0> getOnItemScrollListener() {
        return this.f220885e;
    }

    public final String getTAG() {
        return this.f220884d;
    }

    public final void setItemGestureListener(C75077a aVar) {
        this.f220886f = aVar;
    }

    public final void setOnItemScrollListener(C32228q<? super Float, ? super Float, ? super View, C13598b0> qVar) {
        this.f220885e = qVar;
    }
}
