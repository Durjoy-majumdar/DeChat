package kf1;

import cm1.C55033u;
import com.tencent.p014mm.plugin.finder.feed.FinderCommentDrawerPresenter;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderCommentInfo;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.LinkedList;
import rx3.C13598b0;
import u60.C14121l;
import u60.C65234n;
import wp1.C66164a;

/* renamed from: kf1.c0 */
public final class C61020c0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ LinkedList<FinderCommentInfo> f173778d;

    /* renamed from: e */
    public final /* synthetic */ FinderCommentDrawerPresenter f173779e;

    /* renamed from: f */
    public final /* synthetic */ C14121l f173780f;

    /* renamed from: g */
    public final /* synthetic */ C55033u f173781g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61020c0(LinkedList<FinderCommentInfo> linkedList, FinderCommentDrawerPresenter finderCommentDrawerPresenter, C14121l lVar, C55033u uVar) {
        super(0);
        this.f173778d = linkedList;
        this.f173779e = finderCommentDrawerPresenter;
        this.f173780f = lVar;
        this.f173781g = uVar;
    }

    public Object invoke() {
        LinkedList<FinderCommentInfo> linkedList = this.f173778d;
        C87412m.m108593f(linkedList, "level2Comments");
        FinderCommentDrawerPresenter finderCommentDrawerPresenter = this.f173779e;
        C55033u uVar = this.f173781g;
        ArrayList arrayList = new ArrayList();
        for (FinderCommentInfo finderCommentInfo : linkedList) {
            C66164a aVar = C66164a.f190162a;
            C87412m.m108593f(finderCommentInfo, "commentInfo");
            FinderItem finderItem = finderCommentDrawerPresenter.f158620i;
            if (finderItem != null) {
                arrayList.add(aVar.mo90222c(finderCommentInfo, finderItem.getId(), uVar.getItemId()));
            } else {
                C87412m.m108603p("feedObj");
                throw null;
            }
        }
        FinderCommentDrawerPresenter.m63412G(this.f173779e, arrayList, this.f173781g, true);
        this.f173779e.f158603F = true;
        this.f173780f.mo11853b(C65234n.OK);
        return C13598b0.f38549a;
    }
}
