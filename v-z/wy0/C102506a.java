package wy0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.os.Process;
import android.util.Pair;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.vfs.C116326t0;
import com.tencent.p014mm.vfs.C86001b0;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.wcdb.Cursor;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteDirectCursor;
import com.tencent.wcdb.support.CancellationSignal;
import com.tencent.wcdb.support.OperationCanceledException;
import cy3.C58003b;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32226l;
import g62.C75875l;
import gy3.C24565l;
import gy3.C45983e0;
import gy3.C45984j0;
import gy3.C8478d0;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import k20.C60958c;
import k20.C9556a;
import kj2.C117407d;
import lu3.C109426i;
import lu3.C34379c;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sf0.C90189z;
import sx3.C110818d0;
import sx3.C110823p;
import sx3.C13801s0;
import sx3.C64186f0;
import sx3.C64197v;
import ux3.C65486b;
import xy0.C102790e;
import y04.C112354s;
import yy0.C102970a;
import yy0.C102971b;
import yy0.b$$a;
import z04.C112550d0;
import z04.C91603n;
import zt3.C119157j;

/* renamed from: wy0.a */
public final class C102506a {

    /* renamed from: a */
    public static final C102506a f301832a = new C102506a();

    /* renamed from: b */
    public static final C13601g f301833b = C36568h.m40985a(C102516l.f301864d);

    /* renamed from: c */
    public static C102508b f301834c;

    /* renamed from: d */
    public static final HashSet<Long> f301835d = new HashSet<>();

    /* renamed from: e */
    public static boolean f301836e;

    /* renamed from: f */
    public static boolean f301837f;

    /* renamed from: g */
    public static boolean f301838g;

    /* renamed from: h */
    public static boolean f301839h;

    /* renamed from: i */
    public static volatile boolean f301840i = true;

    /* renamed from: wy0.a$c */
    public static final class C38357c<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C65486b.m77169a((Long) ((C13604l) t2).f38556e, (Long) ((C13604l) t).f38556e);
        }
    }

    /* renamed from: wy0.a$e */
    public static final class C38358e implements C109426i {
        public String getKey() {
            return "CalcWxNewService.EventRunnable";
        }

        public boolean isLogging() {
            return false;
        }

        public void run() {
            ArrayList arrayList;
            long bF = C102506a.f301832a.mo142120e().mo142697bF();
            HashSet<Long> hashSet = C102506a.f301835d;
            synchronized (hashSet) {
                arrayList = new ArrayList();
                Iterator<T> it = hashSet.iterator();
                while (true) {
                    boolean z = true;
                    if (it.hasNext()) {
                        T next = it.next();
                        if (((Number) next).longValue() > bF) {
                            z = false;
                        }
                        if (z) {
                            arrayList.add(next);
                        }
                    } else {
                        C102506a.f301835d.clear();
                        C102506a.f301836e = false;
                    }
                }
            }
            try {
                C102506a.f301832a.mo142120e().mo142689Lo(arrayList, true, (CancellationSignal) null);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.CalcWxNewService", e, "Mark dirty failed: " + arrayList, new Object[0]);
            }
        }
    }

    /* renamed from: wy0.a$i */
    public static final class C38359i<V> implements Callable {

        /* renamed from: d */
        public final /* synthetic */ List<String> f101227d;

        /* renamed from: e */
        public final /* synthetic */ List<Boolean> f101228e;

        /* renamed from: f */
        public final /* synthetic */ List<Long> f101229f;

        /* renamed from: g */
        public final /* synthetic */ CancellationSignal f101230g;

        public C38359i(List<String> list, List<Boolean> list2, List<Long> list3, CancellationSignal cancellationSignal) {
            this.f101227d = list;
            this.f101228e = list2;
            this.f101229f = list3;
            this.f101230g = cancellationSignal;
        }

        public Object call() {
            List<String> list = this.f101227d;
            List<Boolean> list2 = this.f101228e;
            List<Long> list3 = this.f101229f;
            CancellationSignal cancellationSignal = this.f101230g;
            int i = 0;
            for (T next : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    String str = (String) next;
                    if (!list2.get(i).booleanValue()) {
                        try {
                            String m2 = C102970a.m136114m2(str);
                            C87412m.m108593f(m2, "fullPath");
                            C102506a.f301832a.mo142120e().mo142690NQ(list3.get(i).longValue(), C102519e.m135320b(m2), cancellationSignal);
                        } catch (OperationCanceledException e) {
                            throw e;
                        } catch (Exception e2) {
                            Log.m105920e("MicroMsg.CalcWxNewService", "Cannot update hash for " + str + ", e = " + e2);
                        }
                    }
                    i = i2;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: wy0.a$j */
    public static final class C38360j extends C87413o implements C32226l<String, Boolean> {

        /* renamed from: d */
        public static final C38360j f101231d = new C38360j();

        public C38360j() {
            super(1);
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, LocaleUtil.ITALIAN);
            return Boolean.valueOf(C87412m.m108589b(str, "1"));
        }
    }

    /* renamed from: wy0.a$a */
    public static final class C102507a {

        /* renamed from: a */
        public long f301841a;

        /* renamed from: b */
        public String f301842b;

        public C102507a(long j, String str) {
            C87412m.m108594g(str, "path");
            this.f301841a = j;
            this.f301842b = str;
        }
    }

    /* renamed from: wy0.a$b */
    public static final class C102508b extends BroadcastReceiver {

        /* renamed from: a */
        public volatile CancellationSignal f301843a;

        /* renamed from: b */
        public volatile C34379c<?> f301844b;

        /* renamed from: c */
        public boolean f301845c;

        /* renamed from: d */
        public boolean f301846d;

        /* renamed from: wy0.a$b$a */
        public static final class C102509a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C102508b f301847d;

            /* renamed from: wy0.a$b$a$a */
            public static final class C102510a implements C102522u {

                /* renamed from: a */
                public final /* synthetic */ long f301848a;

                public C102510a(long j) {
                    this.f301848a = j;
                }

                /* renamed from: a */
                public void mo137337a(long j, long j2) {
                }

                /* renamed from: b */
                public void mo137338b(boolean z, long j, int i, int i2) {
                    if (System.nanoTime() % ((long) 1024) == 0) {
                        C102506a.m135309i(z ? 1 : 0, System.currentTimeMillis() - this.f301848a, Long.valueOf(j), Long.valueOf((long) i), Long.valueOf((long) i2));
                    }
                    if (z) {
                        throw new OperationCanceledException();
                    }
                }
            }

            public C102509a(C102508b bVar) {
                this.f301847d = bVar;
            }

            public final void run() {
                Log.m105924i("MicroMsg.CalcWxNewService", "start to calc");
                this.f301847d.f301843a = new CancellationSignal();
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    C102506a aVar = C102506a.f301832a;
                    aVar.mo142124j(new C102510a(currentTimeMillis), this.f301847d.f301843a);
                    C102971b e = aVar.mo142120e();
                    e.f303871d.mo125615f().execSQL("DELETE FROM WxFileIndexRefresh WHERE indexRowId NOT IN (SELECT msgId FROM WxFileIndex3)", (Object[]) null, this.f301847d.f301843a);
                    C102971b e2 = aVar.mo142120e();
                    CancellationSignal cancellationSignal = this.f301847d.f301843a;
                    SQLiteDatabase f = e2.f303871d.mo125615f();
                    f.execSQL("DROP TABLE IF EXISTS WxFileIndex", (Object[]) null, cancellationSignal);
                    f.execSQL("DROP TABLE IF EXISTS WxFileIndex2", (Object[]) null, cancellationSignal);
                    C102506a.m135307b(aVar, this.f301847d.f301843a);
                    C102506a.m135308c(aVar, this.f301847d.f301843a);
                    aVar.mo142121f(this.f301847d.f301843a);
                } catch (OperationCanceledException e3) {
                    Log.m105924i("MicroMsg.CalcWxNewService", "Calculation cancelled.");
                    Log.printErrStackTrace("MicroMsg.CalcWxNewService", e3, "OperationCanceledException", new Object[0]);
                } catch (Exception e4) {
                    Log.printErrStackTrace("MicroMsg.CalcWxNewService", e4, "Calculation failed.", new Object[0]);
                    if (e4.getMessage() != null) {
                        String message = e4.getMessage();
                        C87412m.m108591d(message);
                        if (C112550d0.m153801u(message, "Linkify Failed", false)) {
                            int myPid = Process.myPid();
                            C9556a aVar2 = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar2.mo10233c(Integer.valueOf(myPid));
                            Object obj = new Object();
                            C117292a.m165358d(obj, aVar2.mo10232b(), "com/tencent/mm/plugin/calcwx/CalcWxNewService$MyBroadcastReceiver$onReceive$1", "run", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                            Process.killProcess(((Integer) aVar2.mo10231a(0)).intValue());
                            C117292a.m165359e(obj, "com/tencent/mm/plugin/calcwx/CalcWxNewService$MyBroadcastReceiver$onReceive$1", "run", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                        }
                    }
                }
                this.f301847d.f301843a = null;
            }
        }

        public C102508b() {
            int intExtra;
            Context context = MMApplicationContext.getContext();
            Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            boolean z = false;
            if (registerReceiver != null && ((intExtra = registerReceiver.getIntExtra("status", -1)) == 2 || intExtra == 5)) {
                z = true;
            }
            this.f301845c = z;
            Object systemService = context.getSystemService("power");
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.os.PowerManager");
            this.f301846d = ((PowerManager) systemService).isInteractive();
        }

        public void onReceive(Context context, Intent intent) {
            C87412m.m108594g(context, "context");
            C87412m.m108594g(intent, "intent");
            String action = intent.getAction();
            if (action != null) {
                switch (action.hashCode()) {
                    case -2128145023:
                        if (action.equals("android.intent.action.SCREEN_OFF")) {
                            this.f301846d = false;
                            break;
                        }
                        break;
                    case -1886648615:
                        if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                            this.f301845c = false;
                            break;
                        }
                        break;
                    case -1454123155:
                        if (action.equals("android.intent.action.SCREEN_ON")) {
                            this.f301846d = true;
                            break;
                        }
                        break;
                    case 1019184907:
                        if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                            this.f301845c = true;
                            break;
                        }
                        break;
                }
            }
            C102506a aVar = C102506a.f301832a;
            C102506a.f301839h = !this.f301846d;
            if (!C102506a.f301840i || !this.f301845c || this.f301846d) {
                C34379c<?> cVar = this.f301844b;
                if (cVar != null) {
                    cVar.cancel(false);
                }
                this.f301844b = null;
                CancellationSignal cancellationSignal = this.f301843a;
                if (cancellationSignal != null) {
                    cancellationSignal.cancel();
                }
                this.f301843a = null;
                return;
            }
            Log.m105924i("MicroMsg.CalcWxNewService", "it is charging and screen off, 5 min to calc");
            if (this.f301844b == null) {
                this.f301844b = ((C119157j) C119157j.f356862d).mo183878i(new C102509a(this), 90000);
            }
        }
    }

    /* renamed from: wy0.a$d */
    public static final class C102511d<V> implements Callable {

        /* renamed from: d */
        public final /* synthetic */ String f301849d;

        /* renamed from: e */
        public final /* synthetic */ ArrayList<C102507a> f301850e;

        /* renamed from: f */
        public final /* synthetic */ boolean f301851f;

        /* renamed from: g */
        public final /* synthetic */ C45983e0 f301852g;

        /* renamed from: h */
        public final /* synthetic */ C45983e0 f301853h;

        /* renamed from: i */
        public final /* synthetic */ C45983e0 f301854i;

        public C102511d(String str, ArrayList<C102507a> arrayList, boolean z, C45983e0 e0Var, C45983e0 e0Var2, C45983e0 e0Var3) {
            this.f301849d = str;
            this.f301850e = arrayList;
            this.f301851f = z;
            this.f301852g = e0Var;
            this.f301853h = e0Var2;
            this.f301854i = e0Var3;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.CalcWxNewService", "linkifyFutureTask, screenOff = false, stop linkify");
            wy0.C102506a.f301838g = r4;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object call() {
            /*
                r18 = this;
                r1 = r18
                java.lang.String r0 = "Linkify Failed ret = "
                r2 = 2
                r4 = 1
                wy0.l r5 = wy0.C102520l.f301871a     // Catch:{ Exception -> 0x00ef }
                r5.mo142135b()     // Catch:{ Exception -> 0x00ef }
                wy0.a r5 = wy0.C102506a.f301832a     // Catch:{ Exception -> 0x00ef }
                java.lang.String r6 = r1.f301849d     // Catch:{ Exception -> 0x00ef }
                boolean r5 = wy0.C102506a.m135306a(r5, r6)     // Catch:{ Exception -> 0x00ef }
                if (r5 == 0) goto L_0x00ec
                r5 = -1
                java.util.ArrayList<wy0.a$a> r7 = r1.f301850e     // Catch:{ Exception -> 0x00ef }
                int r7 = r7.size()     // Catch:{ Exception -> 0x00ef }
                r8 = 0
            L_0x001e:
                if (r8 >= r7) goto L_0x00ec
                java.util.ArrayList<wy0.a$a> r9 = r1.f301850e     // Catch:{ Exception -> 0x00ef }
                java.lang.Object r9 = r9.get(r8)     // Catch:{ Exception -> 0x00ef }
                wy0.a$a r9 = (wy0.C102506a.C102507a) r9     // Catch:{ Exception -> 0x00ef }
                java.lang.String r9 = r9.f301842b     // Catch:{ Exception -> 0x00ef }
                java.util.ArrayList<wy0.a$a> r10 = r1.f301850e     // Catch:{ Exception -> 0x00ef }
                java.lang.Object r10 = r10.get(r8)     // Catch:{ Exception -> 0x00ef }
                wy0.a$a r10 = (wy0.C102506a.C102507a) r10     // Catch:{ Exception -> 0x00ef }
                long r10 = r10.f301841a     // Catch:{ Exception -> 0x00ef }
                boolean r12 = wy0.C102506a.f301839h     // Catch:{ Exception -> 0x00ef }
                java.lang.String r13 = "MicroMsg.CalcWxNewService"
                if (r12 != 0) goto L_0x0044
                java.lang.String r0 = "linkifyFutureTask, screenOff = false, stop linkify"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)     // Catch:{ Exception -> 0x00ef }
                wy0.C102506a.f301838g = r4     // Catch:{ Exception -> 0x00ef }
                goto L_0x00ec
            L_0x0044:
                wy0.a r12 = wy0.C102506a.f301832a     // Catch:{ Exception -> 0x00ef }
                boolean r14 = wy0.C102506a.m135306a(r12, r9)     // Catch:{ Exception -> 0x00ef }
                if (r14 != 0) goto L_0x004e
                goto L_0x00bf
            L_0x004e:
                java.lang.String r9 = yy0.C102970a.m136114m2(r9)     // Catch:{ Exception -> 0x00ef }
                java.lang.String r14 = r1.f301849d     // Catch:{ Exception -> 0x00ef }
                boolean r14 = gy3.C87412m.m108589b(r14, r9)     // Catch:{ Exception -> 0x00ef }
                if (r14 == 0) goto L_0x005c
                r5 = r10
                goto L_0x00bf
            L_0x005c:
                wy0.l r14 = wy0.C102520l.f301871a     // Catch:{ Exception -> 0x00ef }
                java.lang.String r15 = r1.f301849d     // Catch:{ Exception -> 0x00ef }
                java.lang.String r4 = "fullPath"
                gy3.C87412m.m108593f(r9, r4)     // Catch:{ Exception -> 0x00ef }
                boolean r4 = r1.f301851f     // Catch:{ Exception -> 0x00ef }
                int r4 = r14.mo142137d(r15, r9, r4)     // Catch:{ Exception -> 0x00ef }
                if (r4 < 0) goto L_0x00c5
                if (r4 == r2) goto L_0x00aa
                r9 = 200(0xc8, float:2.8E-43)
                if (r4 == r9) goto L_0x0078
                r9 = 2000(0x7d0, float:2.803E-42)
                if (r4 == r9) goto L_0x0078
                goto L_0x00bf
            L_0x0078:
                gy3.e0 r4 = r1.f301852g     // Catch:{ Exception -> 0x00ef }
                long r13 = r4.f124000d     // Catch:{ Exception -> 0x00ef }
                r16 = 1
                long r13 = r13 + r16
                r4.f124000d = r13     // Catch:{ Exception -> 0x00ef }
                gy3.e0 r4 = r1.f301853h     // Catch:{ Exception -> 0x00ef }
                long r13 = r4.f124000d     // Catch:{ Exception -> 0x00ef }
                gy3.e0 r9 = r1.f301854i     // Catch:{ Exception -> 0x00ef }
                long r2 = r9.f124000d     // Catch:{ Exception -> 0x00ef }
                long r13 = r13 + r2
                r4.f124000d = r13     // Catch:{ Exception -> 0x00ef }
                yy0.b r2 = r12.mo142120e()     // Catch:{ Exception -> 0x00ef }
                r3 = 2
                java.lang.Long[] r4 = new java.lang.Long[r3]     // Catch:{ Exception -> 0x00ef }
                java.lang.Long r3 = java.lang.Long.valueOf(r10)     // Catch:{ Exception -> 0x00ef }
                r9 = 0
                r4[r9] = r3     // Catch:{ Exception -> 0x00ef }
                java.lang.Long r3 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x00ef }
                r9 = 1
                r4[r9] = r3     // Catch:{ Exception -> 0x00ef }
                java.util.List r3 = sx3.C64197v.m75537f(r4)     // Catch:{ Exception -> 0x00ef }
                r2.mo142704qq(r3)     // Catch:{ Exception -> 0x00ef }
                goto L_0x00bf
            L_0x00aa:
                r2 = 0
                int r4 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
                if (r4 < 0) goto L_0x00bf
                yy0.b r2 = r12.mo142120e()     // Catch:{ Exception -> 0x00ef }
                java.lang.Long r3 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x00ef }
                java.util.List r3 = sx3.C26236u.m33719b(r3)     // Catch:{ Exception -> 0x00ef }
                r2.mo142704qq(r3)     // Catch:{ Exception -> 0x00ef }
            L_0x00bf:
                int r8 = r8 + 1
                r2 = 2
                r4 = 1
                goto L_0x001e
            L_0x00c5:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ef }
                r2.<init>()     // Catch:{ Exception -> 0x00ef }
                r2.append(r0)     // Catch:{ Exception -> 0x00ef }
                r2.append(r4)     // Catch:{ Exception -> 0x00ef }
                java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00ef }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r2)     // Catch:{ Exception -> 0x00ef }
                java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x00ef }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ef }
                r3.<init>()     // Catch:{ Exception -> 0x00ef }
                r3.append(r0)     // Catch:{ Exception -> 0x00ef }
                r3.append(r4)     // Catch:{ Exception -> 0x00ef }
                java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x00ef }
                r2.<init>(r0)     // Catch:{ Exception -> 0x00ef }
                throw r2     // Catch:{ Exception -> 0x00ef }
            L_0x00ec:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            L_0x00ef:
                r0 = move-exception
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r2 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()
                java.lang.String r3 = "LinkifyError"
                r4 = 1
                r2.putBoolean(r3, r4)
                kj2.d r2 = kj2.C117407d.INSTANCE
                r3 = 6
                java.lang.Object[] r5 = new java.lang.Object[r3]
                r6 = -200(0xffffffffffffff38, float:NaN)
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r7 = 0
                r5[r7] = r6
                java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
                r5[r4] = r6
                java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
                r6 = 2
                r5[r6] = r4
                java.lang.String r4 = r0.getMessage()
                r6 = 3
                r5[r6] = r4
                r4 = 4
                java.lang.String r8 = ""
                r5[r4] = r8
                java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
                r10 = 5
                r5[r10] = r9
                r9 = 26980(0x6964, float:3.7807E-41)
                r2.mo160131h(r9, r5)
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r5 = 201(0xc9, float:2.82E-43)
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r3[r7] = r5
                gy3.e0 r5 = r1.f301852g
                long r11 = r5.f124000d
                java.lang.Long r5 = java.lang.Long.valueOf(r11)
                r7 = 1
                r3[r7] = r5
                gy3.e0 r5 = r1.f301853h
                long r11 = r5.f124000d
                java.lang.Long r5 = java.lang.Long.valueOf(r11)
                r7 = 2
                r3[r7] = r5
                java.lang.String r5 = r1.f301849d
                r3[r6] = r5
                r3[r4] = r8
                r4 = 0
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r3[r10] = r4
                r2.mo160131h(r9, r3)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: wy0.C102506a.C102511d.call():java.lang.Object");
        }
    }

    /* renamed from: wy0.a$f */
    public static final class C102512f<V> implements Callable {

        /* renamed from: d */
        public final /* synthetic */ C102790e f301855d;

        /* renamed from: e */
        public final /* synthetic */ C72963f4 f301856e;

        public C102512f(C102790e eVar, C72963f4 f4Var) {
            this.f301855d = eVar;
            this.f301856e = f4Var;
        }

        public Object call() {
            Object a = this.f301855d.mo142536a(this.f301856e);
            Long valueOf = Long.valueOf(this.f301856e.getMsgId());
            if (a == null) {
                a = C64186f0.f181907d;
            }
            return new C13604l(valueOf, a);
        }
    }

    /* renamed from: wy0.a$g */
    public static final class C102513g<V> implements Callable {

        /* renamed from: d */
        public final /* synthetic */ C75875l f301857d;

        /* renamed from: e */
        public final /* synthetic */ Long f301858e;

        public C102513g(C75875l lVar, Long l) {
            this.f301857d = lVar;
            this.f301858e = l;
        }

        public Object call() {
            C75875l lVar = this.f301857d;
            Long l = this.f301858e;
            C87412m.m108593f(l, "msgId");
            C72963f4 b002 = ((C72972g4) lVar).b00(l.longValue());
            List<C102970a> list = null;
            if (b002.getMsgId() != 0) {
                Map<Integer, C102790e> map = C102519e.f301867a;
                C102790e eVar = map.get(Integer.valueOf(b002.getType()));
                if (eVar == null) {
                    eVar = map.get(Integer.valueOf(C72695v.m85061c(b002.getType())));
                }
                if (eVar != null) {
                    list = eVar.mo142536a(b002);
                }
            }
            Long l2 = this.f301858e;
            C87412m.m108593f(l2, "msgId");
            if (list == null) {
                list = C64186f0.f181907d;
            }
            return new C13604l(l2, list);
        }
    }

    /* renamed from: wy0.a$h */
    public static final class C102514h<V> implements Callable {

        /* renamed from: d */
        public final /* synthetic */ Pair<Long, String> f301859d;

        /* renamed from: e */
        public final /* synthetic */ C8478d0 f301860e;

        /* renamed from: f */
        public final /* synthetic */ C8478d0 f301861f;

        /* renamed from: g */
        public final /* synthetic */ C8478d0 f301862g;

        public C102514h(Pair<Long, String> pair, C8478d0 d0Var, C8478d0 d0Var2, C8478d0 d0Var3) {
            this.f301859d = pair;
            this.f301860e = d0Var;
            this.f301861f = d0Var2;
            this.f301862g = d0Var3;
        }

        public Object call() {
            String str;
            C86001b0 n = C86013q1.m106453n(C102970a.m136114m2((String) this.f301859d.second));
            if (n == null) {
                Log.m105928w("MicroMsg.CalcWxNewService", "File not exists when refreshing link: " + ((String) this.f301859d.second));
                C8478d0 d0Var = this.f301860e;
                d0Var.f27483d = d0Var.f27483d + 1;
            }
            C102970a aVar = new C102970a();
            Pair<Long, String> pair = this.f301859d;
            C8478d0 d0Var2 = this.f301861f;
            C8478d0 d0Var3 = this.f301862g;
            Object obj = pair.first;
            C87412m.m108593f(obj, "p.first");
            aVar.systemRowid = ((Number) obj).longValue();
            aVar.field_diskSpace = n != null ? n.f250474d : 0;
            if (n instanceof C116326t0) {
                d0Var2.f27483d++;
                str = ((C116326t0) n).f349094h;
            } else {
                if (n != null) {
                    d0Var3.f27483d++;
                }
                str = null;
            }
            aVar.mo142684n2(str);
            return aVar;
        }
    }

    /* renamed from: wy0.a$k */
    public /* synthetic */ class C102515k extends C24565l implements C32226l<String, Long> {

        /* renamed from: d */
        public static final C102515k f301863d = new C102515k();

        public C102515k() {
            super(1, C91603n.class, "toLong", "toLong(Ljava/lang/String;)J", 1);
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, "p0");
            return Long.valueOf(Long.parseLong(str));
        }
    }

    /* renamed from: wy0.a$l */
    public static final class C102516l extends C87413o implements C32224a<C102971b> {

        /* renamed from: d */
        public static final C102516l f301864d = new C102516l();

        public C102516l() {
            super(0);
        }

        public Object invoke() {
            String[] strArr = C102971b.f303869g;
            String str = C86709a0.m107535s().f251807e + "WxFileIndex.db";
            HashMap hashMap = new HashMap();
            hashMap.put(-346501660, new b$$a());
            return new C102971b(C90189z.m112866a(C102971b.class.hashCode(), str, hashMap, true));
        }
    }

    /* renamed from: a */
    public static final boolean m135306a(C102506a aVar, String str) {
        aVar.getClass();
        return C112550d0.m153803w(str, "image2/", false, 2, (Object) null) || C112550d0.m153803w(str, "video/", false, 2, (Object) null) || C112550d0.m153803w(str, "record/", false, 2, (Object) null) || C112550d0.m153803w(str, "attachment/", false, 2, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0232, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0233, code lost:
        r7 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0239, code lost:
        r7 = r32;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:63:? A[ExcHandler: OperationCanceledException (unused com.tencent.wcdb.support.OperationCanceledException), SYNTHETIC, Splitter:B:44:0x017d] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x02a2  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x02e3  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0301  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m135307b(wy0.C102506a r37, com.tencent.wcdb.support.CancellationSignal r38) {
        /*
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_C2C_RESCUE_OTHER_ACCOUNT_SCAN_DONE_LONG_SYNC
            r37.getClass()
            java.lang.String r2 = ""
            com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_C2C_OTHER_ACCOUNT_WRONG_MIGRANT_INT_SYNC
            java.lang.String r4 = "@WrongMigration-oneShotScan"
            com.tencent.mm.storage.y1$a r5 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_C2C_RESCUE_OTHER_ACCOUNT_SCAN_CURSOR_LONG_SYNC
            java.lang.Integer[] r6 = wy0.C102519e.f301870d
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()
            java.lang.String r7 = "scanAndRescueC2CDoneBefore"
            r8 = 0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            boolean r10 = r0.decodeBool(r7, r8)
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            r11 = -9223372036854775808
            long r13 = r0.mo119673G(r5, r11)
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            long r15 = r0.mo119673G(r1, r11)
            r11 = 0
            r19 = 0
            java.lang.String r12 = "MicroMsg.CalcWxNewService"
            int r0 = (r15 > r19 ? 1 : (r15 == r19 ? 0 : -1))
            if (r0 <= 0) goto L_0x0046
        L_0x0042:
            r20 = r9
            r8 = r15
            goto L_0x0078
        L_0x0046:
            yy0.b r0 = r37.mo142120e()     // Catch:{ Exception -> 0x006a }
            zh3.f r0 = r0.f303871d     // Catch:{ Exception -> 0x006a }
            com.tencent.wcdb.database.SQLiteDatabase r0 = r0.mo125615f()     // Catch:{ Exception -> 0x006a }
            java.lang.String r15 = "SELECT max(rowId) FROM WxFileIndex3"
            long r15 = com.tencent.wcdb.DatabaseUtils.longForQuery(r0, r15, r11)     // Catch:{ Exception -> 0x006a }
            int r0 = (r15 > r19 ? 1 : (r15 == r19 ? 0 : -1))
            if (r0 <= 0) goto L_0x0072
            f40.o r0 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x006a }
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()     // Catch:{ Exception -> 0x006a }
            java.lang.Long r11 = java.lang.Long.valueOf(r15)     // Catch:{ Exception -> 0x006a }
            r0.mo119677K(r1, r11)     // Catch:{ Exception -> 0x006a }
            goto L_0x0042
        L_0x006a:
            r0 = move-exception
            java.lang.Object[] r11 = new java.lang.Object[r8]
            java.lang.String r15 = "Cannot get max rowId"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r0, r15, r11)
        L_0x0072:
            r15 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x0042
        L_0x0078:
            java.lang.String r0 = " / "
            r15 = 41
            if (r10 == 0) goto L_0x00a1
            int r10 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r10 < 0) goto L_0x00a1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Scan and rescue done before, skip. ("
            r1.append(r2)
            r1.append(r13)
            r1.append(r0)
            r1.append(r8)
            r1.append(r15)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
            goto L_0x02ce
        L_0x00a1:
            f40.o r10 = f40.C86709a0.m107535s()
            java.lang.String r10 = r10.f251805c
            r16 = 9
            r21 = 8
            r22 = 7
            r23 = 6
            r24 = 5
            r25 = 4
            r26 = 3
            r27 = 12
            r28 = 11
            r29 = 10
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ OperationCanceledException -> 0x025c, all -> 0x0252 }
            r11.<init>()     // Catch:{ OperationCanceledException -> 0x025c, all -> 0x0252 }
            java.lang.String r15 = "Scan and rescue begin ("
            r11.append(r15)     // Catch:{ OperationCanceledException -> 0x025c, all -> 0x0252 }
            r11.append(r13)     // Catch:{ OperationCanceledException -> 0x025c, all -> 0x0252 }
            r11.append(r0)     // Catch:{ OperationCanceledException -> 0x025c, all -> 0x0252 }
            r11.append(r8)     // Catch:{ OperationCanceledException -> 0x025c, all -> 0x0252 }
            r0 = 41
            r11.append(r0)     // Catch:{ OperationCanceledException -> 0x025c, all -> 0x0252 }
            java.lang.String r0 = r11.toString()     // Catch:{ OperationCanceledException -> 0x025c, all -> 0x0252 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)     // Catch:{ OperationCanceledException -> 0x025c, all -> 0x0252 }
            kj2.d r0 = kj2.C117407d.INSTANCE     // Catch:{ OperationCanceledException -> 0x025c, all -> 0x0252 }
            r11 = 0
            r15 = r6[r11]     // Catch:{ OperationCanceledException -> 0x025c, all -> 0x0252 }
            int r15 = r15.intValue()     // Catch:{ OperationCanceledException -> 0x025c, all -> 0x0252 }
            r11 = 1912(0x778, float:2.679E-42)
            r0.mo182088q(r11, r15)     // Catch:{ OperationCanceledException -> 0x025c, all -> 0x0252 }
            yy0.b r0 = r37.mo142120e()     // Catch:{ OperationCanceledException -> 0x025c, all -> 0x0252 }
            zh3.f r0 = r0.f303871d     // Catch:{ OperationCanceledException -> 0x025c, all -> 0x0252 }
            com.tencent.wcdb.database.SQLiteDatabase r31 = r0.mo125615f()     // Catch:{ OperationCanceledException -> 0x025c, all -> 0x0252 }
            com.tencent.wcdb.database.SQLiteDatabase$CursorFactory r32 = com.tencent.wcdb.database.SQLiteDirectCursor.FACTORY     // Catch:{ OperationCanceledException -> 0x025c, all -> 0x0252 }
            java.lang.String r33 = "SELECT rowId, path, size FROM WxFileIndex3 WHERE rowId > ? AND rowId <= ? ORDER BY rowId ASC"
            r11 = 2
            java.lang.Long[] r0 = new java.lang.Long[r11]     // Catch:{ OperationCanceledException -> 0x025c, all -> 0x0252 }
            java.lang.Long r11 = java.lang.Long.valueOf(r13)     // Catch:{ OperationCanceledException -> 0x025c, all -> 0x0252 }
            r13 = 0
            r0[r13] = r11     // Catch:{ OperationCanceledException -> 0x025c, all -> 0x0252 }
            java.lang.Long r13 = java.lang.Long.valueOf(r8)     // Catch:{ OperationCanceledException -> 0x025c, all -> 0x0252 }
            r14 = 1
            r0[r14] = r13     // Catch:{ OperationCanceledException -> 0x025c, all -> 0x0252 }
            java.lang.String r35 = "WxFileIndex3"
            r34 = r0
            r36 = r38
            com.tencent.wcdb.Cursor r13 = r31.rawQueryWithFactory(r32, r33, r34, r35, r36)     // Catch:{ OperationCanceledException -> 0x025c, all -> 0x0252 }
            r0 = 0
            r14 = 0
            r17 = -9223372036854775808
        L_0x0115:
            boolean r15 = r13.moveToNext()     // Catch:{ all -> 0x0241 }
            if (r15 == 0) goto L_0x0176
            r11 = 0
            long r17 = r13.getLong(r11)     // Catch:{ all -> 0x016c }
            r15 = 1
            java.lang.String r11 = r13.getString(r15)     // Catch:{ all -> 0x016c }
            r31 = r2
            r32 = r3
            r15 = 2
            long r2 = r13.getLong(r15)     // Catch:{ all -> 0x016a }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ all -> 0x016a }
            r15.<init>()     // Catch:{ all -> 0x016a }
            r15.append(r10)     // Catch:{ all -> 0x016a }
            r15.append(r11)     // Catch:{ all -> 0x016a }
            java.lang.String r11 = r15.toString()     // Catch:{ all -> 0x016a }
            r30 = r10
            r10 = 0
            r15 = 1
            boolean r2 = com.tencent.p014mm.vfs.VFSStrategy.m163779g(r11, r2, r10, r15)     // Catch:{ all -> 0x016a }
            if (r2 == 0) goto L_0x0148
            r14 = 1
        L_0x0148:
            if (r38 == 0) goto L_0x014d
            r38.throwIfCanceled()     // Catch:{ all -> 0x016a }
        L_0x014d:
            int r11 = r0 + 1
            r2 = 64
            if (r0 < r2) goto L_0x0162
            f40.o r0 = f40.C86709a0.m107535s()     // Catch:{ all -> 0x016a }
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()     // Catch:{ all -> 0x016a }
            java.lang.Long r2 = java.lang.Long.valueOf(r17)     // Catch:{ all -> 0x016a }
            r0.mo119677K(r5, r2)     // Catch:{ all -> 0x016a }
        L_0x0162:
            r0 = r11
            r10 = r30
            r2 = r31
            r3 = r32
            goto L_0x0115
        L_0x016a:
            r0 = move-exception
            goto L_0x0171
        L_0x016c:
            r0 = move-exception
            r31 = r2
            r32 = r3
        L_0x0171:
            r2 = r0
            r7 = r32
            goto L_0x0246
        L_0x0176:
            r31 = r2
            r32 = r3
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x023d }
            r2 = 0
            cy3.C58003b.m67160a(r13, r2)     // Catch:{ OperationCanceledException -> 0x0239, all -> 0x0232 }
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()     // Catch:{ OperationCanceledException -> 0x0239, all -> 0x0232 }
            java.lang.String r2 = "C2CErrorToBeRescued"
            r0.encode((java.lang.String) r2, (boolean) r14)     // Catch:{ OperationCanceledException -> 0x0239, all -> 0x0232 }
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()     // Catch:{ OperationCanceledException -> 0x0239, all -> 0x0232 }
            r2 = 1
            r0.encode((java.lang.String) r7, (boolean) r2)     // Catch:{ OperationCanceledException -> 0x0239, all -> 0x0232 }
            int r0 = (r17 > r8 ? 1 : (r17 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x01ae
            f40.o r0 = f40.C86709a0.m107535s()     // Catch:{ OperationCanceledException -> 0x0239, all -> 0x01a5 }
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()     // Catch:{ OperationCanceledException -> 0x0239, all -> 0x01a5 }
            java.lang.Long r2 = java.lang.Long.valueOf(r17)     // Catch:{ OperationCanceledException -> 0x0239, all -> 0x01a5 }
            r0.mo119677K(r1, r2)     // Catch:{ OperationCanceledException -> 0x0239, all -> 0x01a5 }
            goto L_0x01ae
        L_0x01a5:
            r0 = move-exception
            r30 = r14
            r11 = r17
            r7 = r32
            goto L_0x02d2
        L_0x01ae:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ OperationCanceledException -> 0x0239, all -> 0x0232 }
            r0.<init>()     // Catch:{ OperationCanceledException -> 0x0239, all -> 0x0232 }
            java.lang.String r1 = "Scan and rescue succeeded, rescued = "
            r0.append(r1)     // Catch:{ OperationCanceledException -> 0x0239, all -> 0x0232 }
            r0.append(r14)     // Catch:{ OperationCanceledException -> 0x0239, all -> 0x0232 }
            r1 = 46
            r0.append(r1)     // Catch:{ OperationCanceledException -> 0x0239, all -> 0x0232 }
            java.lang.String r0 = r0.toString()     // Catch:{ OperationCanceledException -> 0x0239, all -> 0x0232 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)     // Catch:{ OperationCanceledException -> 0x0239, all -> 0x0232 }
            kj2.d r0 = kj2.C117407d.INSTANCE     // Catch:{ OperationCanceledException -> 0x0239, all -> 0x0232 }
            r1 = 2
            r2 = r6[r1]     // Catch:{ OperationCanceledException -> 0x0239, all -> 0x0232 }
            int r1 = r2.intValue()     // Catch:{ OperationCanceledException -> 0x0239, all -> 0x0232 }
            r2 = 1912(0x778, float:2.679E-42)
            r0.mo182088q(r2, r1)     // Catch:{ OperationCanceledException -> 0x0239, all -> 0x0232 }
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            java.lang.Long r2 = java.lang.Long.valueOf(r17)
            r1.mo119677K(r5, r2)
            if (r14 == 0) goto L_0x0204
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r26)
            r7 = r32
            r1.mo119677K(r7, r2)
            r1 = 1
            r2 = r6[r1]
            int r2 = r2.intValue()
            r5 = 1912(0x778, float:2.679E-42)
            r0.mo182088q(r5, r2)
            goto L_0x0205
        L_0x0204:
            r1 = 1
        L_0x0205:
            r2 = 13
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r2[r1] = r20
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r3 = 2
            r2[r3] = r1
            r2[r26] = r31
            r2[r25] = r20
            r2[r24] = r20
            r2[r23] = r20
            r2[r22] = r20
            r2[r21] = r20
            r2[r16] = r20
            r2[r29] = r20
            r2[r28] = r20
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.BuildInfo.REV
            r2[r27] = r1
            r1 = 21388(0x538c, float:2.9971E-41)
            r0.mo160131h(r1, r2)
            goto L_0x02ce
        L_0x0232:
            r0 = move-exception
            r7 = r32
        L_0x0235:
            r30 = r14
            goto L_0x02d0
        L_0x0239:
            r7 = r32
        L_0x023b:
            r11 = r14
            goto L_0x024f
        L_0x023d:
            r0 = move-exception
            r7 = r32
            goto L_0x0245
        L_0x0241:
            r0 = move-exception
            r31 = r2
            r7 = r3
        L_0x0245:
            r2 = r0
        L_0x0246:
            throw r2     // Catch:{ all -> 0x0247 }
        L_0x0247:
            r0 = move-exception
            r3 = r0
            cy3.C58003b.m67160a(r13, r2)     // Catch:{ OperationCanceledException -> 0x023b, all -> 0x024d }
            throw r3     // Catch:{ OperationCanceledException -> 0x023b, all -> 0x024d }
        L_0x024d:
            r0 = move-exception
            goto L_0x0235
        L_0x024f:
            r30 = r11
            goto L_0x0263
        L_0x0252:
            r0 = move-exception
            r31 = r2
            r7 = r3
            r11 = -9223372036854775808
            r30 = 0
            goto L_0x02d2
        L_0x025c:
            r31 = r2
            r7 = r3
            r17 = -9223372036854775808
            r30 = 0
        L_0x0263:
            java.lang.String r0 = "Scan and rescue cancelled."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)     // Catch:{ all -> 0x02cf }
            kj2.d r0 = kj2.C117407d.INSTANCE     // Catch:{ all -> 0x02cf }
            r2 = r6[r26]     // Catch:{ all -> 0x02cf }
            int r2 = r2.intValue()     // Catch:{ all -> 0x02cf }
            r3 = 1912(0x778, float:2.679E-42)
            r0.mo182088q(r3, r2)     // Catch:{ all -> 0x02cf }
            f40.o r2 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r2 = r2.mo121142i()
            java.lang.Long r3 = java.lang.Long.valueOf(r17)
            r2.mo119677K(r5, r3)
            if (r30 == 0) goto L_0x02a2
            f40.o r2 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r2 = r2.mo121142i()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r26)
            r2.mo119677K(r7, r3)
            r2 = 1
            r3 = r6[r2]
            int r3 = r3.intValue()
            r5 = 1912(0x778, float:2.679E-42)
            r0.mo182088q(r5, r3)
            goto L_0x02a3
        L_0x02a2:
            r2 = 1
        L_0x02a3:
            r3 = 13
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r1 = 0
            r3[r1] = r4
            r3[r2] = r20
            java.lang.Integer r1 = java.lang.Integer.valueOf(r30)
            r2 = 2
            r3[r2] = r1
            r3[r26] = r31
            r3[r25] = r20
            r3[r24] = r20
            r3[r23] = r20
            r3[r22] = r20
            r3[r21] = r20
            r3[r16] = r20
            r3[r29] = r20
            r3[r28] = r20
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.BuildInfo.REV
            r3[r27] = r1
            r1 = 21388(0x538c, float:2.9971E-41)
            r0.mo160131h(r1, r3)
        L_0x02ce:
            return
        L_0x02cf:
            r0 = move-exception
        L_0x02d0:
            r11 = r17
        L_0x02d2:
            f40.o r2 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r2 = r2.mo121142i()
            java.lang.Long r3 = java.lang.Long.valueOf(r11)
            r2.mo119677K(r5, r3)
            if (r30 == 0) goto L_0x0301
            f40.o r2 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r2 = r2.mo121142i()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r26)
            r2.mo119677K(r7, r3)
            kj2.d r2 = kj2.C117407d.INSTANCE
            r3 = 1
            r5 = r6[r3]
            int r5 = r5.intValue()
            r6 = 1912(0x778, float:2.679E-42)
            r2.mo182088q(r6, r5)
            goto L_0x0302
        L_0x0301:
            r3 = 1
        L_0x0302:
            kj2.d r2 = kj2.C117407d.INSTANCE
            r5 = 13
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r1 = 0
            r5[r1] = r4
            r5[r3] = r20
            java.lang.Integer r1 = java.lang.Integer.valueOf(r30)
            r3 = 2
            r5[r3] = r1
            r5[r26] = r31
            r5[r25] = r20
            r5[r24] = r20
            r5[r23] = r20
            r5[r22] = r20
            r5[r21] = r20
            r5[r16] = r20
            r5[r29] = r20
            r5[r28] = r20
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.BuildInfo.REV
            r5[r27] = r1
            r1 = 21388(0x538c, float:2.9971E-41)
            r2.mo160131h(r1, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wy0.C102506a.m135307b(wy0.a, com.tencent.wcdb.support.CancellationSignal):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m135308c(wy0.C102506a r7, com.tencent.wcdb.support.CancellationSignal r8) {
        /*
            monitor-enter(r7)
            java.util.Map<java.lang.Integer, xy0.e> r0 = wy0.C102519e.f301867a     // Catch:{ all -> 0x007b }
            oa1.d r0 = oa1.C117731d.m166007c()     // Catch:{ all -> 0x007b }
            r1 = 0
            r2 = 1
            java.lang.String r3 = "clicfg_image_video_detail_scan"
            java.lang.String r4 = "0"
            java.lang.String r0 = r0.mo182444f(r3, r4, r1, r2)     // Catch:{ all -> 0x007b }
            java.lang.String r1 = "1"
            boolean r0 = gy3.C87412m.m108589b(r1, r0)     // Catch:{ all -> 0x007b }
            if (r0 != 0) goto L_0x0022
            java.lang.String r8 = "MicroMsg.CalcWxNewService"
            java.lang.String r0 = "imageVideoDetailScanExpt false, return"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)     // Catch:{ all -> 0x007b }
            monitor-exit(r7)
            goto L_0x007a
        L_0x0022:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()     // Catch:{ all -> 0x007b }
            java.lang.String r1 = "LastCompressC2CImageTime"
            r2 = 0
            long r0 = r0.decodeLong(r1, r2)     // Catch:{ all -> 0x007b }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x007b }
            long r4 = r4 - r0
            r0 = 604800000(0x240c8400, double:2.988109026E-315)
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 >= 0) goto L_0x0042
            java.lang.String r4 = "MicroMsg.CalcWxNewService"
            java.lang.String r5 = "Skip compressC2CImage"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)     // Catch:{ all -> 0x007b }
            goto L_0x0050
        L_0x0042:
            zt3.t r4 = zt3.C119157j.f356862d     // Catch:{ all -> 0x007b }
            wy0.b r5 = new wy0.b     // Catch:{ all -> 0x007b }
            r5.<init>(r8)     // Catch:{ all -> 0x007b }
            zt3.j r4 = (zt3.C119157j) r4     // Catch:{ all -> 0x007b }
            java.lang.String r6 = "compressC2CImage"
            r4.mo183876g(r5, r6)     // Catch:{ all -> 0x007b }
        L_0x0050:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r4 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()     // Catch:{ all -> 0x007b }
            java.lang.String r5 = "LastCompressC2CVideoTime"
            long r2 = r4.decodeLong(r5, r2)     // Catch:{ all -> 0x007b }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x007b }
            long r4 = r4 - r2
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x006b
            java.lang.String r8 = "MicroMsg.CalcWxNewService"
            java.lang.String r0 = "Skip compressC2CImage"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)     // Catch:{ all -> 0x007b }
            goto L_0x0079
        L_0x006b:
            zt3.t r0 = zt3.C119157j.f356862d     // Catch:{ all -> 0x007b }
            wy0.c r1 = new wy0.c     // Catch:{ all -> 0x007b }
            r1.<init>(r8)     // Catch:{ all -> 0x007b }
            zt3.j r0 = (zt3.C119157j) r0     // Catch:{ all -> 0x007b }
            java.lang.String r8 = "compressC2CVideo"
            r0.mo183876g(r1, r8)     // Catch:{ all -> 0x007b }
        L_0x0079:
            monitor-exit(r7)
        L_0x007a:
            return
        L_0x007b:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: wy0.C102506a.m135308c(wy0.a, com.tencent.wcdb.support.CancellationSignal):void");
    }

    /* renamed from: i */
    public static final void m135309i(int i, long j, Long... lArr) {
        C87412m.m108594g(lArr, "size");
        Log.m105924i("MicroMsg.CalcWxNewService", ">> SCENE " + i + ": (" + j + ") " + C110823p.m150987M(lArr, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null));
        C117407d dVar = C117407d.INSTANCE;
        C45984j0 j0Var = new C45984j0(3);
        j0Var.mo71372a(Integer.valueOf(i));
        j0Var.mo71372a(Long.valueOf(j));
        j0Var.mo71373b(lArr);
        dVar.mo160131h(25464, j0Var.mo71375d(new Object[j0Var.mo71374c()]));
    }

    /* renamed from: d */
    public final Object[] mo142119d(List<String> list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        int i = 0;
        for (String next : list) {
            if (!linkedHashSet.add(next)) {
                i = arrayList.contains(next) ? i + 1 : i + 2;
                arrayList.add(next);
            }
        }
        Object[] objArr = new Object[2];
        objArr[0] = arrayList;
        if (list.size() - i >= 2) {
            z = true;
        }
        objArr[1] = Boolean.valueOf(z);
        return objArr;
    }

    /* renamed from: e */
    public final C102971b mo142120e() {
        return (C102971b) ((C36570n) f301833b).getValue();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x040e, code lost:
        r7 = r85;
        r6 = r95;
        r3 = r96;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0446, code lost:
        r7 = r85;
        r6 = r95;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x04b8, code lost:
        if (r8 != 0) goto L_0x04c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x04ba, code lost:
        r2 = r101;
        r22 = r2.f250473c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x04c1, code lost:
        r2 = r101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x04c7, code lost:
        if (r2.mo119956c() == false) goto L_0x0501;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x04c9, code lost:
        r11 = com.tencent.p014mm.vfs.C86013q1.m106448i(r13, true);
        gy3.C87412m.m108593f(r13, "fullPath");
        r2 = r77;
        r2.put(r11, r13);
        r12 = r79;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x04de, code lost:
        if (r12.containsKey(r11) == false) goto L_0x04f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x04e0, code lost:
        r13 = r12.get(r11);
        gy3.C87412m.m108591d(r13);
        r12.put(r11, java.lang.Long.valueOf(((java.lang.Number) r13).longValue() + 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x04f7, code lost:
        r12.put(r11, 1L);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x04fe, code lost:
        r11 = r78;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0501, code lost:
        r2 = r77;
        r11 = r78;
        r12 = r79;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x050b, code lost:
        if (r11.contains(r13) != false) goto L_0x0515;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x050d, code lost:
        r82 = r82 + 1;
        r11.add(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0515, code lost:
        r82 = r82;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0771, code lost:
        r13 = r60;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0794, code lost:
        r6 = r42;
        r11 = r44;
        r1 = r46;
        r42 = r48;
        r44 = r50;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x07c0, code lost:
        r11 = r44;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x081b, code lost:
        r44 = r6;
        r6 = r42;
        r13 = r60;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x083e, code lost:
        r13 = r60;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x084b, code lost:
        r52 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0861, code lost:
        r44 = r6;
        r6 = r42;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0876, code lost:
        r9 = r66;
        r1 = r46;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x088f, code lost:
        r42 = r2;
        r1 = r46;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x08aa, code lost:
        r44 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x08ad, code lost:
        r46 = r6;
        r62 = r62 + r4;
        r3 = rx3.C13598b0.f38549a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x08b5, code lost:
        r52 = r9;
        r60 = r13;
        r48 = r42;
        r50 = r44;
        r42 = r46;
        r9 = r66;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x08c1, code lost:
        r14 = r70;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x08c3, code lost:
        r46 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x08c6, code lost:
        r1 = (long) (r69 - 1);
        r54 = r54 + r1;
        r56 = r56 + (r1 * r77);
        r58 = r58 + r4;
        r1 = r103;
        r22 = r24;
        r8 = r68;
        r5 = r72;
        r11 = r74;
        r13 = r76;
        r24 = r80;
        r2 = r97;
        r7 = r100;
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x0d73, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:?, code lost:
        cy3.C58003b.m67160a(r15, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x0d78, code lost:
        throw r2;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=com.tencent.wcdb.support.CancellationSignal, code=java.lang.Throwable, for r103v0, types: [com.tencent.wcdb.support.CancellationSignal] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0416 A[Catch:{ all -> 0x08ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x043b A[Catch:{ all -> 0x08ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0467 A[Catch:{ all -> 0x08ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0491 A[Catch:{ all -> 0x08ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0063 A[Catch:{ all -> 0x0d73, all -> 0x0d79 }] */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x0981 A[Catch:{ all -> 0x0d73, all -> 0x0d79 }] */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x09d2 A[Catch:{ all -> 0x0d73, all -> 0x0d79 }] */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x0a84 A[SYNTHETIC, Splitter:B:249:0x0a84] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0085 A[SYNTHETIC, Splitter:B:25:0x0085] */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x0949 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a8 A[Catch:{ all -> 0x0d73, all -> 0x0d79 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a9 A[Catch:{ all -> 0x0d73, all -> 0x0d79 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b8 A[Catch:{ all -> 0x0d73, all -> 0x0d79 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b9 A[Catch:{ all -> 0x0d73, all -> 0x0d79 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x012f  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo142121f(java.lang.Throwable r103) {
        /*
            r102 = this;
            r1 = r103
            monitor-enter(r102)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger()     // Catch:{ all -> 0x0d79 }
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L_0x001e
            boolean r2 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG     // Catch:{ all -> 0x0d79 }
            if (r2 != 0) goto L_0x001e
            boolean r2 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED     // Catch:{ all -> 0x0d79 }
            if (r2 != 0) goto L_0x001e
            boolean r2 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_BLUE     // Catch:{ all -> 0x0d79 }
            if (r2 != 0) goto L_0x001e
            boolean r2 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_PURPLE     // Catch:{ all -> 0x0d79 }
            if (r2 == 0) goto L_0x001c
            goto L_0x001e
        L_0x001c:
            r2 = 0
            goto L_0x001f
        L_0x001e:
            r2 = 1
        L_0x001f:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r5 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()     // Catch:{ all -> 0x0d79 }
            java.lang.String r6 = "LastScanIsLinkify"
            boolean r5 = r5.decodeBool(r6, r4)     // Catch:{ all -> 0x0d79 }
            f301837f = r5     // Catch:{ all -> 0x0d79 }
            java.lang.String r5 = "MicroMsg.CalcWxNewService"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0d79 }
            r6.<init>()     // Catch:{ all -> 0x0d79 }
            java.lang.String r7 = "lastScanIsLinkify = "
            r6.append(r7)     // Catch:{ all -> 0x0d79 }
            boolean r7 = f301837f     // Catch:{ all -> 0x0d79 }
            r6.append(r7)     // Catch:{ all -> 0x0d79 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0d79 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)     // Catch:{ all -> 0x0d79 }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0d79 }
            yy0.b r7 = r102.mo142120e()     // Catch:{ all -> 0x0d79 }
            r8 = 65536(0x10000, float:9.18355E-41)
            r9 = 0
            long r11 = r7.mo142688LL(r8, r9)     // Catch:{ all -> 0x0d79 }
            r13 = 604800000(0x240c8400, double:2.988109026E-315)
            long r11 = r11 + r13
            long r11 = r11 - r5
            if (r2 != 0) goto L_0x0085
            int r7 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r7 <= 0) goto L_0x0085
            boolean r7 = f301837f     // Catch:{ all -> 0x0d79 }
            if (r7 != 0) goto L_0x0085
            java.lang.String r1 = "MicroMsg.CalcWxNewService"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0d79 }
            r2.<init>()     // Catch:{ all -> 0x0d79 }
            java.lang.String r3 = "Skip handle duplicated because interval not match. ("
            r2.append(r3)     // Catch:{ all -> 0x0d79 }
            r3 = 60000(0xea60, float:8.4078E-41)
            long r3 = (long) r3     // Catch:{ all -> 0x0d79 }
            long r11 = r11 / r3
            r2.append(r11)     // Catch:{ all -> 0x0d79 }
            java.lang.String r3 = " min remaining)"
            r2.append(r3)     // Catch:{ all -> 0x0d79 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0d79 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)     // Catch:{ all -> 0x0d79 }
            monitor-exit(r102)
            return
        L_0x0085:
            r102.mo142125k(r103)     // Catch:{ all -> 0x0d79 }
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0d79 }
            boolean r7 = wy0.C102519e.m135324f()     // Catch:{ all -> 0x0d79 }
            if (r7 != 0) goto L_0x009b
            if (r2 != 0) goto L_0x009b
            boolean r7 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED     // Catch:{ all -> 0x0d79 }
            if (r7 == 0) goto L_0x0099
            goto L_0x009b
        L_0x0099:
            r7 = 0
            goto L_0x009c
        L_0x009b:
            r7 = 1
        L_0x009c:
            boolean r13 = wy0.C102519e.m135319a()     // Catch:{ all -> 0x0d79 }
            if (r13 != 0) goto L_0x00ab
            if (r2 != 0) goto L_0x00ab
            boolean r13 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED     // Catch:{ all -> 0x0d79 }
            if (r13 == 0) goto L_0x00a9
            goto L_0x00ab
        L_0x00a9:
            r13 = 0
            goto L_0x00ac
        L_0x00ab:
            r13 = 1
        L_0x00ac:
            boolean r14 = wy0.C102519e.m135321c()     // Catch:{ all -> 0x0d79 }
            if (r14 != 0) goto L_0x00bb
            if (r2 != 0) goto L_0x00bb
            boolean r2 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED     // Catch:{ all -> 0x0d79 }
            if (r2 == 0) goto L_0x00b9
            goto L_0x00bb
        L_0x00b9:
            r2 = 0
            goto L_0x00bc
        L_0x00bb:
            r2 = 1
        L_0x00bc:
            java.lang.String r14 = "MicroMsg.CalcWxNewService"
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ all -> 0x0d79 }
            r15.<init>()     // Catch:{ all -> 0x0d79 }
            java.lang.String r8 = "willLinkify = "
            r15.append(r8)     // Catch:{ all -> 0x0d79 }
            r15.append(r7)     // Catch:{ all -> 0x0d79 }
            java.lang.String r8 = ", attachmentMigration = "
            r15.append(r8)     // Catch:{ all -> 0x0d79 }
            r15.append(r3)     // Catch:{ all -> 0x0d79 }
            java.lang.String r8 = ", videoMigration = "
            r15.append(r8)     // Catch:{ all -> 0x0d79 }
            r15.append(r3)     // Catch:{ all -> 0x0d79 }
            java.lang.String r8 = ", attachmentWillLinkify = "
            r15.append(r8)     // Catch:{ all -> 0x0d79 }
            r15.append(r13)     // Catch:{ all -> 0x0d79 }
            java.lang.String r8 = r15.toString()     // Catch:{ all -> 0x0d79 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r8)     // Catch:{ all -> 0x0d79 }
            wy0.l r8 = wy0.C102520l.f301871a     // Catch:{ all -> 0x0d79 }
            r8.mo142134a()     // Catch:{ all -> 0x0d79 }
            yy0.b r8 = r102.mo142120e()     // Catch:{ all -> 0x0d79 }
            android.database.Cursor r8 = r8.mo142693TE()     // Catch:{ all -> 0x0d79 }
            r14 = r9
            r18 = r14
            r20 = r18
            r22 = r20
            r24 = r22
            r26 = r24
            r28 = r26
            r30 = r28
            r32 = r30
            r34 = r32
            r36 = r34
            r38 = r36
            r40 = r38
            r42 = r40
            r44 = r42
            r46 = r44
            r48 = r46
            r50 = r48
            r52 = r50
            r54 = r52
            r56 = r54
            r58 = r56
            r60 = r58
            r62 = r60
        L_0x0127:
            boolean r64 = r8.moveToNext()     // Catch:{ all -> 0x0d6f }
            r65 = 5
            if (r64 == 0) goto L_0x0949
            if (r1 == 0) goto L_0x0142
            boolean r64 = r103.isCanceled()     // Catch:{ all -> 0x0944 }
            if (r64 == 0) goto L_0x0142
            java.lang.String r2 = "MicroMsg.CalcWxNewService"
            java.lang.String r7 = "cs isCanceled, stop linkify"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r7)     // Catch:{ all -> 0x0944 }
            f301838g = r3     // Catch:{ all -> 0x0944 }
            goto L_0x0949
        L_0x0142:
            boolean r64 = f301839h     // Catch:{ all -> 0x0944 }
            if (r64 != 0) goto L_0x0152
            java.lang.String r2 = "MicroMsg.CalcWxNewService"
            java.lang.String r7 = "screenOff = false, stop linkify"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r7)     // Catch:{ all -> 0x0944 }
            f301838g = r3     // Catch:{ all -> 0x0944 }
            goto L_0x0949
        L_0x0152:
            r3 = 0
            java.lang.String r4 = r8.getString(r3)     // Catch:{ all -> 0x0944 }
            java.lang.String r3 = "pathsString"
            gy3.C87412m.m108593f(r4, r3)     // Catch:{ all -> 0x0944 }
            java.lang.String r3 = "Download"
            r72 = r5
            r1 = 0
            r5 = 0
            r6 = 2
            boolean r3 = z04.C112550d0.m153803w(r4, r3, r1, r6, r5)     // Catch:{ all -> 0x0944 }
            r5 = 1
            char[] r6 = new char[r5]     // Catch:{ all -> 0x0944 }
            r5 = 124(0x7c, float:1.74E-43)
            r6[r1] = r5     // Catch:{ all -> 0x0944 }
            r68 = 0
            r69 = 0
            r70 = 6
            r71 = 0
            r66 = r4
            r67 = r6
            java.util.List r1 = z04.C112550d0.m153784T(r66, r67, r68, r69, r70, r71)     // Catch:{ all -> 0x0944 }
            r4 = 1
            java.lang.String r66 = r8.getString(r4)     // Catch:{ all -> 0x0944 }
            if (r66 == 0) goto L_0x019a
            char[] r6 = new char[r4]     // Catch:{ all -> 0x0944 }
            r4 = 0
            r6[r4] = r5     // Catch:{ all -> 0x0944 }
            r68 = 0
            r69 = 0
            r70 = 6
            r71 = 0
            r67 = r6
            java.util.List r4 = z04.C112550d0.m153784T(r66, r67, r68, r69, r70, r71)     // Catch:{ all -> 0x0944 }
            goto L_0x019c
        L_0x019a:
            sx3.f0 r4 = sx3.C64186f0.f181907d     // Catch:{ all -> 0x093c }
        L_0x019c:
            r6 = 2
            java.lang.String r66 = r8.getString(r6)     // Catch:{ all -> 0x0944 }
            if (r66 == 0) goto L_0x01ba
            r74 = r11
            r6 = 1
            char[] r11 = new char[r6]     // Catch:{ all -> 0x0944 }
            r6 = 0
            r11[r6] = r5     // Catch:{ all -> 0x0944 }
            r68 = 0
            r69 = 0
            r70 = 6
            r71 = 0
            r67 = r11
            java.util.List r5 = z04.C112550d0.m153784T(r66, r67, r68, r69, r70, r71)     // Catch:{ all -> 0x0944 }
            goto L_0x01be
        L_0x01ba:
            r74 = r11
            sx3.f0 r5 = sx3.C64186f0.f181907d     // Catch:{ all -> 0x093c }
        L_0x01be:
            r6 = 3
            int r11 = r8.getInt(r6)     // Catch:{ all -> 0x0944 }
            r66 = r9
            r6 = 4
            long r9 = r8.getLong(r6)     // Catch:{ all -> 0x0944 }
            int r6 = r1.size()     // Catch:{ all -> 0x0944 }
            if (r6 != r11) goto L_0x08f0
            r6 = 1
            if (r11 > r6) goto L_0x01d5
            goto L_0x08f0
        L_0x01d5:
            java.lang.String r6 = "MicroMsg.CalcWxNewService"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0944 }
            r12.<init>()     // Catch:{ all -> 0x0944 }
            r68 = r8
            java.lang.String r8 = "duplicate file, paths = "
            r12.append(r8)     // Catch:{ all -> 0x08ed }
            r12.append(r1)     // Catch:{ all -> 0x08ed }
            java.lang.String r8 = ", count = "
            r12.append(r8)     // Catch:{ all -> 0x08ed }
            r12.append(r11)     // Catch:{ all -> 0x08ed }
            java.lang.String r8 = ", size = "
            r12.append(r8)     // Catch:{ all -> 0x08ed }
            r12.append(r9)     // Catch:{ all -> 0x08ed }
            java.lang.String r8 = r12.toString()     // Catch:{ all -> 0x08ed }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r8)     // Catch:{ all -> 0x08ed }
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ all -> 0x08ed }
            r6.<init>()     // Catch:{ all -> 0x08ed }
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ all -> 0x08ed }
            r8.<init>()     // Catch:{ all -> 0x08ed }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x08ed }
            r12.<init>()     // Catch:{ all -> 0x08ed }
            r69 = r11
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x08ed }
            r11.<init>()     // Catch:{ all -> 0x08ed }
            r70 = r14
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x08ed }
            r14.<init>()     // Catch:{ all -> 0x08ed }
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ all -> 0x08ed }
            r15.<init>()     // Catch:{ all -> 0x08ed }
            r76 = r13
            java.util.HashSet r13 = new java.util.HashSet     // Catch:{ all -> 0x08ed }
            r13.<init>()     // Catch:{ all -> 0x08ed }
            java.util.ArrayList r77 = new java.util.ArrayList     // Catch:{ all -> 0x08ed }
            r77.<init>()     // Catch:{ all -> 0x08ed }
            if (r3 == 0) goto L_0x0257
            wy0.a r3 = f301832a     // Catch:{ all -> 0x08ed }
            java.lang.Object[] r3 = r3.mo142119d(r1)     // Catch:{ all -> 0x08ed }
            r78 = r13
            r64 = 1
            r13 = r3[r64]     // Catch:{ all -> 0x08ed }
            r79 = r6
            java.lang.String r6 = "null cannot be cast to non-null type kotlin.Boolean"
            gy3.C87412m.m108592e(r13, r6)     // Catch:{ all -> 0x08ed }
            java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch:{ all -> 0x08ed }
            boolean r6 = r13.booleanValue()     // Catch:{ all -> 0x08ed }
            r13 = 0
            r3 = r3[r13]     // Catch:{ all -> 0x08ed }
            java.lang.String r13 = "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.String>"
            gy3.C87412m.m108592e(r3, r13)     // Catch:{ all -> 0x08ed }
            java.util.List r77 = gy3.C24564k0.m30738b(r3)     // Catch:{ all -> 0x08ed }
            r3 = r77
            goto L_0x025e
        L_0x0257:
            r79 = r6
            r78 = r13
            r3 = r77
            r6 = 0
        L_0x025e:
            int r13 = r1.size()     // Catch:{ all -> 0x08ed }
            r77 = r8
            r80 = r24
            r8 = 0
            r82 = 0
            r24 = r22
            r22 = 0
        L_0x026d:
            r83 = 1
            if (r8 >= r13) goto L_0x0530
            java.lang.Object r85 = r1.get(r8)     // Catch:{ all -> 0x08ed }
            java.lang.String r85 = (java.lang.String) r85     // Catch:{ all -> 0x08ed }
            r94 = r13
            java.lang.String r13 = yy0.C102970a.m136114m2(r85)     // Catch:{ all -> 0x08ed }
            r85 = r12
            com.tencent.mm.vfs.b0 r12 = com.tencent.p014mm.vfs.C86013q1.m106453n(r13)     // Catch:{ all -> 0x08ed }
            if (r12 != 0) goto L_0x02b5
            java.lang.String r12 = "MicroMsg.CalcWxNewService"
            r95 = r14
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x08ed }
            r14.<init>()     // Catch:{ all -> 0x08ed }
            r96 = r11
            java.lang.String r11 = "file not found, fe = "
            r14.append(r11)     // Catch:{ all -> 0x08ed }
            r14.append(r13)     // Catch:{ all -> 0x08ed }
            java.lang.String r11 = r14.toString()     // Catch:{ all -> 0x08ed }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r11)     // Catch:{ all -> 0x08ed }
            r97 = r2
            r98 = r3
            r99 = r6
            r100 = r7
            r2 = r77
            r11 = r78
            r12 = r79
            r7 = r85
            r6 = r95
            r3 = r96
            goto L_0x0519
        L_0x02b5:
            r96 = r11
            r95 = r14
            java.lang.Object r11 = r1.get(r8)     // Catch:{ all -> 0x08ed }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x08ed }
            java.lang.String r14 = wy0.C102519e.m135323e(r11)     // Catch:{ all -> 0x08ed }
            if (r2 == 0) goto L_0x03fd
            r97 = r2
            java.lang.String r2 = "Download"
            boolean r2 = gy3.C87412m.m108589b(r14, r2)     // Catch:{ all -> 0x08ed }
            if (r2 == 0) goto L_0x03ff
            if (r7 == 0) goto L_0x03ff
            boolean r2 = f301837f     // Catch:{ all -> 0x08ed }
            if (r2 != 0) goto L_0x03ff
            if (r6 == 0) goto L_0x03ff
            r86 = 16384(0x4000, double:8.0948E-320)
            int r2 = (r9 > r86 ? 1 : (r9 == r86 ? 0 : -1))
            if (r2 < 0) goto L_0x03ff
            boolean r2 = r3.contains(r11)     // Catch:{ all -> 0x08ed }
            if (r2 != 0) goto L_0x03ff
            java.lang.String r2 = "MicroMsg.CalcWxNewService"
            java.lang.String r11 = "migrateFromDownload2Attachment start"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r11)     // Catch:{ all -> 0x08ed }
            java.lang.String r2 = com.tencent.p014mm.pluginsdk.model.app.C72695v.m85067i()     // Catch:{ all -> 0x08ed }
            java.lang.String r11 = com.tencent.p014mm.vfs.C86013q1.m106457r(r13)     // Catch:{ all -> 0x08ed }
            r98 = r3
            java.lang.String r3 = com.tencent.p014mm.vfs.C86013q1.m106454o(r13)     // Catch:{ all -> 0x08ed }
            r99 = r6
            java.lang.String r6 = "MicroMsg.CalcWxNewService"
            r100 = r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x08ed }
            r7.<init>()     // Catch:{ all -> 0x08ed }
            r101 = r12
            java.lang.String r12 = "download migrate, fullPath = "
            r7.append(r12)     // Catch:{ all -> 0x08ed }
            r7.append(r13)     // Catch:{ all -> 0x08ed }
            java.lang.String r12 = ", fileNameWithoutExt = "
            r7.append(r12)     // Catch:{ all -> 0x08ed }
            r7.append(r11)     // Catch:{ all -> 0x08ed }
            java.lang.String r12 = ", fileExt = "
            r7.append(r12)     // Catch:{ all -> 0x08ed }
            r7.append(r3)     // Catch:{ all -> 0x08ed }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x08ed }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)     // Catch:{ all -> 0x08ed }
            java.lang.String r2 = com.tencent.p014mm.pluginsdk.model.app.C72695v.m85063e(r2, r11, r3)     // Catch:{ all -> 0x08ed }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x08ed }
            r3.<init>()     // Catch:{ all -> 0x08ed }
            java.lang.String r6 = com.tencent.p014mm.vfs.C86013q1.m106457r(r2)     // Catch:{ all -> 0x08ed }
            r3.append(r6)     // Catch:{ all -> 0x08ed }
            r6 = 46
            r3.append(r6)     // Catch:{ all -> 0x08ed }
            java.lang.String r6 = com.tencent.p014mm.vfs.C86013q1.m106454o(r2)     // Catch:{ all -> 0x08ed }
            r3.append(r6)     // Catch:{ all -> 0x08ed }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x08ed }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x08ed }
            r6.<init>()     // Catch:{ all -> 0x08ed }
            java.lang.String r7 = "wcf://attachment/"
            r6.append(r7)     // Catch:{ all -> 0x08ed }
            r6.append(r3)     // Catch:{ all -> 0x08ed }
            java.lang.String r3 = r6.toString()     // Catch:{ all -> 0x08ed }
            java.lang.String r6 = "MicroMsg.CalcWxNewService"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x08ed }
            r7.<init>()     // Catch:{ all -> 0x08ed }
            java.lang.String r11 = "newAttachmentName = "
            r7.append(r11)     // Catch:{ all -> 0x08ed }
            r7.append(r2)     // Catch:{ all -> 0x08ed }
            java.lang.String r11 = ", indexFileName = "
            r7.append(r11)     // Catch:{ all -> 0x08ed }
            r7.append(r3)     // Catch:{ all -> 0x08ed }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x08ed }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)     // Catch:{ all -> 0x08ed }
            wy0.l r86 = wy0.C102520l.f301871a     // Catch:{ all -> 0x08ed }
            java.lang.Object r6 = r4.get(r8)     // Catch:{ all -> 0x08ed }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x08ed }
            long r87 = java.lang.Long.parseLong(r6)     // Catch:{ all -> 0x08ed }
            java.lang.Object r6 = r5.get(r8)     // Catch:{ all -> 0x08ed }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x08ed }
            long r89 = java.lang.Long.parseLong(r6)     // Catch:{ all -> 0x08ed }
            java.lang.String r6 = "fullPath"
            gy3.C87412m.m108593f(r13, r6)     // Catch:{ all -> 0x08ed }
            java.lang.String r6 = "newAttachmentName"
            gy3.C87412m.m108593f(r2, r6)     // Catch:{ all -> 0x08ed }
            r91 = r13
            r92 = r2
            r93 = r3
            int r6 = r86.mo142138e(r87, r89, r91, r92, r93)     // Catch:{ all -> 0x08ed }
            if (r6 < 0) goto L_0x03ba
            long r24 = r24 + r83
            long r80 = r80 + r9
            wy0.a$a r2 = new wy0.a$a     // Catch:{ all -> 0x08ed }
            java.lang.Object r6 = r4.get(r8)     // Catch:{ all -> 0x08ed }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x08ed }
            long r6 = java.lang.Long.parseLong(r6)     // Catch:{ all -> 0x08ed }
            r2.<init>(r6, r3)     // Catch:{ all -> 0x08ed }
            r15.add(r2)     // Catch:{ all -> 0x08ed }
            goto L_0x0407
        L_0x03ba:
            kj2.d r1 = kj2.C117407d.INSTANCE     // Catch:{ all -> 0x08ed }
            r3 = 6
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x08ed }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x08ed }
            r5 = 0
            r3[r5] = r4     // Catch:{ all -> 0x08ed }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x08ed }
            r5 = 1
            r3[r5] = r4     // Catch:{ all -> 0x08ed }
            java.lang.Long r4 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x08ed }
            r5 = 2
            r3[r5] = r4     // Catch:{ all -> 0x08ed }
            r4 = 3
            r3[r4] = r13     // Catch:{ all -> 0x08ed }
            r4 = 4
            r3[r4] = r2     // Catch:{ all -> 0x08ed }
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x08ed }
            r3[r65] = r2     // Catch:{ all -> 0x08ed }
            r2 = 26980(0x6964, float:3.7807E-41)
            r1.mo160131h(r2, r3)     // Catch:{ all -> 0x08ed }
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x08ed }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x08ed }
            r2.<init>()     // Catch:{ all -> 0x08ed }
            java.lang.String r3 = "Migrate Download Linkify Failed ret = "
            r2.append(r3)     // Catch:{ all -> 0x08ed }
            r2.append(r6)     // Catch:{ all -> 0x08ed }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x08ed }
            r1.<init>(r2)     // Catch:{ all -> 0x08ed }
            throw r1     // Catch:{ all -> 0x08ed }
        L_0x03fd:
            r97 = r2
        L_0x03ff:
            r98 = r3
            r99 = r6
            r100 = r7
            r101 = r12
        L_0x0407:
            int r2 = r14.hashCode()     // Catch:{ all -> 0x08ed }
            switch(r2) {
                case -1963501277: goto L_0x0491;
                case -1185250761: goto L_0x0467;
                case -934908847: goto L_0x043b;
                case 112202875: goto L_0x0416;
                default: goto L_0x040e;
            }     // Catch:{ all -> 0x08ed }
        L_0x040e:
            r7 = r85
            r6 = r95
            r3 = r96
            goto L_0x04b8
        L_0x0416:
            java.lang.String r2 = "video"
            boolean r2 = r14.equals(r2)     // Catch:{ all -> 0x08ed }
            if (r2 != 0) goto L_0x0420
            goto L_0x040e
        L_0x0420:
            wy0.a$a r2 = new wy0.a$a     // Catch:{ all -> 0x08ed }
            java.lang.Object r3 = r4.get(r8)     // Catch:{ all -> 0x08ed }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x08ed }
            long r6 = java.lang.Long.parseLong(r3)     // Catch:{ all -> 0x08ed }
            java.lang.Object r3 = r1.get(r8)     // Catch:{ all -> 0x08ed }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x08ed }
            r2.<init>(r6, r3)     // Catch:{ all -> 0x08ed }
            r3 = r96
            r3.add(r2)     // Catch:{ all -> 0x08ed }
            goto L_0x0446
        L_0x043b:
            r3 = r96
            java.lang.String r2 = "record"
            boolean r2 = r14.equals(r2)     // Catch:{ all -> 0x08ed }
            if (r2 != 0) goto L_0x044c
        L_0x0446:
            r7 = r85
            r6 = r95
            goto L_0x04b8
        L_0x044c:
            wy0.a$a r2 = new wy0.a$a     // Catch:{ all -> 0x08ed }
            java.lang.Object r6 = r4.get(r8)     // Catch:{ all -> 0x08ed }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x08ed }
            long r6 = java.lang.Long.parseLong(r6)     // Catch:{ all -> 0x08ed }
            java.lang.Object r11 = r1.get(r8)     // Catch:{ all -> 0x08ed }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x08ed }
            r2.<init>(r6, r11)     // Catch:{ all -> 0x08ed }
            r6 = r95
            r6.add(r2)     // Catch:{ all -> 0x08ed }
            goto L_0x048e
        L_0x0467:
            r6 = r95
            r3 = r96
            java.lang.String r2 = "image2"
            boolean r2 = r14.equals(r2)     // Catch:{ all -> 0x08ed }
            if (r2 == 0) goto L_0x048e
            wy0.a$a r2 = new wy0.a$a     // Catch:{ all -> 0x08ed }
            java.lang.Object r7 = r4.get(r8)     // Catch:{ all -> 0x08ed }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x08ed }
            long r11 = java.lang.Long.parseLong(r7)     // Catch:{ all -> 0x08ed }
            java.lang.Object r7 = r1.get(r8)     // Catch:{ all -> 0x08ed }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x08ed }
            r2.<init>(r11, r7)     // Catch:{ all -> 0x08ed }
            r7 = r85
            r7.add(r2)     // Catch:{ all -> 0x08ed }
            goto L_0x04b8
        L_0x048e:
            r7 = r85
            goto L_0x04b8
        L_0x0491:
            r7 = r85
            r6 = r95
            r3 = r96
            java.lang.String r2 = "attachment"
            boolean r2 = r14.equals(r2)     // Catch:{ all -> 0x08ed }
            if (r2 != 0) goto L_0x04a0
            goto L_0x04b8
        L_0x04a0:
            wy0.a$a r2 = new wy0.a$a     // Catch:{ all -> 0x08ed }
            java.lang.Object r11 = r4.get(r8)     // Catch:{ all -> 0x08ed }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x08ed }
            long r11 = java.lang.Long.parseLong(r11)     // Catch:{ all -> 0x08ed }
            java.lang.Object r14 = r1.get(r8)     // Catch:{ all -> 0x08ed }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x08ed }
            r2.<init>(r11, r14)     // Catch:{ all -> 0x08ed }
            r15.add(r2)     // Catch:{ all -> 0x08ed }
        L_0x04b8:
            if (r8 != 0) goto L_0x04c1
            r2 = r101
            long r11 = r2.f250473c     // Catch:{ all -> 0x08ed }
            r22 = r11
            goto L_0x04c3
        L_0x04c1:
            r2 = r101
        L_0x04c3:
            boolean r2 = r2.mo119956c()     // Catch:{ all -> 0x08ed }
            if (r2 == 0) goto L_0x0501
            r2 = 1
            java.lang.String r11 = com.tencent.p014mm.vfs.C86013q1.m106448i(r13, r2)     // Catch:{ all -> 0x08ed }
            java.lang.String r2 = "fullPath"
            gy3.C87412m.m108593f(r13, r2)     // Catch:{ all -> 0x08ed }
            r2 = r77
            r2.put(r11, r13)     // Catch:{ all -> 0x08ed }
            r12 = r79
            boolean r13 = r12.containsKey(r11)     // Catch:{ all -> 0x08ed }
            if (r13 == 0) goto L_0x04f7
            java.lang.Object r13 = r12.get(r11)     // Catch:{ all -> 0x08ed }
            gy3.C87412m.m108591d(r13)     // Catch:{ all -> 0x08ed }
            java.lang.Number r13 = (java.lang.Number) r13     // Catch:{ all -> 0x08ed }
            long r13 = r13.longValue()     // Catch:{ all -> 0x08ed }
            long r13 = r13 + r83
            java.lang.Long r13 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x08ed }
            r12.put(r11, r13)     // Catch:{ all -> 0x08ed }
            goto L_0x04fe
        L_0x04f7:
            java.lang.Long r13 = java.lang.Long.valueOf(r83)     // Catch:{ all -> 0x08ed }
            r12.put(r11, r13)     // Catch:{ all -> 0x08ed }
        L_0x04fe:
            r11 = r78
            goto L_0x0515
        L_0x0501:
            r2 = r77
            r11 = r78
            r12 = r79
            boolean r14 = r11.contains(r13)     // Catch:{ all -> 0x08ed }
            if (r14 != 0) goto L_0x0515
            r14 = r82
            int r82 = r14 + 1
            r11.add(r13)     // Catch:{ all -> 0x08ed }
            goto L_0x0519
        L_0x0515:
            r14 = r82
            r82 = r14
        L_0x0519:
            int r8 = r8 + 1
            r77 = r2
            r14 = r6
            r78 = r11
            r79 = r12
            r13 = r94
            r2 = r97
            r6 = r99
            r11 = r3
            r12 = r7
            r3 = r98
            r7 = r100
            goto L_0x026d
        L_0x0530:
            r97 = r2
            r100 = r7
            r3 = r11
            r7 = r12
            r6 = r14
            r12 = r79
            r14 = r82
            long r4 = (long) r14     // Catch:{ all -> 0x08ed }
            int r2 = r12.size()     // Catch:{ all -> 0x08ed }
            r77 = r9
            long r8 = (long) r2     // Catch:{ all -> 0x08ed }
            long r4 = r4 + r8
            long r4 = r4 - r83
            long r4 = r4 * r22
            java.lang.String r2 = "MicroMsg.CalcWxNewService"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x08ed }
            r8.<init>()     // Catch:{ all -> 0x08ed }
            java.lang.String r9 = "realFileCount = "
            r8.append(r9)     // Catch:{ all -> 0x08ed }
            r8.append(r14)     // Catch:{ all -> 0x08ed }
            java.lang.String r9 = ", realPathMap.size = "
            r8.append(r9)     // Catch:{ all -> 0x08ed }
            int r9 = r12.size()     // Catch:{ all -> 0x08ed }
            long r9 = (long) r9     // Catch:{ all -> 0x08ed }
            r8.append(r9)     // Catch:{ all -> 0x08ed }
            java.lang.String r9 = ", duplicateDiskSpaceOnce = "
            r8.append(r9)     // Catch:{ all -> 0x08ed }
            r8.append(r4)     // Catch:{ all -> 0x08ed }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x08ed }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r8)     // Catch:{ all -> 0x08ed }
            java.lang.String r2 = "MicroMsg.CalcWxNewService"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x08ed }
            r8.<init>()     // Catch:{ all -> 0x08ed }
            java.lang.String r9 = "imageSize = "
            r8.append(r9)     // Catch:{ all -> 0x08ed }
            int r9 = r7.size()     // Catch:{ all -> 0x08ed }
            r8.append(r9)     // Catch:{ all -> 0x08ed }
            java.lang.String r9 = ", videoSize = "
            r8.append(r9)     // Catch:{ all -> 0x08ed }
            int r9 = r3.size()     // Catch:{ all -> 0x08ed }
            r8.append(r9)     // Catch:{ all -> 0x08ed }
            java.lang.String r9 = ", recordSize = "
            r8.append(r9)     // Catch:{ all -> 0x08ed }
            int r9 = r6.size()     // Catch:{ all -> 0x08ed }
            r8.append(r9)     // Catch:{ all -> 0x08ed }
            java.lang.String r9 = ", attachment = "
            r8.append(r9)     // Catch:{ all -> 0x08ed }
            int r9 = r15.size()     // Catch:{ all -> 0x08ed }
            r8.append(r9)     // Catch:{ all -> 0x08ed }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x08ed }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r8)     // Catch:{ all -> 0x08ed }
            if (r100 == 0) goto L_0x0728
            boolean r2 = f301837f     // Catch:{ all -> 0x08ed }
            if (r2 != 0) goto L_0x0728
            int r2 = r7.size()     // Catch:{ all -> 0x08ed }
            r8 = 1
            if (r2 <= r8) goto L_0x0613
            wy0.a r2 = f301832a     // Catch:{ all -> 0x08ed }
            java.lang.Long[] r2 = r2.mo142122g(r7, r8)     // Catch:{ all -> 0x08ed }
            java.lang.String r7 = "MicroMsg.CalcWxNewService"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x08ed }
            r8.<init>()     // Catch:{ all -> 0x08ed }
            java.lang.String r9 = "handleDuplicatedOneDir image2, count = "
            r8.append(r9)     // Catch:{ all -> 0x08ed }
            r9 = 0
            r10 = r2[r9]     // Catch:{ all -> 0x08ed }
            long r9 = r10.longValue()     // Catch:{ all -> 0x08ed }
            r8.append(r9)     // Catch:{ all -> 0x08ed }
            java.lang.String r9 = ", size = "
            r8.append(r9)     // Catch:{ all -> 0x08ed }
            r9 = 1
            r10 = r2[r9]     // Catch:{ all -> 0x08ed }
            long r9 = r10.longValue()     // Catch:{ all -> 0x08ed }
            r8.append(r9)     // Catch:{ all -> 0x08ed }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x08ed }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)     // Catch:{ all -> 0x08ed }
            r7 = 0
            r8 = r2[r7]     // Catch:{ all -> 0x08ed }
            long r8 = r8.longValue()     // Catch:{ all -> 0x08ed }
            long r26 = r26 + r8
            r8 = 1
            r9 = r2[r8]     // Catch:{ all -> 0x08ed }
            long r9 = r9.longValue()     // Catch:{ all -> 0x08ed }
            long r28 = r28 + r9
            r9 = r2[r7]     // Catch:{ all -> 0x08ed }
            long r9 = r9.longValue()     // Catch:{ all -> 0x08ed }
            long r18 = r18 + r9
            r2 = r2[r8]     // Catch:{ all -> 0x08ed }
            long r7 = r2.longValue()     // Catch:{ all -> 0x08ed }
            long r20 = r20 + r7
        L_0x0613:
            int r2 = r3.size()     // Catch:{ all -> 0x08ed }
            r7 = 1
            if (r2 <= r7) goto L_0x066f
            wy0.a r2 = f301832a     // Catch:{ all -> 0x08ed }
            r7 = 0
            java.lang.Long[] r2 = r2.mo142122g(r3, r7)     // Catch:{ all -> 0x08ed }
            java.lang.String r3 = "MicroMsg.CalcWxNewService"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x08ed }
            r7.<init>()     // Catch:{ all -> 0x08ed }
            java.lang.String r8 = "handleDuplicatedOneDir video, count = "
            r7.append(r8)     // Catch:{ all -> 0x08ed }
            r8 = 0
            r9 = r2[r8]     // Catch:{ all -> 0x08ed }
            long r8 = r9.longValue()     // Catch:{ all -> 0x08ed }
            r7.append(r8)     // Catch:{ all -> 0x08ed }
            java.lang.String r8 = ", size = "
            r7.append(r8)     // Catch:{ all -> 0x08ed }
            r8 = 1
            r9 = r2[r8]     // Catch:{ all -> 0x08ed }
            long r8 = r9.longValue()     // Catch:{ all -> 0x08ed }
            r7.append(r8)     // Catch:{ all -> 0x08ed }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x08ed }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r7)     // Catch:{ all -> 0x08ed }
            r3 = 0
            r7 = r2[r3]     // Catch:{ all -> 0x08ed }
            long r7 = r7.longValue()     // Catch:{ all -> 0x08ed }
            long r30 = r30 + r7
            r7 = 1
            r8 = r2[r7]     // Catch:{ all -> 0x08ed }
            long r8 = r8.longValue()     // Catch:{ all -> 0x08ed }
            long r32 = r32 + r8
            r8 = r2[r3]     // Catch:{ all -> 0x08ed }
            long r8 = r8.longValue()     // Catch:{ all -> 0x08ed }
            long r18 = r18 + r8
            r2 = r2[r7]     // Catch:{ all -> 0x08ed }
            long r2 = r2.longValue()     // Catch:{ all -> 0x08ed }
            long r20 = r20 + r2
        L_0x066f:
            int r2 = r6.size()     // Catch:{ all -> 0x08ed }
            r3 = 1
            if (r2 <= r3) goto L_0x06ca
            wy0.a r2 = f301832a     // Catch:{ all -> 0x08ed }
            java.lang.Long[] r2 = r2.mo142122g(r6, r3)     // Catch:{ all -> 0x08ed }
            java.lang.String r3 = "MicroMsg.CalcWxNewService"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x08ed }
            r6.<init>()     // Catch:{ all -> 0x08ed }
            java.lang.String r7 = "handleDuplicatedOneDir record, count = "
            r6.append(r7)     // Catch:{ all -> 0x08ed }
            r7 = 0
            r8 = r2[r7]     // Catch:{ all -> 0x08ed }
            long r7 = r8.longValue()     // Catch:{ all -> 0x08ed }
            r6.append(r7)     // Catch:{ all -> 0x08ed }
            java.lang.String r7 = ", size = "
            r6.append(r7)     // Catch:{ all -> 0x08ed }
            r7 = 1
            r8 = r2[r7]     // Catch:{ all -> 0x08ed }
            long r7 = r8.longValue()     // Catch:{ all -> 0x08ed }
            r6.append(r7)     // Catch:{ all -> 0x08ed }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x08ed }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r6)     // Catch:{ all -> 0x08ed }
            r3 = 0
            r6 = r2[r3]     // Catch:{ all -> 0x08ed }
            long r6 = r6.longValue()     // Catch:{ all -> 0x08ed }
            long r34 = r34 + r6
            r6 = 1
            r7 = r2[r6]     // Catch:{ all -> 0x08ed }
            long r7 = r7.longValue()     // Catch:{ all -> 0x08ed }
            long r36 = r36 + r7
            r7 = r2[r3]     // Catch:{ all -> 0x08ed }
            long r7 = r7.longValue()     // Catch:{ all -> 0x08ed }
            long r18 = r18 + r7
            r2 = r2[r6]     // Catch:{ all -> 0x08ed }
            long r2 = r2.longValue()     // Catch:{ all -> 0x08ed }
            long r20 = r20 + r2
        L_0x06ca:
            if (r76 == 0) goto L_0x0728
            int r2 = r15.size()     // Catch:{ all -> 0x08ed }
            r3 = 1
            if (r2 <= r3) goto L_0x0728
            wy0.a r2 = f301832a     // Catch:{ all -> 0x08ed }
            r3 = 0
            java.lang.Long[] r2 = r2.mo142122g(r15, r3)     // Catch:{ all -> 0x08ed }
            java.lang.String r3 = "MicroMsg.CalcWxNewService"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x08ed }
            r6.<init>()     // Catch:{ all -> 0x08ed }
            java.lang.String r7 = "handleDuplicatedOneDir attachment, count = "
            r6.append(r7)     // Catch:{ all -> 0x08ed }
            r7 = 0
            r8 = r2[r7]     // Catch:{ all -> 0x08ed }
            long r7 = r8.longValue()     // Catch:{ all -> 0x08ed }
            r6.append(r7)     // Catch:{ all -> 0x08ed }
            java.lang.String r7 = ", size = "
            r6.append(r7)     // Catch:{ all -> 0x08ed }
            r7 = 1
            r8 = r2[r7]     // Catch:{ all -> 0x08ed }
            long r7 = r8.longValue()     // Catch:{ all -> 0x08ed }
            r6.append(r7)     // Catch:{ all -> 0x08ed }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x08ed }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r6)     // Catch:{ all -> 0x08ed }
            r3 = 0
            r6 = r2[r3]     // Catch:{ all -> 0x08ed }
            long r6 = r6.longValue()     // Catch:{ all -> 0x08ed }
            long r38 = r38 + r6
            r6 = 1
            r7 = r2[r6]     // Catch:{ all -> 0x08ed }
            long r7 = r7.longValue()     // Catch:{ all -> 0x08ed }
            long r40 = r40 + r7
            r7 = r2[r3]     // Catch:{ all -> 0x08ed }
            long r7 = r7.longValue()     // Catch:{ all -> 0x08ed }
            long r18 = r18 + r7
            r2 = r2[r6]     // Catch:{ all -> 0x08ed }
            long r2 = r2.longValue()     // Catch:{ all -> 0x08ed }
            long r20 = r20 + r2
        L_0x0728:
            boolean r2 = f301838g     // Catch:{ all -> 0x08ed }
            if (r2 == 0) goto L_0x0753
            java.lang.String r1 = "MicroMsg.CalcWxNewService"
            java.lang.String r2 = "getDuplicatedFiles willBreakLinkify"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)     // Catch:{ all -> 0x08ed }
            r9 = r18
            r1 = r20
            r22 = r24
            r11 = r44
            r18 = r46
            r44 = r50
            r50 = r52
            r5 = r54
            r7 = r56
            r3 = r58
            r13 = r60
            r24 = r80
            r46 = r42
            r42 = r48
            r48 = r62
            goto L_0x0971
        L_0x0753:
            r2 = 0
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x08ed }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x08ed }
            java.lang.String r1 = wy0.C102519e.m135323e(r1)     // Catch:{ all -> 0x08ed }
            int r2 = r1.hashCode()     // Catch:{ all -> 0x08ed }
            switch(r2) {
                case -1963501277: goto L_0x087b;
                case -1263192176: goto L_0x084e;
                case -1185250761: goto L_0x082e;
                case -934908847: goto L_0x080a;
                case -810990272: goto L_0x07e8;
                case 112202875: goto L_0x07c4;
                case 1050790300: goto L_0x07a6;
                case 1336193489: goto L_0x078a;
                case 1492462760: goto L_0x0775;
                default: goto L_0x0765;
            }     // Catch:{ all -> 0x08ed }
        L_0x0765:
            r6 = r42
            r11 = r44
            r1 = r46
            r42 = r48
            r44 = r50
            r9 = r52
        L_0x0771:
            r13 = r60
            goto L_0x08ad
        L_0x0775:
            java.lang.String r2 = "Download"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x08ed }
            if (r1 != 0) goto L_0x0780
            r9 = r52
            goto L_0x0794
        L_0x0780:
            r9 = r52
            long r52 = r9 + r4
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x08ed }
            r11 = r44
            goto L_0x0876
        L_0x078a:
            r9 = r52
            java.lang.String r2 = "emulated"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x08ed }
            if (r1 != 0) goto L_0x079f
        L_0x0794:
            r6 = r42
            r11 = r44
            r1 = r46
            r42 = r48
            r44 = r50
            goto L_0x0771
        L_0x079f:
            r2 = r48
            long r48 = r2 + r4
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x08ed }
            goto L_0x07c0
        L_0x07a6:
            r2 = r48
            r9 = r52
            java.lang.String r6 = "favorite"
            boolean r1 = r1.equals(r6)     // Catch:{ all -> 0x08ed }
            if (r1 != 0) goto L_0x07b8
            r11 = r44
            r6 = r50
            goto L_0x083e
        L_0x07b8:
            r6 = r50
            long r50 = r6 + r4
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x08ed }
            r48 = r2
        L_0x07c0:
            r11 = r44
            goto L_0x084b
        L_0x07c4:
            r2 = r48
            r6 = r50
            r9 = r52
            java.lang.String r8 = "video"
            boolean r1 = r1.equals(r8)     // Catch:{ all -> 0x08ed }
            if (r1 != 0) goto L_0x07d6
            r11 = r44
            goto L_0x081b
        L_0x07d6:
            r11 = r44
            long r44 = r11 + r4
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x08ed }
            r48 = r2
            r50 = r6
            r52 = r9
            r9 = r66
            r14 = r70
            goto L_0x08c6
        L_0x07e8:
            r11 = r44
            r2 = r48
            r6 = r50
            r9 = r52
            java.lang.String r8 = "voice2"
            boolean r1 = r1.equals(r8)     // Catch:{ all -> 0x08ed }
            if (r1 != 0) goto L_0x07fa
            goto L_0x081b
        L_0x07fa:
            long r14 = r70 + r4
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x08ed }
            r48 = r2
            r50 = r6
            r52 = r9
            r1 = r46
            r9 = r66
            goto L_0x08c3
        L_0x080a:
            r11 = r44
            r2 = r48
            r6 = r50
            r9 = r52
            java.lang.String r8 = "record"
            boolean r1 = r1.equals(r8)     // Catch:{ all -> 0x08ed }
            if (r1 != 0) goto L_0x0823
        L_0x081b:
            r44 = r6
            r6 = r42
            r13 = r60
            goto L_0x088f
        L_0x0823:
            long r13 = r66 + r4
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x08ed }
            r48 = r2
            r50 = r6
            r66 = r13
            goto L_0x084b
        L_0x082e:
            r11 = r44
            r2 = r48
            r6 = r50
            r9 = r52
            java.lang.String r8 = "image2"
            boolean r1 = r1.equals(r8)     // Catch:{ all -> 0x08ed }
            if (r1 != 0) goto L_0x0841
        L_0x083e:
            r13 = r60
            goto L_0x0861
        L_0x0841:
            r13 = r60
            long r60 = r13 + r4
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x08ed }
            r48 = r2
            r50 = r6
        L_0x084b:
            r52 = r9
            goto L_0x0876
        L_0x084e:
            r11 = r44
            r2 = r48
            r6 = r50
            r9 = r52
            r13 = r60
            java.lang.String r8 = "openapi"
            boolean r1 = r1.equals(r8)     // Catch:{ all -> 0x08ed }
            if (r1 != 0) goto L_0x0866
        L_0x0861:
            r44 = r6
            r6 = r42
            goto L_0x088f
        L_0x0866:
            r44 = r6
            r6 = r42
            long r42 = r6 + r4
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x08ed }
            r48 = r2
            r52 = r9
            r60 = r13
            r50 = r44
        L_0x0876:
            r9 = r66
            r1 = r46
            goto L_0x08c1
        L_0x087b:
            r6 = r42
            r11 = r44
            r2 = r48
            r44 = r50
            r9 = r52
            r13 = r60
            java.lang.String r8 = "attachment"
            boolean r1 = r1.equals(r8)     // Catch:{ all -> 0x08ed }
            if (r1 != 0) goto L_0x0894
        L_0x088f:
            r42 = r2
            r1 = r46
            goto L_0x08ad
        L_0x0894:
            r42 = r2
            r1 = r46
            long r46 = r1 + r4
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x08ed }
            r52 = r9
            r60 = r13
            r48 = r42
            r50 = r44
            r9 = r66
            r14 = r70
            r42 = r6
        L_0x08aa:
            r44 = r11
            goto L_0x08c6
        L_0x08ad:
            r46 = r6
            r6 = r62
            long r62 = r6 + r4
            rx3.b0 r3 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x08ed }
            r52 = r9
            r60 = r13
            r48 = r42
            r50 = r44
            r42 = r46
            r9 = r66
        L_0x08c1:
            r14 = r70
        L_0x08c3:
            r46 = r1
            goto L_0x08aa
        L_0x08c6:
            int r11 = r69 + -1
            long r1 = (long) r11
            r6 = r54
            long r54 = r6 + r1
            long r1 = r1 * r77
            r6 = r56
            long r56 = r6 + r1
            r1 = r58
            long r58 = r1 + r4
            r1 = r103
            r22 = r24
            r8 = r68
            r5 = r72
            r11 = r74
            r13 = r76
            r24 = r80
            r2 = r97
            r7 = r100
            r3 = 1
            r4 = 0
            goto L_0x0127
        L_0x08ed:
            r0 = move-exception
        L_0x08ee:
            r1 = r0
            goto L_0x0940
        L_0x08f0:
            r97 = r2
            r100 = r7
            r68 = r8
            r76 = r13
            r70 = r14
            r11 = r44
            r1 = r46
            r44 = r50
            r9 = r52
            r5 = r54
            r7 = r56
            r3 = r58
            r13 = r60
            r46 = r42
            r42 = r48
            r48 = r62
            r58 = r3
            r54 = r5
            r56 = r7
            r52 = r9
            r60 = r13
            r50 = r44
            r62 = r48
            r9 = r66
            r8 = r68
            r14 = r70
            r5 = r72
            r13 = r76
            r7 = r100
            r3 = 1
            r4 = 0
            r44 = r11
            r48 = r42
            r42 = r46
            r11 = r74
            r46 = r1
            r2 = r97
            r1 = r103
            goto L_0x0127
        L_0x093c:
            r0 = move-exception
            r68 = r8
            goto L_0x08ee
        L_0x0940:
            r15 = r68
            goto L_0x0d72
        L_0x0944:
            r0 = move-exception
            r1 = r0
            r15 = r8
            goto L_0x0d72
        L_0x0949:
            r72 = r5
            r68 = r8
            r66 = r9
            r74 = r11
            r70 = r14
            r11 = r44
            r1 = r46
            r44 = r50
            r9 = r52
            r5 = r54
            r7 = r56
            r3 = r58
            r13 = r60
            r46 = r42
            r42 = r48
            r48 = r62
            r50 = r9
            r9 = r18
            r18 = r1
            r1 = r20
        L_0x0971:
            rx3.b0 r15 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0d6b }
            r20 = r11
            r15 = r68
            r11 = 0
            cy3.C58003b.m67160a(r15, r11)     // Catch:{ all -> 0x0d79 }
            r11 = 0
            int r15 = (r22 > r11 ? 1 : (r22 == r11 ? 0 : -1))
            if (r15 <= 0) goto L_0x09b8
            kj2.d r11 = kj2.C117407d.INSTANCE     // Catch:{ all -> 0x0d79 }
            r12 = 6
            java.lang.Object[] r15 = new java.lang.Object[r12]     // Catch:{ all -> 0x0d79 }
            r12 = 400(0x190, float:5.6E-43)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0d79 }
            r52 = 0
            r15[r52] = r12     // Catch:{ all -> 0x0d79 }
            java.lang.Long r12 = java.lang.Long.valueOf(r22)     // Catch:{ all -> 0x0d79 }
            r22 = 1
            r15[r22] = r12     // Catch:{ all -> 0x0d79 }
            java.lang.Long r12 = java.lang.Long.valueOf(r24)     // Catch:{ all -> 0x0d79 }
            r22 = 2
            r15[r22] = r12     // Catch:{ all -> 0x0d79 }
            java.lang.String r12 = ""
            r22 = 3
            r15[r22] = r12     // Catch:{ all -> 0x0d79 }
            java.lang.String r12 = ""
            r22 = 4
            r15[r22] = r12     // Catch:{ all -> 0x0d79 }
            r12 = 0
            java.lang.Integer r22 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0d79 }
            r15[r65] = r22     // Catch:{ all -> 0x0d79 }
            r12 = 26980(0x6964, float:3.7807E-41)
            r11.mo160131h(r12, r15)     // Catch:{ all -> 0x0d79 }
        L_0x09b8:
            r11 = 7
            r22 = 1073741824(0x40000000, double:5.304989477E-315)
            r15 = 14
            r24 = 13
            r25 = 12
            r52 = 11
            r53 = 10
            r12 = 16
            r55 = 8
            r56 = 9
            r16 = 0
            int r57 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r57 <= 0) goto L_0x0a84
            java.lang.String r3 = "MicroMsg.CalcWxNewService"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0d79 }
            r4.<init>()     // Catch:{ all -> 0x0d79 }
            java.lang.String r5 = "did linkify, the count : "
            r4.append(r5)     // Catch:{ all -> 0x0d79 }
            r4.append(r9)     // Catch:{ all -> 0x0d79 }
            java.lang.String r5 = ", the size : "
            r4.append(r5)     // Catch:{ all -> 0x0d79 }
            r4.append(r1)     // Catch:{ all -> 0x0d79 }
            java.lang.String r5 = ", won't report duplicate file"
            r4.append(r5)     // Catch:{ all -> 0x0d79 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0d79 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)     // Catch:{ all -> 0x0d79 }
            boolean r3 = f301838g     // Catch:{ all -> 0x0d79 }
            if (r3 == 0) goto L_0x09fd
            int r3 = (r1 > r22 ? 1 : (r1 == r22 ? 0 : -1))
            if (r3 <= 0) goto L_0x0a07
        L_0x09fd:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r3 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()     // Catch:{ all -> 0x0d79 }
            java.lang.String r4 = "LastScanIsLinkify"
            r5 = 1
            r3.encode((java.lang.String) r4, (boolean) r5)     // Catch:{ all -> 0x0d79 }
        L_0x0a07:
            boolean r3 = f301838g     // Catch:{ all -> 0x0d79 }
            if (r3 == 0) goto L_0x0a0d
            r3 = 1
            goto L_0x0a0e
        L_0x0a0d:
            r3 = 0
        L_0x0a0e:
            kj2.d r4 = kj2.C117407d.INSTANCE     // Catch:{ all -> 0x0d79 }
            java.lang.Object[] r5 = new java.lang.Object[r12]     // Catch:{ all -> 0x0d79 }
            r6 = 200(0xc8, float:2.8E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0d79 }
            r7 = 0
            r5[r7] = r6     // Catch:{ all -> 0x0d79 }
            java.lang.Long r6 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0d79 }
            r7 = 1
            r5[r7] = r6     // Catch:{ all -> 0x0d79 }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0d79 }
            r2 = 2
            r5[r2] = r1     // Catch:{ all -> 0x0d79 }
            java.lang.String r1 = ""
            r2 = 3
            r5[r2] = r1     // Catch:{ all -> 0x0d79 }
            java.lang.String r1 = ""
            r2 = 4
            r5[r2] = r1     // Catch:{ all -> 0x0d79 }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0d79 }
            long r1 = r1 - r74
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0d79 }
            r5[r65] = r1     // Catch:{ all -> 0x0d79 }
            java.lang.String r1 = "total"
            r2 = 6
            r5[r2] = r1     // Catch:{ all -> 0x0d79 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0d79 }
            r5[r11] = r1     // Catch:{ all -> 0x0d79 }
            java.lang.Long r1 = java.lang.Long.valueOf(r26)     // Catch:{ all -> 0x0d79 }
            r5[r55] = r1     // Catch:{ all -> 0x0d79 }
            java.lang.Long r1 = java.lang.Long.valueOf(r28)     // Catch:{ all -> 0x0d79 }
            r5[r56] = r1     // Catch:{ all -> 0x0d79 }
            java.lang.Long r1 = java.lang.Long.valueOf(r30)     // Catch:{ all -> 0x0d79 }
            r5[r53] = r1     // Catch:{ all -> 0x0d79 }
            java.lang.Long r1 = java.lang.Long.valueOf(r32)     // Catch:{ all -> 0x0d79 }
            r5[r52] = r1     // Catch:{ all -> 0x0d79 }
            java.lang.Long r1 = java.lang.Long.valueOf(r34)     // Catch:{ all -> 0x0d79 }
            r5[r25] = r1     // Catch:{ all -> 0x0d79 }
            java.lang.Long r1 = java.lang.Long.valueOf(r36)     // Catch:{ all -> 0x0d79 }
            r5[r24] = r1     // Catch:{ all -> 0x0d79 }
            java.lang.Long r1 = java.lang.Long.valueOf(r38)     // Catch:{ all -> 0x0d79 }
            r5[r15] = r1     // Catch:{ all -> 0x0d79 }
            java.lang.Long r1 = java.lang.Long.valueOf(r40)     // Catch:{ all -> 0x0d79 }
            r2 = 15
            r5[r2] = r1     // Catch:{ all -> 0x0d79 }
            r1 = 26980(0x6964, float:3.7807E-41)
            r4.mo160131h(r1, r5)     // Catch:{ all -> 0x0d79 }
            monitor-exit(r102)
            return
        L_0x0a84:
            boolean r1 = f301838g     // Catch:{ all -> 0x0d79 }
            if (r1 == 0) goto L_0x0a95
            java.lang.String r1 = "MicroMsg.CalcWxNewService"
            java.lang.String r2 = "willBreakLinkify is true, not report duplicate file"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)     // Catch:{ all -> 0x0d79 }
            r1 = 0
            f301838g = r1     // Catch:{ all -> 0x0d79 }
            monitor-exit(r102)
            return
        L_0x0a95:
            r1 = 0
            f301838g = r1     // Catch:{ all -> 0x0d79 }
            yy0.b r1 = r102.mo142120e()     // Catch:{ all -> 0x0d79 }
            r2 = r103
            android.database.Cursor r1 = r1.mo142696bD(r2)     // Catch:{ all -> 0x0d79 }
            r9 = r16
            r11 = r9
        L_0x0aa5:
            boolean r17 = r1.moveToNext()     // Catch:{ all -> 0x0d62 }
            if (r17 == 0) goto L_0x0ab6
            r2 = 0
            long r9 = r1.getLong(r2)     // Catch:{ all -> 0x0d62 }
            r2 = 1
            long r11 = r1.getLong(r2)     // Catch:{ all -> 0x0d62 }
            goto L_0x0aa5
        L_0x0ab6:
            rx3.b0 r2 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0d62 }
            r2 = 0
            cy3.C58003b.m67160a(r1, r2)     // Catch:{ all -> 0x0d79 }
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()     // Catch:{ all -> 0x0d79 }
            java.lang.String r2 = "extreme_storage_wechat_total"
            r26 = r13
            r13 = -1
            long r1 = r1.getLong(r2, r13)     // Catch:{ all -> 0x0d79 }
            float r15 = (float) r7     // Catch:{ all -> 0x0d79 }
            float r13 = (float) r9     // Catch:{ all -> 0x0d79 }
            float r15 = r15 / r13
            r13 = 100
            float r13 = (float) r13     // Catch:{ all -> 0x0d79 }
            float r15 = r15 * r13
            int r14 = (int) r15     // Catch:{ all -> 0x0d79 }
            float r15 = (float) r3     // Catch:{ all -> 0x0d79 }
            float r11 = (float) r11     // Catch:{ all -> 0x0d79 }
            float r11 = r15 / r11
            float r11 = r11 * r13
            int r11 = (int) r11     // Catch:{ all -> 0x0d79 }
            r28 = -1
            int r30 = (r1 > r28 ? 1 : (r1 == r28 ? 0 : -1))
            if (r30 == 0) goto L_0x0ae6
            float r12 = (float) r1     // Catch:{ all -> 0x0d79 }
            float r15 = r15 / r12
            float r15 = r15 * r13
            int r12 = (int) r15     // Catch:{ all -> 0x0d79 }
            goto L_0x0ae7
        L_0x0ae6:
            r12 = -1
        L_0x0ae7:
            java.lang.String r13 = "MicroMsg.CalcWxNewService"
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ all -> 0x0d79 }
            r15.<init>()     // Catch:{ all -> 0x0d79 }
            r29 = r11
            java.lang.String r11 = "allDuplicatedFileCount = "
            r15.append(r11)     // Catch:{ all -> 0x0d79 }
            r15.append(r5)     // Catch:{ all -> 0x0d79 }
            java.lang.String r11 = ", allDuplicatedDiskSpace = "
            r15.append(r11)     // Catch:{ all -> 0x0d79 }
            r15.append(r3)     // Catch:{ all -> 0x0d79 }
            java.lang.String r11 = ", wechatTotalSizeSubCoreMonitor = "
            r15.append(r11)     // Catch:{ all -> 0x0d79 }
            r15.append(r1)     // Catch:{ all -> 0x0d79 }
            java.lang.String r11 = ", fileDiskSpaceWechatRatio = "
            r15.append(r11)     // Catch:{ all -> 0x0d79 }
            r15.append(r12)     // Catch:{ all -> 0x0d79 }
            java.lang.String r11 = r15.toString()     // Catch:{ all -> 0x0d79 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r11)     // Catch:{ all -> 0x0d79 }
            int r11 = (r3 > r22 ? 1 : (r3 == r22 ? 0 : -1))
            if (r11 <= 0) goto L_0x0b25
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r11 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()     // Catch:{ all -> 0x0d79 }
            java.lang.String r13 = "extreme_storage_duplicate_total_space"
            r11.encode((java.lang.String) r13, (long) r3)     // Catch:{ all -> 0x0d79 }
            goto L_0x0b2f
        L_0x0b25:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r11 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()     // Catch:{ all -> 0x0d79 }
            java.lang.String r13 = "extreme_storage_duplicate_total_space"
            r15 = -1
            r11.encode((java.lang.String) r13, (int) r15)     // Catch:{ all -> 0x0d79 }
        L_0x0b2f:
            r22 = 524288000(0x1f400000, double:2.590326893E-315)
            int r11 = (r26 > r22 ? 1 : (r26 == r22 ? 0 : -1))
            if (r11 <= 0) goto L_0x0b44
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r11 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()     // Catch:{ all -> 0x0d79 }
            java.lang.String r13 = "extreme_storage_duplicate_image2_space"
            r30 = r5
            r5 = r26
            r11.encode((java.lang.String) r13, (long) r5)     // Catch:{ all -> 0x0d79 }
            goto L_0x0b52
        L_0x0b44:
            r30 = r5
            r5 = r26
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r11 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()     // Catch:{ all -> 0x0d79 }
            java.lang.String r13 = "extreme_storage_duplicate_image2_space"
            r15 = -1
            r11.encode((java.lang.String) r13, (int) r15)     // Catch:{ all -> 0x0d79 }
        L_0x0b52:
            int r11 = (r20 > r22 ? 1 : (r20 == r22 ? 0 : -1))
            if (r11 <= 0) goto L_0x0b64
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r11 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()     // Catch:{ all -> 0x0d79 }
            java.lang.String r13 = "extreme_storage_duplicate_video_space"
            r26 = r1
            r1 = r20
            r11.encode((java.lang.String) r13, (long) r1)     // Catch:{ all -> 0x0d79 }
            goto L_0x0b72
        L_0x0b64:
            r26 = r1
            r1 = r20
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r11 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()     // Catch:{ all -> 0x0d79 }
            java.lang.String r13 = "extreme_storage_duplicate_video_space"
            r15 = -1
            r11.encode((java.lang.String) r13, (int) r15)     // Catch:{ all -> 0x0d79 }
        L_0x0b72:
            int r11 = (r66 > r22 ? 1 : (r66 == r22 ? 0 : -1))
            if (r11 <= 0) goto L_0x0b84
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r11 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()     // Catch:{ all -> 0x0d79 }
            java.lang.String r13 = "extreme_storage_duplicate_record_space"
            r20 = r3
            r3 = r66
            r11.encode((java.lang.String) r13, (long) r3)     // Catch:{ all -> 0x0d79 }
            goto L_0x0b92
        L_0x0b84:
            r20 = r3
            r3 = r66
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r11 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()     // Catch:{ all -> 0x0d79 }
            java.lang.String r13 = "extreme_storage_duplicate_record_space"
            r15 = -1
            r11.encode((java.lang.String) r13, (int) r15)     // Catch:{ all -> 0x0d79 }
        L_0x0b92:
            int r11 = (r18 > r22 ? 1 : (r18 == r22 ? 0 : -1))
            if (r11 <= 0) goto L_0x0ba6
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r11 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()     // Catch:{ all -> 0x0d79 }
            java.lang.String r13 = "extreme_storage_duplicate_attachment_space"
            r32 = r14
            r14 = r18
            r11.encode((java.lang.String) r13, (long) r14)     // Catch:{ all -> 0x0d79 }
            r18 = r12
            goto L_0x0bb6
        L_0x0ba6:
            r32 = r14
            r14 = r18
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r11 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()     // Catch:{ all -> 0x0d79 }
            java.lang.String r13 = "extreme_storage_duplicate_attachment_space"
            r18 = r12
            r12 = -1
            r11.encode((java.lang.String) r13, (int) r12)     // Catch:{ all -> 0x0d79 }
        L_0x0bb6:
            int r11 = (r50 > r22 ? 1 : (r50 == r22 ? 0 : -1))
            if (r11 <= 0) goto L_0x0bc8
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r11 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()     // Catch:{ all -> 0x0d79 }
            java.lang.String r12 = "extreme_storage_duplicate_download_space"
            r22 = r14
            r13 = r50
            r11.encode((java.lang.String) r12, (long) r13)     // Catch:{ all -> 0x0d79 }
            goto L_0x0bd6
        L_0x0bc8:
            r22 = r14
            r13 = r50
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r11 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()     // Catch:{ all -> 0x0d79 }
            java.lang.String r12 = "extreme_storage_duplicate_download_space"
            r15 = -1
            r11.encode((java.lang.String) r12, (int) r15)     // Catch:{ all -> 0x0d79 }
        L_0x0bd6:
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0d79 }
            long r11 = r11 - r74
            boolean r15 = f301837f     // Catch:{ all -> 0x0d79 }
            if (r15 == 0) goto L_0x0be3
            java.lang.String r15 = "DuplicateFileScanAL-v3"
            goto L_0x0be5
        L_0x0be3:
            java.lang.String r15 = "DuplicateFileScan-v3"
        L_0x0be5:
            r33 = r11
            kj2.d r11 = kj2.C117407d.INSTANCE     // Catch:{ all -> 0x0d79 }
            r12 = 24
            java.lang.Object[] r12 = new java.lang.Object[r12]     // Catch:{ all -> 0x0d79 }
            r19 = 0
            r12[r19] = r15     // Catch:{ all -> 0x0d79 }
            java.lang.Long r15 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0d79 }
            r19 = 1
            r12[r19] = r15     // Catch:{ all -> 0x0d79 }
            java.lang.Long r15 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0d79 }
            r19 = 2
            r12[r19] = r15     // Catch:{ all -> 0x0d79 }
            java.lang.Long r15 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0d79 }
            r19 = 3
            r12[r19] = r15     // Catch:{ all -> 0x0d79 }
            java.lang.Long r15 = java.lang.Long.valueOf(r70)     // Catch:{ all -> 0x0d79 }
            r19 = 4
            r12[r19] = r15     // Catch:{ all -> 0x0d79 }
            java.lang.Long r15 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0d79 }
            r12[r65] = r15     // Catch:{ all -> 0x0d79 }
            java.lang.Long r15 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0d79 }
            r19 = 6
            r12[r19] = r15     // Catch:{ all -> 0x0d79 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r32)     // Catch:{ all -> 0x0d79 }
            r16 = 7
            r12[r16] = r15     // Catch:{ all -> 0x0d79 }
            java.lang.Long r15 = java.lang.Long.valueOf(r46)     // Catch:{ all -> 0x0d79 }
            r12[r55] = r15     // Catch:{ all -> 0x0d79 }
            java.lang.Long r15 = java.lang.Long.valueOf(r22)     // Catch:{ all -> 0x0d79 }
            r12[r56] = r15     // Catch:{ all -> 0x0d79 }
            java.lang.Long r15 = java.lang.Long.valueOf(r42)     // Catch:{ all -> 0x0d79 }
            r12[r53] = r15     // Catch:{ all -> 0x0d79 }
            java.lang.Long r15 = java.lang.Long.valueOf(r44)     // Catch:{ all -> 0x0d79 }
            r12[r52] = r15     // Catch:{ all -> 0x0d79 }
            java.lang.Long r15 = java.lang.Long.valueOf(r20)     // Catch:{ all -> 0x0d79 }
            r12[r25] = r15     // Catch:{ all -> 0x0d79 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r29)     // Catch:{ all -> 0x0d79 }
            r12[r24] = r15     // Catch:{ all -> 0x0d79 }
            java.lang.Long r15 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x0d79 }
            r16 = 14
            r12[r16] = r15     // Catch:{ all -> 0x0d79 }
            java.lang.Long r15 = java.lang.Long.valueOf(r48)     // Catch:{ all -> 0x0d79 }
            r16 = 15
            r12[r16] = r15     // Catch:{ all -> 0x0d79 }
            java.lang.Long r15 = java.lang.Long.valueOf(r26)     // Catch:{ all -> 0x0d79 }
            r16 = 16
            r12[r16] = r15     // Catch:{ all -> 0x0d79 }
            r15 = 17
            java.lang.Integer r16 = java.lang.Integer.valueOf(r18)     // Catch:{ all -> 0x0d79 }
            r12[r15] = r16     // Catch:{ all -> 0x0d79 }
            r15 = 18
            java.lang.Long r16 = java.lang.Long.valueOf(r30)     // Catch:{ all -> 0x0d79 }
            r12[r15] = r16     // Catch:{ all -> 0x0d79 }
            r15 = 19
            java.lang.Long r16 = java.lang.Long.valueOf(r33)     // Catch:{ all -> 0x0d79 }
            r12[r15] = r16     // Catch:{ all -> 0x0d79 }
            r15 = 20
            java.lang.Long r16 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0d79 }
            r12[r15] = r16     // Catch:{ all -> 0x0d79 }
            r15 = 21
            java.lang.Long r16 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0d79 }
            r12[r15] = r16     // Catch:{ all -> 0x0d79 }
            r15 = 22
            java.lang.Long r16 = java.lang.Long.valueOf(r70)     // Catch:{ all -> 0x0d79 }
            r12[r15] = r16     // Catch:{ all -> 0x0d79 }
            r15 = 23
            java.lang.Long r16 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0d79 }
            r12[r15] = r16     // Catch:{ all -> 0x0d79 }
            r15 = 25355(0x630b, float:3.553E-41)
            r11.mo160131h(r15, r12)     // Catch:{ all -> 0x0d79 }
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ all -> 0x0d79 }
            r11.<init>()     // Catch:{ all -> 0x0d79 }
            java.lang.String r12 = "allFileSize"
            r11.put(r12, r9)     // Catch:{ all -> 0x0d79 }
            java.lang.String r9 = "v3"
            r10 = 1
            r11.put(r9, r10)     // Catch:{ all -> 0x0d79 }
            java.lang.String r9 = "image2DuplicateFileDiskSpace"
            r11.put(r9, r5)     // Catch:{ all -> 0x0d79 }
            java.lang.String r5 = "videoDuplicateFileDiskSpace"
            r11.put(r5, r1)     // Catch:{ all -> 0x0d79 }
            java.lang.String r1 = "voice2DuplicateFileDiskSpace"
            r9 = r70
            r11.put(r1, r9)     // Catch:{ all -> 0x0d79 }
            java.lang.String r1 = "recordDuplicateFileDiskSpace"
            r11.put(r1, r3)     // Catch:{ all -> 0x0d79 }
            java.lang.String r1 = "allDuplicatedFileSize"
            r11.put(r1, r7)     // Catch:{ all -> 0x0d79 }
            java.lang.String r1 = "fileSizeRatio"
            r2 = r32
            r11.put(r1, r2)     // Catch:{ all -> 0x0d79 }
            java.lang.String r1 = "openapiDuplicateFileDiskSpace"
            r9 = r46
            r11.put(r1, r9)     // Catch:{ all -> 0x0d79 }
            java.lang.String r1 = "attachmentDuplicateFileDiskSpace"
            r9 = r22
            r11.put(r1, r9)     // Catch:{ all -> 0x0d79 }
            java.lang.String r1 = "emulatedDuplicateFileDiskSpace"
            r9 = r42
            r11.put(r1, r9)     // Catch:{ all -> 0x0d79 }
            java.lang.String r1 = "favoriteDuplicateFileDiskSpace"
            r9 = r44
            r11.put(r1, r9)     // Catch:{ all -> 0x0d79 }
            java.lang.String r1 = "allDuplicatedDiskSpace"
            r3 = r20
            r11.put(r1, r3)     // Catch:{ all -> 0x0d79 }
            java.lang.String r1 = "fileDiskSpaceRatio"
            r2 = r29
            r11.put(r1, r2)     // Catch:{ all -> 0x0d79 }
            java.lang.String r1 = "downloadDuplicateFileDiskSpace"
            r11.put(r1, r13)     // Catch:{ all -> 0x0d79 }
            java.lang.String r1 = "otherDuplicateFileDiskSpace"
            r9 = r48
            r11.put(r1, r9)     // Catch:{ all -> 0x0d79 }
            java.lang.String r1 = "wechatTotalSize"
            r2 = r26
            r11.put(r1, r2)     // Catch:{ all -> 0x0d79 }
            java.lang.String r1 = "fileDiskSpaceWechatRatio"
            r12 = r18
            r11.put(r1, r12)     // Catch:{ all -> 0x0d79 }
            java.lang.String r1 = "allDuplicatedFileCount"
            r5 = r30
            r11.put(r1, r5)     // Catch:{ all -> 0x0d79 }
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()     // Catch:{ all -> 0x0d79 }
            java.lang.String r2 = "DuplicateFileDailyReport"
            java.lang.String r3 = r11.toString()     // Catch:{ all -> 0x0d79 }
            r1.encode((java.lang.String) r2, (java.lang.String) r3)     // Catch:{ all -> 0x0d79 }
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()     // Catch:{ all -> 0x0d79 }
            java.lang.String r2 = "LastScanIsLinkify"
            r3 = 0
            r1.encode((java.lang.String) r2, (boolean) r3)     // Catch:{ all -> 0x0d79 }
            yy0.b r1 = r102.mo142120e()     // Catch:{ all -> 0x0d79 }
            java.lang.Long r2 = java.lang.Long.valueOf(r72)     // Catch:{ all -> 0x0d79 }
            r3 = 65536(0x10000, float:9.18355E-41)
            r1.mo142705uP(r3, r2)     // Catch:{ all -> 0x0d79 }
            java.lang.String r1 = "MicroMsg.CalcWxNewService"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0d79 }
            r2.<init>()     // Catch:{ all -> 0x0d79 }
            java.lang.String r3 = "handleDuplicated done, duration = "
            r2.append(r3)     // Catch:{ all -> 0x0d79 }
            r11 = r33
            r2.append(r11)     // Catch:{ all -> 0x0d79 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0d79 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)     // Catch:{ all -> 0x0d79 }
            monitor-exit(r102)
            return
        L_0x0d62:
            r0 = move-exception
            r2 = r0
            throw r2     // Catch:{ all -> 0x0d65 }
        L_0x0d65:
            r0 = move-exception
            r3 = r0
            cy3.C58003b.m67160a(r1, r2)     // Catch:{ all -> 0x0d79 }
            throw r3     // Catch:{ all -> 0x0d79 }
        L_0x0d6b:
            r0 = move-exception
            r15 = r68
            goto L_0x0d71
        L_0x0d6f:
            r0 = move-exception
            r15 = r8
        L_0x0d71:
            r1 = r0
        L_0x0d72:
            throw r1     // Catch:{ all -> 0x0d73 }
        L_0x0d73:
            r0 = move-exception
            r2 = r0
            cy3.C58003b.m67160a(r15, r1)     // Catch:{ all -> 0x0d79 }
            throw r2     // Catch:{ all -> 0x0d79 }
        L_0x0d79:
            r0 = move-exception
            r1 = r0
            monitor-exit(r102)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: wy0.C102506a.mo142121f(com.tencent.wcdb.support.CancellationSignal):void");
    }

    /* renamed from: g */
    public final Long[] mo142122g(ArrayList<C102507a> arrayList, boolean z) {
        if (f301838g) {
            Log.m105924i("MicroMsg.CalcWxNewService", "handleDuplicatedOneDir willBreakLinkify, return");
            return new Long[]{0L, 0L};
        }
        C45983e0 e0Var = new C45983e0();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        C45983e0 e0Var2 = new C45983e0();
        C45983e0 e0Var3 = new C45983e0();
        int size = arrayList.size();
        String str = "";
        String str2 = str;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            String m2 = C102970a.m136114m2(arrayList.get(i2).f301842b);
            C86001b0 n = C86013q1.m106453n(m2);
            if (n == null) {
                Log.m105924i("MicroMsg.CalcWxNewService", "file not found, fe = " + m2);
            } else {
                if (i2 == 0) {
                    e0Var.f124000d = n.f250473c;
                }
                if (n instanceof C116326t0) {
                    String i3 = C86013q1.m106448i(m2, true);
                    C87412m.m108593f(m2, "fullPath");
                    hashMap2.put(i3, m2);
                    if (hashMap.containsKey(i3)) {
                        Object obj = hashMap.get(i3);
                        C87412m.m108591d(obj);
                        hashMap.put(i3, Long.valueOf(((Number) obj).longValue() + 1));
                    } else {
                        hashMap.put(i3, 1L);
                    }
                } else {
                    i++;
                    if (str2.length() == 0) {
                        C87412m.m108593f(m2, "fullPath");
                        str2 = m2;
                    }
                }
            }
        }
        ArrayList<C102507a> arrayList2 = arrayList;
        if (hashMap.size() > 0) {
            str = String.valueOf(hashMap2.get(String.valueOf(((C13604l) C110818d0.m150943o0(C13801s0.m13103o(hashMap), new C38357c()).get(0)).f38555d)));
        }
        String str3 = str.length() == 0 ? str2 : str;
        Log.m105924i("MicroMsg.CalcWxNewService", "originalFilePath = " + str3 + ", realPathSet.size = " + hashMap.size() + ", realFileCount = " + i + ", fileSize = " + e0Var.f124000d);
        FutureTask futureTask = new FutureTask(new C102511d(str3, arrayList, z, e0Var2, e0Var3, e0Var));
        ((C119157j) C119157j.f356862d).mo183875f(futureTask);
        futureTask.get();
        return new Long[]{Long.valueOf(e0Var2.f124000d), Long.valueOf(e0Var3.f124000d)};
    }

    /* renamed from: h */
    public final void mo142123h(long j) {
        HashSet<Long> hashSet = f301835d;
        synchronized (hashSet) {
            hashSet.add(Long.valueOf(j));
            if (!f301836e) {
                ((C119157j) C119157j.f356862d).mo183879j(new C38358e(), 100, "CalcWxEvents");
                f301836e = true;
            }
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(24:0|(24:2|3|4|(2:9|10)|11|12|(10:14|(22:16|(6:21|(1:23)|(2:25|(2:27|300)(1:299))(2:28|298)|29|18|17)|30|(1:32)(1:33)|(1:35)(1:36)|(1:38)(1:39)|40|41|(1:(6:43|44|(1:46)(1:47)|48|(1:50)(3:51|(1:53)|54)|(1:56)(1:301)))(1:57)|58|(2:60|(1:(1:63)(3:64|295|80)))(1:65)|66|67|68|69|(2:72|70)|302|73|(2:77|78)|79|294|80)|293|86|87|88|89|90|91|92)(1:103)|(2:105|106)|(1:108)|110|111|(36:115|(8:121|122|123|124|125|126|116|117)|130|(1:132)(1:133)|134|135|(3:137|138|139)(3:140|141|142)|143|144|(22:(5:146|147|(1:149)(1:150)|(1:152)(4:153|154|155|156)|(1:158)(0))|162|163|(3:165|166|(3:170|305|303))(1:172)|173|174|175|176|177|(2:180|178)|309|181|182|183|184|185|186|187|(2:191|192)|193|306|303)(1:160)|161|162|163|(0)(0)|173|174|175|176|177|(1:178)|309|181|182|183|184|185|186|187|189|191|192|193|306|303|113|112)|304|211|212|213|(10:216|(5:221|222|223|224|217)|225|(1:227)(1:228)|229|(1:231)(1:232)|233|(1:(4:235|(1:237)(1:238)|(1:240)(1:241)|(1:243)(1:312)))(2:244|311)|245|214)|310|250|(1:252)|(5:254|255|256|257|279)|280|281|315)|7|(0)|11|12|(0)(0)|(0)|(0)|110|111|(2:113|112)|304|211|212|213|(1:214)|310|250|(0)|(0)|280|281|315) */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:201|202|259|(0)|289|290|291) */
    /* JADX WARNING: Code restructure failed: missing block: B:101:?, code lost:
        cy3.C58003b.m67160a(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0289, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0305, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0306, code lost:
        r27 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0308, code lost:
        r28 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0363, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x038c, code lost:
        r12 = r10;
        r3 = r27;
        r4 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0404, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0406, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0408, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0409, code lost:
        r8 = r28;
        r42 = r27;
        r27 = r10;
        r10 = r42;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0411, code lost:
        r4 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0418, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0419, code lost:
        r8 = r5;
        r42 = r27;
        r27 = r10;
        r10 = r42;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0421, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0422, code lost:
        r8 = r5;
        r27 = r10;
        r10 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0426, code lost:
        r5 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0427, code lost:
        r4 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0428, code lost:
        r3 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x04e5, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x054f, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0553, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0554, code lost:
        r12 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0566, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0567, code lost:
        r12 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:?, code lost:
        r44.mo137338b(true, r3, r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0577, code lost:
        if (r22 != null) goto L_0x0579;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:?, code lost:
        j20.C117292a.m165357c(r22, "com/tencent/mm/plugin/calcwx/CalcWxNewService", "scan", "(Lcom/tencent/mm/plugin/calcwx/ScanCallback;Lcom/tencent/wcdb/support/CancellationSignal;)V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
        r22.release();
        r16 = "com/tencent/mm/plugin/calcwx/CalcWxNewService";
        r17 = "scan";
        r18 = "(Lcom/tencent/mm/plugin/calcwx/ScanCallback;Lcom/tencent/wcdb/support/CancellationSignal;)V";
        r19 = "android/os/PowerManager$WakeLock_EXEC_";
        r20 = "release";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:?, code lost:
        j20.C117292a.m165357c(r22, "com/tencent/mm/plugin/calcwx/CalcWxNewService", "scan", "(Lcom/tencent/mm/plugin/calcwx/ScanCallback;Lcom/tencent/wcdb/support/CancellationSignal;)V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
        r22.release();
        j20.C117292a.m165359e(r22, "com/tencent/mm/plugin/calcwx/CalcWxNewService", "scan", "(Lcom/tencent/mm/plugin/calcwx/ScanCallback;Lcom/tencent/wcdb/support/CancellationSignal;)V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
        r1 = rx3.C13598b0.f38549a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x027c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0284, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0285, code lost:
        r3 = r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:90:0x0270, B:96:0x0283, B:116:0x02e0] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:280:0x059e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:289:0x05d0 */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x028a  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0299 A[SYNTHETIC, Splitter:B:105:0x0299] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02a0 A[Catch:{ OperationCanceledException -> 0x055e, all -> 0x0566 }] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02df  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0373 A[SYNTHETIC, Splitter:B:165:0x0373] */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0393  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x03c0 A[Catch:{ OperationCanceledException -> 0x0406, all -> 0x054f }, LOOP:7: B:178:0x03ba->B:180:0x03c0, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0418 A[ExcHandler: OperationCanceledException (e com.tencent.wcdb.support.OperationCanceledException), Splitter:B:134:0x0314] */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x046f A[Catch:{ OperationCanceledException -> 0x0553, all -> 0x054f }] */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x0517 A[Catch:{ OperationCanceledException -> 0x04e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x0525  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x054f A[ExcHandler: all (th java.lang.Throwable), PHI: r27 
      PHI: (r27v8 java.util.concurrent.ExecutorService) = (r27v2 java.util.concurrent.ExecutorService), (r27v20 java.util.concurrent.ExecutorService), (r27v20 java.util.concurrent.ExecutorService), (r27v20 java.util.concurrent.ExecutorService) binds: [B:212:0x0431, B:176:0x03b1, B:183:0x03d2, B:186:0x03d8] A[DONT_GENERATE, DONT_INLINE], Splitter:B:176:0x03b1] */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x0566 A[ExcHandler: all (th java.lang.Throwable), PHI: r10 
      PHI: (r10v1 java.util.concurrent.ExecutorService) = (r10v3 java.util.concurrent.ExecutorService), (r10v3 java.util.concurrent.ExecutorService), (r10v3 java.util.concurrent.ExecutorService), (r10v3 java.util.concurrent.ExecutorService), (r10v3 java.util.concurrent.ExecutorService), (r10v3 java.util.concurrent.ExecutorService), (r10v3 java.util.concurrent.ExecutorService), (r10v3 java.util.concurrent.ExecutorService), (r10v3 java.util.concurrent.ExecutorService), (r10v3 java.util.concurrent.ExecutorService), (r10v3 java.util.concurrent.ExecutorService), (r10v3 java.util.concurrent.ExecutorService), (r10v3 java.util.concurrent.ExecutorService), (r10v3 java.util.concurrent.ExecutorService), (r10v3 java.util.concurrent.ExecutorService), (r10v0 java.util.concurrent.ExecutorService), (r10v0 java.util.concurrent.ExecutorService), (r10v0 java.util.concurrent.ExecutorService), (r10v0 java.util.concurrent.ExecutorService), (r10v0 java.util.concurrent.ExecutorService) binds: [B:112:0x02d9, B:116:0x02e0, B:134:0x0314, B:161:0x036b, B:173:0x0395, B:165:0x0373, B:146:0x032e, B:155:0x034b, B:156:?, B:141:0x0324, B:138:0x031d, B:121:0x02ea, B:122:?, B:124:0x02f5, B:125:?, B:105:0x0299, B:90:0x0270, B:91:?, B:100:0x0286, B:9:0x005c] A[DONT_GENERATE, DONT_INLINE], Splitter:B:116:0x02e0] */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x0571  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x05a2 A[SYNTHETIC, Splitter:B:283:0x05a2] */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x05a5  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x005c A[SYNTHETIC, Splitter:B:9:0x005c] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo142124j(wy0.C102522u r44, com.tencent.wcdb.support.CancellationSignal r45) {
        /*
            r43 = this;
            r7 = r44
            r8 = r45
            java.lang.String r9 = ", files: "
            r0 = 4
            java.util.concurrent.ExecutorService r10 = java.util.concurrent.Executors.newFixedThreadPool(r0)
            java.util.Map<java.lang.Integer, xy0.e> r0 = wy0.C102519e.f301867a
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r1 = "power"
            java.lang.Object r0 = r0.getSystemService(r1)
            boolean r1 = r0 instanceof android.os.PowerManager
            r12 = 1
            r13 = 0
            java.lang.String r14 = "MicroMsg.CalcWxNewService"
            if (r1 == 0) goto L_0x0058
            android.os.PowerManager r0 = (android.os.PowerManager) r0     // Catch:{ Exception -> 0x0050 }
            java.lang.String r1 = "WxIndex"
            android.os.PowerManager$WakeLock r0 = r0.newWakeLock(r12, r1)     // Catch:{ Exception -> 0x0050 }
            java.lang.String r16 = "com/tencent/mm/plugin/calcwx/CalcWxNewServiceKt"
            java.lang.String r17 = "newWakeLock"
            java.lang.String r18 = "()Landroid/os/PowerManager$WakeLock;"
            java.lang.String r19 = "android/os/PowerManager$WakeLock_EXEC_"
            java.lang.String r20 = "acquire"
            java.lang.String r21 = "()V"
            r15 = r0
            j20.C117292a.m165357c(r15, r16, r17, r18, r19, r20, r21)     // Catch:{ Exception -> 0x0050 }
            r0.acquire()     // Catch:{ Exception -> 0x0050 }
            java.lang.String r16 = "com/tencent/mm/plugin/calcwx/CalcWxNewServiceKt"
            java.lang.String r17 = "newWakeLock"
            java.lang.String r18 = "()Landroid/os/PowerManager$WakeLock;"
            java.lang.String r19 = "android/os/PowerManager$WakeLock_EXEC_"
            java.lang.String r20 = "acquire"
            java.lang.String r21 = "()V"
            r15 = r0
            j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)     // Catch:{ Exception -> 0x0050 }
            r22 = r0
            goto L_0x005a
        L_0x0050:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r13]
            java.lang.String r2 = "Cannot acquire wake-lock"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r14, r0, r2, r1)
        L_0x0058:
            r22 = 0
        L_0x005a:
            if (r8 == 0) goto L_0x0061
            r45.throwIfCanceled()     // Catch:{ OperationCanceledException -> 0x0569, all -> 0x0566 }
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ OperationCanceledException -> 0x0569, all -> 0x0566 }
        L_0x0061:
            yy0.b r0 = r43.mo142120e()     // Catch:{ OperationCanceledException -> 0x0569, all -> 0x0566 }
            r0.mo142694TO(r13, r8)     // Catch:{ OperationCanceledException -> 0x0569, all -> 0x0566 }
            yy0.b r0 = r43.mo142120e()     // Catch:{ OperationCanceledException -> 0x0569, all -> 0x0566 }
            long r25 = r0.mo142697bF()     // Catch:{ OperationCanceledException -> 0x0569, all -> 0x0566 }
            yy0.b r0 = r43.mo142120e()     // Catch:{ OperationCanceledException -> 0x0569, all -> 0x0566 }
            java.util.List r0 = r0.mo142692SE()     // Catch:{ OperationCanceledException -> 0x0569, all -> 0x0566 }
            eb0.c r1 = eb0.C97625j3.m125812b()     // Catch:{ OperationCanceledException -> 0x0569, all -> 0x0566 }
            g62.l r1 = r1.mo105911z()     // Catch:{ OperationCanceledException -> 0x0569, all -> 0x0566 }
            java.lang.String r2 = "message"
            com.tencent.mm.storage.g4 r1 = (com.tencent.p014mm.storage.C72972g4) r1     // Catch:{ OperationCanceledException -> 0x0569, all -> 0x0566 }
            long r1 = r1.Ab0(r2)     // Catch:{ OperationCanceledException -> 0x0569, all -> 0x0566 }
            long r3 = wy0.C102519e.m135325g(r1)     // Catch:{ OperationCanceledException -> 0x0569, all -> 0x0566 }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ OperationCanceledException -> 0x0569, all -> 0x0566 }
            int r5 = r0.size()     // Catch:{ OperationCanceledException -> 0x0569, all -> 0x0566 }
            long r5 = (long) r5     // Catch:{ OperationCanceledException -> 0x0569, all -> 0x0566 }
            long r4 = r3 + r5
            long r11 = wy0.C102519e.m135325g(r25)     // Catch:{ OperationCanceledException -> 0x0569, all -> 0x0566 }
            long r1 = wy0.C102519e.m135325g(r1)     // Catch:{ OperationCanceledException -> 0x0569, all -> 0x0566 }
            long r1 = java.lang.Math.min(r11, r1)     // Catch:{ OperationCanceledException -> 0x0569, all -> 0x0566 }
            r11 = 64
            java.util.concurrent.Future[] r12 = new java.util.concurrent.Future[r11]     // Catch:{ OperationCanceledException -> 0x0569, all -> 0x0566 }
            java.util.concurrent.Future[] r6 = new java.util.concurrent.Future[r11]     // Catch:{ OperationCanceledException -> 0x0569, all -> 0x0566 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ OperationCanceledException -> 0x0569, all -> 0x0566 }
            r3.<init>(r11)     // Catch:{ OperationCanceledException -> 0x0569, all -> 0x0566 }
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ OperationCanceledException -> 0x0569, all -> 0x0566 }
            r15.<init>()     // Catch:{ OperationCanceledException -> 0x0569, all -> 0x0566 }
            wy0.v r11 = new wy0.v     // Catch:{ OperationCanceledException -> 0x0569, all -> 0x0566 }
            r11.<init>()     // Catch:{ OperationCanceledException -> 0x0569, all -> 0x0566 }
            eb0.c r21 = eb0.C97625j3.m125812b()     // Catch:{ OperationCanceledException -> 0x0569, all -> 0x0566 }
            r21.getClass()     // Catch:{ OperationCanceledException -> 0x0569, all -> 0x0566 }
            f40.C86709a0.m107528h()     // Catch:{ OperationCanceledException -> 0x0569, all -> 0x0566 }
            f40.e r21 = f40.C86709a0.m107523b()     // Catch:{ OperationCanceledException -> 0x0569, all -> 0x0566 }
            r21.mo121108c()     // Catch:{ OperationCanceledException -> 0x0569, all -> 0x0566 }
            java.lang.Class<f62.k0> r21 = f62.C75700k0.class
            k40.a r21 = f40.C86709a0.m107533q(r21)     // Catch:{ OperationCanceledException -> 0x0569, all -> 0x0566 }
            f62.k0 r21 = (f62.C75700k0) r21     // Catch:{ OperationCanceledException -> 0x0569, all -> 0x0566 }
            g62.f r21 = r21.mo96093DX()     // Catch:{ OperationCanceledException -> 0x0569, all -> 0x0566 }
            java.lang.String r13 = ""
            r30 = r1
            r1 = r21
            com.tencent.mm.storage.n2 r1 = (com.tencent.p014mm.storage.C72986n2) r1     // Catch:{ OperationCanceledException -> 0x0569, all -> 0x0566 }
            long r27 = r1.mo101184jo(r13)     // Catch:{ OperationCanceledException -> 0x0569, all -> 0x0566 }
            eb0.c r1 = eb0.C97625j3.m125812b()     // Catch:{ OperationCanceledException -> 0x0569, all -> 0x0566 }
            g62.l r1 = r1.mo105911z()     // Catch:{ OperationCanceledException -> 0x0569, all -> 0x0566 }
            java.lang.String r24 = "message"
            r29 = -1
            r23 = r1
            com.tencent.mm.storage.g4 r23 = (com.tencent.p014mm.storage.C72972g4) r23     // Catch:{ OperationCanceledException -> 0x0569, all -> 0x0566 }
            android.database.Cursor r13 = r23.Zx0(r24, r25, r27, r29)     // Catch:{ OperationCanceledException -> 0x0569, all -> 0x0566 }
            r23 = 512(0x200, double:2.53E-321)
            r1 = 32
            if (r13 == 0) goto L_0x028a
            r25 = r30
            r21 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r32 = 0
        L_0x0107:
            if (r21 != 0) goto L_0x0262
            r34 = -1
            r2 = 0
        L_0x010c:
            boolean r36 = r13.moveToNext()     // Catch:{ all -> 0x025b }
            if (r36 == 0) goto L_0x016f
            if (r2 >= r1) goto L_0x016f
            com.tencent.mm.storage.f4 r1 = new com.tencent.mm.storage.f4     // Catch:{ all -> 0x025b }
            r1.<init>()     // Catch:{ all -> 0x025b }
            r1.convertFrom(r13)     // Catch:{ all -> 0x025b }
            r37 = r4
            java.util.Map<java.lang.Integer, xy0.e> r4 = wy0.C102519e.f301867a     // Catch:{ all -> 0x025b }
            int r5 = r1.getType()     // Catch:{ all -> 0x025b }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x025b }
            java.lang.Object r5 = r4.get(r5)     // Catch:{ all -> 0x025b }
            xy0.e r5 = (xy0.C102790e) r5     // Catch:{ all -> 0x025b }
            if (r5 != 0) goto L_0x0143
            int r5 = r1.getType()     // Catch:{ all -> 0x025b }
            int r5 = com.tencent.p014mm.pluginsdk.model.app.C72695v.m85061c(r5)     // Catch:{ all -> 0x025b }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x025b }
            java.lang.Object r4 = r4.get(r5)     // Catch:{ all -> 0x025b }
            r5 = r4
            xy0.e r5 = (xy0.C102790e) r5     // Catch:{ all -> 0x025b }
        L_0x0143:
            if (r5 != 0) goto L_0x0157
            long r4 = r1.getMsgId()     // Catch:{ all -> 0x025b }
            java.lang.Long r1 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x025b }
            r3.add(r1)     // Catch:{ all -> 0x025b }
            int r1 = (r4 > r34 ? 1 : (r4 == r34 ? 0 : -1))
            if (r1 <= 0) goto L_0x016a
            r34 = r4
            goto L_0x016a
        L_0x0157:
            int r4 = r2 + 1
            int r2 = r29 + r2
            r39 = r4
            wy0.a$f r4 = new wy0.a$f     // Catch:{ all -> 0x025b }
            r4.<init>(r5, r1)     // Catch:{ all -> 0x025b }
            java.util.concurrent.Future r1 = r10.submit(r4)     // Catch:{ all -> 0x025b }
            r12[r2] = r1     // Catch:{ all -> 0x025b }
            r2 = r39
        L_0x016a:
            r4 = r37
            r1 = 32
            goto L_0x010c
        L_0x016f:
            r37 = r4
            if (r2 == r1) goto L_0x0176
            r39 = 1
            goto L_0x0178
        L_0x0176:
            r39 = 0
        L_0x0178:
            if (r29 != 0) goto L_0x017d
            r4 = 32
            goto L_0x017e
        L_0x017d:
            r4 = 0
        L_0x017e:
            if (r39 == 0) goto L_0x0188
            r1 = 64
            r2 = 0
            my3.j r5 = my3.C61595o.m72301i(r2, r1)     // Catch:{ all -> 0x025b }
            goto L_0x018e
        L_0x0188:
            int r1 = r4 + 32
            my3.j r5 = my3.C61595o.m72301i(r4, r1)     // Catch:{ all -> 0x025b }
        L_0x018e:
            int r1 = r5.f175174d     // Catch:{ all -> 0x0259 }
            int r2 = r5.f175175e     // Catch:{ all -> 0x0259 }
            if (r1 > r2) goto L_0x01cb
        L_0x0194:
            r5 = r12[r1]     // Catch:{ all -> 0x025b }
            if (r5 == 0) goto L_0x019f
            java.lang.Object r5 = r5.get()     // Catch:{ all -> 0x025b }
            rx3.l r5 = (rx3.C13604l) r5     // Catch:{ all -> 0x025b }
            goto L_0x01a0
        L_0x019f:
            r5 = 0
        L_0x01a0:
            r29 = r4
            if (r5 != 0) goto L_0x01a5
            goto L_0x01c4
        L_0x01a5:
            A r4 = r5.f38555d     // Catch:{ all -> 0x025b }
            java.lang.Number r4 = (java.lang.Number) r4     // Catch:{ all -> 0x025b }
            long r40 = r4.longValue()     // Catch:{ all -> 0x025b }
            int r4 = (r40 > r34 ? 1 : (r40 == r34 ? 0 : -1))
            if (r4 <= 0) goto L_0x01b3
            r34 = r40
        L_0x01b3:
            java.lang.Long r4 = java.lang.Long.valueOf(r40)     // Catch:{ all -> 0x025b }
            r3.add(r4)     // Catch:{ all -> 0x025b }
            B r4 = r5.f38556e     // Catch:{ all -> 0x025b }
            java.util.Collection r4 = (java.util.Collection) r4     // Catch:{ all -> 0x025b }
            r15.addAll(r4)     // Catch:{ all -> 0x025b }
            r4 = 0
            r12[r1] = r4     // Catch:{ all -> 0x025b }
        L_0x01c4:
            if (r1 == r2) goto L_0x01cd
            int r1 = r1 + 1
            r4 = r29
            goto L_0x0194
        L_0x01cb:
            r29 = r4
        L_0x01cd:
            r4 = r34
            int r1 = r15.size()     // Catch:{ all -> 0x025b }
            r2 = 32
            if (r1 >= r2) goto L_0x01ed
            int r1 = r3.size()     // Catch:{ all -> 0x025b }
            r2 = 1024(0x400, float:1.435E-42)
            if (r1 >= r2) goto L_0x01ef
            if (r39 == 0) goto L_0x01e2
            goto L_0x01ef
        L_0x01e2:
            r34 = r3
            r21 = r12
            r35 = r13
            r12 = r37
            r37 = r6
            goto L_0x0248
        L_0x01ed:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x01ef:
            wy0.a r1 = f301832a     // Catch:{ all -> 0x025b }
            yy0.b r1 = r1.mo142120e()     // Catch:{ all -> 0x025b }
            r21 = r12
            r12 = 32
            r2 = r3
            r34 = r3
            r3 = r15
            r35 = r13
            r12 = r37
            r37 = r6
            r6 = r45
            r1.mo142691Ow(r2, r3, r4, r6)     // Catch:{ all -> 0x0257 }
            java.util.Iterator r1 = r15.iterator()     // Catch:{ all -> 0x0257 }
            r2 = 0
        L_0x020e:
            boolean r4 = r1.hasNext()     // Catch:{ all -> 0x0257 }
            if (r4 == 0) goto L_0x021e
            java.lang.Object r4 = r1.next()     // Catch:{ all -> 0x0257 }
            yy0.a r4 = (yy0.C102970a) r4     // Catch:{ all -> 0x0257 }
            long r4 = r4.field_diskSpace     // Catch:{ all -> 0x0257 }
            long r2 = r2 + r4
            goto L_0x020e
        L_0x021e:
            long r32 = r32 + r2
            int r1 = r15.size()     // Catch:{ all -> 0x0257 }
            int r28 = r28 + r1
            int r1 = r34.size()     // Catch:{ all -> 0x0257 }
            int r27 = r27 + r1
            int r1 = r34.size()     // Catch:{ all -> 0x0257 }
            long r1 = (long) r1     // Catch:{ all -> 0x0257 }
            long r1 = r30 + r1
            r34.clear()     // Catch:{ all -> 0x0257 }
            r15.clear()     // Catch:{ all -> 0x0257 }
            if (r7 == 0) goto L_0x0246
            long r3 = r1 - r25
            int r5 = (r3 > r23 ? 1 : (r3 == r23 ? 0 : -1))
            if (r5 <= 0) goto L_0x0246
            r7.mo137337a(r1, r12)     // Catch:{ all -> 0x0257 }
            r25 = r1
        L_0x0246:
            r30 = r1
        L_0x0248:
            r4 = r12
            r12 = r21
            r3 = r34
            r13 = r35
            r6 = r37
            r21 = r39
            r1 = 32
            goto L_0x0107
        L_0x0257:
            r0 = move-exception
            goto L_0x025e
        L_0x0259:
            r0 = move-exception
            goto L_0x025c
        L_0x025b:
            r0 = move-exception
        L_0x025c:
            r35 = r13
        L_0x025e:
            r2 = r0
            r1 = r35
            goto L_0x0283
        L_0x0262:
            r34 = r3
            r37 = r6
            r21 = r12
            r35 = r13
            r12 = r4
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x027f }
            r1 = r35
            r2 = 0
            cy3.C58003b.m67160a(r1, r2)     // Catch:{ OperationCanceledException -> 0x027c, all -> 0x0566 }
            r3 = r27
            r4 = r28
            r1 = r30
            r30 = r25
            goto L_0x0297
        L_0x027c:
            r0 = move-exception
            goto L_0x038c
        L_0x027f:
            r0 = move-exception
            r1 = r35
            r2 = r0
        L_0x0283:
            throw r2     // Catch:{ all -> 0x0284 }
        L_0x0284:
            r0 = move-exception
            r3 = r0
            cy3.C58003b.m67160a(r1, r2)     // Catch:{ OperationCanceledException -> 0x027c, all -> 0x0566 }
            throw r3     // Catch:{ OperationCanceledException -> 0x027c, all -> 0x0566 }
        L_0x028a:
            r34 = r3
            r37 = r6
            r21 = r12
            r12 = r4
            r1 = r30
            r3 = 0
            r4 = 0
            r32 = 0
        L_0x0297:
            if (r8 == 0) goto L_0x029e
            r45.throwIfCanceled()     // Catch:{ OperationCanceledException -> 0x055e, all -> 0x0566 }
            rx3.b0 r5 = rx3.C13598b0.f38549a     // Catch:{ OperationCanceledException -> 0x055e, all -> 0x0566 }
        L_0x029e:
            if (r7 == 0) goto L_0x02ae
            int r1 = r0.size()     // Catch:{ OperationCanceledException -> 0x055e, all -> 0x0566 }
            long r1 = (long) r1     // Catch:{ OperationCanceledException -> 0x055e, all -> 0x0566 }
            long r1 = r12 - r1
            r7.mo137337a(r1, r12)     // Catch:{ OperationCanceledException -> 0x055e, all -> 0x0566 }
            goto L_0x02ae
        L_0x02ab:
            r12 = r10
            goto L_0x0561
        L_0x02ae:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ OperationCanceledException -> 0x055e, all -> 0x0566 }
            r5.<init>()     // Catch:{ OperationCanceledException -> 0x055e, all -> 0x0566 }
            java.lang.String r6 = "Linear scan, messages: "
            r5.append(r6)     // Catch:{ OperationCanceledException -> 0x055e, all -> 0x0566 }
            r5.append(r3)     // Catch:{ OperationCanceledException -> 0x055e, all -> 0x0566 }
            r5.append(r9)     // Catch:{ OperationCanceledException -> 0x055e, all -> 0x0566 }
            r5.append(r4)     // Catch:{ OperationCanceledException -> 0x055e, all -> 0x0566 }
            java.lang.String r5 = r5.toString()     // Catch:{ OperationCanceledException -> 0x055e, all -> 0x0566 }
            r11.mo14358a(r14, r5)     // Catch:{ OperationCanceledException -> 0x055e, all -> 0x0566 }
            eb0.c r5 = eb0.C97625j3.m125812b()     // Catch:{ OperationCanceledException -> 0x055e, all -> 0x0566 }
            g62.l r6 = r5.mo105911z()     // Catch:{ OperationCanceledException -> 0x055e, all -> 0x0566 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ OperationCanceledException -> 0x055e, all -> 0x0566 }
            r25 = r1
            r5 = r4
            r1 = 0
            r4 = r3
        L_0x02d9:
            boolean r2 = r0.hasNext()     // Catch:{ OperationCanceledException -> 0x0557, all -> 0x0566 }
            if (r2 == 0) goto L_0x042d
            r2 = 0
        L_0x02e0:
            boolean r3 = r0.hasNext()     // Catch:{ OperationCanceledException -> 0x0421, all -> 0x0566 }
            if (r3 == 0) goto L_0x030c
            r3 = 32
            if (r2 >= r3) goto L_0x030c
            java.lang.Object r3 = r0.next()     // Catch:{ OperationCanceledException -> 0x0305, all -> 0x0566 }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ OperationCanceledException -> 0x0305, all -> 0x0566 }
            int r18 = r2 + 1
            int r2 = r2 + r1
            r27 = r4
            wy0.a$g r4 = new wy0.a$g     // Catch:{ OperationCanceledException -> 0x0363, all -> 0x0566 }
            r4.<init>(r6, r3)     // Catch:{ OperationCanceledException -> 0x0363, all -> 0x0566 }
            java.util.concurrent.Future r3 = r10.submit(r4)     // Catch:{ OperationCanceledException -> 0x0363, all -> 0x0566 }
            r21[r2] = r3     // Catch:{ OperationCanceledException -> 0x0363, all -> 0x0566 }
            r2 = r18
            r4 = r27
            goto L_0x02e0
        L_0x0305:
            r0 = move-exception
            r27 = r4
        L_0x0308:
            r28 = r5
            goto L_0x038c
        L_0x030c:
            r27 = r4
            if (r1 != 0) goto L_0x0313
            r4 = 32
            goto L_0x0314
        L_0x0313:
            r4 = 0
        L_0x0314:
            boolean r1 = r0.hasNext()     // Catch:{ OperationCanceledException -> 0x0418, all -> 0x0566 }
            if (r1 != 0) goto L_0x0322
            r1 = 64
            r2 = 0
            my3.j r3 = my3.C61595o.m72301i(r2, r1)     // Catch:{ OperationCanceledException -> 0x0363, all -> 0x0566 }
            goto L_0x0328
        L_0x0322:
            int r1 = r4 + 32
            my3.j r3 = my3.C61595o.m72301i(r4, r1)     // Catch:{ OperationCanceledException -> 0x0418, all -> 0x0566 }
        L_0x0328:
            int r1 = r3.f175174d     // Catch:{ OperationCanceledException -> 0x0418, all -> 0x0413 }
            int r2 = r3.f175175e     // Catch:{ OperationCanceledException -> 0x0418, all -> 0x0413 }
            if (r1 > r2) goto L_0x0365
        L_0x032e:
            r3 = r21[r1]     // Catch:{ OperationCanceledException -> 0x0363, all -> 0x0566 }
            if (r3 == 0) goto L_0x0339
            java.lang.Object r3 = r3.get()     // Catch:{ OperationCanceledException -> 0x0363, all -> 0x0566 }
            rx3.l r3 = (rx3.C13604l) r3     // Catch:{ OperationCanceledException -> 0x0363, all -> 0x0566 }
            goto L_0x033a
        L_0x0339:
            r3 = 0
        L_0x033a:
            if (r3 != 0) goto L_0x0343
            r18 = r4
            r28 = r5
            r5 = r34
            goto L_0x0358
        L_0x0343:
            r18 = r4
            A r4 = r3.f38555d     // Catch:{ OperationCanceledException -> 0x0363, all -> 0x0566 }
            r28 = r5
            r5 = r34
            r5.add(r4)     // Catch:{ OperationCanceledException -> 0x027c, all -> 0x0566 }
            B r3 = r3.f38556e     // Catch:{ OperationCanceledException -> 0x027c, all -> 0x0566 }
            java.util.Collection r3 = (java.util.Collection) r3     // Catch:{ OperationCanceledException -> 0x027c, all -> 0x0566 }
            r15.addAll(r3)     // Catch:{ OperationCanceledException -> 0x027c, all -> 0x0566 }
            r3 = 0
            r21[r1] = r3     // Catch:{ OperationCanceledException -> 0x027c, all -> 0x0566 }
        L_0x0358:
            if (r1 == r2) goto L_0x036b
            int r1 = r1 + 1
            r34 = r5
            r4 = r18
            r5 = r28
            goto L_0x032e
        L_0x0363:
            r0 = move-exception
            goto L_0x0308
        L_0x0365:
            r18 = r4
            r28 = r5
            r5 = r34
        L_0x036b:
            int r1 = r15.size()     // Catch:{ OperationCanceledException -> 0x0408, all -> 0x0566 }
            r2 = 32
            if (r1 >= r2) goto L_0x0393
            int r1 = r5.size()     // Catch:{ OperationCanceledException -> 0x027c, all -> 0x0566 }
            r4 = 1024(0x400, float:1.435E-42)
            if (r1 >= r4) goto L_0x0395
            boolean r1 = r0.hasNext()     // Catch:{ OperationCanceledException -> 0x027c, all -> 0x0566 }
            if (r1 != 0) goto L_0x0382
            goto L_0x0395
        L_0x0382:
            r34 = r5
            r1 = r18
            r4 = r27
            r5 = r28
            goto L_0x02d9
        L_0x038c:
            r12 = r10
            r3 = r27
            r4 = r28
            goto L_0x0561
        L_0x0393:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x0395:
            yy0.b r1 = r43.mo142120e()     // Catch:{ OperationCanceledException -> 0x0408, all -> 0x0566 }
            r34 = -1
            r2 = r5
            r3 = r15
            r8 = r28
            r29 = 1024(0x400, float:1.435E-42)
            r28 = r18
            r18 = r5
            r42 = r27
            r27 = r10
            r10 = r42
            r4 = r34
            r34 = r6
            r6 = r45
            r1.mo142691Ow(r2, r3, r4, r6)     // Catch:{ OperationCanceledException -> 0x0406, all -> 0x054f }
            java.util.Iterator r1 = r15.iterator()     // Catch:{ OperationCanceledException -> 0x0406, all -> 0x054f }
            r2 = 0
        L_0x03ba:
            boolean r4 = r1.hasNext()     // Catch:{ OperationCanceledException -> 0x0406, all -> 0x054f }
            if (r4 == 0) goto L_0x03ca
            java.lang.Object r4 = r1.next()     // Catch:{ OperationCanceledException -> 0x0406, all -> 0x054f }
            yy0.a r4 = (yy0.C102970a) r4     // Catch:{ OperationCanceledException -> 0x0406, all -> 0x054f }
            long r4 = r4.field_diskSpace     // Catch:{ OperationCanceledException -> 0x0406, all -> 0x054f }
            long r2 = r2 + r4
            goto L_0x03ba
        L_0x03ca:
            long r32 = r32 + r2
            int r1 = r15.size()     // Catch:{ OperationCanceledException -> 0x0406, all -> 0x054f }
            int r5 = r8 + r1
            int r1 = r18.size()     // Catch:{ OperationCanceledException -> 0x0404, all -> 0x054f }
            int r4 = r10 + r1
            int r1 = r18.size()     // Catch:{ OperationCanceledException -> 0x0400, all -> 0x054f }
            long r1 = (long) r1     // Catch:{ OperationCanceledException -> 0x0400, all -> 0x054f }
            long r1 = r25 + r1
            r18.clear()     // Catch:{ OperationCanceledException -> 0x0400, all -> 0x054f }
            r15.clear()     // Catch:{ OperationCanceledException -> 0x0400, all -> 0x054f }
            if (r7 == 0) goto L_0x03f2
            long r25 = r1 - r30
            int r3 = (r25 > r23 ? 1 : (r25 == r23 ? 0 : -1))
            if (r3 <= 0) goto L_0x03f2
            r7.mo137337a(r1, r12)     // Catch:{ OperationCanceledException -> 0x0400, all -> 0x054f }
            r30 = r1
        L_0x03f2:
            r8 = r45
            r25 = r1
            r10 = r27
            r1 = r28
            r6 = r34
            r34 = r18
            goto L_0x02d9
        L_0x0400:
            r0 = move-exception
            r3 = r4
            r4 = r5
            goto L_0x0429
        L_0x0404:
            r0 = move-exception
            goto L_0x0427
        L_0x0406:
            r0 = move-exception
            goto L_0x0411
        L_0x0408:
            r0 = move-exception
            r8 = r28
            r42 = r27
            r27 = r10
            r10 = r42
        L_0x0411:
            r4 = r8
            goto L_0x0428
        L_0x0413:
            r0 = move-exception
            r27 = r10
            goto L_0x0550
        L_0x0418:
            r0 = move-exception
            r8 = r5
            r42 = r27
            r27 = r10
            r10 = r42
            goto L_0x0426
        L_0x0421:
            r0 = move-exception
            r8 = r5
            r27 = r10
            r10 = r4
        L_0x0426:
            r5 = r8
        L_0x0427:
            r4 = r5
        L_0x0428:
            r3 = r10
        L_0x0429:
            r12 = r27
            goto L_0x0561
        L_0x042d:
            r8 = r5
            r27 = r10
            r10 = r4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ OperationCanceledException -> 0x0553, all -> 0x054f }
            r0.<init>()     // Catch:{ OperationCanceledException -> 0x0553, all -> 0x054f }
            java.lang.String r1 = "Dirty scan, messages: "
            r0.append(r1)     // Catch:{ OperationCanceledException -> 0x0553, all -> 0x054f }
            r0.append(r10)     // Catch:{ OperationCanceledException -> 0x0553, all -> 0x054f }
            r0.append(r9)     // Catch:{ OperationCanceledException -> 0x0553, all -> 0x054f }
            r0.append(r8)     // Catch:{ OperationCanceledException -> 0x0553, all -> 0x054f }
            java.lang.String r0 = r0.toString()     // Catch:{ OperationCanceledException -> 0x0553, all -> 0x054f }
            r11.mo14358a(r14, r0)     // Catch:{ OperationCanceledException -> 0x0553, all -> 0x054f }
            yy0.b r0 = r43.mo142120e()     // Catch:{ OperationCanceledException -> 0x0553, all -> 0x054f }
            java.util.List r0 = r0.mo142702mL()     // Catch:{ OperationCanceledException -> 0x0553, all -> 0x054f }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ OperationCanceledException -> 0x0553, all -> 0x054f }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ OperationCanceledException -> 0x0553, all -> 0x054f }
            gy3.d0 r1 = new gy3.d0     // Catch:{ OperationCanceledException -> 0x0553, all -> 0x054f }
            r1.<init>()     // Catch:{ OperationCanceledException -> 0x0553, all -> 0x054f }
            gy3.d0 r2 = new gy3.d0     // Catch:{ OperationCanceledException -> 0x0553, all -> 0x054f }
            r2.<init>()     // Catch:{ OperationCanceledException -> 0x0553, all -> 0x054f }
            gy3.d0 r3 = new gy3.d0     // Catch:{ OperationCanceledException -> 0x0553, all -> 0x054f }
            r3.<init>()     // Catch:{ OperationCanceledException -> 0x0553, all -> 0x054f }
            r4 = 0
        L_0x0469:
            boolean r5 = r0.hasNext()     // Catch:{ OperationCanceledException -> 0x0553, all -> 0x054f }
            if (r5 == 0) goto L_0x04eb
            r5 = 0
        L_0x0470:
            boolean r6 = r0.hasNext()     // Catch:{ OperationCanceledException -> 0x0553, all -> 0x054f }
            if (r6 == 0) goto L_0x0494
            r6 = 32
            if (r5 >= r6) goto L_0x0494
            java.lang.Object r12 = r0.next()     // Catch:{ OperationCanceledException -> 0x0553, all -> 0x054f }
            android.util.Pair r12 = (android.util.Pair) r12     // Catch:{ OperationCanceledException -> 0x0553, all -> 0x054f }
            int r13 = r5 + 1
            int r5 = r5 + r4
            wy0.a$h r6 = new wy0.a$h     // Catch:{ OperationCanceledException -> 0x0553, all -> 0x054f }
            r6.<init>(r12, r3, r1, r2)     // Catch:{ OperationCanceledException -> 0x0553, all -> 0x054f }
            r12 = r27
            java.util.concurrent.Future r6 = r12.submit(r6)     // Catch:{ OperationCanceledException -> 0x04e8 }
            r37[r5] = r6     // Catch:{ OperationCanceledException -> 0x04e8 }
            r27 = r12
            r5 = r13
            goto L_0x0470
        L_0x0494:
            r12 = r27
            if (r4 != 0) goto L_0x049b
            r4 = 32
            goto L_0x049c
        L_0x049b:
            r4 = 0
        L_0x049c:
            boolean r5 = r0.hasNext()     // Catch:{ OperationCanceledException -> 0x04e8 }
            if (r5 != 0) goto L_0x04aa
            r5 = 64
            r6 = 0
            my3.j r13 = my3.C61595o.m72301i(r6, r5)     // Catch:{ OperationCanceledException -> 0x04e8 }
            goto L_0x04b3
        L_0x04aa:
            r5 = 64
            r6 = 0
            int r13 = r4 + 32
            my3.j r13 = my3.C61595o.m72301i(r4, r13)     // Catch:{ OperationCanceledException -> 0x04e8 }
        L_0x04b3:
            int r5 = r13.f175174d     // Catch:{ OperationCanceledException -> 0x04e8 }
            int r13 = r13.f175175e     // Catch:{ OperationCanceledException -> 0x04e8 }
            if (r5 > r13) goto L_0x04d7
        L_0x04b9:
            r18 = r37[r5]     // Catch:{ OperationCanceledException -> 0x04e8 }
            if (r18 == 0) goto L_0x04c6
            java.lang.Object r18 = r18.get()     // Catch:{ OperationCanceledException -> 0x04e8 }
            yy0.a r18 = (yy0.C102970a) r18     // Catch:{ OperationCanceledException -> 0x04e8 }
            r6 = r18
            goto L_0x04c7
        L_0x04c6:
            r6 = 0
        L_0x04c7:
            if (r6 != 0) goto L_0x04cb
            r6 = 0
            goto L_0x04d1
        L_0x04cb:
            r15.add(r6)     // Catch:{ OperationCanceledException -> 0x04e8 }
            r6 = 0
            r37[r5] = r6     // Catch:{ OperationCanceledException -> 0x04e8 }
        L_0x04d1:
            if (r5 == r13) goto L_0x04d8
            int r5 = r5 + 1
            r6 = 0
            goto L_0x04b9
        L_0x04d7:
            r6 = 0
        L_0x04d8:
            yy0.b r5 = r43.mo142120e()     // Catch:{ OperationCanceledException -> 0x04e8 }
            r5.mo142695Yt(r15)     // Catch:{ OperationCanceledException -> 0x04e8 }
            r15.clear()     // Catch:{ OperationCanceledException -> 0x04e8 }
            r27 = r12
            goto L_0x0469
        L_0x04e5:
            r0 = move-exception
            goto L_0x05a3
        L_0x04e8:
            r0 = move-exception
            goto L_0x055b
        L_0x04eb:
            r12 = r27
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ OperationCanceledException -> 0x04e8 }
            r0.<init>()     // Catch:{ OperationCanceledException -> 0x04e8 }
            java.lang.String r4 = "Refresh links, links: "
            r0.append(r4)     // Catch:{ OperationCanceledException -> 0x04e8 }
            int r1 = r1.f27483d     // Catch:{ OperationCanceledException -> 0x04e8 }
            r0.append(r1)     // Catch:{ OperationCanceledException -> 0x04e8 }
            r0.append(r9)     // Catch:{ OperationCanceledException -> 0x04e8 }
            int r1 = r2.f27483d     // Catch:{ OperationCanceledException -> 0x04e8 }
            r0.append(r1)     // Catch:{ OperationCanceledException -> 0x04e8 }
            java.lang.String r1 = ", invalid: "
            r0.append(r1)     // Catch:{ OperationCanceledException -> 0x04e8 }
            int r1 = r3.f27483d     // Catch:{ OperationCanceledException -> 0x04e8 }
            r0.append(r1)     // Catch:{ OperationCanceledException -> 0x04e8 }
            java.lang.String r0 = r0.toString()     // Catch:{ OperationCanceledException -> 0x04e8 }
            r11.mo14358a(r14, r0)     // Catch:{ OperationCanceledException -> 0x04e8 }
            if (r7 == 0) goto L_0x0523
            r2 = 0
            r1 = r44
            r3 = r32
            r5 = r8
            r6 = r10
            r1.mo137338b(r2, r3, r5, r6)     // Catch:{ OperationCanceledException -> 0x04e8 }
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ OperationCanceledException -> 0x04e8 }
        L_0x0523:
            if (r22 == 0) goto L_0x059e
            java.lang.String r16 = "com/tencent/mm/plugin/calcwx/CalcWxNewService"
            java.lang.String r17 = "scan"
            java.lang.String r18 = "(Lcom/tencent/mm/plugin/calcwx/ScanCallback;Lcom/tencent/wcdb/support/CancellationSignal;)V"
            java.lang.String r19 = "android/os/PowerManager$WakeLock_EXEC_"
            java.lang.String r20 = "release"
            java.lang.String r21 = "()V"
            r15 = r22
            j20.C117292a.m165357c(r15, r16, r17, r18, r19, r20, r21)     // Catch:{ RuntimeException -> 0x059e }
            r22.release()     // Catch:{ RuntimeException -> 0x059e }
            java.lang.String r16 = "com/tencent/mm/plugin/calcwx/CalcWxNewService"
            java.lang.String r17 = "scan"
            java.lang.String r18 = "(Lcom/tencent/mm/plugin/calcwx/ScanCallback;Lcom/tencent/wcdb/support/CancellationSignal;)V"
            java.lang.String r19 = "android/os/PowerManager$WakeLock_EXEC_"
            java.lang.String r20 = "release"
        L_0x0547:
            java.lang.String r21 = "()V"
            r15 = r22
            j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)     // Catch:{ RuntimeException -> 0x059e }
            goto L_0x059c
        L_0x054f:
            r0 = move-exception
        L_0x0550:
            r12 = r27
            goto L_0x05a3
        L_0x0553:
            r0 = move-exception
            r12 = r27
            goto L_0x055b
        L_0x0557:
            r0 = move-exception
            r8 = r5
            r12 = r10
            r10 = r4
        L_0x055b:
            r4 = r8
            r3 = r10
            goto L_0x0561
        L_0x055e:
            r0 = move-exception
            goto L_0x02ab
        L_0x0561:
            r6 = r3
            r5 = r4
            r3 = r32
            goto L_0x056f
        L_0x0566:
            r0 = move-exception
            r12 = r10
            goto L_0x05a3
        L_0x0569:
            r0 = move-exception
            r12 = r10
            r3 = 0
            r5 = 0
            r6 = 0
        L_0x056f:
            if (r7 == 0) goto L_0x05a2
            r2 = 1
            r1 = r44
            r1.mo137338b(r2, r3, r5, r6)     // Catch:{ all -> 0x04e5 }
            if (r22 == 0) goto L_0x059e
            java.lang.String r16 = "com/tencent/mm/plugin/calcwx/CalcWxNewService"
            java.lang.String r17 = "scan"
            java.lang.String r18 = "(Lcom/tencent/mm/plugin/calcwx/ScanCallback;Lcom/tencent/wcdb/support/CancellationSignal;)V"
            java.lang.String r19 = "android/os/PowerManager$WakeLock_EXEC_"
            java.lang.String r20 = "release"
            java.lang.String r21 = "()V"
            r15 = r22
            j20.C117292a.m165357c(r15, r16, r17, r18, r19, r20, r21)     // Catch:{ RuntimeException -> 0x059e }
            r22.release()     // Catch:{ RuntimeException -> 0x059e }
            java.lang.String r16 = "com/tencent/mm/plugin/calcwx/CalcWxNewService"
            java.lang.String r17 = "scan"
            java.lang.String r18 = "(Lcom/tencent/mm/plugin/calcwx/ScanCallback;Lcom/tencent/wcdb/support/CancellationSignal;)V"
            java.lang.String r19 = "android/os/PowerManager$WakeLock_EXEC_"
            java.lang.String r20 = "release"
            goto L_0x0547
        L_0x059c:
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ RuntimeException -> 0x059e }
        L_0x059e:
            r12.shutdown()     // Catch:{ Exception -> 0x05a1 }
        L_0x05a1:
            return
        L_0x05a2:
            throw r0     // Catch:{ all -> 0x04e5 }
        L_0x05a3:
            if (r22 == 0) goto L_0x05d0
            java.lang.String r16 = "com/tencent/mm/plugin/calcwx/CalcWxNewService"
            java.lang.String r17 = "scan"
            java.lang.String r18 = "(Lcom/tencent/mm/plugin/calcwx/ScanCallback;Lcom/tencent/wcdb/support/CancellationSignal;)V"
            java.lang.String r19 = "android/os/PowerManager$WakeLock_EXEC_"
            java.lang.String r20 = "release"
            java.lang.String r21 = "()V"
            r15 = r22
            j20.C117292a.m165357c(r15, r16, r17, r18, r19, r20, r21)     // Catch:{ RuntimeException -> 0x05d0 }
            r22.release()     // Catch:{ RuntimeException -> 0x05d0 }
            java.lang.String r16 = "com/tencent/mm/plugin/calcwx/CalcWxNewService"
            java.lang.String r17 = "scan"
            java.lang.String r18 = "(Lcom/tencent/mm/plugin/calcwx/ScanCallback;Lcom/tencent/wcdb/support/CancellationSignal;)V"
            java.lang.String r19 = "android/os/PowerManager$WakeLock_EXEC_"
            java.lang.String r20 = "release"
            java.lang.String r21 = "()V"
            r15 = r22
            j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)     // Catch:{ RuntimeException -> 0x05d0 }
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ RuntimeException -> 0x05d0 }
        L_0x05d0:
            r12.shutdown()     // Catch:{ Exception -> 0x05d3 }
        L_0x05d3:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wy0.C102506a.mo142124j(wy0.u, com.tencent.wcdb.support.CancellationSignal):void");
    }

    /* renamed from: k */
    public final void mo142125k(CancellationSignal cancellationSignal) {
        Throwable th;
        CancellationSignal cancellationSignal2 = cancellationSignal;
        try {
            Cursor rawQueryWithFactory = mo142120e().f303871d.mo125615f().rawQueryWithFactory(SQLiteDirectCursor.FACTORY, "SELECT group_concat(rowid), group_concat(path, '|'), group_concat(CASE WHEN hash IS NULL THEN '0' ELSE '1' END), count(path) AS cnt, size FROM WxFileIndex3 GROUP BY size HAVING cnt > 1 AND cnt > count(hash)", (Object[]) null, "WxFileIndex3", cancellationSignal);
            while (rawQueryWithFactory.moveToNext()) {
                try {
                    if (cancellationSignal2 != null) {
                        cancellationSignal.throwIfCanceled();
                    }
                    String string = rawQueryWithFactory.getString(0);
                    C87412m.m108593f(string, "cursor.getString(0)");
                    List s = C112354s.m153296s(C112354s.m153290m(C112550d0.m153786V(string, new char[]{','}, false, 0, 6, (Object) null), C102515k.f301863d));
                    String string2 = rawQueryWithFactory.getString(1);
                    C87412m.m108593f(string2, "cursor.getString(1)");
                    List T = C112550d0.m153784T(string2, new char[]{'|'}, false, 0, 6, (Object) null);
                    String string3 = rawQueryWithFactory.getString(2);
                    C87412m.m108593f(string3, "cursor.getString(2)");
                    List s2 = C112354s.m153296s(C112354s.m153290m(C112550d0.m153786V(string3, new char[]{','}, false, 0, 6, (Object) null), C38360j.f101231d));
                    if (s.size() != T.size()) {
                        Log.m105920e("MicroMsg.CalcWxNewService", "List size not matched: " + s.size() + " <-> " + T.size());
                    } else {
                        FutureTask futureTask = new FutureTask(new C38359i(T, s2, s, cancellationSignal2));
                        ((C119157j) C119157j.f356862d).mo183875f(futureTask);
                        futureTask.get();
                    }
                } catch (Throwable th4) {
                    Throwable th5 = th4;
                    C58003b.m67160a(rawQueryWithFactory, th);
                    throw th5;
                }
            }
            C13598b0 b0Var = C13598b0.f38549a;
            C58003b.m67160a(rawQueryWithFactory, (Throwable) null);
        } catch (OperationCanceledException unused) {
            Log.m105924i("MicroMsg.CalcWxNewService", "HASH calculation cancelled");
        }
    }
}
