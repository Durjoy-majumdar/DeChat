package com.tencent.p014mm.pluginsdk.p133ui.pin;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import gy3.C87412m;
import kotlin.Metadata;
import zd3.C66787a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0013B\u001d\b\u0016\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fB%\b\u0016\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000e\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u0013\u0010\t\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0014"}, mo182094d2 = {"Lcom/tencent/mm/pluginsdk/ui/pin/PinnedHeaderRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "Lcom/tencent/mm/pluginsdk/ui/pin/PinnedHeaderRecyclerView$a;", "listener", "Lrx3/b0;", "setOnPinnedHeaderClickListener", "Lzd3/a;", "getPinnedHeaderDecoration", "()Lzd3/a;", "pinnedHeaderDecoration", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.pluginsdk.ui.pin.PinnedHeaderRecyclerView */
public final class PinnedHeaderRecyclerView extends RecyclerView {

    /* renamed from: y1 */
    public boolean f164784y1;

    /* renamed from: com.tencent.mm.pluginsdk.ui.pin.PinnedHeaderRecyclerView$a */
    public interface C57543a {
        /* renamed from: a */
        void mo81287a(int i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PinnedHeaderRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108591d(context);
    }

    public final C66787a getPinnedHeaderDecoration() {
        int i = 0;
        while (true) {
            RecyclerView.C0129l T0 = mo17033T0(i);
            C87412m.m108593f(T0, "getItemDecorationAt(decorationIndex)");
            if (T0 instanceof C66787a) {
                return (C66787a) T0;
            }
            i++;
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "e");
        return super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "ev");
        return super.onTouchEvent(motionEvent);
    }

    public final void setOnPinnedHeaderClickListener(C57543a aVar) {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PinnedHeaderRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108591d(context);
    }
}
