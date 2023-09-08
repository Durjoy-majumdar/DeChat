package tg3;

import android.os.AsyncTask;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.network.C81034b0;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.sandbox.monitor.C85705h;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import p156gj.C87200o;
import p156gj.C87203t;
import p206nj.C88955f;
import pe3.C89349b;
import qe3.C89625d;
import rg3.C89963b;
import te3.C49335eu3;
import te3.C50804pa2;
import te3.C50935qa2;
import te3.C90417ia;

/* renamed from: tg3.p */
public class C90482p extends C85705h {

    /* renamed from: g */
    public int f260036g = 0;

    /* renamed from: h */
    public int f260037h = 0;

    /* renamed from: i */
    public String[] f260038i;

    /* renamed from: j */
    public byte[] f260039j;

    /* renamed from: k */
    public int f260040k;

    /* renamed from: l */
    public byte[] f260041l;

    /* renamed from: m */
    public C89963b.C89964a f260042m;

    /* renamed from: n */
    public C90484b f260043n = null;

    /* renamed from: o */
    public C89963b.C89964a f260044o = new C90483a();

    /* renamed from: tg3.p$a */
    public class C90483a implements C89963b.C89964a {
        public C90483a() {
        }

        /* renamed from: a */
        public void mo124302a(int i, int i2) {
        }

        /* renamed from: b */
        public void mo124298b(long j) {
            C90482p.this.f260042m.mo124298b(j);
        }

        /* renamed from: c */
        public void mo124299c(long j) {
            C90482p.this.f260042m.mo124299c(j);
        }

        /* JADX WARNING: Removed duplicated region for block: B:43:0x017d A[SYNTHETIC, Splitter:B:43:0x017d] */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x01aa  */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x01c8  */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x0256 A[SYNTHETIC, Splitter:B:63:0x0256] */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo124303d(int r22, int r23, te3.C49335eu3 r24) {
            /*
                r21 = this;
                r1 = r21
                r0 = r22
                r2 = r23
                r3 = r24
                r4 = 200(0xc8, float:2.8E-43)
                r5 = 0
                r6 = 1
                if (r0 != r4) goto L_0x02c5
                if (r2 != 0) goto L_0x02c5
                if (r3 == 0) goto L_0x001c
                te3.ja r7 = r24.getBaseResponse()
                int r7 = r7.f135955d
                if (r7 == 0) goto L_0x001c
                goto L_0x02c5
            L_0x001c:
                r2 = r3
                te3.qa2 r2 = (te3.C50935qa2) r2
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "onGYNetEnd : file dir = "
                r7.append(r8)
                java.lang.String r8 = a70.C112760b.m154230f0()
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                java.lang.String r8 = "MicroMsg.NetSceneGetUpdatePack"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r7)
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r9 = "onGYNetEnd : total len = "
                r7.append(r9)
                int r9 = r2.f140208d
                r7.append(r9)
                java.lang.String r7 = r7.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r7)
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r9 = "onGYNetEnd : start pos = "
                r7.append(r9)
                int r9 = r2.f140209e
                r7.append(r9)
                java.lang.String r7 = r7.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r7)
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r9 = "onGYNetEnd : data len = "
                r7.append(r9)
                int r9 = r2.f140210f
                r7.append(r9)
                java.lang.String r7 = r7.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r7)
                int r7 = r2.f140210f
                r9 = 0
                r10 = -1
                if (r7 <= 0) goto L_0x02b6
                te3.qv3 r11 = r2.f140211g
                if (r11 != 0) goto L_0x0087
                goto L_0x02b6
            L_0x0087:
                int r0 = r11.f140572d
                r11 = 4
                if (r0 == r7) goto L_0x00b6
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r3 = "data len not match with data buf, dataLen = "
                r0.append(r3)
                int r3 = r2.f140210f
                r0.append(r3)
                java.lang.String r3 = " data buf len = "
                r0.append(r3)
                te3.qv3 r2 = r2.f140211g
                int r2 = r2.f140572d
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
                tg3.p r0 = tg3.C90482p.this
                rg3.b$a r0 = r0.f260042m
                r0.mo124303d(r11, r10, r9)
                return
            L_0x00b6:
                int r0 = r2.f140209e
                if (r0 < 0) goto L_0x0281
                int r0 = r0 + r7
                int r7 = r2.f140208d
                if (r0 <= r7) goto L_0x00c1
                goto L_0x0281
            L_0x00c1:
                if (r7 > 0) goto L_0x00e2
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r3 = "totalLen is invalid: totalLen = "
                r0.append(r3)
                int r2 = r2.f140208d
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
                tg3.p r0 = tg3.C90482p.this
                rg3.b$a r0 = r0.f260042m
                r0.mo124303d(r11, r10, r9)
                return
            L_0x00e2:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r7 = com.tencent.p014mm.sandbox.monitor.C85705h.f249722f
                r0.append(r7)
                tg3.p r7 = tg3.C90482p.this
                java.lang.String r7 = r7.f249726d
                r0.append(r7)
                java.lang.String r7 = ".temp"
                r0.append(r7)
                java.lang.String r12 = r0.toString()
                te3.qv3 r0 = r2.f140211g
                pe3.b r0 = r0.f140574f
                byte[] r13 = r0.mo123703f()
                java.lang.String r14 = "file op appendToFile close e type:%s, e msg:%s, fileName:%s, buf len:%d"
                java.lang.String r15 = "MicroMsg.CrashFileOperatioin"
                int r0 = r13.length
                java.lang.String r4 = ""
                if (r0 != 0) goto L_0x0110
                r0 = -2
                goto L_0x01a8
            L_0x0110:
                r16 = 3
                r17 = 2
                java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0152, all -> 0x014d }
                r9.<init>(r12, r6)     // Catch:{ Exception -> 0x0152, all -> 0x014d }
                int r0 = r13.length     // Catch:{ Exception -> 0x014b }
                r9.write(r13, r5, r0)     // Catch:{ Exception -> 0x014b }
                r9.close()     // Catch:{ IOException -> 0x0121 }
                goto L_0x0146
            L_0x0121:
                r0 = move-exception
                r9 = r0
                java.lang.Object[] r0 = new java.lang.Object[r5]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r15, r9, r4, r0)
                java.lang.Object[] r0 = new java.lang.Object[r11]
                java.lang.Class r18 = r9.getClass()
                java.lang.String r18 = r18.getSimpleName()
                r0[r5] = r18
                java.lang.String r9 = r9.getMessage()
                r0[r6] = r9
                r0[r17] = r12
                int r6 = r13.length
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r0[r16] = r6
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r15, r14, r0)
            L_0x0146:
                r0 = 0
                goto L_0x01a8
            L_0x0148:
                r0 = move-exception
                goto L_0x0253
            L_0x014b:
                r0 = move-exception
                goto L_0x0154
            L_0x014d:
                r0 = move-exception
                r2 = r0
                r9 = 0
                goto L_0x0254
            L_0x0152:
                r0 = move-exception
                r9 = 0
            L_0x0154:
                java.lang.Object[] r10 = new java.lang.Object[r5]     // Catch:{ all -> 0x0148 }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r15, r0, r4, r10)     // Catch:{ all -> 0x0148 }
                java.lang.String r10 = "file op appendToFile e type:%s, e msg:%s, fileName:%s, buf len:%d"
                java.lang.Object[] r6 = new java.lang.Object[r11]     // Catch:{ all -> 0x0148 }
                java.lang.Class r20 = r0.getClass()     // Catch:{ all -> 0x0148 }
                java.lang.String r20 = r20.getSimpleName()     // Catch:{ all -> 0x0148 }
                r6[r5] = r20     // Catch:{ all -> 0x0148 }
                java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0148 }
                r19 = 1
                r6[r19] = r0     // Catch:{ all -> 0x0148 }
                r6[r17] = r12     // Catch:{ all -> 0x0148 }
                int r0 = r13.length     // Catch:{ all -> 0x0148 }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0148 }
                r6[r16] = r0     // Catch:{ all -> 0x0148 }
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r15, r10, r6)     // Catch:{ all -> 0x0148 }
                if (r9 == 0) goto L_0x01a7
                r9.close()     // Catch:{ IOException -> 0x0181 }
                goto L_0x01a7
            L_0x0181:
                r0 = move-exception
                r6 = r0
                java.lang.Object[] r0 = new java.lang.Object[r5]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r15, r6, r4, r0)
                java.lang.Object[] r0 = new java.lang.Object[r11]
                java.lang.Class r9 = r6.getClass()
                java.lang.String r9 = r9.getSimpleName()
                r0[r5] = r9
                java.lang.String r6 = r6.getMessage()
                r9 = 1
                r0[r9] = r6
                r0[r17] = r12
                int r6 = r13.length
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r0[r16] = r6
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r15, r14, r0)
            L_0x01a7:
                r0 = -1
            L_0x01a8:
                if (r0 == 0) goto L_0x01c8
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "appendBuf failed : "
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
                tg3.p r0 = tg3.C90482p.this
                rg3.b$a r0 = r0.f260042m
                r2 = 0
                r3 = -1
                r0.mo124303d(r11, r3, r2)
                return
            L_0x01c8:
                tg3.p r0 = tg3.C90482p.this
                int r6 = r2.f140210f
                int r9 = r2.f140209e
                int r6 = r6 + r9
                r0.f249725c = r6
                int r6 = r2.f140208d
                r0.f249724b = r6
                rg3.b$a r0 = r0.f260042m
                r0.mo124302a(r6, r9)
                int r0 = r2.f140209e
                int r6 = r2.f140210f
                int r0 = r0 + r6
                int r2 = r2.f140208d
                if (r0 < r2) goto L_0x024b
                tg3.p r0 = tg3.C90482p.this     // Catch:{ Exception -> 0x0244 }
                java.lang.String r2 = r0.f249726d     // Catch:{ Exception -> 0x0244 }
                java.lang.String r0 = r0.mo119309f()     // Catch:{ Exception -> 0x0244 }
                java.lang.String r0 = tg3.C90492s.m113305a(r0)     // Catch:{ Exception -> 0x0244 }
                boolean r0 = r2.equalsIgnoreCase(r0)     // Catch:{ Exception -> 0x0244 }
                if (r0 == 0) goto L_0x022c
                java.lang.String r0 = com.tencent.p014mm.sandbox.monitor.C85705h.f249722f     // Catch:{ Exception -> 0x0244 }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0244 }
                r2.<init>()     // Catch:{ Exception -> 0x0244 }
                tg3.p r6 = tg3.C90482p.this     // Catch:{ Exception -> 0x0244 }
                java.lang.String r6 = r6.f249726d     // Catch:{ Exception -> 0x0244 }
                r2.append(r6)     // Catch:{ Exception -> 0x0244 }
                r2.append(r7)     // Catch:{ Exception -> 0x0244 }
                java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0244 }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0244 }
                r6.<init>()     // Catch:{ Exception -> 0x0244 }
                tg3.p r7 = tg3.C90482p.this     // Catch:{ Exception -> 0x0244 }
                java.lang.String r7 = r7.f249726d     // Catch:{ Exception -> 0x0244 }
                r6.append(r7)     // Catch:{ Exception -> 0x0244 }
                java.lang.String r7 = ".apk"
                r6.append(r7)     // Catch:{ Exception -> 0x0244 }
                java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0244 }
                tg3.C90492s.m113306b(r0, r2, r6)     // Catch:{ Exception -> 0x0244 }
                tg3.p r0 = tg3.C90482p.this     // Catch:{ Exception -> 0x0244 }
                rg3.b$a r0 = r0.f260042m     // Catch:{ Exception -> 0x0244 }
                r2 = 200(0xc8, float:2.8E-43)
                r0.mo124303d(r2, r5, r3)     // Catch:{ Exception -> 0x0244 }
                goto L_0x0252
            L_0x022c:
                java.lang.String r0 = "update pack check error"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)     // Catch:{ Exception -> 0x0244 }
                tg3.p r0 = tg3.C90482p.this     // Catch:{ Exception -> 0x0244 }
                java.lang.String r0 = r0.mo119309f()     // Catch:{ Exception -> 0x0244 }
                com.tencent.p014mm.vfs.C86013q1.m106447h(r0)     // Catch:{ Exception -> 0x0244 }
                tg3.p r0 = tg3.C90482p.this     // Catch:{ Exception -> 0x0244 }
                rg3.b$a r0 = r0.f260042m     // Catch:{ Exception -> 0x0244 }
                r2 = -1
                r0.mo124303d(r2, r2, r3)     // Catch:{ Exception -> 0x0244 }
                goto L_0x0252
            L_0x0244:
                r0 = move-exception
                java.lang.Object[] r2 = new java.lang.Object[r5]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r0, r4, r2)
                goto L_0x0252
            L_0x024b:
                tg3.p r0 = tg3.C90482p.this
                rg3.b$a r2 = r0.f260042m
                r0.mo124300a(r2)
            L_0x0252:
                return
            L_0x0253:
                r2 = r0
            L_0x0254:
                if (r9 == 0) goto L_0x0280
                r9.close()     // Catch:{ IOException -> 0x025a }
                goto L_0x0280
            L_0x025a:
                r0 = move-exception
                r3 = r0
                java.lang.Object[] r0 = new java.lang.Object[r5]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r15, r3, r4, r0)
                java.lang.Object[] r0 = new java.lang.Object[r11]
                java.lang.Class r4 = r3.getClass()
                java.lang.String r4 = r4.getSimpleName()
                r0[r5] = r4
                java.lang.String r3 = r3.getMessage()
                r4 = 1
                r0[r4] = r3
                r0[r17] = r12
                int r3 = r13.length
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r0[r16] = r3
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r15, r14, r0)
            L_0x0280:
                throw r2
            L_0x0281:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r3 = "startPos = "
                r0.append(r3)
                int r3 = r2.f140209e
                r0.append(r3)
                java.lang.String r3 = " dataLen = "
                r0.append(r3)
                int r3 = r2.f140210f
                r0.append(r3)
                java.lang.String r3 = " totalLen = "
                r0.append(r3)
                int r2 = r2.f140208d
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
                tg3.p r0 = tg3.C90482p.this
                rg3.b$a r0 = r0.f260042m
                r2 = 0
                r3 = -1
                r0.mo124303d(r11, r3, r2)
                return
            L_0x02b6:
                r2 = r9
                r3 = -1
                java.lang.String r4 = "data is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r4)
                tg3.p r4 = tg3.C90482p.this
                rg3.b$a r4 = r4.f260042m
                r4.mo124303d(r0, r3, r2)
                return
            L_0x02c5:
                tg3.p r4 = tg3.C90482p.this
                boolean r4 = r4.f249727e
                if (r4 == 0) goto L_0x02d7
                android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                boolean r4 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isWifi((android.content.Context) r4)
                r6 = 1
                r5 = r4 ^ 1
                goto L_0x02d8
            L_0x02d7:
                r6 = 1
            L_0x02d8:
                if (r5 != 0) goto L_0x02ee
                tg3.p r4 = tg3.C90482p.this
                int r5 = r4.f260037h
                int r5 = r5 + r6
                r4.f260037h = r5
                java.lang.String[] r6 = r4.f260038i
                int r6 = r6.length
                int r6 = r6 * 5
                if (r5 >= r6) goto L_0x02ee
                rg3.b$a r0 = r4.f260042m
                r4.mo124300a(r0)
                goto L_0x02f5
            L_0x02ee:
                tg3.p r4 = tg3.C90482p.this
                rg3.b$a r4 = r4.f260042m
                r4.mo124303d(r0, r2, r3)
            L_0x02f5:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: tg3.C90482p.C90483a.mo124303d(int, int, te3.eu3):void");
        }
    }

    /* renamed from: tg3.p$b */
    public class C90484b extends AsyncTask<C50804pa2, Integer, C50935qa2> {

        /* renamed from: a */
        public C81034b0 f260046a = null;

        /* renamed from: b */
        public int f260047b = 200;

        /* renamed from: c */
        public PInt f260048c = new PInt();

        /* renamed from: d */
        public String f260049d;

        /* renamed from: e */
        public C89963b.C89964a f260050e;

        public C90484b(String str, C89963b.C89964a aVar) {
            this.f260049d = str;
            this.f260050e = aVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:102:0x026e A[SYNTHETIC, Splitter:B:102:0x026e] */
        /* JADX WARNING: Removed duplicated region for block: B:108:0x027e  */
        /* JADX WARNING: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x023c A[SYNTHETIC, Splitter:B:83:0x023c] */
        /* JADX WARNING: Removed duplicated region for block: B:88:0x024a A[SYNTHETIC, Splitter:B:88:0x024a] */
        /* JADX WARNING: Removed duplicated region for block: B:97:0x0260 A[SYNTHETIC, Splitter:B:97:0x0260] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object doInBackground(java.lang.Object[] r26) {
            /*
                r25 = this;
                r1 = r25
                r0 = r26
                te3.pa2[] r0 = (te3.C50804pa2[]) r0
                java.lang.String r2 = ""
                int r3 = r0.length
                r4 = 0
                if (r3 == 0) goto L_0x029c
                r3 = 0
                r6 = r0[r3]
                if (r6 != 0) goto L_0x0013
                goto L_0x029c
            L_0x0013:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "doInBackground, params="
                r6.append(r7)
                r7 = r0[r3]
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                java.lang.String r7 = "MicroMsg.NetSceneGetUpdatePack"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r6)
                r0 = r0[r3]
                com.tencent.mm.pointers.PByteArray r6 = new com.tencent.mm.pointers.PByteArray
                r6.<init>()
                boolean r8 = com.tencent.p014mm.sdk.crash.CrashReportFactory.foreground
                if (r8 == 0) goto L_0x003a
                r8 = 7
                r20 = 7
                goto L_0x003d
            L_0x003a:
                r8 = 6
                r20 = 6
            L_0x003d:
                r15 = 1
                byte[] r8 = r0.toByteArray()     // Catch:{ Exception -> 0x0286 }
                tg3.p r0 = tg3.C90482p.this     // Catch:{ Exception -> 0x0286 }
                r0.getClass()     // Catch:{ Exception -> 0x0286 }
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r4)     // Catch:{ Exception -> 0x0286 }
                if (r0 != 0) goto L_0x005e
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r8)     // Catch:{ Exception -> 0x0286 }
                if (r0 != 0) goto L_0x005e
                tg3.p r0 = tg3.C90482p.this     // Catch:{ Exception -> 0x0286 }
                int r0 = r0.f260040k     // Catch:{ Exception -> 0x0286 }
                int r0 = com.tencent.p014mm.protocal.MMProtocalJni.genSignature(r0, r4, r8)     // Catch:{ Exception -> 0x0286 }
                r19 = r0
                goto L_0x0060
            L_0x005e:
                r19 = 0
            L_0x0060:
                tg3.p r0 = tg3.C90482p.this     // Catch:{ Exception -> 0x0286 }
                byte[] r10 = r0.f260039j     // Catch:{ Exception -> 0x0286 }
                r11 = 0
                byte[] r12 = r0.f260041l     // Catch:{ Exception -> 0x0286 }
                java.lang.String r13 = p156gj.C87203t.m108273i()     // Catch:{ Exception -> 0x0286 }
                tg3.p r0 = tg3.C90482p.this     // Catch:{ Exception -> 0x0286 }
                int r14 = r0.f260040k     // Catch:{ Exception -> 0x0286 }
                r0 = 113(0x71, float:1.58E-43)
                r16 = 0
                byte[] r9 = new byte[r3]     // Catch:{ Exception -> 0x0286 }
                byte[] r5 = new byte[r3]     // Catch:{ Exception -> 0x0286 }
                r21 = 0
                r22 = 0
                r23 = 0
                r24 = 0
                r17 = r9
                r9 = r6
                r3 = 1
                r15 = r0
                r18 = r5
                com.tencent.p014mm.protocal.MMProtocalJni.pack(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ Exception -> 0x0284 }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0221, all -> 0x021c }
                r0.<init>()     // Catch:{ Exception -> 0x0221, all -> 0x021c }
                java.lang.String r5 = "http://"
                r0.append(r5)     // Catch:{ Exception -> 0x0221, all -> 0x021c }
                java.lang.String r5 = r1.f260049d     // Catch:{ Exception -> 0x0221, all -> 0x021c }
                r0.append(r5)     // Catch:{ Exception -> 0x0221, all -> 0x021c }
                java.lang.String r5 = "/cgi-bin/micromsg-bin/getupdatepack"
                r0.append(r5)     // Catch:{ Exception -> 0x0221, all -> 0x021c }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0221, all -> 0x021c }
                com.tencent.mm.network.b0 r0 = com.tencent.p014mm.network.C81035d.m98963d(r0, r4)     // Catch:{ Exception -> 0x0221, all -> 0x021c }
                r1.f260046a = r0     // Catch:{ Exception -> 0x0221, all -> 0x021c }
                java.lang.String r5 = "POST"
                r0.mo112930l(r5)     // Catch:{ Exception -> 0x0221, all -> 0x021c }
                com.tencent.mm.network.b0 r0 = r1.f260046a     // Catch:{ Exception -> 0x0221, all -> 0x021c }
                java.net.HttpURLConnection r0 = r0.f238032a     // Catch:{ Exception -> 0x0221, all -> 0x021c }
                r0.setDoInput(r3)     // Catch:{ Exception -> 0x0221, all -> 0x021c }
                com.tencent.mm.network.b0 r0 = r1.f260046a     // Catch:{ Exception -> 0x0221, all -> 0x021c }
                java.net.HttpURLConnection r0 = r0.f238032a     // Catch:{ Exception -> 0x0221, all -> 0x021c }
                r0.setDoOutput(r3)     // Catch:{ Exception -> 0x0221, all -> 0x021c }
                com.tencent.mm.network.b0 r0 = r1.f260046a     // Catch:{ Exception -> 0x0221, all -> 0x021c }
                r5 = 0
                r0.mo112918c(r5)     // Catch:{ Exception -> 0x0221, all -> 0x021c }
                com.tencent.mm.network.b0 r0 = r1.f260046a     // Catch:{ Exception -> 0x0221, all -> 0x021c }
                java.lang.String r5 = "User-Agent"
                java.lang.String r8 = "Android QQMail HTTP Client"
                r0.mo112921e(r5, r8)     // Catch:{ Exception -> 0x0221, all -> 0x021c }
                com.tencent.mm.network.b0 r0 = r1.f260046a     // Catch:{ Exception -> 0x0221, all -> 0x021c }
                java.lang.String r5 = "Connection"
                java.lang.String r8 = "Keep-Alive"
                r0.mo112921e(r5, r8)     // Catch:{ Exception -> 0x0221, all -> 0x021c }
                com.tencent.mm.network.b0 r0 = r1.f260046a     // Catch:{ Exception -> 0x0221, all -> 0x021c }
                java.lang.String r5 = "Cache-Control"
                java.lang.String r8 = "no-cache"
                r0.mo112921e(r5, r8)     // Catch:{ Exception -> 0x0221, all -> 0x021c }
                com.tencent.mm.network.b0 r0 = r1.f260046a     // Catch:{ Exception -> 0x0221, all -> 0x021c }
                java.lang.String r5 = "Content-Type"
                java.lang.String r8 = "application/octet-stream"
                r0.mo112921e(r5, r8)     // Catch:{ Exception -> 0x0221, all -> 0x021c }
                com.tencent.mm.network.b0 r0 = r1.f260046a     // Catch:{ Exception -> 0x0221, all -> 0x021c }
                java.lang.String r5 = "accept"
                java.lang.String r8 = "*/*"
                r0.mo112921e(r5, r8)     // Catch:{ Exception -> 0x0221, all -> 0x021c }
                com.tencent.mm.network.b0 r0 = r1.f260046a     // Catch:{ Exception -> 0x0221, all -> 0x021c }
                java.lang.String r5 = "Accept-Charset"
                java.lang.String r8 = "UTF-8"
                r0.mo112921e(r5, r8)     // Catch:{ Exception -> 0x0221, all -> 0x021c }
                com.tencent.mm.network.b0 r0 = r1.f260046a     // Catch:{ Exception -> 0x0221, all -> 0x021c }
                r5 = 15000(0x3a98, float:2.102E-41)
                r0.mo112919d(r5)     // Catch:{ Exception -> 0x0221, all -> 0x021c }
                com.tencent.mm.network.b0 r0 = r1.f260046a     // Catch:{ Exception -> 0x0221, all -> 0x021c }
                r0.mo112926h()     // Catch:{ Exception -> 0x0221, all -> 0x021c }
                com.tencent.mm.network.b0 r0 = r1.f260046a     // Catch:{ Exception -> 0x0221, all -> 0x021c }
                java.io.OutputStream r5 = r0.mo112929k()     // Catch:{ Exception -> 0x0221, all -> 0x021c }
                byte[] r0 = r6.value     // Catch:{ Exception -> 0x0219, all -> 0x0215 }
                r5.write(r0)     // Catch:{ Exception -> 0x0219, all -> 0x0215 }
                r5.flush()     // Catch:{ Exception -> 0x0219, all -> 0x0215 }
                rg3.b$a r0 = r1.f260050e     // Catch:{ Exception -> 0x0219, all -> 0x0215 }
                byte[] r6 = r6.value     // Catch:{ Exception -> 0x0219, all -> 0x0215 }
                int r6 = r6.length     // Catch:{ Exception -> 0x0219, all -> 0x0215 }
                long r8 = (long) r6     // Catch:{ Exception -> 0x0219, all -> 0x0215 }
                r10 = 150(0x96, double:7.4E-322)
                long r8 = r8 + r10
                r0.mo124298b(r8)     // Catch:{ Exception -> 0x0219, all -> 0x0215 }
                com.tencent.mm.network.b0 r0 = r1.f260046a     // Catch:{ Exception -> 0x0219, all -> 0x0215 }
                int r0 = r0.mo112916a()     // Catch:{ Exception -> 0x0219, all -> 0x0215 }
                r1.f260047b = r0     // Catch:{ Exception -> 0x0219, all -> 0x0215 }
                r6 = 200(0xc8, float:2.8E-43)
                if (r0 == r6) goto L_0x013f
                r5.close()     // Catch:{ IOException -> 0x012c }
                goto L_0x0134
            L_0x012c:
                r0 = move-exception
                r3 = r0
                r5 = 0
                java.lang.Object[] r0 = new java.lang.Object[r5]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r3, r2, r0)
            L_0x0134:
                com.tencent.mm.network.b0 r0 = r1.f260046a
                if (r0 == 0) goto L_0x029f
            L_0x0138:
                r0.disconnect()
                r1.f260046a = r4
                goto L_0x029f
            L_0x013f:
                com.tencent.mm.network.b0 r0 = r1.f260046a     // Catch:{ Exception -> 0x0219, all -> 0x0215 }
                java.lang.String r6 = "Content-Encoding"
                java.lang.String r0 = r0.mo112922f(r6)     // Catch:{ Exception -> 0x0219, all -> 0x0215 }
                com.tencent.mm.network.b0 r6 = r1.f260046a     // Catch:{ Exception -> 0x0219, all -> 0x0215 }
                java.io.InputStream r6 = r6.getInputStream()     // Catch:{ Exception -> 0x0219, all -> 0x0215 }
                if (r0 == 0) goto L_0x015f
                java.lang.String r8 = "gzip"
                boolean r0 = r0.contains(r8)     // Catch:{ Exception -> 0x0219, all -> 0x0215 }
                if (r0 == 0) goto L_0x015f
                java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ Exception -> 0x0219, all -> 0x0215 }
                r0.<init>(r6)     // Catch:{ Exception -> 0x0219, all -> 0x0215 }
                r8 = r0
                r15 = 1
                goto L_0x0161
            L_0x015f:
                r8 = r6
                r15 = 0
            L_0x0161:
                java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x0213 }
                r0.<init>()     // Catch:{ Exception -> 0x0213 }
                r9 = 1024(0x400, float:1.435E-42)
                byte[] r9 = new byte[r9]     // Catch:{ Exception -> 0x0213 }
                r12 = r10
            L_0x016b:
                int r14 = r8.read(r9)     // Catch:{ Exception -> 0x0213 }
                if (r14 <= 0) goto L_0x017a
                r10 = 0
                r0.write(r9, r10, r14)     // Catch:{ Exception -> 0x0213 }
                long r10 = (long) r14     // Catch:{ Exception -> 0x0213 }
                long r12 = r12 + r10
                r10 = 150(0x96, double:7.4E-322)
                goto L_0x016b
            L_0x017a:
                if (r15 != 0) goto L_0x0182
                rg3.b$a r6 = r1.f260050e     // Catch:{ Exception -> 0x0213 }
                r6.mo124299c(r12)     // Catch:{ Exception -> 0x0213 }
                goto L_0x01a1
            L_0x0182:
                boolean r10 = r6.markSupported()     // Catch:{ Exception -> 0x0213 }
                if (r10 == 0) goto L_0x019c
                r6.mark(r3)     // Catch:{ Exception -> 0x0213 }
                r10 = 150(0x96, double:7.4E-322)
            L_0x018d:
                int r12 = r6.read(r9)     // Catch:{ Exception -> 0x0213 }
                if (r12 <= 0) goto L_0x0196
                long r12 = (long) r12     // Catch:{ Exception -> 0x0213 }
                long r10 = r10 + r12
                goto L_0x018d
            L_0x0196:
                rg3.b$a r6 = r1.f260050e     // Catch:{ Exception -> 0x0213 }
                r6.mo124299c(r10)     // Catch:{ Exception -> 0x0213 }
                goto L_0x01a1
            L_0x019c:
                rg3.b$a r6 = r1.f260050e     // Catch:{ Exception -> 0x0213 }
                r6.mo124299c(r12)     // Catch:{ Exception -> 0x0213 }
            L_0x01a1:
                com.tencent.mm.pointers.PByteArray r6 = new com.tencent.mm.pointers.PByteArray     // Catch:{ Exception -> 0x0213 }
                r6.<init>()     // Catch:{ Exception -> 0x0213 }
                com.tencent.mm.pointers.PByteArray r17 = new com.tencent.mm.pointers.PByteArray     // Catch:{ Exception -> 0x0213 }
                r17.<init>()     // Catch:{ Exception -> 0x0213 }
                com.tencent.mm.pointers.PInt r19 = new com.tencent.mm.pointers.PInt     // Catch:{ Exception -> 0x0213 }
                r19.<init>()     // Catch:{ Exception -> 0x0213 }
                com.tencent.mm.pointers.PInt r9 = new com.tencent.mm.pointers.PInt     // Catch:{ Exception -> 0x0213 }
                r10 = 0
                r9.<init>(r10)     // Catch:{ Exception -> 0x0213 }
                com.tencent.mm.pointers.PInt r11 = new com.tencent.mm.pointers.PInt     // Catch:{ Exception -> 0x0213 }
                r11.<init>(r10)     // Catch:{ Exception -> 0x0213 }
                com.tencent.mm.pointers.PInt r12 = new com.tencent.mm.pointers.PInt     // Catch:{ Exception -> 0x0213 }
                r12.<init>(r10)     // Catch:{ Exception -> 0x0213 }
                com.tencent.mm.pointers.PInt r10 = new com.tencent.mm.pointers.PInt     // Catch:{ Exception -> 0x0213 }
                r13 = 255(0xff, float:3.57E-43)
                r10.<init>(r13)     // Catch:{ Exception -> 0x0213 }
                byte[] r15 = r0.toByteArray()     // Catch:{ Exception -> 0x0213 }
                tg3.p r0 = tg3.C90482p.this     // Catch:{ Exception -> 0x0213 }
                byte[] r0 = r0.f260039j     // Catch:{ Exception -> 0x0213 }
                com.tencent.mm.pointers.PInt r13 = r1.f260048c     // Catch:{ Exception -> 0x0213 }
                r14 = r6
                r16 = r0
                r18 = r13
                r20 = r9
                r21 = r10
                r22 = r11
                r23 = r12
                com.tencent.p014mm.protocal.MMProtocalJni.unpack(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ Exception -> 0x0213 }
                te3.qa2 r0 = new te3.qa2     // Catch:{ Exception -> 0x0213 }
                r0.<init>()     // Catch:{ Exception -> 0x0213 }
                byte[] r6 = r6.value     // Catch:{ Exception -> 0x0213 }
                pe3.a r0 = r0.parseFrom(r6)     // Catch:{ Exception -> 0x0213 }
                r6 = r0
                te3.qa2 r6 = (te3.C50935qa2) r6     // Catch:{ Exception -> 0x0213 }
                r5.close()     // Catch:{ IOException -> 0x01f4 }
                r5 = 0
                goto L_0x01fc
            L_0x01f4:
                r0 = move-exception
                r3 = r0
                r5 = 0
                java.lang.Object[] r0 = new java.lang.Object[r5]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r3, r2, r0)
            L_0x01fc:
                r8.close()     // Catch:{ IOException -> 0x0200 }
                goto L_0x0207
            L_0x0200:
                r0 = move-exception
                r3 = r0
                java.lang.Object[] r0 = new java.lang.Object[r5]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r3, r2, r0)
            L_0x0207:
                com.tencent.mm.network.b0 r0 = r1.f260046a
                if (r0 == 0) goto L_0x0210
                r0.disconnect()
                r1.f260046a = r4
            L_0x0210:
                r4 = r6
                goto L_0x029f
            L_0x0213:
                r0 = move-exception
                goto L_0x0224
            L_0x0215:
                r0 = move-exception
                r3 = r0
                r8 = r4
                goto L_0x025e
            L_0x0219:
                r0 = move-exception
                r8 = r4
                goto L_0x0224
            L_0x021c:
                r0 = move-exception
                r3 = r0
                r5 = r4
                r8 = r5
                goto L_0x025e
            L_0x0221:
                r0 = move-exception
                r5 = r4
                r8 = r5
            L_0x0224:
                java.lang.String r6 = "Exception in doInBackground, [%s]"
                java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x025c }
                java.lang.String r9 = r0.getMessage()     // Catch:{ all -> 0x025c }
                r10 = 0
                r3[r10] = r9     // Catch:{ all -> 0x025c }
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r6, r3)     // Catch:{ all -> 0x025c }
                java.lang.Object[] r3 = new java.lang.Object[r10]     // Catch:{ all -> 0x025c }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r2, r3)     // Catch:{ all -> 0x025c }
                r3 = -1
                r1.f260047b = r3     // Catch:{ all -> 0x025c }
                if (r5 == 0) goto L_0x0248
                r5.close()     // Catch:{ IOException -> 0x0240 }
                goto L_0x0248
            L_0x0240:
                r0 = move-exception
                r3 = r0
                r5 = 0
                java.lang.Object[] r0 = new java.lang.Object[r5]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r3, r2, r0)
            L_0x0248:
                if (r8 == 0) goto L_0x0256
                r8.close()     // Catch:{ IOException -> 0x024e }
                goto L_0x0256
            L_0x024e:
                r0 = move-exception
                r3 = r0
                r5 = 0
                java.lang.Object[] r0 = new java.lang.Object[r5]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r3, r2, r0)
            L_0x0256:
                com.tencent.mm.network.b0 r0 = r1.f260046a
                if (r0 == 0) goto L_0x029f
                goto L_0x0138
            L_0x025c:
                r0 = move-exception
                r3 = r0
            L_0x025e:
                if (r5 == 0) goto L_0x026c
                r5.close()     // Catch:{ IOException -> 0x0264 }
                goto L_0x026c
            L_0x0264:
                r0 = move-exception
                r5 = r0
                r6 = 0
                java.lang.Object[] r0 = new java.lang.Object[r6]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r5, r2, r0)
            L_0x026c:
                if (r8 == 0) goto L_0x027a
                r8.close()     // Catch:{ IOException -> 0x0272 }
                goto L_0x027a
            L_0x0272:
                r0 = move-exception
                r5 = r0
                r6 = 0
                java.lang.Object[] r0 = new java.lang.Object[r6]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r5, r2, r0)
            L_0x027a:
                com.tencent.mm.network.b0 r0 = r1.f260046a
                if (r0 == 0) goto L_0x0283
                r0.disconnect()
                r1.f260046a = r4
            L_0x0283:
                throw r3
            L_0x0284:
                r0 = move-exception
                goto L_0x0288
            L_0x0286:
                r0 = move-exception
                r3 = 1
            L_0x0288:
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.String r5 = r0.getMessage()
                r6 = 0
                r3[r6] = r5
                java.lang.String r5 = "Exception in MMProtocalJni.pack(), [%s]"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r5, r3)
                java.lang.Object[] r3 = new java.lang.Object[r6]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r2, r3)
                goto L_0x029f
            L_0x029c:
                r2 = -1
                r1.f260047b = r2
            L_0x029f:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: tg3.C90482p.C90484b.doInBackground(java.lang.Object[]):java.lang.Object");
        }

        public void onCancelled() {
            Log.m105918d("MicroMsg.NetSceneGetUpdatePack", "task had been cancelled.");
            C81034b0 b0Var = this.f260046a;
            if (b0Var != null) {
                b0Var.disconnect();
            }
        }

        public void onPostExecute(Object obj) {
            C50935qa2 qa22 = (C50935qa2) obj;
            Log.m105918d("MicroMsg.NetSceneGetUpdatePack", "onPostExecute, netRet=" + this.f260047b + ", svrRet=" + this.f260048c.value + ", result=" + qa22);
            this.f260050e.mo124303d(this.f260047b, this.f260048c.value, qa22);
        }
    }

    public C90482p(int i, String str, int i2, int i3, byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr, boolean z) {
        super(i, str, i2, z);
        this.f260038i = strArr;
        if (strArr == null || strArr.length == 0) {
            this.f260038i = new String[]{WeChatHosts.domainString(C0966R.string.fmf)};
        }
        this.f260040k = i3;
        this.f260039j = bArr;
        this.f260041l = bArr2;
    }

    /* renamed from: a */
    public void mo124300a(C89963b.C89964a aVar) {
        this.f260042m = aVar;
        int i = this.f260036g + 1;
        this.f260036g = i;
        if (i > 1000) {
            Log.m105918d("MicroMsg.NetSceneGetUpdatePack", "doSceneCnt > DOSCENE_LIMIT, return");
            this.f260042m.mo124303d(-1, -1, (C49335eu3) null);
        } else if (!C88955f.m111059c((long) this.f249724b)) {
            Log.m105921e("MicroMsg.NetSceneGetUpdatePack", "SDCard full, packSize=[%s]", Integer.valueOf(this.f249724b));
            aVar.mo124303d(-1, -1, (C49335eu3) null);
        } else {
            C50804pa2 pa22 = new C50804pa2();
            C90417ia iaVar = new C90417ia();
            iaVar.f259573g = C89625d.f257841g;
            iaVar.f259575i = 0;
            iaVar.f259571e = this.f260040k;
            C89349b a = C89349b.m111674a(C87203t.m108273i().getBytes());
            iaVar.f259572f = a;
            if (a.f257327a.length >= 16) {
                a.mo123701d(16);
                iaVar.f259572f = a;
            }
            C89349b a2 = C89349b.m111674a(C87200o.f252868a.getBytes());
            iaVar.f259574h = a2;
            if (a2.f257327a.length >= 132) {
                a2.mo123701d(132);
                iaVar.f259574h = a2;
            }
            try {
                String str = new String("\u0000");
                C89349b bVar = new C89349b();
                bVar.f257327a = str.getBytes("UTF-8");
                iaVar.f259570d = bVar;
            } catch (Exception e) {
                Log.m105920e("MicroMsg.NetSceneGetUpdatePack", e.getLocalizedMessage());
            }
            pa22.setBaseRequest(iaVar);
            pa22.f139667d = this.f249723a;
            pa22.f139669f = this.f249725c;
            pa22.f139668e = this.f249724b;
            C90484b bVar2 = new C90484b(this.f260038i[this.f260037h / 5], this.f260044o);
            this.f260043n = bVar2;
            bVar2.execute(new C50804pa2[]{pa22});
        }
    }

    public void cancel() {
        Log.m105924i("MicroMsg.NetSceneGetUpdatePack", "do cancel, updateType = " + this.f249723a);
        C90484b bVar = this.f260043n;
        if (bVar != null && !bVar.isCancelled()) {
            this.f260043n.cancel(true);
        }
    }
}
