package com.tencent.p014mm.plugin.finder.presenter.contract;

import com.tencent.p014mm.plugin.finder.presenter.contract.FinderFollowListContract;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import fy3.C32226l;
import gy3.C87413o;
import java.util.LinkedList;
import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, mo182094d2 = {"<anonymous>", "Ljava/util/LinkedList;", "Lcom/tencent/mm/protocal/protobuf/FinderContact;", "it", "Ljava/lang/Void;", "invoke"}, mo182095k = 3, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract$FollowListPresent$loadStart$1 */
final class FinderFollowListContract$FollowListPresent$loadStart$1 extends C87413o implements C32226l<Void, LinkedList<FinderContact>> {

    /* renamed from: d */
    public final /* synthetic */ FinderFollowListContract.FollowListPresent f15948d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderFollowListContract$FollowListPresent$loadStart$1(FinderFollowListContract.FollowListPresent followListPresent) {
        super(1);
        this.f15948d = followListPresent;
    }

    public Object invoke(Object obj) {
        Void voidR = (Void) obj;
        return this.f15948d.f15931h.mo73082b();
    }
}
