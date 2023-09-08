package com.tencent.p014mm.plugin.finder.feed;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C55033u;
import cm1.C55034v;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FinderCommentChangeEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.feed.model.C55772k;
import com.tencent.p014mm.plugin.finder.life.SupportLifecycle;
import com.tencent.p014mm.plugin.finder.presenter.contract.CommentDrawerContract;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.view.C56646q;
import com.tencent.p014mm.plugin.finder.view.C56647r;
import com.tencent.p014mm.plugin.finder.view.C56648s;
import com.tencent.p014mm.plugin.finder.view.FinderAdFeedbackWindow;
import com.tencent.p014mm.plugin.finder.view.FinderCollapsibleTextView;
import com.tencent.p014mm.plugin.finder.view.FinderCommentAdVideoView;
import com.tencent.p014mm.plugin.finder.view.FinderCommentDrawer;
import com.tencent.p014mm.plugin.finder.view.FinderCommentEditText;
import com.tencent.p014mm.plugin.finder.view.FinderCommentFooter;
import com.tencent.p014mm.plugin.finder.view.emoji.FinderEmojiPickView;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.protocal.protobuf.FinderCommentInfo;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.TouchableLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import dp1.C58353a0;
import dp1.C58368h1;
import dp1.C58403t;
import dp1.C58417y0;
import eb0.C31543z5;
import er1.C58784w3;
import er1.C7878t0;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8478d0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8808v4;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import je1.C46547x1;
import je1.C60795a2;
import jp3.C9486a;
import jp3.C9487b;
import jq3.C60898l;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import kf1.C61022d0;
import kf1.C61025f0;
import kf1.C61036k0;
import kf1.C61038l0;
import kf1.C61040m0;
import kf1.C61042n0;
import kf1.C61044o0;
import kf1.C61065t0;
import kf1.C61067u0;
import kf1.C61073z;
import kf1.C9693e0;
import nj3.C76879j;
import nr3.C89059e;
import o40.C61926c;
import org.json.JSONObject;
import p629ny.C76979h;
import pe3.C89349b;
import q31.C118148a;
import qo3.C77407n;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C36907w;
import sx3.C64197v;
import sx3.C90364q0;
import te3.C49946j51;
import u60.C14121l;
import u60.C65233m;
import uo3.C78253a;
import up1.C37521f;
import up1.C65426w0;
import uq1.C65428a;
import uq1.C65429b;
import uq1.C65430c;
import ur1.C65468g;
import vp1.C65834e;
import vp1.C65838f;
import wp1.C66164a;
import xr1.C66416a;
import z04.C112551y;
import zc1.C66785b;
import zp3.C23555k;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter */
public class FinderCommentDrawerPresenter implements CommentDrawerContract.NPresenter, C9487b<C9486a>, FinderCommentFooter.C56552a, C60898l.C9502b<C60905o>, C60898l.C9503c<C60905o> {

    /* renamed from: A */
    public boolean f158598A;

    /* renamed from: B */
    public volatile boolean f158599B = true;

    /* renamed from: C */
    public C65233m f158600C;

    /* renamed from: D */
    public boolean f158601D;

    /* renamed from: E */
    public boolean f158602E;

    /* renamed from: F */
    public boolean f158603F;

    /* renamed from: G */
    public boolean f158604G;

    /* renamed from: H */
    public FinderCommentDrawer f158605H;

    /* renamed from: I */
    public boolean f158606I;

    /* renamed from: J */
    public boolean f158607J;

    /* renamed from: K */
    public C65426w0 f158608K;

    /* renamed from: L */
    public final HashSet<FinderCommentFooter.C56552a> f158609L = new HashSet<>();

    /* renamed from: M */
    public FinderCommentDrawerPresenter$commentErrorListener$1 f158610M;

    /* renamed from: N */
    public FinderAdFeedbackWindow f158611N;

    /* renamed from: P */
    public final IListener<FinderCommentChangeEvent> f158612P;

    /* renamed from: Q */
    public Dialog f158613Q;

    /* renamed from: R */
    public final C55727b f158614R;

    /* renamed from: d */
    public final Context f158615d;

    /* renamed from: e */
    public int f158616e = 58;

    /* renamed from: f */
    public FinderCommentAdVideoView f158617f;

    /* renamed from: g */
    public final C55772k f158618g = new C55772k();

    /* renamed from: h */
    public final CopyOnWriteArraySet<C9486a> f158619h = new CopyOnWriteArraySet<>();

    /* renamed from: i */
    public FinderItem f158620i;

    /* renamed from: j */
    public int f158621j = 2;

    /* renamed from: n */
    public C65468g f158622n;

    /* renamed from: o */
    public C55726a f158623o;

    /* renamed from: p */
    public CommentDrawerContract.CloseDrawerCallback f158624p;

    /* renamed from: q */
    public long f158625q;

    /* renamed from: r */
    public volatile C89349b f158626r;

    /* renamed from: s */
    public boolean f158627s;

    /* renamed from: t */
    public boolean f158628t = true;

    /* renamed from: u */
    public boolean f158629u = true;

    /* renamed from: v */
    public boolean f158630v;

    /* renamed from: w */
    public boolean f158631w = true;

    /* renamed from: x */
    public long f158632x;

    /* renamed from: y */
    public boolean f158633y;

    /* renamed from: z */
    public long f158634z = 1000;

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter$j */
    public static final class C2501j extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C2501j f13024d = new C2501j();

        public C2501j() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter$a */
    public final class C55726a {

        /* renamed from: a */
        public final RecyclerView f158635a;

        /* renamed from: b */
        public final /* synthetic */ FinderCommentDrawerPresenter f158636b;

        public C55726a(FinderCommentDrawerPresenter finderCommentDrawerPresenter, RecyclerView recyclerView) {
            C87412m.m108594g(recyclerView, "recyclerView");
            this.f158636b = finderCommentDrawerPresenter;
            this.f158635a = recyclerView;
        }

        /* renamed from: a */
        public final void mo77345a(long j, long j2, boolean z) {
            RecyclerView.C16613e adapter;
            if (j != 0) {
                int g = this.f158636b.f158618g.mo77387g();
                C13604l<Integer, Integer> c = this.f158636b.f158618g.mo77383c(j);
                if (z && ((Number) c.f38555d).intValue() >= 0 && ((Number) c.f38555d).intValue() + ((Number) c.f38556e).intValue() <= g && (adapter = this.f158635a.getAdapter()) != null) {
                    adapter.notifyItemRangeRemoved(((Number) c.f38555d).intValue(), ((Number) c.f38556e).intValue());
                }
            } else {
                C55772k kVar = this.f158636b.f158618g;
                ArrayList<C55033u> arrayList = kVar.f158793d;
                ArrayList arrayList2 = new ArrayList();
                Iterator<C55033u> it = arrayList.iterator();
                while (it.hasNext()) {
                    C55033u next = it.next();
                    if (next.f154492d.field_localCommentId == j2) {
                        arrayList2.add(next);
                    }
                }
                kVar.f158793d.removeAll(arrayList2);
            }
            RecyclerView.C16613e adapter2 = this.f158635a.getAdapter();
            if (adapter2 != null) {
                adapter2.notifyDataSetChanged();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter$b */
    public static final class C55727b extends RecyclerView.C16615g {

        /* renamed from: a */
        public final /* synthetic */ FinderCommentDrawerPresenter f158637a;

        public C55727b(FinderCommentDrawerPresenter finderCommentDrawerPresenter) {
            this.f158637a = finderCommentDrawerPresenter;
        }

        /* renamed from: b */
        public void mo2556b() {
            this.f158637a.mo77321N0();
        }

        /* renamed from: c */
        public void mo2557c(int i, int i2) {
            this.f158637a.mo77321N0();
        }

        /* renamed from: d */
        public void mo2558d(int i, int i2, Object obj) {
            mo2557c(i, i2);
            this.f158637a.mo77321N0();
        }

        /* renamed from: e */
        public void mo2559e(int i, int i2) {
            this.f158637a.mo77321N0();
        }

        /* renamed from: g */
        public void mo2560g(int i, int i2) {
            this.f158637a.mo77321N0();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter$c */
    public static final class C55728c extends C87413o implements C32226l<C14121l, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C55033u f158638d;

        /* renamed from: e */
        public final /* synthetic */ FinderCommentDrawerPresenter f158639e;

        /* renamed from: f */
        public final /* synthetic */ boolean f158640f;

        /* renamed from: g */
        public final /* synthetic */ C8478d0 f158641g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55728c(C55033u uVar, FinderCommentDrawerPresenter finderCommentDrawerPresenter, boolean z, C8478d0 d0Var) {
            super(1);
            this.f158638d = uVar;
            this.f158639e = finderCommentDrawerPresenter;
            this.f158640f = z;
            this.f158641g = d0Var;
        }

        public Object invoke(Object obj) {
            String str;
            C14121l lVar = (C14121l) obj;
            C87412m.m108594g(lVar, "task");
            StringBuilder sb = new StringBuilder();
            sb.append("loadMoreLevel2Comments before lastBuffer ");
            if (this.f158638d.f154492d.mo89539u2() == null) {
                str = "null";
            } else {
                C89349b u2 = this.f158638d.f154492d.mo89539u2();
                str = MD5Util.getMD5String(u2 != null ? u2.mo123703f() : null);
            }
            sb.append(str);
            Log.m105924i("Finder.DrawerPresenter", sb.toString());
            if (C66785b.f191882e.mo90681z1()) {
                FinderCommentDrawerPresenter finderCommentDrawerPresenter = this.f158639e;
                boolean z = this.f158640f;
                int i = this.f158641g.f27483d;
                C55033u uVar = this.f158638d;
                FinderItem finderItem = finderCommentDrawerPresenter.f158620i;
                if (finderItem != null) {
                    long id = finderItem.getId();
                    FinderItem finderItem2 = finderCommentDrawerPresenter.f158620i;
                    if (finderItem2 != null) {
                        String objectNonceId = finderItem2.getObjectNonceId();
                        int i2 = finderCommentDrawerPresenter.f158621j;
                        FinderItem finderItem3 = finderCommentDrawerPresenter.f158620i;
                        if (finderItem3 != null) {
                            String userName = finderItem3.getUserName();
                            C65426w0 w0Var = uVar.f154492d;
                            C89349b u25 = w0Var.mo89539u2();
                            C13442s8 f = C13442s8.f38060Q0.mo12873f(finderCommentDrawerPresenter.f158615d);
                            C55033u uVar2 = uVar;
                            C65426w0 w0Var2 = w0Var;
                            boolean z2 = z;
                            C89059e B = new C60795a2(id, objectNonceId, i, i2, userName, u25, w0Var2, 0, z2, f != null ? f.mo12861q3() : null, 1, 128, (C8480h) null).mo9225i().mo123064p(new C61040m0(uVar2, finderCommentDrawerPresenter)).mo123062e(new C61042n0(finderCommentDrawerPresenter, uVar2, z2, lVar));
                            Context context = finderCommentDrawerPresenter.f158615d;
                            C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                            B.mo11397F((MMActivity) context);
                        } else {
                            C87412m.m108603p("feedObj");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("feedObj");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("feedObj");
                    throw null;
                }
            } else {
                FinderCommentDrawerPresenter finderCommentDrawerPresenter2 = this.f158639e;
                boolean z3 = this.f158640f;
                int i3 = this.f158641g.f27483d;
                C55033u uVar3 = this.f158638d;
                FinderItem finderItem4 = finderCommentDrawerPresenter2.f158620i;
                if (finderItem4 != null) {
                    long id4 = finderItem4.getId();
                    FinderItem finderItem5 = finderCommentDrawerPresenter2.f158620i;
                    if (finderItem5 != null) {
                        String objectNonceId2 = finderItem5.getObjectNonceId();
                        int i4 = finderCommentDrawerPresenter2.f158621j;
                        FinderItem finderItem6 = finderCommentDrawerPresenter2.f158620i;
                        if (finderItem6 != null) {
                            String userName2 = finderItem6.getUserName();
                            C65426w0 w0Var3 = uVar3.f154492d;
                            C89349b u26 = w0Var3.mo89539u2();
                            C13442s8 f2 = C13442s8.f38060Q0.mo12873f(finderCommentDrawerPresenter2.f158615d);
                            C55033u uVar4 = uVar3;
                            C89059e B2 = new C46547x1(id4, objectNonceId2, i3, i4, userName2, false, u26, w0Var3, 0, (String) null, z3, false, (String) null, f2 != null ? f2.mo12861q3() : null, 1, (C49946j51) null, false, 105248, (C8480h) null).mo9225i().mo123064p(new C61036k0(uVar4, finderCommentDrawerPresenter2)).mo123062e(new C61038l0(finderCommentDrawerPresenter2, uVar4, z3, lVar));
                            Context context2 = finderCommentDrawerPresenter2.f158615d;
                            C87412m.m108592e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                            B2.mo11397F((MMActivity) context2);
                        } else {
                            C87412m.m108603p("feedObj");
                            throw null;
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
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter$d */
    public static final class C55729d extends C23555k.C23558c {

        /* renamed from: a */
        public final HashSet<String> f158642a = new HashSet<>();

        /* renamed from: b */
        public final /* synthetic */ FinderCommentDrawerPresenter f158643b;

        /* renamed from: c */
        public final /* synthetic */ FinderItem f158644c;

        /* renamed from: d */
        public final /* synthetic */ FinderCommentDrawer f158645d;

        public C55729d(FinderCommentDrawerPresenter finderCommentDrawerPresenter, FinderItem finderItem, FinderCommentDrawer finderCommentDrawer) {
            this.f158643b = finderCommentDrawerPresenter;
            this.f158644c = finderItem;
            this.f158645d = finderCommentDrawer;
        }

        /* renamed from: d */
        public boolean mo777d() {
            return false;
        }

        /* JADX WARNING: Removed duplicated region for block: B:64:0x01a3  */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo778e(android.view.View r25, java.util.List<? extends androidx.recyclerview.widget.RecyclerView.C16631z> r26) {
            /*
                r24 = this;
                r0 = r24
                java.lang.Class<dp1.y0> r1 = dp1.C58417y0.class
                java.lang.String r2 = "parent"
                r3 = r25
                gy3.C87412m.m108594g(r3, r2)
                java.lang.String r2 = "exposedHolders"
                r3 = r26
                gy3.C87412m.m108594g(r3, r2)
                java.util.HashSet r2 = new java.util.HashSet
                r2.<init>()
                rs1.s8$a r4 = rs1.C13442s8.f38060Q0
                com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter r5 = r0.f158643b
                android.content.Context r5 = r5.f158615d
                rs1.s8 r4 = r4.mo12873f(r5)
                com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter r5 = r0.f158643b
                com.tencent.mm.plugin.finder.storage.FinderItem r6 = r0.f158644c
                com.tencent.mm.plugin.finder.view.FinderCommentDrawer r7 = r0.f158645d
                java.util.Iterator r3 = r26.iterator()
            L_0x002b:
                boolean r8 = r3.hasNext()
                if (r8 == 0) goto L_0x01f8
                java.lang.Object r8 = r3.next()
                androidx.recyclerview.widget.RecyclerView$z r8 = (androidx.recyclerview.widget.RecyclerView.C16631z) r8
                boolean r9 = r8 instanceof jq3.C60905o
                if (r9 == 0) goto L_0x01dc
                jq3.o r8 = (jq3.C60905o) r8
                java.lang.Object r9 = r8.f173503E
                boolean r10 = r9 instanceof cm1.C55033u
                if (r10 == 0) goto L_0x0046
                cm1.u r9 = (cm1.C55033u) r9
                goto L_0x0047
            L_0x0046:
                r9 = 0
            L_0x0047:
                if (r9 == 0) goto L_0x01dc
                long r12 = r9.getItemId()
                java.lang.String r10 = java.lang.String.valueOf(r12)
                r2.add(r10)
                java.util.HashSet<java.lang.String> r12 = r0.f158642a
                boolean r10 = r12.contains(r10)
                if (r10 != 0) goto L_0x01dc
                up1.w0 r10 = r9.f154492d
                com.tencent.mm.protocal.protobuf.FinderCommentInfo r10 = r10.mo89532o2()
                te3.vh0 r10 = r10.advertisement_info
                java.lang.String r12 = ""
                if (r10 == 0) goto L_0x006c
                java.lang.String r10 = r10.f185889g
                if (r10 != 0) goto L_0x006d
            L_0x006c:
                r10 = r12
            L_0x006d:
                di3.d r13 = di3.C86312j.m106911c(r1)
                dp1.y0 r13 = (dp1.C58417y0) r13
                long r14 = r5.f158625q
                if (r4 == 0) goto L_0x007a
                java.lang.String r11 = r4.f38099o
                goto L_0x007b
            L_0x007a:
                r11 = 0
            L_0x007b:
                if (r4 == 0) goto L_0x0082
                r26 = r3
                java.lang.String r3 = r4.f38098n
                goto L_0x0085
            L_0x0082:
                r26 = r3
                r3 = 0
            L_0x0085:
                if (r4 == 0) goto L_0x008c
                r16 = r2
                java.lang.String r2 = r4.f38100p
                goto L_0x008f
            L_0x008c:
                r16 = r2
                r2 = 0
            L_0x008f:
                if (r4 == 0) goto L_0x0096
                int r0 = r4.f38096i
                r17 = r4
                goto L_0x0099
            L_0x0096:
                r17 = r4
                r0 = 0
            L_0x0099:
                com.tencent.mm.protocal.protobuf.FinderObject r4 = r6.getFeedObject()
                r18 = r5
                long r4 = r4.f164794id
                r19 = r6
                int r6 = r7.getReason()
                r20 = r7
                int r7 = r8.mo17363j()
                r13.getClass()
                r21 = r8
                com.tencent.mm.autogen.mmdata.rpt.CommentExposeStruct r8 = new com.tencent.mm.autogen.mmdata.rpt.CommentExposeStruct
                r8.<init>()
                r22 = r1
                if (r11 != 0) goto L_0x00bc
                r11 = r12
            L_0x00bc:
                java.lang.String r1 = "SessionId"
                r23 = r12
                r12 = 1
                java.lang.String r1 = r8.mo86045b(r1, r11, r12)
                r8.f154928d = r1
                if (r3 != 0) goto L_0x00cb
                r3 = r23
            L_0x00cb:
                java.lang.String r1 = "ContextId"
                java.lang.String r1 = r8.mo86045b(r1, r3, r12)
                r8.f154929e = r1
                if (r2 != 0) goto L_0x00d7
                r2 = r23
            L_0x00d7:
                java.lang.String r1 = "ClickTabContextId"
                java.lang.String r1 = r8.mo86045b(r1, r2, r12)
                r8.f154930f = r1
                long r0 = (long) r0
                r8.f154931g = r0
                java.lang.String r0 = o40.C61926c.m72691p(r4)
                java.lang.String r1 = "feedid"
                java.lang.String r0 = r8.mo86045b(r1, r0, r12)
                r8.f154932h = r0
                int r0 = r13.qy0(r6)
                long r0 = (long) r0
                r8.f154935k = r0
                java.lang.String r0 = java.lang.String.valueOf(r14)
                java.lang.String r1 = "enterSessionID"
                java.lang.String r0 = r8.mo86045b(r1, r0, r12)
                r8.f154938n = r0
                up1.w0 r0 = r9.f154492d
                com.tencent.mm.protocal.protobuf.FinderCommentInfo r0 = r0.mo89532o2()
                java.lang.String r0 = r0.report_json
                java.lang.String r1 = ";"
                java.lang.String r2 = ","
                if (r0 == 0) goto L_0x0115
                r3 = 0
                java.lang.String r11 = z04.C112551y.m153814n(r0, r2, r1, r3)
                goto L_0x0116
            L_0x0115:
                r11 = 0
            L_0x0116:
                java.lang.String r0 = "reportJson"
                java.lang.String r0 = r8.mo86045b(r0, r11, r12)
                r8.f154936l = r0
                long r3 = (long) r7
                r5 = 1
                long r3 = r3 - r5
                r5 = 0
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x0129
                r3 = r5
            L_0x0129:
                r8.f154937m = r3
                r0 = 0
                java.lang.String r1 = z04.C112551y.m153814n(r10, r2, r1, r0)
                java.lang.String r0 = "ad_report_data"
                java.lang.String r0 = r8.mo86045b(r0, r1, r12)
                r8.f154939o = r0
                int r0 = r9.mo75c()
                java.lang.String r1 = "subCommentid"
                java.lang.String r2 = "rootCommentid"
                if (r0 != r12) goto L_0x015c
                up1.w0 r0 = r9.f154492d
                long r3 = r0.mo89531n2()
                java.lang.String r0 = o40.C61926c.m72691p(r3)
                java.lang.String r0 = r8.mo86045b(r2, r0, r12)
                r8.f154933i = r0
                r3 = r23
                java.lang.String r0 = r8.mo86045b(r1, r3, r12)
                r8.f154934j = r0
                goto L_0x0181
            L_0x015c:
                r3 = r23
                r4 = 2
                if (r0 != r4) goto L_0x0187
                up1.w0 r0 = r9.f154492d
                te3.ye0 r0 = r0.field_actionInfo
                long r4 = r0.f186500h
                java.lang.String r0 = o40.C61926c.m72691p(r4)
                java.lang.String r0 = r8.mo86045b(r2, r0, r12)
                r8.f154933i = r0
                up1.w0 r0 = r9.f154492d
                long r4 = r0.mo89531n2()
                java.lang.String r0 = o40.C61926c.m72691p(r4)
                java.lang.String r0 = r8.mo86045b(r1, r0, r12)
                r8.f154934j = r0
            L_0x0181:
                r8.mo86054n()
                r13.Ec0(r8)
            L_0x0187:
                java.util.ArrayList<te3.oq2> r0 = r9.f154505t
                if (r0 == 0) goto L_0x0193
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L_0x0192
                goto L_0x0193
            L_0x0192:
                r12 = 0
            L_0x0193:
                if (r12 != 0) goto L_0x01d9
                java.util.ArrayList<te3.oq2> r0 = r9.f154505t
                if (r0 == 0) goto L_0x01d9
                java.util.Iterator r0 = r0.iterator()
            L_0x019d:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x01d9
                java.lang.Object r1 = r0.next()
                te3.oq2 r1 = (te3.C50717oq2) r1
                di3.d r2 = di3.C86312j.m106911c(r22)
                dp1.y0 r2 = (dp1.C58417y0) r2
                bl3.r r4 = bl3.C39818r.f106831a
                r5 = r18
                android.content.Context r6 = r5.f158615d
                bl3.r$a r4 = r4.mo62443b(r6)
                java.lang.Class<rs1.s8> r6 = rs1.C13442s8.class
                androidx.lifecycle.i0 r4 = r4.mo75002a(r6)
                rs1.s8 r4 = (rs1.C13442s8) r4
                te3.hj1 r4 = r4.mo12861q3()
                int r6 = r21.mo17363j()
                te3.wh0 r1 = r1.f139316f
                if (r1 == 0) goto L_0x01d1
                java.lang.String r1 = r1.f144053h
                if (r1 != 0) goto L_0x01d2
            L_0x01d1:
                r1 = r3
            L_0x01d2:
                r7 = 0
                r2.Jy0(r4, r7, r6, r1)
                r18 = r5
                goto L_0x019d
            L_0x01d9:
                r5 = r18
                goto L_0x01e8
            L_0x01dc:
                r22 = r1
                r16 = r2
                r26 = r3
                r17 = r4
                r19 = r6
                r20 = r7
            L_0x01e8:
                r0 = r24
                r3 = r26
                r2 = r16
                r4 = r17
                r6 = r19
                r7 = r20
                r1 = r22
                goto L_0x002b
            L_0x01f8:
                r16 = r2
                java.util.HashSet<java.lang.String> r1 = r0.f158642a
                r1.clear()
                java.util.HashSet<java.lang.String> r1 = r0.f158642a
                r1.addAll(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.FinderCommentDrawerPresenter.C55729d.mo778e(android.view.View, java.util.List):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter$e */
    public static final class C55730e extends RefreshLoadMoreLayout.C57879a {

        /* renamed from: a */
        public final /* synthetic */ FinderCommentDrawerPresenter f158646a;

        /* renamed from: com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter$e$a */
        public static final class C55731a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ FinderCommentDrawerPresenter f158647d;

            public C55731a(FinderCommentDrawerPresenter finderCommentDrawerPresenter) {
                this.f158647d = finderCommentDrawerPresenter;
            }

            public final void run() {
                FinderCommentDrawerPresenter finderCommentDrawerPresenter = this.f158647d;
                C65233m mVar = finderCommentDrawerPresenter.f158600C;
                if (mVar != null) {
                    mVar.mo11856a(new C14121l(new C61025f0(finderCommentDrawerPresenter), (String) null, 2, (C8480h) null));
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter$e$b */
        public static final class C55732b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ FinderCommentDrawerPresenter f158648d;

            public C55732b(FinderCommentDrawerPresenter finderCommentDrawerPresenter) {
                this.f158648d = finderCommentDrawerPresenter;
            }

            public final void run() {
                FinderCommentDrawerPresenter.m63413M0(this.f158648d, false, 0, 2, (Object) null);
            }
        }

        public C55730e(FinderCommentDrawerPresenter finderCommentDrawerPresenter) {
            this.f158646a = finderCommentDrawerPresenter;
        }

        /* renamed from: b */
        public void mo2561b(int i) {
            ((C119157j) C119157j.f356862d).mo183875f(new C55731a(this.f158646a));
        }

        /* renamed from: c */
        public void mo2562c(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            C65468g gVar;
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            FinderCommentDrawerPresenter finderCommentDrawerPresenter = this.f158646a;
            if (!finderCommentDrawerPresenter.f158628t && (gVar = finderCommentDrawerPresenter.f158622n) != null) {
                RefreshLoadMoreLayout.m66896C(gVar.mo89591p(), (RefreshLoadMoreLayout.C7080c) null, 1, (Object) null);
            }
        }

        /* renamed from: d */
        public void mo3680d(int i) {
            ((C119157j) C119157j.f356862d).mo183875f(new C55732b(this.f158646a));
        }

        /* renamed from: e */
        public void mo3681e(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            FinderCommentDrawerPresenter.m63415t(this.f158646a);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter$f */
    public static final class C55733f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderCommentDrawerPresenter f158649d;

        /* renamed from: e */
        public final /* synthetic */ C65468g f158650e;

        public C55733f(FinderCommentDrawerPresenter finderCommentDrawerPresenter, C65468g gVar) {
            this.f158649d = finderCommentDrawerPresenter;
            this.f158650e = gVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$onAttach$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f158649d.mo77319L0(this.f158650e.mo89586k().getScene(), this.f158650e.mo89586k().getMentionListWhenReply(), (String) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$onAttach$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter$g */
    public static final class C55734g implements C118148a {

        /* renamed from: a */
        public final /* synthetic */ long f158651a;

        /* renamed from: b */
        public final /* synthetic */ FinderCommentDrawerPresenter f158652b;

        public C55734g(long j, FinderCommentDrawerPresenter finderCommentDrawerPresenter) {
            this.f158651a = j;
            this.f158652b = finderCommentDrawerPresenter;
        }

        /* renamed from: a */
        public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
            return false;
        }

        /* renamed from: b */
        public final Map<String, Object> mo37b(String str) {
            C13604l[] lVarArr = new C13604l[2];
            int i = 0;
            lVarArr[0] = new C13604l("comment_id", C61926c.m72691p(this.f158651a));
            FinderCommentEditText n0 = this.f158652b.mo77336n0();
            if ((n0 != null ? n0.getTag() : null) != null) {
                i = 1;
            }
            lVarArr[1] = new C13604l("comment_action_type", Integer.valueOf(i));
            return C90364q0.m113147f(lVarArr);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter$h */
    public static final class C55735h implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderCommentDrawer f158653d;

        /* renamed from: e */
        public final /* synthetic */ int f158654e;

        /* renamed from: f */
        public final /* synthetic */ FinderCommentDrawerPresenter f158655f;

        public C55735h(FinderCommentDrawer finderCommentDrawer, int i, FinderCommentDrawerPresenter finderCommentDrawerPresenter) {
            this.f158653d = finderCommentDrawer;
            this.f158654e = i;
            this.f158655f = finderCommentDrawerPresenter;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
            r0 = r0.mo89591p().getRecyclerView();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r12 = this;
                com.tencent.mm.plugin.finder.view.FinderCommentDrawer r0 = r12.f158653d
                int r0 = r0.getReason()
                r1 = 4
                if (r0 == r1) goto L_0x0091
                com.tencent.mm.plugin.finder.view.FinderCommentDrawer r0 = r12.f158653d
                int r0 = r0.getReason()
                r1 = 7
                if (r0 == r1) goto L_0x0091
                int r0 = r12.f158654e
                if (r0 <= 0) goto L_0x0091
                com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter r1 = r12.f158655f
                com.tencent.mm.plugin.finder.feed.model.k r1 = r1.f158618g
                int r1 = r1.mo77387g()
                if (r0 >= r1) goto L_0x0091
                com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter r0 = r12.f158655f
                ur1.g r0 = r0.f158622n
                if (r0 == 0) goto L_0x0035
                com.tencent.mm.view.RefreshLoadMoreLayout r0 = r0.mo89591p()
                androidx.recyclerview.widget.RecyclerView r0 = r0.getRecyclerView()
                if (r0 == 0) goto L_0x0035
                androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
                goto L_0x0036
            L_0x0035:
                r0 = 0
            L_0x0036:
                java.lang.String r1 = "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager"
                gy3.C87412m.m108592e(r0, r1)
                androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
                int r1 = r12.f158654e
                k20.a r10 = new k20.a
                r10.<init>()
                java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
                r11 = 0
                java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
                r10.mo10233c(r2)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r10.mo10233c(r1)
                java.lang.Object[] r3 = r10.mo10232b()
                java.lang.String r4 = "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$onAttach$8"
                java.lang.String r5 = "run"
                java.lang.String r6 = "()V"
                java.lang.String r7 = "Undefined"
                java.lang.String r8 = "scrollToPositionWithOffset"
                java.lang.String r9 = "(II)V"
                r2 = r0
                j20.C117292a.m165358d(r2, r3, r4, r5, r6, r7, r8, r9)
                java.lang.Object r1 = r10.mo10231a(r11)
                java.lang.Integer r1 = (java.lang.Integer) r1
                int r1 = r1.intValue()
                r2 = 1
                java.lang.Object r2 = r10.mo10231a(r2)
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                r0.mo16973V(r1, r2)
                java.lang.String r3 = "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$onAttach$8"
                java.lang.String r4 = "run"
                java.lang.String r5 = "()V"
                java.lang.String r6 = "Undefined"
                java.lang.String r7 = "scrollToPositionWithOffset"
                java.lang.String r8 = "(II)V"
                r2 = r0
                j20.C117292a.m165359e(r2, r3, r4, r5, r6, r7, r8)
            L_0x0091:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.FinderCommentDrawerPresenter.C55735h.run():void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter$i */
    public static final class C55736i extends C87413o implements C32226l<C55033u, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderCommentDrawerPresenter f158656d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55736i(FinderCommentDrawerPresenter finderCommentDrawerPresenter) {
            super(1);
            this.f158656d = finderCommentDrawerPresenter;
        }

        public Object invoke(Object obj) {
            C55033u uVar = (C55033u) obj;
            C87412m.m108594g(uVar, "commentItem");
            FinderCommentDrawerPresenter finderCommentDrawerPresenter = this.f158656d;
            finderCommentDrawerPresenter.getClass();
            Context context = finderCommentDrawerPresenter.f158615d;
            if (context != null) {
                C76879j.m92743n(context, C0966R.string.ejt, 0, new C61073z(finderCommentDrawerPresenter, uVar, context), (DialogInterface.OnClickListener) null);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter$k */
    public static final class C55737k extends C87413o implements C32226l<Long, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderCommentDrawerPresenter f158657d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55737k(FinderCommentDrawerPresenter finderCommentDrawerPresenter) {
            super(1);
            this.f158657d = finderCommentDrawerPresenter;
        }

        public Object invoke(Object obj) {
            long longValue = ((Number) obj).longValue();
            FinderCommentDrawerPresenter finderCommentDrawerPresenter = this.f158657d;
            finderCommentDrawerPresenter.f158618g.mo77383c(longValue);
            C55726a aVar = finderCommentDrawerPresenter.f158623o;
            if (aVar != null) {
                aVar.mo77345a(longValue, 0, false);
            }
            return C13598b0.f38549a;
        }
    }

    public FinderCommentDrawerPresenter(Context context) {
        C87412m.m108594g(context, "context");
        this.f158615d = context;
        C40008f fVar = C40008f.f107254d;
        this.f158610M = new FinderCommentDrawerPresenter$commentErrorListener$1(this, fVar);
        this.f158612P = new FinderCommentDrawerPresenter$commentChangeEventListener$1(this, fVar);
        this.f158614R = new C55727b(this);
    }

    /* renamed from: G */
    public static final void m63412G(FinderCommentDrawerPresenter finderCommentDrawerPresenter, List list, C55033u uVar, boolean z) {
        int i;
        C65468g gVar;
        RecyclerView recyclerView;
        RecyclerView.C16613e adapter;
        int i2;
        C55772k kVar = finderCommentDrawerPresenter.f158618g;
        kVar.getClass();
        C87412m.m108594g(list, "itemList");
        C87412m.m108594g(uVar, "rootComment");
        List<C55033u> d = kVar.mo77384d(list);
        int f = kVar.mo77386f(uVar.f154492d.mo89531n2(), z);
        kVar.f158793d.addAll(f, d);
        Integer valueOf = Integer.valueOf(f);
        Integer valueOf2 = Integer.valueOf(((ArrayList) d).size());
        int intValue = valueOf.intValue();
        int intValue2 = valueOf2.intValue();
        Log.m105924i("Finder.DrawerPresenter", "insertLevel2CommentsAndNotify, positionInsert:" + intValue + ", itemCount:" + intValue2 + ", level2Comments size:" + list.size() + ", down:" + z + ", rootCommentId:" + uVar.getItemId());
        if (intValue2 >= 0 && intValue >= 0 && intValue < finderCommentDrawerPresenter.f158618g.mo77387g() && (i = intValue + intValue2) <= finderCommentDrawerPresenter.f158618g.mo77387g() && (gVar = finderCommentDrawerPresenter.f158622n) != null && (recyclerView = gVar.mo89591p().getRecyclerView()) != null && (adapter = recyclerView.getAdapter()) != null) {
            if (intValue2 > 0) {
                adapter.notifyItemRangeInserted(intValue, intValue2);
            }
            if (z && (i2 = intValue - 1) >= 0) {
                adapter.notifyItemChanged(i2, 1);
                C65468g gVar2 = finderCommentDrawerPresenter.f158622n;
                if (gVar2 != null) {
                    gVar2.mo89591p().mo55513p(C9693e0.f30099d);
                }
            } else if (!z && i < finderCommentDrawerPresenter.f158618g.mo77387g()) {
                adapter.notifyItemChanged(i, 1);
            }
        }
    }

    /* renamed from: M0 */
    public static void m63413M0(FinderCommentDrawerPresenter finderCommentDrawerPresenter, boolean z, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                z = true;
            }
            if ((i2 & 2) != 0) {
                i = 0;
            }
            finderCommentDrawerPresenter.getClass();
            if (((C8808v4) C86312j.m106911c(C8808v4.class)).mo9635e()) {
                Log.m105924i("Finder.DrawerPresenter", "refreshData " + z + " return for teen mode");
                return;
            }
            C65233m mVar = finderCommentDrawerPresenter.f158600C;
            if (mVar != null) {
                mVar.mo11856a(new C14121l(new C61067u0(z, finderCommentDrawerPresenter, i), (String) null, 2, (C8480h) null));
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refreshData");
    }

    /* renamed from: N */
    public static final void m63414N(FinderCommentDrawerPresenter finderCommentDrawerPresenter, List list, List list2) {
        List list3 = list2;
        finderCommentDrawerPresenter.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            int i = -1;
            if (!it.hasNext()) {
                break;
            }
            FinderCommentInfo finderCommentInfo = ((C65426w0) it.next()).field_actionInfo.f186501i;
            if (finderCommentInfo != null) {
                Iterator it4 = arrayList2.iterator();
                int i2 = 0;
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    if (((FinderCommentInfo) it4.next()).commentId == finderCommentInfo.commentId) {
                        i = i2;
                        break;
                    }
                    i2++;
                }
                if (i < 0 && finderCommentInfo.commentId != 0) {
                    arrayList2.add(finderCommentInfo);
                }
            }
        }
        Iterator it5 = arrayList2.iterator();
        while (it5.hasNext()) {
            FinderCommentInfo finderCommentInfo2 = (FinderCommentInfo) it5.next();
            Iterator it6 = list2.iterator();
            int i3 = 0;
            while (true) {
                if (!it6.hasNext()) {
                    i3 = -1;
                    break;
                }
                if (((C55033u) it6.next()).f154492d.mo89531n2() == finderCommentInfo2.commentId) {
                    break;
                }
                i3++;
            }
            if (i3 >= 0) {
                list3.remove(i3);
                Log.m105924i("Finder.DrawerPresenter", "mergeLocalLevel2Comments, remove level1ExistIndex:" + i3 + ", id:" + finderCommentInfo2.commentId);
            }
            C66164a aVar = C66164a.f190162a;
            FinderItem finderItem = finderCommentDrawerPresenter.f158620i;
            if (finderItem != null) {
                arrayList.add(aVar.mo90221b(finderCommentInfo2, finderItem.getId()));
                Iterator it7 = list.iterator();
                while (it7.hasNext()) {
                    C65426w0 w0Var = (C65426w0) it7.next();
                    if (w0Var.field_actionInfo.f186500h == finderCommentInfo2.commentId) {
                        C55033u uVar = new C55033u(w0Var);
                        ((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(MMApplicationContext.getContext(), w0Var.getContent());
                        arrayList.add(uVar);
                    }
                }
            } else {
                C87412m.m108603p("feedObj");
                throw null;
            }
        }
        if (arrayList.size() > 0) {
            Log.m105924i("Finder.DrawerPresenter", "mergeLocalLevel2Comments, total local size: " + arrayList.size() + ", level1 size:" + arrayList2.size());
        }
        list3.addAll(arrayList);
    }

    /* renamed from: t */
    public static final void m63415t(FinderCommentDrawerPresenter finderCommentDrawerPresenter) {
        if (!finderCommentDrawerPresenter.f158627s) {
            C65468g gVar = finderCommentDrawerPresenter.f158622n;
            if (gVar != null) {
                gVar.mo89584i(false);
            }
            C65468g gVar2 = finderCommentDrawerPresenter.f158622n;
            if (gVar2 != null) {
                gVar2.mo89585j().mo82529d(true);
            }
        }
    }

    /* renamed from: x */
    public static final void m63416x(FinderCommentDrawerPresenter finderCommentDrawerPresenter, List list) {
        boolean z;
        FinderCommentDrawerPresenter finderCommentDrawerPresenter2 = finderCommentDrawerPresenter;
        if (finderCommentDrawerPresenter2.f158632x != 0) {
            ArrayList arrayList = new ArrayList();
            int i = -1;
            int i2 = 0;
            for (Object next : list) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    C55033u uVar = (C55033u) next;
                    LinkedList<FinderCommentInfo> v2 = uVar.f154492d.mo89540v2();
                    if (v2 != null) {
                        z = false;
                        for (FinderCommentInfo finderCommentInfo : v2) {
                            if (finderCommentInfo.commentId == finderCommentDrawerPresenter2.f158632x) {
                                z = true;
                            }
                        }
                    } else {
                        z = false;
                    }
                    if (z) {
                        LinkedList<FinderCommentInfo> v25 = uVar.f154492d.mo89540v2();
                        C87412m.m108593f(v25, "root.commentObj.levelTwoComment");
                        ArrayList arrayList2 = new ArrayList();
                        for (FinderCommentInfo finderCommentInfo2 : v25) {
                            C66164a aVar = C66164a.f190162a;
                            C87412m.m108593f(finderCommentInfo2, "commentInfo");
                            FinderItem finderItem = finderCommentDrawerPresenter2.f158620i;
                            if (finderItem != null) {
                                C55033u c = aVar.mo90222c(finderCommentInfo2, finderItem.getId(), uVar.getItemId());
                                boolean z2 = finderCommentDrawerPresenter2.f158633y && c.getItemId() == finderCommentDrawerPresenter2.f158632x;
                                c.f154499n = z2;
                                c.f154500o = finderCommentDrawerPresenter2.f158634z;
                                if (z2) {
                                    finderCommentDrawerPresenter2.f158633y = false;
                                }
                                arrayList2.add(c);
                            } else {
                                C87412m.m108603p("feedObj");
                                throw null;
                            }
                        }
                        arrayList.addAll(arrayList2);
                        i = i2;
                    }
                    i2 = i3;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            if (i >= 0 && arrayList.size() > 0) {
                list.addAll(i + 1, arrayList);
                finderCommentDrawerPresenter2.f158603F = true;
            }
        }
    }

    /* renamed from: A0 */
    public void mo77317A0(C55033u uVar, boolean z) {
        Class cls = C58417y0.class;
        C87412m.m108594g(uVar, "rootComment");
        this.f158603F = true;
        C8478d0 d0Var = new C8478d0();
        C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f158615d);
        boolean z2 = false;
        d0Var.f27483d = f != null ? f.f38096i : 0;
        if (z) {
            LinkedList<FinderCommentInfo> v2 = uVar.f154492d.mo89540v2();
            if (!Util.isNullOrNil((List) v2)) {
                Iterator<C55033u> it = this.f158618g.f158793d.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().f154492d.mo89531n2() == v2.getFirst().commentId) {
                            break;
                        }
                    } else {
                        C65233m mVar = this.f158600C;
                        if (mVar != null) {
                            mVar.mo11856a(new C14121l(new C61022d0(v2, this, uVar), (String) null, 2, (C8480h) null));
                        }
                        z2 = true;
                    }
                }
            }
            if (z2) {
                ((C58417y0) C86312j.m106911c(cls)).ny0(uVar, 1, d0Var.f27483d);
                return;
            }
            ((C58417y0) C86312j.m106911c(cls)).ny0(uVar, 2, d0Var.f27483d);
        } else {
            ((C58417y0) C86312j.m106911c(cls)).ny0(uVar, 3, d0Var.f27483d);
        }
        C65233m mVar2 = this.f158600C;
        if (mVar2 != null) {
            mVar2.mo11856a(new C14121l(new C55728c(uVar, this, z, d0Var), (String) null, 2, (C8480h) null));
        }
    }

    /* renamed from: J0 */
    public final String mo77318J0() {
        FinderEmojiPickView quickPickEmoji;
        C65468g gVar = this.f158622n;
        String str = "0";
        if (!(gVar == null || (quickPickEmoji = gVar.mo89586k().getQuickPickEmoji()) == null)) {
            if (quickPickEmoji.getPickEmojiStr().length() > 0) {
                str = quickPickEmoji.getPickEmojiStr();
            }
            quickPickEmoji.setPickEmojiStr("");
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("CandidateEmoji", str);
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "kvJson.toString()");
        return C112551y.m153814n(jSONObject2, ",", ";", false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.Class<rs1.s8>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v5, resolved type: java.lang.Class<rs1.s8>} */
    /* JADX WARNING: type inference failed for: r0v9, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r0v15 */
    /* JADX WARNING: type inference failed for: r0v27 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02b3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x03f5  */
    /* JADX WARNING: Removed duplicated region for block: B:234:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: L0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo77319L0(int r33, java.util.List<com.tencent.p014mm.plugin.finder.view.C41598v7> r34, java.lang.String r35) {
        /*
            r32 = this;
            r1 = r32
            r0 = r33
            r15 = r34
            java.lang.Class<dp1.y0> r24 = dp1.C58417y0.class
            java.lang.Class<rs1.s8> r14 = rs1.C13442s8.class
            ot1.a r2 = ot1.C11767a.f34453a
            java.lang.String r3 = "comment"
            boolean r2 = r2.mo11659a(r3)
            if (r2 == 0) goto L_0x0015
            return
        L_0x0015:
            java.lang.String r2 = "Finder.DrawerPresenter"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "onReply mentionList = "
            r3.append(r4)
            r3.append(r15)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            rs1.s8$a r2 = rs1.C13442s8.f38060Q0
            android.content.Context r3 = r1.f158615d
            rs1.s8 r2 = r2.mo12873f(r3)
            r10 = 0
            if (r2 == 0) goto L_0x003d
            te3.hj1 r2 = r2.mo12861q3()
            r19 = r2
            goto L_0x003f
        L_0x003d:
            r19 = r10
        L_0x003f:
            r9 = 1
            r8 = 0
            if (r35 == 0) goto L_0x004c
            int r2 = r35.length()
            if (r2 != 0) goto L_0x004a
            goto L_0x004c
        L_0x004a:
            r2 = 0
            goto L_0x004d
        L_0x004c:
            r2 = 1
        L_0x004d:
            if (r2 == 0) goto L_0x005c
            com.tencent.mm.plugin.finder.view.FinderCommentEditText r2 = r32.mo77336n0()
            if (r2 == 0) goto L_0x005a
            android.text.Editable r2 = r2.getText()
            goto L_0x005e
        L_0x005a:
            r2 = r10
            goto L_0x005e
        L_0x005c:
            r2 = r35
        L_0x005e:
            if (r2 == 0) goto L_0x0069
            int r3 = r2.length()
            if (r3 != 0) goto L_0x0067
            goto L_0x0069
        L_0x0067:
            r3 = 0
            goto L_0x006a
        L_0x0069:
            r3 = 1
        L_0x006a:
            r6 = 0
            if (r3 != 0) goto L_0x03c0
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r1.f158620i
            if (r3 == 0) goto L_0x03b9
            java.lang.CharSequence r3 = z04.C112550d0.m153799i0(r2)
            if (r3 == 0) goto L_0x0081
            int r3 = r3.length()
            if (r3 != 0) goto L_0x007f
            goto L_0x0081
        L_0x007f:
            r3 = 0
            goto L_0x0082
        L_0x0081:
            r3 = 1
        L_0x0082:
            if (r3 == 0) goto L_0x0085
            return
        L_0x0085:
            er1.w3 r3 = er1.C58784w3.f168295a
            java.lang.String r2 = r2.toString()
            r3.getClass()
            java.lang.String r3 = "origin"
            gy3.C87412m.m108594g(r2, r3)
            er1.j4 r3 = er1.C58739j4.f168176a
            java.lang.String r16 = r3.mo83716k(r2)
            com.tencent.mm.plugin.finder.view.FinderCommentEditText r2 = r32.mo77336n0()
            if (r2 == 0) goto L_0x00c5
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r1.f158620i
            if (r3 == 0) goto L_0x00bf
            long r3 = r3.getId()
            java.util.Map<java.lang.Long, java.util.LinkedList<java.lang.String>> r2 = r2.f198148E
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.Object r2 = r2.get(r3)
            java.util.LinkedList r2 = (java.util.LinkedList) r2
            if (r2 != 0) goto L_0x00bc
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
        L_0x00bc:
            r22 = r2
            goto L_0x00c7
        L_0x00bf:
            java.lang.String r0 = "feedObj"
            gy3.C87412m.m108603p(r0)
            throw r10
        L_0x00c5:
            r22 = r10
        L_0x00c7:
            if (r22 == 0) goto L_0x00eb
            java.util.Iterator r2 = r22.iterator()
        L_0x00cd:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00e9
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            er1.w3 r4 = er1.C58784w3.f168295a
            r4.getClass()
            java.lang.String r4 = "origin"
            gy3.C87412m.m108594g(r3, r4)
            er1.j4 r4 = er1.C58739j4.f168176a
            r4.mo83716k(r3)
            goto L_0x00cd
        L_0x00e9:
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x00eb:
            com.tencent.mm.plugin.finder.view.FinderCommentEditText r2 = r32.mo77336n0()
            if (r2 == 0) goto L_0x00f6
            java.lang.Object r2 = r2.getTag()
            goto L_0x00f7
        L_0x00f6:
            r2 = r10
        L_0x00f7:
            if (r2 != 0) goto L_0x027b
            uq1.c r2 = uq1.C65430c.f188287c
            long r3 = eb0.C31543z5.m39453c()
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r1.f158620i
            if (r5 == 0) goto L_0x0274
            java.lang.String r5 = r5.getUserName()
            com.tencent.mm.plugin.finder.storage.FinderItem r11 = r1.f158620i
            if (r11 == 0) goto L_0x026d
            long r20 = r11.getId()
            com.tencent.mm.plugin.finder.storage.FinderItem r11 = r1.f158620i
            if (r11 == 0) goto L_0x0266
            java.lang.String r12 = r11.getObjectNonceId()
            com.tencent.mm.plugin.finder.storage.FinderItem r11 = r1.f158620i
            if (r11 == 0) goto L_0x025f
            java.lang.String r13 = r11.getUserName()
            er1.w3 r11 = er1.C58784w3.f168295a
            r25 = r14
            java.lang.String r14 = r11.mo83956q0(r0)
            java.lang.String r26 = r11.mo83955p0(r0)
            com.tencent.mm.plugin.finder.view.FinderCommentDrawer r11 = r1.f158605H
            if (r11 == 0) goto L_0x0136
            int r11 = r11.getReason()
            r27 = r11
            goto L_0x0138
        L_0x0136:
            r27 = 0
        L_0x0138:
            java.lang.String r23 = r32.mo77318J0()
            r2.getClass()
            java.lang.String r11 = "feedUsername"
            gy3.C87412m.m108594g(r5, r11)
            java.lang.String r11 = "objectNonceId"
            gy3.C87412m.m108594g(r12, r11)
            java.lang.String r11 = "replyUsername"
            gy3.C87412m.m108594g(r13, r11)
            java.lang.String r11 = "username"
            gy3.C87412m.m108594g(r14, r11)
            java.lang.String r11 = "mentionList"
            gy3.C87412m.m108594g(r15, r11)
            r17 = 0
            r18 = 0
            java.lang.String r11 = ""
            r28 = 0
            r29 = r13
            r13 = r28
            r30 = r12
            r12 = r28
            r6 = r20
            r28 = 0
            r8 = r30
            r9 = r16
            r10 = r29
            r31 = r25
            r15 = r26
            r16 = r33
            r20 = r27
            r21 = r34
            up1.w0 r15 = r2.mo89550a(r3, r5, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.String r2 = "Finder.DrawerPresenter"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "onReply localCommentId:"
            r3.append(r4)
            long r4 = r15.field_localCommentId
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            if (r35 == 0) goto L_0x01a4
            int r2 = r35.length()
            if (r2 != 0) goto L_0x01a2
            goto L_0x01a4
        L_0x01a2:
            r9 = 0
            goto L_0x01a5
        L_0x01a4:
            r9 = 1
        L_0x01a5:
            if (r9 != 0) goto L_0x01ae
            r2 = 6
            te3.ye0 r3 = r15.field_actionInfo
            r3.f186504o = r2
            r1.f158608K = r15
        L_0x01ae:
            android.content.Context r2 = r1.f158615d
            boolean r3 = r2 instanceof com.tencent.p014mm.p136ui.MMFragmentActivity
            if (r3 == 0) goto L_0x01f7
            bl3.r r3 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r2 = (androidx.appcompat.app.AppCompatActivity) r2
            bl3.r$a r2 = r3.mo62444c(r2)
            r14 = r31
            androidx.lifecycle.i0 r2 = r2.mo75002a(r14)
            rs1.s8 r2 = (rs1.C13442s8) r2
            te3.hj1 r3 = r2.mo12861q3()
            di3.d r2 = di3.C86312j.m106911c(r24)
            java.lang.String r4 = "getService(FinderReportLogic::class.java)"
            gy3.C87412m.m108593f(r2, r4)
            dp1.y0 r2 = (dp1.C58417y0) r2
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r1.f158620i
            if (r4 == 0) goto L_0x01f0
            long r4 = r4.getId()
            r6 = 2
            r7 = 0
            r8 = 0
            java.lang.String r9 = ""
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 896(0x380, float:1.256E-42)
            r16 = 0
            r10 = r33
            r0 = r15
            r15 = r16
            dp1.C58417y0.Ux0(r2, r3, r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x01f8
        L_0x01f0:
            java.lang.String r0 = "feedObj"
            gy3.C87412m.m108603p(r0)
            r15 = 0
            throw r15
        L_0x01f7:
            r0 = r15
        L_0x01f8:
            r15 = 0
            ur1.g r2 = r1.f158622n
            if (r2 == 0) goto L_0x024a
            com.tencent.mm.view.RefreshLoadMoreLayout r2 = r2.mo89591p()
            androidx.recyclerview.widget.RecyclerView r2 = r2.getRecyclerView()
            if (r2 == 0) goto L_0x024a
            k20.a r11 = new k20.a
            r11.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r28)
            r11.mo10233c(r3)
            java.lang.Object[] r4 = r11.mo10232b()
            java.lang.String r5 = "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter"
            java.lang.String r6 = "onReply"
            java.lang.String r7 = "(ILjava/util/List;Ljava/lang/String;)V"
            java.lang.String r8 = "Undefined"
            java.lang.String r9 = "scrollToPosition"
            java.lang.String r10 = "(I)V"
            r3 = r2
            j20.C117292a.m165358d(r3, r4, r5, r6, r7, r8, r9, r10)
            r13 = 0
            java.lang.Object r3 = r11.mo10231a(r13)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.mo17115r1(r3)
            java.lang.String r4 = "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter"
            java.lang.String r5 = "onReply"
            java.lang.String r6 = "(ILjava/util/List;Ljava/lang/String;)V"
            java.lang.String r7 = "Undefined"
            java.lang.String r8 = "scrollToPosition"
            java.lang.String r9 = "(I)V"
            r3 = r2
            j20.C117292a.m165359e(r3, r4, r5, r6, r7, r8, r9)
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x024b
        L_0x024a:
            r13 = 0
        L_0x024b:
            ur1.g r2 = r1.f158622n
            if (r2 == 0) goto L_0x025a
            com.tencent.mm.view.RefreshLoadMoreLayout r2 = r2.mo89591p()
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter$j r3 = com.tencent.p014mm.plugin.finder.feed.FinderCommentDrawerPresenter.C2501j.f13024d
            r2.mo55513p(r3)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x025a:
            r10 = r0
            r0 = r15
            r2 = 1
            goto L_0x037a
        L_0x025f:
            r15 = r10
            java.lang.String r0 = "feedObj"
            gy3.C87412m.m108603p(r0)
            throw r15
        L_0x0266:
            r15 = r10
            java.lang.String r0 = "feedObj"
            gy3.C87412m.m108603p(r0)
            throw r15
        L_0x026d:
            r15 = r10
            java.lang.String r0 = "feedObj"
            gy3.C87412m.m108603p(r0)
            throw r15
        L_0x0274:
            r15 = r10
            java.lang.String r0 = "feedObj"
            gy3.C87412m.m108603p(r0)
            throw r15
        L_0x027b:
            r15 = r10
            r13 = 0
            com.tencent.mm.plugin.finder.view.FinderCommentEditText r2 = r32.mo77336n0()
            if (r2 == 0) goto L_0x0288
            java.lang.Object r10 = r2.getTag()
            goto L_0x0289
        L_0x0288:
            r10 = r15
        L_0x0289:
            java.lang.String r2 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.storage.LocalFinderCommentObject"
            gy3.C87412m.m108592e(r10, r2)
            r12 = r10
            up1.w0 r12 = (up1.C65426w0) r12
            te3.ye0 r2 = r12.field_actionInfo
            long r2 = r2.f186500h
            r10 = 0
            int r4 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r4 != 0) goto L_0x02a0
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r2 = r12.mo89532o2()
            goto L_0x02ae
        L_0x02a0:
            cm1.u r2 = r1.mo77344v(r2)
            if (r2 == 0) goto L_0x02b0
            up1.w0 r2 = r2.f154492d
            if (r2 == 0) goto L_0x02b0
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r2 = r2.mo89532o2()
        L_0x02ae:
            r9 = r2
            goto L_0x02b1
        L_0x02b0:
            r9 = r15
        L_0x02b1:
            if (r9 != 0) goto L_0x02b4
            return
        L_0x02b4:
            int r2 = r9.expandCommentCount
            r8 = 1
            int r2 = r2 + r8
            r9.expandCommentCount = r2
            uq1.c r2 = uq1.C65430c.f188287c
            long r3 = eb0.C31543z5.m39453c()
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r1.f158620i
            if (r5 == 0) goto L_0x03b2
            java.lang.String r5 = r5.getUserName()
            com.tencent.mm.plugin.finder.storage.FinderItem r6 = r1.f158620i
            if (r6 == 0) goto L_0x03ab
            long r6 = r6.getId()
            com.tencent.mm.plugin.finder.storage.FinderItem r8 = r1.f158620i
            if (r8 == 0) goto L_0x03a4
            java.lang.String r8 = r8.getObjectNonceId()
            java.lang.String r17 = r12.getUsername()
            java.lang.String r18 = r12.getNickname()
            long r20 = r12.mo89531n2()
            java.lang.Long r20 = java.lang.Long.valueOf(r20)
            java.lang.String r21 = r12.getContent()
            er1.w3 r10 = er1.C58784w3.f168295a
            java.lang.String r25 = r10.mo83956q0(r0)
            java.lang.String r26 = r10.mo83955p0(r0)
            boolean r27 = r12.mo89522A2()
            com.tencent.mm.plugin.finder.view.FinderCommentDrawer r10 = r1.f158605H
            if (r10 == 0) goto L_0x0305
            int r10 = r10.getReason()
            r28 = r10
            goto L_0x0307
        L_0x0305:
            r28 = 0
        L_0x0307:
            java.lang.String r23 = r32.mo77318J0()
            r11 = 1
            r29 = r9
            r9 = r16
            r10 = r17
            r0 = 1
            r11 = r18
            r30 = r12
            r12 = r20
            r13 = r21
            r0 = r14
            r14 = r25
            r15 = r26
            r16 = r33
            r17 = r27
            r18 = r29
            r20 = r28
            r21 = r34
            up1.w0 r16 = r2.mo89550a(r3, r5, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            android.content.Context r2 = r1.f158615d
            boolean r3 = r2 instanceof com.tencent.p014mm.p136ui.MMFragmentActivity
            if (r3 == 0) goto L_0x0374
            bl3.r r3 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r2 = (androidx.appcompat.app.AppCompatActivity) r2
            bl3.r$a r2 = r3.mo62444c(r2)
            androidx.lifecycle.i0 r0 = r2.mo75002a(r0)
            rs1.s8 r0 = (rs1.C13442s8) r0
            te3.hj1 r3 = r0.mo12861q3()
            di3.d r0 = di3.C86312j.m106911c(r24)
            java.lang.String r2 = "getService(FinderReportLogic::class.java)"
            gy3.C87412m.m108593f(r0, r2)
            r2 = r0
            dp1.y0 r2 = (dp1.C58417y0) r2
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r1.f158620i
            if (r0 == 0) goto L_0x036d
            long r4 = r0.getId()
            r6 = 2
            r7 = 0
            r8 = 0
            java.lang.String r9 = r30.getUsername()
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 896(0x380, float:1.256E-42)
            r15 = 0
            r10 = r33
            dp1.C58417y0.Ux0(r2, r3, r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x0374
        L_0x036d:
            java.lang.String r0 = "feedObj"
            gy3.C87412m.m108603p(r0)
            r0 = 0
            throw r0
        L_0x0374:
            r0 = 0
            r2 = 1
            r1.f158603F = r2
            r10 = r16
        L_0x037a:
            r1.f158604G = r2
            ur1.g r3 = r1.f158622n
            if (r3 == 0) goto L_0x0398
            com.tencent.mm.plugin.finder.view.FinderCommentFooter r3 = r3.mo89586k()
            int r4 = r3.f162060L
            if (r4 != r2) goto L_0x038c
            r3.mo79776j(r2)
            goto L_0x0394
        L_0x038c:
            r2 = 2
            if (r4 != r2) goto L_0x0394
            r2 = 0
            r3.mo79779m(r2)
            goto L_0x0395
        L_0x0394:
            r2 = 0
        L_0x0395:
            rx3.b0 r3 = rx3.C13598b0.f38549a
            goto L_0x0399
        L_0x0398:
            r2 = 0
        L_0x0399:
            com.tencent.mm.plugin.finder.view.FinderCommentEditText r3 = r32.mo77336n0()
            if (r3 != 0) goto L_0x03a0
            goto L_0x03c2
        L_0x03a0:
            r3.setText(r0)
            goto L_0x03c2
        L_0x03a4:
            r0 = r15
            java.lang.String r2 = "feedObj"
            gy3.C87412m.m108603p(r2)
            throw r0
        L_0x03ab:
            r0 = r15
            java.lang.String r2 = "feedObj"
            gy3.C87412m.m108603p(r2)
            throw r0
        L_0x03b2:
            r0 = r15
            java.lang.String r2 = "feedObj"
            gy3.C87412m.m108603p(r2)
            throw r0
        L_0x03b9:
            r0 = r10
            java.lang.String r2 = "feedObj"
            gy3.C87412m.m108603p(r2)
            throw r0
        L_0x03c0:
            r0 = r10
            r2 = 0
        L_0x03c2:
            com.tencent.mm.autogen.events.FinderCommentReportEvent r3 = new com.tencent.mm.autogen.events.FinderCommentReportEvent
            r3.<init>()
            com.tencent.mm.autogen.events.FinderCommentReportEvent$a r4 = r3.f154760d
            r5 = 1
            r4.f154761a = r5
            r5 = 0
            r4.f154762b = r5
            r3.publish()
            boolean r3 = r1.f158630v
            if (r3 == 0) goto L_0x0569
            ur1.g r3 = r1.f158622n
            if (r3 == 0) goto L_0x03e4
            com.tencent.mm.plugin.finder.view.FinderCommentDrawer r3 = r3.mo89585j()
            r3.mo79715l()
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x03e4:
            com.tencent.mm.plugin.finder.view.FinderCommentDrawer r3 = r1.f158605H
            if (r3 == 0) goto L_0x03f1
            int r3 = r3.getReason()
            r4 = 1
            if (r3 != r4) goto L_0x03f2
            r9 = 1
            goto L_0x03f3
        L_0x03f1:
            r4 = 1
        L_0x03f2:
            r9 = 0
        L_0x03f3:
            if (r9 == 0) goto L_0x05ff
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r1.f158620i
            if (r3 == 0) goto L_0x0563
            long r7 = r3.getId()
            vp1.f r3 = vp1.C65838f.f189333a
            monitor-enter(r3)
            java.util.Map<vp1.f$a, java.util.List<up1.w0>> r9 = vp1.C65838f.f189334b     // Catch:{ all -> 0x0560 }
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap     // Catch:{ all -> 0x0560 }
            r11.<init>()     // Catch:{ all -> 0x0560 }
            java.util.LinkedHashMap r9 = (java.util.LinkedHashMap) r9     // Catch:{ all -> 0x0560 }
            java.util.Set r9 = r9.entrySet()     // Catch:{ all -> 0x0560 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0560 }
        L_0x0411:
            boolean r12 = r9.hasNext()     // Catch:{ all -> 0x0560 }
            if (r12 == 0) goto L_0x043a
            java.lang.Object r12 = r9.next()     // Catch:{ all -> 0x0560 }
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12     // Catch:{ all -> 0x0560 }
            java.lang.Object r13 = r12.getKey()     // Catch:{ all -> 0x0560 }
            vp1.f$a r13 = (vp1.C65838f.C37799a) r13     // Catch:{ all -> 0x0560 }
            long r13 = r13.f100116a     // Catch:{ all -> 0x0560 }
            int r15 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r15 == 0) goto L_0x042b
            r13 = 1
            goto L_0x042c
        L_0x042b:
            r13 = 0
        L_0x042c:
            if (r13 == 0) goto L_0x0411
            java.lang.Object r13 = r12.getKey()     // Catch:{ all -> 0x0560 }
            java.lang.Object r12 = r12.getValue()     // Catch:{ all -> 0x0560 }
            r11.put(r13, r12)     // Catch:{ all -> 0x0560 }
            goto L_0x0411
        L_0x043a:
            java.util.Map<vp1.f$a, java.util.List<up1.w0>> r9 = vp1.C65838f.f189334b     // Catch:{ all -> 0x0560 }
            r12 = r9
            java.util.LinkedHashMap r12 = (java.util.LinkedHashMap) r12     // Catch:{ all -> 0x0560 }
            r12.clear()     // Catch:{ all -> 0x0560 }
            r9.putAll(r11)     // Catch:{ all -> 0x0560 }
            java.util.Map<vp1.f$a, vp1.f$b> r9 = vp1.C65838f.f189335c     // Catch:{ all -> 0x0560 }
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap     // Catch:{ all -> 0x0560 }
            r11.<init>()     // Catch:{ all -> 0x0560 }
            java.util.LinkedHashMap r9 = (java.util.LinkedHashMap) r9     // Catch:{ all -> 0x0560 }
            java.util.Set r9 = r9.entrySet()     // Catch:{ all -> 0x0560 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0560 }
        L_0x0456:
            boolean r12 = r9.hasNext()     // Catch:{ all -> 0x0560 }
            if (r12 == 0) goto L_0x047f
            java.lang.Object r12 = r9.next()     // Catch:{ all -> 0x0560 }
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12     // Catch:{ all -> 0x0560 }
            java.lang.Object r13 = r12.getKey()     // Catch:{ all -> 0x0560 }
            vp1.f$a r13 = (vp1.C65838f.C37799a) r13     // Catch:{ all -> 0x0560 }
            long r13 = r13.f100116a     // Catch:{ all -> 0x0560 }
            int r15 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r15 == 0) goto L_0x0470
            r13 = 1
            goto L_0x0471
        L_0x0470:
            r13 = 0
        L_0x0471:
            if (r13 == 0) goto L_0x0456
            java.lang.Object r13 = r12.getKey()     // Catch:{ all -> 0x0560 }
            java.lang.Object r12 = r12.getValue()     // Catch:{ all -> 0x0560 }
            r11.put(r13, r12)     // Catch:{ all -> 0x0560 }
            goto L_0x0456
        L_0x047f:
            java.util.Map<vp1.f$a, vp1.f$b> r4 = vp1.C65838f.f189335c     // Catch:{ all -> 0x0560 }
            r7 = r4
            java.util.LinkedHashMap r7 = (java.util.LinkedHashMap) r7     // Catch:{ all -> 0x0560 }
            r7.clear()     // Catch:{ all -> 0x0560 }
            r4.putAll(r11)     // Catch:{ all -> 0x0560 }
            rx3.b0 r4 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0560 }
            monitor-exit(r3)
            if (r10 == 0) goto L_0x05ff
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r3 = new com.tencent.mm.protocal.protobuf.FinderCommentInfo
            r3.<init>()
            java.lang.String r4 = r10.getUsername()
            r3.username = r4
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r4 = r10.mo89532o2()
            long r7 = r4.displayid
            r3.displayid = r7
            long r7 = r10.mo89531n2()
            r3.commentId = r7
            java.lang.String r4 = r10.getContent()
            r3.content = r4
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r4 = r10.mo89532o2()
            long r7 = r4.createtime
            r3.createtime = r7
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r4 = r10.mo89532o2()
            int r4 = r4.deleteFlag
            r3.deleteFlag = r4
            long r7 = r10.mo89541w2()
            r3.replyCommentId = r7
            java.lang.String r4 = r10.getNickname()
            r3.nickname = r4
            java.lang.String r4 = r10.mo89537t2()
            r3.headUrl = r4
            java.lang.String r4 = r10.mo89542x2()
            r3.replyNickname = r4
            int r4 = r10.getLikeCount()
            r3.likeCount = r4
            int r4 = r10.getLikeFlag()
            r3.likeFlag = r4
            int r4 = r10.mo89534q2()
            r3.expandCommentCount = r4
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r4 = r10.mo89532o2()
            int r4 = r4.continueFlag
            r3.continueFlag = r4
            int r4 = r10.mo89533p2()
            r3.displayFlag = r4
            int r4 = r10.mo89529l2()
            r3.blacklist_flag = r4
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r4 = r10.mo89532o2()
            java.lang.String r4 = r4.reply_content
            if (r4 != 0) goto L_0x0506
            java.lang.String r4 = ""
        L_0x0506:
            r3.reply_content = r4
            java.lang.String r4 = r10.mo89543y2()
            r3.reply_username = r4
            java.lang.String r4 = r10.mo89530m2()
            r3.client_id = r4
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r4 = r10.mo89532o2()
            int r4 = r4.extFlag
            r3.extFlag = r4
            r3.commentId = r5
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r1.f158620i
            if (r4 == 0) goto L_0x055a
            java.util.LinkedList r4 = r4.getCommentList()
            r4.add(r2, r3)
            com.tencent.mm.autogen.events.FinderExposeInfoChangeEvent r2 = new com.tencent.mm.autogen.events.FinderExposeInfoChangeEvent
            r2.<init>()
            com.tencent.mm.autogen.events.FinderExposeInfoChangeEvent$a r3 = r2.f154769d
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r1.f158620i
            if (r4 == 0) goto L_0x0554
            long r4 = r4.field_id
            r3.f154770a = r4
            te3.ff1 r4 = new te3.ff1
            r4.<init>()
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r1.f158620i
            if (r5 == 0) goto L_0x054e
            java.util.LinkedList r0 = r5.getCommentList()
            r4.f133475d = r0
            r3.f154771b = r4
            r2.publish()
            goto L_0x05ff
        L_0x054e:
            java.lang.String r2 = "feedObj"
            gy3.C87412m.m108603p(r2)
            throw r0
        L_0x0554:
            java.lang.String r2 = "feedObj"
            gy3.C87412m.m108603p(r2)
            throw r0
        L_0x055a:
            java.lang.String r2 = "feedObj"
            gy3.C87412m.m108603p(r2)
            throw r0
        L_0x0560:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0563:
            java.lang.String r2 = "feedObj"
            gy3.C87412m.m108603p(r2)
            throw r0
        L_0x0569:
            ur1.g r0 = r1.f158622n
            if (r0 == 0) goto L_0x05ff
            android.view.View r11 = r0.mo89589n()
            k20.a r12 = new k20.a
            r12.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            r13 = 8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)
            r12.mo10233c(r3)
            java.lang.Object[] r4 = r12.mo10232b()
            java.lang.String r5 = "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder"
            java.lang.String r6 = "hideAllTips"
            java.lang.String r7 = "()V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            r3 = r11
            j20.C117292a.m165358d(r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r3 = r12.mo10231a(r2)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r11.setVisibility(r3)
            java.lang.String r4 = "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder"
            java.lang.String r5 = "hideAllTips"
            java.lang.String r6 = "()V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r3 = r11
            j20.C117292a.m165359e(r3, r4, r5, r6, r7, r8, r9)
            android.view.View r3 = r0.mo89590o()
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r13)
            r4.mo10233c(r5)
            java.lang.Object[] r15 = r4.mo10232b()
            java.lang.String r16 = "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder"
            java.lang.String r17 = "hideAllTips"
            java.lang.String r18 = "()V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            r14 = r3
            j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r2 = r4.mo10231a(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3.setVisibility(r2)
            java.lang.String r15 = "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder"
            java.lang.String r16 = "hideAllTips"
            java.lang.String r17 = "()V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
            android.widget.FrameLayout r0 = r0.mo89588m()
            r0.setVisibility(r13)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x05ff:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.FinderCommentDrawerPresenter.mo77319L0(int, java.util.List, java.lang.String):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: java.lang.Class<l31.e>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: java.lang.Class<ht1.v4>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: java.lang.Class<pl1.s0>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v1, resolved type: pf1.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v2, resolved type: pf1.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v46, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v5, resolved type: pf1.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v3, resolved type: pf1.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x02c0  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x030f  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0316  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0334  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x034f  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x03a8  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x03b8  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x040a A[Catch:{ IllegalStateException -> 0x0412 }] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x04a7  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x04c9  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x04d2  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x04d5  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0546  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0550  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x057f  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x06bf  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x06eb  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x022a  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0238  */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo77320M(com.tencent.p014mm.plugin.finder.view.FinderCommentDrawer r29, ur1.C65468g r30, com.tencent.p014mm.plugin.finder.storage.FinderItem r31, com.tencent.p014mm.plugin.finder.presenter.contract.CommentDrawerContract.CloseDrawerCallback r32, int r33, boolean r34, long r35, up1.C65426w0 r37, boolean r38, boolean r39, long r40, boolean r42, boolean r43, boolean r44, int r45) {
        /*
            r28 = this;
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = r31
            r5 = r33
            r6 = r34
            r7 = r35
            r9 = r37
            r0 = r38
            r10 = r44
            r11 = r45
            java.lang.Class<pl1.s0> r12 = pl1.C11990s0.class
            java.lang.Class<l31.e> r13 = l31.C61212e.class
            java.lang.Class<ht1.t1> r14 = ht1.C60200t1.class
            java.lang.Class<ht1.v4> r15 = ht1.C8808v4.class
            java.lang.String r11 = "drawer"
            gy3.C87412m.m108594g(r2, r11)
            java.lang.String r11 = "builder"
            gy3.C87412m.m108594g(r3, r11)
            java.lang.String r11 = "feedObj"
            gy3.C87412m.m108594g(r4, r11)
            r11 = 0
            r1.f158599B = r11
            r16 = r12
            long r11 = java.lang.System.currentTimeMillis()
            r1.f158625q = r11
            java.lang.String r11 = "Finder.DrawerPresenter"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r9 = "onAttach "
            r12.append(r9)
            long r9 = r31.getId()
            r12.append(r9)
            java.lang.String r9 = ", "
            r12.append(r9)
            r12.append(r5)
            java.lang.String r9 = ", "
            r12.append(r9)
            r12.append(r6)
            java.lang.String r9 = ", "
            r12.append(r9)
            r12.append(r7)
            java.lang.String r9 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r9)
            r1.f158622n = r3
            r1.f158605H = r2
            r1.f158620i = r4
            r1.f158630v = r6
            r1.f158621j = r5
            r9 = r32
            r1.f158624p = r9
            r1.f158632x = r7
            r1.f158631w = r0
            r9 = r39
            r1.f158633y = r9
            r9 = r40
            r1.f158634z = r9
            u60.m r9 = new u60.m
            java.lang.String r10 = "FinderCommentExecutor"
            r9.<init>(r10)
            r1.f158600C = r9
            r9.mo89361d()
            rx3.b0 r9 = rx3.C13598b0.f38549a
            com.tencent.mm.plugin.finder.feed.model.k r9 = r1.f158618g
            android.content.Context r10 = r1.f158615d
            long r11 = r31.getId()
            com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract$NPresenter r6 = r3.f188399d
            int r6 = r6.getCommentScene()
            r9.getClass()
            java.lang.String r5 = "context"
            gy3.C87412m.m108594g(r10, r5)
            r9.f158790a = r11
            r9.f158791b = r7
            java.util.ArrayList<cm1.u> r5 = r9.f158793d
            int r5 = r5.size()
            if (r5 <= 0) goto L_0x00b9
            java.util.ArrayList<cm1.u> r5 = r9.f158793d
            r5.clear()
        L_0x00b9:
            cm1.v r5 = new cm1.v
            r5.<init>(r4)
            r17 = r13
            er1.w3 r13 = er1.C58784w3.f168295a
            r13.getClass()
            te3.db1 r2 = r31.getLocation()
            java.lang.String r2 = r2.f182663f
            te3.db1 r4 = r31.getLocation()
            java.lang.String r4 = r4.f182664g
            java.lang.String r2 = r13.mo83946l0(r2, r4)
            android.text.SpannableString r4 = r31.getDescriptionFullSpan()
            te3.jk0 r13 = r31.getExtReading()
            java.lang.String r13 = r13.f183803e
            java.util.List r18 = r31.getTopicList()
            com.tencent.mm.protocal.protobuf.FinderObject r3 = r31.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r3 = r3.objectDesc
            r19 = r15
            if (r3 == 0) goto L_0x00f0
            te3.ef1 r3 = r3.event
            goto L_0x00f1
        L_0x00f0:
            r3 = 0
        L_0x00f1:
            if (r3 == 0) goto L_0x00f6
            java.lang.String r15 = r3.f132899e
            goto L_0x00f7
        L_0x00f6:
            r15 = 0
        L_0x00f7:
            boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r15)
            r20 = 0
            r39 = r2
            if (r15 != 0) goto L_0x0111
            if (r3 == 0) goto L_0x010b
            long r1 = r3.f132898d
            int r3 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r3 != 0) goto L_0x010b
            r1 = 1
            goto L_0x010c
        L_0x010b:
            r1 = 0
        L_0x010c:
            if (r1 == 0) goto L_0x010f
            goto L_0x0111
        L_0x010f:
            r1 = 0
            goto L_0x0112
        L_0x0111:
            r1 = 1
        L_0x0112:
            bl3.r r2 = bl3.C39818r.f106831a
            bl3.r$a r2 = r2.mo62446e(r14)
            java.lang.Class<pf1.n> r3 = pf1.C62273n.class
            androidx.lifecycle.i0 r2 = r2.mo75002a(r3)
            pf1.n r2 = (pf1.C62273n) r2
            boolean r3 = r10 instanceof androidx.lifecycle.C0125s
            if (r3 == 0) goto L_0x0126
            androidx.lifecycle.s r10 = (androidx.lifecycle.C0125s) r10
        L_0x0126:
            com.tencent.mm.protocal.protobuf.FinderObject r3 = r31.getFeedObject()
            r10 = r14
            long r14 = r3.f164794id
            androidx.lifecycle.z r2 = r2.mo87341g3(r14, r6)
            java.lang.Object r2 = r2.getValue()
            java.util.Set r2 = (java.util.Set) r2
            if (r2 == 0) goto L_0x016a
            java.util.Iterator r2 = r2.iterator()
        L_0x013d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0163
            java.lang.Object r3 = r2.next()
            r14 = r3
            pf1.l r14 = (pf1.C11911l) r14
            long r14 = r14.f34804b
            r41 = r2
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r31.getFeedObject()
            r22 = r3
            long r2 = r2.f164794id
            int r23 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r23 != 0) goto L_0x015c
            r2 = 1
            goto L_0x015d
        L_0x015c:
            r2 = 0
        L_0x015d:
            if (r2 == 0) goto L_0x0160
            goto L_0x0165
        L_0x0160:
            r2 = r41
            goto L_0x013d
        L_0x0163:
            r22 = 0
        L_0x0165:
            r2 = r22
            pf1.l r2 = (pf1.C11911l) r2
            goto L_0x016b
        L_0x016a:
            r2 = 0
        L_0x016b:
            if (r2 != 0) goto L_0x016f
            r2 = 1
            goto L_0x0170
        L_0x016f:
            r2 = 0
        L_0x0170:
            if (r39 == 0) goto L_0x017b
            int r3 = r39.length()
            if (r3 != 0) goto L_0x0179
            goto L_0x017b
        L_0x0179:
            r3 = 0
            goto L_0x017c
        L_0x017b:
            r3 = 1
        L_0x017c:
            if (r3 == 0) goto L_0x01a6
            if (r4 == 0) goto L_0x0189
            int r3 = r4.length()
            if (r3 != 0) goto L_0x0187
            goto L_0x0189
        L_0x0187:
            r3 = 0
            goto L_0x018a
        L_0x0189:
            r3 = 1
        L_0x018a:
            if (r3 == 0) goto L_0x01a6
            if (r13 == 0) goto L_0x0197
            int r3 = r13.length()
            if (r3 != 0) goto L_0x0195
            goto L_0x0197
        L_0x0195:
            r3 = 0
            goto L_0x0198
        L_0x0197:
            r3 = 1
        L_0x0198:
            if (r3 == 0) goto L_0x01a6
            boolean r3 = r18.isEmpty()
            if (r3 == 0) goto L_0x01a6
            if (r1 == 0) goto L_0x01a6
            if (r2 == 0) goto L_0x01a6
            r1 = 1
            goto L_0x01a7
        L_0x01a6:
            r1 = 0
        L_0x01a7:
            r5.f154510y = r1
            r9.f158792c = r5
            java.util.ArrayList<cm1.u> r1 = r9.f158793d
            r1.add(r5)
            if (r0 == 0) goto L_0x021f
            vp1.f r0 = vp1.C65838f.f189333a
            java.util.List r0 = r0.mo89883d(r11, r7)
            if (r0 == 0) goto L_0x0207
            java.util.ArrayList<cm1.u> r1 = r9.f158793d
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = sx3.C36907w.m41090l(r0, r3)
            r2.<init>(r3)
            java.util.Iterator r3 = r0.iterator()
        L_0x01cb:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x01e0
            java.lang.Object r4 = r3.next()
            up1.w0 r4 = (up1.C65426w0) r4
            cm1.u r5 = new cm1.u
            r5.<init>(r4)
            r2.add(r5)
            goto L_0x01cb
        L_0x01e0:
            r1.addAll(r2)
            java.lang.String r1 = "Finder.FinderCommentLoader"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "onAttach hit datacache, commentScene="
            r2.append(r3)
            r2.append(r6)
            r3 = 32
            r2.append(r3)
            int r0 = r0.size()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            r0 = 1
            goto L_0x0208
        L_0x0207:
            r0 = 0
        L_0x0208:
            vp1.f r1 = vp1.C65838f.f189333a
            monitor-enter(r1)
            java.util.Map<vp1.f$a, vp1.f$b> r2 = vp1.C65838f.f189335c     // Catch:{ all -> 0x021c }
            vp1.f$a r3 = new vp1.f$a     // Catch:{ all -> 0x021c }
            r3.<init>(r11, r7)     // Catch:{ all -> 0x021c }
            java.util.LinkedHashMap r2 = (java.util.LinkedHashMap) r2     // Catch:{ all -> 0x021c }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x021c }
            vp1.f$b r2 = (vp1.C65838f.C65839b) r2     // Catch:{ all -> 0x021c }
            monitor-exit(r1)
            goto L_0x0221
        L_0x021c:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x021f:
            r0 = 0
            r2 = 0
        L_0x0221:
            r1 = -1
            if (r2 == 0) goto L_0x0227
            int r3 = r2.f189336a
            goto L_0x0228
        L_0x0227:
            r3 = -1
        L_0x0228:
            if (r3 < 0) goto L_0x0238
            rx3.l r3 = new rx3.l
            gy3.C87412m.m108591d(r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.<init>(r2, r0)
            r5 = 1
            goto L_0x0278
        L_0x0238:
            int r2 = (r7 > r20 ? 1 : (r7 == r20 ? 0 : -1))
            if (r2 != 0) goto L_0x023e
            r2 = 0
            goto L_0x023f
        L_0x023e:
            r2 = 1
        L_0x023f:
            java.lang.String r3 = "Finder.FinderCommentLoader"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "miss cache, upContinue:"
            r4.append(r5)
            r4.append(r2)
            java.lang.String r5 = ", downContinue:"
            r4.append(r5)
            r5 = 1
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            rx3.l r3 = new rx3.l
            vp1.f$b r4 = new vp1.f$b
            r23 = 0
            r24 = 0
            r27 = 0
            r26 = 1
            r22 = r4
            r25 = r2
            r22.<init>(r23, r24, r25, r26, r27)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.<init>(r4, r0)
        L_0x0278:
            A r0 = r3.f38555d
            vp1.f$b r0 = (vp1.C65838f.C65839b) r0
            B r2 = r3.f38556e
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            int r3 = r0.f189336a
            pe3.b r4 = r0.f189337b
            boolean r6 = r0.f189338c
            boolean r9 = r0.f189339d
            boolean r0 = r0.f189340e
            r11 = 1
            r5 = r28
            r5.f158626r = r4
            r5.mo77323T0(r6)
            r5.mo77322S0(r9)
            r4 = r43
            r5.f158629u = r4
            r5.f158601D = r11
            r4 = r42
            r5.f158602E = r4
            r5.f158603F = r0
            r4 = r44
            r5.f158606I = r4
            r6 = 0
            r5.f158604G = r6
            ur1.g r0 = r5.f158622n
            if (r0 == 0) goto L_0x02df
            com.tencent.mm.plugin.finder.view.FinderCommentDrawer r0 = r0.mo89585j()
            androidx.recyclerview.widget.RecyclerView r0 = r0.getRecyclerView()
            if (r0 == 0) goto L_0x02df
            int r6 = android.os.Build.VERSION.SDK_INT
            r9 = 26
            if (r6 < r9) goto L_0x02dd
            xn1.e r6 = new xn1.e
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r12 = "FinderCommentDrawer#"
            r9.append(r12)
            int r12 = r28.getCommentScene()
            r9.append(r12)
            java.lang.String r9 = r9.toString()
            r6.<init>(r9)
            r0.mo17043c(r6)
        L_0x02dd:
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x02df:
            android.content.Context r0 = r5.f158615d
            java.lang.String r6 = "context"
            gy3.C87412m.m108594g(r0, r6)
            bl3.r r6 = bl3.C39818r.f106831a
            bl3.r$a r0 = r6.mo62443b(r0)
            java.lang.Class<dp1.j> r6 = dp1.C58375j.class
            androidx.lifecycle.i0 r0 = r0.mo75002a(r6)
            java.lang.String r6 = "UICProvider.of(context).…tAdReportUIC::class.java)"
            gy3.C87412m.m108593f(r0, r6)
            dp1.j r0 = (dp1.C58375j) r0
            int r6 = r29.getReason()
            r0.f167202e = r6
            boolean r0 = r5.f158627s
            if (r0 == 0) goto L_0x0316
            di3.d r0 = di3.C86312j.m106911c(r19)
            ht1.v4 r0 = (ht1.C8808v4) r0
            boolean r0 = r0.mo9635e()
            if (r0 != 0) goto L_0x0316
            r6 = r30
            r6.mo89584i(r11)
            r9 = 0
            goto L_0x0329
        L_0x0316:
            r6 = r30
            r9 = 0
            r6.mo89584i(r9)
            ur1.g r0 = r5.f158622n
            if (r0 == 0) goto L_0x0329
            com.tencent.mm.plugin.finder.view.FinderCommentDrawer r0 = r0.mo89585j()
            r0.mo82529d(r11)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0329:
            com.tencent.mm.plugin.finder.view.FinderCommentFooter r0 = r30.mo89586k()
            r0.setFooterMode(r9)
            int r9 = (r7 > r20 ? 1 : (r7 == r20 ? 0 : -1))
            if (r9 != 0) goto L_0x034f
            ur1.g r0 = r5.f158622n
            if (r0 == 0) goto L_0x03a6
            com.tencent.mm.plugin.finder.view.FinderCommentFooter r0 = r0.mo89586k()
            er1.w3 r1 = er1.C58784w3.f168295a
            int r12 = r5.f158621j
            java.lang.String r1 = r1.mo83955p0(r12)
            java.lang.String r12 = r31.getNickName()
            r13 = 0
            r0.mo79774h(r1, r12, r13)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x03a6
        L_0x034f:
            com.tencent.mm.plugin.finder.feed.model.k r0 = r5.f158618g
            java.util.ArrayList<cm1.u> r0 = r0.f158793d
            java.util.Iterator r0 = r0.iterator()
            r12 = 0
        L_0x0358:
            boolean r13 = r0.hasNext()
            if (r13 == 0) goto L_0x0376
            java.lang.Object r13 = r0.next()
            cm1.u r13 = (cm1.C55033u) r13
            long r13 = r13.getItemId()
            int r15 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r15 != 0) goto L_0x036e
            r13 = 1
            goto L_0x036f
        L_0x036e:
            r13 = 0
        L_0x036f:
            if (r13 == 0) goto L_0x0373
            r1 = r12
            goto L_0x0376
        L_0x0373:
            int r12 = r12 + 1
            goto L_0x0358
        L_0x0376:
            if (r1 < 0) goto L_0x03a6
            com.tencent.mm.plugin.finder.feed.model.k r0 = r5.f158618g
            java.util.ArrayList<cm1.u> r0 = r0.f158793d
            java.lang.Object r0 = r0.get(r1)
            cm1.u r0 = (cm1.C55033u) r0
            r0.f154499n = r11
            ur1.g r1 = r5.f158622n
            if (r1 == 0) goto L_0x03a6
            com.tencent.mm.plugin.finder.view.FinderCommentFooter r1 = r1.mo89586k()
            er1.w3 r12 = er1.C58784w3.f168295a
            int r13 = r5.f158621j
            java.lang.String r12 = r12.mo83955p0(r13)
            android.text.SpannableString r13 = r0.f154495g
            java.lang.String r13 = r13.toString()
            java.lang.String r14 = "refCommentObject.displayNickname.toString()"
            gy3.C87412m.m108593f(r13, r14)
            up1.w0 r0 = r0.f154492d
            r1.mo79744g(r12, r13, r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x03a6:
            if (r4 == 0) goto L_0x03b8
            com.tencent.mm.view.RefreshLoadMoreLayout r0 = r30.mo89591p()
            r1 = 0
            r0.setEnableLoadMore(r1)
            com.tencent.mm.view.RefreshLoadMoreLayout r0 = r30.mo89591p()
            r0.setEnableRefresh(r1)
            goto L_0x03dc
        L_0x03b8:
            com.tencent.mm.view.RefreshLoadMoreLayout r0 = r30.mo89591p()
            di3.d r1 = di3.C86312j.m106911c(r19)
            ht1.v4 r1 = (ht1.C8808v4) r1
            boolean r1 = r1.mo9635e()
            r1 = r1 ^ r11
            r0.setEnableLoadMore(r1)
            com.tencent.mm.view.RefreshLoadMoreLayout r0 = r30.mo89591p()
            di3.d r1 = di3.C86312j.m106911c(r19)
            ht1.v4 r1 = (ht1.C8808v4) r1
            boolean r1 = r1.mo9635e()
            r1 = r1 ^ r11
            r0.setEnableRefresh(r1)
        L_0x03dc:
            com.tencent.mm.view.RefreshLoadMoreLayout r0 = r30.mo89591p()
            androidx.recyclerview.widget.RecyclerView r0 = r0.getRecyclerView()
            r1 = 0
            r0.setLayoutFrozen(r1)
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter$a r0 = new com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter$a
            com.tencent.mm.view.RefreshLoadMoreLayout r1 = r30.mo89591p()
            androidx.recyclerview.widget.RecyclerView r1 = r1.getRecyclerView()
            r0.<init>(r5, r1)
            r5.f158623o = r0
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderCommentChangeEvent> r0 = r5.f158612P
            r0.alive()
            com.tencent.mm.view.RefreshLoadMoreLayout r0 = r30.mo89591p()     // Catch:{ IllegalStateException -> 0x0412 }
            androidx.recyclerview.widget.RecyclerView r0 = r0.getRecyclerView()     // Catch:{ IllegalStateException -> 0x0412 }
            androidx.recyclerview.widget.RecyclerView$e r0 = r0.getAdapter()     // Catch:{ IllegalStateException -> 0x0412 }
            if (r0 == 0) goto L_0x041d
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter$b r1 = r5.f158614R     // Catch:{ IllegalStateException -> 0x0412 }
            r0.registerAdapterDataObserver(r1)     // Catch:{ IllegalStateException -> 0x0412 }
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ IllegalStateException -> 0x0412 }
            goto L_0x041d
        L_0x0412:
            r0 = move-exception
            java.lang.String r1 = "Finder.DrawerPresenter"
            java.lang.String r12 = ""
            r13 = 0
            java.lang.Object[] r14 = new java.lang.Object[r13]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r12, r14)
        L_0x041d:
            com.tencent.mm.view.RefreshLoadMoreLayout r0 = r30.mo89591p()
            androidx.recyclerview.widget.RecyclerView r0 = r0.getRecyclerView()
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter$d r1 = new com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter$d
            r12 = r29
            r13 = r31
            r1.<init>(r5, r13, r12)
            zp3.C23564m.m28137g(r0, r1)
            com.tencent.mm.view.RefreshLoadMoreLayout r0 = r30.mo89591p()
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter$e r1 = new com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter$e
            r1.<init>(r5)
            r0.setActionCallback(r1)
            com.tencent.mm.plugin.finder.view.FinderCommentFooter r0 = r30.mo89586k()
            r0.setModeChangeCallback(r5)
            com.tencent.mm.plugin.finder.view.FinderCommentFooter r0 = r30.mo89586k()
            long r13 = r31.getId()
            com.tencent.mm.plugin.finder.view.FinderCommentEditText r0 = r0.getEditText()
            r0.f198149F = r13
            r28.mo77321N0()
            com.tencent.mm.plugin.finder.view.FinderCommentFooter r0 = r30.mo89586k()
            android.view.View r0 = r0.getReplyBtn()
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter$f r1 = new com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter$f
            r1.<init>(r5, r6)
            r0.setOnClickListener(r1)
            di3.d r0 = di3.C86312j.m106911c(r17)
            l31.e r0 = (l31.C61212e) r0
            com.tencent.mm.plugin.finder.view.FinderCommentFooter r1 = r30.mo89586k()
            android.view.View r1 = r1.getReplyBtn()
            java.lang.String r13 = "finder_comment_reply_btn"
            r0.o30(r1, r13)
            di3.d r0 = di3.C86312j.m106911c(r17)
            l31.e r0 = (l31.C61212e) r0
            com.tencent.mm.plugin.finder.view.FinderCommentFooter r1 = r30.mo89586k()
            android.view.View r1 = r1.getReplyBtn()
            r13 = 24617(0x6029, float:3.4496E-41)
            r14 = 8
            r0.mo86175pO(r1, r14, r13)
            di3.d r0 = di3.C86312j.m106911c(r17)
            l31.e r0 = (l31.C61212e) r0
            com.tencent.mm.plugin.finder.view.FinderCommentFooter r1 = r30.mo89586k()
            android.view.View r1 = r1.getReplyBtn()
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter$g r13 = new com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter$g
            r13.<init>(r7, r5)
            r0.E60(r1, r13)
            r1 = r37
            if (r1 == 0) goto L_0x04c5
            com.tencent.mm.plugin.finder.view.FinderCommentFooter r0 = r30.mo89586k()
            er1.w3 r7 = er1.C58784w3.f168295a
            int r8 = r5.f158621j
            java.lang.String r8 = r7.mo83955p0(r8)
            java.lang.String r13 = r37.getUsername()
            java.lang.String r15 = r37.getNickname()
            r11 = 0
            java.lang.String r7 = r7.mo83898R(r13, r15, r11)
            r0.mo79744g(r8, r7, r1)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x04c5:
            ur1.g r0 = r5.f158622n
            if (r0 == 0) goto L_0x04d2
            com.tencent.mm.plugin.finder.view.FinderCommentFooter r0 = r0.mo89586k()
            android.widget.ImageView r0 = r0.getAvatarView()
            goto L_0x04d3
        L_0x04d2:
            r0 = 0
        L_0x04d3:
            if (r0 == 0) goto L_0x0542
            r0 = 2
            r1 = r33
            if (r1 != r0) goto L_0x04f0
            ur1.g r0 = r5.f158622n
            if (r0 == 0) goto L_0x04e7
            com.tencent.mm.plugin.finder.view.FinderCommentFooter r0 = r0.mo89586k()
            android.widget.ImageView r0 = r0.getAvatarView()
            goto L_0x04e8
        L_0x04e7:
            r0 = 0
        L_0x04e8:
            java.lang.String r1 = eb0.C75592q0.m90789s()
            tl3.C78039a.m94189a(r0, r1)
            goto L_0x0542
        L_0x04f0:
            fe1.d$b r1 = fe1.C58961d.f168673a
            zc1.b r7 = zc1.C66785b.f191882e
            java.lang.String r7 = r7.mo90662O5()
            fe1.q r1 = r1.mo84155b(r7)
            if (r1 == 0) goto L_0x0503
            java.lang.String r1 = r1.getAvatarUrl()
            goto L_0x0505
        L_0x0503:
            java.lang.String r1 = ""
        L_0x0505:
            bl3.r r7 = bl3.C39818r.f106831a
            r8 = r10
            bl3.r$a r10 = r7.mo62446e(r8)
            r11 = r16
            bl3.c r10 = r10.mo62447c(r11)
            pl1.s0 r10 = (pl1.C11990s0) r10
            k60.d r10 = r10.mo11872i2()
            pl1.f r13 = new pl1.f
            r15 = 0
            r13.<init>(r1, r15, r0, r15)
            ur1.g r0 = r5.f158622n
            if (r0 == 0) goto L_0x052b
            com.tencent.mm.plugin.finder.view.FinderCommentFooter r0 = r0.mo89586k()
            android.widget.ImageView r0 = r0.getAvatarView()
            goto L_0x052c
        L_0x052b:
            r0 = 0
        L_0x052c:
            gy3.C87412m.m108591d(r0)
            pl1.e0$a r1 = pl1.C11978e0.C11979a.AVATAR
            bl3.r$a r7 = r7.mo62446e(r8)
            bl3.c r7 = r7.mo62447c(r11)
            pl1.s0 r7 = (pl1.C11990s0) r7
            n60.f r1 = r7.mo11867O2(r1)
            r10.mo85957c(r13, r0, r1)
        L_0x0542:
            ur1.g r0 = r5.f158622n
            if (r0 == 0) goto L_0x054b
            r0.mo89592q()
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x054b:
            r0 = 2131232381(0x7f08067d, float:1.808087E38)
            if (r4 == 0) goto L_0x057f
            android.widget.FrameLayout r1 = r30.mo89587l()
            r2 = 0
            r1.setVisibility(r2)
            com.tencent.mm.view.RefreshLoadMoreLayout r1 = r30.mo89591p()
            r1.setVisibility(r2)
            java.lang.String r1 = "Finder.DrawerPresenter"
            java.lang.String r2 = "CommentInvisibleDebug isOnlyShowDesc drawerFooter.visibility = View.GONE"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            ur1.g r1 = r5.f158622n
            if (r1 == 0) goto L_0x056f
            com.tencent.mm.plugin.finder.view.FinderCommentFooter r1 = r1.mo89586k()
            goto L_0x0570
        L_0x056f:
            r1 = 0
        L_0x0570:
            if (r1 != 0) goto L_0x0573
            goto L_0x0576
        L_0x0573:
            r1.setVisibility(r14)
        L_0x0576:
            com.tencent.mm.plugin.finder.view.FinderCommentDrawer r1 = r30.mo89585j()
            r1.setSquaresBackgroundResource(r0)
            goto L_0x06bb
        L_0x057f:
            r1 = 2131101688(0x7f0607f8, float:1.7815793E38)
            if (r34 != 0) goto L_0x0684
            if (r2 != 0) goto L_0x0598
            r4 = r45
            r7 = 1
            r8 = 0
            r10 = 0
            m63413M0(r5, r10, r4, r7, r8)
            ur1.g r2 = r5.f158622n
            if (r2 == 0) goto L_0x05df
            r2.mo89593r()
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x05df
        L_0x0598:
            r4 = r45
            if (r2 == 0) goto L_0x05b0
            if (r3 != 0) goto L_0x05b0
            if (r9 != 0) goto L_0x05b0
            boolean r2 = r5.f158603F
            if (r2 != 0) goto L_0x05b0
            r2 = 0
            r5.f158626r = r2
            r3 = 1
            r5.mo77322S0(r3)
            r7 = 0
            m63413M0(r5, r7, r4, r3, r2)
            goto L_0x05df
        L_0x05b0:
            ur1.g r2 = r5.f158622n
            if (r2 == 0) goto L_0x05c9
            com.tencent.mm.view.RefreshLoadMoreLayout r2 = r2.mo89591p()
            androidx.recyclerview.widget.RecyclerView r2 = r2.getRecyclerView()
            if (r2 == 0) goto L_0x05c9
            androidx.recyclerview.widget.RecyclerView$e r2 = r2.getAdapter()
            if (r2 == 0) goto L_0x05c9
            r2.notifyDataSetChanged()
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x05c9:
            ur1.g r2 = r5.f158622n
            if (r2 == 0) goto L_0x05df
            com.tencent.mm.view.RefreshLoadMoreLayout r2 = r2.mo89591p()
            androidx.recyclerview.widget.RecyclerView r2 = r2.getRecyclerView()
            if (r2 == 0) goto L_0x05df
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter$h r4 = new com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter$h
            r4.<init>(r12, r3, r5)
            r2.post(r4)
        L_0x05df:
            up1.f r2 = up1.C37521f.f99374d
            r2.getClass()
            pe1.c<java.lang.Integer> r3 = up1.C37521f.f99288T0
            java.lang.Object r3 = r3.mo60266n()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r4 = 1
            if (r3 != r4) goto L_0x05fb
            com.tencent.mm.plugin.finder.view.FinderCommentDrawer r3 = r30.mo89585j()
            r3.setBackgroundColorRes(r1)
            goto L_0x0605
        L_0x05fb:
            com.tencent.mm.plugin.finder.view.FinderCommentDrawer r3 = r30.mo89585j()
            r4 = 2131099922(0x7f060112, float:1.781221E38)
            r3.setBackgroundColorRes(r4)
        L_0x0605:
            r2.getClass()
            pe1.c<java.lang.Integer> r2 = up1.C37521f.f99579z7
            java.lang.Object r2 = r2.mo60266n()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r3 = 1
            if (r2 != r3) goto L_0x0619
            r2 = 1
            goto L_0x061a
        L_0x0619:
            r2 = 0
        L_0x061a:
            if (r2 == 0) goto L_0x062c
            com.tencent.mm.plugin.finder.view.FinderCommentDrawer r2 = r30.mo89585j()
            r3 = 0
            r2.setChangeBackgroundAlpha(r3)
            com.tencent.mm.plugin.finder.view.FinderCommentDrawer r2 = r30.mo89585j()
            r2.setBackgroundColorRes(r1)
            goto L_0x062d
        L_0x062c:
            r3 = 0
        L_0x062d:
            com.tencent.mm.plugin.finder.view.FinderCommentDrawer r1 = r30.mo89585j()
            r1.setSquaresBackgroundResource(r0)
            com.tencent.mm.view.RefreshLoadMoreLayout r0 = r30.mo89591p()
            r0.setVisibility(r3)
            android.widget.FrameLayout r0 = r30.mo89587l()
            r0.setVisibility(r3)
            di3.d r0 = di3.C86312j.m106911c(r19)
            ht1.v4 r0 = (ht1.C8808v4) r0
            boolean r0 = r0.mo9635e()
            if (r0 == 0) goto L_0x06bb
            java.lang.String r0 = "Finder.DrawerPresenter"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "CommentInvisibleDebug isTeenMode="
            r1.append(r2)
            di3.d r2 = di3.C86312j.m106911c(r19)
            ht1.v4 r2 = (ht1.C8808v4) r2
            boolean r2 = r2.mo9635e()
            r1.append(r2)
            java.lang.String r2 = " drawerFooter.visibility = View.GONE"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            ur1.g r0 = r5.f158622n
            if (r0 == 0) goto L_0x067c
            com.tencent.mm.plugin.finder.view.FinderCommentFooter r13 = r0.mo89586k()
            goto L_0x067d
        L_0x067c:
            r13 = 0
        L_0x067d:
            if (r13 != 0) goto L_0x0680
            goto L_0x06bb
        L_0x0680:
            r13.setVisibility(r14)
            goto L_0x06bb
        L_0x0684:
            com.tencent.mm.plugin.finder.view.FinderCommentDrawer r0 = r30.mo89585j()
            r0.setSquaresBackgroundResource(r1)
            com.tencent.mm.plugin.finder.view.FinderCommentDrawer r0 = r30.mo89585j()
            r0.setBackgroundColorRes(r1)
            android.widget.FrameLayout r0 = r30.mo89587l()
            r0.setVisibility(r14)
            com.tencent.mm.view.RefreshLoadMoreLayout r0 = r30.mo89591p()
            r0.setVisibility(r14)
            com.tencent.mm.plugin.finder.view.FinderCommentEditText r0 = r28.mo77336n0()
            if (r0 == 0) goto L_0x06a9
            r0.requestFocus()
        L_0x06a9:
            boolean r0 = r5.f158598A
            if (r0 != 0) goto L_0x06bb
            ur1.g r0 = r5.f158622n
            if (r0 == 0) goto L_0x06bb
            com.tencent.mm.plugin.finder.view.FinderCommentFooter r0 = r0.mo89586k()
            r1 = 1
            r0.mo79779m(r1)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x06bb:
            boolean r0 = r5.f158628t
            if (r0 == 0) goto L_0x06eb
            ur1.g r0 = r5.f158622n
            if (r0 == 0) goto L_0x06fa
            com.tencent.mm.view.RefreshLoadMoreLayout r0 = r0.mo89591p()
            android.view.View r0 = r0.getLoadMoreFooter()
            if (r0 == 0) goto L_0x06fa
            r1 = 2131308010(0x7f092dea, float:1.8234263E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L_0x06fa
            android.content.Context r1 = r5.f158615d
            r2 = 2131821571(0x7f110403, float:1.9275889E38)
            java.lang.CharSequence r1 = r1.getText(r2)
            r0.setText(r1)
            r1 = 0
            r0.setVisibility(r1)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x06fa
        L_0x06eb:
            ur1.g r0 = r5.f158622n
            if (r0 == 0) goto L_0x06fa
            com.tencent.mm.view.RefreshLoadMoreLayout r0 = r0.mo89591p()
            r1 = 1
            r2 = 0
            com.tencent.p014mm.view.RefreshLoadMoreLayout.m66896C(r0, r2, r1, r2)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x06fa:
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter$commentErrorListener$1 r0 = r5.f158610M
            r0.alive()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.FinderCommentDrawerPresenter.mo77320M(com.tencent.mm.plugin.finder.view.FinderCommentDrawer, ur1.g, com.tencent.mm.plugin.finder.storage.FinderItem, com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract$CloseDrawerCallback, int, boolean, long, up1.w0, boolean, boolean, long, boolean, boolean, boolean, int):void");
    }

    /* renamed from: N0 */
    public final void mo77321N0() {
        TextView textView;
        Resources resources;
        String d = C7878t0.m8035d((long) mo77334j0());
        C65468g gVar = this.f158622n;
        String str = null;
        if (gVar != null) {
            textView = gVar.f188401f;
            if (textView == null) {
                C87412m.m108603p("headerTitleTv");
                throw null;
            }
        } else {
            textView = null;
        }
        if (textView != null) {
            if (this.f158606I) {
                if (gVar != null) {
                    Context context = gVar.f188411s;
                    if (context != null) {
                        resources = context.getResources();
                    } else {
                        C87412m.m108603p("context");
                        throw null;
                    }
                } else {
                    resources = null;
                }
                if (resources != null) {
                    str = resources.getString(C0966R.string.dac);
                }
            } else if (mo77334j0() <= 0) {
                FinderItem finderItem = this.f158620i;
                if (finderItem != null) {
                    str = finderItem.isChosenComment() ? this.f158615d.getResources().getString(C0966R.string.f360474cu1) : this.f158615d.getResources().getString(C0966R.string.d3h);
                } else {
                    C87412m.m108603p("feedObj");
                    throw null;
                }
            } else {
                FinderItem finderItem2 = this.f158620i;
                if (finderItem2 != null) {
                    str = finderItem2.isChosenComment() ? this.f158615d.getResources().getString(C0966R.string.f360475cu2, new Object[]{d}) : this.f158615d.getResources().getString(C0966R.string.d3o, new Object[]{d});
                } else {
                    C87412m.m108603p("feedObj");
                    throw null;
                }
            }
            textView.setText(str);
        }
    }

    /* renamed from: S0 */
    public final void mo77322S0(boolean z) {
        this.f158628t = z;
        Log.m105924i("Finder.DrawerPresenter", "set downContinue " + z);
    }

    /* renamed from: T0 */
    public final void mo77323T0(boolean z) {
        this.f158627s = z;
        Log.m105924i("Finder.DrawerPresenter", "set upContinue " + z);
    }

    /* renamed from: X */
    public void mo77324X(int i) {
        ArrayList<C55033u> arrayList = this.f158618g.f158793d;
        Log.m105924i("Finder.DrawerPresenter", "preloadNextPage, onScrollIdle, lastVisiblePosition:" + i + ", dataList size:" + arrayList.size() + ", canPreload:" + this.f158601D);
        if (i >= 0 && i < arrayList.size() && arrayList.size() - i <= C37521f.f99374d.mo61183i() && !this.f158606I) {
            if (((C8808v4) C86312j.m106911c(C8808v4.class)).mo9635e()) {
                Log.m105924i("Finder.DrawerPresenter", "preloadNextPage return for teen mode.");
            } else if (this.f158601D) {
                this.f158601D = false;
                C65233m mVar = this.f158600C;
                if (mVar != null) {
                    mVar.mo11856a(new C14121l(new C61065t0(this), (String) null, 2, (C8480h) null));
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r8v6, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: Y0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo77325Y0(android.view.View r24, cm1.C55033u r25) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            java.lang.String r3 = "anchor"
            gy3.C87412m.m108594g(r1, r3)
            java.lang.String r3 = "item"
            gy3.C87412m.m108594g(r2, r3)
            up1.w0 r3 = r2.f154492d
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r3 = r3.mo89532o2()
            te3.vh0 r11 = r3.advertisement_info
            if (r11 == 0) goto L_0x0282
            up1.w0 r3 = r2.f154492d
            long r6 = r3.field_feedId
            rs1.s8$a r3 = rs1.C13442s8.f38060Q0
            android.content.Context r4 = r0.f158615d
            rs1.s8 r3 = r3.mo12873f(r4)
            r13 = 0
            if (r3 == 0) goto L_0x002d
            int r3 = r3.f38096i
            r10 = r3
            goto L_0x002e
        L_0x002d:
            r10 = 0
        L_0x002e:
            com.tencent.mm.plugin.finder.view.FinderAdFeedbackWindow r3 = new com.tencent.mm.plugin.finder.view.FinderAdFeedbackWindow
            android.content.Context r5 = r0.f158615d
            up1.w0 r2 = r2.f154492d
            long r8 = r2.mo89531n2()
            com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter$k r12 = new com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter$k
            r12.<init>(r0)
            r4 = r3
            r4.<init>(r5, r6, r8, r10, r11, r12)
            r0.f158611N = r3
            boolean r2 = r3.f162009t
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
            r5 = 1
            if (r2 != 0) goto L_0x0055
            android.view.View r2 = r3.getContentView()
            r2.measure(r13, r13)
            r3.f162009t = r5
        L_0x0055:
            android.view.View r2 = r3.getContentView()
            int r2 = r2.getMeasuredWidth()
            android.view.View r6 = r3.getContentView()
            int r6 = r6.getMeasuredHeight()
            r3.setWidth(r2)
            r3.setHeight(r6)
            r7 = 2
            int[] r8 = new int[r7]
            r1.getLocationInWindow(r8)
            android.view.View r8 = r3.getContentView()
            r9 = 2131297326(0x7f09042e, float:1.8212594E38)
            android.view.View r8 = r8.findViewById(r9)
            android.view.View r9 = r3.getContentView()
            r10 = 2131297319(0x7f090427, float:1.821258E38)
            android.view.View r9 = r9.findViewById(r10)
            android.view.View r10 = r3.getContentView()
            java.lang.String r11 = "contentView"
            gy3.C87412m.m108593f(r10, r11)
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r13)
            int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r13)
            r10.measure(r11, r12)
            int r10 = r10.getMeasuredHeight()
            int[] r11 = new int[r7]
            r1.getLocationOnScreen(r11)
            android.graphics.Rect r12 = new android.graphics.Rect
            r12.<init>()
            r14 = r11[r13]
            r12.left = r14
            r11 = r11[r5]
            r12.top = r11
            int r11 = r24.getMeasuredWidth()
            int r14 = r14 + r11
            r12.right = r14
            int r11 = r12.top
            int r14 = r24.getMeasuredHeight()
            int r11 = r11 + r14
            r12.bottom = r11
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>()
            r1.getWindowVisibleDisplayFrame(r11)
            int r14 = r12.bottom
            int r14 = r14 + r10
            int r11 = r11.height()
            if (r14 <= r11) goto L_0x00d9
            int r11 = r12.height()
            int r10 = r10 + r11
            int r10 = -r10
            goto L_0x00da
        L_0x00d9:
            r10 = 0
        L_0x00da:
            int r11 = r24.getMeasuredWidth()
            int r12 = r8.getMeasuredWidth()
            int r11 = r11 - r12
            int r11 = r11 / r7
            android.view.ViewGroup$LayoutParams r12 = r8.getLayoutParams()
            boolean r14 = r12 instanceof android.view.ViewGroup.MarginLayoutParams
            r22 = 0
            if (r14 == 0) goto L_0x00f1
            android.view.ViewGroup$MarginLayoutParams r12 = (android.view.ViewGroup.MarginLayoutParams) r12
            goto L_0x00f3
        L_0x00f1:
            r12 = r22
        L_0x00f3:
            if (r12 == 0) goto L_0x00f8
            r12.rightMargin = r11
            goto L_0x00fa
        L_0x00f8:
            r12 = r22
        L_0x00fa:
            r8.setLayoutParams(r12)
            android.view.ViewGroup$LayoutParams r12 = r8.getLayoutParams()
            boolean r14 = r12 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r14 == 0) goto L_0x0108
            android.view.ViewGroup$MarginLayoutParams r12 = (android.view.ViewGroup.MarginLayoutParams) r12
            goto L_0x010a
        L_0x0108:
            r12 = r22
        L_0x010a:
            if (r12 == 0) goto L_0x010f
            r12.rightMargin = r11
            goto L_0x0111
        L_0x010f:
            r12 = r22
        L_0x0111:
            r9.setLayoutParams(r12)
            r11 = 8
            if (r10 >= 0) goto L_0x0197
            k20.a r12 = new k20.a
            r12.<init>()
            java.lang.ThreadLocal<k20.a> r14 = k20.C60958c.f173611a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r12.mo10233c(r11)
            java.lang.Object[] r15 = r12.mo10232b()
            java.lang.String r16 = "com/tencent/mm/plugin/finder/view/FinderAdFeedbackWindow"
            java.lang.String r17 = "showWith"
            java.lang.String r18 = "(Landroid/view/View;)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            r14 = r8
            j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r11 = r12.mo10231a(r13)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r8.setVisibility(r11)
            java.lang.String r15 = "com/tencent/mm/plugin/finder/view/FinderAdFeedbackWindow"
            java.lang.String r16 = "showWith"
            java.lang.String r17 = "(Landroid/view/View;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
            k20.a r8 = new k20.a
            r8.<init>()
            r8.mo10233c(r4)
            java.lang.Object[] r15 = r8.mo10232b()
            java.lang.String r16 = "com/tencent/mm/plugin/finder/view/FinderAdFeedbackWindow"
            java.lang.String r17 = "showWith"
            java.lang.String r18 = "(Landroid/view/View;)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            r14 = r9
            j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r4 = r8.mo10231a(r13)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r9.setVisibility(r4)
            java.lang.String r15 = "com/tencent/mm/plugin/finder/view/FinderAdFeedbackWindow"
            java.lang.String r16 = "showWith"
            java.lang.String r17 = "(Landroid/view/View;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
            goto L_0x0215
        L_0x0197:
            k20.a r12 = new k20.a
            r12.<init>()
            java.lang.ThreadLocal<k20.a> r14 = k20.C60958c.f173611a
            r12.mo10233c(r4)
            java.lang.Object[] r15 = r12.mo10232b()
            java.lang.String r16 = "com/tencent/mm/plugin/finder/view/FinderAdFeedbackWindow"
            java.lang.String r17 = "showWith"
            java.lang.String r18 = "(Landroid/view/View;)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            r14 = r8
            j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r4 = r12.mo10231a(r13)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r8.setVisibility(r4)
            java.lang.String r15 = "com/tencent/mm/plugin/finder/view/FinderAdFeedbackWindow"
            java.lang.String r16 = "showWith"
            java.lang.String r17 = "(Landroid/view/View;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r11)
            r4.mo10233c(r8)
            java.lang.Object[] r15 = r4.mo10232b()
            java.lang.String r16 = "com/tencent/mm/plugin/finder/view/FinderAdFeedbackWindow"
            java.lang.String r17 = "showWith"
            java.lang.String r18 = "(Landroid/view/View;)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            r14 = r9
            j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r4 = r4.mo10231a(r13)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r9.setVisibility(r4)
            java.lang.String r15 = "com/tencent/mm/plugin/finder/view/FinderAdFeedbackWindow"
            java.lang.String r16 = "showWith"
            java.lang.String r17 = "(Landroid/view/View;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
        L_0x0215:
            if (r10 >= 0) goto L_0x021b
            r4 = 2131886813(0x7f1202dd, float:1.9408215E38)
            goto L_0x021e
        L_0x021b:
            r4 = 2131886814(0x7f1202de, float:1.9408217E38)
        L_0x021e:
            r3.setAnimationStyle(r4)
            r4 = 8388613(0x800005, float:1.175495E-38)
            r3.showAsDropDown(r1, r13, r10, r4)
            boolean r1 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
            if (r1 == 0) goto L_0x0231
            r1 = 1036831949(0x3dcccccd, float:0.1)
            goto L_0x0233
        L_0x0231:
            r1 = 1056964608(0x3f000000, float:0.5)
        L_0x0233:
            android.view.View r4 = r3.getContentView()     // Catch:{ all -> 0x0265 }
            android.view.View r4 = r4.getRootView()     // Catch:{ all -> 0x0265 }
            android.content.Context r3 = r3.f161998f     // Catch:{ all -> 0x0265 }
            java.lang.String r8 = "window"
            java.lang.Object r3 = r3.getSystemService(r8)     // Catch:{ all -> 0x0265 }
            java.lang.String r8 = "null cannot be cast to non-null type android.view.WindowManager"
            gy3.C87412m.m108592e(r3, r8)     // Catch:{ all -> 0x0265 }
            android.view.WindowManager r3 = (android.view.WindowManager) r3     // Catch:{ all -> 0x0265 }
            android.view.ViewGroup$LayoutParams r8 = r4.getLayoutParams()     // Catch:{ all -> 0x0265 }
            boolean r9 = r8 instanceof android.view.WindowManager.LayoutParams     // Catch:{ all -> 0x0265 }
            if (r9 == 0) goto L_0x0257
            r22 = r8
            android.view.WindowManager$LayoutParams r22 = (android.view.WindowManager.LayoutParams) r22     // Catch:{ all -> 0x0265 }
        L_0x0257:
            r8 = r22
            if (r8 == 0) goto L_0x0265
            int r9 = r8.flags     // Catch:{ all -> 0x0265 }
            r9 = r9 | r7
            r8.flags = r9     // Catch:{ all -> 0x0265 }
            r8.dimAmount = r1     // Catch:{ all -> 0x0265 }
            r3.updateViewLayout(r4, r8)     // Catch:{ all -> 0x0265 }
        L_0x0265:
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r13] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            r1[r5] = r2
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r7)
            java.lang.String r2 = "pw:%s, ph:%s"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            java.lang.String r2 = "format(format, *args)"
            gy3.C87412m.m108593f(r1, r2)
        L_0x0282:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.FinderCommentDrawerPresenter.mo77325Y0(android.view.View, cm1.u):void");
    }

    /* renamed from: a */
    public RecyclerView.C0129l mo77326a(Context context) {
        C87412m.m108594g(context, "context");
        int[] iArr = new int[4];
        iArr[0] = (int) context.getResources().getDimension(C0966R.dimen.f3758d_);
        return new C66416a(new ColorDrawable(context.getResources().getColor(C0966R.color.BW_90)), (int) context.getResources().getDimension(C0966R.dimen.a5u), iArr, (int) context.getResources().getDimension(C0966R.dimen.a5v));
    }

    /* renamed from: a0 */
    public boolean mo77327a0(C55033u uVar, boolean z) {
        C55033u uVar2 = uVar;
        C87412m.m108594g(uVar2, FFmpegMetadataRetriever.METADATA_KEY_COMMENT);
        boolean z2 = false;
        if (uVar2.f154492d.field_actionInfo.f186500h != 0) {
            int i = -1;
            if (z) {
                C55772k kVar = this.f158618g;
                kVar.getClass();
                Iterator<C55033u> it = kVar.f158793d.iterator();
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C55033u next = it.next();
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        C55033u uVar3 = next;
                        C87412m.m108594g(uVar3, "comment1");
                        if (!(uVar3.getItemId() == uVar.getItemId())) {
                            if (i >= 0 && kVar.mo77388h(uVar3, uVar2)) {
                                Log.m105918d("Finder.FinderCommentLoader", "hasLevel2ItemAfter cur:" + i + ", after:" + i2);
                                z2 = true;
                                break;
                            }
                        } else {
                            i = i2;
                        }
                        i2 = i3;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
                return !z2;
            }
            C55772k kVar2 = this.f158618g;
            kVar2.getClass();
            Iterator<C55033u> it4 = kVar2.f158793d.iterator();
            int i4 = 0;
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                C55033u next2 = it4.next();
                int i5 = i4 + 1;
                if (i4 >= 0) {
                    C55033u uVar4 = next2;
                    C87412m.m108594g(uVar4, "comment1");
                    if (uVar4.getItemId() == uVar.getItemId()) {
                        Log.m105918d("Finder.FinderCommentLoader", "hasLevel2ItemAfter cur:" + i4 + ", before:" + i);
                        if (i >= 0 && i < i4) {
                            z2 = true;
                        }
                    } else {
                        if (kVar2.mo77388h(uVar4, uVar2)) {
                            i = i4;
                        }
                        i4 = i5;
                    }
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            return !z2;
        } else if (!z) {
            return false;
        } else {
            C55772k kVar3 = this.f158618g;
            kVar3.getClass();
            if (uVar.getItemId() != 0) {
                Iterator<C55033u> it5 = kVar3.f158793d.iterator();
                while (true) {
                    if (it5.hasNext()) {
                        if (it5.next().f154492d.field_actionInfo.f186500h == uVar.getItemId()) {
                            z2 = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            return !z2;
        }
    }

    /* renamed from: c */
    public WxRecyclerAdapter<?> mo77328c(Context context) {
        C87412m.m108594g(context, "context");
        WxRecyclerAdapter<?> wxRecyclerAdapter = new WxRecyclerAdapter<>(new FinderCommentDrawerPresenter$getAdapter$adapter$1(this), this.f158618g.f158793d, false);
        wxRecyclerAdapter.setHasStableIds(false);
        wxRecyclerAdapter.f173488o = this;
        wxRecyclerAdapter.f173487n = this;
        return wxRecyclerAdapter;
    }

    /* renamed from: e */
    public void mo55509e(int i, int i2) {
        C65468g gVar;
        C65468g gVar2;
        RecyclerView recyclerView;
        ViewPropertyAnimator animate;
        ViewPropertyAnimator translationY;
        ViewPropertyAnimator duration;
        Log.m105924i("Finder.DrawerPresenter", "[onModeChange] from=" + i + " to=" + i2);
        for (FinderCommentFooter.C56552a e : this.f158609L) {
            e.mo55509e(i, i2);
        }
        if (i2 == 0) {
            if (!(this.f158607J || (gVar2 = this.f158622n) == null || (recyclerView = gVar2.mo89585j().getRecyclerView()) == null || (animate = recyclerView.animate()) == null || (translationY = animate.translationY(0.0f)) == null || (duration = translationY.setDuration(180)) == null)) {
                duration.start();
            }
            if (this.f158599B && (gVar = this.f158622n) != null) {
                FinderCommentFooter k = gVar.mo89586k();
                String p0 = C58784w3.f168295a.mo83955p0(this.f158621j);
                FinderItem finderItem = this.f158620i;
                if (finderItem != null) {
                    k.mo79774h(p0, finderItem.getNickName(), (Object) null);
                } else {
                    C87412m.m108603p("feedObj");
                    throw null;
                }
            }
        }
    }

    /* renamed from: f */
    public void mo77329f(View view, int i) {
        RecyclerView recyclerView;
        C87412m.m108594g(view, "view");
        if (i < 0) {
            Log.m105924i("Finder.DrawerPresenter", "onClickResendComment position:" + i);
            return;
        }
        C65426w0 w0Var = this.f158618g.mo77385e(i).f154492d;
        if (w0Var.field_state == -1) {
            C65430c cVar = C65430c.f188287c;
            cVar.getClass();
            Log.m105924i("Finder.FinderActionManager", "rePost " + w0Var);
            w0Var.field_state = 1;
            w0Var.field_canRemove = 0;
            w0Var.mo89532o2().createtime = C31543z5.m39451a() / 1000;
            w0Var.field_postTime = C31543z5.m39451a();
            w0Var.field_tryCount = 0;
            cVar.f188288a.mo89349c(new C65428a(w0Var), new C65429b(cVar));
            C65468g gVar = this.f158622n;
            if (gVar != null && (recyclerView = gVar.mo89591p().getRecyclerView()) != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                RecyclerView recyclerView2 = recyclerView;
                C117292a.m165358d(recyclerView2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter", "onClickResendComment", "(Landroid/view/View;I)V", "Undefined", "scrollToPosition", "(I)V");
                recyclerView.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(recyclerView2, "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter", "onClickResendComment", "(Landroid/view/View;I)V", "Undefined", "scrollToPosition", "(I)V");
            }
        }
    }

    /* renamed from: f0 */
    public final List<C55033u> mo77330f0(List<C55033u> list, boolean z) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (T next : list) {
            int i2 = i + 1;
            if (i >= 0) {
                C55033u uVar = (C55033u) next;
                arrayList.add(uVar);
                C65426w0 w0Var = uVar.f154492d;
                if (w0Var.field_actionInfo.f186500h != 0 || w0Var.mo89540v2().size() <= 0) {
                    List<C55033u> list2 = list;
                } else {
                    Iterator<C55033u> it = this.f158618g.f158793d.iterator();
                    int i3 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i3 = -1;
                            break;
                        }
                        if (it.next().getItemId() == uVar.getItemId()) {
                            break;
                        }
                        i3++;
                    }
                    if (i >= list.size() - 1) {
                        List<C55033u> list3 = list;
                    } else if (list.get(i2).f154492d.field_actionInfo.f186500h != 0) {
                        continue;
                    }
                    if (i3 <= 0 || !z) {
                        C37521f.f99374d.getClass();
                        if (C37521f.f99480p0.mo60266n().intValue() == 1) {
                            int size = uVar.f154492d.mo89540v2().size();
                            int i4 = 0;
                            while (i4 < size) {
                                FinderCommentInfo remove = uVar.f154492d.mo89540v2().remove();
                                C66164a aVar = C66164a.f190162a;
                                C87412m.m108593f(remove, "level2Comment");
                                FinderItem finderItem = this.f158620i;
                                if (finderItem != null) {
                                    C55033u c = aVar.mo90222c(remove, finderItem.getId(), uVar.getItemId());
                                    c.f154504s = true;
                                    arrayList.add(c);
                                    i4++;
                                } else {
                                    C87412m.m108603p("feedObj");
                                    throw null;
                                }
                            }
                            int i5 = uVar.f154503r - size;
                            uVar.f154503r = i5;
                            if (i5 < 0) {
                                uVar.f154503r = 0;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public int mo77331g() {
        return this.f158621j;
    }

    public int getCommentScene() {
        C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f158615d);
        if (f != null) {
            return f.f38096i;
        }
        return 0;
    }

    /* renamed from: h */
    public boolean mo77333h() {
        return this.f158602E;
    }

    /* renamed from: j0 */
    public final int mo77334j0() {
        FinderItem finderItem;
        C37521f.f99374d.getClass();
        int i = 0;
        if (C37521f.f99511s4.mo60266n().intValue() == 1) {
            C65834e eVar = C65834e.f189316a;
            FinderItem finderItem2 = this.f158620i;
            if (finderItem2 != null) {
                finderItem = eVar.mo89871e(finderItem2.getId());
                if (finderItem == null && (finderItem = this.f158620i) == null) {
                    C87412m.m108603p("feedObj");
                    throw null;
                }
            } else {
                C87412m.m108603p("feedObj");
                throw null;
            }
        } else {
            finderItem = this.f158620i;
            if (finderItem == null) {
                C87412m.m108603p("feedObj");
                throw null;
            }
        }
        int commentCount = finderItem.getCommentCount();
        Log.m105924i("Finder.DrawerPresenter", "calculateCommentCount " + this.f158618g.mo77387g() + ", commentCount=" + commentCount);
        int g = this.f158618g.mo77387g();
        if (this.f158618g.f158792c != null) {
            i = 1;
        }
        return Math.max(g - i, commentCount);
    }

    public void keep(C9486a aVar) {
        C87412m.m108594g(aVar, "p0");
        this.f158619h.add(aVar);
    }

    /* renamed from: l1 */
    public void mo77335l1(View view, C55033u uVar) {
        C87412m.m108594g(view, "view");
        C87412m.m108594g(uVar, "item");
        C77407n nVar = new C77407n(view.getContext(), 1, false);
        FinderItem finderItem = this.f158620i;
        if (finderItem != null) {
            nVar.f225771i = new C56646q(uVar, finderItem.getUserName());
            nVar.f225782p = new C56648s(this.f158615d, uVar, this.f158616e, new C55736i(this));
            nVar.mo107573q();
            return;
        }
        C87412m.m108603p("feedObj");
        throw null;
    }

    /* renamed from: n */
    public boolean mo759n(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
        C87412m.m108594g(eVar, "adapter");
        C87412m.m108594g(view, "view");
        C87412m.m108594g((C60905o) zVar, "holder");
        if (!this.f158598A) {
            if (i < 0) {
                Log.m105924i("Finder.DrawerPresenter", "onItemLongClick position:" + i);
            } else {
                C55033u e = this.f158618g.mo77385e(i);
                C78253a aVar = new C78253a(this.f158615d);
                FinderItem finderItem = this.f158620i;
                if (finderItem != null) {
                    String userName = finderItem.getUserName();
                    boolean z = true;
                    if (this.f158621j != 1) {
                        z = false;
                    }
                    aVar.mo108272g(view, 0, 0, new C56647r(e, userName, z), new C56648s(this.f158615d, e, this.f158616e, new C61044o0(this)), TouchableLayout.f24959d, TouchableLayout.f24960e);
                } else {
                    C87412m.m108603p("feedObj");
                    throw null;
                }
            }
        }
        return false;
    }

    /* renamed from: n0 */
    public final FinderCommentEditText mo77336n0() {
        C65468g gVar = this.f158622n;
        if (gVar != null) {
            return gVar.mo89586k().getEditText();
        }
        return null;
    }

    /* renamed from: o1 */
    public boolean mo77337o1() {
        return this.f158601D;
    }

    public void onDetach() {
        RecyclerView recyclerView;
        RecyclerView.C16613e adapter;
        RecyclerView recyclerView2;
        RecyclerView.C16613e adapter2;
        RecyclerView recyclerView3;
        RecyclerView recyclerView4;
        if (this.f158599B) {
            Log.m105924i("Finder.DrawerPresenter", "onDetach: can not detach, because it is not attached");
            return;
        }
        C13442s8.C13443a aVar = C13442s8.f38060Q0;
        C13442s8 f = aVar.mo12873f(this.f158615d);
        int i = -1;
        if (f != null) {
            int i2 = f.f38096i;
            if (!(i2 == 199 || i2 == 192)) {
                C58417y0 y0Var = (C58417y0) C86312j.m106911c(C58417y0.class);
                String str = f.f38099o;
                String str2 = f.f38098n;
                String str3 = f.f38100p;
                int i3 = f.f38096i;
                FinderItem finderItem = this.f158620i;
                if (finderItem != null) {
                    long id = finderItem.getId();
                    long j = this.f158625q;
                    long currentTimeMillis = System.currentTimeMillis();
                    FinderCommentDrawer finderCommentDrawer = this.f158605H;
                    y0Var.zy0(str, str2, str3, i3, id, j, currentTimeMillis, finderCommentDrawer != null ? finderCommentDrawer.getReason() : 0);
                } else {
                    C87412m.m108603p("feedObj");
                    throw null;
                }
            }
            C13442s8 f2 = aVar.mo12873f(this.f158615d);
            SupportLifecycle k3 = f2 != null ? f2.mo12855k3(-1) : null;
            boolean z = k3 instanceof C58368h1;
            if (z || (k3 instanceof C58353a0)) {
                String b = C58403t.f167322q.mo83248b(C90364q0.m113147f(new C13604l("feedActionType", 24), new C13604l("value", Long.valueOf(System.currentTimeMillis() - this.f158625q))));
                C58368h1 h1Var = z ? (C58368h1) k3 : null;
                if (h1Var != null) {
                    C58368h1.m67612b2(h1Var, b, false, 2, (Object) null);
                }
                C58353a0 a0Var = k3 instanceof C58353a0 ? (C58353a0) k3 : null;
                if (a0Var != null) {
                    a0Var.mo83106Q1(b);
                }
            }
        }
        this.f158599B = true;
        this.f158601D = false;
        C65233m mVar = this.f158600C;
        if (mVar != null) {
            mVar.mo89362e();
        }
        this.f158600C = null;
        C65468g gVar = this.f158622n;
        if (((gVar == null || (recyclerView4 = gVar.mo89591p().getRecyclerView()) == null) ? null : recyclerView4.getLayoutManager()) instanceof LinearLayoutManager) {
            C65468g gVar2 = this.f158622n;
            RecyclerView.LayoutManager layoutManager = (gVar2 == null || (recyclerView3 = gVar2.mo89591p().getRecyclerView()) == null) ? null : recyclerView3.getLayoutManager();
            C87412m.m108592e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            i = ((LinearLayoutManager) layoutManager).mo16957C();
        }
        C65468g gVar3 = this.f158622n;
        FinderCommentFooter k = gVar3 != null ? gVar3.mo89586k() : null;
        if (k != null) {
            k.setFooterMode(0);
        }
        C65468g gVar4 = this.f158622n;
        if (!(gVar4 == null || (recyclerView2 = gVar4.mo89591p().getRecyclerView()) == null || (adapter2 = recyclerView2.getAdapter()) == null)) {
            adapter2.unregisterAdapterDataObserver(this.f158614R);
        }
        Iterator<C9486a> it = this.f158619h.iterator();
        while (it.hasNext()) {
            it.next().dead();
        }
        this.f158619h.clear();
        this.f158612P.dead();
        FinderItem finderItem2 = this.f158620i;
        if (finderItem2 != null) {
            finderItem2.setCommentCount(mo77334j0());
            C65834e eVar = C65834e.f189316a;
            FinderItem finderItem3 = this.f158620i;
            if (finderItem3 != null) {
                eVar.mo89878l(finderItem3, C65834e.C65836b.f189324d);
                StringBuilder sb = new StringBuilder();
                sb.append("[onDetach] updateFeedCommentCount feedId=");
                FinderItem finderItem4 = this.f158620i;
                if (finderItem4 != null) {
                    sb.append(finderItem4.getId());
                    sb.append(" commentCount ");
                    sb.append(mo77334j0());
                    Log.m105924i("Finder.DrawerPresenter", sb.toString());
                    CommentDrawerContract.CloseDrawerCallback closeDrawerCallback = this.f158624p;
                    if (closeDrawerCallback != null) {
                        closeDrawerCallback.mo2377a(mo77334j0(), this.f158618g.f158793d, this.f158604G);
                    }
                    if (this.f158630v || !this.f158631w) {
                        this.f158618g.f158793d.clear();
                    } else {
                        if (this.f158632x != 0) {
                            Iterator<C55033u> it4 = this.f158618g.f158793d.iterator();
                            int i4 = 0;
                            while (it4.hasNext()) {
                                C55033u next = it4.next();
                                int i5 = i4 + 1;
                                if (i4 >= 0) {
                                    C55033u uVar = next;
                                    if (uVar.getItemId() == this.f158632x) {
                                        uVar.f154501p = false;
                                        i = i4;
                                    }
                                    i4 = i5;
                                } else {
                                    C64197v.m75542k();
                                    throw null;
                                }
                            }
                        }
                        int i6 = i;
                        C55772k kVar = this.f158618g;
                        C89349b bVar = this.f158626r;
                        boolean z2 = this.f158627s;
                        boolean z3 = this.f158628t;
                        boolean z4 = this.f158603F;
                        C55034v vVar = kVar.f158792c;
                        if (vVar != null) {
                            kVar.f158793d.remove(vVar);
                        }
                        kVar.f158792c = null;
                        if (kVar.f158793d.size() >= 0 && i6 >= 0) {
                            long j2 = kVar.f158790a;
                            long j3 = kVar.f158791b;
                            ArrayList<C55033u> arrayList = kVar.f158793d;
                            C87412m.m108594g(arrayList, "data");
                            C65838f fVar = C65838f.f189333a;
                            ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
                            Iterator<C55033u> it5 = arrayList.iterator();
                            while (it5.hasNext()) {
                                arrayList2.add(it5.next().f154492d);
                            }
                            fVar.mo89880a(j2, j3, arrayList2);
                        }
                        kVar.f158793d.clear();
                        if (i6 >= 0) {
                            C65838f.f189333a.mo89881b(kVar.f158790a, kVar.f158791b, i6, bVar, z2, z3, z4);
                        }
                    }
                    this.f158626r = null;
                    mo77323T0(false);
                    mo77322S0(true);
                    this.f158604G = false;
                    FinderCommentEditText n0 = mo77336n0();
                    if (n0 != null) {
                        n0.setText((CharSequence) null);
                    }
                    FinderCommentEditText n05 = mo77336n0();
                    if (n05 != null) {
                        ((HashMap) n05.f198148E).clear();
                    }
                    C65468g gVar5 = this.f158622n;
                    RefreshLoadMoreLayout p = gVar5 != null ? gVar5.mo89591p() : null;
                    if (p != null) {
                        p.setHasBottomMore(true);
                    }
                    C65468g gVar6 = this.f158622n;
                    if (!(gVar6 == null || (recyclerView = gVar6.mo89591p().getRecyclerView()) == null || (adapter = recyclerView.getAdapter()) == null)) {
                        adapter.notifyDataSetChanged();
                    }
                    C65468g gVar7 = this.f158622n;
                    RecyclerView recyclerView5 = gVar7 != null ? gVar7.mo89591p().getRecyclerView() : null;
                    if (recyclerView5 != null) {
                        recyclerView5.setLayoutFrozen(true);
                    }
                    C65468g gVar8 = this.f158622n;
                    RefreshLoadMoreLayout p2 = gVar8 != null ? gVar8.mo89591p() : null;
                    if (p2 != null) {
                        p2.setActionCallback((RefreshLoadMoreLayout.C57879a) null);
                    }
                    this.f158622n = null;
                    this.f158610M.dead();
                    FinderAdFeedbackWindow finderAdFeedbackWindow = this.f158611N;
                    if (finderAdFeedbackWindow != null) {
                        finderAdFeedbackWindow.dismiss();
                    }
                    FinderCommentAdVideoView finderCommentAdVideoView = this.f158617f;
                    if ((finderCommentAdVideoView != null && finderCommentAdVideoView.f162018D) && finderCommentAdVideoView != null) {
                        finderCommentAdVideoView.mo24000p();
                        finderCommentAdVideoView.getPlayer().release();
                    }
                    this.f158617f = null;
                    this.f158608K = null;
                    return;
                }
                C87412m.m108603p("feedObj");
                throw null;
            }
            C87412m.m108603p("feedObj");
            throw null;
        }
        C87412m.m108603p("feedObj");
        throw null;
    }

    /* renamed from: p */
    public int mo77338p() {
        ArrayList<C55033u> arrayList = this.f158618g.f158793d;
        if (Util.isNullOrNil((List) arrayList)) {
            return -1;
        }
        Iterator<C55033u> it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            C55033u next = it.next();
            int i2 = i + 1;
            if (i >= 0) {
                C65426w0 w0Var = next.f154492d;
                if (w0Var.field_actionInfo.f186500h == 0) {
                    boolean z = true;
                    if ((w0Var.mo89532o2().extFlag & 1) <= 0) {
                        z = false;
                    }
                    if (!z) {
                        return i;
                    }
                }
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        return -1;
    }

    /* renamed from: q */
    public void mo734q(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
        View view2 = view;
        int i2 = i;
        C60905o oVar = (C60905o) zVar;
        C87412m.m108594g(eVar, "adapter");
        C87412m.m108594g(view2, "view");
        C87412m.m108594g(oVar, "holder");
        if (oVar.f44859i == 3 || this.f158598A) {
            return;
        }
        if (i2 < 0) {
            Log.m105924i("Finder.DrawerPresenter", "onItemClick position:" + i2);
            return;
        }
        C55033u e = this.f158618g.mo77385e(i2);
        if (!e.f154497i || !((FinderCollapsibleTextView) oVar.mo85812D(C0966R.C0970id.bj4)).mo23659g()) {
            C65426w0 w0Var = e.f154492d;
            int i3 = w0Var.field_state;
            if (((i3 == 1 || i3 == -1) ? false : true) && !w0Var.mo89544z2()) {
                C65468g gVar = this.f158622n;
                if (gVar != null) {
                    FinderCommentFooter k = gVar.mo89586k();
                    int i4 = this.f158621j;
                    C65426w0 w0Var2 = e.f154492d;
                    boolean z = i4 == 2;
                    C87412m.m108594g(w0Var2, "commentObj");
                    if (z) {
                        String str = k.f162061M;
                        k.mo79743f(str, ' ' + k.getResources().getString(C0966R.string.bih, new Object[]{k.mo79775i(C58784w3.m68433S(C58784w3.f168295a, w0Var2.getUsername(), w0Var2.getNickname(), false, 4, (Object) null))}), w0Var2, true);
                    } else {
                        String str2 = k.f162061M;
                        k.mo79743f(str2, ' ' + k.getResources().getString(C0966R.string.bih, new Object[]{k.mo79775i(w0Var2.getNickname())}), w0Var2, true);
                    }
                    k.getEditText().setShowSoftInputOnFocus(true);
                    k.getEditText().requestFocus();
                    k.mo79779m(true);
                }
                if (!this.f158607J) {
                    Rect rect = new Rect();
                    view2.getGlobalVisibleRect(rect);
                    int i5 = rect.bottom;
                    C65468g gVar2 = this.f158622n;
                    RecyclerView recyclerView = null;
                    FinderCommentDrawer j = gVar2 != null ? gVar2.mo89585j() : null;
                    C87412m.m108591d(j);
                    j.getGlobalVisibleRect(rect);
                    int i6 = rect.bottom - i5;
                    C65468g gVar3 = this.f158622n;
                    FinderCommentFooter k2 = gVar3 != null ? gVar3.mo89586k() : null;
                    C87412m.m108591d(k2);
                    if (i6 < k2.getHeight()) {
                        int height = i6 - k2.getHeight();
                        C65468g gVar4 = this.f158622n;
                        if (gVar4 != null) {
                            recyclerView = gVar4.mo89585j().getRecyclerView();
                        }
                        C87412m.m108591d(recyclerView);
                        recyclerView.animate().translationY((float) height).setDuration(90).start();
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x01c0, code lost:
        r12 = new java.util.concurrent.ConcurrentHashMap();
     */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo77339r(android.widget.ImageView r36, int r37) {
        /*
            r35 = this;
            r0 = r35
            r1 = r36
            r2 = r37
            java.lang.Class<rs1.s8> r3 = rs1.C13442s8.class
            java.lang.String r4 = "view"
            gy3.C87412m.m108594g(r1, r4)
            java.lang.String r4 = "Finder.DrawerPresenter"
            if (r2 >= 0) goto L_0x0027
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "onLikeComment position:"
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            return
        L_0x0027:
            com.tencent.mm.plugin.finder.feed.model.k r5 = r0.f158618g
            cm1.u r5 = r5.mo77385e(r2)
            vq1.w r6 = vq1.C65866w.f189407h
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = r0.f158620i
            java.lang.String r8 = "feedObj"
            if (r7 == 0) goto L_0x02c2
            long r10 = r7.getId()
            up1.w0 r7 = r5.f154492d
            int r12 = r0.f158621j
            boolean r7 = r6.mo89907f(r10, r7, r12)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "[onLikeComment] position="
            r10.append(r11)
            r10.append(r2)
            java.lang.String r11 = " isLike="
            r10.append(r11)
            r10.append(r7)
            java.lang.String r11 = " commentObj="
            r10.append(r11)
            up1.w0 r11 = r5.f154492d
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r10)
            r4 = 1
            r7 = r7 ^ r4
            android.content.Context r10 = r0.f158615d
            boolean r11 = r10 instanceof com.tencent.p014mm.p136ui.MMFragmentActivity
            r20 = 2
            if (r11 == 0) goto L_0x022b
            bl3.r r14 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r10 = (androidx.appcompat.app.AppCompatActivity) r10
            bl3.r$a r10 = r14.mo62444c(r10)
            androidx.lifecycle.i0 r10 = r10.mo75002a(r3)
            rs1.s8 r10 = (rs1.C13442s8) r10
            te3.hj1 r18 = r10.mo12861q3()
            er1.w3 r10 = er1.C58784w3.f168295a
            com.tencent.mm.plugin.finder.storage.FinderItem r11 = r0.f158620i
            if (r11 == 0) goto L_0x0226
            java.lang.String r11 = r11.getUserName()
            boolean r19 = r10.mo83899R0(r11)
            up1.f r10 = up1.C37521f.f99374d
            r10.getClass()
            pe1.c<java.lang.Integer> r10 = up1.C37521f.f99211K1
            java.lang.Object r11 = r10.mo60266n()
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            if (r11 == r4) goto L_0x00aa
            int r11 = up1.C37521f.f99260Q
            if (r11 != r4) goto L_0x00aa
            r11 = 1
            goto L_0x00ac
        L_0x00aa:
            int r11 = r0.f158621j
        L_0x00ac:
            if (r19 == 0) goto L_0x00c8
            if (r11 != r4) goto L_0x00c8
            if (r7 == 0) goto L_0x00bd
            up1.w0 r11 = r5.f154492d
            int r12 = r11.mo89533p2()
            r12 = r12 | r4
            r11.mo89523B2(r12)
            goto L_0x00c8
        L_0x00bd:
            up1.w0 r11 = r5.f154492d
            int r12 = r11.mo89533p2()
            r12 = r12 & -2
            r11.mo89523B2(r12)
        L_0x00c8:
            com.tencent.mm.plugin.finder.storage.FinderItem r11 = r0.f158620i
            if (r11 == 0) goto L_0x0221
            long r11 = r11.getId()
            com.tencent.mm.plugin.finder.storage.FinderItem r13 = r0.f158620i
            if (r13 == 0) goto L_0x021c
            java.lang.String r13 = r13.getObjectNonceId()
            up1.w0 r9 = r5.f154492d
            int r15 = r0.f158621j
            java.lang.String r4 = "objectNonceId"
            gy3.C87412m.m108594g(r13, r4)
            java.lang.String r4 = "comment"
            gy3.C87412m.m108594g(r9, r4)
            ot1.a r4 = ot1.C11767a.f34453a
            r17 = r14
            java.lang.String r14 = "like"
            boolean r4 = r4.mo11659a(r14)
            if (r4 == 0) goto L_0x00f9
            r24 = r5
            r2 = r17
            r5 = 0
            goto L_0x01ea
        L_0x00f9:
            java.lang.Object r4 = r10.mo60266n()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r10 = 1
            if (r4 == r10) goto L_0x010c
            int r4 = up1.C37521f.f99260Q
            if (r4 != r10) goto L_0x010c
            r4 = 1
            goto L_0x010d
        L_0x010c:
            r4 = r15
        L_0x010d:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r14 = "likeComment scene: "
            r10.append(r14)
            r10.append(r4)
            java.lang.String r14 = ", scene1:"
            r10.append(r14)
            r10.append(r15)
            java.lang.String r10 = r10.toString()
            java.lang.String r14 = "Finder.FinderLikeLogic"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r10)
            kj2.d r21 = kj2.C117407d.INSTANCE
            r22 = 1278(0x4fe, double:6.314E-321)
            if (r7 == 0) goto L_0x0134
            r14 = 2
            goto L_0x0136
        L_0x0134:
            r14 = 3
        L_0x0136:
            r24 = r14
            r26 = 1
            r28 = 0
            r21.idkeyStat(r22, r24, r26, r28)
            if (r7 == 0) goto L_0x0144
            r26 = 2
            goto L_0x0146
        L_0x0144:
            r26 = 1
        L_0x0146:
            java.lang.Class<dp1.y0> r10 = dp1.C58417y0.class
            di3.d r10 = di3.C86312j.m106911c(r10)
            java.lang.String r14 = "getService(FinderReportLogic::class.java)"
            gy3.C87412m.m108593f(r10, r14)
            r21 = r10
            dp1.y0 r21 = (dp1.C58417y0) r21
            r25 = 4
            r27 = 1
            java.lang.String r28 = r9.getUsername()
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 896(0x380, float:1.256E-42)
            r34 = 0
            r22 = r18
            r23 = r11
            r29 = r4
            dp1.C58417y0.Ux0(r21, r22, r23, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r21 = 0
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r14 = "doLikeComment "
            r10.append(r14)
            r10.append(r11)
            java.lang.String r14 = " comment:"
            r10.append(r14)
            r10.append(r9)
            java.lang.String r14 = " like:"
            r10.append(r14)
            r10.append(r7)
            java.lang.String r14 = " scene "
            r10.append(r14)
            r10.append(r4)
            java.lang.String r10 = r10.toString()
            java.lang.String r14 = "Finder.FinderLikeActionMgr"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r10)
            vq1.a0 r15 = new vq1.a0
            r10 = r15
            r22 = r11
            r2 = r17
            r14 = r9
            r24 = r5
            r1 = r15
            r5 = 0
            r15 = r7
            r16 = r4
            r17 = r21
            r10.<init>(r11, r13, r14, r15, r16, r17, r18, r19)
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, java.util.concurrent.ConcurrentHashMap<vq1.w$c, vq1.a0>> r10 = r6.f189411d
            java.lang.Long r11 = java.lang.Long.valueOf(r22)
            java.lang.Object r12 = r10.get(r11)
            if (r12 != 0) goto L_0x01cd
            java.util.concurrent.ConcurrentHashMap r12 = new java.util.concurrent.ConcurrentHashMap
            r12.<init>()
            java.lang.Object r10 = r10.putIfAbsent(r11, r12)
            if (r10 != 0) goto L_0x01cc
            goto L_0x01cd
        L_0x01cc:
            r12 = r10
        L_0x01cd:
            java.util.concurrent.ConcurrentHashMap r12 = (java.util.concurrent.ConcurrentHashMap) r12
            vq1.w$c r10 = new vq1.w$c
            long r13 = r9.mo89531n2()
            r10.<init>(r13, r4)
            r12.put(r10, r1)
            u60.f<vq1.y> r4 = r6.f189408a
            vq1.y r9 = new vq1.y
            r9.<init>(r1)
            vq1.x r10 = new vq1.x
            r10.<init>(r6, r1)
            r4.mo89349c(r9, r10)
        L_0x01ea:
            android.content.Context r1 = r0.f158615d
            androidx.appcompat.app.AppCompatActivity r1 = (androidx.appcompat.app.AppCompatActivity) r1
            bl3.r$a r1 = r2.mo62444c(r1)
            androidx.lifecycle.i0 r1 = r1.mo75002a(r3)
            java.lang.String r2 = "UICProvider.of(context).…rReporterUIC::class.java)"
            gy3.C87412m.m108593f(r1, r2)
            ht1.g4 r1 = (ht1.C60172g4) r1
            r2 = 0
            r3 = 1
            df1.a r1 = ht1.C60172g4.C60173a.m70190b(r1, r5, r3, r2)
            if (r1 == 0) goto L_0x022e
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r0.f158620i
            if (r3 == 0) goto L_0x0218
            long r2 = r3.getId()
            df1.a$a r4 = new df1.a$a
            r6 = 15
            r4.<init>(r6, r2)
            r1.mo8766a(r4)
            goto L_0x022e
        L_0x0218:
            gy3.C87412m.m108603p(r8)
            throw r2
        L_0x021c:
            r2 = 0
            gy3.C87412m.m108603p(r8)
            throw r2
        L_0x0221:
            r2 = 0
            gy3.C87412m.m108603p(r8)
            throw r2
        L_0x0226:
            r2 = 0
            gy3.C87412m.m108603p(r8)
            throw r2
        L_0x022b:
            r24 = r5
            r5 = 0
        L_0x022e:
            java.lang.Class<l31.e> r1 = l31.C61212e.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            l31.e r1 = (l31.C61212e) r1
            r2 = 4
            rx3.l[] r2 = new rx3.C13604l[r2]
            r3 = r24
            up1.w0 r4 = r3.f154492d
            long r8 = r4.mo89531n2()
            java.lang.String r4 = o40.C61926c.m72691p(r8)
            rx3.l r6 = new rx3.l
            java.lang.String r8 = "comment_id"
            r6.<init>(r8, r4)
            r2[r5] = r6
            up1.w0 r4 = r3.f154492d
            java.lang.String r4 = r4.getUsername()
            rx3.l r5 = new rx3.l
            java.lang.String r6 = "comment_username"
            r5.<init>(r6, r4)
            r4 = 1
            r2[r4] = r5
            up1.w0 r4 = r3.f154492d
            int r4 = r4.mo89533p2()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            rx3.l r5 = new rx3.l
            java.lang.String r6 = "display_flag"
            r5.<init>(r6, r4)
            r2[r20] = r5
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            rx3.l r5 = new rx3.l
            java.lang.String r6 = "is_action_like"
            r5.<init>(r6, r4)
            r4 = 3
            r2[r4] = r5
            java.util.Map r2 = sx3.C90364q0.m113147f(r2)
            r5 = 24617(0x6029, float:3.4496E-41)
            java.lang.String r6 = "comment_like_clk"
            r8 = r36
            r1.mo86153W7(r6, r8, r2, r5)
            up1.w0 r1 = r3.f154492d
            long r1 = r1.mo89531n2()
            com.tencent.mm.autogen.events.FinderCommentReportEvent r3 = new com.tencent.mm.autogen.events.FinderCommentReportEvent
            r3.<init>()
            com.tencent.mm.autogen.events.FinderCommentReportEvent$a r5 = r3.f154760d
            if (r7 == 0) goto L_0x029c
            r4 = 2
        L_0x029c:
            r5.f154761a = r4
            r5.f154762b = r1
            r3.publish()
            ur1.g r1 = r0.f158622n
            if (r1 == 0) goto L_0x02c1
            com.tencent.mm.view.RefreshLoadMoreLayout r1 = r1.mo89591p()
            androidx.recyclerview.widget.RecyclerView r1 = r1.getRecyclerView()
            if (r1 == 0) goto L_0x02c1
            androidx.recyclerview.widget.RecyclerView$e r1 = r1.getAdapter()
            if (r1 == 0) goto L_0x02c1
            r2 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = r37
            r1.notifyItemChanged(r3, r2)
        L_0x02c1:
            return
        L_0x02c2:
            gy3.C87412m.m108603p(r8)
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.FinderCommentDrawerPresenter.mo77339r(android.widget.ImageView, int):void");
    }

    /* renamed from: r1 */
    public FinderCommentAdVideoView mo77340r1() {
        if (this.f158617f == null) {
            FinderCommentAdVideoView finderCommentAdVideoView = new FinderCommentAdVideoView(this.f158615d);
            finderCommentAdVideoView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.f158617f = finderCommentAdVideoView;
        }
        return this.f158617f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        if (((r0.mo89532o2().extFlag & 1) > 0) == true) goto L_0x0028;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo77341s() {
        /*
            r3 = this;
            com.tencent.mm.plugin.finder.feed.model.k r0 = r3.f158618g
            java.util.ArrayList<cm1.u> r0 = r0.f158793d
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r0)
            r2 = 0
            if (r1 != 0) goto L_0x002b
            java.lang.Object r0 = sx3.C110818d0.m150916N(r0)
            cm1.u r0 = (cm1.C55033u) r0
            r1 = 1
            if (r0 == 0) goto L_0x0027
            up1.w0 r0 = r0.f154492d
            if (r0 == 0) goto L_0x0027
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r0 = r0.mo89532o2()
            int r0 = r0.extFlag
            r0 = r0 & r1
            if (r0 <= 0) goto L_0x0023
            r0 = 1
            goto L_0x0024
        L_0x0023:
            r0 = 0
        L_0x0024:
            if (r0 != r1) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r1 = 0
        L_0x0028:
            if (r1 == 0) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            r2 = -1
        L_0x002c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.FinderCommentDrawerPresenter.mo77341s():int");
    }

    /* renamed from: u */
    public FinderItem mo77342u() {
        FinderItem finderItem = this.f158620i;
        if (finderItem != null) {
            return finderItem;
        }
        C87412m.m108603p("feedObj");
        throw null;
    }

    /* renamed from: u0 */
    public final int mo77343u0(long j) {
        if (j == 0) {
            return -1;
        }
        int i = 0;
        for (C55033u uVar : this.f158618g.f158793d) {
            if (uVar.f154492d.mo89531n2() == j) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: v */
    public C55033u mo77344v(long j) {
        boolean z;
        T t = null;
        if (j == 0) {
            return null;
        }
        Iterator<T> it = this.f158618g.f158793d.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (((C55033u) next).f154492d.mo89531n2() == j) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                t = next;
                break;
            }
        }
        return (C55033u) t;
    }
}
