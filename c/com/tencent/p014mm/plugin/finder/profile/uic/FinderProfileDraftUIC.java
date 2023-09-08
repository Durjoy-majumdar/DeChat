package com.tencent.p014mm.plugin.finder.profile.uic;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C39622i0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0740i2;
import cm1.C55027r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.plugin.finder.feed.model.FinderProfileDraftLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.HardTouchableLayout;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import jq3.C60898l;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import mo1.C11025q;
import mo1.C11062x;
import mo1.C47092o;
import mo1.C61525p;
import o40.C61926c;
import p192l4.C10462b;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import uo3.C78253a;
import ye1.C66623a0;
import zp3.C16380c;

/* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileDraftUIC */
public final class FinderProfileDraftUIC extends C11062x {

    /* renamed from: o */
    public final C13601g f160603o = C36568h.m40985a(new C56214j(this));

    /* renamed from: p */
    public final C13601g f160604p = C36568h.m40985a(new C56213i(this));

    /* renamed from: q */
    public FrameLayout f160605q;

    /* renamed from: r */
    public final C13601g f160606r = C36568h.m40985a(new C56212h(this));

    /* renamed from: s */
    public C78253a f160607s;

    /* renamed from: t */
    public WxRecyclerAdapter<C0740i2> f160608t;

    /* renamed from: u */
    public final C13601g f160609u = C36568h.m40985a(new C56206b(this));

    /* renamed from: v */
    public final C13601g f160610v = C36568h.m40985a(new C56207c(this));

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileDraftUIC$a */
    public final class C56204a extends C16380c {

        /* renamed from: e */
        public final /* synthetic */ FinderProfileDraftUIC f160611e;

        /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileDraftUIC$a$a */
        public static final class C56205a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ FinderProfileDraftUIC f160612d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C56205a(FinderProfileDraftUIC finderProfileDraftUIC) {
                super(0);
                this.f160612d = finderProfileDraftUIC;
            }

            public Object invoke() {
                Fragment fragment = this.f160612d.getFragment();
                boolean z = true;
                if (fragment == null || !fragment.isDetached()) {
                    z = false;
                }
                if (!z) {
                    FrameLayout frameLayout = this.f160612d.f160605q;
                    if (frameLayout != null) {
                        frameLayout.setOnClickListener((View.OnClickListener) null);
                        frameLayout.setVisibility(8);
                    }
                    if (this.f160612d.mo78511c3().f158682g == FinderProfileDraftLoader.C55743a.NO_CACHE && this.f160612d.mo78511c3().getDataListJustForAdapter().size() == 0) {
                        FinderProfileDraftUIC finderProfileDraftUIC = this.f160612d;
                        FrameLayout frameLayout2 = finderProfileDraftUIC.f160605q;
                        if (frameLayout2 != null) {
                            frameLayout2.setVisibility(0);
                            ((C66623a0) ((C36570n) finderProfileDraftUIC.f160603o).getValue()).f191570c.setVisibility(0);
                            ((C66623a0) ((C36570n) finderProfileDraftUIC.f160603o).getValue()).f191571d.setVisibility(8);
                            ((C66623a0) ((C36570n) finderProfileDraftUIC.f160603o).getValue()).f191569b.setVisibility(8);
                        }
                    } else if (this.f160612d.mo78511c3().getDataListJustForAdapter().size() > 0) {
                        this.f160612d.mo78513e3();
                    }
                    Log.m105924i("Finder.FinderProfileDraftUIC", "[updateState] cachedState=" + this.f160612d.mo78511c3().f158682g);
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56204a(FinderProfileDraftUIC finderProfileDraftUIC, RefreshLoadMoreLayout refreshLoadMoreLayout) {
            super(refreshLoadMoreLayout);
            C87412m.m108594g(refreshLoadMoreLayout, "rlLayout");
            this.f160611e = finderProfileDraftUIC;
        }

        /* renamed from: a */
        public void mo5115a() {
            C61926c.m72666K(0, new C56205a(this.f160611e));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileDraftUIC$b */
    public static final class C56206b extends C87413o implements C32224a<C56204a> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileDraftUIC f160613d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56206b(FinderProfileDraftUIC finderProfileDraftUIC) {
            super(0);
            this.f160613d = finderProfileDraftUIC;
        }

        public Object invoke() {
            FinderProfileDraftUIC finderProfileDraftUIC = this.f160613d;
            RefreshLoadMoreLayout d3 = finderProfileDraftUIC.mo78512d3();
            C87412m.m108593f(d3, "rlLayout");
            return new C56204a(finderProfileDraftUIC, d3);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileDraftUIC$c */
    public static final class C56207c extends C87413o implements C32224a<FinderProfileDraftLoader> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileDraftUIC f160614d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56207c(FinderProfileDraftUIC finderProfileDraftUIC) {
            super(0);
            this.f160614d = finderProfileDraftUIC;
        }

        public Object invoke() {
            return new FinderProfileDraftLoader(this.f160614d.getUsername(), this.f160614d.getContextObj());
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileDraftUIC$d */
    public static final class C56208d extends RefreshLoadMoreLayout.C57879a {

        /* renamed from: a */
        public final /* synthetic */ FinderProfileDraftUIC f160615a;

        public C56208d(FinderProfileDraftUIC finderProfileDraftUIC) {
            this.f160615a = finderProfileDraftUIC;
        }

        /* renamed from: b */
        public void mo2561b(int i) {
            BaseFeedLoader.requestLoadMore$default(this.f160615a.mo78511c3(), false, 1, (Object) null);
        }

        /* renamed from: d */
        public void mo3680d(int i) {
            this.f160615a.mo78511c3().requestRefresh();
        }

        /* renamed from: e */
        public void mo3681e(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            RecyclerView recyclerView = this.f160615a.mo78512d3().getRecyclerView();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(recyclerView, aVar.mo10232b(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileDraftUIC$onCreate$1", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "Undefined", "scrollToPosition", "(I)V");
            recyclerView.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(recyclerView, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileDraftUIC$onCreate$1", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "Undefined", "scrollToPosition", "(I)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileDraftUIC$e */
    public static final class C56209e implements C60898l.C9502b<C60905o> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileDraftUIC f160616d;

        /* renamed from: e */
        public final /* synthetic */ boolean f160617e;

        public C56209e(FinderProfileDraftUIC finderProfileDraftUIC, boolean z) {
            this.f160616d = finderProfileDraftUIC;
            this.f160617e = z;
        }

        /* JADX WARNING: type inference failed for: r6v13, types: [te3.db1] */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x01c6, code lost:
            if (r9 != false) goto L_0x01c8;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: q */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo734q(androidx.recyclerview.widget.RecyclerView.C16613e r18, android.view.View r19, int r20, androidx.recyclerview.widget.RecyclerView.C16631z r21) {
            /*
                r17 = this;
                r1 = r17
                r0 = r21
                jq3.o r0 = (jq3.C60905o) r0
                java.lang.Class<er1.b> r2 = er1.C58684b.class
                java.lang.String r3 = "adapter"
                r4 = r18
                gy3.C87412m.m108594g(r4, r3)
                java.lang.String r3 = "view"
                r4 = r19
                gy3.C87412m.m108594g(r4, r3)
                java.lang.String r3 = "holder"
                gy3.C87412m.m108594g(r0, r3)
                java.lang.Object r3 = r0.f173503E
                cm1.i2 r3 = (cm1.C0740i2) r3
                boolean r4 = r3 instanceof cm1.C55027r
                if (r4 == 0) goto L_0x04d6
                java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r4 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
                di3.d r4 = di3.C86312j.m106911c(r4)
                com.tencent.mm.plugin.FinderCommonFeatureService r4 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r4
                wp1.b r4 = r4.Cx0()
                r5 = r3
                cm1.r r5 = (cm1.C55027r) r5
                up1.l r6 = r5.f154485d
                long r6 = r6.field_localId
                up1.l r4 = r4.mo90229qq(r6)
                r6 = 0
                java.lang.String r7 = "Finder.FinderProfileDraftUIC"
                if (r4 != 0) goto L_0x0074
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "draftItem empty, "
                r0.append(r2)
                up1.l r2 = r5.f154485d
                java.lang.String r2 = r2.mo89515m2()
                r0.append(r2)
                r2 = 32
                r0.append(r2)
                up1.l r2 = r5.f154485d
                com.tencent.mm.plugin.finder.storage.FinderItem r2 = r2.mo89514l2()
                com.tencent.mm.protocal.protobuf.FinderObject r2 = r2.getFeedObject()
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r2 = r2.objectDesc
                if (r2 == 0) goto L_0x0068
                java.lang.String r6 = r2.description
            L_0x0068:
                r0.append(r6)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r0)
                goto L_0x04d6
            L_0x0074:
                bl3.r r5 = bl3.C39818r.f106831a
                android.content.Context r0 = r0.f173499A
                java.lang.String r8 = "holder.context"
                gy3.C87412m.m108593f(r0, r8)
                bl3.r$a r0 = r5.mo62443b(r0)
                java.lang.Class<mo1.q> r8 = mo1.C11025q.class
                androidx.lifecycle.i0 r0 = r0.mo75002a(r8)
                java.lang.String r8 = "UICProvider.of(holder.co…rofileEduUIC::class.java)"
                gy3.C87412m.m108593f(r0, r8)
                r9 = r0
                mo1.q r9 = (mo1.C11025q) r9
                r11 = 1
                long r12 = r3.getItemId()
                java.lang.String r12 = o40.C61926c.m72691p(r12)
                r13 = 0
                r14 = 0
                r15 = 24
                r16 = 0
                java.lang.String r10 = "draft"
                mo1.C11025q.m10965k3(r9, r10, r11, r12, r13, r14, r15, r16)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r3 = "onItemClick position:"
                r0.append(r3)
                r3 = r20
                r0.append(r3)
                java.lang.String r3 = "},objectType:"
                r0.append(r3)
                int r3 = r4.field_objectType
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
                int r0 = r4.field_objectType
                java.lang.String r3 = ""
                r8 = 2
                r9 = 0
                r10 = 1
                if (r0 == r10) goto L_0x01f1
                if (r0 != 0) goto L_0x00d1
                goto L_0x01f1
            L_0x00d1:
                boolean r0 = r1.f160617e
                if (r0 == 0) goto L_0x0111
                com.tencent.mm.plugin.finder.profile.uic.FinderProfileDraftUIC r0 = r1.f160616d
                r0.getClass()
                qo3.q r2 = new qo3.q
                android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                r2.<init>(r3)
                android.app.Activity r3 = r0.getContext()
                android.content.res.Resources r3 = r3.getResources()
                r4 = 2131826465(0x7f111721, float:1.9285815E38)
                java.lang.String r3 = r3.getString(r4)
                r2.mo107595g(r3)
                android.app.Activity r0 = r0.getContext()
                android.content.res.Resources r0 = r0.getResources()
                r3 = 2131826228(0x7f111634, float:1.9285334E38)
                java.lang.String r0 = r0.getString(r3)
                r2.mo107602n(r0)
                mo1.n r0 = mo1.C61523n.f174888a
                r2.mo107600l(r0)
                r2.mo107603o()
                goto L_0x04d6
            L_0x0111:
                java.lang.Class<ox.b> r0 = p640ox.C77049b.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                ox.b r0 = (p640ox.C77049b) r0
                com.tencent.mm.plugin.finder.profile.uic.FinderProfileDraftUIC r2 = r1.f160616d
                androidx.appcompat.app.AppCompatActivity r2 = r2.getActivity()
                r7 = 7
                java.lang.Class<te3.w23> r11 = te3.C64793w23.class
                java.lang.String r12 = "MusicMvMainUI"
                pe3.a r0 = r0.mo72357nb(r2, r12, r7, r11)
                te3.w23 r0 = (te3.C64793w23) r0
                if (r0 == 0) goto L_0x0159
                com.tencent.mm.plugin.finder.profile.uic.FinderProfileDraftUIC r2 = r1.f160616d
                java.util.UUID r7 = java.util.UUID.randomUUID()
                java.lang.String r7 = r7.toString()
                java.lang.String r11 = "randomUUID().toString()"
                gy3.C87412m.m108593f(r7, r11)
                r0.f186034e = r7
                r7 = 86
                r0.f186035f = r7
                r7 = 10
                r0.f186033d = r7
                androidx.appcompat.app.AppCompatActivity r2 = r2.getActivity()
                bl3.r$a r2 = r5.mo62444c(r2)
                java.lang.Class<rs1.s8> r5 = rs1.C13442s8.class
                androidx.lifecycle.i0 r2 = r2.mo75002a(r5)
                rs1.s8 r2 = (rs1.C13442s8) r2
                java.lang.String r2 = r2.f38098n
                r0.f186038i = r2
            L_0x0159:
                gy3.d0 r0 = new gy3.d0
                r0.<init>()
                com.tencent.mm.plugin.finder.storage.FinderItem r2 = r4.mo89514l2()
                com.tencent.mm.protocal.protobuf.FinderObject r2 = r2.getFinderObject()
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r5 = r2.objectDesc
                if (r5 == 0) goto L_0x01aa
                te3.hb1 r5 = r5.mvInfo
                if (r5 == 0) goto L_0x01aa
                te3.kb1 r5 = r5.f183456e
                if (r5 == 0) goto L_0x01aa
                up1.e0 r7 = up1.C65415e0.f188260a
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r12 = "finder_local_"
                r11.append(r12)
                java.lang.String r12 = r5.f183909i
                if (r12 != 0) goto L_0x0188
                long r12 = r4.field_localId
                java.lang.Long r12 = java.lang.Long.valueOf(r12)
            L_0x0188:
                r11.append(r12)
                java.lang.String r11 = r11.toString()
                r12 = 13
                com.tencent.mm.plugin.finder.storage.FinderItem r13 = r4.mo89514l2()
                java.util.LinkedList r13 = r13.getMediaList()
                java.lang.Object r13 = sx3.C110818d0.m150916N(r13)
                te3.rq2 r13 = (te3.C64689rq2) r13
                if (r13 == 0) goto L_0x01a7
                java.lang.String r13 = r13.f185266d
                if (r13 != 0) goto L_0x01a6
                goto L_0x01a7
            L_0x01a6:
                r3 = r13
            L_0x01a7:
                r7.mo89506d(r5, r11, r12, r3)
            L_0x01aa:
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r2 = r2.objectDesc
                if (r2 == 0) goto L_0x01b8
                te3.hb1 r3 = r2.mvInfo
                if (r3 == 0) goto L_0x01b8
                int r3 = r3.f183462n
                if (r3 != r8) goto L_0x01b8
                r3 = 1
                goto L_0x01b9
            L_0x01b8:
                r3 = 0
            L_0x01b9:
                if (r3 != 0) goto L_0x01c8
                if (r2 == 0) goto L_0x01c6
                te3.hb1 r2 = r2.mvInfo
                if (r2 == 0) goto L_0x01c6
                int r2 = r2.f183462n
                if (r2 != r10) goto L_0x01c6
                r9 = 1
            L_0x01c6:
                if (r9 == 0) goto L_0x01ca
            L_0x01c8:
                r0.f27483d = r8
            L_0x01ca:
                com.tencent.mm.plugin.finder.profile.uic.FinderProfileDraftUIC r2 = r1.f160616d
                com.tencent.mm.plugin.finder.profile.uic.a r3 = new com.tencent.mm.plugin.finder.profile.uic.a
                r3.<init>(r2, r0)
                r2.getClass()
                up1.l$a r0 = up1.C65418l.f188265M
                te3.p23 r0 = r0.mo89518b(r4)
                com.tencent.mm.plugin.finder.storage.FinderItem r5 = r4.mo89514l2()
                te3.lq2 r5 = r5.field_clipList
                if (r5 != 0) goto L_0x01ec
                mo1.m r5 = new mo1.m
                r5.<init>(r0, r4, r2, r3)
                o40.C61926c.m72656A(r6, r5)
                goto L_0x04d6
            L_0x01ec:
                r3.invoke(r0)
                goto L_0x04d6
            L_0x01f1:
                int r0 = r4.field_dbversion
                java.lang.String[] r5 = wp1.C66165b.f190163n
                if (r0 != 0) goto L_0x01f9
                r0 = 1
                goto L_0x01fa
            L_0x01f9:
                r0 = 0
            L_0x01fa:
                java.lang.String r5 = "context"
                java.lang.String r11 = "KEY_FINDER_POST_DRAFT_LOCAL_ID"
                java.lang.String r12 = "key_finder_post_from"
                if (r0 == 0) goto L_0x0293
                java.lang.String r0 = "old version"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
                android.content.Intent r0 = new android.content.Intent
                r0.<init>()
                r0.putExtra(r12, r10)
                long r6 = r4.field_localId
                r0.putExtra(r11, r6)
                java.lang.String r3 = "KEY_FINDER_POST_DRAFT_FROM_OLD_VERSION"
                r0.putExtra(r3, r10)
                di3.d r2 = di3.C86312j.m106911c(r2)
                er1.b r2 = (er1.C58684b) r2
                com.tencent.mm.plugin.finder.profile.uic.FinderProfileDraftUIC r3 = r1.f160616d
                androidx.appcompat.app.AppCompatActivity r3 = r3.getActivity()
                java.lang.String r6 = r4.field_postIntent
                java.lang.String r7 = "draftItem.field_postIntent"
                gy3.C87412m.m108593f(r6, r7)
                r2.getClass()
                gy3.C87412m.m108594g(r3, r5)
                boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
                if (r5 != 0) goto L_0x049e
                byte[] r5 = ft3.C45807d.m51085b(r6)     // Catch:{ Exception -> 0x027a }
                android.os.Parcel r6 = android.os.Parcel.obtain()     // Catch:{ Exception -> 0x027a }
                java.lang.String r7 = "obtain()"
                gy3.C87412m.m108593f(r6, r7)     // Catch:{ Exception -> 0x027a }
                int r7 = r5.length     // Catch:{ Exception -> 0x027a }
                r6.unmarshall(r5, r9, r7)     // Catch:{ Exception -> 0x027a }
                r6.setDataPosition(r9)     // Catch:{ Exception -> 0x027a }
                android.os.Parcelable$Creator r5 = android.content.Intent.CREATOR     // Catch:{ Exception -> 0x027a }
                java.lang.Object r5 = r5.createFromParcel(r6)     // Catch:{ Exception -> 0x027a }
                android.content.Intent r5 = (android.content.Intent) r5     // Catch:{ Exception -> 0x027a }
                com.tencent.mm.plugin.finder.video.LocalVideoCropInfoParcelable$a r6 = com.tencent.p014mm.plugin.finder.video.LocalVideoCropInfoParcelable.CREATOR     // Catch:{ Exception -> 0x027a }
                java.lang.Class r6 = r6.getClass()     // Catch:{ Exception -> 0x027a }
                java.lang.ClassLoader r6 = r6.getClassLoader()     // Catch:{ Exception -> 0x027a }
                r5.setExtrasClassLoader(r6)     // Catch:{ Exception -> 0x027a }
                r5.putExtras(r0)     // Catch:{ Exception -> 0x027a }
                java.lang.String r0 = "saveText"
                java.lang.String r0 = r5.getStringExtra(r0)     // Catch:{ Exception -> 0x027a }
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ Exception -> 0x027a }
                if (r0 != 0) goto L_0x0275
                r2.Fx0(r3, r5)     // Catch:{ Exception -> 0x027a }
                goto L_0x049e
            L_0x0275:
                r2.Vx0(r3, r5)     // Catch:{ Exception -> 0x027a }
                goto L_0x049e
            L_0x027a:
                r0 = move-exception
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "goDraft() "
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                java.lang.String r2 = "Finder.ActivityRouter"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
                goto L_0x049e
            L_0x0293:
                android.content.Intent r0 = new android.content.Intent
                r0.<init>()
                r0.putExtra(r12, r10)
                long r12 = r4.field_localId
                r0.putExtra(r11, r12)
                long r11 = r4.field_objectId
                java.lang.String r7 = "KEY_FINDER_POST_DRAFT_SVR_ID"
                r0.putExtra(r7, r11)
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r11 = "extractDraftToIntent localId:"
                r7.append(r11)
                long r11 = r4.field_localId
                r7.append(r11)
                java.lang.String r11 = " des:"
                r7.append(r11)
                com.tencent.mm.plugin.finder.storage.FinderItem r11 = r4.mo89514l2()
                com.tencent.mm.protocal.protobuf.FinderObject r11 = r11.getFeedObject()
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r11 = r11.objectDesc
                if (r11 == 0) goto L_0x02ca
                java.lang.String r11 = r11.description
                goto L_0x02cb
            L_0x02ca:
                r11 = r6
            L_0x02cb:
                r7.append(r11)
                java.lang.String r11 = " showOrigin:"
                r7.append(r11)
                com.tencent.mm.plugin.finder.storage.FinderItem r11 = r4.mo89514l2()
                com.tencent.mm.protocal.protobuf.FinderObject r11 = r11.getFeedObject()
                boolean r11 = r11.showOriginal
                r7.append(r11)
                java.lang.String r7 = r7.toString()
                java.lang.String r11 = "Finder.FinderDraftStorageLogic"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r7)
                com.tencent.mm.plugin.finder.storage.FinderItem r7 = r4.mo89514l2()
                int r7 = r7.getMediaType()
                java.lang.String r11 = "postType"
                if (r7 == r8) goto L_0x02fc
                r8 = 4
                if (r7 == r8) goto L_0x02fc
                r0.removeExtra(r11)
                goto L_0x0307
            L_0x02fc:
                com.tencent.mm.plugin.finder.storage.FinderItem r7 = r4.mo89514l2()
                int r7 = r7.getMediaType()
                r0.putExtra(r11, r7)
            L_0x0307:
                com.tencent.mm.plugin.finder.storage.FinderItem$a r7 = com.tencent.p014mm.plugin.finder.storage.FinderItem.Companion
                com.tencent.mm.plugin.finder.storage.FinderItem r8 = r4.mo89514l2()
                te3.vq0 r7 = r7.mo79059e(r8)
                byte[] r7 = r7.toByteArray()
                java.lang.String r8 = "KEY_POST_DRAFT_FINDER_ITEM"
                r0.putExtra(r8, r7)
                int r7 = r4.field_watermarkFlag
                java.lang.String r8 = "KEY_POST_DRAFT_WATERMARK_FLAG"
                r0.putExtra(r8, r7)
                com.tencent.mm.plugin.finder.storage.FinderItem r7 = r4.mo89514l2()
                boolean r7 = r7.isLongVideo()
                java.lang.String r8 = "isLongVideoPost"
                r0.putExtra(r8, r7)
                com.tencent.mm.plugin.finder.storage.FinderItem r7 = r4.mo89514l2()
                com.tencent.mm.protocal.protobuf.FinderObject r7 = r7.getFeedObject()
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r7 = r7.objectDesc
                if (r7 == 0) goto L_0x03bb
                te3.fh0 r7 = r7.client_draft_ext_info
                if (r7 == 0) goto L_0x03bb
                te3.zj0 r7 = r7.f183134e
                if (r7 == 0) goto L_0x03bb
                java.lang.String r8 = "saveActivity"
                r0.putExtra(r8, r10)
                int r8 = r7.f146019u
                if (r8 != 0) goto L_0x034e
                r8 = 101(0x65, float:1.42E-43)
                goto L_0x0350
            L_0x034e:
                r8 = 102(0x66, float:1.43E-43)
            L_0x0350:
                java.lang.String r11 = "key_activity_type"
                r0.putExtra(r11, r8)
                int r8 = r7.f146019u
                if (r8 != 0) goto L_0x0360
                zc1.b r8 = zc1.C66785b.f191882e
                java.lang.String r8 = r8.mo90662O5()
                goto L_0x0369
            L_0x0360:
                com.tencent.mm.protocal.protobuf.FinderContact r8 = r7.f146006e
                if (r8 == 0) goto L_0x0368
                java.lang.String r8 = r8.username
                if (r8 != 0) goto L_0x0369
            L_0x0368:
                r8 = r3
            L_0x0369:
                java.lang.String r11 = "key_user_name"
                r0.putExtra(r11, r8)
                com.tencent.mm.protocal.protobuf.FinderContact r8 = r7.f146006e
                if (r8 == 0) goto L_0x0375
                java.lang.String r8 = r8.nickname
                goto L_0x0376
            L_0x0375:
                r8 = r6
            L_0x0376:
                java.lang.String r11 = "key_nick_name"
                r0.putExtra(r11, r8)
                java.lang.String r8 = r7.f146010i
                java.lang.String r11 = "key_cover_url"
                r0.putExtra(r11, r8)
                long r11 = r7.f146022x
                java.lang.String r8 = "key_activity_display_mask"
                r0.putExtra(r8, r11)
                com.tencent.mm.protocal.protobuf.FinderContact r8 = r7.f146006e
                if (r8 == 0) goto L_0x0393
                java.lang.String r8 = r8.headUrl
                if (r8 != 0) goto L_0x0392
                goto L_0x0393
            L_0x0392:
                r3 = r8
            L_0x0393:
                java.lang.String r8 = "key_avatar_url"
                r0.putExtra(r8, r3)
                long r11 = r7.f146005d
                java.lang.String r3 = "key_topic_id"
                r0.putExtra(r3, r11)
                java.lang.String r3 = r7.f146007f
                java.lang.String r8 = "key_activity_name"
                r0.putExtra(r8, r3)
                java.lang.String r3 = r7.f146008g
                java.lang.String r8 = "key_activity_desc"
                r0.putExtra(r8, r3)
                long r7 = r7.f146018t
                java.lang.String r3 = "key_activity_end_time"
                r0.putExtra(r3, r7)
                java.lang.String r3 = "key_activity_src_type"
                java.lang.String r7 = "key_scene_from_profile"
                r0.putExtra(r3, r7)
            L_0x03bb:
                com.tencent.mm.plugin.finder.storage.FinderItem r3 = r4.mo89514l2()
                java.lang.String r3 = r3.getDescription()
                java.lang.String r7 = "saveDesc"
                r0.putExtra(r7, r3)
                com.tencent.mm.plugin.finder.storage.FinderItem r3 = r4.mo89514l2()
                com.tencent.mm.protocal.protobuf.FinderObject r3 = r3.getFeedObject()
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r3 = r3.objectDesc
                if (r3 == 0) goto L_0x03f4
                java.util.LinkedList<te3.zk1> r3 = r3.short_title
                if (r3 == 0) goto L_0x03f4
                java.lang.Object r3 = sx3.C110818d0.m150916N(r3)
                te3.zk1 r3 = (te3.C52277zk1) r3
                if (r3 == 0) goto L_0x03f4
                java.lang.String r3 = r3.f146050d
                if (r3 == 0) goto L_0x03f4
                int r7 = r3.length()
                if (r7 <= 0) goto L_0x03ec
                r7 = 1
                goto L_0x03ed
            L_0x03ec:
                r7 = 0
            L_0x03ed:
                if (r7 == 0) goto L_0x03f4
                java.lang.String r7 = "saveShortTitle"
                r0.putExtra(r7, r3)
            L_0x03f4:
                long r7 = r4.field_extraInfoFlag
                java.lang.String r3 = "EXT_INFO_FLAG"
                r0.putExtra(r3, r7)
                com.tencent.mm.plugin.finder.storage.FinderItem r3 = r4.mo89514l2()
                com.tencent.mm.protocal.protobuf.FinderObject r3 = r3.getFeedObject()
                boolean r3 = r3.showOriginal
                if (r3 == 0) goto L_0x040a
                r7 = 1
                goto L_0x040c
            L_0x040a:
                r7 = 0
            L_0x040c:
                java.lang.String r3 = "ORIGIN_POST_FLAG"
                r0.putExtra(r3, r7)
                com.tencent.mm.plugin.finder.storage.FinderItem r3 = r4.mo89514l2()
                com.tencent.mm.protocal.protobuf.FinderObject r3 = r3.getFeedObject()
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r3 = r3.objectDesc
                if (r3 == 0) goto L_0x041f
                te3.db1 r6 = r3.location
            L_0x041f:
                java.lang.String r3 = "saveLocation"
                if (r6 != 0) goto L_0x0427
                r0.putExtra(r3, r9)
                goto L_0x0464
            L_0x0427:
                r0.putExtra(r3, r10)
                com.tencent.mm.plugin.finder.storage.FinderItem r3 = r4.mo89514l2()
                com.tencent.mm.protocal.protobuf.FinderObject r3 = r3.getFeedObject()
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r3 = r3.objectDesc
                if (r3 == 0) goto L_0x0464
                te3.db1 r3 = r3.location
                if (r3 == 0) goto L_0x0464
                java.lang.String r6 = r3.f182664g
                java.lang.String r7 = "get_poi_name"
                r0.putExtra(r7, r6)
                java.lang.String r6 = r3.f182663f
                java.lang.String r7 = "get_city"
                r0.putExtra(r7, r6)
                float r6 = r3.f182662e
                java.lang.String r7 = "get_lat"
                r0.putExtra(r7, r6)
                float r6 = r3.f182661d
                java.lang.String r7 = "get_lng"
                r0.putExtra(r7, r6)
                java.lang.String r6 = r3.f182665h
                java.lang.String r7 = "get_poi_address"
                r0.putExtra(r7, r6)
                java.lang.String r3 = r3.f182666i
                java.lang.String r6 = "get_poi_classify_id"
                r0.putExtra(r6, r3)
            L_0x0464:
                com.tencent.mm.plugin.finder.storage.FinderItem r3 = r4.mo89514l2()
                com.tencent.mm.protocal.protobuf.FinderObject r3 = r3.getFeedObject()
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r3 = r3.objectDesc
                if (r3 == 0) goto L_0x0489
                te3.jk0 r3 = r3.extReading
                if (r3 == 0) goto L_0x0489
                java.lang.String r6 = r3.f183802d
                java.lang.String r7 = "saveExtendReadingLink"
                r0.putExtra(r7, r6)
                java.lang.String r6 = r3.f183803e
                java.lang.String r7 = "saveExtendReadingTitle"
                r0.putExtra(r7, r6)
                int r3 = r3.f183805g
                java.lang.String r6 = "saveExtendReadingStyle"
                r0.putExtra(r6, r3)
            L_0x0489:
                di3.d r2 = di3.C86312j.m106911c(r2)
                er1.b r2 = (er1.C58684b) r2
                com.tencent.mm.plugin.finder.profile.uic.FinderProfileDraftUIC r3 = r1.f160616d
                androidx.appcompat.app.AppCompatActivity r3 = r3.getActivity()
                r2.getClass()
                gy3.C87412m.m108594g(r3, r5)
                r2.Vx0(r3, r0)
            L_0x049e:
                dp1.t0 r0 = dp1.C58408t0.f167336a
                r2 = 12
                r0.mo83266l(r2, r10)
                com.tencent.mm.protocal.protobuf.FinderFeedReportObject r2 = dp1.C58408t0.f167337b
                if (r2 != 0) goto L_0x04aa
                goto L_0x04ac
            L_0x04aa:
                r2.draftType = r10
            L_0x04ac:
                long r3 = r4.field_localId
                if (r2 == 0) goto L_0x04b3
                int r4 = (int) r3
                r2.draftId = r4
            L_0x04b3:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                f40.e r3 = f40.C86709a0.m107523b()
                java.lang.String r3 = r3.mo121111i()
                r2.append(r3)
                r3 = 95
                r2.append(r3)
                long r3 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r0.mo83264j(r2)
            L_0x04d6:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileDraftUIC.C56209e.mo734q(androidx.recyclerview.widget.RecyclerView$e, android.view.View, int, androidx.recyclerview.widget.RecyclerView$z):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileDraftUIC$f */
    public static final class C56210f implements C60898l.C9503c<C60905o> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileDraftUIC f160618d;

        public C56210f(FinderProfileDraftUIC finderProfileDraftUIC) {
            this.f160618d = finderProfileDraftUIC;
        }

        /* renamed from: n */
        public boolean mo759n(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
            C60905o oVar = (C60905o) zVar;
            C87412m.m108594g(eVar, "adapter");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(oVar, "holder");
            C0740i2 i2Var = (C0740i2) oVar.f173503E;
            if (i2Var instanceof C55027r) {
                Log.m105924i("Finder.FinderProfileDraftUIC", "onItemClick position:" + i + '}');
                FinderProfileDraftUIC finderProfileDraftUIC = this.f160618d;
                C55027r rVar = (C55027r) i2Var;
                C78253a aVar = finderProfileDraftUIC.f160607s;
                if (aVar != null) {
                    aVar.mo108266a();
                    C39622i0 a = C39818r.f106831a.mo62444c(finderProfileDraftUIC.getActivity()).mo75002a(C11025q.class);
                    C87412m.m108593f(a, "UICProvider.of(activity)…rofileEduUIC::class.java)");
                    C11025q.m10965k3((C11025q) a, "draftdelete", 0, C61926c.m72691p(rVar.f154485d.field_localId), 0, (String) null, 24, (Object) null);
                    C78253a aVar2 = finderProfileDraftUIC.f160607s;
                    if (aVar2 != null) {
                        C47092o oVar2 = new C47092o(finderProfileDraftUIC);
                        C61525p pVar = new C61525p(rVar, finderProfileDraftUIC);
                        aVar2.mo108273h(view, oVar2, pVar, HardTouchableLayout.f165562q, HardTouchableLayout.f165563r);
                        return true;
                    }
                    C87412m.m108603p("popupMenu");
                    throw null;
                }
                C87412m.m108603p("popupMenu");
                throw null;
            }
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileDraftUIC$g */
    public static final class C56211g extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileDraftUIC f160619d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56211g(FinderProfileDraftUIC finderProfileDraftUIC) {
            super(0);
            this.f160619d = finderProfileDraftUIC;
        }

        public Object invoke() {
            this.f160619d.mo78512d3().setHasBottomMore(false);
            C61926c.m72668M(new C56234b(this.f160619d));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileDraftUIC$h */
    public static final class C56212h extends C87413o implements C32224a<RecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileDraftUIC f160620d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56212h(FinderProfileDraftUIC finderProfileDraftUIC) {
            super(0);
            this.f160620d = finderProfileDraftUIC;
        }

        public Object invoke() {
            return this.f160620d.mo78512d3().getRecyclerView();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileDraftUIC$i */
    public static final class C56213i extends C87413o implements C32224a<RefreshLoadMoreLayout> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileDraftUIC f160621d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56213i(FinderProfileDraftUIC finderProfileDraftUIC) {
            super(0);
            this.f160621d = finderProfileDraftUIC;
        }

        public Object invoke() {
            return ((C66623a0) ((C36570n) this.f160621d.f160603o).getValue()).f191568a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileDraftUIC$j */
    public static final class C56214j extends C87413o implements C32224a<C66623a0> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileDraftUIC f160622d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56214j(FinderProfileDraftUIC finderProfileDraftUIC) {
            super(0);
            this.f160622d = finderProfileDraftUIC;
        }

        public Object invoke() {
            View findViewById = this.f160622d.findViewById(C0966R.C0970id.gks);
            FrameLayout frameLayout = (FrameLayout) findViewById;
            int i = C0966R.C0970id.i5g;
            FrameLayout frameLayout2 = (FrameLayout) C10462b.m10395a(findViewById, C0966R.C0970id.i5g);
            if (frameLayout2 != null) {
                i = C0966R.C0970id.i5i;
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) C10462b.m10395a(findViewById, C0966R.C0970id.i5i);
                if (coordinatorLayout != null) {
                    i = C0966R.C0970id.i6k;
                    WxRecyclerView wxRecyclerView = (WxRecyclerView) C10462b.m10395a(findViewById, C0966R.C0970id.i6k);
                    if (wxRecyclerView != null) {
                        i = C0966R.C0970id.ivb;
                        RefreshLoadMoreLayout refreshLoadMoreLayout = (RefreshLoadMoreLayout) C10462b.m10395a(findViewById, C0966R.C0970id.ivb);
                        if (refreshLoadMoreLayout != null) {
                            i = C0966R.C0970id.kne;
                            ProgressBar progressBar = (ProgressBar) C10462b.m10395a(findViewById, C0966R.C0970id.kne);
                            if (progressBar != null) {
                                i = C0966R.C0970id.knh;
                                TextView textView = (TextView) C10462b.m10395a(findViewById, C0966R.C0970id.knh);
                                if (textView != null) {
                                    i = C0966R.C0970id.knl;
                                    TextView textView2 = (TextView) C10462b.m10395a(findViewById, C0966R.C0970id.knl);
                                    if (textView2 != null) {
                                        return new C66623a0(frameLayout, frameLayout, frameLayout2, coordinatorLayout, wxRecyclerView, refreshLoadMoreLayout, progressBar, textView, textView2);
                                    }
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
    public FinderProfileDraftUIC(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }

    /* renamed from: c3 */
    public final FinderProfileDraftLoader mo78511c3() {
        return (FinderProfileDraftLoader) ((C36570n) this.f160610v).getValue();
    }

    /* renamed from: d3 */
    public final RefreshLoadMoreLayout mo78512d3() {
        return (RefreshLoadMoreLayout) ((C36570n) this.f160604p).getValue();
    }

    /* renamed from: e3 */
    public final void mo78513e3() {
        View loadMoreFooter = mo78512d3().getLoadMoreFooter();
        if (loadMoreFooter != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(loadMoreFooter, aVar.mo10232b(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileDraftUIC", "showFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            loadMoreFooter.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(loadMoreFooter, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileDraftUIC", "showFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            loadMoreFooter.setBackgroundColor(loadMoreFooter.getResources().getColor(C0966R.color.al6));
            View findViewById = loadMoreFooter.findViewById(C0966R.C0970id.g2t);
            if (findViewById != null) {
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(8);
                C117292a.m165358d(findViewById, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileDraftUIC", "showFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(findViewById, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileDraftUIC", "showFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            TextView textView = (TextView) loadMoreFooter.findViewById(C0966R.C0970id.c_u);
            if (textView != null) {
                textView.setText(loadMoreFooter.getResources().getString(C0966R.string.d6z));
            }
            View findViewById2 = loadMoreFooter.findViewById(C0966R.C0970id.g2s);
            if (findViewById2 != null) {
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(0);
                View view = findViewById2;
                C117292a.m165358d(view, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileDraftUIC", "showFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileDraftUIC", "showFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359779ao2;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo78511c3().register((C56204a) ((C36570n) this.f160609u).getValue());
        FrameLayout frameLayout = (FrameLayout) findViewById(C0966R.C0970id.i5g);
        this.f160605q = frameLayout;
        if (frameLayout != null) {
            frameLayout.setBackgroundResource(C0966R.C0969drawable.a46);
        }
        FrameLayout frameLayout2 = this.f160605q;
        if (frameLayout2 != null) {
            frameLayout2.setVisibility(0);
        }
        this.f160607s = new C78253a(getActivity());
        mo78512d3().setSuperNestedScroll(true);
        mo78512d3().setEnableRefresh(false);
        mo78512d3().setEnableLoadMore(false);
        mo78512d3().setActionCallback(new C56208d(this));
        Fragment fragment = getFragment();
        FinderProfileDraftFragment finderProfileDraftFragment = fragment instanceof FinderProfileDraftFragment ? (FinderProfileDraftFragment) fragment : null;
        boolean z = finderProfileDraftFragment != null ? finderProfileDraftFragment.f160602q : false;
        RefreshLoadMoreLayout d3 = mo78512d3();
        View inflate = C85868k2.m106137b(getActivity()).inflate(C0966R.C0971layout.a_9, (ViewGroup) null);
        C87412m.m108593f(inflate, "getInflater(activity).in…inder_draft_footer, null)");
        d3.setLoadMoreFooter(inflate);
        ((RecyclerView) ((C36570n) this.f160606r).getValue()).setLayoutManager(new LinearLayoutManager(getActivity()));
        this.f160608t = new WxRecyclerAdapter<>(new FinderProfileDraftUIC$onCreate$2(z), mo78511c3().getDataListJustForAdapter(), true);
        ((RecyclerView) ((C36570n) this.f160606r).getValue()).setAdapter(this.f160608t);
        WxRecyclerAdapter<C0740i2> wxRecyclerAdapter = this.f160608t;
        if (wxRecyclerAdapter != null) {
            wxRecyclerAdapter.f173488o = new C56209e(this, z);
        }
        if (wxRecyclerAdapter != null) {
            wxRecyclerAdapter.f173487n = new C56210f(this);
        }
        mo78511c3().f158681f = new C56211g(this);
        mo78511c3().requestInit(false);
        mo78511c3().requestRefresh();
    }

    public void onDestroy() {
        super.onDestroy();
        mo78511c3().unregister((C56204a) ((C36570n) this.f160609u).getValue());
    }

    public void onUserVisibleFocused() {
        super.onUserVisibleFocused();
    }
}
