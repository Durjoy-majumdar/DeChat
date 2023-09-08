package sa2;

import android.media.AudioTrack;
import com.tencent.p014mm.compatible.deviceinfo.C104619a;
import com.tencent.p014mm.plugin.music.player.base.C94218b;
import com.tencent.p014mm.plugin.music.player.base.C94221e;
import com.tencent.p014mm.plugin.music.player.base.C94227j;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.tav.core.AssetExtension;
import la2.C99356c;
import p914oj.C110052b;
import ua2.C101991b;

/* renamed from: sa2.c */
public class C110783c extends C94221e {

    /* renamed from: d */
    public C110052b f331407d;

    /* renamed from: e */
    public C104619a f331408e;

    /* renamed from: f */
    public AudioTrack f331409f;

    /* renamed from: g */
    public String f331410g;

    /* renamed from: h */
    public boolean f331411h = true;

    /* renamed from: i */
    public String f331412i = null;

    /* renamed from: j */
    public int f331413j = 0;

    /* renamed from: k */
    public int f331414k = 0;

    /* renamed from: l */
    public long f331415l = 0;

    /* renamed from: m */
    public long f331416m = 0;

    /* renamed from: n */
    public int f331417n = 0;

    /* renamed from: o */
    public Runnable f331418o = new C110784a();

    /* renamed from: sa2.c$a */
    public class C110784a implements Runnable {
        public C110784a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:103:0x02f2 A[Catch:{ Exception -> 0x01b4, all -> 0x01b1 }] */
        /* JADX WARNING: Removed duplicated region for block: B:104:0x02f4 A[Catch:{ Exception -> 0x01b4, all -> 0x01b1 }] */
        /* JADX WARNING: Removed duplicated region for block: B:107:0x02f9 A[Catch:{ Exception -> 0x01b4, all -> 0x01b1 }] */
        /* JADX WARNING: Removed duplicated region for block: B:108:0x0313 A[Catch:{ Exception -> 0x01b4, all -> 0x01b1 }] */
        /* JADX WARNING: Removed duplicated region for block: B:129:0x0158 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0139  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x015a A[Catch:{ Exception -> 0x01b4, all -> 0x01b1 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r25 = this;
                r1 = r25
                java.lang.String r2 = "channel-count"
                java.lang.String r3 = "sample-rate"
                java.lang.String r4 = "MicroMsg.Music.MMPlayer"
                java.lang.String r0 = "starting..."
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
                r0 = -19
                android.os.Process.setThreadPriority(r0)
                sa2.c r0 = sa2.C110783c.this
                java.lang.String r0 = r0.f331410g
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                r5 = 0
                if (r0 == 0) goto L_0x0028
                java.lang.String r0 = "source path is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
                sa2.c r0 = sa2.C110783c.this
                r0.mo162339p(r5)
                return
            L_0x0028:
                sa2.c r0 = sa2.C110783c.this
                oj.b r6 = new oj.b
                r6.<init>()
                r0.f331407d = r6
                r6 = 1
                sa2.c r0 = sa2.C110783c.this     // Catch:{ Exception -> 0x03a1 }
                oj.b r7 = r0.f331407d     // Catch:{ Exception -> 0x03a1 }
                java.lang.String r0 = r0.f331410g     // Catch:{ Exception -> 0x03a1 }
                r7.mo161392k(r0)     // Catch:{ Exception -> 0x03a1 }
                r7 = 0
                sa2.c r0 = sa2.C110783c.this     // Catch:{ Exception -> 0x00bd }
                oj.b r0 = r0.f331407d     // Catch:{ Exception -> 0x00bd }
                int r0 = r0.mo161385d()     // Catch:{ Exception -> 0x00bd }
                java.lang.String r8 = "tractCount is %d"
                java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x00bd }
                java.lang.Integer r10 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x00bd }
                r9[r5] = r10     // Catch:{ Exception -> 0x00bd }
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r8, r9)     // Catch:{ Exception -> 0x00bd }
                r8 = 0
            L_0x0052:
                if (r8 >= r0) goto L_0x0080
                sa2.c r9 = sa2.C110783c.this     // Catch:{ Exception -> 0x00bd }
                oj.b r9 = r9.f331407d     // Catch:{ Exception -> 0x00bd }
                android.media.MediaFormat r9 = r9.mo161386e(r8)     // Catch:{ Exception -> 0x00bd }
                sa2.c r10 = sa2.C110783c.this     // Catch:{ Exception -> 0x00bd }
                java.lang.String r11 = "mime"
                java.lang.String r11 = r9.getString(r11)     // Catch:{ Exception -> 0x00bd }
                r10.f331412i = r11     // Catch:{ Exception -> 0x00bd }
                sa2.c r10 = sa2.C110783c.this     // Catch:{ Exception -> 0x00bd }
                java.lang.String r10 = r10.f331412i     // Catch:{ Exception -> 0x00bd }
                boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)     // Catch:{ Exception -> 0x00bd }
                if (r10 != 0) goto L_0x007d
                sa2.c r10 = sa2.C110783c.this     // Catch:{ Exception -> 0x00bd }
                java.lang.String r10 = r10.f331412i     // Catch:{ Exception -> 0x00bd }
                java.lang.String r11 = "audio/"
                boolean r10 = r10.startsWith(r11)     // Catch:{ Exception -> 0x00bd }
                if (r10 == 0) goto L_0x007d
                goto L_0x0081
            L_0x007d:
                int r8 = r8 + 1
                goto L_0x0052
            L_0x0080:
                r9 = r7
            L_0x0081:
                if (r9 != 0) goto L_0x0097
                java.lang.String r0 = "format is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)     // Catch:{ Exception -> 0x00bb }
                sa2.c r0 = sa2.C110783c.this     // Catch:{ Exception -> 0x00bb }
                r8 = 703(0x2bf, float:9.85E-43)
                r0.f331417n = r8     // Catch:{ Exception -> 0x00bb }
                r0.mo162339p(r6)     // Catch:{ Exception -> 0x00bb }
                sa2.c r0 = sa2.C110783c.this     // Catch:{ Exception -> 0x00bb }
                sa2.C110783c.m150795n(r0)     // Catch:{ Exception -> 0x00bb }
                return
            L_0x0097:
                java.lang.String r0 = "format:%s"
                java.lang.Object[] r8 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x00bb }
                r8[r5] = r9     // Catch:{ Exception -> 0x00bb }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r0, r8)     // Catch:{ Exception -> 0x00bb }
                sa2.c r0 = sa2.C110783c.this     // Catch:{ Exception -> 0x00bb }
                int r8 = r9.getInteger(r3)     // Catch:{ Exception -> 0x00bb }
                r0.f331413j = r8     // Catch:{ Exception -> 0x00bb }
                sa2.c r0 = sa2.C110783c.this     // Catch:{ Exception -> 0x00bb }
                int r8 = r9.getInteger(r2)     // Catch:{ Exception -> 0x00bb }
                r0.f331414k = r8     // Catch:{ Exception -> 0x00bb }
                sa2.c r0 = sa2.C110783c.this     // Catch:{ Exception -> 0x00bb }
                java.lang.String r8 = "durationUs"
                long r10 = r9.getLong(r8)     // Catch:{ Exception -> 0x00bb }
                r0.f331416m = r10     // Catch:{ Exception -> 0x00bb }
                goto L_0x00cc
            L_0x00bb:
                r0 = move-exception
                goto L_0x00bf
            L_0x00bd:
                r0 = move-exception
                r9 = r7
            L_0x00bf:
                java.lang.Object[] r8 = new java.lang.Object[r5]
                java.lang.String r10 = "get media format from media extractor"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r10, r8)
                sa2.c r0 = sa2.C110783c.this
                r8 = 705(0x2c1, float:9.88E-43)
                r0.f331417n = r8
            L_0x00cc:
                sa2.c r0 = sa2.C110783c.this     // Catch:{ Exception -> 0x0383 }
                java.lang.String r8 = r0.f331412i     // Catch:{ Exception -> 0x0383 }
                com.tencent.mm.compatible.deviceinfo.a r8 = com.tencent.p014mm.compatible.deviceinfo.C104619a.m140211c(r8)     // Catch:{ Exception -> 0x0383 }
                r0.f331408e = r8     // Catch:{ Exception -> 0x0383 }
                sa2.c r0 = sa2.C110783c.this     // Catch:{ Exception -> 0x0383 }
                com.tencent.mm.compatible.deviceinfo.a r0 = r0.f331408e     // Catch:{ Exception -> 0x0383 }
                r0.mo148202a(r9, r7, r7, r5)     // Catch:{ Exception -> 0x0383 }
                sa2.c r0 = sa2.C110783c.this     // Catch:{ Exception -> 0x0383 }
                com.tencent.mm.compatible.deviceinfo.a r0 = r0.f331408e     // Catch:{ Exception -> 0x0383 }
                r0.mo148222y()     // Catch:{ Exception -> 0x0383 }
                sa2.c r0 = sa2.C110783c.this
                com.tencent.mm.compatible.deviceinfo.a r0 = r0.f331408e
                java.nio.ByteBuffer[] r0 = r0.mo148208j()
                sa2.c r8 = sa2.C110783c.this
                com.tencent.mm.compatible.deviceinfo.a r8 = r8.f331408e
                java.nio.ByteBuffer[] r8 = r8.mo148211m()
                r10 = 5
                java.lang.Object[] r10 = new java.lang.Object[r10]
                r10[r5] = r9
                sa2.c r9 = sa2.C110783c.this
                java.lang.String r11 = r9.f331412i
                r10[r6] = r11
                r11 = 2
                int r9 = r9.f331413j
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r10[r11] = r9
                sa2.c r9 = sa2.C110783c.this
                int r9 = r9.f331414k
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r11 = 3
                r10[r11] = r9
                sa2.c r9 = sa2.C110783c.this
                long r12 = r9.f331416m
                java.lang.Long r9 = java.lang.Long.valueOf(r12)
                r12 = 4
                r10[r12] = r9
                java.lang.String r9 = "Track info: extractorFormat: %s mime: %s sampleRate: %s channels: %s duration: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r9, r10)
                sa2.c r9 = sa2.C110783c.this
                oj.b r9 = r9.f331407d
                r9.mo161390i(r5)
                android.media.MediaCodec$BufferInfo r9 = new android.media.MediaCodec$BufferInfo
                r9.<init>()
                sa2.c r10 = sa2.C110783c.this
                com.tencent.mm.plugin.music.player.base.j r13 = r10.f272186c
                r13.f272189a = r11
                com.tencent.mm.plugin.music.player.base.i r11 = r10.f272184a
                if (r11 == 0) goto L_0x0141
                com.tencent.mm.plugin.music.player.base.c r11 = new com.tencent.mm.plugin.music.player.base.c
                r11.<init>(r10)
                com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r11)
            L_0x0141:
                r10 = 0
                r11 = 0
                r13 = 0
            L_0x0144:
                r15 = 50
                r16 = r8
                if (r10 != 0) goto L_0x02e1
                if (r11 >= r15) goto L_0x02e1
                sa2.c r14 = sa2.C110783c.this     // Catch:{ Exception -> 0x01b4 }
                r14.mo162340q()     // Catch:{ Exception -> 0x01b4 }
                sa2.c r14 = sa2.C110783c.this     // Catch:{ Exception -> 0x01b4 }
                boolean r15 = r14.f331411h     // Catch:{ Exception -> 0x01b4 }
                r15 = r15 ^ r6
                if (r15 != 0) goto L_0x015a
                goto L_0x02e1
            L_0x015a:
                int r11 = r11 + 1
                if (r13 != 0) goto L_0x01f2
                com.tencent.mm.compatible.deviceinfo.a r14 = r14.f331408e     // Catch:{ Exception -> 0x01b4 }
                r17 = r13
                r12 = 1000(0x3e8, double:4.94E-321)
                int r14 = r14.mo148204f(r12)     // Catch:{ Exception -> 0x01b4 }
                if (r14 < 0) goto L_0x01db
                r12 = r0[r14]     // Catch:{ Exception -> 0x01b4 }
                sa2.c r13 = sa2.C110783c.this     // Catch:{ Exception -> 0x01b4 }
                oj.b r13 = r13.f331407d     // Catch:{ Exception -> 0x01b4 }
                int r12 = r13.mo161387f(r12, r5)     // Catch:{ Exception -> 0x01b4 }
                if (r12 >= 0) goto L_0x0182
                java.lang.String r12 = "saw input EOS. Stopping playback"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r12)     // Catch:{ Exception -> 0x01b4 }
                r6 = r10
                r13 = r11
                r17 = 1
                r21 = 0
                goto L_0x01b9
            L_0x0182:
                sa2.c r13 = sa2.C110783c.this     // Catch:{ Exception -> 0x01b4 }
                oj.b r15 = r13.f331407d     // Catch:{ Exception -> 0x01b4 }
                long r5 = r15.mo161383b()     // Catch:{ Exception -> 0x01b4 }
                r13.f331415l = r5     // Catch:{ Exception -> 0x01b4 }
                sa2.c r5 = sa2.C110783c.this     // Catch:{ Exception -> 0x01b4 }
                long r7 = r5.f331416m     // Catch:{ Exception -> 0x01b4 }
                r18 = 0
                int r6 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
                if (r6 != 0) goto L_0x019a
                r6 = r10
                r13 = r11
                r7 = 0
                goto L_0x01a4
            L_0x019a:
                r18 = 100
                r6 = r10
                r13 = r11
                long r10 = r5.f331415l     // Catch:{ Exception -> 0x01b4 }
                long r10 = r10 * r18
                long r10 = r10 / r7
                int r7 = (int) r10     // Catch:{ Exception -> 0x01b4 }
            L_0x01a4:
                com.tencent.mm.plugin.music.player.base.i r8 = r5.f272184a     // Catch:{ Exception -> 0x01b4 }
                if (r8 == 0) goto L_0x01b7
                com.tencent.mm.plugin.music.player.base.d r8 = new com.tencent.mm.plugin.music.player.base.d     // Catch:{ Exception -> 0x01b4 }
                r8.<init>(r5, r7)     // Catch:{ Exception -> 0x01b4 }
                com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r8)     // Catch:{ Exception -> 0x01b4 }
                goto L_0x01b7
            L_0x01b1:
                r0 = move-exception
                goto L_0x0361
            L_0x01b4:
                r0 = move-exception
                goto L_0x0328
            L_0x01b7:
                r21 = r12
            L_0x01b9:
                sa2.c r5 = sa2.C110783c.this     // Catch:{ Exception -> 0x01b4 }
                com.tencent.mm.compatible.deviceinfo.a r7 = r5.f331408e     // Catch:{ Exception -> 0x01b4 }
                r20 = 0
                long r10 = r5.f331415l     // Catch:{ Exception -> 0x01b4 }
                if (r17 == 0) goto L_0x01c6
                r24 = 4
                goto L_0x01c8
            L_0x01c6:
                r24 = 0
            L_0x01c8:
                r18 = r7
                r19 = r14
                r22 = r10
                r18.mo148213o(r19, r20, r21, r22, r24)     // Catch:{ Exception -> 0x01b4 }
                if (r17 != 0) goto L_0x01f6
                sa2.c r5 = sa2.C110783c.this     // Catch:{ Exception -> 0x01b4 }
                oj.b r5 = r5.f331407d     // Catch:{ Exception -> 0x01b4 }
                r5.mo161382a()     // Catch:{ Exception -> 0x01b4 }
                goto L_0x01f6
            L_0x01db:
                r6 = r10
                r13 = r11
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b4 }
                r5.<init>()     // Catch:{ Exception -> 0x01b4 }
                java.lang.String r7 = "inputBufIndex "
                r5.append(r7)     // Catch:{ Exception -> 0x01b4 }
                r5.append(r14)     // Catch:{ Exception -> 0x01b4 }
                java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x01b4 }
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r5)     // Catch:{ Exception -> 0x01b4 }
                goto L_0x01f6
            L_0x01f2:
                r6 = r10
                r17 = r13
                r13 = r11
            L_0x01f6:
                sa2.c r5 = sa2.C110783c.this     // Catch:{ Exception -> 0x01b4 }
                com.tencent.mm.compatible.deviceinfo.a r5 = r5.f331408e     // Catch:{ Exception -> 0x01b4 }
                r7 = 1000(0x3e8, double:4.94E-321)
                int r5 = r5.mo148205g(r9, r7)     // Catch:{ Exception -> 0x01b4 }
                if (r5 < 0) goto L_0x027a
                int r7 = r9.size     // Catch:{ Exception -> 0x01b4 }
                if (r7 <= 0) goto L_0x0208
                r11 = 0
                goto L_0x0209
            L_0x0208:
                r11 = r13
            L_0x0209:
                r8 = r16[r5]     // Catch:{ Exception -> 0x01b4 }
                byte[] r10 = new byte[r7]     // Catch:{ Exception -> 0x01b4 }
                r8.get(r10)     // Catch:{ Exception -> 0x01b4 }
                r8.clear()     // Catch:{ Exception -> 0x01b4 }
                if (r7 <= 0) goto L_0x0261
                sa2.c r8 = sa2.C110783c.this     // Catch:{ Exception -> 0x01b4 }
                android.media.AudioTrack r12 = r8.f331409f     // Catch:{ Exception -> 0x01b4 }
                if (r12 != 0) goto L_0x0259
                boolean r8 = sa2.C110783c.m150793l(r8)     // Catch:{ Exception -> 0x01b4 }
                if (r8 != 0) goto L_0x0252
                java.lang.String r0 = "audio track not initialized"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)     // Catch:{ Exception -> 0x01b4 }
                sa2.c r0 = sa2.C110783c.this     // Catch:{ Exception -> 0x01b4 }
                r2 = 707(0x2c3, float:9.91E-43)
                r0.f331417n = r2     // Catch:{ Exception -> 0x01b4 }
                r2 = 1
                r0.mo162339p(r2)     // Catch:{ Exception -> 0x01b4 }
                sa2.c r0 = sa2.C110783c.this
                sa2.C110783c.m150795n(r0)
                sa2.c r0 = sa2.C110783c.this
                sa2.C110783c.m150796o(r0)
                sa2.c r0 = sa2.C110783c.this
                sa2.C110783c.m150794m(r0)
                sa2.c r0 = sa2.C110783c.this
                r2 = 0
                r0.f331410g = r2
                r0.f331412i = r2
                r2 = 0
                r0.f331413j = r2
                r0.f331414k = r2
                r2 = 0
                r0.f331415l = r2
                r0.f331416m = r2
                return
            L_0x0252:
                sa2.c r8 = sa2.C110783c.this     // Catch:{ Exception -> 0x01b4 }
                android.media.AudioTrack r8 = r8.f331409f     // Catch:{ Exception -> 0x01b4 }
                r8.play()     // Catch:{ Exception -> 0x01b4 }
            L_0x0259:
                sa2.c r8 = sa2.C110783c.this     // Catch:{ Exception -> 0x01b4 }
                android.media.AudioTrack r8 = r8.f331409f     // Catch:{ Exception -> 0x01b4 }
                r12 = 0
                r8.write(r10, r12, r7)     // Catch:{ Exception -> 0x01b4 }
            L_0x0261:
                sa2.c r7 = sa2.C110783c.this     // Catch:{ Exception -> 0x01b4 }
                com.tencent.mm.compatible.deviceinfo.a r7 = r7.f331408e     // Catch:{ Exception -> 0x01b4 }
                r8 = 0
                r7.mo148216r(r5, r8)     // Catch:{ Exception -> 0x01b4 }
                int r5 = r9.flags     // Catch:{ Exception -> 0x01b4 }
                r7 = 4
                r5 = r5 & r7
                if (r5 == 0) goto L_0x0276
                java.lang.String r5 = "saw output EOS."
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r5)     // Catch:{ Exception -> 0x01b4 }
                r10 = 1
                goto L_0x0277
            L_0x0276:
                r10 = r6
            L_0x0277:
                r8 = r16
                goto L_0x02d9
            L_0x027a:
                r7 = 4
                r8 = -3
                if (r5 != r8) goto L_0x028c
                sa2.c r5 = sa2.C110783c.this     // Catch:{ Exception -> 0x01b4 }
                com.tencent.mm.compatible.deviceinfo.a r5 = r5.f331408e     // Catch:{ Exception -> 0x01b4 }
                java.nio.ByteBuffer[] r8 = r5.mo148211m()     // Catch:{ Exception -> 0x01b4 }
                java.lang.String r5 = "output buffers have changed."
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)     // Catch:{ Exception -> 0x01b4 }
                goto L_0x02d7
            L_0x028c:
                r8 = -2
                if (r5 != r8) goto L_0x02c1
                sa2.c r5 = sa2.C110783c.this     // Catch:{ Exception -> 0x01b4 }
                com.tencent.mm.compatible.deviceinfo.a r5 = r5.f331408e     // Catch:{ Exception -> 0x01b4 }
                android.media.MediaFormat r5 = r5.mo148212n()     // Catch:{ Exception -> 0x01b4 }
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b4 }
                r8.<init>()     // Catch:{ Exception -> 0x01b4 }
                java.lang.String r10 = "output format has changed to "
                r8.append(r10)     // Catch:{ Exception -> 0x01b4 }
                r8.append(r5)     // Catch:{ Exception -> 0x01b4 }
                java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x01b4 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r8)     // Catch:{ Exception -> 0x01b4 }
                sa2.c r8 = sa2.C110783c.this     // Catch:{ Exception -> 0x01b4 }
                int r10 = r5.getInteger(r3)     // Catch:{ Exception -> 0x01b4 }
                r8.f331413j = r10     // Catch:{ Exception -> 0x01b4 }
                sa2.c r8 = sa2.C110783c.this     // Catch:{ Exception -> 0x01b4 }
                int r5 = r5.getInteger(r2)     // Catch:{ Exception -> 0x01b4 }
                r8.f331414k = r5     // Catch:{ Exception -> 0x01b4 }
                sa2.c r5 = sa2.C110783c.this     // Catch:{ Exception -> 0x01b4 }
                sa2.C110783c.m150794m(r5)     // Catch:{ Exception -> 0x01b4 }
                goto L_0x02d5
            L_0x02c1:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b4 }
                r8.<init>()     // Catch:{ Exception -> 0x01b4 }
                java.lang.String r10 = "dequeueOutputBuffer returned "
                r8.append(r10)     // Catch:{ Exception -> 0x01b4 }
                r8.append(r5)     // Catch:{ Exception -> 0x01b4 }
                java.lang.String r5 = r8.toString()     // Catch:{ Exception -> 0x01b4 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)     // Catch:{ Exception -> 0x01b4 }
            L_0x02d5:
                r8 = r16
            L_0x02d7:
                r10 = r6
                r11 = r13
            L_0x02d9:
                r13 = r17
                r5 = 0
                r6 = 1
                r7 = 0
                r12 = 4
                goto L_0x0144
            L_0x02e1:
                sa2.c r0 = sa2.C110783c.this     // Catch:{ Exception -> 0x01b4 }
                long r2 = r0.f331416m     // Catch:{ Exception -> 0x01b4 }
                r5 = 1000(0x3e8, double:4.94E-321)
                long r2 = r2 / r5
                long r7 = r0.f331415l     // Catch:{ Exception -> 0x01b4 }
                long r7 = r7 / r5
                long r2 = r2 - r7
                r5 = 2000(0x7d0, double:9.88E-321)
                int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x02f4
                r0 = 1
                goto L_0x02f5
            L_0x02f4:
                r0 = 0
            L_0x02f5:
                r2 = 50
                if (r11 < r2) goto L_0x0313
                java.lang.String r0 = "onError, noOutputCounter:%d"
                r2 = 1
                java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x01b4 }
                java.lang.Integer r2 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x01b4 }
                r5 = 0
                r3[r5] = r2     // Catch:{ Exception -> 0x01b4 }
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r0, r3)     // Catch:{ Exception -> 0x01b4 }
                sa2.c r0 = sa2.C110783c.this     // Catch:{ Exception -> 0x01b4 }
                r2 = 706(0x2c2, float:9.9E-43)
                r0.f331417n = r2     // Catch:{ Exception -> 0x01b4 }
                r2 = 1
                r0.mo162339p(r2)     // Catch:{ Exception -> 0x01b4 }
                goto L_0x033a
            L_0x0313:
                java.lang.String r2 = "onStop, isComplete:%b"
                r3 = 1
                java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x01b4 }
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x01b4 }
                r6 = 0
                r5[r6] = r3     // Catch:{ Exception -> 0x01b4 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r2, r5)     // Catch:{ Exception -> 0x01b4 }
                sa2.c r2 = sa2.C110783c.this     // Catch:{ Exception -> 0x01b4 }
                r2.mo129530f(r0)     // Catch:{ Exception -> 0x01b4 }
                goto L_0x033a
            L_0x0328:
                java.lang.String r2 = "error"
                r3 = 0
                java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ all -> 0x01b1 }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r2, r5)     // Catch:{ all -> 0x01b1 }
                sa2.c r0 = sa2.C110783c.this     // Catch:{ all -> 0x01b1 }
                r2 = 706(0x2c2, float:9.9E-43)
                r0.f331417n = r2     // Catch:{ all -> 0x01b1 }
                r2 = 1
                r0.mo162339p(r2)     // Catch:{ all -> 0x01b1 }
            L_0x033a:
                sa2.c r0 = sa2.C110783c.this
                sa2.C110783c.m150795n(r0)
                sa2.c r0 = sa2.C110783c.this
                sa2.C110783c.m150796o(r0)
                sa2.c r0 = sa2.C110783c.this
                sa2.C110783c.m150794m(r0)
                sa2.c r0 = sa2.C110783c.this
                r2 = 0
                r0.f331410g = r2
                r0.f331412i = r2
                r2 = 0
                r0.f331413j = r2
                r0.f331414k = r2
                r2 = 0
                r0.f331415l = r2
                r0.f331416m = r2
                java.lang.String r0 = "stopping..."
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
                return
            L_0x0361:
                sa2.c r2 = sa2.C110783c.this
                sa2.C110783c.m150795n(r2)
                sa2.c r2 = sa2.C110783c.this
                sa2.C110783c.m150796o(r2)
                sa2.c r2 = sa2.C110783c.this
                sa2.C110783c.m150794m(r2)
                sa2.c r2 = sa2.C110783c.this
                r3 = 0
                r2.f331410g = r3
                r2.f331412i = r3
                r3 = 0
                r2.f331413j = r3
                r2.f331414k = r3
                r3 = 0
                r2.f331415l = r3
                r2.f331416m = r3
                throw r0
            L_0x0383:
                r0 = move-exception
                r2 = 0
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.String r3 = "createDecoderByType"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r3, r2)
                sa2.c r0 = sa2.C110783c.this
                r2 = 704(0x2c0, float:9.87E-43)
                r0.f331417n = r2
                r2 = 1
                r0.mo162339p(r2)
                sa2.c r0 = sa2.C110783c.this
                sa2.C110783c.m150795n(r0)
                sa2.c r0 = sa2.C110783c.this
                sa2.C110783c.m150796o(r0)
                return
            L_0x03a1:
                r0 = move-exception
                r2 = 0
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.String r3 = "set extractor data source"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r3, r2)
                sa2.c r0 = sa2.C110783c.this
                r2 = 702(0x2be, float:9.84E-43)
                r0.f331417n = r2
                r2 = 1
                r0.mo162339p(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: sa2.C110783c.C110784a.run():void");
        }
    }

    /* renamed from: l */
    public static boolean m150793l(C110783c cVar) {
        cVar.getClass();
        Log.m105924i("MicroMsg.Music.MMPlayer", "createAudioTrack");
        int i = cVar.f331414k == 1 ? 4 : 12;
        int minBufferSize = AudioTrack.getMinBufferSize(cVar.f331413j, i, 2);
        C99356c cVar2 = (C99356c) C101991b.m134284b(C99356c.class);
        if (cVar2 != null) {
            cVar.f331409f = cVar2.mo138795D(3, cVar.f331413j, i, 2, minBufferSize, 1);
        } else {
            Log.m105920e("MicroMsg.Music.MMPlayer", "mediaResService null");
        }
        if (cVar.f331409f == null) {
            Log.m105920e("MicroMsg.Music.MMPlayer", "audioTrack is null, new AudioTrack");
            cVar.f331409f = new AudioTrack(3, cVar.f331413j, i, 2, minBufferSize, 1);
        }
        AudioTrack audioTrack = cVar.f331409f;
        if (audioTrack != null && audioTrack.getState() == 1) {
            return true;
        }
        Log.m105920e("MicroMsg.Music.MMPlayer", "audio track not initialized");
        AudioTrack audioTrack2 = cVar.f331409f;
        if (audioTrack2 != null) {
            try {
                audioTrack2.release();
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* renamed from: m */
    public static void m150794m(C110783c cVar) {
        cVar.getClass();
        try {
            AudioTrack audioTrack = cVar.f331409f;
            if (audioTrack != null) {
                audioTrack.flush();
                cVar.f331409f.release();
                cVar.f331409f = null;
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.Music.MMPlayer", e, "releaseAudioTrack", new Object[0]);
        }
    }

    /* renamed from: n */
    public static void m150795n(C110783c cVar) {
        cVar.getClass();
        try {
            C110052b bVar = cVar.f331407d;
            if (bVar != null) {
                bVar.mo161388g();
                cVar.f331407d = null;
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.Music.MMPlayer", e, "releaseMediaExtractor", new Object[0]);
        }
    }

    /* renamed from: o */
    public static void m150796o(C110783c cVar) {
        cVar.getClass();
        try {
            C104619a aVar = cVar.f331408e;
            if (aVar != null) {
                aVar.mo148223z();
                cVar.f331408e.mo148214p();
                cVar.f331408e = null;
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.Music.MMPlayer", e, "releaseMediaCodec", new Object[0]);
        }
    }

    /* renamed from: a */
    public int mo129525a() {
        return (int) (this.f331415l / 1000);
    }

    /* renamed from: b */
    public int mo129526b() {
        return (int) (this.f331416m / 1000);
    }

    /* renamed from: c */
    public String mo129527c() {
        return this.f331412i;
    }

    /* renamed from: d */
    public boolean mo129528d() {
        return !this.f331411h;
    }

    /* renamed from: e */
    public boolean mo129529e() {
        boolean z;
        C94227j jVar = this.f272186c;
        synchronized (jVar) {
            z = jVar.f272189a == 3;
        }
        return z;
    }

    /* renamed from: f */
    public void mo129530f(boolean z) {
        this.f272186c.f272189a = 4;
        this.f331411h = true;
        super.mo129530f(z);
    }

    /* renamed from: g */
    public void mo129531g() {
        Log.m105924i("MicroMsg.Music.MMPlayer", "pause");
        if (!this.f331411h) {
            this.f272186c.f272189a = 2;
        }
    }

    /* renamed from: h */
    public void mo129532h() {
        Log.m105924i("MicroMsg.Music.MMPlayer", AssetExtension.SCENE_PLAY);
        boolean z = true;
        boolean z2 = !this.f331411h;
        if (!z2) {
            this.f331411h = false;
            ThreadPool.post(this.f331418o, "music_player");
            return;
        } else if (z2) {
            C94227j jVar = this.f272186c;
            synchronized (jVar) {
                if (jVar.f272189a != 2) {
                    z = false;
                }
            }
            if (z) {
                this.f272186c.f272189a = 3;
                synchronized (this) {
                    Log.m105924i("MicroMsg.Music.MMPlayer", "sync notify");
                    try {
                        notify();
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.Music.MMPlayer", e, "syncNotify", new Object[0]);
                    }
                }
                return;
            }
            return;
        } else {
            return;
        }
    }

    /* renamed from: i */
    public void mo129533i(long j) {
        this.f331407d.mo161389h(j * 1000, 2);
    }

    /* renamed from: j */
    public void mo129534j(String str) {
        this.f331410g = str;
    }

    /* renamed from: k */
    public void mo129535k() {
        Log.m105924i("MicroMsg.Music.MMPlayer", "stop");
        boolean z = true;
        this.f331411h = true;
        C94227j jVar = this.f272186c;
        synchronized (jVar) {
            if (jVar.f272189a != 2) {
                z = false;
            }
        }
        if (z) {
            synchronized (this) {
                Log.m105924i("MicroMsg.Music.MMPlayer", "sync notify");
                try {
                    notify();
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.Music.MMPlayer", e, "syncNotify", new Object[0]);
                }
            }
            return;
        }
        return;
    }

    /* renamed from: p */
    public void mo162339p(boolean z) {
        this.f272186c.f272189a = 4;
        this.f331411h = true;
        if (this.f272184a != null) {
            MMHandlerThread.postToMainThread(new C94218b(this, z));
        }
    }

    /* renamed from: q */
    public synchronized void mo162340q() {
        while (true) {
            boolean z = true;
            if (!(!this.f331411h)) {
                break;
            }
            C94227j jVar = this.f272186c;
            synchronized (jVar) {
                if (jVar.f272189a != 2) {
                    z = false;
                }
            }
            if (!z) {
                break;
            }
            try {
                Log.m105924i("MicroMsg.Music.MMPlayer", "wait play");
                wait();
            } catch (InterruptedException e) {
                Log.printErrStackTrace("MicroMsg.Music.MMPlayer", e, "waitPlay", new Object[0]);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
