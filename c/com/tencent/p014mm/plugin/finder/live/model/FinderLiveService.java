package com.tencent.p014mm.plugin.finder.live.model;

import al1.C54129i;
import al1.C54130j;
import al1.C54131l;
import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.lifecycle.C39622i0;
import b50.C54405b;
import b50.C54408d;
import b50.C54410e;
import b50.C54412f;
import c30.C104289g;
import c50.C54655b;
import cj1.C28574j6;
import cj1.C28594w5;
import cj1.C54733a1;
import cj1.C54738b1;
import cj1.C54747d5;
import cj1.C54749e2;
import cj1.C54754f;
import cj1.C54766h4;
import cj1.C54768h6;
import cj1.C54769i;
import cj1.C54775j1;
import cj1.C54794n1;
import cj1.C54795n5;
import cj1.C54806r1;
import cj1.C54819s4;
import cj1.C54842v4;
import cj1.C54844w4;
import cj1.C54847z3;
import cl1.C39981t0;
import cl1.C54963d0;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.liteav.audio.TXAudioEffectManager;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.VoipEvent;
import com.tencent.p014mm.live.core.view.LivePreviewView;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import com.tencent.p014mm.plugin.finder.live.infrastructure.livedata.LiveMutableData;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.plugin.finder.live.view.C56072j1;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveMiniView;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.trtc.TRTCCloudDef;
import d50.C58107a;
import d50.C58112f;
import d50.C58113g;
import d50.C58114h;
import d50.C58115i;
import d50.C7170j;
import d60.C58124b;
import di3.C86312j;
import dj1.C45389s0;
import dj1.C58276c;
import dj1.C58284o;
import dj1.C58289v0;
import er1.C58704c5;
import er1.C58713e5;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32230s;
import fy3.C32231t;
import gg1.C32444a;
import gh1.C59447j;
import gi1.C59464c;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import hj1.C32931b;
import hj1.C59918a;
import i50.C60251a;
import il1.C60557z1;
import iq3.C60600b;
import is3.C60622a;
import j50.C60735a;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import k50.C60971a;
import lu3.C34379c;
import nc3.C34767b;
import nj3.C76912y0;
import o40.C61926c;
import ok1.C62042e;
import org.json.JSONObject;
import p156gj.C87203t;
import p50.C62197e;
import p682rz.C36594q;
import pe3.C47465a;
import pe3.C89349b;
import qj1.C62987t2;
import r50.C63363c;
import r50.C63367f;
import r50.C63369g;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import s50.C110747k;
import s50.C36624a;
import s50.C63699b;
import s50.C63713p;
import te3.C49291ej0;
import te3.C49712hj1;
import te3.C51239sg1;
import te3.C51922x41;
import te3.C52151yp2;
import te3.C52153yq0;
import te3.C64265bq2;
import te3.C64293cq2;
import te3.C64414h71;
import te3.C64510l21;
import te3.C64733to;
import te3.C64785vw2;
import te3.C64890zp2;
import te3.nr4;
import uk1.C65402a;
import uk1.C65408e;
import uk1.C65409j;
import vo1.C65770a0;
import w50.C65929d;
import wg1.C66089v;
import wx3.C15601d;
import y50.C66514h;
import y50.C66521k0;
import yx3.C66704d;
import yx3.C91590f;
import z04.C112550d0;
import zc1.C66785b;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.finder.live.model.FinderLiveService */
public final class FinderLiveService implements C54410e, TXAudioEffectManager.TXMusicPlayObserver {

    /* renamed from: A */
    public static C45795b f159348A;

    /* renamed from: B */
    public static LiveRoomControllerStore f159349B;

    /* renamed from: C */
    public static int f159350C = 1000;

    /* renamed from: D */
    public static long f159351D;

    /* renamed from: E */
    public static long f159352E;

    /* renamed from: F */
    public static C89349b f159353F;

    /* renamed from: G */
    public static int f159354G = -1;

    /* renamed from: H */
    public static int f159355H = -1;

    /* renamed from: I */
    public static boolean f159356I = (C32444a.f86086O0.mo60266n().intValue() == 0);

    /* renamed from: J */
    public static final boolean f159357J = (C32444a.f86089P0.mo60266n().intValue() == 0);

    /* renamed from: K */
    public static final boolean f159358K = (C32444a.f86135d1.mo60266n().intValue() == 0);

    /* renamed from: L */
    public static final boolean f159359L = (C32444a.f86179o1.mo60266n().intValue() == 0);

    /* renamed from: M */
    public static C55919a f159360M;

    /* renamed from: N */
    public static C55920b f159361N;

    /* renamed from: P */
    public static boolean f159362P;

    /* renamed from: Q */
    public static C66089v f159363Q;

    /* renamed from: Q0 */
    public static C28574j6 f159364Q0;

    /* renamed from: R */
    public static boolean f159365R;

    /* renamed from: R0 */
    public static int f159366R0;

    /* renamed from: S */
    public static final IListener<VoipEvent> f159367S;

    /* renamed from: S0 */
    public static final long f159368S0 = 1;

    /* renamed from: T */
    public static final IListener<?> f159369T;

    /* renamed from: U */
    public static final C13601g f159370U = C36568h.m40985a(C55926l.f159405d);

    /* renamed from: V */
    public static final Runnable f159371V = C55922g.f159402d;

    /* renamed from: W */
    public static final Runnable f159372W = C55923i.f159403d;

    /* renamed from: X */
    public static HashMap<String, C32931b> f159373X = new HashMap<>();

    /* renamed from: Y */
    public static final Runnable f159374Y = C55929o.f159411d;

    /* renamed from: Z */
    public static final Runnable f159375Z = C55921f.f159401d;

    /* renamed from: d */
    public static final FinderLiveService f159376d = new FinderLiveService();

    /* renamed from: e */
    public static final long f159377e = SystemClock.elapsedRealtime();

    /* renamed from: f */
    public static C60735a f159378f;

    /* renamed from: g */
    public static C56032b f159379g;

    /* renamed from: h */
    public static boolean f159380h;

    /* renamed from: i */
    public static C65402a f159381i = new C65402a();

    /* renamed from: j */
    public static C54806r1 f159382j = new C54806r1();

    /* renamed from: n */
    public static final C54847z3 f159383n = new C54847z3();

    /* renamed from: o */
    public static C54769i f159384o;

    /* renamed from: p */
    public static C56072j1 f159385p;

    /* renamed from: p0 */
    public static C28574j6 f159386p0;

    /* renamed from: q */
    public static String f159387q = "";

    /* renamed from: r */
    public static C34767b.C34768c f159388r;

    /* renamed from: s */
    public static int f159389s = 40;

    /* renamed from: t */
    public static C36624a f159390t;

    /* renamed from: u */
    public static C60557z1.C60565f f159391u = new C60557z1.C60565f(C60557z1.f172604i, "");

    /* renamed from: v */
    public static long f159392v;

    /* renamed from: w */
    public static C63699b f159393w;

    /* renamed from: x */
    public static HashMap<Integer, C65929d.C65930a> f159394x = new HashMap<>();

    /* renamed from: x0 */
    public static C28574j6 f159395x0;

    /* renamed from: y */
    public static C54795n5 f159396y;

    /* renamed from: y0 */
    public static C28574j6 f159397y0;

    /* renamed from: z */
    public static C54129i f159398z;

    /* renamed from: com.tencent.mm.plugin.finder.live.model.FinderLiveService$j */
    public static final class C3156j extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C3156j f15088d = new C3156j();

        public C3156j() {
            super(0);
        }

        public Object invoke() {
            C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) MMApplicationContext.getContext().getResources().getString(C0966R.string.f360531dg1), 0).show();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.model.FinderLiveService$c */
    public static final class C29960c implements Runnable {

        /* renamed from: d */
        public long f81121d;

        /* renamed from: com.tencent.mm.plugin.finder.live.model.FinderLiveService$c$a */
        public static final class C29961a extends C87413o implements C32224a<String> {

            /* renamed from: d */
            public final /* synthetic */ long f81122d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C29961a(long j) {
                super(0);
                this.f81122d = j;
            }

            public Object invoke() {
                StringBuilder sb = new StringBuilder();
                sb.append("liveId:");
                sb.append(this.f81122d);
                sb.append(", looperIsFinished:");
                C28574j6 j6Var = FinderLiveService.f159386p0;
                sb.append(j6Var != null ? Boolean.valueOf(j6Var.f78440b) : null);
                return sb.toString();
            }
        }

        public C29960c(long j) {
            this.f81121d = j;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0012, code lost:
            r3 = r3.f154420q;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r18 = this;
                r0 = r18
                java.lang.Class<cl1.o> r1 = cl1.C54991o.class
                com.tencent.mm.plugin.finder.live.model.FinderLiveService r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
                java.lang.Class<cl1.u> r3 = cl1.C55001u.class
                androidx.lifecycle.i0 r3 = r2.mo77630e(r3)
                cl1.u r3 = (cl1.C55001u) r3
                r4 = 0
                if (r3 == 0) goto L_0x0019
                te3.c21 r3 = r3.f154420q
                if (r3 == 0) goto L_0x0019
                long r6 = r3.f182392d
                goto L_0x001a
            L_0x0019:
                r6 = r4
            L_0x001a:
                r2.getClass()
                fj1.b r3 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159348A
                java.lang.String r8 = "Finder.FinderLiveService"
                if (r3 == 0) goto L_0x006a
                androidx.lifecycle.i0 r3 = r2.mo77630e(r1)
                cl1.o r3 = (cl1.C54991o) r3
                r9 = 1
                r10 = 0
                if (r3 == 0) goto L_0x0034
                boolean r3 = r3.mo75997d4()
                if (r3 != r9) goto L_0x0034
                goto L_0x0035
            L_0x0034:
                r9 = 0
            L_0x0035:
                if (r9 != 0) goto L_0x006a
                long r9 = r0.f81121d
                int r3 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
                if (r3 == 0) goto L_0x003e
                goto L_0x006a
            L_0x003e:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "heartBeat manual recovery liveId:"
                r1.append(r3)
                r1.append(r6)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
                ft1.a r9 = ft1.C59319a.f169618b
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                com.tencent.mm.plugin.finder.live.model.FinderLiveService$c$a r15 = new com.tencent.mm.plugin.finder.live.model.FinderLiveService$c$a
                r15.<init>(r6)
                r16 = 28
                r17 = 0
                java.lang.String r10 = "liveHeartBeatBreak_manualRecovery"
                o40.C11348f.C11349a.m11178b(r9, r10, r11, r12, r13, r14, r15, r16, r17)
                r2.mo77639m(r4, r6)
                goto L_0x00af
            L_0x006a:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "heartBeat manual recovery skipped. curLiveRoomData:"
                r3.append(r4)
                r2.getClass()
                fj1.b r4 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159348A
                r3.append(r4)
                java.lang.String r4 = " business(LiveCommonSlice::class.java)?.isLiveFinish():"
                r3.append(r4)
                androidx.lifecycle.i0 r1 = r2.mo77630e(r1)
                cl1.o r1 = (cl1.C54991o) r1
                if (r1 == 0) goto L_0x0092
                boolean r1 = r1.mo75997d4()
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                goto L_0x0093
            L_0x0092:
                r1 = 0
            L_0x0093:
                r3.append(r1)
                java.lang.String r1 = " liveId:"
                r3.append(r1)
                r3.append(r6)
                java.lang.String r1 = " bindLiveId:"
                r3.append(r1)
                long r1 = r0.f81121d
                r3.append(r1)
                java.lang.String r1 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
            L_0x00af:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.C29960c.run():void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.model.FinderLiveService$d */
    public static final class C29962d implements Runnable {

        /* renamed from: d */
        public long f81123d;

        /* renamed from: com.tencent.mm.plugin.finder.live.model.FinderLiveService$d$a */
        public static final class C29963a extends C87413o implements C32224a<String> {

            /* renamed from: d */
            public final /* synthetic */ long f81124d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C29963a(long j) {
                super(0);
                this.f81124d = j;
            }

            public Object invoke() {
                StringBuilder sb = new StringBuilder();
                sb.append("liveId:");
                sb.append(this.f81124d);
                sb.append(", looperIsFinished:");
                C28574j6 j6Var = FinderLiveService.f159395x0;
                sb.append(j6Var != null ? Boolean.valueOf(j6Var.f78440b) : null);
                return sb.toString();
            }
        }

        public C29962d(long j) {
            this.f81123d = j;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0012, code lost:
            r3 = r3.f154420q;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r18 = this;
                r0 = r18
                java.lang.Class<cl1.o> r1 = cl1.C54991o.class
                com.tencent.mm.plugin.finder.live.model.FinderLiveService r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
                java.lang.Class<cl1.u> r3 = cl1.C55001u.class
                androidx.lifecycle.i0 r3 = r2.mo77630e(r3)
                cl1.u r3 = (cl1.C55001u) r3
                r4 = 0
                if (r3 == 0) goto L_0x0019
                te3.c21 r3 = r3.f154420q
                if (r3 == 0) goto L_0x0019
                long r6 = r3.f182392d
                goto L_0x001a
            L_0x0019:
                r6 = r4
            L_0x001a:
                r2.getClass()
                fj1.b r3 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159348A
                java.lang.String r8 = "Finder.FinderLiveService"
                if (r3 == 0) goto L_0x006a
                androidx.lifecycle.i0 r3 = r2.mo77630e(r1)
                cl1.o r3 = (cl1.C54991o) r3
                r9 = 1
                r10 = 0
                if (r3 == 0) goto L_0x0034
                boolean r3 = r3.mo75997d4()
                if (r3 != r9) goto L_0x0034
                goto L_0x0035
            L_0x0034:
                r9 = 0
            L_0x0035:
                if (r9 != 0) goto L_0x006a
                long r9 = r0.f81123d
                int r3 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
                if (r3 == 0) goto L_0x003e
                goto L_0x006a
            L_0x003e:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "keepAlive manual recovery liveId:"
                r1.append(r3)
                r1.append(r6)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
                ft1.a r9 = ft1.C59319a.f169618b
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                com.tencent.mm.plugin.finder.live.model.FinderLiveService$d$a r15 = new com.tencent.mm.plugin.finder.live.model.FinderLiveService$d$a
                r15.<init>(r6)
                r16 = 28
                r17 = 0
                java.lang.String r10 = "liveKeepAliveBreak_manualRecovery"
                o40.C11348f.C11349a.m11178b(r9, r10, r11, r12, r13, r14, r15, r16, r17)
                r2.mo77645s(r4)
                goto L_0x00af
            L_0x006a:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "keepAlive manual recovery skipped. curLiveRoomData:"
                r3.append(r4)
                r2.getClass()
                fj1.b r4 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159348A
                r3.append(r4)
                java.lang.String r4 = " business(LiveCommonSlice::class.java)?.isLiveFinish():"
                r3.append(r4)
                androidx.lifecycle.i0 r1 = r2.mo77630e(r1)
                cl1.o r1 = (cl1.C54991o) r1
                if (r1 == 0) goto L_0x0092
                boolean r1 = r1.mo75997d4()
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                goto L_0x0093
            L_0x0092:
                r1 = 0
            L_0x0093:
                r3.append(r1)
                java.lang.String r1 = " liveId:"
                r3.append(r1)
                r3.append(r6)
                java.lang.String r1 = " bindLiveId:"
                r3.append(r1)
                long r1 = r0.f81123d
                r3.append(r1)
                java.lang.String r1 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
            L_0x00af:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.C29962d.run():void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.model.FinderLiveService$e */
    public static final class C29964e {

        /* renamed from: a */
        public int f81125a;

        /* renamed from: b */
        public int f81126b;

        /* renamed from: c */
        public int f81127c;

        /* renamed from: d */
        public int f81128d;

        public C29964e(int i, int i2, int i3, int i4) {
            this.f81125a = i;
            this.f81126b = i2;
            this.f81127c = i3;
            this.f81128d = i4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C29964e)) {
                return false;
            }
            C29964e eVar = (C29964e) obj;
            return this.f81125a == eVar.f81125a && this.f81126b == eVar.f81126b && this.f81127c == eVar.f81127c && this.f81128d == eVar.f81128d;
        }

        public int hashCode() {
            return (((((this.f81125a * 31) + this.f81126b) * 31) + this.f81127c) * 31) + this.f81128d;
        }

        public String toString() {
            return "VideoQuality(encResEnum=" + this.f81125a + ", capFps=" + this.f81126b + ", encBR=" + this.f81127c + ", encBRMin=" + this.f81128d + ')';
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.model.FinderLiveService$h */
    public static final class C29965h extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ long f81129d;

        /* renamed from: e */
        public final /* synthetic */ long f81130e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29965h(long j, long j2) {
            super(0);
            this.f81129d = j;
            this.f81130e = j2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x002a, code lost:
            r3 = r3.f154420q;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r7 = this;
                java.lang.Class<cl1.u> r0 = cl1.C55001u.class
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "heartBeat liveId:"
                r1.append(r2)
                long r2 = r7.f81129d
                r1.append(r2)
                java.lang.String r2 = " delay:"
                r1.append(r2)
                long r2 = r7.f81130e
                r1.append(r2)
                java.lang.String r2 = " curLive:"
                r1.append(r2)
                com.tencent.mm.plugin.finder.live.model.FinderLiveService r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
                androidx.lifecycle.i0 r3 = r2.mo77630e(r0)
                cl1.u r3 = (cl1.C55001u) r3
                if (r3 == 0) goto L_0x0035
                te3.c21 r3 = r3.f154420q
                if (r3 == 0) goto L_0x0035
                long r3 = r3.f182392d
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
                goto L_0x0036
            L_0x0035:
                r3 = 0
            L_0x0036:
                r1.append(r3)
                java.lang.String r3 = " liveId:"
                r1.append(r3)
                long r3 = r7.f81129d
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                java.lang.String r3 = "Finder.FinderLiveService"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
                long r3 = r7.f81129d
                r5 = 0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 <= 0) goto L_0x0079
                androidx.lifecycle.i0 r0 = r2.mo77630e(r0)
                cl1.u r0 = (cl1.C55001u) r0
                r1 = 0
                if (r0 == 0) goto L_0x006a
                te3.c21 r0 = r0.f154420q
                if (r0 == 0) goto L_0x006a
                long r2 = r0.f182392d
                long r4 = r7.f81129d
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 != 0) goto L_0x006a
                r1 = 1
            L_0x006a:
                if (r1 == 0) goto L_0x0079
                cj1.j6 r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159386p0
                if (r0 == 0) goto L_0x0079
                long r1 = r7.f81130e
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r0.mo56067c(r1)
            L_0x0079:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.C29965h.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.model.FinderLiveService$a */
    public static final class C55919a implements Runnable {

        /* renamed from: d */
        public String f159399d;

        public C55919a(String str) {
            this.f159399d = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x000f, code lost:
            r3 = r3.f154051E;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r5 = this;
                java.lang.Class<cl1.d0> r0 = cl1.C54963d0.class
                java.lang.String r1 = r5.f159399d
                com.tencent.mm.plugin.finder.live.model.FinderLiveService r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
                androidx.lifecycle.i0 r3 = r2.mo77630e(r0)
                cl1.d0 r3 = (cl1.C54963d0) r3
                r4 = 0
                if (r3 == 0) goto L_0x0016
                cj1.a1 r3 = r3.f154051E
                if (r3 == 0) goto L_0x0016
                java.lang.String r3 = r3.f153388a
                goto L_0x0017
            L_0x0016:
                r3 = r4
            L_0x0017:
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r1, (java.lang.String) r3)
                if (r1 == 0) goto L_0x002f
                y50.h r1 = y50.C66521k0.f191361a
                if (r1 == 0) goto L_0x0024
                r1.onBattleDismiss()
            L_0x0024:
                androidx.lifecycle.i0 r0 = r2.mo77630e(r0)
                cl1.d0 r0 = (cl1.C54963d0) r0
                if (r0 != 0) goto L_0x002d
                goto L_0x002f
            L_0x002d:
                r0.f154051E = r4
            L_0x002f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.C55919a.run():void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.model.FinderLiveService$b */
    public static final class C55920b implements Runnable {

        /* renamed from: d */
        public String f159400d;

        public C55920b(String str) {
            C87412m.m108594g(str, "battleId");
            this.f159400d = str;
        }

        public void run() {
            C54733a1 a1Var;
            C54733a1 a1Var2;
            C54733a1 a1Var3;
            Class cls = C54991o.class;
            Class cls2 = C54963d0.class;
            StringBuilder sb = new StringBuilder();
            sb.append("bindBattleId:");
            sb.append(this.f159400d);
            sb.append(", curBattle:");
            FinderLiveService finderLiveService = FinderLiveService.f159376d;
            C54963d0 d0Var = (C54963d0) finderLiveService.mo77630e(cls2);
            String str = null;
            sb.append(d0Var != null ? d0Var.f154051E : null);
            sb.append(", liveStart:");
            C54991o oVar = (C54991o) finderLiveService.mo77630e(cls);
            sb.append(oVar != null ? Boolean.valueOf(oVar.mo75999e4()) : null);
            Log.m105924i("Finder.FinderLiveService", sb.toString());
            String str2 = this.f159400d;
            C54963d0 d0Var2 = (C54963d0) finderLiveService.mo77630e(cls2);
            if (!(d0Var2 == null || (a1Var3 = d0Var2.f154051E) == null)) {
                str = a1Var3.f153388a;
            }
            if (C87412m.m108589b(str2, str)) {
                C54991o oVar2 = (C54991o) finderLiveService.mo77630e(cls);
                boolean z = false;
                if (oVar2 != null && oVar2.mo75999e4()) {
                    C54963d0 d0Var3 = (C54963d0) finderLiveService.mo77630e(cls2);
                    if (!(d0Var3 == null || (a1Var2 = d0Var3.f154051E) == null)) {
                        if (a1Var2.f153392e == 4) {
                            z = true;
                        }
                    }
                    if (z) {
                        C54963d0 d0Var4 = (C54963d0) finderLiveService.mo77630e(cls2);
                        if (!(d0Var4 == null || (a1Var = d0Var4.f154051E) == null)) {
                            a1Var.f153392e = 2;
                        }
                        C66514h hVar = C66521k0.f191361a;
                        if (hVar != null) {
                            hVar.onBattleStart();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.model.FinderLiveService$f */
    public static final class C55921f implements Runnable {

        /* renamed from: d */
        public static final C55921f f159401d = new C55921f();

        public final void run() {
            C54963d0 d0Var;
            C54130j jVar;
            FinderLiveService finderLiveService = FinderLiveService.f159376d;
            finderLiveService.getClass();
            Class cls = C55001u.class;
            Log.m105924i("Finder.FinderLiveService", "doActivateMic curLiveRoomData:" + FinderLiveService.f159348A + " isAnchor:" + FinderLiveService.f159380h);
            C55001u uVar = (C55001u) finderLiveService.mo77630e(cls);
            if (uVar != null && FinderLiveService.f159380h && (d0Var = (C54963d0) finderLiveService.mo77630e(C54963d0.class)) != null && (jVar = d0Var.f154073p) != null) {
                Log.m105924i("Finder.FinderLiveService", "doActivateMic curLinkUser:" + FinderLiveService.f159348A);
                if (jVar.f152004h) {
                    long j = uVar.f154420q.f182392d;
                    long j2 = uVar.f154416j;
                    String str = uVar.f154423t;
                    byte[] bArr = ((C55001u) uVar.business(cls)).f154417n;
                    String str2 = jVar.f152002f;
                    C54819s4 s4Var = new C54819s4();
                    Log.m105924i("Finder.FinderLiveService", "activateLiveMic liveId:" + j + ", objectId:" + j2 + ", nonceId:" + str + ", scene:" + 1 + ", sessionId:" + str2);
                    C45795b bVar = FinderLiveService.f159348A;
                    LinkedList<C64785vw2> c = bVar != null ? C59918a.f171024g.mo84847c(bVar) : null;
                    C45795b bVar2 = FinderLiveService.f159348A;
                    LinkedList<C64785vw2> b = bVar2 != null ? C59918a.f171024g.mo84846b(bVar2) : null;
                    C45795b bVar3 = FinderLiveService.f159348A;
                    new C58276c(j, j2, str, bArr, 1, str2, 0, c, b, bVar3 != null ? C59918a.f171024g.mo84845a(bVar3) : null, (LinkedList<C64785vw2>) null, s4Var).mo9225i();
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.model.FinderLiveService$g */
    public static final class C55922g implements Runnable {

        /* renamed from: d */
        public static final C55922g f159402d = new C55922g();

        /* JADX WARNING: Removed duplicated region for block: B:196:0x03a3  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x003e  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x004c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r31 = this;
                com.tencent.mm.plugin.finder.live.model.FinderLiveService r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
                java.lang.Class<cl1.o> r1 = cl1.C54991o.class
                java.lang.Class<cl1.u> r2 = cl1.C55001u.class
                androidx.lifecycle.i0 r3 = r0.mo77630e(r1)
                cl1.o r3 = (cl1.C54991o) r3
                r4 = 1
                r5 = 0
                if (r3 == 0) goto L_0x0016
                boolean r3 = r3.f154312f1
                if (r3 != 0) goto L_0x0016
                r3 = 1
                goto L_0x0017
            L_0x0016:
                r3 = 0
            L_0x0017:
                java.lang.String r6 = "Finder.FinderLiveService"
                if (r3 == 0) goto L_0x0022
                java.lang.String r0 = "[doGetLiveMsg] liveMsgSwitch = false"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
                goto L_0x04d3
            L_0x0022:
                androidx.lifecycle.i0 r3 = r0.mo77630e(r2)
                cl1.u r3 = (cl1.C55001u) r3
                if (r3 == 0) goto L_0x003b
                java.lang.String r3 = r3.f154426w
                if (r3 == 0) goto L_0x003b
                int r3 = r3.length()
                if (r3 <= 0) goto L_0x0036
                r3 = 1
                goto L_0x0037
            L_0x0036:
                r3 = 0
            L_0x0037:
                if (r3 != 0) goto L_0x003b
                r3 = 1
                goto L_0x003c
            L_0x003b:
                r3 = 0
            L_0x003c:
                if (r3 == 0) goto L_0x004c
                java.lang.String r0 = "[doGetLiveMsg] uniqueId is empty, return"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
                cj1.j6 r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159386p0
                if (r0 == 0) goto L_0x04d3
                r0.mo56066b()
                goto L_0x04d3
            L_0x004c:
                androidx.lifecycle.i0 r3 = r0.mo77630e(r2)
                cl1.u r3 = (cl1.C55001u) r3
                if (r3 == 0) goto L_0x04d3
                androidx.lifecycle.i0 r0 = r0.mo77630e(r1)
                cl1.o r0 = (cl1.C54991o) r0
                if (r0 == 0) goto L_0x0064
                boolean r0 = r0.mo75997d4()
                if (r0 != r4) goto L_0x0064
                r0 = 1
                goto L_0x0065
            L_0x0064:
                r0 = 0
            L_0x0065:
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "doGetLiveMsg liveFinish:"
                r7.append(r8)
                r7.append(r0)
                java.lang.String r8 = ", heartBeatTimestamp:"
                r7.append(r8)
                long r8 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159351D
                r7.append(r8)
                java.lang.String r8 = " ["
                r7.append(r8)
                fj1.b r8 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159348A
                r7.append(r8)
                java.lang.String r8 = "]，test:"
                r7.append(r8)
                boolean r8 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159356I
                r7.append(r8)
                java.lang.String r8 = ", preTime = "
                r7.append(r8)
                int r8 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159366R0
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)
                if (r0 == 0) goto L_0x00a9
                boolean r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159362P
                if (r0 == 0) goto L_0x00a9
                goto L_0x04d3
            L_0x00a9:
                ok1.e r0 = ok1.C62042e.f176370a
                boolean r0 = r0.mo87027N0()
                r7 = 2
                if (r0 == 0) goto L_0x00b5
                r17 = 1
                goto L_0x00b7
            L_0x00b5:
                r17 = 2
            L_0x00b7:
                long r8 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159351D
                long r10 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159352E
                long r8 = r8 - r10
                androidx.lifecycle.i0 r0 = r3.business(r1)
                cl1.o r0 = (cl1.C54991o) r0
                int r0 = r0.f154304d2
                int r0 = r0 * 1000
                long r10 = (long) r0
                int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r0 < 0) goto L_0x00cd
                r0 = 1
                goto L_0x00ce
            L_0x00cd:
                r0 = 0
            L_0x00ce:
                androidx.lifecycle.i0 r8 = r3.business(r1)
                cl1.o r8 = (cl1.C54991o) r8
                boolean r8 = r8.f154296b2
                r9 = 0
                if (r8 == 0) goto L_0x03ad
                if (r0 == 0) goto L_0x03ad
                cj1.h4 r0 = cj1.C54766h4.f153491a
                long r10 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159351D
                java.lang.Long r0 = java.lang.Long.valueOf(r10)
                java.util.LinkedList r8 = new java.util.LinkedList
                r8.<init>()
                b50.j r10 = b50.C54424j.f152652a
                monitor-enter(r10)
                java.util.LinkedList r11 = new java.util.LinkedList     // Catch:{ all -> 0x03aa }
                java.util.LinkedList<d50.e> r12 = b50.C54424j.f152653b     // Catch:{ all -> 0x03aa }
                r11.<init>(r12)     // Catch:{ all -> 0x03aa }
                monitor-exit(r10)
                java.util.ArrayList r10 = new java.util.ArrayList
                r10.<init>()
                java.util.Iterator r11 = r11.iterator()
            L_0x00fc:
                boolean r12 = r11.hasNext()
                if (r12 == 0) goto L_0x0121
                java.lang.Object r12 = r11.next()
                r13 = r12
                d50.e r13 = (d50.C58111e) r13
                long r13 = r13.f166203d
                if (r0 == 0) goto L_0x0112
                long r15 = r0.longValue()
                goto L_0x0114
            L_0x0112:
                r15 = 0
            L_0x0114:
                int r18 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                if (r18 <= 0) goto L_0x011a
                r13 = 1
                goto L_0x011b
            L_0x011a:
                r13 = 0
            L_0x011b:
                if (r13 == 0) goto L_0x00fc
                r10.add(r12)
                goto L_0x00fc
            L_0x0121:
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r12 = "genClientStatus lastTimestamp:"
                r11.append(r12)
                r11.append(r0)
                java.lang.String r0 = " liveQosInfoQueue.size:"
                r11.append(r0)
                int r0 = r10.size()
                r11.append(r0)
                java.lang.String r0 = r11.toString()
                java.lang.String r11 = "MicroMsg.FinderLiveReporter"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
                te3.h61 r0 = cj1.C54766h4.f153494d
                if (r0 == 0) goto L_0x014d
                int r12 = r0.f183407d
                if (r12 != r4) goto L_0x014d
                r12 = 1
                goto L_0x014e
            L_0x014d:
                r12 = 0
            L_0x014e:
                if (r12 == 0) goto L_0x0166
                if (r0 != 0) goto L_0x0153
                goto L_0x017b
            L_0x0153:
                com.tencent.mm.plugin.finder.live.model.FinderLiveService r12 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
                p50.e r12 = r12.mo77631e0()
                if (r12 == 0) goto L_0x0162
                b50.g r12 = r12.f176822Y0
                if (r12 == 0) goto L_0x0162
                int r12 = r12.f152632f
                goto L_0x0163
            L_0x0162:
                r12 = 0
            L_0x0163:
                r0.f183409f = r12
                goto L_0x017b
            L_0x0166:
                if (r0 != 0) goto L_0x0169
                goto L_0x017b
            L_0x0169:
                com.tencent.mm.plugin.finder.live.model.FinderLiveService r12 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
                p50.e r12 = r12.mo77631e0()
                if (r12 == 0) goto L_0x0178
                b50.g r12 = r12.f176822Y0
                if (r12 == 0) goto L_0x0178
                int r12 = r12.f152631e
                goto L_0x0179
            L_0x0178:
                r12 = 0
            L_0x0179:
                r0.f183409f = r12
            L_0x017b:
                te3.h61 r0 = cj1.C54766h4.f153494d
                if (r0 != 0) goto L_0x0180
                goto L_0x0195
            L_0x0180:
                com.tencent.mm.plugin.finder.live.model.FinderLiveService r12 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
                p50.e r12 = r12.mo77631e0()
                if (r12 == 0) goto L_0x018f
                b50.g r12 = r12.f176822Y0
                if (r12 == 0) goto L_0x018f
                int r12 = r12.f152640n
                goto L_0x0190
            L_0x018f:
                r12 = 0
            L_0x0190:
                int r13 = cj1.C54766h4.f153495e
                r12 = r12 | r13
                r0.f183408e = r12
            L_0x0195:
                te3.h61 r0 = cj1.C54766h4.f153494d
                if (r0 != 0) goto L_0x019a
                goto L_0x01b0
            L_0x019a:
                com.tencent.mm.plugin.finder.live.model.FinderLiveService r12 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
                p50.e r12 = r12.mo77631e0()
                if (r12 == 0) goto L_0x01ad
                b50.g r12 = r12.f176822Y0
                if (r12 == 0) goto L_0x01ad
                d50.g r12 = r12.f152628b
                if (r12 == 0) goto L_0x01ad
                int r12 = r12.f166238h
                goto L_0x01ae
            L_0x01ad:
                r12 = 0
            L_0x01ae:
                r0.f183410g = r12
            L_0x01b0:
                te3.h61 r0 = cj1.C54766h4.f153494d
                if (r0 != 0) goto L_0x01b5
                goto L_0x01c7
            L_0x01b5:
                com.tencent.mm.plugin.finder.live.model.FinderLiveService r12 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
                p50.e r12 = r12.mo77631e0()
                if (r12 == 0) goto L_0x01c4
                b50.g r12 = r12.f176822Y0
                if (r12 == 0) goto L_0x01c4
                int r12 = r12.f152641o
                goto L_0x01c5
            L_0x01c4:
                r12 = 0
            L_0x01c5:
                r0.f183411h = r12
            L_0x01c7:
                te3.h61 r0 = cj1.C54766h4.f153494d
                if (r0 != 0) goto L_0x01cc
                goto L_0x01ce
            L_0x01cc:
                r0.f183412i = r5
            L_0x01ce:
                k50.a r0 = k50.C60971a.C60973b.f173670a
                m50.e r0 = r0.mo85947d()
                boolean r0 = r0.f174724t
                if (r0 == 0) goto L_0x01df
                te3.h61 r0 = cj1.C54766h4.f153494d
                if (r0 != 0) goto L_0x01dd
                goto L_0x01df
            L_0x01dd:
                r0.f183412i = r4
            L_0x01df:
                com.tencent.mm.plugin.finder.live.model.FinderLiveService r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
                r0.getClass()
                j50.a r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159378f
                if (r0 == 0) goto L_0x01f1
                d50.i r0 = r0.f172989A
                if (r0 == 0) goto L_0x01f1
                boolean r0 = r0.mo82881c()
                goto L_0x01f2
            L_0x01f1:
                r0 = 0
            L_0x01f2:
                if (r0 == 0) goto L_0x01fc
                te3.h61 r0 = cj1.C54766h4.f153494d
                if (r0 != 0) goto L_0x01f9
                goto L_0x0203
            L_0x01f9:
                r0.f183413j = r4
                goto L_0x0203
            L_0x01fc:
                te3.h61 r0 = cj1.C54766h4.f153494d
                if (r0 != 0) goto L_0x0201
                goto L_0x0203
            L_0x0201:
                r0.f183413j = r5
            L_0x0203:
                te3.h61 r0 = cj1.C54766h4.f153494d
                if (r0 != 0) goto L_0x0208
                goto L_0x020a
            L_0x0208:
                r0.f183414n = r4
            L_0x020a:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r12 = "qosExtInfo stream_quality:"
                r0.append(r12)
                te3.h61 r12 = cj1.C54766h4.f153494d
                if (r12 == 0) goto L_0x021f
                int r12 = r12.f183409f
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                goto L_0x0220
            L_0x021f:
                r12 = r9
            L_0x0220:
                r0.append(r12)
                java.lang.String r12 = " hevcdec_support:"
                r0.append(r12)
                te3.h61 r12 = cj1.C54766h4.f153494d
                if (r12 == 0) goto L_0x0233
                int r12 = r12.f183408e
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                goto L_0x0234
            L_0x0233:
                r12 = r9
            L_0x0234:
                r0.append(r12)
                java.lang.String r12 = " hevcenc:"
                r0.append(r12)
                te3.h61 r12 = cj1.C54766h4.f153494d
                if (r12 == 0) goto L_0x0247
                int r12 = r12.f183412i
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                goto L_0x0248
            L_0x0247:
                r12 = r9
            L_0x0248:
                r0.append(r12)
                java.lang.String r12 = " is_enteroom_firsttime:"
                r0.append(r12)
                te3.h61 r12 = cj1.C54766h4.f153494d
                if (r12 == 0) goto L_0x025b
                int r12 = r12.f183407d
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                goto L_0x025c
            L_0x025b:
                r12 = r9
            L_0x025c:
                r0.append(r12)
                java.lang.String r12 = " cdnquality_srvcfg"
                r0.append(r12)
                te3.h61 r12 = cj1.C54766h4.f153494d
                if (r12 == 0) goto L_0x026f
                int r12 = r12.f183410g
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                goto L_0x0270
            L_0x026f:
                r12 = r9
            L_0x0270:
                r0.append(r12)
                java.lang.String r12 = " cdh265_backcfg"
                r0.append(r12)
                te3.h61 r12 = cj1.C54766h4.f153494d
                if (r12 == 0) goto L_0x0283
                int r12 = r12.f183411h
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                goto L_0x0284
            L_0x0283:
                r12 = r9
            L_0x0284:
                r0.append(r12)
                java.lang.String r12 = " isEnterBackGround "
                r0.append(r12)
                te3.h61 r12 = cj1.C54766h4.f153494d
                if (r12 == 0) goto L_0x0297
                int r12 = r12.f183413j
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                goto L_0x0298
            L_0x0297:
                r12 = r9
            L_0x0298:
                r0.append(r12)
                r12 = 32
                r0.append(r12)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
                java.util.Iterator r0 = r10.iterator()
            L_0x02ab:
                boolean r10 = r0.hasNext()
                if (r10 == 0) goto L_0x034e
                java.lang.Object r10 = r0.next()
                d50.e r10 = (d50.C58111e) r10
                java.lang.String r12 = "qosInfo"
                gy3.C87412m.m108594g(r10, r12)
                te3.i61 r12 = new te3.i61
                r12.<init>()
                long r13 = r10.f166200a
                r12.f183608d = r13
                int r13 = r10.f166205f
                r12.f183609e = r13
                int r13 = r10.f166206g
                r12.f183610f = r13
                int r13 = r10.f166207h
                r12.f183611g = r13
                int r13 = r10.f166208i
                r12.f183612h = r13
                int r13 = r10.f166209j
                r12.f183613i = r13
                int r13 = r10.f166210k
                r12.f183614j = r13
                int r13 = r10.f166211l
                r12.f183615n = r13
                int r13 = r10.f166212m
                r12.f183616o = r13
                int r13 = r10.f166213n
                r12.f183617p = r13
                int r13 = r10.f166214o
                r12.f183618q = r13
                int r13 = r10.f166215p
                r12.f183619r = r13
                int r13 = r10.f166216q
                r12.f183620s = r13
                int r13 = r10.f166217r
                r12.f183621t = r13
                int r13 = r10.f166218s
                r12.f183622u = r13
                int r13 = r10.f166219t
                r12.f183623v = r13
                long r13 = r10.f166220u
                int r14 = (int) r13
                r12.f183624w = r14
                long r13 = r10.f166221v
                int r14 = (int) r13
                r12.f183625x = r14
                int r13 = r10.f166222w
                r12.f183627z = r13
                int r13 = r10.f166223x
                r12.f183597A = r13
                int r13 = r10.f166224y
                r12.f183598B = r13
                int r13 = r10.f166225z
                r12.f183599C = r13
                int r13 = r10.f166191A
                r12.f183600D = r13
                java.lang.String r13 = r10.f166192B
                r12.f183601E = r13
                int r13 = r10.f166193C
                r12.f183602F = r13
                float r13 = r10.f166194D
                r12.f183603G = r13
                float r13 = r10.f166195E
                r12.f183604H = r13
                int r13 = r10.f166196F
                float r13 = (float) r13
                r12.f183605I = r13
                int r10 = r10.f166197G
                float r10 = (float) r10
                r12.f183606J = r10
                te3.h61 r10 = cj1.C54766h4.f153494d
                if (r10 == 0) goto L_0x0342
                byte[] r10 = r10.toByteArray()
                goto L_0x0343
            L_0x0342:
                r10 = r9
            L_0x0343:
                pe3.b r10 = pe3.C89349b.m111674a(r10)
                r12.f183607K = r10
                r8.add(r12)
                goto L_0x02ab
            L_0x034e:
                com.tencent.mm.plugin.finder.live.model.FinderLiveService r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
                p50.e r0 = r0.mo77631e0()
                if (r0 == 0) goto L_0x0364
                b50.g r0 = r0.f176822Y0
                if (r0 == 0) goto L_0x0364
                te3.h61 r10 = cj1.C54766h4.f153494d
                if (r10 == 0) goto L_0x0361
                int r10 = r10.f183409f
                goto L_0x0362
            L_0x0361:
                r10 = 0
            L_0x0362:
                r0.f152632f = r10
            L_0x0364:
                te3.h61 r0 = cj1.C54766h4.f153494d
                if (r0 != 0) goto L_0x0369
                goto L_0x036b
            L_0x0369:
                r0.f183407d = r5
            L_0x036b:
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r8)
                if (r0 != 0) goto L_0x03a0
                java.lang.Object r0 = r8.removeLast()
                te3.i61 r0 = (te3.C64436i61) r0
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r12 = "genClientStatus curQosInfo:"
                r10.append(r12)
                r10.append(r0)
                java.lang.String r12 = " lastLiveQosInfo.size:"
                r10.append(r12)
                int r12 = r8.size()
                r10.append(r12)
                java.lang.String r10 = r10.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r10)
                if (r0 == 0) goto L_0x03a0
                er1.j4 r10 = er1.C58739j4.f168176a
                te3.xw0 r0 = r10.mo83704d(r0, r8)
                goto L_0x03a1
            L_0x03a0:
                r0 = r9
            L_0x03a1:
                if (r0 == 0) goto L_0x03a7
                long r10 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159351D
                com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159352E = r10
            L_0x03a7:
                r20 = r0
                goto L_0x03af
            L_0x03aa:
                r0 = move-exception
                monitor-exit(r10)
                throw r0
            L_0x03ad:
                r20 = r9
            L_0x03af:
                te3.hj1 r0 = new te3.hj1
                r0.<init>()
                com.tencent.mm.plugin.finder.live.view.b r8 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159379g
                if (r8 == 0) goto L_0x03d3
                bl3.r r0 = bl3.C39818r.f106831a
                android.content.Context r8 = r8.getContext()
                java.lang.String r10 = "curLayout.context"
                gy3.C87412m.m108593f(r8, r10)
                bl3.r$a r0 = r0.mo62443b(r8)
                java.lang.Class<ht1.g4> r8 = ht1.C60172g4.class
                bl3.c r0 = r0.mo62447c(r8)
                ht1.g4 r0 = (ht1.C60172g4) r0
                te3.hj1 r0 = r0.mo12861q3()
            L_0x03d3:
                ok1.e r8 = ok1.C62042e.f176370a
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r11 = "getLiveMsg liveCookies "
                r10.append(r11)
                androidx.lifecycle.i0 r11 = r3.business(r2)
                cl1.u r11 = (cl1.C55001u) r11
                byte[] r11 = r11.f154417n
                if (r11 != 0) goto L_0x03f7
                java.nio.charset.Charset r11 = z04.C119027c.f356488a
                java.lang.String r12 = ""
                byte[] r11 = r12.getBytes(r11)
                java.lang.String r12 = "this as java.lang.String).getBytes(charset)"
                gy3.C87412m.m108593f(r11, r12)
            L_0x03f7:
                java.lang.String r7 = android.util.Base64.encodeToString(r11, r7)
                r10.append(r7)
                java.lang.String r7 = r10.toString()
                r8.mo86998D1(r6, r7)
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "[doGetLiveMsg] cookie is Empty: "
                r6.append(r7)
                androidx.lifecycle.i0 r7 = r3.business(r2)
                cl1.u r7 = (cl1.C55001u) r7
                byte[] r7 = r7.f154417n
                if (r7 == 0) goto L_0x0423
                int r7 = r7.length
                if (r7 != 0) goto L_0x041d
                goto L_0x041e
            L_0x041d:
                r4 = 0
            L_0x041e:
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
                goto L_0x0424
            L_0x0423:
                r4 = r9
            L_0x0424:
                r6.append(r4)
                java.lang.String r4 = ", "
                r6.append(r4)
                androidx.lifecycle.i0 r4 = r3.business(r2)
                r6.append(r4)
                java.lang.String r4 = r6.toString()
                java.lang.String r5 = "ken_debug"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
                java.lang.Class<ls3.h> r4 = ls3.C61398h.class
                di3.d r4 = di3.C86312j.m106911c(r4)
                r8 = r4
                ls3.h r8 = (ls3.C61398h) r8
                je1.h2 r4 = je1.C46523h2.f125330a
                r5 = 3976(0xf88, float:5.572E-42)
                te3.ig0 r4 = r4.mo71860b(r5, r0)
                zc1.b r5 = zc1.C66785b.f191882e
                java.lang.String r10 = r5.mo90662O5()
                androidx.lifecycle.i0 r5 = r3.business(r2)
                cl1.u r5 = (cl1.C55001u) r5
                byte[] r11 = r5.f154417n
                te3.c21 r5 = r3.f154420q
                long r12 = r5.f182392d
                androidx.lifecycle.i0 r2 = r3.business(r2)
                cl1.u r2 = (cl1.C55001u) r2
                long r14 = r2.f154416j
                java.lang.String r2 = r3.f154423t
                com.tencent.mm.plugin.finder.live.model.FinderLiveService r5 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
                androidx.lifecycle.i0 r1 = r5.mo77630e(r1)
                cl1.o r1 = (cl1.C54991o) r1
                if (r1 == 0) goto L_0x047e
                te3.fs0 r1 = r1.mo75986U3()
                if (r1 == 0) goto L_0x047e
                int r1 = r1.f183215f
                r21 = r1
                goto L_0x0481
            L_0x047e:
                r1 = 4
                r21 = 4
            L_0x0481:
                java.lang.String r1 = r3.f154426w
                java.lang.Class<cl1.j> r6 = cl1.C39975j.class
                androidx.lifecycle.i0 r5 = r5.mo77630e(r6)
                cl1.j r5 = (cl1.C39975j) r5
                if (r5 == 0) goto L_0x049a
                androidx.lifecycle.z<te3.lw0> r5 = r5.f107170j
                if (r5 == 0) goto L_0x049a
                java.lang.Object r5 = r5.getValue()
                te3.lw0 r5 = (te3.C50317lw0) r5
                r26 = r5
                goto L_0x049c
            L_0x049a:
                r26 = r9
            L_0x049c:
                cj1.t4 r5 = new cj1.t4
                r5.<init>(r3)
                j50.a r3 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159378f
                if (r3 == 0) goto L_0x04aa
                java.lang.String r3 = r3.f173005Q0
                r25 = r3
                goto L_0x04ac
            L_0x04aa:
                r25 = r9
            L_0x04ac:
                java.lang.String r3 = "getService(ILiveCgiFactoryService::class.java)"
                gy3.C87412m.m108593f(r8, r3)
                r18 = 0
                r19 = 0
                r27 = 0
                r28 = 0
                r29 = 65536(0x10000, float:9.18355E-41)
                r30 = 0
                r9 = r4
                r16 = r2
                r22 = r0
                r23 = r1
                r24 = r5
                ob0.b r0 = ls3.C61398h.C61399a.m72075a(r8, r9, r10, r11, r12, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
                r0.mo9225i()
                long r0 = java.lang.System.currentTimeMillis()
                com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159351D = r0
            L_0x04d3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.C55922g.run():void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.model.FinderLiveService$i */
    public static final class C55923i implements Runnable {

        /* renamed from: d */
        public static final C55923i f159403d = new C55923i();

        public final void run() {
            String str;
            C60735a aVar;
            C54738b1 b1Var;
            C54131l lVar;
            C54131l lVar2;
            FinderLiveService finderLiveService = FinderLiveService.f159376d;
            finderLiveService.getClass();
            Class cls = C55001u.class;
            Log.m105924i("Finder.FinderLiveService", "doKeepLive[" + FinderLiveService.f159348A + ']');
            C54991o oVar = (C54991o) finderLiveService.mo77630e(C54991o.class);
            int i = 0;
            if (oVar != null && !oVar.f154317g1) {
                Log.m105924i("Finder.FinderLiveService", "[doKeepLive] keepAliveSwitch = false");
                return;
            }
            C55001u uVar = (C55001u) finderLiveService.mo77630e(cls);
            if (uVar != null) {
                int i2 = C62042e.f176370a.mo87027N0() ? 1 : 2;
                C49712hj1 hj12 = new C49712hj1();
                C54129i iVar = FinderLiveService.f159398z;
                hj12.f134677n = (iVar == null || (lVar2 = iVar.f151988c) == null) ? 0 : lVar2.f152031k;
                if (!(iVar == null || (lVar = iVar.f151988c) == null)) {
                    i = lVar.f152031k;
                }
                hj12.f134675i = i;
                if (iVar == null || (b1Var = iVar.f151991f) == null || (str = b1Var.f153437z) == null) {
                    str = "";
                }
                new C58284o(uVar.f154420q.f182392d, ((C55001u) uVar.business(cls)).f154417n, C66785b.f191882e.mo90662O5(), ((C55001u) uVar.business(cls)).f154416j, i2, uVar.f154423t, uVar.f154424u, (String) null, 0, hj12, 0, (C52153yq0) null, (finderLiveService == null || (aVar = FinderLiveService.f159378f) == null) ? null : aVar.f173005Q0, str, 0, uVar.f154426w, (C64414h71) null, 0, 1, (String) null, (C89349b) null, 1789312, (C8480h) null).mo9225i().mo123420E(new C54842v4(uVar));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.model.FinderLiveService$k */
    public static final class C55924k implements C45389s0.C45390a {

        /* renamed from: com.tencent.mm.plugin.finder.live.model.FinderLiveService$k$a */
        public static final class C55925a extends C87413o implements C32227p<Boolean, Integer, C13598b0> {

            /* renamed from: d */
            public static final C55925a f159404d = new C55925a();

            public C55925a() {
                super(2);
            }

            public Object invoke(Object obj, Object obj2) {
                ((Boolean) obj).booleanValue();
                ((Number) obj2).intValue();
                FinderLiveService finderLiveService = FinderLiveService.f159376d;
                finderLiveService.getClass();
                LiveRoomControllerStore liveRoomControllerStore = FinderLiveService.f159349B;
                if (liveRoomControllerStore != null) {
                    C59447j.f169870a.mo84554f(liveRoomControllerStore);
                }
                C56032b bVar = FinderLiveService.f159379g;
                boolean z = false;
                if (bVar != null && !bVar.isDestroyed()) {
                    z = true;
                }
                if (z) {
                    C56032b bVar2 = FinderLiveService.f159379g;
                    if (bVar2 != null) {
                        C58124b.C7172a.m7372a(bVar2, C58124b.C58125b.FINDER_LIVE_ANCHOR_PAUSE, (Bundle) null, 2, (Object) null);
                    }
                } else {
                    C45795b bVar3 = FinderLiveService.f159348A;
                    if (bVar3 != null) {
                        finderLiveService.mo77623Z(bVar3, true, C58124b.C58125b.FINDER_LIVE_ANCHOR_PAUSE, (Bundle) null, ((C55001u) bVar3.mo71262a(C55001u.class)).f154420q.f182392d);
                    }
                }
                finderLiveService.mo77611N();
                return C13598b0.f38549a;
            }
        }

        /* renamed from: a */
        public void mo10574a(int i, int i2, String str, C51239sg1 sg12) {
            C54991o oVar;
            C87412m.m108594g(sg12, "resp");
            if (i == 0 && i2 == 0 && (oVar = (C54991o) FinderLiveService.f159376d.mo77630e(C54991o.class)) != null) {
                C64510l21 l212 = new C64510l21();
                l212.f184023d = 2;
                l212.f184025f = 0;
                oVar.mo75978P4(l212, false, C55925a.f159404d);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.model.FinderLiveService$l */
    public static final class C55926l extends C87413o implements C32224a<C55932a> {

        /* renamed from: d */
        public static final C55926l f159405d = new C55926l();

        public C55926l() {
            super(0);
        }

        public Object invoke() {
            return new C55932a();
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.model.FinderLiveService", mo125469f = "FinderLiveService.kt", mo125470l = {2329}, mo125471m = "postExternalLive")
    /* renamed from: com.tencent.mm.plugin.finder.live.model.FinderLiveService$m */
    public static final class C55927m extends C66704d {

        /* renamed from: d */
        public /* synthetic */ Object f159406d;

        /* renamed from: e */
        public final /* synthetic */ FinderLiveService f159407e;

        /* renamed from: f */
        public int f159408f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55927m(FinderLiveService finderLiveService, C15601d<? super C55927m> dVar) {
            super(dVar);
            this.f159407e = finderLiveService;
        }

        public final Object invokeSuspend(Object obj) {
            this.f159406d = obj;
            this.f159408f |= Integer.MIN_VALUE;
            return this.f159407e.mo77602C(false, (C32231t<? super Boolean, ? super Integer, ? super Integer, ? super String, ? super Bundle, ? super C49291ej0, C13598b0>) null, this);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.model.FinderLiveService$n */
    public static final class C55928n extends C87413o implements C32226l<byte[], C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C45795b f159409d;

        /* renamed from: e */
        public final /* synthetic */ C32231t<Boolean, Integer, Integer, String, Bundle, C49291ej0, C13598b0> f159410e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55928n(C45795b bVar, boolean z, C32231t<? super Boolean, ? super Integer, ? super Integer, ? super String, ? super Bundle, ? super C49291ej0, C13598b0> tVar) {
            super(1);
            this.f159409d = bVar;
            this.f159410e = tVar;
        }

        public Object invoke(Object obj) {
            byte[] bArr = (byte[]) obj;
            FinderLiveService.f159376d.getClass();
            C54806r1 r1Var = FinderLiveService.f159382j;
            C45795b bVar = this.f159409d;
            C54795n5 n5Var = FinderLiveService.f159396y;
            C32231t<Boolean, Integer, Integer, String, Bundle, C49291ej0, C13598b0> tVar = this.f159410e;
            r1Var.getClass();
            C87412m.m108594g(bVar, "liveData");
            C87412m.m108594g(tVar, "callback");
            if (n5Var != null) {
                n5Var.mo75720X(new C54794n1(bVar, n5Var, r1Var, tVar));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.model.FinderLiveService$o */
    public static final class C55929o implements Runnable {

        /* renamed from: d */
        public static final C55929o f159411d = new C55929o();

        public final void run() {
            FinderLiveService finderLiveService = FinderLiveService.f159376d;
            finderLiveService.getClass();
            Log.m105924i("Finder.FinderLiveService", "doRefreshMic[" + FinderLiveService.f159348A + ']');
            C55001u uVar = (C55001u) finderLiveService.mo77630e(C55001u.class);
            if (uVar != null) {
                int i = C62042e.f176370a.mo87027N0() ? 1 : 2;
                long j = uVar.f154420q.f182392d;
                long j2 = uVar.f154416j;
                String str = uVar.f154423t;
                byte[] bArr = uVar.f154417n;
                String n4 = ((C54991o) uVar.business(C54991o.class)).mo76015n4();
                C54844w4 w4Var = new C54844w4(uVar);
                finderLiveService.getClass();
                Log.m105924i("Finder.FinderLiveService", "refreshLinkMic liveId:" + j + ", objectId:" + j2 + ", nonceId:" + str + ", scene:" + i + ", sdkUserId:" + n4);
                new C58289v0(j, j2, str, bArr, i, n4, w4Var).mo9225i();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.model.FinderLiveService$p */
    public static final class C55930p implements C34767b.C21622a {
        /* renamed from: a */
        public void mo17997a(boolean z) {
            FinderLiveService.f159376d.mo77648v("onPause");
        }

        public void onResume() {
            FinderLiveService.f159376d.mo77636j("onResume");
        }

        public void onStop() {
            FinderLiveService.f159376d.mo77648v("onStop");
            FinderLiveService.f159388r = null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.model.FinderLiveService$q */
    public static final class C55931q extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C55931q f159412d = new C55931q();

        public C55931q() {
            super(0);
        }

        public Object invoke() {
            C54405b bVar;
            FinderLiveService finderLiveService = FinderLiveService.f159376d;
            finderLiveService.getClass();
            C60735a aVar = FinderLiveService.f159378f;
            if (!(aVar == null || (bVar = aVar.f173032r) == null)) {
                int w = finderLiveService.mo77649w();
                C110747k kVar = ((C54412f) bVar).f152607b;
                kVar.getClass();
                kVar.mo148312q(new C63713p(kVar, w));
            }
            C60735a aVar2 = FinderLiveService.f159378f;
            C87412m.m108592e(aVar2, "null cannot be cast to non-null type com.tencent.mm.live.core.core.anchor.LiveAnchorTRTCCore");
            ((C54655b) aVar2).mo75578J0(FinderLiveService.f159390t, FinderLiveService.f159393w);
            C56032b bVar2 = FinderLiveService.f159379g;
            if (bVar2 != null) {
                bVar2.post(C55933b.f159413d);
            }
            return C13598b0.f38549a;
        }
    }

    static {
        boolean z = false;
        if (C32444a.f86132c2.mo60266n().intValue() == 0) {
            z = true;
        }
        f159362P = z;
        C40008f fVar = C40008f.f107254d;
        f159367S = new FinderLiveService$voipCallEvent$1(fVar);
        f159369T = new FinderLiveService$multiTalkActionListener$1(fVar);
        FinderLiveService$checkDeviceLsn$1 finderLiveService$checkDeviceLsn$1 = new FinderLiveService$checkDeviceLsn$1(fVar);
        finderLiveService$checkDeviceLsn$1.alive();
    }

    /* JADX WARNING: Removed duplicated region for block: B:273:0x04f4  */
    /* JADX WARNING: Removed duplicated region for block: B:387:0x0740  */
    /* JADX WARNING: Removed duplicated region for block: B:400:0x0762  */
    /* JADX WARNING: Removed duplicated region for block: B:403:0x0786  */
    /* JADX WARNING: Removed duplicated region for block: B:404:0x0789  */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m63767I(com.tencent.p014mm.plugin.finder.live.model.FinderLiveService r27, java.lang.String r28, boolean r29, boolean r30, java.lang.Boolean r31, boolean r32, int r33, java.lang.Object r34) {
        /*
            r0 = r27
            r1 = r28
            r2 = r33 & 2
            r3 = 1
            if (r2 == 0) goto L_0x000b
            r2 = 1
            goto L_0x000d
        L_0x000b:
            r2 = r29
        L_0x000d:
            r4 = r33 & 4
            r5 = 0
            if (r4 == 0) goto L_0x0014
            r4 = 0
            goto L_0x0016
        L_0x0014:
            r4 = r30
        L_0x0016:
            r6 = r33 & 8
            if (r6 == 0) goto L_0x001d
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            goto L_0x001f
        L_0x001d:
            r6 = r31
        L_0x001f:
            r7 = r33 & 16
            if (r7 == 0) goto L_0x0025
            r7 = 0
            goto L_0x0027
        L_0x0025:
            r7 = r32
        L_0x0027:
            r27.getClass()
            java.lang.Class<ak1.o> r8 = ak1.C54108o.class
            java.lang.Class<cl1.u> r9 = cl1.C55001u.class
            java.lang.Class<cl1.o> r10 = cl1.C54991o.class
            java.lang.Class<cl1.d0> r11 = cl1.C54963d0.class
            java.lang.String r12 = "source"
            gy3.C87412m.m108594g(r1, r12)
            java.lang.String r12 = "Finder.FinderLiveService"
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "release source:"
            r13.append(r14)
            r13.append(r1)
            java.lang.String r1 = ",curLiveRoomData:"
            r13.append(r1)
            fj1.b r1 = f159348A
            r13.append(r1)
            java.lang.String r1 = " liveCore:"
            r13.append(r1)
            j50.a r1 = f159378f
            r13.append(r1)
            java.lang.String r1 = ", isNormalMode:"
            r13.append(r1)
            j50.a r1 = f159378f
            r14 = 0
            if (r1 == 0) goto L_0x0072
            d50.i r1 = r1.f172989A
            if (r1 == 0) goto L_0x0072
            boolean r1 = r1.mo82886h()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            goto L_0x0073
        L_0x0072:
            r1 = r14
        L_0x0073:
            r13.append(r1)
            java.lang.String r1 = ",miniWinPermission:"
            r13.append(r1)
            r13.append(r4)
            java.lang.String r1 = ",closeLive:"
            r13.append(r1)
            r13.append(r6)
            java.lang.String r1 = ",isAnchor:"
            r13.append(r1)
            boolean r1 = f159380h
            r13.append(r1)
            java.lang.String r1 = ",isTopApplication:"
            r13.append(r1)
            r13.append(r2)
            java.lang.String r1 = ", miniWinPermission:"
            r13.append(r1)
            r13.append(r4)
            java.lang.String r1 = ", curLinkState:"
            r13.append(r1)
            androidx.lifecycle.i0 r1 = r0.mo77630e(r11)
            cl1.d0 r1 = (cl1.C54963d0) r1
            if (r1 == 0) goto L_0x00b4
            int r1 = r1.f154078u
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x00b5
        L_0x00b4:
            r1 = r14
        L_0x00b5:
            r13.append(r1)
            java.lang.String r1 = ", curLinkUser:"
            r13.append(r1)
            androidx.lifecycle.i0 r1 = r0.mo77630e(r11)
            cl1.d0 r1 = (cl1.C54963d0) r1
            if (r1 == 0) goto L_0x00c8
            al1.j r1 = r1.f154073p
            goto L_0x00c9
        L_0x00c8:
            r1 = r14
        L_0x00c9:
            r13.append(r1)
            java.lang.String r1 = ",audienceMode:"
            r13.append(r1)
            androidx.lifecycle.i0 r1 = r0.mo77630e(r10)
            cl1.o r1 = (cl1.C54991o) r1
            if (r1 == 0) goto L_0x00e2
            int r1 = r1.mo75996d3()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x00e3
        L_0x00e2:
            r1 = r14
        L_0x00e3:
            r13.append(r1)
            java.lang.String r1 = ",finishActivityNotReleaseLive:"
            r13.append(r1)
            r13.append(r7)
            java.lang.String r1 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r1)
            j50.a r1 = f159378f
            if (r1 == 0) goto L_0x0105
            d50.i r1 = r1.f172989A
            if (r1 == 0) goto L_0x0105
            boolean r1 = r1.mo82886h()
            if (r1 != r3) goto L_0x0105
            r1 = 1
            goto L_0x0106
        L_0x0105:
            r1 = 0
        L_0x0106:
            if (r1 == 0) goto L_0x08e9
            if (r4 != 0) goto L_0x08e9
            if (r7 != 0) goto L_0x08e9
            r12 = 0
            f159351D = r12
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.VoipEvent> r1 = f159367S
            r1.dead()
            com.tencent.mm.sdk.event.IListener<?> r1 = f159369T
            r1.dead()
            com.tencent.mm.plugin.finder.live.view.b r1 = f159379g
            if (r1 == 0) goto L_0x0123
            android.content.Context r1 = r1.getContext()
            goto L_0x0124
        L_0x0123:
            r1 = r14
        L_0x0124:
            com.tencent.mm.plugin.finder.live.view.b r4 = f159379g
            if (r4 == 0) goto L_0x0135
            android.content.Context r4 = r4.getContext()
            if (r4 == 0) goto L_0x0135
            java.lang.String r7 = "phone"
            java.lang.Object r4 = r4.getSystemService(r7)
            goto L_0x0136
        L_0x0135:
            r4 = r14
        L_0x0136:
            boolean r7 = r4 instanceof android.telephony.TelephonyManager
            if (r7 == 0) goto L_0x013d
            android.telephony.TelephonyManager r4 = (android.telephony.TelephonyManager) r4
            goto L_0x013e
        L_0x013d:
            r4 = r14
        L_0x013e:
            if (r4 == 0) goto L_0x01a0
            rx3.g r7 = f159370U
            rx3.n r7 = (rx3.C36570n) r7
            java.lang.Object r7 = r7.getValue()
            android.telephony.PhoneStateListener r7 = (android.telephony.PhoneStateListener) r7
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r16 = k20.C60958c.f173611a
            java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
            r15.mo10233c(r12)
            r15.mo10233c(r7)
            java.lang.Object[] r16 = r15.mo10232b()
            java.lang.String r17 = "com/tencent/mm/plugin/finder/live/model/FinderLiveService"
            java.lang.String r18 = "release"
            java.lang.String r19 = "(Ljava/lang/String;ZZLjava/lang/Boolean;Z)V"
            java.lang.String r20 = "android/telephony/TelephonyManager_EXEC_"
            java.lang.String r21 = "listen"
            java.lang.String r22 = "(Landroid/telephony/PhoneStateListener;I)V"
            r7 = r15
            r15 = r4
            j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.Object r12 = r7.mo10231a(r5)
            android.telephony.PhoneStateListener r12 = (android.telephony.PhoneStateListener) r12
            java.lang.Object r7 = r7.mo10231a(r3)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r4.listen(r12, r7)
            java.lang.String r7 = "com/tencent/mm/plugin/finder/live/model/FinderLiveService"
            java.lang.String r12 = "release"
            java.lang.String r13 = "(Ljava/lang/String;ZZLjava/lang/Boolean;Z)V"
            java.lang.String r15 = "android/telephony/TelephonyManager_EXEC_"
            java.lang.String r16 = "listen"
            java.lang.String r17 = "(Landroid/telephony/PhoneStateListener;I)V"
            r28 = r4
            r29 = r7
            r30 = r12
            r31 = r13
            r32 = r15
            r33 = r16
            r34 = r17
            j20.C117292a.m165359e(r28, r29, r30, r31, r32, r33, r34)
        L_0x01a0:
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r4 = f159349B
            if (r4 == 0) goto L_0x01ae
            gh1.j r7 = gh1.C59447j.f169870a
            gh1.i r12 = new gh1.i
            r12.<init>(r4)
            r7.mo84557i(r4, r12)
        L_0x01ae:
            f159379g = r14
            r27.mo77646t()
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            boolean r4 = gy3.C87412m.m108589b(r6, r4)
            if (r4 == 0) goto L_0x067b
            mr.q r4 = p204mr.C61570q.VISITOR_LIVE
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "liveId="
            r12.append(r13)
            androidx.lifecycle.i0 r13 = r0.mo77630e(r9)
            cl1.u r13 = (cl1.C55001u) r13
            if (r13 == 0) goto L_0x01da
            te3.c21 r13 = r13.f154420q
            if (r13 == 0) goto L_0x01da
            long r14 = r13.f182392d
            java.lang.Long r13 = java.lang.Long.valueOf(r14)
            goto L_0x01db
        L_0x01da:
            r13 = 0
        L_0x01db:
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            cj1.z4 r13 = cj1.C0646z4.f1533d
            java.lang.Class<mr.i> r14 = p204mr.C61567i.class
            di3.d r14 = di3.C86312j.m106911c(r14)
            mr.i r14 = (p204mr.C61567i) r14
            r14.Dh0(r4, r12, r13)
            di3.d r4 = di3.C86312j.m106911c(r8)
            ak1.o r4 = (ak1.C54108o) r4
            r4.getClass()
            java.lang.String r4 = "HABBYGE-MALI.HellLiveReport"
            java.lang.String r12 = "stopDeviceStatus"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r12)
            ak1.b r4 = ak1.C54108o.f151872n
            com.tencent.mm.sdk.platformtools.MTimerHandler r4 = r4.f151397d
            r4.stopTimer()
            androidx.lifecycle.i0 r4 = r0.mo77630e(r11)
            cl1.d0 r4 = (cl1.C54963d0) r4
            if (r4 == 0) goto L_0x0247
            java.util.List<al1.j> r4 = r4.f154074q
            if (r4 == 0) goto L_0x0247
            monitor-enter(r4)
            java.util.Iterator r12 = r4.iterator()     // Catch:{ all -> 0x0244 }
        L_0x0218:
            boolean r13 = r12.hasNext()     // Catch:{ all -> 0x0244 }
            if (r13 == 0) goto L_0x023e
            java.lang.Object r13 = r12.next()     // Catch:{ all -> 0x0244 }
            r14 = r13
            al1.j r14 = (al1.C54130j) r14     // Catch:{ all -> 0x0244 }
            java.lang.String r14 = r14.f151997a     // Catch:{ all -> 0x0244 }
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r15 = f159376d     // Catch:{ all -> 0x0244 }
            androidx.lifecycle.i0 r15 = r15.mo77630e(r10)     // Catch:{ all -> 0x0244 }
            cl1.o r15 = (cl1.C54991o) r15     // Catch:{ all -> 0x0244 }
            if (r15 == 0) goto L_0x0236
            java.lang.String r15 = r15.mo76015n4()     // Catch:{ all -> 0x0244 }
            goto L_0x0237
        L_0x0236:
            r15 = 0
        L_0x0237:
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r14, (java.lang.String) r15)     // Catch:{ all -> 0x0244 }
            if (r14 == 0) goto L_0x0218
            goto L_0x023f
        L_0x023e:
            r13 = 0
        L_0x023f:
            monitor-exit(r4)
            r4 = r13
            al1.j r4 = (al1.C54130j) r4
            goto L_0x0248
        L_0x0244:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0247:
            r4 = 0
        L_0x0248:
            if (r4 == 0) goto L_0x024c
            r4 = 1
            goto L_0x024d
        L_0x024c:
            r4 = 0
        L_0x024d:
            di3.d r12 = di3.C86312j.m106911c(r8)
            ak1.o r12 = (ak1.C54108o) r12
            androidx.lifecycle.i0 r13 = r0.mo77630e(r9)
            cl1.u r13 = (cl1.C55001u) r13
            if (r13 == 0) goto L_0x0262
            te3.c21 r13 = r13.f154420q
            if (r13 == 0) goto L_0x0262
            long r13 = r13.f182392d
            goto L_0x0264
        L_0x0262:
            r13 = 0
        L_0x0264:
            androidx.lifecycle.i0 r15 = r0.mo77630e(r10)
            cl1.o r15 = (cl1.C54991o) r15
            if (r15 == 0) goto L_0x0273
            int r15 = r15.mo76013m4()
            r29 = r8
            goto L_0x0276
        L_0x0273:
            r29 = r8
            r15 = 0
        L_0x0276:
            long r7 = (long) r15
            androidx.lifecycle.i0 r15 = r0.mo77630e(r9)
            cl1.u r15 = (cl1.C55001u) r15
            if (r15 == 0) goto L_0x028b
            d50.h r15 = r15.f154421r
            if (r15 == 0) goto L_0x028b
            d50.g r15 = r15.f166251b
            if (r15 == 0) goto L_0x028b
            java.lang.String r15 = r15.f166231a
            if (r15 != 0) goto L_0x028d
        L_0x028b:
            java.lang.String r15 = ""
        L_0x028d:
            c50.b r16 = c50.C54655b.f153178f1
            if (r16 == 0) goto L_0x0294
            r16 = 1
            goto L_0x0296
        L_0x0294:
            r16 = 0
        L_0x0296:
            r17 = 1
            r19 = 2
            if (r16 == 0) goto L_0x029f
            r5 = r17
            goto L_0x02bf
        L_0x029f:
            i50.a r16 = i50.C60251a.f171781k1
            if (r16 == 0) goto L_0x02a6
            r16 = 1
            goto L_0x02a8
        L_0x02a6:
            r16 = 0
        L_0x02a8:
            if (r16 == 0) goto L_0x02ad
            r5 = r19
            goto L_0x02bf
        L_0x02ad:
            p50.e r16 = p50.C62197e.f176819i1
            if (r16 == 0) goto L_0x02b4
            r16 = 1
            goto L_0x02b6
        L_0x02b4:
            r16 = 0
        L_0x02b6:
            if (r16 == 0) goto L_0x02bd
            r21 = 3
            r5 = r21
            goto L_0x02bf
        L_0x02bd:
            r5 = 0
        L_0x02bf:
            boolean r16 = f159380h
            if (r16 == 0) goto L_0x02c6
            r23 = 0
            goto L_0x02cd
        L_0x02c6:
            if (r4 == 0) goto L_0x02cb
            r23 = r19
            goto L_0x02cd
        L_0x02cb:
            r23 = r17
        L_0x02cd:
            j50.a r4 = f159378f
            if (r4 == 0) goto L_0x02da
            k50.c r3 = r4.f173025i
            if (r3 == 0) goto L_0x02da
            int r3 = r3.f173674d
            r17 = r2
            goto L_0x02dd
        L_0x02da:
            r17 = r2
            r3 = 0
        L_0x02dd:
            long r2 = (long) r3
            r18 = r1
            if (r4 == 0) goto L_0x02ed
            k50.c r1 = r4.f173025i
            if (r1 == 0) goto L_0x02ed
            int r1 = r1.f173676f
            r32 = r10
            r33 = r11
            goto L_0x02f2
        L_0x02ed:
            r32 = r10
            r33 = r11
            r1 = 0
        L_0x02f2:
            long r10 = (long) r1
            if (r4 == 0) goto L_0x02fe
            k50.c r1 = r4.f173025i
            if (r1 == 0) goto L_0x02fe
            int r1 = r1.f173675e
            r19 = r10
            goto L_0x0301
        L_0x02fe:
            r19 = r10
            r1 = 0
        L_0x0301:
            long r10 = (long) r1
            if (r4 == 0) goto L_0x030d
            k50.c r1 = r4.f173025i
            if (r1 == 0) goto L_0x030d
            int r1 = r1.f173677g
            r21 = r10
            goto L_0x0310
        L_0x030d:
            r21 = r10
            r1 = 0
        L_0x0310:
            long r10 = (long) r1
            androidx.lifecycle.i0 r1 = r0.mo77630e(r9)
            cl1.u r1 = (cl1.C55001u) r1
            if (r1 == 0) goto L_0x0326
            d50.h r1 = r1.f154421r
            if (r1 == 0) goto L_0x0326
            d50.g r1 = r1.f166251b
            if (r1 == 0) goto L_0x0326
            r25 = r10
            long r10 = r1.f166246p
            goto L_0x032a
        L_0x0326:
            r25 = r10
            r10 = 0
        L_0x032a:
            androidx.lifecycle.i0 r1 = r0.mo77630e(r9)
            cl1.u r1 = (cl1.C55001u) r1
            if (r1 == 0) goto L_0x033d
            d50.h r1 = r1.f154421r
            if (r1 == 0) goto L_0x033d
            d50.g r1 = r1.f166251b
            if (r1 == 0) goto L_0x033d
            long r0 = r1.f166247q
            goto L_0x033f
        L_0x033d:
            r0 = 0
        L_0x033f:
            r12.getClass()
            com.tencent.mm.autogen.mmdata.rpt.FinderLiveEngineReportStruct r4 = new com.tencent.mm.autogen.mmdata.rpt.FinderLiveEngineReportStruct
            r4.<init>()
            r4.f155502d = r13
            r4.f155503e = r7
            java.lang.String r7 = "FinderName"
            r8 = 1
            java.lang.String r7 = r4.mo86045b(r7, r15, r8)
            r4.f155504f = r7
            r4.f155505g = r5
            r5 = r23
            r4.f155506h = r5
            r4.f155507i = r2
            r2 = r19
            r4.f155508j = r2
            r2 = r21
            r4.f155509k = r2
            r2 = r25
            r4.f155510l = r2
            r2 = 0
            r4.f155511m = r2
            r4.f155512n = r10
            r4.f155513o = r0
            r4.mo86054n()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "report24524 info:"
            r0.append(r1)
            java.lang.String r1 = r4.mo1006q()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "HABBYGE-MALI.HellLiveReport"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            zt3.t r0 = zt3.C119157j.f356862d
            cj1.t5 r1 = cj1.C28591t5.f78476d
            zt3.j r0 = (zt3.C119157j) r0
            java.lang.String r2 = "Finder.LiveExceptionMonitor"
            r0.mo183876g(r1, r2)
            boolean r0 = f159380h
            if (r0 != 0) goto L_0x05ca
            r0 = r27
            r1 = r33
            androidx.lifecycle.i0 r2 = r0.mo77630e(r1)
            cl1.d0 r2 = (cl1.C54963d0) r2
            if (r2 == 0) goto L_0x03e7
            java.util.List<al1.j> r2 = r2.f154074q
            if (r2 == 0) goto L_0x03e7
            monitor-enter(r2)
            java.util.Iterator r3 = r2.iterator()     // Catch:{ all -> 0x03e4 }
        L_0x03b1:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x03e4 }
            if (r4 == 0) goto L_0x03dc
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x03e4 }
            r5 = r4
            al1.j r5 = (al1.C54130j) r5     // Catch:{ all -> 0x03e4 }
            java.lang.String r5 = r5.f151997a     // Catch:{ all -> 0x03e4 }
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r6 = f159376d     // Catch:{ all -> 0x03e4 }
            r7 = r32
            androidx.lifecycle.i0 r6 = r6.mo77630e(r7)     // Catch:{ all -> 0x03e4 }
            cl1.o r6 = (cl1.C54991o) r6     // Catch:{ all -> 0x03e4 }
            if (r6 == 0) goto L_0x03d1
            java.lang.String r6 = r6.mo76015n4()     // Catch:{ all -> 0x03e4 }
            goto L_0x03d2
        L_0x03d1:
            r6 = 0
        L_0x03d2:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r5, (java.lang.String) r6)     // Catch:{ all -> 0x03e4 }
            if (r5 == 0) goto L_0x03d9
            goto L_0x03df
        L_0x03d9:
            r32 = r7
            goto L_0x03b1
        L_0x03dc:
            r7 = r32
            r4 = 0
        L_0x03df:
            monitor-exit(r2)
            r2 = r4
            al1.j r2 = (al1.C54130j) r2
            goto L_0x03ea
        L_0x03e4:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x03e7:
            r7 = r32
            r2 = 0
        L_0x03ea:
            if (r2 == 0) goto L_0x03ee
            r2 = 1
            goto L_0x03ef
        L_0x03ee:
            r2 = 0
        L_0x03ef:
            java.lang.String r3 = "Finder.FinderLiveService"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "release visitor, linkMicWait:"
            r4.append(r5)
            androidx.lifecycle.i0 r5 = r0.mo77630e(r1)
            cl1.d0 r5 = (cl1.C54963d0) r5
            if (r5 == 0) goto L_0x040c
            boolean r5 = r5.mo75913U3()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            goto L_0x040d
        L_0x040c:
            r5 = 0
        L_0x040d:
            r4.append(r5)
            java.lang.String r5 = " isLinkingSelf:"
            r4.append(r5)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            androidx.lifecycle.i0 r3 = r0.mo77630e(r1)
            cl1.d0 r3 = (cl1.C54963d0) r3
            if (r3 == 0) goto L_0x0430
            boolean r3 = r3.mo75913U3()
            r4 = 1
            if (r3 != r4) goto L_0x0430
            r3 = 1
            goto L_0x0431
        L_0x0430:
            r3 = 0
        L_0x0431:
            if (r3 != 0) goto L_0x0435
            if (r2 == 0) goto L_0x0475
        L_0x0435:
            if (r2 == 0) goto L_0x0448
            androidx.lifecycle.i0 r2 = r0.mo77630e(r1)
            cl1.d0 r2 = (cl1.C54963d0) r2
            if (r2 == 0) goto L_0x0448
            java.util.List<al1.j> r2 = r2.f154074q
            if (r2 == 0) goto L_0x0448
            cj1.a5 r3 = cj1.C0516a5.f1254d
            sx3.C64175a0.m75512t(r2, r3)
        L_0x0448:
            androidx.lifecycle.i0 r2 = r0.mo77630e(r7)
            cl1.o r2 = (cl1.C54991o) r2
            if (r2 == 0) goto L_0x0456
            java.lang.String r2 = r2.mo76015n4()
            r13 = r2
            goto L_0x0457
        L_0x0456:
            r13 = 0
        L_0x0457:
            androidx.lifecycle.i0 r1 = r0.mo77630e(r1)
            cl1.d0 r1 = (cl1.C54963d0) r1
            if (r1 == 0) goto L_0x0463
            java.lang.String r1 = r1.f154070j
            r14 = r1
            goto L_0x0464
        L_0x0463:
            r14 = 0
        L_0x0464:
            cj1.n5 r1 = f159396y
            if (r1 == 0) goto L_0x0475
            r11 = 2
            r12 = 0
            cj1.b5 r15 = new cj1.b5
            r15.<init>()
            r10 = r1
            cj1.t r10 = (cj1.C54820t) r10
            r10.mo75700D(r11, r12, r13, r14, r15)
        L_0x0475:
            cj1.n5 r1 = f159396y
            if (r1 == 0) goto L_0x047e
            cj1.t r1 = (cj1.C54820t) r1
            r1.mo75778n0()
        L_0x047e:
            androidx.lifecycle.i0 r1 = r0.mo77630e(r7)
            cl1.o r1 = (cl1.C54991o) r1
            if (r1 == 0) goto L_0x048e
            int r1 = r1.mo75996d3()
            if (r1 != 0) goto L_0x048e
            r1 = 1
            goto L_0x048f
        L_0x048e:
            r1 = 0
        L_0x048f:
            if (r1 == 0) goto L_0x04a1
            j50.a r1 = f159378f
            boolean r2 = r1 instanceof p50.C62197e
            if (r2 == 0) goto L_0x04a1
            java.lang.String r2 = "null cannot be cast to non-null type com.tencent.mm.live.core.core.visitor.LiveVisitorTRTCCore"
            gy3.C87412m.m108592e(r1, r2)
            p50.e r1 = (p50.C62197e) r1
            r1.mo87271L0()
        L_0x04a1:
            com.tencent.mm.plugin.finder.live.view.j1 r1 = f159385p
            if (r1 == 0) goto L_0x050e
            fj1.b r2 = fj1.C45795b.f123698n
            if (r2 == 0) goto L_0x050e
            androidx.lifecycle.i0 r2 = r2.mo71262a(r7)
            cl1.o r2 = (cl1.C54991o) r2
            java.util.HashMap<java.lang.Long, te3.v41> r3 = r1.f159903b
            androidx.lifecycle.i0 r2 = r2.business(r9)
            cl1.u r2 = (cl1.C55001u) r2
            te3.c21 r2 = r2.f154420q
            long r4 = r2.f182392d
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            java.lang.Object r2 = r3.get(r2)
            te3.v41 r2 = (te3.C64766v41) r2
            if (r2 != 0) goto L_0x04c8
            goto L_0x050e
        L_0x04c8:
            r1.mo78157b()
            java.lang.String r2 = r2.f185828d
            if (r2 == 0) goto L_0x04d8
            int r2 = r2.length()
            if (r2 != 0) goto L_0x04d6
            goto L_0x04d8
        L_0x04d6:
            r2 = 0
            goto L_0x04d9
        L_0x04d8:
            r2 = 1
        L_0x04d9:
            if (r2 != 0) goto L_0x050e
            com.tencent.mm.plugin.finder.live.view.i1 r1 = r1.f159902a
            fj1.b r2 = fj1.C45795b.f123698n
            if (r2 == 0) goto L_0x04f0
            androidx.lifecycle.i0 r2 = r2.mo71262a(r7)
            cl1.o r2 = (cl1.C54991o) r2
            boolean r2 = r2.mo75997d4()
            r3 = 1
            if (r2 != r3) goto L_0x04f1
            r2 = 1
            goto L_0x04f2
        L_0x04f0:
            r3 = 1
        L_0x04f1:
            r2 = 0
        L_0x04f2:
            if (r2 != 0) goto L_0x050a
            fj1.b r2 = fj1.C45795b.f123698n
            if (r2 == 0) goto L_0x0504
            androidx.lifecycle.i0 r2 = r2.mo71262a(r7)
            cl1.o r2 = (cl1.C54991o) r2
            boolean r2 = r2.f154266V
            if (r2 != r3) goto L_0x0504
            r2 = 1
            goto L_0x0505
        L_0x0504:
            r2 = 0
        L_0x0505:
            if (r2 == 0) goto L_0x0508
            goto L_0x050a
        L_0x0508:
            r2 = 0
            goto L_0x050b
        L_0x050a:
            r2 = 1
        L_0x050b:
            r1.mo67896U(r3, r2)
        L_0x050e:
            com.tencent.mm.plugin.finder.live.view.j1 r1 = f159385p
            if (r1 == 0) goto L_0x0521
            rx3.g r1 = r1.f159904c
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            com.tencent.mm.sdk.platformtools.MMHandler r1 = (com.tencent.p014mm.sdk.platformtools.MMHandler) r1
            r2 = 3
            r1.removeMessages(r2)
            goto L_0x0522
        L_0x0521:
            r2 = 3
        L_0x0522:
            rx3.g r1 = cj1.C28578k5.f78446a
            androidx.lifecycle.i0 r1 = r0.mo77630e(r7)
            cl1.o r1 = (cl1.C54991o) r1
            if (r1 == 0) goto L_0x052f
            java.lang.String r1 = r1.f154345o
            goto L_0x0530
        L_0x052f:
            r1 = 0
        L_0x0530:
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r3 == 0) goto L_0x053e
            java.lang.String r1 = "FinderLive.FinderLiveWatchTimeMgr"
            java.lang.String r3 = "quitLive anchorUserName nil"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r3)
            goto L_0x054f
        L_0x053e:
            rx3.g r3 = cj1.C28578k5.f78446a
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r3 = r3.getValue()
            java.util.Map r3 = (java.util.Map) r3
            java.util.Map r3 = gy3.C24564k0.m30739c(r3)
            r3.remove(r1)
        L_0x054f:
            java.lang.Class<ak1.w> r1 = ak1.C54116w.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            ak1.w r1 = (ak1.C54116w) r1
            androidx.lifecycle.i0 r3 = r0.mo77630e(r9)
            cl1.u r3 = (cl1.C55001u) r3
            if (r3 == 0) goto L_0x0566
            te3.c21 r3 = r3.f154420q
            if (r3 == 0) goto L_0x0566
            long r3 = r3.f182392d
            goto L_0x0568
        L_0x0566:
            r3 = 0
        L_0x0568:
            androidx.lifecycle.i0 r5 = r0.mo77630e(r9)
            cl1.u r5 = (cl1.C55001u) r5
            if (r5 == 0) goto L_0x0573
            long r5 = r5.f154416j
            goto L_0x0575
        L_0x0573:
            r5 = 0
        L_0x0575:
            java.lang.String r5 = o40.C61926c.m72691p(r5)
            r1.getClass()
            com.tencent.mm.autogen.mmdata.rpt.FinderLiveCdnUserEnterLiveTimeCostStruct r6 = r1.xx0(r3)
            r6.f155490e = r3
            java.lang.String r8 = "tid"
            r10 = 1
            java.lang.String r5 = r6.mo86045b(r8, r5, r10)
            r6.f155489d = r5
            long r10 = eb0.C31543z5.m39453c()
            r6.f155498m = r10
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r8 = "#reportEnterLiveTimeCost "
            r5.append(r8)
            java.lang.String r8 = r6.mo1006q()
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            java.lang.String r8 = "HABBYGE-MALI.HellLiveVisitorReoprter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r5)
            r6.mo86054n()
            java.util.HashMap<java.lang.Long, com.tencent.mm.autogen.mmdata.rpt.FinderLiveCdnUserEnterLiveTimeCostStruct> r1 = r1.f151946i1
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r1.remove(r3)
            androidx.lifecycle.i0 r1 = r0.mo77630e(r7)
            cl1.o r1 = (cl1.C54991o) r1
            if (r1 == 0) goto L_0x0612
            cj1.h4 r3 = cj1.C54766h4.f153491a
            boolean r1 = r1.mo75999e4()
            r3.mo75670a(r1)
            goto L_0x0612
        L_0x05ca:
            r2 = 3
            r0 = r27
            cj1.n5 r1 = f159396y
            if (r1 == 0) goto L_0x05d7
            r3 = 0
            r4 = 0
            r5 = 1
            cj1.C54795n5.C54796a.m61723a(r1, r4, r3, r5, r3)
        L_0x05d7:
            ig1.h r1 = new ig1.h
            r1.<init>()
            java.lang.String r3 = "KEY_FILTER_CONFIG"
            r1.field_key = r3
            te3.bp2 r3 = new te3.bp2
            r3.<init>()
            s50.b r4 = f159393w
            if (r4 == 0) goto L_0x05ec
            int r5 = r4.f180566a
            goto L_0x05ed
        L_0x05ec:
            r5 = -1
        L_0x05ed:
            r3.f131246d = r5
            if (r4 == 0) goto L_0x05f4
            int r4 = r4.f180568c
            goto L_0x05f5
        L_0x05f4:
            r4 = -1
        L_0x05f5:
            r3.f131247e = r4
            byte[] r3 = r3.toByteArray()
            r1.field_value = r3
            java.lang.Class<hr.t> r3 = p165hr.C60106t.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            hr.t r3 = (p165hr.C60106t) r3
            rx3.g r3 = r3.f171518r
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r3 = r3.getValue()
            ik1.c r3 = (ik1.C33340c) r3
            r3.replace(r1)
        L_0x0612:
            j50.a r1 = f159378f
            if (r1 == 0) goto L_0x061e
            cj1.c5 r3 = new cj1.c5
            r3.<init>()
            r1.mo85676R(r3)
        L_0x061e:
            r1 = 0
            cj1.C54749e2.f153458b = r1
            cj1.C54749e2.f153460d = r1
            cj1.r1 r1 = f159382j
            java.util.List<is3.a> r3 = r1.f153636a
            java.lang.String r4 = "externalLiveCallbacks"
            gy3.C87412m.m108593f(r3, r4)
            monitor-enter(r3)
            java.util.Iterator r4 = r3.iterator()     // Catch:{ all -> 0x0678 }
        L_0x0631:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x0678 }
            if (r5 == 0) goto L_0x0648
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x0678 }
            is3.a r5 = (is3.C60622a) r5     // Catch:{ all -> 0x0678 }
            java.lang.String r6 = "FinderLiveExternalHelper"
            java.lang.String r7 = "onLiveFinished"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)     // Catch:{ all -> 0x0678 }
            r5.mo85577d()     // Catch:{ all -> 0x0678 }
            goto L_0x0631
        L_0x0648:
            monitor-exit(r3)
            java.util.ArrayList<te3.zs2> r1 = r1.f153640e
            r1.clear()
            di3.d r1 = di3.C86312j.m106911c(r29)
            ak1.o r1 = (ak1.C54108o) r1
            r1.getClass()
            ak1.f0 r1 = ak1.C54108o.f151869h
            java.lang.String r3 = ""
            r1.f151426H = r3
            r1.f151427I = r3
            r1.f151428J = r3
            r1.f151429K = r3
            bl3.r r1 = bl3.C39818r.f106831a
            java.lang.Class<ht1.t1> r3 = ht1.C60200t1.class
            bl3.r$a r1 = r1.mo62446e(r3)
            java.lang.Class<bp1.f> r3 = bp1.C54524f.class
            androidx.lifecycle.i0 r1 = r1.mo75002a(r3)
            bp1.f r1 = (bp1.C54524f) r1
            r3 = 4
            r1.mo75385c3(r3)
            goto L_0x0680
        L_0x0678:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x067b:
            r18 = r1
            r17 = r2
            r2 = 3
        L_0x0680:
            androidx.lifecycle.i0 r1 = r0.mo77630e(r9)
            cl1.u r1 = (cl1.C55001u) r1
            if (r1 == 0) goto L_0x068f
            te3.c21 r1 = r1.f154420q
            if (r1 == 0) goto L_0x068f
            long r3 = r1.f182392d
            goto L_0x0691
        L_0x068f:
            r3 = 0
        L_0x0691:
            j50.a r1 = f159378f
            if (r1 == 0) goto L_0x0698
            r5 = 0
            r1.f173038x = r5
        L_0x0698:
            boolean r1 = f159380h
            if (r1 == 0) goto L_0x06cc
            i50.a r1 = i50.C60251a.f171781k1
            if (r1 == 0) goto L_0x06a2
            r1 = 1
            goto L_0x06a3
        L_0x06a2:
            r1 = 0
        L_0x06a3:
            if (r1 == 0) goto L_0x06b7
            java.lang.String r1 = "MicroMsg.LiveCoreSecondaryDevice"
            java.lang.String r3 = "releaseInstance"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)
            i50.a r1 = i50.C60251a.f171781k1
            if (r1 == 0) goto L_0x06b3
            r1.mo75581i0()
        L_0x06b3:
            r1 = 0
            i50.C60251a.f171781k1 = r1
            goto L_0x06c8
        L_0x06b7:
            r1 = 0
            java.lang.String r3 = "releaseInstance: onlyResetReference:false"
            java.lang.String r4 = "MicroMsg.LiveCoreAnchor"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            c50.b r3 = c50.C54655b.f153178f1
            if (r3 == 0) goto L_0x06c6
            r3.mo75581i0()
        L_0x06c6:
            c50.C54655b.f153178f1 = r1
        L_0x06c8:
            r14 = r18
            goto L_0x0825
        L_0x06cc:
            r14 = r18
            boolean r1 = r14 instanceof android.app.Activity
            if (r1 == 0) goto L_0x06d6
            r1 = r14
            android.app.Activity r1 = (android.app.Activity) r1
            goto L_0x06d7
        L_0x06d6:
            r1 = 0
        L_0x06d7:
            if (r1 == 0) goto L_0x06ea
            bl3.r r5 = bl3.C39818r.f106831a
            bl3.r$a r1 = r5.mo62443b(r1)
            java.lang.Class<com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC> r5 = com.tencent.p014mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC.class
            androidx.lifecycle.i0 r1 = r1.mo75002a(r5)
            com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC r1 = (com.tencent.p014mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC) r1
            boolean r1 = r1.f160022q
            goto L_0x06eb
        L_0x06ea:
            r1 = 0
        L_0x06eb:
            if (r1 == 0) goto L_0x079a
            ph1.i r5 = ph1.C62293i.f177081a
            androidx.lifecycle.i0 r5 = r0.mo77630e(r9)
            cl1.u r5 = (cl1.C55001u) r5
            if (r5 == 0) goto L_0x06fa
            long r5 = r5.f154416j
            goto L_0x06fc
        L_0x06fa:
            r5 = 0
        L_0x06fc:
            java.util.HashMap<java.lang.Long, ph1.g> r7 = ph1.C62293i.f177088h
            java.lang.Long r8 = java.lang.Long.valueOf(r5)
            java.lang.Object r8 = r7.get(r8)
            ph1.g r8 = (ph1.C62292g) r8
            up1.f r9 = up1.C37521f.f99374d
            r9.getClass()
            pe1.c<java.lang.Integer> r9 = up1.C37521f.f99135B6
            java.lang.Object r9 = r9.mo60266n()
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r10 = 1
            if (r9 != r10) goto L_0x073d
            pe1.c<java.lang.Integer> r9 = up1.C37521f.f99578z6
            java.lang.Object r9 = r9.mo60266n()
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            if (r9 != r10) goto L_0x0738
            boolean r9 = com.tencent.p014mm.p136ui.C85875k4.m106157N()
            if (r9 != 0) goto L_0x0738
            boolean r9 = com.tencent.p014mm.p136ui.C85875k4.m106167X()
            if (r9 != 0) goto L_0x0738
            r9 = 1
            goto L_0x0739
        L_0x0738:
            r9 = 0
        L_0x0739:
            if (r9 == 0) goto L_0x073d
            r9 = 1
            goto L_0x073e
        L_0x073d:
            r9 = 0
        L_0x073e:
            if (r9 == 0) goto L_0x075f
            if (r8 == 0) goto L_0x0745
            f50.d r9 = r8.f177095g
            goto L_0x0746
        L_0x0745:
            r9 = 0
        L_0x0746:
            if (r9 == 0) goto L_0x075f
            f50.d r9 = r8.f177095g
            gy3.C87412m.m108591d(r9)
            boolean r9 = r9.isPlaying()
            if (r9 == 0) goto L_0x075f
            lt1.a r9 = r8.f177089a
            lt1.a r10 = lt1.C61401a.LIVE_WINDOW
            if (r9 == r10) goto L_0x075f
            boolean r9 = ph1.C62293i.f177083c
            if (r9 == 0) goto L_0x075f
            r9 = 1
            goto L_0x0760
        L_0x075f:
            r9 = 0
        L_0x0760:
            if (r9 != 0) goto L_0x0769
            java.lang.Long r10 = java.lang.Long.valueOf(r5)
            r7.remove(r10)
        L_0x0769:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r10 = "startExitLiveRoom feedId:"
            r7.append(r10)
            r7.append(r5)
            java.lang.String r5 = " canReusePlayer: "
            r7.append(r5)
            r7.append(r9)
            java.lang.String r5 = " fluentScene = "
            r7.append(r5)
            if (r8 == 0) goto L_0x0789
            lt1.a r5 = r8.f177089a
            goto L_0x078a
        L_0x0789:
            r5 = 0
        L_0x078a:
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            java.lang.String r6 = "FinderFluentSwitchManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
            r5 = 1
            r6 = r9 ^ 1
            goto L_0x079b
        L_0x079a:
            r6 = 1
        L_0x079b:
            java.lang.String r5 = "Finder.FinderLiveService"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "closeByUser: "
            r7.append(r8)
            r7.append(r1)
            java.lang.String r1 = " exitResult:"
            r7.append(r1)
            r7.append(r6)
            java.lang.String r1 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
            p50.a$a r1 = p50.C62193a.f176816k1
            qt1.b r1 = qt1.C63329b.f179694a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = " releaseInstance "
            r5.append(r7)
            r5.append(r3)
            java.lang.String r7 = " stopPlay:"
            r5.append(r7)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r7 = "FinderLiveVisitorPlayCore"
            r1.mo88233d(r7, r5)
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, p50.a> r1 = p50.C62193a.f176817l1
            java.lang.Long r5 = java.lang.Long.valueOf(r3)
            java.lang.Object r1 = r1.remove(r5)
            p50.a r1 = (p50.C62193a) r1
            if (r6 == 0) goto L_0x07ef
            if (r1 == 0) goto L_0x07ef
            r5 = 0
            r1.mo87256C0(r5)
        L_0x07ef:
            if (r1 == 0) goto L_0x07f4
            r1.mo75581i0()
        L_0x07f4:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "FinderLiveVisitorPlayCore releaseInstance instance:"
            r5.append(r6)
            r5.append(r1)
            java.lang.String r1 = ", liveId:"
            r5.append(r1)
            r5.append(r3)
            java.lang.String r1 = ", core size:"
            r5.append(r1)
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, p50.a> r1 = p50.C62193a.f176817l1
            int r1 = r1.size()
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)
            ok1.e r1 = ok1.C62042e.f176370a
            r3 = 0
            r4 = 1
            r1.mo87064a2(r4, r3)
        L_0x0825:
            fj1.b r1 = f159348A
            if (r14 == 0) goto L_0x0835
            if (r1 == 0) goto L_0x0835
            cj1.r0 r3 = cj1.C54804r0.f153631a
            if (r17 == 0) goto L_0x0831
            r6 = 2
            goto L_0x0832
        L_0x0831:
            r6 = 3
        L_0x0832:
            r3.mo75762c(r14, r1, r6)
        L_0x0835:
            fj1.b r1 = f159348A
            if (r1 == 0) goto L_0x083c
            r1.mo71263b()
        L_0x083c:
            r1 = 0
            r0.mo77613P(r1)
            fj1.b$a r2 = fj1.C45795b.f123697j
            r2.mo58474a(r1)
            r0.mo77612O(r1)
            f159378f = r1
            f159396y = r1
            er1.f5 r0 = er1.C58728f5.f168144a
            java.lang.String r0 = "anchorStatisticsReport reset"
            java.lang.String r2 = "Finder.LiveStatisticsReport"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            er1.C58728f5.f168152i = r1
            r2 = 0
            er1.C58728f5.f168145b = r2
            er1.C58728f5.f168146c = r2
            er1.C58728f5.f168147d = r2
            er1.C58728f5.f168148e = r2
            er1.C58728f5.f168153j = r2
            r0 = 0
            er1.C58728f5.f168154k = r0
            java.lang.String r4 = ""
            er1.C58728f5.f168155l = r4
            er1.C58728f5.f168156m = r0
            r4 = 1
            er1.C58728f5.f168149f = r4
            nk1.C61790n.f175671b = r1
            nk1.C61790n.f175672c = r1
            w50.C65940n.f189587a = r0
            java.lang.String r0 = ""
            w50.C65940n.f189588b = r0
            w50.C65940n.f189589c = r2
            b50.C54424j.f152654c = r2
            f159353F = r1
            r0 = -1
            f159354G = r0
            f159355H = r0
            cj1.y1 r0 = cj1.C0639y1.f1510a
            r0 = 1
            cj1.C0639y1.f1511b = r0
            java.util.Map<java.lang.String, ig1.d> r0 = cj1.C0639y1.f1513d
            r0.clear()
            java.util.Map<java.lang.String, ig1.d> r0 = cj1.C0639y1.f1514e
            r0.clear()
            java.util.Map<java.lang.String, java.lang.String> r0 = cj1.C0639y1.f1515f
            r0.clear()
            java.util.Map<java.lang.String, java.lang.String> r0 = cj1.C0639y1.f1516g
            r0.clear()
            java.util.Map<java.lang.String, java.lang.String> r0 = cj1.C0639y1.f1517h
            r0.clear()
            uk1.a r0 = f159381i
            r1 = 0
            r0.f188207a = r1
            al1.i r0 = f159398z
            if (r0 == 0) goto L_0x08ae
            cj1.b1 r0 = r0.f151991f
            goto L_0x08af
        L_0x08ae:
            r0 = r1
        L_0x08af:
            if (r0 != 0) goto L_0x08b2
            goto L_0x08b6
        L_0x08b2:
            java.lang.String r2 = ""
            r0.f153437z = r2
        L_0x08b6:
            f159385p = r1
            cj1.r1 r0 = f159382j
            java.util.List<is3.a> r1 = r0.f153636a
            r1.clear()
            te3.ey0 r1 = new te3.ey0
            r1.<init>()
            r0.f153637b = r1
            cj1.i r0 = f159384o
            if (r0 == 0) goto L_0x08d5
            com.tencent.mm.sdk.platformtools.MTimerHandler r1 = r0.f153515m
            if (r1 == 0) goto L_0x08d1
            r1.stopTimer()
        L_0x08d1:
            r1 = 0
            r0.f153515m = r1
            goto L_0x08d6
        L_0x08d5:
            r1 = 0
        L_0x08d6:
            f159384o = r1
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r0 = f159349B
            if (r0 == 0) goto L_0x08e9
            java.lang.Class<fh1.a> r1 = fh1.C58989a.class
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController r0 = r0.controller(r1)
            fh1.a r0 = (fh1.C58989a) r0
            if (r0 == 0) goto L_0x08e9
            r0.mo84225o3()
        L_0x08e9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.m63767I(com.tencent.mm.plugin.finder.live.model.FinderLiveService, java.lang.String, boolean, boolean, java.lang.Boolean, boolean, int, java.lang.Object):void");
    }

    /* renamed from: J */
    public static void m63768J(FinderLiveService finderLiveService, boolean z, C32224a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            aVar = null;
        }
        finderLiveService.getClass();
        C61926c.m72668M(new C54747d5(z, aVar));
    }

    /* renamed from: b0 */
    public static /* synthetic */ void m63769b0(FinderLiveService finderLiveService, int i, JSONObject jSONObject, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            jSONObject = null;
        }
        if ((i2 & 4) != 0) {
            z = true;
        }
        finderLiveService.mo77625a0(i, jSONObject, z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:69:0x023f  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m63770d(com.tencent.p014mm.plugin.finder.live.model.FinderLiveService r25, fj1.C45795b r26, com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore r27, com.tencent.p014mm.plugin.finder.live.view.C56032b r28, int r29, te3.C49712hj1 r30, int r31, java.lang.Object r32) {
        /*
            r0 = r25
            r1 = r26
            r2 = r27
            r3 = r31 & 4
            if (r3 == 0) goto L_0x000c
            r3 = 0
            goto L_0x000e
        L_0x000c:
            r3 = r28
        L_0x000e:
            r5 = r31 & 8
            if (r5 == 0) goto L_0x0014
            r5 = 0
            goto L_0x0016
        L_0x0014:
            r5 = r29
        L_0x0016:
            r7 = r31 & 16
            if (r7 == 0) goto L_0x001c
            r7 = 0
            goto L_0x001e
        L_0x001c:
            r7 = r30
        L_0x001e:
            r25.getClass()
            h81.h$c r8 = h81.C32735h.C32737c.clicfg_live_not_support_switch_video_param
            java.lang.Class<h81.h> r9 = h81.C32735h.class
            java.lang.Class<cl1.o> r10 = cl1.C54991o.class
            java.lang.String r11 = "liveData"
            gy3.C87412m.m108594g(r1, r11)
            java.lang.String r11 = "controllerStore"
            gy3.C87412m.m108594g(r2, r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "bindCurLive "
            r11.append(r12)
            r11.append(r1)
            java.lang.String r12 = " curLiveRoomData:"
            r11.append(r12)
            fj1.b r12 = f159348A
            r11.append(r12)
            java.lang.String r12 = " finderBaseLayout:"
            r11.append(r12)
            r11.append(r3)
            java.lang.String r12 = " liveMode:"
            r11.append(r12)
            r11.append(r5)
            java.lang.String r11 = r11.toString()
            java.lang.String r12 = "Finder.FinderLiveService"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r11)
            fj1.c r11 = new fj1.c
            r11.<init>(r1)
            o40.C61926c.m72668M(r11)
            java.lang.String r11 = "createInstance"
            java.lang.String r13 = "MicroMsg.LiveCoreSecondaryDevice"
            java.lang.String r14 = "phone"
            java.lang.String r15 = "this as java.lang.String).toLowerCase()"
            java.lang.String r4 = "getService(IExptService:…ch_video_param, \"mp1718\")"
            java.lang.String r6 = "mp1718"
            r16 = 32
            r29 = r12
            r12 = 1
            if (r5 == 0) goto L_0x01b4
            if (r5 == r12) goto L_0x0081
            goto L_0x03e7
        L_0x0081:
            di3.d r5 = di3.C86312j.m106911c(r9)
            h81.h r5 = (h81.C32735h) r5
            java.lang.String r5 = r5.Y60(r8, r6)
            gy3.C87412m.m108593f(r5, r4)
            java.lang.String r4 = r5.toLowerCase()
            gy3.C87412m.m108593f(r4, r15)
            f159387q = r4
            if (r3 == 0) goto L_0x009b
            f159379g = r3
        L_0x009b:
            cj1.t r4 = new cj1.t
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference
            if (r3 == 0) goto L_0x00a6
            android.content.Context r6 = r3.getContext()
            goto L_0x00a7
        L_0x00a6:
            r6 = 0
        L_0x00a7:
            r5.<init>(r6)
            r4.<init>(r5, r1, r7)
            f159396y = r4
            com.tencent.mm.plugin.finder.live.view.b r4 = f159379g
            if (r4 == 0) goto L_0x00be
            android.content.Context r4 = r4.getContext()
            if (r4 == 0) goto L_0x00be
            java.lang.Object r4 = r4.getSystemService(r14)
            goto L_0x00bf
        L_0x00be:
            r4 = 0
        L_0x00bf:
            boolean r5 = r4 instanceof android.telephony.TelephonyManager
            if (r5 == 0) goto L_0x00c6
            android.telephony.TelephonyManager r4 = (android.telephony.TelephonyManager) r4
            goto L_0x00c7
        L_0x00c6:
            r4 = 0
        L_0x00c7:
            if (r4 == 0) goto L_0x011c
            rx3.g r5 = f159370U
            rx3.n r5 = (rx3.C36570n) r5
            java.lang.Object r5 = r5.getValue()
            android.telephony.PhoneStateListener r5 = (android.telephony.PhoneStateListener) r5
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r16)
            r6.mo10233c(r7)
            r6.mo10233c(r5)
            java.lang.Object[] r18 = r6.mo10232b()
            java.lang.String r19 = "com/tencent/mm/plugin/finder/live/model/FinderLiveService"
            java.lang.String r20 = "bindMiniGameLive"
            java.lang.String r21 = "(Lcom/tencent/mm/plugin/finder/live/model/context/LiveBuContext;Lcom/tencent/mm/plugin/finder/live/controller/base/LiveRoomControllerStore;Lcom/tencent/mm/plugin/finder/live/view/FinderBaseLivePluginLayout;Lcom/tencent/mm/protocal/protobuf/FinderReportContextObj;)V"
            java.lang.String r22 = "android/telephony/TelephonyManager_EXEC_"
            java.lang.String r23 = "listen"
            java.lang.String r24 = "(Landroid/telephony/PhoneStateListener;I)V"
            r17 = r4
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            r5 = 0
            java.lang.Object r7 = r6.mo10231a(r5)
            android.telephony.PhoneStateListener r7 = (android.telephony.PhoneStateListener) r7
            java.lang.Object r5 = r6.mo10231a(r12)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r4.listen(r7, r5)
            java.lang.String r18 = "com/tencent/mm/plugin/finder/live/model/FinderLiveService"
            java.lang.String r19 = "bindMiniGameLive"
            java.lang.String r20 = "(Lcom/tencent/mm/plugin/finder/live/model/context/LiveBuContext;Lcom/tencent/mm/plugin/finder/live/controller/base/LiveRoomControllerStore;Lcom/tencent/mm/plugin/finder/live/view/FinderBaseLivePluginLayout;Lcom/tencent/mm/protocal/protobuf/FinderReportContextObj;)V"
            java.lang.String r21 = "android/telephony/TelephonyManager_EXEC_"
            java.lang.String r22 = "listen"
            java.lang.String r23 = "(Landroid/telephony/PhoneStateListener;I)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
        L_0x011c:
            pe1.c<java.lang.Long> r4 = gg1.C32444a.f86177o
            java.lang.Object r4 = r4.mo60266n()
            java.lang.Number r4 = (java.lang.Number) r4
            long r4 = r4.longValue()
            cj1.C54749e2.f153457a = r4
            pe1.c<java.lang.Integer> r4 = gg1.C32444a.f86181p
            java.lang.Object r4 = r4.mo60266n()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            if (r4 != r12) goto L_0x013a
            r4 = 1
            goto L_0x013b
        L_0x013a:
            r4 = 0
        L_0x013b:
            cj1.C54749e2.f153459c = r4
            r25.mo77617T()
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.VoipEvent> r4 = f159367S
            r4.alive()
            com.tencent.mm.sdk.event.IListener<?> r4 = f159369T
            r4.alive()
            r25.mo77613P(r26)
            r0.mo77612O(r2)
            fj1.b$a r4 = fj1.C45795b.f123697j
            r4.mo58474a(r1)
            f159380h = r12
            androidx.lifecycle.i0 r4 = r1.mo71262a(r10)
            cl1.o r4 = (cl1.C54991o) r4
            zc1.b r5 = zc1.C66785b.f191882e
            java.lang.String r5 = r5.mo90662O5()
            java.lang.String r6 = "<set-?>"
            gy3.C87412m.m108594g(r5, r6)
            r4.f154345o = r5
            i50.a r4 = i50.C60251a.f171781k1
            if (r4 != 0) goto L_0x017b
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]
            com.tencent.p014mm.sdk.platformtools.Log.printInfoStack(r13, r11, r4)
            i50.a r4 = new i50.a
            r4.<init>()
            i50.C60251a.f171781k1 = r4
        L_0x017b:
            i50.a r4 = i50.C60251a.f171781k1
            gy3.C87412m.m108591d(r4)
            f159378f = r4
            uk1.a r4 = f159381i
            boolean r5 = f159380h
            com.tencent.mm.plugin.finder.live.view.FinderLiveMiniView r4 = r4.mo89485c(r1, r5)
            j50.a r5 = f159378f
            if (r5 == 0) goto L_0x0193
            r50.f r5 = r5.f173028o
            r5.mo88277g(r4)
        L_0x0193:
            j50.a r4 = f159378f
            if (r4 == 0) goto L_0x0199
            r4.f173038x = r0
        L_0x0199:
            r25.mo77616S()
            cj1.i r0 = new cj1.i
            r0.<init>(r1, r3)
            f159384o = r0
            cj1.z3 r0 = f159383n
            r0.getClass()
            com.tencent.mm.sdk.platformtools.MMHandler r4 = r0.f153758g
            cj1.b4 r5 = new cj1.b4
            r5.<init>(r0, r1)
            r4.post(r5)
            goto L_0x03e7
        L_0x01b4:
            java.lang.Class<cl1.u> r5 = cl1.C55001u.class
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r31 = r5
            java.lang.String r5 = "bindNormalLive "
            r12.append(r5)
            fj1.b r5 = f159348A
            r12.append(r5)
            java.lang.String r5 = r12.toString()
            r12 = r29
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r5)
            di3.d r5 = di3.C86312j.m106911c(r9)
            h81.h r5 = (h81.C32735h) r5
            java.lang.String r5 = r5.Y60(r8, r6)
            gy3.C87412m.m108593f(r5, r4)
            java.lang.String r4 = r5.toLowerCase()
            gy3.C87412m.m108593f(r4, r15)
            f159387q = r4
            f159379g = r3
            cj1.t r4 = new cj1.t
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference
            if (r3 == 0) goto L_0x01f3
            android.content.Context r6 = r3.getContext()
            goto L_0x01f4
        L_0x01f3:
            r6 = 0
        L_0x01f4:
            r5.<init>(r6)
            r4.<init>(r5, r1, r7)
            f159396y = r4
            fj1.b r4 = f159348A
            if (r4 == 0) goto L_0x0247
            ok1.e r4 = ok1.C62042e.f176370a
            boolean r4 = r4.mo87027N0()
            if (r4 == 0) goto L_0x0209
            goto L_0x023b
        L_0x0209:
            j50.a r4 = f159378f
            boolean r5 = r4 instanceof p50.C62193a
            if (r5 == 0) goto L_0x0212
            p50.a r4 = (p50.C62193a) r4
            goto L_0x0213
        L_0x0212:
            r4 = 0
        L_0x0213:
            if (r4 == 0) goto L_0x021f
            long r4 = r4.f176818j1
            long r6 = f159368S0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x021f
            r4 = 1
            goto L_0x0220
        L_0x021f:
            r4 = 0
        L_0x0220:
            if (r4 == 0) goto L_0x023b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "validCore key:"
            r4.append(r5)
            long r5 = f159368S0
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r4)
            r4 = 0
            goto L_0x023c
        L_0x023b:
            r4 = 1
        L_0x023c:
            if (r4 != 0) goto L_0x023f
            goto L_0x0247
        L_0x023f:
            cj1.i r0 = f159384o
            if (r0 == 0) goto L_0x03d8
            r0.f153504b = r3
            goto L_0x03d8
        L_0x0247:
            com.tencent.mm.plugin.finder.live.view.b r4 = f159379g
            if (r4 == 0) goto L_0x0256
            android.content.Context r4 = r4.getContext()
            if (r4 == 0) goto L_0x0256
            java.lang.Object r4 = r4.getSystemService(r14)
            goto L_0x0257
        L_0x0256:
            r4 = 0
        L_0x0257:
            boolean r5 = r4 instanceof android.telephony.TelephonyManager
            if (r5 == 0) goto L_0x025e
            android.telephony.TelephonyManager r4 = (android.telephony.TelephonyManager) r4
            goto L_0x025f
        L_0x025e:
            r4 = 0
        L_0x025f:
            if (r4 == 0) goto L_0x02b5
            rx3.g r5 = f159370U
            rx3.n r5 = (rx3.C36570n) r5
            java.lang.Object r5 = r5.getValue()
            android.telephony.PhoneStateListener r5 = (android.telephony.PhoneStateListener) r5
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r16)
            r6.mo10233c(r7)
            r6.mo10233c(r5)
            java.lang.Object[] r18 = r6.mo10232b()
            java.lang.String r19 = "com/tencent/mm/plugin/finder/live/model/FinderLiveService"
            java.lang.String r20 = "bindNormalLive"
            java.lang.String r21 = "(Lcom/tencent/mm/plugin/finder/live/model/context/LiveBuContext;Lcom/tencent/mm/plugin/finder/live/controller/base/LiveRoomControllerStore;Lcom/tencent/mm/plugin/finder/live/view/FinderBaseLivePluginLayout;Lcom/tencent/mm/protocal/protobuf/FinderReportContextObj;)V"
            java.lang.String r22 = "android/telephony/TelephonyManager_EXEC_"
            java.lang.String r23 = "listen"
            java.lang.String r24 = "(Landroid/telephony/PhoneStateListener;I)V"
            r17 = r4
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            r5 = 0
            java.lang.Object r7 = r6.mo10231a(r5)
            android.telephony.PhoneStateListener r7 = (android.telephony.PhoneStateListener) r7
            r5 = 1
            java.lang.Object r6 = r6.mo10231a(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r5 = r6.intValue()
            r4.listen(r7, r5)
            java.lang.String r18 = "com/tencent/mm/plugin/finder/live/model/FinderLiveService"
            java.lang.String r19 = "bindNormalLive"
            java.lang.String r20 = "(Lcom/tencent/mm/plugin/finder/live/model/context/LiveBuContext;Lcom/tencent/mm/plugin/finder/live/controller/base/LiveRoomControllerStore;Lcom/tencent/mm/plugin/finder/live/view/FinderBaseLivePluginLayout;Lcom/tencent/mm/protocal/protobuf/FinderReportContextObj;)V"
            java.lang.String r21 = "android/telephony/TelephonyManager_EXEC_"
            java.lang.String r22 = "listen"
            java.lang.String r23 = "(Landroid/telephony/PhoneStateListener;I)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
        L_0x02b5:
            pe1.c<java.lang.Long> r4 = gg1.C32444a.f86177o
            java.lang.Object r4 = r4.mo60266n()
            java.lang.Number r4 = (java.lang.Number) r4
            long r4 = r4.longValue()
            cj1.C54749e2.f153457a = r4
            pe1.c<java.lang.Integer> r4 = gg1.C32444a.f86181p
            java.lang.Object r4 = r4.mo60266n()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r5 = 1
            if (r4 != r5) goto L_0x02d4
            r4 = 1
            goto L_0x02d5
        L_0x02d4:
            r4 = 0
        L_0x02d5:
            cj1.C54749e2.f153459c = r4
            r25.mo77617T()
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.VoipEvent> r4 = f159367S
            r4.alive()
            com.tencent.mm.sdk.event.IListener<?> r4 = f159369T
            r4.alive()
            r25.mo77613P(r26)
            fj1.b$a r4 = fj1.C45795b.f123697j
            r4.mo58474a(r1)
            r0.mo77612O(r2)
            ok1.e r4 = ok1.C62042e.f176370a
            r4.getClass()
            boolean r6 = r3 instanceof com.tencent.p014mm.plugin.finder.live.view.C56061i
            if (r6 != 0) goto L_0x02fe
            boolean r6 = r3 instanceof com.tencent.p014mm.plugin.finder.live.view.C56074k
            if (r6 == 0) goto L_0x02fd
            goto L_0x02fe
        L_0x02fd:
            r5 = 0
        L_0x02fe:
            f159380h = r5
            if (r5 == 0) goto L_0x0363
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "bindNormalLive: secondaryDeviceFlag = "
            r5.append(r6)
            androidx.lifecycle.i0 r6 = r1.mo71262a(r10)
            cl1.o r6 = (cl1.C54991o) r6
            int r6 = r6.mo75979Q3()
            r5.append(r6)
            java.lang.String r6 = ", externalPost = "
            r5.append(r6)
            androidx.lifecycle.i0 r6 = r1.mo71262a(r10)
            cl1.o r6 = (cl1.C54991o) r6
            boolean r6 = r6.f154301c3
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r5)
            boolean r5 = r4.mo87073d1(r1)
            if (r5 != 0) goto L_0x0347
            c50.b r5 = c50.C54655b.f153178f1
            if (r5 != 0) goto L_0x0341
            c50.b r5 = new c50.b
            r5.<init>()
            c50.C54655b.f153178f1 = r5
        L_0x0341:
            c50.b r5 = c50.C54655b.f153178f1
            gy3.C87412m.m108591d(r5)
            goto L_0x035d
        L_0x0347:
            i50.a r5 = i50.C60251a.f171781k1
            if (r5 != 0) goto L_0x0358
            r5 = 0
            java.lang.Object[] r6 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printInfoStack(r13, r11, r6)
            i50.a r5 = new i50.a
            r5.<init>()
            i50.C60251a.f171781k1 = r5
        L_0x0358:
            i50.a r5 = i50.C60251a.f171781k1
            gy3.C87412m.m108591d(r5)
        L_0x035d:
            r5.f173038x = r0
            r9 = r5
            r5 = r31
            goto L_0x0383
        L_0x0363:
            r5 = r31
            androidx.lifecycle.i0 r6 = r1.mo71262a(r5)
            cl1.u r6 = (cl1.C55001u) r6
            te3.c21 r6 = r6.f154420q
            long r6 = r6.f182392d
            p50.a$a r8 = p50.C62193a.f176816k1
            p50.a r9 = r8.mo87261b(r6)
            r8.mo87263d(r6)
            uk1.a r6 = f159381i
            j50.v r6 = r6.f188211e
            java.lang.String r7 = "callback"
            gy3.C87412m.m108594g(r6, r7)
            r9.f173029p = r6
        L_0x0383:
            f159378f = r9
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "bindNormalLive liveId: "
            r6.append(r7)
            androidx.lifecycle.i0 r5 = r1.mo71262a(r5)
            cl1.u r5 = (cl1.C55001u) r5
            te3.c21 r5 = r5.f154420q
            long r7 = r5.f182392d
            r6.append(r7)
            java.lang.String r5 = " finderBaseLayout: "
            r6.append(r5)
            r6.append(r3)
            java.lang.String r5 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r5)
            r5 = 0
            r4.mo87064a2(r5, r5)
            uk1.a r4 = f159381i
            boolean r5 = f159380h
            com.tencent.mm.plugin.finder.live.view.FinderLiveMiniView r4 = r4.mo89485c(r1, r5)
            j50.a r5 = f159378f
            if (r5 == 0) goto L_0x03c0
            r50.f r5 = r5.f173028o
            r5.mo88277g(r4)
        L_0x03c0:
            boolean r4 = f159380h
            if (r4 == 0) goto L_0x03cf
            r25.mo77616S()
            cj1.i r0 = new cj1.i
            r0.<init>(r1, r3)
            f159384o = r0
            goto L_0x03d8
        L_0x03cf:
            zt3.t r0 = zt3.C119157j.f356862d
            cj1.o4 r4 = cj1.C54798o4.f153620d
            zt3.j r0 = (zt3.C119157j) r0
            r0.mo183875f(r4)
        L_0x03d8:
            cj1.z3 r0 = f159383n
            r0.getClass()
            com.tencent.mm.sdk.platformtools.MMHandler r4 = r0.f153758g
            cj1.b4 r5 = new cj1.b4
            r5.<init>(r0, r1)
            r4.post(r5)
        L_0x03e7:
            gh1.j r0 = gh1.C59447j.f169870a
            ks3.l r1 = r0.mo84551c(r3)
            r0.mo84552d(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.m63770d(com.tencent.mm.plugin.finder.live.model.FinderLiveService, fj1.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore, com.tencent.mm.plugin.finder.live.view.b, int, te3.hj1, int, java.lang.Object):void");
    }

    /* renamed from: A */
    public final void mo77600A(C54768h6 h6Var, int i, boolean z, C32224a<C13598b0> aVar) {
        C87412m.m108594g(h6Var, "musicItem");
        Log.m105924i("Finder.FinderLiveService", "playMusic " + h6Var + ", forcePlay:" + z + ", stack:" + Util.getStack());
        C51922x41 x412 = h6Var.f153498a;
        String str = x412.f144449n;
        int i2 = x412.f144442d;
        if (x412.f144448j) {
            if (!(str == null || str.length() == 0)) {
                C60735a c = mo77627c();
                C54991o oVar = (C54991o) mo77630e(C54991o.class);
                Object obj = null;
                if (oVar != null) {
                    if (c != null) {
                        obj = Boolean.valueOf(c.f172995G);
                    }
                    if (z || !C87412m.m108589b(obj, Boolean.TRUE)) {
                        C54754f fVar = oVar.f154232N2;
                        if (fVar != null) {
                            fVar.mo75651h(h6Var, i);
                        }
                        if (aVar != null) {
                            aVar.invoke();
                        } else {
                            FinderLiveService finderLiveService = f159376d;
                            if (c != null) {
                                c.mo75211A(i2, str, true, 0, finderLiveService);
                            }
                        }
                    }
                    obj = C13598b0.f38549a;
                }
                if (obj == null) {
                    Log.m105920e("Finder.FinderLiveService", "playMusic error curLiveRoomData is null!");
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r1 = r1.f154232N2;
     */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo77601B(boolean r10) {
        /*
            r9 = this;
            java.lang.Class<cl1.o> r0 = cl1.C54991o.class
            androidx.lifecycle.i0 r1 = r9.mo77630e(r0)
            cl1.o r1 = (cl1.C54991o) r1
            r2 = 0
            if (r1 == 0) goto L_0x0014
            cj1.f r1 = r1.f154232N2
            if (r1 == 0) goto L_0x0014
            cj1.h6 r1 = r1.mo75646c()
            goto L_0x0015
        L_0x0014:
            r1 = r2
        L_0x0015:
            fj1.b r3 = f159348A
            r4 = 0
            if (r3 == 0) goto L_0x008e
            if (r1 == 0) goto L_0x008e
            androidx.lifecycle.i0 r5 = r3.mo71262a(r0)
            cl1.o r5 = (cl1.C54991o) r5
            cj1.f r5 = r5.f154232N2
            if (r5 == 0) goto L_0x0035
            androidx.lifecycle.i0 r6 = r3.mo71262a(r0)
            cl1.o r6 = (cl1.C54991o) r6
            cj1.f r6 = r6.f154232N2
            int r6 = r6.f153467d
            rx3.l r5 = r5.mo75645b(r1, r6)
            goto L_0x0036
        L_0x0035:
            r5 = r2
        L_0x0036:
            if (r5 == 0) goto L_0x0065
            A r6 = r5.f38555d
            cj1.h6 r6 = (cj1.C54768h6) r6
            if (r6 == 0) goto L_0x0065
            ok1.e r7 = ok1.C62042e.f176370a
            boolean r7 = r7.mo87024M0(r3)
            if (r7 == 0) goto L_0x0051
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r7 = f159376d
            wg1.v r7 = r7.mo77637k()
            if (r7 == 0) goto L_0x0051
            r7.mo89989D0(r6)
        L_0x0051:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r7 = f159376d
            B r5 = r5.f38556e
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r8 = 1
            r7.mo77600A(r6, r5, r8, r2)
            r7.mo77651y(r10)
            rx3.b0 r5 = rx3.C13598b0.f38549a
            goto L_0x0066
        L_0x0065:
            r5 = r2
        L_0x0066:
            if (r5 != 0) goto L_0x008b
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r5 = f159376d
            androidx.lifecycle.i0 r6 = r3.mo71262a(r0)
            cl1.o r6 = (cl1.C54991o) r6
            cj1.f r6 = r6.f154232N2
            androidx.lifecycle.i0 r3 = r3.mo71262a(r0)
            cl1.o r3 = (cl1.C54991o) r3
            cj1.f r3 = r3.f154232N2
            int r3 = r3.f153467d
            r6.mo75652i(r1, r3)
            r5.mo77651y(r10)
            c50.b r1 = r5.mo77626b()
            if (r1 != 0) goto L_0x0089
            goto L_0x008b
        L_0x0089:
            r1.f172995G = r4
        L_0x008b:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x008f
        L_0x008e:
            r1 = r2
        L_0x008f:
            if (r1 != 0) goto L_0x00cd
            r9.mo77651y(r10)
            c50.b r10 = r9.mo77626b()
            if (r10 != 0) goto L_0x009b
            goto L_0x009d
        L_0x009b:
            r10.f172995G = r4
        L_0x009d:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r1 = "playNext error curMusicItem:"
            r10.append(r1)
            androidx.lifecycle.i0 r0 = r9.mo77630e(r0)
            cl1.o r0 = (cl1.C54991o) r0
            if (r0 == 0) goto L_0x00b7
            cj1.f r0 = r0.f154232N2
            if (r0 == 0) goto L_0x00b7
            cj1.h6 r2 = r0.mo75646c()
        L_0x00b7:
            r10.append(r2)
            java.lang.String r0 = ",curLiveRoomData:"
            r10.append(r0)
            fj1.b r0 = f159348A
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            java.lang.String r0 = "Finder.FinderLiveService"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r10)
        L_0x00cd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.mo77601B(boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo77602C(boolean r6, fy3.C32231t<? super java.lang.Boolean, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.String, ? super android.os.Bundle, ? super te3.C49291ej0, rx3.C13598b0> r7, wx3.C15601d<? super rx3.C13598b0> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.C55927m
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.tencent.mm.plugin.finder.live.model.FinderLiveService$m r0 = (com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.C55927m) r0
            int r1 = r0.f159408f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f159408f = r1
            goto L_0x0018
        L_0x0013:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService$m r0 = new com.tencent.mm.plugin.finder.live.model.FinderLiveService$m
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f159406d
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f159408f
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x0046
        L_0x0027:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x002f:
            kotlin.ResultKt.throwOnFailure(r8)
            fj1.b r8 = f159348A
            if (r8 == 0) goto L_0x0046
            ok1.e r2 = ok1.C62042e.f176370a
            com.tencent.mm.plugin.finder.live.model.FinderLiveService$n r4 = new com.tencent.mm.plugin.finder.live.model.FinderLiveService$n
            r4.<init>(r8, r6, r7)
            r0.f159408f = r3
            java.lang.Object r6 = r2.mo87107p1(r8, r4, r0)
            if (r6 != r1) goto L_0x0046
            return r1
        L_0x0046:
            rx3.b0 r6 = rx3.C13598b0.f38549a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.mo77602C(boolean, fy3.t, wx3.d):java.lang.Object");
    }

    /* renamed from: D */
    public final void mo77603D(C64293cq2 cq22, TRTCCloudDef.TRTCParams tRTCParams, C58113g gVar) {
        C55001u uVar = (C55001u) mo77630e(C55001u.class);
        if (uVar != null) {
            uVar.mo76032F3(cq22.f182554d);
        }
        mo77604E(cq22.f182554d);
        C52151yp2 yp22 = cq22.f182555e;
        if (yp22 != null) {
            if (yp22.f145455d > 0) {
                C60971a.C60973b.f173670a.mo85944a().f174703f = yp22.f145455d;
            }
            Log.m105924i("Finder.FinderLiveService", "processLiveAudioSdkParam audioQuality:" + yp22.f145455d);
        }
        C64890zp2 zp22 = cq22.f182556f;
        if (zp22 != null && tRTCParams != null && gVar != null) {
            Log.m105924i("Finder.FinderLiveService", "userDefineRecordId:" + zp22.f186806d + ',' + zp22.f186807e);
            String str = zp22.f186807e;
            String str2 = zp22.f186806d;
            int i = zp22.f186817q;
            String str3 = zp22.f186796Q;
            if (!((C36594q) C86312j.m106911c(C36594q.class)).mo60733UY(5)) {
                i = zp22.f186818r;
            }
            gVar.f166239i = zp22.f186818r;
            if (i < 100) {
                gVar.f166237g = C58107a.MMLiveStreamSwitchMode_Fixed;
                gVar.f166238h = i;
            } else if (i == 101) {
                gVar.f166237g = C58107a.MMLiveStreamSwitchMode_Auto;
            } else if (i == 102) {
                gVar.f166237g = C58107a.MMLiveStreamSwitchMode_ML;
            }
            LinkedList<C64733to> linkedList = zp22.f186812j;
            if (!(linkedList == null || linkedList.isEmpty())) {
                LinkedList<C64733to> linkedList2 = zp22.f186812j;
                C87412m.m108593f(linkedList2, "channelParams.cdn_trans_info");
                for (C64733to toVar : linkedList2) {
                    HashMap<Integer, C7170j> hashMap = gVar.f166241k;
                    Integer valueOf = Integer.valueOf(toVar.f185623f);
                    String str4 = toVar.f185622e;
                    C87412m.m108593f(str4, "it.url");
                    hashMap.put(valueOf, new C7170j(str4, toVar.f185627j, toVar.f185628n));
                }
            }
            if (!Util.isNullOrNil(str) || !Util.isNullOrNil(str2) || !Util.isNullOrNil(str3)) {
                C104289g gVar2 = new C104289g();
                if (!Util.isNullOrNil(str)) {
                    gVar2.put("userdefine_streamid_main", str);
                }
                if (!Util.isNullOrNil(str2)) {
                    gVar2.put("userdefine_record_id", str2);
                }
                if (!Util.isNullOrNil(str3)) {
                    gVar2.put("userdefine_push_args", str3);
                }
                C104289g gVar3 = new C104289g();
                gVar3.put("Str_uc_params", gVar2);
                tRTCParams.businessInfo = gVar3.toString();
            }
            Log.m105924i("Finder.FinderLiveService", "processLiveSdkParams cdnQualitySvrcfg" + gVar.f166238h + " cdnSwitchMode:" + gVar.f166237g + " cdn_quality_h265backcfg:" + gVar.f166239i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0027, code lost:
        r6 = (r6 = r6.f154421r).f166250a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01bc  */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo77604E(te3.C64323dq2 r20) {
        /*
            r19 = this;
            r0 = r20
            java.lang.Class<cl1.u> r1 = cl1.C55001u.class
            java.lang.Class<cl1.d0> r2 = cl1.C54963d0.class
            if (r0 == 0) goto L_0x03da
            com.tencent.mm.plugin.finder.live.model.FinderLiveService$e r3 = new com.tencent.mm.plugin.finder.live.model.FinderLiveService$e
            int r4 = r0.f182804d
            int r5 = r0.f182806f
            int r6 = r0.f182807g
            int r7 = r0.f182814q
            r3.<init>(r4, r5, r6, r7)
            n50.c r4 = n50.C61620c.C61622b.f175234a
            java.util.ArrayList<n50.b> r4 = r4.f175229a
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r5 = f159376d
            androidx.lifecycle.i0 r6 = r5.mo77630e(r1)
            cl1.u r6 = (cl1.C55001u) r6
            if (r6 == 0) goto L_0x002e
            d50.h r6 = r6.f154421r
            if (r6 == 0) goto L_0x002e
            com.tencent.trtc.TRTCCloudDef$TRTCParams r6 = r6.f166250a
            if (r6 == 0) goto L_0x002e
            java.lang.String r6 = r6.userId
            goto L_0x002f
        L_0x002e:
            r6 = 0
        L_0x002f:
            androidx.lifecycle.i0 r8 = r5.mo77630e(r2)
            cl1.d0 r8 = (cl1.C54963d0) r8
            if (r8 == 0) goto L_0x003e
            boolean r8 = r8.f154053G
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            goto L_0x003f
        L_0x003e:
            r8 = 0
        L_0x003f:
            androidx.lifecycle.i0 r9 = r5.mo77630e(r2)
            cl1.d0 r9 = (cl1.C54963d0) r9
            if (r9 == 0) goto L_0x0050
            java.util.List<al1.j> r9 = r9.f154074q
            if (r9 == 0) goto L_0x0050
            int r9 = r9.size()
            goto L_0x0051
        L_0x0050:
            r9 = 0
        L_0x0051:
            androidx.lifecycle.i0 r11 = r5.mo77630e(r1)
            cl1.u r11 = (cl1.C55001u) r11
            if (r11 == 0) goto L_0x005d
            java.util.HashMap<java.lang.Integer, te3.nr4> r11 = r11.f154427x
            if (r11 != 0) goto L_0x0062
        L_0x005d:
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
        L_0x0062:
            boolean r12 = f159380h
            r13 = 2
            r14 = 4
            r15 = 3
            r7 = 1
            if (r12 == 0) goto L_0x0113
            java.lang.String r2 = "micUserList"
            gy3.C87412m.m108593f(r4, r2)
            androidx.lifecycle.i0 r1 = r5.mo77630e(r1)
            cl1.u r1 = (cl1.C55001u) r1
            if (r1 == 0) goto L_0x0086
            te3.bq2 r1 = r1.f154419p
            if (r1 == 0) goto L_0x0086
            int r1 = r1.f182314f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = r1.toString()
            goto L_0x0087
        L_0x0086:
            r1 = 0
        L_0x0087:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r2 = gy3.C87412m.m108589b(r8, r2)
            if (r2 == 0) goto L_0x00cf
            java.util.Iterator r2 = r4.iterator()
            r12 = 0
        L_0x0094:
            boolean r15 = r2.hasNext()
            if (r15 == 0) goto L_0x00ab
            java.lang.Object r15 = r2.next()
            n50.b r15 = (n50.C61619b) r15
            java.lang.String r15 = r15.f175226i
            boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r1, (java.lang.String) r15)
            if (r15 == 0) goto L_0x0094
            int r12 = r12 + 1
            goto L_0x0094
        L_0x00ab:
            boolean r1 = r5.mo77641o()
            if (r1 == 0) goto L_0x00bf
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            java.lang.Object r1 = r11.get(r1)
            te3.nr4 r1 = (te3.nr4) r1
            r5.mo77629d0(r3, r1)
            goto L_0x00de
        L_0x00bf:
            if (r12 < r7) goto L_0x00de
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            java.lang.Object r1 = r11.get(r1)
            te3.nr4 r1 = (te3.nr4) r1
            r5.mo77629d0(r3, r1)
            goto L_0x00de
        L_0x00cf:
            if (r9 < r15) goto L_0x00de
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            java.lang.Object r1 = r11.get(r1)
            te3.nr4 r1 = (te3.nr4) r1
            r5.mo77629d0(r3, r1)
        L_0x00de:
            java.lang.String r1 = "Finder.FinderLiveService"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "processLiveVideoSdkParam for anchor. isRoomPk:"
            r2.append(r5)
            r2.append(r8)
            java.lang.String r5 = " micUserList.size:"
            r2.append(r5)
            int r4 = r4.size()
            r2.append(r4)
            java.lang.String r4 = " curAudienceMicCount:"
            r2.append(r4)
            r2.append(r9)
            java.lang.String r4 = "  selfUserId:"
            r2.append(r4)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            r12 = 1
            goto L_0x02c2
        L_0x0113:
            androidx.lifecycle.i0 r1 = r5.mo77630e(r2)
            cl1.d0 r1 = (cl1.C54963d0) r1
            if (r1 == 0) goto L_0x0142
            java.util.List<al1.j> r1 = r1.f154074q
            if (r1 == 0) goto L_0x0142
            monitor-enter(r1)
            java.util.Iterator r5 = r1.iterator()     // Catch:{ all -> 0x013f }
        L_0x0124:
            boolean r12 = r5.hasNext()     // Catch:{ all -> 0x013f }
            if (r12 == 0) goto L_0x013a
            java.lang.Object r12 = r5.next()     // Catch:{ all -> 0x013f }
            r10 = r12
            al1.j r10 = (al1.C54130j) r10     // Catch:{ all -> 0x013f }
            java.lang.String r10 = r10.f151997a     // Catch:{ all -> 0x013f }
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r6, (java.lang.String) r10)     // Catch:{ all -> 0x013f }
            if (r10 == 0) goto L_0x0124
            goto L_0x013b
        L_0x013a:
            r12 = 0
        L_0x013b:
            monitor-exit(r1)
            al1.j r12 = (al1.C54130j) r12
            goto L_0x0143
        L_0x013f:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0142:
            r12 = 0
        L_0x0143:
            if (r12 == 0) goto L_0x0147
            r1 = 1
            goto L_0x0148
        L_0x0147:
            r1 = 0
        L_0x0148:
            if (r1 == 0) goto L_0x0287
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r5 = f159376d
            if (r6 != 0) goto L_0x0151
            java.lang.String r10 = ""
            goto L_0x0152
        L_0x0151:
            r10 = r6
        L_0x0152:
            r5.getClass()
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            boolean r12 = gy3.C87412m.m108589b(r8, r12)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r13)
            if (r12 == 0) goto L_0x0279
            boolean r12 = r5.mo77643q()
            if (r12 == 0) goto L_0x01d8
            androidx.lifecycle.i0 r2 = r5.mo77630e(r2)
            cl1.d0 r2 = (cl1.C54963d0) r2
            if (r2 == 0) goto L_0x01aa
            com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData<gi1.c> r2 = r2.f154077t
            if (r2 == 0) goto L_0x01aa
            java.lang.Object r2 = r2.getValue()
            gi1.c r2 = (gi1.C59464c) r2
            if (r2 == 0) goto L_0x01aa
            java.util.LinkedList<gi1.a> r2 = r2.f169896a
            if (r2 == 0) goto L_0x01aa
            java.util.Iterator r2 = r2.iterator()
        L_0x0183:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x019b
            java.lang.Object r7 = r2.next()
            r12 = r7
            gi1.a r12 = (gi1.C59463a) r12
            java.lang.String r12 = r12.mo84561a()
            boolean r12 = gy3.C87412m.m108589b(r12, r10)
            if (r12 == 0) goto L_0x0183
            goto L_0x019c
        L_0x019b:
            r7 = 0
        L_0x019c:
            gi1.a r7 = (gi1.C59463a) r7
            if (r7 == 0) goto L_0x01aa
            gi1.f r2 = r7.f169895b
            if (r2 == 0) goto L_0x01aa
            int r2 = r2.f169903g
            if (r2 != r13) goto L_0x01aa
            r2 = 1
            goto L_0x01ab
        L_0x01aa:
            r2 = 0
        L_0x01ab:
            if (r2 == 0) goto L_0x01bc
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)
            java.lang.Object r2 = r11.get(r2)
            te3.nr4 r2 = (te3.nr4) r2
            r5.mo77629d0(r3, r2)
            goto L_0x0287
        L_0x01bc:
            te3.nr4 r2 = new te3.nr4
            r2.<init>()
            int r7 = r0.f182804d
            r2.f184549d = r7
            int r7 = r0.f182806f
            r2.f184550e = r7
            int r7 = r0.f182807g
            r2.f184551f = r7
            int r7 = r0.f182814q
            r2.f184552g = r7
            rx3.b0 r7 = rx3.C13598b0.f38549a
            r5.mo77629d0(r3, r2)
            goto L_0x0287
        L_0x01d8:
            boolean r10 = r5.mo77641o()
            if (r10 == 0) goto L_0x01ed
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            java.lang.Object r2 = r11.get(r2)
            te3.nr4 r2 = (te3.nr4) r2
            r5.mo77629d0(r3, r2)
            goto L_0x0287
        L_0x01ed:
            androidx.lifecycle.i0 r10 = r5.mo77630e(r2)
            cl1.d0 r10 = (cl1.C54963d0) r10
            if (r10 == 0) goto L_0x022d
            java.util.List<al1.j> r10 = r10.f154074q
            if (r10 == 0) goto L_0x022d
            monitor-enter(r10)
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x022a }
            r12.<init>()     // Catch:{ all -> 0x022a }
            java.util.Iterator r14 = r10.iterator()     // Catch:{ all -> 0x022a }
        L_0x0203:
            boolean r17 = r14.hasNext()     // Catch:{ all -> 0x022a }
            if (r17 == 0) goto L_0x0224
            java.lang.Object r15 = r14.next()     // Catch:{ all -> 0x022a }
            r13 = r15
            al1.j r13 = (al1.C54130j) r13     // Catch:{ all -> 0x022a }
            java.lang.Boolean r13 = r13.f152016t     // Catch:{ all -> 0x022a }
            r18 = r14
            java.lang.Boolean r14 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x022a }
            boolean r13 = gy3.C87412m.m108589b(r13, r14)     // Catch:{ all -> 0x022a }
            if (r13 == 0) goto L_0x021f
            r12.add(r15)     // Catch:{ all -> 0x022a }
        L_0x021f:
            r14 = r18
            r13 = 2
            r15 = 3
            goto L_0x0203
        L_0x0224:
            monitor-exit(r10)
            int r10 = r12.size()
            goto L_0x022e
        L_0x022a:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        L_0x022d:
            r10 = 0
        L_0x022e:
            r12 = 2
            if (r10 < r12) goto L_0x0240
            r12 = 3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            java.lang.Object r2 = r11.get(r2)
            te3.nr4 r2 = (te3.nr4) r2
            r5.mo77629d0(r3, r2)
            goto L_0x0287
        L_0x0240:
            r12 = 1
            if (r10 < r12) goto L_0x0288
            androidx.lifecycle.i0 r2 = r5.mo77630e(r2)
            cl1.d0 r2 = (cl1.C54963d0) r2
            if (r2 == 0) goto L_0x0250
            al1.j r2 = r2.f154073p
            r16 = r2
            goto L_0x0252
        L_0x0250:
            r16 = 0
        L_0x0252:
            if (r16 == 0) goto L_0x025e
            java.lang.Object r2 = r11.get(r7)
            te3.nr4 r2 = (te3.nr4) r2
            r5.mo77629d0(r3, r2)
            goto L_0x0288
        L_0x025e:
            te3.nr4 r2 = new te3.nr4
            r2.<init>()
            int r7 = r0.f182804d
            r2.f184549d = r7
            int r7 = r0.f182806f
            r2.f184550e = r7
            int r7 = r0.f182807g
            r2.f184551f = r7
            int r7 = r0.f182814q
            r2.f184552g = r7
            rx3.b0 r7 = rx3.C13598b0.f38549a
            r5.mo77629d0(r3, r2)
            goto L_0x0288
        L_0x0279:
            r2 = 2
            r12 = 1
            if (r9 < r2) goto L_0x0288
            java.lang.Object r2 = r11.get(r7)
            te3.nr4 r2 = (te3.nr4) r2
            r5.mo77629d0(r3, r2)
            goto L_0x0288
        L_0x0287:
            r12 = 1
        L_0x0288:
            java.lang.String r2 = "Finder.FinderLiveService"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "processLiveVideoSdkParam for visitor. selfInMicing:"
            r5.append(r7)
            r5.append(r1)
            java.lang.String r1 = " isRoomPk:"
            r5.append(r1)
            r5.append(r8)
            java.lang.String r1 = " micUserList.size:"
            r5.append(r1)
            int r1 = r4.size()
            r5.append(r1)
            java.lang.String r1 = " curAudienceMicCount:"
            r5.append(r1)
            r5.append(r9)
            java.lang.String r1 = " selfUserId:"
            r5.append(r1)
            r5.append(r6)
            java.lang.String r1 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
        L_0x02c2:
            int r1 = r3.f81125a
            if (r1 > 0) goto L_0x02ca
            int r1 = r0.f182804d
            r3.f81125a = r1
        L_0x02ca:
            int r1 = r3.f81126b
            if (r1 > 0) goto L_0x02d2
            int r1 = r0.f182806f
            r3.f81126b = r1
        L_0x02d2:
            int r1 = r3.f81127c
            if (r1 > 0) goto L_0x02da
            int r1 = r0.f182807g
            r3.f81127c = r1
        L_0x02da:
            int r1 = r3.f81128d
            if (r1 > 0) goto L_0x02e2
            int r1 = r0.f182814q
            r3.f81128d = r1
        L_0x02e2:
            int r1 = r3.f81125a
            if (r1 <= 0) goto L_0x02f0
            k50.a r1 = k50.C60971a.C60973b.f173670a
            m50.e r1 = r1.mo85947d()
            int r2 = r3.f81125a
            r1.f174711d = r2
        L_0x02f0:
            int r1 = r3.f81126b
            if (r1 <= 0) goto L_0x02fe
            k50.a r1 = k50.C60971a.C60973b.f173670a
            m50.e r1 = r1.mo85947d()
            int r2 = r3.f81126b
            r1.f174712e = r2
        L_0x02fe:
            int r1 = r3.f81127c
            if (r1 <= 0) goto L_0x030c
            k50.a r1 = k50.C60971a.C60973b.f173670a
            m50.e r1 = r1.mo85947d()
            int r2 = r3.f81127c
            r1.f174713f = r2
        L_0x030c:
            int r1 = r3.f81128d
            if (r1 <= 0) goto L_0x031a
            k50.a r1 = k50.C60971a.C60973b.f173670a
            m50.e r1 = r1.mo85947d()
            int r2 = r3.f81128d
            r1.f174714g = r2
        L_0x031a:
            int r1 = r0.f182816s
            if (r1 <= 0) goto L_0x0328
            k50.a r1 = k50.C60971a.C60973b.f173670a
            m50.e r1 = r1.mo85947d()
            int r2 = r0.f182816s
            r1.f174715h = r2
        L_0x0328:
            int r1 = r0.f182817t
            if (r1 <= 0) goto L_0x0336
            k50.a r1 = k50.C60971a.C60973b.f173670a
            m50.e r1 = r1.mo85947d()
            int r2 = r0.f182817t
            r1.f174716i = r2
        L_0x0336:
            int r1 = r0.f182818u
            if (r1 <= 0) goto L_0x0344
            k50.a r1 = k50.C60971a.C60973b.f173670a
            m50.e r1 = r1.mo85947d()
            int r2 = r0.f182818u
            r1.f174717j = r2
        L_0x0344:
            int r1 = r0.f182819v
            if (r1 <= 0) goto L_0x0352
            k50.a r1 = k50.C60971a.C60973b.f173670a
            m50.e r1 = r1.mo85947d()
            int r2 = r0.f182819v
            r1.f174718n = r2
        L_0x0352:
            int r1 = r0.f182809i
            if (r1 <= 0) goto L_0x0360
            k50.a r1 = k50.C60971a.C60973b.f173670a
            m50.e r1 = r1.mo85947d()
            int r2 = r0.f182809i
            r1.f174720p = r2
        L_0x0360:
            int r1 = r0.f182810j
            if (r1 < 0) goto L_0x0369
            r2 = 2
            if (r1 >= r2) goto L_0x0369
            r10 = 1
            goto L_0x036a
        L_0x0369:
            r10 = 0
        L_0x036a:
            if (r10 == 0) goto L_0x0376
            k50.a r1 = k50.C60971a.C60973b.f173670a
            m50.e r1 = r1.mo85947d()
            int r2 = r0.f182810j
            r1.f174719o = r2
        L_0x0376:
            java.lang.String r1 = "Finder.FinderLiveService"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "processLiveVideoSdkParam encResEnum:"
            r2.append(r4)
            int r4 = r3.f81125a
            r2.append(r4)
            java.lang.String r4 = ", capFps:"
            r2.append(r4)
            int r4 = r3.f81126b
            r2.append(r4)
            java.lang.String r4 = ", encBR:"
            r2.append(r4)
            int r4 = r3.f81127c
            r2.append(r4)
            java.lang.String r4 = ", encBRMin:"
            r2.append(r4)
            int r3 = r3.f81128d
            r2.append(r3)
            java.lang.String r3 = ", qosPreferneceEnum:"
            r2.append(r3)
            int r3 = r0.f182809i
            r2.append(r3)
            java.lang.String r3 = ", qosControlModeEnum:"
            r2.append(r3)
            int r0 = r0.f182810j
            r2.append(r0)
            java.lang.String r0 = " isMicFocusMode: "
            r2.append(r0)
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r0 = f159376d
            boolean r3 = r0.mo77643q()
            r2.append(r3)
            java.lang.String r3 = " isGirdMicMode: "
            r2.append(r3)
            boolean r0 = r0.mo77641o()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
        L_0x03da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.mo77604E(te3.dq2):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x001d, code lost:
        r1 = r1.f154420q;
     */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo77605F(long r6) {
        /*
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "refreshMic delay:"
            r0.append(r1)
            r0.append(r6)
            java.lang.String r1 = " curLive:"
            r0.append(r1)
            java.lang.Class<cl1.u> r1 = cl1.C55001u.class
            androidx.lifecycle.i0 r1 = r5.mo77630e(r1)
            cl1.u r1 = (cl1.C55001u) r1
            r2 = 0
            if (r1 == 0) goto L_0x0028
            te3.c21 r1 = r1.f154420q
            if (r1 == 0) goto L_0x0028
            long r3 = r1.f182392d
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            goto L_0x0029
        L_0x0028:
            r1 = r2
        L_0x0029:
            r0.append(r1)
            java.lang.String r1 = " curLinkUser:"
            r0.append(r1)
            java.lang.Class<cl1.d0> r1 = cl1.C54963d0.class
            androidx.lifecycle.i0 r1 = r5.mo77630e(r1)
            cl1.d0 r1 = (cl1.C54963d0) r1
            if (r1 == 0) goto L_0x003d
            al1.j r2 = r1.f154073p
        L_0x003d:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Finder.FinderLiveService"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            cj1.j6 r0 = f159397y0
            if (r0 == 0) goto L_0x0054
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r0.mo56067c(r6)
        L_0x0054:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.mo77605F(long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004d, code lost:
        r2 = r2.f172989A;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007a  */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo77606G() {
        /*
            r10 = this;
            uk1.a r0 = f159381i
            com.tencent.mm.plugin.finder.live.view.FinderLiveMiniView r0 = r0.f188207a
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r1 = f159376d
            r1.getClass()
            fj1.b r4 = f159348A
            if (r0 == 0) goto L_0x002f
            if (r4 == 0) goto L_0x002f
            boolean r1 = r0.f159790n
            if (r1 != 0) goto L_0x002f
            com.tencent.mm.plugin.finder.live.view.mini.FinderMiniWindowFloatLayout r0 = r0.getMultiAreaLayout()
            iq3.b r0 = r0.getAdapter()
            java.lang.String r1 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.mini.FinderMiniWindowFloatLayoutAdapter"
            gy3.C87412m.m108592e(r0, r1)
            r2 = r0
            uk1.j r2 = (uk1.C65409j) r2
            r3 = 0
            int r5 = uk1.C65409j.f188221v
            org.json.JSONObject r6 = uk1.C65409j.f188222w
            r7 = 0
            r8 = 16
            r9 = 0
            uk1.C65409j.m77016m(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x002f:
            j50.a r0 = f159378f
            r1 = 0
            if (r0 == 0) goto L_0x0046
            r50.c$a r0 = r50.C63363c.C63364a.f179734a
            r0.getClass()
            r50.c r0 = r50.C63363c.C63364a.f179735b
            xv0.c r0 = r0.f179732a
            com.tencent.mm.plugin.ball.model.BallInfo r0 = r0.mo90534J()
            if (r0 == 0) goto L_0x0046
            android.graphics.Point r0 = r0.f311690h
            goto L_0x0047
        L_0x0046:
            r0 = r1
        L_0x0047:
            j50.a r2 = f159378f
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0059
            d50.i r2 = r2.f172989A
            if (r2 == 0) goto L_0x0059
            boolean r2 = r2.mo82880b()
            if (r2 != r4) goto L_0x0059
            r2 = 1
            goto L_0x005a
        L_0x0059:
            r2 = 0
        L_0x005a:
            if (r2 == 0) goto L_0x005e
            r2 = 2
            goto L_0x005f
        L_0x005e:
            r2 = 1
        L_0x005f:
            uk1.a r5 = f159381i
            uk1.g r5 = r5.f188208b
            if (r0 != 0) goto L_0x006e
            android.graphics.Point r0 = new android.graphics.Point
            r6 = 200(0xc8, float:2.8E-43)
            r7 = 100
            r0.<init>(r6, r7)
        L_0x006e:
            r5.getClass()
            ok1.e r6 = ok1.C62042e.f176370a
            boolean r6 = r6.mo87027N0()
            if (r6 == 0) goto L_0x007a
            goto L_0x00be
        L_0x007a:
            r6 = 0
            r5.f99029a = r6
            r5.f99030b = r3
            r5.f99031c = r4
            r5.f99032d = r1
            long r6 = eb0.C31543z5.m39453c()
            r5.f99033e = r6
            r5.f99029a = r6
            r5.f99030b = r3
            r5.f99031c = r2
            r5.f99032d = r0
            zt3.t r1 = zt3.C119157j.f356862d
            uk1.f r3 = new uk1.f
            r3.<init>(r5)
            r5 = 1000(0x3e8, double:4.94E-321)
            zt3.j r1 = (zt3.C119157j) r1
            r1.mo183878i(r3, r5)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "enter liveType:"
            r1.append(r3)
            r1.append(r2)
            java.lang.String r2 = ", size:"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "Finder.FinderLiveMiniWindowReporter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
        L_0x00be:
            t91.c$a r0 = t91.C64208c.f181951a
            t91.C64208c.f181948O = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.mo77606G():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        r0 = (r0 = (r0 = (fh1.C59062p2) r0.controller(fh1.C59062p2.class)).mo84269F3()).f170139y;
     */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo77607H(android.graphics.Point r8) {
        /*
            r7 = this;
            java.lang.String r0 = "size"
            gy3.C87412m.m108594g(r8, r0)
            fj1.b r3 = f159348A
            if (r3 == 0) goto L_0x003b
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r0 = f159349B
            r1 = 0
            if (r0 == 0) goto L_0x0028
            java.lang.Class<fh1.p2> r2 = fh1.C59062p2.class
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController r0 = r0.controller(r2)
            fh1.p2 r0 = (fh1.C59062p2) r0
            if (r0 == 0) goto L_0x0028
            gk1.a r0 = r0.mo84269F3()
            if (r0 == 0) goto L_0x0028
            com.tencent.mm.view.ratio.RatioLayout r0 = r0.f170139y
            if (r0 == 0) goto L_0x0028
            iq3.b r0 = r0.getAdapter()
            goto L_0x0029
        L_0x0028:
            r0 = r1
        L_0x0029:
            boolean r2 = r0 instanceof uk1.C65409j
            if (r2 == 0) goto L_0x0030
            uk1.j r0 = (uk1.C65409j) r0
            r1 = r0
        L_0x0030:
            if (r1 == 0) goto L_0x003b
            r2 = 0
            int r4 = uk1.C65409j.f188221v
            org.json.JSONObject r5 = uk1.C65409j.f188222w
            r6 = r8
            r1.mo89491l(r2, r3, r4, r5, r6)
        L_0x003b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.mo77607H(android.graphics.Point):void");
    }

    /* renamed from: K */
    public final void mo77608K() {
        Log.m105924i("Finder.FinderLiveService", "requestAudioFocus audioFocusSession:" + f159388r);
        C34767b.C34768c el = ((C34767b) C86312j.m106911c(C34767b.class)).mo34192el(C34767b.C34769b.C34771d.f93454c, new C55930p());
        f159388r = el;
        boolean z = true;
        if (el == null || !el.mo34198a()) {
            z = false;
        }
        if (!z) {
            mo77648v("not gain focus");
        } else {
            mo77636j("requestAudioFocus");
        }
    }

    /* renamed from: L */
    public final void mo77609L() {
        C60735a aVar = f159378f;
        if (aVar instanceof C62197e) {
            int i = null;
            C62197e eVar = aVar instanceof C62197e ? (C62197e) aVar : null;
            if (eVar != null) {
                eVar.mo87277T0();
                i = 0;
            }
            Log.m105924i("Finder.FinderLiveService", "requestLinkMic ret:" + i);
        }
        C39981t0 t0Var = (C39981t0) mo77630e(C39981t0.class);
        if (t0Var != null) {
            t0Var.f107203r = false;
        }
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [j50.a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo77610M() {
        /*
            r15 = this;
            d50.i$e r0 = d50.C58115i.C58120e.ROLE_APPLY_PK
            j50.a r1 = f159378f
            boolean r1 = r1 instanceof c50.C54655b
            if (r1 == 0) goto L_0x0120
            k50.a r1 = k50.C60971a.C60973b.f173670a
            m50.d r2 = r1.mo85946c()
            boolean r2 = r2.f174708g
            m50.d r3 = r1.mo85946c()
            java.lang.String r3 = r3.f174709h
            m50.d r4 = r1.mo85946c()
            java.lang.String r4 = r4.f174710i
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "requestStopPkMic: isRoomPk:"
            r5.append(r6)
            r5.append(r2)
            java.lang.String r2 = ", connectRoomId:"
            r5.append(r2)
            r5.append(r3)
            java.lang.String r2 = ", connectedRoomId:"
            r5.append(r2)
            r5.append(r4)
            java.lang.String r2 = r5.toString()
            java.lang.String r5 = "Finder.FinderLiveService"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
            j50.a r2 = f159378f
            boolean r5 = r2 instanceof c50.C54655b
            r6 = 0
            if (r5 == 0) goto L_0x004c
            c50.b r2 = (c50.C54655b) r2
            goto L_0x004d
        L_0x004c:
            r2 = r6
        L_0x004d:
            java.lang.String r5 = ""
            java.lang.String r7 = "MicroMsg.LiveCoreAnchor"
            r8 = 1
            r9 = 0
            if (r2 == 0) goto L_0x00d0
            java.lang.String r10 = "connectRoomId"
            gy3.C87412m.m108593f(r3, r10)
            java.lang.String r11 = "connectedRoomId"
            gy3.C87412m.m108593f(r4, r11)
            d50.i r12 = r2.f172989A
            d50.i$e r12 = r12.f166257d
            if (r12 != r0) goto L_0x0067
            r12 = 1
            goto L_0x0068
        L_0x0067:
            r12 = 0
        L_0x0068:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "stopRoomPkLinkMic: connectRoomId:"
            r13.append(r14)
            r13.append(r3)
            java.lang.String r14 = " connectedRoomId:"
            r13.append(r14)
            r13.append(r4)
            java.lang.String r14 = ", isPkRoleApply:"
            r13.append(r14)
            r13.append(r12)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r13)
            if (r12 == 0) goto L_0x00d0
            m50.d r1 = r1.mo85946c()
            if (r1 == 0) goto L_0x009d
            r1.f174708g = r9
            r1.f174709h = r5
            r1.f174710i = r5
            r1.f174706e = r5
        L_0x009d:
            k50.c r1 = r2.f173025i
            if (r1 == 0) goto L_0x00d0
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r12 = "api"
            java.lang.String r13 = "disconnectOtherRoom"
            r2.put(r12, r13)     // Catch:{ Exception -> 0x00cf }
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch:{ Exception -> 0x00cf }
            r12.<init>()     // Catch:{ Exception -> 0x00cf }
            long r13 = java.lang.Long.parseLong(r3)     // Catch:{ Exception -> 0x00cf }
            r12.put(r10, r13)     // Catch:{ Exception -> 0x00cf }
            long r3 = java.lang.Long.parseLong(r4)     // Catch:{ Exception -> 0x00cf }
            r12.put(r11, r3)     // Catch:{ Exception -> 0x00cf }
            java.lang.String r3 = "params"
            r2.put(r3, r12)     // Catch:{ Exception -> 0x00cf }
            com.tencent.trtc.TRTCCloud r1 = r1.f173671a     // Catch:{ Exception -> 0x00cf }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00cf }
            r1.callExperimentalAPI(r2)     // Catch:{ Exception -> 0x00cf }
            goto L_0x00d0
        L_0x00cf:
        L_0x00d0:
            j50.a r1 = f159378f
            boolean r2 = r1 instanceof c50.C54655b
            if (r2 == 0) goto L_0x00d9
            r6 = r1
            c50.b r6 = (c50.C54655b) r6
        L_0x00d9:
            if (r6 == 0) goto L_0x0120
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "stopCrossLinkMic is applyPkRole:"
            r1.append(r2)
            d50.i r2 = r6.f172989A
            d50.i$e r2 = r2.f166257d
            if (r2 != r0) goto L_0x00ee
            r2 = 1
            goto L_0x00ef
        L_0x00ee:
            r2 = 0
        L_0x00ef:
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)
            d50.i r1 = r6.f172989A
            d50.i$e r1 = r1.f166257d
            if (r1 != r0) goto L_0x0100
            goto L_0x0101
        L_0x0100:
            r8 = 0
        L_0x0101:
            if (r8 == 0) goto L_0x0120
            k50.a r0 = k50.C60971a.C60973b.f173670a
            m50.d r0 = r0.mo85946c()
            if (r0 == 0) goto L_0x0111
            r0.f174706e = r5
            r0.f174707f = r9
            r0.f174705d = r5
        L_0x0111:
            k50.c r0 = r6.f173025i
            if (r0 == 0) goto L_0x011a
            com.tencent.trtc.TRTCCloud r0 = r0.f173671a
            r0.DisconnectOtherRoom()
        L_0x011a:
            d50.i r0 = r6.f172989A
            d50.i$e r1 = d50.C58115i.C58120e.ROLE_DEFAULT
            r0.f166257d = r1
        L_0x0120:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.mo77610M():void");
    }

    /* renamed from: N */
    public final void mo77611N() {
        Log.m105924i("Finder.FinderLiveService", "setAnchorPauseMiniView");
        C60735a aVar = f159378f;
        if (aVar != null) {
            aVar.mo85674O(2);
        }
    }

    /* renamed from: O */
    public final void mo77612O(LiveRoomControllerStore liveRoomControllerStore) {
        StringBuilder sb = new StringBuilder();
        sb.append("write curControllerStore to :");
        sb.append(liveRoomControllerStore != null ? liveRoomControllerStore.hashCode() : 0);
        Log.m105924i("Finder.FinderLiveService", sb.toString());
        f159349B = liveRoomControllerStore;
    }

    /* renamed from: P */
    public final void mo77613P(C45795b bVar) {
        Log.m105924i("Finder.FinderLiveService", "write curLiveRoomData to :" + bVar);
        f159348A = bVar;
    }

    /* renamed from: Q */
    public final void mo77614Q(C60557z1.C60565f fVar) {
        C87412m.m108594g(fVar, "value");
        if (!C87412m.m108589b(fVar.f172639a.f186145d, f159391u.f172639a.f186145d)) {
            f159392v = System.currentTimeMillis();
        }
        f159391u = fVar;
    }

    /* renamed from: R */
    public final void mo77615R(C54129i iVar) {
        Log.m105924i("Finder.FinderLiveService", "FinderLiveDataModel set " + iVar);
        f159398z = iVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x038e  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0393  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x03ba A[LOOP:0: B:93:0x03b4->B:95:0x03ba, LOOP_END] */
    /* renamed from: S */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo77616S() {
        /*
            r16 = this;
            h81.h$c r0 = h81.C32735h.C32737c.clicfg_live_beauty_config_female
            h81.h$c r1 = h81.C32735h.C32737c.clicfg_live_beauty_config
            java.lang.Class<h81.h> r2 = h81.C32735h.class
            java.lang.String r3 = "Finder.FinderLiveService"
            java.lang.String r4 = "setupBeautyAndFilterConfig start"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            java.util.HashMap<java.lang.Integer, java.lang.String> r4 = w50.C65929d.f189537c
            r5 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            java.lang.Object r7 = r4.get(r6)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = ""
            if (r7 != 0) goto L_0x0020
            r7 = r8
        L_0x0020:
            fe1.d$b r9 = fe1.C58961d.f168673a
            zc1.b r10 = zc1.C66785b.f191882e
            java.lang.String r10 = r10.mo90662O5()
            fe1.q r9 = r9.mo84155b(r10)
            r10 = 1
            if (r9 == 0) goto L_0x0037
            int r11 = r9.getSex()
            if (r11 != r10) goto L_0x0037
            r11 = 1
            goto L_0x0038
        L_0x0037:
            r11 = 0
        L_0x0038:
            java.lang.String r12 = "{\"skin_smooth\":55,\"eye_morph\":20,\"face_morph\":50,\"skin_bright\":55,\"eye_bright\":20,\"filter\":40,\"rosy\":0,\"filterKey\":0}"
            r13 = 2
            if (r11 == 0) goto L_0x004b
            di3.d r0 = di3.C86312j.m106911c(r2)
            h81.h r0 = (h81.C32735h) r0
            java.lang.String r0 = r0.Y60(r1, r12)
        L_0x0048:
            r1 = r0
            goto L_0x00bf
        L_0x004b:
            if (r9 == 0) goto L_0x0055
            int r11 = r9.getSex()
            if (r11 != r13) goto L_0x0055
            r11 = 1
            goto L_0x0056
        L_0x0055:
            r11 = 0
        L_0x0056:
            java.lang.String r15 = "{\"skin_smooth\":80,\"eye_morph\":40,\"face_morph\":75,\"skin_bright\":80,\"eye_bright\":20,\"filter\":40,\"rosy\":0,\"filterKey\":0}"
            if (r11 == 0) goto L_0x0066
            di3.d r1 = di3.C86312j.m106911c(r2)
            h81.h r1 = (h81.C32735h) r1
            java.lang.String r0 = r1.Y60(r0, r15)
            goto L_0x0048
        L_0x0066:
            com.tencent.mm.storage.z1 r11 = eb0.C75592q0.m90777g()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r14 = "read sex from finder contact fail, try again from contact:"
            r5.append(r14)
            if (r11 == 0) goto L_0x007d
            int r14 = r11.f149500H
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            goto L_0x007e
        L_0x007d:
            r14 = 0
        L_0x007e:
            r5.append(r14)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r5)
            if (r11 == 0) goto L_0x0090
            int r5 = r11.f149500H
            if (r5 != r10) goto L_0x0090
            r5 = 1
            goto L_0x0091
        L_0x0090:
            r5 = 0
        L_0x0091:
            if (r5 == 0) goto L_0x009e
            di3.d r0 = di3.C86312j.m106911c(r2)
            h81.h r0 = (h81.C32735h) r0
            java.lang.String r0 = r0.Y60(r1, r12)
            goto L_0x0048
        L_0x009e:
            if (r11 == 0) goto L_0x00a6
            int r5 = r11.f149500H
            if (r5 != r13) goto L_0x00a6
            r5 = 1
            goto L_0x00a7
        L_0x00a6:
            r5 = 0
        L_0x00a7:
            if (r5 == 0) goto L_0x00b4
            di3.d r1 = di3.C86312j.m106911c(r2)
            h81.h r1 = (h81.C32735h) r1
            java.lang.String r0 = r1.Y60(r0, r15)
            goto L_0x0048
        L_0x00b4:
            di3.d r0 = di3.C86312j.m106911c(r2)
            h81.h r0 = (h81.C32735h) r0
            java.lang.String r0 = r0.Y60(r1, r12)
            goto L_0x0048
        L_0x00bf:
            r2 = -1
            c30.g r0 = new c30.g     // Catch:{ Exception -> 0x00e5 }
            r0.<init>((java.lang.String) r1)     // Catch:{ Exception -> 0x00e5 }
            java.lang.String r5 = "filter"
            int r5 = r0.getInt(r5)     // Catch:{ Exception -> 0x00e5 }
            java.lang.String r11 = "filterKey"
            int r11 = r0.getInt(r11)     // Catch:{ Exception -> 0x00e3 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x00e1 }
            java.lang.Object r0 = r4.get(r0)     // Catch:{ Exception -> 0x00e1 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x00e1 }
            if (r0 != 0) goto L_0x00df
            r7 = r8
            goto L_0x0100
        L_0x00df:
            r7 = r0
            goto L_0x0100
        L_0x00e1:
            r0 = move-exception
            goto L_0x00e8
        L_0x00e3:
            r0 = move-exception
            goto L_0x00e7
        L_0x00e5:
            r0 = move-exception
            r5 = -1
        L_0x00e7:
            r11 = 0
        L_0x00e8:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r12 = "parse clicfg_live_beauty_config fail. "
            r4.append(r12)
            java.lang.String r0 = r0.getMessage()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r0)
        L_0x0100:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "self.sex:"
            r0.append(r4)
            if (r9 == 0) goto L_0x0116
            int r4 = r9.getSex()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x0117
        L_0x0116:
            r4 = 0
        L_0x0117:
            r0.append(r4)
            java.lang.String r4 = " expt beautyConfig:["
            r0.append(r4)
            r0.append(r5)
            java.lang.String r4 = ", "
            r0.append(r4)
            r0.append(r7)
            r0.append(r4)
            r0.append(r11)
            java.lang.String r9 = "] exptConfig:"
            r0.append(r9)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            f159389s = r5
            java.lang.Class<hr.t> r0 = p165hr.C60106t.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            hr.t r0 = (p165hr.C60106t) r0
            rx3.g r0 = r0.f171518r
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            ik1.c r0 = (ik1.C33340c) r0
            r0.getClass()
            ig1.h r1 = new ig1.h
            r1.<init>()
            te3.bp2 r9 = new te3.bp2
            r9.<init>()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r14 = r0.f90379f
            r12.append(r14)
            java.lang.String r14 = " where FinderLiveConfig.key=\"KEY_FILTER_CONFIG\""
            r12.append(r14)
            java.lang.String r12 = r12.toString()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r0.f90378e
            r14 = 0
            android.database.Cursor r12 = r0.rawQuery(r12, r14, r13)
            boolean r0 = r12.moveToFirst()
            if (r0 == 0) goto L_0x019c
            r1.convertFrom(r12)
            byte[] r0 = r1.field_value
            if (r0 != 0) goto L_0x0188
            goto L_0x0198
        L_0x0188:
            r9.parseFrom(r0)     // Catch:{ Exception -> 0x018c }
            goto L_0x0198
        L_0x018c:
            r0 = move-exception
            r1 = r0
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r14 = 0
            r0[r14] = r1
            java.lang.String r1 = "safeParser"
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r1, r8, r0)
        L_0x0198:
            r12.close()
            goto L_0x01a0
        L_0x019c:
            r12.close()
            r9 = 0
        L_0x01a0:
            if (r5 == r2) goto L_0x01cb
            if (r9 == 0) goto L_0x01cb
            java.util.HashMap<java.lang.Integer, java.lang.String> r0 = w50.C65929d.f189537c
            int r1 = r9.f131246d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r0.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106450k(r1)
            if (r1 == 0) goto L_0x01cb
            int r11 = r9.f131246d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x01c7
            goto L_0x01c8
        L_0x01c7:
            r8 = r0
        L_0x01c8:
            int r5 = r9.f131247e
            r7 = r8
        L_0x01cb:
            java.lang.Class<cl1.o> r0 = cl1.C54991o.class
            r1 = r16
            androidx.lifecycle.i0 r0 = r1.mo77630e(r0)
            cl1.o r0 = (cl1.C54991o) r0
            if (r0 == 0) goto L_0x01e3
            fe1.q r0 = r0.f154259T2
            if (r0 == 0) goto L_0x01e3
            int r0 = r0.getSex()
            if (r0 != r10) goto L_0x01e3
            r14 = 1
            goto L_0x01e4
        L_0x01e3:
            r14 = 0
        L_0x01e4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "final beautyConfig:["
            r0.append(r2)
            r0.append(r5)
            r0.append(r4)
            r0.append(r7)
            r0.append(r4)
            r0.append(r11)
            java.lang.String r2 = "], isMale="
            r0.append(r2)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            s50.a r0 = new s50.a
            r2 = 0
            r0.<init>(r2, r10, r2)
            cj1.a r4 = cj1.C54730a.f153378a
            boolean r8 = cj1.C54730a.f153379b
            r8 = r8 ^ r10
            r0.f97363b = r8
            cj1.g6 r8 = cj1.C54763g6.f153485a
            int r8 = r4.mo75616c()
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r9 = r0.f97362a
            r10 = 0
            int r12 = r4.mo75615b(r8, r10, r14, r10)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r9.put(r6, r12)
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r6 = r0.f97362a
            r9 = 14
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)
            int r9 = r4.mo75615b(r8, r9, r14, r10)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r6.put(r12, r9)
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r6 = r0.f97362a
            java.lang.Integer r9 = java.lang.Integer.valueOf(r13)
            int r12 = r4.mo75615b(r8, r13, r14, r10)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r6.put(r9, r12)
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r6 = r0.f97362a
            r9 = 3
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)
            int r9 = r4.mo75615b(r8, r9, r14, r10)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r6.put(r12, r9)
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r6 = r0.f97362a
            r9 = 6
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)
            int r9 = r4.mo75615b(r8, r9, r14, r10)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r6.put(r12, r9)
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r6 = r0.f97362a
            r9 = 7
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)
            int r9 = r4.mo75615b(r8, r9, r14, r10)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r6.put(r12, r9)
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r6 = r0.f97362a
            r9 = 8
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)
            int r9 = r4.mo75615b(r8, r9, r14, r10)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r6.put(r12, r9)
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r6 = r0.f97362a
            r9 = 9
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)
            int r9 = r4.mo75615b(r8, r9, r14, r10)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r6.put(r12, r9)
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r6 = r0.f97362a
            r9 = 10
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)
            int r9 = r4.mo75615b(r8, r9, r14, r10)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r6.put(r12, r9)
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r6 = r0.f97362a
            r9 = 11
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)
            int r9 = r4.mo75615b(r8, r9, r14, r10)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r6.put(r12, r9)
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r6 = r0.f97362a
            r9 = 12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)
            int r9 = r4.mo75615b(r8, r9, r14, r10)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r6.put(r12, r9)
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r6 = r0.f97362a
            r9 = 13
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)
            int r9 = r4.mo75615b(r8, r9, r14, r10)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r6.put(r12, r9)
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r6 = r0.f97362a
            r9 = 15
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)
            int r9 = r4.mo75615b(r8, r9, r14, r10)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r6.put(r12, r9)
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r6 = r0.f97362a
            r9 = 16
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)
            int r9 = r4.mo75615b(r8, r9, r14, r10)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r6.put(r12, r9)
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r6 = r0.f97362a
            r9 = 17
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)
            int r9 = r4.mo75615b(r8, r9, r14, r10)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r6.put(r12, r9)
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r6 = r0.f97362a
            r9 = 18
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)
            int r9 = r4.mo75615b(r8, r9, r14, r10)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r6.put(r12, r9)
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r6 = r0.f97362a
            r9 = 19
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)
            int r9 = r4.mo75615b(r8, r9, r14, r10)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r6.put(r12, r9)
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r6 = r0.f97362a
            r9 = 20
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)
            int r9 = r4.mo75615b(r8, r9, r14, r10)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r6.put(r12, r9)
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r6 = r0.f97362a
            r9 = 21
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)
            int r4 = r4.mo75615b(r8, r9, r14, r10)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6.put(r12, r4)
            f159390t = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "#setupBeautyAndFilterConfig beautyConfig="
            r0.append(r4)
            s50.a r4 = f159390t
            if (r4 == 0) goto L_0x0393
            java.lang.String r14 = r4.toString()
            goto L_0x0394
        L_0x0393:
            r14 = r2
        L_0x0394:
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            s50.b r0 = new s50.b
            r0.<init>(r11, r7, r5)
            f159393w = r0
            java.util.HashMap<java.lang.Integer, w50.d$a> r0 = f159394x
            r0.clear()
            java.util.HashMap<java.lang.Integer, java.lang.String> r0 = w50.C65929d.f189537c
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x03b4:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x03f1
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.util.HashMap<java.lang.Integer, w50.d$a> r4 = f159394x
            java.lang.Object r5 = r2.getKey()
            w50.d$a r6 = new w50.d$a
            java.lang.Object r7 = r2.getKey()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            java.lang.Object r8 = r2.getValue()
            java.lang.String r8 = (java.lang.String) r8
            w50.d r9 = w50.C65929d.f189535a
            java.lang.Object r2 = r2.getKey()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.String r2 = r9.mo89970b(r2)
            int r9 = f159389s
            r6.<init>(r7, r8, r2, r9)
            r4.put(r5, r6)
            goto L_0x03b4
        L_0x03f1:
            java.lang.String r0 = "setupBeautyAndFilterConfig end"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.mo77616S():void");
    }

    /* renamed from: T */
    public final void mo77617T() {
        f159386p0 = new C28574j6("heartBeatLooper", (String) null, f159371V, 2, (C8480h) null);
        f159395x0 = new C28574j6("keepLiveLooper", (String) null, f159372W, 2, (C8480h) null);
        f159397y0 = new C28574j6("refreshMicLooper", (String) null, f159374Y, 2, (C8480h) null);
        f159364Q0 = new C28574j6("activateMicLooper", (String) null, f159375Z, 2, (C8480h) null);
        f159373X.put("activeMicHeartBeat", new C59918a());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0033, code lost:
        r3 = r3.f172989A;
     */
    /* renamed from: U */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo77618U(android.os.Bundle r17, android.content.Context r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            java.lang.Class<cl1.o> r2 = cl1.C54991o.class
            java.lang.String r3 = "PARAM_FINDER_LIVE_FORCE_TASK"
            r4 = 0
            boolean r7 = r1.getBoolean(r3, r4)
            java.lang.String r3 = "PARAM_LIVE_MINI_WINDOW_GENERATE_TYPE"
            int r9 = r1.getInt(r3, r4)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "showMiniWindowWithoutPermissionCheck: forceMoveTask:"
            r1.append(r3)
            r1.append(r7)
            java.lang.String r3 = ", generateType:"
            r1.append(r3)
            r1.append(r9)
            java.lang.String r3 = ", isFloatMode:"
            r1.append(r3)
            j50.a r3 = f159378f
            r5 = 0
            if (r3 == 0) goto L_0x0040
            d50.i r3 = r3.f172989A
            if (r3 == 0) goto L_0x0040
            boolean r3 = r3.mo82881c()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            goto L_0x0041
        L_0x0040:
            r3 = r5
        L_0x0041:
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "Finder.FinderLiveService"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            j50.a r1 = f159378f
            if (r1 == 0) goto L_0x005d
            d50.i r1 = r1.f172989A
            if (r1 == 0) goto L_0x005d
            boolean r1 = r1.mo82881c()
            if (r1 != 0) goto L_0x005d
            r1 = 1
            goto L_0x005e
        L_0x005d:
            r1 = 0
        L_0x005e:
            if (r1 == 0) goto L_0x00b6
            java.lang.Class<pn.e> r1 = p646pn.C110234e.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            pn.e r1 = (p646pn.C110234e) r1
            xv0.e r1 = r1.mo161399pY()
            r1.mo149141q(r4)
            zt3.t r1 = zt3.C119157j.f356862d
            cj1.v5 r3 = cj1.C28593v5.f78481d
            zt3.j r1 = (zt3.C119157j) r1
            java.lang.String r6 = "Finder.LiveExceptionMonitor"
            r1.mo183876g(r3, r6)
            j50.a r1 = f159378f
            if (r1 == 0) goto L_0x0098
            r8 = 1
            r10 = 0
            androidx.lifecycle.i0 r3 = r0.mo77630e(r2)
            cl1.o r3 = (cl1.C54991o) r3
            if (r3 == 0) goto L_0x008c
            android.graphics.Bitmap r3 = r3.f154254S2
            r11 = r3
            goto L_0x008d
        L_0x008c:
            r11 = r5
        L_0x008d:
            r12 = 0
            r13 = 0
            r14 = 208(0xd0, float:2.91E-43)
            r15 = 0
            r5 = r1
            r6 = r18
            b50.C54408d.C54409a.m61121a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
        L_0x0098:
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r1 = f159349B
            if (r1 == 0) goto L_0x00a1
            gh1.j r3 = gh1.C59447j.f169870a
            r3.mo84550b(r1)
        L_0x00a1:
            androidx.lifecycle.i0 r1 = r0.mo77630e(r2)
            cl1.o r1 = (cl1.C54991o) r1
            if (r1 == 0) goto L_0x00ab
            int r4 = r1.f154291a1
        L_0x00ab:
            r1 = 524288(0x80000, float:7.34684E-40)
            boolean r1 = o40.C61926c.m72696u(r4, r1)
            if (r1 == 0) goto L_0x00b6
            r16.mo77611N()
        L_0x00b6:
            java.lang.Class<ak1.o> r1 = ak1.C54108o.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            ak1.o r1 = (ak1.C54108o) r1
            r1.getClass()
            ak1.f0 r1 = ak1.C54108o.f151869h
            ak1.m0 r1 = r1.f151443Y
            long r2 = r1.f151835l
            r4 = 1
            long r2 = r2 + r4
            r1.f151835l = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.mo77618U(android.os.Bundle, android.content.Context):void");
    }

    /* renamed from: V */
    public final void mo77619V() {
        C45795b bVar;
        C58115i iVar;
        Log.m105924i("Finder.FinderLiveService", "trtc startLinkMic liveCore: " + f159378f + " instance: " + (f159378f instanceof C62197e));
        C60735a aVar = f159378f;
        boolean z = false;
        if (aVar instanceof C62197e) {
            C62197e eVar = aVar instanceof C62197e ? (C62197e) aVar : null;
            if (eVar != null) {
                eVar.mo87276S0((LivePreviewView) null);
            }
            C60735a aVar2 = f159378f;
            if (aVar2 != null) {
                aVar2.mo85687d0(false);
            }
            C54991o oVar = (C54991o) mo77630e(C54991o.class);
            if (oVar != null) {
                oVar.f154274W2 = false;
            }
        }
        f159381i.getClass();
        f159376d.getClass();
        C60735a aVar3 = f159378f;
        if (!(aVar3 == null || (iVar = aVar3.f172989A) == null || iVar.mo82881c())) {
            z = true;
        }
        if (!z && (bVar = f159348A) != null) {
            C61926c.m72668M(new C65408e(bVar));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0016, code lost:
        r1 = r1.f154420q;
     */
    /* renamed from: W */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo77620W() {
        /*
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "stopActivateMic curLive:"
            r0.append(r1)
            java.lang.Class<cl1.u> r1 = cl1.C55001u.class
            androidx.lifecycle.i0 r1 = r5.mo77630e(r1)
            cl1.u r1 = (cl1.C55001u) r1
            r2 = 0
            if (r1 == 0) goto L_0x0021
            te3.c21 r1 = r1.f154420q
            if (r1 == 0) goto L_0x0021
            long r3 = r1.f182392d
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            goto L_0x0022
        L_0x0021:
            r1 = r2
        L_0x0022:
            r0.append(r1)
            java.lang.String r1 = " curLinkUser:"
            r0.append(r1)
            java.lang.Class<cl1.d0> r1 = cl1.C54963d0.class
            androidx.lifecycle.i0 r1 = r5.mo77630e(r1)
            cl1.d0 r1 = (cl1.C54963d0) r1
            if (r1 == 0) goto L_0x0036
            al1.j r2 = r1.f154073p
        L_0x0036:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Finder.FinderLiveService"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            cj1.j6 r0 = f159364Q0
            if (r0 == 0) goto L_0x0049
            r0.mo56066b()
        L_0x0049:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.mo77620W():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0016, code lost:
        r1 = r1.f154420q;
     */
    /* renamed from: X */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo77621X() {
        /*
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "stopRefreshMic curLive:"
            r0.append(r1)
            java.lang.Class<cl1.u> r1 = cl1.C55001u.class
            androidx.lifecycle.i0 r1 = r5.mo77630e(r1)
            cl1.u r1 = (cl1.C55001u) r1
            r2 = 0
            if (r1 == 0) goto L_0x0021
            te3.c21 r1 = r1.f154420q
            if (r1 == 0) goto L_0x0021
            long r3 = r1.f182392d
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            goto L_0x0022
        L_0x0021:
            r1 = r2
        L_0x0022:
            r0.append(r1)
            java.lang.String r1 = " curLinkUser:"
            r0.append(r1)
            java.lang.Class<cl1.d0> r1 = cl1.C54963d0.class
            androidx.lifecycle.i0 r1 = r5.mo77630e(r1)
            cl1.d0 r1 = (cl1.C54963d0) r1
            if (r1 == 0) goto L_0x0036
            al1.j r2 = r1.f154073p
        L_0x0036:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Finder.FinderLiveService"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            cj1.j6 r0 = f159397y0
            if (r0 == 0) goto L_0x0049
            r0.mo56066b()
        L_0x0049:
            uk1.a r0 = f159381i
            r0.getClass()
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r0 = f159376d
            r0.getClass()
            j50.a r0 = f159378f
            r1 = 0
            if (r0 == 0) goto L_0x0063
            d50.i r0 = r0.f172989A
            if (r0 == 0) goto L_0x0063
            boolean r0 = r0.mo82881c()
            if (r0 != 0) goto L_0x0063
            r1 = 1
        L_0x0063:
            if (r1 == 0) goto L_0x0066
            goto L_0x0072
        L_0x0066:
            fj1.b r0 = f159348A
            if (r0 == 0) goto L_0x0072
            uk1.d r1 = new uk1.d
            r1.<init>(r0)
            o40.C61926c.m72668M(r1)
        L_0x0072:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.mo77621X():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x010f, code lost:
        if (r8 == null) goto L_0x0111;
     */
    /* renamed from: Y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final fj1.C45795b mo77622Y(al1.C54127h r21) {
        /*
            r20 = this;
            r0 = r21
            java.lang.Class<cl1.o> r1 = cl1.C54991o.class
            r2 = 0
            if (r0 == 0) goto L_0x000a
            fj1.b r3 = r0.f151978e
            goto L_0x000b
        L_0x000a:
            r3 = r2
        L_0x000b:
            if (r3 == 0) goto L_0x024b
            java.lang.Class<cl1.u> r4 = cl1.C55001u.class
            androidx.lifecycle.i0 r4 = r3.mo71262a(r4)
            cl1.u r4 = (cl1.C55001u) r4
            te3.c21 r5 = r4.f154420q
            long r6 = r5.f182392d
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x024b
            com.tencent.mm.live.api.LiveConfig r6 = r0.f151977d
            long r7 = r6.f157064e
            r5.f182392d = r7
            java.lang.String r6 = r6.f157072p
            java.lang.String r7 = ""
            if (r6 != 0) goto L_0x002c
            r6 = r7
        L_0x002c:
            r5.f182395g = r6
            te3.b81 r6 = new te3.b81
            r6.<init>()
            r5.f182401p = r6
            te3.c21 r5 = r4.f154420q
            te3.b81 r5 = r5.f182401p
            if (r5 != 0) goto L_0x003c
            goto L_0x0042
        L_0x003c:
            com.tencent.mm.live.api.LiveConfig r6 = r0.f151977d
            int r6 = r6.f157073q
            r5.f182228d = r6
        L_0x0042:
            com.tencent.mm.live.api.LiveConfig r5 = r0.f151977d
            byte[] r5 = r5.f157055M
            if (r5 == 0) goto L_0x005a
            boolean r6 = f159359L
            if (r6 == 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r5 = r2
        L_0x004e:
            if (r5 == 0) goto L_0x005a
            te3.bq2 r6 = new te3.bq2
            r6.<init>()
            r6.parseFrom(r5)
            r4.f154419p = r6
        L_0x005a:
            com.tencent.mm.live.api.LiveConfig r5 = r0.f151977d
            long r8 = r5.f157075s
            r4.f154416j = r8
            java.lang.String r5 = r5.f157080x
            if (r5 != 0) goto L_0x0065
            r5 = r7
        L_0x0065:
            r4.f154423t = r5
            com.tencent.mm.live.api.LiveConfig r5 = r0.f151977d
            java.lang.String r5 = r5.f157046D
            if (r5 != 0) goto L_0x006e
            r5 = r7
        L_0x006e:
            r4.f154424u = r5
            com.tencent.mm.live.api.LiveConfig r5 = r0.f151977d
            java.lang.String r5 = r5.f157053K
            java.lang.String r6 = "livecData.staticConfig.nicknameOption"
            gy3.C87412m.m108593f(r5, r6)
            r4.f154425v = r5
            androidx.lifecycle.i0 r5 = r3.mo71262a(r1)
            cl1.o r5 = (cl1.C54991o) r5
            vp1.e r6 = vp1.C65834e.f189316a
            long r8 = r4.f154416j
            com.tencent.mm.plugin.finder.storage.FinderItem r6 = r6.mo89871e(r8)
            if (r6 == 0) goto L_0x0091
            com.tencent.mm.protocal.protobuf.FinderObject r6 = r6.getFinderObject()
            if (r6 != 0) goto L_0x0096
        L_0x0091:
            com.tencent.mm.protocal.protobuf.FinderObject r6 = new com.tencent.mm.protocal.protobuf.FinderObject
            r6.<init>()
        L_0x0096:
            r5.mo76026x4(r6)
            com.tencent.mm.live.api.LiveConfig r6 = r0.f151977d
            java.lang.String r6 = r6.f157069j
            if (r6 != 0) goto L_0x00a0
            r6 = r7
        L_0x00a0:
            r5.f154345o = r6
            com.tencent.mm.live.api.LiveConfig r6 = r0.f151977d
            java.lang.String r6 = r6.f157076t
            r5.f154252S0 = r6
            java.lang.String r6 = r5.mo75969L3()
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 == 0) goto L_0x00bd
            com.tencent.mm.live.api.LiveConfig r6 = r0.f151977d
            java.lang.String r6 = r6.f157068i
            java.lang.String r8 = "livecData.staticConfig.thumbUrl"
            gy3.C87412m.m108593f(r6, r8)
            r5.f154342n1 = r6
        L_0x00bd:
            com.tencent.mm.live.api.LiveConfig r6 = r0.f151977d
            java.lang.String r6 = r6.f157049G
            java.lang.String r8 = "livecData.staticConfig.shareUserName"
            gy3.C87412m.m108593f(r6, r8)
            r5.f154204G2 = r6
            com.tencent.mm.live.api.LiveConfig r6 = r0.f151977d
            int r8 = r6.f157050H
            r5.f154208H2 = r8
            java.lang.String r6 = r6.f157047E
            r5.f154337l3 = r6
            te3.d51 r6 = r0.f151980g
            r5.f154340m3 = r6
            ok1.e r6 = ok1.C62042e.f176370a
            t91.c$a r8 = t91.C64208c.f181951a
            java.lang.String r9 = r5.f154345o
            java.lang.String r8 = r8.mo89027b(r9)
            r6.getClass()
            r6 = 1
            r9 = 0
            if (r8 == 0) goto L_0x0111
            int r10 = r8.length()
            if (r10 <= 0) goto L_0x00ef
            r10 = 1
            goto L_0x00f0
        L_0x00ef:
            r10 = 0
        L_0x00f0:
            if (r10 == 0) goto L_0x00f4
            r10 = r8
            goto L_0x00f5
        L_0x00f4:
            r10 = r2
        L_0x00f5:
            if (r10 == 0) goto L_0x0111
            org.json.JSONObject r10 = new org.json.JSONObject
            r10.<init>(r8)
            java.lang.String r8 = "sns_ad"
            org.json.JSONObject r8 = r10.optJSONObject(r8)
            if (r8 == 0) goto L_0x010e
            java.lang.String r10 = "uxinfo"
            java.lang.String r8 = r8.optString(r10)
            if (r8 != 0) goto L_0x010f
        L_0x010e:
            r8 = r2
        L_0x010f:
            if (r8 != 0) goto L_0x0112
        L_0x0111:
            r8 = r2
        L_0x0112:
            r5.f154357q3 = r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = "save outSize uxinfo:"
            r8.append(r10)
            java.lang.String r10 = r5.f154357q3
            if (r10 != 0) goto L_0x0123
            goto L_0x0124
        L_0x0123:
            r7 = r10
        L_0x0124:
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.Object[] r8 = new java.lang.Object[r9]
            java.lang.String r10 = "Finder.FinderLiveService"
            com.tencent.p014mm.sdk.platformtools.Log.printInfoStack(r10, r7, r8)
            r5.mo75989X3()
            com.tencent.mm.live.api.LiveConfig r7 = r0.f151977d
            long r11 = r7.f157054L
            int r8 = (int) r11
            r5.f154354q = r8
            int r8 = r7.f157056N
            r5.f154181A3 = r8
            java.lang.String r8 = "<this>"
            gy3.C87412m.m108594g(r7, r8)
            int r8 = r7.f157057P
            if (r8 == 0) goto L_0x015f
            te3.by0 r8 = new te3.by0
            r8.<init>()
            int r11 = r7.f157057P
            r8.f131380d = r11
            int r11 = r7.f157058Q
            r8.f131381e = r11
            int r11 = r7.f157059R
            r8.f131382f = r11
            int r7 = r7.f157060S
            r8.f131383g = r7
            goto L_0x0160
        L_0x015f:
            r8 = r2
        L_0x0160:
            if (r8 == 0) goto L_0x016a
            er1.e1 r7 = er1.C45681e1.f123485a
            java.lang.String r11 = "transferLiveData"
            r7.mo71179a(r5, r11, r8)
        L_0x016a:
            com.tencent.mm.live.api.LiveConfig r5 = r0.f151977d
            int r5 = r5.f157077u
            r7 = 4
            if (r5 != r7) goto L_0x0182
            java.lang.Class<cl1.b> r5 = cl1.C0654b.class
            androidx.lifecycle.i0 r5 = r3.mo71262a(r5)
            cl1.b r5 = (cl1.C0654b) r5
            com.tencent.mm.live.api.LiveConfig r7 = r0.f151977d
            java.lang.String r8 = r7.f157078v
            java.lang.String r7 = r7.f157079w
            r5.mo624d3(r6, r8, r7, r9)
        L_0x0182:
            com.tencent.mm.live.api.LiveConfig r5 = r0.f151977d
            te3.po2 r5 = r5.f157062U
            r4.f154413g = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "checkattachParams transferLiveData "
            r5.append(r7)
            te3.c21 r7 = r4.f154420q
            long r7 = r7.f182392d
            java.lang.String r7 = o40.C61926c.m72691p(r7)
            r5.append(r7)
            java.lang.String r7 = ", "
            r5.append(r7)
            com.tencent.mm.live.api.LiveConfig r7 = r0.f151977d
            te3.po2 r7 = r7.f157062U
            if (r7 == 0) goto L_0x01b5
            com.tencent.mm.protocal.protobuf.FinderObject r7 = r7.f184866d
            if (r7 == 0) goto L_0x01b5
            int r7 = r7.hashCode()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x01b6
        L_0x01b5:
            r7 = r2
        L_0x01b6:
            r5.append(r7)
            java.lang.String r7 = ", , "
            r5.append(r7)
            com.tencent.mm.live.api.LiveConfig r7 = r0.f151977d
            te3.po2 r7 = r7.f157062U
            if (r7 == 0) goto L_0x01d1
            te3.c21 r7 = r7.f184867e
            if (r7 == 0) goto L_0x01d1
            int r7 = r7.hashCode()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x01d2
        L_0x01d1:
            r7 = r2
        L_0x01d2:
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r5)
            com.tencent.mm.live.api.LiveConfig r0 = r0.f151977d
            java.lang.String r0 = r0.f157069j
            zc1.b r5 = zc1.C66785b.f191882e
            java.lang.String r5 = r5.mo90662O5()
            boolean r0 = gy3.C87412m.m108589b(r0, r5)
            if (r0 != 0) goto L_0x020a
            ft1.a r11 = ft1.C59319a.f169618b
            te3.po2 r0 = r4.f154413g
            if (r0 == 0) goto L_0x01f5
            te3.c21 r0 = r0.f184867e
            goto L_0x01f6
        L_0x01f5:
            r0 = r2
        L_0x01f6:
            if (r0 == 0) goto L_0x01fa
            r13 = 1
            goto L_0x01fb
        L_0x01fa:
            r13 = 0
        L_0x01fb:
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 60
            r19 = 0
            java.lang.String r12 = "checkattachliveinfonull"
            o40.C11348f.C11349a.m11178b(r11, r12, r13, r14, r15, r16, r17, r18, r19)
        L_0x020a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "transferLiveData liveId:"
            r0.append(r5)
            te3.c21 r5 = r4.f154420q
            long r5 = r5.f182392d
            r0.append(r5)
            java.lang.String r5 = " objectId:"
            r0.append(r5)
            long r5 = r4.f154416j
            r0.append(r5)
            java.lang.String r5 = " nicknameOption:"
            r0.append(r5)
            java.lang.String r4 = r4.f154425v
            r0.append(r4)
            java.lang.String r4 = " anchorUsername:"
            r0.append(r4)
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r4 = f159376d
            androidx.lifecycle.i0 r1 = r4.mo77630e(r1)
            cl1.o r1 = (cl1.C54991o) r1
            if (r1 == 0) goto L_0x0241
            java.lang.String r2 = r1.f154345o
        L_0x0241:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
        L_0x024b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.mo77622Y(al1.h):fj1.b");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0183, code lost:
        if (gy3.C87412m.m108589b(r0, (r1 == null || (r1 = r1.f154420q) == null) ? null : java.lang.Long.valueOf(r1.f182392d)) != false) goto L_0x0185;
     */
    /* renamed from: Z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo77623Z(fj1.C45795b r18, boolean r19, d60.C58124b.C58125b r20, android.os.Bundle r21, long r22) {
        /*
            r17 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            java.lang.Class<cl1.o> r6 = cl1.C54991o.class
            java.lang.Class<cl1.u> r7 = cl1.C55001u.class
            java.lang.String r8 = "roomData"
            gy3.C87412m.m108594g(r0, r8)
            java.lang.String r8 = "event"
            gy3.C87412m.m108594g(r2, r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "transferState before event:"
            r8.append(r9)
            r8.append(r2)
            java.lang.String r9 = " curLive:"
            r8.append(r9)
            androidx.lifecycle.i0 r9 = r0.mo71262a(r7)
            cl1.u r9 = (cl1.C55001u) r9
            te3.c21 r9 = r9.f154420q
            if (r9 == 0) goto L_0x003c
            long r11 = r9.f182392d
            java.lang.Long r9 = java.lang.Long.valueOf(r11)
            goto L_0x003d
        L_0x003c:
            r9 = 0
        L_0x003d:
            r8.append(r9)
            java.lang.String r9 = " liveState:"
            r8.append(r9)
            androidx.lifecycle.i0 r11 = r0.mo71262a(r6)
            cl1.o r11 = (cl1.C54991o) r11
            int r11 = r11.f154295b1
            r8.append(r11)
            java.lang.String r11 = " uiState:"
            r8.append(r11)
            androidx.lifecycle.i0 r12 = r0.mo71262a(r6)
            cl1.o r12 = (cl1.C54991o) r12
            int r12 = r12.f154291a1
            r8.append(r12)
            java.lang.String r12 = ",isAnchor:"
            r8.append(r12)
            r8.append(r1)
            java.lang.String r8 = r8.toString()
            java.lang.String r12 = "Finder.FinderLiveService"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r8)
            androidx.lifecycle.i0 r6 = r0.mo71262a(r6)
            cl1.o r6 = (cl1.C54991o) r6
            androidx.lifecycle.i0 r8 = r6.business(r7)
            cl1.u r8 = (cl1.C55001u) r8
            te3.c21 r8 = r8.f154420q
            long r13 = r8.f182392d
            int r8 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r8 == 0) goto L_0x009f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "invalid liveId:"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = ", ignore..."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r12, r0)
            return
        L_0x009f:
            int r4 = r6.f154291a1
            r6.f154299c1 = r4
            int r4 = r6.f154295b1
            r6.f154303d1 = r4
            int r4 = r20.ordinal()
            r5 = 5
            if (r4 == r5) goto L_0x038b
            r5 = 524288(0x80000, float:7.34684E-40)
            r13 = 1
            r14 = 7
            if (r4 == r14) goto L_0x0365
            r10 = 20
            if (r4 == r10) goto L_0x034e
            r10 = 21
            if (r4 == r10) goto L_0x0347
            r10 = 69
            if (r4 == r10) goto L_0x033f
            r10 = 70
            if (r4 == r10) goto L_0x0336
            r10 = 148(0x94, float:2.07E-43)
            if (r4 == r10) goto L_0x032f
            r10 = 149(0x95, float:2.09E-43)
            if (r4 == r10) goto L_0x0328
            r10 = 174(0xae, float:2.44E-43)
            if (r4 == r10) goto L_0x02f9
            r10 = 175(0xaf, float:2.45E-43)
            r16 = -524289(0xfffffffffff7ffff, float:NaN)
            r15 = 64
            r8 = 0
            if (r4 == r10) goto L_0x02ac
            if (r4 == r14) goto L_0x0365
            r10 = 39
            if (r4 == r10) goto L_0x0280
            r10 = 57
            if (r4 == r10) goto L_0x0267
            r10 = 60
            if (r4 == r10) goto L_0x025d
            r10 = 62
            if (r4 == r10) goto L_0x024e
            r10 = 125(0x7d, float:1.75E-43)
            if (r4 == r10) goto L_0x023e
            r3 = 155(0x9b, float:2.17E-43)
            if (r4 == r3) goto L_0x0234
            r3 = 157(0x9d, float:2.2E-43)
            if (r4 == r3) goto L_0x022a
            r3 = 190(0xbe, float:2.66E-43)
            if (r4 == r3) goto L_0x0214
            r3 = 198(0xc6, float:2.77E-43)
            if (r4 == r3) goto L_0x0209
            switch(r4) {
                case 23: goto L_0x0121;
                case 24: goto L_0x0347;
                case 25: goto L_0x0347;
                case 26: goto L_0x0347;
                case 27: goto L_0x010d;
                default: goto L_0x0103;
            }
        L_0x0103:
            r3 = 96
            switch(r4) {
                case 47: goto L_0x01d4;
                case 48: goto L_0x01c9;
                case 49: goto L_0x01bd;
                case 50: goto L_0x01a5;
                case 51: goto L_0x0155;
                case 52: goto L_0x0140;
                case 53: goto L_0x0129;
                default: goto L_0x0108;
            }
        L_0x0108:
            switch(r4) {
                case 77: goto L_0x0200;
                case 78: goto L_0x01f6;
                case 79: goto L_0x01df;
                default: goto L_0x010b;
            }
        L_0x010b:
            goto L_0x0392
        L_0x010d:
            int r0 = r6.f154295b1
            r1 = 3
            r6.f154295b1 = r1
            r6.f154291a1 = r8
            if (r0 == r1) goto L_0x0392
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r0 = f159349B
            if (r0 == 0) goto L_0x0392
            gh1.j r1 = gh1.C59447j.f169870a
            r1.mo84549a(r0)
            goto L_0x0392
        L_0x0121:
            int r0 = r6.f154291a1
            r0 = r0 | 2048(0x800, float:2.87E-42)
            r6.f154291a1 = r0
            goto L_0x0392
        L_0x0129:
            boolean r0 = r6.mo75999e4()
            if (r0 == 0) goto L_0x0392
            int r0 = r6.f154291a1
            boolean r0 = o40.C61926c.m72696u(r0, r3)
            if (r0 != 0) goto L_0x0392
            int r0 = r6.f154291a1
            r0 = r0 | r15
            r0 = r0 & -513(0xfffffffffffffdff, float:NaN)
            r6.f154291a1 = r0
            goto L_0x0392
        L_0x0140:
            boolean r0 = r6.mo75997d4()
            if (r0 != 0) goto L_0x0392
            int r0 = r6.f154291a1
            boolean r0 = o40.C61926c.m72696u(r0, r5)
            if (r0 == 0) goto L_0x0151
            r13 = 524289(0x80001, float:7.34685E-40)
        L_0x0151:
            r6.f154291a1 = r13
            goto L_0x0392
        L_0x0155:
            if (r1 != 0) goto L_0x0185
            androidx.lifecycle.i0 r0 = r0.mo71262a(r7)
            cl1.u r0 = (cl1.C55001u) r0
            te3.c21 r0 = r0.f154420q
            if (r0 == 0) goto L_0x0168
            long r0 = r0.f182392d
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x0169
        L_0x0168:
            r0 = 0
        L_0x0169:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r1 = f159376d
            androidx.lifecycle.i0 r1 = r1.mo77630e(r7)
            cl1.u r1 = (cl1.C55001u) r1
            if (r1 == 0) goto L_0x017e
            te3.c21 r1 = r1.f154420q
            if (r1 == 0) goto L_0x017e
            long r4 = r1.f182392d
            java.lang.Long r10 = java.lang.Long.valueOf(r4)
            goto L_0x017f
        L_0x017e:
            r10 = 0
        L_0x017f:
            boolean r0 = gy3.C87412m.m108589b(r0, r10)
            if (r0 == 0) goto L_0x0392
        L_0x0185:
            j50.a r0 = f159378f
            if (r0 == 0) goto L_0x018c
            r0.mo85674O(r13)
        L_0x018c:
            boolean r0 = r6.mo75999e4()
            if (r0 == 0) goto L_0x0392
            int r0 = r6.f154291a1
            boolean r0 = o40.C61926c.m72696u(r0, r3)
            if (r0 != 0) goto L_0x0392
            int r0 = r6.f154291a1
            r1 = 32
            r0 = r0 | r1
            r0 = r0 & -513(0xfffffffffffffdff, float:NaN)
            r6.f154291a1 = r0
            goto L_0x0392
        L_0x01a5:
            boolean r0 = r6.mo75999e4()
            if (r0 == 0) goto L_0x0392
            int r0 = r6.f154291a1
            r1 = 608(0x260, float:8.52E-43)
            boolean r0 = o40.C61926c.m72696u(r0, r1)
            if (r0 != 0) goto L_0x0392
            int r0 = r6.f154291a1
            r0 = r0 | 512(0x200, float:7.175E-43)
            r6.f154291a1 = r0
            goto L_0x0392
        L_0x01bd:
            r0 = 2
            r6.f154295b1 = r0
            int r0 = r6.f154291a1
            r1 = 1048576(0x100000, float:1.469368E-39)
            r0 = r0 | r1
            r6.f154291a1 = r0
            goto L_0x0392
        L_0x01c9:
            r0 = 2
            r6.f154295b1 = r0
            int r0 = r6.f154291a1
            r0 = r0 | 256(0x100, float:3.59E-43)
            r6.f154291a1 = r0
            goto L_0x0392
        L_0x01d4:
            r0 = 2
            r6.f154295b1 = r0
            int r0 = r6.f154291a1
            r0 = r0 | 128(0x80, float:1.794E-43)
            r6.f154291a1 = r0
            goto L_0x0392
        L_0x01df:
            boolean r0 = r6.mo75999e4()
            if (r0 == 0) goto L_0x0392
            int r0 = r6.f154291a1
            boolean r0 = o40.C61926c.m72696u(r0, r3)
            if (r0 != 0) goto L_0x0392
            int r0 = r6.f154291a1
            r1 = 16
            r0 = r0 | r1
            r6.f154291a1 = r0
            goto L_0x0392
        L_0x01f6:
            int r0 = r6.f154291a1
            r1 = -262145(0xfffffffffffbffff, float:NaN)
            r0 = r0 & r1
            r6.f154291a1 = r0
            goto L_0x0392
        L_0x0200:
            int r0 = r6.f154291a1
            r1 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 | r1
            r6.f154291a1 = r0
            goto L_0x0392
        L_0x0209:
            int r0 = r6.f154295b1
            if (r0 != 0) goto L_0x020e
            r8 = 1
        L_0x020e:
            if (r8 == 0) goto L_0x0392
            r6.f154295b1 = r13
            goto L_0x0392
        L_0x0214:
            boolean r0 = r6.mo75999e4()
            if (r0 == 0) goto L_0x0392
            int r0 = r6.f154291a1
            boolean r0 = o40.C61926c.m72696u(r0, r5)
            if (r0 == 0) goto L_0x0392
            int r0 = r6.f154291a1
            r0 = r0 & r16
            r6.f154291a1 = r0
            goto L_0x0392
        L_0x022a:
            int r0 = r6.f154291a1
            r1 = -32769(0xffffffffffff7fff, float:NaN)
            r0 = r0 & r1
            r6.f154291a1 = r0
            goto L_0x0392
        L_0x0234:
            int r0 = r6.f154291a1
            r1 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 | r1
            r6.f154291a1 = r0
            goto L_0x0392
        L_0x023e:
            r6.f154295b1 = r8
            if (r3 == 0) goto L_0x024a
            java.lang.String r0 = "PARAM_FINDER_LIVE_START_BY_MINI_WINDOW"
            boolean r0 = r3.getBoolean(r0, r8)
            if (r0 != 0) goto L_0x0392
        L_0x024a:
            r6.f154291a1 = r8
            goto L_0x0392
        L_0x024e:
            if (r1 != 0) goto L_0x0392
            boolean r0 = r6.mo75997d4()
            if (r0 != 0) goto L_0x0392
            r0 = 2
            r6.f154295b1 = r0
            r6.f154291a1 = r13
            goto L_0x0392
        L_0x025d:
            r6.f154295b1 = r13
            int r0 = r6.f154291a1
            r0 = r0 & -1025(0xfffffffffffffbff, float:NaN)
            r6.f154291a1 = r0
            goto L_0x0392
        L_0x0267:
            boolean r0 = r6.mo75999e4()
            if (r0 == 0) goto L_0x0392
            int r0 = r6.f154291a1
            boolean r0 = o40.C61926c.m72696u(r0, r15)
            if (r0 == 0) goto L_0x0392
            int r0 = r6.f154291a1
            r0 = r0 & -65
            r6.f154291a1 = r0
            r0 = 2
            r6.f154295b1 = r0
            goto L_0x0392
        L_0x0280:
            boolean r0 = r6.mo75999e4()
            if (r0 == 0) goto L_0x0392
            if (r3 == 0) goto L_0x0293
            java.lang.String r0 = "PARAM_IS_ENTERING_COMMENT"
            boolean r0 = r3.getBoolean(r0, r8)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r0)
            goto L_0x0294
        L_0x0293:
            r10 = 0
        L_0x0294:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = gy3.C87412m.m108589b(r10, r0)
            if (r0 == 0) goto L_0x02a4
            int r0 = r6.f154291a1
            r0 = r0 | 8
            r6.f154291a1 = r0
            goto L_0x0392
        L_0x02a4:
            int r0 = r6.f154291a1
            r0 = r0 & -9
            r6.f154291a1 = r0
            goto L_0x0392
        L_0x02ac:
            boolean r0 = r6.mo75999e4()
            if (r0 == 0) goto L_0x02e3
            int r0 = r6.f154291a1
            boolean r0 = o40.C61926c.m72696u(r0, r5)
            if (r0 == 0) goto L_0x02e3
            int r0 = r6.f154291a1
            r0 = r0 & r16
            r6.f154291a1 = r0
            j50.a r0 = f159378f
            if (r0 == 0) goto L_0x02c8
            r1 = 2
            r0.mo85691j0(r1)
        L_0x02c8:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r0 = f159376d
            j50.a r0 = r0.mo77627c()
            if (r0 == 0) goto L_0x02d3
            r0.mo85684b0(r8)
        L_0x02d3:
            j50.a r0 = f159378f
            boolean r1 = r0 instanceof p50.C62197e
            if (r1 == 0) goto L_0x02dd
            r10 = r0
            p50.e r10 = (p50.C62197e) r10
            goto L_0x02de
        L_0x02dd:
            r10 = 0
        L_0x02de:
            if (r10 == 0) goto L_0x02e3
            r10.mo87273O0(r8)
        L_0x02e3:
            boolean r0 = r6.mo75999e4()
            if (r0 == 0) goto L_0x0392
            int r0 = r6.f154291a1
            boolean r0 = o40.C61926c.m72696u(r0, r15)
            if (r0 == 0) goto L_0x0392
            int r0 = r6.f154291a1
            r0 = r0 & -65
            r6.f154291a1 = r0
            goto L_0x0392
        L_0x02f9:
            boolean r0 = r6.mo75999e4()
            if (r0 == 0) goto L_0x0392
            int r0 = r6.f154291a1
            boolean r0 = o40.C61926c.m72696u(r0, r5)
            if (r0 != 0) goto L_0x0392
            int r0 = r6.f154291a1
            r0 = r0 | r5
            r6.f154291a1 = r0
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r0 = f159376d
            j50.a r0 = r0.mo77627c()
            if (r0 == 0) goto L_0x0317
            r0.mo85684b0(r13)
        L_0x0317:
            j50.a r0 = f159378f
            boolean r1 = r0 instanceof p50.C62197e
            if (r1 == 0) goto L_0x0321
            r10 = r0
            p50.e r10 = (p50.C62197e) r10
            goto L_0x0322
        L_0x0321:
            r10 = 0
        L_0x0322:
            if (r10 == 0) goto L_0x0392
            r10.mo87273O0(r13)
            goto L_0x0392
        L_0x0328:
            int r0 = r6.f154291a1
            r0 = r0 & -16385(0xffffffffffffbfff, float:NaN)
            r6.f154291a1 = r0
            goto L_0x0392
        L_0x032f:
            int r0 = r6.f154291a1
            r0 = r0 | 16384(0x4000, float:2.2959E-41)
            r6.f154291a1 = r0
            goto L_0x0392
        L_0x0336:
            int r0 = r6.f154291a1
            r1 = -65537(0xfffffffffffeffff, float:NaN)
            r0 = r0 & r1
            r6.f154291a1 = r0
            goto L_0x0392
        L_0x033f:
            int r0 = r6.f154291a1
            r1 = 65536(0x10000, float:9.18355E-41)
            r0 = r0 | r1
            r6.f154291a1 = r0
            goto L_0x0392
        L_0x0347:
            int r0 = r6.f154291a1
            r0 = r0 & -2049(0xfffffffffffff7ff, float:NaN)
            r6.f154291a1 = r0
            goto L_0x0392
        L_0x034e:
            boolean r0 = r6.mo75999e4()
            if (r0 == 0) goto L_0x0392
            int r0 = r6.f154291a1
            r1 = 16
            boolean r0 = o40.C61926c.m72696u(r0, r1)
            if (r0 == 0) goto L_0x0392
            int r0 = r6.f154291a1
            r0 = r0 & -17
            r6.f154291a1 = r0
            goto L_0x0392
        L_0x0365:
            int r0 = r6.f154291a1
            r1 = 32
            boolean r0 = o40.C61926c.m72696u(r0, r1)
            if (r0 != 0) goto L_0x037c
            int r0 = r6.f154291a1
            boolean r0 = o40.C61926c.m72696u(r0, r5)
            if (r0 != 0) goto L_0x037c
            r0 = 2
            r6.f154295b1 = r0
            r6.f154291a1 = r13
        L_0x037c:
            pe1.c<java.lang.Integer> r0 = gg1.C32444a.f86190r0
            java.lang.Object r0 = r0.mo60266n()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            f159350C = r0
            goto L_0x0392
        L_0x038b:
            r0 = 4
            r6.f154295b1 = r0
            r0 = 1024(0x400, float:1.435E-42)
            r6.f154291a1 = r0
        L_0x0392:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "transferState after  event:"
            r0.append(r1)
            r0.append(r2)
            r0.append(r9)
            int r1 = r6.f154295b1
            r0.append(r1)
            r0.append(r11)
            int r1 = r6.f154291a1
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.mo77623Z(fj1.b, boolean, d60.b$b, android.os.Bundle, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x001d, code lost:
        r1 = r1.f154420q;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo77624a(long r6) {
        /*
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "activateMic delay:"
            r0.append(r1)
            r0.append(r6)
            java.lang.String r1 = " curLive:"
            r0.append(r1)
            java.lang.Class<cl1.u> r1 = cl1.C55001u.class
            androidx.lifecycle.i0 r1 = r5.mo77630e(r1)
            cl1.u r1 = (cl1.C55001u) r1
            r2 = 0
            if (r1 == 0) goto L_0x0028
            te3.c21 r1 = r1.f154420q
            if (r1 == 0) goto L_0x0028
            long r3 = r1.f182392d
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            goto L_0x0029
        L_0x0028:
            r1 = r2
        L_0x0029:
            r0.append(r1)
            java.lang.String r1 = " curLinkUser:"
            r0.append(r1)
            java.lang.Class<cl1.d0> r1 = cl1.C54963d0.class
            androidx.lifecycle.i0 r1 = r5.mo77630e(r1)
            cl1.d0 r1 = (cl1.C54963d0) r1
            if (r1 == 0) goto L_0x003d
            al1.j r2 = r1.f154073p
        L_0x003d:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Finder.FinderLiveService"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            cj1.j6 r0 = f159364Q0
            if (r0 == 0) goto L_0x0054
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r0.mo56067c(r6)
        L_0x0054:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.mo77624a(long):void");
    }

    /* renamed from: a0 */
    public final void mo77625a0(int i, JSONObject jSONObject, boolean z) {
        C58115i iVar;
        C65402a aVar = f159381i;
        aVar.getClass();
        f159376d.getClass();
        C60735a aVar2 = f159378f;
        boolean z2 = true;
        if (aVar2 == null || (iVar = aVar2.f172989A) == null || !iVar.mo82886h()) {
            z2 = false;
        }
        if (z2) {
            C65409j.f188221v = i;
            C65409j.f188222w = jSONObject;
        } else if (i != 3 || jSONObject != null) {
            FinderLiveMiniView finderLiveMiniView = aVar.f188207a;
            C45795b bVar = f159348A;
            if (finderLiveMiniView != null && bVar != null) {
                C60735a aVar3 = f159378f;
                if (aVar3 != null) {
                    Context context = MMApplicationContext.getContext();
                    C87412m.m108593f(context, "getContext()");
                    Point P = aVar3.mo85236P(context);
                    C87412m.m108594g(P, "size");
                    C63363c.C63364a.f179734a.getClass();
                    C63363c.C63364a.f179735b.mo88267a(P);
                }
                C60735a aVar4 = f159378f;
                C62197e eVar = aVar4 instanceof C62197e ? (C62197e) aVar4 : null;
                if (eVar != null) {
                    C63367f fVar = eVar.f173028o;
                    boolean Z = eVar.mo85682Z();
                    if (fVar.f179752o != Z) {
                        fVar.f179752o = Z;
                        C61926c.m72668M(new C63369g(Z));
                    }
                }
                if (!finderLiveMiniView.f159790n) {
                    C60600b<?> adapter = finderLiveMiniView.getMultiAreaLayout().getAdapter();
                    C87412m.m108592e(adapter, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.mini.FinderMiniWindowFloatLayoutAdapter");
                    C65409j.m77016m((C65409j) adapter, z, bVar, i, jSONObject, (Point) null, 16, (Object) null);
                }
            }
        }
    }

    /* renamed from: b */
    public final C54655b mo77626b() {
        C60735a aVar = f159378f;
        if (aVar == null || !(aVar instanceof C54655b)) {
            return null;
        }
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.live.core.core.anchor.LiveAnchorTRTCCore");
        return (C54655b) aVar;
    }

    /* renamed from: c */
    public final C60735a mo77627c() {
        C54655b b = mo77626b();
        if (b != null) {
            return b;
        }
        C60735a aVar = f159378f;
        if (aVar == null || !(aVar instanceof C60251a)) {
            return null;
        }
        return (C60251a) aVar;
    }

    /* renamed from: c0 */
    public final void mo77628c0(C64265bq2 bq22) {
        C55001u uVar;
        if (f159380h && (uVar = (C55001u) mo77630e(C55001u.class)) != null) {
            try {
                C47465a parseFrom = new C64293cq2().parseFrom(bq22.f182318j.f257327a);
                C87412m.m108592e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.LiveSdkParams");
                C64293cq2 cq22 = (C64293cq2) parseFrom;
                FinderLiveService finderLiveService = f159376d;
                C58114h hVar = uVar.f154421r;
                Integer num = null;
                finderLiveService.mo77603D(cq22, hVar != null ? hVar.f166250a : null, hVar != null ? hVar.f166251b : null);
                C60735a aVar = f159378f;
                if (aVar != null) {
                    aVar.mo85673A0();
                }
                StringBuilder sb = new StringBuilder();
                sb.append("updateSdkParam lastFps:");
                C60735a aVar2 = f159378f;
                if (aVar2 != null) {
                    num = Integer.valueOf(aVar2.f172997I);
                }
                sb.append(num);
                sb.append(" new Fps:");
                C60971a aVar3 = C60971a.C60973b.f173670a;
                sb.append(aVar3.mo85947d().f174712e);
                Log.m105924i("Finder.FinderLiveService", sb.toString());
                C60735a aVar4 = f159378f;
                if (aVar4 != null && (aVar4 instanceof C54655b)) {
                    boolean z = true;
                    if (!(aVar4 != null && aVar4.f172997I == aVar3.mo85947d().f174712e) && finderLiveService.mo77632f()) {
                        C54991o oVar = (C54991o) finderLiveService.mo77630e(C54991o.class);
                        if (oVar == null || !oVar.f154301c3) {
                            z = false;
                        }
                        if (!z) {
                            C61926c.m72668M(C55931q.f159412d);
                        }
                    }
                }
            } catch (Exception e) {
                Log.m105928w("Finder.FinderLiveService", "updateSdkParam fail:" + e.getMessage());
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.tencent.mm.live.core.core.model.UserVolumeInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: com.tencent.mm.live.core.core.model.UserVolumeInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: com.tencent.mm.live.core.core.model.UserVolumeInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: com.tencent.mm.live.core.core.model.UserVolumeInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: com.tencent.mm.live.core.core.model.UserVolumeInfo} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void callback(int r13, android.os.Bundle r14) {
        /*
            r12 = this;
            r0 = 2
            r1 = 3
            r2 = 1
            r3 = 0
            r4 = 31
            if (r13 != r4) goto L_0x0041
            fj1.b r6 = f159348A
            if (r6 == 0) goto L_0x007d
            er1.f5 r5 = er1.C58728f5.f168144a
            fj1.b r4 = f159348A
            if (r4 == 0) goto L_0x0026
            ok1.e r7 = ok1.C62042e.f176370a
            boolean r8 = r7.mo87073d1(r4)
            if (r8 == 0) goto L_0x001c
            r7 = 2
            goto L_0x0027
        L_0x001c:
            boolean r0 = r7.mo87035Q0(r4)
            if (r0 == 0) goto L_0x0024
            r7 = 3
            goto L_0x0027
        L_0x0024:
            r7 = 1
            goto L_0x0027
        L_0x0026:
            r7 = 0
        L_0x0027:
            java.lang.String r9 = "connectionLost"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "0-vBitrate:"
            r0.append(r4)
            long r10 = b50.C54424j.f152654c
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            r8 = r13
            r5.mo83645b(r6, r7, r8, r9, r10)
            goto L_0x007d
        L_0x0041:
            r4 = 32
            if (r13 != r4) goto L_0x007d
            fj1.b r6 = f159348A
            if (r6 == 0) goto L_0x007d
            er1.f5 r5 = er1.C58728f5.f168144a
            fj1.b r4 = f159348A
            if (r4 == 0) goto L_0x0063
            ok1.e r7 = ok1.C62042e.f176370a
            boolean r8 = r7.mo87073d1(r4)
            if (r8 == 0) goto L_0x0059
            r7 = 2
            goto L_0x0064
        L_0x0059:
            boolean r0 = r7.mo87035Q0(r4)
            if (r0 == 0) goto L_0x0061
            r7 = 3
            goto L_0x0064
        L_0x0061:
            r7 = 1
            goto L_0x0064
        L_0x0063:
            r7 = 0
        L_0x0064:
            java.lang.String r9 = "connectionRecovery"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "0-vBitrate:"
            r0.append(r4)
            long r10 = b50.C54424j.f152654c
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            r8 = r13
            r5.mo83645b(r6, r7, r8, r9, r10)
        L_0x007d:
            com.tencent.mm.plugin.finder.live.view.b r0 = f159379g
            if (r0 == 0) goto L_0x0084
            r0.onLiveEventCallback(r13, r14)
        L_0x0084:
            boolean r0 = f159380h
            if (r0 == 0) goto L_0x017e
            java.lang.Class<cl1.o> r0 = cl1.C54991o.class
            androidx.lifecycle.i0 r0 = r12.mo77630e(r0)
            cl1.o r0 = (cl1.C54991o) r0
            if (r0 == 0) goto L_0x0097
            boolean r0 = r0.f154301c3
            if (r0 != r2) goto L_0x0097
            goto L_0x0098
        L_0x0097:
            r2 = 0
        L_0x0098:
            if (r2 == 0) goto L_0x017e
            cj1.r1 r0 = f159382j
            fj1.b r5 = f159348A
            j50.a r2 = f159378f
            r4 = 0
            if (r2 == 0) goto L_0x00aa
            d50.i r6 = r2.f172989A
            if (r6 == 0) goto L_0x00aa
            java.lang.String r6 = r6.f166260g
            goto L_0x00ab
        L_0x00aa:
            r6 = r4
        L_0x00ab:
            r0.getClass()
            r7 = 19
            if (r13 != r7) goto L_0x0125
            if (r14 == 0) goto L_0x00de
            java.lang.String r13 = "live_user_volume_info"
            java.util.ArrayList r13 = r14.getParcelableArrayList(r13)
            if (r13 == 0) goto L_0x00de
            monitor-enter(r13)
            java.util.Iterator r14 = r13.iterator()     // Catch:{ all -> 0x00db }
        L_0x00c1:
            boolean r1 = r14.hasNext()     // Catch:{ all -> 0x00db }
            if (r1 == 0) goto L_0x00d7
            java.lang.Object r1 = r14.next()     // Catch:{ all -> 0x00db }
            r2 = r1
            com.tencent.mm.live.core.core.model.UserVolumeInfo r2 = (com.tencent.p014mm.live.core.core.model.UserVolumeInfo) r2     // Catch:{ all -> 0x00db }
            java.lang.String r2 = r2.f157117d     // Catch:{ all -> 0x00db }
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r2, (java.lang.String) r6)     // Catch:{ all -> 0x00db }
            if (r2 == 0) goto L_0x00c1
            r4 = r1
        L_0x00d7:
            monitor-exit(r13)
            com.tencent.mm.live.core.core.model.UserVolumeInfo r4 = (com.tencent.p014mm.live.core.core.model.UserVolumeInfo) r4
            goto L_0x00de
        L_0x00db:
            r14 = move-exception
            monitor-exit(r13)
            throw r14
        L_0x00de:
            if (r4 == 0) goto L_0x017e
            java.util.List<is3.a> r13 = r0.f153636a
            java.lang.String r14 = "externalLiveCallbacks"
            gy3.C87412m.m108593f(r13, r14)
            monitor-enter(r13)
            java.util.Iterator r14 = r13.iterator()     // Catch:{ all -> 0x0122 }
        L_0x00ec:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x0122 }
            if (r0 == 0) goto L_0x0120
            java.lang.Object r0 = r14.next()     // Catch:{ all -> 0x0122 }
            is3.a r0 = (is3.C60622a) r0     // Catch:{ all -> 0x0122 }
            java.lang.String r1 = "FinderLiveExternalHelper"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0122 }
            r2.<init>()     // Catch:{ all -> 0x0122 }
            java.lang.String r3 = "onLiveVoiceVolume user:"
            r2.append(r3)     // Catch:{ all -> 0x0122 }
            java.lang.String r3 = r4.f157117d     // Catch:{ all -> 0x0122 }
            r2.append(r3)     // Catch:{ all -> 0x0122 }
            java.lang.String r3 = " volume:"
            r2.append(r3)     // Catch:{ all -> 0x0122 }
            int r3 = r4.f157118e     // Catch:{ all -> 0x0122 }
            r2.append(r3)     // Catch:{ all -> 0x0122 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0122 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)     // Catch:{ all -> 0x0122 }
            int r1 = r4.f157118e     // Catch:{ all -> 0x0122 }
            r0.mo85574a(r1)     // Catch:{ all -> 0x0122 }
            goto L_0x00ec
        L_0x0120:
            monitor-exit(r13)
            goto L_0x017e
        L_0x0122:
            r14 = move-exception
            monitor-exit(r13)
            throw r14
        L_0x0125:
            if (r13 != r1) goto L_0x014f
            if (r2 != 0) goto L_0x012a
            goto L_0x017e
        L_0x012a:
            java.util.List<is3.a> r13 = r0.f153636a
            java.lang.String r14 = "externalLiveCallbacks"
            gy3.C87412m.m108593f(r13, r14)
            monitor-enter(r13)
            java.util.Iterator r14 = r13.iterator()     // Catch:{ all -> 0x014c }
        L_0x0136:
            boolean r1 = r14.hasNext()     // Catch:{ all -> 0x014c }
            if (r1 == 0) goto L_0x014a
            java.lang.Object r1 = r14.next()     // Catch:{ all -> 0x014c }
            is3.a r1 = (is3.C60622a) r1     // Catch:{ all -> 0x014c }
            int r3 = r2.f172998J     // Catch:{ all -> 0x014c }
            int r4 = r0.f153638c     // Catch:{ all -> 0x014c }
            r1.mo85576c(r3, r4)     // Catch:{ all -> 0x014c }
            goto L_0x0136
        L_0x014a:
            monitor-exit(r13)
            goto L_0x017e
        L_0x014c:
            r14 = move-exception
            monitor-exit(r13)
            throw r14
        L_0x014f:
            r14 = 4
            if (r13 != r14) goto L_0x017e
            er1.c5 r14 = er1.C58704c5.f168044a
            er1.C58704c5.C58705a.f168049b = r3
            com.tencent.mm.plugin.report.service.n r14 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            long r0 = er1.C58704c5.f168047d
            r2 = 1143(0x477, double:5.647E-321)
            r14.mo175912v(r0, r2)
            if (r5 == 0) goto L_0x017e
            er1.f5 r4 = er1.C58728f5.f168144a
            r6 = 1144(0x478, float:1.603E-42)
            java.lang.String r8 = "externalErrorBackgroundReport"
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "0-vBitrate:"
            r14.append(r0)
            long r0 = b50.C54424j.f152654c
            r14.append(r0)
            java.lang.String r9 = r14.toString()
            r7 = r13
            r4.mo83645b(r5, r6, r7, r8, r9)
        L_0x017e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.callback(int, android.os.Bundle):void");
    }

    /* renamed from: d0 */
    public final void mo77629d0(C29964e eVar, nr4 nr4) {
        int i = 0;
        eVar.f81125a = nr4 != null ? nr4.f184549d : 0;
        eVar.f81126b = nr4 != null ? nr4.f184550e : 0;
        eVar.f81127c = nr4 != null ? nr4.f184551f : 0;
        if (nr4 != null) {
            i = nr4.f184552g;
        }
        eVar.f81128d = i;
    }

    /* renamed from: e */
    public final <T extends C39622i0> T mo77630e(Class<T> cls) {
        C87412m.m108594g(cls, "bu");
        C45795b bVar = f159348A;
        if (bVar != null) {
            return bVar.mo71262a(cls);
        }
        return null;
    }

    /* renamed from: e0 */
    public final C62197e mo77631e0() {
        C60735a aVar = f159378f;
        if (aVar != null && (aVar instanceof C62197e)) {
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.live.core.core.visitor.LiveVisitorTRTCCore");
            return (C62197e) aVar;
        } else if (aVar == null || !(aVar instanceof C60251a)) {
            return null;
        } else {
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.live.core.core.secdevice.LiveSecondaryDeviceTRTCCore");
            return (C60251a) aVar;
        }
    }

    /* renamed from: f */
    public final boolean mo77632f() {
        String k = C87203t.m108275k();
        C87412m.m108593f(k, "getModel()");
        String lowerCase = k.toLowerCase();
        C87412m.m108593f(lowerCase, "this as java.lang.String).toLowerCase()");
        boolean z = !C112550d0.m153803w(f159387q, lowerCase, false, 2, (Object) null);
        Log.m105924i("Finder.FinderLiveService", "enableDynamicVideoParam notSupportDynamicVideoParamDevice:" + f159387q + " model:" + lowerCase + " result:" + z);
        return z;
    }

    /* renamed from: g */
    public final void mo77633g(C32230s<? super Boolean, ? super Integer, ? super Integer, ? super String, ? super Bundle, C13598b0> sVar) {
        C32230s<? super Boolean, ? super Integer, ? super Integer, ? super String, ? super Bundle, C13598b0> sVar2 = sVar;
        C87412m.m108594g(sVar2, "callback");
        C54806r1 r1Var = f159382j;
        C60735a aVar = f159378f;
        C45795b bVar = f159348A;
        C54795n5 n5Var = f159396y;
        r1Var.getClass();
        C13598b0 b0Var = null;
        C58114h hVar = bVar != null ? ((C55001u) bVar.mo71262a(C55001u.class)).f154421r : null;
        if (!(aVar == null || hVar == null || bVar == null)) {
            C54408d.C54409a.m61122b(aVar, hVar, false, false, 6, (Object) null);
            C58704c5.m68184a(C58704c5.f168044a, C58713e5.f168097y.f168101b, (C89349b) null, false, false, 14, (Object) null);
            C62042e.f176370a.mo87038R1(aVar);
            aVar.mo75218i(new C54775j1(bVar, n5Var, sVar2, r1Var));
            b0Var = C13598b0.f38549a;
        }
        if (b0Var == null) {
            sVar.mo237D(Boolean.FALSE, -1, -1, null, null);
        }
    }

    /* renamed from: h */
    public final void mo77634h(boolean z, int i) {
        List<C60622a> list = f159382j.f153636a;
        C87412m.m108593f(list, "externalLiveCallbacks");
        synchronized (list) {
            for (C60622a g : list) {
                Log.m105924i("FinderLiveExternalHelper", "onPostResult result:" + z + " errType:" + i);
                g.mo85580g(z, i);
            }
        }
    }

    /* renamed from: i */
    public final void mo77635i() {
        C58115i iVar;
        C60735a aVar = f159378f;
        boolean z = true;
        if (aVar == null || (iVar = aVar.f172989A) == null || !iVar.mo82881c()) {
            z = false;
        }
        if (z) {
            ((C119157j) C119157j.f356862d).mo183876g(C28594w5.f78482d, "Finder.LiveExceptionMonitor");
            C60735a aVar2 = f159378f;
            if (aVar2 != null) {
                aVar2.mo75580f0();
            }
            LiveRoomControllerStore liveRoomControllerStore = f159349B;
            if (liveRoomControllerStore != null) {
                C59447j.f169870a.mo84553e(liveRoomControllerStore);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("fullScreen liveStatus:");
        C60735a aVar3 = f159378f;
        sb.append(aVar3 != null ? aVar3.f172989A : null);
        Log.m105924i("Finder.FinderLiveService", sb.toString());
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [j50.a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo77636j(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r8 = " AudioFocus gain"
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            java.lang.String r0 = "Finder.FinderLiveService"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r8)
            java.lang.Class<cl1.d> r8 = cl1.C54951d.class
            androidx.lifecycle.i0 r8 = r7.mo77630e(r8)
            cl1.d r8 = (cl1.C54951d) r8
            r0 = 0
            r1 = 1
            if (r8 == 0) goto L_0x002a
            boolean r8 = r8.mo75869e3()
            if (r8 != r1) goto L_0x002a
            r8 = 1
            goto L_0x002b
        L_0x002a:
            r8 = 0
        L_0x002b:
            if (r8 != 0) goto L_0x0036
            boolean r8 = r7.mo77644r()
            if (r8 == 0) goto L_0x0034
            goto L_0x0036
        L_0x0034:
            r8 = 0
            goto L_0x0037
        L_0x0036:
            r8 = 1
        L_0x0037:
            java.lang.Class<cl1.o> r2 = cl1.C54991o.class
            androidx.lifecycle.i0 r2 = r7.mo77630e(r2)
            cl1.o r2 = (cl1.C54991o) r2
            if (r2 == 0) goto L_0x0044
            int r2 = r2.f154291a1
            goto L_0x0045
        L_0x0044:
            r2 = 0
        L_0x0045:
            r3 = 524288(0x80000, float:7.34684E-40)
            boolean r2 = o40.C61926c.m72696u(r2, r3)
            j50.a r3 = f159378f
            boolean r4 = r3 instanceof p50.C62197e
            r5 = 0
            if (r4 == 0) goto L_0x0055
            p50.e r3 = (p50.C62197e) r3
            goto L_0x0056
        L_0x0055:
            r3 = r5
        L_0x0056:
            if (r3 == 0) goto L_0x0088
            if (r8 != 0) goto L_0x005f
            if (r2 == 0) goto L_0x005d
            goto L_0x005f
        L_0x005d:
            r4 = 0
            goto L_0x0060
        L_0x005f:
            r4 = 1
        L_0x0060:
            r3.mo87273O0(r4)
            if (r2 != 0) goto L_0x0088
            b50.g r4 = r3.f176822Y0
            boolean r4 = r4.mo75229c()
            if (r4 != 0) goto L_0x0088
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r4 = f159376d
            boolean r4 = r4.mo77640n()
            if (r4 == 0) goto L_0x0088
            b50.g r3 = r3.f176822Y0
            r3.getClass()
            java.lang.String r4 = "MicroMsg.LiveCdnPlayerManager"
            java.lang.String r6 = "resumePlay"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r6)
            f50.d r3 = r3.f152627a
            if (r3 == 0) goto L_0x0088
            r3.resume()
        L_0x0088:
            j50.a r3 = f159378f
            boolean r4 = r3 instanceof c50.C54655b
            if (r4 == 0) goto L_0x0091
            r5 = r3
            c50.b r5 = (c50.C54655b) r5
        L_0x0091:
            if (r5 == 0) goto L_0x009b
            if (r8 != 0) goto L_0x0097
            if (r2 == 0) goto L_0x0098
        L_0x0097:
            r0 = 1
        L_0x0098:
            r5.mo85688e0(r0)
        L_0x009b:
            f159365R = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.mo77636j(java.lang.String):void");
    }

    /* renamed from: k */
    public final C66089v mo77637k() {
        C62987t2 t2Var;
        C66089v vVar = f159363Q;
        if (vVar != null) {
            return vVar;
        }
        C56032b bVar = f159379g;
        if (bVar == null || (t2Var = (C62987t2) bVar.getPlugin(C62987t2.class)) == null) {
            return null;
        }
        return t2Var.f178716q;
    }

    /* renamed from: l */
    public final C32931b mo77638l(String str) {
        C87412m.m108594g(str, "key");
        return f159373X.get(str);
    }

    /* renamed from: m */
    public final void mo77639m(long j, long j2) {
        C61926c.m72668M(new C29965h(j2, j));
    }

    /* renamed from: n */
    public final boolean mo77640n() {
        C56032b bVar = f159379g;
        Activity activity = null;
        Context context = bVar != null ? bVar.getContext() : null;
        if (context instanceof Activity) {
            activity = (Activity) context;
        }
        if (activity != null) {
            return activity.isFinishing();
        }
        return false;
    }

    /* renamed from: o */
    public final boolean mo77641o() {
        LiveMutableData<C59464c> liveMutableData;
        C59464c value;
        LiveMutableData<C59464c> liveMutableData2;
        C59464c value2;
        Class cls = C54963d0.class;
        C54963d0 d0Var = (C54963d0) mo77630e(cls);
        if (d0Var != null && d0Var.mo75912T3()) {
            return true;
        }
        C54963d0 d0Var2 = (C54963d0) mo77630e(cls);
        if ((d0Var2 == null || (liveMutableData2 = d0Var2.f154077t) == null || (value2 = liveMutableData2.getValue()) == null || value2.f169898c != 2) ? false : true) {
            return true;
        }
        C54963d0 d0Var3 = (C54963d0) mo77630e(cls);
        return d0Var3 != null && (liveMutableData = d0Var3.f154077t) != null && (value = liveMutableData.getValue()) != null && value.f169898c == 3;
    }

    public void onComplete(int i, int i2) {
        mo77601B(true);
    }

    public void onPlayProgress(int i, long j, long j2) {
        Log.m105924i("Finder.FinderLiveService", "[onPlayBgmProgress], " + i + " , " + j + " ," + j2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        r4 = r0.f172989A;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onStart(int r7, int r8) {
        /*
            r6 = this;
            com.tencent.mm.plugin.finder.live.view.b r0 = f159379g
            fj1.b r1 = f159348A
            java.lang.String r2 = "Finder.FinderLiveService"
            if (r0 == 0) goto L_0x0067
            if (r1 == 0) goto L_0x0067
            if (r8 == 0) goto L_0x0064
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isConnected((android.content.Context) r0)
            if (r0 == 0) goto L_0x0040
            j50.a r0 = f159378f
            r1 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0027
            d50.i r4 = r0.f172989A
            if (r4 == 0) goto L_0x0027
            int r4 = r4.f166265l
            r5 = 2
            if (r4 != r5) goto L_0x0027
            r4 = 1
            goto L_0x0028
        L_0x0027:
            r4 = 0
        L_0x0028:
            if (r4 != 0) goto L_0x0040
            if (r0 == 0) goto L_0x0036
            d50.i r0 = r0.f172989A
            if (r0 == 0) goto L_0x0036
            int r0 = r0.f166265l
            r4 = 3
            if (r0 != r4) goto L_0x0036
            goto L_0x0037
        L_0x0036:
            r1 = 0
        L_0x0037:
            if (r1 == 0) goto L_0x003a
            goto L_0x0040
        L_0x003a:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r7 = f159376d
            r7.mo77601B(r3)
            goto L_0x0064
        L_0x0040:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r0 = f159376d
            wg1.v r0 = r0.mo77637k()
            if (r0 == 0) goto L_0x004b
            r0.mo90006t0(r7)
        L_0x004b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onStart:"
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = " error,but network error!"
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r7)
        L_0x0064:
            rx3.b0 r7 = rx3.C13598b0.f38549a
            goto L_0x0068
        L_0x0067:
            r7 = 0
        L_0x0068:
            if (r7 != 0) goto L_0x008a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "onStart error curLiveLayout:"
            r7.append(r0)
            com.tencent.mm.plugin.finder.live.view.b r0 = f159379g
            r7.append(r0)
            java.lang.String r0 = ",curLiveRoomData:"
            r7.append(r0)
            fj1.b r0 = f159348A
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r7)
        L_0x008a:
            if (r8 == 0) goto L_0x0091
            com.tencent.mm.plugin.finder.live.model.FinderLiveService$j r7 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.C3156j.f15088d
            o40.C61926c.m72668M(r7)
        L_0x0091:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.onStart(int, int):void");
    }

    /* renamed from: p */
    public final boolean mo77642p(String str) {
        C55001u uVar = (C55001u) mo77630e(C55001u.class);
        return (str == null || str.length() == 0) || !Util.isEqual(str, uVar != null ? uVar.f154426w : null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        r1 = (r1 = r1.f154077t).getValue();
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo77643q() {
        /*
            r4 = this;
            java.lang.Class<cl1.d0> r0 = cl1.C54963d0.class
            androidx.lifecycle.i0 r1 = r4.mo77630e(r0)
            cl1.d0 r1 = (cl1.C54963d0) r1
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x001e
            com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData<gi1.c> r1 = r1.f154077t
            if (r1 == 0) goto L_0x001e
            java.lang.Object r1 = r1.getValue()
            gi1.c r1 = (gi1.C59464c) r1
            if (r1 == 0) goto L_0x001e
            int r1 = r1.f169898c
            if (r1 != r2) goto L_0x001e
            r1 = 1
            goto L_0x001f
        L_0x001e:
            r1 = 0
        L_0x001f:
            if (r1 != 0) goto L_0x0041
            androidx.lifecycle.i0 r0 = r4.mo77630e(r0)
            cl1.d0 r0 = (cl1.C54963d0) r0
            if (r0 == 0) goto L_0x003c
            com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData<gi1.c> r0 = r0.f154077t
            if (r0 == 0) goto L_0x003c
            java.lang.Object r0 = r0.getValue()
            gi1.c r0 = (gi1.C59464c) r0
            if (r0 == 0) goto L_0x003c
            int r0 = r0.f169898c
            r1 = 3
            if (r0 != r1) goto L_0x003c
            r0 = 1
            goto L_0x003d
        L_0x003c:
            r0 = 0
        L_0x003d:
            if (r0 == 0) goto L_0x0040
            goto L_0x0041
        L_0x0040:
            r2 = 0
        L_0x0041:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.mo77643q():boolean");
    }

    /* renamed from: r */
    public final boolean mo77644r() {
        return C65770a0.f189184r.mo89819a().f189189c != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x001c, code lost:
        r1 = r1.f154420q;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo77645s(long r4) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "keepAlive delay:"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = " curLive:"
            r0.append(r1)
            java.lang.Class<cl1.u> r1 = cl1.C55001u.class
            androidx.lifecycle.i0 r1 = r3.mo77630e(r1)
            cl1.u r1 = (cl1.C55001u) r1
            if (r1 == 0) goto L_0x0027
            te3.c21 r1 = r1.f154420q
            if (r1 == 0) goto L_0x0027
            long r1 = r1.f182392d
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            goto L_0x0028
        L_0x0027:
            r1 = 0
        L_0x0028:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Finder.FinderLiveService"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            cj1.j6 r0 = f159395x0
            if (r0 == 0) goto L_0x003b
            r0.mo56066b()
        L_0x003b:
            cj1.j6 r0 = f159395x0
            if (r0 == 0) goto L_0x0046
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r0.mo56067c(r4)
        L_0x0046:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.mo77645s(long):void");
    }

    /* renamed from: t */
    public final void mo77646t() {
        C34379c<?> cVar = C54749e2.f153458b;
        if (cVar != null) {
            cVar.cancel(true);
        }
        C34379c<?> cVar2 = C54749e2.f153460d;
        if (cVar2 != null) {
            cVar2.cancel(true);
        }
        C34767b.C34768c cVar3 = f159388r;
        if (cVar3 != null) {
            ((C34767b) C86312j.m106911c(C34767b.class)).b20(cVar3);
        }
        f159388r = null;
        C28574j6 j6Var = f159386p0;
        if (j6Var != null) {
            j6Var.mo56066b();
        }
        C28574j6 j6Var2 = f159395x0;
        if (j6Var2 != null) {
            j6Var2.mo56066b();
        }
        C28574j6 j6Var3 = f159397y0;
        if (j6Var3 != null) {
            j6Var3.mo56066b();
        }
        C54766h4.f153496f.stopTimer();
        Log.m105924i("Finder.FinderLiveService", "removeBattleEndDelayTimer");
        MMHandlerThread.removeRunnable(f159360M);
        for (Map.Entry<String, C32931b> value : f159373X.entrySet()) {
            ((C32931b) value.getValue()).mo58875d();
        }
    }

    /* renamed from: u */
    public final void mo77647u() {
        mo77608K();
        C54766h4 h4Var = C54766h4.f153491a;
        C54766h4.f153492b = System.currentTimeMillis();
        MTimerHandler mTimerHandler = C54766h4.f153496f;
        mTimerHandler.stopTimer();
        mTimerHandler.startTimer(60000);
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [j50.a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x009c  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo77648v(java.lang.String r10) {
        /*
            r9 = this;
            java.lang.ref.WeakReference r0 = com.tencent.p014mm.app.AppForegroundDelegate.m161224g()
            r1 = 0
            if (r0 == 0) goto L_0x000e
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            goto L_0x000f
        L_0x000e:
            r0 = r1
        L_0x000f:
            com.tencent.mm.plugin.finder.live.view.b r2 = f159379g
            if (r2 == 0) goto L_0x0018
            android.content.Context r2 = r2.getContext()
            goto L_0x0019
        L_0x0018:
            r2 = r1
        L_0x0019:
            boolean r3 = r2 instanceof android.app.Activity
            if (r3 == 0) goto L_0x0020
            android.app.Activity r2 = (android.app.Activity) r2
            goto L_0x0021
        L_0x0020:
            r2 = r1
        L_0x0021:
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x002d
            boolean r2 = r2.isDestroyed()
            if (r2 != r3) goto L_0x002d
            r2 = 1
            goto L_0x002e
        L_0x002d:
            r2 = 0
        L_0x002e:
            if (r2 != 0) goto L_0x0052
            com.tencent.mm.plugin.finder.live.view.b r2 = f159379g
            if (r2 == 0) goto L_0x0039
            android.content.Context r2 = r2.getContext()
            goto L_0x003a
        L_0x0039:
            r2 = r1
        L_0x003a:
            boolean r5 = r2 instanceof android.app.Activity
            if (r5 == 0) goto L_0x0041
            android.app.Activity r2 = (android.app.Activity) r2
            goto L_0x0042
        L_0x0041:
            r2 = r1
        L_0x0042:
            if (r2 == 0) goto L_0x004c
            boolean r2 = r2.isFinishing()
            if (r2 != r3) goto L_0x004c
            r2 = 1
            goto L_0x004d
        L_0x004c:
            r2 = 0
        L_0x004d:
            if (r2 == 0) goto L_0x0050
            goto L_0x0052
        L_0x0050:
            r2 = 0
            goto L_0x0053
        L_0x0052:
            r2 = 1
        L_0x0053:
            j50.a r5 = f159378f
            if (r5 == 0) goto L_0x0063
            d50.i r5 = r5.f172989A
            if (r5 == 0) goto L_0x0063
            boolean r5 = r5.mo82881c()
            if (r5 != r3) goto L_0x0063
            r5 = 1
            goto L_0x0064
        L_0x0063:
            r5 = 0
        L_0x0064:
            j50.a r6 = f159378f
            boolean r7 = r6 instanceof p50.C62197e
            if (r7 == 0) goto L_0x006d
            p50.e r6 = (p50.C62197e) r6
            goto L_0x006e
        L_0x006d:
            r6 = r1
        L_0x006e:
            if (r6 == 0) goto L_0x0091
            b50.g r6 = r6.f176822Y0
            if (r6 == 0) goto L_0x0091
            f50.d r7 = r6.f152627a
            if (r7 == 0) goto L_0x007b
            r7.setMute(r3)
        L_0x007b:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r7 = f159376d
            boolean r7 = r7.mo77640n()
            if (r7 == 0) goto L_0x0091
            java.lang.String r7 = "MicroMsg.LiveCdnPlayerManager"
            java.lang.String r8 = "pausePlay"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)
            f50.d r6 = r6.f152627a
            if (r6 == 0) goto L_0x0091
            r6.pause()
        L_0x0091:
            j50.a r6 = f159378f
            boolean r7 = r6 instanceof c50.C54655b
            if (r7 == 0) goto L_0x009a
            r1 = r6
            c50.b r1 = (c50.C54655b) r1
        L_0x009a:
            if (r1 == 0) goto L_0x009f
            r1.mo85688e0(r3)
        L_0x009f:
            f159365R = r4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r10)
            java.lang.String r10 = " AudioFocus lossTransient topActivity:"
            r1.append(r10)
            r1.append(r0)
            java.lang.String r10 = " curActivityDestroy:"
            r1.append(r10)
            r1.append(r2)
            java.lang.String r10 = " isFloatMode:"
            r1.append(r10)
            r1.append(r5)
            java.lang.String r10 = r1.toString()
            java.lang.String r0 = "Finder.FinderLiveService"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.mo77648v(java.lang.String):void");
    }

    /* renamed from: w */
    public final int mo77649w() {
        C32444a aVar = C32444a.f86121a;
        int intValue = C32444a.f86094R.mo60266n().intValue();
        Log.m105924i("Finder.FinderLiveService", "mirroMode:" + intValue);
        return intValue;
    }

    /* renamed from: x */
    public final boolean mo77650x() {
        C58114h hVar;
        C58112f fVar;
        C58114h hVar2;
        C58112f fVar2;
        Class cls = C55001u.class;
        boolean z = false;
        if (C62042e.f176370a.mo87110q1()) {
            return false;
        }
        C55001u uVar = (C55001u) mo77630e(cls);
        if ((uVar != null ? uVar.f154421r : null) != null) {
            C55001u uVar2 = (C55001u) mo77630e(cls);
            if (!((uVar2 == null || (hVar2 = uVar2.f154421r) == null || (fVar2 = hVar2.f166253d) == null || !fVar2.f166227b) ? false : true)) {
                Log.m105924i("Finder.FinderLiveService", "use back camera, finalMirror:false");
                return z;
            }
        }
        C55001u uVar3 = (C55001u) mo77630e(cls);
        z = (uVar3 == null || (hVar = uVar3.f154421r) == null || (fVar = hVar.f166253d) == null) ? true : fVar.f166230e;
        Log.m105924i("Finder.FinderLiveService", "use front camera, finalMirror:" + z);
        return z;
    }

    /* renamed from: y */
    public final void mo77651y(boolean z) {
        C66089v k = mo77637k();
        if (z) {
            if (k != null) {
                k.mo90000g0();
            }
        } else if (k != null) {
            k.mo89999f1();
        }
    }

    /* renamed from: z */
    public final void mo77652z(int i) {
        C54795n5 n5Var;
        Class cls = C54991o.class;
        StringBuilder sb = new StringBuilder();
        sb.append("pauseLive: liveStarted:");
        C54991o oVar = (C54991o) mo77630e(cls);
        sb.append(oVar != null ? Boolean.valueOf(oVar.mo75999e4()) : null);
        sb.append(", scene:");
        sb.append(i);
        Log.m105924i("Finder.FinderLiveService", sb.toString());
        C54991o oVar2 = (C54991o) mo77630e(cls);
        boolean z = false;
        if (oVar2 != null && oVar2.mo75999e4()) {
            z = true;
        }
        if (z && (n5Var = f159396y) != null) {
            n5Var.mo75727c(1, i, new C55924k());
        }
    }
}
