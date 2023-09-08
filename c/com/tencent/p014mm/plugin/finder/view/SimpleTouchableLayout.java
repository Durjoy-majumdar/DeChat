package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.p014mm.plugin.finder.view.C18791w;
import fy3.C32224a;
import fy3.C32229r;
import gy3.C87412m;
import kotlin.Metadata;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0005fgh\u000e\u0014B\u001b\b\u0016\u0012\u0006\u0010_\u001a\u00020^\u0012\b\u0010a\u001a\u0004\u0018\u00010`¢\u0006\u0004\bb\u0010cB#\b\u0016\u0012\u0006\u0010_\u001a\u00020^\u0012\b\u0010a\u001a\u0004\u0018\u00010`\u0012\u0006\u0010d\u001a\u00020\n¢\u0006\u0004\bb\u0010eJ\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\bH\u0016J\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nR\"\u0010\u0010\u001a\u00020\r8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0015\u001a\u00020\r8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u001b\u0010\u001c\u001a\u00020\u00178DX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR$\u0010#\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\u0007\u0010\"R$\u0010+\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u00103\u001a\u0004\u0018\u00010,8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102RB\u0010=\u001a\"\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\r\u0018\u0001048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<RB\u0010A\u001a\"\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\r\u0018\u0001048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b>\u00108\u001a\u0004\b?\u0010:\"\u0004\b@\u0010<R*\u0010I\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010B8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010J\u001a\u00020\r8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\bJ\u0010\u000f\u001a\u0004\bJ\u0010\u0011\"\u0004\bK\u0010\u0013R\"\u0010L\u001a\u00020\r8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\bL\u0010\u000f\u001a\u0004\bL\u0010\u0011\"\u0004\bM\u0010\u0013R\"\u0010N\u001a\u00020\r8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\bN\u0010\u000f\u001a\u0004\bN\u0010\u0011\"\u0004\bO\u0010\u0013R$\u0010Q\u001a\u0004\u0018\u00010P8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR$\u0010X\u001a\u0004\u0018\u00010W8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]¨\u0006i"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/SimpleTouchableLayout;", "Landroid/widget/FrameLayout;", "Lcom/tencent/mm/plugin/finder/view/w$d;", "Lcom/tencent/mm/plugin/finder/view/w$c;", "Landroid/view/View$OnLongClickListener;", "l", "Lrx3/b0;", "setOnLongClickListener", "Landroid/view/View$OnClickListener;", "setOnClickListener", "", "longPressTimeout", "setLongPressTimeout", "", "d", "Z", "isEnableTouch", "()Z", "setEnableTouch", "(Z)V", "e", "isEnableFling", "setEnableFling", "Lcom/tencent/mm/plugin/finder/view/w;", "f", "Lrx3/g;", "getTouchDetector", "()Lcom/tencent/mm/plugin/finder/view/w;", "touchDetector", "Lcom/tencent/mm/plugin/finder/view/SimpleTouchableLayout$c;", "g", "Lcom/tencent/mm/plugin/finder/view/SimpleTouchableLayout$c;", "getOnLongClickListener", "()Lcom/tencent/mm/plugin/finder/view/SimpleTouchableLayout$c;", "(Lcom/tencent/mm/plugin/finder/view/SimpleTouchableLayout$c;)V", "onLongClickListener", "Lcom/tencent/mm/plugin/finder/view/SimpleTouchableLayout$e;", "h", "Lcom/tencent/mm/plugin/finder/view/SimpleTouchableLayout$e;", "getOnSingleClickListener", "()Lcom/tencent/mm/plugin/finder/view/SimpleTouchableLayout$e;", "setOnSingleClickListener", "(Lcom/tencent/mm/plugin/finder/view/SimpleTouchableLayout$e;)V", "onSingleClickListener", "Lcom/tencent/mm/plugin/finder/view/SimpleTouchableLayout$a;", "i", "Lcom/tencent/mm/plugin/finder/view/SimpleTouchableLayout$a;", "getOnDoubleClickListener", "()Lcom/tencent/mm/plugin/finder/view/SimpleTouchableLayout$a;", "setOnDoubleClickListener", "(Lcom/tencent/mm/plugin/finder/view/SimpleTouchableLayout$a;)V", "onDoubleClickListener", "Lkotlin/Function4;", "Landroid/view/MotionEvent;", "", "j", "Lfy3/r;", "getOnScrollListener", "()Lfy3/r;", "setOnScrollListener", "(Lfy3/r;)V", "onScrollListener", "n", "getOnFlingListener", "setOnFlingListener", "onFlingListener", "Lkotlin/Function0;", "o", "Lfy3/a;", "getOnTouchEventUpOrCancel", "()Lfy3/a;", "setOnTouchEventUpOrCancel", "(Lfy3/a;)V", "onTouchEventUpOrCancel", "isEnableScale", "setEnableScale", "isEnableOverScroll", "setEnableOverScroll", "isEnableScroll", "setEnableScroll", "Lcom/tencent/mm/plugin/finder/view/SimpleTouchableLayout$d;", "onScaleListener", "Lcom/tencent/mm/plugin/finder/view/SimpleTouchableLayout$d;", "getOnScaleListener", "()Lcom/tencent/mm/plugin/finder/view/SimpleTouchableLayout$d;", "setOnScaleListener", "(Lcom/tencent/mm/plugin/finder/view/SimpleTouchableLayout$d;)V", "Lcom/tencent/mm/plugin/finder/view/SimpleTouchableLayout$b;", "onInterceptTouchEventCallback", "Lcom/tencent/mm/plugin/finder/view/SimpleTouchableLayout$b;", "getOnInterceptTouchEventCallback", "()Lcom/tencent/mm/plugin/finder/view/SimpleTouchableLayout$b;", "setOnInterceptTouchEventCallback", "(Lcom/tencent/mm/plugin/finder/view/SimpleTouchableLayout$b;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "b", "c", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.SimpleTouchableLayout */
public class SimpleTouchableLayout extends FrameLayout implements C18791w.C18795d, C18791w.C18794c {

    /* renamed from: d */
    public boolean f18045d = true;

    /* renamed from: e */
    public boolean f18046e = true;

    /* renamed from: f */
    public final C13601g f18047f = C36568h.m40985a(new C4242z7(this));

    /* renamed from: g */
    public C4006c f18048g;

    /* renamed from: h */
    public C4008e f18049h;

    /* renamed from: i */
    public C4004a f18050i;

    /* renamed from: j */
    public C32229r<? super MotionEvent, ? super MotionEvent, ? super Float, ? super Float, Boolean> f18051j;

    /* renamed from: n */
    public C32229r<? super MotionEvent, ? super MotionEvent, ? super Float, ? super Float, Boolean> f18052n;

    /* renamed from: o */
    public C32224a<C13598b0> f18053o;

    /* renamed from: com.tencent.mm.plugin.finder.view.SimpleTouchableLayout$a */
    public interface C4004a {
        /* renamed from: a */
        boolean mo2374a(View view, MotionEvent motionEvent);
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.SimpleTouchableLayout$b */
    public interface C4005b {
        /* renamed from: a */
        boolean mo4857a(MotionEvent motionEvent);
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.SimpleTouchableLayout$c */
    public interface C4006c {
        /* renamed from: a */
        void mo2378a(View view, MotionEvent motionEvent);
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.SimpleTouchableLayout$d */
    public interface C4007d {
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.SimpleTouchableLayout$e */
    public interface C4008e {
        /* renamed from: a */
        boolean mo2376a(View view, MotionEvent motionEvent);
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.SimpleTouchableLayout$f */
    public static final class C4009f implements C4008e {

        /* renamed from: a */
        public final /* synthetic */ View.OnClickListener f18054a;

        public C4009f(View.OnClickListener onClickListener) {
            this.f18054a = onClickListener;
        }

        /* renamed from: a */
        public boolean mo2376a(View view, MotionEvent motionEvent) {
            C87412m.m108594g(view, "view");
            View.OnClickListener onClickListener = this.f18054a;
            if (onClickListener == null) {
                return false;
            }
            onClickListener.onClick(view);
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.SimpleTouchableLayout$g */
    public static final class C4010g implements C4006c {

        /* renamed from: a */
        public final /* synthetic */ View.OnLongClickListener f18055a;

        public C4010g(View.OnLongClickListener onLongClickListener) {
            this.f18055a = onLongClickListener;
        }

        /* renamed from: a */
        public void mo2378a(View view, MotionEvent motionEvent) {
            C87412m.m108594g(view, "view");
            C87412m.m108594g(motionEvent, "e");
            View.OnLongClickListener onLongClickListener = this.f18055a;
            if (onLongClickListener != null) {
                onLongClickListener.onLongClick(view);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SimpleTouchableLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        setEnableFling(false);
        setEnableOverScroll(false);
        setEnableScale(false);
    }

    public boolean canScrollHorizontally(int i) {
        return this.f18045d;
    }

    public boolean canScrollVertically(int i) {
        return this.f18045d;
    }

    public final C4004a getOnDoubleClickListener() {
        return this.f18050i;
    }

    public final C32229r<MotionEvent, MotionEvent, Float, Float, Boolean> getOnFlingListener() {
        return this.f18052n;
    }

    public final C4005b getOnInterceptTouchEventCallback() {
        return null;
    }

    public final C4006c getOnLongClickListener() {
        return this.f18048g;
    }

    public final C4007d getOnScaleListener() {
        return null;
    }

    public final C32229r<MotionEvent, MotionEvent, Float, Float, Boolean> getOnScrollListener() {
        return this.f18051j;
    }

    public final C4008e getOnSingleClickListener() {
        return this.f18049h;
    }

    public final C32224a<C13598b0> getOnTouchEventUpOrCancel() {
        return this.f18053o;
    }

    public final C18791w getTouchDetector() {
        return (C18791w) this.f18047f.getValue();
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        C4004a aVar;
        if (motionEvent == null || (aVar = this.f18050i) == null) {
            return false;
        }
        return aVar.mo2374a(this, motionEvent);
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return this.f18050i != null;
    }

    public boolean onDown(MotionEvent motionEvent) {
        return (this.f18049h == null || this.f18050i == null || this.f18048g == null) ? false : true;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C87412m.m108594g(motionEvent, "e1");
        C87412m.m108594g(motionEvent2, "e2");
        C32229r<? super MotionEvent, ? super MotionEvent, ? super Float, ? super Float, Boolean> rVar = this.f18052n;
        return (rVar != null ? rVar.mo162I(motionEvent, motionEvent2, Float.valueOf(f), Float.valueOf(f2)).booleanValue() : false) || this.f18046e;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "ev");
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onLongPress(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "e");
        C4006c cVar = this.f18048g;
        if (cVar != null) {
            cVar.mo2378a(this, motionEvent);
        }
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C87412m.m108594g(motionEvent, "e1");
        C87412m.m108594g(motionEvent2, "e2");
        C32229r<? super MotionEvent, ? super MotionEvent, ? super Float, ? super Float, Boolean> rVar = this.f18051j;
        if (rVar != null) {
            return rVar.mo162I(motionEvent, motionEvent2, Float.valueOf(f), Float.valueOf(f2)).booleanValue();
        }
        return false;
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        C4008e eVar = this.f18049h;
        if (eVar != null) {
            return eVar.mo2376a(this, motionEvent);
        }
        return false;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C32224a<C13598b0> aVar;
        C87412m.m108594g(motionEvent, "event");
        boolean z = false;
        if (!this.f18045d) {
            return false;
        }
        if (super.onTouchEvent(motionEvent) || getTouchDetector().mo23720a(motionEvent)) {
            z = true;
        }
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (aVar = this.f18053o) != null) {
            aVar.invoke();
        }
        return z;
    }

    public void setEnableFling(boolean z) {
        this.f18046e = z;
    }

    public void setEnableOverScroll(boolean z) {
    }

    public void setEnableScale(boolean z) {
    }

    public void setEnableScroll(boolean z) {
    }

    public void setEnableTouch(boolean z) {
        this.f18045d = z;
    }

    public final void setLongPressTimeout(int i) {
        getTouchDetector().f52596f = i;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f18049h = new C4009f(onClickListener);
    }

    public final void setOnDoubleClickListener(C4004a aVar) {
        this.f18050i = aVar;
    }

    public final void setOnFlingListener(C32229r<? super MotionEvent, ? super MotionEvent, ? super Float, ? super Float, Boolean> rVar) {
        this.f18052n = rVar;
    }

    public final void setOnInterceptTouchEventCallback(C4005b bVar) {
    }

    public final void setOnLongClickListener(C4006c cVar) {
        this.f18048g = cVar;
    }

    public final void setOnScaleListener(C4007d dVar) {
    }

    public final void setOnScrollListener(C32229r<? super MotionEvent, ? super MotionEvent, ? super Float, ? super Float, Boolean> rVar) {
        this.f18051j = rVar;
    }

    public final void setOnSingleClickListener(C4008e eVar) {
        this.f18049h = eVar;
    }

    public final void setOnTouchEventUpOrCancel(C32224a<C13598b0> aVar) {
        this.f18053o = aVar;
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f18048g = new C4010g(onLongClickListener);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SimpleTouchableLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        setEnableFling(false);
        setEnableOverScroll(false);
        setEnableScale(false);
    }
}
