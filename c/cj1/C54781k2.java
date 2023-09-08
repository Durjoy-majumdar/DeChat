package cj1;

import ak1.C54116w;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderLiveCdnUserEnterLiveTimeCostStruct;
import com.tencent.p014mm.live.api.LiveConfig;
import com.tencent.p014mm.p136ui.C85861e4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import di3.C86312j;
import eb0.C31543z5;
import er1.C58713e5;
import er1.C58730g5;
import er1.C58743k5;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8478d0;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60172g4;
import ht1.C60200t1;
import j20.C117292a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import k20.C9556a;
import ok1.C62042e;
import p182kk.C61104a;
import p206nj.C11171e;
import pe3.C89349b;
import qo3.C77426q;
import qt1.C63329b;
import rx3.C13598b0;
import sx3.C36907w;
import te3.C49098d51;
import te3.C51333t21;
import te3.C51745vv0;
import te3.C51938x81;
import te3.C64273c21;
import te3.C64848y91;
import tf0.C64916p1;
import vo1.C65770a0;
import vp1.C65834e;
import zp3.C23564m;

/* renamed from: cj1.k2 */
public final class C54781k2 {

    /* renamed from: a */
    public static final C54781k2 f153552a = new C54781k2();

    /* renamed from: cj1.k2$d */
    public static final class C0558d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C0558d f1351d = new C0558d();

        public C0558d() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C13598b0.f38549a;
        }
    }

    /* renamed from: cj1.k2$e */
    public static final class C0559e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ Context f1352d;

        /* renamed from: e */
        public final /* synthetic */ C8479f0<String> f1353e;

        /* renamed from: f */
        public final /* synthetic */ C8478d0 f1354f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0559e(Context context, C8479f0<String> f0Var, C8478d0 d0Var) {
            super(0);
            this.f1352d = context;
            this.f1353e = f0Var;
            this.f1354f = d0Var;
        }

        public Object invoke() {
            C77426q qVar = new C77426q(this.f1352d);
            qVar.mo107595g(this.f1352d.getResources().getString(C0966R.string.dps));
            qVar.mo107602n((String) this.f1353e.f27484d);
            qVar.mo107600l(C0627v2.f1482a);
            qVar.mo107603o();
            this.f1354f.f27483d = 1;
            Log.m105924i("Finder.LiveJumpChecker", String.valueOf(this.f1352d.getResources().getString(C0966R.string.dps)));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: cj1.k2$f */
    public static final class C0560f extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C8478d0 f1355d;

        /* renamed from: e */
        public final /* synthetic */ Context f1356e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0560f(C8478d0 d0Var, Context context) {
            super(0);
            this.f1355d = d0Var;
            this.f1356e = context;
        }

        public Object invoke() {
            C23564m.m28136f(new C0632w2(this.f1356e));
            this.f1355d.f27483d = 3;
            Log.m105924i("Finder.LiveJumpChecker", String.valueOf(this.f1356e.getResources().getString(C0966R.string.f360554dk3)));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: cj1.k2$g */
    public static final class C0561g extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C8478d0 f1357d;

        /* renamed from: e */
        public final /* synthetic */ Context f1358e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0561g(C8478d0 d0Var, Context context) {
            super(0);
            this.f1357d = d0Var;
            this.f1358e = context;
        }

        public Object invoke() {
            C23564m.m28136f(new C0636x2(this.f1358e));
            this.f1357d.f27483d = 2;
            Log.m105924i("Finder.LiveJumpChecker", "checkVoip:" + this.f1358e.getResources().getString(C0966R.string.dk5));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: cj1.k2$i */
    public static final class C0562i extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C8478d0 f1359d;

        /* renamed from: e */
        public final /* synthetic */ Context f1360e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0562i(C8478d0 d0Var, Context context) {
            super(0);
            this.f1359d = d0Var;
            this.f1360e = context;
        }

        public Object invoke() {
            C23564m.m28136f(new C0645z2(this.f1360e));
            this.f1359d.f27483d = 3;
            Log.m105924i("Finder.LiveJumpChecker", "checkVoip:" + this.f1360e.getResources().getString(C0966R.string.dk6));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: cj1.k2$j */
    public static final class C0563j extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C8478d0 f1361d;

        /* renamed from: e */
        public final /* synthetic */ Context f1362e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0563j(C8478d0 d0Var, Context context) {
            super(0);
            this.f1361d = d0Var;
            this.f1362e = context;
        }

        public Object invoke() {
            C23564m.m28136f(new C0515a3(this.f1362e));
            this.f1361d.f27483d = 3;
            Log.m105924i("Finder.LiveJumpChecker", "checkAppBrand:" + this.f1362e.getResources().getString(C0966R.string.dk6));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: cj1.k2$a */
    public static final class C28575a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C28575a f78443d = new C28575a();

        public C28575a() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C13598b0.f38549a;
        }
    }

    /* renamed from: cj1.k2$b */
    public static final class C28576b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C28576b f78444d = new C28576b();

        public C28576b() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C13598b0.f38549a;
        }
    }

    /* renamed from: cj1.k2$c */
    public static final class C28577c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C28577c f78445d = new C28577c();

        public C28577c() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C13598b0.f38549a;
        }
    }

    /* renamed from: cj1.k2$h */
    public static final class C54782h extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C54738b1 f153553d;

        /* renamed from: e */
        public final /* synthetic */ Context f153554e;

        /* renamed from: f */
        public final /* synthetic */ C8479f0<String> f153555f;

        /* renamed from: g */
        public final /* synthetic */ Intent f153556g;

        /* renamed from: h */
        public final /* synthetic */ boolean f153557h;

        /* renamed from: i */
        public final /* synthetic */ C8478d0 f153558i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54782h(C54738b1 b1Var, Context context, C8479f0<String> f0Var, Intent intent, boolean z, C8478d0 d0Var) {
            super(1);
            this.f153553d = b1Var;
            this.f153554e = context;
            this.f153555f = f0Var;
            this.f153556g = intent;
            this.f153557h = z;
            this.f153558i = d0Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0031, code lost:
            r7 = ((cl1.C55001u) r7.mo71262a(r3)).f154420q;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r22) {
            /*
                r21 = this;
                r0 = r21
                r1 = r22
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                java.lang.Class<ak1.w> r2 = ak1.C54116w.class
                java.lang.Class<cl1.u> r3 = cl1.C55001u.class
                cj1.b1 r4 = r0.f153553d
                com.tencent.mm.live.api.LiveConfig r4 = r4.mo75635d()
                java.lang.String r5 = "Finder.LiveJumpChecker"
                if (r4 == 0) goto L_0x0186
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "curConfig liveId: "
                r6.append(r7)
                long r7 = r4.f157064e
                r6.append(r7)
                java.lang.String r7 = " lastLiveId: "
                r6.append(r7)
                fj1.b r7 = fj1.C45795b.f123698n
                r8 = 0
                if (r7 == 0) goto L_0x0042
                androidx.lifecycle.i0 r7 = r7.mo71262a(r3)
                cl1.u r7 = (cl1.C55001u) r7
                te3.c21 r7 = r7.f154420q
                if (r7 == 0) goto L_0x0042
                long r9 = r7.f182392d
                java.lang.Long r7 = java.lang.Long.valueOf(r9)
                goto L_0x0043
            L_0x0042:
                r7 = r8
            L_0x0043:
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
                long r6 = r4.f157064e
                r9 = 0
                r11 = 0
                int r12 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
                if (r12 == 0) goto L_0x00fd
                fj1.b r6 = fj1.C45795b.f123698n
                r7 = 1
                if (r6 == 0) goto L_0x006f
                androidx.lifecycle.i0 r3 = r6.mo71262a(r3)
                cl1.u r3 = (cl1.C55001u) r3
                te3.c21 r3 = r3.f154420q
                if (r3 == 0) goto L_0x006f
                long r12 = r4.f157064e
                long r14 = r3.f182392d
                int r3 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r3 != 0) goto L_0x006f
                r3 = 1
                goto L_0x0070
            L_0x006f:
                r3 = 0
            L_0x0070:
                if (r3 == 0) goto L_0x00fd
                cj1.k2 r12 = cj1.C54781k2.f153552a
                android.content.Context r13 = r0.f153554e
                cj1.b1 r14 = r0.f153553d
                gy3.f0<java.lang.String> r1 = r0.f153555f
                T r1 = r1.f27484d
                r15 = r1
                java.lang.String r15 = (java.lang.String) r15
                android.content.Intent r1 = r0.f153556g
                boolean r2 = r0.f153557h
                r12.getClass()
                com.tencent.mm.plugin.finder.live.model.FinderLiveService r3 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
                r3.getClass()
                j50.a r3 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159378f
                if (r3 == 0) goto L_0x009b
                d50.i r3 = r3.f172989A
                if (r3 == 0) goto L_0x009b
                boolean r3 = r3.mo82881c()
                if (r3 != r7) goto L_0x009b
                r3 = 1
                goto L_0x009c
            L_0x009b:
                r3 = 0
            L_0x009c:
                if (r3 == 0) goto L_0x00ae
                java.lang.String r1 = "enterSameVisitorLive performClickMiniWin"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
                uk1.a r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159381i
                com.tencent.mm.plugin.finder.live.view.FinderLiveMiniView r1 = r1.f188207a
                if (r1 == 0) goto L_0x018b
                r1.performClick()
                goto L_0x018b
            L_0x00ae:
                j50.a r3 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159378f
                if (r3 == 0) goto L_0x00be
                d50.i r3 = r3.f172989A
                if (r3 == 0) goto L_0x00be
                boolean r3 = r3.mo82888j()
                if (r3 != r7) goto L_0x00be
                r3 = 1
                goto L_0x00bf
            L_0x00be:
                r3 = 0
            L_0x00bf:
                if (r3 == 0) goto L_0x00ee
                com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159349B
                if (r1 == 0) goto L_0x018b
                java.lang.Class<fh1.p2> r2 = fh1.C59062p2.class
                com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController r1 = r1.controller(r2)
                fh1.p2 r1 = (fh1.C59062p2) r1
                if (r1 == 0) goto L_0x018b
                boolean r2 = r1.mo84271I3()
                if (r2 == 0) goto L_0x00de
                java.lang.String r1 = r1.f168980j
                java.lang.String r2 = "launchActivityFromSquarePanel not supportScrollSquare"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
                goto L_0x018b
            L_0x00de:
                java.lang.String r2 = r1.f168980j
                java.lang.String r3 = "launchActivityFromSquarePanel"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
                r1.mo77760d()
                r2 = 0
                r1.mo77758F1(r7, r11, r2)
                goto L_0x018b
            L_0x00ee:
                r16 = 0
                r19 = 8
                r20 = 0
                r17 = r1
                r18 = r2
                cj1.C54781k2.m61644m(r12, r13, r14, r15, r16, r17, r18, r19, r20)
                goto L_0x018b
            L_0x00fd:
                long r3 = r4.f157064e
                int r6 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
                if (r6 == 0) goto L_0x0162
                if (r1 != 0) goto L_0x0162
                di3.d r1 = di3.C86312j.m106911c(r2)
                ak1.w r1 = (ak1.C54116w) r1
                ak1.f0$q0 r14 = ak1.C54067f0.C54079q0.CloseTypeOtherRoom
                r1.Gy0(r14)
                android.content.Intent r1 = r0.f153556g
                if (r1 == 0) goto L_0x011b
                java.lang.String r3 = "KEY_PARAMS_NOT_KEEP_CUR_LIVE"
                boolean r1 = r1.getBooleanExtra(r3, r11)
                goto L_0x011c
            L_0x011b:
                r1 = 0
            L_0x011c:
                if (r1 == 0) goto L_0x0125
                com.tencent.mm.plugin.finder.live.model.FinderLiveService r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
                r3 = 3
                com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.m63768J(r1, r11, r8, r3, r8)
                goto L_0x0131
            L_0x0125:
                com.tencent.mm.plugin.finder.live.model.FinderLiveService r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
                r1.getClass()
                j50.a r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159378f
                if (r1 == 0) goto L_0x0131
                r1.mo85683a0()
            L_0x0131:
                cj1.k2 r3 = cj1.C54781k2.f153552a
                android.content.Context r4 = r0.f153554e
                cj1.b1 r5 = r0.f153553d
                gy3.f0<java.lang.String> r1 = r0.f153555f
                T r1 = r1.f27484d
                r6 = r1
                java.lang.String r6 = (java.lang.String) r6
                r7 = 0
                android.content.Intent r8 = r0.f153556g
                boolean r9 = r0.f153557h
                r10 = 8
                r11 = 0
                cj1.C54781k2.m61644m(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                di3.d r1 = di3.C86312j.m106911c(r2)
                java.lang.String r2 = "getService(HellLiveVisitorReoprter::class.java)"
                gy3.C87412m.m108593f(r1, r2)
                r12 = r1
                ak1.w r12 = (ak1.C54116w) r12
                android.content.Context r13 = r0.f153554e
                r15 = 0
                r16 = 0
                r17 = 12
                r18 = 0
                ak1.C54116w.wy0(r12, r13, r14, r15, r16, r17, r18)
                goto L_0x018b
            L_0x0162:
                cj1.y2 r1 = new cj1.y2
                android.content.Context r2 = r0.f153554e
                r1.<init>(r2)
                zp3.C23564m.m28136f(r1)
                gy3.d0 r1 = r0.f153558i
                r2 = 2
                r1.f27483d = r2
                android.content.Context r1 = r0.f153554e
                android.content.res.Resources r1 = r1.getResources()
                r2 = 2131827263(0x7f111a3f, float:1.9287434E38)
                java.lang.String r1 = r1.getString(r2)
                java.lang.String r1 = java.lang.String.valueOf(r1)
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
                goto L_0x018b
            L_0x0186:
                java.lang.String r1 = "jumpVisitorLiveUI Fail! liveConfig == null !!!"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r1)
            L_0x018b:
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: cj1.C54781k2.C54782h.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: cj1.k2$k */
    public static final class C54783k implements C60200t1.C60202b {

        /* renamed from: a */
        public final /* synthetic */ C54738b1 f153559a;

        /* renamed from: b */
        public final /* synthetic */ LiveConfig f153560b;

        /* renamed from: c */
        public final /* synthetic */ Intent f153561c;

        /* renamed from: d */
        public final /* synthetic */ Context f153562d;

        public C54783k(C54738b1 b1Var, LiveConfig liveConfig, Intent intent, Context context) {
            this.f153559a = b1Var;
            this.f153560b = liveConfig;
            this.f153561c = intent;
            this.f153562d = context;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x000f, code lost:
            r4 = r4.getLiveInfo();
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo75691a(java.lang.Object r3, int r4, int r5) {
            /*
                r2 = this;
                cj1.b1 r3 = r2.f153559a
                vp1.e r4 = vp1.C65834e.f189316a
                com.tencent.mm.live.api.LiveConfig r5 = r2.f153560b
                long r0 = r5.f157075s
                com.tencent.mm.plugin.finder.storage.FinderItem r4 = r4.mo89871e(r0)
                r5 = -1
                if (r4 == 0) goto L_0x0018
                te3.c21 r4 = r4.getLiveInfo()
                if (r4 == 0) goto L_0x0018
                int r4 = r4.f182356B
                goto L_0x0019
            L_0x0018:
                r4 = -1
            L_0x0019:
                r3.f153424m = r4
                cj1.b1 r3 = r2.f153559a
                int r4 = r3.f153424m
                if (r4 == r5) goto L_0x0029
                android.content.Intent r4 = r2.f153561c
                android.content.Context r5 = r2.f153562d
                cj1.C54781k2.m61643k(r3, r4, r5)
                goto L_0x0048
            L_0x0029:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "config.secondaryDeviceFlag is not legal: "
                r3.append(r4)
                cj1.b1 r4 = r2.f153559a
                int r4 = r4.f153424m
                r3.append(r4)
                java.lang.String r4 = " after getCommentDatail"
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                java.lang.String r4 = "Finder.LiveJumpChecker"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            L_0x0048:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: cj1.C54781k2.C54783k.mo75691a(java.lang.Object, int, int):void");
        }
    }

    /* renamed from: k */
    public static final void m61643k(C54738b1 b1Var, Intent intent, Context context) {
        int i = b1Var.f153424m;
        boolean z = true;
        if (i == 1 || i == 0) {
            intent.setClass(context, C62042e.f176370a.mo87056Y(context));
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/model/FinderLiveJumpChecker", "gotoAnchorLive$jump", "(Lcom/tencent/mm/plugin/finder/live/model/FinderLiveBundle;Landroid/content/Intent;Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/plugin/finder/live/model/FinderLiveJumpChecker", "gotoAnchorLive$jump", "(Lcom/tencent/mm/plugin/finder/live/model/FinderLiveBundle;Landroid/content/Intent;Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (i == 2) {
            intent.setClass(context, C62042e.f176370a.mo87053X(context));
            intent.addFlags(872415232);
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent);
            Context context3 = context;
            C117292a.m165358d(context3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/model/FinderLiveJumpChecker", "gotoAnchorLive$jump", "(Lcom/tencent/mm/plugin/finder/live/model/FinderLiveBundle;Landroid/content/Intent;Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(context3, "com/tencent/mm/plugin/finder/live/model/FinderLiveJumpChecker", "gotoAnchorLive$jump", "(Lcom/tencent/mm/plugin/finder/live/model/FinderLiveBundle;Landroid/content/Intent;Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            Log.m105924i("Finder.LiveJumpChecker", "config.secondaryDeviceFlag is not legal: " + b1Var.f153424m);
        }
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null) {
            C45795b.C32059a aVar3 = C45795b.f123697j;
            C45795b bVar = C45795b.f123698n;
            if (bVar == null || !((C54991o) bVar.mo71262a(C54991o.class)).mo75999e4()) {
                z = false;
            }
            activity.overridePendingTransition(z ? C0966R.C0968anim.f2333y : C0966R.C0968anim.f2492eg, C0966R.C0968anim.f2333y);
        }
    }

    /* renamed from: m */
    public static /* synthetic */ void m61644m(C54781k2 k2Var, Context context, C54738b1 b1Var, String str, String str2, Intent intent, boolean z, int i, Object obj) {
        k2Var.mo75690l(context, b1Var, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? null : intent, (i & 32) != 0 ? false : z);
    }

    /* renamed from: a */
    public final C54781k2 mo75680a(C32224a<C13598b0> aVar) {
        if (!C61104a.m71648d() && !C61104a.m71645a()) {
            return this;
        }
        if (aVar == null) {
            return null;
        }
        aVar.invoke();
        return null;
    }

    /* renamed from: b */
    public final C54781k2 mo75681b(boolean z, C32224a<C13598b0> aVar) {
        if (C61104a.m71661q((Context) null, false)) {
            if (aVar != null) {
                aVar.invoke();
            }
            if (z) {
                return null;
            }
        }
        return this;
    }

    /* renamed from: c */
    public final boolean mo75682c() {
        C54781k2 k2Var;
        C54781k2 a;
        C54781k2 d = mo75683d(C0546h2.f1325d);
        if (d == null || (a = d.mo75680a(C0551i2.f1340d)) == null) {
            k2Var = null;
        } else {
            Context applicationContext = MMApplicationContext.getContext().getApplicationContext();
            C87412m.m108593f(applicationContext, "getContext().applicationContext");
            k2Var = a.mo75687h(applicationContext, C0554j2.f1342d);
        }
        return ((k2Var == null) || mo75681b(false, C28575a.f78443d) == null || mo75686g(C28576b.f78444d) == null || mo75685f(C28577c.f78445d) == null) ? false : true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047 A[RETURN] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final cj1.C54781k2 mo75683d(fy3.C32224a<rx3.C13598b0> r8) {
        /*
            r7 = this;
            java.lang.String r0 = "Finder.LiveJumpChecker"
            r1 = 1
            r2 = 0
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x002f }
            java.lang.String r4 = "phone"
            java.lang.Object r3 = r3.getSystemService(r4)     // Catch:{ Exception -> 0x002f }
            java.lang.String r4 = "null cannot be cast to non-null type android.telephony.TelephonyManager"
            gy3.C87412m.m108592e(r3, r4)     // Catch:{ Exception -> 0x002f }
            android.telephony.TelephonyManager r3 = (android.telephony.TelephonyManager) r3     // Catch:{ Exception -> 0x002f }
            int r3 = r3.getCallState()     // Catch:{ Exception -> 0x002f }
            r4 = 2
            if (r3 == r4) goto L_0x001e
            r4 = 0
            goto L_0x001f
        L_0x001e:
            r4 = 1
        L_0x001f:
            java.lang.String r5 = "TelephoneManager.callState is %d"
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x002d }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x002d }
            r6[r2] = r3     // Catch:{ Exception -> 0x002d }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r5, r6)     // Catch:{ Exception -> 0x002d }
            goto L_0x003e
        L_0x002d:
            r3 = move-exception
            goto L_0x0031
        L_0x002f:
            r3 = move-exception
            r4 = 0
        L_0x0031:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r3 = r3.getLocalizedMessage()
            r1[r2] = r3
            java.lang.String r2 = "get callState error , errMsg is %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r2, r1)
        L_0x003e:
            if (r4 == 0) goto L_0x0047
            if (r8 == 0) goto L_0x0045
            r8.invoke()
        L_0x0045:
            r8 = 0
            return r8
        L_0x0047:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: cj1.C54781k2.mo75683d(fy3.a):cj1.k2");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006a, code lost:
        if (r1 != false) goto L_0x006c;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final cj1.C54781k2 mo75684e(android.content.Context r9, boolean r10, fy3.C32226l<? super java.lang.Boolean, rx3.C13598b0> r11) {
        /*
            r8 = this;
            fj1.b$a r9 = fj1.C45795b.f123697j
            fj1.b r9 = fj1.C45795b.f123698n
            r0 = 0
            if (r9 == 0) goto L_0x0010
            java.lang.Class<cl1.o> r1 = cl1.C54991o.class
            androidx.lifecycle.i0 r9 = r9.mo71262a(r1)
            cl1.o r9 = (cl1.C54991o) r9
            goto L_0x0011
        L_0x0010:
            r9 = r0
        L_0x0011:
            r1 = 1
            r2 = 0
            if (r9 == 0) goto L_0x002f
            java.lang.Class<cl1.u> r3 = cl1.C55001u.class
            androidx.lifecycle.i0 r3 = r9.business(r3)
            cl1.u r3 = (cl1.C55001u) r3
            te3.c21 r3 = r3.f154420q
            long r3 = r3.f182392d
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x002f
            boolean r3 = r9.mo75997d4()
            if (r3 != 0) goto L_0x002f
            r3 = 1
            goto L_0x0030
        L_0x002f:
            r3 = 0
        L_0x0030:
            if (r3 == 0) goto L_0x004c
            if (r11 == 0) goto L_0x004b
            zc1.b r10 = zc1.C66785b.f191882e
            java.lang.String r10 = r10.mo90662O5()
            if (r9 == 0) goto L_0x003f
            java.lang.String r9 = r9.f154345o
            goto L_0x0040
        L_0x003f:
            r9 = r0
        L_0x0040:
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r10, (java.lang.String) r9)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            r11.invoke(r9)
        L_0x004b:
            return r0
        L_0x004c:
            r9 = 3
            if (r10 == 0) goto L_0x005b
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r10 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            p50.e r11 = r10.mo77631e0()
            if (r11 == 0) goto L_0x0071
            com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.m63768J(r10, r2, r0, r9, r0)
            goto L_0x0071
        L_0x005b:
            c50.b r10 = c50.C54655b.f153178f1
            if (r10 == 0) goto L_0x0061
            r10 = 1
            goto L_0x0062
        L_0x0061:
            r10 = 0
        L_0x0062:
            if (r10 != 0) goto L_0x006c
            i50.a r10 = i50.C60251a.f171781k1
            if (r10 == 0) goto L_0x0069
            goto L_0x006a
        L_0x0069:
            r1 = 0
        L_0x006a:
            if (r1 == 0) goto L_0x0071
        L_0x006c:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r10 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.m63768J(r10, r2, r0, r9, r0)
        L_0x0071:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: cj1.C54781k2.mo75684e(android.content.Context, boolean, fy3.l):cj1.k2");
    }

    /* renamed from: f */
    public final C54781k2 mo75685f(C32224a<C13598b0> aVar) {
        if (NetStatusUtil.isConnected(MMApplicationContext.getContext())) {
            return this;
        }
        if (aVar == null) {
            return null;
        }
        aVar.invoke();
        return null;
    }

    /* renamed from: g */
    public final C54781k2 mo75686g(C32224a<C13598b0> aVar) {
        if (!C61104a.m71662r()) {
            return this;
        }
        if (aVar == null) {
            return null;
        }
        aVar.invoke();
        return null;
    }

    /* renamed from: h */
    public final C54781k2 mo75687h(Context context, C32224a<C13598b0> aVar) {
        if (!C61104a.m71653i(context, false, (Bundle) null) && !C61104a.m71642B((Context) null, false) && !C61104a.m71644D()) {
            return this;
        }
        if (aVar != null) {
            aVar.invoke();
        }
        return null;
    }

    /* renamed from: i */
    public final int mo75688i(Context context, C54738b1 b1Var, String str, String str2, Intent intent, boolean z, C32224a<C13598b0> aVar) {
        C54781k2 f;
        C54781k2 d;
        C54781k2 g;
        C54781k2 e;
        C54781k2 h;
        C54781k2 a;
        C54781k2 b;
        C64273c21 c212;
        T v3;
        T t;
        T t2;
        Context context2 = context;
        C54738b1 b1Var2 = b1Var;
        String str3 = str;
        Intent intent2 = intent;
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(b1Var2, "config");
        C87412m.m108594g(str3, "contextId");
        C87412m.m108594g(str2, "clickTabContextId");
        LiveConfig d2 = b1Var.mo75635d();
        if (d2 != null) {
            long j = d2.f157064e;
            if (j != 0) {
                C54116w wVar = (C54116w) C86312j.m106911c(C54116w.class);
                wVar.getClass();
                Log.m105924i("HABBYGE-MALI.HellLiveVisitorReoprter", "#markTapEnterLive " + j);
                FinderLiveCdnUserEnterLiveTimeCostStruct xx02 = wVar.xx0(j);
                xx02.f155490e = j;
                xx02.f155499n = C31543z5.m39453c();
            }
        }
        C63329b.f179694a.mo88233d("goVisitorUIWithCheck", "init goVisitorUIWithCheck contextId:" + str3 + ' ' + b1Var2 + ' ');
        LiveConfig d3 = b1Var.mo75635d();
        T t3 = "";
        if (d3 != null) {
            if (intent2 == null || (t2 = intent2.getStringExtra("key_enter_live_param_share_username")) == null) {
                t2 = t3;
            }
            d3.f157049G = t2;
        }
        LiveConfig d4 = b1Var.mo75635d();
        if (d4 != null) {
            d4.f157050H = intent2 != null ? intent2.getIntExtra("key_enter_live_param_from_share_scene", 0) : 0;
        }
        LiveConfig d5 = b1Var.mo75635d();
        if (d5 != null) {
            d5.f157051I = intent2 != null ? intent2.getIntExtra("key_enter_live_param_from_share_scene_new", 0) : 0;
        }
        LiveConfig d6 = b1Var.mo75635d();
        if (d6 != null) {
            if (intent2 == null || (t = intent2.getStringExtra("KEY_ENTER_LIVE_PARAM_TO_USERNAME")) == null) {
                t = t3;
            }
            d6.f157052J = t;
        }
        T stringExtra = intent2 != null ? intent2.getStringExtra("key_enter_live_param_ecsource") : null;
        if (stringExtra == null) {
            stringExtra = t3;
        }
        b1Var2.f153437z = stringExtra;
        b1Var2.mo75633b(intent2);
        byte[] byteArrayExtra = intent2 != null ? intent2.getByteArrayExtra("KEY_ENTER_LIVE_PARAM_SQUARE_EXTRA_INFO") : null;
        if (byteArrayExtra != null) {
            C51938x81 x812 = new C51938x81();
            try {
                x812.parseFrom(byteArrayExtra);
            } catch (Exception e2) {
                Log.printDebugStack("safeParser", t3, e2);
            }
            b1Var2.f153434w = x812;
        }
        LiveConfig d7 = b1Var.mo75635d();
        if (d7 != null) {
            long j2 = d7.f157064e;
            C58730g5 g5Var = C58730g5.f168158a;
            String str4 = "RV_VISITOR_" + j2;
            C87412m.m108594g(str4, "id");
            ConcurrentHashMap<String, C58743k5> concurrentHashMap = C58730g5.f168162e;
            concurrentHashMap.clear();
            concurrentHashMap.put(str4, new C58743k5(C31543z5.m39451a(), 0, 0));
            C58730g5.m68220e(g5Var, str4, C58713e5.f168087o.f168101b, (C89349b) null, true, false, false, 52, (Object) null);
        }
        C65770a0.f189184r.mo89820b();
        C8478d0 d0Var = new C8478d0();
        C8479f0 f0Var = new C8479f0();
        f0Var.f27484d = str3;
        if (str3.length() == 0) {
            C60172g4 gr02 = ((C64916p1) C86312j.m106911c(C64916p1.class)).gr0(context2);
            if (!(gr02 == null || (v3 = gr02.mo12866v3()) == null)) {
                t3 = v3;
            }
            f0Var.f27484d = t3;
            Log.m105924i("Finder.LiveJumpChecker", "goVisitorUIWithCheck locContextId:" + ((String) f0Var.f27484d));
        }
        C8479f0 f0Var2 = new C8479f0();
        T string = context.getResources().getString(C0966R.string.f8028zq);
        C87412m.m108593f(string, "context.resources.getStr…mmui.R.string.app_i_know)");
        f0Var2.f27484d = string;
        C45795b.C32059a aVar2 = C45795b.f123697j;
        C45795b bVar = C45795b.f123698n;
        C54991o oVar = bVar != null ? (C54991o) bVar.mo71262a(C54991o.class) : null;
        Long valueOf = (oVar == null || (c212 = ((C55001u) oVar.business(C55001u.class)).f154420q) == null) ? null : Long.valueOf(c212.f182392d);
        Object[] objArr = new Object[2];
        objArr[0] = Boolean.valueOf(oVar != null);
        objArr[1] = Boolean.valueOf(valueOf == null || valueOf.longValue() != 0);
        Log.m105919d("Finder.LiveJumpChecker", "curLiveData is null:%s, %s", objArr);
        if (C11171e.m11046c(30) && oVar != null && (valueOf == null || valueOf.longValue() != 0)) {
            Activity activity = context2 instanceof Activity ? (Activity) context2 : null;
            if (C85875k4.m106199o0() && C85875k4.m106208w()) {
                Boolean valueOf2 = activity != null ? Boolean.valueOf(activity.isInMultiWindowMode()) : null;
                C87412m.m108591d(valueOf2);
                if (valueOf2.booleanValue()) {
                    if (intent2 != null) {
                        intent2.addFlags(4096);
                    }
                    C85861e4.m106122i(activity.getClass(), 0);
                    if (intent2 != null) {
                        intent2.addFlags(268435456);
                    }
                    if (intent2 != null) {
                        intent2.addFlags(32768);
                    }
                }
            }
        }
        C54781k2 k2Var = WeChatBrands.Business.Entries.SessionChannels.checkAvailable(context2) ? this : null;
        if (!(k2Var == null || (f = k2Var.mo75685f(new C0559e(context2, f0Var2, d0Var))) == null || (d = f.mo75683d(new C0560f(d0Var, context2))) == null || (g = d.mo75686g(new C0561g(d0Var, context2))) == null || (e = g.mo75684e(context2, false, new C54782h(b1Var, context, f0Var, intent, z, d0Var))) == null || (h = e.mo75687h(context2, new C0562i(d0Var, context2))) == null || (a = h.mo75680a(new C0563j(d0Var, context2))) == null || (b = a.mo75681b(false, C0558d.f1351d)) == null)) {
            if (aVar != null) {
                aVar.invoke();
            }
            b.mo75690l(context, b1Var, (String) f0Var.f27484d, str2, intent, z);
        }
        return d0Var.f27483d;
    }

    /* renamed from: j */
    public final void mo75689j(Context context, C54738b1 b1Var, String str, String str2, Intent intent) {
        ArrayList arrayList;
        ArrayList arrayList2;
        C64273c21 liveInfo;
        Context context2 = context;
        C54738b1 b1Var2 = b1Var;
        Class cls = C60200t1.class;
        Intent intent2 = intent == null ? new Intent() : intent;
        boolean z = context2 instanceof Activity;
        intent2.addFlags(268435456);
        C54738b1.f153409B.mo562d(intent2, b1Var);
        C49098d51 d512 = b1Var2.f153412a;
        Serializable serializable = null;
        intent2.putExtra("KEY_PARAMS_NOTICE", d512 != null ? d512.toByteArray() : null);
        C51333t21 t212 = b1Var2.f153413b;
        intent2.putExtra("KEY_PARAMS_LIVE_TASK_INFO", t212 != null ? t212.toByteArray() : null);
        if (!Util.isNullOrNil(str)) {
            ((C60200t1) C86312j.m106911c(cls)).mo76739CG(str, intent2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("gotoAnchorLive KEY_PARAMS_TAGIFNOS gotoAnchorLive ");
        LinkedList<C64848y91> linkedList = b1Var2.f153414c;
        sb.append(linkedList != null ? Integer.valueOf(linkedList.size()) : null);
        Log.m105924i("Finder.LiveJumpChecker", sb.toString());
        LinkedList<C64848y91> linkedList2 = b1Var2.f153414c;
        if (linkedList2 != null) {
            arrayList = new ArrayList(C36907w.m41090l(linkedList2, 10));
            for (C64848y91 byteArray : linkedList2) {
                arrayList.add(byteArray.toByteArray());
            }
        } else {
            arrayList = null;
        }
        intent2.putExtra("KEY_PARAMS_TAGIFNOS", arrayList instanceof Serializable ? arrayList : null);
        C64848y91 y912 = b1Var2.f153415d;
        intent2.putExtra("KEY_PARAMS_CHOSEN_TAG", y912 != null ? y912.toByteArray() : null);
        intent2.putExtra("key_click_tab_context_id", str2);
        LinkedList<C51745vv0> linkedList3 = b1Var2.f153416e;
        if (linkedList3 != null) {
            arrayList2 = new ArrayList(C36907w.m41090l(linkedList3, 10));
            for (C51745vv0 byteArray2 : linkedList3) {
                arrayList2.add(byteArray2.toByteArray());
            }
        } else {
            arrayList2 = null;
        }
        if (arrayList2 instanceof Serializable) {
            serializable = arrayList2;
        }
        intent2.putExtra("KEY_PARAMS_VISITOR_WHITE_LIST", serializable);
        intent2.putExtra("KEY_PARAMS_VISIBLE_ROOM_MAX_COUNT", b1Var2.f153417f);
        intent2.putExtra("KEY_PARAMS_VISIBLE_USER_MAX_COUNT", b1Var2.f153418g);
        intent2.putExtra("KEY_PARAMS_LUCKY_MONEY_CONFIG", b1Var2.f153419h);
        int intExtra = intent2.getIntExtra("KEY_PARAMS_SOURCE_TYPE", -1);
        Log.m105924i("Finder.LiveJumpChecker", "[gotoAnchorLive] config.secondaryDeviceFlag" + b1Var2.f153424m + ", sourceType:" + intExtra);
        if (intExtra == 5) {
            intent2.setClass(context, C62042e.f176370a.mo87053X(context));
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent2);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/model/FinderLiveJumpChecker", "gotoAnchorLive", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/model/FinderLiveBundle;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/plugin/finder/live/model/FinderLiveJumpChecker", "gotoAnchorLive", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/model/FinderLiveBundle;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        LiveConfig liveConfig = b1Var2.f153423l.get(0);
        if (liveConfig != null && b1Var2.f153424m == -1) {
            FinderItem e = C65834e.f189316a.mo89871e(liveConfig.f157075s);
            b1Var2.f153424m = (e == null || (liveInfo = e.getLiveInfo()) == null) ? -1 : liveInfo.f182356B;
        }
        if (b1Var2.f153424m != -1) {
            m61643k(b1Var, intent2, context);
            return;
        }
        LiveConfig liveConfig2 = b1Var2.f153423l.get(0);
        if (liveConfig2 != null) {
            ((C60200t1) C86312j.m106911c(cls)).mo76777Li(liveConfig2.f157075s, liveConfig2.f157080x, 0, false, true, "", new C54783k(b1Var, liveConfig2, intent2, context));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0127, code lost:
        if (((r0 == null || (r0 = r0.getIntent()) == null || !r0.getBooleanExtra("KEY_IS_FROM_FINDER_TASK", false)) ? false : true) != false) goto L_0x0129;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo75690l(android.content.Context r29, cj1.C54738b1 r30, java.lang.String r31, java.lang.String r32, android.content.Intent r33, boolean r34) {
        /*
            r28 = this;
            r11 = r29
            r12 = r30
            r13 = r32
            r14 = r33
            java.lang.Class<hr.t> r15 = p165hr.C60106t.class
            java.lang.Class<ht1.t1> r16 = ht1.C60200t1.class
            fj1.b$a r0 = fj1.C45795b.f123697j
            fj1.b r0 = fj1.C45795b.f123698n
            r10 = 0
            if (r0 == 0) goto L_0x001d
            java.lang.Class<cl1.o> r1 = cl1.C54991o.class
            androidx.lifecycle.i0 r0 = r0.mo71262a(r1)
            cl1.o r0 = (cl1.C54991o) r0
            r9 = r0
            goto L_0x001e
        L_0x001d:
            r9 = r10
        L_0x001e:
            r8 = 0
            if (r14 == 0) goto L_0x0028
            java.lang.String r0 = "KEY_PARAMS_NOT_KEEP_CUR_LIVE"
            boolean r0 = r14.getBooleanExtra(r0, r8)
            goto L_0x0029
        L_0x0028:
            r0 = 0
        L_0x0029:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r7 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            boolean r1 = r7.mo77640n()
            java.util.ArrayList<com.tencent.mm.live.api.LiveConfig> r2 = r12.f153423l
            int r3 = r12.f153420i
            java.lang.Object r2 = sx3.C110818d0.m150917O(r2, r3)
            com.tencent.mm.live.api.LiveConfig r2 = (com.tencent.p014mm.live.api.LiveConfig) r2
            if (r2 == 0) goto L_0x0042
            long r2 = r2.f157064e
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            goto L_0x0043
        L_0x0042:
            r2 = r10
        L_0x0043:
            if (r9 == 0) goto L_0x0059
            java.lang.Class<cl1.u> r3 = cl1.C55001u.class
            androidx.lifecycle.i0 r3 = r9.business(r3)
            cl1.u r3 = (cl1.C55001u) r3
            te3.c21 r3 = r3.f154420q
            if (r3 == 0) goto L_0x0059
            long r3 = r3.f182392d
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r6 = r3
            goto L_0x005a
        L_0x0059:
            r6 = r10
        L_0x005a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "gotoVisitLive curLiveData: "
            r3.append(r4)
            r3.append(r9)
            java.lang.String r4 = " curConfigLiveId: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r4 = " lastLiveId: "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r4 = " notKeepCurLive: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r4 = " uiFinished: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            java.lang.String r5 = "Finder.LiveJumpChecker"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r3)
            r3 = 3
            if (r9 == 0) goto L_0x00a1
            boolean r2 = gy3.C87412m.m108589b(r6, r2)
            if (r2 != 0) goto L_0x00a1
            if (r0 != 0) goto L_0x009d
            if (r1 != 0) goto L_0x00a1
        L_0x009d:
            com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.m63768J(r7, r8, r10, r3, r10)
            goto L_0x00bc
        L_0x00a1:
            java.lang.Class<pn.e> r0 = p646pn.C110234e.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            pn.e r0 = (p646pn.C110234e) r0
            xv0.e r0 = r0.mo161399pY()
            if (r0 == 0) goto L_0x00b2
            r0.mo149144t()
        L_0x00b2:
            r7.getClass()
            j50.a r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159378f
            if (r0 == 0) goto L_0x00bc
            r0.mo85683a0()
        L_0x00bc:
            if (r14 != 0) goto L_0x00c5
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            r4 = r0
            goto L_0x00c6
        L_0x00c5:
            r4 = r14
        L_0x00c6:
            boolean r0 = r11 instanceof android.app.Activity
            if (r0 != 0) goto L_0x00cc
            r2 = r4
            goto L_0x00cd
        L_0x00cc:
            r2 = r10
        L_0x00cd:
            if (r2 == 0) goto L_0x00d4
            r3 = 335544320(0x14000000, float:6.4623485E-27)
            r2.addFlags(r3)
        L_0x00d4:
            java.lang.Class<ht1.t3> r2 = ht1.C60204t3.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            ht1.t3 r2 = (ht1.C60204t3) r2
            boolean r2 = r2.Kv0(r11)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r10 = "gotoVisitLive: isFinderTaskForeground = "
            r3.append(r10)
            r3.append(r2)
            java.lang.String r10 = " uiFinished:"
            r3.append(r10)
            r3.append(r1)
            java.lang.String r1 = " isAppForeground: "
            r3.append(r1)
            com.tencent.mm.app.AppForegroundDelegate r1 = com.tencent.p014mm.app.AppForegroundDelegate.INSTANCE
            boolean r1 = r1.f343454n
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.Object[] r3 = new java.lang.Object[r8]
            com.tencent.p014mm.sdk.platformtools.Log.printInfoStack(r5, r1, r3)
            java.lang.String r1 = "KEY_IS_FROM_FINDER_TASK"
            r10 = 1
            if (r2 != 0) goto L_0x0129
            if (r0 == 0) goto L_0x0115
            r0 = r11
            android.app.Activity r0 = (android.app.Activity) r0
            goto L_0x0116
        L_0x0115:
            r0 = 0
        L_0x0116:
            if (r0 == 0) goto L_0x0126
            android.content.Intent r0 = r0.getIntent()
            if (r0 == 0) goto L_0x0126
            boolean r0 = r0.getBooleanExtra(r1, r8)
            if (r0 != r10) goto L_0x0126
            r0 = 1
            goto L_0x0127
        L_0x0126:
            r0 = 0
        L_0x0127:
            if (r0 == 0) goto L_0x012c
        L_0x0129:
            r4.putExtra(r1, r10)
        L_0x012c:
            java.lang.Class<tf0.p1> r0 = tf0.C64916p1.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            java.lang.String r1 = "getService(IFinderCommon…atureService::class.java)"
            gy3.C87412m.m108593f(r0, r1)
            tf0.p1 r0 = (tf0.C64916p1) r0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 11
            r23 = 0
            r24 = 64
            r25 = 0
            r1 = r29
            r2 = r4
            r26 = r4
            r3 = r18
            r27 = r5
            r5 = r20
            r17 = r6
            r6 = r21
            r18 = r7
            r7 = r22
            r8 = r23
            r19 = r9
            r9 = r24
            r14 = 0
            r10 = r25
            tf0.C64916p1.C64917a.m76443j(r0, r1, r2, r3, r5, r6, r7, r8, r9, r10)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r31)
            if (r0 != 0) goto L_0x017a
            di3.d r0 = di3.C86312j.m106911c(r16)
            ht1.t1 r0 = (ht1.C60200t1) r0
            r1 = r31
            r8 = r26
            r0.mo76739CG(r1, r8)
            goto L_0x017c
        L_0x017a:
            r8 = r26
        L_0x017c:
            if (r13 == 0) goto L_0x0187
            int r0 = r32.length()
            if (r0 != 0) goto L_0x0185
            goto L_0x0187
        L_0x0185:
            r0 = 0
            goto L_0x0188
        L_0x0187:
            r0 = 1
        L_0x0188:
            if (r0 != 0) goto L_0x018f
            java.lang.String r0 = "key_click_tab_context_id"
            r8.putExtra(r0, r13)
        L_0x018f:
            int r0 = r12.f153422k
            if (r0 == 0) goto L_0x0198
            java.lang.String r1 = "key_from_comment_scene"
            r8.putExtra(r1, r0)
        L_0x0198:
            ok1.e r0 = ok1.C62042e.f176370a
            java.lang.Class r0 = r0.mo87062a0(r11)
            r18.getClass()
            com.tencent.mm.plugin.finder.live.view.b r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159379g
            if (r1 == 0) goto L_0x01bb
            android.content.Context r1 = r1.getContext()
            java.lang.Class r1 = r1.getClass()
            boolean r1 = gy3.C87412m.m108589b(r1, r0)
            if (r1 != 0) goto L_0x01bb
            r1 = r18
            r2 = 3
            r9 = 0
            com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.m63768J(r1, r9, r14, r2, r14)
            goto L_0x01bc
        L_0x01bb:
            r9 = 0
        L_0x01bc:
            di3.d r1 = di3.C86312j.m106911c(r15)
            hr.t r1 = (p165hr.C60106t) r1
            hg1.i r1 = r1.Cx0()
            ik1.n r1 = (ik1.C33354n) r1
            com.tencent.mm.sdk.platformtools.LruCache<java.lang.Long, java.lang.Integer> r2 = r1.f90402f
            java.util.Set r2 = r2.entrySet()
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0200
            com.tencent.mm.sdk.storage.ISQLiteDatabase r3 = r1.f90401e
            r4 = 2
            java.lang.String r5 = "SELECT * FROM FinderLiveVideoDefinitionInfo"
            android.database.Cursor r3 = r3.rawQuery(r5, r14, r4)
        L_0x01dd:
            boolean r4 = r3.moveToNext()
            if (r4 == 0) goto L_0x01fd
            ig1.i r4 = new ig1.i
            r4.<init>()
            r4.convertFrom(r3)
            com.tencent.mm.sdk.platformtools.LruCache<java.lang.Long, java.lang.Integer> r5 = r1.f90402f
            long r6 = r4.field_liveId
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            int r4 = r4.field_definition
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5.put(r6, r4)
            goto L_0x01dd
        L_0x01fd:
            r3.close()
        L_0x0200:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "initDefinition: "
            r3.append(r4)
            java.lang.String r4 = eb0.C75592q0.m90789s()
            r3.append(r4)
            java.lang.String r4 = ", isEmpty:"
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = ", cache size:"
            r3.append(r2)
            com.tencent.mm.sdk.platformtools.LruCache<java.lang.Long, java.lang.Integer> r1 = r1.f90402f
            int r1 = r1.size()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r2 = "FinderLiveVideoDefinitionStorage"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            di3.d r1 = di3.C86312j.m106911c(r15)
            hr.t r1 = (p165hr.C60106t) r1
            hg1.b r1 = r1.yx0()
            r1.mo9437Lo()
            r8.setClass(r11, r0)
            r6 = 0
            if (r19 == 0) goto L_0x024e
            if (r17 == 0) goto L_0x024e
            long r0 = r17.longValue()
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x0258
        L_0x024e:
            java.lang.Class<com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorWithoutAffinityUI> r0 = com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveVisitorWithoutAffinityUI.class
            com.tencent.p014mm.p136ui.C85861e4.m106117d(r0, r9)
            java.lang.Class<com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorAffinityUI> r0 = com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveVisitorAffinityUI.class
            com.tencent.p014mm.p136ui.C85861e4.m106117d(r0, r9)
        L_0x0258:
            cj1.n4$a r0 = cj1.C0576n4.f1379b
            r1 = r33
            r10 = r14
            cj1.n4 r2 = r0.mo598a(r1)
            if (r2 != 0) goto L_0x0268
            cj1.n4 r2 = new cj1.n4
            r2.<init>()
        L_0x0268:
            te3.wp2 r3 = r2.f1381a
            if (r3 != 0) goto L_0x0273
            te3.wp2 r3 = new te3.wp2
            r3.<init>()
            r2.f1381a = r3
        L_0x0273:
            bk1.a r3 = bk1.C54487a.f152770a
            boolean r4 = r3.mo75312b(r11, r2)
            if (r4 == 0) goto L_0x0283
            boolean r3 = r3.mo75311a(r2)
            if (r3 != 0) goto L_0x0283
            r3 = 1
            goto L_0x0284
        L_0x0283:
            r3 = 0
        L_0x0284:
            cj1.b1$a r4 = cj1.C54738b1.f153409B
            r4.mo562d(r8, r12)
            r0.mo599b(r1, r2)
            if (r3 == 0) goto L_0x02d9
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "KEY_ENTER_LIVE_PARAM_INTENT_DATA"
            r0.putExtra(r1, r8)
            java.lang.String r1 = "Chat_Msg_Id"
            long r2 = r8.getLongExtra(r1, r6)
            r0.putExtra(r1, r2)
            java.lang.String r1 = "key_context_id"
            java.lang.String r1 = r8.getStringExtra(r1)
            if (r1 == 0) goto L_0x02cd
            di3.d r2 = di3.C86312j.m106911c(r16)
            ht1.t1 r2 = (ht1.C60200t1) r2
            rx3.o r1 = r2.mo76734AX(r1)
            A r2 = r1.f38557d
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.String r3 = "key_enter_scene"
            r0.putExtra(r3, r2)
            B r1 = r1.f38558e
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.String r2 = "key_card_type"
            r0.putExtra(r2, r1)
        L_0x02cd:
            java.lang.Class<ea.d> r1 = p147ea.C7606d.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            ea.d r1 = (p147ea.C7606d) r1
            r1.mo8741aa(r11, r0)
            goto L_0x0314
        L_0x02d9:
            k20.a r12 = new k20.a
            r12.<init>()
            r12.mo10233c(r8)
            java.lang.Object[] r1 = r12.mo10232b()
            java.lang.String r2 = "com/tencent/mm/plugin/finder/live/model/FinderLiveJumpChecker"
            java.lang.String r3 = "gotoVisitLive"
            java.lang.String r4 = "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/model/FinderLiveBundle;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;Z)V"
            java.lang.String r5 = "Undefined"
            java.lang.String r13 = "startActivity"
            java.lang.String r14 = "(Landroid/content/Intent;)V"
            r0 = r29
            r6 = r13
            r7 = r14
            j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r0 = r12.mo10231a(r9)
            android.content.Intent r0 = (android.content.Intent) r0
            r11.startActivity(r0)
            java.lang.String r1 = "com/tencent/mm/plugin/finder/live/model/FinderLiveJumpChecker"
            java.lang.String r2 = "gotoVisitLive"
            java.lang.String r3 = "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/model/FinderLiveBundle;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;Z)V"
            java.lang.String r4 = "Undefined"
            java.lang.String r5 = "startActivity"
            java.lang.String r6 = "(Landroid/content/Intent;)V"
            r0 = r29
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
        L_0x0314:
            java.lang.String r0 = "CURRENT_FEED_ID"
            r1 = 0
            long r3 = r8.getLongExtra(r0, r1)
            java.lang.String r0 = "LAUNCH_WITH_ANIM"
            boolean r0 = r8.getBooleanExtra(r0, r9)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "checkFluentEnterCountDown feedId: "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r6 = " isLaunchWithFluentAnimate: "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r6 = r27
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
            if (r0 == 0) goto L_0x0397
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0397
            ph1.i r0 = ph1.C62293i.f177081a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "startEnterLiveCountDown feedId: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FinderFluentSwitchManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            java.util.HashMap<java.lang.Long, a14.z1> r0 = ph1.C62293i.f177082b
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L_0x037d
            java.util.HashMap<java.lang.Long, a14.z1> r0 = ph1.C62293i.f177082b
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            java.lang.Object r0 = r0.get(r1)
            a14.z1 r0 = (a14.C53973z1) r0
            if (r0 == 0) goto L_0x037d
            r1 = 1
            a14.C53973z1.C53974a.m60623a(r0, r10, r1, r10)
        L_0x037d:
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            java.util.HashMap<java.lang.Long, a14.z1> r1 = ph1.C62293i.f177082b
            a14.s1 r12 = a14.C0001s1.f0d
            r13 = 0
            r14 = 0
            ph1.h r15 = new ph1.h
            r15.<init>(r3, r10)
            r16 = 3
            r17 = 0
            a14.z1 r2 = a14.C53895h.m60466d(r12, r13, r14, r15, r16, r17)
            r1.put(r0, r2)
        L_0x0397:
            if (r34 != 0) goto L_0x03a8
            boolean r0 = r11 instanceof android.app.Activity
            if (r0 == 0) goto L_0x03a0
            r10 = r11
            android.app.Activity r10 = (android.app.Activity) r10
        L_0x03a0:
            if (r10 == 0) goto L_0x03a8
            r0 = 2130771992(0x7f010018, float:1.714709E38)
            r10.overridePendingTransition(r0, r0)
        L_0x03a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cj1.C54781k2.mo75690l(android.content.Context, cj1.b1, java.lang.String, java.lang.String, android.content.Intent, boolean):void");
    }
}
