package com.tencent.p014mm.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.tencent.p014mm.p136ui.widget.cropview.TouchEventLayout;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001:\u0006=>?@ABB\u001b\b\u0016\u0012\u0006\u00105\u001a\u000204\u0012\b\u00107\u001a\u0004\u0018\u000106¢\u0006\u0004\b8\u00109B#\b\u0016\u0012\u0006\u00105\u001a\u000204\u0012\b\u00107\u001a\u0004\u0018\u000106\u0012\u0006\u0010;\u001a\u00020:¢\u0006\u0004\b8\u0010<J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006H\u0016R$\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\u0005\u0010\rR$\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u001e\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010'\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u0010.\u001a\u0004\u0018\u00010-8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u0006C"}, mo182094d2 = {"Lcom/tencent/mm/view/HardTouchableLayout;", "Lcom/tencent/mm/ui/widget/cropview/TouchEventLayout;", "Landroid/view/View$OnLongClickListener;", "l", "Lrx3/b0;", "setOnLongClickListener", "Landroid/view/View$OnClickListener;", "setOnClickListener", "Lcom/tencent/mm/view/HardTouchableLayout$c;", "n", "Lcom/tencent/mm/view/HardTouchableLayout$c;", "getOnLongClickListener", "()Lcom/tencent/mm/view/HardTouchableLayout$c;", "(Lcom/tencent/mm/view/HardTouchableLayout$c;)V", "onLongClickListener", "Lcom/tencent/mm/view/HardTouchableLayout$f;", "o", "Lcom/tencent/mm/view/HardTouchableLayout$f;", "getOnSingleClickListener", "()Lcom/tencent/mm/view/HardTouchableLayout$f;", "setOnSingleClickListener", "(Lcom/tencent/mm/view/HardTouchableLayout$f;)V", "onSingleClickListener", "Lcom/tencent/mm/view/HardTouchableLayout$a;", "p", "Lcom/tencent/mm/view/HardTouchableLayout$a;", "getOnDoubleClickListener", "()Lcom/tencent/mm/view/HardTouchableLayout$a;", "setOnDoubleClickListener", "(Lcom/tencent/mm/view/HardTouchableLayout$a;)V", "onDoubleClickListener", "Lcom/tencent/mm/view/HardTouchableLayout$e;", "onScrollListener", "Lcom/tencent/mm/view/HardTouchableLayout$e;", "getOnScrollListener", "()Lcom/tencent/mm/view/HardTouchableLayout$e;", "setOnScrollListener", "(Lcom/tencent/mm/view/HardTouchableLayout$e;)V", "Lcom/tencent/mm/view/HardTouchableLayout$d;", "onScaleListener", "Lcom/tencent/mm/view/HardTouchableLayout$d;", "getOnScaleListener", "()Lcom/tencent/mm/view/HardTouchableLayout$d;", "setOnScaleListener", "(Lcom/tencent/mm/view/HardTouchableLayout$d;)V", "Lcom/tencent/mm/view/HardTouchableLayout$b;", "onInterceptTouchEventCallback", "Lcom/tencent/mm/view/HardTouchableLayout$b;", "getOnInterceptTouchEventCallback", "()Lcom/tencent/mm/view/HardTouchableLayout$b;", "setOnInterceptTouchEventCallback", "(Lcom/tencent/mm/view/HardTouchableLayout$b;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "b", "c", "d", "e", "f", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.view.HardTouchableLayout */
public class HardTouchableLayout extends TouchEventLayout {

    /* renamed from: q */
    public static int f165562q;

    /* renamed from: r */
    public static int f165563r;

    /* renamed from: n */
    public C7076c f165564n;

    /* renamed from: o */
    public C7077f f165565o;

    /* renamed from: p */
    public C7074a f165566p;

    /* renamed from: com.tencent.mm.view.HardTouchableLayout$a */
    public interface C7074a {
        /* renamed from: a */
        void mo2343a(View view, MotionEvent motionEvent);
    }

    /* renamed from: com.tencent.mm.view.HardTouchableLayout$b */
    public interface C7075b {
        /* renamed from: a */
        boolean mo8143a(MotionEvent motionEvent);
    }

    /* renamed from: com.tencent.mm.view.HardTouchableLayout$c */
    public interface C7076c {
        /* renamed from: a */
        void mo2345a(View view, MotionEvent motionEvent);
    }

    /* renamed from: com.tencent.mm.view.HardTouchableLayout$f */
    public interface C7077f {
        /* renamed from: a */
        void mo2341a(View view, MotionEvent motionEvent);
    }

    /* renamed from: com.tencent.mm.view.HardTouchableLayout$d */
    public interface C57870d {
        /* renamed from: a */
        void mo82384a();

        /* renamed from: b */
        void mo82385b(ScaleGestureDetector scaleGestureDetector);

        void onScaleBegin(ScaleGestureDetector scaleGestureDetector);
    }

    /* renamed from: com.tencent.mm.view.HardTouchableLayout$e */
    public interface C57871e {
        /* renamed from: a */
        void mo82387a(MotionEvent motionEvent);

        /* renamed from: b */
        void mo82388b(float f, float f2, boolean z);

        void onDown(MotionEvent motionEvent);
    }

    /* renamed from: com.tencent.mm.view.HardTouchableLayout$g */
    public static final class C57872g implements C7077f {

        /* renamed from: a */
        public final /* synthetic */ View.OnClickListener f165567a;

        public C57872g(View.OnClickListener onClickListener) {
            this.f165567a = onClickListener;
        }

        /* renamed from: a */
        public void mo2341a(View view, MotionEvent motionEvent) {
            C87412m.m108594g(view, "view");
            View.OnClickListener onClickListener = this.f165567a;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* renamed from: com.tencent.mm.view.HardTouchableLayout$h */
    public static final class C57873h implements C7076c {

        /* renamed from: a */
        public final /* synthetic */ View.OnLongClickListener f165568a;

        public C57873h(View.OnLongClickListener onLongClickListener) {
            this.f165568a = onLongClickListener;
        }

        /* renamed from: a */
        public void mo2345a(View view, MotionEvent motionEvent) {
            C87412m.m108594g(view, "view");
            C87412m.m108594g(motionEvent, "e");
            View.OnLongClickListener onLongClickListener = this.f165568a;
            if (onLongClickListener != null) {
                onLongClickListener.onLongClick(view);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HardTouchableLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        setEnableFling(false);
        setEnableOverScroll(false);
        setEnableScale(false);
    }

    public boolean canScrollHorizontally(int i) {
        return this.f165531d;
    }

    public boolean canScrollVertically(int i) {
        return this.f165531d;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "event");
        if (motionEvent.getAction() == 0) {
            f165562q = (int) motionEvent.getRawX();
            f165563r = (int) motionEvent.getRawY();
        }
        super.onTouch(this, motionEvent);
        if (!(motionEvent.getAction() == 3 || motionEvent.getAction() == 1)) {
            int action = motionEvent.getAction();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final C7074a getOnDoubleClickListener() {
        return this.f165566p;
    }

    public final C7075b getOnInterceptTouchEventCallback() {
        return null;
    }

    public final C7076c getOnLongClickListener() {
        return this.f165564n;
    }

    public final C57870d getOnScaleListener() {
        return null;
    }

    public final C57871e getOnScrollListener() {
        return null;
    }

    public final C7077f getOnSingleClickListener() {
        return this.f165565o;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        C7074a aVar;
        if (!(motionEvent == null || (aVar = this.f165566p) == null)) {
            aVar.mo2343a(this, motionEvent);
        }
        super.onDoubleTap(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "ev");
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onLongPress(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "e");
        super.onLongPress(motionEvent);
        C7076c cVar = this.f165564n;
        if (cVar != null) {
            cVar.mo2345a(this, motionEvent);
        }
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
        super.onScroll(motionEvent, motionEvent2, f, f2);
        return true;
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        C7077f fVar = this.f165565o;
        if (fVar == null) {
            return true;
        }
        fVar.mo2341a(this, motionEvent);
        return true;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        C87412m.m108594g(view, "v");
        C87412m.m108594g(motionEvent, "event");
        return true;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f165565o = new C57872g(onClickListener);
    }

    public final void setOnDoubleClickListener(C7074a aVar) {
        this.f165566p = aVar;
    }

    public final void setOnInterceptTouchEventCallback(C7075b bVar) {
    }

    public final void setOnLongClickListener(C7076c cVar) {
        this.f165564n = cVar;
    }

    public final void setOnScaleListener(C57870d dVar) {
    }

    public final void setOnScrollListener(C57871e eVar) {
    }

    public final void setOnSingleClickListener(C7077f fVar) {
        this.f165565o = fVar;
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f165564n = new C57873h(onLongClickListener);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HardTouchableLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        setEnableFling(false);
        setEnableOverScroll(false);
        setEnableScale(false);
    }
}
