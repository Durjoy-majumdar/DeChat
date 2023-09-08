package com.tencent.p014mm.plugin.finder.feed;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0751m0;
import cm1.C0768q0;
import cm1.C55031t;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.feed.model.C55776r;
import com.tencent.p014mm.plugin.finder.feed.model.FinderProfileFeedLoader;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.video.FinderVideoCore;
import com.tencent.p014mm.plugin.finder.view.C56597e1;
import com.tencent.p014mm.plugin.finder.view.ContactUninterestEventListener;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import di3.C86312j;
import dp1.C7433e1;
import ef1.C58553c;
import ef1.C58555d;
import er1.C58736i1;
import er1.C58739j4;
import er1.C58784w3;
import er1.C7888v2;
import fe1.C58961d;
import fe1.C58969q;
import fo1.C59264a;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60172g4;
import ht1.C8794p5;
import ht1.C8808v4;
import ht1.C8817y2;
import ht1.C8819z2;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import jp3.C9486a;
import jp3.C9487b;
import jq3.C60905o;
import kf1.C10008v1;
import kf1.C9745g8;
import kf1.C9843l7;
import mf1.C10834k1;
import nj3.C11182m0;
import nj3.C11183n0;
import nj3.C11184p0;
import nj3.C47269o0;
import nj3.C76874e0;
import nj3.C76875f0;
import nj3.C76912y0;
import o40.C61926c;
import p749xh.C66261f3;
import qo3.C77407n;
import rs1.C13133c1;
import rs1.C13442s8;
import rs1.C63545b1;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13605o;
import rx3.C36568h;
import rx3.C36570n;
import te3.C50542nh0;
import te3.C51954xc1;
import tf0.C64916p1;
import tf1.C13908i;
import up1.C37521f;
import vn3.C111562e;
import vp1.C65838f;
import wc3.C15133e0;
import zc1.C66785b;

/* renamed from: com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter */
public final class FinderProfileTimelineContract$ProfileTimelinePresenter implements C59264a<C9745g8>, C9843l7, C10008v1, C9487b<C9486a> {

    /* renamed from: A */
    public Dialog f13135A;

    /* renamed from: d */
    public final MMActivity f13136d;

    /* renamed from: e */
    public final String f13137e;

    /* renamed from: f */
    public final boolean f13138f;

    /* renamed from: g */
    public final long f13139g;

    /* renamed from: h */
    public final String f13140h = "Finder.ProfileTimelinePresenter";

    /* renamed from: i */
    public final C13601g f13141i = C36568h.m40985a(C2549j.f13202d);

    /* renamed from: j */
    public final CopyOnWriteArraySet<C9486a> f13142j = new CopyOnWriteArraySet<>();

    /* renamed from: n */
    public C9745g8 f13143n;

    /* renamed from: o */
    public final C13601g f13144o = C36568h.m40985a(new C2534a(this));

    /* renamed from: p */
    public final C55776r f13145p;

    /* renamed from: q */
    public final C8819z2 f13146q;

    /* renamed from: r */
    public boolean f13147r;

    /* renamed from: s */
    public int f13148s;

    /* renamed from: t */
    public final C15133e0 f13149t;

    /* renamed from: u */
    public final C10834k1 f13150u;

    /* renamed from: v */
    public ContactUninterestEventListener f13151v;

    /* renamed from: w */
    public C58555d f13152w;

    /* renamed from: x */
    public final FinderVideoCore f13153x;

    /* renamed from: y */
    public final C2551x506a2df9 f13154y;

    /* renamed from: z */
    public final C2552x3985ef84 f13155z;

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter$a */
    public static final class C2534a extends C87413o implements C32224a<FinderProfileFeedLoader> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileTimelineContract$ProfileTimelinePresenter f13156d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2534a(FinderProfileTimelineContract$ProfileTimelinePresenter finderProfileTimelineContract$ProfileTimelinePresenter) {
            super(0);
            this.f13156d = finderProfileTimelineContract$ProfileTimelinePresenter;
        }

        public Object invoke() {
            boolean z;
            if (!C111562e.m152091a(this.f13156d.f13136d)) {
                C37521f.f99374d.getClass();
                if (C37521f.f99443k7.mo60266n().intValue() != 1) {
                    z = false;
                    C13908i iVar = C13908i.FEED_PROFILE_TIMELINE;
                    FinderProfileTimelineContract$ProfileTimelinePresenter finderProfileTimelineContract$ProfileTimelinePresenter = this.f13156d;
                    FinderProfileFeedLoader finderProfileFeedLoader = new FinderProfileFeedLoader(iVar, finderProfileTimelineContract$ProfileTimelinePresenter.f13137e, ((C13442s8) C39818r.f106831a.mo62444c(finderProfileTimelineContract$ProfileTimelinePresenter.f13136d).mo75002a(C13442s8.class)).mo12861q3(), false, z, 8, (C8480h) null);
                    FinderProfileTimelineContract$ProfileTimelinePresenter finderProfileTimelineContract$ProfileTimelinePresenter2 = this.f13156d;
                    finderProfileFeedLoader.setCurTopicId(finderProfileTimelineContract$ProfileTimelinePresenter2.f13139g);
                    Intent intent = finderProfileTimelineContract$ProfileTimelinePresenter2.f13136d.getIntent();
                    C87412m.m108593f(intent, "context.intent");
                    finderProfileFeedLoader.initFromCache(intent);
                    return finderProfileFeedLoader;
                }
            }
            z = true;
            C13908i iVar2 = C13908i.FEED_PROFILE_TIMELINE;
            FinderProfileTimelineContract$ProfileTimelinePresenter finderProfileTimelineContract$ProfileTimelinePresenter3 = this.f13156d;
            FinderProfileFeedLoader finderProfileFeedLoader2 = new FinderProfileFeedLoader(iVar2, finderProfileTimelineContract$ProfileTimelinePresenter3.f13137e, ((C13442s8) C39818r.f106831a.mo62444c(finderProfileTimelineContract$ProfileTimelinePresenter3.f13136d).mo75002a(C13442s8.class)).mo12861q3(), false, z, 8, (C8480h) null);
            FinderProfileTimelineContract$ProfileTimelinePresenter finderProfileTimelineContract$ProfileTimelinePresenter22 = this.f13156d;
            finderProfileFeedLoader2.setCurTopicId(finderProfileTimelineContract$ProfileTimelinePresenter22.f13139g);
            Intent intent2 = finderProfileTimelineContract$ProfileTimelinePresenter22.f13136d.getIntent();
            C87412m.m108593f(intent2, "context.intent");
            finderProfileFeedLoader2.initFromCache(intent2);
            return finderProfileFeedLoader2;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter$b */
    public static final class C2535b implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileTimelineContract$ProfileTimelinePresenter f13157d;

        /* renamed from: e */
        public final /* synthetic */ BaseFinderFeed f13158e;

        /* renamed from: f */
        public final /* synthetic */ int f13159f;

        /* renamed from: g */
        public final /* synthetic */ C77407n f13160g;

        /* renamed from: com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter$b$a */
        public static final class C2536a extends C87413o implements C32226l<C13605o<? extends String, ? extends String, ? extends String>, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C76874e0 f13161d;

            /* renamed from: e */
            public final /* synthetic */ BaseFinderFeed f13162e;

            /* renamed from: f */
            public final /* synthetic */ FinderProfileTimelineContract$ProfileTimelinePresenter f13163f;

            /* renamed from: g */
            public final /* synthetic */ C77407n f13164g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2536a(C76874e0 e0Var, BaseFinderFeed baseFinderFeed, FinderProfileTimelineContract$ProfileTimelinePresenter finderProfileTimelineContract$ProfileTimelinePresenter, C77407n nVar) {
                super(1);
                this.f13161d = e0Var;
                this.f13162e = baseFinderFeed;
                this.f13163f = finderProfileTimelineContract$ProfileTimelinePresenter;
                this.f13164g = nVar;
            }

            public Object invoke(Object obj) {
                C13605o oVar = (C13605o) obj;
                C87412m.m108594g(oVar, LocaleUtil.ITALIAN);
                ((ArrayList) this.f13161d.f224704d).clear();
                boolean isNotShareSns = this.f13162e.mo3513o().isNotShareSns();
                if (!isNotShareSns) {
                    this.f13161d.mo107150j(103, this.f13163f.f13136d.getString(C0966R.string.epb), C0966R.raw.bottomsheet_icon_moment, 0, isNotShareSns);
                } else {
                    this.f13161d.mo107150j(103, (CharSequence) oVar.f38558e, C0966R.raw.bottomsheet_icon_moment, 0, isNotShareSns);
                }
                if (this.f13162e.mo3513o().isNotShareConversation()) {
                    C15133e0 e0Var = this.f13163f.f13149t;
                    C77407n nVar = this.f13164g;
                    C76874e0 e0Var2 = nVar.f225732J;
                    C87412m.m108593f(e0Var2, "sheet.zeroLineMenu");
                    e0Var.mo14086LS(nVar, e0Var2);
                }
                FinderProfileTimelineContract$ProfileTimelinePresenter.m2491t(this.f13163f, this.f13164g);
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter$b$b */
        public static final class C2537b extends C87413o implements C32226l<C58784w3.C7912a, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C76874e0 f13165d;

            /* renamed from: e */
            public final /* synthetic */ FinderProfileTimelineContract$ProfileTimelinePresenter f13166e;

            /* renamed from: f */
            public final /* synthetic */ C77407n f13167f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2537b(C76874e0 e0Var, FinderProfileTimelineContract$ProfileTimelinePresenter finderProfileTimelineContract$ProfileTimelinePresenter, C77407n nVar) {
                super(1);
                this.f13165d = e0Var;
                this.f13166e = finderProfileTimelineContract$ProfileTimelinePresenter;
                this.f13167f = nVar;
            }

            public Object invoke(Object obj) {
                C58784w3.C7912a aVar = (C58784w3.C7912a) obj;
                C87412m.m108594g(aVar, "actionMenuInfo");
                if (!aVar.f26590l && this.f13165d.findItem(208) == null) {
                    this.f13165d.mo107150j(208, aVar.f26586h, C0966R.raw.bottomsheet_icon_wework, 0, aVar.f26582d);
                    C58784w3.f168295a.mo83895P1(this.f13166e.f13136d, this.f13167f);
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter$b$c */
        public static final class C2538c extends C87413o implements C32226l<C13605o<? extends String, ? extends String, ? extends String>, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C76874e0 f13168d;

            /* renamed from: e */
            public final /* synthetic */ BaseFinderFeed f13169e;

            /* renamed from: f */
            public final /* synthetic */ FinderProfileTimelineContract$ProfileTimelinePresenter f13170f;

            /* renamed from: g */
            public final /* synthetic */ C77407n f13171g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2538c(C76874e0 e0Var, BaseFinderFeed baseFinderFeed, FinderProfileTimelineContract$ProfileTimelinePresenter finderProfileTimelineContract$ProfileTimelinePresenter, C77407n nVar) {
                super(1);
                this.f13168d = e0Var;
                this.f13169e = baseFinderFeed;
                this.f13170f = finderProfileTimelineContract$ProfileTimelinePresenter;
                this.f13171g = nVar;
            }

            public Object invoke(Object obj) {
                C13605o oVar = (C13605o) obj;
                C87412m.m108594g(oVar, LocaleUtil.ITALIAN);
                ((ArrayList) this.f13168d.f224704d).clear();
                boolean isNotShareSns = this.f13169e.mo3513o().isNotShareSns();
                if (!isNotShareSns) {
                    this.f13168d.mo107150j(103, this.f13170f.f13136d.getString(C0966R.string.epb), C0966R.raw.bottomsheet_icon_moment, 0, isNotShareSns);
                } else {
                    this.f13168d.mo107150j(103, (CharSequence) oVar.f38558e, C0966R.raw.bottomsheet_icon_moment, 0, isNotShareSns);
                }
                if (this.f13169e.mo3513o().isNotShareConversation()) {
                    C15133e0 e0Var = this.f13170f.f13149t;
                    C77407n nVar = this.f13171g;
                    C76874e0 e0Var2 = nVar.f225732J;
                    C87412m.m108593f(e0Var2, "sheet.zeroLineMenu");
                    e0Var.mo14086LS(nVar, e0Var2);
                }
                FinderProfileTimelineContract$ProfileTimelinePresenter.m2491t(this.f13170f, this.f13171g);
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter$b$d */
        public static final class C2539d extends C87413o implements C32226l<C58784w3.C7912a, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C76874e0 f13172d;

            /* renamed from: e */
            public final /* synthetic */ FinderProfileTimelineContract$ProfileTimelinePresenter f13173e;

            /* renamed from: f */
            public final /* synthetic */ C77407n f13174f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2539d(C76874e0 e0Var, FinderProfileTimelineContract$ProfileTimelinePresenter finderProfileTimelineContract$ProfileTimelinePresenter, C77407n nVar) {
                super(1);
                this.f13172d = e0Var;
                this.f13173e = finderProfileTimelineContract$ProfileTimelinePresenter;
                this.f13174f = nVar;
            }

            public Object invoke(Object obj) {
                C58784w3.C7912a aVar = (C58784w3.C7912a) obj;
                C87412m.m108594g(aVar, "actionMenuInfo");
                if (!aVar.f26590l && this.f13172d.findItem(208) == null) {
                    this.f13172d.mo107150j(208, aVar.f26586h, C0966R.raw.bottomsheet_icon_wework, 0, aVar.f26582d);
                    C58784w3.f168295a.mo83895P1(this.f13173e.f13136d, this.f13174f);
                }
                return C13598b0.f38549a;
            }
        }

        public C2535b(FinderProfileTimelineContract$ProfileTimelinePresenter finderProfileTimelineContract$ProfileTimelinePresenter, BaseFinderFeed baseFinderFeed, int i, C77407n nVar) {
            this.f13157d = finderProfileTimelineContract$ProfileTimelinePresenter;
            this.f13158e = baseFinderFeed;
            this.f13159f = i;
            this.f13160g = nVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0114, code lost:
            r1 = r1.video_tmpl_info;
         */
        /* JADX WARNING: Removed duplicated region for block: B:270:0x0762  */
        /* JADX WARNING: Removed duplicated region for block: B:271:0x0765  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onCreateMMMenu(nj3.C76874e0 r33) {
            /*
                r32 = this;
                r0 = r32
                r7 = r33
                java.lang.Class<da0.e> r8 = da0.C58247e.class
                java.lang.Class<rs1.s8> r9 = rs1.C13442s8.class
                java.lang.Class<dp1.y0> r10 = dp1.C58417y0.class
                com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter r1 = r0.f13157d
                boolean r2 = r1.f13147r
                java.lang.String r11 = "templateId"
                java.lang.String r12 = "if (count > 0) context.g…share_use_same_template))"
                r16 = 2131829900(0x7f11248c, float:1.9292782E38)
                r17 = -1
                r14 = 1
                java.lang.Integer r18 = java.lang.Integer.valueOf(r14)
                r13 = 0
                java.lang.Integer r19 = java.lang.Integer.valueOf(r13)
                java.lang.String r13 = "getService(FinderReportLogic::class.java)"
                java.lang.String r14 = "menu"
                if (r2 != 0) goto L_0x038a
                er1.w3 r2 = er1.C58784w3.f168295a
                com.tencent.mm.ui.MMActivity r3 = r1.f13136d
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r4 = r0.f13158e
                r23 = 0
                com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter$b$a r5 = new com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter$b$a
                qo3.n r6 = r0.f13160g
                r5.<init>(r7, r4, r1, r6)
                com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter$b$b r1 = new com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter$b$b
                com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter r6 = r0.f13157d
                qo3.n r15 = r0.f13160g
                r1.<init>(r7, r6, r15)
                r26 = 4
                r27 = 0
                r20 = r2
                r21 = r3
                r22 = r4
                r24 = r5
                r25 = r1
                er1.w3$a r15 = er1.C58784w3.m68431K(r20, r21, r22, r23, r24, r25, r26, r27)
                boolean r6 = r15.f26579a
                boolean r5 = r15.f26580b
                java.lang.String r3 = r15.f26583e
                java.lang.String r4 = r15.f26584f
                boolean r1 = r15.f26587i
                if (r1 != 0) goto L_0x0086
                r20 = 102(0x66, float:1.43E-43)
                r21 = 2131755655(0x7f100287, float:1.9142195E38)
                com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter r1 = r0.f13157d
                com.tencent.mm.ui.MMActivity r1 = r1.f13136d
                android.content.res.Resources r1 = r1.getResources()
                r22 = r2
                r2 = 2131099756(0x7f06006c, float:1.7811874E38)
                int r23 = r1.getColor(r2)
                r1 = r33
                r30 = r22
                r2 = r20
                r20 = r4
                r4 = r21
                r21 = r5
                r5 = r23
                r1.mo107150j(r2, r3, r4, r5, r6)
                goto L_0x008c
            L_0x0086:
                r30 = r2
                r20 = r4
                r21 = r5
            L_0x008c:
                boolean r1 = r15.f26588j
                if (r1 != 0) goto L_0x009f
                r2 = 103(0x67, float:1.44E-43)
                r4 = 2131755285(0x7f100115, float:1.9141445E38)
                r5 = 0
                r1 = r33
                r3 = r20
                r6 = r21
                r1.mo107150j(r2, r3, r4, r5, r6)
            L_0x009f:
                boolean r1 = r15.f26590l
                if (r1 != 0) goto L_0x00b2
                r2 = 208(0xd0, float:2.91E-43)
                java.lang.String r3 = r15.f26586h
                r4 = 2131755296(0x7f100120, float:1.9141467E38)
                r5 = 0
                boolean r6 = r15.f26582d
                r1 = r33
                r1.mo107150j(r2, r3, r4, r5, r6)
            L_0x00b2:
                up1.f r1 = up1.C37521f.f99374d
                r1.getClass()
                pe1.c<java.lang.Integer> r1 = up1.C37521f.f99190H7
                java.lang.Object r1 = r1.mo60266n()
                java.lang.Number r1 = (java.lang.Number) r1
                int r1 = r1.intValue()
                r2 = 1
                if (r1 != r2) goto L_0x0106
                boolean r1 = r15.f26589k
                if (r1 != 0) goto L_0x0106
                r2 = 104(0x68, float:1.46E-43)
                com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter r1 = r0.f13157d
                com.tencent.mm.ui.MMActivity r1 = r1.f13136d
                r3 = 2131825615(0x7f1113cf, float:1.9284091E38)
                java.lang.String r3 = r1.getString(r3)
                r4 = 2131755278(0x7f10010e, float:1.914143E38)
                r5 = 0
                boolean r6 = r15.f26591m
                r1 = r33
                r1.mo107150j(r2, r3, r4, r5, r6)
                di3.d r1 = di3.C86312j.m106911c(r10)
                gy3.C87412m.m108593f(r1, r13)
                r20 = r1
                dp1.y0 r20 = (dp1.C58417y0) r20
                com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter r1 = r0.f13157d
                com.tencent.mm.ui.MMActivity r1 = r1.f13136d
                r22 = 0
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r0.f13158e
                long r23 = r2.getItemId()
                boolean r2 = r15.f26591m
                r26 = 2
                r27 = 0
                r21 = r1
                r25 = r2
                dp1.C58417y0.Qy0(r20, r21, r22, r23, r25, r26, r27)
            L_0x0106:
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f13158e
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r1 = r1.objectDesc
                if (r1 == 0) goto L_0x011b
                te3.ap1 r1 = r1.video_tmpl_info
                if (r1 == 0) goto L_0x011b
                java.lang.String r1 = r1.f182115d
                goto L_0x011c
            L_0x011b:
                r1 = 0
            L_0x011c:
                if (r1 == 0) goto L_0x0127
                int r1 = r1.length()
                if (r1 != 0) goto L_0x0125
                goto L_0x0127
            L_0x0125:
                r1 = 0
                goto L_0x0128
            L_0x0127:
                r1 = 1
            L_0x0128:
                if (r1 != 0) goto L_0x027b
                di3.d r1 = di3.C86312j.m106911c(r8)
                da0.e r1 = (da0.C58247e) r1
                da0.b r1 = r1.yf0()
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r0.f13158e
                com.tencent.mm.plugin.finder.storage.FinderItem r2 = r2.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r2 = r2.getFeedObject()
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r2 = r2.objectDesc
                if (r2 == 0) goto L_0x014d
                te3.ap1 r2 = r2.video_tmpl_info
                if (r2 == 0) goto L_0x014d
                te3.yq4 r2 = r2.f182120i
                if (r2 == 0) goto L_0x014d
                int r2 = r2.f145473f
                goto L_0x014e
            L_0x014d:
                r2 = 0
            L_0x014e:
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r0.f13158e
                com.tencent.mm.plugin.finder.storage.FinderItem r3 = r3.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r3 = r3.getFeedObject()
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r3 = r3.objectDesc
                if (r3 == 0) goto L_0x0167
                te3.ap1 r3 = r3.video_tmpl_info
                if (r3 == 0) goto L_0x0167
                te3.yq4 r3 = r3.f182120i
                if (r3 == 0) goto L_0x0167
                int r3 = r3.f145474g
                goto L_0x0168
            L_0x0167:
                r3 = 0
            L_0x0168:
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r4 = r0.f13158e
                com.tencent.mm.plugin.finder.storage.FinderItem r4 = r4.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r4 = r4.getFeedObject()
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r4 = r4.objectDesc
                if (r4 == 0) goto L_0x017d
                te3.ap1 r4 = r4.video_tmpl_info
                if (r4 == 0) goto L_0x017d
                int r4 = r4.f182116e
                goto L_0x017e
            L_0x017d:
                r4 = -1
            L_0x017e:
                boolean r1 = r1.mo8428c(r2, r3, r4)
                if (r1 == 0) goto L_0x027b
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f13158e
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r1 = r1.objectDesc
                if (r1 == 0) goto L_0x0199
                te3.ap1 r1 = r1.video_tmpl_info
                if (r1 == 0) goto L_0x0199
                int r1 = r1.f182118g
                goto L_0x019a
            L_0x0199:
                r1 = 0
            L_0x019a:
                if (r1 <= 0) goto L_0x01f1
                com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter r2 = r0.f13157d
                com.tencent.mm.ui.MMActivity r2 = r2.f13136d
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r0.f13158e
                com.tencent.mm.plugin.finder.storage.FinderItem r3 = r3.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r3 = r3.getFeedObject()
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r3 = r3.objectDesc
                if (r3 == 0) goto L_0x01b9
                te3.ap1 r3 = r3.video_tmpl_info
                if (r3 == 0) goto L_0x01b9
                int r3 = r3.f182116e
                r4 = 2
                if (r3 != r4) goto L_0x01b9
                r3 = 1
                goto L_0x01ba
            L_0x01b9:
                r3 = 0
            L_0x01ba:
                if (r3 == 0) goto L_0x01c1
                r3 = 1
                r13 = 2131829893(0x7f112485, float:1.9292768E38)
                goto L_0x01c5
            L_0x01c1:
                r3 = 1
                r13 = 2131829901(0x7f11248d, float:1.9292784E38)
            L_0x01c5:
                java.lang.Object[] r4 = new java.lang.Object[r3]
                r3 = 99999(0x1869f, float:1.40128E-40)
                if (r1 <= r3) goto L_0x01dc
                com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter r1 = r0.f13157d
                com.tencent.mm.ui.MMActivity r1 = r1.f13136d
                r3 = 2131826812(0x7f11187c, float:1.9286519E38)
                java.lang.String r1 = r1.getString(r3)
                java.lang.String r1 = java.lang.String.valueOf(r1)
                goto L_0x01e9
            L_0x01dc:
                r3 = 9999(0x270f, float:1.4012E-41)
                if (r1 <= r3) goto L_0x01e5
                java.lang.String r1 = er1.C58784w3.m68432N1(r1)
                goto L_0x01e9
            L_0x01e5:
                java.lang.String r1 = java.lang.String.valueOf(r1)
            L_0x01e9:
                r3 = 0
                r4[r3] = r1
                java.lang.String r1 = r2.getString(r13, r4)
                goto L_0x021c
            L_0x01f1:
                com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter r1 = r0.f13157d
                com.tencent.mm.ui.MMActivity r1 = r1.f13136d
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r0.f13158e
                com.tencent.mm.plugin.finder.storage.FinderItem r2 = r2.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r2 = r2.getFeedObject()
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r2 = r2.objectDesc
                if (r2 == 0) goto L_0x020e
                te3.ap1 r2 = r2.video_tmpl_info
                if (r2 == 0) goto L_0x020e
                int r2 = r2.f182116e
                r3 = 2
                if (r2 != r3) goto L_0x020e
                r2 = 1
                goto L_0x020f
            L_0x020e:
                r2 = 0
            L_0x020f:
                if (r2 == 0) goto L_0x0215
                r15 = 2131829892(0x7f112484, float:1.9292766E38)
                goto L_0x0218
            L_0x0215:
                r15 = 2131829900(0x7f11248c, float:1.9292782E38)
            L_0x0218:
                java.lang.String r1 = r1.getString(r15)
            L_0x021c:
                r3 = r1
                gy3.C87412m.m108593f(r3, r12)
                r2 = 118(0x76, float:1.65E-43)
                r4 = 2131233401(0x7f080a79, float:1.8082938E38)
                com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter r1 = r0.f13157d
                com.tencent.mm.ui.MMActivity r1 = r1.f13136d
                android.content.res.Resources r1 = r1.getResources()
                r5 = 2131099756(0x7f06006c, float:1.7811874E38)
                int r5 = r1.getColor(r5)
                r6 = 0
                r1 = r33
                r1.mo107150j(r2, r3, r4, r5, r6)
                bl3.r r1 = bl3.C39818r.f106831a
                com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter r2 = r0.f13157d
                com.tencent.mm.ui.MMActivity r2 = r2.f13136d
                bl3.r$a r1 = r1.mo62444c(r2)
                androidx.lifecycle.i0 r1 = r1.mo75002a(r9)
                rs1.s8 r1 = (rs1.C13442s8) r1
                te3.hj1 r1 = r1.mo12861q3()
                dp1.f2 r2 = dp1.C7435f2.f25626a
                org.json.JSONObject r3 = new org.json.JSONObject
                r3.<init>()
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r4 = r0.f13158e
                com.tencent.mm.plugin.finder.storage.FinderItem r4 = r4.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r4 = r4.getFeedObject()
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r4 = r4.objectDesc
                if (r4 == 0) goto L_0x026a
                te3.ap1 r4 = r4.video_tmpl_info
                if (r4 == 0) goto L_0x026a
                java.lang.String r4 = r4.f182115d
                goto L_0x026b
            L_0x026a:
                r4 = 0
            L_0x026b:
                if (r4 != 0) goto L_0x026f
                r4 = r19
            L_0x026f:
                r3.put(r11, r4)
                rx3.b0 r4 = rx3.C13598b0.f38549a
                java.lang.String r4 = "shoot_same_video"
                r5 = 0
                r2.mo8580d(r1, r4, r5, r3)
            L_0x027b:
                er1.i1 r8 = er1.C58736i1.f168173a
                com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter r1 = r0.f13157d
                com.tencent.mm.ui.MMActivity r1 = r1.f13136d
                gy3.C87412m.m108593f(r7, r14)
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r0.f13158e
                r8.mo83664j(r1, r7, r2)
                pe1.c<java.lang.Integer> r1 = up1.C37521f.f99337Y4
                up1.f$h1 r1 = (up1.C37521f.C37530h1) r1
                r1.getClass()
                int r1 = r18.intValue()
                r2 = 1
                if (r1 != r2) goto L_0x02ef
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f13158e
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
                r9 = r30
                boolean r1 = r9.mo83939j(r1)
                if (r1 == 0) goto L_0x02f1
                di3.d r1 = di3.C86312j.m106911c(r10)
                dp1.y0 r1 = (dp1.C58417y0) r1
                com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter r2 = r0.f13157d
                com.tencent.mm.ui.MMActivity r2 = r2.f13136d
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r0.f13158e
                long r3 = r3.getItemId()
                r1.Vy0(r2, r3)
                r2 = 113(0x71, float:1.58E-43)
                com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter r1 = r0.f13157d
                com.tencent.mm.ui.MMActivity r1 = r1.f13136d
                r15 = 2131829896(0x7f112488, float:1.9292774E38)
                java.lang.String r3 = r1.getString(r15)
                r4 = 2131757017(0x7f1007d9, float:1.9144958E38)
                com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter r1 = r0.f13157d
                com.tencent.mm.ui.MMActivity r1 = r1.f13136d
                android.content.res.Resources r1 = r1.getResources()
                r6 = 2131099737(0x7f060059, float:1.7811836E38)
                int r5 = r1.getColor(r6)
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f13158e
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
                boolean r6 = r9.mo83854A(r1)
                r1 = r33
                r1.mo107150j(r2, r3, r4, r5, r6)
                goto L_0x02f1
            L_0x02ef:
                r9 = r30
            L_0x02f1:
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f13158e
                boolean r1 = r9.mo83933h(r1)
                if (r1 == 0) goto L_0x037f
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f13158e
                if (r1 == 0) goto L_0x0318
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
                if (r1 == 0) goto L_0x0318
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f13158e
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.field_finderObject
                if (r1 == 0) goto L_0x0318
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f13158e
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.field_finderObject
                int r1 = r1.ringtone_count
                goto L_0x0319
            L_0x0318:
                r1 = 0
            L_0x0319:
                if (r1 == 0) goto L_0x0355
                int r2 = r9.mo83977x0()
                if (r1 < r2) goto L_0x0355
                r2 = 99999(0x1869f, float:1.40128E-40)
                if (r1 <= r2) goto L_0x0336
                com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter r1 = r0.f13157d
                com.tencent.mm.ui.MMActivity r1 = r1.f13136d
                r2 = 2131826812(0x7f11187c, float:1.9286519E38)
                java.lang.String r1 = r1.getString(r2)
                java.lang.String r1 = java.lang.String.valueOf(r1)
                goto L_0x0343
            L_0x0336:
                r2 = 9999(0x270f, float:1.4012E-41)
                if (r1 <= r2) goto L_0x033f
                java.lang.String r1 = er1.C58784w3.m68432N1(r1)
                goto L_0x0343
            L_0x033f:
                java.lang.String r1 = java.lang.String.valueOf(r1)
            L_0x0343:
                com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter r2 = r0.f13157d
                com.tencent.mm.ui.MMActivity r2 = r2.f13136d
                r3 = 1
                java.lang.Object[] r4 = new java.lang.Object[r3]
                r3 = 0
                r4[r3] = r1
                r5 = 2131826564(0x7f111784, float:1.9286016E38)
                java.lang.String r1 = r2.getString(r5, r4)
                goto L_0x0360
            L_0x0355:
                com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter r1 = r0.f13157d
                com.tencent.mm.ui.MMActivity r1 = r1.f13136d
                r4 = 2131829889(0x7f112481, float:1.929276E38)
                java.lang.String r1 = r1.getString(r4)
            L_0x0360:
                r3 = r1
                java.lang.String r1 = "if(count != 0 && count >…le)\n                    }"
                gy3.C87412m.m108593f(r3, r1)
                r2 = 114(0x72, float:1.6E-43)
                r4 = 2131756151(0x7f100477, float:1.9143201E38)
                r5 = 0
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f13158e
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
                boolean r6 = r9.mo83982z(r1)
                r1 = r33
                r1.mo107150j(r2, r3, r4, r5, r6)
            L_0x037f:
                com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter r1 = r0.f13157d
                com.tencent.mm.ui.MMActivity r1 = r1.f13136d
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r0.f13158e
                r8.mo83662h(r1, r2, r7)
                goto L_0x0748
            L_0x038a:
                r4 = 2131829889(0x7f112481, float:1.929276E38)
                r5 = 2131826564(0x7f111784, float:1.9286016E38)
                r6 = 2131099737(0x7f060059, float:1.7811836E38)
                r15 = 2131829896(0x7f112488, float:1.9292774E38)
                boolean r1 = r33.mo107176v()
                if (r1 == 0) goto L_0x0748
                er1.w3 r3 = er1.C58784w3.f168295a
                com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter r1 = r0.f13157d
                com.tencent.mm.ui.MMActivity r2 = r1.f13136d
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r4 = r0.f13158e
                r23 = 0
                com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter$b$c r5 = new com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter$b$c
                qo3.n r6 = r0.f13160g
                r5.<init>(r7, r4, r1, r6)
                com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter$b$d r1 = new com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter$b$d
                com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter r6 = r0.f13157d
                qo3.n r15 = r0.f13160g
                r1.<init>(r7, r6, r15)
                r26 = 4
                r27 = 0
                r20 = r3
                r21 = r2
                r22 = r4
                r24 = r5
                r25 = r1
                er1.w3$a r15 = er1.C58784w3.m68431K(r20, r21, r22, r23, r24, r25, r26, r27)
                boolean r6 = r15.f26579a
                boolean r5 = r15.f26580b
                java.lang.String r4 = r15.f26583e
                java.lang.String r2 = r15.f26584f
                boolean r1 = r15.f26587i
                if (r1 != 0) goto L_0x0400
                r20 = 102(0x66, float:1.43E-43)
                r21 = 2131755655(0x7f100287, float:1.9142195E38)
                android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                android.content.res.Resources r1 = r1.getResources()
                r22 = r2
                r2 = 2131099756(0x7f06006c, float:1.7811874E38)
                int r23 = r1.getColor(r2)
                r1 = r33
                r2 = r20
                r31 = r3
                r3 = r4
                r4 = r21
                r20 = r5
                r5 = r23
                r21 = r14
                r14 = 2131099737(0x7f060059, float:1.7811836E38)
                r1.mo107150j(r2, r3, r4, r5, r6)
                goto L_0x040b
            L_0x0400:
                r22 = r2
                r31 = r3
                r20 = r5
                r21 = r14
                r14 = 2131099737(0x7f060059, float:1.7811836E38)
            L_0x040b:
                boolean r1 = r15.f26588j
                if (r1 != 0) goto L_0x041e
                r2 = 103(0x67, float:1.44E-43)
                r4 = 2131755285(0x7f100115, float:1.9141445E38)
                r5 = 0
                r1 = r33
                r3 = r22
                r6 = r20
                r1.mo107150j(r2, r3, r4, r5, r6)
            L_0x041e:
                boolean r1 = r15.f26590l
                if (r1 != 0) goto L_0x0431
                r2 = 208(0xd0, float:2.91E-43)
                java.lang.String r3 = r15.f26586h
                r4 = 2131755296(0x7f100120, float:1.9141467E38)
                r5 = 0
                boolean r6 = r15.f26582d
                r1 = r33
                r1.mo107150j(r2, r3, r4, r5, r6)
            L_0x0431:
                up1.f r1 = up1.C37521f.f99374d
                r1.getClass()
                pe1.c<java.lang.Integer> r1 = up1.C37521f.f99190H7
                java.lang.Object r1 = r1.mo60266n()
                java.lang.Number r1 = (java.lang.Number) r1
                int r1 = r1.intValue()
                r2 = 1
                if (r1 != r2) goto L_0x0485
                boolean r1 = r15.f26589k
                if (r1 != 0) goto L_0x0485
                r2 = 104(0x68, float:1.46E-43)
                com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter r1 = r0.f13157d
                com.tencent.mm.ui.MMActivity r1 = r1.f13136d
                r3 = 2131825615(0x7f1113cf, float:1.9284091E38)
                java.lang.String r3 = r1.getString(r3)
                r4 = 2131755278(0x7f10010e, float:1.914143E38)
                r5 = 0
                boolean r6 = r15.f26591m
                r1 = r33
                r1.mo107150j(r2, r3, r4, r5, r6)
                di3.d r1 = di3.C86312j.m106911c(r10)
                gy3.C87412m.m108593f(r1, r13)
                r22 = r1
                dp1.y0 r22 = (dp1.C58417y0) r22
                com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter r1 = r0.f13157d
                com.tencent.mm.ui.MMActivity r1 = r1.f13136d
                r24 = 0
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r0.f13158e
                long r25 = r2.getItemId()
                boolean r2 = r15.f26591m
                r28 = 2
                r29 = 0
                r23 = r1
                r27 = r2
                dp1.C58417y0.Qy0(r22, r23, r24, r25, r27, r28, r29)
            L_0x0485:
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f13158e
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r1 = r1.objectDesc
                if (r1 == 0) goto L_0x049a
                te3.ap1 r1 = r1.video_tmpl_info
                if (r1 == 0) goto L_0x049a
                java.lang.String r1 = r1.f182115d
                goto L_0x049b
            L_0x049a:
                r1 = 0
            L_0x049b:
                if (r1 == 0) goto L_0x04a6
                int r1 = r1.length()
                if (r1 != 0) goto L_0x04a4
                goto L_0x04a6
            L_0x04a4:
                r1 = 0
                goto L_0x04a7
            L_0x04a6:
                r1 = 1
            L_0x04a7:
                if (r1 != 0) goto L_0x05fa
                di3.d r1 = di3.C86312j.m106911c(r8)
                da0.e r1 = (da0.C58247e) r1
                da0.b r1 = r1.yf0()
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r0.f13158e
                com.tencent.mm.plugin.finder.storage.FinderItem r2 = r2.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r2 = r2.getFeedObject()
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r2 = r2.objectDesc
                if (r2 == 0) goto L_0x04cc
                te3.ap1 r2 = r2.video_tmpl_info
                if (r2 == 0) goto L_0x04cc
                te3.yq4 r2 = r2.f182120i
                if (r2 == 0) goto L_0x04cc
                int r2 = r2.f145473f
                goto L_0x04cd
            L_0x04cc:
                r2 = 0
            L_0x04cd:
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r0.f13158e
                com.tencent.mm.plugin.finder.storage.FinderItem r3 = r3.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r3 = r3.getFeedObject()
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r3 = r3.objectDesc
                if (r3 == 0) goto L_0x04e6
                te3.ap1 r3 = r3.video_tmpl_info
                if (r3 == 0) goto L_0x04e6
                te3.yq4 r3 = r3.f182120i
                if (r3 == 0) goto L_0x04e6
                int r3 = r3.f145474g
                goto L_0x04e7
            L_0x04e6:
                r3 = 0
            L_0x04e7:
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r4 = r0.f13158e
                com.tencent.mm.plugin.finder.storage.FinderItem r4 = r4.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r4 = r4.getFeedObject()
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r4 = r4.objectDesc
                if (r4 == 0) goto L_0x04fc
                te3.ap1 r4 = r4.video_tmpl_info
                if (r4 == 0) goto L_0x04fc
                int r4 = r4.f182116e
                goto L_0x04fd
            L_0x04fc:
                r4 = -1
            L_0x04fd:
                boolean r1 = r1.mo8428c(r2, r3, r4)
                if (r1 == 0) goto L_0x05fa
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f13158e
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r1 = r1.objectDesc
                if (r1 == 0) goto L_0x0518
                te3.ap1 r1 = r1.video_tmpl_info
                if (r1 == 0) goto L_0x0518
                int r1 = r1.f182118g
                goto L_0x0519
            L_0x0518:
                r1 = 0
            L_0x0519:
                if (r1 <= 0) goto L_0x0570
                com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter r2 = r0.f13157d
                com.tencent.mm.ui.MMActivity r2 = r2.f13136d
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r0.f13158e
                com.tencent.mm.plugin.finder.storage.FinderItem r3 = r3.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r3 = r3.getFeedObject()
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r3 = r3.objectDesc
                if (r3 == 0) goto L_0x0538
                te3.ap1 r3 = r3.video_tmpl_info
                if (r3 == 0) goto L_0x0538
                int r3 = r3.f182116e
                r4 = 2
                if (r3 != r4) goto L_0x0538
                r3 = 1
                goto L_0x0539
            L_0x0538:
                r3 = 0
            L_0x0539:
                if (r3 == 0) goto L_0x0540
                r3 = 1
                r13 = 2131829893(0x7f112485, float:1.9292768E38)
                goto L_0x0544
            L_0x0540:
                r3 = 1
                r13 = 2131829901(0x7f11248d, float:1.9292784E38)
            L_0x0544:
                java.lang.Object[] r4 = new java.lang.Object[r3]
                r3 = 99999(0x1869f, float:1.40128E-40)
                if (r1 <= r3) goto L_0x055b
                com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter r1 = r0.f13157d
                com.tencent.mm.ui.MMActivity r1 = r1.f13136d
                r3 = 2131826812(0x7f11187c, float:1.9286519E38)
                java.lang.String r1 = r1.getString(r3)
                java.lang.String r1 = java.lang.String.valueOf(r1)
                goto L_0x0568
            L_0x055b:
                r3 = 9999(0x270f, float:1.4012E-41)
                if (r1 <= r3) goto L_0x0564
                java.lang.String r1 = er1.C58784w3.m68432N1(r1)
                goto L_0x0568
            L_0x0564:
                java.lang.String r1 = java.lang.String.valueOf(r1)
            L_0x0568:
                r3 = 0
                r4[r3] = r1
                java.lang.String r1 = r2.getString(r13, r4)
                goto L_0x059b
            L_0x0570:
                com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter r1 = r0.f13157d
                com.tencent.mm.ui.MMActivity r1 = r1.f13136d
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r0.f13158e
                com.tencent.mm.plugin.finder.storage.FinderItem r2 = r2.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r2 = r2.getFeedObject()
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r2 = r2.objectDesc
                if (r2 == 0) goto L_0x058d
                te3.ap1 r2 = r2.video_tmpl_info
                if (r2 == 0) goto L_0x058d
                int r2 = r2.f182116e
                r3 = 2
                if (r2 != r3) goto L_0x058d
                r2 = 1
                goto L_0x058e
            L_0x058d:
                r2 = 0
            L_0x058e:
                if (r2 == 0) goto L_0x0594
                r15 = 2131829892(0x7f112484, float:1.9292766E38)
                goto L_0x0597
            L_0x0594:
                r15 = 2131829900(0x7f11248c, float:1.9292782E38)
            L_0x0597:
                java.lang.String r1 = r1.getString(r15)
            L_0x059b:
                r3 = r1
                gy3.C87412m.m108593f(r3, r12)
                r2 = 118(0x76, float:1.65E-43)
                r4 = 2131233401(0x7f080a79, float:1.8082938E38)
                com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter r1 = r0.f13157d
                com.tencent.mm.ui.MMActivity r1 = r1.f13136d
                android.content.res.Resources r1 = r1.getResources()
                r5 = 2131099756(0x7f06006c, float:1.7811874E38)
                int r5 = r1.getColor(r5)
                r6 = 0
                r1 = r33
                r1.mo107150j(r2, r3, r4, r5, r6)
                bl3.r r1 = bl3.C39818r.f106831a
                com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter r2 = r0.f13157d
                com.tencent.mm.ui.MMActivity r2 = r2.f13136d
                bl3.r$a r1 = r1.mo62444c(r2)
                androidx.lifecycle.i0 r1 = r1.mo75002a(r9)
                rs1.s8 r1 = (rs1.C13442s8) r1
                te3.hj1 r1 = r1.mo12861q3()
                dp1.f2 r2 = dp1.C7435f2.f25626a
                org.json.JSONObject r3 = new org.json.JSONObject
                r3.<init>()
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r4 = r0.f13158e
                com.tencent.mm.plugin.finder.storage.FinderItem r4 = r4.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r4 = r4.getFeedObject()
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r4 = r4.objectDesc
                if (r4 == 0) goto L_0x05e9
                te3.ap1 r4 = r4.video_tmpl_info
                if (r4 == 0) goto L_0x05e9
                java.lang.String r4 = r4.f182115d
                goto L_0x05ea
            L_0x05e9:
                r4 = 0
            L_0x05ea:
                if (r4 != 0) goto L_0x05ee
                r4 = r19
            L_0x05ee:
                r3.put(r11, r4)
                rx3.b0 r4 = rx3.C13598b0.f38549a
                java.lang.String r4 = "shoot_same_video"
                r5 = 0
                r2.mo8580d(r1, r4, r5, r3)
            L_0x05fa:
                er1.i1 r8 = er1.C58736i1.f168173a
                com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter r1 = r0.f13157d
                com.tencent.mm.ui.MMActivity r1 = r1.f13136d
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r0.f13158e
                r8.mo83664j(r1, r7, r2)
                pe1.c<java.lang.Integer> r1 = up1.C37521f.f99337Y4
                up1.f$h1 r1 = (up1.C37521f.C37530h1) r1
                r1.getClass()
                int r1 = r18.intValue()
                r2 = 1
                if (r1 != r2) goto L_0x0668
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f13158e
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
                r11 = r31
                boolean r1 = r11.mo83939j(r1)
                if (r1 == 0) goto L_0x066a
                di3.d r1 = di3.C86312j.m106911c(r10)
                dp1.y0 r1 = (dp1.C58417y0) r1
                com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter r2 = r0.f13157d
                com.tencent.mm.ui.MMActivity r2 = r2.f13136d
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r0.f13158e
                long r3 = r3.getItemId()
                r1.Vy0(r2, r3)
                r2 = 113(0x71, float:1.58E-43)
                com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter r1 = r0.f13157d
                com.tencent.mm.ui.MMActivity r1 = r1.f13136d
                r3 = 2131829896(0x7f112488, float:1.9292774E38)
                java.lang.String r3 = r1.getString(r3)
                r4 = 2131757017(0x7f1007d9, float:1.9144958E38)
                com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter r1 = r0.f13157d
                com.tencent.mm.ui.MMActivity r1 = r1.f13136d
                android.content.res.Resources r1 = r1.getResources()
                int r5 = r1.getColor(r14)
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f13158e
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
                boolean r6 = r11.mo83854A(r1)
                r1 = r33
                r1.mo107150j(r2, r3, r4, r5, r6)
                goto L_0x066a
            L_0x0668:
                r11 = r31
            L_0x066a:
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f13158e
                boolean r1 = r11.mo83933h(r1)
                if (r1 == 0) goto L_0x06f8
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f13158e
                if (r1 == 0) goto L_0x0691
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
                if (r1 == 0) goto L_0x0691
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f13158e
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.field_finderObject
                if (r1 == 0) goto L_0x0691
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f13158e
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.field_finderObject
                int r1 = r1.ringtone_count
                goto L_0x0692
            L_0x0691:
                r1 = 0
            L_0x0692:
                if (r1 == 0) goto L_0x06ce
                int r2 = r11.mo83977x0()
                if (r1 < r2) goto L_0x06ce
                r2 = 99999(0x1869f, float:1.40128E-40)
                if (r1 <= r2) goto L_0x06af
                com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter r1 = r0.f13157d
                com.tencent.mm.ui.MMActivity r1 = r1.f13136d
                r2 = 2131826812(0x7f11187c, float:1.9286519E38)
                java.lang.String r1 = r1.getString(r2)
                java.lang.String r1 = java.lang.String.valueOf(r1)
                goto L_0x06bc
            L_0x06af:
                r2 = 9999(0x270f, float:1.4012E-41)
                if (r1 <= r2) goto L_0x06b8
                java.lang.String r1 = er1.C58784w3.m68432N1(r1)
                goto L_0x06bc
            L_0x06b8:
                java.lang.String r1 = java.lang.String.valueOf(r1)
            L_0x06bc:
                com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter r2 = r0.f13157d
                com.tencent.mm.ui.MMActivity r2 = r2.f13136d
                r3 = 1
                java.lang.Object[] r4 = new java.lang.Object[r3]
                r3 = 0
                r4[r3] = r1
                r1 = 2131826564(0x7f111784, float:1.9286016E38)
                java.lang.String r1 = r2.getString(r1, r4)
                goto L_0x06d9
            L_0x06ce:
                com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter r1 = r0.f13157d
                com.tencent.mm.ui.MMActivity r1 = r1.f13136d
                r2 = 2131829889(0x7f112481, float:1.929276E38)
                java.lang.String r1 = r1.getString(r2)
            L_0x06d9:
                r3 = r1
                java.lang.String r1 = "if(count != 0 && count >…                        }"
                gy3.C87412m.m108593f(r3, r1)
                r2 = 114(0x72, float:1.6E-43)
                r4 = 2131756151(0x7f100477, float:1.9143201E38)
                r5 = 0
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f13158e
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
                boolean r6 = r11.mo83982z(r1)
                r1 = r33
                r1.mo107150j(r2, r3, r4, r5, r6)
            L_0x06f8:
                com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter r1 = r0.f13157d
                com.tencent.mm.ui.MMActivity r1 = r1.f13136d
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r0.f13158e
                r8.mo83662h(r1, r2, r7)
                bl3.r r1 = bl3.C39818r.f106831a
                com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter r2 = r0.f13157d
                com.tencent.mm.ui.MMActivity r2 = r2.f13136d
                bl3.r$a r1 = r1.mo62444c(r2)
                androidx.lifecycle.i0 r1 = r1.mo75002a(r9)
                rs1.s8 r1 = (rs1.C13442s8) r1
                te3.hj1 r1 = r1.mo12861q3()
                com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter r2 = r0.f13157d
                int r3 = r0.f13159f
                r2.getClass()
                c30.g r2 = new c30.g
                r2.<init>()
                java.lang.String r4 = "forward"
                java.lang.String r5 = "tridot"
                r6 = 1
                if (r3 != r6) goto L_0x072b
                r3 = r4
                goto L_0x072c
            L_0x072b:
                r3 = r5
            L_0x072c:
                java.lang.String r8 = "ref_eid"
                r2.put(r8, r3)
                dp1.f2 r3 = dp1.C7435f2.f25626a
                java.lang.String r8 = "delete"
                r9 = 0
                r3.mo8580d(r1, r8, r9, r2)
                int r2 = r0.f13159f
                if (r2 != r6) goto L_0x073e
                goto L_0x073f
            L_0x073e:
                r4 = r5
            L_0x073f:
                c30.g r2 = new c30.g
                r2.<init>()
                r3.mo8580d(r1, r4, r6, r2)
                goto L_0x074a
            L_0x0748:
                r21 = r14
            L_0x074a:
                di3.d r1 = di3.C86312j.m106911c(r10)
                dp1.y0 r1 = (dp1.C58417y0) r1
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r0.f13158e
                long r2 = r2.getItemId()
                rs1.s8$a r4 = rs1.C13442s8.f38060Q0
                com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter r5 = r0.f13157d
                com.tencent.mm.ui.MMActivity r5 = r5.f13136d
                rs1.s8 r5 = r4.mo12873f(r5)
                if (r5 == 0) goto L_0x0765
                int r5 = r5.f38096i
                goto L_0x0766
            L_0x0765:
                r5 = 0
            L_0x0766:
                r1.mo83275AJ(r2, r5)
                com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter r1 = r0.f13157d
                com.tencent.mm.ui.MMActivity r1 = r1.f13136d
                rs1.s8 r1 = r4.mo12873f(r1)
                if (r1 == 0) goto L_0x078e
                r2 = 0
                r3 = 1
                r4 = 0
                df1.a r1 = ht1.C60172g4.C60173a.m70190b(r1, r4, r3, r2)
                if (r1 == 0) goto L_0x078e
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r0.f13158e
                long r2 = r2.getItemId()
                df1.a$a r4 = new df1.a$a
                r5 = 16
                r4.<init>(r5, r2)
                r1.mo8766a(r4)
                rx3.b0 r1 = rx3.C13598b0.f38549a
            L_0x078e:
                dp1.e1 r1 = dp1.C7433e1.f25622a
                r2 = r21
                gy3.C87412m.m108593f(r7, r2)
                r1.mo8572a(r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter.C2535b.onCreateMMMenu(nj3.e0):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter$c */
    public static final class C2540c implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ BaseFinderFeed f13175d;

        /* renamed from: e */
        public final /* synthetic */ FinderProfileTimelineContract$ProfileTimelinePresenter f13176e;

        /* renamed from: f */
        public final /* synthetic */ C77407n f13177f;

        public C2540c(BaseFinderFeed baseFinderFeed, FinderProfileTimelineContract$ProfileTimelinePresenter finderProfileTimelineContract$ProfileTimelinePresenter, C77407n nVar) {
            this.f13175d = baseFinderFeed;
            this.f13176e = finderProfileTimelineContract$ProfileTimelinePresenter;
            this.f13177f = nVar;
        }

        public final void onCreateMMMenu(C76874e0 e0Var) {
            if (!this.f13175d.mo3513o().isNotShareConversation() && !C58784w3.f168295a.mo83855A0(this.f13175d.mo3513o().getFeedObject())) {
                C7888v2.C7889a aVar = C7888v2.f26513a;
                FinderProfileTimelineContract$ProfileTimelinePresenter finderProfileTimelineContract$ProfileTimelinePresenter = this.f13176e;
                MMActivity mMActivity = finderProfileTimelineContract$ProfileTimelinePresenter.f13136d;
                C15133e0 e0Var2 = finderProfileTimelineContract$ProfileTimelinePresenter.f13149t;
                BaseFinderFeed baseFinderFeed = this.f13175d;
                C87412m.m108593f(e0Var, LocaleUtil.ITALIAN);
                aVar.mo9004b(mMActivity, e0Var2, baseFinderFeed, e0Var, this.f13177f);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter$d */
    public static final class C2541d implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ BaseFinderFeed f13178d;

        /* renamed from: e */
        public final /* synthetic */ FinderProfileTimelineContract$ProfileTimelinePresenter f13179e;

        /* renamed from: f */
        public final /* synthetic */ C77407n f13180f;

        public C2541d(BaseFinderFeed baseFinderFeed, FinderProfileTimelineContract$ProfileTimelinePresenter finderProfileTimelineContract$ProfileTimelinePresenter, C77407n nVar) {
            this.f13178d = baseFinderFeed;
            this.f13179e = finderProfileTimelineContract$ProfileTimelinePresenter;
            this.f13180f = nVar;
        }

        public final void onCreateMMMenu(C76874e0 e0Var) {
            C58784w3 w3Var = C58784w3.f168295a;
            if (w3Var.mo83897Q0(this.f13178d)) {
                FinderProfileTimelineContract$ProfileTimelinePresenter finderProfileTimelineContract$ProfileTimelinePresenter = this.f13179e;
                if (finderProfileTimelineContract$ProfileTimelinePresenter.f13147r) {
                    C58736i1 i1Var = C58736i1.f168173a;
                    MMActivity mMActivity = finderProfileTimelineContract$ProfileTimelinePresenter.f13136d;
                    BaseFinderFeed baseFinderFeed = this.f13178d;
                    C87412m.m108593f(e0Var, "menu");
                    i1Var.mo83665k(mMActivity, baseFinderFeed, e0Var);
                    i1Var.mo83661g(this.f13179e.f13136d, e0Var, this.f13178d);
                    FinderProfileTimelineContract$ProfileTimelinePresenter finderProfileTimelineContract$ProfileTimelinePresenter2 = this.f13179e;
                    C10834k1 k1Var = finderProfileTimelineContract$ProfileTimelinePresenter2.f13150u;
                    MMActivity mMActivity2 = finderProfileTimelineContract$ProfileTimelinePresenter2.f13136d;
                    boolean z = true;
                    boolean z2 = this.f13178d.mo3513o().getStickyTime() != 0;
                    k1Var.getClass();
                    C87412m.m108594g(mMActivity2, "context");
                    if (z2) {
                        e0Var.mo107144g(204, mMActivity2.getString(C0966R.string.d2u), C0966R.raw.icons_outlined_top_off);
                    } else {
                        e0Var.mo107144g(203, mMActivity2.getString(C0966R.string.eom), C0966R.raw.icons_outlined_top);
                    }
                    e0Var.mo107135b(108, C0966R.string.f7944x1, C0966R.raw.icons_outlined_delete);
                    MMActivity mMActivity3 = this.f13179e.f13136d;
                    this.f13178d.mo3513o().getMediaType();
                    boolean z3 = this.f13178d.mo3513o().getPrivate_flag() == 1;
                    C87412m.m108594g(mMActivity3, "context");
                    if (z3) {
                        e0Var.mo107151k(206, mMActivity3.getString(C0966R.string.eok), C0966R.raw.icons_outlined_unlock, false);
                    } else {
                        e0Var.mo107151k(205, mMActivity3.getString(C0966R.string.eoi), C0966R.raw.finder_icons_outlined_lock, false);
                    }
                    i1Var.mo83656b(this.f13179e.f13136d, this.f13178d, e0Var);
                    if (this.f13178d.mo3513o().isLongVideo() && this.f13178d.mo3513o().isPostFinish() && !((C8808v4) C86312j.m106911c(C8808v4.class)).mo9635e()) {
                        C37521f.f99374d.getClass();
                        if (C37521f.f99476o6.mo60266n().intValue() == 1 && (this.f13178d.mo3513o().getFeedObject().permissionFlag & 4096) == 0) {
                            FinderObject feedObject = this.f13178d.mo3513o().getFeedObject();
                            C87412m.m108594g(feedObject, C66261f3.COL_FINDEROBJECT);
                            if ((feedObject.permissionFlag & 2048) != 0) {
                                z = false;
                            }
                            if (!z || !w3Var.mo83889N0()) {
                                e0Var.mo107144g(303, this.f13179e.f13136d.getString(C0966R.string.mi4), C0966R.raw.icons_outlined_channels_bullet_2);
                            } else {
                                e0Var.mo107144g(304, this.f13179e.f13136d.getString(C0966R.string.f361046mi3), C0966R.raw.icons_outlined_menu_close_bullet_self_2);
                            }
                        }
                    }
                    FinderProfileTimelineContract$ProfileTimelinePresenter.m2490q(this.f13179e, this.f13178d, e0Var, this.f13180f);
                    i1Var.mo83655a(this.f13179e.f13136d, e0Var, this.f13178d);
                    C58736i1 i1Var2 = C58736i1.f168173a;
                    MMActivity mMActivity4 = this.f13179e.f13136d;
                    BaseFinderFeed baseFinderFeed2 = this.f13178d;
                    C87412m.m108593f(e0Var, "menu");
                    i1Var2.mo83659e(mMActivity4, baseFinderFeed2, e0Var);
                    i1Var2.mo83658d(this.f13179e.f13136d, this.f13178d, e0Var);
                    i1Var2.mo83657c(this.f13179e.f13136d, this.f13178d, e0Var);
                    C7433e1.f25622a.mo8573b(e0Var);
                }
            }
            if (!w3Var.mo83897Q0(this.f13178d)) {
                FinderProfileTimelineContract$ProfileTimelinePresenter finderProfileTimelineContract$ProfileTimelinePresenter3 = this.f13179e;
                BaseFinderFeed baseFinderFeed3 = this.f13178d;
                C87412m.m108593f(e0Var, "menu");
                FinderProfileTimelineContract$ProfileTimelinePresenter.m2490q(finderProfileTimelineContract$ProfileTimelinePresenter3, baseFinderFeed3, e0Var, this.f13180f);
                C58736i1 i1Var3 = C58736i1.f168173a;
                i1Var3.mo83665k(this.f13179e.f13136d, this.f13178d, e0Var);
                i1Var3.mo83655a(this.f13179e.f13136d, e0Var, this.f13178d);
                FinderProfileTimelineContract$ProfileTimelinePresenter finderProfileTimelineContract$ProfileTimelinePresenter4 = this.f13179e;
                if (!finderProfileTimelineContract$ProfileTimelinePresenter4.f13147r) {
                    i1Var3.mo83663i(finderProfileTimelineContract$ProfileTimelinePresenter4.f13136d, this.f13178d, e0Var);
                }
                e0Var.mo107135b(101, C0966R.string.gvt, C0966R.raw.icons_outlined_report_problem);
            }
            C58736i1 i1Var22 = C58736i1.f168173a;
            MMActivity mMActivity42 = this.f13179e.f13136d;
            BaseFinderFeed baseFinderFeed22 = this.f13178d;
            C87412m.m108593f(e0Var, "menu");
            i1Var22.mo83659e(mMActivity42, baseFinderFeed22, e0Var);
            i1Var22.mo83658d(this.f13179e.f13136d, this.f13178d, e0Var);
            i1Var22.mo83657c(this.f13179e.f13136d, this.f13178d, e0Var);
            C7433e1.f25622a.mo8573b(e0Var);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter$e */
    public static final class C2542e implements C11182m0 {

        /* renamed from: d */
        public static final C2542e f13181d = new C2542e();

        public final void onCreateMMMenu(C76874e0 e0Var) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter$f */
    public static final class C2543f implements C47269o0 {

        /* renamed from: a */
        public final /* synthetic */ FinderProfileTimelineContract$ProfileTimelinePresenter f13182a;

        /* renamed from: b */
        public final /* synthetic */ BaseFinderFeed f13183b;

        /* renamed from: c */
        public final /* synthetic */ C77407n f13184c;

        /* renamed from: d */
        public final /* synthetic */ C60905o f13185d;

        public C2543f(FinderProfileTimelineContract$ProfileTimelinePresenter finderProfileTimelineContract$ProfileTimelinePresenter, BaseFinderFeed baseFinderFeed, C77407n nVar, C60905o oVar) {
            this.f13182a = finderProfileTimelineContract$ProfileTimelinePresenter;
            this.f13183b = baseFinderFeed;
            this.f13184c = nVar;
            this.f13185d = oVar;
        }

        /* renamed from: a */
        public final void mo2584a(MenuItem menuItem, int i) {
            C7888v2.C7889a aVar = C7888v2.f26513a;
            C15133e0 e0Var = this.f13182a.f13149t;
            BaseFinderFeed baseFinderFeed = this.f13183b;
            C87412m.m108592e(menuItem, "null cannot be cast to non-null type com.tencent.mm.ui.base.MMMenuItem");
            C77407n nVar = this.f13184c;
            Context context = this.f13185d.f173499A;
            C87412m.m108593f(context, "holder.context");
            boolean j = aVar.mo9012j(e0Var, baseFinderFeed, (C76875f0) menuItem, nVar, context);
            String str = this.f13182a.f13140h;
            Log.m105924i(str, "getMoreMenuItemLongSelectedListener :" + j);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter$g */
    public static final class C2544g implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C32224a<C13598b0> f13186d;

        /* renamed from: e */
        public final /* synthetic */ FinderProfileTimelineContract$ProfileTimelinePresenter f13187e;

        /* renamed from: f */
        public final /* synthetic */ C60905o f13188f;

        /* renamed from: g */
        public final /* synthetic */ BaseFinderFeed f13189g;

        /* renamed from: h */
        public final /* synthetic */ int f13190h;

        /* renamed from: com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter$g$a */
        public static final class C2545a implements C8794p5<C51954xc1> {

            /* renamed from: d */
            public final /* synthetic */ FinderProfileTimelineContract$ProfileTimelinePresenter f13191d;

            /* renamed from: e */
            public final /* synthetic */ boolean f13192e;

            /* renamed from: f */
            public final /* synthetic */ BaseFinderFeed f13193f;

            /* renamed from: g */
            public final /* synthetic */ C60905o f13194g;

            public C2545a(FinderProfileTimelineContract$ProfileTimelinePresenter finderProfileTimelineContract$ProfileTimelinePresenter, boolean z, BaseFinderFeed baseFinderFeed, C60905o oVar) {
                this.f13191d = finderProfileTimelineContract$ProfileTimelinePresenter;
                this.f13192e = z;
                this.f13193f = baseFinderFeed;
                this.f13194g = oVar;
            }

            /* renamed from: c5 */
            public void mo705c5(Object obj, C50542nh0 nh02) {
                C87412m.m108594g((C51954xc1) obj, "req");
                C87412m.m108594g(nh02, "ret");
                if (nh02.f138603e == 0) {
                    String str = this.f13191d.f13140h;
                    Log.m105924i(str, "modifyFeedBullet: isClose = " + this.f13192e + ", success");
                    C61926c.m72668M(new C2855q(this.f13192e, this.f13193f, this.f13191d, this.f13194g));
                    C76912y0.makeText((Context) this.f13191d.f13136d, this.f13192e ? C0966R.string.f360501m53 : C0966R.string.m_3, 0).show();
                    return;
                }
                String str2 = this.f13191d.f13140h;
                Log.m105924i(str2, "modifyFeedBullet: isClose = " + this.f13192e + ", resultCode = " + nh02.f138603e);
                C76912y0.makeText((Context) this.f13191d.f13136d, this.f13192e ? C0966R.string.f360500m52 : C0966R.string.m_2, 0).show();
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter$g$b */
        public static final class C2546b extends C87413o implements C32226l<String, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ BaseFinderFeed f13195d;

            /* renamed from: e */
            public final /* synthetic */ FinderProfileTimelineContract$ProfileTimelinePresenter f13196e;

            /* renamed from: f */
            public final /* synthetic */ MenuItem f13197f;

            /* renamed from: g */
            public final /* synthetic */ int f13198g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2546b(BaseFinderFeed baseFinderFeed, FinderProfileTimelineContract$ProfileTimelinePresenter finderProfileTimelineContract$ProfileTimelinePresenter, MenuItem menuItem, int i) {
                super(1);
                this.f13195d = baseFinderFeed;
                this.f13196e = finderProfileTimelineContract$ProfileTimelinePresenter;
                this.f13197f = menuItem;
                this.f13198g = i;
            }

            public Object invoke(Object obj) {
                String str = (String) obj;
                Class cls = C64916p1.class;
                C87412m.m108594g(str, "userName");
                if (this.f13195d.mo3513o().isLiveFeed()) {
                    MMActivity mMActivity = this.f13196e.f13136d;
                    MenuItem menuItem = this.f13197f;
                    C87412m.m108593f(menuItem, "menuItem");
                    String str2 = str;
                    ((C64916p1) C86312j.m106911c(cls)).mo76724vV(mMActivity, str2, (C76875f0) menuItem, this.f13195d.mo3513o(), new C2856r(this.f13195d));
                } else {
                    MMActivity mMActivity2 = this.f13196e.f13136d;
                    MenuItem menuItem2 = this.f13197f;
                    C87412m.m108593f(menuItem2, "menuItem");
                    String str3 = str;
                    ((C64916p1) C86312j.m106911c(cls)).mo76652BO(mMActivity2, str3, (C76875f0) menuItem2, this.f13195d.mo3513o(), (C32226l<? super List<String>, C13598b0>) null);
                }
                C7433e1.f25622a.mo8575d(this.f13196e.f13136d, str, this.f13195d.getItemId(), this.f13198g);
                return C13598b0.f38549a;
            }
        }

        public C2544g(C32224a<C13598b0> aVar, FinderProfileTimelineContract$ProfileTimelinePresenter finderProfileTimelineContract$ProfileTimelinePresenter, C60905o oVar, BaseFinderFeed baseFinderFeed, int i) {
            this.f13186d = aVar;
            this.f13187e = finderProfileTimelineContract$ProfileTimelinePresenter;
            this.f13188f = oVar;
            this.f13189g = baseFinderFeed;
            this.f13190h = i;
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onMMMenuItemSelected(android.view.MenuItem r51, int r52) {
            /*
                r50 = this;
                r0 = r50
                r1 = r51
                java.lang.Class<da0.e> r2 = da0.C58247e.class
                java.lang.Class<rs1.v> r3 = rs1.C63648v.class
                java.lang.Class<hy.o0> r4 = p166hy.C98567o0.class
                java.lang.Class<dp1.y0> r5 = dp1.C58417y0.class
                java.lang.Class<com.tencent.mm.plugin.finder.service.o1> r6 = com.tencent.p014mm.plugin.finder.service.C3604o1.class
                java.lang.Class<rs1.s8> r7 = rs1.C13442s8.class
                fy3.a<rx3.b0> r8 = r0.f13186d
                if (r8 == 0) goto L_0x0017
                r8.invoke()
            L_0x0017:
                int r8 = r51.getItemId()
                r9 = 116(0x74, float:1.63E-43)
                java.lang.String r10 = "from_action"
                java.lang.String r11 = "feedid"
                java.lang.String r12 = "context"
                if (r8 == r9) goto L_0x0cf1
                r9 = 119(0x77, float:1.67E-43)
                if (r8 == r9) goto L_0x0ce4
                r9 = 207(0xcf, float:2.9E-43)
                if (r8 == r9) goto L_0x0cd5
                r9 = 201(0xc9, float:2.82E-43)
                if (r8 == r9) goto L_0x0cc8
                r9 = 202(0xca, float:2.83E-43)
                if (r8 == r9) goto L_0x0cb8
                r9 = 209(0xd1, float:2.93E-43)
                java.lang.String r13 = "activity"
                java.lang.String r14 = "feed"
                if (r8 == r9) goto L_0x01ee
                r9 = 210(0xd2, float:2.94E-43)
                if (r8 == r9) goto L_0x01d4
                switch(r8) {
                    case 301: goto L_0x019d;
                    case 302: goto L_0x019d;
                    case 303: goto L_0x00b0;
                    case 304: goto L_0x00b0;
                    case 305: goto L_0x0085;
                    case 306: goto L_0x0065;
                    default: goto L_0x0044;
                }
            L_0x0044:
                r25 = r2
                r27 = r3
                r26 = r4
                r30 = r5
                r29 = r10
                r28 = r13
                com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter r2 = r0.f13187e
                wc3.e0 r3 = r2.f13149t
                r4 = r1
                nj3.f0 r4 = (nj3.C76875f0) r4
                com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter$g$b r5 = new com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter$g$b
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r8 = r0.f13189g
                int r9 = r0.f13190h
                r5.<init>(r8, r2, r1, r9)
                r3.xc0(r4, r5)
                goto L_0x0230
            L_0x0065:
                er1.i1 r18 = er1.C58736i1.f168173a
                jq3.o r8 = r0.f13188f
                r20 = 0
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r9 = r0.f13189g
                int r15 = r0.f13190h
                r25 = r2
                com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter r2 = r0.f13187e
                com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader r2 = r2.mo2583x()
                com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r23 = r2.getDataListJustForAdapter()
                r19 = r8
                r21 = r9
                r22 = r15
                r18.mo83666l(r19, r20, r21, r22, r23)
                goto L_0x00a4
            L_0x0085:
                r25 = r2
                er1.i1 r26 = er1.C58736i1.f168173a
                jq3.o r2 = r0.f13188f
                r28 = 1
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r8 = r0.f13189g
                int r9 = r0.f13190h
                com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter r15 = r0.f13187e
                com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader r15 = r15.mo2583x()
                com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r31 = r15.getDataListJustForAdapter()
                r27 = r2
                r29 = r8
                r30 = r9
                r26.mo83666l(r27, r28, r29, r30, r31)
            L_0x00a4:
                r27 = r3
                r26 = r4
                r30 = r5
                r29 = r10
                r28 = r13
                goto L_0x0230
            L_0x00b0:
                r25 = r2
                er1.w3 r2 = er1.C58784w3.f168295a
                boolean r2 = r2.mo83889N0()
                if (r2 != 0) goto L_0x00cd
                com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter r2 = r0.f13187e
                com.tencent.mm.ui.MMActivity r2 = r2.f13136d
                android.content.res.Resources r8 = r2.getResources()
                r9 = 2131826612(0x7f1117b4, float:1.9286113E38)
                java.lang.String r8 = r8.getString(r9)
                nj3.C76912y0.m92767f(r2, r8)
                goto L_0x00a4
            L_0x00cd:
                int r2 = r51.getItemId()
                r8 = 304(0x130, float:4.26E-43)
                if (r2 != r8) goto L_0x00d7
                r2 = 1
                goto L_0x00d8
            L_0x00d7:
                r2 = 0
            L_0x00d8:
                com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter r8 = r0.f13187e
                com.tencent.mm.ui.MMActivity r9 = r8.f13136d
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r15 = r0.f13189g
                r26 = r4
                com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter$g$a r4 = new com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter$g$a
                r27 = r3
                jq3.o r3 = r0.f13188f
                r4.<init>(r8, r2, r15, r3)
                gy3.C87412m.m108594g(r9, r13)
                gy3.C87412m.m108594g(r15, r14)
                if (r2 == 0) goto L_0x0136
                qo3.n r3 = new qo3.n
                r8 = 1
                r3.<init>((android.content.Context) r9, (int) r8, (boolean) r8)
                android.view.LayoutInflater r8 = com.tencent.p014mm.p136ui.C85868k2.m106137b(r9)
                r28 = r13
                r13 = 2131494527(0x7f0c067f, float:1.8612565E38)
                r29 = r10
                r10 = 0
                android.view.View r8 = r8.inflate(r13, r10)
                r10 = 2131315352(0x7f094a98, float:1.8249155E38)
                android.view.View r10 = r8.findViewById(r10)
                android.widget.TextView r10 = (android.widget.TextView) r10
                android.content.res.Resources r13 = r9.getResources()
                r30 = r5
                r5 = 2131826281(0x7f111669, float:1.9285442E38)
                java.lang.String r5 = r13.getString(r5)
                r10.setText(r5)
                r5 = 0
                r3.mo107569n(r8, r5)
                he1.k r5 = new he1.k
                r5.<init>(r9)
                r3.f225771i = r5
                he1.l r5 = new he1.l
                r5.<init>(r15, r2, r4)
                r3.f225782p = r5
                r3.mo107573q()
                goto L_0x0157
            L_0x0136:
                r30 = r5
                r29 = r10
                r28 = r13
                di3.d r3 = di3.C86312j.m106911c(r6)
                r18 = r3
                com.tencent.mm.plugin.finder.service.o1 r18 = (com.tencent.p014mm.plugin.finder.service.C3604o1) r18
                long r19 = r15.getItemId()
                com.tencent.mm.plugin.finder.storage.FinderItem r3 = r15.mo3513o()
                java.lang.String r21 = r3.getObjectNonceId()
                r22 = r2
                r23 = r4
                r18.mo3974NA(r19, r21, r22, r23)
            L_0x0157:
                he1.j r31 = he1.C59853j.f170902a
                com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter r3 = r0.f13187e
                com.tencent.mm.ui.MMActivity r3 = r3.f13136d
                bl3.r r4 = bl3.C39818r.f106831a
                bl3.r$a r4 = r4.mo62444c(r3)
                androidx.lifecycle.i0 r4 = r4.mo75002a(r7)
                rs1.s8 r4 = (rs1.C13442s8) r4
                te3.hj1 r33 = r4.mo12861q3()
                if (r2 == 0) goto L_0x0172
                java.lang.String r2 = "close_bullet_screen"
                goto L_0x0174
            L_0x0172:
                java.lang.String r2 = "open_bullet_screen"
            L_0x0174:
                r34 = r2
                r35 = 1
                org.json.JSONObject r2 = new org.json.JSONObject
                r2.<init>()
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r4 = r0.f13189g
                long r4 = r4.getItemId()
                java.lang.String r4 = o40.C61926c.m72691p(r4)
                r2.put(r11, r4)
                rx3.b0 r4 = rx3.C13598b0.f38549a
                r37 = 1
                r38 = 0
                r39 = 64
                r40 = 0
                r32 = r3
                r36 = r2
                he1.C59853j.m69742b(r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
                goto L_0x0230
            L_0x019d:
                r25 = r2
                r27 = r3
                r26 = r4
                r30 = r5
                r29 = r10
                r28 = r13
                bl3.r r2 = bl3.C39818r.f106831a
                com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter r3 = r0.f13187e
                com.tencent.mm.ui.MMActivity r3 = r3.f13136d
                bl3.r$a r2 = r2.mo62444c(r3)
                java.lang.Class<rs1.a1> r3 = rs1.C63513a1.class
                androidx.lifecycle.i0 r2 = r2.mo75002a(r3)
                java.lang.String r3 = "UICProvider.of(getActivi…derBulletUIC::class.java)"
                gy3.C87412m.m108593f(r2, r3)
                r31 = r2
                rs1.a1 r31 = (rs1.C63513a1) r31
                jq3.o r2 = r0.f13188f
                r33 = 0
                r34 = 1
                r35 = 0
                r36 = 8
                r37 = 0
                r32 = r2
                rs1.C63513a1.m74853e3(r31, r32, r33, r34, r35, r36, r37)
                goto L_0x0230
            L_0x01d4:
                r25 = r2
                r27 = r3
                r26 = r4
                r30 = r5
                r29 = r10
                r28 = r13
                er1.i1 r2 = er1.C58736i1.f168173a
                com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter r3 = r0.f13187e
                com.tencent.mm.ui.MMActivity r3 = r3.f13136d
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r4 = r0.f13189g
                jq3.o r5 = r0.f13188f
                r2.mo83672r(r3, r4, r5)
                goto L_0x0230
            L_0x01ee:
                r25 = r2
                r27 = r3
                r26 = r4
                r30 = r5
                r29 = r10
                r28 = r13
                com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter r2 = r0.f13187e
                com.tencent.mm.ui.MMActivity r2 = r2.f13136d
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r0.f13189g
                gy3.C87412m.m108594g(r2, r12)
                gy3.C87412m.m108594g(r3, r14)
                com.tencent.mm.plugin.finder.storage.FinderItem r3 = r3.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r3 = r3.getFeedObject()
                te3.kf1 r3 = r3.object_extend
                if (r3 == 0) goto L_0x0230
                te3.ui0 r3 = r3.f136756r
                if (r3 == 0) goto L_0x0230
                com.tencent.mm.protocal.protobuf.FinderJumpInfo r3 = r3.f142864d
                if (r3 == 0) goto L_0x0230
                pf1.q r4 = new pf1.q
                r4.<init>(r3)
                pf1.d0 r31 = pf1.C62262d0.f176978a
                r34 = 0
                r35 = 0
                r36 = 12
                r37 = 0
                r32 = r2
                r33 = r4
                pf1.C62262d0.m73168c(r31, r32, r33, r34, r35, r36, r37)
            L_0x0230:
                com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter r2 = r0.f13187e
                boolean r3 = r2.f13147r
                java.lang.String r4 = "UICProvider.of(context).…ddHistoryUIC::class.java)"
                java.lang.String r8 = "fullVideoSeekBar"
                java.lang.String r10 = "shoot_same_video"
                java.lang.String r13 = "templateId"
                java.lang.String r15 = "getService(FinderReportLogic::class.java)"
                r18 = -1
                r19 = 16
                java.lang.String r5 = "key_maas_entrance"
                if (r3 != 0) goto L_0x06bf
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r0.f13189g
                jq3.o r6 = r0.f13188f
                int r9 = r0.f13190h
                java.lang.String r1 = r2.f13140h
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r37 = r10
                java.lang.String r10 = "getMoreMenuItemSelectedListener feed "
                r0.append(r10)
                r0.append(r3)
                java.lang.String r10 = " menuItem:"
                r0.append(r10)
                int r10 = r51.getItemId()
                r0.append(r10)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
                int r0 = r51.getItemId()
                r1 = 106(0x6a, float:1.49E-43)
                if (r0 == r1) goto L_0x06b0
                r1 = 107(0x6b, float:1.5E-43)
                if (r0 == r1) goto L_0x06a1
                r1 = 109(0x6d, float:1.53E-43)
                if (r0 == r1) goto L_0x0619
                r1 = 118(0x76, float:1.65E-43)
                if (r0 == r1) goto L_0x0594
                r1 = 120(0x78, float:1.68E-43)
                if (r0 == r1) goto L_0x0571
                r1 = 200(0xc8, float:2.8E-43)
                if (r0 == r1) goto L_0x055a
                r1 = 208(0xd0, float:2.91E-43)
                if (r0 == r1) goto L_0x054d
                r1 = 307(0x133, float:4.3E-43)
                if (r0 == r1) goto L_0x0534
                r1 = 113(0x71, float:1.58E-43)
                if (r0 == r1) goto L_0x049f
                r1 = 114(0x72, float:1.6E-43)
                if (r0 == r1) goto L_0x0432
                switch(r0) {
                    case 101: goto L_0x03b4;
                    case 102: goto L_0x035f;
                    case 103: goto L_0x02c4;
                    case 104: goto L_0x02a3;
                    default: goto L_0x02a1;
                }
            L_0x02a1:
                goto L_0x0cb7
            L_0x02a3:
                er1.l0 r0 = er1.C58745l0.f168212a
                com.tencent.mm.ui.MMActivity r1 = r2.f13136d
                r0.mo83743a(r3, r1)
                di3.d r0 = di3.C86312j.m106911c(r30)
                gy3.C87412m.m108593f(r0, r15)
                r4 = r0
                dp1.y0 r4 = (dp1.C58417y0) r4
                com.tencent.mm.ui.MMActivity r5 = r2.f13136d
                r6 = 1
                long r7 = r3.getItemId()
                r9 = 0
                r10 = 8
                r11 = 0
                dp1.C58417y0.Qy0(r4, r5, r6, r7, r9, r10, r11)
                goto L_0x0cb7
            L_0x02c4:
                er1.v2$a r36 = er1.C7888v2.f26513a
                com.tencent.mm.ui.MMActivity r0 = r2.f13136d
                r39 = 0
                r40 = 0
                r41 = 0
                r42 = 28
                r43 = 0
                r37 = r0
                r38 = r3
                er1.C7888v2.C7889a.m8057w(r36, r37, r38, r39, r40, r41, r42, r43)
                com.tencent.mm.plugin.finder.storage.FinderItem r0 = r3.mo3513o()
                boolean r0 = r0.isLiveFeed()
                if (r0 == 0) goto L_0x0326
                ms3.a r18 = ms3.C11091a.f32868a
                com.tencent.mm.plugin.finder.storage.FinderItem r0 = r3.mo3513o()
                te3.c21 r0 = r0.getLiveInfo()
                if (r0 == 0) goto L_0x02f6
                long r0 = r0.f182392d
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                goto L_0x02f7
            L_0x02f6:
                r0 = 0
            L_0x02f7:
                java.lang.String r19 = java.lang.String.valueOf(r0)
                com.tencent.mm.plugin.finder.storage.FinderItem r0 = r3.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
                long r0 = r0.f164794id
                java.lang.String r20 = java.lang.String.valueOf(r0)
                com.tencent.mm.plugin.finder.storage.FinderItem r0 = r3.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
                java.lang.String r0 = r0.username
                r25 = 0
                r26 = 0
                r27 = 192(0xc0, float:2.69E-43)
                r28 = 0
                java.lang.String r22 = "1"
                java.lang.String r23 = "2"
                java.lang.String r24 = "0"
                r21 = r0
                ms3.C11091a.m10992b(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            L_0x0326:
                com.tencent.mm.ui.MMActivity r0 = r2.f13136d
                long r1 = r3.getItemId()
                gy3.C87412m.m108594g(r0, r12)
                dp1.f2 r3 = dp1.C7435f2.f25626a
                rs1.s8$a r4 = rs1.C13442s8.f38060Q0
                rs1.s8 r0 = r4.mo12873f(r0)
                if (r0 == 0) goto L_0x033e
                te3.hj1 r14 = r0.mo12861q3()
                goto L_0x033f
            L_0x033e:
                r14 = 0
            L_0x033f:
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>()
                r4 = 1
                r10 = r29
                if (r9 != r4) goto L_0x034b
                r13 = 1
                goto L_0x034c
            L_0x034b:
                r13 = 2
            L_0x034c:
                r0.put(r10, r13)
                java.lang.String r1 = o40.C61926c.m72691p(r1)
                r0.put(r11, r1)
                rx3.b0 r1 = rx3.C13598b0.f38549a
                java.lang.String r1 = "button_forward_friendcircle"
                r3.mo8577a(r14, r1, r4, r0)
                goto L_0x0cb7
            L_0x035f:
                r10 = r29
                er1.v2$a r18 = er1.C7888v2.f26513a
                com.tencent.mm.ui.MMActivity r0 = r2.f13136d
                com.tencent.mm.plugin.finder.storage.FinderItem r20 = r3.mo3513o()
                r21 = 0
                r22 = 3
                kf1.m7 r1 = new kf1.m7
                r1.<init>(r3)
                r24 = 4
                r25 = 0
                r19 = r0
                r23 = r1
                er1.C7888v2.C7889a.m8056t(r18, r19, r20, r21, r22, r23, r24, r25)
                com.tencent.mm.ui.MMActivity r0 = r2.f13136d
                long r1 = r3.getItemId()
                gy3.C87412m.m108594g(r0, r12)
                dp1.f2 r3 = dp1.C7435f2.f25626a
                rs1.s8$a r4 = rs1.C13442s8.f38060Q0
                rs1.s8 r0 = r4.mo12873f(r0)
                if (r0 == 0) goto L_0x0395
                te3.hj1 r14 = r0.mo12861q3()
                goto L_0x0396
            L_0x0395:
                r14 = 0
            L_0x0396:
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>()
                r4 = 1
                if (r9 != r4) goto L_0x03a0
                r13 = 1
                goto L_0x03a1
            L_0x03a0:
                r13 = 2
            L_0x03a1:
                r0.put(r10, r13)
                java.lang.String r1 = o40.C61926c.m72691p(r1)
                r0.put(r11, r1)
                rx3.b0 r1 = rx3.C13598b0.f38549a
                java.lang.String r1 = "button_forward_friend"
                r3.mo8577a(r14, r1, r4, r0)
                goto L_0x0cb7
            L_0x03b4:
                r10 = r29
                er1.j4 r0 = er1.C58739j4.f168176a
                boolean r0 = r0.mo83686O(r3)
                if (r0 == 0) goto L_0x03e8
                com.tencent.mm.plugin.finder.storage.FinderItem r0 = r3.mo3513o()
                te3.c21 r0 = r0.getLiveInfo()
                if (r0 == 0) goto L_0x03fb
                long r0 = r0.f182392d
                sf1.a r18 = sf1.C13671a.f38718a
                com.tencent.mm.ui.MMActivity r4 = r2.f13136d
                com.tencent.mm.plugin.finder.storage.FinderItem r5 = r3.mo3513o()
                java.lang.String r22 = r5.getUserName()
                r23 = 0
                r24 = 0
                r25 = 0
                r26 = 56
                r27 = 0
                r19 = r4
                r20 = r0
                sf1.C13671a.m12976c(r18, r19, r20, r22, r23, r24, r25, r26, r27)
                goto L_0x03fb
            L_0x03e8:
                sf1.a r36 = sf1.C13671a.f38718a
                com.tencent.mm.ui.MMActivity r0 = r2.f13136d
                r39 = 0
                r41 = 0
                r42 = 12
                r43 = 0
                r37 = r0
                r38 = r3
                sf1.C13671a.m12975b(r36, r37, r38, r39, r41, r42, r43)
            L_0x03fb:
                com.tencent.mm.ui.MMActivity r0 = r2.f13136d
                long r1 = r3.getItemId()
                gy3.C87412m.m108594g(r0, r12)
                dp1.f2 r3 = dp1.C7435f2.f25626a
                rs1.s8$a r4 = rs1.C13442s8.f38060Q0
                rs1.s8 r0 = r4.mo12873f(r0)
                if (r0 == 0) goto L_0x0413
                te3.hj1 r14 = r0.mo12861q3()
                goto L_0x0414
            L_0x0413:
                r14 = 0
            L_0x0414:
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>()
                r4 = 1
                if (r9 != r4) goto L_0x041e
                r13 = 1
                goto L_0x041f
            L_0x041e:
                r13 = 2
            L_0x041f:
                r0.put(r10, r13)
                java.lang.String r1 = o40.C61926c.m72691p(r1)
                r0.put(r11, r1)
                rx3.b0 r1 = rx3.C13598b0.f38549a
                java.lang.String r1 = "button_complaint"
                r3.mo8577a(r14, r1, r4, r0)
                goto L_0x0cb7
            L_0x0432:
                r10 = r29
                r0 = 2131305309(0x7f09235d, float:1.8228785E38)
                android.view.View r0 = r6.mo85812D(r0)
                com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout r0 = (com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout) r0
                gy3.C87412m.m108593f(r0, r8)
                r1 = 3
                r4 = 0
                r5 = 0
                gr1.C59667n2.C8415a.m8377a(r0, r5, r4, r1, r5)
                er1.n2 r36 = er1.C7842n2.f26407a
                com.tencent.mm.ui.MMActivity r1 = r2.f13136d
                r39 = 2
                r41 = 0
                r42 = 0
                r43 = 0
                r44 = 0
                kf1.p7 r4 = new kf1.p7
                r4.<init>(r0, r2)
                r47 = 120(0x78, float:1.68E-43)
                r48 = 0
                r37 = r1
                r38 = r3
                r45 = r6
                r46 = r4
                er1.C7842n2.m7986b(r36, r37, r38, r39, r41, r42, r43, r44, r45, r46, r47, r48)
                com.tencent.mm.ui.MMActivity r0 = r2.f13136d
                long r1 = r3.getItemId()
                gy3.C87412m.m108594g(r0, r12)
                dp1.f2 r3 = dp1.C7435f2.f25626a
                rs1.s8$a r4 = rs1.C13442s8.f38060Q0
                rs1.s8 r0 = r4.mo12873f(r0)
                if (r0 == 0) goto L_0x0480
                te3.hj1 r14 = r0.mo12861q3()
                goto L_0x0481
            L_0x0480:
                r14 = 0
            L_0x0481:
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>()
                r4 = 1
                if (r9 != r4) goto L_0x048b
                r13 = 1
                goto L_0x048c
            L_0x048b:
                r13 = 2
            L_0x048c:
                r0.put(r10, r13)
                java.lang.String r1 = o40.C61926c.m72691p(r1)
                r0.put(r11, r1)
                rx3.b0 r1 = rx3.C13598b0.f38549a
                java.lang.String r1 = "button_set_bell"
                r3.mo8577a(r14, r1, r4, r0)
                goto L_0x0cb7
            L_0x049f:
                r10 = r29
                er1.v2$a r36 = er1.C7888v2.f26513a
                com.tencent.mm.ui.MMActivity r0 = r2.f13136d
                r39 = 0
                r40 = 0
                r41 = 12
                r42 = 0
                r37 = r0
                r38 = r3
                er1.C7888v2.C7889a.m8058y(r36, r37, r38, r39, r40, r41, r42)
                com.tencent.mm.ui.MMActivity r0 = r2.f13136d
                long r1 = r3.getItemId()
                gy3.C87412m.m108594g(r0, r12)
                dp1.f2 r4 = dp1.C7435f2.f25626a
                rs1.s8$a r5 = rs1.C13442s8.f38060Q0
                rs1.s8 r0 = r5.mo12873f(r0)
                if (r0 == 0) goto L_0x04cc
                te3.hj1 r0 = r0.mo12861q3()
                goto L_0x04cd
            L_0x04cc:
                r0 = 0
            L_0x04cd:
                org.json.JSONObject r5 = new org.json.JSONObject
                r5.<init>()
                r6 = 1
                if (r9 != r6) goto L_0x04d7
                r13 = 1
                goto L_0x04d8
            L_0x04d7:
                r13 = 2
            L_0x04d8:
                r5.put(r10, r13)
                java.lang.String r1 = o40.C61926c.m72691p(r1)
                r5.put(r11, r1)
                rx3.b0 r1 = rx3.C13598b0.f38549a
                java.lang.String r1 = "textstatus_in_menu"
                r4.mo8577a(r0, r1, r6, r5)
                com.tencent.mm.plugin.finder.storage.FinderItem r0 = r3.mo3513o()
                boolean r0 = r0.isLiveFeed()
                if (r0 == 0) goto L_0x0cb7
                ms3.a r4 = ms3.C11091a.f32868a
                com.tencent.mm.plugin.finder.storage.FinderItem r0 = r3.mo3513o()
                te3.c21 r0 = r0.getLiveInfo()
                if (r0 == 0) goto L_0x0507
                long r0 = r0.f182392d
                java.lang.Long r14 = java.lang.Long.valueOf(r0)
                goto L_0x0508
            L_0x0507:
                r14 = 0
            L_0x0508:
                java.lang.String r5 = java.lang.String.valueOf(r14)
                com.tencent.mm.plugin.finder.storage.FinderItem r0 = r3.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
                long r0 = r0.f164794id
                java.lang.String r6 = java.lang.String.valueOf(r0)
                com.tencent.mm.plugin.finder.storage.FinderItem r0 = r3.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
                java.lang.String r7 = r0.username
                r11 = 0
                r12 = 0
                r13 = 192(0xc0, float:2.69E-43)
                r14 = 0
                java.lang.String r8 = "1"
                java.lang.String r9 = "3"
                java.lang.String r10 = "0"
                ms3.C11091a.m10992b(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
                goto L_0x0cb7
            L_0x0534:
                bl3.r r0 = bl3.C39818r.f106831a
                com.tencent.mm.ui.MMActivity r1 = r2.f13136d
                bl3.r$a r0 = r0.mo62444c(r1)
                r1 = r27
                androidx.lifecycle.i0 r0 = r0.mo75002a(r1)
                gy3.C87412m.m108593f(r0, r4)
                rs1.v r0 = (rs1.C63648v) r0
                r1 = 0
                r0.mo88474e3(r6, r1)
                goto L_0x0cb7
            L_0x054d:
                er1.v2$a r0 = er1.C7888v2.f26513a
                com.tencent.mm.ui.MMActivity r1 = r2.f13136d
                com.tencent.mm.plugin.finder.storage.FinderItem r2 = r3.mo3513o()
                r0.mo9024z(r1, r2)
                goto L_0x0cb7
            L_0x055a:
                er1.p2 r0 = er1.C7853p2.f26439a
                com.tencent.mm.ui.MMActivity r1 = r2.f13136d
                wp1.j r2 = wp1.C15587j.f42215a
                com.tencent.mm.plugin.finder.storage.FinderItem r4 = r3.mo3513o()
                java.lang.String r4 = r4.getFromAppId()
                te3.wf3 r2 = r2.mo14352d(r4)
                r0.mo8961d(r3, r1, r2)
                goto L_0x0cb7
            L_0x0571:
                com.tencent.mm.ui.MMActivity r0 = r2.f13136d
                r9 = r28
                gy3.C87412m.m108594g(r0, r9)
                gy3.C87412m.m108594g(r3, r14)
                di3.d r1 = di3.C86312j.m106911c(r26)
                hy.o0 r1 = (p166hy.C98567o0) r1
                com.tencent.mm.plugin.finder.storage.FinderItem r2 = r3.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r2 = r2.getFeedObject()
                byte[] r2 = r2.toByteArray()
                r3 = 2
                r4 = 0
                r1.Wk0(r0, r3, r2, r4)
                goto L_0x0cb7
            L_0x0594:
                com.tencent.mm.plugin.finder.storage.FinderItem r0 = r3.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r0.objectDesc
                if (r0 == 0) goto L_0x05a3
                te3.ap1 r0 = r0.video_tmpl_info
                goto L_0x05a4
            L_0x05a3:
                r0 = 0
            L_0x05a4:
                if (r0 != 0) goto L_0x05b3
                com.tencent.mm.ui.MMActivity r0 = r2.f13136d
                r1 = 2131826793(0x7f111869, float:1.928648E38)
                java.lang.String r1 = r0.getString(r1)
                nj3.C76912y0.m92767f(r0, r1)
                goto L_0x05d8
            L_0x05b3:
                android.content.Intent r1 = new android.content.Intent
                r1.<init>()
                int r4 = r0.f182116e
                r6 = 1
                if (r4 == r6) goto L_0x05c5
                r6 = 2
                if (r4 == r6) goto L_0x05c2
                r4 = -1
                goto L_0x05c7
            L_0x05c2:
                r4 = 16
                goto L_0x05c7
            L_0x05c5:
                r4 = 13
            L_0x05c7:
                di3.d r6 = di3.C86312j.m106911c(r25)
                da0.e r6 = (da0.C58247e) r6
                com.tencent.mm.ui.MMActivity r8 = r2.f13136d
                r9 = 5
                r1.putExtra(r5, r9)
                rx3.b0 r5 = rx3.C13598b0.f38549a
                r6.qi0(r8, r0, r1, r4)
            L_0x05d8:
                bl3.r r0 = bl3.C39818r.f106831a
                com.tencent.mm.ui.MMActivity r1 = r2.f13136d
                bl3.r$a r0 = r0.mo62444c(r1)
                androidx.lifecycle.i0 r0 = r0.mo75002a(r7)
                rs1.s8 r0 = (rs1.C13442s8) r0
                te3.hj1 r0 = r0.mo12861q3()
                dp1.f2 r1 = dp1.C7435f2.f25626a
                org.json.JSONObject r2 = new org.json.JSONObject
                r2.<init>()
                com.tencent.mm.plugin.finder.storage.FinderItem r3 = r3.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r3 = r3.getFeedObject()
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r3 = r3.objectDesc
                if (r3 == 0) goto L_0x0604
                te3.ap1 r3 = r3.video_tmpl_info
                if (r3 == 0) goto L_0x0604
                java.lang.String r14 = r3.f182115d
                goto L_0x0605
            L_0x0604:
                r14 = 0
            L_0x0605:
                if (r14 != 0) goto L_0x060c
                r3 = 0
                java.lang.Integer r14 = java.lang.Integer.valueOf(r3)
            L_0x060c:
                r2.put(r13, r14)
                rx3.b0 r3 = rx3.C13598b0.f38549a
                r3 = r37
                r4 = 1
                r1.mo8580d(r0, r3, r4, r2)
                goto L_0x0cb7
            L_0x0619:
                r10 = r29
                com.tencent.mm.plugin.finder.storage.FinderItem r0 = r3.mo3513o()
                boolean r0 = r0.isPostFinish()
                if (r0 == 0) goto L_0x066a
                vp1.e r0 = vp1.C65834e.f189316a
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r3.mo3513o()
                vp1.e$b r4 = vp1.C65834e.C65836b.f189323c
                r0.mo89878l(r1, r4)
                er1.q3 r0 = er1.C58771q3.f168268a
                com.tencent.mm.ui.MMActivity r1 = r2.f13136d
                com.tencent.mm.plugin.finder.storage.FinderItem r4 = r3.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r4 = r4.getFeedObject()
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r4 = r4.objectDesc
                if (r4 == 0) goto L_0x0643
                te3.ve1 r4 = r4.feedBgmInfo
                goto L_0x0644
            L_0x0643:
                r4 = 0
            L_0x0644:
                com.tencent.mm.plugin.finder.storage.FinderItem r5 = r3.mo3513o()
                long r5 = r5.field_id
                java.lang.Long r5 = java.lang.Long.valueOf(r5)
                r6 = 0
                r0.mo83812c(r1, r4, r5, r6)
                di3.d r0 = di3.C86312j.m106911c(r30)
                dp1.y0 r0 = (dp1.C58417y0) r0
                com.tencent.mm.ui.MMActivity r1 = r2.f13136d
                com.tencent.mm.plugin.finder.storage.FinderItem r4 = r3.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r4 = r4.field_finderObject
                int r4 = r4.follow_feed_count
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r5 = 1
                r0.wy0(r1, r5, r5, r4)
            L_0x066a:
                com.tencent.mm.ui.MMActivity r0 = r2.f13136d
                long r1 = r3.getItemId()
                gy3.C87412m.m108594g(r0, r12)
                dp1.f2 r3 = dp1.C7435f2.f25626a
                rs1.s8$a r4 = rs1.C13442s8.f38060Q0
                rs1.s8 r0 = r4.mo12873f(r0)
                if (r0 == 0) goto L_0x0682
                te3.hj1 r14 = r0.mo12861q3()
                goto L_0x0683
            L_0x0682:
                r14 = 0
            L_0x0683:
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>()
                r4 = 1
                if (r9 != r4) goto L_0x068d
                r13 = 1
                goto L_0x068e
            L_0x068d:
                r13 = 2
            L_0x068e:
                r0.put(r10, r13)
                java.lang.String r1 = o40.C61926c.m72691p(r1)
                r0.put(r11, r1)
                rx3.b0 r1 = rx3.C13598b0.f38549a
                java.lang.String r1 = "button_original_sound"
                r3.mo8577a(r14, r1, r4, r0)
                goto L_0x0cb7
            L_0x06a1:
                r4 = 1
                wp1.a r0 = wp1.C66164a.f190162a
                com.tencent.mm.ui.MMActivity r1 = r2.f13136d
                kf1.n7 r5 = new kf1.n7
                r5.<init>(r2)
                r0.mo90220a(r1, r3, r4, r5)
                goto L_0x0cb7
            L_0x06b0:
                wp1.a r0 = wp1.C66164a.f190162a
                com.tencent.mm.ui.MMActivity r1 = r2.f13136d
                kf1.o7 r4 = new kf1.o7
                r4.<init>(r2)
                r2 = 0
                r0.mo90220a(r1, r3, r2, r4)
                goto L_0x0cb7
            L_0x06bf:
                r37 = r10
                r1 = r27
                r9 = r28
                r10 = r29
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r0.f13189g
                r27 = r13
                com.tencent.mm.ui.MMActivity r13 = r2.f13136d
                r28 = r5
                int r5 = r0.f13190h
                r29 = r9
                jq3.o r9 = r0.f13188f
                int r0 = r51.getItemId()
                r38 = r4
                r4 = 118(0x76, float:1.65E-43)
                if (r0 == r4) goto L_0x0c2c
                r4 = 120(0x78, float:1.68E-43)
                if (r0 == r4) goto L_0x0c09
                java.lang.String r4 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
                r34 = r1
                r1 = 200(0xc8, float:2.8E-43)
                if (r0 == r1) goto L_0x0bf1
                r1 = 208(0xd0, float:2.91E-43)
                if (r0 == r1) goto L_0x0be3
                r1 = 307(0x133, float:4.3E-43)
                if (r0 == r1) goto L_0x0b94
                switch(r0) {
                    case 101: goto L_0x07bf;
                    case 102: goto L_0x0775;
                    case 103: goto L_0x072d;
                    case 104: goto L_0x0707;
                    default: goto L_0x06f6;
                }
            L_0x06f6:
                r1 = 2131826555(0x7f11177b, float:1.9285998E38)
                switch(r0) {
                    case 106: goto L_0x094a;
                    case 107: goto L_0x0928;
                    case 108: goto L_0x08b9;
                    case 109: goto L_0x0837;
                    default: goto L_0x06fc;
                }
            L_0x06fc:
                r4 = 0
                java.lang.String r1 = "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity"
                switch(r0) {
                    case 112: goto L_0x0a61;
                    case 113: goto L_0x09d2;
                    case 114: goto L_0x096c;
                    default: goto L_0x0702;
                }
            L_0x0702:
                switch(r0) {
                    case 203: goto L_0x0b53;
                    case 204: goto L_0x0b2f;
                    case 205: goto L_0x0acf;
                    case 206: goto L_0x0aa9;
                    default: goto L_0x0705;
                }
            L_0x0705:
                goto L_0x0cb7
            L_0x0707:
                er1.l0 r0 = er1.C58745l0.f168212a
                gy3.C87412m.m108592e(r13, r4)
                r0.mo83743a(r3, r13)
                di3.d r0 = di3.C86312j.m106911c(r30)
                gy3.C87412m.m108593f(r0, r15)
                r38 = r0
                dp1.y0 r38 = (dp1.C58417y0) r38
                r40 = 1
                long r41 = r3.getItemId()
                r43 = 0
                r44 = 8
                r45 = 0
                r39 = r13
                dp1.C58417y0.Qy0(r38, r39, r40, r41, r43, r44, r45)
                goto L_0x0cb7
            L_0x072d:
                er1.v2$a r37 = er1.C7888v2.f26513a
                gy3.C87412m.m108592e(r13, r4)
                r40 = 0
                r41 = 0
                r42 = 0
                r43 = 28
                r44 = 0
                r38 = r13
                r39 = r3
                er1.C7888v2.C7889a.m8057w(r37, r38, r39, r40, r41, r42, r43, r44)
                long r0 = r3.getItemId()
                dp1.f2 r2 = dp1.C7435f2.f25626a
                rs1.s8$a r3 = rs1.C13442s8.f38060Q0
                rs1.s8 r3 = r3.mo12873f(r13)
                if (r3 == 0) goto L_0x0756
                te3.hj1 r14 = r3.mo12861q3()
                goto L_0x0757
            L_0x0756:
                r14 = 0
            L_0x0757:
                org.json.JSONObject r3 = new org.json.JSONObject
                r3.<init>()
                r4 = 1
                if (r5 != r4) goto L_0x0761
                r13 = 1
                goto L_0x0762
            L_0x0761:
                r13 = 2
            L_0x0762:
                r3.put(r10, r13)
                java.lang.String r0 = o40.C61926c.m72691p(r0)
                r3.put(r11, r0)
                rx3.b0 r0 = rx3.C13598b0.f38549a
                java.lang.String r0 = "button_forward_friendcircle"
                r2.mo8577a(r14, r0, r4, r3)
                goto L_0x0cb7
            L_0x0775:
                er1.v2$a r38 = er1.C7888v2.f26513a
                gy3.C87412m.m108592e(r13, r4)
                com.tencent.mm.plugin.finder.storage.FinderItem r40 = r3.mo3513o()
                r41 = 0
                r42 = 3
                r43 = 0
                r44 = 20
                r45 = 0
                r39 = r13
                er1.C7888v2.C7889a.m8056t(r38, r39, r40, r41, r42, r43, r44, r45)
                long r0 = r3.getItemId()
                dp1.f2 r2 = dp1.C7435f2.f25626a
                rs1.s8$a r3 = rs1.C13442s8.f38060Q0
                rs1.s8 r3 = r3.mo12873f(r13)
                if (r3 == 0) goto L_0x07a0
                te3.hj1 r14 = r3.mo12861q3()
                goto L_0x07a1
            L_0x07a0:
                r14 = 0
            L_0x07a1:
                org.json.JSONObject r3 = new org.json.JSONObject
                r3.<init>()
                r4 = 1
                if (r5 != r4) goto L_0x07ab
                r13 = 1
                goto L_0x07ac
            L_0x07ab:
                r13 = 2
            L_0x07ac:
                r3.put(r10, r13)
                java.lang.String r0 = o40.C61926c.m72691p(r0)
                r3.put(r11, r0)
                rx3.b0 r0 = rx3.C13598b0.f38549a
                java.lang.String r0 = "button_forward_friend"
                r2.mo8577a(r14, r0, r4, r3)
                goto L_0x0cb7
            L_0x07bf:
                er1.j4 r0 = er1.C58739j4.f168176a
                boolean r0 = r0.mo83686O(r3)
                if (r0 == 0) goto L_0x07ef
                com.tencent.mm.plugin.finder.storage.FinderItem r0 = r3.mo3513o()
                te3.c21 r0 = r0.getLiveInfo()
                if (r0 == 0) goto L_0x0800
                long r0 = r0.f182392d
                sf1.a r38 = sf1.C13671a.f38718a
                com.tencent.mm.plugin.finder.storage.FinderItem r4 = r3.mo3513o()
                java.lang.String r42 = r4.getUserName()
                r43 = 0
                r44 = 0
                r45 = 0
                r46 = 56
                r47 = 0
                r39 = r13
                r40 = r0
                sf1.C13671a.m12976c(r38, r39, r40, r42, r43, r44, r45, r46, r47)
                goto L_0x0800
            L_0x07ef:
                sf1.a r37 = sf1.C13671a.f38718a
                r40 = 0
                r42 = 0
                r43 = 12
                r44 = 0
                r38 = r13
                r39 = r3
                sf1.C13671a.m12975b(r37, r38, r39, r40, r42, r43, r44)
            L_0x0800:
                com.tencent.mm.ui.MMActivity r0 = r2.f13136d
                long r1 = r3.getItemId()
                gy3.C87412m.m108594g(r0, r12)
                dp1.f2 r3 = dp1.C7435f2.f25626a
                rs1.s8$a r4 = rs1.C13442s8.f38060Q0
                rs1.s8 r0 = r4.mo12873f(r0)
                if (r0 == 0) goto L_0x0818
                te3.hj1 r14 = r0.mo12861q3()
                goto L_0x0819
            L_0x0818:
                r14 = 0
            L_0x0819:
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>()
                r4 = 1
                if (r5 != r4) goto L_0x0823
                r13 = 1
                goto L_0x0824
            L_0x0823:
                r13 = 2
            L_0x0824:
                r0.put(r10, r13)
                java.lang.String r1 = o40.C61926c.m72691p(r1)
                r0.put(r11, r1)
                rx3.b0 r1 = rx3.C13598b0.f38549a
                java.lang.String r1 = "button_complaint"
                r3.mo8577a(r14, r1, r4, r0)
                goto L_0x0cb7
            L_0x0837:
                com.tencent.mm.plugin.finder.storage.FinderItem r0 = r3.mo3513o()
                boolean r0 = r0.isPostFinish()
                if (r0 == 0) goto L_0x0882
                vp1.e r0 = vp1.C65834e.f189316a
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r3.mo3513o()
                vp1.e$b r4 = vp1.C65834e.C65836b.f189323c
                r0.mo89878l(r1, r4)
                er1.q3 r0 = er1.C58771q3.f168268a
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r3.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r1 = r1.objectDesc
                if (r1 == 0) goto L_0x085d
                te3.ve1 r1 = r1.feedBgmInfo
                goto L_0x085e
            L_0x085d:
                r1 = 0
            L_0x085e:
                com.tencent.mm.plugin.finder.storage.FinderItem r4 = r3.mo3513o()
                long r6 = r4.field_id
                java.lang.Long r4 = java.lang.Long.valueOf(r6)
                r6 = 0
                r0.mo83812c(r13, r1, r4, r6)
                di3.d r0 = di3.C86312j.m106911c(r30)
                dp1.y0 r0 = (dp1.C58417y0) r0
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r3.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.field_finderObject
                int r1 = r1.follow_feed_count
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r4 = 1
                r0.wy0(r13, r4, r4, r1)
            L_0x0882:
                com.tencent.mm.ui.MMActivity r0 = r2.f13136d
                long r1 = r3.getItemId()
                gy3.C87412m.m108594g(r0, r12)
                dp1.f2 r3 = dp1.C7435f2.f25626a
                rs1.s8$a r4 = rs1.C13442s8.f38060Q0
                rs1.s8 r0 = r4.mo12873f(r0)
                if (r0 == 0) goto L_0x089a
                te3.hj1 r14 = r0.mo12861q3()
                goto L_0x089b
            L_0x089a:
                r14 = 0
            L_0x089b:
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>()
                r4 = 1
                if (r5 != r4) goto L_0x08a5
                r13 = 1
                goto L_0x08a6
            L_0x08a5:
                r13 = 2
            L_0x08a6:
                r0.put(r10, r13)
                java.lang.String r1 = o40.C61926c.m72691p(r1)
                r0.put(r11, r1)
                rx3.b0 r1 = rx3.C13598b0.f38549a
                java.lang.String r1 = "button_original_sound"
                r3.mo8577a(r14, r1, r4, r0)
                goto L_0x0cb7
            L_0x08b9:
                er1.w3 r0 = er1.C58784w3.f168295a
                boolean r0 = r0.mo83897Q0(r3)
                if (r0 == 0) goto L_0x0cb7
                com.tencent.mm.plugin.finder.storage.FinderItem r0 = r3.mo3513o()
                boolean r0 = r0.isPostFinish()
                if (r0 == 0) goto L_0x0cb7
                bl3.r r0 = bl3.C39818r.f106831a
                bl3.r$a r0 = r0.mo62443b(r13)
                androidx.lifecycle.i0 r0 = r0.mo75002a(r7)
                rs1.s8 r0 = (rs1.C13442s8) r0
                te3.hj1 r0 = r0.mo12861q3()
                c30.g r1 = new c30.g
                r1.<init>()
                r4 = 1
                if (r5 != r4) goto L_0x08e6
                java.lang.String r5 = "forward"
                goto L_0x08e9
            L_0x08e6:
                java.lang.String r5 = "tridot"
            L_0x08e9:
                java.lang.String r6 = "ref_eid"
                r1.put(r6, r5)
                dp1.f2 r5 = dp1.C7435f2.f25626a
                java.lang.String r6 = "delete"
                r5.mo8580d(r0, r6, r4, r1)
                com.tencent.mm.plugin.finder.storage.FinderItem r0 = r3.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
                int r0 = r0.adFlag
                r0 = r0 & r4
                if (r0 != r4) goto L_0x0904
                r15 = 1
                goto L_0x0905
            L_0x0904:
                r15 = 0
            L_0x0905:
                if (r15 == 0) goto L_0x090b
                r0 = 2131826335(0x7f11169f, float:1.9285551E38)
                goto L_0x091c
            L_0x090b:
                com.tencent.mm.plugin.finder.storage.FinderItem r0 = r3.mo3513o()
                boolean r0 = r0.isPostFromMP()
                if (r0 == 0) goto L_0x0919
                r0 = 2131829601(0x7f112361, float:1.9292176E38)
                goto L_0x091c
            L_0x0919:
                r0 = 2131829600(0x7f112360, float:1.9292174E38)
            L_0x091c:
                kf1.v7 r1 = new kf1.v7
                r1.<init>(r3, r2, r13)
                r2 = 0
                r3 = 0
                nj3.C76879j.m92743n(r13, r0, r2, r1, r3)
                goto L_0x0cb7
            L_0x0928:
                er1.w3 r0 = er1.C58784w3.f168295a
                boolean r0 = r0.mo83889N0()
                if (r0 != 0) goto L_0x093d
                android.content.res.Resources r0 = r13.getResources()
                java.lang.String r0 = r0.getString(r1)
                nj3.C76912y0.m92767f(r13, r0)
                goto L_0x0cb7
            L_0x093d:
                wp1.a r0 = wp1.C66164a.f190162a
                kf1.x7 r1 = new kf1.x7
                r1.<init>(r13, r2)
                r2 = 1
                r0.mo90220a(r13, r3, r2, r1)
                goto L_0x0cb7
            L_0x094a:
                er1.w3 r0 = er1.C58784w3.f168295a
                boolean r0 = r0.mo83889N0()
                if (r0 != 0) goto L_0x095f
                android.content.res.Resources r0 = r13.getResources()
                java.lang.String r0 = r0.getString(r1)
                nj3.C76912y0.m92767f(r13, r0)
                goto L_0x0cb7
            L_0x095f:
                wp1.a r0 = wp1.C66164a.f190162a
                kf1.y7 r1 = new kf1.y7
                r1.<init>(r13, r2)
                r4 = 0
                r0.mo90220a(r13, r3, r4, r1)
                goto L_0x0cb7
            L_0x096c:
                r7 = 2131305309(0x7f09235d, float:1.8228785E38)
                android.view.View r0 = r9.mo85812D(r7)
                com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout r0 = (com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout) r0
                gy3.C87412m.m108593f(r0, r8)
                r6 = 3
                r7 = 0
                gr1.C59667n2.C8415a.m8377a(r0, r7, r4, r6, r7)
                er1.n2 r37 = er1.C7842n2.f26407a
                gy3.C87412m.m108592e(r13, r1)
                r40 = 2
                r42 = 0
                r43 = 0
                r44 = 0
                r45 = 0
                kf1.w7 r1 = new kf1.w7
                r1.<init>(r0, r2)
                r48 = 120(0x78, float:1.68E-43)
                r49 = 0
                r38 = r13
                r39 = r3
                r46 = r9
                r47 = r1
                er1.C7842n2.m7986b(r37, r38, r39, r40, r42, r43, r44, r45, r46, r47, r48, r49)
                long r0 = r3.getItemId()
                dp1.f2 r2 = dp1.C7435f2.f25626a
                rs1.s8$a r3 = rs1.C13442s8.f38060Q0
                rs1.s8 r3 = r3.mo12873f(r13)
                if (r3 == 0) goto L_0x09b3
                te3.hj1 r14 = r3.mo12861q3()
                goto L_0x09b4
            L_0x09b3:
                r14 = 0
            L_0x09b4:
                org.json.JSONObject r3 = new org.json.JSONObject
                r3.<init>()
                r4 = 1
                if (r5 != r4) goto L_0x09be
                r13 = 1
                goto L_0x09bf
            L_0x09be:
                r13 = 2
            L_0x09bf:
                r3.put(r10, r13)
                java.lang.String r0 = o40.C61926c.m72691p(r0)
                r3.put(r11, r0)
                rx3.b0 r0 = rx3.C13598b0.f38549a
                java.lang.String r0 = "button_set_bell"
                r2.mo8577a(r14, r0, r4, r3)
                goto L_0x0cb7
            L_0x09d2:
                er1.v2$a r37 = er1.C7888v2.f26513a
                gy3.C87412m.m108592e(r13, r1)
                r40 = 0
                r41 = 0
                r42 = 12
                r43 = 0
                r38 = r13
                r39 = r3
                er1.C7888v2.C7889a.m8058y(r37, r38, r39, r40, r41, r42, r43)
                long r0 = r3.getItemId()
                dp1.f2 r2 = dp1.C7435f2.f25626a
                rs1.s8$a r4 = rs1.C13442s8.f38060Q0
                rs1.s8 r4 = r4.mo12873f(r13)
                if (r4 == 0) goto L_0x09f9
                te3.hj1 r4 = r4.mo12861q3()
                goto L_0x09fa
            L_0x09f9:
                r4 = 0
            L_0x09fa:
                org.json.JSONObject r6 = new org.json.JSONObject
                r6.<init>()
                r7 = 1
                if (r5 != r7) goto L_0x0a04
                r13 = 1
                goto L_0x0a05
            L_0x0a04:
                r13 = 2
            L_0x0a05:
                r6.put(r10, r13)
                java.lang.String r0 = o40.C61926c.m72691p(r0)
                r6.put(r11, r0)
                rx3.b0 r0 = rx3.C13598b0.f38549a
                java.lang.String r0 = "textstatus_in_menu"
                r2.mo8577a(r4, r0, r7, r6)
                com.tencent.mm.plugin.finder.storage.FinderItem r0 = r3.mo3513o()
                boolean r0 = r0.isLiveFeed()
                if (r0 == 0) goto L_0x0cb7
                ms3.a r4 = ms3.C11091a.f32868a
                com.tencent.mm.plugin.finder.storage.FinderItem r0 = r3.mo3513o()
                te3.c21 r0 = r0.getLiveInfo()
                if (r0 == 0) goto L_0x0a34
                long r0 = r0.f182392d
                java.lang.Long r14 = java.lang.Long.valueOf(r0)
                goto L_0x0a35
            L_0x0a34:
                r14 = 0
            L_0x0a35:
                java.lang.String r5 = java.lang.String.valueOf(r14)
                com.tencent.mm.plugin.finder.storage.FinderItem r0 = r3.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
                long r0 = r0.f164794id
                java.lang.String r6 = java.lang.String.valueOf(r0)
                com.tencent.mm.plugin.finder.storage.FinderItem r0 = r3.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
                java.lang.String r7 = r0.username
                r11 = 0
                r12 = 0
                r13 = 192(0xc0, float:2.69E-43)
                r14 = 0
                java.lang.String r8 = "1"
                java.lang.String r9 = "3"
                java.lang.String r10 = "0"
                ms3.C11091a.m10992b(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
                goto L_0x0cb7
            L_0x0a61:
                android.content.Intent r0 = new android.content.Intent
                r0.<init>()
                java.lang.String r1 = "KEY_FROM_SCENE"
                r2 = 1
                r0.putExtra(r1, r2)
                zc1.b r1 = zc1.C66785b.f191882e
                java.lang.String r1 = r1.mo90662O5()
                java.lang.String r4 = "KEY_USERNAME"
                r0.putExtra(r4, r1)
                java.lang.String r1 = "KEY_FINDER_SELF_FLAG"
                r0.putExtra(r1, r2)
                java.lang.String r1 = "KEY_IS_FULLSCREEN"
                r0.putExtra(r1, r2)
                java.lang.String r1 = "KEY_ENABLE_SWITCH_PREVIEW_MODE"
                r2 = 0
                r0.putExtra(r1, r2)
                er1.w3 r15 = er1.C58784w3.f168295a
                r16 = 0
                java.util.List r17 = sx3.C26236u.m33719b(r3)
                r18 = 0
                r20 = 0
                r21 = 16
                r22 = 0
                r19 = r0
                er1.C58784w3.m68427B1(r15, r16, r17, r18, r19, r20, r21, r22)
                java.lang.Class<er1.b> r1 = er1.C58684b.class
                di3.d r1 = di3.C86312j.m106911c(r1)
                er1.b r1 = (er1.C58684b) r1
                r1.py0(r13, r0)
                goto L_0x0cb7
            L_0x0aa9:
                com.tencent.mm.plugin.finder.storage.FinderItem r0 = r3.mo3513o()
                r20 = 0
                gy3.C87412m.m108594g(r13, r12)
                gy3.C87412m.m108594g(r0, r14)
                di3.d r1 = di3.C86312j.m106911c(r6)
                r15 = r1
                com.tencent.mm.plugin.finder.service.o1 r15 = (com.tencent.p014mm.plugin.finder.service.C3604o1) r15
                long r16 = r0.getId()
                com.tencent.mm.protocal.protobuf.FinderObject r18 = r0.getFeedObject()
                java.lang.String r19 = r0.getObjectNonceId()
                ht1.p5<te3.xc1> r21 = er1.C7794e2.f26302a
                r15.Z70(r16, r18, r19, r20, r21)
                goto L_0x0cb7
            L_0x0acf:
                com.tencent.mm.plugin.finder.storage.FinderItem r0 = r3.mo3513o()
                int r0 = r0.getStickyTime()
                if (r0 == 0) goto L_0x0ae7
                r0 = 2131829579(0x7f11234b, float:1.9292131E38)
                java.lang.String r0 = r13.getString(r0)
                kf1.z7 r1 = kf1.C10068z7.f30833a
                nj3.C76912y0.m92766e(r13, r0, r1)
                goto L_0x0cb7
            L_0x0ae7:
                com.tencent.mm.plugin.finder.storage.FinderItem r0 = r3.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
                int r0 = r0.adFlag
                r1 = 1
                r0 = r0 & r1
                if (r0 != r1) goto L_0x0af7
                r15 = 1
                goto L_0x0af8
            L_0x0af7:
                r15 = 0
            L_0x0af8:
                if (r15 == 0) goto L_0x0b09
                r0 = 2131826336(0x7f1116a0, float:1.9285554E38)
                kf1.a8 r1 = new kf1.a8
                r1.<init>(r13, r3)
                r2 = 0
                r4 = 0
                nj3.C76879j.m92743n(r13, r0, r2, r1, r4)
                goto L_0x0cb7
            L_0x0b09:
                com.tencent.mm.plugin.finder.storage.FinderItem r0 = r3.mo3513o()
                r20 = 1
                gy3.C87412m.m108594g(r13, r12)
                gy3.C87412m.m108594g(r0, r14)
                di3.d r1 = di3.C86312j.m106911c(r6)
                r15 = r1
                com.tencent.mm.plugin.finder.service.o1 r15 = (com.tencent.p014mm.plugin.finder.service.C3604o1) r15
                long r16 = r0.getId()
                com.tencent.mm.protocal.protobuf.FinderObject r18 = r0.getFeedObject()
                java.lang.String r19 = r0.getObjectNonceId()
                ht1.p5<te3.xc1> r21 = er1.C7794e2.f26302a
                r15.Z70(r16, r18, r19, r20, r21)
                goto L_0x0cb7
            L_0x0b2f:
                mf1.k1 r0 = r2.f13150u
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r3.mo3513o()
                long r40 = r1.getId()
                r42 = 0
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r3.mo3513o()
                java.lang.String r43 = r1.getObjectNonceId()
                kf1.r7 r1 = new kf1.r7
                r1.<init>(r13)
                r38 = r0
                r39 = r13
                r44 = r1
                r38.mo11054a(r39, r40, r42, r43, r44)
                goto L_0x0cb7
            L_0x0b53:
                com.tencent.mm.plugin.finder.storage.FinderItem r0 = r3.mo3513o()
                int r0 = r0.getPrivate_flag()
                r1 = 1
                if (r0 != r1) goto L_0x0b70
                android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                r1 = 2131829940(0x7f1124b4, float:1.9292863E38)
                java.lang.String r1 = r13.getString(r1)
                kf1.s7 r2 = kf1.C9972s7.f30651a
                nj3.C76912y0.m92766e(r0, r1, r2)
                goto L_0x0cb7
            L_0x0b70:
                mf1.k1 r0 = r2.f13150u
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r3.mo3513o()
                long r40 = r1.getId()
                r42 = 1
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r3.mo3513o()
                java.lang.String r43 = r1.getObjectNonceId()
                kf1.u7 r1 = new kf1.u7
                r1.<init>(r13)
                r38 = r0
                r39 = r13
                r44 = r1
                r38.mo11054a(r39, r40, r42, r43, r44)
                goto L_0x0cb7
            L_0x0b94:
                r4 = 0
                bl3.r r0 = bl3.C39818r.f106831a
                bl3.r$a r0 = r0.mo62443b(r13)
                r1 = r34
                androidx.lifecycle.i0 r0 = r0.mo75002a(r1)
                r1 = r38
                gy3.C87412m.m108593f(r0, r1)
                rs1.v r0 = (rs1.C63648v) r0
                r1 = 0
                r0.mo88474e3(r9, r1)
                com.tencent.mm.ui.MMActivity r0 = r2.f13136d
                long r1 = r3.getItemId()
                gy3.C87412m.m108594g(r0, r12)
                dp1.f2 r3 = dp1.C7435f2.f25626a
                rs1.s8$a r6 = rs1.C13442s8.f38060Q0
                rs1.s8 r0 = r6.mo12873f(r0)
                if (r0 == 0) goto L_0x0bc4
                te3.hj1 r14 = r0.mo12861q3()
                goto L_0x0bc5
            L_0x0bc4:
                r14 = r4
            L_0x0bc5:
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>()
                r4 = 1
                if (r5 != r4) goto L_0x0bcf
                r13 = 1
                goto L_0x0bd0
            L_0x0bcf:
                r13 = 2
            L_0x0bd0:
                r0.put(r10, r13)
                java.lang.String r1 = o40.C61926c.m72691p(r1)
                r0.put(r11, r1)
                rx3.b0 r1 = rx3.C13598b0.f38549a
                java.lang.String r1 = "button_minimize"
                r3.mo8577a(r14, r1, r4, r0)
                goto L_0x0cb7
            L_0x0be3:
                er1.v2$a r0 = er1.C7888v2.f26513a
                gy3.C87412m.m108592e(r13, r4)
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r3.mo3513o()
                r0.mo9024z(r13, r1)
                goto L_0x0cb7
            L_0x0bf1:
                er1.p2 r0 = er1.C7853p2.f26439a
                gy3.C87412m.m108592e(r13, r4)
                wp1.j r1 = wp1.C15587j.f42215a
                com.tencent.mm.plugin.finder.storage.FinderItem r2 = r3.mo3513o()
                java.lang.String r2 = r2.getFromAppId()
                te3.wf3 r1 = r1.mo14352d(r2)
                r0.mo8961d(r3, r13, r1)
                goto L_0x0cb7
            L_0x0c09:
                com.tencent.mm.ui.MMActivity r0 = r2.f13136d
                r1 = r29
                gy3.C87412m.m108594g(r0, r1)
                gy3.C87412m.m108594g(r3, r14)
                di3.d r1 = di3.C86312j.m106911c(r26)
                hy.o0 r1 = (p166hy.C98567o0) r1
                com.tencent.mm.plugin.finder.storage.FinderItem r2 = r3.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r2 = r2.getFeedObject()
                byte[] r2 = r2.toByteArray()
                r3 = 2
                r4 = 0
                r1.Wk0(r0, r3, r2, r4)
                goto L_0x0cb7
            L_0x0c2c:
                r4 = 0
                com.tencent.mm.plugin.finder.storage.FinderItem r0 = r3.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r0.objectDesc
                if (r0 == 0) goto L_0x0c3c
                te3.ap1 r10 = r0.video_tmpl_info
                goto L_0x0c3d
            L_0x0c3c:
                r10 = r4
            L_0x0c3d:
                if (r10 != 0) goto L_0x0c4a
                r0 = 2131826793(0x7f111869, float:1.928648E38)
                java.lang.String r0 = r13.getString(r0)
                nj3.C76912y0.m92767f(r13, r0)
                goto L_0x0c78
            L_0x0c4a:
                android.content.Intent r0 = new android.content.Intent
                r0.<init>()
                int r1 = r10.f182116e
                r2 = 1
                if (r1 == r2) goto L_0x0c5c
                r2 = 2
                if (r1 == r2) goto L_0x0c59
                r1 = -1
                goto L_0x0c5e
            L_0x0c59:
                r1 = 16
                goto L_0x0c5e
            L_0x0c5c:
                r1 = 13
            L_0x0c5e:
                er1.a1 r2 = er1.C58679a1.f167972a
                r5 = 133(0x85, float:1.86E-43)
                r6 = 13
                r2.mo83554a(r13, r0, r5, r6)
                di3.d r2 = di3.C86312j.m106911c(r25)
                da0.e r2 = (da0.C58247e) r2
                r5 = r28
                r6 = 5
                r0.putExtra(r5, r6)
                rx3.b0 r5 = rx3.C13598b0.f38549a
                r2.qi0(r13, r10, r0, r1)
            L_0x0c78:
                bl3.r r0 = bl3.C39818r.f106831a
                bl3.r$a r0 = r0.mo62443b(r13)
                androidx.lifecycle.i0 r0 = r0.mo75002a(r7)
                rs1.s8 r0 = (rs1.C13442s8) r0
                te3.hj1 r0 = r0.mo12861q3()
                dp1.f2 r1 = dp1.C7435f2.f25626a
                org.json.JSONObject r2 = new org.json.JSONObject
                r2.<init>()
                com.tencent.mm.plugin.finder.storage.FinderItem r3 = r3.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r3 = r3.getFeedObject()
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r3 = r3.objectDesc
                if (r3 == 0) goto L_0x0ca2
                te3.ap1 r3 = r3.video_tmpl_info
                if (r3 == 0) goto L_0x0ca2
                java.lang.String r14 = r3.f182115d
                goto L_0x0ca3
            L_0x0ca2:
                r14 = r4
            L_0x0ca3:
                if (r14 != 0) goto L_0x0caa
                r3 = 0
                java.lang.Integer r14 = java.lang.Integer.valueOf(r3)
            L_0x0caa:
                r3 = r27
                r2.put(r3, r14)
                rx3.b0 r3 = rx3.C13598b0.f38549a
                r3 = r37
                r4 = 1
                r1.mo8580d(r0, r3, r4, r2)
            L_0x0cb7:
                return
            L_0x0cb8:
                pf1.d0 r0 = pf1.C62262d0.f176978a
                r1 = r50
                com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter r2 = r1.f13187e
                com.tencent.mm.ui.MMActivity r2 = r2.f13136d
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r1.f13189g
                int r4 = r1.f13190h
                r0.mo87324p(r2, r3, r4)
                return
            L_0x0cc8:
                r1 = r0
                er1.i1 r0 = er1.C58736i1.f168173a
                com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter r2 = r1.f13187e
                com.tencent.mm.ui.MMActivity r2 = r2.f13136d
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r1.f13189g
                r0.mo83671q(r2, r3)
                return
            L_0x0cd5:
                r1 = r0
                er1.i1 r0 = er1.C58736i1.f168173a
                com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter r2 = r1.f13187e
                com.tencent.mm.ui.MMActivity r2 = r2.f13136d
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r1.f13189g
                int r4 = r1.f13190h
                r0.mo83670p(r2, r3, r4)
                return
            L_0x0ce4:
                r1 = r0
                er1.i1 r0 = er1.C58736i1.f168173a
                com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter r2 = r1.f13187e
                com.tencent.mm.ui.MMActivity r2 = r2.f13136d
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r1.f13189g
                r0.mo83668n(r2, r3)
                return
            L_0x0cf1:
                r1 = r0
                r2 = 2
                r4 = 0
                com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter r0 = r1.f13187e
                kf1.g8 r3 = r0.f13143n
                if (r3 == 0) goto L_0x0d51
                jq3.o r3 = r1.f13188f
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                r6 = 2131302830(0x7f0919ae, float:1.8223757E38)
                android.view.View r6 = r3.mo85812D(r6)
                if (r6 == 0) goto L_0x0d0d
                r5.add(r6)
            L_0x0d0d:
                r6 = 2131302685(0x7f09191d, float:1.8223463E38)
                android.view.View r3 = r3.mo85812D(r6)
                com.tencent.mm.plugin.finder.video.FinderVideoLayout r3 = (com.tencent.p014mm.plugin.finder.video.FinderVideoLayout) r3
                if (r3 == 0) goto L_0x0d1d
                gr1.o2 r3 = r3.getVideoView()
                goto L_0x0d1e
            L_0x0d1d:
                r3 = r4
            L_0x0d1e:
                boolean r6 = r3 instanceof com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy
                if (r6 == 0) goto L_0x0d27
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r3 = (com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy) r3
                r20 = r3
                goto L_0x0d29
            L_0x0d27:
                r20 = r4
            L_0x0d29:
                if (r20 == 0) goto L_0x0d51
                bl3.r r3 = bl3.C39818r.f106831a
                com.tencent.mm.ui.MMActivity r0 = r0.f13136d
                bl3.r$a r0 = r3.mo62444c(r0)
                java.lang.Class<rs1.da> r3 = rs1.C13194da.class
                androidx.lifecycle.i0 r0 = r0.mo75002a(r3)
                java.lang.String r3 = "UICProvider.of(getActivi…edControlUIC::class.java)"
                gy3.C87412m.m108593f(r0, r3)
                r18 = r0
                rs1.da r18 = (rs1.C13194da) r18
                r21 = 0
                r22 = 0
                r23 = 0
                r24 = 28
                r25 = 0
                r19 = r5
                rs1.C13194da.m12605k3(r18, r19, r20, r21, r22, r23, r24, r25)
            L_0x0d51:
                com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter r0 = r1.f13187e
                com.tencent.mm.ui.MMActivity r0 = r0.f13136d
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r1.f13189g
                long r5 = r3.getItemId()
                int r3 = r1.f13190h
                gy3.C87412m.m108594g(r0, r12)
                dp1.f2 r7 = dp1.C7435f2.f25626a
                rs1.s8$a r8 = rs1.C13442s8.f38060Q0
                rs1.s8 r0 = r8.mo12873f(r0)
                if (r0 == 0) goto L_0x0d6f
                te3.hj1 r14 = r0.mo12861q3()
                goto L_0x0d70
            L_0x0d6f:
                r14 = r4
            L_0x0d70:
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>()
                r4 = 1
                if (r3 != r4) goto L_0x0d7a
                r13 = 1
                goto L_0x0d7b
            L_0x0d7a:
                r13 = 2
            L_0x0d7b:
                r0.put(r10, r13)
                java.lang.String r2 = o40.C61926c.m72691p(r5)
                r0.put(r11, r2)
                rx3.b0 r2 = rx3.C13598b0.f38549a
                java.lang.String r2 = "button_speedplay"
                r7.mo8577a(r14, r2, r4, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter.C2544g.onMMMenuItemSelected(android.view.MenuItem, int):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter$h */
    public static final class C2547h implements C11183n0 {

        /* renamed from: a */
        public final /* synthetic */ FinderProfileTimelineContract$ProfileTimelinePresenter f13199a;

        /* renamed from: b */
        public final /* synthetic */ BaseFinderFeed f13200b;

        public C2547h(FinderProfileTimelineContract$ProfileTimelinePresenter finderProfileTimelineContract$ProfileTimelinePresenter, BaseFinderFeed baseFinderFeed) {
            this.f13199a = finderProfileTimelineContract$ProfileTimelinePresenter;
            this.f13200b = baseFinderFeed;
        }

        /* renamed from: a */
        public final void mo2585a(View view, int i, MenuItem menuItem) {
            C58736i1 i1Var = C58736i1.f168173a;
            MMActivity mMActivity = this.f13199a.f13136d;
            C87412m.m108593f(view, "menuView");
            C87412m.m108593f(menuItem, "menuItem");
            i1Var.mo83667m(mMActivity, view, i, menuItem, this.f13200b);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter$i */
    public static final class C2548i implements C11184p0 {

        /* renamed from: d */
        public static final C2548i f13201d = new C2548i();

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter$j */
    public static final class C2549j extends C87413o implements C32224a<RecyclerView.C16623q> {

        /* renamed from: d */
        public static final C2549j f13202d = new C2549j();

        public C2549j() {
            super(0);
        }

        public Object invoke() {
            RecyclerView.C16623q qVar = new RecyclerView.C16623q();
            qVar.mo17336e(1, 10);
            qVar.mo17336e(2, 10);
            return qVar;
        }
    }

    public FinderProfileTimelineContract$ProfileTimelinePresenter(MMActivity mMActivity, String str, boolean z, long j) {
        C87412m.m108594g(mMActivity, "context");
        C87412m.m108594g(str, "username");
        this.f13136d = mMActivity;
        this.f13137e = str;
        this.f13138f = z;
        this.f13139g = j;
        C39818r rVar = C39818r.f106831a;
        this.f13145p = ((C13133c1) rVar.mo62444c(mMActivity).mo75002a(C13133c1.class)).f37371d;
        this.f13146q = ((C8817y2) rVar.mo62444c(mMActivity).mo62447c(C8817y2.class)).mo9643v2();
        boolean z2 = str.equals(C66785b.f191882e.mo90662O5()) && z;
        this.f13147r = z2;
        this.f13148s = z2 ? 1 : 2;
        this.f13149t = ((C15133e0) C86312j.m106911c(C15133e0.class)).Ct0();
        this.f13150u = new C10834k1();
        this.f13153x = new FinderVideoCore(0, 1, (C8480h) null);
        this.f13154y = new C2551x506a2df9(this);
        this.f13155z = new C2552x3985ef84(this, C40008f.f107254d);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
        r0 = r0.getFeedObject();
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m2490q(com.tencent.p014mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter r11, com.tencent.p014mm.plugin.finder.model.BaseFinderFeed r12, nj3.C76874e0 r13, qo3.C77407n r14) {
        /*
            er1.i1 r0 = er1.C58736i1.f168173a
            com.tencent.mm.ui.MMActivity r1 = r11.f13136d
            r0.mo83660f(r1, r13, r12)
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r12.mo3513o()
            r1 = 0
            if (r0 == 0) goto L_0x001b
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
            if (r0 == 0) goto L_0x001b
            er1.w3 r2 = er1.C58784w3.f168295a
            boolean r0 = r2.mo83857B(r0)
            goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r12.mo3513o()
            boolean r2 = r2.isLongVideo()
            if (r2 == 0) goto L_0x004d
            if (r0 != 0) goto L_0x004d
            kf1.g8 r0 = r11.f13143n
            if (r0 == 0) goto L_0x0037
            androidx.recyclerview.widget.RecyclerView r0 = r0.getRecyclerView()
            rs1.da$a r2 = rs1.C13194da.f37515v
            java.lang.String r0 = r2.mo12692a(r0)
            goto L_0x0045
        L_0x0037:
            com.tencent.mm.ui.MMActivity r0 = r11.f13136d
            r2 = 2131832860(0x7f11301c, float:1.9298786E38)
            java.lang.String r0 = r0.getString(r2)
            java.lang.String r2 = "context.getString(R.stri…ga_video_play_speed_text)"
            gy3.C87412m.m108593f(r0, r2)
        L_0x0045:
            r2 = 116(0x74, float:1.63E-43)
            r3 = 2131756416(0x7f100580, float:1.9143739E38)
            r13.mo107144g(r2, r0, r3)
        L_0x004d:
            er1.w3 r0 = er1.C58784w3.f168295a
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r12.mo3513o()
            boolean r2 = r0.mo83980y0(r2)
            if (r2 == 0) goto L_0x0088
            r2 = 109(0x6d, float:1.53E-43)
            java.lang.String r3 = r0.mo83909X(r12)
            r4 = 2131756232(0x7f1004c8, float:1.9143366E38)
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r12.mo3513o()
            boolean r5 = r5.isPostFinish()
            if (r5 == 0) goto L_0x0084
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r12.mo3513o()
            boolean r5 = r5.isPostFailed()
            if (r5 != 0) goto L_0x0084
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r12.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r5 = r5.getFeedObject()
            boolean r0 = r0.mo83979y(r5)
            if (r0 == 0) goto L_0x0085
        L_0x0084:
            r1 = 1
        L_0x0085:
            r13.mo107151k(r2, r3, r4, r1)
        L_0x0088:
            er1.p2 r5 = er1.C7853p2.f26439a
            com.tencent.mm.ui.MMActivity r6 = r11.f13136d
            r10 = 200(0xc8, float:2.8E-43)
            r7 = r12
            r8 = r13
            r9 = r14
            r5.mo8958a(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter.m2490q(com.tencent.mm.plugin.finder.feed.FinderProfileTimelineContract$ProfileTimelinePresenter, com.tencent.mm.plugin.finder.model.BaseFinderFeed, nj3.e0, qo3.n):void");
    }

    /* renamed from: t */
    public static final void m2491t(FinderProfileTimelineContract$ProfileTimelinePresenter finderProfileTimelineContract$ProfileTimelinePresenter, C77407n nVar) {
        if (finderProfileTimelineContract$ProfileTimelinePresenter.f13136d.isFinishing() || !nVar.mo107563h()) {
            String str = finderProfileTimelineContract$ProfileTimelinePresenter.f13140h;
            Log.m105924i(str, "context is finishing or not showing :" + nVar.mo107563h());
            return;
        }
        try {
            nVar.mo107564i();
        } catch (Exception e) {
            Log.printDebugStack(finderProfileTimelineContract$ProfileTimelinePresenter.f13140h, "", e);
        }
    }

    /* renamed from: A1 */
    public C11182m0 mo2569A1(BaseFinderFeed baseFinderFeed, C77407n nVar) {
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(nVar, "sheet");
        return new C2540c(baseFinderFeed, this, nVar);
    }

    /* renamed from: B5 */
    public C11182m0 mo2570B5(BaseFinderFeed baseFinderFeed, C77407n nVar) {
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(nVar, "sheet");
        return C2542e.f13181d;
    }

    /* renamed from: D1 */
    public RecyclerView.C16623q mo2571D1() {
        return (RecyclerView.C16623q) ((C36570n) this.f13141i).getValue();
    }

    /* renamed from: J0 */
    public void mo2572J0(BaseFinderFeed baseFinderFeed, boolean z, int i) {
        int i2;
        C87412m.m108594g(baseFinderFeed, "feed");
        C0751m0.m691b(C0751m0.f1769a, this.f13136d, ((C13442s8) C39818r.f106831a.mo62444c(this.f13136d).mo75002a(C13442s8.class)).mo12861q3(), baseFinderFeed, z ? 1 : 2, false, i, 16, (Object) null);
        C58961d.C58963b bVar = C58961d.f168673a;
        C58969q l = baseFinderFeed.mo3507l();
        String username = l != null ? l.getUsername() : "";
        if (z) {
            IAutoDBItem.MAutoDBInfo mAutoDBInfo = C58969q.f168705a2;
            i2 = C58969q.f168707c2;
        } else {
            IAutoDBItem.MAutoDBInfo mAutoDBInfo2 = C58969q.f168705a2;
            i2 = 0;
        }
        bVar.mo84161i(username, i2);
    }

    /* renamed from: X2 */
    public C11184p0 mo2573X2(BaseFinderFeed baseFinderFeed, C60905o oVar) {
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(oVar, "holder");
        return C2548i.f13201d;
    }

    /* renamed from: Y4 */
    public C11184p0 mo2574Y4(BaseFinderFeed baseFinderFeed, int i, C60905o oVar, C32224a<C13598b0> aVar) {
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(oVar, "holder");
        return new C2544g(aVar, this, oVar, baseFinderFeed, i);
    }

    /* renamed from: d7 */
    public C11182m0 mo2568d7(BaseFinderFeed baseFinderFeed, C77407n nVar, C60905o oVar) {
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(nVar, "sheet");
        C87412m.m108594g(oVar, "holder");
        return new C2541d(baseFinderFeed, this, nVar);
    }

    /* renamed from: f5 */
    public C47269o0 mo2575f5(C77407n nVar, BaseFinderFeed baseFinderFeed, int i, C60905o oVar) {
        C87412m.m108594g(nVar, "bottomSheet");
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(oVar, "holder");
        return new C2543f(this, baseFinderFeed, nVar, oVar);
    }

    public MMActivity getActivity() {
        return this.f13136d;
    }

    public void keep(C9486a aVar) {
        C87412m.m108594g(aVar, "p0");
        this.f13142j.add(aVar);
    }

    /* renamed from: n6 */
    public void mo2577n6(FinderItem finderItem, boolean z, C60905o oVar, int i) {
        C87412m.m108594g(finderItem, "feed");
        C55031t.f154490a.mo76085a(this.f13136d, finderItem, z, 2, i);
    }

    public void onDetach() {
        C58553c a;
        C58553c a2;
        C58553c a3;
        this.f13145p.onDetach();
        C13442s8.C13443a aVar = C13442s8.f38060Q0;
        C13442s8 f = aVar.mo12873f(this.f13136d);
        if (!(f == null || (a3 = C60172g4.C60173a.m70189a(f, 0, 1, (Object) null)) == null)) {
            a3.mo83453d(this.f13145p);
        }
        this.f13146q.onDetach();
        C13442s8 f2 = aVar.mo12873f(this.f13136d);
        if (!(f2 == null || (a2 = C60172g4.C60173a.m70189a(f2, 0, 1, (Object) null)) == null)) {
            a2.mo83453d(this.f13146q.mo9650n());
        }
        C13442s8 f3 = aVar.mo12873f(this.f13136d);
        if (!(f3 == null || (a = C60172g4.C60173a.m70189a(f3, 0, 1, (Object) null)) == null)) {
            C58555d dVar = this.f13152w;
            if (dVar != null) {
                a.mo83453d(dVar);
            } else {
                C87412m.m108603p("observerForExposeReport");
                throw null;
            }
        }
        C65838f.f189333a.mo89882c();
        for (C9486a dead : this.f13142j) {
            dead.dead();
        }
        this.f13142j.clear();
        this.f13143n = null;
        this.f13154y.dead();
        this.f13155z.dead();
        ContactUninterestEventListener contactUninterestEventListener = this.f13151v;
        if (contactUninterestEventListener != null) {
            contactUninterestEventListener.dead();
        }
    }

    /* renamed from: p1 */
    public FinderVideoCore mo2578p1() {
        return this.f13153x;
    }

    /* renamed from: r5 */
    public C56597e1 mo2579r5() {
        return ((C63545b1) C39818r.f106831a.mo62444c(this.f13136d).mo75002a(C63545b1.class)).f180225d;
    }

    /* renamed from: u0 */
    public boolean mo2497u0() {
        return this.f13147r;
    }

    /* renamed from: u4 */
    public C11183n0 mo2580u4(BaseFinderFeed baseFinderFeed, C77407n nVar) {
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(nVar, "sheet");
        return new C2547h(this, baseFinderFeed);
    }

    /* renamed from: v3 */
    public void mo2581v3(BaseFinderFeed baseFinderFeed, boolean z, boolean z2, int i, boolean z3) {
        BaseFinderFeed baseFinderFeed2 = baseFinderFeed;
        C87412m.m108594g(baseFinderFeed, "feed");
        C0768q0.f1810a.mo710a(((C13442s8) C39818r.f106831a.mo62444c(this.f13136d).mo75002a(C13442s8.class)).mo12861q3(), i, baseFinderFeed.mo3513o(), z, z2, 2, baseFinderFeed.mo3468B(), z3, C58739j4.f168176a.mo83688Q(baseFinderFeed.mo3507l()));
    }

    /* renamed from: w1 */
    public C11182m0 mo2582w1(BaseFinderFeed baseFinderFeed, C77407n nVar, int i) {
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(nVar, "sheet");
        return new C2535b(this, baseFinderFeed, i, nVar);
    }

    /* renamed from: x */
    public final FinderProfileFeedLoader mo2583x() {
        return (FinderProfileFeedLoader) this.f13144o.getValue();
    }
}
