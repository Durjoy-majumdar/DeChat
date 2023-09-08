package xm1;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import a14.C53965x0;
import a14.C53973z1;
import android.view.View;
import bl3.C39818r;
import bn1.C0330a;
import bn1.C0331b;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.nearby.newlivesquare.LiveEntranceFragmentViewCallback;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.refreshLayout.WxRefreshLayout;
import eb0.C31543z5;
import f14.C7972g;
import f40.C86709a0;
import fn1.C8166a;
import fn1.C8171c;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import i31.C117134d;
import it1.C60625c;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kotlin.ResultKt;
import ln1.C21445b;
import o40.C61926c;
import ob0.C89132b;
import ok1.C62042e;
import pe3.C89349b;
import rs1.C13442s8;
import rx3.C13598b0;
import sx3.C64186f0;
import te3.C49208e00;
import te3.C49548ge1;
import te3.C49712hj1;
import wm1.C15548j;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import ym1.C16052a;
import yx3.C91590f;
import yx3.C91594j;
import zm1.C16302f;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.nearby.newlivesquare.LiveEntranceFragmentViewCallback$loadDataWithCgi$1", mo125469f = "LiveEntranceFragmentViewCallback.kt", mo125470l = {869, 871}, mo125471m = "invokeSuspend")
/* renamed from: xm1.w */
public final class C15852w extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f42680d;

    /* renamed from: e */
    public /* synthetic */ Object f42681e;

    /* renamed from: f */
    public final /* synthetic */ LiveEntranceFragmentViewCallback f42682f;

    /* renamed from: g */
    public final /* synthetic */ boolean f42683g;

    /* renamed from: h */
    public final /* synthetic */ int f42684h;

    /* renamed from: i */
    public final /* synthetic */ int f42685i;

    /* renamed from: j */
    public final /* synthetic */ long f42686j;

    /* renamed from: n */
    public final /* synthetic */ C32226l<C89132b.C89134c<C49548ge1>, C13598b0> f42687n;

    /* renamed from: o */
    public final /* synthetic */ C32226l<C89132b.C89134c<C49548ge1>, C13598b0> f42688o;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.nearby.newlivesquare.LiveEntranceFragmentViewCallback$loadDataWithCgi$1$1", mo125469f = "LiveEntranceFragmentViewCallback.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: xm1.w$a */
    public static final class C15853a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C89132b.C89134c<C49548ge1> f42689d;

        /* renamed from: e */
        public final /* synthetic */ LiveEntranceFragmentViewCallback f42690e;

        /* renamed from: f */
        public final /* synthetic */ long f42691f;

        /* renamed from: g */
        public final /* synthetic */ C32226l<C89132b.C89134c<C49548ge1>, C13598b0> f42692g;

        /* renamed from: h */
        public final /* synthetic */ boolean f42693h;

        /* renamed from: i */
        public final /* synthetic */ C32226l<C89132b.C89134c<C49548ge1>, C13598b0> f42694i;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.nearby.newlivesquare.LiveEntranceFragmentViewCallback$loadDataWithCgi$1$1$1", mo125469f = "LiveEntranceFragmentViewCallback.kt", mo125470l = {903}, mo125471m = "invokeSuspend")
        /* renamed from: xm1.w$a$a */
        public static final class C15854a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f42695d;

            /* renamed from: e */
            public final /* synthetic */ LiveEntranceFragmentViewCallback f42696e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C15854a(LiveEntranceFragmentViewCallback liveEntranceFragmentViewCallback, C15601d<? super C15854a> dVar) {
                super(2, dVar);
                this.f42696e = liveEntranceFragmentViewCallback;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C15854a(this.f42696e, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C15854a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f42695d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.f42695d = 1;
                    if (C53965x0.m60607b(50, this) == aVar) {
                        return aVar;
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                LiveEntranceFragmentViewCallback liveEntranceFragmentViewCallback = this.f42696e;
                C16302f fVar = liveEntranceFragmentViewCallback.f15714m;
                if (fVar != null) {
                    fVar.mo14789a(liveEntranceFragmentViewCallback.f15709h);
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15853a(C89132b.C89134c<C49548ge1> cVar, LiveEntranceFragmentViewCallback liveEntranceFragmentViewCallback, long j, C32226l<? super C89132b.C89134c<C49548ge1>, C13598b0> lVar, boolean z, C32226l<? super C89132b.C89134c<C49548ge1>, C13598b0> lVar2, C15601d<? super C15853a> dVar) {
            super(2, dVar);
            this.f42689d = cVar;
            this.f42690e = liveEntranceFragmentViewCallback;
            this.f42691f = j;
            this.f42692g = lVar;
            this.f42693h = z;
            this.f42694i = lVar2;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C15853a(this.f42689d, this.f42690e, this.f42691f, this.f42692g, this.f42693h, this.f42694i, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C15853a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            boolean z;
            int i;
            Class cls = C15834h.class;
            ResultKt.throwOnFailure(obj);
            Log.m105924i("Finder.LiveEntranceFragmentViewCallback", "#loadDataWithCgi cgi end. errType=" + this.f42689d.f256793a + " errCode=" + this.f42689d.f256794b);
            C21445b bVar = C21445b.f60694a;
            bVar.mo33618g(10000);
            C89132b.C89134c<C49548ge1> cVar = this.f42689d;
            if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                LiveEntranceFragmentViewCallback liveEntranceFragmentViewCallback = this.f42690e;
                C49548ge1 ge12 = (C49548ge1) cVar.f256796d;
                liveEntranceFragmentViewCallback.f15717p = ge12;
                C15826d.f42634b = ge12 != null && ge12.f134003p;
                C16052a.f43158g = ge12 != null && ge12.f134003p;
                C15819a aVar = C15819a.f42619a;
                C15819a.f42620b = ((long) (ge12 != null ? ge12.f133996f : 0)) * 1000;
                liveEntranceFragmentViewCallback.mo3626f(ge12, this.f42691f, this.f42692g == null && this.f42693h);
                z = true;
            } else {
                z = false;
            }
            bVar.mo33617f(10000);
            C32226l<C89132b.C89134c<C49548ge1>, C13598b0> lVar = this.f42692g;
            if (lVar != null) {
                lVar.invoke(this.f42689d);
            } else {
                if (z) {
                    LiveEntranceFragmentViewCallback liveEntranceFragmentViewCallback2 = this.f42690e;
                    C53895h.m60466d(liveEntranceFragmentViewCallback2.f15706e, (C66212f) null, (C53934p0) null, new C15854a(liveEntranceFragmentViewCallback2, (C15601d<? super C15854a>) null), 3, (Object) null);
                    C49548ge1 ge13 = this.f42690e.f15717p;
                    if (ge13 != null && (i = ge13.f133998h) > 0) {
                        C62042e.f176370a.mo87106p0().putInt("finder_live_watch_count_down_refresh_interval", i);
                    }
                    LiveEntranceFragmentViewCallback liveEntranceFragmentViewCallback3 = this.f42690e;
                    if (!liveEntranceFragmentViewCallback3.f15708g) {
                        liveEntranceFragmentViewCallback3.f15708g = true;
                        liveEntranceFragmentViewCallback3.mo3625e();
                        C49548ge1 ge14 = this.f42690e.f15717p;
                        boolean z2 = ge14 != null ? ge14.f134000j : false;
                        Log.m105924i("Finder.LiveEntranceFragmentViewCallback", "#loadDataWithCgi cgi end skipGetAllLiveTabs=" + z2);
                        C15834h.f42639h = true;
                        C39818r rVar = C39818r.f106831a;
                        C15834h hVar = (C15834h) rVar.mo62444c(this.f42690e.f15702a).mo75002a(cls);
                        C49548ge1 ge15 = this.f42690e.f15717p;
                        hVar.getClass();
                        StringBuilder sb = new StringBuilder();
                        sb.append("checkShowMode flags: ");
                        sb.append(ge15 != null ? Integer.valueOf(ge15.f134004q) : null);
                        Log.m105924i("LiveEntranceFragmentUICMoreIcon", sb.toString());
                        if (C61926c.m72696u(ge15 != null ? ge15.f134004q : 0, 1)) {
                            hVar.mo14510g3();
                            C15834h.f42640i = 2;
                        } else {
                            View findViewById = hVar.findViewById(C0966R.C0970id.f357591ln3);
                            if (findViewById != null) {
                                C9556a aVar2 = new C9556a();
                                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                aVar2.mo10233c(8);
                                View view = findViewById;
                                C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentUICMoreIcon", "checkShowMode", "(Lcom/tencent/mm/protocal/protobuf/FinderNavLiveStreamResponse;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentUICMoreIcon", "checkShowMode", "(Lcom/tencent/mm/protocal/protobuf/FinderNavLiveStreamResponse;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            }
                            if (!z2) {
                                C15834h hVar2 = (C15834h) rVar.mo62443b(hVar.getContext()).mo75002a(cls);
                                hVar2.getClass();
                                C49712hj1 q3 = ((C13442s8) rVar.mo62444c(hVar2.getActivity()).mo75002a(C13442s8.class)).mo12861q3();
                                Log.m105924i("FinderNearbyLiveLoadingReporter", "tickTabCgiStart");
                                C21445b.f60702i = C31543z5.m39453c();
                                hVar2.f42641d = new C15548j(q3, 9, (String) null, (String) null, (String) null, (String) null, 60, (C8480h) null);
                                C86709a0.m107524d().mo123455a(4210, hVar2);
                                C86709a0.m107524d().mo123460f(hVar2.f42641d);
                            } else {
                                ((C15834h) rVar.mo62443b(hVar.getContext()).mo75002a(cls)).mo14508d3(C15834h.f42638g);
                            }
                            C15834h.f42640i = 1;
                        }
                    }
                }
                WxRefreshLayout wxRefreshLayout = this.f42690e.f15712k;
                if (wxRefreshLayout != null) {
                    wxRefreshLayout.mo26604l(z);
                    WxRefreshLayout wxRefreshLayout2 = this.f42690e.f15712k;
                    if (wxRefreshLayout2 != null) {
                        wxRefreshLayout2.mo26580f(z);
                    } else {
                        C87412m.m108603p("refreshLayout");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("refreshLayout");
                    throw null;
                }
            }
            C32226l<C89132b.C89134c<C49548ge1>, C13598b0> lVar2 = this.f42694i;
            if (lVar2 != null) {
                lVar2.invoke(this.f42689d);
            }
            bVar.mo33619h(10000);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: xm1.w$b */
    public static final class C15855b extends C87413o implements C32224a<C60625c<C49548ge1>> {

        /* renamed from: d */
        public final /* synthetic */ boolean f42697d;

        /* renamed from: e */
        public final /* synthetic */ LiveEntranceFragmentViewCallback f42698e;

        /* renamed from: f */
        public final /* synthetic */ int f42699f;

        /* renamed from: g */
        public final /* synthetic */ int f42700g;

        /* renamed from: h */
        public final /* synthetic */ long f42701h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15855b(boolean z, LiveEntranceFragmentViewCallback liveEntranceFragmentViewCallback, int i, int i2, long j) {
            super(0);
            this.f42697d = z;
            this.f42698e = liveEntranceFragmentViewCallback;
            this.f42699f = i;
            this.f42700g = i2;
            this.f42701h = j;
        }

        public Object invoke() {
            C64186f0 f0Var;
            C49548ge1 ge12;
            boolean z = this.f42697d;
            C89349b bVar = null;
            if (!z && (ge12 = this.f42698e.f15717p) != null) {
                bVar = ge12.f133999i;
            }
            C89349b bVar2 = bVar;
            if (z) {
                f0Var = C64186f0.f181907d;
            } else {
                LiveEntranceFragmentViewCallback liveEntranceFragmentViewCallback = this.f42698e;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int size = liveEntranceFragmentViewCallback.f15710i.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i = size - 1;
                        C0740i2 i2Var = liveEntranceFragmentViewCallback.f15710i.get(size);
                        C87412m.m108593f(i2Var, "feedDataList[index]");
                        C0740i2 i2Var2 = i2Var;
                        if (i2Var2 instanceof C0330a) {
                            C0330a aVar = (C0330a) i2Var2;
                            if (!arrayList2.contains(Integer.valueOf(aVar.mo82k()))) {
                                if (i2Var2 instanceof C0331b) {
                                    C49208e00 e002 = new C49208e00();
                                    e002.f132601d = aVar.mo82k();
                                    e002.f132602e = aVar.mo78a();
                                    e002.f132603f.addAll(liveEntranceFragmentViewCallback.mo3623b());
                                    arrayList.add(e002);
                                } else {
                                    C49208e00 e003 = new C49208e00();
                                    e003.f132601d = aVar.mo82k();
                                    e003.f132602e = aVar.mo78a();
                                    e003.f132603f.addAll(aVar.mo81j());
                                    arrayList.add(e003);
                                }
                                arrayList2.add(Integer.valueOf(aVar.mo82k()));
                            }
                        }
                        if (i < 0) {
                            break;
                        }
                        size = i;
                    }
                }
                f0Var = arrayList;
            }
            MMActivity mMActivity = this.f42698e.f15702a;
            C87412m.m108592e(mMActivity, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.MMFinderUI");
            C8166a.C8167a aVar2 = new C8166a.C8167a(this.f42699f, this.f42700g, bVar2, 76, f0Var, ((MMFinderUI) mMActivity).mo2194I7(), this.f42701h, this.f42698e.f15725x);
            Log.m105924i("Finder.LiveEntranceFragmentViewCallback", "#loadDataWithCgi req=" + aVar2);
            return new C8166a(aVar2, (C49712hj1) null, this.f42698e.f15702a, 2, (C8480h) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15852w(LiveEntranceFragmentViewCallback liveEntranceFragmentViewCallback, boolean z, int i, int i2, long j, C32226l<? super C89132b.C89134c<C49548ge1>, C13598b0> lVar, C32226l<? super C89132b.C89134c<C49548ge1>, C13598b0> lVar2, C15601d<? super C15852w> dVar) {
        super(2, dVar);
        this.f42682f = liveEntranceFragmentViewCallback;
        this.f42683g = z;
        this.f42684h = i;
        this.f42685i = i2;
        this.f42686j = j;
        this.f42687n = lVar;
        this.f42688o = lVar2;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C15852w wVar = new C15852w(this.f42682f, this.f42683g, this.f42684h, this.f42685i, this.f42686j, this.f42687n, this.f42688o, dVar);
        wVar.f42681e = obj;
        return wVar;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C15852w) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f42680d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C15855b bVar = new C15855b(this.f42683g, this.f42682f, this.f42684h, this.f42685i, this.f42686j);
            C66212f coroutineContext = ((C0000n0) this.f42681e).getCoroutineContext();
            int i2 = C53973z1.f151221b0;
            C8171c cVar = new C8171c(bVar, (C53973z1) coroutineContext.get(C53973z1.C0004b.f3d), this.f42682f.f15702a);
            this.f42680d = 1;
            obj = C117134d.m165173h(cVar, false, this, 1, (Object) null);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            return C13598b0.f38549a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        LiveEntranceFragmentViewCallback liveEntranceFragmentViewCallback = this.f42682f;
        C66212f fVar = ((C7972g) liveEntranceFragmentViewCallback.f15706e).f26652d;
        C15853a aVar2 = new C15853a((C89132b.C89134c) obj, liveEntranceFragmentViewCallback, this.f42686j, this.f42687n, this.f42683g, this.f42688o, (C15601d<? super C15853a>) null);
        this.f42680d = 2;
        if (C53895h.m60469g(fVar, aVar2, this) == aVar) {
            return aVar;
        }
        return C13598b0.f38549a;
    }
}
