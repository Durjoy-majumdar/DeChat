package lq1;

import com.tencent.p014mm.plugin.finder.uniComments.UniCommentDrawerPresenter;
import com.tencent.p014mm.protocal.protobuf.FinderCommentInfo;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedList;
import o40.C61926c;
import rx3.C13598b0;
import sq1.C64151e;
import u60.C14121l;

/* renamed from: lq1.m */
public final class C61372m extends C87413o implements C32226l<C14121l, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ LinkedList<FinderCommentInfo> f174567d;

    /* renamed from: e */
    public final /* synthetic */ UniCommentDrawerPresenter f174568e;

    /* renamed from: f */
    public final /* synthetic */ C64151e f174569f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61372m(LinkedList<FinderCommentInfo> linkedList, UniCommentDrawerPresenter uniCommentDrawerPresenter, C64151e eVar) {
        super(1);
        this.f174567d = linkedList;
        this.f174568e = uniCommentDrawerPresenter;
        this.f174569f = eVar;
    }

    public Object invoke(Object obj) {
        C14121l lVar = (C14121l) obj;
        C87412m.m108594g(lVar, "task");
        C61926c.m72668M(new C61371l(this.f174567d, this.f174568e, lVar, this.f174569f));
        return C13598b0.f38549a;
    }
}
