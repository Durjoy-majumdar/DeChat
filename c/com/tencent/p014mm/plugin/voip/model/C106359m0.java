package com.tencent.p014mm.plugin.voip.model;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.CheckF2FCameraIsOpenEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.VoipButtonStatusStruct;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.voip.model.C106377r;
import com.tencent.p014mm.sdk.platformtools.ConnectivityCompat;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C85796t4;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32226l;
import java.util.ArrayList;
import java.util.LinkedList;
import l33.C109247e;
import lu3.C34379c;
import p156gj.C107835h0;
import p182kk.C61104a;
import p206nj.C76861g;
import p212oe.C117776s;
import p492dn.C107054l;
import p565ir.C60606n;
import p761yd.C91441c;
import p933be.C113173i;
import pe3.C89349b;
import rx3.C13604l;
import s33.C110721a;
import s33.C110724b;
import s33.C110728c;
import s33.C110730g;
import s33.C110732i;
import s33.C110734l;
import s33.C48221f;
import s33.C63694d;
import te3.C101864x23;
import te3.np4;
import te3.su4;
import te3.yu4;
import w33.C111720c0;
import w33.C111730z;
import x33.C38447a;
import z33.C112581a;
import z33.C112597j;
import z33.C91617n;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.voip.model.m0 */
public class C106359m0 implements C106377r.C106387h {

    /* renamed from: A */
    public static int f317390A = -1;

    /* renamed from: B */
    public static int f317391B = 20;

    /* renamed from: C */
    public static int f317392C = 0;

    /* renamed from: D */
    public static int f317393D = 0;

    /* renamed from: E */
    public static int f317394E = 0;

    /* renamed from: z */
    public static int f317395z = -1;

    /* renamed from: a */
    public C106377r f317396a = null;

    /* renamed from: b */
    public Object f317397b = new Object();

    /* renamed from: c */
    public int f317398c = 0;

    /* renamed from: d */
    public C34379c<?> f317399d;

    /* renamed from: e */
    public C34379c<?> f317400e;

    /* renamed from: f */
    public boolean f317401f = false;

    /* renamed from: g */
    public int f317402g = 0;

    /* renamed from: h */
    public int f317403h = 0;

    /* renamed from: i */
    public C106366g f317404i;

    /* renamed from: j */
    public C106366g f317405j;

    /* renamed from: k */
    public C106364e f317406k;

    /* renamed from: l */
    public C106367h f317407l;

    /* renamed from: m */
    public C114467i f317408m;

    /* renamed from: n */
    public Object f317409n = new Object();

    /* renamed from: o */
    public C113173i f317410o;

    /* renamed from: p */
    public int f317411p = 0;

    /* renamed from: q */
    public int f317412q = 0;

    /* renamed from: r */
    public String f317413r = null;

    /* renamed from: s */
    public boolean f317414s = false;

    /* renamed from: t */
    public boolean f317415t = false;

    /* renamed from: u */
    public MTimerHandler f317416u = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C106360a(), false);

    /* renamed from: v */
    public byte[] f317417v = new byte[500];

    /* renamed from: w */
    public MTimerHandler f317418w = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C106361b(), true);

    /* renamed from: x */
    public MTimerHandler f317419x = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C106362c(), true);

    /* renamed from: y */
    public MTimerHandler f317420y = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C106363d(), true);

    /* renamed from: com.tencent.mm.plugin.voip.model.m0$a */
    public class C106360a implements MTimerHandler.CallBack {
        public C106360a() {
        }

        public boolean onTimerExpired() {
            C106377r rVar = C106359m0.this.f317396a;
            if (rVar.f317500x.f317653m == 1) {
                int i = rVar.f317476a;
                if (i == 2 || i == 4) {
                    C112597j.m153938c("MicroMsg.Voip.VoipServiceEx", "call timeout!");
                    C106359m0.this.f317396a.f317500x.f317568G1.f317772a = 101;
                    C115669n.INSTANCE.mo160131h(11521, Integer.valueOf(C109247e.xx0().mo152615n()), Long.valueOf(C109247e.xx0().mo152616o()), Long.valueOf(C109247e.xx0().mo152617p()), 4, Long.valueOf(System.currentTimeMillis()), Long.valueOf(System.currentTimeMillis()));
                    C106359m0.this.f317396a.f317502z.mo152487q0();
                    C106359m0.this.mo152656b(4);
                }
            }
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.model.m0$b */
    public class C106361b implements MTimerHandler.CallBack {
        public C106361b() {
        }

        public boolean onTimerExpired() {
            C106377r rVar = C106359m0.this.f317396a;
            rVar.f317458I++;
            v2protocal v2protocal = rVar.f317500x;
            if (v2protocal.f317656n == 0) {
                C112597j.m153937b("MicroMsg.Voip.VoipServiceEx", C76861g.m92660c() + "double link switch roomId == 0 ");
                C106359m0.this.f317418w.stopTimer();
            } else {
                v2protocal.app2EngineDataEx(v2protocal.f317631e1, v2protocal.f317634f1, v2protocal.f317637g1, 0, 0);
                C106377r rVar2 = C106359m0.this.f317396a;
                if (!rVar2.f317457H && 1 == rVar2.f317500x.field_mGetValidSample) {
                    rVar2.f317457H = true;
                    rVar2.f317459J = rVar2.f317458I;
                }
                int i = 15;
                if (1 == rVar2.f317494r) {
                    rVar2.f317494r = 15;
                }
                if (true == rVar2.f317457H) {
                    int i2 = rVar2.f317458I;
                    if (i2 - rVar2.f317459J == rVar2.f317494r) {
                        v2protocal v2protocal2 = rVar2.f317500x;
                        if ((v2protocal2.f317608V0 & 1) == 0) {
                            rVar2.f317459J = i2;
                            int isDCSameLan = v2protocal2.isDCSameLan();
                            int currentConnType = C106359m0.this.f317396a.f317500x.getCurrentConnType();
                            if (1 == isDCSameLan && 1 == currentConnType) {
                                C112597j.m153938c("MicroMsg.Voip.VoipServiceEx", "zhengxue[DOUBLELINK]  In the Same LAN, isDCSameLan = " + isDCSameLan);
                                C106377r rVar3 = C106359m0.this.f317396a;
                                rVar3.f317458I = rVar3.f317458I + 1;
                                return true;
                            }
                            int i3 = C106359m0.this.f317396a.f317500x.getcurstrategy();
                            int isRelayConnReady = C106359m0.this.f317396a.f317500x.isRelayConnReady();
                            int isDCReady = C106359m0.this.f317396a.f317500x.isDCReady();
                            C106359m0 m0Var = C106359m0.this;
                            C106377r rVar4 = m0Var.f317396a;
                            int i4 = rVar4.f317494r - 3;
                            if (i4 <= 15) {
                                i = i4;
                            }
                            rVar4.f317500x.app2EngineLinkQualityEx(i, m0Var.f317417v);
                            C106359m0 m0Var2 = C106359m0.this;
                            v2protocal v2protocal3 = m0Var2.f317396a.f317500x;
                            new C63694d(v2protocal3.f317656n, v2protocal3.f317665q, v2protocal3.f317662p, currentConnType, isRelayConnReady, isDCReady, i3, m0Var2.f317417v, v2protocal3.field_realLinkQualityInfoBuffLen).mo88544n1();
                            C106359m0.this.f317396a.f317500x.f317612X0++;
                            C112597j.m153938c("MicroMsg.Voip.VoipServiceEx", "zhengxue[DOUBLELINK]  doubleLinkSwitchReportStatus " + C106359m0.this.f317396a.f317494r + " isFirstValidSampleSet " + C106359m0.this.f317396a.f317457H + " mGetValidSample " + C106359m0.this.f317396a.f317500x.field_mGetValidSample + "mDoubleLinkSwitchReqCnt " + C106359m0.this.f317396a.f317500x.f317612X0 + "mTimerCounter " + C106359m0.this.f317396a.f317458I + "mLastSwitchTimer " + C106359m0.this.f317396a.f317459J);
                        }
                    }
                }
            }
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.model.m0$c */
    public class C106362c implements MTimerHandler.CallBack {
        public C106362c() {
        }

        public boolean onTimerExpired() {
            C106377r rVar = C106359m0.this.f317396a;
            v2protocal v2protocal = rVar.f317500x;
            int i = v2protocal.f317656n;
            if (i == 0) {
                C112597j.m153937b("MicroMsg.Voip.VoipServiceEx", C76861g.m92660c() + " roomId == 0 ");
                C106359m0.this.f317419x.stopTimer();
            } else {
                if (rVar.f317476a >= 5) {
                    C48221f fVar = new C48221f(i, v2protocal.f317665q, rVar.f317468S, rVar.f317456G, v2protocal.GetChannelDataTimeoutCnt());
                    C106401z zVar = C106359m0.this.f317396a.f317500x.f317568G1;
                    if (zVar.f317760O != 0) {
                        zVar.mo152874f(-1);
                    }
                    zVar.f317760O = System.currentTimeMillis();
                    fVar.mo88544n1();
                }
            }
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.model.m0$d */
    public class C106363d implements MTimerHandler.CallBack {
        public C106363d() {
        }

        public boolean onTimerExpired() {
            int i;
            Log.m105924i("MicroMsg.Voip.VoipServiceEx", "voip called out of time,now destroy...");
            C106359m0 m0Var = C106359m0.this;
            if (3 == m0Var.f317396a.f317476a && (i = m0Var.f317398c) != 0 && i == m0Var.mo152659e()) {
                C106359m0 m0Var2 = C106359m0.this;
                m0Var2.f317398c = 0;
                m0Var2.f317396a.mo152719v(5, -9000, "", -1);
            }
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.model.m0$e */
    public class C106364e implements Runnable {
        public C106364e() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:58:0x0165  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x0178  */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x0180  */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x0188  */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x0190  */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x0198  */
        /* JADX WARNING: Removed duplicated region for block: B:76:0x01a0  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x01a6  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r10 = this;
                java.lang.String r0 = "MicroMsg.Voip.VoipServiceEx"
                java.lang.String r1 = "VOIPBatThermalTask"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r1)
                android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                int r0 = p981ie.C117159b.m165207h(r0)
                com.tencent.p014mm.plugin.voip.model.C106359m0.f317392C = r0
                r0 = 4
                java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r0)
                int r2 = com.tencent.p014mm.plugin.voip.model.C106359m0.f317392C
                java.nio.ByteBuffer r1 = r1.putInt(r2)
                byte[] r1 = r1.array()
                com.tencent.mm.plugin.voip.model.m0 r2 = com.tencent.p014mm.plugin.voip.model.C106359m0.this
                com.tencent.mm.plugin.voip.model.r r2 = r2.f317396a
                com.tencent.mm.plugin.voip.model.v2protocal r2 = r2.f317500x
                int r3 = r1.length
                r4 = 3
                r2.setJNIAppCmd(r4, r1, r3)
                com.tencent.mm.plugin.voip.model.m0 r1 = com.tencent.p014mm.plugin.voip.model.C106359m0.this
                com.tencent.mm.plugin.voip.model.r r1 = r1.f317396a
                com.tencent.mm.plugin.voip.model.v2protocal r1 = r1.f317500x
                int r2 = com.tencent.p014mm.plugin.voip.model.C106359m0.f317392C
                r1.f317660o0 = r2
                r3 = 350(0x15e, float:4.9E-43)
                r5 = 1
                if (r2 > r3) goto L_0x0040
                int r2 = r1.f317669r0
                int r2 = r2 + r5
                r1.f317669r0 = r2
                goto L_0x0059
            L_0x0040:
                r3 = 380(0x17c, float:5.32E-43)
                if (r2 > r3) goto L_0x004a
                int r2 = r1.f317672s0
                int r2 = r2 + r5
                r1.f317672s0 = r2
                goto L_0x0059
            L_0x004a:
                r3 = 420(0x1a4, float:5.89E-43)
                if (r2 > r3) goto L_0x0054
                int r2 = r1.f317675t0
                int r2 = r2 + r5
                r1.f317675t0 = r2
                goto L_0x0059
            L_0x0054:
                int r2 = r1.f317678u0
                int r2 = r2 + r5
                r1.f317678u0 = r2
            L_0x0059:
                android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                int r1 = p981ie.C117159b.m165205f(r1)
                com.tencent.p014mm.plugin.voip.model.C106359m0.f317393D = r1
                be.b r1 = p933be.C113159b.m154842h()
                be.b$c r1 = r1.mo165664a()
                int r2 = com.tencent.p014mm.plugin.voip.model.C106359m0.f317393D
                if (r2 <= 0) goto L_0x0088
                java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r0)
                int r3 = com.tencent.p014mm.plugin.voip.model.C106359m0.f317393D
                java.nio.ByteBuffer r2 = r2.putInt(r3)
                byte[] r2 = r2.array()
                com.tencent.mm.plugin.voip.model.m0 r3 = com.tencent.p014mm.plugin.voip.model.C106359m0.this
                com.tencent.mm.plugin.voip.model.r r3 = r3.f317396a
                com.tencent.mm.plugin.voip.model.v2protocal r3 = r3.f317500x
                r6 = 7
                int r7 = r2.length
                r3.setJNIAppCmd(r6, r2, r7)
            L_0x0088:
                boolean r1 = r1.mo165678c()
                r2 = 0
                if (r1 == 0) goto L_0x0092
                com.tencent.p014mm.plugin.voip.model.C106359m0.f317394E = r5
                goto L_0x0094
            L_0x0092:
                com.tencent.p014mm.plugin.voip.model.C106359m0.f317394E = r2
            L_0x0094:
                com.tencent.mm.plugin.voip.model.m0 r1 = com.tencent.p014mm.plugin.voip.model.C106359m0.this
                com.tencent.mm.plugin.voip.model.r r1 = r1.f317396a
                com.tencent.mm.plugin.voip.model.v2protocal r1 = r1.f317500x
                int r3 = com.tencent.p014mm.plugin.voip.model.C106359m0.f317394E
                r1.f317549A0 = r3
                java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r0)
                int r3 = com.tencent.p014mm.plugin.voip.model.C106359m0.f317394E
                java.nio.ByteBuffer r1 = r1.putInt(r3)
                byte[] r1 = r1.array()
                com.tencent.mm.plugin.voip.model.m0 r3 = com.tencent.p014mm.plugin.voip.model.C106359m0.this
                com.tencent.mm.plugin.voip.model.r r3 = r3.f317396a
                com.tencent.mm.plugin.voip.model.v2protocal r3 = r3.f317500x
                r6 = 10
                int r7 = r1.length
                r3.setJNIAppCmd(r6, r1, r7)
                android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                java.lang.String r3 = "power"
                java.lang.Object r1 = r1.getSystemService(r3)
                android.os.PowerManager r1 = (android.os.PowerManager) r1
                if (r1 == 0) goto L_0x00cb
                boolean r1 = r1.isPowerSaveMode()
                goto L_0x00cc
            L_0x00cb:
                r1 = 0
            L_0x00cc:
                com.tencent.mm.plugin.voip.model.m0 r3 = com.tencent.p014mm.plugin.voip.model.C106359m0.this
                com.tencent.mm.plugin.voip.model.r r3 = r3.f317396a
                com.tencent.mm.plugin.voip.model.v2protocal r3 = r3.f317500x
                r3.f317555C0 = r1
                java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r0)
                java.nio.ByteBuffer r3 = r3.putInt(r1)
                byte[] r3 = r3.array()
                com.tencent.mm.plugin.voip.model.m0 r6 = com.tencent.p014mm.plugin.voip.model.C106359m0.this
                com.tencent.mm.plugin.voip.model.r r6 = r6.f317396a
                com.tencent.mm.plugin.voip.model.v2protocal r6 = r6.f317500x
                r7 = 8
                int r8 = r3.length
                r6.setJNIAppCmd(r7, r3, r8)
                boolean r3 = p761yd.C91441c.m114729c()
                if (r3 == 0) goto L_0x0162
                com.tencent.mm.plugin.voip.model.m0 r3 = com.tencent.p014mm.plugin.voip.model.C106359m0.this
                be.i r6 = r3.f317410o
                if (r6 == 0) goto L_0x0162
                int r6 = r3.f317411p
                if (r6 != r5) goto L_0x010f
                java.lang.Object r3 = r3.f317409n
                monitor-enter(r3)
                com.tencent.mm.plugin.voip.model.m0 r6 = com.tencent.p014mm.plugin.voip.model.C106359m0.this     // Catch:{ all -> 0x010c }
                com.tencent.matrix.batterycanary.monitor.feature.i r6 = r6.f317408m     // Catch:{ all -> 0x010c }
                r6.mo173662f()     // Catch:{ all -> 0x010c }
                com.tencent.mm.plugin.voip.model.m0 r6 = com.tencent.p014mm.plugin.voip.model.C106359m0.this     // Catch:{ all -> 0x010c }
                r6.f317412q = r5     // Catch:{ all -> 0x010c }
                monitor-exit(r3)     // Catch:{ all -> 0x010c }
                goto L_0x010f
            L_0x010c:
                r0 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x010c }
                throw r0
            L_0x010f:
                com.tencent.mm.plugin.voip.model.m0 r3 = com.tencent.p014mm.plugin.voip.model.C106359m0.this
                int r6 = r3.f317411p
                if (r6 != 0) goto L_0x0131
                com.tencent.matrix.batterycanary.monitor.feature.i r3 = r3.f317408m
                java.lang.Class<com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot> r6 = com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature.JiffiesSnapshot.class
                r3.mo173675s(r6)
                com.tencent.mm.plugin.voip.model.m0 r3 = com.tencent.p014mm.plugin.voip.model.C106359m0.this
                java.lang.Object r3 = r3.f317409n
                monitor-enter(r3)
                com.tencent.mm.plugin.voip.model.m0 r6 = com.tencent.p014mm.plugin.voip.model.C106359m0.this     // Catch:{ all -> 0x012e }
                com.tencent.matrix.batterycanary.monitor.feature.i r6 = r6.f317408m     // Catch:{ all -> 0x012e }
                r6.mo173679v()     // Catch:{ all -> 0x012e }
                com.tencent.mm.plugin.voip.model.m0 r6 = com.tencent.p014mm.plugin.voip.model.C106359m0.this     // Catch:{ all -> 0x012e }
                r6.f317411p = r5     // Catch:{ all -> 0x012e }
                monitor-exit(r3)     // Catch:{ all -> 0x012e }
                goto L_0x0131
            L_0x012e:
                r0 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x012e }
                throw r0
            L_0x0131:
                com.tencent.mm.plugin.voip.model.m0 r3 = com.tencent.p014mm.plugin.voip.model.C106359m0.this
                int r6 = r3.f317411p
                if (r6 != r5) goto L_0x0162
                int r6 = r3.f317412q
                if (r6 != r5) goto L_0x0162
                r3.f317411p = r2
                r3.f317412q = r2
                com.tencent.matrix.batterycanary.monitor.feature.i r3 = r3.f317408m
                ce.a r6 = r3.f343163l
                if (r6 == 0) goto L_0x0162
                int r3 = r3.mo173666j()
                if (r3 < 0) goto L_0x0163
                java.nio.ByteBuffer r6 = java.nio.ByteBuffer.allocate(r0)
                java.nio.ByteBuffer r6 = r6.putInt(r3)
                byte[] r6 = r6.array()
                com.tencent.mm.plugin.voip.model.m0 r7 = com.tencent.p014mm.plugin.voip.model.C106359m0.this
                com.tencent.mm.plugin.voip.model.r r7 = r7.f317396a
                com.tencent.mm.plugin.voip.model.v2protocal r7 = r7.f317500x
                int r8 = r6.length
                r7.setJNIAppCmd(r0, r6, r8)
                goto L_0x0163
            L_0x0162:
                r3 = 0
            L_0x0163:
                if (r3 <= 0) goto L_0x016d
                com.tencent.mm.plugin.voip.model.m0 r6 = com.tencent.p014mm.plugin.voip.model.C106359m0.this
                com.tencent.mm.plugin.voip.model.r r6 = r6.f317396a
                com.tencent.mm.plugin.voip.model.v2protocal r6 = r6.f317500x
                r6.f317681v0 = r3
            L_0x016d:
                com.tencent.mm.plugin.voip.model.m0 r6 = com.tencent.p014mm.plugin.voip.model.C106359m0.this
                com.tencent.mm.plugin.voip.model.r r6 = r6.f317396a
                com.tencent.mm.plugin.voip.model.v2protocal r6 = r6.f317500x
                int r7 = r6.f317663p0
                r8 = -1
                if (r7 != r8) goto L_0x017c
                int r7 = com.tencent.p014mm.plugin.voip.model.C106359m0.f317392C
                r6.f317663p0 = r7
            L_0x017c:
                int r7 = r6.f317684w0
                if (r7 != 0) goto L_0x0184
                int r7 = r6.f317681v0
                r6.f317684w0 = r7
            L_0x0184:
                int r7 = r6.f317690y0
                if (r7 != 0) goto L_0x018c
                int r7 = com.tencent.p014mm.plugin.voip.model.C106359m0.f317393D
                r6.f317690y0 = r7
            L_0x018c:
                int r7 = r6.f317693z0
                if (r7 != r8) goto L_0x0194
                int r7 = com.tencent.p014mm.plugin.voip.model.C106359m0.f317394E
                r6.f317693z0 = r7
            L_0x0194:
                int r7 = r6.f317552B0
                if (r7 != r8) goto L_0x019a
                r6.f317552B0 = r1
            L_0x019a:
                int r7 = com.tencent.p014mm.plugin.voip.model.C106359m0.f317392C
                int r8 = r6.f317666q0
                if (r7 <= r8) goto L_0x01a2
                r6.f317666q0 = r7
            L_0x01a2:
                int r8 = r6.f317687x0
                if (r3 <= r8) goto L_0x01a8
                r6.f317687x0 = r3
            L_0x01a8:
                java.lang.String r6 = "MicroMsg.Voip.VoipServiceEx"
                java.lang.String r8 = "battery temp %d, cpuLoad %d, batteryQuantity %d, islowpowermode %d, batteryCharge %d"
                r9 = 5
                java.lang.Object[] r9 = new java.lang.Object[r9]
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                r9[r2] = r7
                java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
                r9[r5] = r2
                r2 = 2
                int r3 = com.tencent.p014mm.plugin.voip.model.C106359m0.f317393D
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r9[r2] = r3
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r9[r4] = r1
                int r1 = com.tencent.p014mm.plugin.voip.model.C106359m0.f317394E
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r9[r0] = r1
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.voip.model.C106359m0.C106364e.run():void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.model.m0$f */
    public class C106365f implements Runnable {
        public C106365f() {
        }

        public void run() {
            Log.m105918d("MicroMsg.Voip.VoipServiceEx", "VOIPwifiStrengthTask");
            int e = C112597j.m153940e(MMApplicationContext.getContext());
            if (NetStatusUtil.isWifi(MMApplicationContext.getContext())) {
                int wiFiRssi = ConnectivityCompat.Companion.getWiFiRssi();
                C106359m0.f317395z = wiFiRssi;
                C106359m0.this.f317396a.f317500x.setNetSignalValue(4, wiFiRssi);
            }
            int d = C112597j.m153939d(MMApplicationContext.getContext());
            C106359m0 m0Var = C106359m0.this;
            m0Var.f317396a.f317500x.setNetSignalValue(d, C106359m0.f317390A);
            Log.m105925i("MicroMsg.Voip.VoipServiceEx", "nettype %d wifi rssi %d ratiotype %d radio signal value %d", Integer.valueOf(e), Integer.valueOf(C106359m0.f317395z), Integer.valueOf(d), Integer.valueOf(C106359m0.f317390A));
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.model.m0$g */
    public class C106366g {

        /* renamed from: a */
        public String f317427a;

        /* renamed from: b */
        public String f317428b;

        /* renamed from: c */
        public int f317429c;

        /* renamed from: d */
        public int f317430d;

        /* renamed from: e */
        public long f317431e;

        public C106366g() {
        }

        /* renamed from: a */
        public void mo152674a() {
            this.f317427a = null;
            this.f317428b = null;
            this.f317431e = 0;
            this.f317430d = 0;
            this.f317429c = 0;
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.model.m0$h */
    public class C106367h extends BroadcastReceiver {

        /* renamed from: com.tencent.mm.plugin.voip.model.m0$h$a */
        public class C106368a implements Runnable {
            public C106368a(C106367h hVar) {
            }

            public void run() {
            }
        }

        public C106367h() {
        }

        public void onReceive(Context context, Intent intent) {
            ((C119157j) C119157j.f356862d).mo183876g(new C106368a(this), "VoipServiceEx-mBatInfoReceiver");
        }
    }

    public C106359m0() {
        C106377r a = C57469x.m66239a();
        this.f317396a = a;
        a.f317477a0 = this;
        this.f317401f = false;
        this.f317403h = 0;
        this.f317402g = 0;
        this.f317405j = new C106366g();
        this.f317404i = new C106366g();
        this.f317411p = 0;
        this.f317412q = 0;
        if (C91441c.m114729c()) {
            C113173i iVar = (C113173i) C91441c.m114730d().mo125377a(C113173i.class);
            this.f317410o = iVar;
            if (iVar != null) {
                this.f317408m = new C117776s(iVar.f338613h, "voIpSrv");
            }
        }
    }

    /* renamed from: a */
    public int mo152655a(String str, int i, int i2) {
        String str2 = str;
        Log.m105925i("MicroMsg.Voip.VoipServiceEx", "call username:%s, callType:%d, inviteType:%d", str2, Integer.valueOf(i), Integer.valueOf(i2));
        if (Util.isNullOrNil(str)) {
            C112597j.m153937b("MicroMsg.Voip.VoipServiceEx", "Failed call without valid username.");
            return -1;
        } else if (this.f317396a.mo152713p()) {
            C112597j.m153937b("MicroMsg.Voip.VoipServiceEx", "Failed call withing calling.");
            return -1;
        } else {
            v2protocal v2protocal = this.f317396a.f317500x;
            v2protocal.f317653m = 1;
            v2protocal.f317635g = str2;
            C112597j.m153936a("MicroMsg.Voip.VoipServiceEx", C76861g.m92660c() + "call username:" + str2);
            if (this.f317396a.f317500x.f317580K1) {
                C112597j.m153937b("MicroMsg.Voip.VoipServiceEx", C76861g.m92660c() + "v2protocal already init.");
                this.f317396a.f317500x.mo152850x(false);
                this.f317396a.f317500x.mo152851y();
            }
            if (this.f317396a.f317500x.mo152849w() < 0) {
                C112597j.m153937b("MicroMsg.Voip.VoipServiceEx", "Failed to init v2protocol.");
                return -1;
            }
            if (this.f317396a.f317500x.f317583L1 != null) {
                this.f317396a.f317500x.f317583L1.f317275s = this.f317396a;
            }
            C106377r rVar = this.f317396a;
            v2protocal v2protocal2 = rVar.f317500x;
            C106339e eVar = v2protocal.f317544e2;
            if (eVar != null) {
                eVar.f317239q = rVar;
                Log.m105924i("MicroMsg.AvcDecoder", "setStrategyCaller");
            }
            this.f317419x.startTimer(50000);
            this.f317396a.f317500x.f317668r = (int) (System.currentTimeMillis() / 1000);
            LinkedList linkedList = new LinkedList();
            this.f317396a.mo152704f(linkedList);
            v2protocal v2protocal3 = this.f317396a.f317500x;
            v2protocal3.f317657n0 = "invite:" + this.f317396a.f317500x.f317642i0 + XVFSFile.PATH_SEPARATOR + this.f317396a.f317500x.f317645j0;
            ArrayList arrayList = new ArrayList();
            arrayList.add(str2);
            v2protocal v2protocal4 = this.f317396a.f317500x;
            new C110730g(arrayList, v2protocal4.field_peerId, v2protocal4.field_capInfo, v2protocal4.f317629e, i, i2, v2protocal4.f317668r, linkedList).mo88544n1();
            this.f317396a.mo152688B(2);
            this.f317396a.f317450A.f317710c = 1;
            this.f317416u.startTimer(60000);
            C106401z zVar = this.f317396a.f317500x.f317568G1;
            zVar.getClass();
            zVar.f317752G = System.currentTimeMillis();
            C106401z zVar2 = this.f317396a.f317500x.f317568G1;
            zVar2.getClass();
            zVar2.f317783l = System.currentTimeMillis();
            C106377r rVar2 = this.f317396a;
            rVar2.f317500x.f317568G1.f317782k = i2;
            rVar2.f317454E = true;
            Log.m105918d("MicroMsg.Voip.VoipServiceEx", "iRoomType " + this.f317396a.f317500x.f317568G1.f317782k);
            if (C109247e.zx0()) {
                this.f317396a.mo152718u();
            }
            return 0;
        }
    }

    /* renamed from: b */
    public int mo152656b(int i) {
        if (!this.f317396a.mo152713p()) {
            C112597j.m153937b("MicroMsg.Voip.VoipServiceEx", "Failed to cancel call ,as not in calling.");
            return -1;
        }
        Log.m105925i("MicroMsg.Voip.VoipServiceEx", "cancelCallEx, roomId:%d, inviteId:%d, cancelType:%d", Integer.valueOf(this.f317396a.f317500x.f317656n), Integer.valueOf(this.f317396a.f317500x.f317668r), Integer.valueOf(i));
        synchronized (this.f317397b) {
            v2protocal v2protocal = this.f317396a.f317500x;
            if (v2protocal.f317656n == 0 && v2protocal.f317668r == 0) {
                C112597j.m153937b("MicroMsg.Voip.VoipServiceEx", "Failed to cancel call with roomid = 0 and inviteId = 0 ");
                return -1;
            }
            if (v2protocal.f317580K1) {
                v2protocal.mo152850x(true);
                v2protocal v2protocal2 = this.f317396a.f317500x;
                new C110728c(v2protocal2.f317656n, v2protocal2.f317665q, v2protocal2.f317635g, "", v2protocal2.f317668r, i, (int) (System.currentTimeMillis() - C106357m.m143312g((long) this.f317396a.f317500x.f317656n)), v2protocal2.f317569H).mo88544n1();
            }
            C106401z zVar = this.f317396a.f317500x.f317568G1;
            zVar.getClass();
            zVar.f317793v = (int) (System.currentTimeMillis() - zVar.f317752G);
            C112597j.m153936a("MicroMsg.VoipDailReport", "devin:cancelInvite:" + zVar.f317793v);
            C106377r rVar = this.f317396a;
            v2protocal v2protocal3 = rVar.f317500x;
            if (v2protocal3.f317578K == 0 && v2protocal3.f317581L == 0) {
                v2protocal3.f317578K = rVar.f317450A.mo152858e();
                rVar.f317500x.f317581L = rVar.f317450A.mo152857d();
            }
            C106377r rVar2 = this.f317396a;
            rVar2.f317500x.f317568G1.f317767V = rVar2.f317502z.mo152483o0();
            if (C109247e.xx0().f317333b != null) {
                this.f317396a.f317500x.f317568G1.f317770Y = C109247e.xx0().f317333b.mo152449U();
                this.f317396a.f317500x.f317568G1.f317768W = C109247e.xx0().f317333b.mo152454X() / 1000;
                this.f317396a.f317500x.f317568G1.f317769X = C109247e.xx0().f317333b.mo152453W() / 1000;
            }
            this.f317396a.f317500x.getClass();
            String q = this.f317396a.f317500x.mo152814q();
            String r = this.f317396a.f317500x.mo152815r();
            String p = this.f317396a.f317500x.mo152811p();
            String k = this.f317396a.f317500x.mo152804k();
            String[] o = this.f317396a.f317500x.mo152810o();
            String[] l = this.f317396a.f317500x.mo152807l();
            String[] n = this.f317396a.f317500x.mo152809n();
            String[] m = this.f317396a.f317500x.mo152808m();
            if (q.length() > 0) {
                v2protocal v2protocal4 = this.f317396a.f317500x;
                new C110734l(v2protocal4.f317656n, v2protocal4.f317665q, v2protocal4.f317635g, "\u0000", q, p, r, k, o, l, n, m).mo88544n1();
            }
            this.f317396a.mo152705g();
            mo152669n();
            v2protocal v2protocal5 = this.f317396a.f317500x;
            v2protocal5.f317656n = 0;
            v2protocal5.f317668r = 0;
            return 0;
        }
    }

    /* renamed from: c */
    public void mo152657c() {
        if (this.f317396a.mo152713p()) {
            C112597j.m153937b("MicroMsg.Voip.VoipServiceEx", "checkStartup failed, stauts = " + this.f317396a.f317476a);
        }
        C112597j.m153937b("MicroMsg.Voip.VoipServiceEx", "checkStartup...devicekey = " + C85796t4.m105983jo());
        this.f317396a.mo152706h();
        Log.m105918d("MicroMsg.Voip.VoipServiceEx", "reset");
        this.f317419x.stopTimer();
        this.f317416u.stopTimer();
        this.f317418w.stopTimer();
        this.f317420y.stopTimer();
        this.f317398c = 0;
        C107835h0.m146105b(C86709a0.m107535s().mo121144k().mo119656Lo(77825));
    }

    /* renamed from: d */
    public void mo152658d(int i, long j, int i2, byte[] bArr, byte[] bArr2, String str) {
        int i3 = i;
        long j2 = j;
        C112597j.m153938c("MicroMsg.Voip.VoipServiceEx", "doAck roomId:" + i + ", roomKey:" + j2 + ", ackstatus:" + i2);
        if (!(i3 == 0 || j2 == 0)) {
            LinkedList linkedList = new LinkedList();
            this.f317396a.mo152704f(linkedList);
            v2protocal v2protocal = this.f317396a.f317500x;
            v2protocal.f317657n0 = "ack:" + this.f317396a.f317500x.f317642i0 + XVFSFile.PATH_SEPARATOR + this.f317396a.f317500x.f317645j0;
            C110721a aVar = new C110721a(i, j, i2, bArr, bArr2, str, linkedList);
            C106401z zVar = this.f317396a.f317500x.f317568G1;
            zVar.getClass();
            zVar.f317755J = System.currentTimeMillis();
            aVar.mo88544n1();
        }
        C111730z.f334576a.mo163444a(Integer.valueOf(i), Long.valueOf(j), str, Boolean.valueOf(this.f317415t));
        C111720c0 c0Var = C111720c0.f334432a;
        long o = C109247e.xx0().mo152616o();
        C111720c0.f334433b = (long) C109247e.xx0().mo152615n();
        C111720c0.f334434c = o;
        if (C109247e.zx0()) {
            this.f317396a.mo152718u();
        }
    }

    /* renamed from: e */
    public int mo152659e() {
        return this.f317396a.f317500x.f317656n;
    }

    /* renamed from: f */
    public long mo152660f() {
        return this.f317396a.f317500x.f317665q;
    }

    public void finalize() {
        Log.m105924i("MicroMsg.Voip.VoipServiceEx", "stop");
        mo152669n();
        this.f317396a.getClass();
        super.finalize();
    }

    /* renamed from: g */
    public int mo152662g(int i) {
        int i2;
        C112597j.m153938c("MicroMsg.Voip.VoipServiceEx", "hangUp,status:" + this.f317396a.f317476a + " roomid:" + this.f317396a.f317500x.f317656n + ",reason=" + i + ",threadid = " + Thread.currentThread().getId());
        this.f317396a.f317450A.mo152863j();
        this.f317396a.mo152707i();
        C106401z zVar = this.f317396a.f317500x.f317568G1;
        if (zVar.f317781j == 1) {
            if (zVar.f317747B == 0) {
                zVar.f317792u = 0;
            } else {
                zVar.f317792u = (int) ((System.currentTimeMillis() - zVar.f317747B) / 1000);
            }
            if (zVar.f317792u < 0) {
                zVar.f317792u = 0;
                C112597j.m153937b("MicroMsg.VoipDailReport", "devin:endTalk, iCallTime Err, rest 0");
            }
            C112597j.m153938c("MicroMsg.VoipDailReport", "devin:endTalk:" + zVar.f317792u);
        }
        synchronized (this.f317397b) {
            v2protocal v2protocal = this.f317396a.f317500x;
            int i3 = v2protocal.f317568G1.f317784m;
            if (!(v2protocal.f317656n != 0 || 8 == i3 || 9 == i3 || 10 == i3 || 11 == i3 || 12 == i3)) {
                if (99 != i3) {
                    C112597j.m153937b("MicroMsg.Voip.VoipServiceEx", "call hangUp roomId == 0 ");
                    this.f317396a.mo152705g();
                    mo152669n();
                    this.f317396a.f317500x.f317656n = 0;
                    C112597j.m153936a("MicroMsg.Voip.VoipServiceEx", "hangUp over");
                }
            }
            C112597j.m153938c("MicroMsg.Voip.VoipServiceEx", "steve:hangUp, uninitGLRender before protocalUninit first!!");
            v2protocal v2protocal2 = this.f317396a.f317500x;
            if (v2protocal2.f317580K1) {
                v2protocal2.mo152850x(true);
                C106401z zVar2 = this.f317396a.f317500x.f317568G1;
                zVar2.getClass();
                zVar2.f317762Q = System.currentTimeMillis();
                C13604l<Long, Long> f = C106357m.m143311f((long) this.f317396a.f317500x.f317656n);
                int currentTimeMillis = (int) (System.currentTimeMillis() - ((Long) f.f38555d).longValue());
                if (((Long) f.f38556e).longValue() != 0) {
                    i2 = ((int) (System.currentTimeMillis() - ((Long) f.f38556e).longValue())) / 1000;
                } else {
                    Log.m105929w("MicroMsg.Voip.VoipServiceEx", "hangUpEx: may be not connected, hangUpReason %d", Integer.valueOf(i));
                    i2 = 0;
                }
                v2protocal v2protocal3 = this.f317396a.f317500x;
                new C110732i(v2protocal3.f317656n, v2protocal3.f317665q, "", i, currentTimeMillis, i2).mo88544n1();
                C112597j.m153937b("MicroMsg.Voip.VoipServiceEx", "devin: shutdown cgi ");
            }
            C106377r rVar = this.f317396a;
            rVar.f317500x.f317568G1.f317767V = rVar.f317502z.mo152483o0();
            if (C109247e.xx0().f317333b != null) {
                this.f317396a.f317500x.f317568G1.f317770Y = C109247e.xx0().f317333b.mo152449U();
                this.f317396a.f317500x.f317568G1.f317768W = C109247e.xx0().f317333b.mo152454X() / 1000;
                this.f317396a.f317500x.f317568G1.f317769X = C109247e.xx0().f317333b.mo152453W() / 1000;
            }
            this.f317396a.f317500x.getClass();
            String q = this.f317396a.f317500x.mo152814q();
            String r = this.f317396a.f317500x.mo152815r();
            String p = this.f317396a.f317500x.mo152811p();
            String k = this.f317396a.f317500x.mo152804k();
            String[] o = this.f317396a.f317500x.mo152810o();
            String[] l = this.f317396a.f317500x.mo152807l();
            String[] n = this.f317396a.f317500x.mo152809n();
            String[] m = this.f317396a.f317500x.mo152808m();
            if (q.length() > 0) {
                v2protocal v2protocal4 = this.f317396a.f317500x;
                new C110734l(v2protocal4.f317656n, v2protocal4.f317665q, v2protocal4.f317635g, "\u0000", q, p, r, k, o, l, n, m).mo88544n1();
                C112597j.m153937b("MicroMsg.Voip.VoipServiceEx", "devin: statreport cgi ");
            }
            this.f317396a.mo152705g();
            mo152669n();
            this.f317396a.f317500x.f317656n = 0;
            C112597j.m153936a("MicroMsg.Voip.VoipServiceEx", "hangUp over");
        }
        return 0;
    }

    /* renamed from: h */
    public boolean mo152663h() {
        Log.m105924i("MicroMsg.Voip.VoipServiceEx", "isRoomReady, roomId: " + this.f317396a.f317500x.f317656n);
        C106377r rVar = this.f317396a;
        if (rVar.f317500x.f317656n != 0) {
            int i = rVar.f317476a;
            if (!(i == 2 || i == 4)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public boolean mo152664i() {
        return this.f317396a.mo152713p();
    }

    /* renamed from: j */
    public void mo152665j(yu4 yu4) {
        if (yu4 != null) {
            Log.m105925i("MicroMsg.Voip.VoipServiceEx", "onAnswerNotify, roomId: %s", Integer.valueOf(yu4.f145520d));
            C106377r rVar = this.f317396a;
            yu4 yu42 = rVar.f317453D;
            if (yu42 == null || yu4.f145520d != yu42.f145520d) {
                Log.m105920e("MicroMsg.Voip.VoipServiceEx", "onAnswerNotify, mInviteRoomInfo is null or the roomid is not equal");
            } else if (rVar.f317482f) {
                Log.m105924i("MicroMsg.Voip.VoipServiceEx", "onAnswerNotify, already accept, ignore it");
            } else {
                Log.m105924i("MicroMsg.Voip.VoipServiceEx", "onAnswerNotify, not accept, hangout");
                C111730z zVar = C111730z.f334576a;
                C111730z.f334579d = C111730z.C111731a.CANCEL;
                mo152662g(2);
                C106377r rVar2 = this.f317396a;
                rVar2.mo152692F();
                rVar2.f317470U.post(new C106395t(rVar2));
            }
        }
    }

    /* renamed from: k */
    public boolean mo152666k(yu4 yu4) {
        if (yu4 == null) {
            return false;
        }
        Log.m105925i("MicroMsg.Voip.VoipServiceEx", "onCancelInviteNotify, roomId: %s", Integer.valueOf(yu4.f145520d));
        yu4 yu42 = this.f317396a.f317453D;
        if (yu42 == null || yu4.f145520d != yu42.f145520d) {
            Log.m105920e("MicroMsg.Voip.VoipServiceEx", "onCancelInviteNotify, mInviteRoomInfo is null or the roomid is not equal");
            return false;
        }
        C111730z zVar = C111730z.f334576a;
        C111730z.f334579d = C111730z.C111731a.CANCEL;
        mo152662g(2);
        C106377r rVar = this.f317396a;
        rVar.mo152692F();
        rVar.f317470U.post(new C106395t(rVar));
        return true;
    }

    /* renamed from: l */
    public void mo152667l(int i, int i2, String str, int i3) {
        Log.m105924i("MicroMsg.Voip.VoipServiceEx", "onFinishVoIP finishType: " + i);
        if (i == 1) {
            this.f317396a.f317502z.mo150002y0(i2, str, i3);
            C111730z zVar = C111730z.f334576a;
            C111730z.f334579d = C111730z.C111731a.ERROR;
            mo152662g(4);
        } else if (i == 4) {
            this.f317396a.f317502z.mo149983E0();
            C111730z zVar2 = C111730z.f334576a;
            C111730z.f334579d = C111730z.C111731a.REJECT;
            mo152662g(2);
        } else if (i == 5) {
            this.f317396a.f317502z.mo152487q0();
            C111730z zVar3 = C111730z.f334576a;
            C111730z.f334579d = C111730z.C111731a.NO_RESP;
            mo152662g(3);
        } else if (i == 6) {
            this.f317396a.f317502z.mo150000w0(true);
            C111730z zVar4 = C111730z.f334576a;
            C111730z.f334579d = C111730z.C111731a.SHUTDOWN;
            mo152662g(2);
        }
    }

    /* renamed from: m */
    public int mo152668m() {
        Log.m105924i("MicroMsg.Voip.VoipServiceEx", "reject");
        if (!(this.f317396a.f317476a == 3)) {
            C112597j.m153937b("MicroMsg.Voip.VoipServiceEx", "Failed to reject with calling, status =" + this.f317396a.f317476a);
            return -1;
        }
        synchronized (this.f317397b) {
            v2protocal v2protocal = this.f317396a.f317500x;
            if (v2protocal.f317656n == 0) {
                C112597j.m153937b("MicroMsg.Voip.VoipServiceEx", "Failed to reject with roomid = 0. ");
                return -1;
            }
            v2protocal.f317568G1.mo152869a();
            C112597j.m153936a("MicroMsg.Voip.VoipServiceEx", " reject, status:" + this.f317396a.f317476a + " roomid:" + this.f317396a.f317500x.f317656n);
            v2protocal v2protocal2 = this.f317396a.f317500x;
            C110724b bVar = new C110724b(2, v2protocal2.f317629e, v2protocal2.f317656n, new byte[0], new byte[0], v2protocal2.f317665q, false, false, (LinkedList<C101864x23>) null);
            C106401z zVar = this.f317396a.f317500x.f317568G1;
            zVar.getClass();
            zVar.f317757L = System.currentTimeMillis();
            bVar.mo88544n1();
            C106377r rVar = this.f317396a;
            v2protocal v2protocal3 = rVar.f317500x;
            if (v2protocal3.f317578K == 0 && v2protocal3.f317581L == 0) {
                v2protocal3.f317578K = rVar.f317450A.mo152858e();
                rVar.f317500x.f317581L = rVar.f317450A.mo152857d();
            }
            C106377r rVar2 = this.f317396a;
            rVar2.f317500x.f317568G1.f317767V = rVar2.f317502z.mo152483o0();
            if (C109247e.xx0().f317333b != null) {
                this.f317396a.f317500x.f317568G1.f317770Y = C109247e.xx0().f317333b.mo152449U();
                this.f317396a.f317500x.f317568G1.f317768W = C109247e.xx0().f317333b.mo152454X() / 1000;
                this.f317396a.f317500x.f317568G1.f317769X = C109247e.xx0().f317333b.mo152453W() / 1000;
            }
            v2protocal v2protocal4 = this.f317396a.f317500x;
            if (v2protocal4.f317580K1) {
                v2protocal4.mo152850x(true);
            }
            this.f317396a.f317500x.getClass();
            String q = this.f317396a.f317500x.mo152814q();
            String r = this.f317396a.f317500x.mo152815r();
            String p = this.f317396a.f317500x.mo152811p();
            String k = this.f317396a.f317500x.mo152804k();
            String[] o = this.f317396a.f317500x.mo152810o();
            String[] l = this.f317396a.f317500x.mo152807l();
            String[] n = this.f317396a.f317500x.mo152809n();
            String[] m = this.f317396a.f317500x.mo152808m();
            C112597j.m153936a("MicroMsg.Voip.VoipServiceEx", "devin: statreport");
            if (q.length() > 0) {
                C112597j.m153936a("MicroMsg.Voip.VoipServiceEx", "devin: reject() newdialInfo.length() > 0");
                v2protocal v2protocal5 = this.f317396a.f317500x;
                new C110734l(v2protocal5.f317656n, v2protocal5.f317665q, v2protocal5.f317635g, "\u0000", q, p, r, k, o, l, n, m).mo88544n1();
            } else {
                C112597j.m153936a("MicroMsg.Voip.VoipServiceEx", "devin: reject() newdialInfo.length() <= 0");
            }
            this.f317396a.mo152705g();
            mo152669n();
            this.f317396a.f317500x.f317656n = 0;
            return 0;
        }
    }

    /* renamed from: n */
    public void mo152669n() {
        Log.m105918d("MicroMsg.Voip.VoipServiceEx", "reset");
        this.f317413r = null;
        this.f317414s = false;
        this.f317415t = false;
        C106377r rVar = this.f317396a;
        rVar.getClass();
        Log.m105924i("MicroMsg.Voip.VoipContext", "reset");
        rVar.f317450A.mo152863j();
        v2protocal v2protocal = rVar.f317500x;
        if (v2protocal.f317580K1) {
            v2protocal.mo152850x(false);
        }
        rVar.f317500x.mo152851y();
        rVar.f317474Y = 0.0d;
        rVar.f317473X = false;
        rVar.f317495s = -1;
        rVar.f317496t = -1;
        rVar.f317497u = -1;
        rVar.f317500x.f317590O = 0;
        rVar.f317475Z.stopTimer();
        C106373o0 o0Var = rVar.f317451B;
        su4 su4 = o0Var.f317446c;
        if (su4 != null) {
            su4.f141767e.clear();
            o0Var.f317446c.f141766d = 0;
            o0Var.f317446c = null;
            o0Var.f317447d = 0;
        }
        rVar.f317469T.stopTimer();
        rVar.f317480d = false;
        rVar.f317479c = false;
        rVar.f317481e = false;
        rVar.f317482f = false;
        rVar.f317452C = null;
        rVar.f317453D = null;
        rVar.f317454E = false;
        rVar.f317456G = 0;
        rVar.f317493q = false;
        rVar.f317455F = false;
        rVar.f317498v = -1;
        rVar.f317499w = -1;
        rVar.f317484h = false;
        rVar.f317485i = false;
        rVar.f317483g = false;
        rVar.f317478b = false;
        rVar.f317486j = false;
        rVar.f317494r = 10;
        rVar.f317476a = 1;
        rVar.f317461L = 0;
        rVar.f317468S = 0;
        rVar.f317462M = false;
        rVar.f317460K = 0;
        rVar.f317465P = null;
        rVar.f317467R.clear();
        this.f317419x.stopTimer();
        this.f317416u.stopTimer();
        this.f317418w.stopTimer();
        this.f317420y.stopTimer();
        this.f317411p = 0;
        this.f317412q = 0;
        C34379c<?> cVar = this.f317399d;
        if (cVar != null) {
            cVar.cancel(false);
            this.f317399d = null;
        }
        C34379c<?> cVar2 = this.f317400e;
        if (cVar2 != null) {
            cVar2.cancel(false);
            this.f317400e = null;
        }
        if (this.f317407l != null) {
            MMApplicationContext.getContext().unregisterReceiver(this.f317407l);
            this.f317407l = null;
        }
        if (C112581a.f337113a != null) {
            MMApplicationContext.getContext().unregisterReceiver(C112581a.f337113a);
        }
        C112581a.f337113a = null;
        this.f317398c = 0;
        C109247e.xx0().mo152600N();
        C109247e.xx0().f317351t = null;
        this.f317401f = false;
        this.f317403h = 0;
        this.f317402g = 0;
        this.f317405j.mo152674a();
        this.f317404i.mo152674a();
        if (this.f317408m != null) {
            synchronized (this.f317409n) {
                this.f317408m.mo173658a();
            }
        }
    }

    /* renamed from: o */
    public void mo152670o(boolean z) {
        C106377r rVar = this.f317396a;
        rVar.getClass();
        try {
            if (rVar.f317500x != null) {
                np4 np4 = new np4();
                if (z) {
                    np4.f332185d = 24;
                } else {
                    np4.f332185d = 23;
                }
                long doubleToLongBits = Double.doubleToLongBits((double) (System.currentTimeMillis() / 1000));
                byte[] bArr = new byte[8];
                for (int i = 0; i < 8; i++) {
                    bArr[i] = (byte) ((int) ((doubleToLongBits >> (i * 8)) & 255));
                }
                np4.f332186e = new C89349b(bArr, 0, 8);
                C112597j.m153938c("MicroMsg.Voip.VoipContext", "send camera capture pause " + z);
                rVar.f317500x.SendRUDP(np4.toByteArray(), np4.toByteArray().length);
            }
        } catch (Exception unused) {
            C112597j.m153937b("MicroMsg.Voip.VoipContext", "send camera capture pause error " + z);
        }
    }

    /* renamed from: p */
    public boolean mo152671p(yu4 yu4) {
        yu4 yu42 = yu4;
        if (this.f317396a.mo152713p()) {
            C112597j.m153937b("MicroMsg.Voip.VoipServiceEx", "Failed to setInviteContent during calling, status =" + this.f317396a.f317476a);
            return false;
        } else if (yu42 == null) {
            return false;
        } else {
            this.f317396a.f317500x.f317568G1.f317782k = yu42.f145526j;
            Log.m105918d("MicroMsg.Voip.VoipServiceEx", "iRoomType " + this.f317396a.f317500x.f317568G1.f317782k);
            if (this.f317396a.f317500x.f317580K1) {
                Log.m105928w("MicroMsg.Voip.VoipServiceEx", "[" + Thread.currentThread().getId() + "]" + (C76861g.m92660c() + "v2protocal already init."));
                this.f317396a.f317500x.mo152850x(false);
                this.f317396a.f317500x.mo152851y();
            }
            C106377r rVar = this.f317396a;
            rVar.f317453D = yu42;
            v2protocal v2protocal = rVar.f317500x;
            v2protocal.f317635g = yu42.f145525i;
            v2protocal.f317656n = yu42.f145520d;
            v2protocal.f317665q = yu42.f145521e;
            v2protocal.f317569H = yu42.f145526j;
            boolean z = true;
            v2protocal.f317662p = 1;
            v2protocal.f317653m = 0;
            rVar.f317476a = 3;
            boolean F = ((C60606n) C86312j.m106911c(C60606n.class)).mo85002F();
            if (!C91617n.m114968f() && !C61104a.m71644D()) {
                CheckF2FCameraIsOpenEvent checkF2FCameraIsOpenEvent = new CheckF2FCameraIsOpenEvent();
                checkF2FCameraIsOpenEvent.publish();
                checkF2FCameraIsOpenEvent.f309996d.getClass();
                if (!C61104a.m71662r() && !F) {
                    if (this.f317396a.f317500x.mo152849w() < 0) {
                        C112597j.m153937b("MicroMsg.Voip.VoipServiceEx", "Failed to init v2protocol.");
                        return false;
                    }
                    C106377r rVar2 = this.f317396a;
                    v2protocal v2protocal2 = rVar2.f317500x;
                    C106339e eVar = v2protocal.f317544e2;
                    if (eVar != null) {
                        eVar.f317239q = rVar2;
                        Log.m105924i("MicroMsg.AvcDecoder", "setStrategyCaller");
                    }
                    C115669n.INSTANCE.mo160140o(11524, true, true, Integer.valueOf(yu42.f145520d), Long.valueOf(yu42.f145521e), Integer.valueOf(yu42.f145526j), 0, Long.valueOf(System.currentTimeMillis()));
                    if (!this.f317401f) {
                        this.f317396a.f317502z.mo150001x0();
                        C106350h0 xx02 = C109247e.xx0();
                        boolean z2 = yu42.f145526j == 0;
                        xx02.getClass();
                        C38447a aVar = new C38447a(z2, true, true, true, false, true, true);
                        int e = xx02.f317332a.mo152659e();
                        long f = xx02.f317332a.mo152660f();
                        C106359m0 m0Var = xx02.f317332a;
                        long j = (long) m0Var.f317396a.f317500x.f317569H;
                        boolean z3 = m0Var.f317415t;
                        long j2 = (long) 1;
                        String a = ((C107054l) C86312j.m106911c(C107054l.class)).mo157469jQ().mo157500a();
                        VoipButtonStatusStruct voipButtonStatusStruct = new VoipButtonStatusStruct();
                        voipButtonStatusStruct.f310345d = (long) e;
                        voipButtonStatusStruct.f310346e = f;
                        long j3 = 1;
                        voipButtonStatusStruct.f310347f = j == 0 ? 1 : 2;
                        if (!z3) {
                            j3 = 2;
                        }
                        voipButtonStatusStruct.f310348g = j3;
                        voipButtonStatusStruct.mo148156s(aVar.toString());
                        voipButtonStatusStruct.f310351j = j2;
                        voipButtonStatusStruct.f310350i = System.currentTimeMillis();
                        voipButtonStatusStruct.mo148157t(a);
                        voipButtonStatusStruct.mo86054n();
                    }
                    C111730z.f334576a.mo163444a(Integer.valueOf(C109247e.xx0().mo152615n()), Long.valueOf(C109247e.xx0().mo152616o()), yu42.f145525i, Boolean.valueOf(this.f317415t));
                    C111720c0 c0Var = C111720c0.f334432a;
                    long o = C109247e.xx0().mo152616o();
                    C111720c0.f334433b = (long) C109247e.xx0().mo152615n();
                    C111720c0.f334434c = o;
                    return true;
                }
            }
            Log.m105920e("MicroMsg.Voip.VoipServiceEx", "setInviteContent, reject, pstn/multitak/f2f talking");
            if (C91617n.m114968f() || C61104a.m71662r() || F || C61104a.m71644D()) {
                mo152658d(yu42.f145520d, yu42.f145521e, 2, (byte[]) null, (byte[]) null, yu42.f145525i);
            } else {
                mo152668m();
                if (yu42.f145526j != 0) {
                    z = false;
                }
                String str = yu42.f145525i;
                int i = C72963f4.f212661I1;
                C106348g0.m143244e(str, z ? "voip_content_video" : "voip_content_voice", 0, 6, MMApplicationContext.getContext().getString(C0966R.string.kf6), false, (C32226l<Long, Void>) null);
            }
            return false;
        }
    }
}
