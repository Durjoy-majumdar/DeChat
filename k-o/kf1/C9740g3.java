package kf1;

import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.feed.FinderHalfScreenContract$Presenter;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.DataBuffer;
import com.tencent.p014mm.plugin.finder.feed.model.internal.DataStore;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import dp1.C20480e0;
import er1.C58739j4;
import fe1.C58960c;
import fe1.C58961d;
import fe1.C58969q;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import hp3.C87581a;
import java.util.LinkedList;
import mf1.C10865t;
import o40.C61926c;
import ob0.C89132b;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C110818d0;
import sx3.C26236u;
import te3.C49720hl0;
import te3.C50008jm0;
import te3.C50124kf1;
import te3.C64689rq2;
import vp1.C65834e;
import wp1.C15585f;

/* renamed from: kf1.g3 */
public final class C9740g3<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ FinderHalfScreenContract$Presenter f30191a;

    /* renamed from: b */
    public final /* synthetic */ C32224a<C13598b0> f30192b;

    public C9740g3(FinderHalfScreenContract$Presenter finderHalfScreenContract$Presenter, C32224a<C13598b0> aVar) {
        this.f30191a = finderHalfScreenContract$Presenter;
        this.f30192b = aVar;
    }

    public Object call(Object obj) {
        FinderItem o;
        LinkedList<C64689rq2> mediaList;
        C64689rq2 rq22;
        FinderItem o2;
        DataBuffer dataList;
        C0740i2 i2Var;
        RecyclerView recyclerView;
        RecyclerView.C16613e adapter;
        RecyclerView recyclerView2;
        RecyclerView.C16613e adapter2;
        DataBuffer<C0740i2> dataList2;
        DataBuffer<C0740i2> dataList3;
        C49720hl0 hl02;
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        C20480e0 e0Var = C20480e0.f57583a;
        e0Var.mo32038k(this.f30191a.f29967j, false, false, false);
        int i = cVar.f256793a;
        String str = null;
        if (!(i == 0 && cVar.f256794b == 0) && !C58739j4.f168176a.mo83681J(i, cVar.f256794b)) {
            int i2 = cVar.f256794b;
            if (i2 == -4011 || i2 == -4033 || i2 == -4036 || i2 == -5002) {
                C65834e.f189316a.mo89875i(this.f30191a.f13089u);
                C32227p<? super Integer, ? super String, C13598b0> pVar = this.f30191a.f13092x;
                if (pVar == null) {
                    return null;
                }
                pVar.invoke(Integer.valueOf(cVar.f256794b), cVar.f256795c);
                return C13598b0.f38549a;
            }
            C32227p<? super Integer, ? super String, C13598b0> pVar2 = this.f30191a.f13092x;
            if (pVar2 == null) {
                return null;
            }
            pVar2.invoke(Integer.valueOf(i2), cVar.f256795c);
            return C13598b0.f38549a;
        }
        FinderObject finderObject = ((C50008jm0) cVar.f256796d).f136184e;
        if (finderObject == null) {
            return null;
        }
        FinderHalfScreenContract$Presenter finderHalfScreenContract$Presenter = this.f30191a;
        C32224a<C13598b0> aVar = this.f30192b;
        Log.m105924i(finderHalfScreenContract$Presenter.f13088t, "get feed detail success");
        FinderContact finderContact = new FinderContact();
        FinderContact finderContact2 = finderObject.contact;
        finderContact.username = finderContact2 != null ? finderContact2.username : null;
        finderContact.nickname = finderContact2 != null ? finderContact2.nickname : null;
        finderContact.headUrl = finderContact2 != null ? finderContact2.headUrl : null;
        finderContact.authInfo = finderContact2 != null ? finderContact2.authInfo : null;
        finderContact.extInfo = finderContact2 != null ? finderContact2.extInfo : null;
        String stringExtra = finderHalfScreenContract$Presenter.f29961d.getIntent().getStringExtra("KEY_FINDER_FORWARD_SOURCE");
        if (!(stringExtra == null || stringExtra.length() == 0)) {
            C50124kf1 kf12 = finderObject.object_extend;
            if (kf12 != null) {
                if (kf12.f136752n == null) {
                    kf12.f136752n = new C49720hl0();
                }
                C49720hl0 hl03 = kf12.f136752n;
                if (hl03 != null) {
                    hl03.f134715d = stringExtra;
                }
            }
            String str2 = finderHalfScreenContract$Presenter.f13088t;
            StringBuilder sb = new StringBuilder();
            sb.append("replace first finderForwardSource:");
            C50124kf1 kf13 = finderObject.object_extend;
            sb.append((kf13 == null || (hl02 = kf13.f136752n) == null) ? null : hl02.f134715d);
            Log.m105924i(str2, sb.toString());
        }
        C58961d.C58963b.m68837m(C58961d.f168673a, finderContact, false, 2, (Object) null);
        FinderItem a = FinderItem.Companion.mo79056a(finderObject, 1);
        C13442s8 f = C13442s8.f38060Q0.mo12873f(finderHalfScreenContract$Presenter.f29961d);
        a.setCommentScene(f != null ? f.f38096i : 0);
        BaseFinderFeed k = C15585f.f42211a.mo14348k(a);
        C32226l<? super FinderObject, C13598b0> lVar = finderHalfScreenContract$Presenter.f13093y;
        if (lVar != null) {
            lVar.invoke(finderObject);
        }
        finderHalfScreenContract$Presenter.f13089u = finderObject.f164794id;
        C10865t.f32442c.mo11085a().mo11084a(C26236u.m33719b(a));
        C65834e.f189316a.mo89878l(a, C65834e.C65836b.f189330j);
        if (finderHalfScreenContract$Presenter.f13094z == null) {
            BaseFeedLoader<C0740i2> baseFeedLoader = finderHalfScreenContract$Presenter.f13124s;
            if (!(baseFeedLoader == null || (dataList3 = baseFeedLoader.getDataList()) == null)) {
                dataList3.clear();
            }
            BaseFeedLoader<C0740i2> baseFeedLoader2 = finderHalfScreenContract$Presenter.f13124s;
            if (!(baseFeedLoader2 == null || (dataList2 = baseFeedLoader2.getDataList()) == null)) {
                dataList2.add(k);
            }
            C9707f fVar = finderHalfScreenContract$Presenter.f29964g;
            if (!(fVar == null || (recyclerView2 = fVar.getRecyclerView()) == null || (adapter2 = recyclerView2.getAdapter()) == null)) {
                adapter2.notifyDataSetChanged();
            }
            e0Var.mo32037j(finderHalfScreenContract$Presenter.f29967j);
            C61926c.m72666K(300, new C9714f3(finderHalfScreenContract$Presenter));
        } else {
            DataStore dataStore = finderHalfScreenContract$Presenter.f13124s;
            if (!(dataStore == null || (dataList = dataStore.getDataList()) == null || (i2Var = (C0740i2) C110818d0.m150917O(dataList, 0)) == null)) {
                if (!(i2Var instanceof BaseFinderFeed)) {
                    i2Var = null;
                }
                if (i2Var != null) {
                    BaseFinderFeed baseFinderFeed = (BaseFinderFeed) i2Var;
                    baseFinderFeed.mo3513o().setCommentCount(k.mo3513o().getCommentCount());
                    baseFinderFeed.mo3513o().setLikeCount(k.mo3513o().getLikeCount());
                    baseFinderFeed.mo3513o().setForwardCount(k.mo3513o().getForwardCount());
                    FinderContact finderContact3 = k.mo3513o().getFeedObject().contact;
                    if (finderContact3 != null) {
                        baseFinderFeed.mo3513o().getFeedObject().contact = finderContact3;
                        baseFinderFeed.mo3483Q(C58960c.m68834f(finderContact3, (C58969q) null, false, 3, (Object) null));
                    }
                    C9707f fVar2 = finderHalfScreenContract$Presenter.f29964g;
                    if (!(fVar2 == null || (recyclerView = fVar2.getRecyclerView()) == null || (adapter = recyclerView.getAdapter()) == null)) {
                        adapter.notifyItemChanged(0, new C13604l(12, null));
                    }
                    Log.m105918d(finderHalfScreenContract$Presenter.f13088t, "cache exit,refresh apart");
                }
            }
        }
        String str3 = finderHalfScreenContract$Presenter.f13088t;
        StringBuilder sb4 = new StringBuilder();
        sb4.append("[loadFirstFeed] feed=");
        BaseFinderFeed baseFinderFeed2 = finderHalfScreenContract$Presenter.f13094z;
        sb4.append((baseFinderFeed2 == null || (o2 = baseFinderFeed2.mo3513o()) == null) ? null : Long.valueOf(o2.getId()));
        sb4.append(" => ");
        BaseFinderFeed baseFinderFeed3 = finderHalfScreenContract$Presenter.f13094z;
        sb4.append((baseFinderFeed3 == null || (o = baseFinderFeed3.mo3513o()) == null || (mediaList = o.getMediaList()) == null || (rq22 = (C64689rq2) C110818d0.m150916N(mediaList)) == null) ? null : rq22.f185266d);
        sb4.append(" updateFeed=");
        sb4.append(k.mo3513o().getId());
        sb4.append(" => ");
        C64689rq2 rq23 = (C64689rq2) C110818d0.m150916N(k.mo3513o().getMediaList());
        if (rq23 != null) {
            str = rq23.f185266d;
        }
        sb4.append(str);
        Log.m105924i(str3, sb4.toString());
        aVar.invoke();
        return C13598b0.f38549a;
    }
}
