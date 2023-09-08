package com.tencent.p014mm.plugin.finder.presenter.contract;

import cm1.C0748l0;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderFollowListContract;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C58784w3;
import fe1.C58960c;
import fe1.C58969q;
import gy3.C8477a0;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import je1.C9319i3;
import kotlin.Metadata;
import o40.C61937h;
import ob0.C117747y;
import sx3.C36907w;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo182094d2 = {"Lrx3/b0;", "run", "()V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract$FollowListPresent$onSceneEnd$2 */
public final class FinderFollowListContract$FollowListPresent$onSceneEnd$2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderFollowListContract.FollowListPresent f15952d;

    /* renamed from: e */
    public final /* synthetic */ C8477a0 f15953e;

    /* renamed from: f */
    public final /* synthetic */ C117747y f15954f;

    public FinderFollowListContract$FollowListPresent$onSceneEnd$2(FinderFollowListContract.FollowListPresent followListPresent, C8477a0 a0Var, C117747y yVar) {
        this.f15952d = followListPresent;
        this.f15953e = a0Var;
        this.f15954f = yVar;
    }

    public final void run() {
        int i;
        FinderFollowListContract.FollowListPresent followListPresent = this.f15952d;
        boolean z = this.f15953e.f27482d;
        LinkedList<FinderContact> l1 = ((C9319i3) this.f15954f).mo10070l1();
        boolean z2 = this.f15952d.f15933j;
        String str = followListPresent.f15927d;
        Log.m105924i(str, "firstPage " + z + ", get follow contact " + l1.size());
        int size = followListPresent.f15930g.size();
        int size2 = l1.size();
        if (z) {
            followListPresent.f15930g.clear();
            size = -1;
            size2 = -1;
        }
        ArrayList<C0748l0> arrayList = followListPresent.f15930g;
        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(l1, 10));
        Iterator<T> it = l1.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            arrayList2.add(new C0748l0(C58960c.m68834f((FinderContact) it.next(), (C58969q) null, false, 3, (Object) null)));
        }
        arrayList.addAll(arrayList2);
        FinderFollowListContract.FollowListViewCallback followListViewCallback = followListPresent.f15928e;
        if (followListViewCallback != null) {
            followListViewCallback.mo3728D(z2, size, size2);
            if (C58784w3.f168295a.mo83910X0()) {
                StringBuilder sb = new StringBuilder("firstPage:" + z + ';');
                int size3 = l1.size();
                for (i = 0; i < size3; i++) {
                    sb.append('[' + i + "]:");
                    sb.append(C61937h.m72709h(l1.get(i)));
                    sb.append(";");
                }
                String str2 = followListPresent.f15927d;
                Log.m105924i(str2, "printFinderContactList :" + sb);
                return;
            }
            return;
        }
        C87412m.m108603p("viewCallback");
        throw null;
    }
}
