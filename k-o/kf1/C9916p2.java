package kf1;

import al1.C0081n;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import cj1.C0576n4;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.finder.feed.model.internal.DataBuffer;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderConfigForNewLiveCardStyle;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.storage.FinderStaggeredConfig;
import com.tencent.p014mm.plugin.finder.video.FinderVideoCore;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.HeadFooterLayout;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C7335d;
import di3.C86312j;
import dq1.C7461a;
import er1.C58684b;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import ls3.C10649f;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import te3.C49098d51;
import te3.C64273c21;
import te3.C64279c90;
import te3.C64686ro2;
import te3.C64848y91;
import tf0.C13883o1;
import up1.C14367u0;
import up1.C37521f;
import zc1.C66785b;

/* renamed from: kf1.p2 */
public final class C9916p2 extends C9753h implements HeadFooterLayout.C57874a {

    /* renamed from: A */
    public final C13601g f30540A;

    /* renamed from: B */
    public final C13601g f30541B;

    /* renamed from: u */
    public final View f30542u;

    /* renamed from: v */
    public final Fragment f30543v;

    /* renamed from: w */
    public final C7461a f30544w;

    /* renamed from: x */
    public final C13601g f30545x;

    /* renamed from: y */
    public C14367u0 f30546y;

    /* renamed from: z */
    public final C13601g f30547z;

    /* renamed from: kf1.p2$a */
    public static final class C9917a extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ MMActivity f30548d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9917a(MMActivity mMActivity) {
            super(0);
            this.f30548d = mMActivity;
        }

        public Object invoke() {
            return Integer.valueOf(C75044y4.m89989a(this.f30548d));
        }
    }

    /* renamed from: kf1.p2$b */
    public static final class C9918b implements FinderVideoCore.C56519a {

        /* renamed from: a */
        public final /* synthetic */ C9916p2 f30549a;

        public C9918b(C9916p2 p2Var) {
            this.f30549a = p2Var;
        }

        /* renamed from: a */
        public boolean mo3742a() {
            return true;
        }

        /* renamed from: b */
        public boolean mo3743b() {
            return true;
        }

        /* renamed from: c */
        public RecyclerView mo3744c() {
            return this.f30549a.f30220j.getRecyclerView();
        }

        public DataBuffer<C0740i2> getData() {
            return this.f30549a.mo10348I0().f30175e.getDataListJustForAdapter();
        }
    }

    /* renamed from: kf1.p2$c */
    public static final class C9919c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C9916p2 f30550d;

        /* renamed from: e */
        public final /* synthetic */ C0740i2 f30551e;

        /* renamed from: f */
        public final /* synthetic */ View f30552f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9919c(C9916p2 p2Var, C0740i2 i2Var, View view) {
            super(0);
            this.f30550d = p2Var;
            this.f30551e = i2Var;
            this.f30552f = view;
        }

        public Object invoke() {
            this.f30550d.mo10450b1((BaseFinderFeed) this.f30551e, true, this.f30552f);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: kf1.p2$d */
    public static final class C9920d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C9916p2 f30553d;

        /* renamed from: e */
        public final /* synthetic */ C0740i2 f30554e;

        /* renamed from: f */
        public final /* synthetic */ View f30555f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9920d(C9916p2 p2Var, C0740i2 i2Var, View view) {
            super(0);
            this.f30553d = p2Var;
            this.f30554e = i2Var;
            this.f30555f = view;
        }

        public Object invoke() {
            this.f30553d.mo10450b1((BaseFinderFeed) this.f30554e, true, this.f30555f);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: kf1.p2$e */
    public static final class C9921e extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ MMActivity f30556d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9921e(MMActivity mMActivity) {
            super(0);
            this.f30556d = mMActivity;
        }

        public Object invoke() {
            return Integer.valueOf(C75044y4.m89994f(this.f30556d));
        }
    }

    /* renamed from: kf1.p2$f */
    public static final class C9922f extends C87413o implements C32224a<Float> {

        /* renamed from: d */
        public final /* synthetic */ MMActivity f30557d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9922f(MMActivity mMActivity) {
            super(0);
            this.f30557d = mMActivity;
        }

        public Object invoke() {
            return Float.valueOf(this.f30557d.getResources().getDimension(C0966R.dimen.f3758d_));
        }
    }

    /* renamed from: kf1.p2$g */
    public static final class C9923g extends C87413o implements C32224a<FinderVideoCore> {

        /* renamed from: d */
        public final /* synthetic */ int f30558d;

        /* renamed from: e */
        public final /* synthetic */ int f30559e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9923g(int i, int i2) {
            super(0);
            this.f30558d = i;
            this.f30559e = i2;
        }

        public Object invoke() {
            C37521f.f99374d.getClass();
            int intValue = C37521f.f99373c8.mo60266n().intValue();
            if (intValue < 1) {
                return null;
            }
            if (intValue == 1 && this.f30558d == 170) {
                return new FinderVideoCore(this.f30559e);
            }
            if (intValue == 2 && this.f30558d == 155) {
                return new FinderVideoCore(this.f30559e);
            }
            if (intValue == 3) {
                return new FinderVideoCore(this.f30559e);
            }
            return null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9916p2(MMActivity mMActivity, int i, int i2, View view, Fragment fragment) {
        super(mMActivity, 0, i, false, i2);
        C7461a aVar;
        C87412m.m108594g(mMActivity, "context");
        C87412m.m108594g(view, "parent");
        this.f30542u = view;
        this.f30543v = fragment;
        boolean z = true;
        if (i == 170) {
            aVar = new C7461a();
            C37521f.f99374d.getClass();
            aVar.f25669a = C37521f.f99331X7.mo60266n().intValue();
            aVar.f25670b = C37521f.f99340Y7.mo60266n().intValue() == 2;
            aVar.f25671c = C37521f.f99349Z7.mo60266n().intValue();
            aVar.f25672d = C37521f.f99357a8.mo60266n().intValue();
            aVar.f25673e = C37521f.f99313V7.mo60266n().intValue() == 0;
            aVar.f25674f = C37521f.f99322W7.mo60266n().intValue() != 1 ? false : z;
        } else {
            aVar = new C7461a();
            C37521f.f99374d.getClass();
            aVar.f25673e = C37521f.f99313V7.mo60266n().intValue() != 0 ? false : z;
            aVar.f25670b = false;
        }
        this.f30544w = aVar;
        C13601g a = C36568h.m40985a(new C9923g(i, i2));
        this.f30545x = a;
        this.f30546y = new FinderConfigForNewLiveCardStyle(mMActivity, aVar, i, (FinderVideoCore) ((C36570n) a).getValue());
        this.f30547z = C36568h.m40985a(new C9921e(mMActivity));
        this.f30540A = C36568h.m40985a(new C9917a(mMActivity));
        this.f30541B = C36568h.m40985a(new C9922f(mMActivity));
    }

    /* renamed from: F0 */
    public View mo9289F0() {
        return null;
    }

    /* renamed from: G0 */
    public RecyclerView.C0129l mo9290G0() {
        ((FinderStaggeredConfig) this.f30546y).getClass();
        return new FinderStaggeredConfig.C3631b();
    }

    /* renamed from: H0 */
    public RecyclerView.LayoutManager mo9291H0(Context context) {
        C87412m.m108594g(context, "context");
        return this.f30546y.mo3666d(context);
    }

    /* renamed from: J0 */
    public CharSequence mo9292J0(RefreshLoadMoreLayout.C7080c cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        return null;
    }

    /* renamed from: N0 */
    public float mo10349N0() {
        C37521f.f99374d.getClass();
        return C37521f.f99164E8.mo60266n().floatValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:114:0x03dc  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x03eb  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x03ed  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0431  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x04be  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x04d1  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0519  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0529  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0253  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x02a1  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x02bd  */
    /* renamed from: Q0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo9294Q0(androidx.recyclerview.widget.RecyclerView.C16613e<?> r29, android.view.View r30, int r31) {
        /*
            r28 = this;
            r1 = r28
            r0 = r29
            r15 = r30
            r2 = r31
            lt1.a r3 = lt1.C61401a.FINDER_NORMAL_FLOW
            java.lang.Class<er1.b> r11 = er1.C58684b.class
            java.lang.String r4 = "adapter"
            gy3.C87412m.m108594g(r0, r4)
            java.lang.String r4 = "view"
            gy3.C87412m.m108594g(r15, r4)
            jq3.l r0 = (jq3.C60898l) r0
            int r0 = r0.mo85796c6()
            int r12 = r2 - r0
            if (r12 < 0) goto L_0x0628
            kf1.g r0 = r28.mo10348I0()
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r0 = r0.f30175e
            int r0 = r0.getSize()
            if (r12 >= r0) goto L_0x0628
            kf1.g r0 = r28.mo10348I0()
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r0 = r0.f30175e
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r0 = r0.getDataListJustForAdapter()
            java.lang.Object r0 = r0.get(r12)
            r14 = r0
            cm1.i2 r14 = (cm1.C0740i2) r14
            boolean r0 = r14 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            java.lang.String r13 = "FinderFollowFeedUIContract.ViewCallback"
            if (r0 != 0) goto L_0x005e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "onClick pos:"
            r0.append(r2)
            r0.append(r12)
            java.lang.String r2 = ", is not base finder feed"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)
            return
        L_0x005e:
            er1.j4 r0 = er1.C58739j4.f168176a
            boolean r4 = r0.mo83683L()
            if (r4 == 0) goto L_0x008b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "onItemClick return for fastClick pos:"
            r0.append(r3)
            r0.append(r2)
            java.lang.String r2 = " feedId:"
            r0.append(r2)
            long r2 = r14.getItemId()
            java.lang.String r2 = o40.C61926c.m72691p(r2)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)
            return
        L_0x008b:
            r10 = r14
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r10 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r10
            boolean r0 = r0.mo83686O(r10)
            up1.f r2 = up1.C37521f.f99374d
            r2.getClass()
            pe1.c<java.lang.Integer> r2 = up1.C37521f.f99324X0
            java.lang.Object r2 = r2.mo60266n()
            java.lang.Number r2 = (java.lang.Number) r2
            int r9 = r2.intValue()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "onClick id="
            r2.append(r4)
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r10.mo3513o()
            long r4 = r4.getId()
            java.lang.String r4 = o40.C61926c.m72691p(r4)
            r2.append(r4)
            java.lang.String r4 = ", pos="
            r2.append(r4)
            r2.append(r12)
            java.lang.String r4 = ", isLiveFeed="
            r2.append(r4)
            r2.append(r0)
            java.lang.String r4 = ", followTimelineType="
            r2.append(r4)
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r2)
            java.lang.String r2 = ""
            r16 = 0
            r6 = 1
            if (r0 == 0) goto L_0x0344
            java.lang.String r0 = "nearby-live-preview-view-tag"
            android.view.View r0 = r15.findViewWithTag(r0)
            boolean r4 = r0 instanceof ns3.C11265c
            if (r4 == 0) goto L_0x00ef
            ns3.c r0 = (ns3.C11265c) r0
            goto L_0x00f1
        L_0x00ef:
            r0 = r16
        L_0x00f1:
            r4 = 2131315201(0x7f094a01, float:1.8248849E38)
            android.view.View r9 = r15.findViewById(r4)
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r10.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r4 = r4.getFeedObject()
            te3.c21 r4 = r4.liveInfo
            if (r4 == 0) goto L_0x0108
            long r4 = r4.f182367M
            int r5 = (int) r4
            goto L_0x0109
        L_0x0108:
            r5 = 0
        L_0x0109:
            r4 = 256(0x100, float:3.59E-43)
            boolean r4 = o40.C61926c.m72696u(r5, r4)
            if (r0 == 0) goto L_0x0119
            boolean r5 = r0.isPlaying()
            if (r5 == 0) goto L_0x0119
            r5 = 1
            goto L_0x011a
        L_0x0119:
            r5 = 0
        L_0x011a:
            com.tencent.mm.plugin.finder.storage.FinderItem r11 = r10.mo3513o()
            te3.c21 r11 = r11.getLiveInfo()
            if (r11 == 0) goto L_0x012a
            int r11 = r11.f182394f
            if (r11 != r6) goto L_0x012a
            r11 = 1
            goto L_0x012b
        L_0x012a:
            r11 = 0
        L_0x012b:
            if (r0 == 0) goto L_0x0135
            boolean r12 = r0.mo11323b()
            if (r12 == 0) goto L_0x0135
            r12 = 1
            goto L_0x0136
        L_0x0135:
            r12 = 0
        L_0x0136:
            if (r0 == 0) goto L_0x013d
            android.view.TextureView r17 = r0.getTextureView()
            goto L_0x013f
        L_0x013d:
            r17 = r16
        L_0x013f:
            if (r0 == 0) goto L_0x014c
            android.view.TextureView r18 = r0.getTextureView()
            if (r18 == 0) goto L_0x014c
            android.graphics.SurfaceTexture r18 = r18.getSurfaceTexture()
            goto L_0x014e
        L_0x014c:
            r18 = r16
        L_0x014e:
            if (r18 == 0) goto L_0x0151
            goto L_0x0152
        L_0x0151:
            r6 = 0
        L_0x0152:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "startSwitchOutFromSquare animation for feed:"
            r7.append(r8)
            long r19 = r14.getItemId()
            java.lang.String r8 = o40.C61926c.m72691p(r19)
            r7.append(r8)
            java.lang.String r8 = " liveStatusOpen:"
            r7.append(r8)
            r7.append(r11)
            java.lang.String r8 = " isPlaying:"
            r7.append(r8)
            r7.append(r5)
            java.lang.String r8 = " isAudioMode"
            r7.append(r8)
            r7.append(r4)
            java.lang.String r8 = " isFirstFrameRendered:"
            r7.append(r8)
            r7.append(r12)
            r19 = r8
            java.lang.String r8 = " isSurfaceTextureAvailable:"
            r7.append(r8)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r7)
            java.lang.String r8 = " liveView:"
            if (r0 == 0) goto L_0x022b
            if (r17 == 0) goto L_0x022b
            if (r5 == 0) goto L_0x022b
            if (r12 == 0) goto L_0x022b
            if (r4 != 0) goto L_0x022b
            if (r11 == 0) goto L_0x022b
            if (r6 == 0) goto L_0x022b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "startSwitchOutFromSquare video animation for feed:"
            r2.append(r4)
            long r4 = r14.getItemId()
            java.lang.String r4 = o40.C61926c.m72691p(r4)
            r2.append(r4)
            r2.append(r8)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r2)
            r2 = r14
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r2
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r2.mo3513o()
            long r4 = r2.getId()
            ph1.g r13 = new ph1.g
            int r7 = r0.getVideoWidth()
            int r8 = r0.getVideoHeight()
            float r9 = r0.getVideoRatioWH()
            java.lang.Object r0 = r0.mo11322a()
            boolean r2 = r0 instanceof f50.C58924d
            if (r2 == 0) goto L_0x01f0
            f50.d r0 = (f50.C58924d) r0
            goto L_0x01f2
        L_0x01f0:
            r0 = r16
        L_0x01f2:
            r11 = 0
            r19 = 0
            r20 = 0
            r2 = r13
            r12 = 1
            r6 = r30
            r18 = r10
            r10 = r0
            r12 = r17
            r0 = r13
            r13 = r19
            r24 = r14
            r14 = r20
            r2.<init>(r3, r4, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r2 = 2131307699(0x7f092cb3, float:1.8233633E38)
            android.view.View r2 = r15.findViewById(r2)
            r0.f177080m = r2
            ph1.i r2 = ph1.C62293i.f177081a
            com.tencent.mm.ui.MMActivity r3 = r1.f30214d
            ph1.m r0 = r2.mo87363h(r3, r0)
            kf1.p2$c r2 = new kf1.p2$c
            r14 = r24
            r2.<init>(r1, r14, r15)
            r0.mo84323h(r2)
            r13 = r15
            r15 = 0
            r17 = 1
            goto L_0x0341
        L_0x022b:
            r18 = r10
            if (r11 == 0) goto L_0x0312
            if (r9 == 0) goto L_0x0312
            r4 = r14
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r4 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r4
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r4.mo3513o()
            long r5 = r5.getId()
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = r4.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r7 = r7.getFeedObject()
            te3.c21 r7 = r7.liveInfo
            if (r7 == 0) goto L_0x024f
            int r7 = r7.f182384X
            r11 = 1
            if (r7 != r11) goto L_0x0250
            r7 = 1
            goto L_0x0251
        L_0x024f:
            r11 = 1
        L_0x0250:
            r7 = 0
        L_0x0251:
            if (r7 == 0) goto L_0x0255
            r7 = r2
            goto L_0x0266
        L_0x0255:
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = r4.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r7 = r7.getFeedObject()
            te3.c21 r7 = r7.liveInfo
            if (r7 == 0) goto L_0x0264
            java.lang.String r7 = r7.f182395g
            goto L_0x0266
        L_0x0264:
            r7 = r16
        L_0x0266:
            ph1.d r10 = new ph1.d
            android.view.ViewParent r11 = r9.getParent()
            r31 = r8
            java.lang.String r8 = "null cannot be cast to non-null type android.view.ViewGroup"
            gy3.C87412m.m108592e(r11, r8)
            r8 = r11
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            if (r7 != 0) goto L_0x027a
            r11 = r2
            goto L_0x027b
        L_0x027a:
            r11 = r7
        L_0x027b:
            java.lang.Class<ir.n> r2 = p565ir.C60606n.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            ir.n r2 = (p565ir.C60606n) r2
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = r4.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r7 = r7.getFeedObject()
            te3.c21 r7 = r7.liveInfo
            boolean r2 = r2.mo85008I1(r7)
            r17 = 1
            r20 = r2 ^ 1
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r4.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r2.getFeedObject()
            te3.c21 r2 = r2.liveInfo
            if (r2 == 0) goto L_0x02bd
            te3.bq2 r2 = r2.f182358D
            if (r2 == 0) goto L_0x02b8
            pe3.b r2 = r2.f182318j
            if (r2 == 0) goto L_0x02b8
            te3.cq2 r4 = new te3.cq2
            r4.<init>()
            byte[] r2 = r2.mo123703f()
            r4.parseFrom(r2)
            te3.zp2 r2 = r4.f182556f
            goto L_0x02ba
        L_0x02b8:
            r2 = r16
        L_0x02ba:
            r23 = r2
            goto L_0x02bf
        L_0x02bd:
            r23 = r16
        L_0x02bf:
            r2 = r10
            r4 = r5
            r6 = r8
            r7 = r9
            r15 = r31
            r9 = r19
            r8 = r11
            r11 = r9
            r9 = r20
            r29 = r13
            r13 = r10
            r10 = r23
            r2.<init>(r3, r4, r6, r7, r8, r9, r10)
            ph1.i r2 = ph1.C62293i.f177081a
            com.tencent.mm.ui.MMActivity r3 = r1.f30214d
            ph1.m r2 = r2.mo87363h(r3, r13)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "startSwitchOutFromSquare image animation for feed:"
            r3.append(r4)
            long r4 = r14.getItemId()
            java.lang.String r4 = o40.C61926c.m72691p(r4)
            r3.append(r4)
            r3.append(r15)
            r3.append(r0)
            r3.append(r11)
            r3.append(r12)
            java.lang.String r0 = r3.toString()
            r3 = r29
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r0)
            kf1.p2$d r0 = new kf1.p2$d
            r13 = r30
            r0.<init>(r1, r14, r13)
            r2.mo84323h(r0)
            r15 = 0
            goto L_0x0341
        L_0x0312:
            r2 = r8
            r3 = r13
            r13 = r15
            r17 = 1
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "startSwitchOutFromSquare no animation for feed:"
            r4.append(r5)
            long r5 = r14.getItemId()
            java.lang.String r5 = o40.C61926c.m72691p(r5)
            r4.append(r5)
            r4.append(r2)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r0)
            r0 = r14
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r0 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r0
            r15 = 0
            r1.mo10450b1(r0, r15, r13)
        L_0x0341:
            r13 = 1
            goto L_0x059a
        L_0x0344:
            r18 = r10
            r3 = r13
            r13 = r15
            r10 = 1
            r15 = 0
            android.content.Intent r8 = new android.content.Intent
            r8.<init>()
            rs1.s8$a r0 = rs1.C13442s8.f38060Q0
            com.tencent.mm.ui.MMActivity r4 = r1.f30214d
            r0.mo12871c(r4, r8)
            com.tencent.mm.ui.MMActivity r4 = r1.f30214d
            rs1.s8 r0 = r0.mo12873f(r4)
            if (r0 == 0) goto L_0x0365
            te3.hj1 r0 = r0.mo12861q3()
            java.lang.String r0 = r0.f134681r
            goto L_0x0367
        L_0x0365:
            r0 = r16
        L_0x0367:
            if (r0 == 0) goto L_0x039e
            int r4 = r0.length()
            if (r4 <= 0) goto L_0x0371
            r7 = 1
            goto L_0x0372
        L_0x0371:
            r7 = 0
        L_0x0372:
            if (r7 == 0) goto L_0x0375
            goto L_0x0377
        L_0x0375:
            r0 = r16
        L_0x0377:
            if (r0 == 0) goto L_0x039e
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ all -> 0x037f }
            r4.<init>(r0)     // Catch:{ all -> 0x037f }
            goto L_0x03a3
        L_0x037f:
            r0 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "item click, error e="
            r4.append(r5)
            java.lang.String r0 = r0.getMessage()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            goto L_0x03a3
        L_0x039e:
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
        L_0x03a3:
            long r5 = r14.getItemId()
            java.lang.String r0 = o40.C61926c.m72691p(r5)
            java.lang.String r3 = "first_feed_id"
            r4.put(r3, r0)
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "randomUUID().toString()"
            gy3.C87412m.m108593f(r0, r3)
            java.lang.String r3 = "-"
            java.lang.String r0 = z04.C112551y.m153814n(r0, r3, r2, r15)
            java.lang.String r2 = "first_traceid"
            r4.put(r2, r0)
            java.lang.String r0 = r4.toString()
            java.lang.String r2 = "key_extra_info"
            r8.putExtra(r2, r0)
            r7 = 2131302685(0x7f09191d, float:1.8223463E38)
            android.view.View r0 = r13.findViewById(r7)
            com.tencent.mm.plugin.finder.video.FinderVideoLayout r0 = (com.tencent.p014mm.plugin.finder.video.FinderVideoLayout) r0
            if (r0 == 0) goto L_0x03e6
            gr1.a2 r2 = new gr1.a2
            r2.<init>(r0)
            r0.mo79545I(r2)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x03e6:
            r4 = 0
            r0 = 2
            if (r9 == r0) goto L_0x03ed
            r6 = 1
            goto L_0x03ee
        L_0x03ed:
            r6 = 0
        L_0x03ee:
            r17 = 0
            de1.b r19 = de1.C7267b.f25328d
            androidx.recyclerview.widget.RecyclerView r20 = r28.getRecyclerView()
            r27 = r14
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r27 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r27
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r27.mo3513o()
            long r21 = r2.getId()
            kf1.g r2 = r28.mo10348I0()
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r2 = r2.f30175e
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r23 = r2.getDataListJustForAdapter()
            r24 = 0
            r25 = 8
            r26 = 0
            fy3.p r19 = de1.C7267b.Ax0(r19, r20, r21, r23, r24, r25, r26)
            r20 = 10
            r21 = 0
            r2 = r8
            r3 = r30
            r15 = 2131302685(0x7f09191d, float:1.8223463E38)
            r7 = r17
            r29 = r8
            r8 = r19
            r15 = r9
            r9 = r20
            r13 = 1
            r10 = r21
            de1.C7287o.m7447c(r2, r3, r4, r6, r7, r8, r9, r10)
            if (r15 != r13) goto L_0x0498
            up1.f r2 = up1.C37521f.f99374d
            r2.getClass()
            pe1.c<java.lang.Integer> r2 = up1.C37521f.f99315W0
            java.lang.Object r2 = r2.mo60266n()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            if (r2 == r0) goto L_0x0498
            kf1.g r0 = r28.mo10348I0()
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r4 = r0.f30175e
            r7 = 0
            r8 = 4
            r9 = 0
            r5 = r29
            r6 = r12
            com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader.saveCache$default(r4, r5, r6, r7, r8, r9)
            di3.d r0 = di3.C86312j.m106911c(r11)
            er1.b r0 = (er1.C58684b) r0
            com.tencent.mm.ui.MMActivity r2 = r1.f30214d
            r3 = 10001(0x2711, float:1.4014E-41)
            r0.getClass()
            java.lang.String r0 = "context"
            gy3.C87412m.m108594g(r2, r0)
            java.lang.Class<com.tencent.mm.plugin.finder.feed.ui.FinderFollowTimelineUI> r0 = com.tencent.p014mm.plugin.finder.feed.p052ui.FinderFollowTimelineUI.class
            r4 = r29
            r4.setClass(r2, r0)
            rs1.s8$a r0 = rs1.C13442s8.f38060Q0
            r0.mo12871c(r2, r4)
            k20.a r0 = new k20.a
            r0.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.mo10233c(r3)
            r0.mo10233c(r4)
            java.lang.Object[] r3 = r0.mo10232b()
            java.lang.String r4 = "com/tencent/mm/plugin/finder/utils/ActivityRouter"
            java.lang.String r5 = "enterFollowTimelineUI"
            java.lang.String r6 = "(Landroid/app/Activity;Landroid/content/Intent;I)V"
            java.lang.String r7 = "android/app/Activity"
            java.lang.String r8 = "startActivityForResult"
            java.lang.String r9 = "(Landroid/content/Intent;I)V"
            j20.C117292a.m165364j(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x059a
        L_0x0498:
            r4 = r29
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r27.mo3513o()
            boolean r2 = r2.isPostFinish()
            if (r2 != 0) goto L_0x04d1
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r27.mo3513o()
            long r2 = r2.getId()
            r5 = 0
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x04d1
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r27.mo3513o()
            long r2 = r2.getLocalId()
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x04d1
            java.lang.String r2 = "key_posting_scene"
            r4.putExtra(r2, r13)
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r27.mo3513o()
            long r2 = r2.getLocalId()
            java.lang.String r5 = "feed_local_id"
            r4.putExtra(r5, r2)
            goto L_0x04e7
        L_0x04d1:
            long r2 = r14.getItemId()
            java.lang.String r5 = "feed_object_id"
            r4.putExtra(r5, r2)
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r27.mo3513o()
            java.lang.String r2 = r2.getObjectNonceId()
            java.lang.String r3 = "feed_object_nonceId"
            r4.putExtra(r3, r2)
        L_0x04e7:
            r2 = 1001(0x3e9, float:1.403E-42)
            java.lang.String r3 = "tab_type"
            r4.putExtra(r3, r2)
            r2 = 3
            java.lang.String r3 = "key_reuqest_scene"
            r4.putExtra(r3, r2)
            up1.f r3 = up1.C37521f.f99374d
            r3.getClass()
            pe1.c<java.lang.Integer> r3 = up1.C37521f.f99315W0
            java.lang.Object r5 = r3.mo60266n()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r6 = 156(0x9c, float:2.19E-43)
            java.lang.String r7 = "key_comment_scene"
            if (r5 == r0) goto L_0x0529
            java.lang.Object r5 = r3.mo60266n()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            if (r5 != r13) goto L_0x0519
            goto L_0x0529
        L_0x0519:
            r4.putExtra(r7, r6)
            di3.d r0 = di3.C86312j.m106911c(r11)
            er1.b r0 = (er1.C58684b) r0
            com.tencent.mm.ui.MMActivity r2 = r1.f30214d
            r0.Zx0(r2, r4)
            goto L_0x059a
        L_0x0529:
            vp1.e r5 = vp1.C65834e.f189316a
            com.tencent.mm.plugin.finder.storage.FinderItem r8 = r27.mo3513o()
            vp1.e$b r9 = vp1.C65834e.C65836b.f189330j
            r5.mo89878l(r8, r9)
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r27.mo3513o()
            long r8 = r5.getExpectId()
            java.lang.String r5 = "intent_feed_id"
            r4.putExtra(r5, r8)
            java.lang.Object r5 = r3.mo60266n()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r8 = 4
            if (r5 != r0) goto L_0x055e
            if (r15 == r0) goto L_0x0552
            if (r15 != r8) goto L_0x055e
        L_0x0552:
            di3.d r0 = di3.C86312j.m106911c(r11)
            er1.b r0 = (er1.C58684b) r0
            com.tencent.mm.ui.MMActivity r2 = r1.f30214d
            r0.Lx0(r2, r4)
            goto L_0x059a
        L_0x055e:
            java.lang.Object r0 = r3.mo60266n()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 != r13) goto L_0x057a
            if (r15 == r2) goto L_0x056e
            if (r15 != r8) goto L_0x057a
        L_0x056e:
            di3.d r0 = di3.C86312j.m106911c(r11)
            er1.b r0 = (er1.C58684b) r0
            com.tencent.mm.ui.MMActivity r2 = r1.f30214d
            r0.Lx0(r2, r4)
            goto L_0x059a
        L_0x057a:
            java.lang.Object r0 = r3.mo60266n()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 != r13) goto L_0x058a
            r4.putExtra(r7, r6)
            goto L_0x058f
        L_0x058a:
            r0 = 171(0xab, float:2.4E-43)
            r4.putExtra(r7, r0)
        L_0x058f:
            di3.d r0 = di3.C86312j.m106911c(r11)
            er1.b r0 = (er1.C58684b) r0
            com.tencent.mm.ui.MMActivity r2 = r1.f30214d
            r0.Zx0(r2, r4)
        L_0x059a:
            bl3.r r0 = bl3.C39818r.f106831a
            com.tencent.mm.ui.MMActivity r2 = r1.f30214d
            bl3.r$a r0 = r0.mo62444c(r2)
            java.lang.Class<rs1.s8> r2 = rs1.C13442s8.class
            androidx.lifecycle.i0 r0 = r0.mo75002a(r2)
            rs1.s8 r0 = (rs1.C13442s8) r0
            te3.hj1 r0 = r0.mo12861q3()
            r2 = r30
            r3 = 2131302685(0x7f09191d, float:1.8223463E38)
            r4 = 1
            android.view.View r2 = r2.findViewById(r3)
            com.tencent.mm.plugin.finder.video.FinderVideoLayout r2 = (com.tencent.p014mm.plugin.finder.video.FinderVideoLayout) r2
            org.json.JSONObject r3 = r18.mo3471E()
            if (r2 == 0) goto L_0x05c8
            boolean r2 = r2.mo79599y()
            if (r2 != r4) goto L_0x05c8
            r7 = 1
            goto L_0x05c9
        L_0x05c8:
            r7 = 0
        L_0x05c9:
            java.lang.String r2 = "is_autoplay"
            r3.put(r2, r7)
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r18.mo3513o()
            java.util.LinkedList r2 = r2.getMediaList()
            java.lang.Object r2 = sx3.C110818d0.m150916N(r2)
            te3.rq2 r2 = (te3.C64689rq2) r2
            if (r2 == 0) goto L_0x05e2
            java.lang.String r2 = r2.f185283w
            r16 = r2
        L_0x05e2:
            if (r16 == 0) goto L_0x05ed
            int r2 = r16.length()
            if (r2 != 0) goto L_0x05eb
            goto L_0x05ed
        L_0x05eb:
            r7 = 0
            goto L_0x05ee
        L_0x05ed:
            r7 = 1
        L_0x05ee:
            r2 = r7 ^ 1
            java.lang.String r4 = "is_cover_url"
            r3.put(r4, r2)
            rx3.b0 r2 = rx3.C13598b0.f38549a
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "feed.udfKv.also {\n      …             }.toString()"
            gy3.C87412m.m108593f(r2, r3)
            java.lang.String r3 = ","
            java.lang.String r4 = ";"
            r5 = 0
            java.lang.String r8 = z04.C112551y.m153814n(r2, r3, r4, r5)
            java.lang.Class<dp1.y0> r2 = dp1.C58417y0.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            dp1.y0 r2 = (dp1.C58417y0) r2
            long r4 = r14.getItemId()
            com.tencent.mm.view.RefreshLoadMoreLayout r3 = r1.f30220j
            androidx.recyclerview.widget.RecyclerView r6 = r3.getRecyclerView()
            int r7 = r1.f30217g
            r3 = r0
            r2.Px0(r3, r4, r6, r7, r8)
            dp1.q r2 = dp1.C7450q.f25643a
            r3 = 18
            r2.mo8594b(r0, r14, r3)
        L_0x0628:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kf1.C9916p2.mo9294Q0(androidx.recyclerview.widget.RecyclerView$e, android.view.View, int):void");
    }

    /* renamed from: R0 */
    public void mo9295R0() {
    }

    /* renamed from: W0 */
    public boolean mo10353W0(C60905o oVar) {
        C87412m.m108594g(oVar, "holder");
        int i = oVar.f44859i;
        return i == -7 || i == -1;
    }

    /* renamed from: Z */
    public C14367u0 mo9296Z() {
        return this.f30546y;
    }

    /* renamed from: b */
    public View mo4181b() {
        return this.f30542u;
    }

    /* renamed from: b1 */
    public final void mo10450b1(BaseFinderFeed baseFinderFeed, boolean z, View view) {
        String nickName;
        BaseFinderFeed baseFinderFeed2 = baseFinderFeed;
        Class cls = C10649f.class;
        if (Util.isEqual(baseFinderFeed.mo3513o().getUserName(), C66785b.f191882e.mo90662O5())) {
            C7335d c = C86312j.m106911c(C58684b.class);
            C87412m.m108593f(c, "getService(ActivityRouter::class.java)");
            C13883o1 o1Var = (C13883o1) c;
            MMActivity mMActivity = this.f30214d;
            long id = baseFinderFeed.mo3513o().getId();
            String objectNonceId = baseFinderFeed.mo3513o().getObjectNonceId();
            C64273c21 liveInfo = baseFinderFeed.mo3513o().getLiveInfo();
            if (liveInfo == null) {
                liveInfo = new C64273c21();
            }
            C13883o1.C13884a.m13249a(o1Var, mMActivity, id, objectNonceId, liveInfo, (C0081n) null, (C49098d51) null, (String) null, (LinkedList) null, (C64848y91) null, (String) null, baseFinderFeed.mo3526z(), (LinkedList) null, (Intent) null, 7152, (Object) null);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(baseFinderFeed2);
        Intent intent = new Intent();
        intent.putExtra("CURRENT_FEED_ID", baseFinderFeed.mo3513o().getFeedObject().f164794id);
        intent.putExtra("LAUNCH_WITH_ANIM", z);
        C13604l<List<FinderObject>, Integer> sr = ((C10649f) C86312j.m106911c(cls)).mo10915sr(arrayList, baseFinderFeed2);
        List list = (List) sr.f38555d;
        int intValue = ((Number) sr.f38556e).intValue();
        C64279c90 c902 = new C64279c90();
        String str = "";
        c902.f182444d = str;
        c902.f182445e = str;
        c902.f182446f = false;
        c902.f182447g = -1;
        c902.f182448h = -1;
        c902.f182449i = 1;
        C64686ro2 ro22 = new C64686ro2();
        ro22.f185214e = this.f30216f;
        FinderItem o = baseFinderFeed.mo3513o();
        if (!(o == null || (nickName = o.getNickName()) == null)) {
            str = nickName;
        }
        ro22.f185215f = str;
        FinderItem o2 = baseFinderFeed.mo3513o();
        ro22.f185218i = o2 != null ? o2.getFeedObject() : null;
        c902.f182450j = ro22;
        C0576n4.f1379b.mo600c(intent);
        ((C10649f) C86312j.m106911c(cls)).mo10913cP(this.f30214d, intent, list, intValue, c902, (C10649f.C10650a) null);
    }

    /* renamed from: d */
    public void mo9297d(ArrayList<C0740i2> arrayList) {
        C87412m.m108594g(arrayList, "data");
        super.mo9297d(arrayList);
        RefreshLoadMoreLayout refreshLoadMoreLayout = this.f30220j;
        FrameLayout.LayoutParams layoutParams = null;
        View inflate = C85868k2.m106137b(this.f30214d).inflate(C0966R.C0971layout.c_l, (ViewGroup) null);
        C87412m.m108593f(inflate, "getInflater(context).inf…ine_refresh_header, null)");
        refreshLoadMoreLayout.setRefreshHeaderView(inflate);
        int dimension = (int) this.f30542u.getResources().getDimension(C0966R.dimen.a8a);
        int floatValue = (int) ((Number) ((C36570n) this.f30541B).getValue()).floatValue();
        this.f30220j.setLimitTopRequest(dimension - floatValue);
        this.f30220j.setRefreshTargetY(floatValue - dimension);
        this.f30220j.setDamping(1.6f);
        FinderVideoCore finderVideoCore = (FinderVideoCore) ((C36570n) this.f30545x).getValue();
        if (finderVideoCore != null) {
            finderVideoCore.mo79536E1(this.f30214d, new C9918b(this), true);
        }
        View y = mo10357y(C0966R.C0970id.ivd);
        ViewGroup.LayoutParams layoutParams2 = y != null ? y.getLayoutParams() : null;
        if (layoutParams2 instanceof FrameLayout.LayoutParams) {
            layoutParams = (FrameLayout.LayoutParams) layoutParams2;
        }
        if (layoutParams != null) {
            layoutParams.topMargin = ((Number) ((C36570n) this.f30547z).getValue()).intValue() + ((Number) ((C36570n) this.f30540A).getValue()).intValue();
        }
        if (!this.f30544w.f25674f) {
            int color = this.f30214d.getResources().getColor(C0966R.color.f2947a4);
            View y2 = mo10357y(C0966R.C0970id.kco);
            if (y2 != null) {
                y2.setBackgroundColor(color);
            }
            View y3 = mo10357y(C0966R.C0970id.eh6);
            if (y3 != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view = y3;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderFollowFeedUIContract$ViewCallback", "initView", "(Ljava/util/ArrayList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                y3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/FinderFollowFeedUIContract$ViewCallback", "initView", "(Ljava/util/ArrayList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            return;
        }
        int color2 = this.f30214d.getResources().getColor(C0966R.color.f3572y4);
        View y4 = mo10357y(C0966R.C0970id.eh6);
        if (y4 != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view2 = y4;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderFollowFeedUIContract$ViewCallback", "initView", "(Ljava/util/ArrayList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            y4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/FinderFollowFeedUIContract$ViewCallback", "initView", "(Ljava/util/ArrayList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View y5 = mo10357y(C0966R.C0970id.kco);
        if (y5 != null) {
            y5.setBackgroundColor(color2);
        }
    }

    public MMFragmentActivity getActivity() {
        return this.f30214d;
    }

    /* renamed from: k0 */
    public String mo9298k0(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        return null;
    }

    /* renamed from: m0 */
    public View mo9299m0() {
        return null;
    }

    /* renamed from: p */
    public boolean mo3718p(int i, int i2, int i3, boolean z, boolean z2) {
        return false;
    }

    /* renamed from: v */
    public boolean mo3719v(int i, int i2, int i3, boolean z, boolean z2) {
        return false;
    }

    /* renamed from: x */
    public void mo3720x(int i) {
        Log.m105924i("FinderFollowFeedUIContract.ViewCallback", "[onOverStop]");
    }
}
