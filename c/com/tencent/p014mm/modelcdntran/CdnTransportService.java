package com.tencent.p014mm.modelcdntran;

import android.os.Looper;
import android.os.Message;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.mars.Mars;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.mars.smc.IDKey;
import com.tencent.p014mm.app.C114668z;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.MMConnectivityChangeEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.AndroidCdnCallbackTimeStruct;
import com.tencent.p014mm.network.C29060q;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import h81.C32735h;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import kj2.C117407d;
import lc3.C10485b;
import oa1.C117731d;
import ob0.C11385n;
import ob0.C117747y;
import p1081gi.C98119b;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;
import sf0.C90188n0;
import yb0.C118950a;
import zt3.C119157j;

/* renamed from: com.tencent.mm.modelcdntran.CdnTransportService */
public class CdnTransportService implements C98119b, C11385n {

    /* renamed from: u */
    public static final long[] f266879u = {0, 2, 5, 7, 10, 15, 20, 30, 50, 70, 100, 200, 400, 600, 800, 1000, 3000, FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION, 10000, 20000, 30000, 40000, 50000, 60000, 120000};

    /* renamed from: v */
    public static final int[] f266880v = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34};

    /* renamed from: w */
    public static int f266881w = -1;

    /* renamed from: x */
    public static long f266882x = -1;

    /* renamed from: d */
    public int f266883d = -1;

    /* renamed from: e */
    public MMHandler f266884e = new C29005b(this, Looper.getMainLooper());

    /* renamed from: f */
    public IListener<MMConnectivityChangeEvent> f266885f = new IListener<MMConnectivityChangeEvent>(C40008f.f107254d) {
        {
            this.__eventId = 2085688515;
        }

        public boolean callback(IEvent iEvent) {
            MMConnectivityChangeEvent mMConnectivityChangeEvent = (MMConnectivityChangeEvent) iEvent;
            if (!NetStatusUtil.isConnected(MMApplicationContext.getContext())) {
                return false;
            }
            Log.m105924i("MicroMsg.CdnTransportService", "cdntra mm on network change callback ");
            CdnTransportService.this.f266884e.removeMessages(1);
            CdnTransportService.this.f266884e.sendEmptyMessageDelayed(1, 10000);
            return false;
        }
    };

    /* renamed from: g */
    public C29060q f266886g = new C29006c();

    /* renamed from: h */
    public ConcurrentHashMap<String, C92737j> f266887h = new ConcurrentHashMap<>();

    /* renamed from: i */
    public final MTimerHandler f266888i;

    /* renamed from: j */
    public C114668z.C104589a f266889j;

    /* renamed from: n */
    public ConcurrentHashMap<String, String> f266890n;

    /* renamed from: o */
    public boolean f266891o;

    /* renamed from: p */
    public Queue<String> f266892p;

    /* renamed from: q */
    public Map<String, C98124g> f266893q;

    /* renamed from: r */
    public Map<String, C98124g> f266894r;

    /* renamed from: s */
    public Map<String, Integer> f266895s;

    /* renamed from: t */
    public HashSet<String> f266896t;

    /* renamed from: com.tencent.mm.modelcdntran.CdnTransportService$b */
    public class C29005b extends MMHandler {
        public C29005b(CdnTransportService cdnTransportService, Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            if (!MMApplicationContext.isPushProcess() && NetStatusUtil.isConnected(MMApplicationContext.getContext())) {
                Log.m105924i("MicroMsg.CdnTransportService", "cdntra mm on network change to get dns.");
                C117407d.INSTANCE.idkeyStat(546, 5, 1, true);
                Mars.onNetworkChange();
            }
        }
    }

    /* renamed from: com.tencent.mm.modelcdntran.CdnTransportService$c */
    public class C29006c extends C29060q.C29061a {
        public C29006c() {
        }

        public void onNetworkChange(int i) {
            Log.m105919d("MicroMsg.CdnTransportService", "cdntra onNetworkChange st:%d ", Integer.valueOf(i));
            if ((i == 4 || i == 6) && C86709a0.m107523b().mo121114l()) {
                CdnTransportService.this.f266884e.removeMessages(1);
                if (!MMApplicationContext.isPushProcess()) {
                    Mars.onNetworkChange();
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.modelcdntran.CdnTransportService$a */
    public class C92729a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f266897d;

        /* renamed from: e */
        public final /* synthetic */ C98121d f266898e;

        public C92729a(String str, C98121d dVar) {
            this.f266897d = str;
            this.f266898e = dVar;
        }

        public void run() {
            C98124g gVar = (C98124g) ((ConcurrentHashMap) CdnTransportService.this.f266894r).get(this.f266897d);
            if (gVar == null) {
                Log.m105919d("MicroMsg.CdnTransportService", " task in jni get info failed mediaid:%s", this.f266897d);
                return;
            }
            C98124g.C98126b bVar = gVar.f287656M;
            if (bVar != null) {
                bVar.mo31987b(this.f266897d, this.f266898e);
            }
        }
    }

    /* renamed from: com.tencent.mm.modelcdntran.CdnTransportService$d */
    public class C92730d implements MTimerHandler.CallBack {
        public C92730d() {
        }

        public boolean onTimerExpired() {
            Log.m105924i("MicroMsg.CdnTransportService", "cdnCallbackExecuteTimeReport onTimerExpired");
            CdnTransportService.m116897d(CdnTransportService.this);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.modelcdntran.CdnTransportService$e */
    public class C92731e extends C114668z.C104589a {

        /* renamed from: com.tencent.mm.modelcdntran.CdnTransportService$e$a */
        public class C92732a implements Runnable {
            public C92732a() {
            }

            public void run() {
                Log.m105924i("MicroMsg.CdnTransportService", "appForegroundListener onAppBackground");
                CdnTransportService.m116897d(CdnTransportService.this);
                for (Map.Entry<String, C92737j> key : CdnTransportService.this.f266887h.entrySet()) {
                    C92737j remove = CdnTransportService.this.f266887h.remove(key.getKey());
                    Object[] objArr = new Object[1];
                    objArr[0] = remove != null ? remove.toString() : "null";
                    Log.m105925i("MicroMsg.CdnTransportService", "remove %s", objArr);
                }
            }
        }

        public C92731e() {
        }

        public void onAppBackground(String str) {
            Log.m105925i("MicroMsg.CdnTransportService", "onAppBackground %s", str);
            if (CdnTransportService.m116898g()) {
                CdnTransportService cdnTransportService = CdnTransportService.this;
                cdnTransportService.f266891o = false;
                cdnTransportService.f266888i.stopTimer();
                ((C119157j) C119157j.f356862d).mo183875f(new C92732a());
            }
        }

        public void onAppForeground(String str) {
            Log.m105925i("MicroMsg.CdnTransportService", "onAppForeground %s", str);
            if (CdnTransportService.m116898g()) {
                CdnTransportService cdnTransportService = CdnTransportService.this;
                cdnTransportService.f266891o = true;
                cdnTransportService.f266887h.clear();
                CdnTransportService.this.f266888i.startTimer(60000);
            }
        }
    }

    /* renamed from: com.tencent.mm.modelcdntran.CdnTransportService$f */
    public class C92733f implements Runnable {
        public C92733f() {
        }

        public void run() {
            CdnTransportService.this.mo126958p(true);
        }

        public String toString() {
            return super.toString() + "|onSceneEnd";
        }
    }

    /* renamed from: com.tencent.mm.modelcdntran.CdnTransportService$g */
    public class C92734g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f266904d;

        /* renamed from: e */
        public final /* synthetic */ C98124g f266905e;

        public C92734g(int i, C98124g gVar) {
            this.f266904d = i;
            this.f266905e = gVar;
        }

        public void run() {
            int i = this.f266904d;
            if (i != -1) {
                ((HashMap) CdnTransportService.this.f266895s).put(this.f266905e.field_mediaId, Integer.valueOf(i));
            }
            Log.m105925i("MicroMsg.CdnTransportService", "CdnTransportService cdn thread run %s", this.f266905e.field_mediaId);
            ((LinkedList) CdnTransportService.this.f266892p).add(this.f266905e.field_mediaId);
            Map<String, C98124g> map = CdnTransportService.this.f266893q;
            C98124g gVar = this.f266905e;
            ((HashMap) map).put(gVar.field_mediaId, gVar);
            CdnTransportService.this.mo126958p(false);
        }

        public String toString() {
            return super.toString() + "|addRecvTask";
        }
    }

    /* renamed from: com.tencent.mm.modelcdntran.CdnTransportService$h */
    public class C92735h implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C98124g f266907d;

        public C92735h(C98124g gVar) {
            this.f266907d = gVar;
        }

        public void run() {
            ((LinkedList) CdnTransportService.this.f266892p).add(this.f266907d.field_mediaId);
            Map<String, C98124g> map = CdnTransportService.this.f266893q;
            C98124g gVar = this.f266907d;
            ((HashMap) map).put(gVar.field_mediaId, gVar);
            CdnTransportService.this.mo126958p(false);
        }

        public String toString() {
            return super.toString() + "|addSendTask";
        }
    }

    /* renamed from: com.tencent.mm.modelcdntran.CdnTransportService$i */
    public class C92736i implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f266909d;

        /* renamed from: e */
        public final /* synthetic */ C98120c f266910e;

        /* renamed from: f */
        public final /* synthetic */ C98121d f266911f;

        public C92736i(String str, C98120c cVar, C98121d dVar) {
            this.f266909d = str;
            this.f266910e = cVar;
            this.f266911f = dVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:45:0x0119, code lost:
            if ((r14.f287626U0 == r14.f287628W0) != false) goto L_0x011b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x0135, code lost:
            if ((r14.f287626U0 == r14.f287628W0) != false) goto L_0x0137;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r23 = this;
                r0 = r23
                com.tencent.mm.modelcdntran.CdnTransportService r1 = com.tencent.p014mm.modelcdntran.CdnTransportService.this
                java.util.Map<java.lang.String, gi.g> r1 = r1.f266894r
                java.lang.String r2 = r0.f266909d
                java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
                java.lang.Object r1 = r1.get(r2)
                gi.g r1 = (p1081gi.C98124g) r1
                r9 = 0
                r10 = 1
                r11 = 2
                java.lang.String r12 = "MicroMsg.CdnTransportService"
                if (r1 != 0) goto L_0x003b
                java.lang.Object[] r1 = new java.lang.Object[r11]
                java.lang.String r2 = r0.f266909d
                r1[r9] = r2
                com.tencent.mm.modelcdntran.CdnTransportService r2 = com.tencent.p014mm.modelcdntran.CdnTransportService.this
                int r2 = r2.hashCode()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r1[r10] = r2
                java.lang.String r2 = " task in jni get info failed mediaid[%s] hash[%s]"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r12, r2, r1)
                kj2.d r3 = kj2.C117407d.INSTANCE
                r4 = 594(0x252, double:2.935E-321)
                r6 = 7
                r8 = 1
                r10 = 1
                r3.idkeyStat(r4, r6, r8, r10)
                return
            L_0x003b:
                com.tencent.mm.modelcdntran.CdnTransportService r13 = com.tencent.p014mm.modelcdntran.CdnTransportService.this
                boolean r2 = r13.f266891o
                if (r2 != 0) goto L_0x0043
                r8 = 0
                goto L_0x006f
            L_0x0043:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = r1.field_mediaId
                r2.append(r3)
                long r3 = eb0.C31543z5.m39451a()
                r2.append(r3)
                java.lang.String r15 = r2.toString()
                com.tencent.mm.modelcdntran.CdnTransportService$j r8 = new com.tencent.mm.modelcdntran.CdnTransportService$j
                java.lang.String r4 = r1.f287660d
                java.lang.String r5 = r1.field_mediaId
                long r6 = java.lang.System.currentTimeMillis()
                r2 = r8
                r3 = r15
                r14 = r8
                r8 = r1
                r2.<init>(r3, r4, r5, r6, r8)
                java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.mm.modelcdntran.CdnTransportService$j> r2 = r13.f266887h
                r2.put(r15, r14)
                r8 = r14
            L_0x006f:
                gi.c r2 = r0.f266910e
                r3 = 3
                if (r2 == 0) goto L_0x009b
                java.lang.String r4 = r0.f266909d
                r2.f287607a = r4
                java.lang.Object[] r4 = new java.lang.Object[r3]
                long r5 = r2.field_toltalLength
                java.lang.Long r2 = java.lang.Long.valueOf(r5)
                r4[r9] = r2
                gi.c r2 = r0.f266910e
                long r5 = r2.field_finishedLength
                java.lang.Long r2 = java.lang.Long.valueOf(r5)
                r4[r10] = r2
                gi.c r2 = r0.f266910e
                boolean r2 = r2.field_mtlnotify
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                r4[r11] = r2
                java.lang.String r2 = "MTL: total:%d, cur:%d, mtl:%b"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r2, r4)
            L_0x009b:
                gi.d r2 = r0.f266911f
                if (r2 == 0) goto L_0x00a3
                java.lang.String r4 = r0.f266909d
                r2.f287609a = r4
            L_0x00a3:
                gi.g$a r2 = r1.f287662f
                if (r2 == 0) goto L_0x00ee
                long r4 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
                gi.d r2 = r0.f266911f
                if (r2 != 0) goto L_0x00d3
                gi.c r2 = r0.f266910e
                if (r2 == 0) goto L_0x00d3
                boolean r2 = r2.field_mtlnotify
                if (r2 != 0) goto L_0x00d3
                android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                int r2 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.getNetWorkType(r2)
                r6 = -1
                if (r2 != r6) goto L_0x00d3
                com.tencent.mm.modelcdntran.CdnTransportService r1 = com.tencent.p014mm.modelcdntran.CdnTransportService.this
                boolean r2 = r1.f266891o
                if (r2 != 0) goto L_0x00c9
                goto L_0x00d2
            L_0x00c9:
                if (r8 == 0) goto L_0x00d2
                java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.mm.modelcdntran.CdnTransportService$j> r1 = r1.f266887h
                java.lang.String r2 = r8.f266913a
                r1.remove(r2)
            L_0x00d2:
                return
            L_0x00d3:
                r1.field_lastProgressCallbackTime = r4
                gi.g$a r2 = r1.f287662f
                java.lang.String r4 = r0.f266909d
                r19 = 0
                gi.c r5 = r0.f266910e
                gi.d r6 = r0.f266911f
                boolean r7 = r1.field_onlycheckexist
                r17 = r2
                r18 = r4
                r20 = r5
                r21 = r6
                r22 = r7
                r17.mo1773g0(r18, r19, r20, r21, r22)
            L_0x00ee:
                boolean r2 = r1 instanceof p1081gi.C98122e
                if (r2 == 0) goto L_0x00f6
                r14 = r1
                gi.e r14 = (p1081gi.C98122e) r14
                goto L_0x00f7
            L_0x00f6:
                r14 = 0
            L_0x00f7:
                com.tencent.mm.modelcdntran.CdnTransportService r1 = com.tencent.p014mm.modelcdntran.CdnTransportService.this
                gi.c r2 = r0.f266910e
                r1.getClass()
                if (r2 == 0) goto L_0x010b
                long r4 = r2.field_finishedLength
                long r1 = r2.field_toltalLength
                int r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                if (r6 != 0) goto L_0x0109
                goto L_0x010b
            L_0x0109:
                r1 = 0
                goto L_0x010c
            L_0x010b:
                r1 = 1
            L_0x010c:
                if (r1 == 0) goto L_0x0126
                if (r14 == 0) goto L_0x011b
                int r1 = r14.f287626U0
                int r2 = r14.f287628W0
                if (r1 != r2) goto L_0x0118
                r1 = 1
                goto L_0x0119
            L_0x0118:
                r1 = 0
            L_0x0119:
                if (r1 == 0) goto L_0x0126
            L_0x011b:
                com.tencent.mm.modelcdntran.CdnTransportService r1 = com.tencent.p014mm.modelcdntran.CdnTransportService.this
                java.util.Map<java.lang.String, java.lang.Integer> r1 = r1.f266895s
                java.lang.String r2 = r0.f266909d
                java.util.HashMap r1 = (java.util.HashMap) r1
                r1.remove(r2)
            L_0x0126:
                gi.d r1 = r0.f266911f
                if (r1 == 0) goto L_0x0173
                if (r14 == 0) goto L_0x0137
                int r1 = r14.f287626U0
                int r2 = r14.f287628W0
                if (r1 != r2) goto L_0x0134
                r1 = 1
                goto L_0x0135
            L_0x0134:
                r1 = 0
            L_0x0135:
                if (r1 == 0) goto L_0x014e
            L_0x0137:
                com.tencent.mm.modelcdntran.CdnTransportService r1 = com.tencent.p014mm.modelcdntran.CdnTransportService.this
                java.util.Map<java.lang.String, gi.g> r1 = r1.f266894r
                java.lang.String r2 = r0.f266909d
                java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
                r1.remove(r2)
                java.lang.Object[] r1 = new java.lang.Object[r10]
                java.lang.String r2 = r0.f266909d
                r1[r9] = r2
                java.lang.String r2 = "remove task from mapTaskInJni: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r2, r1)
            L_0x014e:
                gi.d r1 = r0.f266911f
                int r1 = r1.field_retCode
                r2 = -5103011(0xffffffffffb2225d, float:NaN)
                if (r1 != r2) goto L_0x0173
                java.lang.String r1 = "summersafecdn ERR_VALIDATE_AUTHKEY"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r1)
                kj2.d r13 = kj2.C117407d.INSTANCE
                r14 = 546(0x222, double:2.7E-321)
                r16 = 4
                r18 = 1
                r20 = 1
                r13.idkeyStat(r14, r16, r18, r20)
                com.tencent.mm.modelcdntran.u r1 = com.tencent.p014mm.modelcdntran.C92779i0.Dx0()
                r2 = 999(0x3e7, float:1.4E-42)
                r1.keep_OnRequestDoGetCdnDnsInfo(r2)
            L_0x0173:
                com.tencent.mm.modelcdntran.CdnTransportService r1 = com.tencent.p014mm.modelcdntran.CdnTransportService.this
                boolean r2 = r1.f266891o
                if (r2 != 0) goto L_0x017a
                goto L_0x01b7
            L_0x017a:
                if (r8 == 0) goto L_0x01b7
                java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.mm.modelcdntran.CdnTransportService$j> r2 = r1.f266887h
                java.lang.String r4 = r8.f266913a
                boolean r2 = r2.containsKey(r4)
                if (r2 == 0) goto L_0x0194
                long r2 = java.lang.System.currentTimeMillis()
                r8.f266917e = r2
                java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.mm.modelcdntran.CdnTransportService$j> r1 = r1.f266887h
                java.lang.String r2 = r8.f266913a
                r1.put(r2, r8)
                goto L_0x01b7
            L_0x0194:
                java.lang.Object[] r1 = new java.lang.Object[r3]
                java.lang.String r2 = r8.field_mediaId
                java.lang.String r3 = ""
                java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r2, (java.lang.String) r3)
                r1[r9] = r2
                long r2 = r8.f266916d
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
                r1[r10] = r2
                long r2 = eb0.C31543z5.m39451a()
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
                r1[r11] = r2
                java.lang.String r2 = "cdnCallBackReportHashMap no exist %s，duration:%s-%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r2, r1)
            L_0x01b7:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelcdntran.CdnTransportService.C92736i.run():void");
        }

        public String toString() {
            return super.toString() + "|callback";
        }
    }

    /* renamed from: com.tencent.mm.modelcdntran.CdnTransportService$j */
    public static class C92737j {

        /* renamed from: a */
        public String f266913a;

        /* renamed from: b */
        public String f266914b;

        /* renamed from: c */
        public boolean f266915c;

        /* renamed from: d */
        public long f266916d = 0;

        /* renamed from: e */
        public long f266917e = -1;

        /* renamed from: f */
        public long f266918f = 0;
        public String field_mediaId;
        public int field_totalLen = 0;

        /* renamed from: g */
        public int f266919g = 0;

        /* renamed from: h */
        public int f266920h = 0;

        /* renamed from: i */
        public int f266921i = 0;

        /* renamed from: j */
        public int f266922j = 0;

        /* renamed from: k */
        public int f266923k = 0;

        /* renamed from: l */
        public int f266924l = 0;

        /* renamed from: m */
        public int f266925m = 0;

        /* renamed from: n */
        public int f266926n = 0;

        /* renamed from: o */
        public String f266927o = "";

        /* renamed from: p */
        public int f266928p = 0;

        /* renamed from: q */
        public int f266929q = 0;

        /* renamed from: r */
        public long f266930r = 0;

        public C92737j(String str, String str2, String str3, long j, C98124g gVar) {
            this.f266913a = str;
            this.f266914b = str2;
            this.field_mediaId = str3;
            this.f266915c = gVar.f287661e;
            this.field_totalLen = gVar.field_totalLen;
            this.f266916d = j;
            this.f266918f = Thread.currentThread().getId();
            this.f266919g = gVar.field_fileType;
            this.f266920h = gVar.field_appType;
            this.f266921i = gVar.field_bzScene;
            this.f266922j = gVar.f287663g;
            this.f266923k = gVar.field_chattype;
            this.f266924l = gVar.field_advideoflag;
            this.f266925m = gVar.field_largesvideo;
            this.f266926n = gVar.field_requestVideoFormat;
            this.f266927o = Util.nullAs(gVar.field_snsScene, "");
            this.f266928p = gVar.f287646C ? 1 : 0;
            this.f266929q = gVar.f287655L;
            this.f266930r = System.currentTimeMillis();
        }

        public String toString() {
            return "CdnTaskReportInfo{cdnCallbackReportId='" + this.f266913a + '\'' + ", taskName='" + this.f266914b + '\'' + ", field_mediaId='" + this.field_mediaId + '\'' + ", isSend=" + this.f266915c + ", field_totalLen=" + this.field_totalLen + ", startTime=" + this.f266916d + ", endTime=" + this.f266917e + ", threadId=" + this.f266918f + ", _FileType=" + this.f266919g + ", _AppType=" + this.f266920h + ", _BzScene=" + this.f266921i + ", _BizType=" + this.f266922j + ", _Chattype=" + this.f266923k + ", _Advideoflag=" + this.f266924l + ", _Largesvideo=" + this.f266925m + ", _RequestVideoFormat=" + this.f266926n + ", _SnsScene='" + this.f266927o + '\'' + ", _SnsImageDownload=" + this.f266928p + ", _VideoTaskType=" + this.f266929q + ", localTime=" + this.f266930r + '}';
        }
    }

    public CdnTransportService() {
        MTimerHandler mTimerHandler = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C92730d(), true);
        this.f266888i = mTimerHandler;
        this.f266889j = new C92731e();
        this.f266890n = new ConcurrentHashMap<>();
        this.f266891o = C118950a.f356272a;
        this.f266892p = new LinkedList();
        this.f266893q = new HashMap();
        this.f266894r = new ConcurrentHashMap();
        this.f266895s = new HashMap();
        this.f266896t = new HashSet<>();
        C86709a0.m107529k().mo121126a(this.f266886g);
        C86709a0.m107524d().mo123455a(379, this);
        this.f266885f.alive();
        if (m116898g()) {
            this.f266889j.alive();
            mTimerHandler.startTimer(60000);
        }
        Log.m105925i("MicroMsg.CdnTransportService", "summersafecdn CdnTransportService init[%s] stack[%s]", Integer.valueOf(hashCode()), Util.getStack());
    }

    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r9v2 */
    /* renamed from: d */
    public static void m116897d(CdnTransportService cdnTransportService) {
        long j;
        char c;
        ? r9;
        CdnTransportService cdnTransportService2 = cdnTransportService;
        cdnTransportService.getClass();
        if (m116898g()) {
            ArrayList arrayList = new ArrayList();
            Iterator<Map.Entry<String, C92737j>> it = cdnTransportService2.f266887h.entrySet().iterator();
            while (true) {
                j = 0;
                c = 2;
                r9 = 0;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                C92737j jVar = (C92737j) next.getValue();
                long j2 = jVar.f266917e;
                if (j2 > 0) {
                    long j3 = j2 - jVar.f266916d;
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(m116899m(5, j3));
                    int i = 10;
                    int i2 = 24;
                    while (true) {
                        if (i2 < 0) {
                            break;
                        } else if (j3 >= f266879u[i2]) {
                            i = f266880v[i2];
                            break;
                        } else {
                            i2--;
                        }
                    }
                    arrayList2.add(m116899m(i, 1));
                    arrayList2.add(m116899m(0, 1));
                    C117407d.INSTANCE.mo160124a(arrayList2, false);
                    Log.m105925i("MicroMsg.CdnTransportService", "reportCDNCallbackTime(%s) taskName:%s cdnCallbackReportId:%s mediaId:%s duration:%s(%s-%s)", Long.valueOf(jVar.f266918f), jVar.f266914b, Util.nullAs(jVar.f266913a, ""), Util.nullAs(jVar.field_mediaId, ""), Long.valueOf(j3), Long.valueOf(jVar.f266916d), Long.valueOf(jVar.f266917e));
                    arrayList.add((String) next.getKey());
                } else if (System.currentTimeMillis() - jVar.f266916d > 120000) {
                    Log.m105925i("MicroMsg.CdnTransportService", "reportCDNCallbackTime(%s) taskName:%s cdnCallbackReportId:%s id:%s", Long.valueOf(jVar.f266918f), jVar.f266914b, Util.nullAs(jVar.f266913a, ""), Util.nullAs(jVar.field_mediaId, ""));
                    C117407d.INSTANCE.idkeyStat(1452, 34, 1, false);
                    arrayList.add((String) next.getKey());
                }
            }
            long j4 = 120000;
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                C92737j remove = cdnTransportService2.f266887h.remove((String) it4.next());
                if (remove != null) {
                    AndroidCdnCallbackTimeStruct androidCdnCallbackTimeStruct = new AndroidCdnCallbackTimeStruct();
                    androidCdnCallbackTimeStruct.f265275d = androidCdnCallbackTimeStruct.mo86045b("MediaId", remove.field_mediaId, true);
                    androidCdnCallbackTimeStruct.f265276e = remove.f266915c ? 1 : 0;
                    androidCdnCallbackTimeStruct.f265277f = remove.field_totalLen;
                    long j5 = remove.f266917e;
                    long j6 = j5 <= j ? j4 : j5 - remove.f266916d;
                    if (f266882x == -1) {
                        String f = C117731d.m166007c().mo182444f("clicfg_cdn_callback_consume_time_kv_report_min", "0", r9, true);
                        f266882x = Util.getLong(f, j);
                        Object[] objArr = new Object[1];
                        objArr[r9] = f;
                        Log.m105919d("MicroMsg.CdnTransportService", "getCDNCallbackKVStatisticsMinTime() minTime:%s", objArr);
                    }
                    if (j6 >= f266882x) {
                        androidCdnCallbackTimeStruct.f265278g = (int) j6;
                        androidCdnCallbackTimeStruct.f265279h = remove.f266919g;
                        androidCdnCallbackTimeStruct.f265280i = remove.f266920h;
                        androidCdnCallbackTimeStruct.f265281j = remove.f266921i;
                        androidCdnCallbackTimeStruct.f265282k = remove.f266922j;
                        androidCdnCallbackTimeStruct.f265283l = remove.f266923k;
                        androidCdnCallbackTimeStruct.f265284m = remove.f266924l;
                        androidCdnCallbackTimeStruct.f265285n = remove.f266925m;
                        androidCdnCallbackTimeStruct.f265286o = remove.f266926n;
                        androidCdnCallbackTimeStruct.f265287p = androidCdnCallbackTimeStruct.mo86045b("SnsScene", remove.f266927o, true);
                        androidCdnCallbackTimeStruct.f265288q = remove.f266928p;
                        androidCdnCallbackTimeStruct.f265289r = remove.f266929q;
                        androidCdnCallbackTimeStruct.f265290s = j6;
                        androidCdnCallbackTimeStruct.f265291t = remove.f266916d;
                        androidCdnCallbackTimeStruct.f265292u = remove.f266917e;
                        androidCdnCallbackTimeStruct.f265293v = remove.f266918f;
                        androidCdnCallbackTimeStruct.f265294w = androidCdnCallbackTimeStruct.mo86045b("TaskName", remove.f266914b, true);
                        androidCdnCallbackTimeStruct.mo86054n();
                        Object[] objArr2 = new Object[8];
                        objArr2[r9] = Long.valueOf(remove.f266918f);
                        objArr2[1] = remove.f266914b;
                        objArr2[c] = Util.nullAs(remove.f266913a, "");
                        objArr2[3] = Util.nullAs(remove.field_mediaId, "");
                        objArr2[4] = Long.valueOf(j6);
                        objArr2[5] = Long.valueOf(remove.f266916d);
                        objArr2[6] = Long.valueOf(remove.f266917e);
                        objArr2[7] = Long.valueOf(remove.f266930r);
                        Log.m105925i("MicroMsg.CdnTransportService", "kvCDNCallbackTimeReport(%s) taskName:%s cdnCallbackReportId:%s mediaId:%s duration:%s(%s-%s) localTime:%s", objArr2);
                        j = 0;
                        c = 2;
                        r9 = 0;
                        j4 = 120000;
                    }
                }
                j = 0;
                c = 2;
                r9 = 0;
                j4 = 120000;
            }
        }
    }

    /* renamed from: g */
    public static boolean m116898g() {
        String f = C117731d.m166007c().mo182444f("clicfg_cdn_callback_consume_time_statistics_switch", "1", false, true);
        Log.m105919d("MicroMsg.CdnTransportService", "canCDNCallbackStatistics() sw:%s", f);
        return Util.isEqual(f, "1");
    }

    /* renamed from: m */
    public static IDKey m116899m(int i, long j) {
        IDKey iDKey = new IDKey();
        iDKey.SetID(1452);
        iDKey.SetKey(i);
        iDKey.SetValue(j);
        return iDKey;
    }

    /* renamed from: a */
    public int mo17770a(String str, C98120c cVar, C98121d dVar) {
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.CdnTransportService", "cdn callback mediaid is null");
            return -1;
        } else if (cVar == null && dVar == null) {
            Log.m105920e("MicroMsg.CdnTransportService", "cdn callback info all null");
            return -2;
        } else {
            if (cVar != null) {
                Log.m105919d("MicroMsg.CdnTransportService", "CDN progress. total:%d, cur:%d, canshow:%b", Long.valueOf(cVar.field_toltalLength), Long.valueOf(cVar.field_finishedLength), Boolean.valueOf(cVar.field_mtlnotify));
            }
            Util.nowMilliSecond();
            ((C119157j) C119157j.f356862d).mo183876g(new C92736i(str, cVar, dVar), mo126955l((C98124g) ((ConcurrentHashMap) this.f266894r).get(str)));
            return 0;
        }
    }

    /* renamed from: b */
    public int mo17771b(String str, C98121d dVar) {
        if (Util.isNullOrNil(str)) {
            return 0;
        }
        ((C119157j) C119157j.f356862d).mo183876g(new C92729a(str, dVar), mo126955l((C98124g) ((ConcurrentHashMap) this.f266894r).get(str)));
        return 0;
    }

    /* renamed from: c */
    public void mo126950c() {
        Class cls = C10485b.class;
        Class cls2 = C32735h.class;
        if (C86709a0.m107523b().mo121115m()) {
            CdnLogic.Config config = new CdnLogic.Config();
            try {
                String c = ((C10485b) C86709a0.m107533q(cls)).vh0().mo107405c("EnableSnsStreamDownload");
                String c2 = ((C10485b) C86709a0.m107533q(cls)).vh0().mo107405c("EnableSnsImageDownload");
                if (!Util.isNullOrNil(c)) {
                    config.EnableSnsStreamDownload = Integer.valueOf(c).intValue();
                }
                if (!Util.isNullOrNil(c2)) {
                    config.EnableSnsImageDownload = Integer.valueOf(c2).intValue();
                }
                config.EnableSafeCDN = 1;
                config.ApprovedVideoHosts = ((C32735h) C86312j.m106911c(cls2)).Y60(C32735h.C32737c.clicfg_approved_videohosts, "weixinf.tc.qq.com,szwbwxsns.video.qq.com,szxzwxsns.video.qq.com,szzjwxsns.video.qq.com,shwbwxsns.video.qq.com,shxzwxsns.video.qq.com,shzjwxsns.video.qq.com,wxsnsdy.wxs.qq.com,vweixinthumb.tc.qq.com,wxsnsdythumb.wxs.qq.com,wxappthumb.tc.qq.com,wxapp.tc.qq.com,wxsnsdysvp.wxs.qq.com,finder.video.qq.com,findermp.video.qq.com,weixinf.tc.qq.com.cn,szwbwxsns.video.qq.com.cn,szxzwxsns.video.qq.com.cn,szzjwxsns.video.qq.com.cn,shwbwxsns.video.qq.com.cn,shxzwxsns.video.qq.com.cn,shzjwxsns.video.qq.com.cn,wxsnsdy.wxs.qq.com.cn,vweixinthumb.tc.qq.com.cn,wxsnsdythumb.wxs.qq.com.cn,wxappthumb.tc.qq.com.cn,wxapp.tc.qq.com.cn,wxsnsdysvp.wxs.qq.com.cn,finder.video.qq.com.cn,findermp.video.qq.com.cn,snsvideo.c2c.qq.com.cn,wxsnsdy.video.qq.com.cn,snsvideo.hk.wechat.com,snsvideo.c2c.wechat.com,findera4.video.qq.com");
                String str = "clicfg_android_channelvideo_quic=" + ((C32735h) C86312j.m106911c(cls2)).Y60(C32735h.C32737c.clicfg_android_channelvideo_quic, "324") + ";" + "clicfg_android_snsimage_quic=" + ((C32735h) C86312j.m106911c(cls2)).Y60(C32735h.C32737c.clicfg_android_snsimage_quic, "111") + ";";
                config.QuicExptValues = str;
                Log.m105925i("MicroMsg.CdnTransportService", "[quic.config] expt %s", str);
                String str2 = "clicfg_bigfile_hutong_download=" + ((C32735h) C86312j.m106911c(cls2)).Y60(C32735h.C32737c.clicfg_bigfile_hutong_download, "0") + ";" + "clicfg_android_new_upload_protocol_list=" + ((C32735h) C86312j.m106911c(cls2)).Y60(C32735h.C32738b.clicfg_android_new_upload_protocol_list, "") + ";";
                config.MiscellaneousExptValues = str2;
                Log.m105925i("MicroMsg.CdnTransportService", "[miscell.config] expt %s", str2);
                int i = this.f266883d;
                if (i != -1) {
                    Log.m105929w("MicroMsg.CdnTransportService", "cmd set snsimage flag: %d", Integer.valueOf(i));
                    config.EnableSnsImageDownload = this.f266883d;
                }
                Log.m105925i("MicroMsg.CdnTransportService", "summersafecdn streamcdn config[SVR]:%s", config);
                CdnLogic.setConfig(config);
            } catch (NumberFormatException e) {
                Log.m105920e("MicroMsg.CdnTransportService", e.toString());
            }
        }
    }

    @Deprecated
    /* renamed from: e */
    public boolean mo126951e(C98124g gVar, int i) {
        if (gVar == null) {
            Log.m105920e("MicroMsg.CdnTransportService", "addRecvTask task info is null");
            return false;
        } else if (Util.isNullOrNil(gVar.field_mediaId)) {
            Log.m105920e("MicroMsg.CdnTransportService", "addRecvTask mediaId is null");
            return false;
        } else {
            if (gVar.field_fileId == null) {
                gVar.field_fileId = "";
            }
            if (gVar.field_aesKey == null) {
                gVar.field_aesKey = "";
            }
            gVar.f287661e = false;
            Log.m105925i("MicroMsg.CdnTransportService", "addRecvTask id:%s appType:%s fileType:%s", gVar.field_mediaId, Integer.valueOf(gVar.field_appType), Integer.valueOf(gVar.field_appType));
            ((C119157j) C119157j.f356862d).mo183876g(new C92734g(i, gVar), "MicroMsg.Cdn.ThreadName");
            return true;
        }
    }

    @Deprecated
    /* renamed from: f */
    public boolean mo126952f(C98124g gVar) {
        if (gVar == null) {
            Log.m105920e("MicroMsg.CdnTransportService", "summersafecdn addSendTask task info is null");
            return false;
        } else if (Util.isNullOrNil(gVar.field_mediaId)) {
            Log.m105920e("MicroMsg.CdnTransportService", "summersafecdn addSendTask mediaId is null");
            return false;
        } else {
            if (gVar.field_fileId == null) {
                gVar.field_fileId = "";
            }
            if (gVar.field_aesKey == null) {
                gVar.field_aesKey = "";
            }
            gVar.f287661e = true;
            Log.m105925i("MicroMsg.CdnTransportService", "addSendTask id:%s appType:%s fileType:%s", gVar.field_mediaId, Integer.valueOf(gVar.field_appType), Integer.valueOf(gVar.field_appType));
            ((C119157j) C119157j.f356862d).mo183876g(new C92735h(gVar), "MicroMsg.Cdn.ThreadName");
            return true;
        }
    }

    /* renamed from: h */
    public void mo17772h(String str, ByteArrayOutputStream byteArrayOutputStream) {
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.CdnTransportService", "cdn callback getauthbuf mediaid is null");
            return;
        }
        C98124g gVar = (C98124g) ((ConcurrentHashMap) this.f266894r).get(str);
        if (gVar == null) {
            Log.m105921e("MicroMsg.CdnTransportService", " getauthbuf task in jni get info failed mediaid:%s", str);
            return;
        }
        C98124g.C98125a aVar = gVar.f287662f;
        if (aVar != null) {
            aVar.mo1774h(str, byteArrayOutputStream);
        } else {
            Log.m105920e("MicroMsg.CdnTransportService", "getCdnAuthInfo fail, null taskcallback.");
        }
    }

    /* renamed from: i */
    public boolean mo126953i(String str) {
        C98124g gVar = (C98124g) ((ConcurrentHashMap) this.f266894r).remove(str);
        if (gVar != null) {
            int i = gVar.field_fileType;
            if (i == 30001 || i == 30003 || i == 31000) {
                C92779i0.Dx0().mo127051t(str);
            } else if (gVar.f287677x) {
                C92779i0.Dx0().getClass();
                Log.m105924i("MicroMsg.CdnTransportEngine", "stopGamePackageDownload: mediaid:" + str);
                CdnLogic.cancelTask(str);
            } else {
                C92779i0.Dx0().getClass();
                CdnLogic.cancelTask(str);
            }
            C117407d.INSTANCE.mo160131h(10769, -10002, Integer.valueOf(gVar.field_fileType), Long.valueOf(Util.nowMilliSecond() - gVar.field_startTime));
        }
        ((HashMap) this.f266893q).remove(str);
        ((HashMap) this.f266895s).remove(str);
        Log.m105925i("MicroMsg.CdnTransportService", "summersafecdn cdntra cancelRecvTask mediaid:%s mapremove:%s engine ret:%d", str, gVar, 0);
        return true;
    }

    /* renamed from: j */
    public byte[] mo17773j(String str, byte[] bArr) {
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.CdnTransportService", "cdn callback decodePrepareResponse mediaid is null");
            return null;
        }
        C98124g gVar = (C98124g) ((ConcurrentHashMap) this.f266894r).get(str);
        if (gVar == null) {
            Log.m105921e("MicroMsg.CdnTransportService", " decodePrepareResponse task in jni get info failed mediaid:%s", str);
            return null;
        }
        C98124g.C98125a aVar = gVar.f287662f;
        if (aVar != null) {
            return aVar.mo1775j(str, bArr);
        }
        Log.m105920e("MicroMsg.CdnTransportService", "decodePrepareResponse fail, null taskcallback.");
        return null;
    }

    /* renamed from: k */
    public boolean mo126954k(String str) {
        C98124g gVar = (C98124g) ((ConcurrentHashMap) this.f266894r).remove(str);
        if (gVar != null) {
            C92779i0.Dx0().getClass();
            CdnLogic.cancelTask(str);
            C117407d.INSTANCE.mo160131h(10769, -10003, Integer.valueOf(gVar.field_fileType), Long.valueOf(Util.nowMilliSecond() - gVar.field_startTime));
        }
        ((HashMap) this.f266893q).remove(str);
        Log.m105925i("MicroMsg.CdnTransportService", "summersafecdn cdntra cancelSendTask mediaid:%s mapremove:%s engine ret:%d", str, gVar, 0);
        return true;
    }

    /* renamed from: l */
    public String mo126955l(C98124g gVar) {
        if (gVar == null || Util.isNullOrNil(gVar.f287660d)) {
            return "MicroMsg.CdnTransportService";
        }
        if (this.f266890n.containsKey(gVar.f287660d)) {
            return this.f266890n.get(gVar.f287660d);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("MicroMsg.CdnTransportService_");
        int size = this.f266890n.size() + 1;
        if (f266881w == -1) {
            String f = C117731d.m166007c().mo182444f("clicfg_cdn_callback_tag_max_num", "1", false, true);
            Log.m105919d("MicroMsg.CdnTransportService", "getTagMaxNum() maxNum:%s", f);
            f266881w = Util.getInt(f, 1);
        }
        sb.append(size % f266881w);
        String sb4 = sb.toString();
        this.f266890n.put(gVar.f287660d, sb4);
        Log.m105925i("MicroMsg.CdnTransportService", "taskName:%s tag:%s", Util.nullAs(gVar.f287660d, ""), Util.nullAs(sb4, ""));
        return sb4;
    }

    /* renamed from: n */
    public void mo126956n() {
        ConcurrentHashMap<String, String> concurrentHashMap = this.f266890n;
        if (concurrentHashMap != null) {
            concurrentHashMap.clear();
        }
        this.f266884e.removeCallbacksAndMessages((Object) null);
        C86709a0.m107529k().mo121129d(this.f266886g);
        C86709a0.m107529k().f251779b.mo123470p(379, this);
        this.f266885f.dead();
        this.f266889j.dead();
        this.f266888i.stopTimer();
    }

    /* renamed from: o */
    public void mo126957o(int i) {
        this.f266883d = i;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar.getType() == 379) {
            Log.m105919d("MicroMsg.CdnTransportService", "cdntra onSceneEnd it will tryStart sceneType:%d [%d,%d]", Integer.valueOf(yVar.getType()), Integer.valueOf(i), Integer.valueOf(i2));
            if (C86709a0.m107523b().mo121114l()) {
                ((C119157j) C119157j.f356862d).mo183876g(new C92733f(), "MicroMsg.Cdn.ThreadName");
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:154:0x0455  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0478  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo126958p(boolean r35) {
        /*
            r34 = this;
            r0 = r34
            r1 = 0
            r2 = 1
            java.lang.String r3 = "MicroMsg.CdnTransportService"
            if (r35 != 0) goto L_0x0025
            com.tencent.mm.modelcdntran.u r4 = com.tencent.p014mm.modelcdntran.C92779i0.Dx0()
            te3.jm r4 = r4.f267114d
            if (r4 != 0) goto L_0x0012
            r4 = 1
            goto L_0x0013
        L_0x0012:
            r4 = 0
        L_0x0013:
            if (r4 == 0) goto L_0x0025
            f40.e r4 = f40.C86709a0.m107523b()
            boolean r4 = r4.mo121115m()
            if (r4 == 0) goto L_0x0025
            java.lang.String r4 = "summersafecdn cdntra Not init cdn dnsinfo , will retry after set info"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r4)
        L_0x0025:
            r34.mo126950c()
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.util.Queue<java.lang.String> r5 = r0.f266892p
            java.util.LinkedList r5 = (java.util.LinkedList) r5
            int r5 = r5.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r1] = r5
            java.lang.String r5 = "summersafecdn tryStart queue:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r5, r4)
        L_0x003e:
            java.util.Queue<java.lang.String> r4 = r0.f266892p
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x04d1
            java.util.Queue<java.lang.String> r4 = r0.f266892p
            java.util.LinkedList r4 = (java.util.LinkedList) r4
            java.lang.Object r4 = r4.poll()
            java.lang.String r4 = (java.lang.String) r4
            java.util.Map<java.lang.String, gi.g> r5 = r0.f266893q
            java.util.HashMap r5 = (java.util.HashMap) r5
            java.lang.Object r4 = r5.remove(r4)
            gi.g r4 = (p1081gi.C98124g) r4
            if (r4 != 0) goto L_0x0063
            java.lang.String r1 = "summersafecdn task queue is empty , maybe bug here"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r1)
            return
        L_0x0063:
            r5 = 6
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.String r7 = r4.field_mediaId
            r6[r1] = r7
            boolean r7 = r4.field_autostart
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r6[r2] = r7
            int r7 = r4.field_chattype
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8 = 2
            r6[r8] = r7
            int r7 = r4.field_appType
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r9 = 3
            r6[r9] = r7
            int r7 = r4.field_appType
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r10 = 4
            r6[r10] = r7
            boolean r7 = r4.f287661e
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r11 = 5
            r6[r11] = r7
            java.lang.String r7 = "summersafecdn id:%s cdnautostart:%s chatroom:%s appType:%s fileType:%s isSend:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r7, r6)
            long r6 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r4.field_startTime = r6
            boolean r6 = r4.f287661e
            r7 = 7
            r12 = 8
            if (r6 == 0) goto L_0x01b4
            java.lang.Object[] r6 = new java.lang.Object[r12]
            java.lang.String r12 = r4.field_fullpath
            if (r12 != 0) goto L_0x00b1
            r12 = -1
            goto L_0x00b5
        L_0x00b1:
            int r12 = r12.length()
        L_0x00b5:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r6[r1] = r12
            java.lang.String r12 = r4.field_thumbpath
            if (r12 != 0) goto L_0x00c1
            r14 = -1
            goto L_0x00c5
        L_0x00c1:
            int r14 = r12.length()
        L_0x00c5:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r14)
            r6[r2] = r12
            java.lang.String r12 = r4.field_svr_signature
            java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.Util.secPrint(r12)
            r6[r8] = r12
            java.lang.String r12 = r4.field_aesKey
            java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.Util.secPrint(r12)
            r6[r9] = r12
            int r12 = r4.field_fileType
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r6[r10] = r12
            java.lang.String r12 = r4.field_mediaId
            r6[r11] = r12
            boolean r12 = r4.field_onlycheckexist
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            r6[r5] = r12
            int r5 = r4.field_largesvideo
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6[r7] = r5
            java.lang.String r5 = "summersafecdn tryStart send file:%d thumb:%d, field_svr_signature[%s], field_aesKey[%s], field_fileType[%d], field_mediaId[%s], onlycheckexist[%b] largesvideo[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r5, r6)
            java.lang.String r5 = r4.field_fullpath
            java.lang.String r6 = ""
            if (r5 != 0) goto L_0x0105
            r4.field_fullpath = r6
        L_0x0105:
            java.lang.String r5 = r4.field_thumbpath
            if (r5 != 0) goto L_0x010b
            r4.field_thumbpath = r6
        L_0x010b:
            java.util.Map<java.lang.String, gi.g> r5 = r0.f266894r
            java.lang.String r6 = r4.field_mediaId
            java.util.concurrent.ConcurrentHashMap r5 = (java.util.concurrent.ConcurrentHashMap) r5
            java.lang.Object r5 = r5.put(r6, r4)
            gi.g r5 = (p1081gi.C98124g) r5
            java.util.Map<java.lang.String, gi.g> r6 = r0.f266894r
            java.lang.String r7 = r4.field_mediaId
            java.util.concurrent.ConcurrentHashMap r6 = (java.util.concurrent.ConcurrentHashMap) r6
            java.lang.Object r6 = r6.get(r7)
            gi.g r6 = (p1081gi.C98124g) r6
            if (r6 != 0) goto L_0x0132
            kj2.d r14 = kj2.C117407d.INSTANCE
            r15 = 594(0x252, double:2.935E-321)
            r17 = 5
            r19 = 1
            r21 = 1
            r14.idkeyStat(r15, r17, r19, r21)
        L_0x0132:
            com.tencent.mm.modelcdntran.u r7 = com.tencent.p014mm.modelcdntran.C92779i0.Dx0()
            int r7 = r7.mo127050s(r4)
            java.lang.Object[] r11 = new java.lang.Object[r11]
            java.lang.String r12 = r4.field_mediaId
            r11[r1] = r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r7)
            r11[r2] = r12
            if (r5 != 0) goto L_0x014a
            r5 = 0
            goto L_0x014c
        L_0x014a:
            java.lang.String r5 = r5.field_mediaId
        L_0x014c:
            r11[r8] = r5
            if (r6 != 0) goto L_0x0152
            r13 = 0
            goto L_0x0154
        L_0x0152:
            java.lang.String r13 = r6.field_mediaId
        L_0x0154:
            r11[r9] = r13
            int r5 = r34.hashCode()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r11[r10] = r5
            java.lang.String r5 = "summersafecdn startupUploadMedia ok, field_mediaId[%s] ret[%s, %s, %s] hash[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r5, r11)
            if (r7 == 0) goto L_0x003e
            java.lang.Object[] r5 = new java.lang.Object[r8]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            r5[r1] = r6
            java.lang.String r6 = r4.field_mediaId
            r5[r2] = r6
            java.lang.String r6 = "summersafecdn startupUploadMedia error:%d clientid:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r6, r5)
            r5 = -21005(0xffffffffffffadf3, float:NaN)
            if (r5 != r7) goto L_0x017f
            goto L_0x019f
        L_0x017f:
            java.util.Map<java.lang.String, gi.g> r5 = r0.f266894r
            java.lang.String r6 = r4.field_mediaId
            java.util.concurrent.ConcurrentHashMap r5 = (java.util.concurrent.ConcurrentHashMap) r5
            java.lang.Object r5 = r5.remove(r6)
            gi.g r5 = (p1081gi.C98124g) r5
            java.lang.Object[] r6 = new java.lang.Object[r9]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            r6[r1] = r9
            java.lang.String r9 = r4.field_mediaId
            r6[r2] = r9
            r6[r8] = r5
            java.lang.String r5 = "summersafecdn startupUploadMedia error:%d clientid:%s remove[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r5, r6)
        L_0x019f:
            gi.g$a r14 = r4.f287662f
            if (r14 == 0) goto L_0x003e
            java.lang.String r15 = r4.field_mediaId
            r17 = 0
            r18 = 0
            boolean r4 = r4.field_onlycheckexist
            r16 = r7
            r19 = r4
            r14.mo1773g0(r15, r16, r17, r18, r19)
            goto L_0x003e
        L_0x01b4:
            int r6 = r4.field_fileType
            r15 = 20303(0x4f4f, float:2.845E-41)
            if (r6 != r15) goto L_0x0223
            int r13 = r4.field_appType
            r14 = 264(0x108, float:3.7E-43)
            if (r13 != r14) goto L_0x0223
            boolean r13 = r4 instanceof p1081gi.C98127h
            if (r13 == 0) goto L_0x0223
            com.tencent.mm.modelcdntran.u r5 = com.tencent.p014mm.modelcdntran.C92779i0.Dx0()
            r6 = r4
            gi.h r6 = (p1081gi.C98127h) r6
            r5.getClass()
            com.tencent.mars.cdn.CdnLogic$C2CDownloadRequest r7 = new com.tencent.mars.cdn.CdnLogic$C2CDownloadRequest
            r7.<init>()
            java.lang.String r12 = r6.field_mediaId
            r7.fileKey = r12
            java.lang.String r12 = r6.f287705p0
            r7.url = r12
            java.lang.String r12 = r6.field_fullpath
            r7.setSavePath(r12)
            java.lang.String r12 = r6.f287700b1
            r7.snsCipherKey = r12
            r7.bizid = r9
            r7.apptype = r14
            java.lang.String r12 = r6.field_aesKey
            r7.aeskey = r12
            r7.fileType = r15
            int r12 = r6.f287696Y0
            r7.concurrentCount = r12
            int r6 = r6.f287664h
            r7.downloadBehavior = r6
            boolean r6 = sf0.C90188n0.f258910D
            if (r6 == 0) goto L_0x021e
            java.lang.String r6 = sf0.C90188n0.f258911E
            int r6 = r6.length()
            if (r6 <= 0) goto L_0x021e
            java.lang.String r6 = sf0.C90188n0.f258911E
            r7.debugIP = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r12 = "debugip "
            r6.append(r12)
            java.lang.String r12 = r7.debugIP
            r6.append(r12)
            java.lang.String r6 = r6.toString()
            java.lang.String r12 = "MicroMsg.CdnTransportEngine"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r12, r6)
        L_0x021e:
            int r14 = com.tencent.mars.cdn.CdnLogic.startSNSDownload(r7, r5, r5, r1)
            goto L_0x024e
        L_0x0223:
            r13 = 40001(0x9c41, float:5.6053E-41)
            if (r6 != r13) goto L_0x0251
            com.tencent.mm.modelcdntran.u r17 = com.tencent.p014mm.modelcdntran.C92779i0.Dx0()
            java.lang.String r5 = r4.field_mediaId
            java.lang.String r6 = r4.f287672s
            java.lang.String r7 = r4.field_fullpath
            int r12 = r4.field_fileType
            java.lang.String r13 = r4.field_aesKey
            java.lang.String r14 = r4.field_authKey
            int r15 = r4.field_totalLen
            r25 = 0
            r18 = r5
            r19 = r6
            r20 = r7
            r21 = r12
            r22 = r13
            r23 = r14
            r24 = r15
            int r14 = r17.mo127047p(r18, r19, r20, r21, r22, r23, r24, r25)
        L_0x024e:
            r13 = r14
            goto L_0x0453
        L_0x0251:
            r13 = 19
            if (r6 != r13) goto L_0x0282
            java.lang.Class<h81.h> r5 = h81.C32735h.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            h81.h r5 = (h81.C32735h) r5
            h81.h$c r6 = h81.C32735h.C32737c.clicfg_enterprise_file_download_use_cronet
            boolean r20 = r5.mo58784wf(r6, r1)
            com.tencent.mm.modelcdntran.u r12 = com.tencent.p014mm.modelcdntran.C92779i0.Dx0()
            java.lang.String r13 = r4.field_mediaId
            java.lang.String r14 = r4.f287672s
            java.lang.String r15 = r4.field_fullpath
            int r5 = r4.field_fileType
            java.lang.String r6 = r4.field_aesKey
            java.lang.String r7 = r4.field_authKey
            int r11 = r4.field_totalLen
            r16 = r5
            r17 = r6
            r18 = r7
            r19 = r11
            int r14 = r12.mo127047p(r13, r14, r15, r16, r17, r18, r19, r20)
            goto L_0x024e
        L_0x0282:
            r11 = 30001(0x7531, float:4.204E-41)
            if (r6 == r11) goto L_0x03ee
            r11 = 30003(0x7533, float:4.2043E-41)
            if (r6 == r11) goto L_0x03ee
            r11 = 31000(0x7918, float:4.344E-41)
            if (r6 != r11) goto L_0x0290
            goto L_0x03ee
        L_0x0290:
            boolean r6 = r4.f287677x
            if (r6 == 0) goto L_0x02f8
            java.lang.String r5 = r4.field_fullpath
            if (r5 == 0) goto L_0x02d1
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x02d1
            com.tencent.mm.modelcdntran.u r22 = com.tencent.p014mm.modelcdntran.C92779i0.Dx0()
            java.lang.String r5 = r4.field_mediaId
            java.lang.String r6 = r4.field_fullpath
            java.lang.String r7 = r4.f287672s
            java.lang.String r11 = r4.f287644A
            java.util.Map<java.lang.String, java.lang.String> r12 = r4.f287645B
            boolean r13 = r4.f287678y
            int r14 = r4.f287673t
            int r15 = r4.f287674u
            boolean r9 = r4.f287679z
            boolean r8 = r4.f287676w
            r33 = 0
            r23 = r5
            r24 = r6
            r25 = r7
            r26 = r11
            r27 = r12
            r28 = r13
            r29 = r14
            r30 = r15
            r31 = r9
            r32 = r8
            int r5 = r22.mo127026i(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            goto L_0x02d2
        L_0x02d1:
            r5 = -1
        L_0x02d2:
            java.lang.Object[] r6 = new java.lang.Object[r10]
            java.lang.String r7 = r4.field_fullpath
            if (r7 != 0) goto L_0x02da
            r14 = -1
            goto L_0x02de
        L_0x02da:
            int r14 = r7.length()
        L_0x02de:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r14)
            r6[r1] = r7
            java.lang.String r7 = r4.field_mediaId
            r6[r2] = r7
            java.lang.String r7 = r4.f287672s
            r8 = 2
            r6[r8] = r7
            java.lang.String r7 = r4.f287644A
            r8 = 3
            r6[r8] = r7
            java.lang.String r7 = "game package download tryStart recv file:%d field_mediaId[%s], download_url[%s] https url[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r7, r6)
            goto L_0x030b
        L_0x02f8:
            boolean r6 = r4.f287646C
            if (r6 == 0) goto L_0x031e
            boolean r5 = r4 instanceof p1081gi.C98122e
            if (r5 == 0) goto L_0x030e
            r5 = r4
            gi.e r5 = (p1081gi.C98122e) r5
            com.tencent.mm.modelcdntran.u r6 = com.tencent.p014mm.modelcdntran.C92779i0.Dx0()
            int r5 = r6.mo127043l(r5)
        L_0x030b:
            r14 = r5
            goto L_0x03eb
        L_0x030e:
            boolean r5 = r4 instanceof p1081gi.C98123f
            if (r5 == 0) goto L_0x03dd
            r5 = r4
            gi.f r5 = (p1081gi.C98123f) r5
            com.tencent.mm.modelcdntran.u r6 = com.tencent.p014mm.modelcdntran.C92779i0.Dx0()
            int r5 = r6.mo127044m(r5)
            goto L_0x030b
        L_0x031e:
            java.lang.Object[] r6 = new java.lang.Object[r7]
            java.lang.String r8 = r4.field_fullpath
            if (r8 != 0) goto L_0x0326
            r8 = -1
            goto L_0x032a
        L_0x0326:
            int r8 = r8.length()
        L_0x032a:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r6[r1] = r8
            java.lang.String r8 = r4.field_thumbpath
            if (r8 != 0) goto L_0x0336
            r8 = -1
            goto L_0x033a
        L_0x0336:
            int r8 = r8.length()
        L_0x033a:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r6[r2] = r8
            java.lang.String r8 = r4.field_svr_signature
            r9 = 2
            r6[r9] = r8
            java.lang.String r8 = r4.field_aesKey
            r9 = 3
            r6[r9] = r8
            int r8 = r4.field_fileType
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r6[r10] = r8
            java.lang.String r8 = r4.field_mediaId
            r9 = 5
            r6[r9] = r8
            boolean r8 = r4.field_onlycheckexist
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r6[r5] = r8
            java.lang.String r8 = "summersafecdn tryStart recv file:%d thumb:%d, field_svr_signature[%s], field_aesKey[%s], field_fileType[%d], field_mediaId[%s], onlycheckexist[%b]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r8, r6)
            int r6 = r4.f287654K
            r8 = 2
            if (r6 != r8) goto L_0x03e1
            boolean r6 = r4 instanceof p1081gi.C98127h
            if (r6 == 0) goto L_0x03dd
            r6 = r4
            gi.h r6 = (p1081gi.C98127h) r6
            boolean r9 = r6.mo137413a()
            if (r9 == 0) goto L_0x0380
            com.tencent.mm.modelcdntran.u r5 = com.tencent.p014mm.modelcdntran.C92779i0.Dx0()
            int r5 = r5.mo127048q(r4, r8)
            goto L_0x030b
        L_0x0380:
            boolean r8 = r6.mo137414b()
            if (r8 == 0) goto L_0x0394
            r6.f287657N = r2
            r6.f287696Y0 = r2
            com.tencent.mm.modelcdntran.u r5 = com.tencent.p014mm.modelcdntran.C92779i0.Dx0()
            int r5 = r5.mo127028k(r6)
            goto L_0x030b
        L_0x0394:
            int r8 = r6.f287655L
            r9 = 3
            if (r8 != r9) goto L_0x039b
            r9 = 1
            goto L_0x039c
        L_0x039b:
            r9 = 0
        L_0x039c:
            if (r9 == 0) goto L_0x03a8
            com.tencent.mm.modelcdntran.u r5 = com.tencent.p014mm.modelcdntran.C92779i0.Dx0()
            int r5 = r5.mo127027j(r6)
            goto L_0x030b
        L_0x03a8:
            if (r8 != r5) goto L_0x03ac
            r5 = 1
            goto L_0x03ad
        L_0x03ac:
            r5 = 0
        L_0x03ad:
            if (r5 == 0) goto L_0x03b9
            com.tencent.mm.modelcdntran.u r5 = com.tencent.p014mm.modelcdntran.C92779i0.Dx0()
            int r5 = r5.mo127045n(r6)
            goto L_0x030b
        L_0x03b9:
            if (r8 != r7) goto L_0x03bd
            r5 = 1
            goto L_0x03be
        L_0x03bd:
            r5 = 0
        L_0x03be:
            if (r5 == 0) goto L_0x03ca
            com.tencent.mm.modelcdntran.u r5 = com.tencent.p014mm.modelcdntran.C92779i0.Dx0()
            int r5 = r5.mo127027j(r6)
            goto L_0x030b
        L_0x03ca:
            if (r8 != r12) goto L_0x03ce
            r5 = 1
            goto L_0x03cf
        L_0x03ce:
            r5 = 0
        L_0x03cf:
            if (r5 == 0) goto L_0x03db
            com.tencent.mm.modelcdntran.u r5 = com.tencent.p014mm.modelcdntran.C92779i0.Dx0()
            int r5 = r5.mo127025h(r6)
            goto L_0x030b
        L_0x03db:
            r14 = -1
            goto L_0x03eb
        L_0x03dd:
            r8 = 2
            r13 = -1
            goto L_0x0453
        L_0x03e1:
            com.tencent.mm.modelcdntran.u r5 = com.tencent.p014mm.modelcdntran.C92779i0.Dx0()
            int r5 = r5.mo127049r(r4)
            goto L_0x030b
        L_0x03eb:
            r13 = r14
            r8 = 2
            goto L_0x0453
        L_0x03ee:
            java.lang.String r5 = r4.field_fullpath
            if (r5 == 0) goto L_0x0427
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0427
            com.tencent.mm.modelcdntran.u r22 = com.tencent.p014mm.modelcdntran.C92779i0.Dx0()
            java.lang.String r5 = r4.field_mediaId
            java.lang.String r6 = r4.f287672s
            java.lang.String r7 = r4.field_fullpath
            int r8 = r4.field_fileType
            int r9 = r4.f287673t
            int r11 = r4.f287674u
            r29 = 0
            boolean r12 = r4.f287675v
            r31 = 0
            r32 = 0
            boolean r13 = r4.f287652I
            r23 = r5
            r24 = r6
            r25 = r7
            r26 = r8
            r27 = r9
            r28 = r11
            r30 = r12
            r33 = r13
            int r5 = r22.mo127046o(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            goto L_0x0428
        L_0x0427:
            r5 = -1
        L_0x0428:
            java.lang.Object[] r6 = new java.lang.Object[r10]
            java.lang.String r7 = r4.field_fullpath
            if (r7 != 0) goto L_0x0430
            r14 = -1
            goto L_0x0434
        L_0x0430:
            int r14 = r7.length()
        L_0x0434:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r14)
            r6[r1] = r7
            java.lang.String r7 = r4.field_mediaId
            r6[r2] = r7
            java.lang.String r7 = r4.f287672s
            r8 = 2
            r6[r8] = r7
            int r7 = r4.field_fileType
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r9 = 3
            r6[r9] = r7
            java.lang.String r7 = "url download tryStart recv file:%d field_mediaId[%s], download_url[%s], filetype:[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r7, r6)
            r13 = r5
        L_0x0453:
            if (r13 == 0) goto L_0x0478
            java.lang.Object[] r5 = new java.lang.Object[r8]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r13)
            r5[r1] = r6
            java.lang.String r6 = r4.field_mediaId
            r5[r2] = r6
            java.lang.String r6 = "summersafecdn startupDownloadMedia error:%d clientid:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r6, r5)
            gi.g$a r11 = r4.f287662f
            if (r11 == 0) goto L_0x003e
            java.lang.String r12 = r4.field_mediaId
            r14 = 0
            r15 = 0
            boolean r4 = r4.field_onlycheckexist
            r16 = r4
            r11.mo1773g0(r12, r13, r14, r15, r16)
            goto L_0x003e
        L_0x0478:
            java.util.Map<java.lang.String, gi.g> r5 = r0.f266894r
            java.lang.String r6 = r4.field_mediaId
            java.util.concurrent.ConcurrentHashMap r5 = (java.util.concurrent.ConcurrentHashMap) r5
            java.lang.Object r5 = r5.put(r6, r4)
            gi.g r5 = (p1081gi.C98124g) r5
            java.util.Map<java.lang.String, gi.g> r6 = r0.f266894r
            java.lang.String r7 = r4.field_mediaId
            java.util.concurrent.ConcurrentHashMap r6 = (java.util.concurrent.ConcurrentHashMap) r6
            java.lang.Object r6 = r6.get(r7)
            gi.g r6 = (p1081gi.C98124g) r6
            if (r6 != 0) goto L_0x049f
            kj2.d r22 = kj2.C117407d.INSTANCE
            r23 = 594(0x252, double:2.935E-321)
            r25 = 6
            r27 = 1
            r29 = 1
            r22.idkeyStat(r23, r25, r27, r29)
        L_0x049f:
            r7 = 5
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.String r4 = r4.field_mediaId
            r7[r1] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
            r7[r2] = r4
            if (r5 != 0) goto L_0x04b0
            r4 = 0
            goto L_0x04b2
        L_0x04b0:
            java.lang.String r4 = r5.field_mediaId
        L_0x04b2:
            r5 = 2
            r7[r5] = r4
            if (r6 != 0) goto L_0x04ba
            r4 = 3
            r13 = 0
            goto L_0x04bd
        L_0x04ba:
            java.lang.String r13 = r6.field_mediaId
            r4 = 3
        L_0x04bd:
            r7[r4] = r13
            int r4 = r34.hashCode()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r7[r10] = r4
            java.lang.String r4 = "summersafecdn startupDownloadMedia ok, field_mediaId[%s] ret[%s, %s, %s] hash[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r7)
            goto L_0x003e
        L_0x04d1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelcdntran.CdnTransportService.mo126958p(boolean):void");
    }

    /* renamed from: q */
    public boolean mo126959q(int i) {
        Class cls = C10485b.class;
        if (!C86709a0.m107523b().mo121115m()) {
            return true;
        }
        int nullAs = Util.nullAs((Integer) C86709a0.m107535s().mo121142i().mo119684e(144385, (Object) null), 0);
        int b = ((C10485b) C86709a0.m107533q(cls)).vh0().mo107404b("CDNGrayscaleBitMask", 0);
        int b2 = ((C10485b) C86709a0.m107533q(cls)).vh0().mo107404b("CDNGrayscaleBitVal", 0);
        int i2 = (nullAs & (~b)) | (b2 & b);
        int i3 = i & i2;
        Log.m105919d("MicroMsg.CdnTransportService", "summersafecdn cdntra cdnBitSet:%d grayScaleFlag:%d res:%d Test.forceCDNTrans:%b, CDNGrayscaleBitMask:%d, CDNGrayscaleBitVal:%d", Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(i3), Boolean.valueOf(C90188n0.f258944l), Integer.valueOf(b), Integer.valueOf(b2));
        return C90188n0.f258944l || i3 > 0;
    }
}
