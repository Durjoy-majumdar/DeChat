package com.tencent.p014mm.plugin.finder.live.viewmodel.component;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import cj1.C0576n4;
import cj1.C54738b1;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FeedLiveFeedExposeEvent;
import com.tencent.p014mm.autogen.events.FinderFluentSwitchInterceptEvent;
import com.tencent.p014mm.autogen.events.FinderLiveViewLayoutEvent;
import com.tencent.p014mm.autogen.events.VoipEvent;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import o40.C61926c;
import ph1.C62293i;
import zk1.C66872c;

/* renamed from: com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC */
public final class FinderLiveExitAnimateOpUIC extends UIComponent {

    /* renamed from: d */
    public final String f160012d = ("FinderLiveExitAnimateOp@" + hashCode() + '}');

    /* renamed from: e */
    public boolean f160013e;

    /* renamed from: f */
    public final C56123a f160014f = new C56123a();

    /* renamed from: g */
    public boolean f160015g;

    /* renamed from: h */
    public C54738b1 f160016h;

    /* renamed from: i */
    public C0576n4 f160017i;

    /* renamed from: j */
    public long f160018j;

    /* renamed from: n */
    public ViewGroup f160019n;

    /* renamed from: o */
    public boolean f160020o;

    /* renamed from: p */
    public int f160021p;

    /* renamed from: q */
    public boolean f160022q;

    /* renamed from: r */
    public int f160023r = 1;

    /* renamed from: s */
    public boolean f160024s;

    /* renamed from: t */
    public final FinderLiveExitAnimateOpUIC$finderLiveViewLayoutEventListener$1 f160025t;

    /* renamed from: u */
    public final IListener<VoipEvent> f160026u;

    /* renamed from: v */
    public final IListener<FinderFluentSwitchInterceptEvent> f160027v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveExitAnimateOpUIC(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C40008f fVar = C40008f.f107254d;
        this.f160025t = new FinderLiveExitAnimateOpUIC$finderLiveViewLayoutEventListener$1(this, fVar);
        this.f160026u = new FinderLiveExitAnimateOpUIC$voipCallEvent$1(this, fVar);
        this.f160027v = new FinderLiveExitAnimateOpUIC$interceptEvent$1(this, fVar);
    }

    /* renamed from: c3 */
    public final void mo78200c3(String str) {
        C62293i.f177081a.mo87358c();
        mo78201d3(str);
    }

    /* renamed from: d3 */
    public final void mo78201d3(String str) {
        String str2 = this.f160012d;
        Log.m105924i(str2, "notifyFinish source: " + str + " start finish");
        this.f160013e = true;
        getActivity().finish();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002a, code lost:
        r2 = (r2 = r2.mo74924b()).f151977d;
     */
    /* renamed from: e3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo78202e3() {
        /*
            r29 = this;
            r0 = r29
            lt1.a r10 = lt1.C61401a.UNKNOW
            java.lang.Class<zk1.u0> r11 = zk1.C66881u0.class
            androidx.appcompat.app.AppCompatActivity r1 = r29.getActivity()
            java.lang.String r2 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorWithoutAffinityUI"
            gy3.C87412m.m108592e(r1, r2)
            com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorWithoutAffinityUI r1 = (com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveVisitorWithoutAffinityUI) r1
            com.tencent.mm.plugin.finder.live.fragment.FinderLiveVisitorFragment r12 = r1.f159020p
            if (r12 != 0) goto L_0x001b
            java.lang.String r1 = "liveFragment = null"
            r0.mo78201d3(r1)
            return
        L_0x001b:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r1.getClass()
            al1.i r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159398z
            if (r2 == 0) goto L_0x0035
            al1.h r2 = r2.mo74924b()
            if (r2 == 0) goto L_0x0035
            com.tencent.mm.live.api.LiveConfig r2 = r2.f151977d
            if (r2 == 0) goto L_0x0035
            long r2 = r2.f157075s
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            goto L_0x0036
        L_0x0035:
            r2 = 0
        L_0x0036:
            com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC$a r3 = r0.f160014f
            java.lang.Object r3 = r3.get(r2)
            com.tencent.mm.autogen.events.FinderLiveViewLayoutEvent$a r3 = (com.tencent.p014mm.autogen.events.FinderLiveViewLayoutEvent.C55131a) r3
            java.lang.String r4 = r0.f160012d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "startExitAnimate currentLiveFeedId: "
            r5.append(r6)
            r5.append(r2)
            java.lang.String r2 = " curVideoEvent: "
            r5.append(r2)
            r5.append(r3)
            java.lang.String r2 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
            if (r3 == 0) goto L_0x0062
            java.lang.Object r2 = r3.f154796b
            goto L_0x0063
        L_0x0062:
            r2 = 0
        L_0x0063:
            boolean r4 = r2 instanceof com.tencent.rtmp.p899ui.TXCloudVideoView
            if (r4 == 0) goto L_0x006a
            com.tencent.rtmp.ui.TXCloudVideoView r2 = (com.tencent.rtmp.p899ui.TXCloudVideoView) r2
            goto L_0x006b
        L_0x006a:
            r2 = 0
        L_0x006b:
            boolean r4 = r0.f160024s
            if (r4 != 0) goto L_0x007e
            if (r2 == 0) goto L_0x0077
            android.view.TextureView r2 = r2.getVideoView()
            if (r2 != 0) goto L_0x007e
        L_0x0077:
            java.lang.String r1 = "videoView = null"
            r0.mo78201d3(r1)
            return
        L_0x007e:
            bl3.r r14 = bl3.C39818r.f106831a
            bl3.r$a r2 = r14.mo62445d(r12)
            androidx.lifecycle.i0 r2 = r2.mo75002a(r11)
            zk1.u0 r2 = (zk1.C66881u0) r2
            jj1.a r2 = r2.mo90880d3()
            if (r2 == 0) goto L_0x0095
            d50.i r2 = r2.getLiveStatus()
            goto L_0x0096
        L_0x0095:
            r2 = 0
        L_0x0096:
            bl3.r$a r4 = r14.mo62445d(r12)
            androidx.lifecycle.i0 r4 = r4.mo75002a(r11)
            zk1.u0 r4 = (zk1.C66881u0) r4
            jj1.a r4 = r4.mo90880d3()
            r15 = 0
            if (r4 == 0) goto L_0x00ac
            boolean r4 = r4.mo84889d()
            goto L_0x00ad
        L_0x00ac:
            r4 = 0
        L_0x00ad:
            if (r4 != 0) goto L_0x00cc
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "liveStatus invalid: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r2 = " isCdnMode: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.mo78200c3(r1)
            return
        L_0x00cc:
            bl3.r$a r2 = r14.mo62445d(r12)
            androidx.lifecycle.i0 r2 = r2.mo75002a(r11)
            zk1.u0 r2 = (zk1.C66881u0) r2
            boolean r2 = r2.mo90879c3()
            bl3.r$a r4 = r14.mo62445d(r12)
            androidx.lifecycle.i0 r4 = r4.mo75002a(r11)
            zk1.u0 r4 = (zk1.C66881u0) r4
            jj1.a r4 = r4.mo90880d3()
            if (r4 == 0) goto L_0x00ef
            boolean r4 = r4.mo84890e()
            goto L_0x00f0
        L_0x00ef:
            r4 = 0
        L_0x00f0:
            r9 = 1
            if (r4 == 0) goto L_0x00f7
            if (r2 != 0) goto L_0x00f7
            r4 = 1
            goto L_0x00f8
        L_0x00f7:
            r4 = 0
        L_0x00f8:
            cj1.n4 r5 = r0.f160017i
            if (r5 == 0) goto L_0x0103
            te3.wp2 r5 = r5.f1381a
            if (r5 == 0) goto L_0x0103
            boolean r5 = r5.f186154f
            goto L_0x0104
        L_0x0103:
            r5 = 0
        L_0x0104:
            java.lang.String r6 = r0.f160012d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "startExitAnimate backAndDismissMiniWindow: "
            r7.append(r8)
            r7.append(r2)
            java.lang.String r2 = " isShowFloatWindow: "
            r7.append(r2)
            r7.append(r4)
            java.lang.String r2 = " isDisableFluentExit: "
            r7.append(r2)
            r7.append(r5)
            java.lang.String r2 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
            boolean r2 = r0.f160024s
            if (r2 != 0) goto L_0x0161
            java.lang.Class<aw.d> r2 = p447aw.C103918d.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            aw.d r2 = (p447aw.C103918d) r2
            android.app.Activity r6 = r29.getContext()
            boolean r2 = r2.mo125772Jn(r6)
            java.lang.Class<bh3.k> r6 = bh3.C113177k.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            bh3.k r6 = (bh3.C113177k) r6
            bh3.k$b r7 = bh3.C113177k.C113179b.OVERLAY
            bh3.k$a r8 = bh3.C113177k.C113178a.LIVE
            boolean r6 = r6.w00(r7, r8)
            if (r4 == 0) goto L_0x0157
            if (r2 == 0) goto L_0x0155
            if (r6 != 0) goto L_0x0157
        L_0x0155:
            r2 = 1
            goto L_0x0158
        L_0x0157:
            r2 = 0
        L_0x0158:
            if (r2 == 0) goto L_0x0161
            java.lang.String r1 = "window permission reject"
            r0.mo78200c3(r1)
            return
        L_0x0161:
            androidx.appcompat.app.AppCompatActivity r2 = r29.getActivity()
            android.view.Window r2 = r2.getWindow()
            android.graphics.drawable.ColorDrawable r6 = new android.graphics.drawable.ColorDrawable
            r6.<init>(r15)
            r2.setBackgroundDrawable(r6)
            androidx.appcompat.app.AppCompatActivity r2 = r29.getActivity()
            android.view.Window r2 = r2.getWindow()
            android.view.View r2 = r2.getDecorView()
            r2.setBackgroundColor(r15)
            ph1.i r2 = ph1.C62293i.f177081a
            long r6 = r0.f160018j
            ph1.m r6 = r2.mo87360e(r6)
            boolean r7 = r6 instanceof ph1.C62291f
            if (r7 == 0) goto L_0x0195
            r8 = r6
            ph1.f r8 = (ph1.C62291f) r8
            ph1.g r8 = r8.mo84321f()
            r8.f177079l = r4
        L_0x0195:
            ph1.C62293i.f177083c = r9
            r1.getClass()
            al1.i r8 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159398z
            if (r8 == 0) goto L_0x01b1
            al1.h r8 = r8.mo74924b()
            if (r8 == 0) goto L_0x01b1
            com.tencent.mm.live.api.LiveConfig r8 = r8.f151977d
            if (r8 == 0) goto L_0x01b1
            r16 = r14
            long r13 = r8.f157075s
            java.lang.Long r8 = java.lang.Long.valueOf(r13)
            goto L_0x01b4
        L_0x01b1:
            r16 = r14
            r8 = 0
        L_0x01b4:
            java.lang.String r13 = r0.f160012d
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "isCurrentFeed currentFeedId: "
            r14.append(r15)
            r15 = r10
            long r9 = r0.f160018j
            r14.append(r9)
            java.lang.String r9 = " currentLiveFeedId: "
            r14.append(r9)
            r14.append(r8)
            java.lang.String r9 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r9)
            long r9 = r0.f160018j
            r13 = 0
            int r18 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r18 == 0) goto L_0x01eb
            if (r8 != 0) goto L_0x01e0
            goto L_0x01e9
        L_0x01e0:
            long r13 = r8.longValue()
            int r8 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r8 != 0) goto L_0x01e9
            goto L_0x01eb
        L_0x01e9:
            r8 = 0
            goto L_0x01ec
        L_0x01eb:
            r8 = 1
        L_0x01ec:
            if (r8 != 0) goto L_0x01f4
            r9 = 1
            r0.f160013e = r9
            r2.mo87358c()
        L_0x01f4:
            boolean r2 = r0.f160024s
            java.lang.String r10 = " inParams = "
            java.lang.String r13 = "onWindowExit outParams = "
            java.lang.String r14 = "getContext()"
            java.lang.String r18 = "parentView"
            r19 = 0
            if (r2 == 0) goto L_0x0350
            java.lang.String r2 = r0.f160012d
            java.lang.String r4 = "onLiveScrollSquareExit"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            if (r3 == 0) goto L_0x0210
            int r2 = r3.f154797c
            r25 = r2
            goto L_0x0212
        L_0x0210:
            r25 = 0
        L_0x0212:
            if (r3 == 0) goto L_0x0219
            int r2 = r3.f154798d
            r26 = r2
            goto L_0x021b
        L_0x0219:
            r26 = 0
        L_0x021b:
            if (r3 == 0) goto L_0x0222
            float r2 = r3.f154799e
            r27 = r2
            goto L_0x0224
        L_0x0222:
            r27 = 0
        L_0x0224:
            if (r3 == 0) goto L_0x0229
            java.lang.Object r2 = r3.f154796b
            goto L_0x022a
        L_0x0229:
            r2 = 0
        L_0x022a:
            boolean r4 = r2 instanceof com.tencent.rtmp.p899ui.TXCloudVideoView
            if (r4 == 0) goto L_0x0231
            com.tencent.rtmp.ui.TXCloudVideoView r2 = (com.tencent.rtmp.p899ui.TXCloudVideoView) r2
            goto L_0x0232
        L_0x0231:
            r2 = 0
        L_0x0232:
            if (r3 == 0) goto L_0x0237
            java.lang.Object r3 = r3.f154800f
            goto L_0x0238
        L_0x0237:
            r3 = 0
        L_0x0238:
            boolean r4 = r3 instanceof f50.C58924d
            if (r4 == 0) goto L_0x0240
            f50.d r3 = (f50.C58924d) r3
            r7 = r3
            goto L_0x0241
        L_0x0240:
            r7 = 0
        L_0x0241:
            ph1.j r8 = new ph1.j
            lt1.a r21 = lt1.C61401a.LIVE_SCROLL_SQUARE
            long r3 = r0.f160018j
            r24 = 0
            r20 = r8
            r22 = r3
            r28 = r7
            r20.<init>(r21, r22, r24, r25, r26, r27, r28)
            if (r2 != 0) goto L_0x0269
            com.tencent.rtmp.ui.TXCloudVideoView r2 = new com.tencent.rtmp.ui.TXCloudVideoView
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r2.<init>((android.content.Context) r3)
            android.view.TextureView r3 = new android.view.TextureView
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r3.<init>(r4)
            r2.addVideoView(r3)
        L_0x0269:
            r6 = r2
            r1.getClass()
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159349B
            if (r2 == 0) goto L_0x027b
            java.lang.Class<fh1.p2> r3 = fh1.C59062p2.class
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController r2 = r2.controller(r3)
            fh1.p2 r2 = (fh1.C59062p2) r2
            r9 = r2
            goto L_0x027c
        L_0x027b:
            r9 = 0
        L_0x027c:
            if (r9 == 0) goto L_0x0283
            gk1.a r2 = r9.mo84269F3()
            goto L_0x0284
        L_0x0283:
            r2 = 0
        L_0x0284:
            if (r9 == 0) goto L_0x0349
            if (r2 != 0) goto L_0x028a
            goto L_0x0349
        L_0x028a:
            java.lang.Class<cl1.d> r3 = cl1.C54951d.class
            androidx.lifecycle.i0 r3 = r1.mo77630e(r3)
            cl1.d r3 = (cl1.C54951d) r3
            if (r3 == 0) goto L_0x0299
            com.tencent.mm.plugin.mmplayer.player.view.MMVideoFrameLayout r3 = r3.mo75868d3()
            goto L_0x029a
        L_0x0299:
            r3 = 0
        L_0x029a:
            r2.mo84593a(r3)
            fk1.c r11 = new fk1.c
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            gy3.C87412m.m108593f(r3, r14)
            androidx.appcompat.app.AppCompatActivity r4 = r29.getActivity()
            r11.<init>(r3, r4, r2)
            r11.f181112p = r8
            java.lang.Class<cl1.o> r2 = cl1.C54991o.class
            androidx.lifecycle.i0 r2 = r1.mo77630e(r2)
            cl1.o r2 = (cl1.C54991o) r2
            if (r2 == 0) goto L_0x02c6
            int r2 = r2.f154291a1
            r3 = 524288(0x80000, float:7.34684E-40)
            boolean r2 = o40.C61926c.m72696u(r2, r3)
            if (r2 == 0) goto L_0x02c6
            r1.mo77611N()
        L_0x02c6:
            r2 = r16
            bl3.r$a r1 = r2.mo62445d(r12)
            java.lang.Class<zk1.o0> r2 = zk1.C66878o0.class
            androidx.lifecycle.i0 r1 = r1.mo75002a(r2)
            java.lang.String r2 = "UICProvider.of(liveFragm…ollSquareUIC::class.java)"
            gy3.C87412m.m108593f(r1, r2)
            zk1.o0 r1 = (zk1.C66878o0) r1
            r2 = 4
            r4 = 0
            com.tencent.mm.autogen.events.FinderLiveScrollSquareStatusEvent r1 = r1.mo90871d3(r2, r4)
            com.tencent.mm.autogen.events.FinderLiveScrollSquareStatusEvent$a r1 = r1.f9216d
            java.lang.Object r1 = r1.f9219c
            boolean r2 = r1 instanceof android.view.ViewGroup
            if (r2 == 0) goto L_0x02ec
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r12 = r1
            goto L_0x02ed
        L_0x02ec:
            r12 = 0
        L_0x02ed:
            if (r12 != 0) goto L_0x02f6
            java.lang.String r1 = "onLiveScrollSquareExit parentPanelView = null"
            r0.mo78200c3(r1)
            goto L_0x0573
        L_0x02f6:
            vh1.a r14 = new vh1.a
            long r3 = r0.f160018j
            android.view.ViewGroup r5 = r0.f160019n
            if (r5 == 0) goto L_0x0344
            r1 = r14
            r2 = r15
            r1.<init>(r2, r3, r5, r6)
            r14.f189141d = r12
            r11.mo84317b(r14)
            java.lang.String r1 = r0.f160012d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r13)
            r2.append(r8)
            r2.append(r10)
            r2.append(r14)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            int r1 = r11.hashCode()
            r0.f160021p = r1
            if (r7 == 0) goto L_0x032e
            r1 = 0
            r7.setRenderMode(r1)
        L_0x032e:
            r1 = 1
            ph1.C62293i.f177086f = r1
            j50.a r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159378f
            if (r2 == 0) goto L_0x0338
            r2.mo85683a0()
        L_0x0338:
            r9.f168978A = r1
            zk1.e r1 = new zk1.e
            r1.<init>(r0, r11, r9)
            r11.mo88662u(r1)
            goto L_0x0573
        L_0x0344:
            gy3.C87412m.m108603p(r18)
            r1 = 0
            throw r1
        L_0x0349:
            java.lang.String r1 = "onLiveScrollSquareExit liveScrollPanelWidget = null"
            r0.mo78200c3(r1)
            goto L_0x0573
        L_0x0350:
            r2 = r16
            r1 = 0
            if (r4 != 0) goto L_0x0414
            if (r5 != 0) goto L_0x0414
            if (r7 != 0) goto L_0x035d
            boolean r5 = r6 instanceof ph1.C62288c
            if (r5 == 0) goto L_0x0414
        L_0x035d:
            if (r8 == 0) goto L_0x0414
            if (r3 == 0) goto L_0x0364
            java.lang.Object r1 = r3.f154796b
            goto L_0x0365
        L_0x0364:
            r1 = 0
        L_0x0365:
            boolean r2 = r1 instanceof com.tencent.rtmp.p899ui.TXCloudVideoView
            if (r2 == 0) goto L_0x036e
            com.tencent.rtmp.ui.TXCloudVideoView r1 = (com.tencent.rtmp.p899ui.TXCloudVideoView) r1
            r24 = r1
            goto L_0x0370
        L_0x036e:
            r24 = 0
        L_0x0370:
            if (r3 == 0) goto L_0x0375
            java.lang.Object r1 = r3.f154800f
            goto L_0x0376
        L_0x0375:
            r1 = 0
        L_0x0376:
            boolean r2 = r1 instanceof f50.C58924d
            if (r2 == 0) goto L_0x037d
            f50.d r1 = (f50.C58924d) r1
            goto L_0x037e
        L_0x037d:
            r1 = 0
        L_0x037e:
            if (r24 == 0) goto L_0x040d
            ph1.j r2 = r6.mo84321f()
            if (r2 != 0) goto L_0x0388
            goto L_0x040d
        L_0x0388:
            vh1.a r2 = new vh1.a
            ph1.j r3 = r6.mo84321f()
            gy3.C87412m.m108591d(r3)
            lt1.a r3 = r3.f177089a
            long r4 = r0.f160018j
            android.view.ViewGroup r7 = r0.f160019n
            if (r7 == 0) goto L_0x0408
            r19 = r2
            r20 = r3
            r21 = r4
            r23 = r7
            r19.<init>(r20, r21, r23, r24)
            ph1.j r3 = r6.mo84321f()
            if (r3 == 0) goto L_0x03ad
            f50.d r13 = r3.f177095g
            goto L_0x03ae
        L_0x03ad:
            r13 = 0
        L_0x03ae:
            if (r13 != 0) goto L_0x03cf
            java.lang.String r3 = r0.f160012d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "onDirectorExit set current livePlayer: "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            ph1.j r3 = r6.mo84321f()
            if (r3 != 0) goto L_0x03cd
            goto L_0x03cf
        L_0x03cd:
            r3.f177095g = r1
        L_0x03cf:
            lt1.a r1 = r2.f189138a
            lt1.a r3 = lt1.C61401a.LIVE_WINDOW
            if (r1 != r3) goto L_0x03dc
            java.lang.String r1 = "onDirectorExit scent = window"
            r0.mo78200c3(r1)
            goto L_0x0573
        L_0x03dc:
            r6.mo84317b(r2)
            java.lang.String r1 = r0.f160012d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "onDirectorExit params = "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            int r1 = r6.hashCode()
            r0.f160021p = r1
            r9 = 1
            ph1.C62293i.f177086f = r9
            zk1.d r1 = new zk1.d
            r1.<init>(r6, r0, r12)
            r6.mo84324i(r1)
            goto L_0x0573
        L_0x0408:
            gy3.C87412m.m108603p(r18)
            r1 = 0
            throw r1
        L_0x040d:
            java.lang.String r1 = "onDirectorExit object = null"
            r0.mo78200c3(r1)
            goto L_0x0573
        L_0x0414:
            r9 = 1
            if (r4 == 0) goto L_0x056e
            if (r3 == 0) goto L_0x041d
            int r4 = r3.f154797c
            r6 = r4
            goto L_0x041e
        L_0x041d:
            r6 = 0
        L_0x041e:
            if (r3 == 0) goto L_0x0424
            int r4 = r3.f154798d
            r7 = r4
            goto L_0x0425
        L_0x0424:
            r7 = 0
        L_0x0425:
            if (r3 == 0) goto L_0x042b
            float r4 = r3.f154799e
            r8 = r4
            goto L_0x042c
        L_0x042b:
            r8 = 0
        L_0x042c:
            if (r3 == 0) goto L_0x0431
            java.lang.Object r4 = r3.f154796b
            goto L_0x0432
        L_0x0431:
            r4 = 0
        L_0x0432:
            boolean r5 = r4 instanceof com.tencent.rtmp.p899ui.TXCloudVideoView
            if (r5 == 0) goto L_0x043b
            com.tencent.rtmp.ui.TXCloudVideoView r4 = (com.tencent.rtmp.p899ui.TXCloudVideoView) r4
            r16 = r4
            goto L_0x043d
        L_0x043b:
            r16 = 0
        L_0x043d:
            if (r3 == 0) goto L_0x0442
            java.lang.Object r4 = r3.f154800f
            goto L_0x0443
        L_0x0442:
            r4 = 0
        L_0x0443:
            boolean r3 = r4 instanceof f50.C58924d
            if (r3 == 0) goto L_0x044b
            f50.d r4 = (f50.C58924d) r4
            r5 = r4
            goto L_0x044c
        L_0x044b:
            r5 = 0
        L_0x044c:
            ph1.j r3 = new ph1.j
            r17 = r10
            long r9 = r0.f160018j
            r20 = 0
            r21 = 0
            r1 = r3
            r4 = r2
            r2 = r15
            r22 = r13
            r23 = r15
            r15 = r3
            r13 = r4
            r3 = r9
            r10 = r5
            r5 = r20
            r20 = r14
            r14 = 1
            r9 = r10
            r1.<init>(r2, r3, r5, r6, r7, r8, r9)
            f50.d r1 = r15.f177095g
            if (r1 != 0) goto L_0x0486
            java.lang.String r1 = r0.f160012d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "onWindowExit set new livePlayer: "
            r2.append(r3)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            r15.f177095g = r10
        L_0x0486:
            int r1 = r15.f177092d
            if (r1 == 0) goto L_0x049b
            int r1 = r15.f177093e
            if (r1 == 0) goto L_0x049b
            float r1 = r15.f177094f
            int r1 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1))
            if (r1 != 0) goto L_0x0496
            r9 = 1
            goto L_0x0497
        L_0x0496:
            r9 = 0
        L_0x0497:
            if (r9 != 0) goto L_0x049b
            r21 = 1
        L_0x049b:
            if (r21 != 0) goto L_0x04a4
            java.lang.String r1 = "outParams invalid"
            r0.mo78200c3(r1)
            goto L_0x0573
        L_0x04a4:
            bl3.r$a r1 = r13.mo62445d(r12)
            androidx.lifecycle.i0 r1 = r1.mo75002a(r11)
            zk1.u0 r1 = (zk1.C66881u0) r1
            jj1.a r1 = r1.mo90880d3()
            if (r1 == 0) goto L_0x04bd
            int r2 = r0.f160023r
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.mo84887b(r14, r2)
        L_0x04bd:
            bl3.r$a r1 = r13.mo62445d(r12)
            androidx.lifecycle.i0 r1 = r1.mo75002a(r11)
            zk1.u0 r1 = (zk1.C66881u0) r1
            jj1.a r1 = r1.mo90880d3()
            if (r1 == 0) goto L_0x04d3
            r50.f r4 = r1.mo84888c()
            r7 = r4
            goto L_0x04d4
        L_0x04d3:
            r7 = 0
        L_0x04d4:
            if (r7 == 0) goto L_0x0568
            android.view.View r1 = r7.f179749i
            boolean r1 = r1 instanceof x50.C15625a
            if (r1 == 0) goto L_0x0568
            if (r16 != 0) goto L_0x04e0
            goto L_0x0568
        L_0x04e0:
            uh1.b r8 = new uh1.b
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r2 = r20
            gy3.C87412m.m108593f(r1, r2)
            androidx.appcompat.app.AppCompatActivity r2 = r29.getActivity()
            r8.<init>(r1, r2)
            r8.f181112p = r15
            vh1.a r9 = new vh1.a
            long r3 = r0.f160018j
            android.view.ViewGroup r5 = r0.f160019n
            if (r5 == 0) goto L_0x0563
            r1 = r9
            r2 = r23
            r6 = r16
            r1.<init>(r2, r3, r5, r6)
            android.view.View r1 = r7.f179749i
            r9.f189141d = r1
            bl3.r$a r1 = r13.mo62445d(r12)
            androidx.lifecycle.i0 r1 = r1.mo75002a(r11)
            zk1.u0 r1 = (zk1.C66881u0) r1
            jj1.a r1 = r1.mo90880d3()
            if (r1 == 0) goto L_0x051d
            android.graphics.Point r13 = r1.mo84891f()
            goto L_0x051e
        L_0x051d:
            r13 = 0
        L_0x051e:
            r9.f189142e = r13
            r8.mo84317b(r9)
            java.lang.String r1 = r0.f160012d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = r22
            r2.append(r3)
            r2.append(r15)
            r3 = r17
            r2.append(r3)
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            java.lang.Class<pn.e> r1 = p646pn.C110234e.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            pn.e r1 = (p646pn.C110234e) r1
            xv0.e r1 = r1.mo161399pY()
            if (r1 == 0) goto L_0x0552
            r1.mo149130k0()
        L_0x0552:
            int r1 = r8.hashCode()
            r0.f160021p = r1
            ph1.C62293i.f177086f = r14
            zk1.f r1 = new zk1.f
            r1.<init>(r0, r8, r15, r12)
            r8.mo88662u(r1)
            goto L_0x0573
        L_0x0563:
            gy3.C87412m.m108603p(r18)
            r1 = 0
            throw r1
        L_0x0568:
            java.lang.String r1 = "liveMiniManager not FluentSwitchRelativeLayout"
            r0.mo78200c3(r1)
            goto L_0x0573
        L_0x056e:
            java.lang.String r1 = "director = null"
            r0.mo78201d3(r1)
        L_0x0573:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC.mo78202e3():void");
    }

    public boolean onBackPressed() {
        this.f160022q = true;
        return super.onBackPressed();
    }

    public void onBeforeFinish(Intent intent) {
        super.onBeforeFinish(intent);
        String str = this.f160012d;
        Log.m105924i(str, "onBeforeFinish feedId: " + this.f160018j);
        FeedLiveFeedExposeEvent feedLiveFeedExposeEvent = new FeedLiveFeedExposeEvent();
        feedLiveFeedExposeEvent.f9158d.f9159a = this.f160018j;
        feedLiveFeedExposeEvent.publish();
    }

    public void onCreate(Bundle bundle) {
        C54738b1 b1Var;
        super.onCreate(bundle);
        this.f160016h = C54738b1.f153409B.mo560b(getIntent());
        this.f160017i = C0576n4.f1379b.mo598a(getIntent());
        long longExtra = getIntent().getLongExtra("CURRENT_FEED_ID", 0);
        this.f160018j = longExtra;
        if (longExtra == 0 && (b1Var = this.f160016h) != null) {
            FinderObject finderObject = b1Var.f153429r;
            long j = finderObject != null ? finderObject.f164794id : 0;
            this.f160018j = j;
            if (j == 0 && b1Var.f153423l.size() > 0) {
                this.f160018j = b1Var.f153423l.get(0).f157075s;
            }
        }
        String str = this.f160012d;
        Log.m105924i(str, "onCreate currentFeedId: " + this.f160018j);
        View findViewById = getActivity().findViewById(C0966R.C0970id.eek);
        C87412m.m108593f(findViewById, "activity.findViewById(R.id.fragment_container)");
        this.f160019n = (ViewGroup) findViewById;
        this.f160025t.alive();
        this.f160026u.alive();
        this.f160027v.alive();
        C62293i iVar = C62293i.f177081a;
        C62293i.f177083c = false;
        C62293i.f177084d = false;
        C62293i.f177086f = false;
        C62293i.f177085e = false;
    }

    public void onDestroy() {
        super.onDestroy();
        Log.m105924i(this.f160012d, "onDestroy");
        this.f160014f.clear();
        this.f160025t.dead();
        this.f160026u.dead();
        this.f160027v.dead();
        C62293i iVar = C62293i.f177081a;
        C62293i.f177084d = true;
        C62293i.f177086f = false;
        C61926c.m72666K(1000, new C66872c(this));
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC$a */
    public static final class C56123a extends LinkedHashMap<Long, FinderLiveViewLayoutEvent.C55131a> {
        public final /* bridge */ boolean containsKey(Object obj) {
            if (!(obj instanceof Long)) {
                return false;
            }
            return super.containsKey((Long) obj);
        }

        public final /* bridge */ boolean containsValue(Object obj) {
            if (!(obj instanceof FinderLiveViewLayoutEvent.C55131a)) {
                return false;
            }
            return super.containsValue((FinderLiveViewLayoutEvent.C55131a) obj);
        }

        public final /* bridge */ Set<Map.Entry<Long, FinderLiveViewLayoutEvent.C55131a>> entrySet() {
            return super.entrySet();
        }

        public final /* bridge */ Object get(Object obj) {
            if (!(obj instanceof Long)) {
                return null;
            }
            return (FinderLiveViewLayoutEvent.C55131a) super.get((Long) obj);
        }

        public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof Long) ? obj2 : (FinderLiveViewLayoutEvent.C55131a) super.getOrDefault((Long) obj, (FinderLiveViewLayoutEvent.C55131a) obj2);
        }

        public final /* bridge */ Set<Long> keySet() {
            return super.keySet();
        }

        public final /* bridge */ Object remove(Object obj) {
            if (!(obj instanceof Long)) {
                return null;
            }
            return (FinderLiveViewLayoutEvent.C55131a) super.remove((Long) obj);
        }

        public boolean removeEldestEntry(Map.Entry<Long, FinderLiveViewLayoutEvent.C55131a> entry) {
            return super.size() > 3;
        }

        public final /* bridge */ int size() {
            return super.size();
        }

        public final /* bridge */ Collection<FinderLiveViewLayoutEvent.C55131a> values() {
            return super.values();
        }

        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if ((obj instanceof Long) && (obj2 instanceof FinderLiveViewLayoutEvent.C55131a)) {
                return super.remove((Long) obj, (FinderLiveViewLayoutEvent.C55131a) obj2);
            }
            return false;
        }
    }
}
