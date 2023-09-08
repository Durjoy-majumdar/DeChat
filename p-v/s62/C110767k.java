package s62;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Process;
import com.tencent.p014mm.compatible.deviceinfo.C104619a;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.FileDescriptor;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import kj2.C117407d;
import oa1.C117731d;
import p156gj.C107835h0;
import p914oj.C110052b;

/* renamed from: s62.k */
public abstract class C110767k {

    /* renamed from: v */
    public static boolean f331310v;

    /* renamed from: a */
    public volatile int f331311a;

    /* renamed from: b */
    public C110766j f331312b;

    /* renamed from: c */
    public MMHandler f331313c;

    /* renamed from: d */
    public String f331314d;

    /* renamed from: e */
    public FileDescriptor f331315e;

    /* renamed from: f */
    public volatile boolean f331316f = false;

    /* renamed from: g */
    public C110762b f331317g = null;

    /* renamed from: h */
    public long f331318h = 0;

    /* renamed from: i */
    public MediaFormat f331319i;

    /* renamed from: j */
    public String f331320j;

    /* renamed from: k */
    public long f331321k;

    /* renamed from: l */
    public int f331322l;

    /* renamed from: m */
    public MediaCodec.BufferInfo f331323m = new MediaCodec.BufferInfo();

    /* renamed from: n */
    public C110052b f331324n;

    /* renamed from: o */
    public C104619a f331325o;

    /* renamed from: p */
    public volatile int f331326p;

    /* renamed from: q */
    public final Object f331327q = new Object();

    /* renamed from: r */
    public boolean f331328r = false;

    /* renamed from: s */
    public boolean f331329s = false;

    /* renamed from: t */
    public long f331330t = 0;

    /* renamed from: u */
    public long f331331u = 0;

    static {
        boolean z = true;
        if (C117731d.m166007c().mo182443e("clicfg_mediacodec_double_release_switch", 1, true, true) != 1) {
            z = false;
        }
        f331310v = z;
    }

    public C110767k(C110766j jVar, MMHandler mMHandler) {
        this.f331312b = jVar;
        this.f331313c = mMHandler;
        this.f331311a = 0;
        this.f331326p = -1;
    }

    /* renamed from: a */
    public boolean mo162292a(long j, long j2) {
        long j3;
        long j4 = j;
        long currentTicks = Util.currentTicks();
        try {
            if ((j4 / 1000) + 1000 >= this.f331321k || j2 != -1) {
                return false;
            }
            Log.m105924i("MicroMsg.TrackDataSource", "checkExtractor");
            MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("TrackDataSource");
            if (this instanceof C110774n) {
                String str = this.f331314d;
                if (str == null) {
                    str = "";
                }
                mmkv.putString("path", str);
                mmkv.putInt("type", 1);
                mmkv.putLong("ts", System.currentTimeMillis());
                mmkv.commit();
            }
            try {
                this.f331312b.f331304i = true;
                this.f331316f = false;
                this.f331324n.mo161388g();
                this.f331324n = new C110052b();
                if (!Util.isNullOrNil(this.f331314d)) {
                    RandomAccessFile B = C86013q1.m106420B(this.f331314d, false);
                    FileDescriptor fd = B.getFD();
                    if (C107835h0.f322847d.f322835a == 1) {
                        this.f331324n.mo161391j(fd, 0, C86013q1.m106451l(this.f331314d));
                    } else {
                        this.f331324n.f329324a.setDataSource(fd);
                    }
                    B.close();
                } else {
                    FileDescriptor fileDescriptor = this.f331315e;
                    if (fileDescriptor != null && fileDescriptor.valid()) {
                        this.f331324n.mo161391j(this.f331315e, 0, 0);
                    }
                }
                if (mmkv.getString("path", "").equals(this.f331314d) && (this instanceof C110774n)) {
                    mmkv.putInt("type", 0);
                    mmkv.putString("path", "");
                    j3 = 0;
                    mmkv.putLong("ts", j3);
                    mmkv.commit();
                }
            } catch (Throwable th) {
                if (mmkv.getString("path", "").equals(this.f331314d) && (this instanceof C110774n)) {
                    mmkv.putInt("type", 0);
                    mmkv.putString("path", "");
                    mmkv.putLong("ts", 0);
                    mmkv.commit();
                }
                throw th;
            }
            this.f331324n.mo161390i(this.f331322l);
            this.f331324n.mo161389h(j4, 2);
            long b = this.f331324n.mo161383b();
            mo162303q(j4, b);
            Log.m105929w("MicroMsg.TrackDataSource", "%s it don't play end. currTime[%d] afterSeek[%d] nextSampleTime[%d] onlineCacheMs[%d] cost[%d]", mo162299i(), Long.valueOf(j), Long.valueOf(b), Long.valueOf(j2), Long.valueOf(this.f331318h), Long.valueOf(Util.ticksToNow(currentTicks)));
            return true;
        } catch (Exception e) {
            Log.m105921e("MicroMsg.TrackDataSource", "%s reset extractor error %s", mo162299i(), e.toString());
            return false;
        }
    }

    /* renamed from: b */
    public C110765g mo162293b(String str) {
        return null;
    }

    /* renamed from: c */
    public int mo162294c(long j, long j2) {
        Log.m105919d("MicroMsg.TrackDataSource", "%s start to do some work time[%d %d] state %d", mo162299i(), Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(this.f331311a));
        if (this.f331325o != null) {
            do {
                try {
                    if (mo162295d(j, j2)) {
                        this.f331330t = Util.nowMilliSecond();
                    }
                } catch (Exception e) {
                    if (this.f331328r) {
                        Log.m105921e("MicroMsg.TrackDataSource", "%s do some work drain output buffer error %s", mo162299i(), e.toString());
                    } else {
                        this.f331328r = true;
                        Log.printErrStackTrace("MicroMsg.TrackDataSource", e, "%s do some work drain output buffer error", mo162299i());
                    }
                    if (!C110764e.m150717a(this.f331311a)) {
                        mo162297f();
                    }
                    C110766j jVar = this.f331312b;
                    String u = mo162283u();
                    if (!jVar.f331309n) {
                        if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE) {
                            MMHandlerThread.postToMainThread(new C48240i(jVar));
                        }
                        C117407d dVar = C117407d.INSTANCE;
                        dVar.idkeyStat((long) jVar.mo162287a(), 158, 1, false);
                        dVar.mo160131h(jVar.mo162288b(), 506, Long.valueOf(Util.nowSecond()), u);
                        jVar.f331309n = true;
                    }
                    if (this.f331330t == 0) {
                        this.f331330t = Util.nowMilliSecond();
                    }
                    if (Util.milliSecondsToNow(this.f331330t) >= 20000) {
                        Log.m105920e("MicroMsg.TrackDataSource", "drainOutputBuffer continue fails over 20s, set state error");
                        mo162306t(-1);
                        this.f331330t = Util.nowMilliSecond();
                    }
                }
                break;
            } while (!C110764e.m150717a(this.f331311a));
            try {
                break;
                mo162296e();
            } catch (Exception e2) {
                Exception exc = e2;
                if (this.f331329s) {
                    Log.m105921e("MicroMsg.TrackDataSource", "%s do some work feed input buffer error %s", mo162299i(), exc.toString());
                } else {
                    this.f331329s = true;
                    Log.printErrStackTrace("MicroMsg.TrackDataSource", exc, "%s do some work feed input buffer error", mo162299i());
                }
                if (!C110764e.m150717a(this.f331311a)) {
                    mo162297f();
                }
                C110766j jVar2 = this.f331312b;
                String u2 = mo162283u();
                if (!jVar2.f331308m) {
                    if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE) {
                        MMHandlerThread.postToMainThread(new C48239h(jVar2));
                    }
                    C117407d dVar2 = C117407d.INSTANCE;
                    dVar2.idkeyStat((long) jVar2.mo162287a(), 157, 1, false);
                    dVar2.mo160131h(jVar2.mo162288b(), 505, Long.valueOf(Util.nowSecond()), u2);
                    jVar2.f331308m = true;
                }
                if (this.f331331u == 0) {
                    this.f331331u = Util.nowMilliSecond();
                }
                if (Util.milliSecondsToNow(this.f331331u) >= 20000) {
                    Log.m105920e("MicroMsg.TrackDataSource", "feedInputBuffer continue fails over 20s, set state error");
                    mo162306t(-1);
                    this.f331331u = Util.nowMilliSecond();
                }
            }
        }
        Log.m105919d("MicroMsg.TrackDataSource", "%s finish to do some work. state %d", mo162299i(), Integer.valueOf(this.f331311a));
        return this.f331311a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x012d, code lost:
        return false;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo162295d(long r16, long r18) {
        /*
            r15 = this;
            r10 = r15
            java.lang.String r0 = "MicroMsg.TrackDataSource"
            java.lang.String r1 = "%s drain output buffer state:%s time[%d %d %s] index %d"
            r2 = 6
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = r15.mo162299i()
            r11 = 0
            r2[r11] = r3
            int r3 = r10.f331311a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r12 = 1
            r2[r12] = r3
            java.lang.Long r3 = java.lang.Long.valueOf(r16)
            r4 = 2
            r2[r4] = r3
            java.lang.Long r3 = java.lang.Long.valueOf(r18)
            r5 = 3
            r2[r5] = r3
            oj.b r3 = r10.f331324n
            long r6 = r3.mo161383b()
            java.lang.Long r3 = java.lang.Long.valueOf(r6)
            r6 = 4
            r2[r6] = r3
            int r3 = r10.f331326p
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r7 = 5
            r2[r7] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r1, r2)
            long r0 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            int r2 = r10.f331326p
            r13 = -1
            if (r2 >= 0) goto L_0x00b6
            java.lang.Object r2 = r10.f331327q
            monitor-enter(r2)
            com.tencent.mm.compatible.deviceinfo.a r3 = r10.f331325o     // Catch:{ all -> 0x00b3 }
            android.media.MediaCodec$BufferInfo r7 = r10.f331323m     // Catch:{ all -> 0x00b3 }
            r8 = 0
            int r3 = r3.mo148205g(r7, r8)     // Catch:{ all -> 0x00b3 }
            r10.f331326p = r3     // Catch:{ all -> 0x00b3 }
            monitor-exit(r2)     // Catch:{ all -> 0x00b3 }
            int r2 = r10.f331326p
            if (r2 < 0) goto L_0x007a
            android.media.MediaCodec$BufferInfo r2 = r10.f331323m
            int r2 = r2.flags
            r2 = r2 & r6
            if (r2 == 0) goto L_0x00b6
            java.lang.Object[] r0 = new java.lang.Object[r12]
            java.lang.String r1 = r15.mo162299i()
            r0[r11] = r1
            java.lang.String r1 = "MicroMsg.TrackDataSource"
            java.lang.String r2 = "%s process end of stream"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r0)
            r0 = 9
            r15.mo162306t(r0)
            r10.f331326p = r13
            return r11
        L_0x007a:
            int r0 = r10.f331326p
            r1 = -2
            if (r0 != r1) goto L_0x008d
            com.tencent.mm.compatible.deviceinfo.a r0 = r10.f331325o
            android.media.MediaFormat r0 = r0.mo148212n()
            r10.f331319i = r0
            com.tencent.mm.compatible.deviceinfo.a r1 = r10.f331325o
            r15.mo162279j(r1, r0)
            return r12
        L_0x008d:
            int r0 = r10.f331326p
            r1 = -3
            if (r0 != r1) goto L_0x0093
            return r12
        L_0x0093:
            java.lang.String r0 = "MicroMsg.TrackDataSource"
            java.lang.String r1 = "%s drain output buffer error outputIndex[%d] state:%s"
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.String r3 = r15.mo162299i()
            r2[r11] = r3
            int r3 = r10.f331326p
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r12] = r3
            int r3 = r10.f331311a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r4] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r1, r2)
            return r11
        L_0x00b3:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00b3 }
            throw r0
        L_0x00b6:
            int r2 = r10.f331311a
            if (r2 != r12) goto L_0x00bc
            r2 = 1
            goto L_0x00bd
        L_0x00bc:
            r2 = 0
        L_0x00bd:
            if (r2 == 0) goto L_0x00cc
            com.tencent.mm.compatible.deviceinfo.a r0 = r10.f331325o
            int r1 = r10.f331326p
            r0.mo148216r(r1, r12)
            r10.f331326p = r13
            r15.mo162306t(r4)
            return r12
        L_0x00cc:
            java.lang.String r2 = "MicroMsg.TrackDataSource"
            java.lang.String r3 = "%s process output buffer state:%s: index %d, cost:%s"
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r7 = r15.mo162299i()
            r6[r11] = r7
            int r7 = r10.f331311a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6[r12] = r7
            int r7 = r10.f331326p
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6[r4] = r7
            long r0 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6[r5] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r3, r6)
            java.lang.Object r14 = r10.f331327q
            monitor-enter(r14)
            int r0 = r10.f331326p     // Catch:{ all -> 0x012e }
            if (r0 < 0) goto L_0x012c
            com.tencent.mm.compatible.deviceinfo.a r0 = r10.f331325o     // Catch:{ all -> 0x012e }
            int r1 = r10.f331326p     // Catch:{ all -> 0x012e }
            java.nio.ByteBuffer r7 = r0.mo148210l(r1)     // Catch:{ all -> 0x012e }
            if (r7 == 0) goto L_0x0117
            android.media.MediaCodec$BufferInfo r0 = r10.f331323m     // Catch:{ all -> 0x012e }
            int r0 = r0.offset     // Catch:{ all -> 0x012e }
            r7.position(r0)     // Catch:{ all -> 0x012e }
            android.media.MediaCodec$BufferInfo r0 = r10.f331323m     // Catch:{ all -> 0x012e }
            int r1 = r0.offset     // Catch:{ all -> 0x012e }
            int r0 = r0.size     // Catch:{ all -> 0x012e }
            int r1 = r1 + r0
            r7.limit(r1)     // Catch:{ all -> 0x012e }
        L_0x0117:
            com.tencent.mm.compatible.deviceinfo.a r6 = r10.f331325o     // Catch:{ all -> 0x012e }
            int r8 = r10.f331326p     // Catch:{ all -> 0x012e }
            android.media.MediaCodec$BufferInfo r9 = r10.f331323m     // Catch:{ all -> 0x012e }
            r1 = r15
            r2 = r16
            r4 = r18
            boolean r0 = r1.mo162281n(r2, r4, r6, r7, r8, r9)     // Catch:{ all -> 0x012e }
            if (r0 == 0) goto L_0x012c
            r10.f331326p = r13     // Catch:{ all -> 0x012e }
            monitor-exit(r14)     // Catch:{ all -> 0x012e }
            return r12
        L_0x012c:
            monitor-exit(r14)     // Catch:{ all -> 0x012e }
            return r11
        L_0x012e:
            r0 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x012e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s62.C110767k.mo162295d(long, long):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01ae, code lost:
        r5 = 3;
        r6 = 4;
        r1.f331325o.mo148213o(r11, 0, r13, r7, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01ba, code lost:
        r5 = 3;
        r6 = 4;
        com.tencent.p014mm.sdk.platformtools.Log.m105921e("MicroMsg.TrackDataSource", "%s read data index[%d, %d] sample info[%d, %d]", mo162299i(), java.lang.Integer.valueOf(r11), java.lang.Integer.valueOf(r13), java.lang.Long.valueOf(r7), java.lang.Integer.valueOf(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01e4, code lost:
        r1.f331324n.mo161382a();
        r10 = r1.f331324n.mo161383b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01f3, code lost:
        if (r1.f331312b.f331305j == false) goto L_0x01f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01f9, code lost:
        if (mo162292a(r7, r10) != false) goto L_0x01fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01fb, code lost:
        r6 = new java.lang.Object[r6];
        r6[0] = mo162299i();
        r6[1] = java.lang.Boolean.valueOf(r1.f331312b.f331305j);
        r6[2] = java.lang.Long.valueOf(r10);
        r6[r5] = java.lang.Long.valueOf(r1.f331318h);
        com.tencent.p014mm.sdk.platformtools.Log.m105929w("MicroMsg.TrackDataSource", "%s feed input buffer isOnlineVideo[%b] next[%d] onlineCacheMs[%d]", r6);
        r12 = r1.f331324n.mo161383b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0234, code lost:
        if (java.lang.Math.abs(r12 - r7) >= com.tencent.tav.coremedia.TimeUtil.SECOND_TO_US) goto L_0x0236;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0236, code lost:
        r6 = new java.lang.Object[r5];
        r6[0] = mo162299i();
        r6[1] = java.lang.Long.valueOf(r12);
        r6[2] = java.lang.Long.valueOf(r7);
        com.tencent.p014mm.sdk.platformtools.Log.m105929w("MicroMsg.TrackDataSource", "%s reset extractor finish but seek time is not right[%d, %d]", r6);
        r1.f331312b.f331306k = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0258, code lost:
        r12 = r1.f331318h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x025e, code lost:
        if (r12 == 0) goto L_0x0260;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0264, code lost:
        if (mo162292a(r7, r10) != false) goto L_0x0266;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0266, code lost:
        r6 = new java.lang.Object[r5];
        r6[0] = mo162299i();
        r6[1] = java.lang.Long.valueOf(r10);
        r6[2] = java.lang.Long.valueOf(r1.f331318h);
        com.tencent.p014mm.sdk.platformtools.Log.m105929w("MicroMsg.TrackDataSource", "%s feed input buffer next[%d] onlineCacheMs[%d]", r6);
        r12 = r1.f331324n.mo161383b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0295, code lost:
        if (java.lang.Math.abs(r12 - r7) >= 3000000) goto L_0x0297;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0297, code lost:
        r6 = new java.lang.Object[r5];
        r6[0] = mo162299i();
        r6[1] = java.lang.Long.valueOf(r12);
        r6[2] = java.lang.Long.valueOf(r7);
        com.tencent.p014mm.sdk.platformtools.Log.m105929w("MicroMsg.TrackDataSource", "%s reset extractor finish but seek time is not right[%d, %d]", r6);
        r1.f331313c.obtainMessage(5, -2, -2).sendToTarget();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02bd, code lost:
        r0 = r1.f331317g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02bf, code lost:
        if (r0 != null) goto L_0x02c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02c1, code lost:
        r1.f331318h = r0.mo132384a() * 1000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02da, code lost:
        r6 = new java.lang.Object[r5];
        r6[0] = mo162299i();
        r6[1] = java.lang.Long.valueOf(r10);
        r6[2] = java.lang.Long.valueOf(r1.f331318h);
        com.tencent.p014mm.sdk.platformtools.Log.m105929w("MicroMsg.TrackDataSource", "%s feed input buffer next[%d] onlineCacheMs[%d]", r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02fe, code lost:
        if (mo162292a(r7, -1) != false) goto L_0x0300;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0300, code lost:
        r1.f331313c.obtainMessage(5, -3, -3).sendToTarget();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x030a, code lost:
        r0 = r1.f331317g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x030c, code lost:
        if (r0 != null) goto L_0x030e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x030e, code lost:
        r1.f331318h = r0.mo132384a() * 1000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0316, code lost:
        r5 = new java.lang.Object[r5];
        r5[0] = mo162299i();
        r5[1] = java.lang.Long.valueOf(r7);
        r5[2] = java.lang.Long.valueOf(r10);
        com.tencent.p014mm.sdk.platformtools.Log.m105919d("MicroMsg.TrackDataSource", "%s finish to feed input buffer [%d, %d]", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0332, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105919d("MicroMsg.TrackDataSource", "%s start to feed input buffer index %d [%d, %b]", mo162299i(), java.lang.Integer.valueOf(r11), java.lang.Integer.valueOf(r1.f331311a), java.lang.Boolean.valueOf(r1.f331316f));
        r3 = z21.C112580a.f337112a;
        r3 = oa1.C117731d.m166007c().mo182445g("clicfg_timeline_enable_read_data_zero", false, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0093, code lost:
        if (z21.C112580a.f337112a.booleanValue() == r3) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0095, code lost:
        z21.C112580a.f337112a = java.lang.Boolean.valueOf(r3);
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.VideoPlayConfig", "enableReadSampleZero :%b", java.lang.Boolean.valueOf(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00aa, code lost:
        if (r3 == false) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ad, code lost:
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b4, code lost:
        if (r1.f331312b.f331306k == false) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b8, code lost:
        if (f331310v == false) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ba, code lost:
        r3 = r1.f331327q;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00bc, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r8 = r1.f331325o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00bf, code lost:
        if (r8 == null) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c1, code lost:
        r8.mo148213o(r11, 0, 0, r1.f331321k * 1000, 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00cd, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d2, code lost:
        r1.f331325o.mo148213o(r11, 0, 0, r1.f331321k * 1000, 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e0, code lost:
        r1.f331316f = true;
        r1.f331312b.f331306k = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e6, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e7, code lost:
        if (r0 == null) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        r3 = r1.f331324n.mo161387f(r0, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        r12 = r1.f331324n.mo161383b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        r0 = r1.f331324n.f329324a.getSampleFlags();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00fe, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0100, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0101, code lost:
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0103, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0104, code lost:
        r12 = 0;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace("MicroMsg.TrackDataSource", r0, "MediaExtractor get sample data error: %s", r0.getMessage());
        r7 = r12;
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0118, code lost:
        r0 = 0;
        r3 = 0;
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x011c, code lost:
        r7 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x011d, code lost:
        r13 = r3;
        com.tencent.p014mm.sdk.platformtools.Log.m105919d("MicroMsg.TrackDataSource", "%s read data, state:%s index[%d, %d] sample info[%d, %d]", mo162299i(), java.lang.Integer.valueOf(r1.f331311a), java.lang.Integer.valueOf(r11), java.lang.Integer.valueOf(r13), java.lang.Long.valueOf(r7), java.lang.Integer.valueOf(r0));
        mo162304r(r0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0152, code lost:
        if (r13 <= r6) goto L_0x0154;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0154, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.TrackDataSource", "read data index eof. sampleSize:%d", java.lang.Integer.valueOf(r13));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0165, code lost:
        if (f331310v != false) goto L_0x0167;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0169, code lost:
        monitor-enter(r1.f331327q);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        r8 = r1.f331325o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x016c, code lost:
        if (r8 != null) goto L_0x016e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x016e, code lost:
        r8.mo148213o(r11, 0, 0, r1.f331321k * 1000, 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x017f, code lost:
        r1.f331325o.mo148213o(r11, 0, 0, r1.f331321k * 1000, 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x018d, code lost:
        r1.f331316f = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x018f, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0190, code lost:
        if (r13 > 0) goto L_0x0192;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0194, code lost:
        if (f331310v != false) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0198, code lost:
        monitor-enter(r1.f331327q);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:?, code lost:
        r10 = r1.f331325o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x019b, code lost:
        if (r10 != null) goto L_0x019d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x019d, code lost:
        r5 = 3;
        r6 = 4;
        r10.mo148213o(r11, 0, r13, r7, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01a7, code lost:
        r5 = 3;
        r6 = 4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0154 A[Catch:{ Exception -> 0x0346 }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0190 A[Catch:{ Exception -> 0x0346 }] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo162296e() {
        /*
            r21 = this;
            r1 = r21
            r2 = 0
            java.lang.String r0 = "MicroMsg.TrackDataSource"
            java.lang.String r3 = "doubleReleaseSwitch:[%b]"
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0346 }
            boolean r6 = f331310v     // Catch:{ Exception -> 0x0346 }
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch:{ Exception -> 0x0346 }
            r5[r2] = r6     // Catch:{ Exception -> 0x0346 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r3, r5)     // Catch:{ Exception -> 0x0346 }
            int r0 = r1.f331311a     // Catch:{ Exception -> 0x0346 }
            boolean r0 = s62.C110764e.m150717a(r0)     // Catch:{ Exception -> 0x0346 }
            if (r0 != 0) goto L_0x0336
            boolean r0 = r1.f331316f     // Catch:{ Exception -> 0x0346 }
            if (r0 == 0) goto L_0x0023
            goto L_0x0336
        L_0x0023:
            r0 = 0
            java.lang.Object r3 = r1.f331327q     // Catch:{ Exception -> 0x0346 }
            monitor-enter(r3)     // Catch:{ Exception -> 0x0346 }
            com.tencent.mm.compatible.deviceinfo.a r5 = r1.f331325o     // Catch:{ all -> 0x0333 }
            r6 = -1
            r7 = 0
            r9 = 2
            if (r5 == 0) goto L_0x0050
            int r5 = r5.mo148204f(r7)     // Catch:{ all -> 0x0333 }
            if (r5 >= 0) goto L_0x004e
            java.lang.String r0 = "MicroMsg.TrackDataSource"
            java.lang.String r5 = "%s can not dequeue effect input buffer, state:%s"
            java.lang.Object[] r6 = new java.lang.Object[r9]     // Catch:{ all -> 0x0333 }
            java.lang.String r7 = r21.mo162299i()     // Catch:{ all -> 0x0333 }
            r6[r2] = r7     // Catch:{ all -> 0x0333 }
            int r7 = r1.f331311a     // Catch:{ all -> 0x0333 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0333 }
            r6[r4] = r7     // Catch:{ all -> 0x0333 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r5, r6)     // Catch:{ all -> 0x0333 }
            monitor-exit(r3)     // Catch:{ all -> 0x0333 }
            return r2
        L_0x004e:
            r11 = r5
            goto L_0x0051
        L_0x0050:
            r11 = -1
        L_0x0051:
            if (r11 < 0) goto L_0x0059
            com.tencent.mm.compatible.deviceinfo.a r0 = r1.f331325o     // Catch:{ all -> 0x0333 }
            java.nio.ByteBuffer r0 = r0.mo148207i(r11)     // Catch:{ all -> 0x0333 }
        L_0x0059:
            monitor-exit(r3)     // Catch:{ all -> 0x0333 }
            java.lang.String r3 = "MicroMsg.TrackDataSource"
            java.lang.String r5 = "%s start to feed input buffer index %d [%d, %b]"
            r14 = 4
            java.lang.Object[] r10 = new java.lang.Object[r14]     // Catch:{ Exception -> 0x0346 }
            java.lang.String r12 = r21.mo162299i()     // Catch:{ Exception -> 0x0346 }
            r10[r2] = r12     // Catch:{ Exception -> 0x0346 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x0346 }
            r10[r4] = r12     // Catch:{ Exception -> 0x0346 }
            int r12 = r1.f331311a     // Catch:{ Exception -> 0x0346 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ Exception -> 0x0346 }
            r10[r9] = r12     // Catch:{ Exception -> 0x0346 }
            boolean r12 = r1.f331316f     // Catch:{ Exception -> 0x0346 }
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)     // Catch:{ Exception -> 0x0346 }
            r15 = 3
            r10[r15] = r12     // Catch:{ Exception -> 0x0346 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r5, r10)     // Catch:{ Exception -> 0x0346 }
            java.lang.Boolean r3 = z21.C112580a.f337112a     // Catch:{ Exception -> 0x0346 }
            oa1.d r3 = oa1.C117731d.m166007c()     // Catch:{ Exception -> 0x0346 }
            java.lang.String r5 = "clicfg_timeline_enable_read_data_zero"
            boolean r3 = r3.mo182445g(r5, r2, r4)     // Catch:{ Exception -> 0x0346 }
            java.lang.Boolean r5 = z21.C112580a.f337112a     // Catch:{ Exception -> 0x0346 }
            boolean r5 = r5.booleanValue()     // Catch:{ Exception -> 0x0346 }
            if (r5 == r3) goto L_0x00aa
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)     // Catch:{ Exception -> 0x0346 }
            z21.C112580a.f337112a = r5     // Catch:{ Exception -> 0x0346 }
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0346 }
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r3)     // Catch:{ Exception -> 0x0346 }
            r5[r2] = r10     // Catch:{ Exception -> 0x0346 }
            java.lang.String r10 = "MicroMsg.VideoPlayConfig"
            java.lang.String r12 = "enableReadSampleZero :%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r12, r5)     // Catch:{ Exception -> 0x0346 }
        L_0x00aa:
            if (r3 == 0) goto L_0x00ad
            goto L_0x00ae
        L_0x00ad:
            r6 = 0
        L_0x00ae:
            s62.j r3 = r1.f331312b     // Catch:{ Exception -> 0x0346 }
            boolean r3 = r3.f331306k     // Catch:{ Exception -> 0x0346 }
            r17 = 1000(0x3e8, double:4.94E-321)
            if (r3 == 0) goto L_0x00e7
            boolean r0 = f331310v     // Catch:{ Exception -> 0x0346 }
            if (r0 == 0) goto L_0x00d2
            java.lang.Object r3 = r1.f331327q     // Catch:{ Exception -> 0x0346 }
            monitor-enter(r3)     // Catch:{ Exception -> 0x0346 }
            com.tencent.mm.compatible.deviceinfo.a r8 = r1.f331325o     // Catch:{ all -> 0x00cf }
            if (r8 == 0) goto L_0x00cd
            r10 = 0
            r0 = 0
            long r5 = r1.f331321k     // Catch:{ all -> 0x00cf }
            long r12 = r5 * r17
            r14 = 4
            r9 = r11
            r11 = r0
            r8.mo148213o(r9, r10, r11, r12, r14)     // Catch:{ all -> 0x00cf }
        L_0x00cd:
            monitor-exit(r3)     // Catch:{ all -> 0x00cf }
            goto L_0x00e0
        L_0x00cf:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00cf }
            throw r0     // Catch:{ Exception -> 0x0346 }
        L_0x00d2:
            com.tencent.mm.compatible.deviceinfo.a r8 = r1.f331325o     // Catch:{ Exception -> 0x0346 }
            r10 = 0
            r0 = 0
            long r5 = r1.f331321k     // Catch:{ Exception -> 0x0346 }
            long r12 = r5 * r17
            r14 = 4
            r9 = r11
            r11 = r0
            r8.mo148213o(r9, r10, r11, r12, r14)     // Catch:{ Exception -> 0x0346 }
        L_0x00e0:
            r1.f331316f = r4     // Catch:{ Exception -> 0x0346 }
            s62.j r0 = r1.f331312b     // Catch:{ Exception -> 0x0346 }
            r0.f331306k = r2     // Catch:{ Exception -> 0x0346 }
            return r2
        L_0x00e7:
            if (r0 == 0) goto L_0x0118
            oj.b r3 = r1.f331324n     // Catch:{ Exception -> 0x0103 }
            int r3 = r3.mo161387f(r0, r2)     // Catch:{ Exception -> 0x0103 }
            oj.b r0 = r1.f331324n     // Catch:{ Exception -> 0x0100 }
            long r12 = r0.mo161383b()     // Catch:{ Exception -> 0x0100 }
            oj.b r0 = r1.f331324n     // Catch:{ Exception -> 0x00fe }
            android.media.MediaExtractor r0 = r0.f329324a     // Catch:{ Exception -> 0x00fe }
            int r0 = r0.getSampleFlags()     // Catch:{ Exception -> 0x00fe }
            goto L_0x011c
        L_0x00fe:
            r0 = move-exception
            goto L_0x0106
        L_0x0100:
            r0 = move-exception
            r12 = r7
            goto L_0x0106
        L_0x0103:
            r0 = move-exception
            r12 = r7
            r3 = 0
        L_0x0106:
            java.lang.String r5 = "MicroMsg.TrackDataSource"
            java.lang.String r10 = "MediaExtractor get sample data error: %s"
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0346 }
            java.lang.String r8 = r0.getMessage()     // Catch:{ Exception -> 0x0346 }
            r7[r2] = r8     // Catch:{ Exception -> 0x0346 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r10, r7)     // Catch:{ Exception -> 0x0346 }
            r7 = r12
            r0 = 0
            goto L_0x011d
        L_0x0118:
            r0 = 0
            r3 = 0
            r12 = 0
        L_0x011c:
            r7 = r12
        L_0x011d:
            r13 = r3
            java.lang.String r3 = "MicroMsg.TrackDataSource"
            java.lang.String r5 = "%s read data, state:%s index[%d, %d] sample info[%d, %d]"
            r10 = 6
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x0346 }
            java.lang.String r12 = r21.mo162299i()     // Catch:{ Exception -> 0x0346 }
            r10[r2] = r12     // Catch:{ Exception -> 0x0346 }
            int r12 = r1.f331311a     // Catch:{ Exception -> 0x0346 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ Exception -> 0x0346 }
            r10[r4] = r12     // Catch:{ Exception -> 0x0346 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x0346 }
            r10[r9] = r12     // Catch:{ Exception -> 0x0346 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x0346 }
            r10[r15] = r12     // Catch:{ Exception -> 0x0346 }
            java.lang.Long r12 = java.lang.Long.valueOf(r7)     // Catch:{ Exception -> 0x0346 }
            r10[r14] = r12     // Catch:{ Exception -> 0x0346 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0346 }
            r9 = 5
            r10[r9] = r12     // Catch:{ Exception -> 0x0346 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r5, r10)     // Catch:{ Exception -> 0x0346 }
            r1.mo162304r(r0, r7)     // Catch:{ Exception -> 0x0346 }
            if (r13 > r6) goto L_0x0190
            java.lang.String r0 = "MicroMsg.TrackDataSource"
            java.lang.String r3 = "read data index eof. sampleSize:%d"
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0346 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x0346 }
            r5[r2] = r6     // Catch:{ Exception -> 0x0346 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r3, r5)     // Catch:{ Exception -> 0x0346 }
            boolean r0 = f331310v     // Catch:{ Exception -> 0x0346 }
            if (r0 == 0) goto L_0x017f
            java.lang.Object r3 = r1.f331327q     // Catch:{ Exception -> 0x0346 }
            monitor-enter(r3)     // Catch:{ Exception -> 0x0346 }
            com.tencent.mm.compatible.deviceinfo.a r8 = r1.f331325o     // Catch:{ all -> 0x017c }
            if (r8 == 0) goto L_0x017a
            r10 = 0
            r0 = 0
            long r5 = r1.f331321k     // Catch:{ all -> 0x017c }
            long r12 = r5 * r17
            r14 = 4
            r9 = r11
            r11 = r0
            r8.mo148213o(r9, r10, r11, r12, r14)     // Catch:{ all -> 0x017c }
        L_0x017a:
            monitor-exit(r3)     // Catch:{ all -> 0x017c }
            goto L_0x018d
        L_0x017c:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x017c }
            throw r0     // Catch:{ Exception -> 0x0346 }
        L_0x017f:
            com.tencent.mm.compatible.deviceinfo.a r8 = r1.f331325o     // Catch:{ Exception -> 0x0346 }
            r10 = 0
            r0 = 0
            long r5 = r1.f331321k     // Catch:{ Exception -> 0x0346 }
            long r12 = r5 * r17
            r14 = 4
            r9 = r11
            r11 = r0
            r8.mo148213o(r9, r10, r11, r12, r14)     // Catch:{ Exception -> 0x0346 }
        L_0x018d:
            r1.f331316f = r4     // Catch:{ Exception -> 0x0346 }
            return r2
        L_0x0190:
            if (r13 <= 0) goto L_0x01ba
            boolean r0 = f331310v     // Catch:{ Exception -> 0x0346 }
            if (r0 == 0) goto L_0x01ae
            java.lang.Object r3 = r1.f331327q     // Catch:{ Exception -> 0x0346 }
            monitor-enter(r3)     // Catch:{ Exception -> 0x0346 }
            com.tencent.mm.compatible.deviceinfo.a r10 = r1.f331325o     // Catch:{ all -> 0x01ab }
            if (r10 == 0) goto L_0x01a7
            r12 = 0
            r16 = 0
            r5 = 3
            r6 = 4
            r14 = r7
            r10.mo148213o(r11, r12, r13, r14, r16)     // Catch:{ all -> 0x01ab }
            goto L_0x01a9
        L_0x01a7:
            r5 = 3
            r6 = 4
        L_0x01a9:
            monitor-exit(r3)     // Catch:{ all -> 0x01ab }
            goto L_0x01e4
        L_0x01ab:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x01ab }
            throw r0     // Catch:{ Exception -> 0x0346 }
        L_0x01ae:
            r5 = 3
            r6 = 4
            com.tencent.mm.compatible.deviceinfo.a r10 = r1.f331325o     // Catch:{ Exception -> 0x0346 }
            r12 = 0
            r16 = 0
            r14 = r7
            r10.mo148213o(r11, r12, r13, r14, r16)     // Catch:{ Exception -> 0x0346 }
            goto L_0x01e4
        L_0x01ba:
            r5 = 3
            r6 = 4
            java.lang.String r3 = "MicroMsg.TrackDataSource"
            java.lang.String r10 = "%s read data index[%d, %d] sample info[%d, %d]"
            java.lang.Object[] r12 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x0346 }
            java.lang.String r14 = r21.mo162299i()     // Catch:{ Exception -> 0x0346 }
            r12[r2] = r14     // Catch:{ Exception -> 0x0346 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x0346 }
            r12[r4] = r11     // Catch:{ Exception -> 0x0346 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x0346 }
            r13 = 2
            r12[r13] = r11     // Catch:{ Exception -> 0x0346 }
            java.lang.Long r11 = java.lang.Long.valueOf(r7)     // Catch:{ Exception -> 0x0346 }
            r12[r5] = r11     // Catch:{ Exception -> 0x0346 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0346 }
            r12[r6] = r0     // Catch:{ Exception -> 0x0346 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r10, r12)     // Catch:{ Exception -> 0x0346 }
        L_0x01e4:
            oj.b r0 = r1.f331324n     // Catch:{ Exception -> 0x0346 }
            r0.mo161382a()     // Catch:{ Exception -> 0x0346 }
            oj.b r0 = r1.f331324n     // Catch:{ Exception -> 0x0346 }
            long r10 = r0.mo161383b()     // Catch:{ Exception -> 0x0346 }
            s62.j r0 = r1.f331312b     // Catch:{ Exception -> 0x0346 }
            boolean r0 = r0.f331305j     // Catch:{ Exception -> 0x0346 }
            if (r0 != 0) goto L_0x0258
            boolean r0 = r1.mo162292a(r7, r10)     // Catch:{ Exception -> 0x0346 }
            if (r0 == 0) goto L_0x0316
            java.lang.String r0 = "MicroMsg.TrackDataSource"
            java.lang.String r3 = "%s feed input buffer isOnlineVideo[%b] next[%d] onlineCacheMs[%d]"
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0346 }
            java.lang.String r9 = r21.mo162299i()     // Catch:{ Exception -> 0x0346 }
            r6[r2] = r9     // Catch:{ Exception -> 0x0346 }
            s62.j r9 = r1.f331312b     // Catch:{ Exception -> 0x0346 }
            boolean r9 = r9.f331305j     // Catch:{ Exception -> 0x0346 }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)     // Catch:{ Exception -> 0x0346 }
            r6[r4] = r9     // Catch:{ Exception -> 0x0346 }
            java.lang.Long r9 = java.lang.Long.valueOf(r10)     // Catch:{ Exception -> 0x0346 }
            r12 = 2
            r6[r12] = r9     // Catch:{ Exception -> 0x0346 }
            long r12 = r1.f331318h     // Catch:{ Exception -> 0x0346 }
            java.lang.Long r9 = java.lang.Long.valueOf(r12)     // Catch:{ Exception -> 0x0346 }
            r6[r5] = r9     // Catch:{ Exception -> 0x0346 }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r0, r3, r6)     // Catch:{ Exception -> 0x0346 }
            oj.b r0 = r1.f331324n     // Catch:{ Exception -> 0x0346 }
            long r12 = r0.mo161383b()     // Catch:{ Exception -> 0x0346 }
            long r14 = r12 - r7
            long r14 = java.lang.Math.abs(r14)     // Catch:{ Exception -> 0x0346 }
            r16 = 1000000(0xf4240, double:4.940656E-318)
            int r0 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r0 < 0) goto L_0x0316
            java.lang.String r0 = "MicroMsg.TrackDataSource"
            java.lang.String r3 = "%s reset extractor finish but seek time is not right[%d, %d]"
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0346 }
            java.lang.String r9 = r21.mo162299i()     // Catch:{ Exception -> 0x0346 }
            r6[r2] = r9     // Catch:{ Exception -> 0x0346 }
            java.lang.Long r9 = java.lang.Long.valueOf(r12)     // Catch:{ Exception -> 0x0346 }
            r6[r4] = r9     // Catch:{ Exception -> 0x0346 }
            java.lang.Long r9 = java.lang.Long.valueOf(r7)     // Catch:{ Exception -> 0x0346 }
            r12 = 2
            r6[r12] = r9     // Catch:{ Exception -> 0x0346 }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r0, r3, r6)     // Catch:{ Exception -> 0x0346 }
            s62.j r0 = r1.f331312b     // Catch:{ Exception -> 0x0346 }
            r0.f331306k = r4     // Catch:{ Exception -> 0x0346 }
            goto L_0x0316
        L_0x0258:
            long r12 = r1.f331318h     // Catch:{ Exception -> 0x0346 }
            r14 = 0
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 != 0) goto L_0x02ca
            boolean r0 = r1.mo162292a(r7, r10)     // Catch:{ Exception -> 0x0346 }
            if (r0 == 0) goto L_0x0316
            java.lang.String r0 = "MicroMsg.TrackDataSource"
            java.lang.String r3 = "%s feed input buffer next[%d] onlineCacheMs[%d]"
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0346 }
            java.lang.String r12 = r21.mo162299i()     // Catch:{ Exception -> 0x0346 }
            r6[r2] = r12     // Catch:{ Exception -> 0x0346 }
            java.lang.Long r12 = java.lang.Long.valueOf(r10)     // Catch:{ Exception -> 0x0346 }
            r6[r4] = r12     // Catch:{ Exception -> 0x0346 }
            long r12 = r1.f331318h     // Catch:{ Exception -> 0x0346 }
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ Exception -> 0x0346 }
            r13 = 2
            r6[r13] = r12     // Catch:{ Exception -> 0x0346 }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r0, r3, r6)     // Catch:{ Exception -> 0x0346 }
            oj.b r0 = r1.f331324n     // Catch:{ Exception -> 0x0346 }
            long r12 = r0.mo161383b()     // Catch:{ Exception -> 0x0346 }
            long r14 = r12 - r7
            long r14 = java.lang.Math.abs(r14)     // Catch:{ Exception -> 0x0346 }
            r19 = 3000000(0x2dc6c0, double:1.482197E-317)
            int r0 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
            if (r0 < 0) goto L_0x02bd
            java.lang.String r0 = "MicroMsg.TrackDataSource"
            java.lang.String r3 = "%s reset extractor finish but seek time is not right[%d, %d]"
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0346 }
            java.lang.String r14 = r21.mo162299i()     // Catch:{ Exception -> 0x0346 }
            r6[r2] = r14     // Catch:{ Exception -> 0x0346 }
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ Exception -> 0x0346 }
            r6[r4] = r12     // Catch:{ Exception -> 0x0346 }
            java.lang.Long r12 = java.lang.Long.valueOf(r7)     // Catch:{ Exception -> 0x0346 }
            r13 = 2
            r6[r13] = r12     // Catch:{ Exception -> 0x0346 }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r0, r3, r6)     // Catch:{ Exception -> 0x0346 }
            com.tencent.mm.sdk.platformtools.MMHandler r0 = r1.f331313c     // Catch:{ Exception -> 0x0346 }
            r3 = -2
            android.os.Message r0 = r0.obtainMessage(r9, r3, r3)     // Catch:{ Exception -> 0x0346 }
            r0.sendToTarget()     // Catch:{ Exception -> 0x0346 }
        L_0x02bd:
            s62.b r0 = r1.f331317g     // Catch:{ Exception -> 0x0346 }
            if (r0 == 0) goto L_0x0316
            long r12 = r0.mo132384a()     // Catch:{ Exception -> 0x0346 }
            long r12 = r12 * r17
            r1.f331318h = r12     // Catch:{ Exception -> 0x0346 }
            goto L_0x0316
        L_0x02ca:
            r14 = 0
            int r0 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r0 < 0) goto L_0x02da
            long r14 = r10 / r17
            r19 = 1200(0x4b0, double:5.93E-321)
            long r14 = r14 + r19
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x0316
        L_0x02da:
            java.lang.String r0 = "MicroMsg.TrackDataSource"
            java.lang.String r3 = "%s feed input buffer next[%d] onlineCacheMs[%d]"
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0346 }
            java.lang.String r12 = r21.mo162299i()     // Catch:{ Exception -> 0x0346 }
            r6[r2] = r12     // Catch:{ Exception -> 0x0346 }
            java.lang.Long r12 = java.lang.Long.valueOf(r10)     // Catch:{ Exception -> 0x0346 }
            r6[r4] = r12     // Catch:{ Exception -> 0x0346 }
            long r12 = r1.f331318h     // Catch:{ Exception -> 0x0346 }
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ Exception -> 0x0346 }
            r13 = 2
            r6[r13] = r12     // Catch:{ Exception -> 0x0346 }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r0, r3, r6)     // Catch:{ Exception -> 0x0346 }
            r12 = -1
            boolean r0 = r1.mo162292a(r7, r12)     // Catch:{ Exception -> 0x0346 }
            if (r0 == 0) goto L_0x030a
            com.tencent.mm.sdk.platformtools.MMHandler r0 = r1.f331313c     // Catch:{ Exception -> 0x0346 }
            r3 = -3
            android.os.Message r0 = r0.obtainMessage(r9, r3, r3)     // Catch:{ Exception -> 0x0346 }
            r0.sendToTarget()     // Catch:{ Exception -> 0x0346 }
        L_0x030a:
            s62.b r0 = r1.f331317g     // Catch:{ Exception -> 0x0346 }
            if (r0 == 0) goto L_0x0316
            long r12 = r0.mo132384a()     // Catch:{ Exception -> 0x0346 }
            long r12 = r12 * r17
            r1.f331318h = r12     // Catch:{ Exception -> 0x0346 }
        L_0x0316:
            java.lang.String r0 = "MicroMsg.TrackDataSource"
            java.lang.String r3 = "%s finish to feed input buffer [%d, %d]"
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0346 }
            java.lang.String r6 = r21.mo162299i()     // Catch:{ Exception -> 0x0346 }
            r5[r2] = r6     // Catch:{ Exception -> 0x0346 }
            java.lang.Long r6 = java.lang.Long.valueOf(r7)     // Catch:{ Exception -> 0x0346 }
            r5[r4] = r6     // Catch:{ Exception -> 0x0346 }
            java.lang.Long r4 = java.lang.Long.valueOf(r10)     // Catch:{ Exception -> 0x0346 }
            r6 = 2
            r5[r6] = r4     // Catch:{ Exception -> 0x0346 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r3, r5)     // Catch:{ Exception -> 0x0346 }
            return r2
        L_0x0333:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0333 }
            throw r0     // Catch:{ Exception -> 0x0346 }
        L_0x0336:
            java.lang.String r0 = "MicroMsg.TrackDataSource"
            java.lang.String r3 = "%s feed input buffer is end."
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0346 }
            java.lang.String r5 = r21.mo162299i()     // Catch:{ Exception -> 0x0346 }
            r4[r2] = r5     // Catch:{ Exception -> 0x0346 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r3, r4)     // Catch:{ Exception -> 0x0346 }
            return r2
        L_0x0346:
            r0 = move-exception
            java.lang.String r3 = "MicroMsg.TrackDataSource"
            java.lang.String r4 = "feedInputBuffer exception"
            java.lang.Object[] r5 = new java.lang.Object[r2]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r4, r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: s62.C110767k.mo162296e():boolean");
    }

    /* renamed from: f */
    public void mo162297f() {
        Log.m105925i("MicroMsg.TrackDataSource", "%s flush codec", mo162299i());
        this.f331326p = -1;
        try {
            C104619a aVar = this.f331325o;
            if (aVar != null) {
                aVar.mo148206h();
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.TrackDataSource", e, "flushCodec exception", new Object[0]);
        }
    }

    /* renamed from: g */
    public void mo162298g(MediaFormat mediaFormat, String str, int i) {
        Log.m105925i("MicroMsg.TrackDataSource", "%s found media format mime[%s] track[%d] format[%s]", mo162299i(), str, Integer.valueOf(i), mediaFormat);
        this.f331322l = i;
        this.f331320j = str;
        this.f331321k = mediaFormat.getLong("durationUs") / 1000;
        this.f331319i = mediaFormat;
    }

    /* renamed from: h */
    public abstract boolean mo162278h(C104619a aVar);

    /* renamed from: i */
    public String mo162299i() {
        if (this.f331312b != null) {
            return mo162283u() + "_" + this.f331312b.mo162289c() + "_" + Process.myTid();
        }
        return mo162283u() + "_" + Process.myTid();
    }

    /* renamed from: j */
    public void mo162279j(C104619a aVar, MediaFormat mediaFormat) {
    }

    /* renamed from: k */
    public void mo162280k() {
    }

    /* renamed from: l */
    public void mo162300l() {
        Log.m105925i("MicroMsg.TrackDataSource", "%s start to pause", mo162299i());
        mo162306t(4);
        mo162280k();
    }

    /* renamed from: m */
    public boolean mo162301m() {
        Log.m105925i("MicroMsg.TrackDataSource", "%s start to prepare path %s", mo162299i(), this.f331314d);
        long currentTicks = Util.currentTicks();
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("TrackDataSource");
        this.f331316f = false;
        long j = 0;
        try {
            Log.m105925i("MicroMsg.TrackDataSource", "%s start to init extractor", mo162299i());
            this.f331324n = new C110052b();
            if (this instanceof C110774n) {
                String str = this.f331314d;
                if (str == null) {
                    str = "";
                }
                mmkv.putString("path", str);
                mmkv.putInt("type", 1);
                mmkv.putLong("ts", System.currentTimeMillis());
                mmkv.commit();
            }
            if (!Util.isNullOrNil(this.f331314d)) {
                RandomAccessFile B = C86013q1.m106420B(this.f331314d, false);
                FileDescriptor fd = B.getFD();
                this.f331315e = fd;
                if (C107835h0.f322847d.f322835a == 1) {
                    this.f331324n.mo161391j(fd, 0, C86013q1.m106451l(this.f331314d));
                } else {
                    this.f331324n.f329324a.setDataSource(fd);
                }
                B.close();
            } else {
                FileDescriptor fileDescriptor = this.f331315e;
                if (fileDescriptor != null && fileDescriptor.valid()) {
                    this.f331324n.mo161391j(this.f331315e, 0, 0);
                }
            }
            int d = this.f331324n.mo161385d();
            if (d <= 0) {
                Log.m105920e("MicroMsg.TrackDataSource", "extractor get track count 0.");
                this.f331324n.mo161388g();
                C110052b bVar = new C110052b();
                this.f331324n = bVar;
                bVar.mo161392k(this.f331314d);
                d = this.f331324n.mo161385d();
            }
            this.f331322l = -1;
            int i = 0;
            while (true) {
                if (i < d) {
                    MediaFormat e = this.f331324n.mo161386e(i);
                    String string = e.getString("mime");
                    if (string != null && string.contains(mo162283u())) {
                        mo162298g(e, string, i);
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
            int i2 = this.f331322l;
            if (i2 <= -1) {
                Log.m105929w("MicroMsg.TrackDataSource", "%s prepare track but can not find track index.[%d, %d]", mo162299i(), Integer.valueOf(d), Integer.valueOf(this.f331322l));
                this.f331312b.mo162291e("can not find ");
                if (mmkv.getString("path", "").equals(this.f331314d) && (this instanceof C110774n)) {
                    mmkv.putInt("type", 0);
                    mmkv.putString("path", "");
                    mmkv.putLong("ts", 0);
                    mmkv.commit();
                }
                return false;
            }
            this.f331324n.mo161390i(i2);
            if (!Util.isNullOrNil(this.f331314d)) {
                mo162293b(this.f331314d);
            }
            long currentTicks2 = Util.currentTicks();
            if (mmkv.getString("path", "").equals(this.f331314d) && (this instanceof C110774n)) {
                mmkv.putInt("type", 0);
                mmkv.putString("path", "");
                mmkv.putLong("ts", 0);
                mmkv.commit();
            }
            try {
                Log.m105925i("MicroMsg.TrackDataSource", "%s start to init decoder mime[%s] state[%d]", mo162299i(), this.f331320j, Integer.valueOf(this.f331311a));
                if (!C110764e.m150717a(this.f331311a)) {
                    synchronized (this.f331327q) {
                        Log.m105919d("MicroMsg.TrackDataSource", "%s before prepare init decoder, format info: %s", mo162299i(), this.f331319i);
                        C104619a c = C104619a.m140211c(this.f331320j);
                        this.f331325o = c;
                        mo162278h(c);
                        this.f331325o.mo148222y();
                    }
                    j = Util.currentTicks();
                }
                mo162306t(1);
                Log.m105925i("MicroMsg.TrackDataSource", "%s finish to prepare cost[%d %d %d]", mo162299i(), Long.valueOf(Util.ticksToNow(currentTicks)), Long.valueOf(currentTicks2 - currentTicks), Long.valueOf(j - currentTicks));
                return true;
            } catch (Exception e2) {
                Log.printErrStackTrace("MicroMsg.TrackDataSource", e2, "%s prepare init decoder error %s", mo162299i(), e2.toString());
                Log.printErrStackTrace("MicroMsg.TrackDataSource", e2, "%s prepare init decoder error, format info: %s", mo162299i(), this.f331319i);
                this.f331312b.mo162290d(mo162283u());
                return false;
            }
        } catch (Exception e3) {
            Log.printErrStackTrace("MicroMsg.TrackDataSource", e3, "%s prepare init extractor error", mo162299i());
            this.f331312b.mo162291e(e3.toString());
            if (mmkv.getString("path", "").equals(this.f331314d) && (this instanceof C110774n)) {
                mmkv.putInt("type", 0);
                mmkv.putString("path", "");
                mmkv.putLong("ts", 0);
                mmkv.commit();
            }
            return false;
        } catch (Throwable th) {
            if (mmkv.getString("path", "").equals(this.f331314d) && (this instanceof C110774n)) {
                mmkv.putInt("type", 0);
                mmkv.putString("path", "");
                mmkv.putLong("ts", 0);
                mmkv.commit();
            }
            throw th;
        }
    }

    /* renamed from: n */
    public abstract boolean mo162281n(long j, long j2, C104619a aVar, ByteBuffer byteBuffer, int i, MediaCodec.BufferInfo bufferInfo);

    /* renamed from: o */
    public void mo162282o() {
        Log.m105925i("MicroMsg.TrackDataSource", "%s release doubleReleaseSwitch:[%b]", mo162299i(), Boolean.valueOf(f331310v));
        if (f331310v) {
            Log.m105925i("MicroMsg.TrackDataSource", "%s into release fun", mo162299i());
            if (this.f331324n != null) {
                Log.m105925i("MicroMsg.TrackDataSource", "%s release,  extractor != null", mo162299i());
                this.f331324n.mo161388g();
                this.f331324n = null;
            }
            mo162302p();
            Log.m105925i("MicroMsg.TrackDataSource", "%s finish release", mo162299i());
            return;
        }
        Log.m105925i("MicroMsg.TrackDataSource", "%s release", mo162299i());
        C110052b bVar = this.f331324n;
        if (bVar != null) {
            bVar.mo161388g();
            this.f331324n = null;
        }
        C104619a aVar = this.f331325o;
        if (aVar != null) {
            aVar.mo148214p();
            this.f331325o = null;
        }
        Log.m105925i("MicroMsg.TrackDataSource", "%s finish release", mo162299i());
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0073 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0100 */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo162302p() {
        /*
            r12 = this;
            java.lang.String r0 = "MicroMsg.TrackDataSource"
            java.lang.String r1 = "%s releaseDecoder doubleReleaseSwitch:[%b]"
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r4 = r12.mo162299i()
            r5 = 0
            r3[r5] = r4
            boolean r4 = f331310v
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r6 = 1
            r3[r6] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r3)
            boolean r0 = f331310v
            r1 = 0
            if (r0 == 0) goto L_0x00ac
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            java.lang.Object r0 = r12.f331327q
            monitor-enter(r0)
            com.tencent.mm.compatible.deviceinfo.a r7 = r12.f331325o     // Catch:{ all -> 0x00a9 }
            if (r7 == 0) goto L_0x0097
            java.lang.String r7 = "MicroMsg.TrackDataSource"
            java.lang.String r8 = "%s release decoder"
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ all -> 0x00a9 }
            java.lang.String r10 = r12.mo162299i()     // Catch:{ all -> 0x00a9 }
            r9[r5] = r10     // Catch:{ all -> 0x00a9 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r9)     // Catch:{ all -> 0x00a9 }
            r12.mo162297f()     // Catch:{ all -> 0x00a9 }
            java.lang.String r7 = "MicroMsg.TrackDataSource"
            java.lang.String r8 = "%s wait lock cost[%d]"
            java.lang.Object[] r9 = new java.lang.Object[r2]     // Catch:{ all -> 0x00a9 }
            java.lang.String r10 = r12.mo162299i()     // Catch:{ all -> 0x00a9 }
            r9[r5] = r10     // Catch:{ all -> 0x00a9 }
            long r10 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r3)     // Catch:{ all -> 0x00a9 }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x00a9 }
            r9[r6] = r10     // Catch:{ all -> 0x00a9 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r9)     // Catch:{ all -> 0x00a9 }
            com.tencent.mm.compatible.deviceinfo.a r7 = r12.f331325o     // Catch:{ Exception -> 0x0073, all -> 0x0066 }
            r7.mo148223z()     // Catch:{ Exception -> 0x0073, all -> 0x0066 }
            com.tencent.mm.compatible.deviceinfo.a r7 = r12.f331325o     // Catch:{ all -> 0x0062 }
            r7.mo148214p()     // Catch:{ all -> 0x0062 }
        L_0x005f:
            r12.f331325o = r1     // Catch:{ all -> 0x00a9 }
            goto L_0x0079
        L_0x0062:
            r2 = move-exception
            r12.f331325o = r1     // Catch:{ all -> 0x00a9 }
            throw r2     // Catch:{ all -> 0x00a9 }
        L_0x0066:
            r2 = move-exception
            com.tencent.mm.compatible.deviceinfo.a r3 = r12.f331325o     // Catch:{ all -> 0x006f }
            r3.mo148214p()     // Catch:{ all -> 0x006f }
            r12.f331325o = r1     // Catch:{ all -> 0x00a9 }
            throw r2     // Catch:{ all -> 0x00a9 }
        L_0x006f:
            r2 = move-exception
            r12.f331325o = r1     // Catch:{ all -> 0x00a9 }
            throw r2     // Catch:{ all -> 0x00a9 }
        L_0x0073:
            com.tencent.mm.compatible.deviceinfo.a r7 = r12.f331325o     // Catch:{ all -> 0x0093 }
            r7.mo148214p()     // Catch:{ all -> 0x0093 }
            goto L_0x005f
        L_0x0079:
            java.lang.String r1 = "MicroMsg.TrackDataSource"
            java.lang.String r7 = "%s finish release decoder [%d]"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x00a9 }
            java.lang.String r8 = r12.mo162299i()     // Catch:{ all -> 0x00a9 }
            r2[r5] = r8     // Catch:{ all -> 0x00a9 }
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r3)     // Catch:{ all -> 0x00a9 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x00a9 }
            r2[r6] = r3     // Catch:{ all -> 0x00a9 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r7, r2)     // Catch:{ all -> 0x00a9 }
            goto L_0x00a6
        L_0x0093:
            r2 = move-exception
            r12.f331325o = r1     // Catch:{ all -> 0x00a9 }
            throw r2     // Catch:{ all -> 0x00a9 }
        L_0x0097:
            java.lang.String r1 = "MicroMsg.TrackDataSource"
            java.lang.String r2 = "%s releaseDecoder decoder == null, break"
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch:{ all -> 0x00a9 }
            java.lang.String r4 = r12.mo162299i()     // Catch:{ all -> 0x00a9 }
            r3[r5] = r4     // Catch:{ all -> 0x00a9 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r3)     // Catch:{ all -> 0x00a9 }
        L_0x00a6:
            monitor-exit(r0)     // Catch:{ all -> 0x00a9 }
            goto L_0x0128
        L_0x00a9:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00a9 }
            throw r1
        L_0x00ac:
            com.tencent.mm.compatible.deviceinfo.a r0 = r12.f331325o
            if (r0 == 0) goto L_0x0128
            java.lang.String r0 = "MicroMsg.TrackDataSource"
            java.lang.String r3 = "%s release decoder"
            java.lang.Object[] r4 = new java.lang.Object[r6]
            java.lang.String r7 = r12.mo162299i()
            r4[r5] = r7
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r3, r4)
            r12.mo162297f()
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            java.lang.Object r0 = r12.f331327q
            monitor-enter(r0)
            java.lang.String r7 = "MicroMsg.TrackDataSource"
            java.lang.String r8 = "%s wait lock cost[%d]"
            java.lang.Object[] r9 = new java.lang.Object[r2]     // Catch:{ all -> 0x0125 }
            java.lang.String r10 = r12.mo162299i()     // Catch:{ all -> 0x0125 }
            r9[r5] = r10     // Catch:{ all -> 0x0125 }
            long r10 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r3)     // Catch:{ all -> 0x0125 }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0125 }
            r9[r6] = r10     // Catch:{ all -> 0x0125 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r9)     // Catch:{ all -> 0x0125 }
            com.tencent.mm.compatible.deviceinfo.a r7 = r12.f331325o     // Catch:{ Exception -> 0x0100, all -> 0x00f3 }
            r7.mo148223z()     // Catch:{ Exception -> 0x0100, all -> 0x00f3 }
            com.tencent.mm.compatible.deviceinfo.a r7 = r12.f331325o     // Catch:{ all -> 0x00ef }
            r7.mo148214p()     // Catch:{ all -> 0x00ef }
        L_0x00ec:
            r12.f331325o = r1     // Catch:{ all -> 0x0125 }
            goto L_0x0106
        L_0x00ef:
            r2 = move-exception
            r12.f331325o = r1     // Catch:{ all -> 0x0125 }
            throw r2     // Catch:{ all -> 0x0125 }
        L_0x00f3:
            r2 = move-exception
            com.tencent.mm.compatible.deviceinfo.a r3 = r12.f331325o     // Catch:{ all -> 0x00fc }
            r3.mo148214p()     // Catch:{ all -> 0x00fc }
            r12.f331325o = r1     // Catch:{ all -> 0x0125 }
            throw r2     // Catch:{ all -> 0x0125 }
        L_0x00fc:
            r2 = move-exception
            r12.f331325o = r1     // Catch:{ all -> 0x0125 }
            throw r2     // Catch:{ all -> 0x0125 }
        L_0x0100:
            com.tencent.mm.compatible.deviceinfo.a r7 = r12.f331325o     // Catch:{ all -> 0x0121 }
            r7.mo148214p()     // Catch:{ all -> 0x0121 }
            goto L_0x00ec
        L_0x0106:
            monitor-exit(r0)     // Catch:{ all -> 0x0125 }
            java.lang.String r0 = "MicroMsg.TrackDataSource"
            java.lang.String r1 = "%s finish release decoder [%d]"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r7 = r12.mo162299i()
            r2[r5] = r7
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2[r6] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r2)
            goto L_0x0128
        L_0x0121:
            r2 = move-exception
            r12.f331325o = r1     // Catch:{ all -> 0x0125 }
            throw r2     // Catch:{ all -> 0x0125 }
        L_0x0125:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0125 }
            throw r1
        L_0x0128:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s62.C110767k.mo162302p():void");
    }

    /* renamed from: q */
    public final void mo162303q(long j, long j2) {
        String str;
        long j3 = j2 - j;
        try {
            if (Math.abs(j3) > 3000000 && (str = this.f331314d) != null && str.contains("sns")) {
                C117407d dVar = C117407d.INSTANCE;
                dVar.mo182088q(150, 75);
                dVar.mo160131h(17844, 1, "" + j3);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: r */
    public boolean mo162304r(int i, long j) {
        return false;
    }

    /* renamed from: s */
    public long mo162305s(int i) {
        int i2 = i;
        Log.m105925i("MicroMsg.TrackDataSource", "%s start to seek to ms[%d] isFeedEnd[%b]", mo162299i(), Integer.valueOf(i), Boolean.valueOf(this.f331316f));
        this.f331316f = false;
        try {
            int i3 = i2 * 1000;
            this.f331324n.mo161389h((long) i3, 0);
            if (this.f331324n.mo161383b() < 0) {
                mo162292a(((long) i2) * 1000, -1);
            }
            if (this.f331324n.mo161383b() < 0) {
                mo162292a(0, -1);
                C110766j jVar = this.f331312b;
                jVar.getClass();
                C117407d dVar = C117407d.INSTANCE;
                dVar.idkeyStat((long) jVar.mo162287a(), 155, 1, false);
                dVar.mo160131h(jVar.mo162288b(), 503, Long.valueOf(Util.nowSecond()), "");
            }
            long b = this.f331324n.mo161383b();
            int sampleFlags = this.f331324n.f329324a.getSampleFlags();
            Log.m105925i("MicroMsg.TrackDataSource", "%s finish to seek extractor [%d, %d], sampleFlag:%s", mo162299i(), Long.valueOf(b), Long.valueOf(this.f331324n.f329324a.getCachedDuration()), Integer.valueOf(sampleFlags));
            if ((sampleFlags & 1) == 0) {
                Log.m105921e("MicroMsg.TrackDataSource", "%s seek error, not in keyframe!!", mo162299i());
            }
            if (b == 0 && i2 > 0) {
                Log.m105921e("MicroMsg.TrackDataSource", "%s seek error, not seek to %s", Integer.valueOf(i3), mo162299i());
            }
            return b / 1000;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.TrackDataSource", e, "%s extractor seek exception %s", mo162299i(), e.toString());
            return 0;
        }
    }

    /* renamed from: t */
    public void mo162306t(int i) {
        Log.m105925i("MicroMsg.TrackDataSource", "%s set state old %d new %d", mo162299i(), Integer.valueOf(this.f331311a), Integer.valueOf(i));
        this.f331311a = i;
    }

    /* renamed from: u */
    public abstract String mo162283u();
}
