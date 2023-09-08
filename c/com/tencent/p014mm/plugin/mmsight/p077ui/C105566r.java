package com.tencent.p014mm.plugin.mmsight.p077ui;

import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.mmsight.p077ui.C105562q;
import com.tencent.p014mm.plugin.mmsight.segment.C105484h;
import com.tencent.p014mm.plugin.sight.base.C94554a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import l72.C109273a;
import qo3.C89779i0;
import r80.C89903h;

/* renamed from: com.tencent.mm.plugin.mmsight.ui.r */
public class C105566r implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Bitmap f314010d;

    /* renamed from: e */
    public final /* synthetic */ C105562q f314011e;

    /* renamed from: com.tencent.mm.plugin.mmsight.ui.r$a */
    public class C105567a implements C89903h.C89905b {

        /* renamed from: a */
        public final /* synthetic */ String f314012a;

        /* renamed from: b */
        public final /* synthetic */ long f314013b;

        /* renamed from: c */
        public final /* synthetic */ C94554a f314014c;

        /* renamed from: com.tencent.mm.plugin.mmsight.ui.r$a$a */
        public class C105568a implements Runnable {
            public C105568a() {
            }

            public void run() {
                C89779i0 i0Var = C105566r.this.f314011e.f313996o;
                if (i0Var != null) {
                    i0Var.dismiss();
                }
                C105562q.C105564b bVar = C105566r.this.f314011e.f313997p;
                if (bVar != null) {
                    bVar.mo150277a();
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.mmsight.ui.r$a$b */
        public class C105569b implements Runnable {
            public C105569b() {
            }

            public void run() {
                C89779i0 i0Var = C105566r.this.f314011e.f313996o;
                if (i0Var != null) {
                    i0Var.dismiss();
                }
                C105562q.C105564b bVar = C105566r.this.f314011e.f313997p;
                if (bVar != null) {
                    bVar.mo150278b();
                }
            }
        }

        public C105567a(String str, long j, C94554a aVar) {
            this.f314012a = str;
            this.f314013b = j;
            this.f314014c = aVar;
        }

        /* renamed from: a */
        public void mo114978a(String str) {
            Log.m105924i("MicroMsg.MMSightVideoEditor", "mediaCodecRemuxer remux onFinish");
            Object obj = C105562q.f313977D;
            synchronized (obj) {
                int i = 0;
                try {
                    obj.notifyAll();
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.MMSightVideoEditor", e, "wait mediaCodecRemuxer error", new Object[0]);
                }
                if (Util.isNullOrNil(str)) {
                    MMHandlerThread.postToMainThread(new C105568a());
                    C105484h.m141674a(C105566r.this.f314011e.f313994m.mo158181a());
                    return;
                }
                if (Util.isNullOrNil(C105566r.this.f314011e.f314004w)) {
                    C86013q1.m106463x(this.f314012a, str);
                }
                long ticksToNow = Util.ticksToNow(this.f314013b);
                boolean z = true;
                Log.m105925i("MicroMsg.MMSightVideoEditor", "doRemuxVideo used %sms", Long.valueOf(ticksToNow));
                C105484h.m141675b(1, ticksToNow);
                C105566r.this.f314011e.f313979A = C86013q1.m106456q(str);
                C105562q qVar = C105566r.this.f314011e;
                C109273a.C109275b bVar = qVar.f314007z;
                int i2 = qVar.f313985d;
                if (i2 < 0 || qVar.f313986e <= 0) {
                    z = false;
                }
                bVar.f327153g = z;
                bVar.f327150d = qVar.f313986e - i2;
                C94554a aVar = this.f314014c;
                if (aVar != null) {
                    i = aVar.f273443a;
                }
                bVar.f327149c = i;
                MMHandlerThread.postToMainThread(new C105569b());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.mmsight.ui.r$b */
    public class C105570b implements Runnable {
        public C105570b() {
        }

        public void run() {
            C89779i0 i0Var = C105566r.this.f314011e.f313996o;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            C105562q.C105564b bVar = C105566r.this.f314011e.f313997p;
            if (bVar != null) {
                bVar.mo150277a();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.mmsight.ui.r$c */
    public class C105571c implements Runnable {
        public C105571c() {
        }

        public void run() {
            C89779i0 i0Var = C105566r.this.f314011e.f313996o;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            C105562q.C105564b bVar = C105566r.this.f314011e.f313997p;
            if (bVar != null) {
                bVar.mo150277a();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.mmsight.ui.r$d */
    public class C105572d implements Runnable {
        public C105572d() {
        }

        public void run() {
            C89779i0 i0Var = C105566r.this.f314011e.f313996o;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            C105562q.C105564b bVar = C105566r.this.f314011e.f313997p;
            if (bVar != null) {
                bVar.mo150277a();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.mmsight.ui.r$e */
    public class C105573e implements Runnable {
        public C105573e() {
        }

        public void run() {
            C89779i0 i0Var = C105566r.this.f314011e.f313996o;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            C105562q.C105564b bVar = C105566r.this.f314011e.f313997p;
            if (bVar != null) {
                bVar.mo150277a();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.mmsight.ui.r$f */
    public class C105574f implements Runnable {
        public C105574f() {
        }

        public void run() {
            C89779i0 i0Var = C105566r.this.f314011e.f313996o;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            C105562q.C105564b bVar = C105566r.this.f314011e.f313997p;
            if (bVar != null) {
                bVar.mo150278b();
            }
        }
    }

    public C105566r(C105562q qVar, Bitmap bitmap) {
        this.f314011e = qVar;
        this.f314010d = bitmap;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0591  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0593  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x059d  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x059f  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0198  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r64 = this;
            r7 = r64
            java.lang.Class<eu.e> r0 = p509eu.C86680e.class
            com.tencent.mm.plugin.mmsight.ui.q r1 = r7.f314011e
            java.lang.String r1 = r1.f313987f
            boolean r1 = com.tencent.p014mm.modelvideoh265toh264.C92862f.m117175h(r1)
            r8 = 1
            if (r1 == 0) goto L_0x0011
            r6 = 0
            goto L_0x001a
        L_0x0011:
            com.tencent.mm.plugin.mmsight.ui.q r1 = r7.f314011e
            java.lang.String r1 = r1.f313987f
            com.tencent.mm.plugin.sight.base.a r1 = com.tencent.p014mm.plugin.sight.base.C94555d.m119567c(r1, r8)
            r6 = r1
        L_0x001a:
            r1 = -1
            if (r6 == 0) goto L_0x0024
            int r3 = r6.f273445c
            int r4 = r6.f273446d
            int r5 = r6.f273444b
            goto L_0x0054
        L_0x0024:
            oj.c r3 = new oj.c
            r3.<init>()
            com.tencent.mm.plugin.mmsight.ui.q r4 = r7.f314011e
            java.lang.String r4 = r4.f313987f
            r3.setDataSource(r4)
            r4 = 18
            java.lang.String r4 = r3.extractMetadata(r4)
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r1)
            r5 = 19
            java.lang.String r5 = r3.extractMetadata(r5)
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r1)
            r9 = 20
            java.lang.String r9 = r3.extractMetadata(r9)
            int r9 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r9, (int) r1)
            r3.release()
            r3 = r4
            r4 = r5
            r5 = r9
        L_0x0054:
            r10 = 2
            r11 = 0
            if (r3 <= 0) goto L_0x06e2
            if (r4 <= 0) goto L_0x06e2
            if (r5 > 0) goto L_0x005e
            goto L_0x06e2
        L_0x005e:
            r12 = 2000(0x7d0, float:2.803E-42)
            if (r4 >= r12) goto L_0x0064
            if (r3 < r12) goto L_0x006f
        L_0x0064:
            com.tencent.mm.plugin.mmsight.ui.q r12 = r7.f314011e
            r12.f314005x = r8
            java.lang.String r12 = "MicroMsg.MMSightVideoEditor"
            java.lang.String r13 = "video size too large, change to mediacodec remuxer"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r13)
        L_0x006f:
            com.tencent.mm.plugin.mmsight.ui.q r12 = r7.f314011e
            boolean r13 = r12.f314001t
            if (r13 == 0) goto L_0x019c
            com.tencent.mm.modelcontrol.VideoTransPara r13 = r12.f314000s
            if (r13 == 0) goto L_0x019c
            int r14 = r13.f267169g
            if (r5 <= r14) goto L_0x007e
            r5 = r14
        L_0x007e:
            int r14 = r13.f267166d
            int r13 = r13.f267167e
            r12.getClass()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r15 = "scale() called with: decoderOutputWidth = ["
            r12.append(r15)
            r12.append(r3)
            java.lang.String r15 = "], decoderOutputHeight = ["
            r12.append(r15)
            r12.append(r4)
            java.lang.String r15 = "], specWidth = ["
            r12.append(r15)
            r12.append(r14)
            java.lang.String r15 = "], specHeight = ["
            r12.append(r15)
            r12.append(r13)
            java.lang.String r15 = "]"
            r12.append(r15)
            java.lang.String r12 = r12.toString()
            java.lang.String r15 = "MicroMsg.MMSightVideoEditor"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r15, r12)
            if (r3 > r14) goto L_0x00c2
            if (r4 > r13) goto L_0x00c2
            java.lang.String r12 = "calc scale, small or equal to spec size"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r12)
            goto L_0x00f1
        L_0x00c2:
            int r12 = java.lang.Math.max(r3, r4)
            int r16 = java.lang.Math.min(r3, r4)
            int r2 = java.lang.Math.max(r14, r13)
            int r1 = java.lang.Math.min(r14, r13)
            int r17 = r12 % 16
            r9 = 16
            if (r17 != 0) goto L_0x00f4
            int r17 = r12 - r2
            int r8 = java.lang.Math.abs(r17)
            if (r8 >= r9) goto L_0x00f4
            int r8 = r16 % 16
            if (r8 != 0) goto L_0x00f4
            int r8 = r16 - r1
            int r8 = java.lang.Math.abs(r8)
            if (r8 >= r9) goto L_0x00f4
            java.lang.String r1 = "calc scale, same len divide by 16, no need scale"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r1)
        L_0x00f1:
            r8 = 0
            goto L_0x0196
        L_0x00f4:
            int r12 = r12 / r10
            if (r12 != r2) goto L_0x0117
            int r8 = r16 / 2
            if (r8 != r1) goto L_0x0117
            java.lang.String r1 = "calc scale, double ratio"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r1)
            int r1 = r3 / 2
            int r2 = r4 / 2
            int r8 = r1 % 2
            if (r8 == 0) goto L_0x010a
            int r1 = r1 + 1
        L_0x010a:
            int r8 = r2 % 2
            if (r8 == 0) goto L_0x0110
            int r2 = r2 + 1
        L_0x0110:
            android.graphics.Point r8 = new android.graphics.Point
            r8.<init>(r1, r2)
            goto L_0x0196
        L_0x0117:
            int r16 = r16 / 2
            int r8 = r12 % 16
            if (r8 != 0) goto L_0x014b
            int r12 = r12 - r2
            int r2 = java.lang.Math.abs(r12)
            if (r2 >= r9) goto L_0x014b
            int r2 = r16 % 16
            if (r2 != 0) goto L_0x014b
            int r16 = r16 - r1
            int r1 = java.lang.Math.abs(r16)
            if (r1 >= r9) goto L_0x014b
            java.lang.String r1 = "calc scale, double ratio divide by 16"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r1)
            int r1 = r3 / 2
            int r2 = r4 / 2
            int r8 = r1 % 2
            if (r8 == 0) goto L_0x013f
            int r1 = r1 + 1
        L_0x013f:
            int r8 = r2 % 2
            if (r8 == 0) goto L_0x0145
            int r2 = r2 + 1
        L_0x0145:
            android.graphics.Point r8 = new android.graphics.Point
            r8.<init>(r1, r2)
            goto L_0x0196
        L_0x014b:
            android.graphics.Point r8 = new android.graphics.Point
            r8.<init>()
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r3 >= r4) goto L_0x0161
            int r9 = java.lang.Math.min(r14, r13)
            double r12 = (double) r3
            double r12 = r12 * r1
            double r1 = (double) r9
            double r12 = r12 / r1
            double r1 = (double) r4
            double r1 = r1 / r12
            int r1 = (int) r1
            goto L_0x0172
        L_0x0161:
            int r9 = java.lang.Math.min(r14, r13)
            double r12 = (double) r4
            double r12 = r12 * r1
            double r1 = (double) r9
            double r12 = r12 / r1
            double r1 = (double) r3
            double r1 = r1 / r12
            int r1 = (int) r1
            r63 = r9
            r9 = r1
            r1 = r63
        L_0x0172:
            int r2 = r1 % 2
            if (r2 == 0) goto L_0x0178
            int r1 = r1 + 1
        L_0x0178:
            int r2 = r9 % 2
            if (r2 == 0) goto L_0x017e
            int r9 = r9 + 1
        L_0x017e:
            java.lang.Object[] r2 = new java.lang.Object[r10]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)
            r2[r11] = r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            r13 = 1
            r2[r13] = r12
            java.lang.String r12 = "calc scale, outputsize: %s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r12, r2)
            r8.x = r9
            r8.y = r1
        L_0x0196:
            if (r8 == 0) goto L_0x019c
            int r3 = r8.x
            int r4 = r8.y
        L_0x019c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.tencent.mm.plugin.mmsight.ui.q r2 = r7.f314011e
            java.lang.String r2 = r2.f313987f
            r1.append(r2)
            java.lang.String r2 = "remuxOutput.mp4"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.mm.plugin.mmsight.ui.q r2 = r7.f314011e
            java.lang.String r2 = r2.f314004w
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x01bf
            com.tencent.mm.plugin.mmsight.ui.q r1 = r7.f314011e
            java.lang.String r1 = r1.f314004w
        L_0x01bf:
            r8 = r1
            java.lang.String r1 = "MicroMsg.MMSightVideoEditor"
            java.lang.String r2 = "Previous data width, height: %d  %d"
            java.lang.Object[] r9 = new java.lang.Object[r10]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r3)
            r9[r11] = r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r4)
            r13 = 1
            r9[r13] = r12
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r9)
            java.lang.String r1 = "MicroMsg.MMSightVideoEditor"
            java.lang.String r2 = "Hseasun Adaptive Bitrate Methods:%d %f  %f  %d  %d %d %d"
            r9 = 7
            java.lang.Object[] r12 = new java.lang.Object[r9]
            com.tencent.mm.plugin.mmsight.ui.q r13 = r7.f314011e
            com.tencent.mm.modelcontrol.VideoTransPara r13 = r13.f314000s
            int r13 = r13.f267180u
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12[r11] = r13
            com.tencent.mm.plugin.mmsight.ui.q r13 = r7.f314011e
            com.tencent.mm.modelcontrol.VideoTransPara r13 = r13.f314000s
            float r13 = r13.f267182w
            java.lang.Float r13 = java.lang.Float.valueOf(r13)
            r14 = 1
            r12[r14] = r13
            com.tencent.mm.plugin.mmsight.ui.q r13 = r7.f314011e
            com.tencent.mm.modelcontrol.VideoTransPara r13 = r13.f314000s
            float r13 = r13.f267183x
            java.lang.Float r13 = java.lang.Float.valueOf(r13)
            r12[r10] = r13
            com.tencent.mm.plugin.mmsight.ui.q r13 = r7.f314011e
            com.tencent.mm.modelcontrol.VideoTransPara r13 = r13.f314000s
            int r13 = r13.f267184y
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r14 = 3
            r12[r14] = r13
            com.tencent.mm.plugin.mmsight.ui.q r13 = r7.f314011e
            com.tencent.mm.modelcontrol.VideoTransPara r13 = r13.f314000s
            int r13 = r13.f267185z
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r14 = 4
            r12[r14] = r13
            com.tencent.mm.plugin.mmsight.ui.q r13 = r7.f314011e
            int r13 = r13.f314006y
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r15 = 5
            r12[r15] = r13
            r13 = 512(0x200, float:7.175E-43)
            java.lang.Integer r16 = java.lang.Integer.valueOf(r13)
            r17 = 6
            r12[r17] = r16
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r12)
            com.tencent.mm.plugin.mmsight.ui.q r1 = r7.f314011e
            com.tencent.mm.modelcontrol.VideoTransPara r2 = r1.f314000s
            int r2 = r2.f267180u
            if (r2 != r10) goto L_0x0305
            int r2 = r1.f314006y
            if (r2 == r10) goto L_0x0242
            if (r2 != r13) goto L_0x0305
        L_0x0242:
            java.lang.String r2 = "MicroMsg.MMSightVideoEditor"
            java.lang.String r12 = "ABA: Videopath:%s Height: %d Width: %d fps: %d VideoBitrate: %d  Duration: %d StartTime: %d\n"
            java.lang.Object[] r9 = new java.lang.Object[r9]
            java.lang.String r1 = r1.f313987f
            r9[r11] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r16 = 1
            r9[r16] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r9[r10] = r1
            com.tencent.mm.plugin.mmsight.ui.q r1 = r7.f314011e
            com.tencent.mm.modelcontrol.VideoTransPara r1 = r1.f314000s
            int r1 = r1.f267168f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r16 = 3
            r9[r16] = r1
            com.tencent.mm.plugin.mmsight.ui.q r1 = r7.f314011e
            com.tencent.mm.modelcontrol.VideoTransPara r1 = r1.f314000s
            int r1 = r1.f267169g
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r9[r14] = r1
            com.tencent.mm.plugin.mmsight.ui.q r1 = r7.f314011e
            int r14 = r1.f313986e
            int r1 = r1.f313985d
            int r14 = r14 - r1
            int r14 = r14 / 1000
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r9[r15] = r1
            com.tencent.mm.plugin.mmsight.ui.q r1 = r7.f314011e
            int r1 = r1.f313985d
            int r1 = r1 / 1000
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r9[r17] = r1
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r12, r9)
            com.tencent.mm.plugin.mmsight.ui.q r1 = r7.f314011e
            java.lang.String r2 = r1.f313987f
            com.tencent.mm.modelcontrol.VideoTransPara r9 = r1.f314000s
            int r12 = r9.f267168f
            int r14 = r9.f267169g
            int r15 = r1.f313986e
            int r1 = r1.f313985d
            int r15 = r15 - r1
            float r15 = (float) r15
            r16 = 1148846080(0x447a0000, float:1000.0)
            float r23 = r15 / r16
            float r1 = (float) r1
            float r24 = r1 / r16
            r25 = 2
            float r1 = r9.f267182w
            r27 = 0
            int r15 = r9.f267184y
            int r13 = r9.f267185z
            int r10 = r9.f267154A
            int r11 = r9.f267155B
            int r9 = r9.f267156C
            r33 = 0
            r18 = r2
            r19 = r4
            r20 = r3
            r21 = r12
            r22 = r14
            r26 = r1
            r28 = r15
            r29 = r13
            r30 = r10
            r31 = r11
            r32 = r9
            com.tencent.mm.plugin.sight.base.ABAPrams r2 = com.tencent.p014mm.plugin.sight.base.AdaptiveAdjustBitrate.m119557b(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            if (r2 == 0) goto L_0x02df
            int r1 = r2.outputKbps
            int r5 = r1 * 1000
            int r3 = r2.outputWidth
            int r4 = r2.outputHeight
        L_0x02df:
            java.lang.String r1 = "MicroMsg.MMSightVideoEditor"
            java.lang.String r9 = "ABA: Adaptive Bitrate Methods: [%d] [%d]  [%d]"
            r10 = 3
            java.lang.Object[] r11 = new java.lang.Object[r10]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r5)
            r12 = 0
            r11[r12] = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r3)
            r12 = 1
            r11[r12] = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r4)
            r12 = 2
            r11[r12] = r10
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r9, r11)
            r42 = r3
            r43 = r4
            r44 = r5
            goto L_0x030c
        L_0x0305:
            r42 = r3
            r43 = r4
            r44 = r5
            r2 = 0
        L_0x030c:
            com.tencent.mm.plugin.mmsight.ui.q r1 = r7.f314011e
            java.lang.String r1 = r1.f313987f
            boolean r1 = com.tencent.p014mm.modelvideoh265toh264.C92862f.m117175h(r1)
            if (r1 != 0) goto L_0x05ad
            com.tencent.mm.plugin.mmsight.ui.q r1 = r7.f314011e
            int r3 = r1.f314005x
            r4 = 1
            if (r3 != r4) goto L_0x031f
            goto L_0x05ad
        L_0x031f:
            int r0 = r1.f313985d
            if (r0 < 0) goto L_0x0385
            int r4 = r1.f313986e
            if (r4 <= 0) goto L_0x0385
            r5 = -1
            if (r3 == r5) goto L_0x035c
            r5 = 1
            if (r3 == r5) goto L_0x0330
            r5 = 2
            if (r3 != r5) goto L_0x035c
        L_0x0330:
            g72.a$a r18 = g72.C107755a.f322496a
            java.lang.String r5 = r1.f313987f
            com.tencent.mm.modelcontrol.VideoTransPara r9 = r1.f314000s
            int r10 = r9.f267168f
            long r11 = (long) r0
            long r13 = (long) r4
            int r0 = r9.f267157D
            int r4 = r9.f267158E
            r19 = r3
            r20 = r5
            r21 = r8
            r22 = r42
            r23 = r43
            r24 = r44
            r25 = r10
            r26 = r11
            r28 = r13
            r30 = r0
            r31 = r4
            g72.a r0 = r18.mo158184a(r19, r20, r21, r22, r23, r24, r25, r26, r28, r30, r31)
            r1.f313994m = r0
            goto L_0x03d5
        L_0x035c:
            g72.a$a r18 = g72.C107755a.f322496a
            java.lang.String r3 = r1.f313987f
            com.tencent.mm.modelcontrol.VideoTransPara r5 = r1.f314000s
            int r9 = r5.f267168f
            long r10 = (long) r0
            long r12 = (long) r4
            int r0 = r5.f267157D
            int r4 = r5.f267158E
            r19 = r3
            r20 = r8
            r21 = r42
            r22 = r43
            r23 = r44
            r24 = r9
            r25 = r10
            r27 = r12
            r29 = r0
            r30 = r4
            g72.a r0 = r18.mo158186c(r19, r20, r21, r22, r23, r24, r25, r27, r29, r30)
            r1.f313994m = r0
            goto L_0x03d5
        L_0x0385:
            r0 = -1
            if (r3 == r0) goto L_0x03b3
            r0 = 1
            if (r3 == r0) goto L_0x038e
            r0 = 2
            if (r3 != r0) goto L_0x03b3
        L_0x038e:
            g72.a$a r18 = g72.C107755a.f322496a
            java.lang.String r0 = r1.f313987f
            com.tencent.mm.modelcontrol.VideoTransPara r4 = r1.f314000s
            int r5 = r4.f267168f
            int r9 = r4.f267157D
            int r4 = r4.f267158E
            r19 = r3
            r20 = r0
            r21 = r8
            r22 = r42
            r23 = r43
            r24 = r44
            r25 = r5
            r26 = r9
            r27 = r4
            g72.a r0 = r18.mo158187d(r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r1.f313994m = r0
            goto L_0x03d5
        L_0x03b3:
            g72.a$a r18 = g72.C107755a.f322496a
            java.lang.String r0 = r1.f313987f
            com.tencent.mm.modelcontrol.VideoTransPara r3 = r1.f314000s
            int r4 = r3.f267168f
            int r5 = r3.f267157D
            int r3 = r3.f267158E
            r19 = r0
            r20 = r8
            r21 = r42
            r22 = r43
            r23 = r44
            r24 = r4
            r25 = r5
            r26 = r3
            g72.a r0 = r18.mo158185b(r19, r20, r21, r22, r23, r24, r25, r26)
            r1.f313994m = r0
        L_0x03d5:
            java.lang.String r0 = "MicroMsg.MMSightVideoEditor"
            java.lang.String r1 = "created remuxer, type: %s, remuxer: %s"
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]
            com.tencent.mm.plugin.mmsight.ui.q r3 = r7.f314011e
            int r3 = r3.f314005x
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5 = 0
            r4[r5] = r3
            com.tencent.mm.plugin.mmsight.ui.q r3 = r7.f314011e
            g72.a r3 = r3.f313994m
            r5 = 1
            r4[r5] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r4)
            com.tencent.mm.plugin.mmsight.ui.q r0 = r7.f314011e
            g72.a r0 = r0.f313994m
            if (r0 != 0) goto L_0x0400
            com.tencent.mm.plugin.mmsight.ui.r$d r0 = new com.tencent.mm.plugin.mmsight.ui.r$d
            r0.<init>()
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r0)
            return
        L_0x0400:
            int r0 = r0.mo158181a()
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r19 = 440(0x1b8, double:2.174E-321)
            r21 = 165(0xa5, double:8.15E-322)
            r23 = 1
            r25 = 0
            r18 = r1
            r18.idkeyStat(r19, r21, r23, r25)
            r3 = 1
            if (r0 != r3) goto L_0x0424
            r19 = 440(0x1b8, double:2.174E-321)
            r21 = 166(0xa6, double:8.2E-322)
            r23 = 1
            r25 = 0
            r18 = r1
            r18.idkeyStat(r19, r21, r23, r25)
            goto L_0x0445
        L_0x0424:
            r3 = 2
            if (r0 != r3) goto L_0x0435
            r19 = 440(0x1b8, double:2.174E-321)
            r21 = 167(0xa7, double:8.25E-322)
            r23 = 1
            r25 = 0
            r18 = r1
            r18.idkeyStat(r19, r21, r23, r25)
            goto L_0x0445
        L_0x0435:
            r3 = 3
            if (r0 != r3) goto L_0x0445
            r19 = 440(0x1b8, double:2.174E-321)
            r21 = 168(0xa8, double:8.3E-322)
            r23 = 1
            r25 = 0
            r18 = r1
            r18.idkeyStat(r19, r21, r23, r25)
        L_0x0445:
            long r0 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            com.tencent.mm.hardcoder.WXHardCoderJNI r18 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
            com.tencent.mm.hardcoder.WXHardCoderJNI r3 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
            boolean r19 = r3.getHcEncodeVideoEnable()
            com.tencent.mm.hardcoder.WXHardCoderJNI r3 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
            int r20 = r3.getHcEncodeVideoDelay()
            com.tencent.mm.hardcoder.WXHardCoderJNI r3 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
            int r21 = r3.getHcEncodeVideoCPU()
            com.tencent.mm.hardcoder.WXHardCoderJNI r3 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
            int r22 = r3.getHcEncodeVideoIO()
            com.tencent.mm.hardcoder.WXHardCoderJNI r3 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
            boolean r3 = r3.getHcEncodeVideoThr()
            if (r3 == 0) goto L_0x047e
            int r3 = android.os.Process.myTid()
            r23 = r3
            goto L_0x0480
        L_0x047e:
            r23 = 0
        L_0x0480:
            r24 = 30000(0x7530, float:4.2039E-41)
            r25 = 603(0x25b, float:8.45E-43)
            com.tencent.mm.hardcoder.WXHardCoderJNI r3 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
            long r26 = r3.getHcEncodeVideoAction()
            java.lang.String r28 = "MicroMsg.MMSightVideoEditor"
            int r3 = r18.startPerformance(r19, r20, r21, r22, r23, r24, r25, r26, r28)
            com.tencent.p014mm.plugin.mmsight.p077ui.C105562q.f313978E = r3
            java.lang.String r4 = "MicroMsg.MMSightVideoEditor"
            java.lang.String r5 = "hardcoder summerPerformance startPerformance: %s"
            r9 = 1
            java.lang.Object[] r10 = new java.lang.Object[r9]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r9 = 0
            r10[r9] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r10)
            android.graphics.Bitmap r3 = r7.f314010d
            if (r3 == 0) goto L_0x04b0
            com.tencent.mm.plugin.mmsight.ui.q r4 = r7.f314011e
            g72.a r4 = r4.f313994m
            r4.mo158183c(r3)
        L_0x04b0:
            com.tencent.mm.plugin.mmsight.ui.q r3 = r7.f314011e
            g72.a r3 = r3.f313994m
            int r3 = r3.mo158182b()
            if (r3 >= 0) goto L_0x04df
            java.lang.String r0 = "MicroMsg.MMSightVideoEditor"
            java.lang.String r1 = "remux failed, ret: %s"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 0
            r2[r4] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r1, r2)
            com.tencent.mm.plugin.mmsight.ui.r$e r0 = new com.tencent.mm.plugin.mmsight.ui.r$e
            r0.<init>()
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r0)
            com.tencent.mm.plugin.mmsight.ui.q r0 = r7.f314011e
            g72.a r0 = r0.f313994m
            int r0 = r0.mo158181a()
            com.tencent.p014mm.plugin.mmsight.segment.C105484h.m141674a(r0)
            return
        L_0x04df:
            com.tencent.mm.plugin.mmsight.ui.q r3 = r7.f314011e
            java.lang.String r3 = r3.f314004w
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 == 0) goto L_0x04f0
            com.tencent.mm.plugin.mmsight.ui.q r3 = r7.f314011e
            java.lang.String r3 = r3.f313987f
            com.tencent.p014mm.vfs.C86013q1.m106463x(r8, r3)
        L_0x04f0:
            int r3 = com.tencent.p014mm.plugin.mmsight.p077ui.C105562q.f313978E
            if (r3 == 0) goto L_0x051a
            com.tencent.mm.hardcoder.WXHardCoderJNI r3 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
            com.tencent.mm.hardcoder.WXHardCoderJNI r4 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
            boolean r4 = r4.getHcEncodeVideoEnable()
            int r5 = com.tencent.p014mm.plugin.mmsight.p077ui.C105562q.f313978E
            r3.stopPerformance(r4, r5)
            java.lang.String r3 = "MicroMsg.MMSightVideoEditor"
            java.lang.String r4 = "hardcoder summerPerformance stopPerformace %s"
            r5 = 1
            java.lang.Object[] r9 = new java.lang.Object[r5]
            int r5 = com.tencent.p014mm.plugin.mmsight.p077ui.C105562q.f313978E
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r10 = 0
            r9[r10] = r5
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r9)
            com.tencent.p014mm.plugin.mmsight.p077ui.C105562q.f313978E = r10
        L_0x051a:
            com.tencent.mm.plugin.mmsight.ui.q r3 = r7.f314011e
            com.tencent.mm.modelcontrol.VideoTransPara r4 = r3.f314000s
            int r5 = r4.f267180u
            r9 = 2
            if (r5 != r9) goto L_0x0530
            int r3 = r3.f314006y
            if (r3 == r9) goto L_0x052b
            r9 = 512(0x200, float:7.175E-43)
            if (r3 != r9) goto L_0x0530
        L_0x052b:
            r3 = 0
            com.tencent.p014mm.plugin.sight.base.SightVideoJNI.addReportMetadata(r8, r2, r5, r3)
            goto L_0x055b
        L_0x0530:
            int r3 = r4.f267181v
            if (r3 <= 0) goto L_0x055b
            java.lang.String r4 = "MicroMsg.MMSightVideoEditor"
            java.lang.String r5 = "steve: qp add report, switch:%s, scene:%s"
            r9 = 2
            java.lang.Object[] r9 = new java.lang.Object[r9]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r10 = 0
            r9[r10] = r3
            com.tencent.mm.plugin.mmsight.ui.q r3 = r7.f314011e
            int r3 = r3.f314006y
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r10 = 1
            r9[r10] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r9)
            com.tencent.mm.plugin.mmsight.ui.q r3 = r7.f314011e
            com.tencent.mm.modelcontrol.VideoTransPara r3 = r3.f314000s
            int r3 = r3.f267181v
            r4 = 0
            com.tencent.p014mm.plugin.sight.base.SightVideoJNI.addReportMetadata(r8, r2, r4, r3)
            goto L_0x055c
        L_0x055b:
            r4 = 0
        L_0x055c:
            long r0 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r0)
            java.lang.String r2 = "MicroMsg.MMSightVideoEditor"
            java.lang.String r3 = "doRemuxVideo used %sms"
            r5 = 1
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            r8[r4] = r5
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r8)
            com.tencent.mm.plugin.mmsight.ui.q r2 = r7.f314011e
            g72.a r2 = r2.f313994m
            int r2 = r2.mo158181a()
            com.tencent.p014mm.plugin.mmsight.segment.C105484h.m141675b(r2, r0)
            com.tencent.mm.plugin.mmsight.ui.q r0 = r7.f314011e
            java.lang.String r1 = r0.f313987f
            java.lang.String r1 = com.tencent.p014mm.vfs.C86013q1.m106456q(r1)
            r0.f313979A = r1
            com.tencent.mm.plugin.mmsight.ui.q r0 = r7.f314011e
            l72.a$b r1 = r0.f314007z
            int r2 = r0.f313985d
            if (r2 < 0) goto L_0x0593
            int r3 = r0.f313986e
            if (r3 <= 0) goto L_0x0593
            r8 = 1
            goto L_0x0594
        L_0x0593:
            r8 = 0
        L_0x0594:
            r1.f327153g = r8
            int r0 = r0.f313986e
            int r0 = r0 - r2
            r1.f327150d = r0
            if (r6 != 0) goto L_0x059f
            r11 = 0
            goto L_0x05a1
        L_0x059f:
            int r11 = r6.f273443a
        L_0x05a1:
            r1.f327149c = r11
            com.tencent.mm.plugin.mmsight.ui.r$f r0 = new com.tencent.mm.plugin.mmsight.ui.r$f
            r0.<init>()
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r0)
            goto L_0x06df
        L_0x05ad:
            java.lang.String r1 = "MicroMsg.MMSightVideoEditor"
            java.lang.String r2 = "h265 format, try mediaCodec remuxer or is suggestRemuxerType is mediacodec"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            com.tencent.mm.plugin.mmsight.ui.r$a r9 = new com.tencent.mm.plugin.mmsight.ui.r$a
            r1 = r9
            r2 = r64
            r3 = r8
            r1.<init>(r3, r4, r6)
            com.tencent.mm.plugin.mmsight.ui.q r1 = r7.f314011e
            com.tencent.mm.modelcontrol.VideoTransPara r2 = r1.f314000s
            int r3 = r2.f267181v
            r4 = 2
            r3 = r3 & r4
            if (r3 == 0) goto L_0x05d4
            int r3 = r2.f267157D
            int r2 = r2.f267158E
            r56 = r2
            r55 = r3
            goto L_0x05d8
        L_0x05d4:
            r55 = 0
            r56 = 0
        L_0x05d8:
            int r2 = r1.f313985d
            if (r2 < 0) goto L_0x0644
            int r2 = r1.f313986e
            if (r2 <= 0) goto L_0x0644
            di3.d r0 = di3.C86312j.m106911c(r0)
            eu.e r0 = (p509eu.C86680e) r0
            r80.h$a r0 = r0.mo120820U8()
            com.tencent.mm.plugin.mmsight.ui.q r2 = r7.f314011e
            java.lang.String r3 = r2.f313987f
            com.tencent.mm.modelcontrol.VideoTransPara r4 = r2.f314000s
            int r4 = r4.f267168f
            int r5 = r2.f313985d
            long r5 = (long) r5
            int r2 = r2.f313986e
            long r10 = (long) r2
            r80.j0 r0 = (r80.C101359j0) r0
            r0.getClass()
            r80.r r0 = new r80.r
            java.lang.String r2 = ""
            if (r3 != 0) goto L_0x0606
            r36 = r2
            goto L_0x0608
        L_0x0606:
            r36 = r3
        L_0x0608:
            r37 = 1
            if (r8 != 0) goto L_0x060f
            r38 = r2
            goto L_0x0611
        L_0x060f:
            r38 = r8
        L_0x0611:
            r39 = 0
            r40 = 0
            r41 = 0
            r45 = 48000(0xbb80, float:6.7262E-41)
            r46 = 44100(0xac44, float:6.1797E-41)
            r47 = 1
            r53 = 0
            r54 = 0
            r57 = 0
            r58 = 0
            r59 = 0
            r80.k0 r2 = new r80.k0
            r60 = r2
            r2.<init>(r9)
            r61 = 7340032(0x700000, float:1.0285576E-38)
            r62 = 0
            r35 = 0
            r34 = r0
            r48 = r4
            r49 = r5
            r51 = r10
            r34.<init>(r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r51, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62)
            r1.f313995n = r0
            goto L_0x0672
        L_0x0644:
            di3.d r0 = di3.C86312j.m106911c(r0)
            eu.e r0 = (p509eu.C86680e) r0
            r80.h$a r0 = r0.mo120820U8()
            com.tencent.mm.plugin.mmsight.ui.q r2 = r7.f314011e
            java.lang.String r3 = r2.f313987f
            com.tencent.mm.modelcontrol.VideoTransPara r2 = r2.f314000s
            int r2 = r2.f267168f
            r18 = r0
            r80.j0 r18 = (r80.C101359j0) r18
            r19 = r3
            r20 = r8
            r21 = r42
            r22 = r43
            r23 = r44
            r24 = r2
            r25 = r55
            r26 = r56
            r27 = r9
            r80.h r0 = r18.mo140842a(r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r1.f313995n = r0
        L_0x0672:
            java.lang.String r0 = "MicroMsg.MMSightVideoEditor"
            java.lang.String r1 = "create mediaCodecVideoRemuxer: %s"
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            com.tencent.mm.plugin.mmsight.ui.q r2 = r7.f314011e
            r80.h r2 = r2.f313995n
            r4 = 0
            r3[r4] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r3)
            com.tencent.mm.plugin.mmsight.ui.q r0 = r7.f314011e
            r80.h r0 = r0.f313995n
            if (r0 != 0) goto L_0x0692
            com.tencent.mm.plugin.mmsight.ui.r$b r0 = new com.tencent.mm.plugin.mmsight.ui.r$b
            r0.<init>()
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r0)
            return
        L_0x0692:
            android.graphics.Bitmap r1 = r7.f314010d
            if (r1 == 0) goto L_0x0699
            r0.mo124209d(r1)
        L_0x0699:
            com.tencent.mm.plugin.mmsight.ui.q r0 = r7.f314011e
            r80.h r0 = r0.f313995n
            int r0 = r0.mo124208b()
            if (r0 >= 0) goto L_0x06c8
            java.lang.String r1 = "MicroMsg.MMSightVideoEditor"
            java.lang.String r2 = "remux failed, ret: %s"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4 = 0
            r3[r4] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r2, r3)
            com.tencent.mm.plugin.mmsight.ui.r$c r0 = new com.tencent.mm.plugin.mmsight.ui.r$c
            r0.<init>()
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r0)
            com.tencent.mm.plugin.mmsight.ui.q r0 = r7.f314011e
            g72.a r0 = r0.f313994m
            int r0 = r0.mo158181a()
            com.tencent.p014mm.plugin.mmsight.segment.C105484h.m141674a(r0)
            return
        L_0x06c8:
            java.lang.Object r1 = com.tencent.p014mm.plugin.mmsight.p077ui.C105562q.f313977D
            monitor-enter(r1)
            r1.wait()     // Catch:{ Exception -> 0x06d1 }
            goto L_0x06de
        L_0x06cf:
            r0 = move-exception
            goto L_0x06e0
        L_0x06d1:
            r0 = move-exception
            r2 = r0
            java.lang.String r0 = "MicroMsg.MMSightVideoEditor"
            java.lang.String r3 = "wait mediaCodecRemux error"
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x06cf }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r2, r3, r4)     // Catch:{ all -> 0x06cf }
        L_0x06de:
            monitor-exit(r1)     // Catch:{ all -> 0x06cf }
        L_0x06df:
            return
        L_0x06e0:
            monitor-exit(r1)     // Catch:{ all -> 0x06cf }
            throw r0
        L_0x06e2:
            java.lang.String r0 = "MicroMsg.MMSightVideoEditor"
            java.lang.String r1 = "doRemuxVideo, retrieve video metadata error, width: %s, height: %s, bitrate: %s"
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6 = 0
            r2[r6] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r4 = 1
            r2[r4] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4 = 2
            r2[r4] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.mmsight.p077ui.C105566r.run():void");
    }
}
