package ve1;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.lifecycle.C39622i0;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0790x;
import cm1.C55018j0;
import cm1.C55034v;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.view.FinderFeedBubbleTipsLayout;
import com.tencent.p014mm.plugin.finder.view.FinderMediaLayout;
import com.tencent.p014mm.plugin.finder.view.SimpleTouchableLayout;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderImmersiveImageUIC;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderImmersiveVideoUIC;
import com.tencent.p014mm.view.HardTouchableLayout;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.util.List;
import jq3.C60905o;
import sx3.C110818d0;

/* renamed from: ve1.f0 */
public final class C14510f0 extends C14680x {

    /* renamed from: h */
    public C60905o f40230h;

    /* renamed from: ve1.f0$a */
    public static final class C14511a implements SimpleTouchableLayout.C4004a {

        /* renamed from: a */
        public final /* synthetic */ C60905o f40231a;

        public C14511a(C60905o oVar) {
            this.f40231a = oVar;
        }

        /* renamed from: a */
        public boolean mo2374a(View view, MotionEvent motionEvent) {
            HardTouchableLayout.C7074a onDoubleClickListener;
            C87412m.m108594g(view, "view");
            C87412m.m108594g(motionEvent, "e");
            Context context = this.f40231a.f173499A;
            C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            FinderMediaLayout finderMediaLayout = (FinderMediaLayout) ((MMActivity) context).findViewById(C0966R.C0970id.ol_);
            if (finderMediaLayout == null || (onDoubleClickListener = finderMediaLayout.getOnDoubleClickListener()) == null) {
                return true;
            }
            onDoubleClickListener.mo2343a(view, motionEvent);
            return true;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C14510f0(com.tencent.p014mm.plugin.finder.feed.FinderCommentDrawerPresenter r1, boolean r2, int r3, gy3.C8480h r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L_0x0005
            r2 = 0
        L_0x0005:
            java.lang.String r3 = "presenter"
            gy3.C87412m.m108594g(r1, r3)
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ve1.C14510f0.<init>(com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter, boolean, int, gy3.h):void");
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.ai9;
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        super.mo45f(recyclerView, oVar, i);
        View view = oVar.f44854d;
        C87412m.m108592e(view, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.FinderFeedBubbleTipsLayout");
        ((FinderFeedBubbleTipsLayout) view).setOnDoubleClickListener(new C14511a(oVar));
    }

    /* renamed from: n */
    public void mo44e(C60905o oVar, C55034v vVar, int i, int i2, boolean z, List<Object> list) {
        int i3;
        Class cls = FinderImmersiveImageUIC.class;
        Class cls2 = FinderImmersiveVideoUIC.class;
        C87412m.m108594g(oVar, "h");
        C87412m.m108594g(vVar, "item");
        super.mo44e(oVar, vVar, i, i2, z, list);
        if (list == null || (i3 = C110818d0.m150916N(list)) == null) {
            i3 = 0;
        }
        if (this.f40230h == null) {
            BaseFinderFeed xVar = vVar.f154508w.getMediaType() == 2 ? new C0790x(vVar.f154508w) : new C55018j0(vVar.f154508w);
            xVar.mo3513o().getTopicClickExtra().f26404c = new WeakReference<>(oVar.f173499A);
            C60905o oVar2 = new C60905o(oVar.f44854d);
            oVar2.f173503E = xVar;
            this.f40230h = oVar2;
        }
        C60905o oVar3 = this.f40230h;
        C87412m.m108591d(oVar3);
        if (C87412m.m108589b(i3, 3)) {
            if (vVar.f154508w.getMediaType() == 4) {
                C39818r rVar = C39818r.f106831a;
                Context context = oVar.f173499A;
                C87412m.m108593f(context, "h.context");
                C39622i0 a = rVar.mo62443b(context).mo75002a(cls2);
                C87412m.m108593f(a, "UICProvider.of(h.context…siveVideoUIC::class.java)");
                C14520f4 d3 = ((FinderImmersiveVideoUIC) a).mo5161d3();
                Object obj = oVar3.f173503E;
                C87412m.m108593f(obj, "holder.getAssociatedObject()");
                d3.mo2255D0((BaseFinderFeed) obj, oVar3, true, 0);
            } else if (vVar.f154508w.getMediaType() == 2) {
                C39818r rVar2 = C39818r.f106831a;
                Context context2 = oVar.f173499A;
                C87412m.m108593f(context2, "h.context");
                C39622i0 a2 = rVar2.mo62443b(context2).mo75002a(cls);
                C87412m.m108593f(a2, "UICProvider.of(h.context…siveImageUIC::class.java)");
                C14503e4 d35 = ((FinderImmersiveImageUIC) a2).mo5155d3();
                Object obj2 = oVar3.f173503E;
                C87412m.m108593f(obj2, "holder.getAssociatedObject()");
                d35.mo2255D0((C0790x) obj2, oVar3, true, 0);
            }
        } else if (vVar.f154508w.getMediaType() == 4) {
            C39818r rVar3 = C39818r.f106831a;
            Context context3 = oVar.f173499A;
            C87412m.m108593f(context3, "h.context");
            C39622i0 a3 = rVar3.mo62443b(context3).mo75002a(cls2);
            C87412m.m108593f(a3, "UICProvider.of(h.context…siveVideoUIC::class.java)");
            FinderImmersiveVideoUIC finderImmersiveVideoUIC = (FinderImmersiveVideoUIC) a3;
            C14520f4 d36 = finderImmersiveVideoUIC.mo5161d3();
            Object obj3 = oVar3.f173503E;
            C87412m.m108593f(obj3, "holder.getAssociatedObject()");
            d36.mo2259F0((BaseFinderFeed) obj3, oVar3);
            C14520f4 d37 = finderImmersiveVideoUIC.mo5161d3();
            Object obj4 = oVar3.f173503E;
            C87412m.m108593f(obj4, "holder.getAssociatedObject()");
            d37.mo2255D0((BaseFinderFeed) obj4, oVar3, false, 0);
        } else if (vVar.f154508w.getMediaType() == 2) {
            C39818r rVar4 = C39818r.f106831a;
            Context context4 = oVar.f173499A;
            C87412m.m108593f(context4, "h.context");
            C39622i0 a4 = rVar4.mo62443b(context4).mo75002a(cls);
            C87412m.m108593f(a4, "UICProvider.of(h.context…siveImageUIC::class.java)");
            FinderImmersiveImageUIC finderImmersiveImageUIC = (FinderImmersiveImageUIC) a4;
            C14503e4 d38 = finderImmersiveImageUIC.mo5155d3();
            Object obj5 = oVar3.f173503E;
            C87412m.m108593f(obj5, "holder.getAssociatedObject()");
            d38.mo2259F0((BaseFinderFeed) obj5, oVar3);
            C14503e4 d39 = finderImmersiveImageUIC.mo5155d3();
            Object obj6 = oVar3.f173503E;
            C87412m.m108593f(obj6, "holder.getAssociatedObject()");
            d39.mo2255D0((C0790x) obj6, oVar3, false, 0);
        }
    }
}
