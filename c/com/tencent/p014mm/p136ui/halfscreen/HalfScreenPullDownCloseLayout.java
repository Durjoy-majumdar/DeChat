package com.tencent.p014mm.p136ui.halfscreen;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import fy3.C32226l;
import gy3.C87412m;
import kotlin.Metadata;
import p905j3.C108547c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0012B\u001d\b\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011R0\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0013"}, mo182094d2 = {"Lcom/tencent/mm/ui/halfscreen/HalfScreenPullDownCloseLayout;", "Landroid/widget/FrameLayout;", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "", "d", "Lfy3/l;", "getDragEnableBlock", "()Lfy3/l;", "setDragEnableBlock", "(Lfy3/l;)V", "dragEnableBlock", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.halfscreen.HalfScreenPullDownCloseLayout */
public final class HalfScreenPullDownCloseLayout extends FrameLayout {

    /* renamed from: n */
    public static final /* synthetic */ int f219848n = 0;

    /* renamed from: d */
    public C32226l<? super MotionEvent, Boolean> f219849d;

    /* renamed from: e */
    public View f219850e;

    /* renamed from: f */
    public Activity f219851f;

    /* renamed from: g */
    public C108547c f219852g = new C108547c(getContext(), this, new C74764a());

    /* renamed from: h */
    public float f219853h;

    /* renamed from: i */
    public int f219854i;

    /* renamed from: j */
    public boolean f219855j;

    /* renamed from: com.tencent.mm.ui.halfscreen.HalfScreenPullDownCloseLayout$a */
    public final class C74764a extends C108547c.C108549c {
        public C74764a() {
        }

        /* renamed from: a */
        public int mo96788a(View view, int i, int i2) {
            C87412m.m108594g(view, "child");
            return 0;
        }

        /* renamed from: b */
        public int mo96789b(View view, int i, int i2) {
            C87412m.m108594g(view, "child");
            if (i >= 0) {
                return i;
            }
            return 0;
        }

        /* renamed from: d */
        public int mo96790d(View view) {
            C87412m.m108594g(view, "child");
            return HalfScreenPullDownCloseLayout.this.f219854i;
        }

        /* renamed from: i */
        public void mo96791i(View view, int i, int i2, int i3, int i4) {
            C87412m.m108594g(view, "changedView");
            HalfScreenPullDownCloseLayout halfScreenPullDownCloseLayout = HalfScreenPullDownCloseLayout.this;
            if ((view == halfScreenPullDownCloseLayout.f219850e && i2 >= halfScreenPullDownCloseLayout.f219854i) && !halfScreenPullDownCloseLayout.f219855j) {
                halfScreenPullDownCloseLayout.f219855j = true;
                Activity activity = halfScreenPullDownCloseLayout.f219851f;
                if (activity != null) {
                    activity.finish();
                }
            }
        }

        /* renamed from: j */
        public void mo96792j(View view, float f, float f2) {
            C87412m.m108594g(view, "releasedChild");
            HalfScreenPullDownCloseLayout halfScreenPullDownCloseLayout = HalfScreenPullDownCloseLayout.this;
            if (((float) view.getTop()) <= halfScreenPullDownCloseLayout.f219853h) {
                C108547c cVar = halfScreenPullDownCloseLayout.f219852g;
                if (cVar != null) {
                    cVar.mo159430s(0, 0);
                }
            } else if (!halfScreenPullDownCloseLayout.f219855j) {
                halfScreenPullDownCloseLayout.f219855j = true;
                Activity activity = halfScreenPullDownCloseLayout.f219851f;
                if (activity != null) {
                    activity.finish();
                }
            }
            HalfScreenPullDownCloseLayout.this.invalidate();
        }

        /* renamed from: k */
        public boolean mo96793k(View view, int i) {
            C87412m.m108594g(view, "child");
            HalfScreenPullDownCloseLayout halfScreenPullDownCloseLayout = HalfScreenPullDownCloseLayout.this;
            int i2 = HalfScreenPullDownCloseLayout.f219848n;
            halfScreenPullDownCloseLayout.getClass();
            return true;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfScreenPullDownCloseLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        this.f219851f = (Activity) context;
    }

    public void computeScroll() {
        C108547c cVar = this.f219852g;
        boolean z = false;
        if (cVar != null && cVar.mo159420h(true)) {
            z = true;
        }
        if (z) {
            invalidate();
        }
    }

    public final C32226l<MotionEvent, Boolean> getDragEnableBlock() {
        return this.f219849d;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C108547c cVar;
        C87412m.m108594g(motionEvent, "event");
        C32226l<? super MotionEvent, Boolean> lVar = this.f219849d;
        boolean z = true;
        if (lVar == null || !lVar.invoke(motionEvent).booleanValue()) {
            z = false;
        }
        if (!z || (cVar = this.f219852g) == null) {
            return false;
        }
        return cVar.mo159431t(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "event");
        C108547c cVar = this.f219852g;
        if (cVar == null) {
            return true;
        }
        cVar.mo159424m(motionEvent);
        return true;
    }

    public final void setDragEnableBlock(C32226l<? super MotionEvent, Boolean> lVar) {
        this.f219849d = lVar;
    }
}
