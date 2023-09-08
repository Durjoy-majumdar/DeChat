package com.tencent.p014mm.plugin.talkroom.component;

import android.media.AudioTrack;
import android.os.Looper;
import android.os.RemoteException;
import com.tencent.p014mm.plugin.talkroom.component.C115790d;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import p331dj.C107045e;
import pu0.C110248b;
import sx2.C110815a;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.talkroom.component.g */
public class C115803g extends C115790d.C115791a implements Runnable {

    /* renamed from: z */
    public static final int f347383z = C110815a.f331537a;

    /* renamed from: e */
    public int f347384e;

    /* renamed from: f */
    public int f347385f;

    /* renamed from: g */
    public AudioTrack f347386g;

    /* renamed from: h */
    public v2engine f347387h;

    /* renamed from: i */
    public final C115784b f347388i;

    /* renamed from: j */
    public MMHandler f347389j = new MMHandler(Looper.getMainLooper());

    /* renamed from: n */
    public final Object f347390n = new Object();

    /* renamed from: o */
    public boolean f347391o = false;

    /* renamed from: p */
    public boolean f347392p;

    /* renamed from: q */
    public boolean f347393q = true;

    /* renamed from: r */
    public boolean f347394r = false;

    /* renamed from: s */
    public long f347395s = 0;

    /* renamed from: t */
    public boolean f347396t = true;

    /* renamed from: u */
    public int f347397u;

    /* renamed from: v */
    public int f347398v = 0;

    /* renamed from: w */
    public long f347399w = 0;

    /* renamed from: x */
    public short f347400x;

    /* renamed from: y */
    public short f347401y;

    /* renamed from: com.tencent.mm.plugin.talkroom.component.g$a */
    public class C115804a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ PInt f347402d;

        /* renamed from: e */
        public final /* synthetic */ PInt f347403e;

        /* renamed from: f */
        public final /* synthetic */ boolean f347404f;

        public C115804a(PInt pInt, PInt pInt2, boolean z) {
            this.f347402d = pInt;
            this.f347403e = pInt2;
            this.f347404f = z;
        }

        public void run() {
            C115803g gVar = C115803g.this;
            gVar.f347394r = true;
            try {
                gVar.f347388i.mo176152IV(this.f347402d.value, this.f347403e.value, this.f347404f);
            } catch (RemoteException e) {
                Log.printErrStackTrace("MicroMsg.TalkRoomPlayer", e, "", new Object[0]);
            }
            C115803g.this.f347394r = false;
        }
    }

    public C115803g(v2engine v2engine, C115784b bVar) {
        int i = f347383z;
        this.f347384e = i;
        this.f347385f = (i / 1000) * 20 * 2;
        this.f347387h = v2engine;
        this.f347388i = bVar;
        this.f347392p = true;
        AudioTrack audioTrack = this.f347386g;
        if (audioTrack != null && audioTrack.getState() == 1) {
            this.f347386g.stop();
        }
        AudioTrack audioTrack2 = this.f347386g;
        if (audioTrack2 != null) {
            try {
                audioTrack2.release();
            } catch (Exception unused) {
            }
        }
        C110248b.wx0("music").mo107365b0(true);
        int h = C110248b.f329777h.mo161663h(true);
        int minBufferSize = AudioTrack.getMinBufferSize(this.f347384e, 2, 2);
        if (minBufferSize != -2 && minBufferSize != -1) {
            this.f347386g = new C107045e(h, this.f347384e, 2, 2, minBufferSize * 8, 1);
            this.f347392p = false;
        }
    }

    /* renamed from: R5 */
    public int mo176164R5() {
        short s = this.f347401y;
        short s2 = this.f347400x;
        if (s < s2) {
            this.f347401y = s2;
        }
        short s3 = this.f347401y;
        if (s3 == 0) {
            return 0;
        }
        short s4 = (short) ((s2 * 100) / s3);
        this.f347400x = 0;
        return s4;
    }

    /* renamed from: W */
    public void mo176165W() {
        this.f347393q = true;
        AudioTrack audioTrack = this.f347386g;
        if (audioTrack != null && audioTrack.getState() == 1) {
            this.f347386g.pause();
        }
    }

    /* renamed from: Z */
    public void mo176166Z() {
        AudioTrack audioTrack = this.f347386g;
        if (audioTrack != null && audioTrack.getState() == 1) {
            this.f347386g.play();
        }
        synchronized (this.f347390n) {
            this.f347393q = false;
            this.f347390n.notify();
        }
        this.f347401y = 0;
        this.f347400x = 0;
    }

    public void release() {
        Log.m105924i("MicroMsg.TalkRoomPlayer", "release");
        this.f347391o = true;
        AudioTrack audioTrack = this.f347386g;
        if (audioTrack != null && audioTrack.getState() == 1) {
            this.f347386g.stop();
        }
        AudioTrack audioTrack2 = this.f347386g;
        if (audioTrack2 != null) {
            audioTrack2.release();
        }
        synchronized (this.f347390n) {
            this.f347393q = false;
            this.f347390n.notify();
        }
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void run() {
        /*
            r12 = this;
        L_0x0000:
            boolean r0 = r12.f347391o
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = r12.f347392p
            r1 = 0
            if (r0 == 0) goto L_0x001b
            r2 = 50
            java.lang.Thread.sleep(r2)     // Catch:{ InterruptedException -> 0x0010 }
            goto L_0x0000
        L_0x0010:
            r0 = move-exception
            java.lang.String r2 = "MicroMsg.TalkRoomPlayer"
            java.lang.String r3 = ""
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r3, r1)
            goto L_0x0000
        L_0x001b:
            java.lang.Object r0 = r12.f347390n
            monitor-enter(r0)
            boolean r2 = r12.f347393q     // Catch:{ all -> 0x0147 }
            if (r2 == 0) goto L_0x0032
            java.lang.Object r2 = r12.f347390n     // Catch:{ InterruptedException -> 0x0028 }
            r2.wait()     // Catch:{ InterruptedException -> 0x0028 }
            goto L_0x0032
        L_0x0028:
            r2 = move-exception
            java.lang.String r3 = "MicroMsg.TalkRoomPlayer"
            java.lang.String r4 = ""
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ all -> 0x0147 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r2, r4, r5)     // Catch:{ all -> 0x0147 }
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0147 }
            long r2 = r12.f347399w
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            r12.f347399w = r4
            long r4 = r4 - r2
            r2 = 20
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x005f
            r2 = 0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x005f
            java.lang.Object r0 = r12.f347390n     // Catch:{ InterruptedException -> 0x0055 }
            monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0055 }
            java.lang.Object r2 = r12.f347390n     // Catch:{ all -> 0x0052 }
            r2.wait(r4)     // Catch:{ all -> 0x0052 }
            monitor-exit(r0)     // Catch:{ all -> 0x0052 }
            goto L_0x005f
        L_0x0052:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0052 }
            throw r2     // Catch:{ InterruptedException -> 0x0055 }
        L_0x0055:
            r0 = move-exception
            java.lang.String r2 = "MicroMsg.TalkRoomPlayer"
            java.lang.String r3 = ""
            java.lang.Object[] r4 = new java.lang.Object[r1]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r3, r4)
        L_0x005f:
            com.tencent.mm.pointers.PByteArray r0 = new com.tencent.mm.pointers.PByteArray     // Catch:{ Exception -> 0x0132 }
            r0.<init>()     // Catch:{ Exception -> 0x0132 }
            com.tencent.mm.pointers.PInt r2 = new com.tencent.mm.pointers.PInt     // Catch:{ Exception -> 0x0132 }
            r2.<init>()     // Catch:{ Exception -> 0x0132 }
            com.tencent.mm.pointers.PInt r3 = new com.tencent.mm.pointers.PInt     // Catch:{ Exception -> 0x0132 }
            r3.<init>()     // Catch:{ Exception -> 0x0132 }
            com.tencent.mm.plugin.talkroom.component.v2engine r4 = r12.f347387h     // Catch:{ Exception -> 0x0132 }
            int r4 = r4.IsSilenceFrame()     // Catch:{ Exception -> 0x0132 }
            if (r4 != 0) goto L_0x007f
            com.tencent.mm.plugin.talkroom.component.v2engine r5 = r12.f347387h     // Catch:{ Exception -> 0x0132 }
            int r6 = r12.f347385f     // Catch:{ Exception -> 0x0132 }
            int r5 = r5.GetAudioData(r0, r6, r2, r3)     // Catch:{ Exception -> 0x0132 }
            goto L_0x0080
        L_0x007f:
            r5 = 0
        L_0x0080:
            r6 = 2
            r7 = 1
            if (r5 >= 0) goto L_0x00ac
            int r0 = r12.f347398v     // Catch:{ Exception -> 0x0132 }
            int r0 = r0 + r7
            r12.f347398v = r0     // Catch:{ Exception -> 0x0132 }
            java.lang.String r0 = "MicroMsg.TalkRoomPlayer"
            java.lang.String r2 = "GetAudioData err %d,  errcount %d"
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0132 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x0132 }
            r3[r1] = r4     // Catch:{ Exception -> 0x0132 }
            int r4 = r12.f347398v     // Catch:{ Exception -> 0x0132 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0132 }
            r3[r7] = r4     // Catch:{ Exception -> 0x0132 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r2, r3)     // Catch:{ Exception -> 0x0132 }
            int r0 = r12.f347398v     // Catch:{ Exception -> 0x0132 }
            r2 = 100
            if (r0 < r2) goto L_0x0000
            r12.f347398v = r1     // Catch:{ Exception -> 0x0132 }
            r12.f347393q = r7     // Catch:{ Exception -> 0x0132 }
            goto L_0x0000
        L_0x00ac:
            if (r4 != 0) goto L_0x00e4
            android.media.AudioTrack r5 = r12.f347386g     // Catch:{ Exception -> 0x0132 }
            int r5 = r5.getPlayState()     // Catch:{ Exception -> 0x0132 }
            r8 = 3
            if (r5 == r8) goto L_0x00bc
            android.media.AudioTrack r5 = r12.f347386g     // Catch:{ Exception -> 0x0132 }
            r5.play()     // Catch:{ Exception -> 0x0132 }
        L_0x00bc:
            byte[] r5 = r0.value     // Catch:{ Exception -> 0x0132 }
            int r8 = r5.length     // Catch:{ Exception -> 0x0132 }
            r9 = 0
        L_0x00c0:
            int r10 = r8 / 2
            if (r9 >= r10) goto L_0x00db
            int r10 = r9 * 2
            byte r11 = r5[r10]     // Catch:{ Exception -> 0x0132 }
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r10 = r10 + 1
            byte r10 = r5[r10]     // Catch:{ Exception -> 0x0132 }
            int r10 = r10 << 8
            r10 = r10 | r11
            short r10 = (short) r10     // Catch:{ Exception -> 0x0132 }
            short r11 = r12.f347400x     // Catch:{ Exception -> 0x0132 }
            if (r10 <= r11) goto L_0x00d8
            r12.f347400x = r10     // Catch:{ Exception -> 0x0132 }
        L_0x00d8:
            int r9 = r9 + 1
            goto L_0x00c0
        L_0x00db:
            android.media.AudioTrack r5 = r12.f347386g     // Catch:{ Exception -> 0x0132 }
            byte[] r0 = r0.value     // Catch:{ Exception -> 0x0132 }
            int r6 = r0.length     // Catch:{ Exception -> 0x0132 }
            r5.write(r0, r1, r6)     // Catch:{ Exception -> 0x0132 }
            goto L_0x00ed
        L_0x00e4:
            boolean r0 = r12.f347396t     // Catch:{ Exception -> 0x0132 }
            if (r0 == 0) goto L_0x00ed
            android.media.AudioTrack r0 = r12.f347386g     // Catch:{ Exception -> 0x0132 }
            r0.pause()     // Catch:{ Exception -> 0x0132 }
        L_0x00ed:
            if (r4 != 0) goto L_0x00f7
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()     // Catch:{ Exception -> 0x0132 }
            r12.f347395s = r4     // Catch:{ Exception -> 0x0132 }
        L_0x00f5:
            r7 = 0
            goto L_0x0104
        L_0x00f7:
            long r4 = r12.f347395s     // Catch:{ Exception -> 0x0132 }
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r4)     // Catch:{ Exception -> 0x0132 }
            r8 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x0104
            goto L_0x00f5
        L_0x0104:
            boolean r0 = r12.f347396t     // Catch:{ Exception -> 0x0132 }
            if (r0 != 0) goto L_0x010e
            int r4 = r12.f347397u     // Catch:{ Exception -> 0x0132 }
            int r5 = r3.value     // Catch:{ Exception -> 0x0132 }
            if (r4 == r5) goto L_0x0114
        L_0x010e:
            if (r7 != 0) goto L_0x0114
            int r4 = r2.value     // Catch:{ Exception -> 0x0132 }
            if (r4 != 0) goto L_0x0118
        L_0x0114:
            if (r0 != 0) goto L_0x0000
            if (r7 == 0) goto L_0x0000
        L_0x0118:
            boolean r0 = r12.f347394r     // Catch:{ Exception -> 0x0132 }
            if (r0 != 0) goto L_0x0000
            if (r7 != 0) goto L_0x0124
            int r0 = r3.value     // Catch:{ Exception -> 0x0132 }
            if (r0 == 0) goto L_0x0124
            r12.f347397u = r0     // Catch:{ Exception -> 0x0132 }
        L_0x0124:
            com.tencent.mm.sdk.platformtools.MMHandler r0 = r12.f347389j     // Catch:{ Exception -> 0x0132 }
            com.tencent.mm.plugin.talkroom.component.g$a r4 = new com.tencent.mm.plugin.talkroom.component.g$a     // Catch:{ Exception -> 0x0132 }
            r4.<init>(r2, r3, r7)     // Catch:{ Exception -> 0x0132 }
            r0.postAtFrontOfQueue(r4)     // Catch:{ Exception -> 0x0132 }
            r12.f347396t = r7     // Catch:{ Exception -> 0x0132 }
            goto L_0x0000
        L_0x0132:
            r0 = move-exception
            java.lang.String r2 = "MicroMsg.TalkRoomPlayer"
            java.lang.String r3 = ""
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r3, r1)
            java.lang.String r1 = "MicroMsg.TalkRoomPlayer"
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            goto L_0x0000
        L_0x0147:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0147 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.talkroom.component.C115803g.run():void");
    }

    public void start() {
        ((C119157j) C119157j.f356862d).mo183884o(this);
    }
}
