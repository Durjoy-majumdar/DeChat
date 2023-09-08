package kf1;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import cm1.C55033u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.feed.FinderCommentDrawerPresenter;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderCommentInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import er1.C58784w3;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Iterator;
import java.util.LinkedList;
import je1.C60800g;
import l31.C61212e;
import nj3.C76879j;
import nj3.C76912y0;
import nr3.C89059e;
import o40.C61926c;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C90364q0;
import te3.C49712hj1;
import u60.C65220d;
import u60.C65222f;
import u60.C65230i;
import u60.C65232k;
import up1.C65426w0;
import uq1.C65428a;
import uq1.C65430c;
import vp1.C65834e;

/* renamed from: kf1.z */
public final class C61073z implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderCommentDrawerPresenter f173928d;

    /* renamed from: e */
    public final /* synthetic */ C55033u f173929e;

    /* renamed from: f */
    public final /* synthetic */ Context f173930f;

    /* renamed from: kf1.z$a */
    public static final class C61074a implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public static final C61074a f173931d = new C61074a();

        public final void onCancel(DialogInterface dialogInterface) {
        }
    }

    /* renamed from: kf1.z$b */
    public static final class C61075b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ Context f173932d;

        /* renamed from: e */
        public final /* synthetic */ C55033u f173933e;

        /* renamed from: f */
        public final /* synthetic */ FinderCommentDrawerPresenter f173934f;

        /* renamed from: g */
        public final /* synthetic */ C32224a<C13598b0> f173935g;

        /* renamed from: h */
        public final /* synthetic */ C32224a<C13598b0> f173936h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61075b(Context context, C55033u uVar, FinderCommentDrawerPresenter finderCommentDrawerPresenter, C32224a<C13598b0> aVar, C32224a<C13598b0> aVar2) {
            super(0);
            this.f173932d = context;
            this.f173933e = uVar;
            this.f173934f = finderCommentDrawerPresenter;
            this.f173935g = aVar;
            this.f173936h = aVar2;
        }

        public Object invoke() {
            C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f173932d);
            C49712hj1 q3 = f != null ? f.mo12861q3() : null;
            long n2 = this.f173933e.f154492d.mo89531n2();
            long j = this.f173933e.f154492d.field_feedId;
            FinderItem finderItem = this.f173934f.f158620i;
            if (finderItem != null) {
                C89059e i = new C60800g(n2, j, finderItem.getObjectNonceId(), this.f173934f.f158621j, q3).mo9225i();
                Context context = this.f173932d;
                C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                i.mo11397F((MMActivity) context);
                i.mo123062e(new C9619a0(this.f173935g, this.f173936h));
                return C13598b0.f38549a;
            }
            C87412m.m108603p("feedObj");
            throw null;
        }
    }

    /* renamed from: kf1.z$c */
    public static final class C61076c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderCommentDrawerPresenter f173937d;

        /* renamed from: e */
        public final /* synthetic */ Context f173938e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61076c(FinderCommentDrawerPresenter finderCommentDrawerPresenter, Context context) {
            super(0);
            this.f173937d = finderCommentDrawerPresenter;
            this.f173938e = context;
        }

        public Object invoke() {
            Dialog dialog = this.f173937d.f158613Q;
            if (dialog != null) {
                dialog.dismiss();
            }
            C76912y0.makeText(this.f173938e, (int) C0966R.string.eju, 0).show();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: kf1.z$d */
    public static final class C61077d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderCommentDrawerPresenter f173939d;

        /* renamed from: e */
        public final /* synthetic */ C55033u f173940e;

        /* renamed from: f */
        public final /* synthetic */ Context f173941f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61077d(FinderCommentDrawerPresenter finderCommentDrawerPresenter, C55033u uVar, Context context) {
            super(0);
            this.f173939d = finderCommentDrawerPresenter;
            this.f173940e = uVar;
            this.f173941f = context;
        }

        public Object invoke() {
            FinderItem e;
            Dialog dialog = this.f173939d.f158613Q;
            if (dialog != null) {
                dialog.dismiss();
            }
            C55033u uVar = this.f173940e;
            if (uVar.f154492d.field_actionInfo.f186500h != 0) {
                Iterator<C55033u> it = this.f173939d.f158618g.f158793d.iterator();
                while (it.hasNext()) {
                    C55033u next = it.next();
                    if (next.f154492d.mo89531n2() == uVar.f154492d.field_actionInfo.f186500h) {
                        C65426w0 w0Var = next.f154492d;
                        w0Var.mo89532o2().expandCommentCount = w0Var.mo89534q2() - 1;
                        if (next.f154492d.mo89534q2() < 0) {
                            next.f154492d.mo89532o2().expandCommentCount = 0;
                        }
                        LinkedList<FinderCommentInfo> v2 = next.f154492d.mo89540v2();
                        if (v2 != null) {
                            C61926c.m72675T(v2, new C61018b0(uVar));
                        }
                    }
                }
            }
            FinderCommentDrawerPresenter.C55726a aVar = this.f173939d.f158623o;
            if (aVar != null) {
                aVar.mo77345a(this.f173940e.f154492d.mo89531n2(), this.f173940e.f154492d.field_localCommentId, false);
            }
            C65426w0 w0Var2 = this.f173940e.f154492d;
            if (w0Var2.field_actionInfo.f186500h == 0 && (e = C65834e.f189316a.mo89871e(w0Var2.field_feedId)) != null) {
                C55033u uVar2 = this.f173940e;
                if (uVar2.f154492d.mo89534q2() > 0 && uVar2.f154492d.mo89534q2() <= e.getCommentCount()) {
                    e.setCommentCount(e.getCommentCount() - uVar2.f154492d.mo89534q2());
                    C58784w3.f168295a.mo83966t1(e);
                }
            }
            if (this.f173940e.f154492d.mo89531n2() == 0) {
                C58784w3 w3Var = C58784w3.f168295a;
                FinderItem finderItem = this.f173939d.f158620i;
                if (finderItem != null) {
                    LinkedList<FinderCommentInfo> commentList = finderItem.getCommentList();
                    FinderItem finderItem2 = this.f173939d.f158620i;
                    if (finderItem2 != null) {
                        w3Var.mo83969u1(commentList, finderItem2.getId(), 0, this.f173940e.f154492d.mo89530m2());
                        FinderItem finderItem3 = this.f173939d.f158620i;
                        if (finderItem3 == null) {
                            C87412m.m108603p("feedObj");
                            throw null;
                        } else if (finderItem3.getCommentCount() > 0) {
                            FinderItem finderItem4 = this.f173939d.f158620i;
                            if (finderItem4 != null) {
                                finderItem4.setCommentCount(finderItem4.getCommentCount() - 1);
                            } else {
                                C87412m.m108603p("feedObj");
                                throw null;
                            }
                        }
                    } else {
                        C87412m.m108603p("feedObj");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("feedObj");
                    throw null;
                }
            }
            C61212e eVar = (C61212e) C86312j.m106911c(C61212e.class);
            C13604l[] lVarArr = new C13604l[10];
            lVarArr[0] = new C13604l("comment_id", C61926c.m72691p(this.f173940e.getItemId()));
            lVarArr[1] = new C13604l("feed_id", C61926c.m72691p(this.f173940e.f154492d.field_feedId));
            lVarArr[2] = new C13604l("session_buffer", "");
            C13442s8.C13443a aVar2 = C13442s8.f38060Q0;
            C13442s8 f = aVar2.mo12873f(this.f173941f);
            lVarArr[3] = new C13604l("behaviour_session_id", f != null ? f.f38099o : null);
            C13442s8 f2 = aVar2.mo12873f(this.f173941f);
            lVarArr[4] = new C13604l("finder_context_id", f2 != null ? f2.f38098n : null);
            C13442s8 f3 = aVar2.mo12873f(this.f173941f);
            lVarArr[5] = new C13604l("finder_tab_context_id", f3 != null ? f3.f38100p : null);
            C13442s8 f4 = aVar2.mo12873f(this.f173941f);
            lVarArr[6] = new C13604l("extra_info", f4 != null ? f4.f38107v : null);
            C13442s8 f5 = aVar2.mo12873f(this.f173941f);
            lVarArr[7] = new C13604l("enter_source_info", f5 != null ? f5.f38109x : null);
            C13442s8 f6 = aVar2.mo12873f(this.f173941f);
            lVarArr[8] = new C13604l("comment_scene", f6 != null ? Integer.valueOf(f6.f38096i) : null);
            lVarArr[9] = new C13604l("comment_username", this.f173940e.f154492d.getUsername());
            eVar.mo86153W7("feed_comment_del_click", (Object) null, C90364q0.m113147f(lVarArr), 24617);
            C76912y0.makeText(this.f173941f, (int) C0966R.string.d6e, 0).show();
            return C13598b0.f38549a;
        }
    }

    public C61073z(FinderCommentDrawerPresenter finderCommentDrawerPresenter, C55033u uVar, Context context) {
        this.f173928d = finderCommentDrawerPresenter;
        this.f173929e = uVar;
        this.f173930f = context;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C13598b0 b0Var;
        Dialog dialog = this.f173928d.f158613Q;
        T t = null;
        if (dialog != null) {
            dialog.show();
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            FinderCommentDrawerPresenter finderCommentDrawerPresenter = this.f173928d;
            Context context = this.f173930f;
            finderCommentDrawerPresenter.f158613Q = C76879j.m92723Q(context, context.getString(C0966R.string.a3h), context.getString(C0966R.string.a4d), true, false, C61074a.f173931d);
        }
        C61077d dVar = new C61077d(this.f173928d, this.f173929e, this.f173930f);
        C61075b bVar = new C61075b(this.f173930f, this.f173929e, this.f173928d, dVar, new C61076c(this.f173928d, this.f173930f));
        C65426w0 w0Var = this.f173929e.f154492d;
        int i2 = w0Var.field_state;
        boolean z = true;
        if (((i2 == 1 || i2 == -1) ? false : true) || w0Var.field_localCommentId == 0) {
            bVar.invoke();
            return;
        }
        C65430c cVar = C65430c.f188287c;
        cVar.getClass();
        C65222f<C65428a> fVar = cVar.f188288a;
        C65428a aVar = new C65428a(w0Var);
        fVar.getClass();
        C61926c.m72668M(new C65230i(fVar, aVar));
        C65222f<C65428a> fVar2 = cVar.f188288a;
        C65428a aVar2 = new C65428a(w0Var);
        fVar2.getClass();
        Iterator<T> it = fVar2.f187750f.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (C87412m.m108589b(((C65220d) ((C65232k) next).f187766a).mo11854d(), aVar2.mo11854d())) {
                t = next;
                break;
            }
        }
        if (((C65232k) t) != null) {
            Log.m105924i("Finder.FinderActionManager", "removeWhenNotDoingNetScene " + w0Var + " is running");
            z = false;
        } else {
            Log.m105924i("Finder.FinderActionManager", "removeWhenNotDoingNetScene " + w0Var);
            ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Ex0().mo89496qq(w0Var.field_localCommentId);
        }
        if (!z) {
            Dialog dialog2 = this.f173928d.f158613Q;
            if (dialog2 != null) {
                dialog2.dismiss();
            }
            C76912y0.makeText(this.f173930f, (int) C0966R.string.ejv, 0).show();
            return;
        }
        dVar.invoke();
    }
}
