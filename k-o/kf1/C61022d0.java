package kf1;

import cm1.C55033u;
import com.tencent.p014mm.plugin.finder.feed.FinderCommentDrawerPresenter;
import com.tencent.p014mm.protocal.protobuf.FinderCommentInfo;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedList;
import o40.C61926c;
import rx3.C13598b0;
import u60.C14121l;

/* renamed from: kf1.d0 */
public final class C61022d0 extends C87413o implements C32226l<C14121l, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ LinkedList<FinderCommentInfo> f173786d;

    /* renamed from: e */
    public final /* synthetic */ FinderCommentDrawerPresenter f173787e;

    /* renamed from: f */
    public final /* synthetic */ C55033u f173788f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61022d0(LinkedList<FinderCommentInfo> linkedList, FinderCommentDrawerPresenter finderCommentDrawerPresenter, C55033u uVar) {
        super(1);
        this.f173786d = linkedList;
        this.f173787e = finderCommentDrawerPresenter;
        this.f173788f = uVar;
    }

    public Object invoke(Object obj) {
        C14121l lVar = (C14121l) obj;
        C87412m.m108594g(lVar, "task");
        C61926c.m72668M(new C61020c0(this.f173786d, this.f173787e, lVar, this.f173788f));
        return C13598b0.f38549a;
    }
}
