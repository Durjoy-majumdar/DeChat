package a30;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.util.SparseArray;
import com.tencent.mars.comm.WakerLock;
import com.tencent.p014mm.autogen.events.ReportWakeLockStatsEvent;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.WeChatPermissions;
import com.tencent.xweb.internal.ConstValue;
import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: a30.a */
public class C112744a {

    /* renamed from: a */
    public static SparseArray<C112746b> f337600a = new SparseArray<>();

    /* renamed from: b */
    public static MMHandler f337601b = new MMHandler(Looper.getMainLooper());

    /* renamed from: c */
    public static final byte[] f337602c = new byte[0];

    /* renamed from: a30.a$a */
    public static class C112745a implements Runnable {

        /* renamed from: d */
        public WakerLock f337603d;

        public C112745a(WakerLock wakerLock) {
            this.f337603d = wakerLock;
        }

        public void run() {
            synchronized (C112744a.f337602c) {
                C112746b bVar = C112744a.f337600a.get(this.f337603d.hashCode());
                if (bVar != null) {
                    Log.m105929w("MicroMsg.WakeLockManager", "wakerlock held too long: [%d,%d] @[%s] force to unlock it. state: %s", Integer.valueOf(this.f337603d.hashCode()), Integer.valueOf(this.f337603d.innerWakeLockHashCode()), this.f337603d.getCreatePosStackLine(), bVar.mo164504a());
                } else {
                    Log.m105929w("MicroMsg.WakeLockManager", "wakerlock held too long: [%d,%d] @[%s] force to unlock it. state: %s", Integer.valueOf(this.f337603d.hashCode()), Integer.valueOf(this.f337603d.innerWakeLockHashCode()), this.f337603d.getCreatePosStackLine(), "#lost-trace-state#");
                }
                this.f337603d.unLock();
            }
        }
    }

    /* renamed from: a30.a$b */
    public static class C112746b {

        /* renamed from: a */
        public volatile boolean f337604a = false;

        /* renamed from: b */
        public C112745a f337605b = null;

        /* renamed from: c */
        public Map<String, C112747a> f337606c = new HashMap();

        /* renamed from: a30.a$b$a */
        public static class C112747a {

            /* renamed from: a */
            public String f337607a;

            /* renamed from: b */
            public long f337608b;

            public C112747a(String str, long j) {
                this.f337607a = str;
                this.f337608b = j;
            }
        }

        public C112746b(WakerLock wakerLock) {
            this.f337605b = new C112745a(wakerLock);
        }

        /* renamed from: a */
        public String mo164504a() {
            Collection<C112747a> values = ((HashMap) this.f337606c).values();
            StringBuilder sb = new StringBuilder();
            boolean z = true;
            for (C112747a aVar : values) {
                if (z) {
                    z = false;
                } else {
                    sb.append(',');
                }
                if (aVar.f337608b != 0) {
                    sb.append('{');
                    sb.append(aVar.f337607a);
                    sb.append(',');
                    sb.append(SystemClock.elapsedRealtime() - aVar.f337608b);
                    sb.append('}');
                }
            }
            if (sb.length() == 0) {
                sb.append("<empty>");
            }
            return sb.toString();
        }
    }

    /* renamed from: a30.a$c */
    public static class C112748c {

        /* renamed from: a */
        public static int f337609a;

        /* renamed from: b */
        public static long f337610b;

        /* renamed from: c */
        public static long f337611c;

        /* renamed from: d */
        public static final HashMap<String, C112749a> f337612d = new HashMap<>();

        /* renamed from: e */
        public static final byte[] f337613e = new byte[0];

        /* renamed from: f */
        public static BroadcastReceiver f337614f = null;

        /* renamed from: a30.a$c$a */
        public static class C112749a implements Externalizable {

            /* renamed from: d */
            public String f337615d = "";

            /* renamed from: e */
            public String f337616e = "";

            /* renamed from: f */
            public String f337617f = "";

            /* renamed from: g */
            public boolean f337618g = false;

            /* renamed from: h */
            public int f337619h = 0;

            /* renamed from: i */
            public int f337620i = 0;

            /* renamed from: j */
            public long f337621j = 0;

            /* renamed from: n */
            public long f337622n = 0;

            /* renamed from: o */
            public AtomicInteger f337623o = new AtomicInteger(0);

            public void readExternal(ObjectInput objectInput) {
                synchronized (C112748c.f337613e) {
                    this.f337615d = objectInput.readUTF();
                    this.f337616e = objectInput.readUTF();
                    this.f337619h = objectInput.readInt();
                    this.f337620i = objectInput.readInt();
                    this.f337621j = objectInput.readLong();
                    this.f337617f = "";
                    this.f337618g = false;
                    this.f337622n = 0;
                    this.f337623o = new AtomicInteger(0);
                }
            }

            public void writeExternal(ObjectOutput objectOutput) {
                synchronized (C112748c.f337613e) {
                    objectOutput.writeUTF(this.f337615d);
                    objectOutput.writeUTF(this.f337616e);
                    objectOutput.writeInt(this.f337619h);
                    objectOutput.writeInt(this.f337620i);
                    objectOutput.writeLong(this.f337621j);
                }
            }
        }

        /* renamed from: a */
        public static void m154185a(String str, boolean z) {
            int myPid = Process.myPid();
            String processName = MMApplicationContext.getProcessName();
            if (myPid == f337609a) {
                if (z) {
                    m154186b(processName, str, SystemClock.elapsedRealtime());
                } else {
                    m154187c(processName, str, SystemClock.elapsedRealtime());
                }
            } else if (z) {
                Intent intent = new Intent("com.tencent.mm.ACTION.note_tracemsg_lock");
                intent.putExtra("pid", myPid);
                intent.putExtra(ConstValue.INIT_CONFIG_KEY_PROCESSNAME, processName);
                intent.putExtra("traceMsg", str);
                intent.putExtra("tick", SystemClock.elapsedRealtime());
                MMApplicationContext.getContext().sendBroadcast(intent, WeChatPermissions.PERMISSION_MM_MESSAGE());
            } else {
                Intent intent2 = new Intent("com.tencent.mm.ACTION.note_tracemsg_unlock");
                intent2.putExtra("pid", myPid);
                intent2.putExtra(ConstValue.INIT_CONFIG_KEY_PROCESSNAME, processName);
                intent2.putExtra("traceMsg", str);
                intent2.putExtra("tick", SystemClock.elapsedRealtime());
                MMApplicationContext.getContext().sendBroadcast(intent2, WeChatPermissions.PERMISSION_MM_MESSAGE());
            }
        }

        /* renamed from: b */
        public static void m154186b(String str, String str2, long j) {
            String str3 = str + "_" + str2;
            synchronized (f337613e) {
                HashMap<String, C112749a> hashMap = f337612d;
                C112749a aVar = hashMap.get(str3);
                if (aVar == null) {
                    aVar = new C112749a();
                    aVar.f337615d = str;
                    aVar.f337616e = str2;
                    aVar.f337621j = 0;
                    aVar.f337619h = 0;
                    aVar.f337620i = 0;
                    hashMap.put(str3, aVar);
                }
                if (aVar.f337623o.getAndIncrement() == 0) {
                    aVar.f337622n = j;
                    aVar.f337617f = NetStatusUtil.getNetTypeString(MMApplicationContext.getContext());
                    aVar.f337618g = CrashReportFactory.foreground;
                }
            }
        }

        /* renamed from: c */
        public static void m154187c(String str, String str2, long j) {
            HashMap<String, C112749a> hashMap;
            long j2;
            String str3 = str + "_" + str2;
            byte[] bArr = f337613e;
            synchronized (bArr) {
                hashMap = f337612d;
                C112749a aVar = hashMap.get(str3);
                if (aVar != null && aVar.f337623o.get() > 0) {
                    aVar.f337619h++;
                    if (aVar.f337623o.decrementAndGet() == 0) {
                        j2 = j - aVar.f337622n;
                        aVar.f337621j += j2;
                        aVar.f337620i++;
                    }
                }
                j2 = 0;
            }
            synchronized (bArr) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime - f337610b >= 21600000) {
                    if (!hashMap.isEmpty()) {
                        StringBuilder sb = new StringBuilder();
                        for (Map.Entry<String, C112749a> value : hashMap.entrySet()) {
                            C112749a aVar2 = (C112749a) value.getValue();
                            if (aVar2.f337620i > 0) {
                                sb.setLength(0);
                                sb.append(aVar2.f337615d);
                                sb.append(',');
                                sb.append(aVar2.f337616e.replace(",", "##"));
                                sb.append(',');
                                sb.append(aVar2.f337620i);
                                sb.append(',');
                                sb.append(aVar2.f337619h);
                                sb.append(',');
                                sb.append(aVar2.f337621j);
                                sb.append(',');
                                sb.append(aVar2.f337618g ? 1 : 0);
                                sb.append(',');
                                sb.append(aVar2.f337617f);
                                String sb4 = sb.toString();
                                ReportWakeLockStatsEvent reportWakeLockStatsEvent = new ReportWakeLockStatsEvent();
                                reportWakeLockStatsEvent.f343594d.f343595a = sb4;
                                reportWakeLockStatsEvent.publish();
                                Log.m105919d("MicroMsg.WakeLockStatsManager", "kvstat-str: %s", sb.toString());
                            }
                        }
                        f337612d.clear();
                    }
                    f337610b = elapsedRealtime;
                }
            }
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (j2 >= 14000 || elapsedRealtime2 - f337611c >= 3600000) {
                Log.m105918d("MicroMsg.WakeLockStatsManager", "saveStatsToStorage triggered.");
                m154188d();
                f337611c = elapsedRealtime2;
            }
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(4:35|(2:37|38)|39|40) */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a5, code lost:
            if (r3 != null) goto L_0x006e;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00b0 */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00ad A[SYNTHETIC, Splitter:B:37:0x00ad] */
        /* JADX WARNING: Unknown top exception splitter block from list: {B:39:0x00b0=Splitter:B:39:0x00b0, B:32:0x00a8=Splitter:B:32:0x00a8} */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void m154188d() {
            /*
                byte[] r0 = f337613e
                monitor-enter(r0)
                r1 = 0
                r2 = 0
                com.tencent.mm.vfs.m1 r3 = new com.tencent.mm.vfs.m1     // Catch:{ IOException -> 0x0098, all -> 0x0094 }
                android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ IOException -> 0x0098, all -> 0x0094 }
                java.io.File r4 = r4.getCacheDir()     // Catch:{ IOException -> 0x0098, all -> 0x0094 }
                java.lang.String r5 = "wakelock"
                r3.<init>((java.io.File) r4, (java.lang.String) r5)     // Catch:{ IOException -> 0x0098, all -> 0x0094 }
                java.lang.String r4 = r3.mo119971i()     // Catch:{ IOException -> 0x0098, all -> 0x0094 }
                boolean r4 = com.tencent.p014mm.vfs.C86013q1.m106461v(r4)     // Catch:{ IOException -> 0x0098, all -> 0x0094 }
                if (r4 == 0) goto L_0x0074
                java.lang.String r4 = "wakelock_stats.bin"
                android.net.Uri r3 = r3.f250486d     // Catch:{ IOException -> 0x0098, all -> 0x0094 }
                if (r3 != 0) goto L_0x002e
                android.net.Uri$Builder r3 = new android.net.Uri$Builder     // Catch:{ IOException -> 0x0098, all -> 0x0094 }
                r3.<init>()     // Catch:{ IOException -> 0x0098, all -> 0x0094 }
                android.net.Uri$Builder r3 = r3.path(r4)     // Catch:{ IOException -> 0x0098, all -> 0x0094 }
                goto L_0x0035
            L_0x002e:
                android.net.Uri$Builder r3 = r3.buildUpon()     // Catch:{ IOException -> 0x0098, all -> 0x0094 }
                r3.appendPath(r4)     // Catch:{ IOException -> 0x0098, all -> 0x0094 }
            L_0x0035:
                android.net.Uri r4 = r3.build()     // Catch:{ IOException -> 0x0098, all -> 0x0094 }
                java.lang.String r5 = r4.getPath()     // Catch:{ IOException -> 0x0098, all -> 0x0094 }
                if (r5 == 0) goto L_0x0055
                java.lang.String r5 = com.tencent.p014mm.vfs.C116299g2.m163855k(r5, r2, r2)     // Catch:{ IOException -> 0x0098, all -> 0x0094 }
                java.lang.String r6 = r4.getPath()     // Catch:{ IOException -> 0x0098, all -> 0x0094 }
                boolean r6 = r6.equals(r5)     // Catch:{ IOException -> 0x0098, all -> 0x0094 }
                if (r6 != 0) goto L_0x0055
                android.net.Uri$Builder r3 = r3.path(r5)     // Catch:{ IOException -> 0x0098, all -> 0x0094 }
                android.net.Uri r4 = r3.build()     // Catch:{ IOException -> 0x0098, all -> 0x0094 }
            L_0x0055:
                java.io.ObjectOutputStream r3 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x0098, all -> 0x0094 }
                com.tencent.mm.vfs.f0 r5 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ IOException -> 0x0098, all -> 0x0094 }
                com.tencent.mm.vfs.f0$h r5 = r5.mo177799l(r4, r1)     // Catch:{ IOException -> 0x0098, all -> 0x0094 }
                java.io.OutputStream r4 = com.tencent.p014mm.vfs.C86013q1.m106425G(r4, r5, r2)     // Catch:{ IOException -> 0x0098, all -> 0x0094 }
                r3.<init>(r4)     // Catch:{ IOException -> 0x0098, all -> 0x0094 }
                long r4 = f337610b     // Catch:{ IOException -> 0x0072 }
                r3.writeLong(r4)     // Catch:{ IOException -> 0x0072 }
                java.util.HashMap<java.lang.String, a30.a$c$a> r1 = f337612d     // Catch:{ IOException -> 0x0072 }
                r3.writeObject(r1)     // Catch:{ IOException -> 0x0072 }
            L_0x006e:
                r3.close()     // Catch:{ Exception -> 0x00a8 }
                goto L_0x00a8
            L_0x0072:
                r1 = move-exception
                goto L_0x009c
            L_0x0074:
                java.io.IOException r4 = new java.io.IOException     // Catch:{ IOException -> 0x0098, all -> 0x0094 }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0098, all -> 0x0094 }
                r5.<init>()     // Catch:{ IOException -> 0x0098, all -> 0x0094 }
                java.lang.String r6 = "failed to call VFSFileOp.mkdirs("
                r5.append(r6)     // Catch:{ IOException -> 0x0098, all -> 0x0094 }
                java.lang.String r3 = r3.mo119971i()     // Catch:{ IOException -> 0x0098, all -> 0x0094 }
                r5.append(r3)     // Catch:{ IOException -> 0x0098, all -> 0x0094 }
                java.lang.String r3 = ")"
                r5.append(r3)     // Catch:{ IOException -> 0x0098, all -> 0x0094 }
                java.lang.String r3 = r5.toString()     // Catch:{ IOException -> 0x0098, all -> 0x0094 }
                r4.<init>(r3)     // Catch:{ IOException -> 0x0098, all -> 0x0094 }
                throw r4     // Catch:{ IOException -> 0x0098, all -> 0x0094 }
            L_0x0094:
                r2 = move-exception
                r3 = r1
                r1 = r2
                goto L_0x00ab
            L_0x0098:
                r3 = move-exception
                r7 = r3
                r3 = r1
                r1 = r7
            L_0x009c:
                java.lang.String r4 = "MicroMsg.WakeLockStatsManager"
                java.lang.String r5 = "failed to save stats to storage."
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x00aa }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r1, r5, r2)     // Catch:{ all -> 0x00aa }
                if (r3 == 0) goto L_0x00a8
                goto L_0x006e
            L_0x00a8:
                monitor-exit(r0)     // Catch:{ all -> 0x00b1 }
                return
            L_0x00aa:
                r1 = move-exception
            L_0x00ab:
                if (r3 == 0) goto L_0x00b0
                r3.close()     // Catch:{ Exception -> 0x00b0 }
            L_0x00b0:
                throw r1     // Catch:{ all -> 0x00b1 }
            L_0x00b1:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x00b1 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: a30.C112744a.C112748c.m154188d():void");
        }
    }

    /* renamed from: a */
    public static void m154183a(WakerLock wakerLock, String str) {
        synchronized (f337602c) {
            C112746b bVar = f337600a.get(wakerLock.hashCode());
            if (bVar == null) {
                bVar = new C112746b(wakerLock);
                f337600a.put(wakerLock.hashCode(), bVar);
            }
            if (!((HashMap) bVar.f337606c).containsKey(str)) {
                ((HashMap) bVar.f337606c).put(str, new C112746b.C112747a(str, SystemClock.elapsedRealtime()));
            }
            C112748c.m154185a(str, true);
            MMHandler mMHandler = f337601b;
            if (!bVar.f337604a) {
                bVar.f337604a = true;
                mMHandler.postDelayed(bVar.f337605b, 60000);
            }
        }
    }
}
