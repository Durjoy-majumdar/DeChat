package ea2;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import android.text.TextUtils;
import com.tencent.p014mm.autogen.events.AudioPlayerEvent;
import com.tencent.p014mm.plugin.music.player.base.C94225h;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.PhoneStatusWatcher;
import com.tencent.qqmusic.mediaplayer.CommonPlayer;
import di3.C86312j;
import ea2.C86468a;
import fa2.C20705c;
import ga2.C20826a;
import ha2.C32752h;
import ha2.C98331j;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import nb0.C88911a;
import nb0.C88912b;
import nb0.C88914d;
import p213oh.C11412b;
import p339fh.C116868i;
import p350jh.C21238a;
import p350jh.C21239b;
import p350jh.C21240c;
import p350jh.C21241d;
import p350jh.C21242e;
import p350jh.C21244g;
import p356lh.C21426b;
import p356lh.C21427c;
import p356lh.C21428d;
import p356lh.C21435i;
import ua2.C101991b;
import xa2.C102583a;
import za2.C102984b;
import zt3.C119157j;

/* renamed from: ea2.h */
public class C20561h {

    /* renamed from: T */
    public static C20561h f57848T;

    /* renamed from: A */
    public C21427c f57849A;

    /* renamed from: B */
    public volatile boolean f57850B = true;

    /* renamed from: C */
    public volatile boolean f57851C = true;

    /* renamed from: D */
    public AudioManager f57852D = ((AudioManager) MMApplicationContext.getContext().getSystemService("audio"));

    /* renamed from: E */
    public long f57853E = 0;

    /* renamed from: F */
    public LinkedList<String> f57854F = new LinkedList<>();

    /* renamed from: G */
    public LinkedList<String> f57855G = new LinkedList<>();

    /* renamed from: H */
    public C21239b f57856H;

    /* renamed from: I */
    public Handler f57857I;

    /* renamed from: J */
    public Looper f57858J;

    /* renamed from: K */
    public C86468a f57859K = null;

    /* renamed from: L */
    public C86468a.C86469a f57860L = null;

    /* renamed from: M */
    public C20560e f57861M = new C20563b();

    /* renamed from: N */
    public Runnable f57862N = new C20564c();

    /* renamed from: O */
    public Runnable f57863O = new C20565d();

    /* renamed from: P */
    public C21426b f57864P = new C20567f();

    /* renamed from: Q */
    public C21435i f57865Q = new C20568g();

    /* renamed from: R */
    public C21244g f57866R = new C20569h();

    /* renamed from: S */
    public volatile int f57867S = 0;

    /* renamed from: a */
    public LinkedList<String> f57868a = new LinkedList<>();

    /* renamed from: b */
    public HashMap<String, C20575m> f57869b = new HashMap<>();

    /* renamed from: c */
    public LinkedList<String> f57870c = new LinkedList<>();

    /* renamed from: d */
    public HashMap<String, C20575m> f57871d = new HashMap<>();

    /* renamed from: e */
    public LinkedList<String> f57872e = new LinkedList<>();

    /* renamed from: f */
    public LinkedList<String> f57873f = new LinkedList<>();

    /* renamed from: g */
    public HashMap<String, String> f57874g = new HashMap<>();

    /* renamed from: h */
    public HashMap<String, LinkedList<String>> f57875h = new HashMap<>();

    /* renamed from: i */
    public HashMap<String, C88912b> f57876i = new HashMap<>();

    /* renamed from: j */
    public HashMap<String, C88914d> f57877j = new HashMap<>();

    /* renamed from: k */
    public LinkedList<String> f57878k = new LinkedList<>();

    /* renamed from: l */
    public LinkedList<String> f57879l = new LinkedList<>();

    /* renamed from: m */
    public HashMap<String, Integer> f57880m = new HashMap<>();

    /* renamed from: n */
    public LinkedList<String> f57881n = new LinkedList<>();

    /* renamed from: o */
    public Object f57882o = new Object();

    /* renamed from: p */
    public boolean f57883p = false;

    /* renamed from: q */
    public boolean f57884q = false;

    /* renamed from: r */
    public long f57885r = 0;

    /* renamed from: s */
    public long f57886s = 0;

    /* renamed from: t */
    public C20705c f57887t;

    /* renamed from: u */
    public C88911a f57888u = new C88911a();

    /* renamed from: v */
    public C20826a f57889v = new C20826a();

    /* renamed from: w */
    public final PhoneStatusWatcher.PhoneCallListener[] f57890w = {null};

    /* renamed from: x */
    public final ArrayList<C20574l> f57891x = new ArrayList<>();

    /* renamed from: y */
    public HashMap<String, String> f57892y = new HashMap<>();

    /* renamed from: z */
    public HashMap<String, Integer> f57893z = new HashMap<>();

    /* renamed from: ea2.h$a */
    public class C20562a implements Runnable {
        public C20562a() {
        }

        public void run() {
            C20561h.this.mo32152K();
        }
    }

    /* renamed from: ea2.h$b */
    public class C20563b implements C20560e {
        public C20563b() {
        }

        /* renamed from: a */
        public void mo32186a(String str) {
            C20561h hVar;
            C20575m o = C20561h.this.mo32174o(str);
            if (o == null) {
                Log.m105920e("MicroMsg.Audio.AudioPlayerMgr", "onStart player is null");
                return;
            }
            C20561h.this.mo32180v(str, o);
            synchronized (C20561h.this.f57882o) {
                hVar = C20561h.this;
                hVar.f57883p = false;
            }
            MMHandlerThread.removeRunnable(hVar.f57863O);
            AudioPlayerEvent audioPlayerEvent = new AudioPlayerEvent();
            AudioPlayerEvent.C17674a aVar = audioPlayerEvent.f48073d;
            aVar.f48074a = 11;
            aVar.f48077d = "real_play";
            aVar.f48076c = str;
            aVar.f48078e = C20561h.this.mo32172m(str);
            audioPlayerEvent.asyncPublish(Looper.getMainLooper());
        }
    }

    /* renamed from: ea2.h$c */
    public class C20564c implements Runnable {
        public C20564c() {
        }

        public void run() {
            Log.m105924i("MicroMsg.Audio.AudioPlayerMgr", "stopAudioDelayRunnable, run");
            Iterator<String> it = C20561h.this.f57873f.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (C20561h.this.mo32175p(next) == 0) {
                    C20561h.this.mo32183y(next);
                }
            }
        }
    }

    /* renamed from: ea2.h$d */
    public class C20565d implements Runnable {
        public C20565d() {
        }

        public void run() {
            C20561h hVar;
            Log.m105924i("MicroMsg.Audio.AudioPlayerMgr", "releaseAudioDelayRunnable, run");
            Iterator<String> it = C20561h.this.f57873f.iterator();
            boolean z = false;
            while (it.hasNext()) {
                String next = it.next();
                if (C20561h.this.mo32175p(next) == 0) {
                    C20561h hVar2 = C20561h.this;
                    hVar2.getClass();
                    Log.m105925i("MicroMsg.Audio.AudioPlayerMgr", "destroyAllAudioPlayersAndSaveState, appId:%s", next);
                    LinkedList linkedList = hVar2.f57875h.get(next);
                    if (linkedList == null || linkedList.size() == 0) {
                        Log.m105920e("MicroMsg.Audio.AudioPlayerMgr", "there is no audioIds and players for this appId to stop");
                    } else {
                        synchronized (hVar2.f57882o) {
                            Iterator it4 = linkedList.iterator();
                            while (it4.hasNext()) {
                                String str = (String) it4.next();
                                if (hVar2.f57849A.mo33568f(str)) {
                                    hVar2.f57849A.mo33580r(str);
                                }
                                C20575m remove = hVar2.f57869b.remove(str);
                                hVar2.f57870c.remove(str);
                                if (remove != null) {
                                    hVar2.mo32155N(str, remove);
                                    Log.m105924i("MicroMsg.Audio.AudioPlayerMgr", "destroy player");
                                    if (remove.f57921o) {
                                        Log.m105918d("MicroMsg.Audio.AudioPlayerMgr", "releasePlayer");
                                        hVar2.mo32170k(str, remove);
                                    } else {
                                        hVar2.mo32170k(str, remove);
                                    }
                                }
                            }
                            Iterator it5 = linkedList.iterator();
                            while (it5.hasNext()) {
                                String str2 = (String) it5.next();
                                if (hVar2.f57849A.mo33568f(str2)) {
                                    hVar2.f57849A.mo33580r(str2);
                                }
                                C20575m remove2 = hVar2.f57871d.remove(str2);
                                hVar2.f57872e.remove(str2);
                                if (remove2 != null) {
                                    hVar2.mo32155N(str2, remove2);
                                    Log.m105924i("MicroMsg.Audio.AudioPlayerMgr", "destroy recycled player");
                                    if (remove2.f57921o) {
                                        Log.m105918d("MicroMsg.Audio.AudioPlayerMgr", "releasePlayer");
                                        hVar2.mo32170k(str2, remove2);
                                    } else {
                                        hVar2.mo32170k(str2, remove2);
                                    }
                                }
                            }
                        }
                    }
                    z = true;
                }
            }
            if (!z) {
                synchronized (C20561h.this.f57882o) {
                    hVar = C20561h.this;
                    hVar.f57883p = true;
                }
                hVar.f57885r = System.currentTimeMillis();
                MMHandlerThread.postToMainThreadDelayed(C20561h.this.f57863O, 1800000);
            }
        }
    }

    /* renamed from: ea2.h$e */
    public class C20566e implements MessageQueue.IdleHandler {

        /* renamed from: d */
        public final /* synthetic */ String f57898d;

        public C20566e(String str) {
            this.f57898d = str;
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
            java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
            	at java.base/java.util.Objects.checkIndex(Objects.java:372)
            	at java.base/java.util.ArrayList.get(ArrayList.java:458)
            	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
            */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x0192  */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x019b  */
        public boolean queueIdle() {
            /*
                r15 = this;
                ea2.h r0 = ea2.C20561h.this
                java.util.HashMap<java.lang.String, nb0.b> r0 = r0.f57876i
                java.lang.String r1 = r15.f57898d
                java.lang.Object r0 = r0.get(r1)
                nb0.b r0 = (nb0.C88912b) r0
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L_0x0037
                java.lang.String r0 = "MicroMsg.Audio.AudioPlayerMgr"
                java.lang.String r3 = "preloadMixCache param is null, audioId:%s"
                java.lang.Object[] r1 = new java.lang.Object[r1]
                java.lang.String r4 = r15.f57898d
                r1[r2] = r4
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r3, r1)
                ea2.h r0 = ea2.C20561h.this
                java.util.LinkedList<java.lang.String> r3 = r0.f57855G
                monitor-enter(r3)
                ea2.h r0 = ea2.C20561h.this     // Catch:{ all -> 0x0034 }
                java.util.LinkedList<java.lang.String> r0 = r0.f57855G     // Catch:{ all -> 0x0034 }
                java.lang.String r1 = r15.f57898d     // Catch:{ all -> 0x0034 }
                r0.remove(r1)     // Catch:{ all -> 0x0034 }
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                ea2.h r0 = ea2.C20561h.this
                java.lang.String r1 = r15.f57898d
                ea2.C20561h.m22330b(r0, r1)
                return r2
            L_0x0034:
                r0 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                throw r0
            L_0x0037:
                java.lang.String r3 = r0.f256418c
                boolean r3 = android.text.TextUtils.isEmpty(r3)
                if (r3 != 0) goto L_0x01f1
                ea2.h r3 = ea2.C20561h.this
                lh.c r3 = r3.f57849A
                java.lang.String r4 = r0.f256418c
                boolean r3 = r3.mo33567e(r4)
                if (r3 != 0) goto L_0x01f1
                java.lang.String r3 = r0.f256418c
                long r3 = p213oh.C89209a.m111503e(r3)
                ea2.h r5 = ea2.C20561h.this
                boolean r5 = r5.mo32179u(r0)
                if (r5 == 0) goto L_0x0060
                java.nio.ByteBuffer r3 = r0.f256415B
                int r3 = r3.limit()
                long r3 = (long) r3
            L_0x0060:
                java.lang.String r5 = "MicroMsg.Audio.AudioPlayerMgr"
                java.lang.String r6 = "preloadMixCache preload filePath:%s, fileSize:%d, preloadMixCacheCount:%d"
                r7 = 3
                java.lang.Object[] r7 = new java.lang.Object[r7]
                java.lang.String r8 = r0.f256418c
                r7[r2] = r8
                java.lang.Long r8 = java.lang.Long.valueOf(r3)
                r7[r1] = r8
                ea2.h r8 = ea2.C20561h.this
                long r8 = r8.f57853E
                java.lang.Long r8 = java.lang.Long.valueOf(r8)
                r9 = 2
                r7[r9] = r8
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r7)
                ea2.h r5 = ea2.C20561h.this
                lh.c r5 = r5.f57849A
                long r5 = r5.mo33565c()
                ea2.h r7 = ea2.C20561h.this
                lh.c r7 = r7.f57849A
                long r10 = r7.mo33565c()
                java.lang.Object[] r8 = new java.lang.Object[r9]
                java.lang.Long r12 = java.lang.Long.valueOf(r10)
                r8[r2] = r12
                java.lang.String r12 = r7.f60637f
                r8[r1] = r12
                int r12 = p213oh.C11412b.f33577a
                java.lang.String r12 = "MicroMsg.Mix.AudioMixPlayer"
                java.lang.String r13 = "cacheInMemoryTotalSize:%d, appId:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r13, r8)
                r13 = 50000000(0x2faf080, double:2.47032823E-316)
                int r8 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
                if (r8 < 0) goto L_0x00ad
                r8 = 1
                goto L_0x00ae
            L_0x00ad:
                r8 = 0
            L_0x00ae:
                if (r8 == 0) goto L_0x00bb
                java.lang.Object[] r10 = new java.lang.Object[r1]
                java.lang.String r7 = r7.f60637f
                r10[r2] = r7
                java.lang.String r7 = "isLoadedCacheExceedMaxMemory, exceed max cache 50M!, appId:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r12, r7, r10)
            L_0x00bb:
                ea2.h r7 = ea2.C20561h.this
                java.util.HashMap<java.lang.String, java.lang.Integer> r7 = r7.f57893z
                java.lang.String r10 = r0.f256418c
                boolean r7 = r7.containsKey(r10)
                if (r7 == 0) goto L_0x00d8
                ea2.h r7 = ea2.C20561h.this
                java.util.HashMap<java.lang.String, java.lang.Integer> r7 = r7.f57893z
                java.lang.String r10 = r0.f256418c
                java.lang.Object r7 = r7.get(r10)
                java.lang.Integer r7 = (java.lang.Integer) r7
                int r7 = r7.intValue()
                goto L_0x00d9
            L_0x00d8:
                r7 = 0
            L_0x00d9:
                if (r8 == 0) goto L_0x00f8
                java.lang.String r0 = "MicroMsg.Audio.AudioPlayerMgr"
                java.lang.String r1 = "loaded cache is exceed Max Memory 50M, don't load more audio into memory!"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
                ea2.h r0 = ea2.C20561h.this
                fa2.c r0 = r0.f57887t
                if (r0 == 0) goto L_0x00ed
                r1 = 713(0x2c9, float:9.99E-43)
                r0.mo32420p(r1)
            L_0x00ed:
                ea2.h r0 = ea2.C20561h.this
                lh.c r0 = r0.f57849A
                java.lang.String r1 = ""
                r0.mo33563a(r1)
                goto L_0x022b
            L_0x00f8:
                long r10 = r5 + r3
                int r8 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
                if (r8 <= 0) goto L_0x0129
                java.lang.String r0 = "MicroMsg.Audio.AudioPlayerMgr"
                java.lang.String r7 = "loaded cache and loading fileSize is exceed Max Memory 50M, don't load more audio into memory!  loadCacheBufferSize:%d, fileSize:%d"
                java.lang.Object[] r8 = new java.lang.Object[r9]
                java.lang.Long r5 = java.lang.Long.valueOf(r5)
                r8[r2] = r5
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
                r8[r1] = r3
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r7, r8)
                ea2.h r0 = ea2.C20561h.this
                fa2.c r0 = r0.f57887t
                if (r0 == 0) goto L_0x011e
                r1 = 714(0x2ca, float:1.0E-42)
                r0.mo32420p(r1)
            L_0x011e:
                ea2.h r0 = ea2.C20561h.this
                lh.c r0 = r0.f57849A
                java.lang.String r1 = ""
                r0.mo33563a(r1)
                goto L_0x022b
            L_0x0129:
                r5 = 30
                if (r7 < r5) goto L_0x0136
                java.lang.String r0 = "MicroMsg.Audio.AudioPlayerMgr"
                java.lang.String r1 = "load audio fail number exceed MAX_LOAD_FAIL_COUNT, don't load again!"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
                goto L_0x022b
            L_0x0136:
                ea2.h r5 = ea2.C20561h.this
                lh.c r5 = r5.f57849A
                java.lang.String r5 = r0.f256418c
                boolean r6 = android.text.TextUtils.isEmpty(r5)
                r7 = 2000000(0x1e8480, double:9.881313E-318)
                if (r6 == 0) goto L_0x0146
                goto L_0x0185
            L_0x0146:
                com.tencent.mm.vfs.m1 r6 = new com.tencent.mm.vfs.m1
                r6.<init>((java.lang.String) r5)
                boolean r9 = r6.mo119967g()
                if (r9 != 0) goto L_0x0152
                goto L_0x0185
            L_0x0152:
                boolean r9 = r6.mo119977o()
                if (r9 == 0) goto L_0x0159
                goto L_0x0185
            L_0x0159:
                java.lang.String r9 = ".wav"
                boolean r10 = r5.endsWith(r9)
                if (r10 == 0) goto L_0x0172
                long r10 = r6.mo119980r()
                r12 = 5000000(0x4c4b40, double:2.470328E-317)
                int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                if (r14 < 0) goto L_0x016e
                r10 = 1
                goto L_0x016f
            L_0x016e:
                r10 = 0
            L_0x016f:
                if (r10 == 0) goto L_0x0172
                goto L_0x0185
            L_0x0172:
                boolean r5 = r5.endsWith(r9)
                if (r5 != 0) goto L_0x0187
                long r5 = r6.mo119980r()
                int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r9 < 0) goto L_0x0182
                r5 = 1
                goto L_0x0183
            L_0x0182:
                r5 = 0
            L_0x0183:
                if (r5 == 0) goto L_0x0187
            L_0x0185:
                r5 = 0
                goto L_0x0188
            L_0x0187:
                r5 = 1
            L_0x0188:
                if (r5 != 0) goto L_0x019b
                ea2.h r5 = ea2.C20561h.this
                boolean r5 = r5.mo32179u(r0)
                if (r5 != 0) goto L_0x019b
                java.lang.String r0 = "MicroMsg.Audio.AudioPlayerMgr"
                java.lang.String r1 = "don't support load large file and invalid file"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
                goto L_0x022b
            L_0x019b:
                ea2.h r5 = ea2.C20561h.this
                boolean r5 = r5.mo32179u(r0)
                if (r5 == 0) goto L_0x01bb
                java.nio.ByteBuffer r5 = r0.f256415B
                int r5 = r5.limit()
                long r5 = (long) r5
                int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r9 < 0) goto L_0x01b0
                r5 = 1
                goto L_0x01b1
            L_0x01b0:
                r5 = 0
            L_0x01b1:
                if (r5 == 0) goto L_0x01bb
                java.lang.String r0 = "MicroMsg.Audio.AudioPlayerMgr"
                java.lang.String r1 = "don't support load pByteBuff large file"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
                goto L_0x022b
            L_0x01bb:
                ea2.h r5 = ea2.C20561h.this
                lh.c r5 = r5.f57849A
                java.lang.String r6 = r0.f256418c
                ih.a r5 = r5.f60633b
                java.lang.Object r7 = r5.f59594f
                monitor-enter(r7)
                java.util.List<java.lang.String> r5 = r5.f59592d     // Catch:{ all -> 0x01ee }
                java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch:{ all -> 0x01ee }
                boolean r5 = r5.contains(r6)     // Catch:{ all -> 0x01ee }
                monitor-exit(r7)     // Catch:{ all -> 0x01ee }
                if (r5 != 0) goto L_0x01e6
                r0.f256414A = r1
                r0.f256439x = r3
                ea2.h r3 = ea2.C20561h.this
                lh.c r3 = r3.f57849A
                r3.mo33575m(r0)
                ea2.h r0 = ea2.C20561h.this
                long r3 = r0.f57853E
                r5 = 1
                long r3 = r3 + r5
                r0.f57853E = r3
                goto L_0x022c
            L_0x01e6:
                java.lang.String r0 = "MicroMsg.Audio.AudioPlayerMgr"
                java.lang.String r1 = "mix audio cache is loading"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
                goto L_0x022b
            L_0x01ee:
                r0 = move-exception
                monitor-exit(r7)     // Catch:{ all -> 0x01ee }
                throw r0
            L_0x01f1:
                java.lang.String r1 = r0.f256418c
                boolean r1 = android.text.TextUtils.isEmpty(r1)
                if (r1 != 0) goto L_0x0229
                r0.f256414A = r2
                ea2.h r1 = ea2.C20561h.this
                lh.c r1 = r1.f57849A
                java.lang.String r3 = r15.f57898d
                boolean r1 = r1.mo33568f(r3)
                if (r1 != 0) goto L_0x020e
                ea2.h r1 = ea2.C20561h.this
                lh.c r1 = r1.f57849A
                r1.mo33578p(r0)
            L_0x020e:
                ea2.h r1 = ea2.C20561h.this
                boolean r1 = r1.mo32179u(r0)
                if (r1 == 0) goto L_0x0220
                java.nio.ByteBuffer r1 = r0.f256415B
                int r1 = r1.limit()
                long r3 = (long) r1
                r0.f256439x = r3
                goto L_0x022b
            L_0x0220:
                java.lang.String r1 = r0.f256418c
                long r3 = p213oh.C89209a.m111503e(r1)
                r0.f256439x = r3
                goto L_0x022b
            L_0x0229:
                r0.f256414A = r2
            L_0x022b:
                r1 = 0
            L_0x022c:
                ea2.h r0 = ea2.C20561h.this
                java.util.LinkedList<java.lang.String> r0 = r0.f57855G
                monitor-enter(r0)
                ea2.h r3 = ea2.C20561h.this     // Catch:{ all -> 0x0245 }
                java.util.LinkedList<java.lang.String> r3 = r3.f57855G     // Catch:{ all -> 0x0245 }
                java.lang.String r4 = r15.f57898d     // Catch:{ all -> 0x0245 }
                r3.remove(r4)     // Catch:{ all -> 0x0245 }
                monitor-exit(r0)     // Catch:{ all -> 0x0245 }
                if (r1 != 0) goto L_0x0244
                ea2.h r0 = ea2.C20561h.this
                java.lang.String r1 = r15.f57898d
                ea2.C20561h.m22330b(r0, r1)
            L_0x0244:
                return r2
            L_0x0245:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0245 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: ea2.C20561h.C20566e.queueIdle():boolean");
        }
    }

    /* renamed from: ea2.h$f */
    public class C20567f implements C21426b {
        public C20567f() {
        }
    }

    /* renamed from: ea2.h$g */
    public class C20568g implements C21435i {
        public C20568g() {
        }
    }

    /* renamed from: ea2.h$h */
    public class C20569h implements C21244g {
        public C20569h() {
        }
    }

    /* renamed from: ea2.h$i */
    public class C20570i implements Comparator<C88912b> {
        public C20570i(C20561h hVar) {
        }

        public int compare(Object obj, Object obj2) {
            int i = (((C88912b) obj).f256425j > ((C88912b) obj2).f256425j ? 1 : (((C88912b) obj).f256425j == ((C88912b) obj2).f256425j ? 0 : -1));
            if (i > 0) {
                return 1;
            }
            return i < 0 ? -1 : 0;
        }
    }

    public C20561h() {
        Log.m105924i("MicroMsg.Audio.AudioPlayerMgr", "_release");
        this.f57868a.clear();
        synchronized (this.f57882o) {
            Iterator<String> it = this.f57870c.iterator();
            while (it.hasNext()) {
                String next = it.next();
                mo32170k(next, this.f57869b.remove(next));
            }
            this.f57870c.clear();
            this.f57869b.clear();
            Iterator<String> it4 = this.f57872e.iterator();
            while (it4.hasNext()) {
                String next2 = it4.next();
                mo32170k(next2, this.f57871d.remove(next2));
            }
            this.f57872e.clear();
            this.f57871d.clear();
        }
        Iterator<String> it5 = this.f57873f.iterator();
        while (it5.hasNext()) {
            LinkedList remove = this.f57875h.remove(it5.next());
            if (remove != null) {
                remove.clear();
            }
        }
        this.f57873f.clear();
        this.f57874g.clear();
        this.f57875h.clear();
        this.f57876i.clear();
        this.f57877j.clear();
        this.f57880m.clear();
        this.f57881n.clear();
        this.f57878k.clear();
        MMHandlerThread.removeRunnable(this.f57862N);
        MMHandlerThread.removeRunnable(this.f57863O);
        this.f57883p = false;
        this.f57884q = false;
        synchronized (this.f57890w) {
            PhoneStatusWatcher.PhoneCallListener phoneCallListener = this.f57890w[0];
            if (phoneCallListener != null) {
                ((PhoneStatusWatcher) C86312j.m106911c(PhoneStatusWatcher.class)).removePhoneCallListener(phoneCallListener);
                this.f57890w[0] = null;
            }
        }
        Log.m105924i("MicroMsg.Audio.AudioPlayerMgr", "removePhoneStatusWatcher");
        this.f57859K = null;
        C21427c cVar = new C21427c(false);
        this.f57849A = cVar;
        C21426b bVar = this.f57864P;
        C21428d dVar = cVar.f60632a;
        dVar.f60648j = bVar;
        dVar.f60650l = this.f57865Q;
        C20558c cVar2 = new C20558c();
        this.f57856H = cVar2;
        cVar2.f60044e = this.f57866R;
    }

    /* renamed from: b */
    public static void m22330b(C20561h hVar, String str) {
        if (hVar.f57854F.remove(str)) {
            hVar.f57876i.remove(str);
        }
    }

    /* renamed from: c */
    public static void m22331c(C20561h hVar) {
        if (hVar.mo32177r() > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            if (!hVar.f57884q || currentTimeMillis - hVar.f57886s >= 10000) {
                synchronized (hVar.f57882o) {
                    hVar.f57884q = true;
                }
                hVar.f57886s = currentTimeMillis;
                Log.m105925i("MicroMsg.Audio.AudioPlayerMgr", "stopAudioDelayIfPaused, delay_ms:%d", 600000);
                MMHandlerThread.removeRunnable(hVar.f57862N);
                MMHandlerThread.postToMainThreadDelayed(hVar.f57862N, (long) 600000);
                return;
            }
            return;
        }
        synchronized (hVar.f57882o) {
            hVar.f57884q = false;
        }
        MMHandlerThread.removeRunnable(hVar.f57862N);
    }

    /* renamed from: s */
    public static C20561h m22332s() {
        if (f57848T == null) {
            f57848T = new C20561h();
        }
        return f57848T;
    }

    /* renamed from: A */
    public void mo32142A(String str) {
        if (mo32178t()) {
            C88912b bVar = this.f57876i.get(str);
            if (bVar == null || TextUtils.isEmpty(bVar.f256418c) || !this.f57849A.mo33567e(bVar.f256418c)) {
                synchronized (this.f57855G) {
                    if (!this.f57855G.contains(str)) {
                        this.f57855G.add(str);
                    }
                }
                if (this.f57858J == null || Looper.myQueue() == null) {
                    Log.m105924i("MicroMsg.Audio.AudioPlayerMgr", "Looper.myQueue() is null!");
                } else {
                    Looper.myQueue().addIdleHandler(new C20566e(str));
                }
            } else {
                Log.m105924i("MicroMsg.Audio.AudioPlayerMgr", "preloadMixCache cache done!");
            }
        }
    }

    /* renamed from: B */
    public final void mo32143B() {
        Log.m105924i("MicroMsg.Audio.AudioPlayerMgr", "recycleStopPlayer");
        synchronized (this.f57882o) {
            LinkedList linkedList = new LinkedList();
            linkedList.addAll(this.f57872e);
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                C20575m remove = this.f57871d.remove(str);
                this.f57872e.remove(str);
                if (remove != null) {
                    if (remove.f57921o) {
                        mo32155N(str, remove);
                        Log.m105918d("MicroMsg.Audio.AudioPlayerMgr", "releasePlayer");
                        mo32170k(str, remove);
                    } else if (!remove.mo32219v()) {
                        mo32155N(str, remove);
                        mo32170k(str, remove);
                    }
                }
            }
        }
    }

    /* renamed from: C */
    public final void mo32144C() {
        Log.m105924i("MicroMsg.Audio.AudioPlayerMgr", "recyclePausedPlayer");
        synchronized (this.f57882o) {
            LinkedList linkedList = new LinkedList();
            linkedList.addAll(this.f57872e);
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                C20575m mVar = this.f57871d.get(str);
                if (mVar != null) {
                    if (mVar.mo32219v()) {
                        mo32184z(str, mVar);
                    }
                }
            }
        }
    }

    /* renamed from: D */
    public final void mo32145D(String str) {
        Log.m105924i("MicroMsg.Audio.AudioPlayerMgr", "recyclePlayer");
        int size = this.f57869b.size();
        int size2 = this.f57871d.size();
        int r = mo32177r();
        if (size > 0 || size2 > 0 || r > 0) {
            Log.m105925i("MicroMsg.Audio.AudioPlayerMgr", "start_player_count:%d, recycled_player_count:%d, paused_player_count:%d", Integer.valueOf(size), Integer.valueOf(size2), Integer.valueOf(r));
        }
        if (size >= 10) {
            mo32144C();
        } else if (r >= 6) {
            mo32144C();
        } else if (size + r >= 8) {
            mo32144C();
        }
        String m = mo32172m(str);
        int size3 = this.f57869b.size();
        int size4 = this.f57871d.size();
        if (size3 > 0 || size4 > 0) {
            Log.m105925i("MicroMsg.Audio.AudioPlayerMgr", "start_player_count:%d, recycled_player_count:%d", Integer.valueOf(size3), Integer.valueOf(size4));
        }
        if (size4 >= 50) {
            Iterator<String> it = this.f57873f.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next != null && !next.equalsIgnoreCase(m)) {
                    mo32146E(next);
                }
            }
        } else if (size4 + size3 >= 50) {
            Iterator<String> it4 = this.f57873f.iterator();
            while (it4.hasNext()) {
                String next2 = it4.next();
                if (next2 != null && !next2.equalsIgnoreCase(m)) {
                    mo32146E(next2);
                }
            }
        } else {
            Log.m105924i("MicroMsg.Audio.AudioPlayerMgr", "condition is not satisfy to do recycleStopPlayerByAppId");
        }
        int size5 = this.f57871d.size();
        if (size3 > 0 || size5 > 0) {
            Log.m105925i("MicroMsg.Audio.AudioPlayerMgr", "start_player_count:%d, recycled_player_count:%d", Integer.valueOf(size3), Integer.valueOf(size5));
        }
        if (size5 >= 50) {
            mo32143B();
        } else if (size3 + size5 >= 50) {
            mo32143B();
        } else {
            Log.m105924i("MicroMsg.Audio.AudioPlayerMgr", "condition is not satisfy to do recycleAllStopPlayer");
        }
    }

    /* renamed from: E */
    public final void mo32146E(String str) {
        Log.m105924i("MicroMsg.Audio.AudioPlayerMgr", "recycleStoppedPlayerByAppId");
        Log.m105925i("MicroMsg.Audio.AudioPlayerMgr", "destroyAllStoppedAudioPlayersAndSaveStateByAppId, appId:%s", str);
        mo32164e(str);
        mo32152K();
        LinkedList linkedList = this.f57875h.get(str);
        if (linkedList == null || linkedList.size() == 0) {
            Log.m105920e("MicroMsg.Audio.AudioPlayerMgr", "there is no audioIds and players for this appId to stop");
            return;
        }
        synchronized (this.f57882o) {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (this.f57849A.mo33568f(str2)) {
                    this.f57849A.mo33580r(str2);
                }
                C20575m remove = this.f57871d.remove(str2);
                this.f57872e.remove(str2);
                if (remove != null) {
                    mo32155N(str2, remove);
                    Log.m105924i("MicroMsg.Audio.AudioPlayerMgr", "destroy recycled player");
                    if (remove.f57921o) {
                        Log.m105918d("MicroMsg.Audio.AudioPlayerMgr", "releasePlayer");
                        mo32170k(str2, remove);
                    } else {
                        mo32170k(str2, remove);
                    }
                }
            }
        }
    }

    /* renamed from: F */
    public void mo32147F(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        if (!this.f57883p || currentTimeMillis - this.f57885r >= 10000) {
            this.f57885r = currentTimeMillis;
            synchronized (this.f57882o) {
                this.f57883p = true;
            }
            Log.m105925i("MicroMsg.Audio.AudioPlayerMgr", "releaseAudioDelayIfPaused, delay_ms:%d", Integer.valueOf(i));
            MMHandlerThread.removeRunnable(this.f57863O);
            MMHandlerThread.postToMainThreadDelayed(this.f57863O, (long) i);
        }
    }

    /* renamed from: G */
    public final void mo32148G() {
        Log.m105924i("MicroMsg.Audio.AudioPlayerMgr", "removeAndStopPlayingAudioPlayer");
        Iterator<String> it = this.f57879l.iterator();
        while (it.hasNext()) {
            String next = it.next();
            Log.m105925i("MicroMsg.Audio.AudioPlayerMgr", "need remove and stop player audioId : %s", next);
            mo32158Q(next);
            mo32151J();
        }
        Iterator<String> it4 = this.f57881n.iterator();
        while (it4.hasNext()) {
            String next2 = it4.next();
            Log.m105925i("MicroMsg.Audio.AudioPlayerMgr", "need remove and stop player for try audioId : %s", next2);
            mo32158Q(next2);
            mo32151J();
        }
        this.f57879l.clear();
        this.f57881n.clear();
    }

    /* renamed from: H */
    public void mo32149H() {
        C21427c cVar = this.f57849A;
        cVar.mo33579q(false);
        C21428d dVar = cVar.f60632a;
        dVar.getClass();
        Boolean bool = Boolean.FALSE;
        int i = C11412b.f33577a;
        Log.m105925i("MicroMsg.Mix.AudioMixPlayerImpl", "setIsOutputMixBuffer:%b", bool);
        dVar.f60661w = false;
        Log.m105925i("MicroMsg.Mix.AudioMixPlayer", "forceMixPlay:%b", bool);
        cVar.f60638g = false;
        this.f57859K = null;
        for (C20575m next : this.f57869b.values()) {
            if (next != null) {
                next.f57911D = null;
            }
        }
    }

    /* renamed from: I */
    public final void mo32150I(C88912b bVar, boolean z, boolean z2) {
        long j;
        C20705c cVar = (C20705c) C101991b.m134284b(C20705c.class);
        this.f57887t = cVar;
        if (cVar != null) {
            cVar.mo32414X(bVar.f256416a, bVar.f256417b, z2);
        }
        long currentTimeMillis = System.currentTimeMillis();
        bVar.f256430o = currentTimeMillis;
        if (z) {
            j = bVar.f256434s;
            bVar.f256431p = bVar.f256433r;
        } else {
            j = bVar.f256436u;
            bVar.f256431p = bVar.f256435t;
        }
        if (j <= 0 || currentTimeMillis <= j) {
            bVar.f256432q = 0;
        } else {
            bVar.f256432q = currentTimeMillis - j;
        }
    }

    /* renamed from: J */
    public final void mo32151J() {
        C20705c cVar = (C20705c) C101991b.m134284b(C20705c.class);
        this.f57887t = cVar;
        if (cVar != null) {
            cVar.mo32422s();
        }
    }

    /* renamed from: K */
    public void mo32152K() {
        Log.m105924i("MicroMsg.Audio.AudioPlayerMgr", "resetSpeaker");
        if (!this.f57851C && this.f57852D.getMode() == 3) {
            Log.m105924i("MicroMsg.Audio.AudioPlayerMgr", "set speaker on and reset mode to MODE_NORMAL");
            this.f57852D.setSpeakerphoneOn(true);
            this.f57852D.setMode(0);
        } else if (!this.f57851C) {
            Log.m105924i("MicroMsg.Audio.AudioPlayerMgr", "set speaker on");
            this.f57852D.setSpeakerphoneOn(true);
        }
        this.f57851C = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0046, code lost:
        if (r0 == null) goto L_0x006e;
     */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo32153L(java.lang.String r11, nb0.C88912b r12) {
        /*
            r10 = this;
            java.util.HashMap<java.lang.String, nb0.b> r0 = r10.f57876i
            java.lang.Object r0 = r0.get(r11)
            nb0.b r0 = (nb0.C88912b) r0
            java.util.LinkedList<java.lang.String> r1 = r10.f57868a
            boolean r1 = r1.contains(r11)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0014
            if (r0 != 0) goto L_0x0049
        L_0x0014:
            if (r12 == 0) goto L_0x0049
            java.lang.String r1 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r4 = "resumeAudio, the audioId %s is not found or param is null, backupParam is exit"
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r5[r3] = r11
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r4, r5)
            java.lang.String r1 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r4[r3] = r11
            java.lang.String r5 = "restorePlayerParam audioId:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r5, r4)
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r10.f57874g
            java.lang.String r4 = r12.f256429n
            java.lang.String r5 = r12.f256426k
            r1.put(r4, r5)
            java.util.HashMap<java.lang.String, nb0.b> r1 = r10.f57876i
            java.lang.String r4 = r12.f256416a
            r1.put(r4, r12)
            java.lang.String r1 = r12.f256429n
            r10.mo32154M(r1, r11)
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = r10.f57880m
            r1.remove(r11)
            if (r0 != 0) goto L_0x006d
            goto L_0x006e
        L_0x0049:
            java.util.LinkedList<java.lang.String> r12 = r10.f57868a
            boolean r12 = r12.contains(r11)
            if (r12 != 0) goto L_0x005e
            java.lang.String r12 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r0 = "resumeAudio fail, the audioId is not found!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
            r12 = 601(0x259, float:8.42E-43)
            r10.mo32182x(r12, r11)
            return r3
        L_0x005e:
            if (r0 != 0) goto L_0x006d
            java.lang.String r12 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r0 = "resumeAudio fail, the param is not found!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
            r12 = 602(0x25a, float:8.44E-43)
            r10.mo32182x(r12, r11)
            return r3
        L_0x006d:
            r12 = r0
        L_0x006e:
            java.lang.Class<fa2.c> r0 = fa2.C20705c.class
            ua2.a r0 = ua2.C101991b.m134284b(r0)
            fa2.c r0 = (fa2.C20705c) r0
            r10.f57887t = r0
            if (r0 == 0) goto L_0x0081
            java.lang.String r1 = r12.f256416a
            java.lang.String r4 = r12.f256417b
            r0.mo32416f(r1, r4)
        L_0x0081:
            java.lang.String r0 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r1 = "resumeAudio, audioId:%s"
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r4[r3] = r11
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r4)
            java.lang.String r0 = r10.mo32172m(r11)
            int r1 = r10.mo32175p(r0)
            r4 = 10
            if (r1 < r4) goto L_0x00ba
            java.lang.String r4 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r5 = "now created QQAudioPlayer count %d arrive MAX_PLAY_AUDIO_PLAYER_COUNT"
            java.lang.Object[] r6 = new java.lang.Object[r2]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r6[r3] = r1
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r5, r6)
            boolean r1 = r10.mo32163d(r11)
            if (r1 == 0) goto L_0x00b1
            r10.mo32148G()
            goto L_0x00ba
        L_0x00b1:
            r10.mo32151J()
            r12 = 600(0x258, float:8.41E-43)
            r10.mo32182x(r12, r11)
            return r3
        L_0x00ba:
            r10.mo32165f()
            java.util.HashMap<java.lang.String, nb0.b> r1 = r10.f57876i
            r1.put(r11, r12)
            r10.mo32164e(r0)
            r10.mo32171l()
            ea2.m r0 = r10.mo32174o(r11)
            boolean r1 = r10.mo32178t()
            if (r1 == 0) goto L_0x0225
            boolean r1 = r10.mo32157P(r0)
            lh.c r4 = r10.f57849A
            boolean r4 = r4.mo33568f(r11)
            if (r4 == 0) goto L_0x00e8
            lh.c r4 = r10.f57849A
            boolean r4 = r4.mo33566d(r11)
            if (r4 == 0) goto L_0x00e8
            r4 = 1
            goto L_0x00e9
        L_0x00e8:
            r4 = 0
        L_0x00e9:
            java.lang.String r5 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r6 = "resume canUseMixPlayer:%b, localCacheExit:%b, audioId:%s"
            r7 = 3
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r1)
            r7[r3] = r8
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r4)
            r7[r2] = r8
            java.lang.String r8 = r12.f256416a
            r9 = 2
            r7[r9] = r8
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r7)
            if (r1 == 0) goto L_0x01da
            if (r4 == 0) goto L_0x01da
            java.lang.String r1 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r4 = "use AudioMixPlayer"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r4)
            java.lang.String r1 = r12.f256416a
            r10.mo32169j(r1)
            nb0.e r1 = r12.f256440y
            if (r1 == 0) goto L_0x012c
            hp0.c r1 = (hp0.C87576c) r1     // Catch:{ Exception -> 0x0122 }
            r1.close()     // Catch:{ Exception -> 0x0122 }
            r1 = 0
            r12.f256440y = r1     // Catch:{ Exception -> 0x0122 }
            goto L_0x012c
        L_0x0122:
            r1 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r5 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r6 = "closeAudioDataSource"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r1, r6, r4)
        L_0x012c:
            lh.c r1 = r10.f57849A
            java.lang.String r4 = r12.f256416a
            boolean r1 = r1.mo33570h(r4)
            if (r1 == 0) goto L_0x013f
            java.lang.String r11 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r12 = "mix player is playing, do nothing"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r12)
            goto L_0x01d6
        L_0x013f:
            lh.c r1 = r10.f57849A
            java.lang.String r4 = r12.f256416a
            boolean r1 = r1.mo33572j(r4)
            if (r1 == 0) goto L_0x0157
            java.lang.String r11 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r1 = "mix player is preparing, do nothing"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r1)
            r12.f256422g = r2
            r0.mo32222y(r12)
            goto L_0x01d6
        L_0x0157:
            r10.mo32150I(r12, r3, r3)
            lh.c r12 = r10.f57849A
            r12.getClass()
            java.lang.String r0 = "MicroMsg.Mix.AudioMixPlayer"
            java.lang.String r1 = "play audioId:%s, audio state:%d"
            java.lang.Object[] r4 = new java.lang.Object[r9]
            r4[r3] = r11
            lh.d r5 = r12.f60632a
            int r5 = r5.mo33586g(r11)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r2] = r5
            int r5 = p213oh.C11412b.f33577a
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r4)
            lh.d r0 = r12.f60632a
            nb0.b r0 = r0.mo33582c(r11)
            r12.mo33564b(r0)
            lh.d r0 = r12.f60632a
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f60642d
            r1.set(r3)
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f60641c
            r1.set(r3)
            r0.mo33594o()
            r0.mo33592m()
            java.lang.Object r1 = r0.f60645g
            monitor-enter(r1)
            java.util.HashMap<java.lang.String, java.lang.Boolean> r4 = r0.f60656r     // Catch:{ all -> 0x01d7 }
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x01d7 }
            r4.put(r11, r5)     // Catch:{ all -> 0x01d7 }
            monitor-exit(r1)     // Catch:{ all -> 0x01d7 }
            kh.a r1 = r0.f60647i
            r1.mo33376l(r11)
            java.util.HashMap<java.lang.String, java.lang.Boolean> r1 = r0.f60652n
            r1.remove(r11)
            java.util.HashMap<java.lang.String, java.lang.Boolean> r1 = r0.f60653o
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r1.put(r11, r4)
            ih.a r1 = r0.f60658t
            boolean r1 = r1.mo32801c(r11)
            if (r1 == 0) goto L_0x01c2
            ih.a r1 = r0.f60658t
            boolean r1 = r1.mo32800b(r11)
            if (r1 == 0) goto L_0x01c2
            r0.mo33590k(r3, r11)
        L_0x01c2:
            ih.a r12 = r12.f60633b
            r12.getClass()
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r3] = r11
            java.lang.String r1 = "MicroMsg.Mix.AudioDecodeMgr"
            java.lang.String r4 = "startDecode audioId:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r4, r0)
            r12.mo32799a(r11, r3, r3)
        L_0x01d6:
            return r2
        L_0x01d7:
            r11 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x01d7 }
            throw r11
        L_0x01da:
            lh.c r1 = r10.f57849A
            boolean r1 = r1.mo33568f(r11)
            if (r1 == 0) goto L_0x022c
            if (r4 != 0) goto L_0x022c
            java.lang.String r1 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r4 = "resume mixPlayer param src change, do stop now"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r4)
            lh.c r1 = r10.f57849A
            java.lang.String r4 = r12.f256416a
            boolean r1 = r1.mo33570h(r4)
            if (r1 != 0) goto L_0x021d
            lh.c r1 = r10.f57849A
            java.lang.String r4 = r12.f256416a
            boolean r1 = r1.mo33573k(r4)
            if (r1 != 0) goto L_0x021d
            lh.c r1 = r10.f57849A
            java.lang.String r4 = r12.f256416a
            boolean r1 = r1.mo33572j(r4)
            if (r1 != 0) goto L_0x021d
            lh.c r1 = r10.f57849A
            java.lang.String r4 = r12.f256416a
            boolean r1 = r1.mo33571i(r4)
            if (r1 != 0) goto L_0x021d
            lh.c r1 = r10.f57849A
            java.lang.String r4 = r12.f256416a
            boolean r1 = r1.mo33569g(r4)
            if (r1 == 0) goto L_0x022c
        L_0x021d:
            lh.c r1 = r10.f57849A
            java.lang.String r4 = r12.f256416a
            r1.mo33580r(r4)
            goto L_0x022c
        L_0x0225:
            java.lang.String r1 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r4 = "Not support mix audio"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r4)
        L_0x022c:
            if (r0 != 0) goto L_0x0271
            java.lang.String r0 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r1 = "resumeAudio, player is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            r10.mo32145D(r11)
            java.lang.String r0 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r1 = "create new QQAudioPlayer with audioId %s to play"
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r4[r3] = r11
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r4)
            ea2.m r0 = r10.mo32168i()
            ea2.e r1 = r10.f57861M
            r0.f57907e = r1
            ea2.a r1 = r10.f57859K
            r0.f57911D = r1
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r11
            java.lang.String r4 = "MicroMsg.Audio.QQAudioPlayer"
            java.lang.String r5 = "setAudioId:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r1)
            r0.f57915f = r11
            r10.mo32180v(r11, r0)
            r12.f256422g = r2
            r12.f256419d = r3
            long r4 = java.lang.System.currentTimeMillis()
            r12.f256425j = r4
            r10.mo32150I(r12, r3, r2)
            r0.mo32223z(r12)
            return r2
        L_0x0271:
            r10.mo32180v(r11, r0)
            boolean r11 = r0.mo32211k()
            if (r11 == 0) goto L_0x028e
            boolean r11 = r0.mo32206f()
            if (r11 != 0) goto L_0x028e
            r10.mo32150I(r12, r3, r2)
            java.lang.String r11 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r12 = "is pause, do resume"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r12)
            r0.resume()
            goto L_0x02ff
        L_0x028e:
            boolean r11 = r0.mo32220w()
            if (r11 == 0) goto L_0x02af
            r10.mo32150I(r12, r3, r2)
            r12.f256422g = r2
            long r4 = java.lang.System.currentTimeMillis()
            r12.f256425j = r4
            java.lang.String r11 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r1 = "is prepared, do resume"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r1)
            r0.resume()
            r12.f256419d = r3
            r0.mo32222y(r12)
            goto L_0x02ff
        L_0x02af:
            boolean r11 = r0.mo32221x()
            if (r11 == 0) goto L_0x02c8
            java.lang.String r11 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r1 = "is preparing, do update param"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r1)
            r12.f256422g = r2
            long r3 = java.lang.System.currentTimeMillis()
            r12.f256425j = r3
            r0.mo32222y(r12)
            goto L_0x02ff
        L_0x02c8:
            boolean r11 = r0.f57921o
            if (r11 == 0) goto L_0x02e2
            r10.mo32150I(r12, r3, r2)
            r12.f256422g = r2
            long r3 = java.lang.System.currentTimeMillis()
            r12.f256425j = r3
            java.lang.String r11 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r1 = "is paused on background, do resume"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r1)
            r0.mo32223z(r12)
            goto L_0x02ff
        L_0x02e2:
            boolean r11 = r0.mo32211k()
            if (r11 != 0) goto L_0x0300
            r10.mo32150I(r12, r3, r2)
            r12.f256422g = r2
            long r4 = java.lang.System.currentTimeMillis()
            r12.f256425j = r4
            java.lang.String r11 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r1 = "is stop, do startPlay"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r1)
            r0.mo32223z(r12)
            r12.f256419d = r3
        L_0x02ff:
            return r2
        L_0x0300:
            java.lang.String r11 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r12 = "do nothing"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r12)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ea2.C20561h.mo32153L(java.lang.String, nb0.b):boolean");
    }

    /* renamed from: M */
    public final void mo32154M(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            Log.m105925i("MicroMsg.Audio.AudioPlayerMgr", "saveCreateId, appId:%s, audioId:%s", str, str2);
            if (!this.f57873f.contains(str)) {
                this.f57873f.add(str);
            }
            if (!this.f57868a.contains(str2)) {
                this.f57868a.add(str2);
            }
            LinkedList linkedList = this.f57875h.get(str);
            if (linkedList == null) {
                linkedList = new LinkedList();
            }
            if (!linkedList.contains(str2)) {
                linkedList.add(str2);
            }
            this.f57875h.put(str, linkedList);
        }
    }

    /* renamed from: N */
    public final void mo32155N(String str, C20575m mVar) {
        this.f57877j.put(str, mVar.mo32216s());
    }

    /* renamed from: O */
    public void mo32156O(C86468a aVar) {
        this.f57859K = aVar;
        C86468a.C86469a aVar2 = new C86468a.C86469a(1, "0");
        aVar.mo120892c(aVar2);
        this.f57860L = aVar2;
        C21427c cVar = this.f57849A;
        cVar.mo33579q(true);
        C21428d dVar = cVar.f60632a;
        dVar.getClass();
        Boolean bool = Boolean.TRUE;
        int i = C11412b.f33577a;
        Log.m105925i("MicroMsg.Mix.AudioMixPlayerImpl", "setIsOutputMixBuffer:%b", bool);
        dVar.f60661w = true;
        Log.m105925i("MicroMsg.Mix.AudioMixPlayer", "forceMixPlay:%b", bool);
        cVar.f60638g = true;
        synchronized (this.f57882o) {
            for (C20575m next : this.f57869b.values()) {
                if (next != null) {
                    next.f57911D = aVar;
                }
            }
        }
    }

    /* renamed from: P */
    public final boolean mo32157P(C20575m mVar) {
        if (mVar == null) {
            return true;
        }
        return !(mVar.mo32206f() || mVar.mo32219v() || mVar.mo32221x() || mVar.mo32220w() || mVar.mo32211k());
    }

    /* renamed from: Q */
    public boolean mo32158Q(String str) {
        C20575m o = mo32174o(str);
        if (o == null) {
            Log.m105920e("MicroMsg.Audio.AudioPlayerMgr", "stopAudio, player is null");
            if (!this.f57849A.mo33568f(str)) {
                return false;
            }
            this.f57849A.mo33580r(str);
            return true;
        }
        Log.m105925i("MicroMsg.Audio.AudioPlayerMgr", "stopAudio, audioId:%s", str);
        o.mo32210j();
        C88912b bVar = this.f57876i.get(str);
        if (bVar != null) {
            bVar.f256419d = 0;
            bVar.f256422g = true;
        }
        mo32155N(str, o);
        mo32181w(str, o);
        return true;
    }

    /* renamed from: R */
    public final void mo32159R(String str, C20575m mVar) {
        Log.m105925i("MicroMsg.Audio.AudioPlayerMgr", "unmarkPlayer, unmark player by audioId:%s", str);
        synchronized (this.f57882o) {
            if (this.f57872e.contains(str)) {
                this.f57871d.remove(str);
                this.f57872e.remove(str);
            }
            if (this.f57870c.contains(str)) {
                this.f57870c.remove(str);
                this.f57869b.remove(str);
            }
        }
    }

    /* renamed from: S */
    public final void mo32160S(String str) {
        C88912b bVar = this.f57876i.get(str);
        if (bVar != null && !TextUtils.isEmpty(bVar.f256417b)) {
            if ((bVar.f256417b.startsWith(HttpWrapperBase.PROTOCAL_HTTP) || bVar.f256417b.startsWith(HttpWrapperBase.PROTOCAL_HTTPS)) && C98331j.m127116a(bVar.f256417b)) {
                bVar.f256418c = C102984b.m136168e(bVar.f256417b);
                if (!this.f57892y.containsKey(bVar.f256417b)) {
                    this.f57892y.put(bVar.f256417b, bVar.f256418c);
                }
            }
        }
    }

    /* renamed from: T */
    public final void mo32161T(C88912b bVar) {
        if (TextUtils.isEmpty(bVar.f256418c) && this.f57892y.containsKey(bVar.f256417b)) {
            bVar.f256418c = this.f57892y.get(bVar.f256417b);
        }
    }

    /* renamed from: a */
    public void mo32162a() {
        C20826a aVar = this.f57889v;
        if (aVar.f58833b) {
            aVar.getClass();
            Log.m105924i("MicroMsg.Music.MusicAudioFocusHelper", "abandonFocus");
            AudioManager audioManager = aVar.f58832a;
            if (audioManager != null) {
                audioManager.abandonAudioFocus(aVar.f58834c);
                aVar.f58833b = false;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b5, code lost:
        r4 = "";
        r9 = ha2.C32752h.f89147i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b9, code lost:
        if (r9 == 0) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c1, code lost:
        if (ha2.C98329e.m127108d() == false) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c3, code lost:
        r9 = ((ha2.C98327c) ua2.C101991b.m134284b(ha2.C98327c.class)).mo137653u(3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d0, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105920e("MicroMsg.Music.MusicDataStorageImpl", "IMusicDataStorage service not exist");
        r9 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d8, code lost:
        ha2.C32752h.f89147i = r9;
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.Music.PieceCacheHelper", "sRemovePlayingAudioPlayerGroupCount:%d", java.lang.Integer.valueOf(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00eb, code lost:
        if (ha2.C32752h.f89147i != 0) goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ed, code lost:
        ha2.C32752h.f89147i = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ef, code lost:
        r9 = ha2.C32752h.f89147i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f1, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105919d("MicroMsg.Audio.AudioPlayerMgr", "removePlayerGroupMinCount:%d", java.lang.Integer.valueOf(r9));
        r0 = r0.iterator();
        r11 = r9;
        r10 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x010a, code lost:
        if (r0.hasNext() == false) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x010c, code lost:
        r12 = (java.lang.String) r0.next();
        r13 = ((java.lang.Integer) r2.get(r12)).intValue();
        com.tencent.p014mm.sdk.platformtools.Log.m105919d("MicroMsg.Audio.AudioPlayerMgr", "count:%d, url:%s", java.lang.Integer.valueOf(r13), r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x012e, code lost:
        if (r13 < r9) goto L_0x013c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0130, code lost:
        if (r11 >= r13) goto L_0x0134;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0132, code lost:
        r4 = r12;
        r11 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0138, code lost:
        if (android.text.TextUtils.isEmpty(r4) == false) goto L_0x013b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x013a, code lost:
        r4 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x013b, code lost:
        r10 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x013f, code lost:
        if (r10 == false) goto L_0x0160;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0141, code lost:
        r0 = r1.f57876i.get(r18);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x014b, code lost:
        if (r0 == null) goto L_0x0160;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x014d, code lost:
        if (r4 == null) goto L_0x0160;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0155, code lost:
        if (r4.equalsIgnoreCase(r0.f256417b) == false) goto L_0x0160;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0157, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.Audio.AudioPlayerMgr", "srcUrl is same, not remove and don't play again");
        r10 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0160, code lost:
        if (r10 == false) goto L_0x022a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0162, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.Audio.AudioPlayerMgr", "need to remove player");
        r0 = (java.util.ArrayList) r3.get(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x016f, code lost:
        if (r0 == null) goto L_0x0236;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0175, code lost:
        if (r0.size() <= 0) goto L_0x0236;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0177, code lost:
        r2 = new java.util.LinkedList();
        r0 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0184, code lost:
        if (r0.hasNext() == false) goto L_0x019a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0186, code lost:
        r3 = r1.f57876i.get((java.lang.String) r0.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0194, code lost:
        if (r3 == null) goto L_0x0180;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0196, code lost:
        r2.add(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x019a, code lost:
        java.util.Collections.sort(r2, new ea2.C20561h.C20570i(r1));
        r0 = new java.util.LinkedList();
        r2 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01af, code lost:
        if (r2.hasNext() == false) goto L_0x01bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01b1, code lost:
        r0.add(((nb0.C88912b) r2.next()).f256416a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01bd, code lost:
        r5 = r5 - 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01c0, code lost:
        if (r5 <= 0) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01c6, code lost:
        if (r0.size() <= r5) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01c8, code lost:
        r5 = r5 + 1;
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.Audio.AudioPlayerMgr", "removeCount should be %d", java.lang.Integer.valueOf(r5));
        r2 = r0.size() - r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01dd, code lost:
        if (r2 >= 0) goto L_0x01e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01df, code lost:
        r2 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01e0, code lost:
        r1.f57879l.addAll(r0.subList(r2, r0.size()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01ee, code lost:
        if (r5 <= 0) goto L_0x0204;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01f4, code lost:
        if (r0.size() >= r5) goto L_0x0204;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01f6, code lost:
        r1.f57879l.addAll(r0.subList(1, r0.size()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0204, code lost:
        r1.f57879l.add((java.lang.String) r0.get(r0.size() - 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0214, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.Audio.AudioPlayerMgr", "need remove and stop player count : %d", java.lang.Integer.valueOf(r1.f57879l.size()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x022a, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.Audio.AudioPlayerMgr", "not need to remove player");
        r1.f57879l.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0236, code lost:
        return r10;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo32163d(java.lang.String r18) {
        /*
            r17 = this;
            r1 = r17
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.Object r4 = r1.f57882o
            monitor-enter(r4)
            java.util.HashMap<java.lang.String, ea2.m> r5 = r1.f57869b     // Catch:{ all -> 0x0237 }
            int r5 = r5.size()     // Catch:{ all -> 0x0237 }
            r6 = 10
            r7 = 0
            r8 = 1
            if (r5 >= r6) goto L_0x0036
            java.util.LinkedList<java.lang.String> r0 = r1.f57879l     // Catch:{ all -> 0x0237 }
            r0.clear()     // Catch:{ all -> 0x0237 }
            java.lang.String r0 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r2 = "playerCount:%d is not need to remove"
            java.lang.Object[] r3 = new java.lang.Object[r8]     // Catch:{ all -> 0x0237 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0237 }
            r3[r7] = r5     // Catch:{ all -> 0x0237 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r2, r3)     // Catch:{ all -> 0x0237 }
            monitor-exit(r4)     // Catch:{ all -> 0x0237 }
            return r7
        L_0x0036:
            java.util.LinkedList<java.lang.String> r9 = r1.f57870c     // Catch:{ all -> 0x0237 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0237 }
        L_0x003c:
            boolean r10 = r9.hasNext()     // Catch:{ all -> 0x0237 }
            if (r10 == 0) goto L_0x00b4
            java.lang.Object r10 = r9.next()     // Catch:{ all -> 0x0237 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x0237 }
            java.util.HashMap<java.lang.String, nb0.b> r11 = r1.f57876i     // Catch:{ all -> 0x0237 }
            java.lang.Object r10 = r11.get(r10)     // Catch:{ all -> 0x0237 }
            nb0.b r10 = (nb0.C88912b) r10     // Catch:{ all -> 0x0237 }
            if (r10 == 0) goto L_0x003c
            java.lang.String r11 = r10.f256417b     // Catch:{ all -> 0x0237 }
            if (r11 != 0) goto L_0x0057
            goto L_0x003c
        L_0x0057:
            boolean r11 = r2.containsKey(r11)     // Catch:{ all -> 0x0237 }
            if (r11 != 0) goto L_0x0076
            java.lang.String r11 = r10.f256417b     // Catch:{ all -> 0x0237 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0237 }
            r2.put(r11, r12)     // Catch:{ all -> 0x0237 }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x0237 }
            r11.<init>()     // Catch:{ all -> 0x0237 }
            java.lang.String r12 = r10.f256416a     // Catch:{ all -> 0x0237 }
            r11.add(r12)     // Catch:{ all -> 0x0237 }
            java.lang.String r12 = r10.f256417b     // Catch:{ all -> 0x0237 }
            r3.put(r12, r11)     // Catch:{ all -> 0x0237 }
            goto L_0x00a6
        L_0x0076:
            java.lang.String r11 = r10.f256417b     // Catch:{ all -> 0x0237 }
            java.lang.Object r11 = r2.get(r11)     // Catch:{ all -> 0x0237 }
            java.lang.Integer r11 = (java.lang.Integer) r11     // Catch:{ all -> 0x0237 }
            int r11 = r11.intValue()     // Catch:{ all -> 0x0237 }
            int r11 = r11 + r8
            java.lang.String r12 = r10.f256417b     // Catch:{ all -> 0x0237 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0237 }
            r2.put(r12, r11)     // Catch:{ all -> 0x0237 }
            java.lang.String r11 = r10.f256417b     // Catch:{ all -> 0x0237 }
            java.lang.Object r11 = r3.get(r11)     // Catch:{ all -> 0x0237 }
            java.util.ArrayList r11 = (java.util.ArrayList) r11     // Catch:{ all -> 0x0237 }
            java.lang.String r12 = r10.f256416a     // Catch:{ all -> 0x0237 }
            boolean r12 = r11.contains(r12)     // Catch:{ all -> 0x0237 }
            if (r12 != 0) goto L_0x00a1
            java.lang.String r12 = r10.f256416a     // Catch:{ all -> 0x0237 }
            r11.add(r12)     // Catch:{ all -> 0x0237 }
        L_0x00a1:
            java.lang.String r12 = r10.f256417b     // Catch:{ all -> 0x0237 }
            r3.put(r12, r11)     // Catch:{ all -> 0x0237 }
        L_0x00a6:
            java.lang.String r11 = r10.f256417b     // Catch:{ all -> 0x0237 }
            boolean r11 = r0.contains(r11)     // Catch:{ all -> 0x0237 }
            if (r11 != 0) goto L_0x003c
            java.lang.String r10 = r10.f256417b     // Catch:{ all -> 0x0237 }
            r0.add(r10)     // Catch:{ all -> 0x0237 }
            goto L_0x003c
        L_0x00b4:
            monitor-exit(r4)     // Catch:{ all -> 0x0237 }
            java.lang.String r4 = ""
            int r9 = ha2.C32752h.f89147i
            if (r9 == 0) goto L_0x00bc
            goto L_0x00f1
        L_0x00bc:
            boolean r9 = ha2.C98329e.m127108d()
            r10 = 3
            if (r9 == 0) goto L_0x00d0
            java.lang.Class<ha2.c> r9 = ha2.C98327c.class
            ua2.a r9 = ua2.C101991b.m134284b(r9)
            ha2.c r9 = (ha2.C98327c) r9
            int r9 = r9.mo137653u(r10)
            goto L_0x00d8
        L_0x00d0:
            java.lang.String r9 = "MicroMsg.Music.MusicDataStorageImpl"
            java.lang.String r11 = "IMusicDataStorage service not exist"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r11)
            r9 = 3
        L_0x00d8:
            ha2.C32752h.f89147i = r9
            java.lang.Object[] r11 = new java.lang.Object[r8]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r11[r7] = r9
            java.lang.String r9 = "MicroMsg.Music.PieceCacheHelper"
            java.lang.String r12 = "sRemovePlayingAudioPlayerGroupCount:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r12, r11)
            int r9 = ha2.C32752h.f89147i
            if (r9 != 0) goto L_0x00ef
            ha2.C32752h.f89147i = r10
        L_0x00ef:
            int r9 = ha2.C32752h.f89147i
        L_0x00f1:
            java.lang.String r10 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r11 = "removePlayerGroupMinCount:%d"
            java.lang.Object[] r12 = new java.lang.Object[r8]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r9)
            r12[r7] = r13
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r11, r12)
            java.util.Iterator r0 = r0.iterator()
            r11 = r9
            r10 = 0
        L_0x0106:
            boolean r12 = r0.hasNext()
            if (r12 == 0) goto L_0x013f
            java.lang.Object r12 = r0.next()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r13 = r2.get(r12)
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            java.lang.String r14 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r15 = "count:%d, url:%s"
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.Integer r16 = java.lang.Integer.valueOf(r13)
            r6[r7] = r16
            r6[r8] = r12
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r14, r15, r6)
            if (r13 < r9) goto L_0x013c
            if (r11 >= r13) goto L_0x0134
            r4 = r12
            r11 = r13
        L_0x0134:
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            if (r6 == 0) goto L_0x013b
            r4 = r12
        L_0x013b:
            r10 = 1
        L_0x013c:
            r6 = 10
            goto L_0x0106
        L_0x013f:
            if (r10 == 0) goto L_0x0160
            java.util.HashMap<java.lang.String, nb0.b> r0 = r1.f57876i
            r2 = r18
            java.lang.Object r0 = r0.get(r2)
            nb0.b r0 = (nb0.C88912b) r0
            if (r0 == 0) goto L_0x0160
            if (r4 == 0) goto L_0x0160
            java.lang.String r0 = r0.f256417b
            boolean r0 = r4.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0160
            java.lang.String r0 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r2 = "srcUrl is same, not remove and don't play again"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            r10 = 0
        L_0x0160:
            if (r10 == 0) goto L_0x022a
            java.lang.String r0 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r2 = "need to remove player"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            java.lang.Object r0 = r3.get(r4)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 == 0) goto L_0x0236
            int r2 = r0.size()
            if (r2 <= 0) goto L_0x0236
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0180:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x019a
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            java.util.HashMap<java.lang.String, nb0.b> r4 = r1.f57876i
            java.lang.Object r3 = r4.get(r3)
            nb0.b r3 = (nb0.C88912b) r3
            if (r3 == 0) goto L_0x0180
            r2.add(r3)
            goto L_0x0180
        L_0x019a:
            ea2.h$i r0 = new ea2.h$i
            r0.<init>(r1)
            java.util.Collections.sort(r2, r0)
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x01ab:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01bd
            java.lang.Object r3 = r2.next()
            nb0.b r3 = (nb0.C88912b) r3
            java.lang.String r3 = r3.f256416a
            r0.add(r3)
            goto L_0x01ab
        L_0x01bd:
            r3 = 10
            int r5 = r5 - r3
            if (r5 <= 0) goto L_0x01ee
            int r2 = r0.size()
            if (r2 <= r5) goto L_0x01ee
            int r5 = r5 + r8
            java.lang.String r2 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r3 = "removeCount should be %d"
            java.lang.Object[] r4 = new java.lang.Object[r8]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r4[r7] = r6
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r4)
            int r2 = r0.size()
            int r2 = r2 - r5
            if (r2 >= 0) goto L_0x01e0
            r2 = 1
        L_0x01e0:
            java.util.LinkedList<java.lang.String> r3 = r1.f57879l
            int r4 = r0.size()
            java.util.List r0 = r0.subList(r2, r4)
            r3.addAll(r0)
            goto L_0x0214
        L_0x01ee:
            if (r5 <= 0) goto L_0x0204
            int r2 = r0.size()
            if (r2 >= r5) goto L_0x0204
            java.util.LinkedList<java.lang.String> r2 = r1.f57879l
            int r3 = r0.size()
            java.util.List r0 = r0.subList(r8, r3)
            r2.addAll(r0)
            goto L_0x0214
        L_0x0204:
            java.util.LinkedList<java.lang.String> r2 = r1.f57879l
            int r3 = r0.size()
            int r3 = r3 - r8
            java.lang.Object r0 = r0.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            r2.add(r0)
        L_0x0214:
            java.lang.String r0 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r2 = "need remove and stop player count : %d"
            java.lang.Object[] r3 = new java.lang.Object[r8]
            java.util.LinkedList<java.lang.String> r4 = r1.f57879l
            int r4 = r4.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r7] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r2, r3)
            goto L_0x0236
        L_0x022a:
            java.lang.String r0 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r2 = "not need to remove player"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            java.util.LinkedList<java.lang.String> r0 = r1.f57879l
            r0.clear()
        L_0x0236:
            return r10
        L_0x0237:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0237 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ea2.C20561h.mo32163d(java.lang.String):boolean");
    }

    /* renamed from: e */
    public final void mo32164e(String str) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(this.f57888u.f256413c) && !str.equalsIgnoreCase(this.f57888u.f256413c)) {
            C88911a aVar = this.f57888u;
            aVar.f256411a = true;
            aVar.f256412b = true;
            Log.m105925i("MicroMsg.Audio.AudioPlayerMgr", "reset AudioContextParam, appId:%s", str);
        }
        C88911a aVar2 = this.f57888u;
        aVar2.f256413c = str;
        this.f57850B = aVar2.f256412b;
    }

    /* renamed from: f */
    public void mo32165f() {
        boolean z;
        Log.m105925i("MicroMsg.Audio.AudioPlayerMgr", "mixWithOther:%b, focus:%b", Boolean.valueOf(this.f57888u.f256411a), Boolean.valueOf(this.f57889v.f58833b));
        boolean z2 = this.f57888u.f256411a;
        if (!z2 && !this.f57889v.f58833b) {
            Log.m105924i("MicroMsg.Audio.AudioPlayerMgr", "requestFocus()");
            C20826a aVar = this.f57889v;
            if (!aVar.f58833b) {
                AudioManager audioManager = aVar.f58832a;
                if (audioManager != null) {
                    int requestAudioFocus = audioManager.requestAudioFocus(aVar.f58834c, 3, 2);
                    Object[] objArr = new Object[1];
                    objArr[0] = Boolean.valueOf(requestAudioFocus == 1);
                    Log.m105925i("MicroMsg.Music.MusicAudioFocusHelper", "request audio focus %b", objArr);
                    if (requestAudioFocus == 1) {
                        aVar.f58833b = true;
                    }
                    if (requestAudioFocus == 1) {
                        z = true;
                        Log.m105925i("MicroMsg.Audio.AudioPlayerMgr", "requestFocus focus:%b", Boolean.valueOf(z));
                    }
                }
                z = false;
                Log.m105925i("MicroMsg.Audio.AudioPlayerMgr", "requestFocus focus:%b", Boolean.valueOf(z));
            }
        } else if (z2 && this.f57889v.f58833b) {
            Log.m105924i("MicroMsg.Audio.AudioPlayerMgr", "abandonFocus()");
            mo32162a();
        }
    }

    /* renamed from: g */
    public final void mo32166g(C88912b bVar) {
        if (bVar != null && !TextUtils.isEmpty(bVar.f256417b) && bVar.f256417b.startsWith("http")) {
            if (!(!TextUtils.isEmpty(bVar.f256418c) && this.f57849A.mo33567e(bVar.f256418c))) {
                if (this.f57857I == null) {
                    this.f57857I = new Handler(Looper.myLooper());
                }
                C32752h.m39807f(bVar.f256417b);
                boolean a = C98331j.m127116a(bVar.f256417b);
                Log.m105925i("MicroMsg.Audio.AudioPlayerMgr", "checkNeedDownloadSrc audioId:%s, cacheValid:%b, checkCount:%d", bVar.f256416a, Boolean.valueOf(a), Integer.valueOf(this.f57867S));
                this.f57867S++;
                if (!a) {
                    C21239b bVar2 = this.f57856H;
                    bVar2.getClass();
                    int i = C11412b.f33577a;
                    Log.m105925i("MicroMsg.Audio.AudioDownloadMgr", "startDownload", (Object[]) null);
                    if (TextUtils.isEmpty(bVar.f256417b)) {
                        Log.m105921e("MicroMsg.Audio.AudioDownloadMgr", "srcUrl is null", (Object[]) null);
                    } else if (bVar2.f60042c.contains(bVar.f256417b)) {
                        Log.m105921e("MicroMsg.Audio.AudioDownloadMgr", "srcUrl:%s is download finish", bVar.f256417b);
                    } else if (bVar2.f60040a.containsKey(bVar.f256417b)) {
                        Log.m105921e("MicroMsg.Audio.AudioDownloadMgr", "task is exit!", (Object[]) null);
                    } else {
                        Log.m105925i("MicroMsg.Audio.AudioDownloadMgr", "download src:%s, audioId:%s", bVar.f256417b, bVar.f256416a);
                        C21241d dVar = new C21241d(new C21240c(new C21238a(bVar2)), bVar.f256416a, 5);
                        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                        String str = bVar.f256438w;
                        if (str != null) {
                            concurrentHashMap.put(bVar.f256417b, str);
                        }
                        dVar.f60051i = new C20559d(new C102583a(concurrentHashMap), bVar);
                        dVar.f59645f = System.currentTimeMillis();
                        if (C21242e.f60052f == null) {
                            synchronized (C21242e.class) {
                                if (C21242e.f60052f == null) {
                                    C21242e.f60052f = new C21242e();
                                }
                            }
                        }
                        C21242e eVar = C21242e.f60052f;
                        synchronized (eVar.f60053a) {
                            dVar.f60050h = false;
                            eVar.f60056d.add(dVar);
                            int i2 = eVar.f60057e;
                            if (eVar.f60056d.size() > i2) {
                                eVar.mo33232a(i2 + 2);
                            }
                        }
                        eVar.f60054b.execute(dVar);
                        synchronized (bVar2.f60043d) {
                            bVar2.f60040a.put(bVar.f256417b, dVar);
                            bVar2.f60041b.add(bVar.f256417b);
                        }
                    }
                } else {
                    mo32160S(bVar.f256416a);
                    mo32161T(bVar);
                    mo32142A(bVar.f256416a);
                }
            }
        }
    }

    /* renamed from: h */
    public String mo32167h(String str, String str2) {
        boolean z;
        Log.m105924i("MicroMsg.Audio.AudioPlayerMgr", "createAudioPlayer");
        LinkedList linkedList = this.f57875h.get(str);
        synchronized (this.f57882o) {
            if (linkedList != null) {
                try {
                    if (linkedList.contains(str2) && (this.f57870c.contains(str2) || this.f57872e.contains(str2))) {
                        z = true;
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            z = false;
        }
        int p = mo32175p(str);
        if (TextUtils.isEmpty(str2)) {
            Log.m105920e("MicroMsg.Audio.AudioPlayerMgr", "createAudioPlayer fail, the audioId is empty!");
            mo32182x(604, str2);
            return null;
        } else if (p >= 10) {
            Log.m105921e("MicroMsg.Audio.AudioPlayerMgr", "now created QQAudioPlayer count %d arrive MAX_AUDIO_PLAYER_COUNT, save id and not send error event, not create player!", Integer.valueOf(p));
            mo32154M(str, str2);
            return null;
        } else if (z) {
            Log.m105920e("MicroMsg.Audio.AudioPlayerMgr", "now created QQAudioPlayer fail, the audioId exist in mAudioIds");
            mo32182x(603, str2);
            return null;
        } else {
            mo32154M(str, str2);
            mo32145D(str2);
            Log.m105925i("MicroMsg.Audio.AudioPlayerMgr", "create player success, appId:%s, audioId:%s", str, str2);
            return str2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00a4, code lost:
        return new ea2.C20575m();
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final ea2.C20575m mo32168i() {
        /*
            r16 = this;
            r1 = r16
            java.lang.String r0 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r2 = "createOrReusePlayer"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            java.lang.Object r2 = r1.f57882o
            monitor-enter(r2)
            java.util.HashMap<java.lang.String, ea2.m> r0 = r1.f57871d     // Catch:{ all -> 0x0054 }
            int r0 = r0.size()     // Catch:{ all -> 0x0054 }
            if (r0 != 0) goto L_0x001b
            ea2.m r0 = new ea2.m     // Catch:{ all -> 0x0054 }
            r0.<init>()     // Catch:{ all -> 0x0054 }
            monitor-exit(r2)     // Catch:{ all -> 0x0054 }
            return r0
        L_0x001b:
            r0 = 0
            java.lang.String r3 = ""
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0054 }
            java.util.LinkedList<java.lang.String> r6 = r1.f57872e     // Catch:{ all -> 0x0054 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0054 }
            r7 = 0
            r9 = r7
        L_0x002b:
            boolean r11 = r6.hasNext()     // Catch:{ all -> 0x0054 }
            if (r11 == 0) goto L_0x0089
            java.lang.Object r11 = r6.next()     // Catch:{ all -> 0x0054 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0054 }
            java.util.HashMap<java.lang.String, ea2.m> r12 = r1.f57871d     // Catch:{ all -> 0x0054 }
            java.lang.Object r12 = r12.get(r11)     // Catch:{ all -> 0x0054 }
            ea2.m r12 = (ea2.C20575m) r12     // Catch:{ all -> 0x0054 }
            if (r12 != 0) goto L_0x0042
            goto L_0x002b
        L_0x0042:
            boolean r13 = r12.f57921o     // Catch:{ all -> 0x0054 }
            if (r13 != 0) goto L_0x007a
            com.tencent.qqmusic.mediaplayer.CommonPlayer r13 = r12.f57917h     // Catch:{ all -> 0x0054 }
            r15 = 0
            if (r13 == 0) goto L_0x0056
            int r13 = r13.getPlayerState()     // Catch:{ all -> 0x0054 }
            r14 = 7
            if (r13 != r14) goto L_0x0056
            r13 = 1
            goto L_0x0057
        L_0x0054:
            r0 = move-exception
            goto L_0x00a5
        L_0x0056:
            r13 = 0
        L_0x0057:
            if (r13 != 0) goto L_0x007a
            com.tencent.qqmusic.mediaplayer.CommonPlayer r13 = r12.f57917h     // Catch:{ all -> 0x0054 }
            if (r13 == 0) goto L_0x0066
            int r13 = r13.getPlayerState()     // Catch:{ all -> 0x0054 }
            r14 = 6
            if (r13 != r14) goto L_0x0066
            r13 = 1
            goto L_0x0067
        L_0x0066:
            r13 = 0
        L_0x0067:
            if (r13 != 0) goto L_0x007a
            com.tencent.qqmusic.mediaplayer.CommonPlayer r13 = r12.f57917h     // Catch:{ all -> 0x0054 }
            if (r13 == 0) goto L_0x0077
            int r13 = r13.getPlayerState()     // Catch:{ all -> 0x0054 }
            r14 = 9
            if (r13 != r14) goto L_0x0077
            r14 = 1
            goto L_0x0078
        L_0x0077:
            r14 = 0
        L_0x0078:
            if (r14 == 0) goto L_0x002b
        L_0x007a:
            int r13 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r13 == 0) goto L_0x0084
            long r13 = r12.f57909B     // Catch:{ all -> 0x0054 }
            int r15 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r15 >= 0) goto L_0x002b
        L_0x0084:
            long r9 = r12.f57909B     // Catch:{ all -> 0x0054 }
            r3 = r11
            r0 = r12
            goto L_0x002b
        L_0x0089:
            if (r0 == 0) goto L_0x009e
            long r4 = r4 - r9
            r6 = 500(0x1f4, double:2.47E-321)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x009e
            java.lang.String r4 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r5 = "player is be reuse to play again with other audio"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)     // Catch:{ all -> 0x0054 }
            r1.mo32159R(r3, r0)     // Catch:{ all -> 0x0054 }
            monitor-exit(r2)     // Catch:{ all -> 0x0054 }
            return r0
        L_0x009e:
            monitor-exit(r2)     // Catch:{ all -> 0x0054 }
            ea2.m r0 = new ea2.m
            r0.<init>()
            return r0
        L_0x00a5:
            monitor-exit(r2)     // Catch:{ all -> 0x0054 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ea2.C20561h.mo32168i():ea2.m");
    }

    /* renamed from: j */
    public final boolean mo32169j(String str) {
        C20575m o = mo32174o(str);
        if (o == null) {
            return false;
        }
        Log.m105925i("MicroMsg.Audio.AudioPlayerMgr", "destroyAndRemovePlayer, audioId:%s", str);
        mo32170k(str, o);
        synchronized (this.f57882o) {
            this.f57869b.remove(str);
            this.f57870c.remove(str);
            this.f57871d.remove(str);
            this.f57872e.remove(str);
        }
        return true;
    }

    /* renamed from: k */
    public final void mo32170k(String str, C20575m mVar) {
        if (mVar == null) {
            Log.m105921e("MicroMsg.Audio.AudioPlayerMgr", "destroyPlayer player is null for audioId:%s", str);
            return;
        }
        if (mVar.mo32206f() || mVar.mo32211k() || mVar.mo32221x() || mVar.mo32220w() || mVar.mo32219v()) {
            mVar.mo32210j();
        }
        Log.m105924i("MicroMsg.Audio.QQAudioPlayer", "release");
        mVar.f57907e = null;
        mVar.f57911D = null;
        CommonPlayer commonPlayer = mVar.f57917h;
        if (commonPlayer != null) {
            commonPlayer.release();
            mVar.f57917h = null;
        }
        C20561h s = m22332s();
        synchronized (s.f57891x) {
            if (s.f57891x.contains(mVar)) {
                s.f57891x.remove(mVar);
            }
        }
        Log.m105925i("MicroMsg.Audio.AudioPlayerMgr", "destroyPlayer stop and release player by audioId:%s", str);
    }

    /* renamed from: l */
    public void mo32171l() {
        if (this.f57888u.f256411a && !this.f57851C) {
            Log.m105924i("MicroMsg.Audio.AudioPlayerMgr", "mixWithOther is true, useSpeakerOn is false, return");
            mo32152K();
        } else if (this.f57888u.f256411a) {
            Log.m105924i("MicroMsg.Audio.AudioPlayerMgr", "mixWithOther is true, return");
        } else if (this.f57850B && this.f57852D.getMode() != 0) {
            Log.m105924i("MicroMsg.Audio.AudioPlayerMgr", "speaker is on and reset speaker");
            mo32152K();
        } else if (this.f57850B) {
            Log.m105924i("MicroMsg.Audio.AudioPlayerMgr", "speaker is on, do nothing");
        } else if (PhoneStatusWatcher.isCalling()) {
            Log.m105924i("MicroMsg.Audio.AudioPlayerMgr", "shiftSpeaker return when phone calling");
        } else if (this.f57852D.isBluetoothScoOn() || this.f57852D.isBluetoothA2dpOn()) {
            Log.m105925i("MicroMsg.Audio.AudioPlayerMgr", "shiftSpeaker return when isBluetoothScoOn:%b , isBluetoothA2dpOn:%b", Boolean.valueOf(this.f57852D.isBluetoothScoOn()), Boolean.valueOf(this.f57852D.isBluetoothA2dpOn()));
        } else if (this.f57852D.isWiredHeadsetOn()) {
            Log.m105924i("MicroMsg.Audio.AudioPlayerMgr", "shiftSpeaker return when wired headset on");
        } else if (this.f57851C || this.f57852D.getMode() != 3 || this.f57852D.isSpeakerphoneOn()) {
            this.f57851C = false;
            this.f57852D.setSpeakerphoneOn(false);
            this.f57852D.setMode(3);
            Log.m105924i("MicroMsg.Audio.AudioPlayerMgr", "set speaker off and change mode to MODE_IN_COMMUNICATION");
        } else {
            Log.m105924i("MicroMsg.Audio.AudioPlayerMgr", "shiftSpeaker return when wired headset on");
        }
    }

    /* renamed from: m */
    public final String mo32172m(String str) {
        Iterator<String> it = this.f57873f.iterator();
        while (it.hasNext()) {
            String next = it.next();
            LinkedList linkedList = this.f57875h.get(next);
            if (linkedList != null && linkedList.contains(str)) {
                return next;
            }
        }
        return "";
    }

    /* renamed from: n */
    public C88912b mo32173n(String str) {
        if (this.f57876i.containsKey(str)) {
            return this.f57876i.get(str);
        }
        return null;
    }

    /* renamed from: o */
    public final C20575m mo32174o(String str) {
        if (this.f57869b.containsKey(str)) {
            return this.f57869b.get(str);
        }
        if (this.f57871d.containsKey(str)) {
            return this.f57871d.get(str);
        }
        return null;
    }

    /* renamed from: p */
    public int mo32175p(String str) {
        int size;
        int r = mo32177r();
        synchronized (this.f57882o) {
            int size2 = this.f57868a.size();
            size = this.f57869b.size();
            int size3 = this.f57871d.size();
            LinkedList linkedList = this.f57875h.get(str);
            Log.m105925i("MicroMsg.Audio.AudioPlayerMgr", "getAudioPlayerCount, count:%d, player_count:%d, recycled_player_count:%d, audioIdsCount:%d, pause_count:%d", Integer.valueOf(size2), Integer.valueOf(size), Integer.valueOf(size3), Integer.valueOf(linkedList == null ? 0 : linkedList.size()), Integer.valueOf(r));
        }
        return size;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b7 A[RETURN] */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public nb0.C88914d mo32176q(java.lang.String r13) {
        /*
            r12 = this;
            ea2.m r0 = r12.mo32174o(r13)
            if (r0 == 0) goto L_0x000b
            nb0.d r13 = r0.mo32216s()
            return r13
        L_0x000b:
            lh.c r0 = r12.f57849A
            boolean r0 = r0.mo33568f(r13)
            if (r0 == 0) goto L_0x00b8
            lh.c r0 = r12.f57849A
            lh.d r0 = r0.f60632a
            java.util.HashMap<java.lang.String, nb0.d> r1 = r0.f60655q
            boolean r1 = r1.containsKey(r13)
            if (r1 == 0) goto L_0x0028
            java.util.HashMap<java.lang.String, nb0.d> r1 = r0.f60655q
            java.lang.Object r1 = r1.get(r13)
            nb0.d r1 = (nb0.C88914d) r1
            goto L_0x0032
        L_0x0028:
            nb0.d r1 = new nb0.d
            r1.<init>()
            java.util.HashMap<java.lang.String, nb0.d> r2 = r0.f60655q
            r2.put(r13, r1)
        L_0x0032:
            int r2 = r0.mo33583d(r13)
            int r3 = r0.mo33584e(r13)
            boolean r4 = r0.mo33588i(r13)
            java.util.HashMap<java.lang.String, nb0.b> r5 = r0.f60651m
            boolean r5 = r5.containsKey(r13)
            r6 = 100
            r7 = 0
            if (r5 == 0) goto L_0x006d
            java.util.HashMap<java.lang.String, nb0.b> r5 = r0.f60651m
            java.lang.Object r5 = r5.get(r13)
            nb0.b r5 = (nb0.C88912b) r5
            java.lang.String r5 = r5.f256418c
            boolean r8 = android.text.TextUtils.isEmpty(r5)
            if (r8 == 0) goto L_0x005a
            goto L_0x006d
        L_0x005a:
            fh.j r8 = p339fh.C116869j.m164845a()
            eh.d r5 = r8.mo180853b(r5)
            long r8 = r5.f350075d
            r10 = 0
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r5 <= 0) goto L_0x006d
            r5 = 100
            goto L_0x006e
        L_0x006d:
            r5 = 0
        L_0x006e:
            if (r5 >= 0) goto L_0x0071
            r5 = 0
        L_0x0071:
            r1.f256443b = r3
            r1.f256442a = r2
            r3 = 1
            r4 = r4 ^ r3
            r1.f256444c = r4
            java.util.HashMap<java.lang.String, java.lang.Boolean> r4 = r0.f60652n
            boolean r4 = r4.containsKey(r13)
            if (r4 == 0) goto L_0x0090
            java.util.HashMap<java.lang.String, java.lang.Boolean> r4 = r0.f60652n
            java.lang.Object r4 = r4.get(r13)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0090
            r7 = 1
        L_0x0090:
            r1.f256445d = r7
            int r5 = r5 * r2
            int r5 = r5 / r6
            r1.f256446e = r5
            java.util.HashMap<java.lang.String, nb0.b> r2 = r0.f60651m
            boolean r2 = r2.containsKey(r13)
            if (r2 == 0) goto L_0x00b4
            java.util.HashMap<java.lang.String, nb0.b> r0 = r0.f60651m
            java.lang.Object r0 = r0.get(r13)
            nb0.b r0 = (nb0.C88912b) r0
            int r2 = r0.f256420e
            r1.f256448g = r2
            java.lang.String r2 = r0.f256417b
            r1.f256447f = r2
            java.lang.String r0 = r0.f256437v
            r1.f256449h = r0
            goto L_0x00b5
        L_0x00b4:
            r1 = 0
        L_0x00b5:
            if (r1 == 0) goto L_0x00b8
            return r1
        L_0x00b8:
            java.util.HashMap<java.lang.String, nb0.d> r0 = r12.f57877j
            java.lang.Object r13 = r0.get(r13)
            nb0.d r13 = (nb0.C88914d) r13
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ea2.C20561h.mo32176q(java.lang.String):nb0.d");
    }

    /* renamed from: r */
    public final int mo32177r() {
        int i;
        boolean z;
        synchronized (this.f57882o) {
            Iterator<String> it = this.f57872e.iterator();
            i = 0;
            while (it.hasNext()) {
                String next = it.next();
                C20575m o = mo32174o(next);
                if (o == null) {
                    Log.m105920e("MicroMsg.Audio.AudioPlayerMgr", "isPausedPlayer, player is null");
                    C88914d q = mo32176q(next);
                    z = q != null ? q.f256444c : false;
                } else {
                    z = o.mo32219v();
                }
                if (z) {
                    i++;
                }
            }
        }
        return i;
    }

    /* renamed from: t */
    public final boolean mo32178t() {
        System.currentTimeMillis();
        C88911a aVar = this.f57888u;
        return aVar.f256412b || aVar.f256411a;
    }

    /* renamed from: u */
    public final boolean mo32179u(C88912b bVar) {
        return (bVar == null || !bVar.f256417b.startsWith("wxblob://") || bVar.f256415B == null) ? false : true;
    }

    /* renamed from: v */
    public final void mo32180v(String str, C20575m mVar) {
        Log.m105925i("MicroMsg.Audio.AudioPlayerMgr", "markPlayer, mark player by audioId:%s", str);
        synchronized (this.f57882o) {
            if (this.f57872e.contains(str)) {
                this.f57871d.remove(str);
                this.f57872e.remove(str);
            }
            if (!this.f57870c.contains(str)) {
                this.f57870c.add(str);
                this.f57869b.put(str, mVar);
            }
        }
    }

    /* renamed from: w */
    public final void mo32181w(String str, C20575m mVar) {
        Log.m105925i("MicroMsg.Audio.AudioPlayerMgr", "markPlayerRecycled, mark player recycled by audioId:%s", str);
        synchronized (this.f57882o) {
            if (this.f57870c.contains(str)) {
                this.f57869b.remove(str);
                this.f57870c.remove(str);
            }
            if (!this.f57872e.contains(str)) {
                this.f57872e.add(str);
                this.f57871d.put(str, mVar);
            }
        }
    }

    /* renamed from: x */
    public void mo32182x(int i, String str) {
        Log.m105921e("MicroMsg.Audio.AudioPlayerMgr", "onErrorEvent with errCode:%d, audioId:%s", Integer.valueOf(i), str);
        if (TextUtils.isEmpty(str)) {
            Log.m105920e("MicroMsg.Audio.AudioPlayerMgr", "audioId is empty");
            str = C31443g.m39405a();
        }
        AudioPlayerEvent audioPlayerEvent = new AudioPlayerEvent();
        AudioPlayerEvent.C17674a aVar = audioPlayerEvent.f48073d;
        aVar.f48074a = 4;
        aVar.f48077d = "error";
        aVar.f48079f = C94225h.m119168b(i);
        audioPlayerEvent.f48073d.f48080g = C94225h.m119167a(i);
        AudioPlayerEvent.C17674a aVar2 = audioPlayerEvent.f48073d;
        aVar2.f48076c = str;
        aVar2.f48078e = mo32172m(str);
        audioPlayerEvent.asyncPublish(Looper.getMainLooper());
    }

    /* renamed from: y */
    public void mo32183y(String str) {
        long size;
        String str2 = str;
        Log.m105925i("MicroMsg.Audio.AudioPlayerMgr", "pauseAllAudioPlayers, appId:%s", str2);
        this.f57849A.mo33574l();
        ((C119157j) C119157j.f356862d).mo183875f(new C20562a());
        mo32162a();
        LinkedList linkedList = this.f57875h.get(str2);
        C21427c cVar = this.f57849A;
        long j = cVar.f60632a.f60647i.f60314u;
        long c = cVar.mo33565c();
        this.f57849A.getClass();
        C116868i a = C116868i.m164843a();
        synchronized (a) {
            size = (long) (a.f350291a.size() * 3536);
        }
        long j2 = c + size;
        Log.m105925i("MicroMsg.Audio.AudioPlayerMgr", "mixAverageTime:%d, loadedCacheBufferSize:%d, remainingBufferSize:%d", Long.valueOf(j), Long.valueOf(c), Long.valueOf(size));
        this.f57887t = (C20705c) C101991b.m134284b(C20705c.class);
        if (linkedList == null || linkedList.size() == 0) {
            Log.m105920e("MicroMsg.Audio.AudioPlayerMgr", "there is no audioIds and players for this appId to pause");
        } else if (!this.f57869b.isEmpty() || !this.f57871d.isEmpty()) {
            LinkedList linkedList2 = new LinkedList();
            synchronized (this.f57882o) {
                linkedList2.addAll(linkedList);
            }
            Iterator it = linkedList2.iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                C20575m mVar = this.f57871d.get(str3);
                if (mVar != null) {
                    mo32184z(str3, mVar);
                }
            }
            Log.m105925i("MicroMsg.Audio.AudioPlayerMgr", "playing player count:%d", Integer.valueOf(this.f57869b.size()));
            Iterator it4 = linkedList2.iterator();
            while (it4.hasNext()) {
                String str4 = (String) it4.next();
                C20575m mVar2 = this.f57869b.get(str4);
                if (mVar2 != null) {
                    mo32184z(str4, mVar2);
                    mo32181w(str4, mVar2);
                }
            }
            C20705c cVar2 = this.f57887t;
            if (cVar2 != null) {
                cVar2.mo32423z0(str, j, j2, c);
            }
        } else {
            Log.m105920e("MicroMsg.Audio.AudioPlayerMgr", "there is no audioIds and players for this appId to pause");
            C20705c cVar3 = this.f57887t;
            if (cVar3 != null) {
                cVar3.mo32423z0(str, j, j2, c);
            }
        }
    }

    /* renamed from: z */
    public final void mo32184z(String str, C20575m mVar) {
        Log.m105925i("MicroMsg.Audio.AudioPlayerMgr", "pausePlayerOnBackground, pause player on background by audioId:%s", str);
        C88912b bVar = this.f57876i.get(str);
        if (bVar != null && mVar.mo32206f() && mVar.mo32211k()) {
            bVar.f256422g = true;
            bVar.f256419d = mVar.getPlayPosition();
        } else if (bVar != null && mVar.mo32211k()) {
            bVar.f256422g = true;
            bVar.f256419d = mVar.getPlayPosition();
        } else if (bVar != null) {
            bVar.f256422g = true;
            bVar.f256419d = 0;
        }
        mo32155N(str, mVar);
        C88914d q = mo32176q(str);
        if (q != null && mVar.mo32206f()) {
            q.f256444c = true;
        }
        if (mVar.mo32206f() || mVar.mo32211k() || mVar.mo32221x() || mVar.mo32220w() || mVar.mo32219v()) {
            Log.m105924i("MicroMsg.Audio.QQAudioPlayer", "pauseOnBackGround");
            mVar.f57921o = true;
            mVar.mo32213q();
            return;
        }
        Log.m105924i("MicroMsg.Audio.QQAudioPlayer", "setPauseOnBackground");
        mVar.f57921o = true;
        mVar.f57920n = true;
    }
}
