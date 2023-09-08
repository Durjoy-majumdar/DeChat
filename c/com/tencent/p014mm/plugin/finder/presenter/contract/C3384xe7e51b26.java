package com.tencent.p014mm.plugin.finder.presenter.contract;

import com.tencent.p014mm.plugin.finder.presenter.contract.FinderFollowTopicListContract;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedList;
import je1.C9326j3;
import kotlin.Metadata;
import ob0.C117747y;
import pe3.C47465a;
import rx3.C13598b0;
import te3.C49447fn0;
import te3.C51270sn1;
import vp1.C14942q;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo182094d2 = {"Ljava/lang/Void;", "it", "Lrx3/b0;", "invoke", "(Ljava/lang/Void;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderFollowTopicListContract$FollowTopicPresenter$onSceneEnd$1$1 */
public final class C3384xe7e51b26 extends C87413o implements C32226l<Void, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderFollowTopicListContract.FollowTopicPresenter f15971d;

    /* renamed from: e */
    public final /* synthetic */ C117747y f15972e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3384xe7e51b26(FinderFollowTopicListContract.FollowTopicPresenter followTopicPresenter, C117747y yVar) {
        super(1);
        this.f15971d = followTopicPresenter;
        this.f15972e = yVar;
    }

    public Object invoke(Object obj) {
        Void voidR = (Void) obj;
        this.f15971d.f15967d.mo73081a();
        C14942q qVar = this.f15971d.f15967d;
        C47465a aVar = ((C9326j3) this.f15972e).f29138g.f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFollowTopicListResponse");
        LinkedList<C51270sn1> linkedList = ((C49447fn0) aVar).f133593d;
        C87412m.m108593f(linkedList, "rr.responseProtoBuf as F…TopicListResponse).topics");
        qVar.mo73083c(linkedList);
        return C13598b0.f38549a;
    }
}
