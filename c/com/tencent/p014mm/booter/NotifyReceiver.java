package com.tencent.p014mm.booter;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Looper;
import android.os.MessageQueue;
import androidx.camera.core.FocusMeteringAction;
import bp3.C79760s;
import com.tencent.mars.comm.WakerLock;
import com.tencent.mars.smc.IDKey;
import com.tencent.p014mm.booter.CoreService;
import com.tencent.p014mm.network.C114781l0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.service.C116024c;
import com.tencent.p014mm.service.MMService;
import com.tencent.p014mm.service.ProcessService$MMProcessService;
import com.tencent.xweb.XWebFeature;
import eb0.C31543z5;
import f40.C75681p0;
import f40.C86709a0;
import g40.C87134f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kj2.C117407d;
import ob0.C11385n;
import org.xwalk.core.XWalkEnvironment;
import sf0.C36667o0;
import yb0.C118950a;
import yb0.C118952c;
import zt3.C119157j;

/* renamed from: com.tencent.mm.booter.NotifyReceiver */
public class NotifyReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static WakerLock f237513a;

    /* renamed from: b */
    public static WakerLock f237514b;

    /* renamed from: c */
    public static Set<Long> f237515c = new HashSet();

    /* renamed from: d */
    public static Lock f237516d = new ReentrantLock(false);

    /* renamed from: e */
    public static byte[] f237517e = new byte[0];

    /* renamed from: f */
    public static byte[] f237518f = new byte[0];

    /* renamed from: g */
    public static C80803b f237519g;

    /* renamed from: h */
    public static boolean f237520h = true;

    /* renamed from: i */
    public static final long[] f237521i = {0, 1, 2, 4, 6, 8, 10, 20, 50, 100, 200, 500, 1000, 2000, 3000, 4000, FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION, 7000, 10000, 20000, 30000};

    /* renamed from: j */
    public static final int[] f237522j = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

    /* renamed from: k */
    public static final int[] f237523k = {30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50};

    /* renamed from: com.tencent.mm.booter.NotifyReceiver$a */
    public class C28859a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ArrayList f79252d;

        public C28859a(NotifyReceiver notifyReceiver, ArrayList arrayList) {
            this.f79252d = arrayList;
        }

        public void run() {
            try {
                IDKey iDKey = new IDKey();
                iDKey.SetID(XWebFeature.INTERFACE_SET_WEB_CONTENTS_SIZE);
                iDKey.SetKey(61);
                iDKey.SetValue(1);
                this.f79252d.add(iDKey);
                C117407d.INSTANCE.mo160124a(this.f79252d, false);
            } catch (Throwable th) {
                Log.printErrStackTrace("MicroMsg.NotifyReceiver", th, "", new Object[0]);
            }
        }
    }

    /* renamed from: com.tencent.mm.booter.NotifyReceiver$NotifyReceiverService */
    public static class NotifyReceiverService extends MMService {

        /* renamed from: com.tencent.mm.booter.NotifyReceiver$NotifyReceiverService$a */
        public class C80802a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ ArrayList f237524d;

            public C80802a(NotifyReceiverService notifyReceiverService, ArrayList arrayList) {
                this.f237524d = arrayList;
            }

            public void run() {
                IDKey iDKey = new IDKey();
                iDKey.SetID(XWebFeature.INTERFACE_SET_WEB_CONTENTS_SIZE);
                iDKey.SetKey(63);
                iDKey.SetValue(1);
                this.f237524d.add(iDKey);
                C117407d.INSTANCE.mo160124a(this.f237524d, false);
            }
        }

        /* renamed from: d */
        public void mo112546d() {
            super.mo112546d();
            Log.m105924i("MicroMsg.NotifyReceiverService", "onCreate()");
        }

        /* renamed from: e */
        public void mo112547e() {
            super.mo112547e();
        }

        /* renamed from: g */
        public int mo93615g(Intent intent, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            NotifyReceiver.m98643a(MMApplicationContext.getContext(), intent, false, arrayList);
            ((C119157j) C119157j.f356862d).mo183876g(new C80802a(this, arrayList), "MicroMsg.NotifyReceiverService");
            Log.m105924i("MicroMsg.NotifyReceiverService", "onStartCommand()");
            return 1;
        }
    }

    /* renamed from: com.tencent.mm.booter.NotifyReceiver$NotifyService */
    public static class NotifyService extends MMService {

        /* renamed from: i */
        public Boolean f237525i = null;

        /* renamed from: j */
        public C87134f f237526j;

        /* renamed from: b */
        public String mo63928b() {
            return "MicroMsg.NotifyReceiver";
        }

        /* renamed from: c */
        public IBinder mo93614c(Intent intent) {
            return null;
        }

        /* renamed from: f */
        public void mo112549f(Intent intent, int i) {
            mo112551k(intent);
        }

        /* renamed from: g */
        public int mo93615g(Intent intent, int i, int i2) {
            Log.m105924i("MicroMsg.NotifyReceiver", "NotifyService onStartCommand flags :" + i + "startId :" + i2 + " intent " + intent);
            mo112551k(intent);
            return 2;
        }

        /* JADX WARNING: Unknown top exception splitter block from list: {B:63:0x01f2=Splitter:B:63:0x01f2, B:110:0x0322=Splitter:B:110:0x0322, B:47:0x0183=Splitter:B:47:0x0183} */
        /* renamed from: j */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo112550j(android.content.Intent r18) {
            /*
                r17 = this;
                r8 = r17
                r0 = r18
                java.lang.Class<lc3.c> r1 = lc3.C117474c.class
                java.lang.String r2 = "notify_option_type"
                r3 = 0
                int r2 = r0.getIntExtra(r2, r3)
                java.lang.String r4 = "MicroMsg.NotifyReceiver"
                if (r2 != 0) goto L_0x0018
                java.lang.String r0 = "receiveImp invalid opcode."
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
                return
            L_0x0018:
                boolean r5 = f40.C86709a0.m107522a()
                r7 = 2
                r9 = 1
                if (r5 == 0) goto L_0x053c
                boolean r5 = f40.C86718e.m107551r()
                if (r5 == 0) goto L_0x0028
                goto L_0x053c
            L_0x0028:
                ob0.b0 r5 = f40.C86709a0.m107524d()
                com.tencent.mm.network.g r5 = r5.f256809d
                if (r5 != 0) goto L_0x0045
                java.lang.Object[] r5 = new java.lang.Object[r9]
                java.lang.Integer r10 = java.lang.Integer.valueOf(r2)
                r5[r3] = r10
                java.lang.String r10 = "receiveImp  opcode:%d  getDispatcher == null"
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r10, r5)
                ob0.b0 r5 = f40.C86709a0.m107524d()
                r5.mo123474t(r9)
            L_0x0045:
                java.lang.Boolean r5 = r8.f237525i
                if (r5 != 0) goto L_0x0086
                boolean r5 = com.tencent.p014mm.sdk.crash.CrashReportFactory.hasDebuger()
                if (r5 == 0) goto L_0x0054
                java.lang.Boolean r5 = java.lang.Boolean.FALSE
                r8.f237525i = r5
                goto L_0x0086
            L_0x0054:
                java.lang.Class<lc3.b> r5 = lc3.C10485b.class
                k40.a r5 = f40.C86709a0.m107533q(r5)
                lc3.b r5 = (lc3.C10485b) r5
                pj.f r5 = r5.vh0()
                java.lang.String r10 = "AndroidOldNotifyReceiver"
                java.lang.String r5 = r5.mo107405c(r10)
                int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r3)
                f40.C86709a0.m107528h()
                f40.e r10 = f40.C86709a0.m107523b()
                int r10 = r10.mo121110g()
                r11 = 100
                int r10 = p823sg.C101615j.m133462b(r10, r11)
                if (r5 <= r10) goto L_0x007f
                r5 = 1
                goto L_0x0080
            L_0x007f:
                r5 = 0
            L_0x0080:
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                r8.f237525i = r5
            L_0x0086:
                java.lang.Object[] r5 = new java.lang.Object[r7]
                java.lang.Boolean r10 = r8.f237525i
                r5[r3] = r10
                java.lang.Integer r10 = java.lang.Integer.valueOf(r2)
                r5[r9] = r10
                java.lang.String r10 = "handleCommand useOld:%s operationCode:%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r10, r5)
                if (r2 == r9) goto L_0x04bf
                if (r2 == r7) goto L_0x00b1
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "invald opCode:"
                r0.append(r1)
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
                goto L_0x053b
            L_0x00b1:
                java.lang.Boolean r2 = r8.f237525i
                boolean r2 = r2.booleanValue()
                java.lang.String r5 = "oreh on newsynccheck2 notify, notify="
                java.lang.String r11 = "dkpush dealWithNotify respBuf error "
                java.lang.String r10 = "dealWithNotify respType:%d recvTime:%d respBuf:%d sessionkey:%s "
                r14 = -1
                java.lang.String r13 = "notfiy_recv_time"
                java.lang.String r6 = "notify_skey"
                java.lang.String r7 = "notify_respBuf"
                java.lang.String r9 = "notify_respType"
                r16 = -1
                if (r2 == 0) goto L_0x0342
                android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                java.lang.String r12 = "NotifyReceiver.handleCommand:NOTIFY_OPCODE_NOTIFY"
                r8.mo112553m(r2, r12)
                int r9 = r0.getIntExtra(r9, r3)
                byte[] r7 = r0.getByteArrayExtra(r7)
                byte[] r6 = r0.getByteArrayExtra(r6)
                long r12 = r0.getLongExtra(r13, r14)
                r0 = 4
                java.lang.Object[] r2 = new java.lang.Object[r0]
                java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
                r2[r3] = r0
                java.lang.Long r0 = java.lang.Long.valueOf(r12)
                r14 = 1
                r2[r14] = r0
                if (r7 != 0) goto L_0x00f9
                r0 = -1
                goto L_0x00fa
            L_0x00f9:
                int r0 = r7.length
            L_0x00fa:
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r14 = 2
                r2[r14] = r0
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.encodeHexString(r6)
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.secPrint(r0)
                r14 = 3
                r2[r14] = r0
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r10, r2)
                p285zh.C119114c.m167925j(r9)
                r0 = 39
                if (r9 == r0) goto L_0x0334
                java.lang.String r0 = "add scene hash to memo, hash:%d"
                java.lang.String r2 = ""
                r10 = 138(0x8a, float:1.93E-43)
                if (r9 == r10) goto L_0x02ba
                r10 = 268369921(0xfff0001, float:2.5144943E-29)
                if (r9 == r10) goto L_0x020d
                r10 = 1000000205(0x3b9acacd, float:0.004723883)
                if (r9 == r10) goto L_0x0195
                r5 = 2147480001(0x7ffff1c1, float:NaN)
                if (r9 == r5) goto L_0x0142
                zt3.t r0 = zt3.C119157j.f356862d
                com.tencent.mm.booter.NotifyReceiver$NotifyService$$e r10 = new com.tencent.mm.booter.NotifyReceiver$NotifyService$$e
                r1 = r10
                r2 = r17
                r3 = r9
                r4 = r7
                r5 = r6
                r6 = r12
                r1.<init>(r2, r3, r4, r5, r6)
                zt3.j r0 = (zt3.C119157j) r0
                r0.mo183895z(r10)
                goto L_0x053b
            L_0x0142:
                java.lang.String r5 = "dkpush FCM Notify"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r5)
                di3.d r1 = di3.C86312j.m106911c(r1)
                lc3.c r1 = (lc3.C117474c) r1
                pc0.e0 r1 = r1.yn0()
                r5 = 7
                r7 = 16
                int r1 = r1.mo182762f(r5, r7, r2)
                java.util.concurrent.locks.Lock r2 = com.tencent.p014mm.booter.NotifyReceiver.f237516d     // Catch:{ all -> 0x018c }
                java.util.concurrent.locks.ReentrantLock r2 = (java.util.concurrent.locks.ReentrantLock) r2     // Catch:{ all -> 0x018c }
                r2.lock()     // Catch:{ all -> 0x018c }
                if (r1 <= 0) goto L_0x0183
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x018c }
                java.lang.Integer r5 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x018c }
                r2[r3] = r5     // Catch:{ all -> 0x018c }
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r0, r2)     // Catch:{ all -> 0x018c }
                java.util.Set<java.lang.Long> r0 = com.tencent.p014mm.booter.NotifyReceiver.f237515c     // Catch:{ all -> 0x018c }
                long r1 = (long) r1     // Catch:{ all -> 0x018c }
                java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x018c }
                java.util.HashSet r0 = (java.util.HashSet) r0     // Catch:{ all -> 0x018c }
                r0.add(r1)     // Catch:{ all -> 0x018c }
                android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x018c }
                java.lang.String r1 = "NotifyReceiver.dealWithNotify:MM_PKT_FCM_NOTIFY"
                r8.mo112554n(r0, r1)     // Catch:{ all -> 0x018c }
            L_0x0183:
                java.util.concurrent.locks.Lock r0 = com.tencent.p014mm.booter.NotifyReceiver.f237516d     // Catch:{ Exception -> 0x053b }
                java.util.concurrent.locks.ReentrantLock r0 = (java.util.concurrent.locks.ReentrantLock) r0     // Catch:{ Exception -> 0x053b }
                r0.unlock()     // Catch:{ Exception -> 0x053b }
                goto L_0x053b
            L_0x018c:
                r0 = move-exception
                java.util.concurrent.locks.Lock r1 = com.tencent.p014mm.booter.NotifyReceiver.f237516d     // Catch:{ Exception -> 0x0194 }
                java.util.concurrent.locks.ReentrantLock r1 = (java.util.concurrent.locks.ReentrantLock) r1     // Catch:{ Exception -> 0x0194 }
                r1.unlock()     // Catch:{ Exception -> 0x0194 }
            L_0x0194:
                throw r0
            L_0x0195:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r5)
                if (r7 == 0) goto L_0x01a1
                r5 = 1
                goto L_0x01a2
            L_0x01a1:
                r5 = 0
            L_0x01a2:
                r6.append(r5)
                java.lang.String r5 = r6.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r5)
                qe3.z0 r5 = new qe3.z0
                r5.<init>()
                r5.fromProtoBuf(r7)     // Catch:{ Exception -> 0x01f7 }
                java.util.concurrent.locks.Lock r6 = com.tencent.p014mm.booter.NotifyReceiver.f237516d     // Catch:{ Exception -> 0x01f7 }
                java.util.concurrent.locks.ReentrantLock r6 = (java.util.concurrent.locks.ReentrantLock) r6     // Catch:{ Exception -> 0x01f7 }
                r6.lock()     // Catch:{ Exception -> 0x01f7 }
                di3.d r1 = di3.C86312j.m106911c(r1)     // Catch:{ Exception -> 0x01f7 }
                lc3.c r1 = (lc3.C117474c) r1     // Catch:{ Exception -> 0x01f7 }
                pc0.e0 r1 = r1.yn0()     // Catch:{ Exception -> 0x01f7 }
                long r6 = r5.f257866a     // Catch:{ Exception -> 0x01f7 }
                java.lang.String r5 = r5.mo123971a()     // Catch:{ Exception -> 0x01f7 }
                r9 = 1
                int r1 = r1.mo182762f(r6, r9, r5)     // Catch:{ Exception -> 0x01f7 }
                if (r1 <= 0) goto L_0x01f2
                java.lang.Object[] r5 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x01f7 }
                java.lang.Integer r6 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x01f7 }
                r5[r3] = r6     // Catch:{ Exception -> 0x01f7 }
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r0, r5)     // Catch:{ Exception -> 0x01f7 }
                java.util.Set<java.lang.Long> r0 = com.tencent.p014mm.booter.NotifyReceiver.f237515c     // Catch:{ Exception -> 0x01f7 }
                long r5 = (long) r1     // Catch:{ Exception -> 0x01f7 }
                java.lang.Long r1 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x01f7 }
                java.util.HashSet r0 = (java.util.HashSet) r0     // Catch:{ Exception -> 0x01f7 }
                r0.add(r1)     // Catch:{ Exception -> 0x01f7 }
                android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x01f7 }
                java.lang.String r1 = "NotifyReceiver.dealWithNotify:MM_PKT_NEW_SYNC_CHECK2_RESP"
                r8.mo112554n(r0, r1)     // Catch:{ Exception -> 0x01f7 }
            L_0x01f2:
                java.util.concurrent.locks.Lock r0 = com.tencent.p014mm.booter.NotifyReceiver.f237516d     // Catch:{ Exception -> 0x053b }
                goto L_0x01fe
            L_0x01f5:
                r0 = move-exception
                goto L_0x0205
            L_0x01f7:
                r0 = move-exception
                java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch:{ all -> 0x01f5 }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r2, r1)     // Catch:{ all -> 0x01f5 }
                goto L_0x01f2
            L_0x01fe:
                java.util.concurrent.locks.ReentrantLock r0 = (java.util.concurrent.locks.ReentrantLock) r0     // Catch:{ Exception -> 0x053b }
                r0.unlock()     // Catch:{ Exception -> 0x053b }
                goto L_0x053b
            L_0x0205:
                java.util.concurrent.locks.Lock r1 = com.tencent.p014mm.booter.NotifyReceiver.f237516d     // Catch:{ Exception -> 0x020c }
                java.util.concurrent.locks.ReentrantLock r1 = (java.util.concurrent.locks.ReentrantLock) r1     // Catch:{ Exception -> 0x020c }
                r1.unlock()     // Catch:{ Exception -> 0x020c }
            L_0x020c:
                throw r0
            L_0x020d:
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r6)
                if (r0 == 0) goto L_0x0229
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "dkpush dealWithNotify session:"
                r0.append(r1)
                r0.append(r6)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
                goto L_0x053b
            L_0x0229:
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r7)
                if (r0 != 0) goto L_0x02b5
                int r0 = r7.length
                r1 = 8
                if (r0 > r1) goto L_0x0236
                goto L_0x02b5
            L_0x0236:
                int r0 = p823sg.C90196p.m112885b(r7, r3)
                r2 = 4
                int r5 = p823sg.C90196p.m112885b(r7, r2)
                int r2 = r7.length
                int r2 = r2 - r1
                if (r5 == r2) goto L_0x025a
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "dkpush: respBuf length error len:"
                r0.append(r1)
                int r1 = r7.length
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
                goto L_0x053b
            L_0x025a:
                byte[] r1 = new byte[r5]
                r2 = 8
                java.lang.System.arraycopy(r7, r2, r1, r3, r5)
                r2 = 4
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
                r2[r3] = r9
                java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
                r5 = 1
                r2[r5] = r3
                int r3 = r7.length
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r5 = 2
                r2[r5] = r3
                java.lang.Long r3 = java.lang.Long.valueOf(r12)
                r5 = 3
                r2[r5] = r3
                java.lang.String r3 = "dkpush PUSHDATA flag:%d bufLen:%d respBuf:%d recvTime:%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r3, r2)
                java.util.concurrent.locks.Lock r2 = com.tencent.p014mm.booter.NotifyReceiver.f237516d     // Catch:{ all -> 0x02ac }
                java.util.concurrent.locks.ReentrantLock r2 = (java.util.concurrent.locks.ReentrantLock) r2     // Catch:{ all -> 0x02ac }
                r2.lock()     // Catch:{ all -> 0x02ac }
                pc0.C100769w.m131942a(r0, r1, r6, r12)     // Catch:{ all -> 0x02ac }
                java.util.Set<java.lang.Long> r0 = com.tencent.p014mm.booter.NotifyReceiver.f237515c     // Catch:{ all -> 0x02ac }
                java.lang.Long r1 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x02ac }
                java.util.HashSet r0 = (java.util.HashSet) r0     // Catch:{ all -> 0x02ac }
                r0.add(r1)     // Catch:{ all -> 0x02ac }
                android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x02ac }
                java.lang.String r1 = "NotifyReceiver.NotifyData"
                r8.mo112554n(r0, r1)     // Catch:{ all -> 0x02ac }
                java.util.concurrent.locks.Lock r0 = com.tencent.p014mm.booter.NotifyReceiver.f237516d     // Catch:{ Exception -> 0x053b }
                java.util.concurrent.locks.ReentrantLock r0 = (java.util.concurrent.locks.ReentrantLock) r0     // Catch:{ Exception -> 0x053b }
                r0.unlock()     // Catch:{ Exception -> 0x053b }
                goto L_0x053b
            L_0x02ac:
                r0 = move-exception
                java.util.concurrent.locks.Lock r1 = com.tencent.p014mm.booter.NotifyReceiver.f237516d     // Catch:{ Exception -> 0x02b4 }
                java.util.concurrent.locks.ReentrantLock r1 = (java.util.concurrent.locks.ReentrantLock) r1     // Catch:{ Exception -> 0x02b4 }
                r1.unlock()     // Catch:{ Exception -> 0x02b4 }
            L_0x02b4:
                throw r0
            L_0x02b5:
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r11)
                goto L_0x053b
            L_0x02ba:
                if (r7 != 0) goto L_0x02be
                r13 = 7
                goto L_0x02c2
            L_0x02be:
                int r13 = p823sg.C90196p.m112885b(r7, r3)
            L_0x02c2:
                if (r7 != 0) goto L_0x02c6
                r5 = 2
                goto L_0x02c7
            L_0x02c6:
                r5 = 1
            L_0x02c7:
                r6 = 3
                java.lang.Object[] r6 = new java.lang.Object[r6]
                java.lang.Integer r9 = java.lang.Integer.valueOf(r13)
                r6[r3] = r9
                java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
                r10 = 1
                r6[r10] = r9
                if (r7 != 0) goto L_0x02da
                goto L_0x02dd
            L_0x02da:
                int r7 = r7.length
                r16 = r7
            L_0x02dd:
                java.lang.Integer r7 = java.lang.Integer.valueOf(r16)
                r9 = 2
                r6[r9] = r7
                java.lang.String r7 = "dkpush NOTIFY or SyncCheck selector:%d scnen:%d  respBuf:%d "
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r7, r6)
                java.util.concurrent.locks.Lock r6 = com.tencent.p014mm.booter.NotifyReceiver.f237516d     // Catch:{ all -> 0x032b }
                java.util.concurrent.locks.ReentrantLock r6 = (java.util.concurrent.locks.ReentrantLock) r6     // Catch:{ all -> 0x032b }
                r6.lock()     // Catch:{ all -> 0x032b }
                di3.d r1 = di3.C86312j.m106911c(r1)     // Catch:{ all -> 0x032b }
                lc3.c r1 = (lc3.C117474c) r1     // Catch:{ all -> 0x032b }
                pc0.e0 r1 = r1.yn0()     // Catch:{ all -> 0x032b }
                long r6 = (long) r13     // Catch:{ all -> 0x032b }
                int r1 = r1.mo182762f(r6, r5, r2)     // Catch:{ all -> 0x032b }
                if (r1 <= 0) goto L_0x0322
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x032b }
                java.lang.Integer r5 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x032b }
                r2[r3] = r5     // Catch:{ all -> 0x032b }
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r0, r2)     // Catch:{ all -> 0x032b }
                java.util.Set<java.lang.Long> r0 = com.tencent.p014mm.booter.NotifyReceiver.f237515c     // Catch:{ all -> 0x032b }
                long r1 = (long) r1     // Catch:{ all -> 0x032b }
                java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x032b }
                java.util.HashSet r0 = (java.util.HashSet) r0     // Catch:{ all -> 0x032b }
                r0.add(r1)     // Catch:{ all -> 0x032b }
                android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x032b }
                java.lang.String r1 = "NotifyReceiver.dealWithNotify:MMFunc_NewSync"
                r8.mo112554n(r0, r1)     // Catch:{ all -> 0x032b }
            L_0x0322:
                java.util.concurrent.locks.Lock r0 = com.tencent.p014mm.booter.NotifyReceiver.f237516d     // Catch:{ Exception -> 0x053b }
                java.util.concurrent.locks.ReentrantLock r0 = (java.util.concurrent.locks.ReentrantLock) r0     // Catch:{ Exception -> 0x053b }
                r0.unlock()     // Catch:{ Exception -> 0x053b }
                goto L_0x053b
            L_0x032b:
                r0 = move-exception
                java.util.concurrent.locks.Lock r1 = com.tencent.p014mm.booter.NotifyReceiver.f237516d     // Catch:{ Exception -> 0x0333 }
                java.util.concurrent.locks.ReentrantLock r1 = (java.util.concurrent.locks.ReentrantLock) r1     // Catch:{ Exception -> 0x0333 }
                r1.unlock()     // Catch:{ Exception -> 0x0333 }
            L_0x0333:
                throw r0
            L_0x0334:
                ob0.b0 r0 = f40.C86709a0.m107524d()
                pc0.s r1 = new pc0.s
                r1.<init>()
                r0.mo123460f(r1)
                goto L_0x053b
            L_0x0342:
                int r9 = r0.getIntExtra(r9, r3)
                byte[] r7 = r0.getByteArrayExtra(r7)
                byte[] r6 = r0.getByteArrayExtra(r6)
                long r12 = r0.getLongExtra(r13, r14)
                r0 = 4
                java.lang.Object[] r1 = new java.lang.Object[r0]
                java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
                r1[r3] = r0
                java.lang.Long r0 = java.lang.Long.valueOf(r12)
                r2 = 1
                r1[r2] = r0
                if (r7 != 0) goto L_0x0366
                r0 = -1
                goto L_0x0367
            L_0x0366:
                int r0 = r7.length
            L_0x0367:
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r2 = 2
                r1[r2] = r0
                if (r6 != 0) goto L_0x0372
                r0 = -1
                goto L_0x0373
            L_0x0372:
                int r0 = r6.length
            L_0x0373:
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r2 = 3
                r1[r2] = r0
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r10, r1)
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r6)
                if (r0 == 0) goto L_0x03a5
                r0 = 3941(0xf65, float:5.523E-42)
                if (r9 == r0) goto L_0x03a5
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "dkpush dealWithNotify session null and ret sessionKey:"
                r0.append(r1)
                r0.append(r6)
                java.lang.String r1 = " respType:"
                r0.append(r1)
                r0.append(r9)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
                goto L_0x053b
            L_0x03a5:
                p285zh.C119114c.m167925j(r9)
                r0 = 39
                if (r9 == r0) goto L_0x04b1
                r0 = 138(0x8a, float:1.93E-43)
                if (r9 == r0) goto L_0x0474
                r0 = 268369921(0xfff0001, float:2.5144943E-29)
                if (r9 == r0) goto L_0x040f
                r0 = 1000000205(0x3b9acacd, float:0.004723883)
                if (r9 == r0) goto L_0x03e7
                r0 = 2147480001(0x7ffff1c1, float:NaN)
                if (r9 == r0) goto L_0x03d4
                zt3.t r0 = zt3.C119157j.f356862d
                com.tencent.mm.booter.NotifyReceiver$NotifyService$$d r10 = new com.tencent.mm.booter.NotifyReceiver$NotifyService$$d
                r1 = r10
                r2 = r17
                r3 = r9
                r4 = r7
                r5 = r6
                r6 = r12
                r1.<init>(r2, r3, r4, r5, r6)
                zt3.j r0 = (zt3.C119157j) r0
                r0.mo183895z(r10)
                goto L_0x053b
            L_0x03d4:
                java.lang.String r0 = "dkpush FCM Notify"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
                zt3.t r0 = zt3.C119157j.f356862d
                com.tencent.mm.booter.NotifyReceiver$NotifyService$$b r1 = new com.tencent.mm.booter.NotifyReceiver$NotifyService$$b
                r1.<init>()
                zt3.j r0 = (zt3.C119157j) r0
                r0.mo183867A(r1)
                goto L_0x053b
            L_0x03e7:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r5)
                if (r7 == 0) goto L_0x03f2
                r3 = 1
            L_0x03f2:
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
                qe3.z0 r0 = new qe3.z0
                r0.<init>()
                zt3.t r1 = zt3.C119157j.f356862d
                com.tencent.mm.booter.NotifyReceiver$NotifyService$$c r2 = new com.tencent.mm.booter.NotifyReceiver$NotifyService$$c
                r2.<init>(r0)
                zt3.j r1 = (zt3.C119157j) r1
                r1.mo183867A(r2)
                goto L_0x053b
            L_0x040f:
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r7)
                if (r0 != 0) goto L_0x046f
                int r0 = r7.length
                r1 = 8
                if (r0 > r1) goto L_0x041b
                goto L_0x046f
            L_0x041b:
                int r0 = p823sg.C90196p.m112885b(r7, r3)
                r2 = 4
                int r5 = p823sg.C90196p.m112885b(r7, r2)
                int r2 = r7.length
                int r2 = r2 - r1
                if (r5 == r2) goto L_0x043f
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "dkpush: respBuf length error len:"
                r0.append(r1)
                int r1 = r7.length
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
                goto L_0x053b
            L_0x043f:
                byte[] r1 = new byte[r5]
                r2 = 8
                java.lang.System.arraycopy(r7, r2, r1, r3, r5)
                r2 = 4
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
                r2[r3] = r9
                java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
                r5 = 1
                r2[r5] = r3
                int r3 = r7.length
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r5 = 2
                r2[r5] = r3
                java.lang.Long r3 = java.lang.Long.valueOf(r12)
                r5 = 3
                r2[r5] = r3
                java.lang.String r3 = "dkpush PUSHDATA flag:%d bufLen:%d respBuf:%d recvTime:%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r3, r2)
                pc0.C100769w.m131942a(r0, r1, r6, r12)
                goto L_0x053b
            L_0x046f:
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r11)
                goto L_0x053b
            L_0x0474:
                if (r7 != 0) goto L_0x0478
                r13 = 7
                goto L_0x047c
            L_0x0478:
                int r13 = p823sg.C90196p.m112885b(r7, r3)
            L_0x047c:
                if (r7 != 0) goto L_0x0480
                r0 = 2
                goto L_0x0481
            L_0x0480:
                r0 = 1
            L_0x0481:
                r1 = 3
                java.lang.Object[] r1 = new java.lang.Object[r1]
                java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
                r1[r3] = r2
                java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
                r3 = 1
                r1[r3] = r2
                if (r7 != 0) goto L_0x0494
                goto L_0x0497
            L_0x0494:
                int r2 = r7.length
                r16 = r2
            L_0x0497:
                java.lang.Integer r2 = java.lang.Integer.valueOf(r16)
                r3 = 2
                r1[r3] = r2
                java.lang.String r2 = "dkpush NOTIFY or SyncCheck selector:%d scnen:%d  respBuf:%d "
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r2, r1)
                zt3.t r1 = zt3.C119157j.f356862d
                com.tencent.mm.booter.NotifyReceiver$NotifyService$$a r2 = new com.tencent.mm.booter.NotifyReceiver$NotifyService$$a
                r2.<init>(r13, r0)
                zt3.j r1 = (zt3.C119157j) r1
                r1.mo183867A(r2)
                goto L_0x053b
            L_0x04b1:
                ob0.b0 r0 = f40.C86709a0.m107524d()
                pc0.s r1 = new pc0.s
                r1.<init>()
                r0.mo123460f(r1)
                goto L_0x053b
            L_0x04bf:
                java.lang.Boolean r0 = r8.f237525i
                boolean r0 = r0.booleanValue()
                if (r0 == 0) goto L_0x04d0
                android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                java.lang.String r2 = "NotifyReceiver.handleCommand:NOTIFY_OPCODE_NETWORK_AVAILABLE"
                r8.mo112553m(r0, r2)
            L_0x04d0:
                android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                java.lang.String r2 = "dealWithLooper"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
                boolean r2 = f40.C86709a0.m107522a()
                if (r2 == 0) goto L_0x0516
                boolean r2 = f40.C86718e.m107551r()
                if (r2 == 0) goto L_0x04e6
                goto L_0x0516
            L_0x04e6:
                ob0.b0 r2 = f40.C86709a0.m107524d()
                boolean r2 = r2.f256815j
                if (r2 != 0) goto L_0x0507
                if (r0 == 0) goto L_0x04f7
                boolean r0 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isWap((android.content.Context) r0)
                if (r0 != 0) goto L_0x04f7
                r3 = 1
            L_0x04f7:
                if (r3 != 0) goto L_0x04fa
                goto L_0x0507
            L_0x04fa:
                ob0.b0 r0 = f40.C86709a0.m107524d()
                pc0.s r1 = new pc0.s
                r1.<init>()
                r0.mo123460f(r1)
                goto L_0x053b
            L_0x0507:
                di3.d r0 = di3.C86312j.m106911c(r1)
                lc3.c r0 = (lc3.C117474c) r0
                pc0.e0 r0 = r0.yn0()
                r1 = 2
                r0.mo182766j(r1)
                goto L_0x053b
            L_0x0516:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "receiveImp hasSetuin:"
                r0.append(r1)
                boolean r1 = f40.C86709a0.m107522a()
                r0.append(r1)
                java.lang.String r1 = " isHold:"
                r0.append(r1)
                boolean r1 = f40.C86718e.m107551r()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r0)
            L_0x053b:
                return
            L_0x053c:
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]
                boolean r1 = f40.C86709a0.m107522a()
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                r0[r3] = r1
                boolean r1 = f40.C86718e.m107551r()
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                r3 = 1
                r0[r3] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
                r2 = 2
                r0[r2] = r1
                java.lang.String r1 = "receiveImp hasSetuin:%b  isHold:%b  opcode:%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r1, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.booter.NotifyReceiver.NotifyService.mo112550j(android.content.Intent):void");
        }

        /* renamed from: k */
        public final void mo112551k(Intent intent) {
            int i;
            if (intent == null) {
                Log.m105920e("MicroMsg.NotifyReceiver", "receiveImp receiveIntent == null");
                return;
            }
            if (!C86709a0.m107528h().f251724a.f251792d) {
                Log.m105921e("MicroMsg.NotifyReceiver", "summerboot WorkerProfile not has create, status %d", 0);
                i = -1;
                if (this.f237526j != null) {
                    C86709a0.m107528h().mo121101p(this.f237526j);
                }
                this.f237526j = new NotifyReceiver$NotifyService$$f(this, System.currentTimeMillis(), intent);
                C86709a0.m107528h().mo121097c(this.f237526j);
                C117407d.INSTANCE.idkeyStat(99, 213, 1, false);
            } else {
                i = 0;
            }
            if (i < 0) {
                Log.m105921e("MicroMsg.NotifyReceiver", "summerboot status %s", Integer.valueOf(i));
                return;
            }
            mo112550j(intent);
        }

        /* JADX WARNING: CFG modification limit reached, blocks count: 115 */
        /* renamed from: l */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo112552l(long r5, java.lang.String r7) {
            /*
                r4 = this;
                byte[] r0 = com.tencent.p014mm.booter.NotifyReceiver.f237517e
                monitor-enter(r0)
                com.tencent.mars.comm.WakerLock r1 = com.tencent.p014mm.booter.NotifyReceiver.f237513a     // Catch:{ all -> 0x001d }
                if (r1 != 0) goto L_0x0014
                com.tencent.mars.comm.WakerLock r1 = new com.tencent.mars.comm.WakerLock     // Catch:{ all -> 0x001d }
                android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x001d }
                java.lang.String r3 = "MicroMsg.NotifyReceiver"
                r1.<init>(r2, r3)     // Catch:{ all -> 0x001d }
                com.tencent.p014mm.booter.NotifyReceiver.f237513a = r1     // Catch:{ all -> 0x001d }
            L_0x0014:
                monitor-exit(r0)     // Catch:{ all -> 0x001d }
                com.tencent.mars.comm.WakerLock r0 = com.tencent.p014mm.booter.NotifyReceiver.f237513a
                r0.lock(r5, r7)
                return
            L_0x001b:
                monitor-exit(r0)     // Catch:{ all -> 0x001d }
                throw r5
            L_0x001d:
                r5 = move-exception
                goto L_0x001b
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.booter.NotifyReceiver.NotifyService.mo112552l(long, java.lang.String):void");
        }

        /* renamed from: m */
        public void mo112553m(Context context, String str) {
            synchronized (NotifyReceiver.f237517e) {
                if (NotifyReceiver.f237513a == null) {
                    NotifyReceiver.f237513a = new WakerLock(context, "MicroMsg.NotifyReceiver");
                }
                NotifyReceiver.f237513a.lock(14000, str);
            }
        }

        /* renamed from: n */
        public void mo112554n(Context context, String str) {
            synchronized (NotifyReceiver.f237518f) {
                if (NotifyReceiver.f237514b == null) {
                    NotifyReceiver.f237514b = new WakerLock(context, "MicroMsg.NotifyReceiver");
                }
                NotifyReceiver.f237514b.lock(60000, str);
            }
        }
    }

    /* renamed from: com.tencent.mm.booter.NotifyReceiver$b */
    public static class C80803b implements C11385n {

        /* renamed from: d */
        public static long f237527d;

        /* renamed from: com.tencent.mm.booter.NotifyReceiver$b$a */
        public class C28860a implements MessageQueue.IdleHandler {
            public C28860a() {
            }

            public boolean queueIdle() {
                C80803b bVar = C80803b.this;
                bVar.getClass();
                C86709a0.m107528h();
                C86709a0.m107525e().postToWorker(new C28869l(bVar));
                return false;
            }
        }

        /* renamed from: com.tencent.mm.booter.NotifyReceiver$b$b */
        public class C80804b implements Runnable {
            public C80804b(C80803b bVar) {
            }

            /* JADX WARNING: CFG modification limit reached, blocks count: 121 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r13 = this;
                    java.lang.String r0 = "MicroMsg.NotifyReceiver"
                    java.lang.String r1 = "checkKillProcess, canKillProcess :%b"
                    r2 = 1
                    java.lang.Object[] r2 = new java.lang.Object[r2]
                    boolean r3 = com.tencent.p014mm.booter.NotifyReceiver.f237520h
                    java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
                    r4 = 0
                    r2[r4] = r3
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r2)
                    byte[] r0 = com.tencent.p014mm.booter.NotifyReceiver.f237517e
                    monitor-enter(r0)
                    com.tencent.mars.comm.WakerLock r1 = com.tencent.p014mm.booter.NotifyReceiver.f237513a     // Catch:{ all -> 0x0091 }
                    if (r1 == 0) goto L_0x001d
                    r1.unLock()     // Catch:{ all -> 0x0091 }
                L_0x001d:
                    r1 = 0
                    com.tencent.p014mm.booter.NotifyReceiver.f237513a = r1     // Catch:{ all -> 0x0091 }
                    monitor-exit(r0)     // Catch:{ all -> 0x0091 }
                    boolean r0 = com.tencent.p014mm.booter.NotifyReceiver.f237520h
                    if (r0 == 0) goto L_0x008e
                    java.lang.Class<jc3.i> r0 = jc3.C87948i.class
                    di3.d r0 = di3.C86312j.m106911c(r0)
                    jc3.i r0 = (jc3.C87948i) r0
                    jc3.d r2 = r0.mo119068rS()
                    if (r2 == 0) goto L_0x0042
                    jc3.d r0 = r0.mo119068rS()
                    fw0.o r0 = (fw0.C87105o) r0
                    r0.getClass()
                    com.tencent.mm.booter.notification.k r0 = com.tencent.p014mm.booter.notification.C67845k.C67847b.f194757a
                    r2 = -1
                    r0.mo93234b(r2, r1)
                L_0x0042:
                    com.tencent.p014mm.sdk.platformtools.Log.appenderFlushSync()
                    int r0 = android.os.Process.myPid()
                    k20.a r1 = new k20.a
                    r1.<init>()
                    java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    r1.mo10233c(r0)
                    java.lang.Object r0 = new java.lang.Object
                    r0.<init>()
                    java.lang.Object[] r6 = r1.mo10232b()
                    java.lang.String r7 = "com/tencent/mm/booter/NotifyReceiver$NotifyIOnSceneEnd$2"
                    java.lang.String r8 = "run"
                    java.lang.String r9 = "()V"
                    java.lang.String r10 = "android/os/Process_EXEC_"
                    java.lang.String r11 = "killProcess"
                    java.lang.String r12 = "(I)V"
                    r5 = r0
                    j20.C117292a.m165358d(r5, r6, r7, r8, r9, r10, r11, r12)
                    java.lang.Object r1 = r1.mo10231a(r4)
                    java.lang.Integer r1 = (java.lang.Integer) r1
                    int r1 = r1.intValue()
                    android.os.Process.killProcess(r1)
                    java.lang.String r6 = "com/tencent/mm/booter/NotifyReceiver$NotifyIOnSceneEnd$2"
                    java.lang.String r7 = "run"
                    java.lang.String r8 = "()V"
                    java.lang.String r9 = "android/os/Process_EXEC_"
                    java.lang.String r10 = "killProcess"
                    java.lang.String r11 = "(I)V"
                    j20.C117292a.m165359e(r5, r6, r7, r8, r9, r10, r11)
                L_0x008e:
                    return
                L_0x008f:
                    monitor-exit(r0)     // Catch:{ all -> 0x0091 }
                    throw r1
                L_0x0091:
                    r1 = move-exception
                    goto L_0x008f
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.booter.NotifyReceiver.C80803b.C80804b.run():void");
            }
        }

        /* renamed from: a */
        public final void mo112555a(long j) {
            if (C114781l0.m161561h().getBoolean("is_in_notify_mode", false)) {
                new MMHandler(Looper.myLooper()).postDelayed(new C80804b(this), j);
            }
        }

        /* JADX WARNING: CFG modification limit reached, blocks count: 185 */
        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|(1:2)|3|4|1f|14|15|16|17|18|19|(5:21|86|28|29|30)(1:39)|40|41|43|(2:47|(5:52|53|(1:55)|56|(3:60|(1:62)(1:63)|64)))|67|68) */
        /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0099, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x009b, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
            ((java.util.concurrent.locks.ReentrantLock) com.tencent.p014mm.booter.NotifyReceiver.f237516d).unlock();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x0167, code lost:
            throw r0;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0073 */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0084 A[Catch:{ all -> 0x0099, all -> 0x009b }] */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x009e A[Catch:{ all -> 0x0099, all -> 0x009b }] */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x00fd A[Catch:{ all -> 0x014b }] */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x0125 A[Catch:{ all -> 0x014b }] */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x0128 A[Catch:{ all -> 0x014b }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onSceneEnd(int r21, int r22, java.lang.String r23, ob0.C117747y r24) {
            /*
                r20 = this;
                r1 = r20
                int r0 = r24.hashCode()
                long r2 = (long) r0
                int r0 = r24.getType()
                r4 = 268369922(0xfff0002, float:2.5144944E-29)
                if (r0 != r4) goto L_0x0016
                r0 = r24
                pc0.p r0 = (pc0.C118014p) r0
                long r2 = r0.f352765f
            L_0x0016:
                java.util.concurrent.locks.Lock r0 = com.tencent.p014mm.booter.NotifyReceiver.f237516d     // Catch:{ all -> 0x0168 }
                java.util.concurrent.locks.ReentrantLock r0 = (java.util.concurrent.locks.ReentrantLock) r0     // Catch:{ all -> 0x0168 }
                r0.lock()     // Catch:{ all -> 0x0168 }
                byte[] r4 = com.tencent.p014mm.booter.NotifyReceiver.f237518f     // Catch:{ all -> 0x0168 }
                monitor-enter(r4)     // Catch:{ all -> 0x0168 }
                java.lang.String r0 = "MicroMsg.NotifyReceiver"
                java.lang.String r5 = "NotifyReceiver onSceneEnd type:%d syncHash: %d hashInMemo: %b isLocking: %b"
                r6 = 4
                java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x016a }
                int r7 = r24.getType()     // Catch:{ all -> 0x016a }
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x016a }
                r8 = 0
                r6[r8] = r7     // Catch:{ all -> 0x016a }
                java.lang.Long r7 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x016a }
                r9 = 1
                r6[r9] = r7     // Catch:{ all -> 0x016a }
                java.util.Set<java.lang.Long> r7 = com.tencent.p014mm.booter.NotifyReceiver.f237515c     // Catch:{ all -> 0x016a }
                java.lang.Long r10 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x016a }
                java.util.HashSet r7 = (java.util.HashSet) r7     // Catch:{ all -> 0x016a }
                boolean r7 = r7.contains(r10)     // Catch:{ all -> 0x016a }
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x016a }
                r10 = 2
                r6[r10] = r7     // Catch:{ all -> 0x016a }
                r7 = 3
                com.tencent.mars.comm.WakerLock r11 = com.tencent.p014mm.booter.NotifyReceiver.f237514b     // Catch:{ all -> 0x016a }
                if (r11 == 0) goto L_0x0056
                boolean r11 = r11.isLocking()     // Catch:{ all -> 0x016a }
                goto L_0x0057
            L_0x0056:
                r11 = 0
            L_0x0057:
                java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)     // Catch:{ all -> 0x016a }
                r6[r7] = r11     // Catch:{ all -> 0x016a }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r5, r6)     // Catch:{ all -> 0x016a }
                monitor-exit(r4)     // Catch:{ all -> 0x016a }
                java.util.Set<java.lang.Long> r0 = com.tencent.p014mm.booter.NotifyReceiver.f237515c     // Catch:{ all -> 0x0168 }
                java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0168 }
                java.util.HashSet r0 = (java.util.HashSet) r0     // Catch:{ all -> 0x0168 }
                r0.remove(r2)     // Catch:{ all -> 0x0168 }
                java.util.concurrent.locks.Lock r0 = com.tencent.p014mm.booter.NotifyReceiver.f237516d     // Catch:{ Exception -> 0x0073 }
                java.util.concurrent.locks.ReentrantLock r0 = (java.util.concurrent.locks.ReentrantLock) r0     // Catch:{ Exception -> 0x0073 }
                r0.unlock()     // Catch:{ Exception -> 0x0073 }
            L_0x0073:
                java.util.concurrent.locks.Lock r0 = com.tencent.p014mm.booter.NotifyReceiver.f237516d     // Catch:{ all -> 0x009b }
                java.util.concurrent.locks.ReentrantLock r0 = (java.util.concurrent.locks.ReentrantLock) r0     // Catch:{ all -> 0x009b }
                r0.lock()     // Catch:{ all -> 0x009b }
                java.util.Set<java.lang.Long> r0 = com.tencent.p014mm.booter.NotifyReceiver.f237515c     // Catch:{ all -> 0x009b }
                java.util.HashSet r0 = (java.util.HashSet) r0     // Catch:{ all -> 0x009b }
                boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x009b }
                if (r0 == 0) goto L_0x009e
                byte[] r2 = com.tencent.p014mm.booter.NotifyReceiver.f237518f     // Catch:{ all -> 0x009b }
                monitor-enter(r2)     // Catch:{ all -> 0x009b }
                com.tencent.mars.comm.WakerLock r0 = com.tencent.p014mm.booter.NotifyReceiver.f237514b     // Catch:{ all -> 0x0099 }
                if (r0 == 0) goto L_0x008e
                r0.unLock()     // Catch:{ all -> 0x0099 }
            L_0x008e:
                monitor-exit(r2)     // Catch:{ all -> 0x0099 }
                java.lang.String r0 = "MicroMsg.NotifyReceiver"
                java.lang.String r2 = "all scene done, unlock wakelock."
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)     // Catch:{ all -> 0x009b }
                goto L_0x00b6
            L_0x0097:
                monitor-exit(r2)     // Catch:{ all -> 0x0099 }
                throw r0     // Catch:{ all -> 0x009b }
            L_0x0099:
                r0 = move-exception
                goto L_0x0097
            L_0x009b:
                r0 = move-exception
                goto L_0x0160
            L_0x009e:
                java.lang.String r0 = "MicroMsg.NotifyReceiver"
                java.lang.String r2 = "rest %d scene undone, keep wakelock."
                java.lang.Object[] r3 = new java.lang.Object[r9]     // Catch:{ all -> 0x009b }
                java.util.Set<java.lang.Long> r4 = com.tencent.p014mm.booter.NotifyReceiver.f237515c     // Catch:{ all -> 0x009b }
                java.util.HashSet r4 = (java.util.HashSet) r4     // Catch:{ all -> 0x009b }
                int r4 = r4.size()     // Catch:{ all -> 0x009b }
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x009b }
                r3[r8] = r4     // Catch:{ all -> 0x009b }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r2, r3)     // Catch:{ all -> 0x009b }
            L_0x00b6:
                java.util.concurrent.locks.Lock r0 = com.tencent.p014mm.booter.NotifyReceiver.f237516d     // Catch:{ Exception -> 0x00be }
                java.util.concurrent.locks.ReentrantLock r0 = (java.util.concurrent.locks.ReentrantLock) r0     // Catch:{ Exception -> 0x00be }
                r0.unlock()     // Catch:{ Exception -> 0x00be }
                goto L_0x00bf
            L_0x00be:
            L_0x00bf:
                int r0 = r24.getType()
                r2 = 138(0x8a, float:1.93E-43)
                if (r0 == r2) goto L_0x00c9
                goto L_0x015a
            L_0x00c9:
                f40.e r0 = f40.C86709a0.m107523b()
                boolean r0 = r0.mo121114l()
                if (r0 == 0) goto L_0x015a
                android.os.MessageQueue r0 = android.os.Looper.myQueue()
                com.tencent.mm.booter.NotifyReceiver$b$a r2 = new com.tencent.mm.booter.NotifyReceiver$b$a
                r2.<init>()
                r0.addIdleHandler(r2)
                if (r21 != 0) goto L_0x015a
                if (r22 != 0) goto L_0x015a
                java.lang.String r2 = "MicroMsg.AccInfoCacheInWorker"
                boolean r0 = eb0.C86480a.m107209c()
                if (r0 != 0) goto L_0x00ec
                goto L_0x015a
            L_0x00ec:
                f40.C86709a0.m107528h()     // Catch:{ all -> 0x014b }
                f40.e r0 = f40.C86709a0.m107523b()     // Catch:{ all -> 0x014b }
                eb0.a r0 = r0.f251753d     // Catch:{ all -> 0x014b }
                long r3 = r0.f251306b     // Catch:{ all -> 0x014b }
                r5 = -1
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 <= 0) goto L_0x0102
                r5 = 1
                long r3 = r3 + r5
                r0.f251306b = r3     // Catch:{ all -> 0x014b }
            L_0x0102:
                java.lang.String r3 = "countNormalCgi :%s "
                java.lang.Object[] r4 = new java.lang.Object[r9]     // Catch:{ all -> 0x014b }
                long r5 = r0.f251306b     // Catch:{ all -> 0x014b }
                java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x014b }
                r4[r8] = r5     // Catch:{ all -> 0x014b }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r4)     // Catch:{ all -> 0x014b }
                long r3 = r0.f251306b     // Catch:{ all -> 0x014b }
                r5 = 2
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 == 0) goto L_0x011f
                r5 = 5
                int r11 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r11 != 0) goto L_0x015a
            L_0x011f:
                kj2.d r3 = kj2.C117407d.INSTANCE     // Catch:{ all -> 0x014b }
                r13 = 226(0xe2, double:1.117E-321)
                if (r7 != 0) goto L_0x0128
                r4 = 37
                goto L_0x012a
            L_0x0128:
                r4 = 38
            L_0x012a:
                r15 = r4
                r17 = 1
                r19 = 0
                r12 = r3
                r12.idkeyStat(r13, r15, r17, r19)     // Catch:{ all -> 0x014b }
                r4 = 11098(0x2b5a, float:1.5552E-41)
                java.lang.Object[] r5 = new java.lang.Object[r10]     // Catch:{ all -> 0x014b }
                r6 = 2001(0x7d1, float:2.804E-42)
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x014b }
                r5[r8] = r6     // Catch:{ all -> 0x014b }
                long r6 = r0.f251306b     // Catch:{ all -> 0x014b }
                java.lang.Long r0 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x014b }
                r5[r9] = r0     // Catch:{ all -> 0x014b }
                r3.mo160131h(r4, r5)     // Catch:{ all -> 0x014b }
                goto L_0x015a
            L_0x014b:
                r0 = move-exception
                java.lang.Object[] r3 = new java.lang.Object[r9]
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
                r3[r8] = r0
                java.lang.String r0 = "tryBackupToWorker Exception:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r0, r3)
            L_0x015a:
                r2 = 7000(0x1b58, double:3.4585E-320)
                r1.mo112555a(r2)
                return
            L_0x0160:
                java.util.concurrent.locks.Lock r2 = com.tencent.p014mm.booter.NotifyReceiver.f237516d     // Catch:{ Exception -> 0x0167 }
                java.util.concurrent.locks.ReentrantLock r2 = (java.util.concurrent.locks.ReentrantLock) r2     // Catch:{ Exception -> 0x0167 }
                r2.unlock()     // Catch:{ Exception -> 0x0167 }
            L_0x0167:
                throw r0
            L_0x0168:
                r0 = move-exception
                goto L_0x016d
            L_0x016a:
                r0 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x016a }
                throw r0     // Catch:{ all -> 0x0168 }
            L_0x016d:
                java.util.concurrent.locks.Lock r2 = com.tencent.p014mm.booter.NotifyReceiver.f237516d     // Catch:{ Exception -> 0x0174 }
                java.util.concurrent.locks.ReentrantLock r2 = (java.util.concurrent.locks.ReentrantLock) r2     // Catch:{ Exception -> 0x0174 }
                r2.unlock()     // Catch:{ Exception -> 0x0174 }
            L_0x0174:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.booter.NotifyReceiver.C80803b.onSceneEnd(int, int, java.lang.String, ob0.y):void");
        }
    }

    /* renamed from: a */
    public static void m98643a(Context context, Intent intent, boolean z, ArrayList<IDKey> arrayList) {
        Intent intent2 = intent;
        ArrayList<IDKey> arrayList2 = arrayList;
        if (intent2 != null) {
            if (C75681p0.m90936c(context)) {
                Log.m105924i("MicroMsg.NotifyReceiver", "fully exited, no need to start service");
                return;
            }
            long longExtra = intent2.getLongExtra("notfiy_recv_time", -1);
            long longExtra2 = intent2.getLongExtra("notfiy_sync_num", 0);
            long nowMilliSecond = Util.nowMilliSecond() - longExtra;
            CoreService.C80801f fVar = CoreService.f343882t;
            MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("msg_receive_number");
            long j = longExtra2 - mmkv.getLong("recv_num", 0);
            long j2 = longExtra;
            if (j > 0) {
                mmkv.edit().putLong("recv_num", longExtra2);
                j = 1;
            }
            if (j >= 1) {
                MultiProcessMMKV.getMMKV("msg_receive_report").edit().putLong("use_time", nowMilliSecond);
                Intent intent3 = new Intent(context, NotifyService.class);
                if (intent2.getBooleanExtra("intent_from_shoot_key", false)) {
                    intent3.putExtra("notify_option_type", 3);
                }
                intent3.putExtras(intent2);
                intent3.putExtra("isTreadPool", C36667o0.f97456b.mo60791a("clicfg_notify_service_threadpool_enable"));
                C116024c.m163164d(intent3, XWalkEnvironment.MODULE_MM, true, new Intent(MMApplicationContext.getContext(), ProcessService$MMProcessService.class));
                int intExtra = intent2.getIntExtra("notify_respType", -1);
                long longExtra3 = intent2.getLongExtra("notfiy_sync_num", 0);
                if (C118950a.f356274c && !C118950a.f356272a) {
                    C118952c cVar = C118950a.f356273b;
                    C118952c.C118955c cVar2 = new C118952c.C118955c(C31543z5.m39451a(), System.currentTimeMillis(), intExtra, longExtra3);
                    C118952c.C118953a aVar = cVar.f356288f;
                    if (((CopyOnWriteArrayList) aVar.f356300f).size() > 30000) {
                        int i = 0;
                        while (i < 100) {
                            try {
                                ((CopyOnWriteArrayList) aVar.f356300f).remove(0);
                                i++;
                            } catch (Exception e) {
                                Log.m105921e("MicroMsg.ActiveDetector.ProcessDetector", "addReceiveInterProcessList %s", e.getMessage());
                            }
                        }
                    }
                    ((CopyOnWriteArrayList) aVar.f356300f).add(cVar2);
                }
                Log.m105925i("MicroMsg.NotifyReceiver", "syncNum:%s fromBroadcast:%s diff:%s", Long.valueOf(longExtra2), Boolean.valueOf(z), Long.valueOf(Util.nowMilliSecond() - j2));
            } else if (j == 0) {
                long j3 = MultiProcessMMKV.getMMKV("msg_receive_report").getLong("use_time", 0);
                long j4 = nowMilliSecond - j3;
                Log.m105925i("MicroMsg.NotifyReceiver", "handleIntent syncNum:%s has handled(result:%s fromBroadcast:%s diff:%s newUseTime:%s oldUseTime:%s)", Long.valueOf(longExtra2), Long.valueOf(j), Boolean.valueOf(z), Long.valueOf(j4), Long.valueOf(nowMilliSecond), Long.valueOf(j3));
                for (int length = f237521i.length - 1; length >= 0; length--) {
                    if (j4 > f237521i[length]) {
                        IDKey iDKey = new IDKey();
                        iDKey.SetID(XWebFeature.INTERFACE_SET_WEB_CONTENTS_SIZE);
                        if (z) {
                            iDKey.SetKey(f237523k[length]);
                        } else {
                            iDKey.SetKey(f237522j[length]);
                        }
                        iDKey.SetValue(1);
                        arrayList2.add(iDKey);
                        return;
                    }
                }
            } else {
                Log.m105925i("MicroMsg.NotifyReceiver", "handleIntent syncNum:%s has handled(result:%s fromBroadcast:%s useTime:%s)", Long.valueOf(longExtra2), Long.valueOf(j), Boolean.valueOf(z), Long.valueOf(nowMilliSecond));
                IDKey iDKey2 = new IDKey();
                iDKey2.SetID(XWebFeature.INTERFACE_SET_WEB_CONTENTS_SIZE);
                if (z) {
                    iDKey2.SetKey(59);
                } else {
                    iDKey2.SetKey(29);
                }
                iDKey2.SetValue(1);
                arrayList2.add(iDKey2);
            }
        }
    }

    /* renamed from: b */
    public static void m98644b() {
        Log.m105924i("MicroMsg.NotifyReceiver", "quitLightPushMode");
        f237520h = false;
        C114781l0.m161561h().edit().putBoolean("is_in_notify_mode", false).commit();
    }

    /* renamed from: c */
    public static void m98645c() {
        C86709a0.m107524d().mo123470p(138, f237519g);
        C86709a0.m107524d().mo123470p(39, f237519g);
        C86709a0.m107524d().mo123470p(268369922, f237519g);
        if (f237519g == null) {
            f237519g = new C80803b();
        }
        C86709a0.m107524d().mo123455a(138, f237519g);
        C86709a0.m107524d().mo123455a(39, f237519g);
        C86709a0.m107524d().mo123455a(268369922, f237519g);
    }

    public void onReceive(Context context, Intent intent) {
        try {
            C79760s.m96908a("NotifyReceiver.onReceive()");
            Log.m105925i("MicroMsg.NotifyReceiver", "onReceive intent :%s", intent);
            ArrayList arrayList = new ArrayList();
            m98643a(context, intent, true, arrayList);
            ((C119157j) C119157j.f356862d).mo183876g(new C28859a(this, arrayList), "MicroMsg.NotifyReceiver");
        } finally {
            C79760s.m96909b();
        }
    }
}
