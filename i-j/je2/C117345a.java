package je2;

import android.os.Environment;
import android.os.Looper;
import android.os.SystemClock;
import com.tencent.p014mm.app.C114660c0;
import com.tencent.p014mm.app.C114668z;
import com.tencent.p014mm.booter.C80824k0;
import com.tencent.p014mm.pluginsdk.model.C96783i1;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import kj2.C117407d;
import mu3.C109639a;
import oa1.C117731d;
import p723vf.C118672d;
import qe3.C89625d;
import rx3.C36568h;
import z04.C112550d0;
import zt3.C119146d;
import zt3.C119153f;
import zt3.C119154h;

/* renamed from: je2.a */
public final class C117345a implements C114668z, C96783i1.C96784a, C114660c0 {

    /* renamed from: d */
    public final AtomicInteger f351295d = new AtomicInteger();

    /* renamed from: e */
    public final AtomicInteger f351296e = new AtomicInteger();

    /* renamed from: f */
    public final ConcurrentHashMap<String, C108726b> f351297f = new ConcurrentHashMap<>();

    /* renamed from: g */
    public final boolean f351298g;

    /* renamed from: h */
    public final ConcurrentHashMap<String, C117347d> f351299h;

    /* renamed from: i */
    public final ConcurrentHashMap<String, C108725a> f351300i;

    /* renamed from: j */
    public AtomicLong f351301j;

    /* renamed from: n */
    public AtomicLong f351302n;

    /* renamed from: o */
    public AtomicLong f351303o;

    /* renamed from: p */
    public AtomicLong f351304p;

    /* renamed from: q */
    public AtomicLong f351305q;

    /* renamed from: r */
    public AtomicLong f351306r;

    /* renamed from: s */
    public int[] f351307s;

    /* renamed from: t */
    public final C117350h f351308t;

    /* renamed from: u */
    public final C87953f f351309u;

    /* renamed from: v */
    public final C117349g f351310v;

    /* renamed from: w */
    public long f351311w;

    /* renamed from: x */
    public long f351312x;

    /* renamed from: y */
    public final MTimerHandler f351313y;

    /* renamed from: je2.a$f */
    public static final class C87953f implements C119154h.C119155b {

        /* renamed from: a */
        public final boolean f254522a;

        /* renamed from: b */
        public final ConcurrentHashMap<String, String> f254523b = new ConcurrentHashMap<>();

        /* renamed from: c */
        public final /* synthetic */ C117345a f254524c;

        public C87953f(C117345a aVar) {
            this.f254524c = aVar;
            boolean g = C117731d.m166007c().mo182445g("clicfg_threadpool_hook_looper_enable", true, true);
            Log.m105928w("ThreadPool.Profiler", "[isHookResetLooper] " + g);
            this.f254522a = g;
        }

        /* renamed from: a */
        public boolean mo122412a() {
            return this.f254522a;
        }

        /* renamed from: b */
        public boolean mo122413b() {
            return false;
        }

        /* renamed from: c */
        public boolean mo122414c() {
            return true;
        }

        /* renamed from: d */
        public void mo122415d(Thread thread, String str) {
            C87412m.m108594g(thread, "thread");
            C87412m.m108594g(str, "task");
            if (this.f254524c.f351298g) {
                Pattern compile = Pattern.compile("[0-9]\\d*");
                C87412m.m108593f(compile, "compile(pattern)");
                String replaceAll = compile.matcher(str).replaceAll("?");
                C87412m.m108593f(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
                if (!this.f254523b.contains(replaceAll)) {
                    String str2 = "task=" + replaceAll + ' ' + thread;
                    Log.m105928w("ThreadPool.Profiler", "[onLooperPreparedAtTask] " + str2);
                    C117407d.INSTANCE.mo160131h(18762, 16, str2, str, 17, MMApplicationContext.getProcessName());
                    this.f254523b.put(replaceAll, String.valueOf(thread));
                }
            }
        }
    }

    /* renamed from: je2.a$a */
    public static final class C108725a {

        /* renamed from: a */
        public long f325619a;

        /* renamed from: b */
        public int f325620b;

        /* renamed from: c */
        public String f325621c;

        public C108725a(long j, int i, String str) {
            C87412m.m108594g(str, "name");
            this.f325619a = j;
            this.f325620b = i;
            this.f325621c = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C108725a)) {
                return false;
            }
            C108725a aVar = (C108725a) obj;
            return this.f325619a == aVar.f325619a && this.f325620b == aVar.f325620b && C87412m.m108589b(this.f325621c, aVar.f325621c);
        }

        public int hashCode() {
            long j = this.f325619a;
            return (((((int) (j ^ (j >>> 32))) * 31) + this.f325620b) * 31) + this.f325621c.hashCode();
        }

        public String toString() {
            return "{name=" + this.f325621c + " threadTime=" + this.f325619a + " count=" + this.f325620b + '}';
        }
    }

    /* renamed from: je2.a$b */
    public static final class C108726b {

        /* renamed from: a */
        public long f325622a;

        /* renamed from: b */
        public Thread f325623b;

        /* renamed from: c */
        public int f325624c;

        /* renamed from: d */
        public int f325625d;

        public C108726b(long j, Thread thread, int i) {
            this.f325622a = j;
            this.f325623b = thread;
            this.f325624c = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C108726b)) {
                return false;
            }
            C108726b bVar = (C108726b) obj;
            return this.f325622a == bVar.f325622a && C87412m.m108589b(this.f325623b, bVar.f325623b) && this.f325624c == bVar.f325624c;
        }

        public int hashCode() {
            long j = this.f325622a;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            Thread thread = this.f325623b;
            return ((i + (thread == null ? 0 : thread.hashCode())) * 31) + this.f325624c;
        }

        public String toString() {
            return "CheckInfo(time=" + this.f325622a + ", thread=" + this.f325623b + ", type=" + this.f325624c + ')';
        }
    }

    /* renamed from: je2.a$c */
    public static final class C117346c extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C117346c f351314d = new C117346c();

        public C117346c() {
            super(0);
        }

        public Object invoke() {
            int i = ((C80824k0.C80825a.C80826a) C80824k0.C80825a.MAIN_PROCESS).f237591d;
            return Integer.valueOf((i * 6) + ((int) Math.max(8.0f, ((float) i) * 1.5f)));
        }
    }

    /* renamed from: je2.a$d */
    public static final class C117347d {

        /* renamed from: a */
        public long f351315a;

        /* renamed from: b */
        public long f351316b;

        /* renamed from: c */
        public long f351317c;

        /* renamed from: d */
        public C119153f f351318d;

        /* renamed from: e */
        public String f351319e;

        public C117347d(long j, long j2, long j3, C119153f fVar, String str) {
            C87412m.m108594g(fVar, "state");
            this.f351315a = j;
            this.f351316b = j2;
            this.f351317c = j3;
            this.f351318d = fVar;
            this.f351319e = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C117347d)) {
                return false;
            }
            C117347d dVar = (C117347d) obj;
            return this.f351315a == dVar.f351315a && this.f351316b == dVar.f351316b && this.f351317c == dVar.f351317c && this.f351318d == dVar.f351318d && C87412m.m108589b(this.f351319e, dVar.f351319e);
        }

        public int hashCode() {
            long j = this.f351315a;
            long j2 = this.f351316b;
            long j3 = this.f351317c;
            int hashCode = ((((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.f351318d.hashCode()) * 31;
            String str = this.f351319e;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "TaskStatusInfo(startTime=" + this.f351315a + ", delayTime=" + this.f351316b + ", runningTime=" + this.f351317c + ", state=" + this.f351318d + ", pool=" + this.f351319e + ')';
        }
    }

    /* renamed from: je2.a$e */
    public static final class C117348e implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ C117345a f351320d;

        public C117348e(C117345a aVar) {
            this.f351320d = aVar;
        }

        public final boolean onTimerExpired() {
            this.f351320d.mo182012d();
            return true;
        }
    }

    /* renamed from: je2.a$g */
    public static final class C117349g implements C119146d.C119151f {

        /* renamed from: a */
        public final /* synthetic */ C117345a f351321a;

        public C117349g(C117345a aVar) {
            this.f351321a = aVar;
        }

        /* renamed from: a */
        public void mo174283a(String str, int i, C119153f fVar, long j, long j2, String str2, boolean z) {
            int i2;
            String str3;
            String str4 = str;
            C119153f fVar2 = fVar;
            long j3 = j;
            long j4 = j2;
            String str5 = str2;
            C87412m.m108594g(str4, "key");
            C87412m.m108594g(fVar2, "state");
            C87412m.m108594g(str5, "pool");
            if (!this.f351321a.f351298g || fVar2 != C119153f.COMPLETE) {
                i2 = 2;
            } else {
                String str6 = C112550d0.m153768D(str, '@', 0, false, 6, (Object) null) >= 0 ? str4 : null;
                if (str6 == null || (str3 = str6.subSequence(0, C112550d0.m153768D(str6, '@', 0, false, 6, (Object) null)).toString()) == null) {
                    str3 = str4;
                }
                C108725a aVar = this.f351321a.f351300i.get(str3);
                if (aVar == null) {
                    C117345a aVar2 = this.f351321a;
                    C108725a aVar3 = new C108725a(0, 0, str3);
                    aVar2.f351300i.put(str3, aVar3);
                    aVar = aVar3;
                }
                int i3 = aVar.f325620b + 1;
                aVar.f325620b = i3;
                i2 = 2;
                if (i3 % 2 == 1) {
                    aVar.f325619a++;
                }
                aVar.f325619a += j4;
            }
            if (z) {
                String str7 = str4 + '@' + i;
                int ordinal = fVar.ordinal();
                if (ordinal == 0) {
                    String str8 = str7;
                    C117345a aVar4 = this.f351321a;
                    if (aVar4.f351298g) {
                        aVar4.f351297f.remove(str8);
                    }
                    C117347d remove = this.f351321a.f351299h.remove(str8);
                    StringBuilder sb = new StringBuilder();
                    sb.append("*** ");
                    sb.append(str8);
                    sb.append(" state=");
                    sb.append(fVar2);
                    sb.append(" start@=");
                    sb.append(remove != null ? Long.valueOf(remove.f351315a) : null);
                    sb.append("ms delay=");
                    sb.append(remove != null ? Long.valueOf(remove.f351316b) : null);
                    sb.append("ms run@=");
                    sb.append(remove != null ? Long.valueOf(remove.f351317c) : null);
                    Log.m105924i("ThreadPool.Execute", sb.toString());
                } else if (ordinal == i2) {
                    String str9 = str7;
                    C117345a aVar5 = this.f351321a;
                    if (aVar5.f351298g) {
                        aVar5.f351297f.remove(str9);
                    }
                    C117347d remove2 = this.f351321a.f351299h.remove(str9);
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("||| ");
                    sb4.append(str9);
                    sb4.append(" state=");
                    sb4.append(fVar2);
                    sb4.append(" start@=");
                    sb4.append(remove2 != null ? Long.valueOf(remove2.f351315a) : null);
                    sb4.append("ms delay=");
                    sb4.append(remove2 != null ? Long.valueOf(remove2.f351316b) : null);
                    sb4.append("ms run@=");
                    sb4.append(remove2 != null ? Long.valueOf(remove2.f351317c) : null);
                    Log.m105924i("ThreadPool.Execute", sb4.toString());
                } else if (ordinal == 3) {
                    long j5 = 0;
                    if (j3 >= 0) {
                        j5 = j3 / ((long) 1000000);
                    }
                    long j6 = j5;
                    C117345a aVar6 = this.f351321a;
                    if (aVar6.f351298g) {
                        aVar6.f351297f.put(str7, new C108726b(SystemClock.uptimeMillis() + j6, (Thread) null, 0));
                    }
                    Log.m105918d("ThreadPool.Execute", "=== " + str7 + " state=" + fVar2 + " delay=" + j6 + LocaleUtil.MALAY);
                    this.f351321a.f351299h.put(str7, new C117347d(System.currentTimeMillis(), j6, 0, fVar, (String) null));
                } else if (ordinal == 5) {
                    C117345a aVar7 = this.f351321a;
                    if (aVar7.f351298g) {
                        C108726b bVar = aVar7.f351297f.get(str7);
                        if (bVar != null) {
                            bVar.f325623b = Thread.currentThread();
                        }
                        this.f351321a.f351297f.remove(str7);
                    }
                    Log.m105918d("ThreadPool.Execute", ">>> " + str7 + " state=" + fVar2 + ' ' + str5);
                    C117347d dVar = this.f351321a.f351299h.get(str7);
                    if (dVar != null) {
                        dVar.f351317c = System.currentTimeMillis();
                    }
                    if (dVar != null) {
                        dVar.f351318d = fVar2;
                    }
                    if (dVar != null) {
                        dVar.f351319e = str5;
                    }
                } else if (ordinal == 6) {
                    C117347d remove3 = this.f351321a.f351299h.remove(str7);
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("<<< ");
                    sb5.append(str7);
                    sb5.append(" state=");
                    sb5.append(fVar2);
                    sb5.append(" cost=");
                    sb5.append(j3);
                    sb5.append("ms/");
                    sb5.append(j4);
                    sb5.append("ms ");
                    sb5.append(str5);
                    sb5.append(" start@=");
                    sb5.append(remove3 != null ? Long.valueOf(remove3.f351315a) : null);
                    sb5.append("ms delay=");
                    sb5.append(remove3 != null ? Long.valueOf(remove3.f351316b) : null);
                    sb5.append("ms run@=");
                    sb5.append(remove3 != null ? Long.valueOf(remove3.f351317c) : null);
                    String sb6 = sb5.toString();
                    Log.m105924i("ThreadPool.Execute", sb6);
                    if (this.f351321a.f351298g && j3 >= 600000) {
                        C117407d.INSTANCE.mo160131h(18762, 4, sb6, str, 17, MMApplicationContext.getProcessName());
                    }
                }
            }
        }

        /* renamed from: b */
        public void mo174284b(String str, int i, Throwable th) {
            C87412m.m108594g(str, "key");
            C87412m.m108594g(th, "e");
            Log.m105920e("ThreadPool.Profiler", str + '@' + i + ' ' + th);
        }

        /* renamed from: c */
        public void mo174285c(String str, int i, int i2, long j, String str2) {
            C87412m.m108594g(str, "key");
            C87412m.m108594g(str2, "pool");
            String str3 = "[wait] " + str + '@' + i + " runningCount=" + i2 + " waitFor=" + (j / ((long) 100000)) + "ms " + str2;
            Log.m105928w("ThreadPool.Profiler", str3);
            C117407d.INSTANCE.mo160131h(18762, 2, str3, str, 17, MMApplicationContext.getProcessName());
        }

        /* renamed from: d */
        public void mo174286d(String str, int i, String str2, boolean z) {
            C87412m.m108594g(str, "key");
            C87412m.m108594g(str2, "pool");
            String str3 = "[rejected] " + str + ' ' + str2 + " isShutdown=" + z;
            Log.m105928w("ThreadPool.Profiler", str3);
            C117345a aVar = this.f351321a;
            if (aVar.f351298g) {
                aVar.f351297f.remove(str + '@' + i);
                C117407d.INSTANCE.mo160131h(18762, 3, str3, str, 17, MMApplicationContext.getProcessName());
            }
        }

        public void shutdown() {
            Log.m105928w("ThreadPool.Profiler", "shutdown");
            this.f351321a.f351297f.clear();
        }
    }

    /* renamed from: je2.a$h */
    public static final class C117350h implements C119146d.C119152g {

        /* renamed from: a */
        public final /* synthetic */ C117345a f351322a;

        public C117350h(C117345a aVar) {
            this.f351322a = aVar;
        }

        /* renamed from: a */
        public void mo174280a(Thread thread, String str, long j) {
            C87412m.m108594g(thread, "thread");
            C87412m.m108594g(str, "name");
            Log.m105924i("ThreadPool.Profiler", "[onInterrupt] name=" + str + " id=" + j);
        }

        /* renamed from: b */
        public void mo174281b(Thread thread, String str, long j) {
            C87412m.m108594g(thread, "thread");
            C87412m.m108594g(str, "name");
            Log.m105924i("ThreadPool.Profiler", "[onThreadStart] name=" + str + " id=" + j);
            this.f351322a.f351296e.incrementAndGet();
        }

        /* renamed from: c */
        public void mo174282c(Thread thread, String str, long j) {
            C87412m.m108594g(thread, "thread");
            C87412m.m108594g(str, "name");
            Log.m105924i("ThreadPool.Profiler", "[onThreadExit] name=" + str + " id=" + j);
            this.f351322a.f351296e.decrementAndGet();
        }
    }

    static {
        C36568h.m40985a(C117346c.f351314d);
    }

    public C117345a() {
        int e = (C89625d.f257842h || C89625d.f257844j) ? C117731d.m166007c().mo182443e("clicfg_threadpool_profiler_report_release", 10, true, true) : C117731d.m166007c().mo182443e("clicfg_threadpool_profiler_report_alpha", 100000, true, true);
        int nextInt = new Random().nextInt(100000);
        boolean z = e >= nextInt;
        Log.m105924i("ThreadPool.Profiler", "[isNeedReport] rand=" + e + " test=" + nextInt + " isEnable=" + z + " isRelease=" + C89625d.f257842h + " isTest=" + C89625d.f257844j);
        this.f351298g = z;
        this.f351299h = new ConcurrentHashMap<>();
        this.f351300i = new ConcurrentHashMap<>(100);
        new ConcurrentHashMap(100);
        this.f351301j = new AtomicLong();
        this.f351302n = new AtomicLong();
        this.f351303o = new AtomicLong();
        this.f351304p = new AtomicLong();
        this.f351305q = new AtomicLong();
        this.f351306r = new AtomicLong();
        this.f351307s = new int[2];
        this.f351308t = new C117350h(this);
        this.f351309u = new C87953f(this);
        this.f351310v = new C117349g(this);
        new HashMap();
        new ArrayList();
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(Environment.getExternalStorageDirectory().getPath());
            String str = File.separator;
            sb.append(str);
            sb.append(Environment.DIRECTORY_PICTURES);
            sb.append(str);
            sb.append("Screenshots");
            sb.append(str);
            String str2 = Environment.getExternalStorageDirectory().getPath() + str + Environment.DIRECTORY_DCIM + str + "Screenshots" + str;
            new C96783i1(sb.toString(), this);
            new C96783i1(str2, this);
        } catch (Throwable th) {
            C118672d.m167354d("ThreadPool.Profiler", th, "", new Object[0]);
        }
        SystemClock.uptimeMillis();
        SystemClock.currentThreadTimeMillis();
        this.f351313y = new MTimerHandler(C109639a.m148950a("ThreadPool.Profiler"), (MTimerHandler.CallBack) new C117348e(this), true);
        Looper.getMainLooper().getThread().getId();
    }

    /* renamed from: a */
    public void mo132611a(String str) {
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0400  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x048f  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x053f A[LOOP:11: B:150:0x0539->B:152:0x053f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0558 A[Catch:{ Exception -> 0x05fa }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo112345b(boolean r21) {
        /*
            r20 = this;
            r1 = r20
            if (r21 != 0) goto L_0x0609
            long r2 = android.os.SystemClock.uptimeMillis()
            long r4 = r1.f351312x
            long r4 = r2 - r4
            r6 = 900000(0xdbba0, double:4.44659E-318)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x0014
            goto L_0x0018
        L_0x0014:
            boolean r0 = r1.f351298g
            if (r0 != 0) goto L_0x001b
        L_0x0018:
            r2 = r1
            goto L_0x0605
        L_0x001b:
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, je2.a$b> r0 = r1.f351297f
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x002f:
            boolean r6 = r0.hasNext()
            r7 = 60000(0xea60, double:2.9644E-319)
            r9 = 0
            if (r6 == 0) goto L_0x0069
            java.lang.Object r6 = r0.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            long r10 = android.os.SystemClock.uptimeMillis()
            java.lang.Object r12 = r6.getValue()
            je2.a$b r12 = (je2.C117345a.C108726b) r12
            long r12 = r12.f325622a
            long r10 = r10 - r12
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 < 0) goto L_0x005b
            java.lang.Object r7 = r6.getValue()
            je2.a$b r7 = (je2.C117345a.C108726b) r7
            int r7 = r7.f325624c
            if (r7 != 0) goto L_0x005b
            r9 = 1
        L_0x005b:
            if (r9 == 0) goto L_0x002f
            java.lang.Object r7 = r6.getKey()
            java.lang.Object r6 = r6.getValue()
            r5.put(r7, r6)
            goto L_0x002f
        L_0x0069:
            java.util.Set r0 = r5.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r5 = 0
        L_0x0072:
            boolean r6 = r0.hasNext()
            java.lang.String r7 = " has expired "
            r8 = 17
            java.lang.String r11 = "ThreadPool.Profiler"
            r12 = 2
            if (r6 == 0) goto L_0x01b9
            java.lang.Object r5 = r0.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r6 = r5.getKey()
            r13 = r6
            java.lang.String r13 = (java.lang.String) r13
            r14 = 64
            r15 = 0
            r16 = 0
            r17 = 6
            r18 = 0
            int r13 = z04.C112550d0.m153768D(r13, r14, r15, r16, r17, r18)
            if (r13 < 0) goto L_0x009d
            r13 = 1
            goto L_0x009e
        L_0x009d:
            r13 = 0
        L_0x009e:
            if (r13 == 0) goto L_0x00a1
            goto L_0x00a2
        L_0x00a1:
            r6 = 0
        L_0x00a2:
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L_0x00ba
            r14 = 64
            r15 = 0
            r16 = 0
            r17 = 6
            r18 = 0
            r13 = r6
            int r13 = z04.C112550d0.m153768D(r13, r14, r15, r16, r17, r18)
            java.lang.CharSequence r6 = r6.subSequence(r9, r13)
            if (r6 != 0) goto L_0x00c0
        L_0x00ba:
            java.lang.Object r6 = r5.getKey()
            java.lang.String r6 = (java.lang.String) r6
        L_0x00c0:
            java.lang.Object r13 = r5.getKey()
            r14 = r13
            java.lang.String r14 = (java.lang.String) r14
            r15 = 35
            r16 = 0
            r17 = 0
            r18 = 6
            r19 = 0
            int r14 = z04.C112550d0.m153768D(r14, r15, r16, r17, r18, r19)
            if (r14 < 0) goto L_0x00d9
            r14 = 1
            goto L_0x00da
        L_0x00d9:
            r14 = 0
        L_0x00da:
            if (r14 == 0) goto L_0x00dd
            goto L_0x00de
        L_0x00dd:
            r13 = 0
        L_0x00de:
            java.lang.String r13 = (java.lang.String) r13
            if (r13 == 0) goto L_0x00f7
            r15 = 35
            r16 = 0
            r17 = 0
            r18 = 6
            r19 = 0
            r14 = r13
            int r14 = z04.C112550d0.m153768D(r14, r15, r16, r17, r18, r19)
            java.lang.CharSequence r9 = r13.subSequence(r9, r14)
            if (r9 != 0) goto L_0x00fd
        L_0x00f7:
            java.lang.Object r9 = r5.getKey()
            java.lang.String r9 = (java.lang.String) r9
        L_0x00fd:
            java.lang.String r9 = r9.toString()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, mu3.a> r13 = mu3.C109639a.f328235e
            java.lang.Object r9 = r13.get(r9)
            mu3.a r9 = (mu3.C109639a) r9
            if (r9 == 0) goto L_0x010e
            mu3.d r9 = r9.f328238b
            goto L_0x010f
        L_0x010e:
            r9 = 0
        L_0x010f:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.Object r14 = r5.getKey()
            java.lang.String r14 = (java.lang.String) r14
            r13.append(r14)
            r13.append(r7)
            long r14 = android.os.SystemClock.uptimeMillis()
            java.lang.Object r7 = r5.getValue()
            je2.a$b r7 = (je2.C117345a.C108726b) r7
            r16 = r11
            long r10 = r7.f325622a
            long r14 = r14 - r10
            r13.append(r14)
            java.lang.String r7 = "ms size="
            r13.append(r7)
            if (r9 == 0) goto L_0x014c
            java.util.LinkedList<mu3.e> r7 = r9.f351732i
            int r7 = r7.size()
            java.util.HashSet<mu3.e> r10 = r9.f351731h
            int r10 = r10.size()
            int r7 = r7 + r10
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x014d
        L_0x014c:
            r7 = 0
        L_0x014d:
            r13.append(r7)
            java.lang.String r7 = " queue is null="
            r13.append(r7)
            if (r9 != 0) goto L_0x0159
            r7 = 1
            goto L_0x015a
        L_0x0159:
            r7 = 0
        L_0x015a:
            r13.append(r7)
            java.lang.String r7 = " isRunning="
            r13.append(r7)
            if (r9 == 0) goto L_0x016b
            boolean r7 = r9.f351730g
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            goto L_0x016c
        L_0x016b:
            r7 = 0
        L_0x016c:
            r13.append(r7)
            java.lang.String r7 = r13.toString()
            r10 = r16
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r7)
            if (r9 != 0) goto L_0x017c
            r9 = 0
            goto L_0x0183
        L_0x017c:
            boolean r9 = r9.f351730g
            if (r9 == 0) goto L_0x0182
            r9 = 2
            goto L_0x0183
        L_0x0182:
            r9 = 1
        L_0x0183:
            kj2.d r10 = kj2.C117407d.INSTANCE
            r11 = 6
            java.lang.Object[] r11 = new java.lang.Object[r11]
            r13 = 1
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)
            r15 = 0
            r11[r15] = r14
            r11[r13] = r7
            r11[r12] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            r7 = 3
            r11[r7] = r6
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getProcessName()
            r7 = 4
            r11[r7] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)
            r7 = 5
            r11[r7] = r6
            r6 = 18762(0x494a, float:2.6291E-41)
            r10.mo160131h(r6, r11)
            java.lang.Object r5 = r5.getKey()
            r4.add(r5)
            r5 = 1
            r9 = 0
            goto L_0x0072
        L_0x01b9:
            r10 = r11
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.ref.WeakReference<zt3.b>> r0 = zt3.C119143b.f356830s
            java.lang.String r6 = "sGlobalForkThreadPool"
            gy3.C87412m.m108593f(r0, r6)
            java.util.Iterator r0 = r0.iterator()
        L_0x01c6:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x02ae
            java.lang.Object r6 = r0.next()
            java.lang.ref.WeakReference r6 = (java.lang.ref.WeakReference) r6
            java.lang.Object r6 = r6.get()
            zt3.b r6 = (zt3.C119143b) r6
            if (r6 == 0) goto L_0x02a7
            java.lang.String r8 = r6.f356842r
            java.util.concurrent.locks.ReentrantLock r9 = r6.f356833f
            r9.lock()
            long r13 = r6.f356838n     // Catch:{ all -> 0x02a2 }
            java.util.HashSet<zt3.b$b> r11 = r6.f356834g     // Catch:{ all -> 0x02a2 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x02a2 }
        L_0x01e9:
            boolean r15 = r11.hasNext()     // Catch:{ all -> 0x02a2 }
            if (r15 == 0) goto L_0x01fd
            java.lang.Object r15 = r11.next()     // Catch:{ all -> 0x02a2 }
            zt3.b$b r15 = (zt3.C119143b.C119144b) r15     // Catch:{ all -> 0x02a2 }
            java.util.concurrent.atomic.AtomicLong r15 = r15.f356845f     // Catch:{ all -> 0x02a2 }
            long r15 = r15.get()     // Catch:{ all -> 0x02a2 }
            long r13 = r13 + r15
            goto L_0x01e9
        L_0x01fd:
            r9.unlock()
            int r9 = (int) r13
            java.util.concurrent.BlockingQueue<java.lang.Runnable> r11 = r6.f356832e
            int r11 = r11.size()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, je2.a$b> r13 = r1.f351297f
            java.lang.Object r13 = r13.get(r8)
            je2.a$b r13 = (je2.C117345a.C108726b) r13
            if (r13 != 0) goto L_0x0229
            je2.a$b r13 = new je2.a$b
            long r14 = android.os.SystemClock.uptimeMillis()
            r12 = 1
            r16 = r0
            r0 = 0
            r13.<init>(r14, r0, r12)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, je2.a$b> r0 = r1.f351297f
            java.lang.String r12 = "key"
            gy3.C87412m.m108593f(r8, r12)
            r0.put(r8, r13)
            goto L_0x022b
        L_0x0229:
            r16 = r0
        L_0x022b:
            int r0 = r13.f325625d
            int r0 = r9 - r0
            if (r9 <= 0) goto L_0x0299
            if (r11 <= 0) goto L_0x0299
            if (r0 != 0) goto L_0x0299
            long r11 = android.os.SystemClock.uptimeMillis()
            long r14 = r13.f325622a
            long r11 = r11 - r14
            r14 = 60000(0xea60, double:2.9644E-319)
            int r0 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r0 < 0) goto L_0x0299
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "[ForkThreadPoolExecutor] "
            r0.append(r5)
            r0.append(r8)
            r0.append(r7)
            long r11 = android.os.SystemClock.uptimeMillis()
            long r14 = r13.f325622a
            long r11 = r11 - r14
            r0.append(r11)
            java.lang.String r5 = "ms "
            r0.append(r5)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
            kj2.d r5 = kj2.C117407d.INSTANCE
            r6 = 5
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r11 = 1
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            r14 = 0
            r6[r14] = r12
            r6[r11] = r0
            r11 = 2
            r6[r11] = r8
            r0 = 17
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r11 = 3
            r6[r11] = r0
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getProcessName()
            r11 = 4
            r6[r11] = r0
            r0 = 18762(0x494a, float:2.6291E-41)
            r5.mo160131h(r0, r6)
            r4.add(r8)
            r5 = 1
            goto L_0x029f
        L_0x0299:
            long r11 = android.os.SystemClock.uptimeMillis()
            r13.f325622a = r11
        L_0x029f:
            r13.f325625d = r9
            goto L_0x02a9
        L_0x02a2:
            r0 = move-exception
            r9.unlock()
            throw r0
        L_0x02a7:
            r16 = r0
        L_0x02a9:
            r0 = r16
            r12 = 2
            goto L_0x01c6
        L_0x02ae:
            java.lang.String r6 = ""
            if (r5 == 0) goto L_0x052f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = " \n[RunningTask]"
            r5.<init>(r0)
            java.lang.String r7 = "\n"
            r5.append(r7)
            zt3.c r0 = zt3.C119157j.f356863e
            zt3.j r0 = (zt3.C119157j) r0
            java.util.Map r0 = r0.mo183874e()
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x02d0:
            boolean r8 = r0.hasNext()
            java.lang.String r9 = " => "
            if (r8 == 0) goto L_0x0305
            java.lang.Object r8 = r0.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.String r11 = "\t"
            r5.append(r11)
            java.lang.Object r11 = r8.getKey()
            java.lang.String r11 = (java.lang.String) r11
            r5.append(r11)
            r5.append(r9)
            java.lang.Object r8 = r8.getValue()
            java.lang.String r9 = "it.value"
            gy3.C87412m.m108593f(r8, r9)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r5.append(r8)
            r5.append(r7)
            goto L_0x02d0
        L_0x0305:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r8 = "[dumpThreadPool] "
            r0.append(r8)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            r0 = 0
            r5.setLength(r0)
            java.lang.String r0 = " \n[WaitingTask]"
            r5.append(r0)
            r5.append(r7)
            zt3.c r0 = zt3.C119157j.f356863e
            r11 = r0
            zt3.j r11 = (zt3.C119157j) r11
            r11.getClass()
            long r12 = android.os.SystemClock.uptimeMillis()
            java.util.HashMap r14 = new java.util.HashMap
            r14.<init>()
            ku3.e r0 = r11.f356866c
            r0.getClass()
            java.util.LinkedHashMap r15 = new java.util.LinkedHashMap
            r15.<init>()
            r16 = r2
            ku3.f r2 = r0.f351465c     // Catch:{ NullPointerException -> 0x03df }
            r2.getClass()     // Catch:{ NullPointerException -> 0x03df }
            java.lang.String r2 = "UIPool"
            ku3.f r3 = r0.f351465c     // Catch:{ NullPointerException -> 0x03df }
            ku3.f$b r3 = r3.f351466e     // Catch:{ NullPointerException -> 0x03df }
            r3.getClass()     // Catch:{ NullPointerException -> 0x03df }
            r18 = r4
            java.util.LinkedList r4 = new java.util.LinkedList     // Catch:{ NullPointerException -> 0x03db }
            r4.<init>()     // Catch:{ NullPointerException -> 0x03db }
            android.os.Handler r1 = r3.f351467d     // Catch:{ NullPointerException -> 0x03db }
            r19 = r10
            ku3.g r10 = new ku3.g     // Catch:{ NullPointerException -> 0x03d9 }
            r10.<init>(r3, r4)     // Catch:{ NullPointerException -> 0x03d9 }
            r1.dump(r10, r6)     // Catch:{ NullPointerException -> 0x03d9 }
            r15.put(r2, r4)     // Catch:{ NullPointerException -> 0x03d9 }
            ku3.c r1 = r0.f351464b     // Catch:{ NullPointerException -> 0x03d9 }
            r1.getClass()     // Catch:{ NullPointerException -> 0x03d9 }
            java.lang.String r1 = "HotPool"
            ku3.c r2 = r0.f351464b     // Catch:{ NullPointerException -> 0x03d9 }
            r2.getClass()     // Catch:{ NullPointerException -> 0x03d9 }
            java.util.LinkedList r3 = new java.util.LinkedList     // Catch:{ NullPointerException -> 0x03d9 }
            r3.<init>()     // Catch:{ NullPointerException -> 0x03d9 }
            ku3.c$a r2 = r2.f351458e     // Catch:{ NullPointerException -> 0x03d9 }
            java.util.concurrent.BlockingQueue r2 = r2.getQueue()     // Catch:{ NullPointerException -> 0x03d9 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ NullPointerException -> 0x03d9 }
        L_0x0381:
            boolean r4 = r2.hasNext()     // Catch:{ NullPointerException -> 0x03d9 }
            if (r4 == 0) goto L_0x039b
            java.lang.Object r4 = r2.next()     // Catch:{ NullPointerException -> 0x03d9 }
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch:{ NullPointerException -> 0x03d9 }
            boolean r10 = r4 instanceof lu3.C117479j     // Catch:{ NullPointerException -> 0x03d9 }
            if (r10 == 0) goto L_0x0381
            lu3.j r4 = (lu3.C117479j) r4     // Catch:{ NullPointerException -> 0x03d9 }
            java.lang.String r4 = r4.getKey()     // Catch:{ NullPointerException -> 0x03d9 }
            r3.add(r4)     // Catch:{ NullPointerException -> 0x03d9 }
            goto L_0x0381
        L_0x039b:
            r15.put(r1, r3)     // Catch:{ NullPointerException -> 0x03d9 }
            ku3.b r1 = r0.f351463a     // Catch:{ NullPointerException -> 0x03d9 }
            r1.getClass()     // Catch:{ NullPointerException -> 0x03d9 }
            java.lang.String r1 = "ColdPool"
            ku3.b r0 = r0.f351463a     // Catch:{ NullPointerException -> 0x03d9 }
            java.util.List r0 = r0.mo182104d()     // Catch:{ NullPointerException -> 0x03d9 }
            r15.put(r1, r0)     // Catch:{ NullPointerException -> 0x03d9 }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, mu3.a> r0 = mu3.C109639a.f328235e     // Catch:{ NullPointerException -> 0x03d9 }
            java.util.Collection r0 = r0.values()     // Catch:{ NullPointerException -> 0x03d9 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ NullPointerException -> 0x03d9 }
        L_0x03b8:
            boolean r1 = r0.hasNext()     // Catch:{ NullPointerException -> 0x03d9 }
            if (r1 == 0) goto L_0x03f2
            java.lang.Object r1 = r0.next()     // Catch:{ NullPointerException -> 0x03d9 }
            mu3.a r1 = (mu3.C109639a) r1     // Catch:{ NullPointerException -> 0x03d9 }
            mu3.d r2 = r1.f328238b     // Catch:{ NullPointerException -> 0x03d9 }
            java.util.List r2 = r2.mo182310c()     // Catch:{ NullPointerException -> 0x03d9 }
            r3 = r2
            java.util.LinkedList r3 = (java.util.LinkedList) r3     // Catch:{ NullPointerException -> 0x03d9 }
            int r3 = r3.size()     // Catch:{ NullPointerException -> 0x03d9 }
            if (r3 <= 0) goto L_0x03b8
            java.lang.String r1 = r1.f328237a     // Catch:{ NullPointerException -> 0x03d9 }
            r15.put(r1, r2)     // Catch:{ NullPointerException -> 0x03d9 }
            goto L_0x03b8
        L_0x03d9:
            r0 = move-exception
            goto L_0x03e3
        L_0x03db:
            r0 = move-exception
        L_0x03dc:
            r19 = r10
            goto L_0x03e3
        L_0x03df:
            r0 = move-exception
            r18 = r4
            goto L_0x03dc
        L_0x03e3:
            zt3.d$b r1 = zt3.C119146d.f356851c
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            java.lang.String r0 = "PoolAdapter"
            java.lang.String r3 = "[dumpWaitingTask] e=%s"
            r1.mo125764e(r0, r3, r2)
        L_0x03f2:
            java.util.Set r0 = r15.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x03fa:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x045b
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.Object r3 = r1.getValue()
            java.util.List r3 = (java.util.List) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x0415:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0442
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r10 = r2.get(r4)
            android.util.Pair r10 = (android.util.Pair) r10
            zt3.n r15 = new zt3.n
            if (r10 != 0) goto L_0x042d
            r10 = 1
            goto L_0x0437
        L_0x042d:
            java.lang.Object r10 = r10.second
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            int r10 = r10 + 1
        L_0x0437:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r15.<init>(r11, r4, r10)
            r2.put(r4, r15)
            goto L_0x0415
        L_0x0442:
            java.util.LinkedList r3 = new java.util.LinkedList
            java.util.Collection r2 = r2.values()
            r3.<init>(r2)
            zt3.r r2 = new zt3.r
            r2.<init>(r11)
            java.util.Collections.sort(r3, r2)
            java.lang.Object r1 = r1.getKey()
            r14.put(r1, r3)
            goto L_0x03fa
        L_0x045b:
            long r0 = android.os.SystemClock.uptimeMillis()
            long r0 = r0 - r12
            zt3.d$b r2 = zt3.C119146d.f356851c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "[dumpWaitingTask] cost="
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = "ms"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r3 = "ThreadPool"
            r2.mo125765i(r3, r0, r1)
            java.util.Set r0 = r14.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0489:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x04e4
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.String r2 = "# "
            r5.append(r2)
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            r5.append(r2)
            r5.append(r7)
            java.lang.Object r1 = r1.getValue()
            java.lang.String r2 = "entry.value"
            gy3.C87412m.m108593f(r1, r2)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x04b5:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0489
            java.lang.Object r2 = r1.next()
            android.util.Pair r2 = (android.util.Pair) r2
            java.lang.String r3 = "\t|* "
            r5.append(r3)
            java.lang.Object r3 = r2.first
            java.lang.String r3 = (java.lang.String) r3
            r5.append(r3)
            r5.append(r9)
            java.lang.Object r2 = r2.second
            java.lang.String r3 = "it.second"
            gy3.C87412m.m108593f(r2, r3)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r5.append(r2)
            r5.append(r7)
            goto L_0x04b5
        L_0x04e4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            r1 = r19
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "[dumpThreadPool] Alive Thread Count = "
            r0.append(r2)
            r2 = r20
            java.util.concurrent.atomic.AtomicInteger r3 = r2.f351296e
            int r3 = r3.get()
            r0.append(r3)
            java.lang.String r3 = " Global Running Count = "
            r0.append(r3)
            java.util.concurrent.atomic.AtomicInteger r3 = r2.f351295d
            int r3 = r3.get()
            r0.append(r3)
            java.lang.String r3 = " maxRunningCount="
            r0.append(r3)
            r3 = 0
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            r20.mo182012d()
            goto L_0x0535
        L_0x052f:
            r16 = r2
            r18 = r4
            r2 = r1
            r1 = r10
        L_0x0535:
            java.util.Iterator r0 = r18.iterator()
        L_0x0539:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x054b
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            java.util.concurrent.ConcurrentHashMap<java.lang.String, je2.a$b> r4 = r2.f351297f
            r4.remove(r3)
            goto L_0x0539
        L_0x054b:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, je2.a$a> r0 = r2.f351300i     // Catch:{ Exception -> 0x05fa }
            java.util.Collection r0 = r0.values()     // Catch:{ Exception -> 0x05fa }
            int r0 = r0.size()     // Catch:{ Exception -> 0x05fa }
            r3 = 1
            if (r0 <= r3) goto L_0x0601
            java.util.concurrent.ConcurrentHashMap<java.lang.String, je2.a$a> r0 = r2.f351300i     // Catch:{ Exception -> 0x05fa }
            java.util.Collection r0 = r0.values()     // Catch:{ Exception -> 0x05fa }
            java.lang.String r3 = "batteryRecord.values"
            gy3.C87412m.m108593f(r0, r3)     // Catch:{ Exception -> 0x05fa }
            je2.b r3 = new je2.b     // Catch:{ Exception -> 0x05fa }
            r3.<init>()     // Catch:{ Exception -> 0x05fa }
            java.util.List r0 = sx3.C110818d0.m150943o0(r0, r3)     // Catch:{ Exception -> 0x05fa }
            r3 = 30
            java.util.concurrent.ConcurrentHashMap<java.lang.String, je2.a$a> r4 = r2.f351300i     // Catch:{ Exception -> 0x05fa }
            java.util.Collection r4 = r4.values()     // Catch:{ Exception -> 0x05fa }
            int r4 = r4.size()     // Catch:{ Exception -> 0x05fa }
            int r4 = r4 + -1
            if (r3 <= r4) goto L_0x057d
            r3 = r4
        L_0x057d:
            r4 = 0
            java.util.List r0 = r0.subList(r4, r3)     // Catch:{ Exception -> 0x05fa }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x05fa }
            r3 = 0
        L_0x0587:
            boolean r4 = r0.hasNext()     // Catch:{ Exception -> 0x05fa }
            if (r4 == 0) goto L_0x05f4
            java.lang.Object r4 = r0.next()     // Catch:{ Exception -> 0x05fa }
            int r5 = r3 + 1
            if (r3 < 0) goto L_0x05ef
            je2.a$a r4 = (je2.C117345a.C108725a) r4     // Catch:{ Exception -> 0x05fa }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x05fa }
            r7.<init>()     // Catch:{ Exception -> 0x05fa }
            java.lang.String r8 = "[batteryRecord]#"
            r7.append(r8)     // Catch:{ Exception -> 0x05fa }
            r7.append(r3)     // Catch:{ Exception -> 0x05fa }
            r3 = 32
            r7.append(r3)     // Catch:{ Exception -> 0x05fa }
            r7.append(r4)     // Catch:{ Exception -> 0x05fa }
            java.lang.String r3 = r7.toString()     // Catch:{ Exception -> 0x05fa }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)     // Catch:{ Exception -> 0x05fa }
            kj2.d r3 = kj2.C117407d.INSTANCE     // Catch:{ Exception -> 0x05fa }
            r7 = 18883(0x49c3, float:2.6461E-41)
            r8 = 6
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x05fa }
            r9 = 17
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x05fa }
            r10 = 0
            r8[r10] = r9     // Catch:{ Exception -> 0x05fa }
            r9 = 15
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x05fa }
            r10 = 1
            r8[r10] = r9     // Catch:{ Exception -> 0x05fa }
            long r9 = r4.f325619a     // Catch:{ Exception -> 0x05fa }
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ Exception -> 0x05fa }
            r10 = 2
            r8[r10] = r9     // Catch:{ Exception -> 0x05fa }
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getProcessName()     // Catch:{ Exception -> 0x05fa }
            r11 = 3
            r8[r11] = r9     // Catch:{ Exception -> 0x05fa }
            java.lang.String r9 = r4.f325621c     // Catch:{ Exception -> 0x05fa }
            r11 = 4
            r8[r11] = r9     // Catch:{ Exception -> 0x05fa }
            int r4 = r4.f325620b     // Catch:{ Exception -> 0x05fa }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x05fa }
            r9 = 5
            r8[r9] = r4     // Catch:{ Exception -> 0x05fa }
            r3.mo160131h(r7, r8)     // Catch:{ Exception -> 0x05fa }
            r3 = r5
            goto L_0x0587
        L_0x05ef:
            sx3.C64197v.m75542k()     // Catch:{ Exception -> 0x05fa }
            r0 = 0
            throw r0     // Catch:{ Exception -> 0x05fa }
        L_0x05f4:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, je2.a$a> r0 = r2.f351300i     // Catch:{ Exception -> 0x05fa }
            r0.clear()     // Catch:{ Exception -> 0x05fa }
            goto L_0x0601
        L_0x05fa:
            r0 = move-exception
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r6, r3)
        L_0x0601:
            r3 = r16
            r2.f351312x = r3
        L_0x0605:
            r20.mo182011c()
            goto L_0x060a
        L_0x0609:
            r2 = r1
        L_0x060a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: je2.C117345a.mo112345b(boolean):void");
    }

    /* renamed from: c */
    public final void mo182011c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - this.f351311w >= 300000) {
            C117349g gVar = this.f351310v;
            gVar.getClass();
            try {
                for (Map.Entry entry : new HashMap(gVar.f351321a.f351299h).entrySet()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("~~~ ");
                    sb.append((String) entry.getKey());
                    sb.append(" state=");
                    C117347d dVar = (C117347d) entry.getValue();
                    Long l = null;
                    sb.append(dVar != null ? dVar.f351318d : null);
                    sb.append(" pool=");
                    C117347d dVar2 = (C117347d) entry.getValue();
                    sb.append(dVar2 != null ? dVar2.f351319e : null);
                    sb.append(" start@=");
                    C117347d dVar3 = (C117347d) entry.getValue();
                    sb.append(dVar3 != null ? Long.valueOf(dVar3.f351315a) : null);
                    sb.append("ms delay=");
                    C117347d dVar4 = (C117347d) entry.getValue();
                    sb.append(dVar4 != null ? Long.valueOf(dVar4.f351316b) : null);
                    sb.append("ms run@=");
                    C117347d dVar5 = (C117347d) entry.getValue();
                    if (dVar5 != null) {
                        l = Long.valueOf(dVar5.f351317c);
                    }
                    sb.append(l);
                    Log.m105924i("ThreadPool.Execute", sb.toString());
                }
            } catch (Throwable th) {
                Log.printErrStackTrace("ThreadPool.Profiler", th, "", new Object[0]);
            }
            this.f351311w = uptimeMillis;
        }
    }

    /* renamed from: d */
    public final void mo182012d() {
        StringBuilder sb = new StringBuilder();
        sb.append("[dumpThreadPool]\n averageUITime=");
        sb.append((((float) this.f351304p.get()) * 1.0f) / ((float) this.f351306r.get()));
        sb.append(" averageUIThreadTime=");
        sb.append((((float) this.f351305q.get()) * 1.0f) / ((float) this.f351306r.get()));
        sb.append("\naverageOtherTime=");
        sb.append((((float) this.f351301j.get()) * 1.0f) / ((float) this.f351303o.get()));
        sb.append(" averageOtherThreadTime=");
        sb.append((((float) this.f351302n.get()) * 1.0f) / ((float) this.f351303o.get()));
        sb.append("\nuiTaskCount=");
        sb.append(this.f351306r.get());
        sb.append(" otherTaskCount=");
        sb.append(this.f351303o.get());
        sb.append("\nuiBusyConcurrent=");
        sb.append(this.f351307s[1]);
        sb.append(" averageUIConcurrent=");
        int[] iArr = this.f351307s;
        sb.append((((float) iArr[0]) * 1.0f) / ((float) iArr[1]));
        sb.append(" concurrentRadio=");
        sb.append((((float) this.f351307s[1]) * 1.0f) / ((float) this.f351306r.get()));
        Log.m105924i("ThreadPool.Profiler", sb.toString());
    }

    public void onAppBackground(String str) {
    }

    public void onAppForeground(String str) {
    }
}
