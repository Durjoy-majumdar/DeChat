package lq1;

import com.tencent.p014mm.plugin.finder.uniComments.UniCommentDrawerPresenter;
import com.tencent.p014mm.protocal.protobuf.FinderCommentInfo;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.LinkedList;
import pq1.C62490a;
import qq1.C63317a;
import rx3.C13598b0;
import sq1.C64151e;
import u60.C14121l;
import u60.C65234n;

/* renamed from: lq1.l */
public final class C61371l extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ LinkedList<FinderCommentInfo> f174563d;

    /* renamed from: e */
    public final /* synthetic */ UniCommentDrawerPresenter f174564e;

    /* renamed from: f */
    public final /* synthetic */ C14121l f174565f;

    /* renamed from: g */
    public final /* synthetic */ C64151e f174566g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61371l(LinkedList<FinderCommentInfo> linkedList, UniCommentDrawerPresenter uniCommentDrawerPresenter, C14121l lVar, C64151e eVar) {
        super(0);
        this.f174563d = linkedList;
        this.f174564e = uniCommentDrawerPresenter;
        this.f174565f = lVar;
        this.f174566g = eVar;
    }

    public Object invoke() {
        LinkedList<FinderCommentInfo> linkedList = this.f174563d;
        C87412m.m108593f(linkedList, "level2Comments");
        UniCommentDrawerPresenter uniCommentDrawerPresenter = this.f174564e;
        C64151e eVar = this.f174566g;
        ArrayList arrayList = new ArrayList();
        for (FinderCommentInfo finderCommentInfo : linkedList) {
            C62490a aVar = C62490a.f177529a;
            C87412m.m108593f(finderCommentInfo, "commentInfo");
            C63317a aVar2 = uniCommentDrawerPresenter.f161380h;
            if (aVar2 != null) {
                arrayList.add(aVar.mo87520b(finderCommentInfo, (long) aVar2.f179674f, eVar.getItemId()));
            } else {
                C87412m.m108603p("feedObj");
                throw null;
            }
        }
        UniCommentDrawerPresenter.m64756x(this.f174564e, arrayList, this.f174566g, true);
        this.f174564e.getClass();
        this.f174565f.mo11853b(C65234n.OK);
        return C13598b0.f38549a;
    }
}
