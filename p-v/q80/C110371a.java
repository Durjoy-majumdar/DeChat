package q80;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p213oh.C11412b;
import p335eh.C107275e;
import p354kh.C109007c;
import rx3.C13598b0;

/* renamed from: q80.a */
public final class C110371a {

    /* renamed from: a */
    public int f330139a;

    /* renamed from: b */
    public int f330140b;

    /* renamed from: c */
    public boolean f330141c;

    /* renamed from: d */
    public final boolean f330142d;

    /* renamed from: e */
    public C32224a<C13598b0> f330143e;

    /* renamed from: f */
    public C32227p<? super byte[], ? super Long, C13598b0> f330144f;

    /* renamed from: g */
    public final C109007c f330145g;

    /* renamed from: h */
    public List<C107275e> f330146h = Collections.synchronizedList(new ArrayList());

    /* renamed from: i */
    public List<C107275e> f330147i = Collections.synchronizedList(new ArrayList());

    /* renamed from: j */
    public final List<C107275e> f330148j = Collections.synchronizedList(new ArrayList());

    /* renamed from: k */
    public volatile boolean f330149k;

    /* renamed from: l */
    public volatile boolean f330150l;

    /* renamed from: m */
    public volatile boolean f330151m;

    /* renamed from: n */
    public final String f330152n = "MicroMsg.AudioMixCodec";

    /* renamed from: o */
    public final Object f330153o = new Object();

    /* renamed from: p */
    public final Object f330154p = new Object();

    /* renamed from: q */
    public int f330155q;

    /* renamed from: r */
    public int f330156r;

    /* renamed from: s */
    public boolean f330157s;

    /* renamed from: t */
    public boolean f330158t;

    /* renamed from: u */
    public final Runnable f330159u;

    /* renamed from: v */
    public int f330160v;

    /* renamed from: q80.a$a */
    public static final class C110372a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C110371a f330161d;

        public C110372a(C110371a aVar) {
            this.f330161d = aVar;
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
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
            */
        public final void run() {
            /*
                r9 = this;
            L_0x0000:
                q80.a r0 = r9.f330161d
                boolean r0 = r0.f330150l
                if (r0 == 0) goto L_0x0112
                r0 = 0
                q80.a r1 = r9.f330161d     // Catch:{ Exception -> 0x00f2 }
                java.lang.Object r2 = r1.f330153o     // Catch:{ Exception -> 0x00f2 }
                monitor-enter(r2)     // Catch:{ Exception -> 0x00f2 }
                java.lang.Object r1 = r1.f330153o     // Catch:{ all -> 0x00ef }
                r1.wait()     // Catch:{ all -> 0x00ef }
                rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x00ef }
                monitor-exit(r2)     // Catch:{ Exception -> 0x00f2 }
                q80.a r1 = r9.f330161d     // Catch:{ Exception -> 0x00f2 }
                java.lang.String r1 = r1.f330152n     // Catch:{ Exception -> 0x00f2 }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00f2 }
                r2.<init>()     // Catch:{ Exception -> 0x00f2 }
                java.lang.String r3 = "mixBackground:"
                r2.append(r3)     // Catch:{ Exception -> 0x00f2 }
                q80.a r3 = r9.f330161d     // Catch:{ Exception -> 0x00f2 }
                boolean r3 = r3.f330141c     // Catch:{ Exception -> 0x00f2 }
                r2.append(r3)     // Catch:{ Exception -> 0x00f2 }
                java.lang.String r3 = ", mixMusic:"
                r2.append(r3)     // Catch:{ Exception -> 0x00f2 }
                q80.a r3 = r9.f330161d     // Catch:{ Exception -> 0x00f2 }
                boolean r3 = r3.f330142d     // Catch:{ Exception -> 0x00f2 }
                r2.append(r3)     // Catch:{ Exception -> 0x00f2 }
                java.lang.String r3 = ", music:"
                r2.append(r3)     // Catch:{ Exception -> 0x00f2 }
                q80.a r3 = r9.f330161d     // Catch:{ Exception -> 0x00f2 }
                java.util.List<eh.e> r3 = r3.f330147i     // Catch:{ Exception -> 0x00f2 }
                int r3 = r3.size()     // Catch:{ Exception -> 0x00f2 }
                r2.append(r3)     // Catch:{ Exception -> 0x00f2 }
                java.lang.String r3 = ", background:"
                r2.append(r3)     // Catch:{ Exception -> 0x00f2 }
                q80.a r3 = r9.f330161d     // Catch:{ Exception -> 0x00f2 }
                java.util.List<eh.e> r3 = r3.f330146h     // Catch:{ Exception -> 0x00f2 }
                int r3 = r3.size()     // Catch:{ Exception -> 0x00f2 }
                r2.append(r3)     // Catch:{ Exception -> 0x00f2 }
                java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00f2 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)     // Catch:{ Exception -> 0x00f2 }
                q80.a r1 = r9.f330161d     // Catch:{ Exception -> 0x00f2 }
                java.lang.Object r2 = r1.f330154p     // Catch:{ Exception -> 0x00f2 }
                monitor-enter(r2)     // Catch:{ Exception -> 0x00f2 }
            L_0x0061:
                java.util.List<eh.e> r3 = r1.f330146h     // Catch:{ all -> 0x0073 }
                int r3 = r3.size()     // Catch:{ all -> 0x0073 }
                r4 = 1
                if (r3 >= r4) goto L_0x0076
                java.util.List<eh.e> r3 = r1.f330147i     // Catch:{ all -> 0x0073 }
                int r3 = r3.size()     // Catch:{ all -> 0x0073 }
                if (r3 < r4) goto L_0x00d4
                goto L_0x0076
            L_0x0073:
                r1 = move-exception
                goto L_0x00ed
            L_0x0076:
                boolean r3 = r1.f330141c     // Catch:{ all -> 0x0073 }
                if (r3 == 0) goto L_0x009f
                boolean r5 = r1.f330142d     // Catch:{ all -> 0x0073 }
                if (r5 == 0) goto L_0x009f
                java.util.List<eh.e> r3 = r1.f330146h     // Catch:{ all -> 0x0073 }
                int r3 = r3.size()     // Catch:{ all -> 0x0073 }
                if (r3 < r4) goto L_0x00d4
                java.util.List<eh.e> r3 = r1.f330147i     // Catch:{ all -> 0x0073 }
                int r3 = r3.size()     // Catch:{ all -> 0x0073 }
                if (r3 < r4) goto L_0x00d4
                fy3.a<rx3.b0> r3 = r1.f330143e     // Catch:{ all -> 0x0073 }
                r3.invoke()     // Catch:{ all -> 0x0073 }
                r3 = 0
            L_0x0094:
                if (r3 >= r4) goto L_0x00d0
                q80.C110371a.m150206a(r1)     // Catch:{ all -> 0x0073 }
                q80.C110371a.m150207b(r1)     // Catch:{ all -> 0x0073 }
                int r3 = r3 + 1
                goto L_0x0094
            L_0x009f:
                if (r3 != 0) goto L_0x00a5
                boolean r3 = r1.f330142d     // Catch:{ all -> 0x0073 }
                if (r3 == 0) goto L_0x00d0
            L_0x00a5:
                fy3.a<rx3.b0> r3 = r1.f330143e     // Catch:{ all -> 0x0073 }
                r3.invoke()     // Catch:{ all -> 0x0073 }
                r3 = 0
            L_0x00ab:
                if (r3 >= r4) goto L_0x00b6
                q80.C110371a.m150206a(r1)     // Catch:{ all -> 0x0073 }
                q80.C110371a.m150207b(r1)     // Catch:{ all -> 0x0073 }
                int r3 = r3 + 1
                goto L_0x00ab
            L_0x00b6:
                boolean r3 = r1.f330142d     // Catch:{ all -> 0x0073 }
                if (r3 == 0) goto L_0x00c3
                java.util.List<eh.e> r3 = r1.f330147i     // Catch:{ all -> 0x0073 }
                int r3 = r3.size()     // Catch:{ all -> 0x0073 }
                if (r3 >= r4) goto L_0x00c3
                goto L_0x00d4
            L_0x00c3:
                boolean r3 = r1.f330141c     // Catch:{ all -> 0x0073 }
                if (r3 == 0) goto L_0x00d0
                java.util.List<eh.e> r3 = r1.f330146h     // Catch:{ all -> 0x0073 }
                int r3 = r3.size()     // Catch:{ all -> 0x0073 }
                if (r3 >= r4) goto L_0x00d0
                goto L_0x00d4
            L_0x00d0:
                boolean r3 = r1.f330151m     // Catch:{ all -> 0x0073 }
                if (r3 != 0) goto L_0x0061
            L_0x00d4:
                boolean r3 = r1.f330151m     // Catch:{ all -> 0x0073 }
                if (r3 == 0) goto L_0x00e8
                java.lang.String r3 = r1.f330152n     // Catch:{ all -> 0x0073 }
                java.lang.String r5 = "flush data finish"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r5)     // Catch:{ all -> 0x0073 }
                r1.f330150l = r0     // Catch:{ all -> 0x0073 }
                r1.f330149k = r4     // Catch:{ all -> 0x0073 }
                java.lang.Object r1 = r1.f330154p     // Catch:{ all -> 0x0073 }
                r1.notifyAll()     // Catch:{ all -> 0x0073 }
            L_0x00e8:
                rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0073 }
                monitor-exit(r2)     // Catch:{ Exception -> 0x00f2 }
                goto L_0x0000
            L_0x00ed:
                monitor-exit(r2)     // Catch:{ Exception -> 0x00f2 }
                throw r1     // Catch:{ Exception -> 0x00f2 }
            L_0x00ef:
                r1 = move-exception
                monitor-exit(r2)     // Catch:{ Exception -> 0x00f2 }
                throw r1     // Catch:{ Exception -> 0x00f2 }
            L_0x00f2:
                r1 = move-exception
                q80.a r2 = r9.f330161d
                java.lang.String r2 = r2.f330152n
                java.lang.String r3 = ""
                java.lang.Object[] r0 = new java.lang.Object[r0]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r1, r3, r0)
                java.lang.String r0 = "MicroMsg.MediaEditorIDKeyStat"
                java.lang.String r1 = "markRemuxPcmFrameMixFailed"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
                com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r3 = 986(0x3da, double:4.87E-321)
                r5 = 24
                r7 = 1
                r2.mo175913w(r3, r5, r7)
                goto L_0x0000
            L_0x0112:
                q80.a r0 = r9.f330161d
                java.lang.String r0 = r0.f330152n
                java.lang.String r1 = "finish mix"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: q80.C110371a.C110372a.run():void");
        }
    }

    public C110371a(int i, int i2, boolean z, boolean z2, C32224a<C13598b0> aVar, C32227p<? super byte[], ? super Long, C13598b0> pVar) {
        C87412m.m108594g(aVar, "frameMix");
        C87412m.m108594g(pVar, "frameMixEnd");
        this.f330139a = i;
        this.f330140b = i2;
        this.f330141c = z;
        this.f330142d = z2;
        this.f330143e = aVar;
        this.f330144f = pVar;
        C109007c cVar = new C109007c();
        this.f330145g = cVar;
        Log.m105924i("MicroMsg.AudioMixCodec", "init AudioMixCodec, sampleRate:" + this.f330139a + ", channels:" + this.f330140b + ", mixBackground:" + this.f330141c + ", mixMusic:" + z2);
        int i3 = this.f330139a;
        int i4 = this.f330140b;
        int i5 = i4 * 2048;
        Object[] objArr = {Integer.valueOf(i3), Integer.valueOf(i4), 2};
        int i6 = C11412b.f33577a;
        Log.m105925i("MicroMsg.Mix.AudioSyncMixController", "init, outSample:%d, outChannel:%d, outBitDepth:%d", objArr);
        cVar.f326499a = i3;
        cVar.f326500b = i4;
        cVar.f326501c = 2;
        cVar.f326502d = i5;
        if (i5 <= 0) {
            cVar.f326502d = ((((i3 * i4) * 16) * 20) / 8) / 1000;
        }
        this.f330159u = new C110372a(this);
    }

    /* renamed from: a */
    public static final void m150206a(C110371a aVar) {
        boolean z;
        List<C107275e> list = aVar.f330148j;
        C87412m.m108593f(list, "pcmDataList");
        synchronized (list) {
            aVar.f330148j.clear();
            String str = aVar.f330152n;
            Log.m105924i(str, "getAudioData, background:" + aVar.f330146h.size() + ", music:" + aVar.f330147i.size());
            if (aVar.f330141c && aVar.f330146h.size() > 0) {
                C107275e eVar = aVar.f330146h.get(0);
                byte[] bArr = eVar.f320943f;
                C87412m.m108593f(bArr, "backPcm.pcmData");
                int length = bArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        z = false;
                        break;
                    }
                    if (bArr[i] != 0) {
                        z = true;
                        break;
                    }
                    i++;
                }
                if (!z) {
                    if (!aVar.f330141c || aVar.f330142d) {
                        Log.m105924i(aVar.f330152n, "getAudioData background data zero");
                        aVar.f330146h.remove(eVar);
                    }
                }
                aVar.f330148j.add(eVar);
                aVar.f330146h.remove(eVar);
            }
            if (aVar.f330142d && aVar.f330147i.size() > 0) {
                C107275e eVar2 = aVar.f330147i.get(0);
                aVar.f330148j.add(eVar2);
                aVar.f330147i.remove(eVar2);
            }
            String str2 = aVar.f330152n;
            StringBuilder sb = new StringBuilder();
            sb.append("get audio data num ");
            int i2 = aVar.f330160v;
            aVar.f330160v = i2 + 1;
            sb.append(i2);
            Log.m105924i(str2, sb.toString());
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    /* renamed from: b */
    public static final void m150207b(C110371a aVar) {
        List<C107275e> list = aVar.f330148j;
        C87412m.m108593f(list, "pcmDataList");
        synchronized (list) {
            String str = aVar.f330152n;
            Log.m105924i(str, "the mix thread running mix " + aVar.f330160v + " pcmDataListSize: " + aVar.f330148j.size() + ", mixBackground:" + aVar.f330141c + ", mixMusic:" + aVar.f330142d);
            if (aVar.f330148j.size() > 0) {
                long currentTicks = Util.currentTicks();
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(aVar.f330148j);
                byte[] a = aVar.f330145g.mo160122a(arrayList);
                if (a != null) {
                    long j = 0;
                    boolean z = aVar.f330142d;
                    if (z) {
                        List<C107275e> list2 = aVar.f330148j;
                        C87412m.m108593f(list2, "pcmDataList");
                        synchronized (list2) {
                            for (C107275e eVar : list2) {
                                if (C87412m.m108589b(eVar.f320938a, "music")) {
                                    j = eVar.f320942e;
                                    String str2 = aVar.f330152n;
                                    Log.m105924i(str2, "get pts from music: " + j);
                                }
                            }
                        }
                    } else if (aVar.f330141c && !z) {
                        List<C107275e> list3 = aVar.f330148j;
                        C87412m.m108593f(list3, "pcmDataList");
                        synchronized (list3) {
                            for (C107275e eVar2 : list3) {
                                if (C87412m.m108589b(eVar2.f320938a, "background")) {
                                    j = eVar2.f320942e;
                                    String str3 = aVar.f330152n;
                                    Log.m105924i(str3, "get pts from background: " + j);
                                }
                            }
                        }
                    }
                    String str4 = aVar.f330152n;
                    Log.m105924i(str4, "mix finish pcm frame size: " + a.length + ", pts:" + j + ", cost:" + Util.ticksToNow(currentTicks));
                    aVar.f330144f.invoke(a, Long.valueOf(j));
                }
            }
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0108, code lost:
        if (r9.f330141c != false) goto L_0x010a;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo161881c(byte[] r10, java.lang.String r11, long r12, int r14, int r15) {
        /*
            r9 = this;
            java.lang.String r0 = "pcmData"
            gy3.C87412m.m108594g(r10, r0)
            java.lang.String r0 = "audioId"
            gy3.C87412m.m108594g(r11, r0)
            java.lang.Object r0 = r9.f330153o
            monitor-enter(r0)
            r1 = 1
            java.lang.String r2 = r9.f330152n     // Catch:{ Exception -> 0x0129 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0129 }
            r3.<init>()     // Catch:{ Exception -> 0x0129 }
            java.lang.String r4 = "pcmData len:"
            r3.append(r4)     // Catch:{ Exception -> 0x0129 }
            int r4 = r10.length     // Catch:{ Exception -> 0x0129 }
            r3.append(r4)     // Catch:{ Exception -> 0x0129 }
            java.lang.String r4 = ", audioId:"
            r3.append(r4)     // Catch:{ Exception -> 0x0129 }
            r3.append(r11)     // Catch:{ Exception -> 0x0129 }
            java.lang.String r4 = ", sampleRate:"
            r3.append(r4)     // Catch:{ Exception -> 0x0129 }
            r3.append(r14)     // Catch:{ Exception -> 0x0129 }
            java.lang.String r4 = ", channelCount:"
            r3.append(r4)     // Catch:{ Exception -> 0x0129 }
            r3.append(r15)     // Catch:{ Exception -> 0x0129 }
            java.lang.String r4 = ", pts:"
            r3.append(r4)     // Catch:{ Exception -> 0x0129 }
            r3.append(r12)     // Catch:{ Exception -> 0x0129 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0129 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)     // Catch:{ Exception -> 0x0129 }
            eh.e r2 = new eh.e     // Catch:{ Exception -> 0x0129 }
            r2.<init>()     // Catch:{ Exception -> 0x0129 }
            r2.f320938a = r11     // Catch:{ Exception -> 0x0129 }
            r2.f320943f = r10     // Catch:{ Exception -> 0x0129 }
            r2.f320939b = r14     // Catch:{ Exception -> 0x0129 }
            r2.f320940c = r15     // Catch:{ Exception -> 0x0129 }
            r2.f320942e = r12     // Catch:{ Exception -> 0x0129 }
            java.lang.String r10 = "background"
            boolean r10 = gy3.C87412m.m108589b(r11, r10)     // Catch:{ Exception -> 0x0129 }
            if (r10 == 0) goto L_0x009a
            java.lang.String r10 = r9.f330152n     // Catch:{ Exception -> 0x0129 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0129 }
            r11.<init>()     // Catch:{ Exception -> 0x0129 }
            java.lang.String r12 = "input the background data num = "
            r11.append(r12)     // Catch:{ Exception -> 0x0129 }
            java.util.List<eh.e> r12 = r9.f330146h     // Catch:{ Exception -> 0x0129 }
            int r12 = r12.size()     // Catch:{ Exception -> 0x0129 }
            r11.append(r12)     // Catch:{ Exception -> 0x0129 }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x0129 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r11)     // Catch:{ Exception -> 0x0129 }
            java.util.List<eh.e> r10 = r9.f330146h     // Catch:{ Exception -> 0x0129 }
            r10.add(r2)     // Catch:{ Exception -> 0x0129 }
            java.lang.String r10 = r9.f330152n     // Catch:{ Exception -> 0x0129 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0129 }
            r11.<init>()     // Catch:{ Exception -> 0x0129 }
            java.lang.String r12 = "input background data:"
            r11.append(r12)     // Catch:{ Exception -> 0x0129 }
            int r12 = r9.f330155q     // Catch:{ Exception -> 0x0129 }
            int r13 = r12 + 1
            r9.f330155q = r13     // Catch:{ Exception -> 0x0129 }
            r11.append(r12)     // Catch:{ Exception -> 0x0129 }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x0129 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r11)     // Catch:{ Exception -> 0x0129 }
            goto L_0x00df
        L_0x009a:
            java.lang.String r10 = "music"
            boolean r10 = gy3.C87412m.m108589b(r11, r10)     // Catch:{ Exception -> 0x0129 }
            if (r10 == 0) goto L_0x00df
            java.lang.String r10 = r9.f330152n     // Catch:{ Exception -> 0x0129 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0129 }
            r11.<init>()     // Catch:{ Exception -> 0x0129 }
            java.lang.String r12 = "input the music data num = "
            r11.append(r12)     // Catch:{ Exception -> 0x0129 }
            java.util.List<eh.e> r12 = r9.f330147i     // Catch:{ Exception -> 0x0129 }
            int r12 = r12.size()     // Catch:{ Exception -> 0x0129 }
            r11.append(r12)     // Catch:{ Exception -> 0x0129 }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x0129 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r11)     // Catch:{ Exception -> 0x0129 }
            java.util.List<eh.e> r10 = r9.f330147i     // Catch:{ Exception -> 0x0129 }
            r10.add(r2)     // Catch:{ Exception -> 0x0129 }
            java.lang.String r10 = r9.f330152n     // Catch:{ Exception -> 0x0129 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0129 }
            r11.<init>()     // Catch:{ Exception -> 0x0129 }
            java.lang.String r12 = "input music data:"
            r11.append(r12)     // Catch:{ Exception -> 0x0129 }
            int r12 = r9.f330156r     // Catch:{ Exception -> 0x0129 }
            int r13 = r12 + 1
            r9.f330156r = r13     // Catch:{ Exception -> 0x0129 }
            r11.append(r12)     // Catch:{ Exception -> 0x0129 }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x0129 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r11)     // Catch:{ Exception -> 0x0129 }
        L_0x00df:
            boolean r10 = r9.f330142d     // Catch:{ Exception -> 0x0129 }
            if (r10 == 0) goto L_0x0104
            boolean r11 = r9.f330141c     // Catch:{ Exception -> 0x0129 }
            if (r11 == 0) goto L_0x0104
            java.util.List<eh.e> r10 = r9.f330147i     // Catch:{ Exception -> 0x0129 }
            int r10 = r10.size()     // Catch:{ Exception -> 0x0129 }
            if (r10 < r1) goto L_0x0146
            java.util.List<eh.e> r10 = r9.f330146h     // Catch:{ Exception -> 0x0129 }
            int r10 = r10.size()     // Catch:{ Exception -> 0x0129 }
            if (r10 < r1) goto L_0x0146
            java.lang.String r10 = r9.f330152n     // Catch:{ Exception -> 0x0146 }
            java.lang.String r11 = "notify mix"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r11)     // Catch:{ Exception -> 0x0146 }
            java.lang.Object r10 = r9.f330153o     // Catch:{ Exception -> 0x0146 }
            r10.notifyAll()     // Catch:{ Exception -> 0x0146 }
            goto L_0x0146
        L_0x0104:
            if (r10 != 0) goto L_0x010a
            boolean r10 = r9.f330141c     // Catch:{ Exception -> 0x0129 }
            if (r10 == 0) goto L_0x0146
        L_0x010a:
            java.util.List<eh.e> r10 = r9.f330147i     // Catch:{ Exception -> 0x0129 }
            int r10 = r10.size()     // Catch:{ Exception -> 0x0129 }
            if (r10 >= r1) goto L_0x011a
            java.util.List<eh.e> r10 = r9.f330146h     // Catch:{ Exception -> 0x0129 }
            int r10 = r10.size()     // Catch:{ Exception -> 0x0129 }
            if (r10 < r1) goto L_0x0146
        L_0x011a:
            java.lang.String r10 = r9.f330152n     // Catch:{ Exception -> 0x0146 }
            java.lang.String r11 = "notify mix"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r11)     // Catch:{ Exception -> 0x0146 }
            java.lang.Object r10 = r9.f330153o     // Catch:{ Exception -> 0x0146 }
            r10.notifyAll()     // Catch:{ Exception -> 0x0146 }
            goto L_0x0146
        L_0x0127:
            r10 = move-exception
            goto L_0x014a
        L_0x0129:
            r10 = move-exception
            java.lang.String r11 = r9.f330152n     // Catch:{ all -> 0x0127 }
            java.lang.String r12 = ""
            r13 = 0
            java.lang.Object[] r13 = new java.lang.Object[r13]     // Catch:{ all -> 0x0127 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11, r10, r12, r13)     // Catch:{ all -> 0x0127 }
            java.lang.String r10 = "MicroMsg.MediaEditorIDKeyStat"
            java.lang.String r11 = "markRemuxPcmFrameMixFailed"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r11)     // Catch:{ all -> 0x0127 }
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x0127 }
            r3 = 986(0x3da, double:4.87E-321)
            r5 = 24
            r7 = 1
            r2.mo175913w(r3, r5, r7)     // Catch:{ all -> 0x0127 }
        L_0x0146:
            rx3.b0 r10 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0127 }
            monitor-exit(r0)
            return r1
        L_0x014a:
            monitor-exit(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: q80.C110371a.mo161881c(byte[], java.lang.String, long, int, int):boolean");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(12:2|3|(1:5)|6|(1:8)|9|(7:(1:19)|22|(1:24)|(2:27|28)|29|30|31)(6:13|(1:17)|(0)|29|30|31)|21|(0)|29|30|31) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005d, code lost:
        if (r4.f330157s != false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0067, code lost:
        if (r4.f330158t != false) goto L_0x005f;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x007a */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006c A[SYNTHETIC, Splitter:B:27:0x006c] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo161882d(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r0 = "audioId"
            gy3.C87412m.m108594g(r5, r0)
            java.lang.Object r0 = r4.f330153o
            monitor-enter(r0)
            java.lang.String r1 = r4.f330152n     // Catch:{ all -> 0x007e }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x007e }
            r2.<init>()     // Catch:{ all -> 0x007e }
            java.lang.String r3 = "inputEnd, audioId:"
            r2.append(r3)     // Catch:{ all -> 0x007e }
            r2.append(r5)     // Catch:{ all -> 0x007e }
            java.lang.String r3 = ", mixBackground:"
            r2.append(r3)     // Catch:{ all -> 0x007e }
            boolean r3 = r4.f330141c     // Catch:{ all -> 0x007e }
            r2.append(r3)     // Catch:{ all -> 0x007e }
            java.lang.String r3 = ", mixMusic:"
            r2.append(r3)     // Catch:{ all -> 0x007e }
            boolean r3 = r4.f330142d     // Catch:{ all -> 0x007e }
            r2.append(r3)     // Catch:{ all -> 0x007e }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x007e }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)     // Catch:{ all -> 0x007e }
            java.lang.String r1 = "background"
            boolean r1 = gy3.C87412m.m108589b(r5, r1)     // Catch:{ all -> 0x007e }
            r2 = 1
            if (r1 == 0) goto L_0x003d
            r4.f330157s = r2     // Catch:{ all -> 0x007e }
        L_0x003d:
            java.lang.String r1 = "music"
            boolean r5 = gy3.C87412m.m108589b(r5, r1)     // Catch:{ all -> 0x007e }
            if (r5 == 0) goto L_0x0047
            r4.f330158t = r2     // Catch:{ all -> 0x007e }
        L_0x0047:
            boolean r5 = r4.f330141c     // Catch:{ all -> 0x007e }
            r1 = 0
            if (r5 == 0) goto L_0x0059
            boolean r3 = r4.f330142d     // Catch:{ all -> 0x007e }
            if (r3 == 0) goto L_0x0059
            boolean r5 = r4.f330158t     // Catch:{ all -> 0x007e }
            if (r5 == 0) goto L_0x006a
            boolean r5 = r4.f330157s     // Catch:{ all -> 0x007e }
            if (r5 == 0) goto L_0x006a
            goto L_0x005f
        L_0x0059:
            if (r5 == 0) goto L_0x0061
            boolean r5 = r4.f330157s     // Catch:{ all -> 0x007e }
            if (r5 == 0) goto L_0x0061
        L_0x005f:
            r1 = 1
            goto L_0x006a
        L_0x0061:
            boolean r5 = r4.f330142d     // Catch:{ all -> 0x007e }
            if (r5 == 0) goto L_0x006a
            boolean r5 = r4.f330158t     // Catch:{ all -> 0x007e }
            if (r5 == 0) goto L_0x006a
            goto L_0x005f
        L_0x006a:
            if (r1 == 0) goto L_0x007a
            r4.f330151m = r2     // Catch:{ Exception -> 0x007a }
            java.lang.String r5 = r4.f330152n     // Catch:{ Exception -> 0x007a }
            java.lang.String r1 = "notify mix"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)     // Catch:{ Exception -> 0x007a }
            java.lang.Object r5 = r4.f330153o     // Catch:{ Exception -> 0x007a }
            r5.notifyAll()     // Catch:{ Exception -> 0x007a }
        L_0x007a:
            rx3.b0 r5 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x007e }
            monitor-exit(r0)
            return
        L_0x007e:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: q80.C110371a.mo161882d(java.lang.String):void");
    }
}
