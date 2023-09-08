package com.tencent.p014mm.plugin.finder.convert;

import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.feed.model.FinderFeedRelTimelineLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C31543z5;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import kf1.C9833k9;
import le1.C10496h;
import o40.C61926c;
import rx3.C13598b0;
import sx3.C110818d0;
import te3.C64629pl1;
import u60.C14121l;
import u60.C65234n;

/* renamed from: com.tencent.mm.plugin.finder.convert.j */
public final class C2447j extends C87413o implements C32226l<IResponse<C0740i2>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C14121l f12893d;

    /* renamed from: e */
    public final /* synthetic */ C9833k9 f12894e;

    /* renamed from: f */
    public final /* synthetic */ boolean f12895f;

    /* renamed from: g */
    public final /* synthetic */ FinderStreamCardAlbumConvert f12896g;

    /* renamed from: h */
    public final /* synthetic */ C32226l<C9833k9, C13598b0> f12897h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2447j(C14121l lVar, C9833k9 k9Var, boolean z, FinderStreamCardAlbumConvert finderStreamCardAlbumConvert, C32226l<? super C9833k9, C13598b0> lVar2) {
        super(1);
        this.f12893d = lVar;
        this.f12894e = k9Var;
        this.f12895f = z;
        this.f12896g = finderStreamCardAlbumConvert;
        this.f12897h = lVar2;
    }

    public Object invoke(Object obj) {
        IResponse iResponse = (IResponse) obj;
        C87412m.m108594g(iResponse, "resp");
        this.f12893d.mo11853b(C65234n.OK);
        FinderFeedRelTimelineLoader.C2664b bVar = (FinderFeedRelTimelineLoader.C2664b) iResponse;
        if (iResponse.getErrType() == 0 && iResponse.getErrCode() == 0) {
            this.f12894e.f30390g = C31543z5.m39453c();
            boolean z = this.f12895f;
            if (z) {
                C64629pl1 pl12 = (C64629pl1) C110818d0.m150916N(bVar.f13558c);
                if (pl12 != null) {
                    List<? extends FinderObject> list = bVar.f13557b;
                    boolean z2 = false;
                    if (list != null && (!list.isEmpty())) {
                        z2 = true;
                    }
                    if (z2) {
                        this.f12894e.f30389f.clear();
                        pl12.f184840d = this.f12894e.f30387d.f184840d;
                        LinkedList<FinderObject> linkedList = pl12.f184844h;
                        Collection collection = bVar.f13557b;
                        if (collection == null) {
                            collection = new LinkedList();
                        }
                        linkedList.addAll(collection);
                        C9833k9 k9Var = this.f12894e;
                        k9Var.getClass();
                        k9Var.f30387d = pl12;
                        List incrementList = iResponse.getIncrementList();
                        if (incrementList != null) {
                            ArrayList arrayList = new ArrayList();
                            for (Object next : incrementList) {
                                if (next instanceof BaseFinderFeed) {
                                    arrayList.add(next);
                                }
                            }
                            this.f12894e.f30389f.addAll(arrayList);
                        }
                        C61926c.m72666K(0, new C2444g(this.f12896g, this.f12894e));
                    }
                }
                Log.m105920e("Finder.FinderStreamCardAlbumConvert", "[fetchContent] wrong. isRefresh=true but resp.`object`.is Empty");
            } else if (!z) {
                this.f12894e.f30387d.f184844h.clear();
                this.f12894e.f30389f.clear();
                List<? extends FinderObject> list2 = bVar.f13557b;
                if (list2 != null) {
                    this.f12894e.f30387d.f184844h.addAll(list2);
                }
                List incrementList2 = iResponse.getIncrementList();
                if (incrementList2 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object next2 : incrementList2) {
                        if (next2 instanceof BaseFinderFeed) {
                            arrayList2.add(next2);
                        }
                    }
                    this.f12894e.f30389f.addAll(arrayList2);
                }
            }
            Log.m105924i("Finder.FinderStreamCardAlbumConvert", "[fetchContent] successfully! isRefresh=" + this.f12895f + ' ' + C10496h.m10426a(this.f12894e.f30387d) + " hasMore=" + iResponse.getHasMore() + " continueAtTheEnd=" + this.f12894e.f30387d.f184850q + " size=" + this.f12894e.f30389f.size());
            C61926c.m72668M(new C2445h(this.f12897h, this.f12894e));
        } else {
            Log.m105920e("Finder.FinderStreamCardAlbumConvert", "[fetchContent] wrong. errType=" + iResponse.getErrType() + " errCode=" + iResponse.getErrCode());
            C61926c.m72668M(new C2446i(this.f12897h, this.f12894e));
        }
        return C13598b0.f38549a;
    }
}
