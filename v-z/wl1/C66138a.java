package wl1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.floatball.BaseFinderMiniViewHelper;
import di3.C86312j;
import dp1.C58417y0;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;

/* renamed from: wl1.a */
public final class C66138a extends BaseFinderMiniViewHelper {

    /* renamed from: v */
    public static final C13601g<C66138a> f190116v = C36568h.m40986b(C13602i.SYNCHRONIZED, C66139a.f190117d);

    /* renamed from: wl1.a$a */
    public static final class C66139a extends C87413o implements C32224a<C66138a> {

        /* renamed from: d */
        public static final C66139a f190117d = new C66139a();

        public C66139a() {
            super(0);
        }

        public Object invoke() {
            return new C66138a();
        }
    }

    /* renamed from: wl1.a$b */
    public static final class C66140b {
        public C66140b(C8480h hVar) {
        }
    }

    /* renamed from: wl1.a$c */
    public static final class C66141c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C66138a f190118d;

        public C66141c(C66138a aVar) {
            this.f190118d = aVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0035, code lost:
            r2 = r0.mo77450A0().getVideoView();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r21) {
            /*
                r20 = this;
                r7 = r20
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1 = r21
                r0.add(r1)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/plugin/finder/megavideo/floatball/FinderMegaVideoMiniViewHelper$generateWindowClickListener$1"
                java.lang.String r2 = "android/view/View$OnClickListener"
                java.lang.String r3 = "onClick"
                java.lang.String r4 = "(Landroid/view/View;)V"
                r5 = r20
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                android.content.Intent r1 = new android.content.Intent
                r1.<init>()
                wl1.a r0 = r7.f190118d
                java.lang.String r2 = "KEY_OPEN_FROM_VIDEO_FLOAT_BALL"
                r3 = 1
                r1.putExtra(r2, r3)
                com.tencent.mm.plugin.finder.megavideo.ui.FinderMegaVideoMiniView r2 = r0.mo77450A0()
                boolean r2 = r2.f160142f
                if (r2 != 0) goto L_0x0044
                com.tencent.mm.plugin.finder.megavideo.ui.FinderMegaVideoMiniView r2 = r0.mo77450A0()
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r2 = r2.getVideoView()
                if (r2 == 0) goto L_0x0044
                long r8 = r2.getCurrentPlayMs()
                goto L_0x0046
            L_0x0044:
                r8 = 0
            L_0x0046:
                java.lang.String r2 = "KEY_VIDEO_START_PLAY_TIME_MS"
                r1.putExtra(r2, r8)
                com.tencent.mm.plugin.finder.megavideo.ui.FinderMegaVideoMiniView r0 = r0.mo77450A0()
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r0 = r0.getVideoView()
                if (r0 == 0) goto L_0x005a
                float r0 = r0.getPlaySpeedRatio()
                goto L_0x005c
            L_0x005a:
                r0 = 1065353216(0x3f800000, float:1.0)
            L_0x005c:
                java.lang.String r2 = "KEY_VIDEO_PLAY_SPEED_RATIO"
                r1.putExtra(r2, r0)
                wl1.a r0 = r7.f190118d
                com.tencent.mm.plugin.ball.model.BallInfo r0 = r0.f311726d
                java.lang.String r2 = "KEY_VIDEO_FLOAT_BALL_INFO"
                byte[] r0 = r0.mo149043f(r2)
                te3.zv2 r6 = new te3.zv2
                r6.<init>()
                r15 = 0
                r6.parseFrom(r0)     // Catch:{ all -> 0x0075 }
                goto L_0x0082
            L_0x0075:
                r0 = move-exception
                r8 = r0
                java.lang.Object[] r0 = new java.lang.Object[r3]
                r0[r15] = r8
                java.lang.String r8 = "FinderMegaVideoMiniViewHelper"
                java.lang.String r9 = "handleBallInfoClicked"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r8, r9, r0)
            L_0x0082:
                java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r0 = r6.f186888j
                java.lang.String r8 = "floatBallInfo.cacheNewVideoList"
                gy3.C87412m.m108593f(r0, r8)
                java.util.ArrayList r14 = new java.util.ArrayList
                r8 = 10
                int r8 = sx3.C36907w.m41090l(r0, r8)
                r14.<init>(r8)
                java.util.Iterator r0 = r0.iterator()
            L_0x0098:
                boolean r8 = r0.hasNext()
                if (r8 == 0) goto L_0x00bc
                java.lang.Object r8 = r0.next()
                com.tencent.mm.protocal.protobuf.FinderObject r8 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r8
                com.tencent.mm.plugin.finder.storage.FinderItem$a r9 = com.tencent.p014mm.plugin.finder.storage.FinderItem.Companion
                java.lang.String r10 = "it"
                gy3.C87412m.m108593f(r8, r10)
                com.tencent.mm.plugin.finder.storage.FinderItem r8 = r9.mo79056a(r8, r3)
                wp1.f$a r9 = wp1.C15585f.f42211a
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r8 = r9.mo14348k(r8)
                r8.mo3499f0(r3)
                r14.add(r8)
                goto L_0x0098
            L_0x00bc:
                er1.w3 r8 = er1.C58784w3.f168295a
                int r9 = r6.f186884f
                pe3.b r11 = r6.f186886h
                r13 = 0
                r0 = 16
                r16 = 0
                r10 = r14
                r12 = r1
                r17 = r14
                r14 = r0
                r4 = 0
                r15 = r16
                er1.C58784w3.m68427B1(r8, r9, r10, r11, r12, r13, r14, r15)
                int r0 = r6.f186887i
                java.lang.String r5 = "KEY_ROUTER_UI"
                r1.putExtra(r5, r0)
                byte[] r0 = r6.toByteArray()
                r1.putExtra(r2, r0)
                wl1.a r0 = r7.f190118d
                com.tencent.mm.plugin.ball.model.BallInfo r0 = r0.f311726d
                java.lang.String r2 = "KEY_FLOAT_BALL_TASK_ORDER"
                int r0 = r0.mo149044g(r2, r4)
                r1.putExtra(r2, r0)
                wl1.a r0 = r7.f190118d
                com.tencent.mm.plugin.ball.model.BallInfo r0 = r0.f311726d
                java.lang.String r2 = "KEY_FLOAT_BALL_MINI_SESSION_ID"
                java.lang.String r5 = ""
                java.lang.String r0 = r0.mo149045h(r2, r5)
                r1.putExtra(r2, r0)
                r0 = 536870912(0x20000000, float:1.0842022E-19)
                r1.addFlags(r0)
                r0 = 45
                java.lang.Class<ht1.t1> r6 = ht1.C60200t1.class
                di3.d r6 = di3.C86312j.m106911c(r6)
                ht1.t1 r6 = (ht1.C60200t1) r6
                r8 = 8
                r9 = 6
                java.lang.String r0 = r6.mo76842e7(r8, r9, r0, r1)
                java.lang.Class<er1.b> r6 = er1.C58684b.class
                di3.d r6 = di3.C86312j.m106911c(r6)
                er1.b r6 = (er1.C58684b) r6
                android.content.Context r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                java.lang.String r9 = "getContext()"
                gy3.C87412m.m108593f(r8, r9)
                r6.ey0(r8, r1, r3)
                wl1.a r1 = r7.f190118d
                com.tencent.mm.plugin.ball.model.BallInfo r1 = r1.f311726d
                java.lang.String r1 = r1.mo149045h(r2, r5)
                dp1.a2 r2 = dp1.C58354a2.f167095a
                java.lang.String r2 = "miniSessionId"
                gy3.C87412m.m108593f(r1, r2)
                java.lang.Object r2 = sx3.C110818d0.m150916N(r17)
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r2
                if (r2 == 0) goto L_0x0144
                long r8 = r2.getItemId()
                r18 = r8
                goto L_0x0146
            L_0x0144:
                r18 = 0
            L_0x0146:
                java.lang.String r2 = o40.C61926c.m72691p(r18)
                java.lang.String r6 = "contextId"
                gy3.C87412m.m108594g(r0, r6)
                com.tencent.mm.autogen.mmdata.rpt.MegaVideoPopupActionStruct r6 = new com.tencent.mm.autogen.mmdata.rpt.MegaVideoPopupActionStruct
                r6.<init>()
                long r8 = (long) r3
                r6.f156492d = r8
                r8 = 1
                r6.f156493e = r8
                java.lang.String r10 = "MiniSessionId"
                java.lang.String r1 = r6.mo86045b(r10, r1, r3)
                r6.f156494f = r1
                long r10 = (long) r4
                r6.f156495g = r10
                java.lang.String r1 = "LongVideoId"
                java.lang.String r1 = r6.mo86045b(r1, r2, r3)
                r6.f156496h = r1
                java.lang.String r1 = "sessionid"
                java.lang.String r1 = r6.mo86045b(r1, r5, r3)
                r6.f156497i = r1
                java.lang.String r1 = "contextid"
                java.lang.String r0 = r6.mo86045b(r1, r0, r3)
                r6.f156498j = r0
                java.lang.String r0 = "ClickTabContextId"
                java.lang.String r0 = r6.mo86045b(r0, r5, r3)
                r6.f156499k = r0
                r6.f156500l = r8
                r6.mo86054n()
                java.lang.Class<dp1.y0> r0 = dp1.C58417y0.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                dp1.y0 r0 = (dp1.C58417y0) r0
                r0.Ec0(r6)
                java.lang.String r0 = "com/tencent/mm/plugin/finder/megavideo/floatball/FinderMegaVideoMiniViewHelper$generateWindowClickListener$1"
                java.lang.String r1 = "android/view/View$OnClickListener"
                java.lang.String r2 = "onClick"
                java.lang.String r3 = "(Landroid/view/View;)V"
                j20.C117292a.m165361g(r7, r0, r1, r2, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wl1.C66138a.C66141c.onClick(android.view.View):void");
        }
    }

    static {
        new C66140b((C8480h) null);
    }

    public C66138a() {
        mo35648A(22, ((C58417y0) C86312j.m106911c(C58417y0.class)).mo83357yP());
        getReportInfo().f311717f = 17;
    }

    /* renamed from: E0 */
    public boolean mo77454E0() {
        return super.mo77454E0();
    }

    /* renamed from: z0 */
    public View.OnClickListener mo77461z0() {
        return new C66141c(this);
    }
}
