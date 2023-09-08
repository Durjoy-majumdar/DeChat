package com.tencent.p014mm.plugin.finder.feed;

import android.os.SystemClock;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import cm1.C0747l;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import f40.C86709a0;
import fo1.C59264a;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8477a0;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.regex.Pattern;
import je1.C9300d3;
import je1.C9371r4;
import kf1.C9673c9;
import lp3.C88643g;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe1.C35464c;
import pe3.C47465a;
import pe3.C89349b;
import rx3.C13598b0;
import sx3.C36907w;
import te3.C49012ck0;
import te3.C49156dk0;
import te3.C50964qi1;
import te3.C51112ri1;
import te3.C52271zj0;
import up1.C37521f;
import vp1.C14926c;

/* renamed from: com.tencent.mm.plugin.finder.feed.FinderSelectContract$SelectPresenter */
public final class FinderSelectContract$SelectPresenter implements C59264a<C9673c9>, C11385n {

    /* renamed from: d */
    public final boolean f13218d;

    /* renamed from: e */
    public final String f13219e;

    /* renamed from: f */
    public boolean f13220f;

    /* renamed from: g */
    public C89349b f13221g;

    /* renamed from: h */
    public ArrayList<C0747l> f13222h = new ArrayList<>();

    /* renamed from: i */
    public C9673c9 f13223i;

    /* renamed from: j */
    public C14926c f13224j = new C14926c("activityList.fp");

    /* renamed from: n */
    public long f13225n = SystemClock.uptimeMillis();

    /* renamed from: o */
    public final FinderSelectContract$SelectPresenter$removeEvent$1 f13226o = new FinderSelectContract$SelectPresenter$removeEvent$1(this, C40008f.f107254d);

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderSelectContract$SelectPresenter$a */
    public static final class C2556a extends C87413o implements C32226l<Void, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderSelectContract$SelectPresenter f13227d;

        /* renamed from: e */
        public final /* synthetic */ LinkedList<C52271zj0> f13228e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2556a(FinderSelectContract$SelectPresenter finderSelectContract$SelectPresenter, LinkedList<C52271zj0> linkedList) {
            super(1);
            this.f13227d = finderSelectContract$SelectPresenter;
            this.f13228e = linkedList;
        }

        public Object invoke(Object obj) {
            Void voidR = (Void) obj;
            this.f13227d.f13224j.mo73081a();
            this.f13227d.f13224j.mo73083c(this.f13228e);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderSelectContract$SelectPresenter$b */
    public static final class C2557b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ Runnable f13229d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2557b(Runnable runnable) {
            super(0);
            this.f13229d = runnable;
        }

        public Object invoke() {
            this.f13229d.run();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderSelectContract$SelectPresenter$c */
    public static final class C2558c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderSelectContract$SelectPresenter f13230d;

        /* renamed from: e */
        public final /* synthetic */ C8477a0 f13231e;

        /* renamed from: f */
        public final /* synthetic */ LinkedList<C52271zj0> f13232f;

        /* renamed from: g */
        public final /* synthetic */ int f13233g;

        /* renamed from: h */
        public final /* synthetic */ int f13234h;

        public C2558c(FinderSelectContract$SelectPresenter finderSelectContract$SelectPresenter, C8477a0 a0Var, LinkedList<C52271zj0> linkedList, int i, int i2) {
            this.f13230d = finderSelectContract$SelectPresenter;
            this.f13231e = a0Var;
            this.f13232f = linkedList;
            this.f13233g = i;
            this.f13234h = i2;
        }

        public final void run() {
            FinderSelectContract$SelectPresenter finderSelectContract$SelectPresenter = this.f13230d;
            boolean z = this.f13231e.f27482d;
            LinkedList<C52271zj0> linkedList = this.f13232f;
            finderSelectContract$SelectPresenter.getClass();
            Log.m105924i("Finder.SelectPresenter", "firstPage " + z + ", get activity list " + linkedList.size());
            if (z) {
                finderSelectContract$SelectPresenter.f13222h.clear();
            }
            ArrayList<C0747l> arrayList = finderSelectContract$SelectPresenter.f13222h;
            ArrayList arrayList2 = new ArrayList(C36907w.m41090l(linkedList, 10));
            for (C52271zj0 lVar : linkedList) {
                arrayList2.add(new C0747l(lVar));
            }
            arrayList.addAll(arrayList2);
            FinderSelectContract$SelectPresenter finderSelectContract$SelectPresenter2 = this.f13230d;
            C9673c9 c9Var = finderSelectContract$SelectPresenter2.f13223i;
            if (c9Var != null) {
                boolean z2 = finderSelectContract$SelectPresenter2.f13220f;
                int i = this.f13233g;
                int size = this.f13232f.size();
                boolean z3 = this.f13234h > 0;
                boolean z4 = this.f13231e.f27482d;
                c9Var.f30057p = z3;
                FrameLayout frameLayout = c9Var.f30056o;
                if (frameLayout != null) {
                    frameLayout.setVisibility(8);
                    ProgressBar progressBar = c9Var.f30054j;
                    if (progressBar != null) {
                        progressBar.setVisibility(8);
                        TextView textView = c9Var.f30055n;
                        if (textView != null) {
                            textView.setVisibility(8);
                            WxRecyclerAdapter<C0747l> wxRecyclerAdapter = c9Var.f30059r;
                            if (wxRecyclerAdapter != null) {
                                if (z4) {
                                    wxRecyclerAdapter.notifyDataSetChanged();
                                } else {
                                    wxRecyclerAdapter.notifyItemRangeInserted(i + 1, size);
                                }
                            }
                            if (z2) {
                                RefreshLoadMoreLayout.C7080c cVar = new RefreshLoadMoreLayout.C7080c(0);
                                cVar.f24951f = c9Var.f30057p;
                                cVar.f24953h = size;
                                if (size > 0) {
                                    cVar.f24952g = false;
                                }
                                RefreshLoadMoreLayout refreshLoadMoreLayout = c9Var.f30053i;
                                if (refreshLoadMoreLayout != null) {
                                    refreshLoadMoreLayout.onPreFinishLoadMoreSmooth(cVar);
                                } else {
                                    C87412m.m108603p("rlLayout");
                                    throw null;
                                }
                            } else {
                                RefreshLoadMoreLayout refreshLoadMoreLayout2 = c9Var.f30053i;
                                if (refreshLoadMoreLayout2 != null) {
                                    refreshLoadMoreLayout2.mo82442H(0);
                                    if (!c9Var.f30057p) {
                                        RefreshLoadMoreLayout refreshLoadMoreLayout3 = c9Var.f30053i;
                                        if (refreshLoadMoreLayout3 != null) {
                                            RefreshLoadMoreLayout.m66896C(refreshLoadMoreLayout3, (RefreshLoadMoreLayout.C7080c) null, 1, (Object) null);
                                        } else {
                                            C87412m.m108603p("rlLayout");
                                            throw null;
                                        }
                                    }
                                } else {
                                    C87412m.m108603p("rlLayout");
                                    throw null;
                                }
                            }
                        } else {
                            C87412m.m108603p("retryTextView");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("progressBar");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("progressContainer");
                    throw null;
                }
            }
        }
    }

    public FinderSelectContract$SelectPresenter(boolean z, String str) {
        this.f13218d = z;
        this.f13219e = str;
    }

    /* renamed from: e */
    public final void mo2589e(boolean z) {
        this.f13220f = z;
        this.f13225n = SystemClock.uptimeMillis();
        if (this.f13218d) {
            C86709a0.m107524d().mo123460f(new C9371r4(this.f13221g, this.f13219e));
        } else {
            C86709a0.m107524d().mo123460f(new C9300d3(this.f13221g));
        }
    }

    /* renamed from: n */
    public final void mo2590n(C89349b bVar, int i, LinkedList<C52271zj0> linkedList, C89349b bVar2) {
        long j;
        if (!C87412m.m108589b(this.f13221g, bVar)) {
            Log.m105924i("Finder.SelectPresenter", "not my buf, ignore!");
            return;
        }
        C8477a0 a0Var = new C8477a0();
        if (this.f13221g == null) {
            a0Var.f27482d = true;
            Pattern pattern = C61926c.f176038a;
            C61926c.m72701z(C88643g.m110546d(), new C2556a(this, linkedList));
        }
        this.f13221g = bVar2;
        int size = this.f13222h.size();
        long uptimeMillis = SystemClock.uptimeMillis() - this.f13225n;
        if (!this.f13220f) {
            C37521f fVar = C37521f.f99374d;
            fVar.getClass();
            C35464c<Long> cVar = C37521f.f99343Z1;
            if (uptimeMillis < cVar.mo60266n().longValue()) {
                fVar.getClass();
                j = cVar.mo60266n().longValue() - uptimeMillis;
                C61926c.m72666K(j, new C2557b(new C2558c(this, a0Var, linkedList, size, i)));
            }
        }
        j = 0;
        C61926c.m72666K(j, new C2557b(new C2558c(this, a0Var, linkedList, size, i)));
    }

    public void onDetach() {
        if (this.f13218d) {
            C86709a0.m107524d().mo123470p(6833, this);
        } else {
            C86709a0.m107524d().mo123470p(5839, this);
        }
        this.f13226o.dead();
        this.f13223i = null;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C9673c9 c9Var;
        C89349b bVar = null;
        if (i == 0 && i2 == 0) {
            if (yVar instanceof C9300d3) {
                C9300d3 d3Var = (C9300d3) yVar;
                C47350c cVar = d3Var.f29075g;
                C47465a aVar = cVar.f127055a.f127080a;
                C50964qi1 qi12 = aVar instanceof C50964qi1 ? (C50964qi1) aVar : null;
                C89349b bVar2 = qi12 != null ? qi12.f140326e : null;
                C47465a aVar2 = cVar.f127056b.f127083a;
                C87412m.m108592e(aVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderRecommendEventResponse");
                int i3 = ((C51112ri1) aVar2).f140931f;
                C47465a aVar3 = d3Var.f29075g.f127056b.f127083a;
                C87412m.m108592e(aVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderRecommendEventResponse");
                LinkedList<C52271zj0> linkedList = ((C51112ri1) aVar3).f140929d;
                C87412m.m108593f(linkedList, "rr.responseProtoBuf as F…EventResponse).event_list");
                C47465a aVar4 = d3Var.f29075g.f127056b.f127083a;
                C51112ri1 ri12 = aVar4 instanceof C51112ri1 ? (C51112ri1) aVar4 : null;
                if (ri12 != null) {
                    bVar = ri12.f140930e;
                }
                mo2590n(bVar2, i3, linkedList, bVar);
            } else if (yVar instanceof C9371r4) {
                C9371r4 r4Var = (C9371r4) yVar;
                C47350c cVar2 = r4Var.f29263g;
                C47465a aVar5 = cVar2.f127055a.f127080a;
                C49012ck0 ck02 = aVar5 instanceof C49012ck0 ? (C49012ck0) aVar5 : null;
                C89349b bVar3 = ck02 != null ? ck02.f131788f : null;
                C47465a aVar6 = cVar2.f127056b.f127083a;
                C87412m.m108592e(aVar6, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderEventUserPageResponse");
                int i4 = ((C49156dk0) aVar6).f132377f;
                C47465a aVar7 = r4Var.f29263g.f127056b.f127083a;
                C87412m.m108592e(aVar7, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderEventUserPageResponse");
                LinkedList<C52271zj0> linkedList2 = ((C49156dk0) aVar7).f132375d;
                C87412m.m108593f(linkedList2, "rr.responseProtoBuf as F…erPageResponse).eventList");
                C47465a aVar8 = r4Var.f29263g.f127056b.f127083a;
                C49156dk0 dk02 = aVar8 instanceof C49156dk0 ? (C49156dk0) aVar8 : null;
                if (dk02 != null) {
                    bVar = dk02.f132376e;
                }
                mo2590n(bVar3, i4, linkedList2, bVar);
            }
        } else if (this.f13221g == null && (c9Var = this.f13223i) != null) {
            ProgressBar progressBar = c9Var.f30054j;
            if (progressBar != null) {
                progressBar.setVisibility(8);
                TextView textView = c9Var.f30055n;
                if (textView != null) {
                    textView.setVisibility(0);
                } else {
                    C87412m.m108603p("retryTextView");
                    throw null;
                }
            } else {
                C87412m.m108603p("progressBar");
                throw null;
            }
        }
    }
}
