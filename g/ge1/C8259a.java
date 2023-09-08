package ge1;

import ak1.C54067f0;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.finder.biz.FinderBizProfileLoader;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C7335d;
import di3.C86312j;
import dp1.C58417y0;
import dp1.C7450q;
import er1.C58684b;
import er1.C58739j4;
import er1.C58784w3;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8777j5;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import jq3.C60905o;
import jq3.C9500j;
import kf1.C9732g;
import kf1.C9753h;
import l31.C61212e;
import ls3.C10649f;
import o40.C61926c;
import org.json.JSONObject;
import p274xx.C15907f;
import q31.C118148a;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C110818d0;
import sx3.C90364q0;
import te3.C48924by0;
import te3.C49712hj1;
import te3.C52025xv;
import te3.C64273c21;
import te3.C64279c90;
import te3.C64347eq2;
import te3.C64686ro2;
import up1.C14367u0;
import zp3.C23555k;
import zp3.C23564m;

/* renamed from: ge1.a */
public final class C8259a {

    /* renamed from: a */
    public static final C8259a f27196a = new C8259a();

    /* renamed from: ge1.a$a */
    public static final class C8260a extends C9732g {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8260a(MMActivity mMActivity, int i, int i2, BaseFinderFeedLoader baseFinderFeedLoader) {
            super(mMActivity, i, i2, baseFinderFeedLoader);
            C87412m.m108594g(mMActivity, "context");
            C87412m.m108594g(baseFinderFeedLoader, "loader");
        }

        /* renamed from: N */
        public final boolean mo9288N(int i) {
            BaseFinderFeedLoader baseFinderFeedLoader = this.f30175e;
            if (!(baseFinderFeedLoader instanceof FinderBizProfileLoader)) {
                return true;
            }
            FinderBizProfileLoader finderBizProfileLoader = (FinderBizProfileLoader) baseFinderFeedLoader;
            C0740i2 i2Var = (C0740i2) C110818d0.m150917O(finderBizProfileLoader.getDataList(), i);
            if (i2Var != null && (i2Var instanceof BaseFinderFeed)) {
                BaseFinderFeed baseFinderFeed = (BaseFinderFeed) i2Var;
                if (baseFinderFeed.mo3513o().getId() == finderBizProfileLoader.f12535g) {
                    baseFinderFeed.mo3500g0(true);
                    finderBizProfileLoader.f12543r = true;
                    finderBizProfileLoader.f12539n = false;
                }
            }
            return finderBizProfileLoader.f12543r;
        }

        /* renamed from: U */
        public C9500j mo2516U() {
            C9753h hVar = this.f30176f;
            C14367u0 Z = hVar != null ? hVar.mo9296Z() : null;
            C87412m.m108591d(Z);
            return Z.mo3664a();
        }

        /* renamed from: n */
        public void mo2519n() {
            C9753h hVar = this.f30176f;
            if (hVar != null) {
                hVar.mo9297d(this.f30175e.getDataListJustForAdapter());
            }
        }

        /* renamed from: o */
        public void mo2521o() {
            BaseFeedLoader.requestLoadMore$default(this.f30175e, false, 1, (Object) null);
        }

        /* renamed from: q */
        public void mo2523q() {
            BaseFeedLoader.requestInit$default(this.f30175e, false, 1, (Object) null);
        }

        public void requestRefresh() {
            this.f30175e.requestRefresh();
        }
    }

    /* renamed from: ge1.a$b */
    public static class C8261b extends C9753h {

        /* renamed from: u */
        public final String f27197u;

        /* renamed from: v */
        public final int f27198v;

        /* renamed from: w */
        public final boolean f27199w;

        /* renamed from: x */
        public C14367u0 f27200x;

        /* renamed from: ge1.a$b$a */
        public static final class C8262a extends C23555k.C23562d {

            /* renamed from: a */
            public final /* synthetic */ C0740i2 f27201a;

            /* renamed from: b */
            public final /* synthetic */ C8261b f27202b;

            public C8262a(C0740i2 i2Var, C8261b bVar) {
                this.f27201a = i2Var;
                this.f27202b = bVar;
            }

            /* renamed from: b */
            public void mo53b(View view, long j, long j2, boolean z) {
                C87412m.m108594g(view, "view");
                if (z) {
                    ((C8777j5) C86312j.m106911c(C8777j5.class)).mo9598Cc((BaseFinderFeed) this.f27201a, C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD, "temp_5", C8259a.f27196a.mo9287b(this.f27202b));
                }
            }
        }

        /* renamed from: ge1.a$b$b */
        public static final class C8263b implements C118148a {

            /* renamed from: a */
            public final /* synthetic */ C8261b f27203a;

            /* renamed from: b */
            public final /* synthetic */ C0740i2 f27204b;

            public C8263b(C8261b bVar, C0740i2 i2Var) {
                this.f27203a = bVar;
                this.f27204b = i2Var;
            }

            /* renamed from: a */
            public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
                return false;
            }

            /* renamed from: b */
            public final Map<String, Object> mo37b(String str) {
                Class cls = C13442s8.class;
                C13604l[] lVarArr = new C13604l[5];
                C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f27203a.f30214d);
                Integer num = null;
                lVarArr[0] = new C13604l("behaviour_session_id", f != null ? f.f38099o : null);
                C39818r rVar = C39818r.f106831a;
                lVarArr[1] = new C13604l("finder_context_id", String.valueOf(((C13442s8) rVar.mo62444c(this.f27203a.f30214d).mo75002a(cls)).f38098n));
                lVarArr[2] = new C13604l("finder_tab_context_id", ((C13442s8) rVar.mo62444c(this.f27203a.f30214d).mo75002a(cls)).f38102q);
                C64273c21 liveInfo = ((BaseFinderFeed) this.f27204b).mo3513o().getLiveInfo();
                if (liveInfo != null) {
                    num = Integer.valueOf(liveInfo.f182394f);
                }
                lVarArr[3] = new C13604l("live_enter_status", num);
                lVarArr[4] = new C13604l("share_username", "");
                return C90364q0.m113147f(lVarArr);
            }
        }

        /* renamed from: ge1.a$b$c */
        public static final class C8264c extends C87413o implements C32226l<Intent, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C8261b f27205d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C8264c(C8261b bVar) {
                super(1);
                this.f27205d = bVar;
            }

            public Object invoke(Object obj) {
                RecyclerView recyclerView;
                Intent intent = (Intent) obj;
                C87412m.m108594g(intent, "data");
                C8260a aVar = (C8260a) this.f27205d.mo10348I0();
                C9753h hVar = aVar.f30176f;
                if (!(hVar == null || (recyclerView = hVar.getRecyclerView()) == null)) {
                    C58784w3.m68440p1(C58784w3.f168295a, intent, recyclerView, aVar.f30175e, false, (C32226l) null, 24, (Object) null);
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: ge1.a$b$d */
        public static final class C8265d implements C15907f.C15909b {

            /* renamed from: a */
            public final /* synthetic */ C8261b f27206a;

            /* renamed from: b */
            public final /* synthetic */ Intent f27207b;

            /* renamed from: c */
            public final /* synthetic */ C0740i2 f27208c;

            public C8265d(C8261b bVar, Intent intent, C0740i2 i2Var) {
                this.f27206a = bVar;
                this.f27207b = intent;
                this.f27208c = i2Var;
            }

            /* renamed from: a */
            public void mo6380a() {
            }

            public void onSuccess() {
                ((C58684b) C86312j.m106911c(C58684b.class)).yx0(this.f27206a.f30214d, this.f27207b, 10010);
                C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f27206a.f30214d);
                if (f != null) {
                    C49712hj1 q3 = f.mo12861q3();
                    C0740i2 i2Var = this.f27208c;
                    C8261b bVar = this.f27206a;
                    C7335d c = C86312j.m106911c(C58417y0.class);
                    C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
                    C58417y0.Qx0((C58417y0) c, q3, i2Var.getItemId(), bVar.f30220j.getRecyclerView(), 0, (String) null, 24, (Object) null);
                    C7450q.f25643a.mo8594b(q3, i2Var, 18);
                }
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C8261b(java.lang.String r9, com.tencent.p014mm.p136ui.MMActivity r10, int r11, int r12, boolean r13, int r14, gy3.C8480h r15) {
            /*
                r8 = this;
                r14 = r14 & 16
                r15 = 0
                if (r14 == 0) goto L_0x0007
                r4 = 0
                goto L_0x0008
            L_0x0007:
                r4 = r13
            L_0x0008:
                java.lang.String r13 = "bizName"
                gy3.C87412m.m108594g(r9, r13)
                java.lang.String r13 = "context"
                gy3.C87412m.m108594g(r10, r13)
                r5 = 0
                r6 = 16
                r7 = 0
                r0 = r8
                r1 = r10
                r2 = r11
                r3 = r12
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                r8.f27197u = r9
                r9 = 7
                r8.f27198v = r9
                boolean r9 = vn3.C111562e.m152091a(r10)
                r8.f27199w = r9
                com.tencent.mm.plugin.finder.profile.FinderProfileLayoutConfig r11 = new com.tencent.mm.plugin.finder.profile.FinderProfileLayoutConfig
                r11.<init>(r10, r15, r15, r9)
                r8.f27200x = r11
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ge1.C8259a.C8261b.<init>(java.lang.String, com.tencent.mm.ui.MMActivity, int, int, boolean, int, gy3.h):void");
        }

        /* renamed from: F0 */
        public View mo9289F0() {
            return null;
        }

        /* renamed from: G0 */
        public RecyclerView.C0129l mo9290G0() {
            return this.f27200x.mo3665c();
        }

        /* renamed from: H0 */
        public RecyclerView.LayoutManager mo9291H0(Context context) {
            C87412m.m108594g(context, "context");
            return this.f27200x.mo3666d(context);
        }

        /* renamed from: J0 */
        public CharSequence mo9292J0(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            return null;
        }

        /* renamed from: P0 */
        public void mo9293P0(C60905o oVar, int i) {
            Class cls = C61212e.class;
            C87412m.m108594g(oVar, "holder");
            try {
                int c6 = i - mo10346D().mo85796c6();
                if (c6 >= 0 && c6 < mo10348I0().f30175e.getSize()) {
                    C0740i2 i2Var = (C0740i2) mo10348I0().f30175e.getDataListJustForAdapter().get(c6);
                    if ((i2Var instanceof BaseFinderFeed) && C58739j4.f168176a.mo83686O((BaseFinderFeed) i2Var)) {
                        View view = oVar.f44854d;
                        C87412m.m108593f(view, "holder.itemView");
                        C23564m.m28138h(view, new C8262a(i2Var, this));
                        ((C61212e) C86312j.m106911c(cls)).o30(oVar.f44854d, "profile_live_room_card");
                        ((C61212e) C86312j.m106911c(cls)).mo86175pO(oVar.f44854d, 40, 26236);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        C64273c21 liveInfo = ((BaseFinderFeed) i2Var).mo3513o().getLiveInfo();
                        if (liveInfo != null) {
                            linkedHashMap.put("live_id", C61926c.m72691p(liveInfo.f182392d));
                        }
                        linkedHashMap.put("feed_id", C61926c.m72691p(((BaseFinderFeed) i2Var).mo3513o().getFeedObject().f164794id));
                        String str = ((BaseFinderFeed) i2Var).mo3513o().getFeedObject().username;
                        if (str == null) {
                            str = "";
                        }
                        linkedHashMap.put("finder_username", str);
                        linkedHashMap.put("comment_scene", "temp_5");
                        linkedHashMap.put("session_buffer", "");
                        ((C61212e) C86312j.m106911c(cls)).mo86149PM(oVar.f44854d, linkedHashMap);
                        ((C61212e) C86312j.m106911c(cls)).E60(oVar.f44854d, new C8263b(this, i2Var));
                    }
                }
            } catch (Exception unused) {
            }
        }

        /* JADX WARNING: type inference failed for: r8v9, types: [rx3.b0] */
        /* JADX WARNING: type inference failed for: r3v24, types: [androidx.fragment.app.DialogFragment] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x01cb  */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x01d2  */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: Q0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo9294Q0(androidx.recyclerview.widget.RecyclerView.C16613e<?> r32, android.view.View r33, int r34) {
            /*
                r31 = this;
                r6 = r31
                r0 = r32
                r4 = r33
                r3 = r34
                java.lang.Class<rs1.z0> r1 = rs1.C13559z0.class
                java.lang.Class<er1.b> r2 = er1.C58684b.class
                java.lang.String r5 = "adapter"
                gy3.C87412m.m108594g(r0, r5)
                java.lang.String r5 = "view"
                gy3.C87412m.m108594g(r4, r5)
                er1.j4 r5 = er1.C58739j4.f168176a
                boolean r7 = r5.mo83683L()
                if (r7 == 0) goto L_0x0020
                return
            L_0x0020:
                jq3.l r0 = (jq3.C60898l) r0
                int r0 = r0.mo85796c6()
                int r9 = r3 - r0
                if (r9 < 0) goto L_0x03ad
                kf1.g r0 = r31.mo10348I0()
                com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r0 = r0.f30175e
                int r0 = r0.getSize()
                if (r9 >= r0) goto L_0x03ad
                kf1.g r0 = r31.mo10348I0()
                com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r0 = r0.f30175e
                com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r0 = r0.getDataListJustForAdapter()
                java.lang.Object r0 = r0.get(r9)
                cm1.i2 r0 = (cm1.C0740i2) r0
                boolean r7 = r0 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
                if (r7 != 0) goto L_0x004b
                return
            L_0x004b:
                up1.f r7 = up1.C37521f.f99374d
                r7.getClass()
                pe1.c<java.lang.Integer> r7 = up1.C37521f.f99399f7
                java.lang.Object r7 = r7.mo60266n()
                java.lang.Number r7 = (java.lang.Number) r7
                int r7 = r7.intValue()
                r8 = 0
                r10 = 1
                if (r7 != r10) goto L_0x00b2
                com.tencent.mm.ui.MMActivity r7 = r6.f30214d
                boolean r11 = r7 instanceof com.tencent.p014mm.p136ui.vas.VASActivity
                if (r11 == 0) goto L_0x0069
                com.tencent.mm.ui.vas.VASActivity r7 = (com.tencent.p014mm.p136ui.vas.VASActivity) r7
                goto L_0x006a
            L_0x0069:
                r7 = r8
            L_0x006a:
                if (r7 == 0) goto L_0x00b2
                android.app.Activity r7 = r7.getParentActivity()
                if (r7 == 0) goto L_0x00b2
                boolean r11 = r6.f27199w
                if (r11 == 0) goto L_0x00b2
                boolean r11 = r7 instanceof com.tencent.p014mm.plugin.finder.feed.p052ui.BizProfileTimelineUI
                if (r11 == 0) goto L_0x00b2
                bl3.r r2 = bl3.C39818r.f106831a
                androidx.appcompat.app.AppCompatActivity r7 = (androidx.appcompat.app.AppCompatActivity) r7
                bl3.r$a r3 = r2.mo62444c(r7)
                bl3.t r3 = r3.mo62449e(r1)
                rs1.z0 r3 = (rs1.C13559z0) r3
                if (r3 == 0) goto L_0x00a2
                androidx.fragment.app.DialogFragment r3 = r3.f38464d
                boolean r4 = r3 instanceof nx0.C11304c
                if (r4 == 0) goto L_0x0093
                r8 = r3
                nx0.c r8 = (nx0.C11304c) r8
            L_0x0093:
                if (r8 == 0) goto L_0x00a2
                com.tencent.mm.ui.vas.VASCommonFragment r3 = r8.mo11344u()
                if (r3 == 0) goto L_0x00a2
                com.tencent.mm.ui.vas.VASActivity r3 = r3.f348642o
                if (r3 == 0) goto L_0x00a2
                r3.finish()
            L_0x00a2:
                bl3.r$a r2 = r2.mo62444c(r7)
                bl3.t r1 = r2.mo62449e(r1)
                rs1.z0 r1 = (rs1.C13559z0) r1
                if (r1 == 0) goto L_0x00b1
                r1.mo12958d3(r0)
            L_0x00b1:
                return
            L_0x00b2:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r7 = "onClick "
                r1.append(r7)
                r1.append(r9)
                java.lang.String r7 = " id:"
                r1.append(r7)
                r13 = r0
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r13 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r13
                com.tencent.mm.plugin.finder.storage.FinderItem r7 = r13.mo3513o()
                long r11 = r7.getId()
                r1.append(r11)
                java.lang.String r7 = ", pos:"
                r1.append(r7)
                r1.append(r9)
                java.lang.String r1 = r1.toString()
                java.lang.String r14 = "Finder.FinderBizProfileContract"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r1)
                boolean r1 = r5.mo83686O(r13)
                if (r1 == 0) goto L_0x0283
                java.lang.Class<ht1.p2> r0 = ht1.C60192p2.class
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r13.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
                java.lang.String r1 = r1.username
                zc1.b r5 = zc1.C66785b.f191882e
                java.lang.String r5 = r5.mo90662O5()
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r1, (java.lang.String) r5)
                java.lang.String r5 = ""
                if (r1 == 0) goto L_0x015e
                di3.d r0 = di3.C86312j.m106911c(r2)
                java.lang.String r1 = "getService(ActivityRouter::class.java)"
                gy3.C87412m.m108593f(r0, r1)
                r14 = r0
                tf0.o1 r14 = (tf0.C13883o1) r14
                com.tencent.mm.ui.MMActivity r15 = r6.f30214d
                com.tencent.mm.plugin.finder.storage.FinderItem r0 = r13.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
                long r0 = r0.f164794id
                com.tencent.mm.plugin.finder.storage.FinderItem r2 = r13.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r2 = r2.getFeedObject()
                java.lang.String r2 = r2.objectNonceId
                if (r2 != 0) goto L_0x012a
                r18 = r5
                goto L_0x012c
            L_0x012a:
                r18 = r2
            L_0x012c:
                com.tencent.mm.plugin.finder.storage.FinderItem r2 = r13.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r2 = r2.getFeedObject()
                te3.c21 r2 = r2.liveInfo
                if (r2 != 0) goto L_0x013d
                te3.c21 r2 = new te3.c21
                r2.<init>()
            L_0x013d:
                r19 = r2
                r20 = 0
                r21 = 0
                r22 = 0
                r23 = 0
                r24 = 0
                r25 = 0
                java.lang.String r26 = r13.mo3526z()
                r27 = 0
                r28 = 0
                r29 = 7152(0x1bf0, float:1.0022E-41)
                r30 = 0
                r16 = r0
                tf0.C13883o1.C13884a.m13249a(r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
                goto L_0x03ad
            L_0x015e:
                r1 = 2131304667(0x7f0920db, float:1.8227483E38)
                android.view.View r1 = r4.findViewById(r1)
                r20 = r1
                android.widget.ImageView r20 = (android.widget.ImageView) r20
                di3.d r1 = di3.C86312j.m106911c(r0)
                ht1.p2 r1 = (ht1.C60192p2) r1
                boolean r1 = r1.Xl0()
                com.tencent.mm.plugin.finder.storage.FinderItem r2 = r13.mo3513o()
                te3.c21 r2 = r2.getLiveInfo()
                r7 = 0
                if (r2 == 0) goto L_0x0184
                int r2 = r2.f182384X
                if (r2 != r10) goto L_0x0184
                r2 = 1
                goto L_0x0185
            L_0x0184:
                r2 = 0
            L_0x0185:
                if (r2 == 0) goto L_0x0188
                goto L_0x01ac
            L_0x0188:
                com.tencent.mm.plugin.finder.storage.FinderItem r2 = r13.mo3513o()
                te3.c21 r2 = r2.getLiveInfo()
                if (r2 == 0) goto L_0x0198
                int r2 = r2.f182394f
                if (r2 != r10) goto L_0x0198
                r2 = 1
                goto L_0x0199
            L_0x0198:
                r2 = 0
            L_0x0199:
                if (r2 == 0) goto L_0x01ac
                if (r1 == 0) goto L_0x01ac
                com.tencent.mm.plugin.finder.storage.FinderItem r2 = r13.mo3513o()
                te3.c21 r2 = r2.getLiveInfo()
                if (r2 == 0) goto L_0x01aa
                java.lang.String r2 = r2.f182395g
                goto L_0x01ad
            L_0x01aa:
                r2 = r8
                goto L_0x01ad
            L_0x01ac:
                r2 = r5
            L_0x01ad:
                com.tencent.mm.plugin.finder.storage.FinderItem r9 = r13.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r9 = r9.getFeedObject()
                long r11 = r9.f164794id
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r15 = "jumpToLive fluentSwitch： ￥fluentSwitch livestate: "
                r9.append(r15)
                com.tencent.mm.plugin.finder.storage.FinderItem r15 = r13.mo3513o()
                te3.c21 r15 = r15.getLiveInfo()
                if (r15 == 0) goto L_0x01d2
                int r15 = r15.f182394f
                java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
                goto L_0x01d3
            L_0x01d2:
                r15 = r8
            L_0x01d3:
                r9.append(r15)
                java.lang.String r15 = " streamUrl: "
                r9.append(r15)
                r9.append(r2)
                java.lang.String r15 = " feedId: "
                r9.append(r15)
                r9.append(r11)
                java.lang.String r9 = r9.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r9)
                com.tencent.mm.plugin.finder.storage.FinderItem r9 = r13.mo3513o()
                te3.c21 r9 = r9.getLiveInfo()
                if (r9 == 0) goto L_0x01fc
                int r9 = r9.f182394f
                if (r9 != r10) goto L_0x01fc
                r7 = 1
            L_0x01fc:
                if (r7 == 0) goto L_0x0274
                if (r20 == 0) goto L_0x0274
                if (r1 == 0) goto L_0x0274
                di3.d r1 = di3.C86312j.m106911c(r0)
                r15 = r1
                ht1.p2 r15 = (ht1.C60192p2) r15
                lt1.a r16 = lt1.C61401a.FINDER_PROFILE
                android.view.ViewParent r1 = r20.getParent()
                java.lang.String r7 = "null cannot be cast to non-null type android.view.ViewGroup"
                gy3.C87412m.m108592e(r1, r7)
                r19 = r1
                android.view.ViewGroup r19 = (android.view.ViewGroup) r19
                if (r2 != 0) goto L_0x021d
                r21 = r5
                goto L_0x021f
            L_0x021d:
                r21 = r2
            L_0x021f:
                java.lang.Class<ir.n> r1 = p565ir.C60606n.class
                di3.d r1 = di3.C86312j.m106911c(r1)
                ir.n r1 = (p565ir.C60606n) r1
                com.tencent.mm.plugin.finder.storage.FinderItem r2 = r13.mo3513o()
                te3.c21 r2 = r2.getLiveInfo()
                boolean r1 = r1.mo85008I1(r2)
                r22 = r1 ^ 1
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r13.mo3513o()
                te3.c21 r23 = r1.getLiveInfo()
                r17 = r11
                lt1.c r1 = r15.mo85193Pz(r16, r17, r19, r20, r21, r22, r23)
                di3.d r0 = di3.C86312j.m106911c(r0)
                ht1.p2 r0 = (ht1.C60192p2) r0
                android.content.Context r2 = r33.getContext()
                java.lang.String r5 = "view.context"
                gy3.C87412m.m108593f(r2, r5)
                lt1.b r0 = r0.mo85194Ui(r2, r1)
                if (r0 == 0) goto L_0x0263
                ge1.b r1 = new ge1.b
                r1.<init>(r6, r13, r3, r4)
                r0.mo84323h(r1)
                rx3.b0 r8 = rx3.C13598b0.f38549a
            L_0x0263:
                if (r8 != 0) goto L_0x03ad
                ge1.a r0 = ge1.C8259a.f27196a
                r5 = 0
                r1 = r31
                r2 = r13
                r3 = r34
                r4 = r33
                ge1.C8259a.m8325a(r0, r1, r2, r3, r4, r5)
                goto L_0x03ad
            L_0x0274:
                ge1.a r0 = ge1.C8259a.f27196a
                r5 = 0
                r1 = r31
                r2 = r13
                r3 = r34
                r4 = r33
                ge1.C8259a.m8325a(r0, r1, r2, r3, r4, r5)
                goto L_0x03ad
            L_0x0283:
                android.content.Intent r1 = new android.content.Intent
                r1.<init>()
                java.lang.String r3 = r6.f27197u
                java.lang.String r5 = "KEY_BIZ_USERNAME"
                r1.putExtra(r5, r3)
                kf1.g r3 = r31.mo10348I0()
                com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r7 = r3.f30175e
                r10 = 0
                r11 = 4
                r12 = 0
                r8 = r1
                com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader.saveCache$default(r7, r8, r9, r10, r11, r12)
                java.lang.String r3 = "onGridItemClick"
                int r5 = r6.f30216f
                com.tencent.mm.plugin.finder.storage.FinderItem r7 = r13.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r7 = r7.getFeedObject()
                co1.b r8 = co1.C0898b.f2115a
                co1.b$a r9 = r8.mo785a()
                boolean r9 = r9.mo786a()
                java.lang.String r10 = " feedId:"
                java.lang.String r11 = "startPreloadVideo "
                if (r9 != 0) goto L_0x02dd
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r11)
                r5.append(r3)
                r5.append(r10)
                long r7 = r7.f164794id
                java.lang.String r3 = o40.C61926c.m72691p(r7)
                r5.append(r3)
                java.lang.String r3 = " return for disable"
                r5.append(r3)
                java.lang.String r3 = r5.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r3)
                goto L_0x0318
            L_0x02dd:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                r9.append(r11)
                r9.append(r3)
                r9.append(r10)
                long r10 = r7.f164794id
                java.lang.String r3 = o40.C61926c.m72691p(r10)
                r9.append(r3)
                java.lang.String r3 = r9.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r3)
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                r3.add(r7)
                java.lang.Class<ht1.h2> r7 = ht1.C8770h2.class
                di3.d r7 = di3.C86312j.m106911c(r7)
                ht1.h2 r7 = (ht1.C8770h2) r7
                ht1.y3 r7 = r7.mo9592Gq()
                co1.b$a r8 = r8.mo785a()
                int r8 = r8.f2118c
                r7.mo78736c(r5, r3, r8)
            L_0x0318:
                r9 = 0
                r11 = 0
                r12 = 1
                de1.b r14 = de1.C7267b.f25328d
                androidx.recyclerview.widget.RecyclerView r15 = r31.getRecyclerView()
                com.tencent.mm.plugin.finder.storage.FinderItem r3 = r13.mo3513o()
                long r16 = r3.getId()
                kf1.g r3 = r31.mo10348I0()
                com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r3 = r3.f30175e
                com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r18 = r3.getDataListJustForAdapter()
                ge1.a$b$c r3 = new ge1.a$b$c
                r3.<init>(r6)
                r19 = r3
                fy3.p r13 = r14.zx0(r15, r16, r18, r19)
                r14 = 6
                r15 = 0
                r7 = r1
                r8 = r33
                de1.C7287o.m7447c(r7, r8, r9, r11, r12, r13, r14, r15)
                er1.w3 r3 = er1.C58784w3.f168295a
                boolean r3 = r3.mo83915a1()
                if (r3 == 0) goto L_0x036a
                java.lang.Class<xx.f> r2 = p274xx.C15907f.class
                di3.d r2 = di3.C86312j.m106911c(r2)
                r7 = r2
                xx.f r7 = (p274xx.C15907f) r7
                com.tencent.mm.ui.MMActivity r8 = r6.f30214d
                r9 = 34359738368(0x800000000, double:1.69759663277E-313)
                r11 = 0
                ge1.a$b$d r12 = new ge1.a$b$d
                r12.<init>(r6, r1, r0)
                r13 = 3
                r7.K00(r8, r9, r11, r12, r13)
                goto L_0x03ad
            L_0x036a:
                di3.d r2 = di3.C86312j.m106911c(r2)
                er1.b r2 = (er1.C58684b) r2
                com.tencent.mm.ui.MMActivity r3 = r6.f30214d
                r4 = 10010(0x271a, float:1.4027E-41)
                r2.yx0(r3, r1, r4)
                rs1.s8$a r1 = rs1.C13442s8.f38060Q0
                com.tencent.mm.ui.MMActivity r2 = r6.f30214d
                rs1.s8 r1 = r1.mo12873f(r2)
                if (r1 == 0) goto L_0x03ad
                te3.hj1 r1 = r1.mo12861q3()
                java.lang.Class<dp1.y0> r2 = dp1.C58417y0.class
                di3.d r2 = di3.C86312j.m106911c(r2)
                java.lang.String r3 = "getService(FinderReportLogic::class.java)"
                gy3.C87412m.m108593f(r2, r3)
                r7 = r2
                dp1.y0 r7 = (dp1.C58417y0) r7
                long r9 = r0.getItemId()
                com.tencent.mm.view.RefreshLoadMoreLayout r2 = r6.f30220j
                androidx.recyclerview.widget.RecyclerView r11 = r2.getRecyclerView()
                r12 = 0
                r13 = 0
                r14 = 24
                r15 = 0
                r8 = r1
                dp1.C58417y0.Qx0(r7, r8, r9, r11, r12, r13, r14, r15)
                dp1.q r2 = dp1.C7450q.f25643a
                r3 = 18
                r2.mo8594b(r1, r0, r3)
            L_0x03ad:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ge1.C8259a.C8261b.mo9294Q0(androidx.recyclerview.widget.RecyclerView$e, android.view.View, int):void");
        }

        /* renamed from: R0 */
        public void mo9295R0() {
        }

        /* renamed from: Z */
        public C14367u0 mo9296Z() {
            return this.f27200x;
        }

        /* renamed from: d */
        public void mo9297d(ArrayList<C0740i2> arrayList) {
            C87412m.m108594g(arrayList, "data");
            super.mo9297d(arrayList);
            this.f30220j.setEnableRefresh(false);
            this.f30220j.setSuperNestedScroll(true);
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
            View y = mo10357y(C0966R.C0970id.cjg);
            if (y instanceof View) {
                return y;
            }
            return null;
        }
    }

    /* renamed from: a */
    public static final void m8325a(C8259a aVar, C8261b bVar, BaseFinderFeed baseFinderFeed, int i, View view, boolean z) {
        C48924by0 by02;
        C8261b bVar2 = bVar;
        aVar.getClass();
        ((C8777j5) C86312j.m106911c(C8777j5.class)).mo9603Kf(baseFinderFeed, (long) i, C54067f0.C54078q.LIVE_AUDIENCE_ENTER_LIVE_ROOM, "temp_5", aVar.mo9287b(bVar));
        Intent intent = new Intent();
        long longExtra = bVar2.f30214d.getIntent().getLongExtra("finder_from_feed_id", 0);
        int i2 = (longExtra > 0 ? 1 : (longExtra == 0 ? 0 : -1));
        if (i2 != 0) {
            intent.putExtra("KEY_ENTER_LIVE_PARAM_FROM_OBJECT_ID", longExtra);
            Log.m105924i("Finder.ProfileFeedUIC", "jumpToLive refObjectId/fromObjectId:" + C61926c.m72691p(longExtra));
        }
        int intExtra = bVar2.f30214d.getIntent().getIntExtra("finder_from_feed_type", 0);
        if (intExtra != 0) {
            intent.putExtra("KEY_FINDER_FROM_FEED_TYPE", intExtra);
        }
        intent.putExtra("CURRENT_FEED_ID", baseFinderFeed.mo3513o().getFeedObject().f164794id);
        intent.putExtra("LAUNCH_WITH_ANIM", z);
        C64273c21 c212 = baseFinderFeed.mo3513o().getFeedObject().liveInfo;
        intent.putExtra("KEY_ENTER_LIVE_PARAM_VR_LIVE_TYPE", c212 != null ? c212.f182384X : 0);
        C64273c21 c213 = baseFinderFeed.mo3513o().getFeedObject().liveInfo;
        if (!(c213 == null || (by02 = c213.f182402p0) == null)) {
            intent.putExtra("KEY_ENTER_LIVE_PARAM_LIVE_EVENT_INFO", by02.toByteArray());
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(baseFinderFeed.mo3513o().getFeedObject());
        C64279c90 c902 = new C64279c90();
        c902.f182444d = "";
        c902.f182445e = "";
        c902.f182446f = false;
        c902.f182447g = -1;
        c902.f182448h = -1;
        int i3 = 1;
        c902.f182449i = 1;
        C64686ro2 ro22 = new C64686ro2();
        ro22.f185214e = ((C13442s8) C39818r.f106831a.mo62444c(bVar2.f30214d).mo75002a(C13442s8.class)).f38096i;
        ro22.f185218i = baseFinderFeed.mo3513o().getFeedObject();
        c902.f182450j = ro22;
        if (i2 != 0) {
            C64347eq2 eq22 = new C64347eq2();
            C52025xv xvVar = new C52025xv();
            eq22.f183029t = xvVar;
            xvVar.f144988d = longExtra;
            if (intExtra != 1) {
                i3 = 2;
            }
            xvVar.f144989e = i3;
            c902.f182451n = eq22;
        }
        ((C10649f) C86312j.m106911c(C10649f.class)).mo10913cP(bVar2.f30214d, intent, arrayList, 0, c902, (C10649f.C10650a) null);
    }

    /* renamed from: b */
    public final String mo9287b(C8261b bVar) {
        Long valueOf = Long.valueOf(bVar.f30214d.getIntent().getLongExtra("finder_from_feed_id", 0));
        boolean z = true;
        String str = null;
        if (!(valueOf.longValue() != 0)) {
            valueOf = null;
        }
        String str2 = "";
        if (valueOf != null) {
            long longValue = valueOf.longValue();
            if (!(str2.length() > 0)) {
                str2 = null;
            }
            JSONObject jSONObject = str2 != null ? new JSONObject(str2) : new JSONObject("{}");
            jSONObject.put("from_feed_id", C61926c.m72691p(longValue));
            str2 = jSONObject.toString();
            C87412m.m108593f(str2, "json.toString()");
        }
        Integer valueOf2 = Integer.valueOf(bVar.f30214d.getIntent().getIntExtra("finder_from_feed_type", 0));
        if (!(valueOf2.intValue() != 0)) {
            valueOf2 = null;
        }
        if (valueOf2 != null) {
            int intValue = valueOf2.intValue();
            if (!(str2.length() > 0)) {
                str2 = null;
            }
            JSONObject jSONObject2 = str2 != null ? new JSONObject(str2) : new JSONObject("{}");
            jSONObject2.put("head_enter_type", String.valueOf(intValue));
            str2 = jSONObject2.toString();
            C87412m.m108593f(str2, "json.toString()");
        }
        Integer valueOf3 = Integer.valueOf(bVar.f30214d.getIntent().getIntExtra("key_from_comment_scene", 0));
        if (!(valueOf3.intValue() != 0)) {
            valueOf3 = null;
        }
        if (valueOf3 == null) {
            return str2;
        }
        int intValue2 = valueOf3.intValue();
        if (str2.length() <= 0) {
            z = false;
        }
        if (z) {
            str = str2;
        }
        JSONObject jSONObject3 = str != null ? new JSONObject(str) : new JSONObject("{}");
        jSONObject3.put("from_comment_scene", String.valueOf(intValue2));
        String jSONObject4 = jSONObject3.toString();
        C87412m.m108593f(jSONObject4, "json.toString()");
        return jSONObject4;
    }
}
