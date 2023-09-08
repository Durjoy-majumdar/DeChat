package com.tencent.p014mm.plugin.finder.feed;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C24564k0;
import gy3.C87413o;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import rx3.C13604l;
import te3.C50581nr0;

/* renamed from: com.tencent.mm.plugin.finder.feed.l */
public final class C2654l extends C87413o implements C32226l<LinkedList<C50581nr0>, LinkedList<C50581nr0>> {

    /* renamed from: d */
    public final /* synthetic */ FinderFriendLikeListDrawerPresenter f13511d;

    /* renamed from: e */
    public final /* synthetic */ HashMap<String, C13604l<C50581nr0, Integer>> f13512e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2654l(FinderFriendLikeListDrawerPresenter finderFriendLikeListDrawerPresenter, HashMap<String, C13604l<C50581nr0, Integer>> hashMap) {
        super(1);
        this.f13511d = finderFriendLikeListDrawerPresenter;
        this.f13512e = hashMap;
    }

    public Object invoke(Object obj) {
        LinkedList<C50581nr0> linkedList = (LinkedList) obj;
        this.f13511d.f13103g.clear();
        if (linkedList != null) {
            HashMap<String, C13604l<C50581nr0, Integer>> hashMap = this.f13512e;
            for (C50581nr0 nr02 : linkedList) {
                C24564k0.m30739c(hashMap).remove(nr02.f138729i);
            }
        }
        for (Map.Entry next : this.f13512e.entrySet()) {
            if (linkedList != null) {
                int intValue = ((Number) ((C13604l) next.getValue()).f38556e).intValue();
                if (intValue > linkedList.size()) {
                    intValue = linkedList.size();
                }
                Log.m105918d("Finder.DrawerPresenter", "unlikeInfo " + ((C50581nr0) ((C13604l) next.getValue()).f38555d).f138724d);
                linkedList.add(intValue, ((C13604l) next.getValue()).f38555d);
            }
        }
        return linkedList;
    }
}
