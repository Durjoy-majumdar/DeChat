package com.tencent.p014mm.plugin.finder.presenter.contract;

import cm1.C0748l0;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderFollowListContract;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import fe1.C58960c;
import fe1.C58969q;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.LinkedList;
import kotlin.Metadata;
import pe3.C89349b;
import rx3.C13598b0;
import sx3.C36907w;

@Metadata(mo182093d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, mo182094d2 = {"<anonymous>", "", "result", "Ljava/util/LinkedList;", "Lcom/tencent/mm/protocal/protobuf/FinderContact;", "invoke"}, mo182095k = 3, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract$FollowListPresent$loadStart$2 */
final class FinderFollowListContract$FollowListPresent$loadStart$2 extends C87413o implements C32226l<LinkedList<FinderContact>, Object> {

    /* renamed from: d */
    public final /* synthetic */ FinderFollowListContract.FollowListPresent f15949d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderFollowListContract$FollowListPresent$loadStart$2(FinderFollowListContract.FollowListPresent followListPresent) {
        super(1);
        this.f15949d = followListPresent;
    }

    public Object invoke(Object obj) {
        LinkedList<FinderContact> linkedList = (LinkedList) obj;
        FinderFollowListContract.FollowListPresent followListPresent = this.f15949d;
        C89349b bVar = followListPresent.f15929f;
        if (bVar != null) {
            return bVar;
        }
        if (linkedList == null) {
            return null;
        }
        if (followListPresent.f15930g.isEmpty()) {
            ArrayList<C0748l0> arrayList = followListPresent.f15930g;
            ArrayList arrayList2 = new ArrayList(C36907w.m41090l(linkedList, 10));
            for (FinderContact f : linkedList) {
                arrayList2.add(new C0748l0(C58960c.m68834f(f, (C58969q) null, false, 3, (Object) null)));
            }
            arrayList.addAll(arrayList2);
            FinderFollowListContract.FollowListViewCallback followListViewCallback = followListPresent.f15928e;
            if (followListViewCallback != null) {
                followListViewCallback.mo3728D(false, 0, followListPresent.f15930g.size());
            } else {
                C87412m.m108603p("viewCallback");
                throw null;
            }
        }
        return C13598b0.f38549a;
    }
}
