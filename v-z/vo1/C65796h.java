package vo1;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import bp1.C54519d;
import cl1.C54963d0;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.plugin.finder.replay.FinderLiveThumbPlayerProxy;
import com.tencent.p014mm.plugin.finder.storage.FeedData;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.Log;
import cp1.C57952m;
import d60.C58124b;
import fj1.C45795b;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import ii1.C60291e;
import ok1.C62042e;
import org.json.JSONObject;
import pg1.C62283d;
import pl1.C62367r0;
import qj1.C63081w3;
import rx3.C13598b0;
import rx3.C13604l;
import te3.C64338e71;
import zo1.C66925j0;
import zo1.C66939o0;

/* renamed from: vo1.h */
public final class C65796h extends C65795g0 {

    /* renamed from: g */
    public final C32227p<Long, C57952m, C13604l<C57952m, Boolean>> f189239g;

    /* renamed from: h */
    public C66925j0 f189240h;

    /* renamed from: i */
    public C60291e f189241i;

    /* renamed from: j */
    public C66939o0 f189242j;

    /* renamed from: vo1.h$a */
    public static final class C65797a extends C87413o implements C32227p<Long, C57952m, C13604l<? extends C57952m, ? extends Boolean>> {

        /* renamed from: d */
        public final /* synthetic */ C65796h f189243d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65797a(C65796h hVar) {
            super(2);
            this.f189243d = hVar;
        }

        public Object invoke(Object obj, Object obj2) {
            long longValue = ((Number) obj).longValue();
            return this.f189243d.f189239g.invoke(Long.valueOf(longValue), (C57952m) obj2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65796h(AppCompatActivity appCompatActivity, C32227p<? super Long, ? super C57952m, C13604l<C57952m, Boolean>> pVar) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, "context");
        C87412m.m108594g(pVar, "playerGenerator");
        this.f189239g = pVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0127 A[Catch:{ Exception -> 0x0191 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0130 A[Catch:{ Exception -> 0x0191 }] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo89841i(boolean r18, boolean r19) {
        /*
            r17 = this;
            r7 = r17
            up1.y r10 = up1.C27696y.V0_VIDEO
            java.lang.Class<bp1.d> r1 = bp1.C54519d.class
            com.tencent.mm.plugin.finder.live.view.b r0 = r7.f189238f
            if (r0 == 0) goto L_0x00cf
            java.lang.Class<zo1.j0> r2 = zo1.C66925j0.class
            qj1.c r2 = r0.getPlugin(r2)
            zo1.j0 r2 = (zo1.C66925j0) r2
            r3 = 2131303138(0x7f091ae2, float:1.8224382E38)
            if (r2 != 0) goto L_0x0039
            r2 = 2131304143(0x7f091ecf, float:1.822642E38)
            android.view.View r2 = r0.findViewById(r2)
            java.lang.String r4 = "it.findViewById(R.id.finder_live_preview_root)"
            gy3.C87412m.m108593f(r2, r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r4.add(r5)
            rx3.b0 r5 = rx3.C13598b0.f38549a
            zo1.j0 r5 = new zo1.j0
            r5.<init>(r2, r4, r0)
            r2 = r5
        L_0x0039:
            r7.f189240h = r2
            java.lang.Class<qj1.w3> r2 = qj1.C63081w3.class
            qj1.c r2 = r0.getPlugin(r2)
            qj1.w3 r2 = (qj1.C63081w3) r2
            if (r2 != 0) goto L_0x0055
            qj1.w3 r2 = new qj1.w3
            android.view.View r3 = r0.findViewById(r3)
            java.lang.String r4 = "it.findViewById(R.id.fin…dio_mode_preview_ui_root)"
            gy3.C87412m.m108593f(r3, r4)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r2.<init>(r3, r0)
        L_0x0055:
            java.lang.Class<ii1.e> r2 = ii1.C60291e.class
            qj1.c r2 = r0.getPlugin(r2)
            ii1.e r2 = (ii1.C60291e) r2
            if (r2 != 0) goto L_0x0089
            ii1.e r2 = new ii1.e
            r3 = 2131303911(0x7f091de7, float:1.822595E38)
            android.view.View r3 = r0.findViewById(r3)
            java.lang.String r4 = "it.findViewById(R.id.fin…r_live_mic_cover_ui_root)"
            gy3.C87412m.m108593f(r3, r4)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r4 = 2131304253(0x7f091f3d, float:1.8226643E38)
            android.view.View r4 = r0.findViewById(r4)
            java.lang.String r5 = "it.findViewById(R.id.finder_live_shade_view)"
            gy3.C87412m.m108593f(r4, r5)
            com.tencent.mm.plugin.finder.live.view.FinderLiveShadeView r4 = (com.tencent.p014mm.plugin.finder.live.view.FinderLiveShadeView) r4
            r5 = 2131303915(0x7f091deb, float:1.8225958E38)
            android.view.View r5 = r0.findViewById(r5)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            r2.<init>(r3, r0, r4, r5)
        L_0x0089:
            r7.f189241i = r2
            java.lang.Class<zo1.o0> r2 = zo1.C66939o0.class
            qj1.c r2 = r0.getPlugin(r2)
            zo1.o0 r2 = (zo1.C66939o0) r2
            if (r2 != 0) goto L_0x00a8
            zo1.o0 r2 = new zo1.o0
            r3 = 2131304232(0x7f091f28, float:1.82266E38)
            android.view.View r3 = r0.findViewById(r3)
            java.lang.String r4 = "it.findViewById(R.id.fin…_replay_seek_bar_ui_root)"
            gy3.C87412m.m108593f(r3, r4)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r2.<init>(r3, r0)
        L_0x00a8:
            r7.f189242j = r2
            java.lang.Class<zo1.a> r2 = zo1.C66911a.class
            qj1.c r2 = r0.getPlugin(r2)
            zo1.a r2 = (zo1.C66911a) r2
            if (r2 != 0) goto L_0x00c7
            zo1.a r2 = new zo1.a
            r3 = 2131312304(0x7f093eb0, float:1.8242973E38)
            android.view.View r3 = r0.findViewById(r3)
            java.lang.String r4 = "it.findViewById(R.id.replay_anchor_point)"
            gy3.C87412m.m108593f(r3, r4)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r2.<init>(r3, r0)
        L_0x00c7:
            vo1.i r2 = new vo1.i
            r2.<init>(r0)
            o40.C61926c.m72668M(r2)
        L_0x00cf:
            zo1.j0 r2 = r7.f189240h
            r3 = 0
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x02a6
            vo1.h$a r0 = new vo1.h$a
            r0.<init>(r7)
            androidx.lifecycle.i0 r6 = r2.mo87696x0(r1)
            bp1.d r6 = (bp1.C54519d) r6
            long r8 = r6.mo75371d3()
            java.lang.Long r6 = java.lang.Long.valueOf(r8)
            cp1.m r8 = r2.f192301r
            java.lang.Object r0 = r0.invoke(r6, r8)
            r6 = r0
            rx3.l r6 = (rx3.C13604l) r6
            A r0 = r6.f38555d
            cp1.m r0 = (cp1.C57952m) r0
            int r0 = r0.hashCode()
            cp1.m r8 = r2.f192301r
            if (r8 == 0) goto L_0x0103
            int r8 = r8.hashCode()
            goto L_0x0104
        L_0x0103:
            r8 = 0
        L_0x0104:
            java.lang.String r9 = "FinderLiveReplayerPlugin"
            if (r0 == r8) goto L_0x0199
            android.view.ViewGroup r0 = r2.f166287d
            java.util.List<java.lang.Integer> r8 = r2.f192299p
            int r11 = r0.getChildCount()     // Catch:{ Exception -> 0x0191 }
            if (r11 != 0) goto L_0x0119
            java.lang.String r0 = "remove child empty!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)     // Catch:{ Exception -> 0x0191 }
            goto L_0x0199
        L_0x0119:
            if (r8 == 0) goto L_0x0124
            boolean r11 = r8.isEmpty()     // Catch:{ Exception -> 0x0191 }
            if (r11 == 0) goto L_0x0122
            goto L_0x0124
        L_0x0122:
            r11 = 0
            goto L_0x0125
        L_0x0124:
            r11 = 1
        L_0x0125:
            if (r11 == 0) goto L_0x0130
            r0.removeAllViews()     // Catch:{ Exception -> 0x0191 }
            java.lang.String r0 = "remove all child!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)     // Catch:{ Exception -> 0x0191 }
            goto L_0x0199
        L_0x0130:
            java.util.LinkedList r11 = new java.util.LinkedList     // Catch:{ Exception -> 0x0191 }
            r11.<init>()     // Catch:{ Exception -> 0x0191 }
            int r12 = r0.getChildCount()     // Catch:{ Exception -> 0x0191 }
            r13 = 0
        L_0x013a:
            if (r13 >= r12) goto L_0x0154
            android.view.View r14 = r0.getChildAt(r13)     // Catch:{ Exception -> 0x0191 }
            int r15 = r14.getId()     // Catch:{ Exception -> 0x0191 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ Exception -> 0x0191 }
            boolean r15 = r8.contains(r15)     // Catch:{ Exception -> 0x0191 }
            if (r15 != 0) goto L_0x0151
            r11.add(r14)     // Catch:{ Exception -> 0x0191 }
        L_0x0151:
            int r13 = r13 + 1
            goto L_0x013a
        L_0x0154:
            java.util.Iterator r8 = r11.iterator()     // Catch:{ Exception -> 0x0191 }
        L_0x0158:
            boolean r11 = r8.hasNext()     // Catch:{ Exception -> 0x0191 }
            if (r11 == 0) goto L_0x0199
            java.lang.Object r11 = r8.next()     // Catch:{ Exception -> 0x0191 }
            android.view.View r11 = (android.view.View) r11     // Catch:{ Exception -> 0x0191 }
            r0.removeView(r11)     // Catch:{ Exception -> 0x0191 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0191 }
            r12.<init>()     // Catch:{ Exception -> 0x0191 }
            java.lang.String r13 = "remove child "
            r12.append(r13)     // Catch:{ Exception -> 0x0191 }
            int r13 = r11.getId()     // Catch:{ Exception -> 0x0191 }
            r12.append(r13)     // Catch:{ Exception -> 0x0191 }
            r13 = 40
            r12.append(r13)     // Catch:{ Exception -> 0x0191 }
            int r11 = r11.hashCode()     // Catch:{ Exception -> 0x0191 }
            r12.append(r11)     // Catch:{ Exception -> 0x0191 }
            r11 = 41
            r12.append(r11)     // Catch:{ Exception -> 0x0191 }
            java.lang.String r11 = r12.toString()     // Catch:{ Exception -> 0x0191 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r11)     // Catch:{ Exception -> 0x0191 }
            goto L_0x0158
        L_0x0191:
            r0 = move-exception
            er1.j4 r8 = er1.C58739j4.f168176a
            java.lang.String r11 = "FinderLiveReplayerPlugin-removeChild"
            r8.mo83712h0(r0, r11)
        L_0x0199:
            A r0 = r6.f38555d
            cp1.m r0 = (cp1.C57952m) r0
            r2.f192301r = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r8 = "activate playerWidget:"
            r0.append(r8)
            cp1.m r8 = r2.f192301r
            if (r8 == 0) goto L_0x01b2
            int r8 = r8.hashCode()
            goto L_0x01b3
        L_0x01b2:
            r8 = 0
        L_0x01b3:
            r0.append(r8)
            java.lang.String r8 = ",player:"
            r0.append(r8)
            cp1.m r8 = r2.f192301r
            if (r8 == 0) goto L_0x01c2
            com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy r8 = r8.f165852a
            goto L_0x01c3
        L_0x01c2:
            r8 = r3
        L_0x01c3:
            if (r8 == 0) goto L_0x01ca
            int r8 = r8.hashCode()
            goto L_0x01cb
        L_0x01ca:
            r8 = 0
        L_0x01cb:
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            B r0 = r6.f38556e
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x024d
            cp1.m r0 = r2.f192301r
            if (r0 == 0) goto L_0x01fc
            com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy r0 = r0.f165852a
            if (r0 == 0) goto L_0x01fc
            gr1.q2 r0 = r0.getVideoMediaInfo()
            if (r0 == 0) goto L_0x01fc
            pl1.u0 r0 = r0.f170495e
            if (r0 == 0) goto L_0x01fc
            te3.rq2 r0 = r0.mo87421f()
            if (r0 == 0) goto L_0x01fc
            android.util.Size r0 = vp1.C65840n.m77566b(r0, r4)
            goto L_0x0201
        L_0x01fc:
            android.util.Size r0 = new android.util.Size
            r0.<init>(r5, r5)
        L_0x0201:
            java.lang.Class<cl1.o> r6 = cl1.C54991o.class
            androidx.lifecycle.i0 r6 = r2.mo87696x0(r6)
            cl1.o r6 = (cl1.C54991o) r6
            boolean r6 = r6.mo75966J4()
            if (r6 == 0) goto L_0x021f
            int r6 = r0.getWidth()
            int r8 = r0.getHeight()
            if (r6 < r8) goto L_0x021f
            int r6 = r0.getHeight()
            if (r6 > 0) goto L_0x0229
        L_0x021f:
            androidx.lifecycle.i0 r6 = r2.mo87696x0(r1)
            bp1.d r6 = (bp1.C54519d) r6
            boolean r6 = r6.f152853p
            if (r6 == 0) goto L_0x022c
        L_0x0229:
            com.tencent.mm.pluginsdk.ui.a$e r6 = com.tencent.p014mm.pluginsdk.p133ui.C96814a.C96817e.CONTAIN
            goto L_0x022e
        L_0x022c:
            com.tencent.mm.pluginsdk.ui.a$e r6 = com.tencent.p014mm.pluginsdk.p133ui.C96814a.C96817e.COVER
        L_0x022e:
            cp1.m r8 = r2.f192301r
            if (r8 == 0) goto L_0x0237
            android.view.ViewGroup r9 = r2.f166287d
            r8.mo82757c(r9, r0, r6, r5)
        L_0x0237:
            r2.mo90914Z0()
            cp1.m r0 = r2.f192301r
            if (r0 == 0) goto L_0x02a6
            com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy r0 = r0.f165852a
            if (r0 == 0) goto L_0x02a6
            zo1.k0 r6 = new zo1.k0
            r6.<init>(r0, r2)
            r8 = 100
            r0.postDelayed(r6, r8)
            goto L_0x02a6
        L_0x024d:
            cp1.m r0 = r2.f192301r
            if (r0 == 0) goto L_0x02a6
            android.view.ViewGroup r2 = r2.f166287d
            java.lang.String r6 = "parent"
            gy3.C87412m.m108594g(r2, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "attachToParentAsFirst "
            r6.append(r8)
            int r8 = r0.hashCode()
            r6.append(r8)
            java.lang.String r8 = " playerView:"
            r6.append(r8)
            com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy r8 = r0.f165852a
            int r8 = r8.hashCode()
            r6.append(r8)
            java.lang.String r8 = ",parent:"
            r6.append(r8)
            int r8 = r2.hashCode()
            r6.append(r8)
            java.lang.String r8 = ",childCount:"
            r6.append(r8)
            int r8 = r2.getChildCount()
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            java.lang.String r8 = "FinderLiveReplayerWidget"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r6)
            com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy r6 = r0.f165852a
            int r6 = r2.indexOfChild(r6)
            r8 = -1
            if (r6 != r8) goto L_0x02a6
            com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy r0 = r0.f165852a
            r2.addView(r0, r5)
        L_0x02a6:
            ii1.e r0 = r7.f189241i
            if (r0 == 0) goto L_0x02bc
            java.lang.Class<cl1.d0> r2 = cl1.C54963d0.class
            androidx.lifecycle.i0 r2 = r0.mo87696x0(r2)
            cl1.d0 r2 = (cl1.C54963d0) r2
            com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData<gi1.c> r2 = r2.f154077t
            ii1.c r6 = new ii1.c
            r6.<init>(r0)
            r2.observe(r0, r6)
        L_0x02bc:
            java.lang.String r0 = "http"
            java.lang.String r2 = "https"
            if (r19 == 0) goto L_0x0391
            zo1.j0 r6 = r7.f189240h
            if (r6 == 0) goto L_0x02d1
            cp1.m r6 = r6.f192301r
            if (r6 == 0) goto L_0x02d1
            com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy r6 = r6.f165852a
            if (r6 == 0) goto L_0x02d1
            r6.setLoop(r4)
        L_0x02d1:
            ok1.e r4 = ok1.C62042e.f176370a
            r6 = 2
            androidx.lifecycle.i0 r8 = r7.mo83051g(r1)
            bp1.d r8 = (bp1.C54519d) r8
            te3.c21 r8 = r8.mo75372e3()
            java.lang.Class<hr.t> r9 = p165hr.C60106t.class
            di3.d r9 = di3.C86312j.m106911c(r9)
            hr.t r9 = (p165hr.C60106t) r9
            hg1.i r9 = r9.Cx0()
            androidx.lifecycle.i0 r11 = r7.mo83051g(r1)
            bp1.d r11 = (bp1.C54519d) r11
            te3.c21 r11 = r11.mo75372e3()
            long r11 = r11.f182392d
            int r9 = r9.mo58845Lo(r11)
            rx3.l r4 = r4.mo87128x0(r6, r8, r9)
            B r4 = r4.f38556e
            te3.to r4 = (te3.C64733to) r4
            java.lang.String r6 = "FinderLiveReplayBaseUIC"
            if (r4 == 0) goto L_0x0350
            vo1.i0 r0 = vo1.C65799i0.f189246a
            androidx.lifecycle.i0 r2 = r7.mo83051g(r1)
            bp1.d r2 = (bp1.C54519d) r2
            te3.c21 r2 = r2.mo75372e3()
            te3.e71 r2 = r2.f182388Z
            if (r2 == 0) goto L_0x0318
            te3.f71 r3 = r2.f182933i
        L_0x0318:
            java.lang.String r2 = r0.mo89849d(r3, r4)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "ReplayTransition0:createVideoData replayTransitionId:"
            r3.append(r5)
            r3.append(r2)
            java.lang.String r5 = ",url:"
            r3.append(r5)
            java.lang.String r5 = r4.f185622e
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r3)
            zo1.o0 r3 = r7.f189242j
            if (r3 == 0) goto L_0x0343
            r5 = 8
            r3.mo10792g(r5)
        L_0x0343:
            java.lang.String r3 = r4.f185622e
            java.lang.String r4 = "cdnInfo.url"
            gy3.C87412m.m108593f(r3, r4)
            pl1.r0 r0 = r0.mo89846a(r3, r2)
            goto L_0x03e0
        L_0x0350:
            java.lang.String r3 = "ReplayTransition0:createVideoData but cdnInfo is null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r3)
            sk1.a r11 = sk1.C63947a.f181274a
            androidx.lifecycle.i0 r3 = r7.mo83051g(r1)
            bp1.d r3 = (bp1.C54519d) r3
            te3.c21 r12 = r3.mo75372e3()
            r14 = 0
            r15 = 2
            r16 = 0
            java.lang.String r13 = "FinderLiveReplayBaseUIC-activate"
            java.lang.String r3 = sk1.C63947a.m75194h(r11, r12, r13, r14, r15, r16)
            te3.rq2 r9 = new te3.rq2
            r9.<init>()
            boolean r4 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r4 == 0) goto L_0x0378
            java.lang.String r3 = z04.C112551y.m153814n(r3, r2, r0, r5)
        L_0x0378:
            r9.f185266d = r3
            java.lang.String r0 = p823sg.C90193h.m112876d(r3)
            r9.f185275p = r0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 56
            r16 = 0
            pl1.r0 r0 = new pl1.r0
            java.lang.String r11 = "xV0"
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x03e0
        L_0x0391:
            zo1.j0 r3 = r7.f189240h
            if (r3 == 0) goto L_0x03a5
            cp1.m r3 = r3.f192301r
            if (r3 == 0) goto L_0x03a5
            com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy r3 = r3.f165852a
            if (r3 == 0) goto L_0x03a5
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.setAlpha(r4)
            r3.setLoop(r5)
        L_0x03a5:
            androidx.lifecycle.i0 r3 = r7.mo83051g(r1)
            bp1.d r3 = (bp1.C54519d) r3
            sk1.a r11 = sk1.C63947a.f181274a
            te3.c21 r12 = r3.mo75372e3()
            r14 = 0
            r15 = 2
            r16 = 0
            java.lang.String r13 = "MMFinder.LiveReplaySlice"
            java.lang.String r3 = sk1.C63947a.m75194h(r11, r12, r13, r14, r15, r16)
            te3.rq2 r9 = new te3.rq2
            r9.<init>()
            boolean r4 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r4 == 0) goto L_0x03c8
            java.lang.String r3 = z04.C112551y.m153814n(r3, r2, r0, r5)
        L_0x03c8:
            r9.f185266d = r3
            java.lang.String r0 = p823sg.C90193h.m112876d(r3)
            r9.f185275p = r0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 56
            r16 = 0
            pl1.r0 r0 = new pl1.r0
            java.lang.String r11 = "xV0"
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
        L_0x03e0:
            r3 = r0
            androidx.lifecycle.i0 r0 = r7.mo83051g(r1)
            bp1.d r0 = (bp1.C54519d) r0
            int r2 = r0.f152854q
            r4 = 0
            r6 = 1
            r1 = r17
            r5 = r18
            r1.mo89845m(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vo1.C65796h.mo89841i(boolean, boolean):void");
    }

    /* renamed from: j */
    public void mo89842j() {
        C63081w3 w3Var;
        C66925j0 j0Var = this.f189240h;
        if (j0Var != null) {
            j0Var.mo90918d1();
        }
        C56032b bVar = this.f189238f;
        if (!(bVar == null || (w3Var = (C63081w3) bVar.getPlugin(C63081w3.class)) == null)) {
            w3Var.mo10792g(8);
            FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy = w3Var.f179017t;
            if (finderLiveThumbPlayerProxy != null) {
                C62042e.f176370a.mo87010H1(finderLiveThumbPlayerProxy);
            }
            w3Var.f179015r.setImageDrawable((Drawable) null);
        }
        C62283d dVar = (C62283d) mo83051g(C62283d.class);
        dVar.mo87351d3(false);
        dVar.mo87352e3(false);
    }

    /* renamed from: k */
    public void mo89843k(C56032b bVar) {
        C87412m.m108594g(bVar, "baseRouter");
        C45795b buContext = bVar.getBuContext();
        C87412m.m108594g(buContext, "<set-?>");
        this.f166851d = buContext;
        this.f189238f = bVar;
        boolean booleanExtra = this.f189237e.getIntent().getBooleanExtra("LAUNCH_WITH_ANIM", false);
        this.f189237e.getIntent().removeExtra("LAUNCH_WITH_ANIM");
        if (booleanExtra) {
            C56032b bVar2 = this.f189238f;
            if (bVar2 != null) {
                bVar2.setAlpha(0.0f);
                return;
            }
            return;
        }
        C56032b bVar3 = this.f189238f;
        if (bVar3 != null) {
            bVar3.setAlpha(1.0f);
        }
    }

    /* renamed from: l */
    public final void mo89844l(int i, int i2) {
        Class cls = C54963d0.class;
        if (!((C54991o) mo83051g(C54991o.class)).mo75993b4()) {
            ((C54963d0) mo83051g(cls)).f154073p = null;
            ((C54963d0) mo83051g(cls)).f154074q.clear();
            ((C54963d0) mo83051g(cls)).f154053G = false;
            C56032b bVar = this.f189238f;
            if (bVar != null) {
                C58124b.C7172a.m7372a(bVar, C58124b.C58125b.FINDER_LIVE_LINK_MIC_REMOVE_BOTTOM_BAR, (Bundle) null, 2, (Object) null);
            }
            C56032b bVar2 = this.f189238f;
            if (bVar2 != null) {
                C56032b.notifySEIMicUserChange$default(bVar2, new JSONObject(), false, (C13604l) null, 6, (Object) null);
            }
            C65770a0.m77403t(C65770a0.f189184r.mo89819a(), 3, new JSONObject(), false, 4, (Object) null);
        }
        if (!((C54963d0) mo83051g(cls)).f154053G) {
            C56032b bVar3 = this.f189238f;
            if (bVar3 != null) {
                C56032b.notifyAudienceMicUserChange$default(bVar3, false, 1, (Object) null);
            }
            C56032b bVar4 = this.f189238f;
            if (bVar4 != null) {
                C56032b.notifyPKMicUserChange$default(bVar4, false, 1, (Object) null);
            }
            if (((C54963d0) mo83051g(cls)).f154073p != null) {
                C65770a0.m77403t(C65770a0.f189184r.mo89819a(), 1, (JSONObject) null, false, 6, (Object) null);
            } else {
                C65770a0.m77403t(C65770a0.f189184r.mo89819a(), 2, (JSONObject) null, false, 6, (Object) null);
            }
        }
    }

    /* renamed from: m */
    public final void mo89845m(int i, C62367r0 r0Var, boolean z, boolean z2, int i2) {
        C57952m mVar;
        Class cls = C54519d.class;
        C87412m.m108594g(r0Var, "data");
        Log.m105924i("FinderLiveReplayBaseUIC", "#replay_data#:startPlay url:" + r0Var.f177253e.f185266d + " source:" + i2);
        String str = r0Var.f177253e.f185266d;
        int i3 = 0;
        if (str == null || str.length() == 0) {
            C62042e.f176370a.mo87041S1(this.f189237e, "startPlay but url is empty!");
        }
        C66925j0 j0Var = this.f189240h;
        if (j0Var != null) {
            C64338e71 e712 = ((C54519d) mo83051g(cls)).mo75372e3().f182388Z;
            String str2 = null;
            String str3 = e712 != null ? e712.f182939r : null;
            String str4 = "";
            if (str3 == null) {
                str3 = str4;
            }
            FeedData feedData = new FeedData();
            feedData.setPosition(((C54519d) mo83051g(cls)).f152839A);
            FinderObjectDesc finderObjectDesc = ((C55001u) mo83051g(C55001u.class)).f154422s;
            String str5 = finderObjectDesc != null ? finderObjectDesc.description : null;
            if (str5 == null) {
                str5 = "replay-" + feedData.hashCode();
            }
            feedData.setDescription(str5);
            FinderObject finderObject = ((C54991o) mo83051g(C54991o.class)).f154341n;
            if (finderObject != null) {
                str2 = finderObject.nickname;
            }
            if (str2 != null) {
                str4 = str2;
            }
            feedData.setNickName(str4);
            C13598b0 b0Var = C13598b0.f38549a;
            StringBuilder sb = new StringBuilder();
            sb.append("bindMediaInfo:pos:");
            sb.append(feedData.getPosition());
            sb.append(",desc:");
            sb.append(feedData.getDescription());
            sb.append(",nickname:");
            sb.append(feedData.getNickName());
            sb.append(",player:");
            C57952m mVar2 = j0Var.f192301r;
            if (mVar2 != null) {
                i3 = mVar2.hashCode();
            }
            sb.append(i3);
            sb.append(",fromFloat:");
            sb.append(z2);
            sb.append(", isPlaying:");
            sb.append(j0Var.mo90915a1());
            sb.append('!');
            Log.m105924i("FinderLiveReplayerPlugin", sb.toString());
            if (!z2 && (mVar = j0Var.f192301r) != null) {
                mVar.mo82755a(r0Var, str3, z, feedData);
            }
        }
        C66925j0 j0Var2 = this.f189240h;
        if (j0Var2 != null) {
            j0Var2.mo90916b1(Integer.valueOf(i), z2);
        }
    }
}
