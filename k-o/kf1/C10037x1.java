package kf1;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0740i2;
import co1.C0898b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.feed.FinderLoaderFeedUIContract$Presenter;
import com.tencent.p014mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.DataBuffer;
import com.tencent.p014mm.plugin.finder.feed.model.internal.DataStore;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.preload.MediaPreloadCore;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import dp1.C20480e0;
import eb0.C31543z5;
import er1.C58739j4;
import fe1.C58960c;
import fe1.C58961d;
import fe1.C58969q;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import hp3.C87581a;
import ht1.C8770h2;
import ht1.C8808v4;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import je1.C46511c0;
import je1.C46547x1;
import je1.C60798d2;
import k20.C60958c;
import k20.C9556a;
import mf1.C10865t;
import nr3.C89059e;
import o40.C61926c;
import ob0.C89132b;
import pe3.C89349b;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C110818d0;
import sx3.C26236u;
import te3.C49712hj1;
import te3.C49720hl0;
import te3.C49946j51;
import te3.C50008jm0;
import te3.C50124kf1;
import te3.C64689rq2;
import tf1.C13910j;
import up1.C37521f;
import up1.C65426w0;
import vp1.C65834e;
import wp1.C15585f;

/* renamed from: kf1.x1 */
public class C10037x1 extends FinderLoaderFeedUIContract$Presenter {

    /* renamed from: A */
    public C32227p<? super Integer, ? super String, C13598b0> f30759A;

    /* renamed from: B */
    public C32226l<? super FinderObject, C13598b0> f30760B;

    /* renamed from: C */
    public BaseFinderFeed f30761C;

    /* renamed from: D */
    public boolean f30762D;

    /* renamed from: E */
    public boolean f30763E;

    /* renamed from: F */
    public boolean f30764F;

    /* renamed from: G */
    public boolean f30765G;

    /* renamed from: H */
    public boolean f30766H;

    /* renamed from: I */
    public long f30767I;

    /* renamed from: J */
    public boolean f30768J;

    /* renamed from: t */
    public final int f30769t;

    /* renamed from: u */
    public final boolean f30770u;

    /* renamed from: v */
    public final boolean f30771v;

    /* renamed from: w */
    public long f30772w;

    /* renamed from: x */
    public String f30773x;

    /* renamed from: y */
    public String f30774y;

    /* renamed from: z */
    public boolean f30775z;

    /* renamed from: kf1.x1$a */
    public static final class C10038a<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C10037x1 f30776a;

        /* renamed from: b */
        public final /* synthetic */ C32224a<C13598b0> f30777b;

        public C10038a(C10037x1 x1Var, C32224a<C13598b0> aVar) {
            this.f30776a = x1Var;
            this.f30777b = aVar;
        }

        public Object call(Object obj) {
            RefreshLoadMoreLayout D;
            View loadMoreFooter;
            FinderItem o;
            LinkedList<C64689rq2> mediaList;
            C64689rq2 rq22;
            FinderItem o2;
            DataBuffer dataList;
            C0740i2 i2Var;
            RecyclerView recyclerView;
            RecyclerView.C16613e adapter;
            DataBuffer<C0740i2> dataList2;
            RecyclerView recyclerView2;
            RecyclerView.C16613e adapter2;
            RecyclerView recyclerView3;
            RecyclerView.C16613e adapter3;
            DataBuffer<C0740i2> dataList3;
            DataBuffer<C0740i2> dataList4;
            C49720hl0 hl02;
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            C20480e0 e0Var = C20480e0.f57583a;
            e0Var.mo32038k(this.f30776a.f29967j, false, false, false);
            int i = cVar.f256793a;
            String str = null;
            if (!(i == 0 && cVar.f256794b == 0) && !C58739j4.f168176a.mo83681J(i, cVar.f256794b)) {
                int i2 = cVar.f256794b;
                if (i2 == -4011 || i2 == -4033 || i2 == -4036 || i2 == -5002) {
                    C65834e.f189316a.mo89875i(this.f30776a.f30772w);
                    C32227p<? super Integer, ? super String, C13598b0> pVar = this.f30776a.f30759A;
                    if (pVar != null) {
                        pVar.invoke(Integer.valueOf(cVar.f256794b), cVar.f256795c);
                    }
                    C20480e0.m22094n(e0Var, this.f30776a.f29967j, false, (C49712hj1) null, false, 0, false, 60, (Object) null);
                    return C13598b0.f38549a;
                }
                C32227p<? super Integer, ? super String, C13598b0> pVar2 = this.f30776a.f30759A;
                if (pVar2 != null) {
                    pVar2.invoke(Integer.valueOf(i2), cVar.f256795c);
                }
                e0Var.mo32046u(this.f30776a.f29967j, (C49712hj1) null);
                return C13598b0.f38549a;
            }
            FinderObject finderObject = ((C50008jm0) cVar.f256796d).f136184e;
            if (finderObject == null) {
                return null;
            }
            C10037x1 x1Var = this.f30776a;
            C32224a<C13598b0> aVar = this.f30777b;
            Log.m105924i(x1Var.mo2546N(), "get feed detail success");
            x1Var.mo10493B1("get feed detail success", finderObject);
            FinderContact finderContact = new FinderContact();
            FinderContact finderContact2 = finderObject.contact;
            finderContact.username = finderContact2 != null ? finderContact2.username : null;
            finderContact.nickname = finderContact2 != null ? finderContact2.nickname : null;
            finderContact.headUrl = finderContact2 != null ? finderContact2.headUrl : null;
            finderContact.authInfo = finderContact2 != null ? finderContact2.authInfo : null;
            finderContact.extInfo = finderContact2 != null ? finderContact2.extInfo : null;
            String stringExtra = x1Var.f29961d.getIntent().getStringExtra("KEY_FINDER_FORWARD_SOURCE");
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
                String N = x1Var.mo2546N();
                StringBuilder sb = new StringBuilder();
                sb.append("replace first finderForwardSource:");
                C50124kf1 kf13 = finderObject.object_extend;
                sb.append((kf13 == null || (hl02 = kf13.f136752n) == null) ? null : hl02.f134715d);
                Log.m105924i(N, sb.toString());
            }
            C58961d.C58963b.m68837m(C58961d.f168673a, finderContact, false, 2, (Object) null);
            FinderItem a = FinderItem.Companion.mo79056a(finderObject, 1);
            C13442s8 f = C13442s8.f38060Q0.mo12873f(x1Var.f29961d);
            a.setCommentScene(f != null ? f.f38096i : 0);
            BaseFinderFeed k = C15585f.f42211a.mo14348k(a);
            C32226l<? super FinderObject, C13598b0> lVar = x1Var.f30760B;
            if (lVar != null) {
                lVar.invoke(finderObject);
            }
            x1Var.f30772w = finderObject.f164794id;
            C10865t.f32442c.mo11085a().mo11084a(C26236u.m33719b(a));
            C65834e.f189316a.mo89878l(a, C65834e.C65836b.f189330j);
            if (x1Var.f30761C == null) {
                BaseFeedLoader<C0740i2> baseFeedLoader = x1Var.f13124s;
                if (!(baseFeedLoader == null || (dataList4 = baseFeedLoader.getDataList()) == null)) {
                    dataList4.clear();
                }
                BaseFeedLoader<C0740i2> baseFeedLoader2 = x1Var.f13124s;
                if (!(baseFeedLoader2 == null || (dataList3 = baseFeedLoader2.getDataList()) == null)) {
                    dataList3.add(k);
                }
                C9707f fVar = x1Var.f29964g;
                if (!(fVar == null || (recyclerView3 = fVar.getRecyclerView()) == null || (adapter3 = recyclerView3.getAdapter()) == null)) {
                    adapter3.notifyDataSetChanged();
                }
                e0Var.mo32037j(x1Var.f29967j);
                C61926c.m72666K(300, new C10022w1(x1Var));
            } else {
                C37521f.f99374d.getClass();
                if (C37521f.f99436j8.mo60266n().intValue() == 1) {
                    BaseFeedLoader<C0740i2> baseFeedLoader3 = x1Var.f13124s;
                    if (!(baseFeedLoader3 == null || (dataList2 = baseFeedLoader3.getDataList()) == null)) {
                        Iterator<E> it = dataList2.iterator();
                        int i3 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i3 = -1;
                                break;
                            } else if (((C0740i2) it.next()) instanceof BaseFinderFeed) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                        if (i3 >= 0) {
                            dataList2.remove(i3);
                            dataList2.add(i3, k);
                        }
                        C9707f fVar2 = x1Var.f29964g;
                        if (!(fVar2 == null || (recyclerView2 = fVar2.getRecyclerView()) == null || (adapter2 = recyclerView2.getAdapter()) == null)) {
                            adapter2.notifyItemChanged(i3, new C13604l(12, null));
                        }
                        Log.m105924i(x1Var.mo2546N(), "cache exit, refresh apart");
                    }
                } else {
                    DataStore dataStore = x1Var.f13124s;
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
                            C9707f fVar3 = x1Var.f29964g;
                            if (!(fVar3 == null || (recyclerView = fVar3.getRecyclerView()) == null || (adapter = recyclerView.getAdapter()) == null)) {
                                adapter.notifyItemChanged(0, new C13604l(12, null));
                            }
                            Log.m105918d(x1Var.mo2546N(), "cache exit,refresh apart");
                        }
                    }
                }
            }
            String N2 = x1Var.mo2546N();
            StringBuilder sb4 = new StringBuilder();
            sb4.append("[loadFirstFeed] feed=");
            BaseFinderFeed baseFinderFeed2 = x1Var.f30761C;
            sb4.append((baseFinderFeed2 == null || (o2 = baseFinderFeed2.mo3513o()) == null) ? null : Long.valueOf(o2.getId()));
            sb4.append(" => ");
            BaseFinderFeed baseFinderFeed3 = x1Var.f30761C;
            sb4.append((baseFinderFeed3 == null || (o = baseFinderFeed3.mo3513o()) == null || (mediaList = o.getMediaList()) == null || (rq22 = (C64689rq2) C110818d0.m150916N(mediaList)) == null) ? null : rq22.f185266d);
            sb4.append(" updateFeed=");
            sb4.append(k.mo3513o().getId());
            sb4.append(" => ");
            C64689rq2 rq23 = (C64689rq2) C110818d0.m150916N(k.mo3513o().getMediaList());
            if (rq23 != null) {
                str = rq23.f185266d;
            }
            sb4.append(str);
            Log.m105924i(N2, sb4.toString());
            if (C87412m.m108589b("WeApp", x1Var.f29961d.getIntent().getStringExtra("KEY_FROM_SOURCE")) || C87412m.m108589b("GlobalFav", x1Var.f29961d.getIntent().getStringExtra("KEY_FROM_SOURCE"))) {
                Log.m105924i(x1Var.mo2546N(), "小程序拦截");
                C9707f fVar4 = x1Var.f29964g;
                if (!(fVar4 == null || (D = fVar4.mo10308D()) == null || (loadMoreFooter = D.getLoadMoreFooter()) == null)) {
                    View findViewById = loadMoreFooter.findViewById(C0966R.C0970id.ive);
                    if (findViewById != null) {
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar2.mo10233c(8);
                        C117292a.m165358d(findViewById, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderFeedDetailRelUIContract$Presenter$checkGetFeedDetail$1", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Lkotlin/Unit;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(findViewById, "com/tencent/mm/plugin/finder/feed/FinderFeedDetailRelUIContract$Presenter$checkGetFeedDetail$1", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Lkotlin/Unit;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    View findViewById2 = loadMoreFooter.findViewById(C0966R.C0970id.g2q);
                    if (findViewById2 != null) {
                        C9556a aVar3 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar3.mo10233c(0);
                        View view = findViewById2;
                        C117292a.m165358d(view, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderFeedDetailRelUIContract$Presenter$checkGetFeedDetail$1", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Lkotlin/Unit;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/FinderFeedDetailRelUIContract$Presenter$checkGetFeedDetail$1", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Lkotlin/Unit;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
                x1Var.f30775z = false;
            } else {
                aVar.invoke();
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10037x1(int i, MMActivity mMActivity, boolean z, boolean z2, int i2, int i3, C8480h hVar) {
        super(mMActivity);
        z = (i3 & 4) != 0 ? false : z;
        z2 = (i3 & 8) != 0 ? false : z2;
        i2 = (i3 & 16) != 0 ? 0 : i2;
        C87412m.m108594g(mMActivity, "context");
        this.f30769t = i;
        this.f30770u = z;
        this.f30771v = z2;
        this.f29967j = i2;
        this.f30773x = "";
        this.f30774y = "";
        this.f30775z = true;
    }

    /* renamed from: A7 */
    public void mo2545A7(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        Log.m105924i(mo2546N(), "onLoadMoreEnd:");
        this.f30768J = true;
    }

    /* renamed from: B1 */
    public final void mo10493B1(String str, FinderObject finderObject) {
        C13598b0 b0Var;
        C0898b bVar = C0898b.f2115a;
        if (!bVar.mo785a().mo786a()) {
            String N = mo2546N();
            Log.m105924i(N, "startPreloadVideo " + str + " feedId:" + C61926c.m72691p(finderObject.f164794id) + " return for disable");
            return;
        }
        MediaPreloadCore mediaPreloadCore = this.f29969o.f161830p;
        String N2 = mo2546N();
        Log.m105924i(N2, "startPreloadVideo " + str + " feedId:" + C61926c.m72691p(finderObject.f164794id) + " preloadCore:" + mediaPreloadCore);
        ArrayList arrayList = new ArrayList();
        arrayList.add(finderObject);
        if (mediaPreloadCore != null) {
            mediaPreloadCore.mo78448j3(str, this.f29962e, arrayList, bVar.mo785a().f2118c);
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            ((C8770h2) C86312j.m106911c(C8770h2.class)).mo9592Gq().mo78736c(this.f29962e, arrayList, bVar.mo785a().f2118c);
        }
    }

    /* renamed from: N0 */
    public void mo2487N0(C9707f fVar) {
        C87412m.m108594g(fVar, "callback");
        super.mo2487N0(fVar);
        ((FinderFeedMegaVideoBtnAnimUIC) C39818r.f106831a.mo62444c(this.f29961d).mo75002a(FinderFeedMegaVideoBtnAnimUIC.class)).mo80031d3(fVar.getRecyclerView());
    }

    /* renamed from: a1 */
    public boolean mo2564a1() {
        return this.f30770u;
    }

    /* renamed from: n */
    public ArrayList<C0740i2> mo2492n() {
        BaseFeedLoader<C0740i2> baseFeedLoader = this.f13124s;
        if (baseFeedLoader != null) {
            return baseFeedLoader.getDataListJustForAdapter();
        }
        return null;
    }

    /* renamed from: o */
    public void mo2494o() {
        String N = mo2546N();
        Log.m105924i(N, "loadMoreData: needRelatedList=" + this.f30775z + ", isFirstRefreshEnd=" + this.f30768J);
        if (this.f30775z && this.f30768J) {
            C20480e0 e0Var = C20480e0.f57583a;
            C20480e0.m22095r(e0Var, this.f29967j, 2, ((C13442s8) C39818r.f106831a.mo62444c(this.f29961d).mo75002a(C13442s8.class)).mo12861q3(), 10, false, 16, (Object) null);
            C20480e0.m22094n(e0Var, this.f29967j, true, (C49712hj1) null, false, 0, false, 60, (Object) null);
            BaseFeedLoader<C0740i2> baseFeedLoader = this.f13124s;
            if (baseFeedLoader != null) {
                BaseFeedLoader.requestLoadMore$default(baseFeedLoader, false, 1, (Object) null);
            }
        }
    }

    public void onDetach() {
        super.onDetach();
    }

    public void onRefreshEnd(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        Log.m105924i(mo2546N(), "onRefreshEnd:");
        this.f30768J = true;
    }

    public void requestRefresh() {
        FinderItem o;
        if (!this.f30763E || !this.f30775z || !this.f30766H) {
            this.f30766H = true;
            C20480e0 e0Var = C20480e0.f57583a;
            C20480e0 e0Var2 = e0Var;
            C20480e0.m22095r(e0Var2, this.f29967j, 0, ((C13442s8) C39818r.f106831a.mo62444c(this.f29961d).mo75002a(C13442s8.class)).mo12861q3(), 10, false, 16, (Object) null);
            C20480e0.m22094n(e0Var2, this.f29967j, true, (C49712hj1) null, false, 0, false, 60, (Object) null);
            C9631b2 b2Var = new C9631b2(this);
            Long l = null;
            if (this.f30762D) {
                String N = mo2546N();
                StringBuilder sb = new StringBuilder();
                sb.append("loadFirstFeed objectId = 0, localId = ");
                BaseFinderFeed baseFinderFeed = this.f30761C;
                if (!(baseFinderFeed == null || (o = baseFinderFeed.mo3513o()) == null)) {
                    l = Long.valueOf(o.getLocalId());
                }
                sb.append(l);
                Log.m105924i(N, sb.toString());
                if (this.f30761C == null) {
                    C61926c.m72668M(new C10052y1(this));
                    return;
                }
                return;
            }
            if (((C8808v4) C86312j.m106911c(C8808v4.class)).Sn0()) {
                C37521f.f99374d.getClass();
                if (C37521f.f99180G6.mo60266n().intValue() == 1) {
                    C61926c.m72668M(new C10060z1(this));
                    return;
                }
            }
            if (this.f29961d.getIntent().getIntExtra("business_type", 0) == 1) {
                String stringExtra = this.f29961d.getIntent().getStringExtra("finder_user_name");
                if (stringExtra == null) {
                    stringExtra = "";
                }
                String str = stringExtra;
                long j = this.f30772w;
                String str2 = this.f30773x;
                C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f29961d);
                if (f != null) {
                    l = f.mo12861q3();
                }
                C89059e i = new C60798d2(j, str, str2, 1, l).mo9225i();
                i.mo11397F(this.f29961d);
                i.mo123062e(new C9620a2(this, b2Var));
                return;
            }
            mo10494x1(b2Var);
            return;
        }
        this.f30764F = true;
        if (this.f30765G) {
            mo10496z1(false);
        }
    }

    /* renamed from: s1 */
    public void mo2565s1() {
        super.mo2565s1();
        this.f30768J = true;
    }

    /* renamed from: u0 */
    public boolean mo2497u0() {
        return this.f30771v;
    }

    /* renamed from: x1 */
    public final void mo10494x1(C32224a<C13598b0> aVar) {
        long j = this.f30772w;
        String str = this.f30773x;
        int i = this.f29962e;
        int i2 = this.f30769t;
        String str2 = this.f30774y;
        C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f29961d);
        C46547x1 x1Var = new C46547x1(j, str, i, i2, "", true, (C89349b) null, (C65426w0) null, 0, (String) null, false, false, str2, f != null ? f.mo12861q3() : null, 0, (C49946j51) null, false, 118720, (C8480h) null);
        C20480e0 e0Var = C20480e0.f57583a;
        int i3 = this.f29967j;
        boolean z = false;
        boolean z2 = this.f30772w != 0;
        if (this.f30774y.length() > 0) {
            z = true;
        }
        e0Var.mo32038k(i3, true, z2, z);
        C89059e i4 = x1Var.mo9225i();
        i4.mo11397F(this.f29961d);
        i4.mo123062e(new C10038a(this, aVar));
    }

    /* renamed from: y1 */
    public final void mo10495y1() {
        if (this.f30765G && this.f30763E && this.f30775z) {
            Log.m105924i(mo2546N(), "preloadSlideUp");
            long a = C31543z5.m39451a();
            if (a - this.f30767I > 3500) {
                this.f30767I = a;
                mo10496z1(true);
                return;
            }
            Log.m105924i(mo2546N(), "ignore preloadSlideUp");
        }
    }

    /* renamed from: z1 */
    public final void mo10496z1(boolean z) {
        C46511c0 c0Var;
        BaseFeedLoader<C0740i2> baseFeedLoader = this.f13124s;
        FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader = baseFeedLoader instanceof FinderFeedShareRelativeListLoader ? (FinderFeedShareRelativeListLoader) baseFeedLoader : null;
        if (finderFeedShareRelativeListLoader != null && finderFeedShareRelativeListLoader.f13577w) {
            finderFeedShareRelativeListLoader.f13577w = false;
            if (finderFeedShareRelativeListLoader.f13568n) {
                c0Var = null;
            } else {
                c0Var = new C46511c0(finderFeedShareRelativeListLoader.f13561d, finderFeedShareRelativeListLoader.f13563f, finderFeedShareRelativeListLoader.f13564g, finderFeedShareRelativeListLoader.getLastBuffer(), (String) null, finderFeedShareRelativeListLoader.f13566i, finderFeedShareRelativeListLoader.f13579y, finderFeedShareRelativeListLoader.f13580z, finderFeedShareRelativeListLoader.f13567j, (C89349b) null, finderFeedShareRelativeListLoader.getContextObj(), 0.0f, 0.0f, finderFeedShareRelativeListLoader.f13569o, 0, 19, 23040, (C8480h) null);
                c0Var.f125308x = 19;
            }
            BaseFeedLoader.request$default(finderFeedShareRelativeListLoader, c0Var, (C13910j) null, 2, (Object) null);
        }
    }
}
