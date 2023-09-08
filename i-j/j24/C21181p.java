package j24;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.wxmm.v2encoder;
import e24.C20509c;
import j24.C21158d;
import j24.C21164g;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.logging.Level;
import java.util.logging.Logger;
import o24.C21760d0;
import o24.C21762e0;
import o24.C21766h;
import o24.C21768j;
import o24.C21769k;
import o24.C21783x;

/* renamed from: j24.p */
public final class C21181p implements Closeable {

    /* renamed from: h */
    public static final Logger f59914h = Logger.getLogger(C21161e.class.getName());

    /* renamed from: d */
    public final C21768j f59915d;

    /* renamed from: e */
    public final C21182a f59916e;

    /* renamed from: f */
    public final boolean f59917f;

    /* renamed from: g */
    public final C21158d.C21159a f59918g;

    /* renamed from: j24.p$a */
    public static final class C21182a implements C21760d0 {

        /* renamed from: d */
        public final C21768j f59919d;

        /* renamed from: e */
        public int f59920e;

        /* renamed from: f */
        public byte f59921f;

        /* renamed from: g */
        public int f59922g;

        /* renamed from: h */
        public int f59923h;

        /* renamed from: i */
        public short f59924i;

        public C21182a(C21768j jVar) {
            this.f59919d = jVar;
        }

        /* renamed from: L0 */
        public long mo32327L0(C21766h hVar, long j) {
            int i;
            int readInt;
            do {
                int i2 = this.f59923h;
                if (i2 == 0) {
                    this.f59919d.skip((long) this.f59924i);
                    this.f59924i = 0;
                    if ((this.f59921f & 4) != 0) {
                        return -1;
                    }
                    i = this.f59922g;
                    C21768j jVar = this.f59919d;
                    byte readByte = (jVar.readByte() & ExifInterface.MARKER) | ((jVar.readByte() & ExifInterface.MARKER) << v2encoder.enumCODEC_vcodec2) | ((jVar.readByte() & ExifInterface.MARKER) << 8);
                    this.f59923h = readByte;
                    this.f59920e = readByte;
                    byte readByte2 = (byte) (this.f59919d.readByte() & ExifInterface.MARKER);
                    this.f59921f = (byte) (this.f59919d.readByte() & ExifInterface.MARKER);
                    Logger logger = C21181p.f59914h;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(C21161e.m23585a(true, this.f59922g, this.f59920e, readByte2, this.f59921f));
                    }
                    readInt = this.f59919d.readInt() & Integer.MAX_VALUE;
                    this.f59922g = readInt;
                    if (readByte2 != 9) {
                        C21161e.m23586b("%s != TYPE_CONTINUATION", Byte.valueOf(readByte2));
                        throw null;
                    }
                } else {
                    long L0 = this.f59919d.mo32327L0(hVar, Math.min(j, (long) i2));
                    if (L0 == -1) {
                        return -1;
                    }
                    this.f59923h = (int) (((long) this.f59923h) - L0);
                    return L0;
                }
            } while (readInt == i);
            C21161e.m23586b("TYPE_CONTINUATION streamId changed", new Object[0]);
            throw null;
        }

        public void close() {
        }

        /* renamed from: f */
        public C21762e0 mo32328f() {
            return this.f59919d.mo32328f();
        }
    }

    /* renamed from: j24.p$b */
    public interface C21183b {
    }

    public C21181p(C21768j jVar, boolean z) {
        this.f59915d = jVar;
        this.f59917f = z;
        C21182a aVar = new C21182a(jVar);
        this.f59916e = aVar;
        this.f59918g = new C21158d.C21159a(4096, aVar);
    }

    /* renamed from: a */
    public static int m23620a(int i, byte b, short s) {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        C21161e.m23586b("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
        throw null;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:368)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:172)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:871)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:128)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: b */
    public boolean mo33135b(boolean r23, j24.C21181p.C21183b r24) {
        /*
            r22 = this;
            r1 = r22
            r0 = r24
            r2 = 0
            o24.j r3 = r1.f59915d     // Catch:{ IOException -> 0x04aa }
            r4 = 9
            r3.mo34121G0(r4)     // Catch:{ IOException -> 0x04aa }
            o24.j r3 = r1.f59915d
            byte r4 = r3.readByte()
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 16
            byte r5 = r3.readByte()
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 8
            r4 = r4 | r5
            byte r3 = r3.readByte()
            r3 = r3 & 255(0xff, float:3.57E-43)
            r3 = r3 | r4
            r4 = 1
            r5 = 0
            if (r3 < 0) goto L_0x049a
            r6 = 16384(0x4000, float:2.2959E-41)
            if (r3 > r6) goto L_0x049a
            o24.j r7 = r1.f59915d
            byte r7 = r7.readByte()
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r7 = (byte) r7
            r8 = 4
            if (r23 == 0) goto L_0x004b
            if (r7 != r8) goto L_0x003d
            goto L_0x004b
        L_0x003d:
            java.lang.String r0 = "Expected a SETTINGS frame but was %s"
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.Byte r4 = java.lang.Byte.valueOf(r7)
            r3[r2] = r4
            j24.C21161e.m23586b(r0, r3)
            throw r5
        L_0x004b:
            o24.j r9 = r1.f59915d
            byte r9 = r9.readByte()
            r9 = r9 & 255(0xff, float:3.57E-43)
            byte r9 = (byte) r9
            o24.j r10 = r1.f59915d
            int r10 = r10.readInt()
            r11 = 2147483647(0x7fffffff, float:NaN)
            r10 = r10 & r11
            java.util.logging.Logger r11 = f59914h
            java.util.logging.Level r12 = java.util.logging.Level.FINE
            boolean r12 = r11.isLoggable(r12)
            if (r12 == 0) goto L_0x006f
            java.lang.String r12 = j24.C21161e.m23585a(r4, r10, r3, r7, r9)
            r11.fine(r12)
        L_0x006f:
            r11 = 5
            r15 = 2
            switch(r7) {
                case 0: goto L_0x0307;
                case 1: goto L_0x01f1;
                case 2: goto L_0x01c8;
                case 3: goto L_0x013b;
                case 4: goto L_0x008d;
                case 5: goto L_0x0087;
                case 6: goto L_0x0083;
                case 7: goto L_0x007f;
                case 8: goto L_0x007b;
                default: goto L_0x0074;
            }
        L_0x0074:
            o24.j r0 = r1.f59915d
            long r2 = (long) r3
            r0.skip(r2)
            goto L_0x008a
        L_0x007b:
            r1.mo33142j(r0, r3, r9, r10)
            goto L_0x008a
        L_0x007f:
            r1.mo33138d(r0, r3, r9, r10)
            goto L_0x008a
        L_0x0083:
            r1.mo33140g(r0, r3, r9, r10)
            goto L_0x008a
        L_0x0087:
            r1.mo33141i(r0, r3, r9, r10)
        L_0x008a:
            r0 = 1
            goto L_0x0499
        L_0x008d:
            if (r10 != 0) goto L_0x0133
            r7 = r9 & 1
            if (r7 == 0) goto L_0x00a1
            if (r3 != 0) goto L_0x0099
            r24.getClass()
            goto L_0x008a
        L_0x0099:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r2 = "FRAME_SIZE_ERROR ack frame should be empty!"
            j24.C21161e.m23586b(r2, r0)
            throw r5
        L_0x00a1:
            int r7 = r3 % 6
            if (r7 != 0) goto L_0x0125
            j24.u r7 = new j24.u
            r7.<init>()
            r9 = 0
        L_0x00ab:
            if (r9 >= r3) goto L_0x00fe
            o24.j r10 = r1.f59915d
            short r10 = r10.readShort()
            r12 = 65535(0xffff, float:9.1834E-41)
            r10 = r10 & r12
            o24.j r12 = r1.f59915d
            int r12 = r12.readInt()
            if (r10 == r15) goto L_0x00eb
            r13 = 3
            if (r10 == r13) goto L_0x00e9
            if (r10 == r8) goto L_0x00dd
            if (r10 == r11) goto L_0x00c7
            goto L_0x00f8
        L_0x00c7:
            if (r12 < r6) goto L_0x00cf
            r13 = 16777215(0xffffff, float:2.3509886E-38)
            if (r12 > r13) goto L_0x00cf
            goto L_0x00f8
        L_0x00cf:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)
            r0[r2] = r3
            java.lang.String r2 = "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s"
            j24.C21161e.m23586b(r2, r0)
            throw r5
        L_0x00dd:
            r10 = 7
            if (r12 < 0) goto L_0x00e1
            goto L_0x00f8
        L_0x00e1:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r2 = "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"
            j24.C21161e.m23586b(r2, r0)
            throw r5
        L_0x00e9:
            r10 = 4
            goto L_0x00f8
        L_0x00eb:
            if (r12 == 0) goto L_0x00f8
            if (r12 != r4) goto L_0x00f0
            goto L_0x00f8
        L_0x00f0:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r2 = "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"
            j24.C21161e.m23586b(r2, r0)
            throw r5
        L_0x00f8:
            r7.mo33164b(r10, r12)
            int r9 = r9 + 6
            goto L_0x00ab
        L_0x00fe:
            r20 = 0
            j24.g$g r0 = (j24.C21164g.C21172g) r0
            r0.getClass()
            j24.g r3 = j24.C21164g.this     // Catch:{ RejectedExecutionException -> 0x008a }
            java.util.concurrent.ScheduledExecutorService r5 = r3.f59862n     // Catch:{ RejectedExecutionException -> 0x008a }
            j24.n r6 = new j24.n     // Catch:{ RejectedExecutionException -> 0x008a }
            java.lang.String r18 = "OkHttp %s ACK Settings"
            java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ RejectedExecutionException -> 0x008a }
            java.lang.String r3 = r3.f59858g     // Catch:{ RejectedExecutionException -> 0x008a }
            r8[r2] = r3     // Catch:{ RejectedExecutionException -> 0x008a }
            r16 = r6
            r17 = r0
            r19 = r8
            r21 = r7
            r16.<init>(r17, r18, r19, r20, r21)     // Catch:{ RejectedExecutionException -> 0x008a }
            java.util.concurrent.ScheduledThreadPoolExecutor r5 = (java.util.concurrent.ScheduledThreadPoolExecutor) r5     // Catch:{ RejectedExecutionException -> 0x008a }
            r5.execute(r6)     // Catch:{ RejectedExecutionException -> 0x008a }
            goto L_0x008a
        L_0x0125:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r2] = r3
            java.lang.String r2 = "TYPE_SETTINGS length %% 6 != 0: %s"
            j24.C21161e.m23586b(r2, r0)
            throw r5
        L_0x0133:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r2 = "TYPE_SETTINGS streamId != 0"
            j24.C21161e.m23586b(r2, r0)
            throw r5
        L_0x013b:
            if (r3 != r8) goto L_0x01ba
            if (r10 == 0) goto L_0x01b2
            o24.j r3 = r1.f59915d
            int r3 = r3.readInt()
            j24.b[] r6 = j24.C21156b.values()
            int r7 = r6.length
            r8 = 0
        L_0x014b:
            if (r8 >= r7) goto L_0x0157
            r9 = r6[r8]
            int r11 = r9.f59809d
            if (r11 != r3) goto L_0x0154
            goto L_0x0158
        L_0x0154:
            int r8 = r8 + 1
            goto L_0x014b
        L_0x0157:
            r9 = r5
        L_0x0158:
            if (r9 == 0) goto L_0x01a4
            j24.g$g r0 = (j24.C21164g.C21172g) r0
            j24.g r3 = j24.C21164g.this
            r3.getClass()
            if (r10 == 0) goto L_0x0169
            r3 = r10 & 1
            if (r3 != 0) goto L_0x0169
            r3 = 1
            goto L_0x016a
        L_0x0169:
            r3 = 0
        L_0x016a:
            if (r3 == 0) goto L_0x018c
            j24.g r0 = j24.C21164g.this
            j24.l r3 = new j24.l
            java.lang.Object[] r15 = new java.lang.Object[r15]
            java.lang.String r5 = r0.f59858g
            r15[r2] = r5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            r15[r4] = r2
            java.lang.String r14 = "OkHttp %s Push Reset[%s]"
            r12 = r3
            r13 = r0
            r16 = r10
            r17 = r9
            r12.<init>(r13, r14, r15, r16, r17)
            r0.mo33127d(r3)
            goto L_0x008a
        L_0x018c:
            j24.g r0 = j24.C21164g.this
            j24.q r2 = r0.mo33128e(r10)
            if (r2 == 0) goto L_0x008a
            monitor-enter(r2)
            j24.b r0 = r2.f59935k     // Catch:{ all -> 0x01a1 }
            if (r0 != 0) goto L_0x019e
            r2.f59935k = r9     // Catch:{ all -> 0x01a1 }
            r2.notifyAll()     // Catch:{ all -> 0x01a1 }
        L_0x019e:
            monitor-exit(r2)
            goto L_0x008a
        L_0x01a1:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x01a4:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r2] = r3
            java.lang.String r2 = "TYPE_RST_STREAM unexpected error code: %d"
            j24.C21161e.m23586b(r2, r0)
            throw r5
        L_0x01b2:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r2 = "TYPE_RST_STREAM streamId == 0"
            j24.C21161e.m23586b(r2, r0)
            throw r5
        L_0x01ba:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r2] = r3
            java.lang.String r2 = "TYPE_RST_STREAM length: %d != 4"
            j24.C21161e.m23586b(r2, r0)
            throw r5
        L_0x01c8:
            if (r3 != r11) goto L_0x01e3
            if (r10 == 0) goto L_0x01db
            o24.j r2 = r1.f59915d
            r2.readInt()
            o24.j r2 = r1.f59915d
            r2.readByte()
            r24.getClass()
            goto L_0x008a
        L_0x01db:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r2 = "TYPE_PRIORITY streamId == 0"
            j24.C21161e.m23586b(r2, r0)
            throw r5
        L_0x01e3:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r2] = r3
            java.lang.String r2 = "TYPE_PRIORITY length: %d != 5"
            j24.C21161e.m23586b(r2, r0)
            throw r5
        L_0x01f1:
            if (r10 == 0) goto L_0x02ff
            r5 = r9 & 1
            if (r5 == 0) goto L_0x01f9
            r5 = 1
            goto L_0x01fa
        L_0x01f9:
            r5 = 0
        L_0x01fa:
            r6 = r9 & 8
            if (r6 == 0) goto L_0x0208
            o24.j r6 = r1.f59915d
            byte r6 = r6.readByte()
            r6 = r6 & 255(0xff, float:3.57E-43)
            short r6 = (short) r6
            goto L_0x0209
        L_0x0208:
            r6 = 0
        L_0x0209:
            r7 = r9 & 32
            if (r7 == 0) goto L_0x021c
            o24.j r7 = r1.f59915d
            r7.readInt()
            o24.j r7 = r1.f59915d
            r7.readByte()
            r24.getClass()
            int r3 = r3 + -5
        L_0x021c:
            int r3 = m23620a(r3, r9, r6)
            java.util.List r17 = r1.mo33139e(r3, r6, r9, r10)
            j24.g$g r0 = (j24.C21164g.C21172g) r0
            j24.g r3 = j24.C21164g.this
            r3.getClass()
            if (r10 == 0) goto L_0x0233
            r3 = r10 & 1
            if (r3 != 0) goto L_0x0233
            r3 = 1
            goto L_0x0234
        L_0x0233:
            r3 = 0
        L_0x0234:
            if (r3 == 0) goto L_0x0259
            j24.g r0 = j24.C21164g.this
            r0.getClass()
            j24.j r3 = new j24.j     // Catch:{ RejectedExecutionException -> 0x008a }
            java.lang.String r14 = "OkHttp %s Push Headers[%s]"
            java.lang.Object[] r15 = new java.lang.Object[r15]     // Catch:{ RejectedExecutionException -> 0x008a }
            java.lang.String r6 = r0.f59858g     // Catch:{ RejectedExecutionException -> 0x008a }
            r15[r2] = r6     // Catch:{ RejectedExecutionException -> 0x008a }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)     // Catch:{ RejectedExecutionException -> 0x008a }
            r15[r4] = r2     // Catch:{ RejectedExecutionException -> 0x008a }
            r12 = r3
            r13 = r0
            r16 = r10
            r18 = r5
            r12.<init>(r13, r14, r15, r16, r17, r18)     // Catch:{ RejectedExecutionException -> 0x008a }
            r0.mo33127d(r3)     // Catch:{ RejectedExecutionException -> 0x008a }
            goto L_0x008a
        L_0x0259:
            j24.g r3 = j24.C21164g.this
            monitor-enter(r3)
            j24.g r6 = j24.C21164g.this     // Catch:{ all -> 0x02fc }
            j24.q r6 = r6.mo33125c(r10)     // Catch:{ all -> 0x02fc }
            if (r6 != 0) goto L_0x02bc
            j24.g r6 = j24.C21164g.this     // Catch:{ all -> 0x02fc }
            boolean r7 = r6.f59861j     // Catch:{ all -> 0x02fc }
            if (r7 == 0) goto L_0x026d
            monitor-exit(r3)     // Catch:{ all -> 0x02fc }
            goto L_0x008a
        L_0x026d:
            int r7 = r6.f59859h     // Catch:{ all -> 0x02fc }
            if (r10 > r7) goto L_0x0274
            monitor-exit(r3)     // Catch:{ all -> 0x02fc }
            goto L_0x008a
        L_0x0274:
            int r7 = r10 % 2
            int r6 = r6.f59860i     // Catch:{ all -> 0x02fc }
            int r6 = r6 % r15
            if (r7 != r6) goto L_0x027e
            monitor-exit(r3)     // Catch:{ all -> 0x02fc }
            goto L_0x008a
        L_0x027e:
            d24.r r17 = e24.C20509c.m22214t(r17)     // Catch:{ all -> 0x02fc }
            j24.q r6 = new j24.q     // Catch:{ all -> 0x02fc }
            j24.g r14 = j24.C21164g.this     // Catch:{ all -> 0x02fc }
            r7 = 0
            r12 = r6
            r13 = r10
            r8 = 2
            r15 = r7
            r16 = r5
            r12.<init>(r13, r14, r15, r16, r17)     // Catch:{ all -> 0x02fc }
            j24.g r5 = j24.C21164g.this     // Catch:{ all -> 0x02fc }
            r5.f59859h = r10     // Catch:{ all -> 0x02fc }
            java.util.Map<java.lang.Integer, j24.q> r5 = r5.f59857f     // Catch:{ all -> 0x02fc }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x02fc }
            r5.put(r7, r6)     // Catch:{ all -> 0x02fc }
            java.util.concurrent.ExecutorService r5 = j24.C21164g.f59851D     // Catch:{ all -> 0x02fc }
            j24.m r7 = new j24.m     // Catch:{ all -> 0x02fc }
            java.lang.String r9 = "OkHttp %s stream %d"
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ all -> 0x02fc }
            j24.g r11 = j24.C21164g.this     // Catch:{ all -> 0x02fc }
            java.lang.String r11 = r11.f59858g     // Catch:{ all -> 0x02fc }
            r8[r2] = r11     // Catch:{ all -> 0x02fc }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x02fc }
            r8[r4] = r2     // Catch:{ all -> 0x02fc }
            r7.<init>(r0, r9, r8, r6)     // Catch:{ all -> 0x02fc }
            java.util.concurrent.ThreadPoolExecutor r5 = (java.util.concurrent.ThreadPoolExecutor) r5     // Catch:{ all -> 0x02fc }
            r5.execute(r7)     // Catch:{ all -> 0x02fc }
            monitor-exit(r3)     // Catch:{ all -> 0x02fc }
            goto L_0x008a
        L_0x02bc:
            monitor-exit(r3)     // Catch:{ all -> 0x02fc }
            monitor-enter(r6)
            r6.f59930f = r4     // Catch:{ all -> 0x02f9 }
            java.util.Deque<d24.r> r0 = r6.f59929e     // Catch:{ all -> 0x02f9 }
            d24.r r2 = e24.C20509c.m22214t(r17)     // Catch:{ all -> 0x02f9 }
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0     // Catch:{ all -> 0x02f9 }
            r0.add(r2)     // Catch:{ all -> 0x02f9 }
            boolean r0 = r6.mo33148f()     // Catch:{ all -> 0x02f9 }
            r6.notifyAll()     // Catch:{ all -> 0x02f9 }
            monitor-exit(r6)     // Catch:{ all -> 0x02f9 }
            if (r0 != 0) goto L_0x02dc
            j24.g r0 = r6.f59928d
            int r2 = r6.f59927c
            r0.mo33128e(r2)
        L_0x02dc:
            if (r5 == 0) goto L_0x008a
            monitor-enter(r6)
            j24.q$b r0 = r6.f59931g     // Catch:{ all -> 0x02f6 }
            r0.f59944h = r4     // Catch:{ all -> 0x02f6 }
            boolean r0 = r6.mo33148f()     // Catch:{ all -> 0x02f6 }
            r6.notifyAll()     // Catch:{ all -> 0x02f6 }
            monitor-exit(r6)     // Catch:{ all -> 0x02f6 }
            if (r0 != 0) goto L_0x008a
            j24.g r0 = r6.f59928d
            int r2 = r6.f59927c
            r0.mo33128e(r2)
            goto L_0x008a
        L_0x02f6:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x02f6 }
            throw r0
        L_0x02f9:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x02f9 }
            throw r0
        L_0x02fc:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x02fc }
            throw r0
        L_0x02ff:
            java.lang.String r0 = "PROTOCOL_ERROR: TYPE_HEADERS streamId == 0"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            j24.C21161e.m23586b(r0, r2)
            throw r5
        L_0x0307:
            r8 = 2
            if (r10 == 0) goto L_0x0491
            r6 = r9 & 1
            if (r6 == 0) goto L_0x0311
            r19 = 1
            goto L_0x0313
        L_0x0311:
            r19 = 0
        L_0x0313:
            r6 = r9 & 32
            if (r6 == 0) goto L_0x0319
            r6 = 1
            goto L_0x031a
        L_0x0319:
            r6 = 0
        L_0x031a:
            if (r6 != 0) goto L_0x0488
            r5 = r9 & 8
            if (r5 == 0) goto L_0x032a
            o24.j r5 = r1.f59915d
            byte r5 = r5.readByte()
            r5 = r5 & 255(0xff, float:3.57E-43)
            short r5 = (short) r5
            goto L_0x032b
        L_0x032a:
            r5 = 0
        L_0x032b:
            int r3 = m23620a(r3, r9, r5)
            o24.j r6 = r1.f59915d
            j24.g$g r0 = (j24.C21164g.C21172g) r0
            j24.g r7 = j24.C21164g.this
            r7.getClass()
            if (r10 == 0) goto L_0x0340
            r7 = r10 & 1
            if (r7 != 0) goto L_0x0340
            r7 = 1
            goto L_0x0341
        L_0x0340:
            r7 = 0
        L_0x0341:
            if (r7 == 0) goto L_0x0395
            j24.g r0 = j24.C21164g.this
            r0.getClass()
            o24.h r7 = new o24.h
            r7.<init>()
            long r11 = (long) r3
            r6.mo34121G0(r11)
            r6.mo32327L0(r7, r11)
            long r13 = r7.f61695e
            int r6 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r6 != 0) goto L_0x0379
            j24.k r6 = new j24.k
            java.lang.Object[] r15 = new java.lang.Object[r8]
            java.lang.String r8 = r0.f59858g
            r15[r2] = r8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            r15[r4] = r2
            java.lang.String r14 = "OkHttp %s Push Data[%s]"
            r12 = r6
            r13 = r0
            r16 = r10
            r17 = r7
            r18 = r3
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r0.mo33127d(r6)
            goto L_0x03ad
        L_0x0379:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            long r4 = r7.f61695e
            r2.append(r4)
            java.lang.String r4 = " != "
            r2.append(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x0395:
            j24.g r7 = j24.C21164g.this
            j24.q r7 = r7.mo33125c(r10)
            if (r7 != 0) goto L_0x03b1
            j24.g r2 = j24.C21164g.this
            j24.b r7 = j24.C21156b.PROTOCOL_ERROR
            r2.mo33133k(r10, r7)
            j24.g r0 = j24.C21164g.this
            long r2 = (long) r3
            r0.mo33131i(r2)
            r6.skip(r2)
        L_0x03ad:
            r16 = r5
            goto L_0x047e
        L_0x03b1:
            j24.q$b r0 = r7.f59931g
            long r8 = (long) r3
        L_0x03b4:
            r10 = 0
            int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r3 <= 0) goto L_0x045c
            j24.q r3 = j24.C21184q.this
            monitor-enter(r3)
            boolean r12 = r0.f59944h     // Catch:{ all -> 0x0459 }
            o24.h r13 = r0.f59941e     // Catch:{ all -> 0x0459 }
            long r13 = r13.f61695e     // Catch:{ all -> 0x0459 }
            long r13 = r13 + r8
            r16 = r5
            long r4 = r0.f59942f     // Catch:{ all -> 0x0459 }
            int r17 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r17 <= 0) goto L_0x03ce
            r4 = 1
            goto L_0x03cf
        L_0x03ce:
            r4 = 0
        L_0x03cf:
            monitor-exit(r3)     // Catch:{ all -> 0x0459 }
            if (r4 == 0) goto L_0x03ea
            r6.skip(r8)
            j24.q r0 = j24.C21184q.this
            j24.b r2 = j24.C21156b.FLOW_CONTROL_ERROR
            boolean r3 = r0.mo33146d(r2)
            if (r3 != 0) goto L_0x03e1
            goto L_0x0461
        L_0x03e1:
            j24.g r3 = r0.f59928d
            int r0 = r0.f59927c
            r3.mo33133k(r0, r2)
            goto L_0x0461
        L_0x03ea:
            if (r12 == 0) goto L_0x03f1
            r6.skip(r8)
            goto L_0x0461
        L_0x03f1:
            o24.h r3 = r0.f59940d
            long r3 = r6.mo32327L0(r3, r8)
            r12 = -1
            int r5 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r5 == 0) goto L_0x0453
            long r8 = r8 - r3
            j24.q r3 = j24.C21184q.this
            monitor-enter(r3)
            boolean r4 = r0.f59943g     // Catch:{ all -> 0x044f }
            if (r4 == 0) goto L_0x040e
            o24.h r4 = r0.f59940d     // Catch:{ all -> 0x044f }
            long r12 = r4.f61695e     // Catch:{ all -> 0x044f }
            r4.skip(r12)     // Catch:{ all -> 0x044f }
            r5 = r3
            goto L_0x0436
        L_0x040e:
            o24.h r4 = r0.f59941e     // Catch:{ all -> 0x044f }
            r5 = r3
            long r2 = r4.f61695e     // Catch:{ all -> 0x044d }
            int r17 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r17 != 0) goto L_0x0419
            r2 = 1
            goto L_0x041a
        L_0x0419:
            r2 = 0
        L_0x041a:
            o24.h r3 = r0.f59940d     // Catch:{ all -> 0x044d }
            java.lang.String r14 = "source"
            gy3.C87412m.m108594g(r3, r14)     // Catch:{ all -> 0x044d }
        L_0x0422:
            r14 = 8192(0x2000, float:1.14794E-41)
            long r10 = (long) r14     // Catch:{ all -> 0x044d }
            long r10 = r3.mo32327L0(r4, r10)     // Catch:{ all -> 0x044d }
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 != 0) goto L_0x044a
            if (r2 == 0) goto L_0x0434
            j24.q r2 = j24.C21184q.this     // Catch:{ all -> 0x044d }
            r2.notifyAll()     // Catch:{ all -> 0x044d }
        L_0x0434:
            r12 = 0
        L_0x0436:
            monitor-exit(r5)     // Catch:{ all -> 0x044d }
            r10 = 0
            int r2 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r2 <= 0) goto L_0x0444
            j24.q r2 = j24.C21184q.this
            j24.g r2 = r2.f59928d
            r2.mo33131i(r12)
        L_0x0444:
            r5 = r16
            r2 = 0
            r4 = 1
            goto L_0x03b4
        L_0x044a:
            r10 = 0
            goto L_0x0422
        L_0x044d:
            r0 = move-exception
            goto L_0x0451
        L_0x044f:
            r0 = move-exception
            r5 = r3
        L_0x0451:
            monitor-exit(r5)     // Catch:{ all -> 0x044d }
            throw r0
        L_0x0453:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        L_0x0459:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0459 }
            throw r0
        L_0x045c:
            r16 = r5
            r0.getClass()
        L_0x0461:
            if (r19 == 0) goto L_0x047e
            monitor-enter(r7)
            j24.q$b r0 = r7.f59931g     // Catch:{ all -> 0x047b }
            r2 = 1
            r0.f59944h = r2     // Catch:{ all -> 0x047b }
            boolean r0 = r7.mo33148f()     // Catch:{ all -> 0x047b }
            r7.notifyAll()     // Catch:{ all -> 0x047b }
            monitor-exit(r7)     // Catch:{ all -> 0x047b }
            if (r0 != 0) goto L_0x047e
            j24.g r0 = r7.f59928d
            int r2 = r7.f59927c
            r0.mo33128e(r2)
            goto L_0x047e
        L_0x047b:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x047b }
            throw r0
        L_0x047e:
            o24.j r0 = r1.f59915d
            r2 = r16
            long r2 = (long) r2
            r0.skip(r2)
            goto L_0x008a
        L_0x0488:
            java.lang.String r0 = "PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA"
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            j24.C21161e.m23586b(r0, r2)
            throw r5
        L_0x0491:
            java.lang.String r0 = "PROTOCOL_ERROR: TYPE_DATA streamId == 0"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            j24.C21161e.m23586b(r0, r2)
            throw r5
        L_0x0499:
            return r0
        L_0x049a:
            r0 = 1
            java.lang.String r2 = "FRAME_SIZE_ERROR: %s"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 0
            r0[r4] = r3
            j24.C21161e.m23586b(r2, r0)
            throw r5
        L_0x04aa:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: j24.C21181p.mo33135b(boolean, j24.p$b):boolean");
    }

    /* renamed from: c */
    public void mo33136c(C21183b bVar) {
        if (!this.f59917f) {
            C21768j jVar = this.f59915d;
            C21769k kVar = C21161e.f59837a;
            C21769k G = jVar.mo34120G((long) kVar.mo34085f());
            Logger logger = f59914h;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(C20509c.m22204j("<< CONNECTION %s", G.mo34086g()));
            }
            if (!kVar.equals(G)) {
                C21161e.m23586b("Expected a connection header but was %s", G.mo34163n());
                throw null;
            }
        } else if (!mo33135b(true, bVar)) {
            C21161e.m23586b("Required SETTINGS preface not received", new Object[0]);
            throw null;
        }
    }

    public void close() {
        this.f59915d.close();
    }

    /* renamed from: d */
    public final void mo33138d(C21183b bVar, int i, byte b, int i2) {
        C21156b bVar2;
        C21184q[] qVarArr;
        if (i < 8) {
            C21161e.m23586b("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i));
            throw null;
        } else if (i2 == 0) {
            int readInt = this.f59915d.readInt();
            int readInt2 = this.f59915d.readInt();
            int i3 = i - 8;
            C21156b[] values = C21156b.values();
            int length = values.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    bVar2 = null;
                    break;
                }
                bVar2 = values[i4];
                if (bVar2.f59809d == readInt2) {
                    break;
                }
                i4++;
            }
            if (bVar2 != null) {
                C21769k kVar = C21769k.f61696g;
                if (i3 > 0) {
                    kVar = this.f59915d.mo34120G((long) i3);
                }
                C21164g.C21172g gVar = (C21164g.C21172g) bVar;
                gVar.getClass();
                kVar.mo34085f();
                synchronized (C21164g.this) {
                    qVarArr = (C21184q[]) ((LinkedHashMap) C21164g.this.f59857f).values().toArray(new C21184q[C21164g.this.f59857f.size()]);
                    C21164g.this.f59861j = true;
                }
                for (C21184q qVar : qVarArr) {
                    if (qVar.f59927c > readInt && qVar.mo33147e()) {
                        C21156b bVar3 = C21156b.REFUSED_STREAM;
                        synchronized (qVar) {
                            if (qVar.f59935k == null) {
                                qVar.f59935k = bVar3;
                                qVar.notifyAll();
                            }
                        }
                        C21164g.this.mo33128e(qVar.f59927c);
                    }
                }
                return;
            }
            C21161e.m23586b("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt2));
            throw null;
        } else {
            C21161e.m23586b("TYPE_GOAWAY streamId != 0", new Object[0]);
            throw null;
        }
    }

    /* renamed from: e */
    public final List<C21157c> mo33139e(int i, short s, byte b, int i2) {
        C21182a aVar = this.f59916e;
        aVar.f59923h = i;
        aVar.f59920e = i;
        aVar.f59924i = s;
        aVar.f59921f = b;
        aVar.f59922g = i2;
        C21158d.C21159a aVar2 = this.f59918g;
        while (!((C21783x) aVar2.f59822b).mo34134e0()) {
            byte readByte = ((C21783x) aVar2.f59822b).readByte() & ExifInterface.MARKER;
            if (readByte != 128) {
                boolean z = false;
                if ((readByte & 128) == 128) {
                    int e = aVar2.mo33117e(readByte, 127) - 1;
                    if (e >= 0 && e <= C21158d.f59819a.length - 1) {
                        z = true;
                    }
                    if (z) {
                        ((ArrayList) aVar2.f59821a).add(C21158d.f59819a[e]);
                    } else {
                        int length = aVar2.f59826f + 1 + (e - C21158d.f59819a.length);
                        if (length >= 0) {
                            C21157c[] cVarArr = aVar2.f59825e;
                            if (length < cVarArr.length) {
                                ((ArrayList) aVar2.f59821a).add(cVarArr[length]);
                            }
                        }
                        throw new IOException("Header index too large " + (e + 1));
                    }
                } else if (readByte == 64) {
                    C21769k d = aVar2.mo33116d();
                    C21158d.m23574a(d);
                    aVar2.mo33115c(-1, new C21157c(d, aVar2.mo33116d()));
                } else if ((readByte & 64) == 64) {
                    aVar2.mo33115c(-1, new C21157c(aVar2.mo33114b(aVar2.mo33117e(readByte, 63) - 1), aVar2.mo33116d()));
                } else if ((readByte & 32) == 32) {
                    int e2 = aVar2.mo33117e(readByte, 31);
                    aVar2.f59824d = e2;
                    if (e2 < 0 || e2 > aVar2.f59823c) {
                        throw new IOException("Invalid dynamic table size update " + aVar2.f59824d);
                    }
                    int i3 = aVar2.f59828h;
                    if (e2 < i3) {
                        if (e2 == 0) {
                            Arrays.fill(aVar2.f59825e, (Object) null);
                            aVar2.f59826f = aVar2.f59825e.length - 1;
                            aVar2.f59827g = 0;
                            aVar2.f59828h = 0;
                        } else {
                            aVar2.mo33113a(i3 - e2);
                        }
                    }
                } else if (readByte == 16 || readByte == 0) {
                    C21769k d2 = aVar2.mo33116d();
                    C21158d.m23574a(d2);
                    ((ArrayList) aVar2.f59821a).add(new C21157c(d2, aVar2.mo33116d()));
                } else {
                    ((ArrayList) aVar2.f59821a).add(new C21157c(aVar2.mo33114b(aVar2.mo33117e(readByte, 15) - 1), aVar2.mo33116d()));
                }
            } else {
                throw new IOException("index == 0");
            }
        }
        C21158d.C21159a aVar3 = this.f59918g;
        aVar3.getClass();
        ArrayList arrayList = new ArrayList(aVar3.f59821a);
        ((ArrayList) aVar3.f59821a).clear();
        return arrayList;
    }

    /* renamed from: g */
    public final void mo33140g(C21183b bVar, int i, byte b, int i2) {
        boolean z = false;
        if (i != 8) {
            C21161e.m23586b("TYPE_PING length != 8: %s", Integer.valueOf(i));
            throw null;
        } else if (i2 == 0) {
            int readInt = this.f59915d.readInt();
            int readInt2 = this.f59915d.readInt();
            if ((b & 1) != 0) {
                z = true;
            }
            C21164g.C21172g gVar = (C21164g.C21172g) bVar;
            gVar.getClass();
            if (z) {
                synchronized (C21164g.this) {
                    if (readInt == 1) {
                        try {
                            C21164g.this.f59866r++;
                        } catch (Throwable th) {
                            throw th;
                        }
                    } else if (readInt == 2) {
                        C21164g.this.f59868t++;
                    } else if (readInt == 3) {
                        C21164g gVar2 = C21164g.this;
                        gVar2.getClass();
                        gVar2.notifyAll();
                    }
                }
                return;
            }
            try {
                C21164g gVar3 = C21164g.this;
                ((ScheduledThreadPoolExecutor) gVar3.f59862n).execute(new C21164g.C21171f(true, readInt, readInt2));
            } catch (RejectedExecutionException unused) {
            }
        } else {
            C21161e.m23586b("TYPE_PING streamId != 0", new Object[0]);
            throw null;
        }
    }

    /* renamed from: i */
    public final void mo33141i(C21183b bVar, int i, byte b, int i2) {
        if (i2 != 0) {
            short readByte = (b & 8) != 0 ? (short) (this.f59915d.readByte() & ExifInterface.MARKER) : 0;
            int readInt = this.f59915d.readInt() & Integer.MAX_VALUE;
            List<C21157c> e = mo33139e(m23620a(i - 4, b, readByte), readByte, b, i2);
            C21164g gVar = C21164g.this;
            synchronized (gVar) {
                if (gVar.f59854C.contains(Integer.valueOf(readInt))) {
                    gVar.mo33133k(readInt, C21156b.PROTOCOL_ERROR);
                    return;
                }
                gVar.f59854C.add(Integer.valueOf(readInt));
                try {
                    gVar.mo33127d(new C21174i(gVar, "OkHttp %s Push Request[%s]", new Object[]{gVar.f59858g, Integer.valueOf(readInt)}, readInt, e));
                } catch (RejectedExecutionException unused) {
                }
            }
        } else {
            C21161e.m23586b("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
            throw null;
        }
    }

    /* renamed from: j */
    public final void mo33142j(C21183b bVar, int i, byte b, int i2) {
        if (i == 4) {
            long readInt = ((long) this.f59915d.readInt()) & 2147483647L;
            int i3 = (readInt > 0 ? 1 : (readInt == 0 ? 0 : -1));
            if (i3 != 0) {
                C21164g.C21172g gVar = (C21164g.C21172g) bVar;
                if (i2 == 0) {
                    synchronized (C21164g.this) {
                        C21164g gVar2 = C21164g.this;
                        gVar2.f59871w += readInt;
                        gVar2.notifyAll();
                    }
                    return;
                }
                C21184q c = C21164g.this.mo33125c(i2);
                if (c != null) {
                    synchronized (c) {
                        c.f59926b += readInt;
                        if (i3 > 0) {
                            c.notifyAll();
                        }
                    }
                    return;
                }
                return;
            }
            C21161e.m23586b("windowSizeIncrement was 0", Long.valueOf(readInt));
            throw null;
        }
        C21161e.m23586b("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i));
        throw null;
    }
}
