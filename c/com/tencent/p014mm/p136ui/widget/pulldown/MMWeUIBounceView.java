package com.tencent.p014mm.p136ui.widget.pulldown;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import bp3.C104160f;
import bp3.C79758p;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import kj2.C117407d;
import kotlin.Metadata;
import vo3.C111576j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\r"}, mo182094d2 = {"Lcom/tencent/mm/ui/widget/pulldown/MMWeUIBounceView;", "Lcom/tencent/mm/ui/widget/pulldown/WeUIBounceViewV2;", "", "resid", "Lrx3/b0;", "setBackgroundResource", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.widget.pulldown.MMWeUIBounceView */
public final class MMWeUIBounceView extends WeUIBounceViewV2 {

    /* renamed from: N */
    public static final C106823a f319685N = new C106823a((C8480h) null);

    /* renamed from: com.tencent.mm.ui.widget.pulldown.MMWeUIBounceView$a */
    public static final class C106823a {
        public C106823a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo154636a(int i) {
            C117407d.INSTANCE.idkeyStat(1729, (long) i, 1, false);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MMWeUIBounceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        boolean z = false;
        Object a = C79758p.f233760a.mo109878a(C104160f.RepairerConfig_Global_PullDownLog_Int, 0);
        C87412m.m108592e(a, "null cannot be cast to non-null type kotlin.Int");
        C111576j.f334006j = ((Integer) a).intValue() == 1 ? true : z;
    }

    /* renamed from: a */
    public void mo89642a(View view, int i) {
        super.mo89642a(view, i);
    }

    /* renamed from: i */
    public void mo77718i(View view, int i) {
        C87412m.m108594g(view, "target");
        try {
            super.mo77718i(view, i);
        } catch (Throwable th) {
            f319685N.mo154636a(4);
            Log.printErrStackTrace("PullDownParentView", th, "onStopNestedScroll err", new Object[0]);
        }
    }

    /* renamed from: k */
    public int mo154630k(View view, int i, int i2, int[] iArr, int i3) {
        C87412m.m108594g(view, "target");
        C87412m.m108594g(iArr, "consumed");
        try {
            return super.mo154630k(view, i, i2, iArr, i3);
        } catch (Throwable th) {
            f319685N.mo154636a(2);
            Log.printErrStackTrace("PullDownParentView", th, "onNestedPreScrollInner err", new Object[0]);
            return 0;
        }
    }

    /* renamed from: l */
    public void mo154631l(View view, int i, int i2, int[] iArr) {
        C87412m.m108594g(view, "target");
        try {
            super.mo154631l(view, i, i2, iArr);
        } catch (Throwable th) {
            f319685N.mo154636a(3);
            Log.printErrStackTrace("PullDownParentView", th, "onNestedScrollInternal err", new Object[0]);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Throwable th) {
            f319685N.mo154636a(0);
            Log.printErrStackTrace("PullDownParentView", th, "onInterceptTouchEvent err", new Object[0]);
            return false;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "event");
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Throwable th) {
            f319685N.mo154636a(1);
            Log.printErrStackTrace("PullDownParentView", th, "onTouchEvent err", new Object[0]);
            return false;
        }
    }

    public void setBackgroundResource(int i) {
        View mContentView = getMContentView();
        if (mContentView != null) {
            mContentView.setBackgroundResource(i);
        }
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
    }
}
