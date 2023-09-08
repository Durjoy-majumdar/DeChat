package com.tencent.p014mm.plugin.finder.presenter.contract;

import androidx.recyclerview.widget.RecyclerView;
import cm1.C39993q1;
import cm1.C55011a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderMsgContract;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.tinker.loader.shareutil.ShareConstants;
import fo1.C8178c;
import fy3.C32224a;
import gy3.C8478d0;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import o40.C61926c;
import p749xh.C66276va;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C64197v;
import sx3.C77813z;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo182094d2 = {"Lrx3/b0;", "invoke", "()V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgViewCallback$finishLoadMore$1 */
final class FinderMsgContract$MsgViewCallback$finishLoadMore$1 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderMsgContract.MsgViewCallback f160411d;

    /* renamed from: e */
    public final /* synthetic */ List<C55011a> f160412e;

    /* renamed from: f */
    public final /* synthetic */ boolean f160413f;

    /* renamed from: g */
    public final /* synthetic */ C8478d0 f160414g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderMsgContract$MsgViewCallback$finishLoadMore$1(FinderMsgContract.MsgViewCallback msgViewCallback, List<? extends C55011a> list, boolean z, C8478d0 d0Var) {
        super(0);
        this.f160411d = msgViewCallback;
        this.f160412e = list;
        this.f160413f = z;
        this.f160414g = d0Var;
    }

    public Object invoke() {
        int i;
        boolean z;
        FinderMsgContract.MsgPresenter msgPresenter = this.f160411d.f160389f;
        List<C55011a> list = this.f160412e;
        ArrayList<C55011a> arrayList = msgPresenter.f160381i;
        C87412m.m108594g(list, "increment");
        C87412m.m108594g(arrayList, ShareConstants.DEXMODE_RAW);
        if (arrayList.isEmpty()) {
            arrayList.addAll(list);
        } else {
            if (arrayList.get(C64197v.m75536e(arrayList)) instanceof C39993q1) {
                C55011a remove = arrayList.remove(C64197v.m75536e(arrayList));
            }
            for (T t : C110818d0.m150936h0(list)) {
                Iterator<C55011a> it = arrayList.iterator();
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i2 = -1;
                        break;
                    }
                    C66276va vaVar = it.next().f154465d;
                    long j = vaVar.field_id;
                    C66276va vaVar2 = t.f154465d;
                    if (j == vaVar2.field_id && vaVar.field_createTime == vaVar2.field_createTime) {
                        break;
                    }
                    i2++;
                }
                if (i2 == -1) {
                    C66276va vaVar3 = t.f154465d;
                    if (vaVar3.field_type == 10 && !Util.isNullOrNil(vaVar3.field_clientMsgId)) {
                        Iterator<C55011a> it4 = arrayList.iterator();
                        int i3 = 0;
                        while (true) {
                            if (!it4.hasNext()) {
                                i3 = -1;
                                break;
                            } else if (C87412m.m108589b(it4.next().f154465d.field_clientMsgId, t.f154465d.field_clientMsgId)) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                        if (i3 >= 0) {
                            arrayList.remove(i3);
                            String str = msgPresenter.f160379g;
                            Log.m105924i(str, "remove same clientMsgId, " + t.f154465d.field_clientMsgId);
                        }
                    }
                    arrayList.add(t);
                } else {
                    arrayList.set(i2, t);
                }
            }
            C77813z.m93909o(arrayList, FinderMsgContract$MsgPresenter$sortMentionList$comparator$1.f160406d);
        }
        String str2 = msgPresenter.f160379g;
        Log.m105924i(str2, "increment size " + list.size());
        if ((!list.isEmpty()) && msgPresenter.f160382j > 0) {
            ListIterator<C55011a> listIterator = arrayList.listIterator(arrayList.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    i = -1;
                    break;
                }
                if (listIterator.previous().f154465d.field_id == msgPresenter.f160382j) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    i = listIterator.nextIndex();
                    break;
                }
            }
            String str3 = msgPresenter.f160379g;
            Log.m105924i(str3, "unread index " + i + ", raw size " + arrayList.size());
            if (i != -1) {
                if (i >= 0) {
                    int i4 = 0;
                    while (true) {
                        arrayList.get(i4).f154466e = false;
                        if (i4 == i) {
                            break;
                        }
                        i4++;
                    }
                }
                if (i != C64197v.m75536e(arrayList)) {
                    arrayList.get(i).f154466e = true;
                }
            }
        }
        if (this.f160411d.f160389f.f160381i.isEmpty()) {
            FinderMsgContract.MsgViewCallback msgViewCallback = this.f160411d;
            msgViewCallback.getClass();
            String string = C8178c.C8179a.m8259a(msgViewCallback).getString(C0966R.string.ed5);
            FinderMsgContract.MsgViewCallback msgViewCallback2 = this.f160411d;
            msgViewCallback2.getClass();
            C61926c.m72668M(new FinderMsgContract$MsgViewCallback$showRefreshTip$1(string, msgViewCallback, false, C8178c.C8179a.m8259a(msgViewCallback2).getColor(C0966R.color.BW_0_Alpha_0_3)));
        } else {
            FinderMsgContract.MsgViewCallback msgViewCallback3 = this.f160411d;
            msgViewCallback3.getClass();
            C61926c.m72668M(new FinderMsgContract$MsgViewCallback$showRefreshTip$1((String) null, msgViewCallback3, false, 0));
        }
        if (this.f160413f) {
            RefreshLoadMoreLayout refreshLoadMoreLayout = this.f160411d.f160393j;
            if (refreshLoadMoreLayout != null) {
                refreshLoadMoreLayout.mo82442H(0);
                RecyclerView recyclerView = this.f160411d.f160392i;
                if (recyclerView != null) {
                    RecyclerView.C16613e adapter = recyclerView.getAdapter();
                    if (adapter != null) {
                        adapter.notifyDataSetChanged();
                    }
                } else {
                    C87412m.m108603p("recyclerView");
                    throw null;
                }
            } else {
                C87412m.m108603p("rlLayout");
                throw null;
            }
        } else {
            RefreshLoadMoreLayout.C7080c cVar = new RefreshLoadMoreLayout.C7080c(1);
            List<C55011a> list2 = this.f160412e;
            cVar.f24952g = false;
            cVar.f24951f = true ^ list2.isEmpty();
            cVar.f24953h = list2.size();
            RecyclerView recyclerView2 = this.f160411d.f160392i;
            if (recyclerView2 != null) {
                RecyclerView.C16613e adapter2 = recyclerView2.getAdapter();
                if (adapter2 != null) {
                    adapter2.notifyItemRangeInserted(this.f160414g.f27483d, this.f160412e.size());
                }
                RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f160411d.f160393j;
                if (refreshLoadMoreLayout2 != null) {
                    refreshLoadMoreLayout2.onPreFinishLoadMoreSmooth(cVar);
                } else {
                    C87412m.m108603p("rlLayout");
                    throw null;
                }
            } else {
                C87412m.m108603p("recyclerView");
                throw null;
            }
        }
        return C13598b0.f38549a;
    }
}
