package com.tencent.p014mm.plugin.finder.event.recyclerview;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import ff1.C45771b;
import ff1.C58986c;
import ff1.C58987d;
import gy3.C87412m;
import kotlin.Metadata;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import xn1.C118894e;
import z04.C112550d0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0018B\u001b\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015B#\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0019"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/event/recyclerview/FinderRecyclerView;", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "Lcom/tencent/mm/plugin/finder/event/recyclerview/FinderRecyclerView$a;", "outListener", "Lrx3/b0;", "setPageChangeListener", "", "getScrollState", "Lff1/d;", "I1", "Lff1/d;", "getScrollEventAdapter", "()Lff1/d;", "setScrollEventAdapter", "(Lff1/d;)V", "scrollEventAdapter", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "plugin-finder-base_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView */
public class FinderRecyclerView extends WxRecyclerView {

    /* renamed from: E1 */
    public boolean f158503E1;

    /* renamed from: F1 */
    public C55692a f158504F1;

    /* renamed from: G1 */
    public final C13601g f158505G1 = C36568h.m40985a(C45771b.f123668d);

    /* renamed from: H1 */
    public int f158506H1 = -1;

    /* renamed from: I1 */
    public C58987d f158507I1;

    /* renamed from: J1 */
    public final C55692a f158508J1 = new C58986c(this);

    /* renamed from: com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView$a */
    public interface C55692a {
        /* renamed from: e */
        void mo77206e(RecyclerView recyclerView, int i);

        /* renamed from: f */
        void mo77207f(RecyclerView recyclerView, int i);

        /* renamed from: g */
        void mo77208g(RecyclerView recyclerView, int i, float f, int i2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: z1 */
    public static /* synthetic */ void m63293z1(FinderRecyclerView finderRecyclerView, LinearLayoutManager linearLayoutManager, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                str = "";
            }
            finderRecyclerView.mo77205y1(linearLayoutManager, str);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: init");
    }

    public final C58987d getScrollEventAdapter() {
        C58987d dVar = this.f158507I1;
        if (dVar != null) {
            return dVar;
        }
        C87412m.m108603p("scrollEventAdapter");
        throw null;
    }

    public int getScrollState() {
        return this.f158503E1 ? getScrollEventAdapter().f168774h : super.getScrollState();
    }

    /* renamed from: r1 */
    public void mo17115r1(int i) {
        if (!mo77204x1("scrollToPosition", i)) {
            super.mo17115r1(i);
        }
    }

    public final void setPageChangeListener(C55692a aVar) {
        this.f158504F1 = aVar;
    }

    public final void setScrollEventAdapter(C58987d dVar) {
        C87412m.m108594g(dVar, "<set-?>");
        this.f158507I1 = dVar;
    }

    /* renamed from: t1 */
    public void mo17149t1(int i) {
        if (!mo77204x1("smoothScrollToPosition", i)) {
            super.mo17149t1(i);
        }
    }

    /* renamed from: x1 */
    public final boolean mo77204x1(String str, int i) {
        StackTraceElement[] stackTrace;
        if (((Boolean) ((C36570n) this.f158505G1).getValue()).booleanValue() && (stackTrace = Thread.currentThread().getStackTrace()) != null) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                String methodName = stackTraceElement.getMethodName();
                C87412m.m108593f(methodName, "it.methodName");
                if (C112550d0.m153801u(methodName, "dispatchStatusBarTop", false)) {
                    Log.m105924i("FinderRecyclerView", str + ": disable scroll top, position=" + i + ", brand=" + Build.BRAND + ", stack=" + stackTraceElement);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: y1 */
    public final void mo77205y1(LinearLayoutManager linearLayoutManager, String str) {
        C87412m.m108594g(str, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        if (linearLayoutManager == null) {
            Log.m105920e("FinderRecyclerView", "init: params null");
        } else if (this.f158507I1 != null) {
            Log.m105928w("FinderRecyclerView", "init: scrollEventAdapter has init");
        } else {
            setLayoutManager(linearLayoutManager);
            setScrollEventAdapter(new C58987d(this));
            getScrollEventAdapter().f168771e = this.f158508J1;
            mo17043c(getScrollEventAdapter());
            if (Build.VERSION.SDK_INT >= 26) {
                mo17043c(new C118894e(getContext().getClass().getSimpleName() + '#' + str));
            }
            this.f158503E1 = true;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
    }
}
