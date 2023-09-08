package com.tencent.p014mm.plugin.finder.feed;

import fy3.C32224a;
import gy3.C8480h;
import gy3.C87413o;
import java.util.HashMap;
import kf1.C10024w3;
import rx3.C13598b0;
import rx3.C13604l;
import u60.C14121l;
import u60.C65233m;

/* renamed from: com.tencent.mm.plugin.finder.feed.m */
public final class C2656m extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderFriendLikeListDrawerPresenter f13515d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2656m(FinderFriendLikeListDrawerPresenter finderFriendLikeListDrawerPresenter) {
        super(0);
        this.f13515d = finderFriendLikeListDrawerPresenter;
    }

    public Object invoke() {
        HashMap hashMap = new HashMap();
        int size = this.f13515d.f13103g.size();
        for (int i = 0; i < size; i++) {
            this.f13515d.f13103g.get(i).f1851d.f138728h = 1;
            String str = this.f13515d.f13103g.get(i).f1851d.f138729i;
            if (str == null) {
                str = "";
            }
            hashMap.put(str, new C13604l(this.f13515d.f13103g.get(i).f1851d, Integer.valueOf(i)));
        }
        FinderFriendLikeListDrawerPresenter finderFriendLikeListDrawerPresenter = this.f13515d;
        C2654l lVar = new C2654l(finderFriendLikeListDrawerPresenter, hashMap);
        C65233m mVar = finderFriendLikeListDrawerPresenter.f13102f;
        if (mVar != null) {
            mVar.mo11856a(new C14121l(new C10024w3(true, finderFriendLikeListDrawerPresenter, lVar), (String) null, 2, (C8480h) null));
        }
        return C13598b0.f38549a;
    }
}
