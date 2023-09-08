package com.tencent.p014mm.plugin.finder.viewmodel.component;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.feed.model.FinderDataLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.plugin.finder.view.FinderRefreshLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.LruCache;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import dp1.C7435f2;
import er1.C58684b;
import fe1.C58961d;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8477a0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.List;
import je1.C46521h;
import jq3.C60898l;
import jq3.C60905o;
import kotlin.ResultKt;
import mq3.C47093a;
import ob0.C89132b;
import oq3.C21804c;
import org.json.JSONObject;
import p192l4.C10462b;
import pe3.C89349b;
import qq3.C63318b;
import rs1.C13310l;
import rs1.C13442s8;
import rs1.C48080m;
import rs1.C48081n;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import sx3.C64197v;
import te3.C49712hj1;
import te3.C51961xe0;
import uf1.C65340a;
import uf1.C65343b;
import uf1.C65344c;
import wx3.C15601d;
import wx3.C66212f;
import ye1.C66624b;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderAccountRecommendListUIC */
public final class FinderAccountRecommendListUIC extends UIComponent {

    /* renamed from: r */
    public static final LruCache<String, List<C13310l>> f162461r = new LruCache<>(6);

    /* renamed from: d */
    public final C13601g f162462d = C36568h.m40985a(new C56691k(this));

    /* renamed from: e */
    public final C13601g f162463e = C36568h.m40985a(new C56690j(this));

    /* renamed from: f */
    public final C13601g f162464f = C36568h.m40985a(new C56679d(this));

    /* renamed from: g */
    public final C13601g f162465g = C36568h.m40985a(new C56688h(this));

    /* renamed from: h */
    public final C13601g f162466h = C36568h.m40985a(new C56676a(this));

    /* renamed from: i */
    public final C13601g f162467i = C36568h.m40985a(new C56689i(this));

    /* renamed from: j */
    public final C13601g f162468j = C36568h.m40985a(new C56677b(this));

    /* renamed from: n */
    public final ArrayList<C13310l> f162469n = new ArrayList<>();

    /* renamed from: o */
    public final C13601g f162470o = C36568h.m40985a(new C56678c(this));

    /* renamed from: p */
    public final FinderDataLoader f162471p = new FinderDataLoader((C49712hj1) null, 1, (C8480h) null);

    /* renamed from: q */
    public C89349b f162472q;

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderAccountRecommendListUIC$f */
    public static final class C4246f implements C60898l.C9502b<C60905o> {

        /* renamed from: d */
        public final /* synthetic */ FinderAccountRecommendListUIC f18581d;

        public C4246f(FinderAccountRecommendListUIC finderAccountRecommendListUIC) {
            this.f18581d = finderAccountRecommendListUIC;
        }

        /* renamed from: q */
        public void mo734q(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
            C60905o oVar = (C60905o) zVar;
            C87412m.m108594g(eVar, "adapter");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(oVar, "holder");
            Intent intent = new Intent();
            intent.putExtra("key_entrance_type", 26);
            C13442s8.C13443a aVar = C13442s8.f38060Q0;
            aVar.mo12871c(this.f18581d.getContext(), intent);
            Object obj = oVar.f173503E;
            C87412m.m108592e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.viewmodel.component.FinderAccountRecommendListItem");
            C13310l lVar = (C13310l) obj;
            intent.putExtra("finder_username", lVar.f37767d.username);
            intent.putExtra("KEY_FROM_TIMELINE", false);
            Context context = oVar.f173499A;
            C87412m.m108593f(context, "holder.context");
            ((C58684b) C86312j.m106911c(C58684b.class)).mo13272V1(context, intent);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("finder_nickname", lVar.f37767d.nickname);
            jSONObject.put("click_item", 1);
            C7435f2 f2Var = C7435f2.f25626a;
            Context context2 = oVar.f173499A;
            C87412m.m108593f(context2, "holder.context");
            C13442s8 f = aVar.mo12873f(context2);
            f2Var.mo8577a(f != null ? f.mo12861q3() : null, "channel_profile_otherfrdfollow_authorcard", 1, jSONObject);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderAccountRecommendListUIC$a */
    public static final class C56676a extends C87413o implements C32224a<FrameLayout> {

        /* renamed from: d */
        public final /* synthetic */ FinderAccountRecommendListUIC f162473d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56676a(FinderAccountRecommendListUIC finderAccountRecommendListUIC) {
            super(0);
            this.f162473d = finderAccountRecommendListUIC;
        }

        public Object invoke() {
            return FinderAccountRecommendListUIC.m65385c3(this.f162473d).f191573b;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderAccountRecommendListUIC$b */
    public static final class C56677b extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ FinderAccountRecommendListUIC f162474d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56677b(FinderAccountRecommendListUIC finderAccountRecommendListUIC) {
            super(0);
            this.f162474d = finderAccountRecommendListUIC;
        }

        public Object invoke() {
            return FinderAccountRecommendListUIC.m65385c3(this.f162474d).f191572a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderAccountRecommendListUIC$c */
    public static final class C56678c extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ FinderAccountRecommendListUIC f162475d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56678c(FinderAccountRecommendListUIC finderAccountRecommendListUIC) {
            super(0);
            this.f162475d = finderAccountRecommendListUIC;
        }

        public Object invoke() {
            String stringExtra = this.f162475d.getIntent().getStringExtra("profile_username");
            return stringExtra == null ? "" : stringExtra;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderAccountRecommendListUIC$d */
    public static final class C56679d extends C87413o implements C32224a<ProgressBar> {

        /* renamed from: d */
        public final /* synthetic */ FinderAccountRecommendListUIC f162476d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56679d(FinderAccountRecommendListUIC finderAccountRecommendListUIC) {
            super(0);
            this.f162476d = finderAccountRecommendListUIC;
        }

        public Object invoke() {
            return FinderAccountRecommendListUIC.m65385c3(this.f162476d).f191575d;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderAccountRecommendListUIC$e */
    public static final class C56680e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderAccountRecommendListUIC f162477d;

        public C56680e(FinderAccountRecommendListUIC finderAccountRecommendListUIC) {
            this.f162477d = finderAccountRecommendListUIC;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f162477d.onBackPressed();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderAccountRecommendListUIC$g */
    public static final class C56681g implements C63318b {

        /* renamed from: a */
        public final /* synthetic */ FinderAccountRecommendListUIC f162478a;

        /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderAccountRecommendListUIC$g$a */
        public static final class C56682a extends C87413o implements C32226l<C89132b.C89134c<C51961xe0>, IResponse<C0740i2>> {

            /* renamed from: d */
            public static final C56682a f162479d = new C56682a();

            public C56682a() {
                super(1);
            }

            public Object invoke(Object obj) {
                C89132b.C89134c cVar = (C89132b.C89134c) obj;
                C87412m.m108594g(cVar, "cgiBack");
                C48080m a = C48081n.m53453a(cVar);
                a.setNeedClear(false);
                return a;
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.viewmodel.component.FinderAccountRecommendListUIC$onCreate$9$onLoadMore$2", mo125469f = "FinderAccountRecommendListUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderAccountRecommendListUIC$g$b */
        public static final class C56683b extends C91594j implements C32227p<IResponse<C0740i2>, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public /* synthetic */ Object f162480d;

            /* renamed from: e */
            public final /* synthetic */ FinderAccountRecommendListUIC f162481e;

            @C91590f(mo125468c = "com.tencent.mm.plugin.finder.viewmodel.component.FinderAccountRecommendListUIC$onCreate$9$onLoadMore$2$1", mo125469f = "FinderAccountRecommendListUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
            /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderAccountRecommendListUIC$g$b$a */
            public static final class C56684a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

                /* renamed from: d */
                public final /* synthetic */ boolean f162482d;

                /* renamed from: e */
                public final /* synthetic */ FinderAccountRecommendListUIC f162483e;

                /* renamed from: f */
                public final /* synthetic */ IResponse<C0740i2> f162484f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C56684a(boolean z, FinderAccountRecommendListUIC finderAccountRecommendListUIC, IResponse<C0740i2> iResponse, C15601d<? super C56684a> dVar) {
                    super(2, dVar);
                    this.f162482d = z;
                    this.f162483e = finderAccountRecommendListUIC;
                    this.f162484f = iResponse;
                }

                public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                    return new C56684a(this.f162482d, this.f162483e, this.f162484f, dVar);
                }

                public Object invoke(Object obj, Object obj2) {
                    return ((C56684a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
                }

                public final Object invokeSuspend(Object obj) {
                    RecyclerView.C16613e adapter;
                    ResultKt.throwOnFailure(obj);
                    if (this.f162482d) {
                        FinderAccountRecommendListUIC finderAccountRecommendListUIC = this.f162483e;
                        LruCache<String, List<C13310l>> lruCache = FinderAccountRecommendListUIC.f162461r;
                        RecyclerView recyclerView = finderAccountRecommendListUIC.getRlLayout().getRecyclerView();
                        if (!(recyclerView == null || (adapter = recyclerView.getAdapter()) == null)) {
                            IResponse<C0740i2> iResponse = this.f162484f;
                            FinderAccountRecommendListUIC finderAccountRecommendListUIC2 = this.f162483e;
                            List<C0740i2> incrementList = iResponse.getIncrementList();
                            if (incrementList != null) {
                                if (!(!incrementList.isEmpty())) {
                                    incrementList = null;
                                }
                                if (incrementList != null) {
                                    int size = finderAccountRecommendListUIC2.f162469n.size();
                                    finderAccountRecommendListUIC2.f162469n.addAll(incrementList);
                                    adapter.notifyItemRangeInserted(size, incrementList.size());
                                }
                            }
                        }
                        if (!this.f162484f.getHasMore()) {
                            this.f162483e.getRlLayout().mo26600h();
                        } else {
                            this.f162483e.getRlLayout().mo26580f(true);
                        }
                    } else {
                        FinderAccountRecommendListUIC finderAccountRecommendListUIC3 = this.f162483e;
                        LruCache<String, List<C13310l>> lruCache2 = FinderAccountRecommendListUIC.f162461r;
                        finderAccountRecommendListUIC3.getRlLayout().mo26580f(false);
                    }
                    return C13598b0.f38549a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C56683b(FinderAccountRecommendListUIC finderAccountRecommendListUIC, C15601d<? super C56683b> dVar) {
                super(2, dVar);
                this.f162481e = finderAccountRecommendListUIC;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                C56683b bVar = new C56683b(this.f162481e, dVar);
                bVar.f162480d = obj;
                return bVar;
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C56683b) create((IResponse) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                IResponse iResponse = (IResponse) this.f162480d;
                this.f162481e.f162472q = iResponse.getLastBuffer();
                C53895h.m60466d(this.f162481e.getMainScope(), (C66212f) null, (C53934p0) null, new C56684a(iResponse.getErrType() == 0 && iResponse.getErrCode() == 0, this.f162481e, iResponse, (C15601d<? super C56684a>) null), 3, (Object) null);
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderAccountRecommendListUIC$g$c */
        public static final class C56685c extends C87413o implements C32226l<C89132b.C89134c<C51961xe0>, IResponse<C0740i2>> {

            /* renamed from: d */
            public static final C56685c f162485d = new C56685c();

            public C56685c() {
                super(1);
            }

            public Object invoke(Object obj) {
                C89132b.C89134c cVar = (C89132b.C89134c) obj;
                C87412m.m108594g(cVar, "cgiBack");
                C48080m a = C48081n.m53453a(cVar);
                a.setNeedClear(true);
                return a;
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.viewmodel.component.FinderAccountRecommendListUIC$onCreate$9$onRefresh$2", mo125469f = "FinderAccountRecommendListUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderAccountRecommendListUIC$g$d */
        public static final class C56686d extends C91594j implements C32227p<IResponse<C0740i2>, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public /* synthetic */ Object f162486d;

            /* renamed from: e */
            public final /* synthetic */ FinderAccountRecommendListUIC f162487e;

            @C91590f(mo125468c = "com.tencent.mm.plugin.finder.viewmodel.component.FinderAccountRecommendListUIC$onCreate$9$onRefresh$2$1", mo125469f = "FinderAccountRecommendListUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
            /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderAccountRecommendListUIC$g$d$a */
            public static final class C56687a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

                /* renamed from: d */
                public final /* synthetic */ boolean f162488d;

                /* renamed from: e */
                public final /* synthetic */ IResponse<C0740i2> f162489e;

                /* renamed from: f */
                public final /* synthetic */ FinderAccountRecommendListUIC f162490f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C56687a(boolean z, IResponse<C0740i2> iResponse, FinderAccountRecommendListUIC finderAccountRecommendListUIC, C15601d<? super C56687a> dVar) {
                    super(2, dVar);
                    this.f162488d = z;
                    this.f162489e = iResponse;
                    this.f162490f = finderAccountRecommendListUIC;
                }

                public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                    return new C56687a(this.f162488d, this.f162489e, this.f162490f, dVar);
                }

                public Object invoke(Object obj, Object obj2) {
                    return ((C56687a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
                }

                public final Object invokeSuspend(Object obj) {
                    RecyclerView.C16613e adapter;
                    ResultKt.throwOnFailure(obj);
                    if (this.f162488d) {
                        List<C0740i2> incrementList = this.f162489e.getIncrementList();
                        C87412m.m108592e(incrementList, "null cannot be cast to non-null type kotlin.collections.List<out com.tencent.mm.plugin.finder.viewmodel.component.FinderAccountRecommendListItem>");
                        if (incrementList.isEmpty()) {
                            FinderAccountRecommendListUIC finderAccountRecommendListUIC = this.f162490f;
                            LruCache<String, List<C13310l>> lruCache = FinderAccountRecommendListUIC.f162461r;
                            finderAccountRecommendListUIC.mo80028e3(true, false, false);
                        } else {
                            FinderAccountRecommendListUIC finderAccountRecommendListUIC2 = this.f162490f;
                            LruCache<String, List<C13310l>> lruCache2 = FinderAccountRecommendListUIC.f162461r;
                            finderAccountRecommendListUIC2.getRlLayout().getCommonConfig().f126541c = false;
                            RecyclerView recyclerView = this.f162490f.getRlLayout().getRecyclerView();
                            if (!(recyclerView == null || (adapter = recyclerView.getAdapter()) == null)) {
                                FinderAccountRecommendListUIC finderAccountRecommendListUIC3 = this.f162490f;
                                C8477a0 a0Var = new C8477a0();
                                int i = 0;
                                for (T next : incrementList) {
                                    int i2 = i + 1;
                                    if (i >= 0) {
                                        C13310l lVar = (C13310l) next;
                                        if (i == 0) {
                                            a0Var.f27482d = true;
                                        }
                                        C13310l lVar2 = (C13310l) C110818d0.m150917O(finderAccountRecommendListUIC3.f162469n, i);
                                        if (!(lVar2 != null && lVar2.getItemId() == lVar.getItemId())) {
                                            a0Var.f27482d = false;
                                        }
                                        C58961d.f168673a.mo84162j(lVar.f37767d);
                                        i = i2;
                                    } else {
                                        C64197v.m75542k();
                                        throw null;
                                    }
                                }
                                Log.m105924i("Finder.AccountRecommendListUIC", "finderUsername=" + finderAccountRecommendListUIC3.mo80027d3() + " isSameFirstPage=" + a0Var.f27482d);
                                if (!a0Var.f27482d) {
                                    finderAccountRecommendListUIC3.f162469n.clear();
                                    finderAccountRecommendListUIC3.f162469n.addAll(incrementList);
                                    adapter.notifyDataSetChanged();
                                }
                            }
                            this.f162490f.mo80028e3(true, true, false);
                        }
                        FinderAccountRecommendListUIC.f162461r.put(this.f162490f.mo80027d3(), incrementList);
                        if (!this.f162489e.getHasMore()) {
                            this.f162490f.getRlLayout().mo26605m();
                        } else {
                            this.f162490f.getRlLayout().mo26604l(true);
                        }
                    } else {
                        FinderAccountRecommendListUIC finderAccountRecommendListUIC4 = this.f162490f;
                        LruCache<String, List<C13310l>> lruCache3 = FinderAccountRecommendListUIC.f162461r;
                        finderAccountRecommendListUIC4.mo80028e3(false, true, false);
                        this.f162490f.getRlLayout().mo26604l(false);
                    }
                    return C13598b0.f38549a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C56686d(FinderAccountRecommendListUIC finderAccountRecommendListUIC, C15601d<? super C56686d> dVar) {
                super(2, dVar);
                this.f162487e = finderAccountRecommendListUIC;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                C56686d dVar2 = new C56686d(this.f162487e, dVar);
                dVar2.f162486d = obj;
                return dVar2;
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C56686d) create((IResponse) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                IResponse iResponse = (IResponse) this.f162486d;
                this.f162487e.f162472q = iResponse.getLastBuffer();
                C53895h.m60466d(this.f162487e.getMainScope(), (C66212f) null, (C53934p0) null, new C56687a(iResponse.getErrType() == 0 && iResponse.getErrCode() == 0, iResponse, this.f162487e, (C15601d<? super C56687a>) null), 3, (Object) null);
                return C13598b0.f38549a;
            }
        }

        public C56681g(FinderAccountRecommendListUIC finderAccountRecommendListUIC) {
            this.f162478a = finderAccountRecommendListUIC;
        }

        /* renamed from: a */
        public void mo3374a(boolean z) {
            FinderDataLoader finderDataLoader = this.f162478a.f162471p;
            C65340a aVar = new C65340a();
            String d3 = this.f162478a.mo80027d3();
            C87412m.m108593f(d3, "finderUsername");
            aVar.f188092b = new C46521h(d3, this.f162478a.f162472q);
            C56685c cVar = C56685c.f162485d;
            C87412m.m108594g(cVar, "next");
            aVar.f188093c = new C65343b(cVar);
            aVar.f188102a = new C56686d(this.f162478a, (C15601d<? super C56686d>) null);
            finderDataLoader.getClass();
            C53895h.m60466d(finderDataLoader.f14036d, (C66212f) null, (C53934p0) null, new C65344c(finderDataLoader, aVar, (C15601d<? super C65344c>) null), 3, (Object) null);
        }

        public void onLoadMore() {
            FinderDataLoader finderDataLoader = this.f162478a.f162471p;
            C65340a aVar = new C65340a();
            String d3 = this.f162478a.mo80027d3();
            C87412m.m108593f(d3, "finderUsername");
            aVar.f188092b = new C46521h(d3, this.f162478a.f162472q);
            C56682a aVar2 = C56682a.f162479d;
            C87412m.m108594g(aVar2, "next");
            aVar.f188093c = new C65343b(aVar2);
            aVar.f188102a = new C56683b(this.f162478a, (C15601d<? super C56683b>) null);
            finderDataLoader.getClass();
            C53895h.m60466d(finderDataLoader.f14036d, (C66212f) null, (C53934p0) null, new C65344c(finderDataLoader, aVar, (C15601d<? super C65344c>) null), 3, (Object) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderAccountRecommendListUIC$h */
    public static final class C56688h extends C87413o implements C32224a<WxRecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ FinderAccountRecommendListUIC f162491d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56688h(FinderAccountRecommendListUIC finderAccountRecommendListUIC) {
            super(0);
            this.f162491d = finderAccountRecommendListUIC;
        }

        public Object invoke() {
            return FinderAccountRecommendListUIC.m65385c3(this.f162491d).f191574c;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderAccountRecommendListUIC$i */
    public static final class C56689i extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ FinderAccountRecommendListUIC f162492d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56689i(FinderAccountRecommendListUIC finderAccountRecommendListUIC) {
            super(0);
            this.f162492d = finderAccountRecommendListUIC;
        }

        public Object invoke() {
            return FinderAccountRecommendListUIC.m65385c3(this.f162492d).f191577f;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderAccountRecommendListUIC$j */
    public static final class C56690j extends C87413o implements C32224a<FinderRefreshLayout> {

        /* renamed from: d */
        public final /* synthetic */ FinderAccountRecommendListUIC f162493d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56690j(FinderAccountRecommendListUIC finderAccountRecommendListUIC) {
            super(0);
            this.f162493d = finderAccountRecommendListUIC;
        }

        public Object invoke() {
            return FinderAccountRecommendListUIC.m65385c3(this.f162493d).f191576e;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderAccountRecommendListUIC$k */
    public static final class C56691k extends C87413o implements C32224a<C66624b> {

        /* renamed from: d */
        public final /* synthetic */ FinderAccountRecommendListUIC f162494d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56691k(FinderAccountRecommendListUIC finderAccountRecommendListUIC) {
            super(0);
            this.f162494d = finderAccountRecommendListUIC;
        }

        public Object invoke() {
            View findViewById = this.f162494d.findViewById(C0966R.C0970id.brz);
            FrameLayout frameLayout = (FrameLayout) findViewById;
            int i = C0966R.C0970id.cj7;
            TextView textView = (TextView) C10462b.m10395a(findViewById, C0966R.C0970id.cj7);
            if (textView != null) {
                i = C0966R.C0970id.cjg;
                FrameLayout frameLayout2 = (FrameLayout) C10462b.m10395a(findViewById, C0966R.C0970id.cjg);
                if (frameLayout2 != null) {
                    i = C0966R.C0970id.iyd;
                    WxRecyclerView wxRecyclerView = (WxRecyclerView) C10462b.m10395a(findViewById, C0966R.C0970id.iyd);
                    if (wxRecyclerView != null) {
                        i = C0966R.C0970id.f358619g33;
                        ProgressBar progressBar = (ProgressBar) C10462b.m10395a(findViewById, C0966R.C0970id.f358619g33);
                        if (progressBar != null) {
                            i = C0966R.C0970id.ml8;
                            FinderRefreshLayout finderRefreshLayout = (FinderRefreshLayout) C10462b.m10395a(findViewById, C0966R.C0970id.ml8);
                            if (finderRefreshLayout != null) {
                                i = C0966R.C0970id.is_;
                                TextView textView2 = (TextView) C10462b.m10395a(findViewById, C0966R.C0970id.is_);
                                if (textView2 != null) {
                                    return new C66624b(frameLayout, frameLayout, textView, frameLayout2, wxRecyclerView, progressBar, finderRefreshLayout, textView2);
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i)));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderAccountRecommendListUIC(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public static final C66624b m65385c3(FinderAccountRecommendListUIC finderAccountRecommendListUIC) {
        return (C66624b) ((C36570n) finderAccountRecommendListUIC.f162462d).getValue();
    }

    /* renamed from: d3 */
    public final String mo80027d3() {
        return (String) ((C36570n) this.f162470o).getValue();
    }

    /* renamed from: e3 */
    public final void mo80028e3(boolean z, boolean z2, boolean z3) {
        if (z3) {
            ((FrameLayout) ((C36570n) this.f162466h).getValue()).setVisibility(0);
            getRlLayout().setVisibility(8);
            ((TextView) ((C36570n) this.f162467i).getValue()).setVisibility(8);
            ((ProgressBar) ((C36570n) this.f162464f).getValue()).setVisibility(0);
            ((TextView) ((C36570n) this.f162468j).getValue()).setVisibility(8);
        } else if (!z) {
            ((FrameLayout) ((C36570n) this.f162466h).getValue()).setVisibility(0);
            getRlLayout().setVisibility(8);
            ((TextView) ((C36570n) this.f162467i).getValue()).setVisibility(0);
            ((ProgressBar) ((C36570n) this.f162464f).getValue()).setVisibility(8);
            ((TextView) ((C36570n) this.f162468j).getValue()).setVisibility(8);
        } else {
            ((FrameLayout) ((C36570n) this.f162466h).getValue()).setVisibility(8);
            getRlLayout().setVisibility(0);
            if (!z2) {
                ((TextView) ((C36570n) this.f162467i).getValue()).setVisibility(8);
                ((ProgressBar) ((C36570n) this.f162464f).getValue()).setVisibility(8);
                ((TextView) ((C36570n) this.f162468j).getValue()).setVisibility(0);
            }
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b0t;
    }

    public final FinderRefreshLayout getRlLayout() {
        return (FinderRefreshLayout) ((C36570n) this.f162463e).getValue();
    }

    public boolean onBackPressed() {
        getContext().finish();
        return true;
    }

    public void onCreate(Bundle bundle) {
        View view;
        View findViewById;
        View view2;
        WeImageView weImageView;
        View view3;
        View findViewById2;
        View view4;
        TextView textView;
        super.onCreate(bundle);
        AppCompatActivity activity = getActivity();
        List list = null;
        MMActivity mMActivity = activity instanceof MMActivity ? (MMActivity) activity : null;
        if (mMActivity != null) {
            mMActivity.setMMTitle((int) C0966R.string.fnb);
            mMActivity.setBackBtn(new C56680e(this));
        }
        String d3 = mo80027d3();
        C87412m.m108593f(d3, "finderUsername");
        if (d3.length() == 0) {
            Log.m105920e("Finder.AccountRecommendListUIC", "finderUsername is null");
            getContext().finish();
            return;
        }
        ((WxRecyclerView) ((C36570n) this.f162465g).getValue()).setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        List list2 = f162461r.get(mo80027d3());
        if (list2 != null) {
            if (!list2.isEmpty()) {
                list = list2;
            }
            if (list != null) {
                this.f162469n.addAll(list);
            }
        }
        WxRecyclerAdapter wxRecyclerAdapter = new WxRecyclerAdapter(new FinderAccountRecommendListUIC$onCreate$adapter$1(), this.f162469n, false);
        if (!this.f162469n.isEmpty()) {
            wxRecyclerAdapter.notifyDataSetChanged();
            mo80028e3(true, true, false);
        } else {
            mo80028e3(false, false, true);
        }
        ((WxRecyclerView) ((C36570n) this.f162465g).getValue()).setAdapter(wxRecyclerAdapter);
        C21804c loadMoreFooter = getRlLayout().getLoadMoreFooter();
        if (!(loadMoreFooter == null || (view4 = loadMoreFooter.getView()) == null || (textView = (TextView) view4.findViewById(C0966R.C0970id.g2t)) == null)) {
            textView.setTextColor(textView.getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_2));
        }
        C21804c loadMoreFooter2 = getRlLayout().getLoadMoreFooter();
        if (!(loadMoreFooter2 == null || (view3 = loadMoreFooter2.getView()) == null || (findViewById2 = view3.findViewById(C0966R.C0970id.fms)) == null)) {
            findViewById2.setBackgroundColor(findViewById2.getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_2));
        }
        C21804c loadMoreFooter3 = getRlLayout().getLoadMoreFooter();
        if (!(loadMoreFooter3 == null || (view2 = loadMoreFooter3.getView()) == null || (weImageView = (WeImageView) view2.findViewById(C0966R.C0970id.aym)) == null)) {
            weImageView.setIconColor(weImageView.getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_2));
        }
        C21804c loadMoreFooter4 = getRlLayout().getLoadMoreFooter();
        if (!(loadMoreFooter4 == null || (view = loadMoreFooter4.getView()) == null || (findViewById = view.findViewById(C0966R.C0970id.itl)) == null)) {
            findViewById.setBackgroundColor(findViewById.getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_2));
        }
        FinderRefreshLayout rlLayout = getRlLayout();
        C47093a aVar = new C47093a();
        aVar.f126539a = 0.5f;
        aVar.f126540b = 300;
        aVar.f126541c = true;
        aVar.f126543e = true;
        aVar.f126544f = true;
        aVar.f126545g = true;
        aVar.f126546h = true;
        aVar.f126547i = false;
        aVar.f126548j = true;
        aVar.f126549k = true;
        aVar.f126550l = false;
        aVar.f126551m = false;
        aVar.f126552n = false;
        aVar.f126553o = true;
        aVar.f126554p = false;
        aVar.f126555q = false;
        rlLayout.setCommonConfig(aVar);
        getRlLayout().setOnSimpleAction(new C56681g(this));
        wxRecyclerAdapter.f173488o = new C4246f(this);
        C63318b bVar = getRlLayout().f56672p;
        if (bVar != null) {
            bVar.mo3374a(false);
        }
    }
}
