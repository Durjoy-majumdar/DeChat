package com.tencent.p014mm.plugin.finder.video;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import com.tencent.p014mm.app.C114668z;
import com.tencent.p014mm.autogen.events.FinderVideoCtrlEvent;
import com.tencent.p014mm.plugin.finder.feed.model.internal.DataBuffer;
import com.tencent.p014mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper;
import com.tencent.p014mm.plugin.finder.life.SupportLifecycle;
import com.tencent.p014mm.plugin.finder.preload.MediaPreloadCore;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import df1.C58259c;
import dm1.C58322c;
import gy3.C8480h;
import gy3.C87412m;
import hr1.C8730k;
import nc3.C34767b;
import p182kk.C61104a;
import pl1.C62352p0;
import pl1.C62370v0;
import rs1.C63566lb;

/* renamed from: com.tencent.mm.plugin.finder.video.FinderVideoCore */
public final class FinderVideoCore extends SupportLifecycle implements C114668z {

    /* renamed from: g */
    public final int f161824g;

    /* renamed from: h */
    public C63566lb f161825h;

    /* renamed from: i */
    public C58322c f161826i;

    /* renamed from: j */
    public C62370v0 f161827j;

    /* renamed from: n */
    public C8730k f161828n;

    /* renamed from: o */
    public C58259c f161829o;

    /* renamed from: p */
    public MediaPreloadCore f161830p;

    /* renamed from: q */
    public IListener<FinderVideoCtrlEvent> f161831q;

    /* renamed from: r */
    public C34767b.C34768c f161832r;

    /* renamed from: s */
    public AppCompatActivity f161833s;

    /* renamed from: t */
    public boolean f161834t;

    /* renamed from: u */
    public boolean f161835u;

    /* renamed from: v */
    public boolean f161836v;

    /* renamed from: com.tencent.mm.plugin.finder.video.FinderVideoCore$a */
    public interface C56519a {
        /* renamed from: a */
        boolean mo3742a();

        /* renamed from: b */
        boolean mo3743b();

        /* renamed from: c */
        RecyclerView mo3744c();

        DataBuffer<C0740i2> getData();
    }

    public FinderVideoCore() {
        this(0, 1, (C8480h) null);
    }

    public FinderVideoCore(int i) {
        this.f161824g = i;
        this.f161827j = new C62352p0(0, (MediaPreloadCore) null, 2, (C8480h) null);
        this.f161834t = true;
    }

    /* renamed from: F1 */
    public static /* synthetic */ void m65069F1(FinderVideoCore finderVideoCore, AppCompatActivity appCompatActivity, C56519a aVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            aVar = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        finderVideoCore.mo79536E1(appCompatActivity, aVar, z);
    }

    /* renamed from: B1 */
    public final boolean mo79534B1() {
        Log.m105924i("FinderVideoCore", "isDefaultMute: hasAudioFocus=" + this.f161834t + ", hasFinderOrLiveFloatBall=" + this.f161835u);
        return !this.f161834t && this.f161835u;
    }

    /* renamed from: C1 */
    public final void mo79535C1() {
        boolean z = false;
        this.f161834t = false;
        if (C61104a.m71656l((Context) null, false) || FinderVideoPassiveMiniViewHelper.f159083D.mo77472a().mo90541w()) {
            z = true;
        }
        this.f161835u = z;
        Log.m105924i("FinderVideoCore", "lossAudioFocus: hasFinderOrLiveFloatBall=" + this.f161835u);
        if (this.f161835u) {
            mo79538z1().mo80070Y(true, this.f161833s);
        }
    }

    /* JADX WARNING: type inference failed for: r2v7, types: [com.tencent.mm.plugin.finder.video.autoplay.FinderMultiFlowVideoAutoPlayManager] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: E1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo79536E1(androidx.appcompat.app.AppCompatActivity r10, com.tencent.p014mm.plugin.finder.video.FinderVideoCore.C56519a r11, boolean r12) {
        /*
            r9 = this;
            java.lang.String r0 = "context"
            gy3.C87412m.m108594g(r10, r0)
            r9.f161833s = r10
            bl3.r r0 = bl3.C39818r.f106831a
            java.lang.Class<ht1.t1> r1 = ht1.C60200t1.class
            bl3.r$a r1 = r0.mo62446e(r1)
            java.lang.Class<rs1.lb> r2 = rs1.C63566lb.class
            bl3.c r1 = r1.mo62447c(r2)
            rs1.lb r1 = (rs1.C63566lb) r1
            r9.f161825h = r1
            bl3.r$a r1 = r0.mo62444c(r10)
            java.lang.Class<dm1.c> r2 = dm1.C58322c.class
            androidx.lifecycle.i0 r1 = r1.mo75002a(r2)
            java.lang.String r2 = "UICProvider.of(context).…layerManager::class.java)"
            gy3.C87412m.m108593f(r1, r2)
            dm1.c r1 = (dm1.C58322c) r1
            r9.f161826i = r1
            bl3.r$a r1 = r0.mo62444c(r10)
            java.lang.Class<rs1.y9> r2 = rs1.C63672y9.class
            androidx.lifecycle.i0 r1 = r1.mo75002a(r2)
            rs1.y9 r1 = (rs1.C63672y9) r1
            int r2 = r9.f161824g
            r1.getClass()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "[init] tabType="
            r3.append(r4)
            r3.append(r2)
            java.lang.String r4 = " limitPlayDuration="
            r3.append(r4)
            long r4 = r1.f180505h
            r3.append(r4)
            java.lang.String r4 = " limitPlayCount="
            r3.append(r4)
            int r4 = r1.f180506i
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "Finder.SilentPlayControlUIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            rs1.s8$a r3 = rs1.C13442s8.f38060Q0
            android.app.Activity r4 = r1.getContext()
            rs1.s8 r3 = r3.mo12873f(r4)
            if (r3 == 0) goto L_0x0081
            ef1.c r2 = r3.mo12867y3(r2)
            if (r2 == 0) goto L_0x0081
            rs1.w9 r3 = new rs1.w9
            r3.<init>(r1)
            r2.mo83450a(r3)
        L_0x0081:
            rs1.lb r1 = r9.mo79538z1()
            r1.mo80080j0(r10, r12)
            com.tencent.mm.plugin.finder.video.FinderVideoCore$onInitialize$voipCallEvent$1 r12 = new com.tencent.mm.plugin.finder.video.FinderVideoCore$onInitialize$voipCallEvent$1
            r12.<init>(r10, r9)
            r12.alive()
            boolean r12 = p182kk.C61104a.m71641A()
            r1 = 0
            r2 = 0
            if (r12 != 0) goto L_0x00a4
            boolean r12 = p182kk.C61104a.m71642B(r2, r1)
            if (r12 != 0) goto L_0x00a4
            boolean r12 = p182kk.C61104a.m71644D()
            if (r12 == 0) goto L_0x00a5
        L_0x00a4:
            r1 = 1
        L_0x00a5:
            r9.f161836v = r1
            com.tencent.mm.app.f r12 = com.tencent.p014mm.app.C40008f.f107254d
            com.tencent.mm.plugin.finder.video.FinderVideoCore$onInitialize$1 r1 = new com.tencent.mm.plugin.finder.video.FinderVideoCore$onInitialize$1
            r1.<init>(r9, r10, r12)
            r9.f161831q = r1
            r1.alive()
            if (r11 == 0) goto L_0x019b
            androidx.recyclerview.widget.RecyclerView r5 = r11.mo3744c()
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r12 = r11.getData()
            bl3.r$a r1 = r0.mo62444c(r10)
            java.lang.Class<rs1.s8> r3 = rs1.C13442s8.class
            androidx.lifecycle.i0 r1 = r1.mo75002a(r3)
            java.lang.String r3 = "UICProvider.of(context).…rReporterUIC::class.java)"
            gy3.C87412m.m108593f(r1, r3)
            rs1.s8 r1 = (rs1.C13442s8) r1
            int r3 = r9.f161824g
            ef1.c r3 = r1.mo12867y3(r3)
            if (r3 == 0) goto L_0x00dd
            df1.c r4 = new df1.c
            r4.<init>(r3)
            r9.f161829o = r4
        L_0x00dd:
            int r3 = r9.f161824g
            te3.hj1 r3 = r1.mo12853i3(r3)
            int r3 = r3.f134675i
            boolean r4 = r11.mo3743b()
            if (r4 == 0) goto L_0x0159
            bl3.r$a r0 = r0.mo62444c(r10)
            java.lang.Class<com.tencent.mm.plugin.finder.preload.MediaPreloadCore> r4 = com.tencent.p014mm.plugin.finder.preload.MediaPreloadCore.class
            androidx.lifecycle.i0 r0 = r0.mo75002a(r4)
            com.tencent.mm.plugin.finder.preload.MediaPreloadCore r0 = (com.tencent.p014mm.plugin.finder.preload.MediaPreloadCore) r0
            int r4 = r9.f161824g
            ef1.c r1 = r1.mo12867y3(r4)
            r0.getClass()
            java.lang.String r4 = "dataList"
            gy3.C87412m.m108594g(r12, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "[CREATE] commentScene="
            r4.append(r6)
            r4.append(r3)
            java.lang.String r6 = " isPreloadMediaEnable="
            r4.append(r6)
            up1.f r6 = up1.C37521f.f99374d
            boolean r7 = r6.mo61173a0()
            r4.append(r7)
            java.lang.String r7 = " isPreloadImageEnable="
            r4.append(r7)
            boolean r7 = r6.mo61172Z()
            r4.append(r7)
            java.lang.String r7 = " isShowPreloadView="
            r4.append(r7)
            boolean r7 = com.tencent.p014mm.plugin.finder.preload.MediaPreloadCore.f160304p
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            java.lang.String r7 = "Finder.MediaPreloadCore"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r4)
            r0.f160310i = r3
            boolean r4 = r6.mo61173a0()
            if (r4 != 0) goto L_0x014d
            boolean r4 = r6.mo61172Z()
            if (r4 == 0) goto L_0x0157
        L_0x014d:
            if (r1 == 0) goto L_0x0157
            com.tencent.mm.plugin.finder.preload.MediaPreloadCore$a r4 = new com.tencent.mm.plugin.finder.preload.MediaPreloadCore$a
            r4.<init>(r0, r12)
            r1.mo83450a(r4)
        L_0x0157:
            r9.f161830p = r0
        L_0x0159:
            pl1.p0 r12 = new pl1.p0
            com.tencent.mm.plugin.finder.preload.MediaPreloadCore r0 = r9.f161830p
            r12.<init>(r3, r0)
            r9.f161827j = r12
            boolean r11 = r11.mo3742a()
            if (r11 == 0) goto L_0x019b
            if (r5 == 0) goto L_0x0194
            r11 = 155(0x9b, float:2.17E-43)
            if (r3 == r11) goto L_0x0186
            r11 = 170(0xaa, float:2.38E-43)
            if (r3 == r11) goto L_0x0186
            com.tencent.mm.plugin.finder.video.autoplay.FinderVideoAutoPlayManager r2 = new com.tencent.mm.plugin.finder.video.autoplay.FinderVideoAutoPlayManager
            r4 = r10
            com.tencent.mm.ui.MMFragmentActivity r4 = (com.tencent.p014mm.p136ui.MMFragmentActivity) r4
            rs1.lb r6 = r9.mo79538z1()
            dm1.c r7 = r9.mo79537y1()
            int r8 = r9.f161824g
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8)
            goto L_0x0194
        L_0x0186:
            com.tencent.mm.plugin.finder.video.autoplay.FinderMultiFlowVideoAutoPlayManager r2 = new com.tencent.mm.plugin.finder.video.autoplay.FinderMultiFlowVideoAutoPlayManager
            r11 = r10
            com.tencent.mm.ui.MMFragmentActivity r11 = (com.tencent.p014mm.p136ui.MMFragmentActivity) r11
            rs1.lb r12 = r9.mo79538z1()
            int r0 = r9.f161824g
            r2.<init>(r11, r5, r12, r0)
        L_0x0194:
            r9.f161828n = r2
            if (r2 == 0) goto L_0x019b
            r2.mo9561L0()
        L_0x019b:
            r11 = r10
            com.tencent.mm.ui.MMFragmentActivity r11 = (com.tencent.p014mm.p136ui.MMFragmentActivity) r11
            com.tencent.mm.plugin.finder.video.FinderVideoCore$onInitialize$3 r12 = new com.tencent.mm.plugin.finder.video.FinderVideoCore$onInitialize$3
            r12.<init>(r9, r10)
            r9.mo77491x1(r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.video.FinderVideoCore.mo79536E1(androidx.appcompat.app.AppCompatActivity, com.tencent.mm.plugin.finder.video.FinderVideoCore$a, boolean):void");
    }

    public void onAppBackground(String str) {
        mo79538z1().mo80068N((Context) null);
    }

    public void onAppForeground(String str) {
    }

    /* renamed from: y1 */
    public final C58322c mo79537y1() {
        C58322c cVar = this.f161826i;
        if (cVar != null) {
            return cVar;
        }
        C87412m.m108603p("musicManager");
        throw null;
    }

    /* renamed from: z1 */
    public final C63566lb mo79538z1() {
        C63566lb lbVar = this.f161825h;
        if (lbVar != null) {
            return lbVar;
        }
        C87412m.m108603p("recycler");
        throw null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FinderVideoCore(int i, int i2, C8480h hVar) {
        this((i2 & 1) != 0 ? -1 : i);
    }
}
