package com.tencent.p014mm.plugin.finder.megavideo.p053ui;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/megavideo/ui/OverScrollVerticalBehavior;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.megavideo.ui.OverScrollVerticalBehavior */
public final class OverScrollVerticalBehavior extends CoordinatorLayout.Behavior<WxRecyclerView> {

    /* renamed from: d */
    public int f160151d;

    /* renamed from: e */
    public int f160152e;

    /* renamed from: f */
    public int f160153f;

    /* renamed from: m */
    public void mo78308m(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5) {
        WxRecyclerView wxRecyclerView = (WxRecyclerView) view;
        C87412m.m108594g(coordinatorLayout, "coordinatorLayout");
        C87412m.m108594g(wxRecyclerView, "child");
        C87412m.m108594g(view2, "target");
        if (wxRecyclerView == view2) {
            RecyclerView.LayoutManager layoutManager = wxRecyclerView.getLayoutManager();
            C87412m.m108592e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            int E = ((LinearLayoutManager) layoutManager).mo16959E();
            RecyclerView.C16613e adapter = wxRecyclerView.getAdapter();
            if (E == (adapter != null ? adapter.getItemCount() : -1) - 1) {
                if (i4 > 0 && i5 == 0) {
                    Log.m105924i("OverScrollVerticalBehavior", "onNestedScroll: start nested scroll dyUnconsumed = " + i4 + ", currTranslateY = " + wxRecyclerView.getTranslationY());
                    wxRecyclerView.animate().cancel();
                    wxRecyclerView.setTranslationY(wxRecyclerView.getTranslationY() - ((float) (i4 / 2)));
                    this.f160153f = 0;
                }
                this.f160152e += i3;
                this.f160153f += i4;
            }
        }
    }

    /* renamed from: s */
    public boolean mo5059s(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        WxRecyclerView wxRecyclerView = (WxRecyclerView) view;
        C87412m.m108594g(coordinatorLayout, "coordinatorLayout");
        C87412m.m108594g(wxRecyclerView, "child");
        C87412m.m108594g(view2, "directTargetChild");
        C87412m.m108594g(view3, "target");
        this.f160152e = 0;
        this.f160153f = 0;
        return wxRecyclerView == view3 && (i & 2) != 0 && i2 == 0;
    }

    /* JADX WARNING: type inference failed for: r2v19, types: [androidx.recyclerview.widget.RecyclerView$z] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo78309u(androidx.coordinatorlayout.widget.CoordinatorLayout r2, android.view.View r3, android.view.View r4, int r5) {
        /*
            r1 = this;
            com.tencent.mm.view.recyclerview.WxRecyclerView r3 = (com.tencent.p014mm.view.recyclerview.WxRecyclerView) r3
            java.lang.String r0 = "coordinatorLayout"
            gy3.C87412m.m108594g(r2, r0)
            java.lang.String r2 = "child"
            gy3.C87412m.m108594g(r3, r2)
            java.lang.String r2 = "target"
            gy3.C87412m.m108594g(r4, r2)
            if (r5 == 0) goto L_0x0016
            goto L_0x00af
        L_0x0016:
            int r2 = r1.f160151d
            if (r2 != 0) goto L_0x002a
            android.content.Context r2 = r4.getContext()
            android.view.ViewConfiguration r2 = android.view.ViewConfiguration.get(r2)
            int r2 = r2.getScaledTouchSlop()
            int r2 = r2 * 10
            r1.f160151d = r2
        L_0x002a:
            float r2 = r3.getTranslationY()
            r4 = 0
            r5 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x0096
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "onStopNestedScroll: start anim translateY = "
            r2.append(r0)
            float r0 = r3.getTranslationY()
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = "OverScrollVerticalBehavior"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            android.view.ViewPropertyAnimator r2 = r3.animate()
            android.view.ViewPropertyAnimator r2 = r2.translationY(r4)
            r2.start()
            float r2 = r3.getTranslationY()
            float r2 = java.lang.Math.abs(r2)
            int r4 = r1.f160151d
            float r4 = (float) r4
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x0096
            androidx.recyclerview.widget.RecyclerView$LayoutManager r2 = r3.getLayoutManager()
            boolean r4 = r2 instanceof androidx.recyclerview.widget.LinearLayoutManager
            r0 = 0
            if (r4 == 0) goto L_0x0074
            androidx.recyclerview.widget.LinearLayoutManager r2 = (androidx.recyclerview.widget.LinearLayoutManager) r2
            goto L_0x0075
        L_0x0074:
            r2 = r0
        L_0x0075:
            if (r2 == 0) goto L_0x0096
            int r2 = r2.mo16959E()
            androidx.recyclerview.widget.RecyclerView$z r2 = r3.mo17024J0(r2, r5)
            boolean r4 = r2 instanceof jq3.C60905o
            if (r4 == 0) goto L_0x0086
            r0 = r2
            jq3.o r0 = (jq3.C60905o) r0
        L_0x0086:
            if (r0 == 0) goto L_0x0096
            android.content.Context r2 = r3.getContext()
            r3 = 2131829092(0x7f112164, float:1.9291143E38)
            android.widget.Toast r2 = nj3.C76912y0.makeText((android.content.Context) r2, (int) r3, (int) r5)
            r2.show()
        L_0x0096:
            int r2 = r1.f160153f
            if (r2 >= 0) goto L_0x00ab
            int r2 = java.lang.Math.abs(r2)
            int r3 = r1.f160152e
            int r3 = java.lang.Math.abs(r3)
            if (r2 <= r3) goto L_0x00ab
            int r2 = r1.f160153f
            java.lang.Math.abs(r2)
        L_0x00ab:
            r1.f160153f = r5
            r1.f160152e = r5
        L_0x00af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.megavideo.p053ui.OverScrollVerticalBehavior.mo78309u(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }
}
