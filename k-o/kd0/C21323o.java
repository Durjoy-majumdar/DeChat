package kd0;

import android.content.Context;
import android.media.AudioTrack;
import android.media.MediaPlayer;
import com.tencent.p014mm.modelvoice.MediaRecorder;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tav.core.AssetExtension;
import di3.C86312j;
import h81.C32735h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import lu3.C88654b;
import p1149rh.C110561a;
import p1155sh.C110787a;
import p206nj.C100115c;
import p371ph.C21967a;
import p375qh.C101193k;
import p375qh.C22086d;
import p827uh.C90662b;
import pu0.C110248b;
import sf0.C90188n0;
import zt3.C119157j;

/* renamed from: kd0.o */
public class C21323o implements C22086d {

    /* renamed from: F */
    public static Object f60231F = new Object();

    /* renamed from: G */
    public static int f60232G = -1;

    /* renamed from: H */
    public static int f60233H;

    /* renamed from: A */
    public volatile Runnable f60234A;

    /* renamed from: B */
    public MediaPlayer.OnCompletionListener f60235B;

    /* renamed from: C */
    public MediaPlayer.OnErrorListener f60236C;

    /* renamed from: D */
    public Future<?> f60237D;

    /* renamed from: E */
    public volatile int f60238E;

    /* renamed from: a */
    public AudioTrack f60239a;

    /* renamed from: b */
    public C21326c f60240b;

    /* renamed from: c */
    public C100115c f60241c;

    /* renamed from: d */
    public C22086d.C22087a f60242d;

    /* renamed from: e */
    public C22086d.C22088b f60243e;

    /* renamed from: f */
    public int f60244f;

    /* renamed from: g */
    public int f60245g;

    /* renamed from: h */
    public String f60246h;

    /* renamed from: i */
    public volatile int f60247i;

    /* renamed from: j */
    public int f60248j;

    /* renamed from: k */
    public volatile boolean f60249k;

    /* renamed from: l */
    public int f60250l;

    /* renamed from: m */
    public int f60251m;

    /* renamed from: n */
    public C90662b f60252n;

    /* renamed from: o */
    public C110787a f60253o;

    /* renamed from: p */
    public int f60254p;

    /* renamed from: q */
    public boolean f60255q;

    /* renamed from: r */
    public C21322l f60256r;

    /* renamed from: s */
    public C22086d.C22089c f60257s;

    /* renamed from: t */
    public final Object f60258t;

    /* renamed from: u */
    public volatile long f60259u;

    /* renamed from: v */
    public volatile boolean f60260v;

    /* renamed from: w */
    public boolean f60261w;

    /* renamed from: x */
    public List<ByteBuffer> f60262x;

    /* renamed from: y */
    public boolean f60263y;

    /* renamed from: z */
    public volatile boolean f60264z;

    /* renamed from: kd0.o$a */
    public class C21324a implements MediaPlayer.OnCompletionListener {
        public C21324a() {
        }

        public void onCompletion(MediaPlayer mediaPlayer) {
            C21323o oVar = C21323o.this;
            if (oVar.f60241c != null && oVar.f60255q) {
                Log.m105924i("MicroMsg.SilkPlayer", "silkPlayer play onCompletion abandonFocus");
                C21323o.this.f60241c.mo139414a();
            }
            try {
                C21323o.this.f60247i = 0;
                C21323o.this.mo33350u();
            } catch (Exception e) {
                Log.m105921e("MicroMsg.SilkPlayer", "exception:%s", Util.stackTraceToString(e));
                Log.m105920e("MicroMsg.SilkPlayer", "setCompletion File[" + C21323o.this.f60246h + "] ErrMsg[" + e.getStackTrace() + "]");
            }
        }
    }

    /* renamed from: kd0.o$b */
    public class C21325b implements MediaPlayer.OnErrorListener {
        public C21325b() {
        }

        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            Log.m105924i("MicroMsg.SilkPlayer", "onError");
            C21323o oVar = C21323o.this;
            C100115c cVar = oVar.f60241c;
            if (cVar != null && oVar.f60255q) {
                cVar.mo139414a();
            }
            C22086d.C22088b bVar = C21323o.this.f60243e;
            if (bVar != null) {
                bVar.mo35072a();
            }
            try {
                C21323o.this.f60247i = -1;
                C21323o.this.mo33350u();
                return false;
            } catch (Exception e) {
                Log.m105920e("MicroMsg.SilkPlayer", "setErrorListener File[" + C21323o.this.f60246h + "] ErrMsg[" + e.getStackTrace() + "]");
                return false;
            }
        }
    }

    /* renamed from: kd0.o$c */
    public class C21326c extends C88654b {
        public C21326c(C21324a aVar) {
        }

        public String getKey() {
            return "SilkPlayer_play_" + C21323o.this.f60250l;
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
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:368)
            	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:172)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
            */
        public void run() {
            /*
                r21 = this;
                r1 = r21
                r2 = 0
                r3 = 1
                r4 = 2
                r0 = -16
                r5 = 3
                android.os.Process.setThreadPriority(r0)     // Catch:{ Exception -> 0x030a }
                kd0.o r0 = kd0.C21323o.this     // Catch:{ Exception -> 0x030a }
                int r0 = r0.f60245g     // Catch:{ Exception -> 0x030a }
                int r0 = android.media.AudioTrack.getMinBufferSize(r0, r4, r4)     // Catch:{ Exception -> 0x030a }
                int r6 = r0 * 2
                byte[] r7 = new byte[r6]     // Catch:{ Exception -> 0x030a }
                kd0.o r0 = kd0.C21323o.this     // Catch:{ Exception -> 0x030a }
                int r0 = r0.f60245g     // Catch:{ Exception -> 0x030a }
                int r0 = r0 * 20
                int r0 = r0 / 1000
                short r8 = (short) r0     // Catch:{ Exception -> 0x030a }
                java.lang.String r0 = "MicroMsg.SilkPlayer"
                java.lang.String r9 = "frameLen: %d, playBufferSize: %d"
                java.lang.Object[] r10 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x030a }
                java.lang.Short r11 = java.lang.Short.valueOf(r8)     // Catch:{ Exception -> 0x030a }
                r10[r2] = r11     // Catch:{ Exception -> 0x030a }
                java.lang.Integer r11 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x030a }
                r10[r3] = r11     // Catch:{ Exception -> 0x030a }
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r9, r10)     // Catch:{ Exception -> 0x030a }
                java.lang.String r0 = "MicroMsg.SilkPlayer"
                java.lang.String r9 = "Thread start"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r9)     // Catch:{ Exception -> 0x030a }
            L_0x003c:
                kd0.o r0 = kd0.C21323o.this     // Catch:{ Exception -> 0x030a }
                int r0 = r0.f60247i     // Catch:{ Exception -> 0x030a }
                if (r0 == r3) goto L_0x0048
                kd0.o r0 = kd0.C21323o.this     // Catch:{ Exception -> 0x030a }
                int r0 = r0.f60247i     // Catch:{ Exception -> 0x030a }
                if (r0 != r4) goto L_0x0336
            L_0x0048:
                java.lang.Object r9 = kd0.C21323o.f60231F     // Catch:{ Exception -> 0x030a }
                monitor-enter(r9)     // Catch:{ Exception -> 0x030a }
                int r0 = kd0.C21323o.f60233H     // Catch:{ all -> 0x0307 }
                kd0.o r10 = kd0.C21323o.this     // Catch:{ all -> 0x0307 }
                int r10 = r10.f60250l     // Catch:{ all -> 0x0307 }
                if (r0 == r10) goto L_0x0087
                java.lang.String r0 = "MicroMsg.SilkPlayer"
                java.lang.String r11 = "[%d] diff id, useDeocder: %d"
                java.lang.Object[] r12 = new java.lang.Object[r4]     // Catch:{ all -> 0x0307 }
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0307 }
                r12[r2] = r10     // Catch:{ all -> 0x0307 }
                int r10 = kd0.C21323o.f60233H     // Catch:{ all -> 0x0307 }
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0307 }
                r12[r3] = r10     // Catch:{ all -> 0x0307 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r11, r12)     // Catch:{ all -> 0x0307 }
                kd0.o r0 = kd0.C21323o.this     // Catch:{ all -> 0x0307 }
                int r10 = r0.f60248j     // Catch:{ all -> 0x0307 }
                int r10 = r10 + r3
                r0.f60248j = r10     // Catch:{ all -> 0x0307 }
                if (r10 <= r5) goto L_0x0080
                com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x0307 }
                r12 = 161(0xa1, double:7.95E-322)
                r14 = 17
                r16 = 1
                r18 = 0
                r11.idkeyStat(r12, r14, r16, r18)     // Catch:{ all -> 0x0307 }
            L_0x0080:
                kd0.o r0 = kd0.C21323o.this     // Catch:{ all -> 0x0307 }
                java.lang.String r10 = r0.f60246h     // Catch:{ all -> 0x0307 }
                r0.mo33345p(r10)     // Catch:{ all -> 0x0307 }
            L_0x0087:
                monitor-exit(r9)     // Catch:{ all -> 0x0307 }
            L_0x0088:
                kd0.o r0 = kd0.C21323o.this     // Catch:{ Exception -> 0x030a }
                boolean r0 = r0.f60249k     // Catch:{ Exception -> 0x030a }
                r9 = 20
                if (r0 == 0) goto L_0x009c
                java.lang.String r0 = "MicroMsg.SilkPlayer"
                java.lang.String r11 = "waitting for switching complete"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r11)     // Catch:{ Exception -> 0x030a }
                java.lang.Thread.sleep(r9)     // Catch:{ Exception -> 0x030a }
                goto L_0x0088
            L_0x009c:
                kd0.o r0 = kd0.C21323o.this     // Catch:{ Exception -> 0x030a }
                kd0.l r11 = r0.f60256r     // Catch:{ Exception -> 0x030a }
                if (r11 == 0) goto L_0x02e3
                sh.a r0 = r0.f60253o     // Catch:{ Exception -> 0x030a }
                if (r0 == 0) goto L_0x00a9
                r0.mo162342a(r8, r7)     // Catch:{ Exception -> 0x030a }
            L_0x00a9:
                r0 = 0
            L_0x00aa:
                kd0.o r11 = kd0.C21323o.this     // Catch:{ Exception -> 0x030a }
                long r11 = r11.f60259u     // Catch:{ Exception -> 0x030a }
                kd0.o r13 = kd0.C21323o.this     // Catch:{ Exception -> 0x030a }
                int r14 = r13.f60251m     // Catch:{ Exception -> 0x030a }
                long r14 = (long) r14     // Catch:{ Exception -> 0x030a }
                int r16 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
                if (r16 < 0) goto L_0x00e7
                if (r0 < 0) goto L_0x00e7
                boolean r11 = r13.f60261w     // Catch:{ Exception -> 0x030a }
                if (r11 != 0) goto L_0x00e7
                kd0.l r0 = r13.f60256r     // Catch:{ Exception -> 0x030a }
                long r11 = r0.f60230a     // Catch:{ Exception -> 0x030a }
                int r0 = com.tencent.p014mm.modelvoice.MediaRecorder.SilkDoDec(r7, r8, r11)     // Catch:{ Exception -> 0x030a }
                if (r0 <= 0) goto L_0x00e0
                java.nio.ByteBuffer r11 = java.nio.ByteBuffer.allocate(r6)     // Catch:{ Exception -> 0x030a }
                r11.put(r7)     // Catch:{ Exception -> 0x030a }
                r11.position(r2)     // Catch:{ Exception -> 0x030a }
                kd0.o r12 = kd0.C21323o.this     // Catch:{ Exception -> 0x030a }
                kd0.C21323o.m23911k(r12)     // Catch:{ Exception -> 0x030a }
                kd0.o r12 = kd0.C21323o.this     // Catch:{ Exception -> 0x030a }
                java.util.List<java.nio.ByteBuffer> r12 = r12.f60262x     // Catch:{ Exception -> 0x030a }
                java.util.ArrayList r12 = (java.util.ArrayList) r12     // Catch:{ Exception -> 0x030a }
                r12.add(r11)     // Catch:{ Exception -> 0x030a }
                goto L_0x00aa
            L_0x00e0:
                if (r0 != 0) goto L_0x00aa
                kd0.o r11 = kd0.C21323o.this     // Catch:{ Exception -> 0x030a }
                r11.f60261w = r3     // Catch:{ Exception -> 0x030a }
                goto L_0x00aa
            L_0x00e7:
                long r11 = r13.f60259u     // Catch:{ Exception -> 0x030a }
                kd0.o r13 = kd0.C21323o.this     // Catch:{ Exception -> 0x030a }
                int r14 = r13.f60251m     // Catch:{ Exception -> 0x030a }
                long r14 = (long) r14     // Catch:{ Exception -> 0x030a }
                int r16 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
                if (r16 >= 0) goto L_0x011c
                if (r0 < 0) goto L_0x011c
                java.util.List<java.nio.ByteBuffer> r11 = r13.f60262x     // Catch:{ Exception -> 0x030a }
                java.util.ArrayList r11 = (java.util.ArrayList) r11     // Catch:{ Exception -> 0x030a }
                int r11 = r11.size()     // Catch:{ Exception -> 0x030a }
                long r11 = (long) r11     // Catch:{ Exception -> 0x030a }
                kd0.o r13 = kd0.C21323o.this     // Catch:{ Exception -> 0x030a }
                long r13 = r13.f60259u     // Catch:{ Exception -> 0x030a }
                int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                if (r15 <= 0) goto L_0x011c
                kd0.o r0 = kd0.C21323o.this     // Catch:{ Exception -> 0x030a }
                java.util.List<java.nio.ByteBuffer> r11 = r0.f60262x     // Catch:{ Exception -> 0x030a }
                long r12 = r0.f60259u     // Catch:{ Exception -> 0x030a }
                int r0 = (int) r12     // Catch:{ Exception -> 0x030a }
                java.util.ArrayList r11 = (java.util.ArrayList) r11     // Catch:{ Exception -> 0x030a }
                java.lang.Object r0 = r11.get(r0)     // Catch:{ Exception -> 0x030a }
                java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0     // Catch:{ Exception -> 0x030a }
                r0.position(r2)     // Catch:{ Exception -> 0x030a }
                r0.get(r7)     // Catch:{ Exception -> 0x030a }
                r11 = 1
                goto L_0x011d
            L_0x011c:
                r11 = r0
            L_0x011d:
                if (r11 >= 0) goto L_0x0165
                kd0.o r0 = kd0.C21323o.this     // Catch:{ Exception -> 0x030a }
                r0.f60247i = r2     // Catch:{ Exception -> 0x030a }
                com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x030a }
                r13 = 161(0xa1, double:7.95E-322)
                r15 = 0
                r17 = 1
                r19 = 0
                r12 = r0
                r12.idkeyStat(r13, r15, r17, r19)     // Catch:{ Exception -> 0x030a }
                r13 = 161(0xa1, double:7.95E-322)
                r15 = 4
                r17 = 1
                r19 = 0
                r12 = r0
                r12.idkeyStat(r13, r15, r17, r19)     // Catch:{ Exception -> 0x030a }
                java.lang.String r0 = "MicroMsg.SilkPlayer"
                java.lang.String r9 = "[%d] SilkDoDec failed: %d"
                java.lang.Object[] r10 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x030a }
                kd0.o r12 = kd0.C21323o.this     // Catch:{ Exception -> 0x030a }
                int r12 = r12.f60250l     // Catch:{ Exception -> 0x030a }
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ Exception -> 0x030a }
                r10[r2] = r12     // Catch:{ Exception -> 0x030a }
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x030a }
                r10[r3] = r11     // Catch:{ Exception -> 0x030a }
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r9, r10)     // Catch:{ Exception -> 0x030a }
                kd0.o r0 = kd0.C21323o.this     // Catch:{ Exception -> 0x030a }
                uh.b r0 = r0.f60252n     // Catch:{ Exception -> 0x030a }
                if (r0 == 0) goto L_0x003c
                boolean r9 = sf0.C90188n0.f258914H     // Catch:{ Exception -> 0x030a }
                if (r9 == 0) goto L_0x003c
                r0.mo124805a()     // Catch:{ Exception -> 0x030a }
                goto L_0x003c
            L_0x0165:
                boolean r0 = sf0.C90188n0.f258914H     // Catch:{ Exception -> 0x030a }
                if (r0 == 0) goto L_0x0174
                kd0.o r0 = kd0.C21323o.this     // Catch:{ Exception -> 0x030a }
                uh.b r0 = r0.f60252n     // Catch:{ Exception -> 0x030a }
                if (r0 == 0) goto L_0x0174
                int r12 = r8 * 2
                r0.mo124806b(r7, r12)     // Catch:{ Exception -> 0x030a }
            L_0x0174:
                kd0.o r0 = kd0.C21323o.this     // Catch:{ Exception -> 0x0198 }
                boolean r0 = r0.f60260v     // Catch:{ Exception -> 0x0198 }
                if (r0 == 0) goto L_0x019a
                kd0.o r0 = kd0.C21323o.this     // Catch:{ Exception -> 0x0198 }
                android.media.AudioTrack r0 = r0.f60239a     // Catch:{ Exception -> 0x0198 }
                r0.pause()     // Catch:{ Exception -> 0x0198 }
                kd0.o r0 = kd0.C21323o.this     // Catch:{ Exception -> 0x0198 }
                android.media.AudioTrack r0 = r0.f60239a     // Catch:{ Exception -> 0x0198 }
                r0.flush()     // Catch:{ Exception -> 0x0198 }
                kd0.o r0 = kd0.C21323o.this     // Catch:{ Exception -> 0x0198 }
                android.media.AudioTrack r0 = r0.f60239a     // Catch:{ Exception -> 0x0198 }
                r0.play()     // Catch:{ Exception -> 0x0198 }
                java.lang.String r0 = "MicroMsg.SilkPlayer"
                java.lang.String r12 = "seek flush audioTrack"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r12)     // Catch:{ Exception -> 0x0198 }
                goto L_0x019a
            L_0x0198:
                r0 = move-exception
                goto L_0x01ea
            L_0x019a:
                kd0.o r0 = kd0.C21323o.this     // Catch:{ Exception -> 0x0198 }
                android.media.AudioTrack r0 = r0.f60239a     // Catch:{ Exception -> 0x0198 }
                int r12 = r8 * 2
                int r0 = r0.write(r7, r2, r12)     // Catch:{ Exception -> 0x0198 }
                if (r0 > 0) goto L_0x01b6
                java.lang.String r12 = "MicroMsg.SilkPlayer"
                java.lang.String r13 = "playing: write ret %d"
                java.lang.Object[] r14 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0198 }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0198 }
                r14[r2] = r0     // Catch:{ Exception -> 0x0198 }
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r12, r13, r14)     // Catch:{ Exception -> 0x0198 }
                goto L_0x01bb
            L_0x01b6:
                kd0.o r12 = kd0.C21323o.this     // Catch:{ Exception -> 0x0198 }
                kd0.C21323o.m23912l(r12, r0)     // Catch:{ Exception -> 0x0198 }
            L_0x01bb:
                kd0.o r0 = kd0.C21323o.this     // Catch:{ Exception -> 0x0198 }
                qh.d$c r12 = r0.f60257s     // Catch:{ Exception -> 0x0198 }
                if (r12 == 0) goto L_0x01d2
                boolean r0 = r0.f60260v     // Catch:{ Exception -> 0x0198 }
                if (r0 != 0) goto L_0x01d2
                kd0.o r0 = kd0.C21323o.this     // Catch:{ Exception -> 0x0198 }
                qh.d$c r12 = r0.f60257s     // Catch:{ Exception -> 0x0198 }
                long r13 = r0.f60259u     // Catch:{ Exception -> 0x0198 }
                long r13 = r13 * r9
                ph.a$b r12 = (p371ph.C21967a.C21968b) r12     // Catch:{ Exception -> 0x0198 }
                r12.mo35071a(r13)     // Catch:{ Exception -> 0x0198 }
            L_0x01d2:
                kd0.o r0 = kd0.C21323o.this     // Catch:{ Exception -> 0x0198 }
                r0.getClass()     // Catch:{ Exception -> 0x0198 }
                kd0.o r0 = kd0.C21323o.this     // Catch:{ Exception -> 0x0198 }
                java.lang.Object r9 = r0.f60258t     // Catch:{ Exception -> 0x0198 }
                monitor-enter(r9)     // Catch:{ Exception -> 0x0198 }
                kd0.o r0 = kd0.C21323o.this     // Catch:{ all -> 0x01e7 }
                kd0.C21323o.m23910j(r0)     // Catch:{ all -> 0x01e7 }
                kd0.o r0 = kd0.C21323o.this     // Catch:{ all -> 0x01e7 }
                r0.f60260v = r2     // Catch:{ all -> 0x01e7 }
                monitor-exit(r9)     // Catch:{ all -> 0x01e7 }
                goto L_0x0214
            L_0x01e7:
                r0 = move-exception
                monitor-exit(r9)     // Catch:{ all -> 0x01e7 }
                throw r0     // Catch:{ Exception -> 0x0198 }
            L_0x01ea:
                java.lang.String r9 = "MicroMsg.SilkPlayer"
                java.lang.String r10 = "write audio track failed: %s"
                java.lang.Object[] r12 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x030a }
                java.lang.String r0 = r0.getMessage()     // Catch:{ Exception -> 0x030a }
                r12[r2] = r0     // Catch:{ Exception -> 0x030a }
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r9, r10, r12)     // Catch:{ Exception -> 0x030a }
                com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x030a }
                r14 = 161(0xa1, double:7.95E-322)
                r16 = 0
                r18 = 1
                r20 = 0
                r13 = r0
                r13.idkeyStat(r14, r16, r18, r20)     // Catch:{ Exception -> 0x030a }
                r14 = 161(0xa1, double:7.95E-322)
                r16 = 5
                r18 = 1
                r20 = 0
                r13 = r0
                r13.idkeyStat(r14, r16, r18, r20)     // Catch:{ Exception -> 0x030a }
            L_0x0214:
                if (r11 != 0) goto L_0x0245
                kd0.o r0 = kd0.C21323o.this     // Catch:{ Exception -> 0x030a }
                r9 = 4
                r0.f60247i = r9     // Catch:{ Exception -> 0x030a }
                java.lang.String r0 = "MicroMsg.SilkPlayer"
                java.lang.String r9 = "[%d] play completed"
                java.lang.Object[] r10 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x030a }
                kd0.o r11 = kd0.C21323o.this     // Catch:{ Exception -> 0x030a }
                int r11 = r11.f60250l     // Catch:{ Exception -> 0x030a }
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x030a }
                r10[r2] = r11     // Catch:{ Exception -> 0x030a }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r9, r10)     // Catch:{ Exception -> 0x030a }
                kd0.o r0 = kd0.C21323o.this     // Catch:{ Exception -> 0x030a }
                uh.b r0 = r0.f60252n     // Catch:{ Exception -> 0x030a }
                if (r0 == 0) goto L_0x003c
                boolean r9 = sf0.C90188n0.f258914H     // Catch:{ Exception -> 0x030a }
                if (r9 == 0) goto L_0x003c
                r0.mo124805a()     // Catch:{ Exception -> 0x030a }
                kd0.o$c$$b r0 = new kd0.o$c$$b     // Catch:{ Exception -> 0x030a }
                r0.<init>(r1)     // Catch:{ Exception -> 0x030a }
                com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r0)     // Catch:{ Exception -> 0x030a }
                goto L_0x003c
            L_0x0245:
                kd0.o r0 = kd0.C21323o.this     // Catch:{ Exception -> 0x030a }
                int r0 = r0.f60247i     // Catch:{ Exception -> 0x030a }
                if (r0 != r4) goto L_0x02b9
                kd0.o r0 = kd0.C21323o.this     // Catch:{ Exception -> 0x030a }
                r0.getClass()     // Catch:{ Exception -> 0x030a }
                java.lang.String r9 = ""
                monitor-enter(r9)     // Catch:{ Exception -> 0x030a }
                java.lang.String r0 = "MicroMsg.SilkPlayer"
                java.lang.String r10 = "before mOk.notify"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r10)     // Catch:{ Exception -> 0x026e }
                kd0.o r0 = kd0.C21323o.this     // Catch:{ Exception -> 0x026e }
                r0.getClass()     // Catch:{ Exception -> 0x026e }
                java.lang.String r0 = ""
                r0.notifyAll()     // Catch:{ Exception -> 0x026e }
                java.lang.String r0 = "MicroMsg.SilkPlayer"
                java.lang.String r10 = "after mOk.notify"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r10)     // Catch:{ Exception -> 0x026e }
                goto L_0x027e
            L_0x026c:
                r0 = move-exception
                goto L_0x02b7
            L_0x026e:
                r0 = move-exception
                java.lang.String r10 = "MicroMsg.SilkPlayer"
                java.lang.String r11 = "exception:%s"
                java.lang.Object[] r12 = new java.lang.Object[r3]     // Catch:{ all -> 0x026c }
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)     // Catch:{ all -> 0x026c }
                r12[r2] = r0     // Catch:{ all -> 0x026c }
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r11, r12)     // Catch:{ all -> 0x026c }
            L_0x027e:
                monitor-exit(r9)     // Catch:{ all -> 0x026c }
                kd0.o r0 = kd0.C21323o.this     // Catch:{ Exception -> 0x030a }
                r0.getClass()     // Catch:{ Exception -> 0x030a }
                java.lang.String r9 = ""
                monitor-enter(r9)     // Catch:{ Exception -> 0x030a }
                java.lang.String r0 = "MicroMsg.SilkPlayer"
                java.lang.String r10 = "before mpause.wait"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r10)     // Catch:{ Exception -> 0x02a2 }
                kd0.o r0 = kd0.C21323o.this     // Catch:{ Exception -> 0x02a2 }
                r0.getClass()     // Catch:{ Exception -> 0x02a2 }
                java.lang.String r0 = ""
                r0.wait()     // Catch:{ Exception -> 0x02a2 }
                java.lang.String r0 = "MicroMsg.SilkPlayer"
                java.lang.String r10 = "after mpause.wait"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r10)     // Catch:{ Exception -> 0x02a2 }
                goto L_0x02b2
            L_0x02a0:
                r0 = move-exception
                goto L_0x02b5
            L_0x02a2:
                r0 = move-exception
                java.lang.String r10 = "MicroMsg.SilkPlayer"
                java.lang.String r11 = "exception:%s"
                java.lang.Object[] r12 = new java.lang.Object[r3]     // Catch:{ all -> 0x02a0 }
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)     // Catch:{ all -> 0x02a0 }
                r12[r2] = r0     // Catch:{ all -> 0x02a0 }
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r11, r12)     // Catch:{ all -> 0x02a0 }
            L_0x02b2:
                monitor-exit(r9)     // Catch:{ all -> 0x02a0 }
                goto L_0x003c
            L_0x02b5:
                monitor-exit(r9)     // Catch:{ all -> 0x02a0 }
                throw r0     // Catch:{ Exception -> 0x030a }
            L_0x02b7:
                monitor-exit(r9)     // Catch:{ all -> 0x026c }
                throw r0     // Catch:{ Exception -> 0x030a }
            L_0x02b9:
                kd0.o r0 = kd0.C21323o.this     // Catch:{ Exception -> 0x030a }
                r0.getClass()     // Catch:{ Exception -> 0x030a }
                java.lang.String r9 = ""
                monitor-enter(r9)     // Catch:{ Exception -> 0x030a }
                kd0.o r0 = kd0.C21323o.this     // Catch:{ Exception -> 0x02ce }
                r0.getClass()     // Catch:{ Exception -> 0x02ce }
                java.lang.String r0 = ""
                r0.notifyAll()     // Catch:{ Exception -> 0x02ce }
                goto L_0x02de
            L_0x02cc:
                r0 = move-exception
                goto L_0x02e1
            L_0x02ce:
                r0 = move-exception
                java.lang.String r10 = "MicroMsg.SilkPlayer"
                java.lang.String r11 = "exception:%s"
                java.lang.Object[] r12 = new java.lang.Object[r3]     // Catch:{ all -> 0x02cc }
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)     // Catch:{ all -> 0x02cc }
                r12[r2] = r0     // Catch:{ all -> 0x02cc }
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r11, r12)     // Catch:{ all -> 0x02cc }
            L_0x02de:
                monitor-exit(r9)     // Catch:{ all -> 0x02cc }
                goto L_0x003c
            L_0x02e1:
                monitor-exit(r9)     // Catch:{ all -> 0x02cc }
                throw r0     // Catch:{ Exception -> 0x030a }
            L_0x02e3:
                r0.f60247i = r2     // Catch:{ Exception -> 0x030a }
                java.lang.String r0 = "MicroMsg.SilkPlayer"
                java.lang.String r9 = "[%d] SilkDoDec failed. data == null "
                java.lang.Object[] r10 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x030a }
                kd0.o r11 = kd0.C21323o.this     // Catch:{ Exception -> 0x030a }
                int r11 = r11.f60250l     // Catch:{ Exception -> 0x030a }
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x030a }
                r10[r2] = r11     // Catch:{ Exception -> 0x030a }
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r9, r10)     // Catch:{ Exception -> 0x030a }
                kd0.o r0 = kd0.C21323o.this     // Catch:{ Exception -> 0x030a }
                uh.b r0 = r0.f60252n     // Catch:{ Exception -> 0x030a }
                if (r0 == 0) goto L_0x003c
                boolean r9 = sf0.C90188n0.f258914H     // Catch:{ Exception -> 0x030a }
                if (r9 == 0) goto L_0x003c
                r0.mo124805a()     // Catch:{ Exception -> 0x030a }
                goto L_0x003c
            L_0x0307:
                r0 = move-exception
                monitor-exit(r9)     // Catch:{ all -> 0x0307 }
                throw r0     // Catch:{ Exception -> 0x030a }
            L_0x030a:
                r0 = move-exception
                com.tencent.mm.plugin.report.service.n r6 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r7 = 161(0xa1, double:7.95E-322)
                r9 = 0
                r11 = 1
                r13 = 0
                r6.idkeyStat(r7, r9, r11, r13)
                java.lang.String r6 = "MicroMsg.SilkPlayer"
                java.lang.String r7 = "exception:%s"
                java.lang.Object[] r8 = new java.lang.Object[r3]
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
                r8[r2] = r0
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r7, r8)
                kd0.o r0 = kd0.C21323o.this
                android.media.MediaPlayer$OnErrorListener r0 = r0.f60236C
                if (r0 == 0) goto L_0x0332
                r6 = 0
                kd0.o$b r0 = (kd0.C21323o.C21325b) r0
                r0.onError(r6, r2, r2)
            L_0x0332:
                kd0.o r0 = kd0.C21323o.this
                r0.f60247i = r2
            L_0x0336:
                kd0.o$c$$a r6 = new kd0.o$c$$a
                r6.<init>(r1)
                kd0.o r0 = kd0.C21323o.this
                boolean r7 = r0.f60263y
                if (r7 == 0) goto L_0x04f7
                int r0 = r0.f60247i
                if (r0 == r5) goto L_0x04f7
                kd0.o r0 = kd0.C21323o.this
                android.media.AudioTrack r0 = r0.f60239a
                if (r0 == 0) goto L_0x04f7
                int r0 = r0.getPlayState()
                if (r0 != r5) goto L_0x04f7
                java.lang.String r0 = "MicroMsg.SilkPlayer"
                java.lang.String r5 = "delay complete"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)
                java.lang.Class<h81.h> r0 = h81.C32735h.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                h81.h r0 = (h81.C32735h) r0
                h81.h$c r5 = h81.C32735h.C32737c.clicfg_silk_player_use_sleep
                int r0 = r0.mo58779Qe(r5, r2)
                if (r0 != r3) goto L_0x0393
                java.lang.String r0 = "MicroMsg.SilkPlayer"
                java.lang.String r2 = "stop use old sleep 1000"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
                kd0.o r0 = kd0.C21323o.this
                java.util.concurrent.Future<?> r0 = r0.f60237D
                if (r0 == 0) goto L_0x0383
                boolean r0 = r0.isDone()
                if (r0 != 0) goto L_0x0383
                java.lang.String r0 = "MicroMsg.SilkPlayer"
                java.lang.String r2 = "has uncomplete task"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r2)
            L_0x0383:
                kd0.o r0 = kd0.C21323o.this
                zt3.t r2 = zt3.C119157j.f356862d
                r3 = 1000(0x3e8, double:4.94E-321)
                zt3.j r2 = (zt3.C119157j) r2
                lu3.c r2 = r2.mo183878i(r6, r3)
                r0.f60237D = r2
                goto L_0x0501
            L_0x0393:
                kd0.o r0 = kd0.C21323o.this
                android.media.AudioTrack r0 = r0.f60239a
                int r0 = r0.getPlaybackHeadPosition()
                kd0.o r5 = kd0.C21323o.this
                int r5 = r5.f60238E
                int r5 = r5 / r4
                r7 = 0
                if (r0 < r5) goto L_0x03e9
                java.lang.String r0 = "MicroMsg.SilkPlayer"
                java.lang.String r5 = "audioTrackHeadPosition %d writtenBytes %d, just invoke oncomp"
                java.lang.Object[] r4 = new java.lang.Object[r4]
                kd0.o r9 = kd0.C21323o.this
                android.media.AudioTrack r9 = r9.f60239a
                int r9 = r9.getPlaybackHeadPosition()
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r4[r2] = r9
                kd0.o r2 = kd0.C21323o.this
                int r2 = r2.f60238E
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r4[r3] = r2
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r5, r4)
                kd0.o r0 = kd0.C21323o.this
                java.util.concurrent.Future<?> r0 = r0.f60237D
                if (r0 == 0) goto L_0x03d8
                boolean r0 = r0.isDone()
                if (r0 != 0) goto L_0x03d8
                java.lang.String r0 = "MicroMsg.SilkPlayer"
                java.lang.String r2 = "has uncomplete task"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r2)
            L_0x03d8:
                kd0.o r0 = kd0.C21323o.this
                zt3.t r2 = zt3.C119157j.f356862d
                zt3.j r2 = (zt3.C119157j) r2
                r2.getClass()
                lu3.c r2 = r2.mo183878i(r6, r7)
                r0.f60237D = r2
                goto L_0x0501
            L_0x03e9:
                java.lang.String r0 = "MicroMsg.SilkPlayer"
                java.lang.String r5 = "set setNotificationMarkerPosition %d"
                java.lang.Object[] r9 = new java.lang.Object[r3]
                kd0.o r10 = kd0.C21323o.this
                int r10 = r10.f60238E
                int r10 = r10 / r4
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
                r9[r2] = r10
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r5, r9)
                r5 = -1
                kd0.o r0 = kd0.C21323o.this     // Catch:{ Exception -> 0x040b }
                android.media.AudioTrack r9 = r0.f60239a     // Catch:{ Exception -> 0x040b }
                int r0 = r0.f60238E     // Catch:{ Exception -> 0x040b }
                int r0 = r0 / r4
                int r5 = r9.setNotificationMarkerPosition(r0)     // Catch:{ Exception -> 0x040b }
                goto L_0x0417
            L_0x040b:
                r0 = move-exception
                java.lang.String r9 = "MicroMsg.SilkPlayer"
                java.lang.String r10 = "run: setNotificationMarkerPosition error"
                java.lang.Object[] r11 = new java.lang.Object[r3]
                r11[r2] = r0
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r9, r10, r11)
            L_0x0417:
                if (r5 >= 0) goto L_0x044b
                java.lang.String r0 = "MicroMsg.SilkPlayer"
                java.lang.String r4 = "run: setNotificationMarkerPosition error %d"
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r3[r2] = r5
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r4, r3)
                kd0.o r0 = kd0.C21323o.this
                java.util.concurrent.Future<?> r0 = r0.f60237D
                if (r0 == 0) goto L_0x043b
                boolean r0 = r0.isDone()
                if (r0 != 0) goto L_0x043b
                java.lang.String r0 = "MicroMsg.SilkPlayer"
                java.lang.String r2 = "has uncompleted task"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r2)
            L_0x043b:
                kd0.o r0 = kd0.C21323o.this
                zt3.t r2 = zt3.C119157j.f356862d
                zt3.j r2 = (zt3.C119157j) r2
                r2.getClass()
                lu3.c r2 = r2.mo183878i(r6, r7)
                r0.f60237D = r2
                return
            L_0x044b:
                kd0.o r0 = kd0.C21323o.this
                r0.f60264z = r3
                kd0.o r0 = kd0.C21323o.this
                r0.f60234A = r6
                zt3.t r0 = zt3.C119157j.f356862d
                r7 = 5000(0x1388, double:2.4703E-320)
                zt3.j r0 = (zt3.C119157j) r0
                lu3.c r0 = r0.mo183878i(r6, r7)
                kd0.o r5 = kd0.C21323o.this     // Catch:{ Exception -> 0x0473 }
                android.media.AudioTrack r5 = r5.f60239a     // Catch:{ Exception -> 0x0473 }
                kd0.o$c$$c r7 = new kd0.o$c$$c     // Catch:{ Exception -> 0x0473 }
                r7.<init>(r1, r0, r6)     // Catch:{ Exception -> 0x0473 }
                android.os.Handler r0 = new android.os.Handler     // Catch:{ Exception -> 0x0473 }
                android.os.Looper r6 = android.os.Looper.getMainLooper()     // Catch:{ Exception -> 0x0473 }
                r0.<init>(r6)     // Catch:{ Exception -> 0x0473 }
                r5.setPlaybackPositionUpdateListener(r7, r0)     // Catch:{ Exception -> 0x0473 }
                goto L_0x047f
            L_0x0473:
                r0 = move-exception
                java.lang.String r5 = "MicroMsg.SilkPlayer"
                java.lang.String r6 = "run: setPlaybackPositionUpdateListener error"
                java.lang.Object[] r7 = new java.lang.Object[r3]
                r7[r2] = r0
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r6, r7)
            L_0x047f:
                int r0 = android.os.Build.VERSION.SDK_INT
                r5 = 23
                if (r0 < r5) goto L_0x04a5
                kd0.o r0 = kd0.C21323o.this     // Catch:{ IllegalStateException -> 0x0490 }
                android.media.AudioTrack r0 = r0.f60239a     // Catch:{ IllegalStateException -> 0x0490 }
                int r0 = r0.getBufferSizeInFrames()     // Catch:{ IllegalStateException -> 0x0490 }
                int r0 = r0 * 2
                goto L_0x04b1
            L_0x0490:
                r0 = move-exception
                java.lang.String r5 = "MicroMsg.SilkPlayer"
                java.lang.String r6 = "get buffer size error"
                java.lang.Object[] r7 = new java.lang.Object[r2]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r6, r7)
                kd0.o r0 = kd0.C21323o.this
                int r5 = r0.f60254p
                int r0 = r0.f60245g
                int r0 = android.media.AudioTrack.getMinBufferSize(r0, r4, r4)
                goto L_0x04af
            L_0x04a5:
                kd0.o r0 = kd0.C21323o.this
                int r5 = r0.f60254p
                int r0 = r0.f60245g
                int r0 = android.media.AudioTrack.getMinBufferSize(r0, r4, r4)
            L_0x04af:
                int r0 = r0 * r5
            L_0x04b1:
                kd0.o r5 = kd0.C21323o.this
                int r5 = r5.f60238E
                int r5 = r5 % r0
                if (r5 == 0) goto L_0x0501
                if (r5 >= r0) goto L_0x0501
                java.lang.String r6 = "MicroMsg.SilkPlayer"
                java.lang.String r7 = "run: need write empty data %d, %d"
                java.lang.Object[] r4 = new java.lang.Object[r4]
                java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
                r4[r2] = r8
                java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
                r4[r3] = r8
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r6, r7, r4)
                kd0.o r4 = kd0.C21323o.this     // Catch:{ Exception -> 0x04ea }
                android.media.AudioTrack r4 = r4.f60239a     // Catch:{ Exception -> 0x04ea }
                int r0 = r0 - r5
                byte[] r5 = new byte[r0]     // Catch:{ Exception -> 0x04ea }
                int r0 = r4.write(r5, r2, r0)     // Catch:{ Exception -> 0x04ea }
                java.lang.String r4 = "MicroMsg.SilkPlayer"
                java.lang.String r5 = "run: write ret %d"
                java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x04ea }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x04ea }
                r6[r2] = r0     // Catch:{ Exception -> 0x04ea }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r6)     // Catch:{ Exception -> 0x04ea }
                goto L_0x0501
            L_0x04ea:
                r0 = move-exception
                java.lang.String r4 = "MicroMsg.SilkPlayer"
                java.lang.String r5 = "run: write error"
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r3[r2] = r0
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r5, r3)
                goto L_0x0501
            L_0x04f7:
                java.lang.String r0 = "MicroMsg.SilkPlayer"
                java.lang.String r2 = "complete"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
                r6.run()
            L_0x0501:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kd0.C21323o.C21326c.run():void");
        }
    }

    public C21323o() {
        this.f60242d = null;
        this.f60243e = null;
        this.f60244f = 2;
        this.f60245g = 16000;
        this.f60246h = "";
        this.f60247i = 0;
        this.f60248j = 0;
        this.f60249k = false;
        this.f60251m = 0;
        this.f60252n = null;
        this.f60254p = 8;
        this.f60255q = true;
        this.f60257s = null;
        this.f60258t = new Object();
        this.f60259u = 0;
        this.f60260v = false;
        this.f60261w = false;
        this.f60262x = new ArrayList();
        this.f60263y = true;
        this.f60264z = false;
        this.f60234A = null;
        this.f60235B = new C21324a();
        this.f60236C = new C21325b();
        this.f60237D = null;
        this.f60238E = 0;
        int i = f60232G + 1;
        f60232G = i;
        this.f60250l = i;
        Log.m105925i("MicroMsg.SilkPlayer", "[%d] new Instance", Integer.valueOf(i));
    }

    /* renamed from: j */
    public static /* synthetic */ long m23910j(C21323o oVar) {
        long j = oVar.f60259u;
        oVar.f60259u = 1 + j;
        return j;
    }

    /* renamed from: k */
    public static /* synthetic */ int m23911k(C21323o oVar) {
        int i = oVar.f60251m;
        oVar.f60251m = i + 1;
        return i;
    }

    /* renamed from: l */
    public static /* synthetic */ int m23912l(C21323o oVar, int i) {
        int i2 = oVar.f60238E + i;
        oVar.f60238E = i2;
        return i2;
    }

    /* renamed from: a */
    public boolean mo33325a(String str, boolean z, int i) {
        String str2 = this.f60246h;
        return (str2 == null || !str2.equals(str)) ? mo33349t(str, z, i, true) : mo33349t(str, z, i, false);
    }

    /* renamed from: b */
    public boolean mo33326b(boolean z) {
        if (this.f60247i != 1) {
            return false;
        }
        this.f60247i = 2;
        synchronized ("") {
            try {
                Log.m105924i("MicroMsg.SilkPlayer", "before mOk.wait");
                long currentTimeMillis = System.currentTimeMillis();
                "".wait(1000);
                Log.m105924i("MicroMsg.SilkPlayer", "after mOk.wait time:" + (System.currentTimeMillis() - currentTimeMillis));
            } catch (Exception e) {
                Log.m105921e("MicroMsg.SilkPlayer", "exception:%s", Util.stackTraceToString(e));
                return false;
            }
        }
        C100115c cVar = this.f60241c;
        if (cVar != null && z) {
            cVar.mo139414a();
        }
        return true;
    }

    /* renamed from: c */
    public void mo33327c(boolean z) {
        Log.m105919d("MicroMsg.SilkPlayer", "setSpeakerOn: %b", Boolean.valueOf(z));
        this.f60249k = true;
        this.f60244f = 2;
        mo33342m(z);
        try {
            this.f60239a.play();
        } catch (Exception e) {
            C115669n nVar = C115669n.INSTANCE;
            nVar.idkeyStat(161, 0, 1, false);
            nVar.idkeyStat(161, 3, 1, false);
            Log.m105921e("MicroMsg.SilkPlayer", "audioTrack error:%s", e.getMessage());
        }
        this.f60249k = false;
    }

    /* renamed from: d */
    public void mo33328d(C22086d.C22087a aVar) {
        this.f60242d = aVar;
    }

    /* renamed from: e */
    public boolean mo33329e(String str, boolean z) {
        return mo33349t(str, z, 0, true);
    }

    /* renamed from: f */
    public double mo33330f() {
        return 0.0d;
    }

    /* renamed from: g */
    public void mo33331g(boolean z) {
        this.f60255q = z;
    }

    public int getStatus() {
        return this.f60247i;
    }

    /* renamed from: h */
    public void mo33333h(C22086d.C22089c cVar) {
        this.f60257s = cVar;
    }

    /* renamed from: i */
    public void mo33334i(C22086d.C22088b bVar) {
        this.f60243e = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isPlaying() {
        /*
            r5 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r1 = r5.f60247i
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L_0x000b
            r1 = 1
            goto L_0x000c
        L_0x000b:
            r1 = 0
        L_0x000c:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0[r3] = r1
            kd0.o$c r1 = r5.f60240b
            r0[r2] = r1
            r4 = 2
            if (r1 == 0) goto L_0x0028
            java.util.concurrent.Future r1 = r1.f255969d
            if (r1 != 0) goto L_0x001f
            r1 = 0
            goto L_0x0023
        L_0x001f:
            boolean r1 = r1.isDone()
        L_0x0023:
            if (r1 == 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r1 = 0
            goto L_0x0029
        L_0x0028:
            r1 = 1
        L_0x0029:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0[r4] = r1
            java.lang.String r1 = "MicroMsg.SilkPlayer"
            java.lang.String r4 = "isPlaying %s and mPlayRunnable is %s && mPlayRunnable is done %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r4, r0)
            int r0 = r5.f60247i
            if (r0 == r2) goto L_0x0055
            int r0 = r5.f60247i
            r1 = 4
            if (r0 == r1) goto L_0x0055
            int r0 = r5.f60247i
            if (r0 == r2) goto L_0x0054
            kd0.o$c r0 = r5.f60240b
            if (r0 == 0) goto L_0x0054
            java.util.concurrent.Future r0 = r0.f255969d
            if (r0 != 0) goto L_0x004d
            r0 = 0
            goto L_0x0051
        L_0x004d:
            boolean r0 = r0.isDone()
        L_0x0051:
            if (r0 != 0) goto L_0x0054
            goto L_0x0055
        L_0x0054:
            r2 = 0
        L_0x0055:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kd0.C21323o.isPlaying():boolean");
    }

    /* renamed from: m */
    public final void mo33342m(boolean z) {
        if (this.f60239a != null) {
            Log.m105924i("MicroMsg.SilkPlayer", "mAudioTrack.stop()");
            try {
                mo33350u();
            } catch (Exception e) {
                Log.m105921e("MicroMsg.SilkPlayer", "mAudioTrack.stop() error: %s", e.getMessage());
            }
            this.f60239a = null;
        }
        this.f60239a = C110561a.m150515a(z, this.f60245g, this.f60244f, 2, this.f60254p);
        this.f60253o = new C110787a();
        AudioTrack audioTrack = this.f60239a;
        if (audioTrack == null || audioTrack.getState() == 0) {
            C115669n nVar = C115669n.INSTANCE;
            nVar.idkeyStat(161, 0, 1, false);
            nVar.idkeyStat(161, 2, 1, false);
            try {
                AudioTrack audioTrack2 = this.f60239a;
                if (audioTrack2 != null) {
                    audioTrack2.release();
                    this.f60239a = null;
                }
            } catch (Exception unused) {
            }
        }
        this.f60238E = 0;
    }

    /* renamed from: n */
    public final boolean mo33343n() {
        if (this.f60239a != null) {
            try {
                Log.m105924i("MicroMsg.SilkPlayer", AssetExtension.SCENE_PLAY);
                this.f60239a.play();
                C21326c cVar = new C21326c((C21324a) null);
                this.f60240b = cVar;
                ((C119157j) C119157j.f356862d).mo183875f(cVar);
                return true;
            } catch (Exception e) {
                Log.m105921e("MicroMsg.SilkPlayer", "audioTrack error:%s", e.getMessage());
                C115669n nVar = C115669n.INSTANCE;
                nVar.idkeyStat(161, 0, 1, false);
                nVar.idkeyStat(161, 3, 1, false);
            }
        }
        return false;
    }

    /* renamed from: o */
    public final boolean mo33344o(String str) {
        boolean z;
        if (str == null) {
            return false;
        }
        try {
            int lastIndexOf = str.lastIndexOf("/");
            if (lastIndexOf == -1) {
                Log.m105928w("MicroMsg.SilkPlayer", "ensureFileFloder end == -1");
                return false;
            }
            String substring = str.substring(0, lastIndexOf + 1);
            C86009m1 m1Var = new C86009m1(substring);
            if (!m1Var.mo119967g()) {
                if (!m1Var.mo119987x()) {
                    if (!m1Var.mo119977o()) {
                        z = false;
                        Log.m105925i("MicroMsg.SilkPlayer", "ensureFileFloder mkdir:%s,sucess:%s", substring, Boolean.valueOf(z));
                    }
                }
                z = true;
                Log.m105925i("MicroMsg.SilkPlayer", "ensureFileFloder mkdir:%s,sucess:%s", substring, Boolean.valueOf(z));
            }
            return true;
        } catch (Exception e) {
            Log.m105929w("MicroMsg.SilkPlayer", "ensureFileFloder Exception:", e.getMessage());
            return false;
        }
    }

    /* renamed from: p */
    public final void mo33345p(String str) {
        int SilkDoDec;
        int i = this.f60250l;
        f60233H = i;
        Log.m105925i("MicroMsg.SilkPlayer", "[%d] SilkDecInit", Integer.valueOf(i));
        try {
            InputStream E = C86013q1.m106423E(str);
            int available = E.available();
            long j = (((long) available) * 1000) / 23900;
            Log.m105919d("MicroMsg.SilkPlayer", "SilkDecInit streamlen:%d", Integer.valueOf(available));
            int minBufferSize = AudioTrack.getMinBufferSize(this.f60245g, 2, 2) * 2;
            if (!C110248b.Jh0() || available >= minBufferSize) {
                this.f60254p = 8;
            } else {
                this.f60254p = 1;
            }
            byte[] bArr = new byte[available];
            E.read(bArr, 0, available);
            this.f60245g = MediaRecorder.SilkGetEncSampleRate(new byte[]{bArr[0]}, 0);
            C21322l lVar = this.f60256r;
            if (lVar != null) {
                int SilkDecUnInit = MediaRecorder.SilkDecUnInit(lVar.f60230a);
                Log.m105924i("MicroMsg.SilkPlayer", "silkdec uninit success: %d" + SilkDecUnInit);
            }
            this.f60256r = new C21322l(this.f60245g, bArr, available);
            int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_msg_voice_silk_agc, -1);
            if (1 == Qe || Qe == 0) {
                MediaRecorder.SetVoiceSilkDecControl(100, new byte[]{(byte) Qe}, 1, this.f60256r.f60230a);
            }
            E.close();
            Log.m105919d("MicroMsg.SilkPlayer", "[%d] skip %d frames", Integer.valueOf(this.f60250l), Integer.valueOf(this.f60251m));
            byte[] bArr2 = new byte[(AudioTrack.getMinBufferSize(this.f60245g, 2, 2) * 2)];
            short s = (short) ((this.f60245g * 20) / 1000);
            int i2 = 0;
            while (i2 < this.f60251m) {
                C21322l lVar2 = this.f60256r;
                if (lVar2 == null || (SilkDoDec = MediaRecorder.SilkDoDec(bArr2, s, lVar2.f60230a)) > 0) {
                    i2++;
                } else {
                    Log.m105921e("MicroMsg.SilkPlayer", "[%d], skip frame failed: %d", Integer.valueOf(this.f60250l), Integer.valueOf(SilkDoDec));
                    return;
                }
            }
        } catch (Exception e) {
            C115669n nVar = C115669n.INSTANCE;
            nVar.idkeyStat(161, 0, 1, false);
            nVar.idkeyStat(161, 1, 1, false);
            Log.m105921e("MicroMsg.SilkPlayer", "exception:%s", Util.stackTraceToString(e));
            MediaPlayer.OnErrorListener onErrorListener = this.f60236C;
            if (onErrorListener != null) {
                ((C21325b) onErrorListener).onError((MediaPlayer) null, 0, 0);
            }
            this.f60247i = 0;
        }
    }

    /* renamed from: q */
    public final boolean mo33346q(boolean z, int i) {
        if (!C86013q1.m106450k(this.f60246h)) {
            return false;
        }
        try {
            mo33342m(z);
            if (this.f60239a != null) {
                C100115c cVar = this.f60241c;
                if (cVar != null && this.f60255q) {
                    cVar.mo139415b();
                }
                return mo33343n();
            }
        } catch (Exception e) {
            C100115c cVar2 = this.f60241c;
            if (cVar2 != null && this.f60255q) {
                cVar2.mo139414a();
            }
            Log.m105920e("MicroMsg.SilkPlayer", "playImp : fail, exception = " + e.getMessage());
            Log.m105921e("MicroMsg.SilkPlayer", "exception:%s", Util.stackTraceToString(e));
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0085 A[SYNTHETIC, Splitter:B:15:0x0085] */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo33347r(java.lang.String r10, java.lang.String r11) {
        /*
            r9 = this;
            int r0 = r9.f60247i
            r1 = 0
            java.lang.String r2 = "MicroMsg.SilkPlayer"
            if (r0 == 0) goto L_0x001f
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "startPlay error status:"
            r10.append(r11)
            int r11 = r9.f60247i
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r10)
            return r1
        L_0x001f:
            r0 = 1
            r9.f60247i = r0
            r9.f60246h = r10
            r3 = 0
            java.io.InputStream r10 = com.tencent.p014mm.vfs.C86013q1.m106423E(r10)     // Catch:{ Exception -> 0x005e }
            int r4 = r10.available()     // Catch:{ Exception -> 0x005c }
            byte[] r5 = new byte[r4]     // Catch:{ Exception -> 0x005c }
            r10.read(r5, r3, r4)     // Catch:{ Exception -> 0x005c }
            byte[] r6 = new byte[r0]     // Catch:{ Exception -> 0x005c }
            byte r7 = r5[r3]     // Catch:{ Exception -> 0x005c }
            r6[r3] = r7     // Catch:{ Exception -> 0x005c }
            r7 = 0
            int r6 = com.tencent.p014mm.modelvoice.MediaRecorder.SilkGetEncSampleRate(r6, r7)     // Catch:{ Exception -> 0x005c }
            r9.f60245g = r6     // Catch:{ Exception -> 0x005c }
            kd0.l r7 = new kd0.l     // Catch:{ Exception -> 0x005c }
            r7.<init>(r6, r5, r4)     // Catch:{ Exception -> 0x005c }
            java.lang.String r4 = "[%d] SilkDecInit in silkToPcm"
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x005c }
            int r6 = r9.f60250l     // Catch:{ Exception -> 0x005c }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x005c }
            r5[r3] = r6     // Catch:{ Exception -> 0x005c }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r5)     // Catch:{ Exception -> 0x005c }
            r10.close()     // Catch:{ Exception -> 0x005c }
            java.lang.String r10 = r9.mo33348s(r11, r7)     // Catch:{ Exception -> 0x005c }
            return r10
        L_0x005c:
            r11 = move-exception
            goto L_0x0060
        L_0x005e:
            r11 = move-exception
            r10 = r1
        L_0x0060:
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = r9.f60246h
            r4[r3] = r5
            java.lang.String r5 = r11.getMessage()
            r4[r0] = r5
            java.lang.String r5 = "silkToPcm, file[%s], exception: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r5, r4)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r11)
            r0[r3] = r11
            java.lang.String r11 = "exception:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r11, r0)
            r11 = -1
            r9.f60247i = r11
            if (r10 == 0) goto L_0x0091
            r10.close()     // Catch:{ IOException -> 0x0089 }
            goto L_0x0091
        L_0x0089:
            r10 = move-exception
            java.lang.Object[] r11 = new java.lang.Object[r3]
            java.lang.String r0 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r10, r0, r11)
        L_0x0091:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kd0.C21323o.mo33347r(java.lang.String, java.lang.String):java.lang.String");
    }

    public boolean resume() {
        if (this.f60247i != 2) {
            return false;
        }
        this.f60247i = 1;
        synchronized ("") {
            try {
                Log.m105924i("MicroMsg.SilkPlayer", "before mpause.notify");
                "".notifyAll();
                Log.m105924i("MicroMsg.SilkPlayer", "after mpause.notify");
            } catch (Exception e) {
                Log.m105921e("MicroMsg.SilkPlayer", "exception:%s", Util.stackTraceToString(e));
                return false;
            }
        }
        C100115c cVar = this.f60241c;
        if (cVar != null && this.f60255q) {
            cVar.mo139415b();
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d5 A[SYNTHETIC, Splitter:B:38:0x00d5] */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo33348s(java.lang.String r13, kd0.C21322l r14) {
        /*
            r12 = this;
            java.lang.String r0 = "exception:%s"
            java.lang.String r1 = "MicroMsg.SilkPlayer"
            java.lang.String r2 = "hakon silkToPcmImpl()"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r2)
            java.lang.String r2 = r12.f60246h
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r2)
            r3 = 0
            r4 = 1
            r5 = 0
            if (r2 != 0) goto L_0x0020
            java.lang.Object[] r13 = new java.lang.Object[r4]
            java.lang.String r14 = r12.f60246h
            r13[r5] = r14
            java.lang.String r14 = "hakon silkToPcmImpl(), file not exist, fileName = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r14, r13)
            return r3
        L_0x0020:
            if (r14 != 0) goto L_0x0029
            java.lang.String r13 = "silkDecode is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r13)
            return r3
        L_0x0029:
            java.lang.String r2 = "hakon silkToPcmImpl thread start"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r2)     // Catch:{ Exception -> 0x00ac }
            r2 = -16
            android.os.Process.setThreadPriority(r2)     // Catch:{ Exception -> 0x00ac }
            int r2 = r12.f60245g     // Catch:{ Exception -> 0x00ac }
            r6 = 2
            int r2 = android.media.AudioTrack.getMinBufferSize(r2, r6, r6)     // Catch:{ Exception -> 0x00ac }
            int r2 = r2 << r4
            byte[] r2 = new byte[r2]     // Catch:{ Exception -> 0x00ac }
            int r7 = r12.f60245g     // Catch:{ Exception -> 0x00ac }
            int r7 = r7 * 20
            int r7 = r7 / 1000
            short r7 = (short) r7     // Catch:{ Exception -> 0x00ac }
            r12.mo33344o(r13)     // Catch:{ Exception -> 0x00ac }
            java.io.OutputStream r8 = com.tencent.p014mm.vfs.C86013q1.m106429K(r13, r5)     // Catch:{ Exception -> 0x00ac }
        L_0x004b:
            int r9 = r12.f60247i     // Catch:{ Exception -> 0x00aa }
            if (r9 == r4) goto L_0x0088
            int r9 = r12.f60247i     // Catch:{ Exception -> 0x00aa }
            if (r9 != r6) goto L_0x0054
            goto L_0x0088
        L_0x0054:
            java.lang.String r2 = "hakon silkToPcmImpl thread end"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r2)     // Catch:{ Exception -> 0x00aa }
            r8.close()     // Catch:{ Exception -> 0x00aa }
            long r6 = r14.f60230a     // Catch:{ Exception -> 0x00e2 }
            int r14 = com.tencent.p014mm.modelvoice.MediaRecorder.SilkDecUnInit(r6)     // Catch:{ Exception -> 0x00e2 }
            java.lang.String r2 = "[%d] SilkDecUnInit in silkToPcmImpl"
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x00e2 }
            int r7 = r12.f60250l     // Catch:{ Exception -> 0x00e2 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x00e2 }
            r6[r5] = r7     // Catch:{ Exception -> 0x00e2 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r6)     // Catch:{ Exception -> 0x00e2 }
            if (r14 == 0) goto L_0x0087
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00e2 }
            r2.<init>()     // Catch:{ Exception -> 0x00e2 }
            java.lang.String r6 = "hakon silkToPcmImpl res: "
            r2.append(r6)     // Catch:{ Exception -> 0x00e2 }
            r2.append(r14)     // Catch:{ Exception -> 0x00e2 }
            java.lang.String r14 = r2.toString()     // Catch:{ Exception -> 0x00e2 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r14)     // Catch:{ Exception -> 0x00e2 }
        L_0x0087:
            return r13
        L_0x0088:
            long r9 = r14.f60230a     // Catch:{ Exception -> 0x00aa }
            int r9 = com.tencent.p014mm.modelvoice.MediaRecorder.SilkDoDec(r2, r7, r9)     // Catch:{ Exception -> 0x00aa }
            if (r9 >= 0) goto L_0x0093
            r12.f60247i = r5     // Catch:{ Exception -> 0x00aa }
            goto L_0x004b
        L_0x0093:
            boolean r10 = r12.f60249k     // Catch:{ Exception -> 0x00aa }
            if (r10 == 0) goto L_0x009d
            r10 = 20
            java.lang.Thread.sleep(r10)     // Catch:{ Exception -> 0x00aa }
            goto L_0x0093
        L_0x009d:
            int r10 = r7 * 2
            r8.write(r2, r5, r10)     // Catch:{ Exception -> 0x00aa }
            r8.flush()     // Catch:{ Exception -> 0x00aa }
            if (r9 != 0) goto L_0x004b
            r12.f60247i = r5     // Catch:{ Exception -> 0x00aa }
            goto L_0x004b
        L_0x00aa:
            r13 = move-exception
            goto L_0x00ae
        L_0x00ac:
            r13 = move-exception
            r8 = r3
        L_0x00ae:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00e2 }
            r14.<init>()     // Catch:{ Exception -> 0x00e2 }
            java.lang.String r2 = "hakon silkToPcmImpl thread exception: "
            r14.append(r2)     // Catch:{ Exception -> 0x00e2 }
            java.lang.String r2 = r13.getMessage()     // Catch:{ Exception -> 0x00e2 }
            r14.append(r2)     // Catch:{ Exception -> 0x00e2 }
            java.lang.String r14 = r14.toString()     // Catch:{ Exception -> 0x00e2 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r14)     // Catch:{ Exception -> 0x00e2 }
            java.lang.Object[] r14 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x00e2 }
            java.lang.String r13 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r13)     // Catch:{ Exception -> 0x00e2 }
            r14[r5] = r13     // Catch:{ Exception -> 0x00e2 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r0, r14)     // Catch:{ Exception -> 0x00e2 }
            r12.f60247i = r5     // Catch:{ Exception -> 0x00e2 }
            if (r8 == 0) goto L_0x00e1
            r8.close()     // Catch:{ IOException -> 0x00d9 }
            goto L_0x00e1
        L_0x00d9:
            r13 = move-exception
            java.lang.String r14 = ""
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x00e2 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r13, r14, r2)     // Catch:{ Exception -> 0x00e2 }
        L_0x00e1:
            return r3
        L_0x00e2:
            r13 = move-exception
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r2 = "hakon silkToPcmImpl exception: "
            r14.append(r2)
            java.lang.String r2 = r13.getMessage()
            r14.append(r2)
            java.lang.String r14 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r14)
            java.lang.Object[] r14 = new java.lang.Object[r4]
            java.lang.String r13 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r13)
            r14[r5] = r13
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r0, r14)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kd0.C21323o.mo33348s(java.lang.String, kd0.l):java.lang.String");
    }

    public boolean seek(long j) {
        Log.m105924i("MicroMsg.SilkPlayer", "seek: " + j);
        if (this.f60247i == 0) {
            C22086d.C22089c cVar = this.f60257s;
            if (cVar != null) {
                ((C21967a.C21968b) cVar).mo35071a(this.f60259u * 20);
            }
            Log.m105924i("MicroMsg.SilkPlayer", "now stop, can not seek");
            return false;
        }
        if (this.f60247i == 4) {
            Future<?> future = this.f60237D;
            if (future == null || future.isDone() || !this.f60237D.cancel(false)) {
                Log.m105920e("MicroMsg.SilkPlayer", "cancel previous stopping error");
                return false;
            }
            Log.m105924i("MicroMsg.SilkPlayer", "cancel previous stopping");
            if (this.f60240b != null) {
                this.f60247i = 1;
                ((C119157j) C119157j.f356862d).mo183875f(this.f60240b);
            } else {
                Log.m105920e("MicroMsg.SilkPlayer", "playing runnable is null");
                return false;
            }
        }
        if (this.f60247i != 1) {
            Log.m105924i("MicroMsg.SilkPlayer", "not playing, can not seek");
            return false;
        }
        synchronized (this.f60258t) {
            this.f60259u = j / 20;
            this.f60260v = true;
        }
        return true;
    }

    public boolean stop() {
        Log.m105924i("MicroMsg.SilkPlayer", "stop  status:" + this.f60247i);
        if (this.f60247i == 1 || this.f60247i == 2) {
            this.f60247i = 3;
            synchronized ("") {
                try {
                    "".notifyAll();
                    C100115c cVar = this.f60241c;
                    if (cVar != null && this.f60255q) {
                        cVar.mo139414a();
                    }
                } catch (Exception e) {
                    try {
                        Log.m105921e("MicroMsg.SilkPlayer", "exception:%s", Util.stackTraceToString(e));
                        C100115c cVar2 = this.f60241c;
                        if (cVar2 != null && this.f60255q) {
                            cVar2.mo139414a();
                        }
                        return false;
                    } catch (Throwable th) {
                        C100115c cVar3 = this.f60241c;
                        if (cVar3 != null && this.f60255q) {
                            cVar3.mo139414a();
                        }
                        throw th;
                    }
                }
            }
            return true;
        }
        Log.m105920e("MicroMsg.SilkPlayer", "stop  error status:" + this.f60247i);
        return false;
    }

    /* renamed from: t */
    public final boolean mo33349t(String str, boolean z, int i, boolean z2) {
        Future<?> future;
        if (this.f60247i != 0) {
            Log.m105920e("MicroMsg.SilkPlayer", "startPlay error status:" + this.f60247i);
            return false;
        } else if (this.f60247i != 4 || (future = this.f60237D) == null || future.isDone() || this.f60237D.cancel(false)) {
            if (C90188n0.f258914H) {
                mo33347r(str, C101193k.f296198b);
            }
            if (z2) {
                ((ArrayList) this.f60262x).clear();
            }
            Log.m105924i("MicroMsg.SilkPlayer", "startPlay");
            this.f60247i = 1;
            this.f60246h = str;
            synchronized (f60231F) {
                mo33345p(str);
            }
            int i2 = 2;
            if (C90188n0.f258914H) {
                this.f60252n = new C90662b(C101193k.f296197a, this.f60244f == 2 ? 1 : 2, this.f60245g, 2);
            }
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(this.f60245g);
            if (this.f60244f == 2) {
                i2 = 1;
            }
            objArr[1] = Integer.valueOf(i2);
            Log.m105919d("MicroMsg.SilkPlayer", "startPlay, sampleRate: %d, channelCnt: %d ", objArr);
            try {
                return mo33346q(z, i);
            } catch (Exception e) {
                try {
                    return mo33346q(true, i);
                } catch (Exception unused) {
                    Log.m105920e("MicroMsg.SilkPlayer", "startPlay File[" + this.f60246h + "] failed");
                    Log.m105921e("MicroMsg.SilkPlayer", "exception:%s", Util.stackTraceToString(e));
                    this.f60247i = -1;
                    return false;
                }
            }
        } else {
            Log.m105920e("MicroMsg.SilkPlayer", "cancel error");
            return false;
        }
    }

    /* renamed from: u */
    public void mo33350u() {
        if (this.f60239a != null) {
            Log.m105924i("MicroMsg.SilkPlayer", "mAudioTrack.stop()");
            this.f60239a.stop();
            this.f60239a.release();
            this.f60239a = null;
            if (this.f60264z) {
                Log.m105924i("MicroMsg.SilkPlayer", "stopAudioTrack: needCheckComplete");
                this.f60264z = false;
                Runnable runnable = this.f60234A;
                this.f60234A = null;
                if (runnable != null) {
                    Future<?> future = this.f60237D;
                    if (future != null && !future.isDone()) {
                        Log.m105920e("MicroMsg.SilkPlayer", "stopAudioTrack has uncompleted task");
                    }
                    C119157j jVar = (C119157j) C119157j.f356862d;
                    jVar.getClass();
                    this.f60237D = jVar.mo183878i(runnable, 0);
                }
            }
        }
        C110787a aVar = this.f60253o;
        if (aVar != null) {
            String str = this.f60246h;
            AudioTrack audioTrack = this.f60239a;
            aVar.mo162343b(1, 0, str, audioTrack != null ? audioTrack.getStreamType() : 0);
            this.f60253o.mo162344c(0);
            this.f60253o.mo162346e(0);
            this.f60253o.mo162345d(0);
        }
    }

    public C21323o(Context context) {
        this();
        this.f60241c = new C100115c(context);
    }
}
