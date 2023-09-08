package rs1;

import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0740i2;
import cm1.C55018j0;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.DataBuffer;
import com.tencent.p014mm.plugin.finder.feed.model.internal.DataStore;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C58739j4;
import fe1.C58960c;
import fe1.C58961d;
import fe1.C58969q;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import hp3.C87581a;
import java.util.LinkedList;
import kf1.C9788i3;
import kf1.C9806j3;
import o40.C61926c;
import ob0.C89132b;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C110818d0;
import te3.C50008jm0;
import te3.C64689rq2;
import vp1.C65834e;
import wp1.C15585f;

/* renamed from: rs1.u5 */
public final class C13477u5<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C13298k5 f38194a;

    /* renamed from: b */
    public final /* synthetic */ C32227p<Integer, String, C13598b0> f38195b;

    /* renamed from: c */
    public final /* synthetic */ C32226l<FinderObject, C13598b0> f38196c;

    public C13477u5(C13298k5 k5Var, C32227p<? super Integer, ? super String, C13598b0> pVar, C32226l<? super FinderObject, C13598b0> lVar) {
        this.f38194a = k5Var;
        this.f38195b = pVar;
        this.f38196c = lVar;
    }

    public Object call(Object obj) {
        C13598b0 b0Var;
        FinderItem o;
        LinkedList<C64689rq2> mediaList;
        C64689rq2 rq22;
        FinderItem o2;
        RecyclerView.C16613e adapter;
        DataBuffer<C0740i2> dataList;
        DataBuffer<C0740i2> dataList2;
        DataBuffer dataList3;
        C0740i2 i2Var;
        RecyclerView.C16613e adapter2;
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        int i = cVar.f256793a;
        String str = null;
        if (!(i == 0 && cVar.f256794b == 0) && !C58739j4.f168176a.mo83681J(i, cVar.f256794b)) {
            int i2 = cVar.f256794b;
            if (i2 == -4011 || i2 == -4033 || i2 == -4036 || i2 == -5002) {
                C65834e.f189316a.mo89875i(this.f38194a.f37737d);
                C32227p<Integer, String, C13598b0> pVar = this.f38195b;
                if (pVar == null) {
                    return null;
                }
                pVar.invoke(Integer.valueOf(cVar.f256794b), cVar.f256795c);
                return C13598b0.f38549a;
            }
            C32227p<Integer, String, C13598b0> pVar2 = this.f38195b;
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
        C32226l<FinderObject, C13598b0> lVar = this.f38196c;
        C13298k5 k5Var = this.f38194a;
        Log.m105924i("FinderHorizontalVideoNewFormUIC", "get feed detail success");
        FinderContact finderContact = new FinderContact();
        FinderContact finderContact2 = finderObject.contact;
        finderContact.username = finderContact2 != null ? finderContact2.username : null;
        finderContact.nickname = finderContact2 != null ? finderContact2.nickname : null;
        finderContact.headUrl = finderContact2 != null ? finderContact2.headUrl : null;
        finderContact.authInfo = finderContact2 != null ? finderContact2.authInfo : null;
        finderContact.extInfo = finderContact2 != null ? finderContact2.extInfo : null;
        C58961d.C58963b.m68837m(C58961d.f168673a, finderContact, false, 2, (Object) null);
        FinderItem a = FinderItem.Companion.mo79056a(finderObject, 1);
        C55018j0 j0Var = (C55018j0) C15585f.f42211a.mo14348k(a);
        if (lVar != null) {
            lVar.invoke(finderObject);
        }
        k5Var.f37737d = finderObject.f164794id;
        ((C13317l7) C39818r.f106831a.mo62443b(k5Var.getContext()).mo75002a(C13317l7.class)).mo12758c3("first_feedid", C61926c.m72691p(k5Var.f37737d));
        String str2 = finderObject.objectNonceId;
        if (str2 == null) {
            str2 = "";
        }
        k5Var.f37740g = str2;
        C65834e.f189316a.mo89878l(a, C65834e.C65836b.f189330j);
        if (k5Var.f37744n != null) {
            C9788i3 i3Var = k5Var.f37741h;
            if (i3Var != null) {
                DataStore dataStore = i3Var.f13124s;
                if (!(dataStore == null || (dataList3 = dataStore.getDataList()) == null || (i2Var = (C0740i2) C110818d0.m150917O(dataList3, 0)) == null)) {
                    if (!(i2Var instanceof BaseFinderFeed)) {
                        i2Var = null;
                    }
                    if (i2Var != null) {
                        BaseFinderFeed baseFinderFeed = (BaseFinderFeed) i2Var;
                        baseFinderFeed.mo3513o().setCommentCount(j0Var.mo3513o().getCommentCount());
                        baseFinderFeed.mo3513o().setLikeCount(j0Var.mo3513o().getLikeCount());
                        baseFinderFeed.mo3513o().setForwardCount(j0Var.mo3513o().getForwardCount());
                        FinderContact finderContact3 = j0Var.mo3513o().getFeedObject().contact;
                        if (finderContact3 != null) {
                            baseFinderFeed.mo3513o().getFeedObject().contact = finderContact3;
                            baseFinderFeed.mo3483Q(C58960c.m68834f(finderContact3, (C58969q) null, false, 3, (Object) null));
                        }
                        C9806j3 j3Var = k5Var.f37742i;
                        if (j3Var != null) {
                            RecyclerView recyclerView = j3Var.getRecyclerView();
                            if (!(recyclerView == null || (adapter2 = recyclerView.getAdapter()) == null)) {
                                adapter2.notifyItemChanged(0, new C13604l(12, null));
                            }
                        } else {
                            C87412m.m108603p("viewCallback");
                            throw null;
                        }
                    }
                }
                Log.m105924i("FinderHorizontalVideoNewFormUIC", "cache exit,refresh apart");
                b0Var = C13598b0.f38549a;
            } else {
                C87412m.m108603p("presenter");
                throw null;
            }
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            C9788i3 i3Var2 = k5Var.f37741h;
            if (i3Var2 != null) {
                BaseFeedLoader<C0740i2> baseFeedLoader = i3Var2.f13124s;
                if (!(baseFeedLoader == null || (dataList2 = baseFeedLoader.getDataList()) == null)) {
                    dataList2.clear();
                }
                C9788i3 i3Var3 = k5Var.f37741h;
                if (i3Var3 != null) {
                    BaseFeedLoader<C0740i2> baseFeedLoader2 = i3Var3.f13124s;
                    if (!(baseFeedLoader2 == null || (dataList = baseFeedLoader2.getDataList()) == null)) {
                        dataList.add(j0Var);
                    }
                    C9806j3 j3Var2 = k5Var.f37742i;
                    if (j3Var2 != null) {
                        RecyclerView recyclerView2 = j3Var2.getRecyclerView();
                        if (!(recyclerView2 == null || (adapter = recyclerView2.getAdapter()) == null)) {
                            adapter.notifyDataSetChanged();
                        }
                        k5Var.mo12749g3().getDataListJustForAdapter().clear();
                    } else {
                        C87412m.m108603p("viewCallback");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("presenter");
                    throw null;
                }
            } else {
                C87412m.m108603p("presenter");
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[loadFirstFeed] feed=");
        C55018j0 j0Var2 = k5Var.f37744n;
        sb.append((j0Var2 == null || (o2 = j0Var2.mo3513o()) == null) ? null : Long.valueOf(o2.getId()));
        sb.append(" => ");
        C55018j0 j0Var3 = k5Var.f37744n;
        sb.append((j0Var3 == null || (o = j0Var3.mo3513o()) == null || (mediaList = o.getMediaList()) == null || (rq22 = (C64689rq2) C110818d0.m150916N(mediaList)) == null) ? null : rq22.f185266d);
        sb.append(" updateFeed=");
        sb.append(j0Var.mo3513o().getId());
        sb.append(" => ");
        C64689rq2 rq23 = (C64689rq2) C110818d0.m150916N(j0Var.mo3513o().getMediaList());
        if (rq23 != null) {
            str = rq23.f185266d;
        }
        sb.append(str);
        Log.m105924i("FinderHorizontalVideoNewFormUIC", sb.toString());
        C61926c.m72668M(new C13462t5(k5Var));
        return C13598b0.f38549a;
    }
}
