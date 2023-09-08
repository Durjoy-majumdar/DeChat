package ve1;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.C39623j;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0790x;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.music.FinderImgFeedMusicTag;
import com.tencent.p014mm.plugin.finder.view.C4189u7;
import com.tencent.p014mm.plugin.finder.view.C4190v;
import com.tencent.p014mm.plugin.finder.view.C4212x6;
import com.tencent.p014mm.plugin.finder.view.FinderImageBanner;
import com.tencent.p014mm.plugin.finder.view.FinderMediaLayout;
import com.tencent.p014mm.view.MediaBannerIndicator;
import di3.C86312j;
import dp1.C7429c2;
import ef1.C58553c;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60172g4;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import jq3.C60905o;
import kf1.C10008v1;
import l31.C61212e;
import rs1.C13442s8;
import rs1.C63539a6;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C90364q0;
import te3.C64689rq2;

/* renamed from: ve1.e4 */
public final class C14503e4 extends C14445a2 {

    /* renamed from: L */
    public final View f40199L;

    /* renamed from: ve1.e4$a */
    public static final class C14504a implements C4212x6 {

        /* renamed from: a */
        public final /* synthetic */ C60905o f40200a;

        /* renamed from: b */
        public final /* synthetic */ FinderMediaLayout f40201b;

        public C14504a(C60905o oVar, FinderMediaLayout finderMediaLayout) {
            this.f40200a = oVar;
            this.f40201b = finderMediaLayout;
        }

        /* renamed from: a */
        public void mo4665a(int i, boolean z, boolean z2) {
            int i2 = i;
            C0790x xVar = (C0790x) this.f40200a.f173503E;
            if (i2 < xVar.mo3513o().getMediaList().size()) {
                C64689rq2 rq22 = xVar.mo3513o().getMediaList().get(i2);
                C87412m.m108593f(rq22, "feed.feedObject.mediaList[position]");
                C64689rq2 rq23 = rq22;
                boolean z3 = xVar.mo3509m() != i2;
                xVar.mo3484R(i2);
                C13442s8.C13443a aVar = C13442s8.f38060Q0;
                Context context = this.f40200a.f173499A;
                C87412m.m108593f(context, "holder.context");
                C13442s8 f = aVar.mo12873f(context);
                if (f != null) {
                    C58553c a = C60172g4.C60173a.m70189a(f, 0, 1, (Object) null);
                    long id = xVar.mo3513o().getId();
                    String objectNonceId = xVar.mo3513o().getObjectNonceId();
                    LinkedList linkedList = new LinkedList(xVar.mo3513o().getMediaList());
                    C87412m.m108594g(objectNonceId, "objectNonceId");
                    C7429c2 c2Var = r1;
                    C7429c2 c2Var2 = new C7429c2(id, rq23, objectNonceId, i, linkedList, xVar, z2);
                    if (a != null) {
                        a.mo83451b(c2Var);
                    }
                }
                if (z3) {
                    Context context2 = this.f40200a.f173499A;
                    C87412m.m108592e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                    if (((MMActivity) context2).getLifecycle().getCurrentState().mo62187a(C39623j.C39626c.RESUMED)) {
                        Context context3 = this.f40200a.f173499A;
                        C87412m.m108593f(context3, "holder.context");
                        C13442s8 f2 = aVar.mo12873f(context3);
                        if (f2 != null) {
                            ((C61212e) C86312j.m106911c(C61212e.class)).mo86153W7("view_auto_slide", this.f40201b.getImageBanner(), C90364q0.m113147f(new C13604l("comment_scene", Integer.valueOf(f2.f38096i)), new C13604l("finder_context_id", f2.f38098n), new C13604l("behaviour_session_id", f2.f38099o), new C13604l("finder_tab_context_id", f2.f38100p), new C13604l("view_id", "detail_page_play_area")), 25496);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: ve1.e4$b */
    public static final class C14505b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60905o f40202d;

        public C14505b(C60905o oVar) {
            this.f40202d = oVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderImmersiveImageConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C39818r rVar = C39818r.f106831a;
            Context context = this.f40202d.f173499A;
            C87412m.m108593f(context, "holder.context");
            ((C63539a6) rVar.mo62443b(context).mo75002a(C63539a6.class)).mo88402i3(true);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderImmersiveImageConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14503e4(View view, C10008v1 v1Var) {
        super(v1Var, false, 0, true, 2, (C8480h) null);
        C87412m.m108594g(view, "itemView");
        C87412m.m108594g(v1Var, "contract");
        this.f40199L = view;
    }

    /* renamed from: O */
    public void mo2276O(C60905o oVar) {
        C87412m.m108594g(oVar, "holder");
        super.mo2276O(oVar);
        FinderImgFeedMusicTag finderImgFeedMusicTag = (FinderImgFeedMusicTag) oVar.mo85812D(C0966R.C0970id.a8s);
        if (finderImgFeedMusicTag != null) {
            finderImgFeedMusicTag.mo78357e();
        }
    }

    /* renamed from: R0 */
    public void mo2324w(C60905o oVar, C0790x xVar, int i, int i2) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(xVar, "item");
        super.mo2324w(oVar, xVar, i, i2);
        ((FinderImageBanner) oVar.mo85812D(C0966R.C0970id.ol9)).setAutoPlay(true);
    }

    /* renamed from: U0 */
    public void mo44e(C60905o oVar, C0790x xVar, int i, int i2, boolean z, List<Object> list) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(xVar, "item");
        super.mo44e(oVar, xVar, i, i2, z, list);
        oVar.mo85812D(C0966R.C0970id.bjq).setOnClickListener(new C14505b(oVar));
    }

    /* renamed from: a */
    public View mo13760a(RecyclerView recyclerView) {
        C87412m.m108594g(recyclerView, "recyclerView");
        return this.f40199L;
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        FinderMediaLayout finderMediaLayout = (FinderMediaLayout) oVar.mo85812D(C0966R.C0970id.ol_);
        C4189u7 u7Var = C4189u7.IMAGE;
        C4190v vVar = new C4190v();
        vVar.f18455c = this.f12564e.mo2571D1();
        View D = oVar.mo85812D(C0966R.C0970id.f3j);
        C87412m.m108593f(D, "holder.getView(R.id.image_banner_indicator)");
        vVar.f18454b = (MediaBannerIndicator) D;
        vVar.f18453a = recyclerView;
        C13598b0 b0Var = C13598b0.f38549a;
        finderMediaLayout.mo4636b(u7Var, vVar);
        finderMediaLayout.getImageBanner().setPageChangeCallback(new C14504a(oVar, finderMediaLayout));
    }

    /* renamed from: i0 */
    public void mo2299i0(C60905o oVar, BaseFinderFeed baseFinderFeed) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g((C0790x) baseFinderFeed, "item");
    }

    /* renamed from: n */
    public void mo2307n(C60905o oVar, BaseFinderFeed baseFinderFeed, int i) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g((C0790x) baseFinderFeed, "item");
    }
}
