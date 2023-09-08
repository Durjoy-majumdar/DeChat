package com.tencent.p014mm.p136ui.widget.cropview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.FrameLayout;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import kotlin.Metadata;
import rx3.C13601g;
import rx3.C36568h;
import sn0.C90259e;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u001b\b\u0016\u0012\u0006\u0010%\u001a\u00020$\u0012\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b(\u0010)B#\b\u0016\u0012\u0006\u0010%\u001a\u00020$\u0012\b\u0010'\u001a\u0004\u0018\u00010&\u0012\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b(\u0010,R\"\u0010\t\u001a\u00020\u00068\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u000e\u001a\u00020\u00068\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\r\u0010\b\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\"\u0010\u0011\u001a\u00020\u00068\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\b\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\"\u0010\u0014\u001a\u00020\u00068\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\b\u001a\u0004\b\u0014\u0010\n\"\u0004\b\u0015\u0010\fR\"\u0010\u0017\u001a\u00020\u00068\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\b\u001a\u0004\b\u0017\u0010\n\"\u0004\b\u0018\u0010\fR\u001b\u0010\u001e\u001a\u00020\u00198BX\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8DX\u0002¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\"¨\u0006-"}, mo182094d2 = {"Lcom/tencent/mm/ui/widget/cropview/TouchEventLayout;", "Landroid/widget/FrameLayout;", "Landroid/view/View$OnTouchListener;", "Landroid/view/ScaleGestureDetector$OnScaleGestureListener;", "Landroid/view/GestureDetector$OnGestureListener;", "Landroid/view/GestureDetector$OnDoubleTapListener;", "", "d", "Z", "isEnableTouch", "()Z", "setEnableTouch", "(Z)V", "e", "isEnableScale", "setEnableScale", "f", "isEnableFling", "setEnableFling", "g", "isEnableOverScroll", "setEnableOverScroll", "h", "isEnableScroll", "setEnableScroll", "Landroid/view/ScaleGestureDetector;", "i", "Lrx3/g;", "getScaleDetector", "()Landroid/view/ScaleGestureDetector;", "scaleDetector", "Landroid/view/GestureDetector;", "j", "getTouchDetector", "()Landroid/view/GestureDetector;", "touchDetector", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.widget.cropview.TouchEventLayout */
public class TouchEventLayout extends FrameLayout implements View.OnTouchListener, ScaleGestureDetector.OnScaleGestureListener, GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {

    /* renamed from: d */
    public boolean f165531d = true;

    /* renamed from: e */
    public boolean f165532e = true;

    /* renamed from: f */
    public boolean f165533f = true;

    /* renamed from: g */
    public boolean f165534g = true;

    /* renamed from: h */
    public boolean f165535h = true;

    /* renamed from: i */
    public final C13601g f165536i = C36568h.m40985a(new C57865a(this));

    /* renamed from: j */
    public final C13601g f165537j = C36568h.m40985a(new C57866b(this));

    /* renamed from: com.tencent.mm.ui.widget.cropview.TouchEventLayout$a */
    public static final class C57865a extends C87413o implements C32224a<ScaleGestureDetector> {

        /* renamed from: d */
        public final /* synthetic */ TouchEventLayout f165538d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57865a(TouchEventLayout touchEventLayout) {
            super(0);
            this.f165538d = touchEventLayout;
        }

        public Object invoke() {
            return new ScaleGestureDetector(this.f165538d.getContext(), this.f165538d);
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.cropview.TouchEventLayout$b */
    public static final class C57866b extends C87413o implements C32224a<GestureDetector> {

        /* renamed from: d */
        public final /* synthetic */ TouchEventLayout f165539d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57866b(TouchEventLayout touchEventLayout) {
            super(0);
            this.f165539d = touchEventLayout;
        }

        public Object invoke() {
            return new GestureDetector(this.f165539d.getContext(), this.f165539d);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TouchEventLayout(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    private final ScaleGestureDetector getScaleDetector() {
        return (ScaleGestureDetector) this.f165536i.getValue();
    }

    /* renamed from: c */
    public void mo82325c(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "e1");
    }

    public boolean canScrollHorizontally(int i) {
        return true;
    }

    public boolean canScrollVertically(int i) {
        return true;
    }

    public final GestureDetector getTouchDetector() {
        return (GestureDetector) this.f165537j.getValue();
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/widget/cropview/TouchEventLayout", "android/view/GestureDetector$OnDoubleTapListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        C117292a.m165362h(true, this, "com/tencent/mm/ui/widget/cropview/TouchEventLayout", "android/view/GestureDetector$OnDoubleTapListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        return true;
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return true;
    }

    public boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C87412m.m108594g(motionEvent, "e1");
        C87412m.m108594g(motionEvent2, "e2");
        return this.f165533f;
    }

    public void onLongPress(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/widget/cropview/TouchEventLayout", "android/view/GestureDetector$OnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        C87412m.m108594g(motionEvent, "e");
        C117292a.m165361g(this, "com/tencent/mm/ui/widget/cropview/TouchEventLayout", "android/view/GestureDetector$OnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        C87412m.m108594g(scaleGestureDetector, "detector");
        return this.f165532e;
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        C87412m.m108594g(scaleGestureDetector, "detector");
        return this.f165532e;
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        C87412m.m108594g(scaleGestureDetector, "detector");
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C87412m.m108594g(motionEvent, "e1");
        C87412m.m108594g(motionEvent2, "e2");
        return true;
    }

    public void onShowPress(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "e");
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return true;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/widget/cropview/TouchEventLayout", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        C87412m.m108594g(motionEvent, "e");
        C117292a.m165362h(true, this, "com/tencent/mm/ui/widget/cropview/TouchEventLayout", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return true;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        C87412m.m108594g(view, "v");
        C87412m.m108594g(motionEvent, "event");
        if (!this.f165531d) {
            return false;
        }
        if (this.f165532e) {
            getScaleDetector().onTouchEvent(motionEvent);
        }
        GestureDetector touchDetector = getTouchDetector();
        C9556a aVar = new C9556a();
        aVar.mo10233c(motionEvent);
        GestureDetector gestureDetector = touchDetector;
        C117292a.m165358d(gestureDetector, aVar.mo10232b(), "com/tencent/mm/ui/widget/cropview/TouchEventLayout", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        C117292a.m165360f(gestureDetector, touchDetector.onTouchEvent((MotionEvent) aVar.mo10231a(0)), "com/tencent/mm/ui/widget/cropview/TouchEventLayout", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            mo82325c(motionEvent);
        }
        return true;
    }

    public void setEnableFling(boolean z) {
        this.f165533f = z;
    }

    public void setEnableOverScroll(boolean z) {
        this.f165534g = z;
    }

    public void setEnableScale(boolean z) {
        this.f165532e = z;
    }

    public void setEnableScroll(boolean z) {
        this.f165535h = z;
    }

    public void setEnableTouch(boolean z) {
        this.f165531d = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TouchEventLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TouchEventLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
    }
}
