package zn1;

import android.content.Context;
import android.view.View;
import bl3.C39818r;
import com.tencent.p014mm.plugin.finder.feed.FinderTimelinePresenter;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderHomeTabFragment;
import com.tencent.p014mm.plugin.finder.playlist.FinderPlayListDrawer;
import ds1.C7515a;
import er1.C7865r3;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;
import kf1.C10008v1;
import rs1.C13293k0;
import rs1.C13311l0;
import rs1.C13554z;

/* renamed from: zn1.q */
public final class C16335q implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C60905o f43681d;

    /* renamed from: e */
    public final /* synthetic */ C10008v1 f43682e;

    /* renamed from: f */
    public final /* synthetic */ BaseFinderFeed f43683f;

    /* renamed from: g */
    public final /* synthetic */ C16336r f43684g;

    /* renamed from: h */
    public final /* synthetic */ boolean f43685h;

    public C16335q(C60905o oVar, C10008v1 v1Var, BaseFinderFeed baseFinderFeed, C16336r rVar, boolean z) {
        this.f43681d = oVar;
        this.f43682e = v1Var;
        this.f43683f = baseFinderFeed;
        this.f43684g = rVar;
        this.f43685h = z;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerUIC$onBindView$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C39818r rVar = C39818r.f106831a;
        Context context = this.f43681d.f173499A;
        C87412m.m108593f(context, "holder.context");
        C13554z zVar = (C13554z) rVar.mo62443b(context).mo75002a(C13554z.class);
        C10008v1 v1Var = this.f43682e;
        FinderTimelinePresenter finderTimelinePresenter = v1Var instanceof FinderTimelinePresenter ? (FinderTimelinePresenter) v1Var : null;
        FinderHomeTabFragment finderHomeTabFragment = finderTimelinePresenter != null ? finderTimelinePresenter.f13267h : null;
        BaseFinderFeed baseFinderFeed = this.f43683f;
        C60905o oVar = this.f43681d;
        FinderPlayListDrawer finderPlayListDrawer = this.f43684g.f43686d;
        zVar.getClass();
        C87412m.m108594g(baseFinderFeed, "feedObj");
        C87412m.m108594g(oVar, "holder");
        zVar.mo12956c3(finderHomeTabFragment, baseFinderFeed, oVar, new C13293k0(finderPlayListDrawer), new C13311l0(finderPlayListDrawer));
        this.f43684g.mo14821d3(this.f43683f.mo3513o(), this.f43685h ? 1 : 0, this.f43681d.mo17363j(), (int) (((float) C7865r3.f26468a.mo8969b(this.f43681d.f173499A)) * C7515a.f25777a.mo8637a(this.f43681d.f173499A)));
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerUIC$onBindView$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
