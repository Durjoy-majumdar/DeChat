package nx0;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import p905j3.C108547c;
import rx3.C13598b0;

/* renamed from: nx0.b */
public final class C76974b extends FrameLayout {

    /* renamed from: d */
    public final ViewGroup f224916d;

    /* renamed from: e */
    public final C32224a<Boolean> f224917e;

    /* renamed from: f */
    public final C32227p<Integer, Float, C13598b0> f224918f;

    /* renamed from: g */
    public View f224919g;

    /* renamed from: h */
    public C108547c f224920h = new C108547c(getContext(), this, new C76975a());

    /* renamed from: i */
    public float f224921i;

    /* renamed from: j */
    public int f224922j;

    /* renamed from: n */
    public boolean f224923n;

    /* renamed from: o */
    public C32224a<C13598b0> f224924o;

    /* renamed from: nx0.b$a */
    public final class C76975a extends C108547c.C108549c {
        public C76975a() {
        }

        /* renamed from: a */
        public int mo96788a(View view, int i, int i2) {
            C87412m.m108594g(view, "child");
            return 0;
        }

        /* renamed from: b */
        public int mo96789b(View view, int i, int i2) {
            C87412m.m108594g(view, "child");
            if (C87412m.m108589b(view, C76974b.this.f224919g)) {
                Log.m105924i("DragDownCloseLayout", "clampViewPositionVertical top:" + i + ", dy:" + i2);
            }
            if (i >= 0) {
                return i;
            }
            return 0;
        }

        /* renamed from: d */
        public int mo96790d(View view) {
            C87412m.m108594g(view, "child");
            return C76974b.this.f224922j;
        }

        /* renamed from: i */
        public void mo96791i(View view, int i, int i2, int i3, int i4) {
            C87412m.m108594g(view, "changedView");
            if (C87412m.m108589b(view, C76974b.this.f224919g)) {
                C76974b bVar = C76974b.this;
                float f = ((float) i2) / ((float) bVar.f224922j);
                if (f > 1.0f) {
                    f = 1.0f;
                }
                C32227p<Integer, Float, C13598b0> pVar = bVar.f224918f;
                if (pVar != null) {
                    pVar.invoke(Integer.valueOf(i2), Float.valueOf(f));
                }
                Log.m105924i("DragDownCloseLayout", "onViewPositionChanged: top:" + i2 + ", mScreenHeight:" + C76974b.this.f224922j);
            }
            C76974b bVar2 = C76974b.this;
            if (view == bVar2.f224919g && i2 >= bVar2.f224922j && !bVar2.f224923n) {
                bVar2.f224923n = true;
                C32224a<C13598b0> onDragToClose = bVar2.getOnDragToClose();
                if (onDragToClose != null) {
                    onDragToClose.invoke();
                }
            }
        }

        /* renamed from: j */
        public void mo96792j(View view, float f, float f2) {
            C87412m.m108594g(view, "releasedChild");
            C76974b bVar = C76974b.this;
            if (((float) view.getTop()) <= bVar.f224921i) {
                C108547c cVar = bVar.f224920h;
                if (cVar != null) {
                    cVar.mo159430s(0, 0);
                } else {
                    C87412m.m108603p("mViewDragHelper");
                    throw null;
                }
            } else {
                C108547c cVar2 = bVar.f224920h;
                if (cVar2 != null) {
                    cVar2.mo159430s(0, bVar.f224922j);
                } else {
                    C87412m.m108603p("mViewDragHelper");
                    throw null;
                }
            }
            C76974b.this.invalidate();
        }

        /* renamed from: k */
        public boolean mo96793k(View view, int i) {
            C87412m.m108594g(view, "child");
            return true;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C76974b(Context context, ViewGroup viewGroup, C32224a<Boolean> aVar, C32227p<? super Integer, ? super Float, C13598b0> pVar) {
        super(context);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(viewGroup, "mDecorView");
        C87412m.m108594g(aVar, "dragEnableBlock");
        this.f224916d = viewGroup;
        this.f224917e = aVar;
        this.f224918f = pVar;
    }

    public void computeScroll() {
        C108547c cVar = this.f224920h;
        if (cVar == null) {
            C87412m.m108603p("mViewDragHelper");
            throw null;
        } else if (cVar.mo159420h(true)) {
            invalidate();
        }
    }

    public final C32224a<C13598b0> getOnDragToClose() {
        return this.f224924o;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "event");
        if (!this.f224917e.invoke().booleanValue()) {
            return false;
        }
        C108547c cVar = this.f224920h;
        if (cVar != null) {
            return cVar.mo159431t(motionEvent);
        }
        C87412m.m108603p("mViewDragHelper");
        throw null;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "event");
        C108547c cVar = this.f224920h;
        if (cVar != null) {
            cVar.mo159424m(motionEvent);
            return true;
        }
        C87412m.m108603p("mViewDragHelper");
        throw null;
    }

    public final void setOnDragToClose(C32224a<C13598b0> aVar) {
        this.f224924o = aVar;
    }
}
