package com.tencent.p014mm.plugin.fts;

import android.graphics.Bitmap;
import android.os.Looper;
import android.widget.ImageView;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import ov1.C100558d;
import p206nj.C11171e;
import p823sg.C90193h;

/* renamed from: com.tencent.mm.plugin.fts.e */
public class C93829e implements C100558d {

    /* renamed from: k */
    public static int f270798k = 32;

    /* renamed from: a */
    public ConcurrentHashMap<String, C93830a> f270799a;

    /* renamed from: b */
    public Vector<String> f270800b;

    /* renamed from: c */
    public boolean f270801c = true;

    /* renamed from: d */
    public int f270802d;

    /* renamed from: e */
    public MMHandler f270803e;

    /* renamed from: f */
    public MMHandler[] f270804f;

    /* renamed from: g */
    public ConcurrentHashMap<Long, ByteArrayOutputStream> f270805g;

    /* renamed from: h */
    public ConcurrentHashMap<Long, byte[]> f270806h;

    /* renamed from: i */
    public MMHandler f270807i;

    /* renamed from: j */
    public Set<String> f270808j;

    /* renamed from: com.tencent.mm.plugin.fts.e$a */
    public class C93830a {

        /* renamed from: a */
        public String f270809a;

        /* renamed from: b */
        public Bitmap f270810b;

        public C93830a(C93829e eVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.e$b */
    public class C93831b implements Runnable {

        /* renamed from: d */
        public String f270811d;

        /* renamed from: e */
        public String f270812e;

        /* renamed from: f */
        public boolean f270813f;

        /* renamed from: g */
        public int f270814g;

        /* renamed from: h */
        public int f270815h;

        /* renamed from: i */
        public C93832c f270816i;

        /* renamed from: j */
        public String f270817j;

        public C93831b(String str, String str2, String str3, boolean z, int i, int i2, C93832c cVar) {
            this.f270817j = str;
            this.f270811d = str2;
            this.f270812e = str3;
            this.f270816i = cVar;
            this.f270813f = z;
            this.f270814g = i;
            this.f270815h = i2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:72:0x01d8 A[SYNTHETIC, Splitter:B:72:0x01d8] */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x0207  */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x021a  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x0227 A[SYNTHETIC, Splitter:B:83:0x0227] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r18 = this;
                r1 = r18
                java.lang.String r0 = "MicroMsg.FTS.FTSImageLoader"
                java.lang.String r2 = "Start to run load bitmap job %s"
                r3 = 1
                java.lang.Object[] r4 = new java.lang.Object[r3]
                java.lang.String r5 = r1.f270817j
                r6 = 0
                r4[r6] = r5
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r2, r4)
                java.lang.String r0 = r1.f270812e
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r0 == 0) goto L_0x0034
                com.tencent.mm.plugin.fts.e r0 = com.tencent.p014mm.plugin.fts.C93829e.this
                java.lang.String r2 = r1.f270817j
                r0.getClass()
                com.tencent.mm.vfs.m1 r0 = new com.tencent.mm.vfs.m1
                java.lang.String r4 = f12.C7970a.m8127a()
                r0.<init>((java.lang.String) r4)
                com.tencent.mm.vfs.m1 r4 = new com.tencent.mm.vfs.m1
                r4.<init>((com.tencent.p014mm.vfs.C86009m1) r0, (java.lang.String) r2)
                java.lang.String r0 = r4.mo119971i()
                r1.f270812e = r0
            L_0x0034:
                long r4 = java.lang.System.currentTimeMillis()
                com.tencent.mm.plugin.fts.e r0 = com.tencent.p014mm.plugin.fts.C93829e.this
                java.lang.String r2 = r1.f270812e
                int r7 = r1.f270814g
                int r8 = r1.f270815h
                r0.getClass()
                java.lang.Class<xs.b> r0 = p755xs.C102720b.class
                boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
                if (r9 == 0) goto L_0x004c
                goto L_0x0071
            L_0x004c:
                com.tencent.mm.vfs.m1 r9 = new com.tencent.mm.vfs.m1
                r9.<init>((java.lang.String) r2)
                boolean r9 = r9.mo119967g()
                if (r9 == 0) goto L_0x0071
                if (r7 <= 0) goto L_0x0066
                if (r8 <= 0) goto L_0x0066
                di3.d r0 = di3.C86312j.m106911c(r0)
                xs.b r0 = (p755xs.C102720b) r0
                android.graphics.Bitmap r0 = r0.mo142102J7(r2, r7, r8)
                goto L_0x0072
            L_0x0066:
                di3.d r0 = di3.C86312j.m106911c(r0)
                xs.b r0 = (p755xs.C102720b) r0
                android.graphics.Bitmap r0 = r0.mo142105Ou(r2)
                goto L_0x0072
            L_0x0071:
                r0 = 0
            L_0x0072:
                long r7 = java.lang.System.currentTimeMillis()
                r2 = 3
                r9 = 2
                if (r0 == 0) goto L_0x00a6
                java.lang.String r10 = "MicroMsg.FTS.FTSImageLoader"
                java.lang.String r11 = "Found image in local %s | localPath %s | use time %d"
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.String r12 = r1.f270811d
                r2[r6] = r12
                java.lang.String r6 = r1.f270812e
                r2[r3] = r6
                long r7 = r7 - r4
                java.lang.Long r4 = java.lang.Long.valueOf(r7)
                r2[r9] = r4
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r11, r2)
                com.tencent.mm.plugin.fts.e r2 = com.tencent.p014mm.plugin.fts.C93829e.this
                java.lang.String r4 = r1.f270817j
                java.lang.String r5 = r1.f270812e
                com.tencent.p014mm.plugin.fts.C93829e.m118497a(r2, r4, r5, r0)
                com.tencent.mm.plugin.fts.e$c r0 = r1.f270816i
                java.lang.String r2 = r1.f270817j
                com.tencent.mm.plugin.fts.d r0 = (com.tencent.p014mm.plugin.fts.C93827d) r0
                r0.mo128772a(r1, r2, r3)
                goto L_0x0223
            L_0x00a6:
                com.tencent.mm.plugin.fts.e r4 = com.tencent.p014mm.plugin.fts.C93829e.this
                java.lang.String r5 = r1.f270811d
                boolean r0 = r1.f270813f
                int r11 = r1.f270814g
                int r12 = r1.f270815h
                r4.getClass()
                boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
                if (r13 == 0) goto L_0x00bb
                goto L_0x01e7
            L_0x00bb:
                java.util.concurrent.ConcurrentHashMap<java.lang.Long, java.io.ByteArrayOutputStream> r13 = r4.f270805g
                java.lang.Thread r14 = java.lang.Thread.currentThread()
                long r14 = r14.getId()
                java.lang.Long r14 = java.lang.Long.valueOf(r14)
                java.lang.Object r13 = r13.get(r14)
                java.io.ByteArrayOutputStream r13 = (java.io.ByteArrayOutputStream) r13
                if (r13 != 0) goto L_0x00ea
                java.io.ByteArrayOutputStream r13 = new java.io.ByteArrayOutputStream
                r14 = 32768(0x8000, float:4.5918E-41)
                r13.<init>(r14)
                java.util.concurrent.ConcurrentHashMap<java.lang.Long, java.io.ByteArrayOutputStream> r14 = r4.f270805g
                java.lang.Thread r15 = java.lang.Thread.currentThread()
                long r15 = r15.getId()
                java.lang.Long r15 = java.lang.Long.valueOf(r15)
                r14.put(r15, r13)
            L_0x00ea:
                r13.reset()
                monitor-enter(r4)
                java.util.concurrent.ConcurrentHashMap<java.lang.Long, byte[]> r14 = r4.f270806h     // Catch:{ all -> 0x0237 }
                java.lang.Thread r15 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0237 }
                long r15 = r15.getId()     // Catch:{ all -> 0x0237 }
                java.lang.Long r15 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x0237 }
                java.lang.Object r14 = r14.get(r15)     // Catch:{ all -> 0x0237 }
                byte[] r14 = (byte[]) r14     // Catch:{ all -> 0x0237 }
                if (r14 != 0) goto L_0x0119
                r14 = 1024(0x400, float:1.435E-42)
                byte[] r14 = new byte[r14]     // Catch:{ all -> 0x0237 }
                java.util.concurrent.ConcurrentHashMap<java.lang.Long, byte[]> r15 = r4.f270806h     // Catch:{ all -> 0x0237 }
                java.lang.Thread r16 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0237 }
                long r16 = r16.getId()     // Catch:{ all -> 0x0237 }
                java.lang.Long r10 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x0237 }
                r15.put(r10, r14)     // Catch:{ all -> 0x0237 }
            L_0x0119:
                monitor-exit(r4)
                r4 = 10000(0x2710, float:1.4013E-41)
                r10 = 20000(0x4e20, float:2.8026E-41)
                java.io.InputStream r4 = com.tencent.p014mm.network.C81035d.m98961b(r5, r4, r10)     // Catch:{ Exception -> 0x01c0, all -> 0x01bc }
                if (r4 != 0) goto L_0x014a
                java.lang.String r0 = "MicroMsg.FTS.FTSImageLoader"
                java.lang.String r10 = "download %s error, can not open http stream"
                java.lang.Object[] r11 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0147 }
                r11[r6] = r5     // Catch:{ Exception -> 0x0147 }
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r0, r10, r11)     // Catch:{ Exception -> 0x0147 }
                if (r4 == 0) goto L_0x01e7
                r4.close()     // Catch:{ IOException -> 0x0136 }
                goto L_0x01e7
            L_0x0136:
                r0 = move-exception
                r4 = r0
                java.lang.String r0 = "MicroMsg.FTS.FTSImageLoader"
                java.lang.String r5 = ""
                java.lang.Object[] r10 = new java.lang.Object[r6]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r4, r5, r10)
                goto L_0x01e7
            L_0x0143:
                r0 = move-exception
                r10 = r4
                goto L_0x0224
            L_0x0147:
                r0 = move-exception
                goto L_0x01c2
            L_0x014a:
                r10 = 0
            L_0x014b:
                int r15 = r4.read(r14)     // Catch:{ Exception -> 0x0147 }
                r2 = -1
                if (r15 == r2) goto L_0x0158
                int r10 = r10 + r15
                r13.write(r14, r6, r15)     // Catch:{ Exception -> 0x0147 }
                r2 = 3
                goto L_0x014b
            L_0x0158:
                byte[] r2 = r13.toByteArray()     // Catch:{ Exception -> 0x0147 }
                if (r11 <= 0) goto L_0x0165
                if (r12 <= 0) goto L_0x0165
                android.graphics.Bitmap r2 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeByteArray(r2, r11, r12)     // Catch:{ Exception -> 0x0147 }
                goto L_0x0169
            L_0x0165:
                android.graphics.Bitmap r2 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeByteArray(r2)     // Catch:{ Exception -> 0x0147 }
            L_0x0169:
                java.lang.String r11 = "MicroMsg.FTS.FTSImageLoader"
                java.lang.String r12 = "get url[%s] ok, bufSize[%d], bitmap size %d * %d"
                r13 = 4
                java.lang.Object[] r13 = new java.lang.Object[r13]     // Catch:{ Exception -> 0x0147 }
                r13[r6] = r5     // Catch:{ Exception -> 0x0147 }
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x0147 }
                r13[r3] = r10     // Catch:{ Exception -> 0x0147 }
                int r10 = r2.getWidth()     // Catch:{ Exception -> 0x0147 }
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x0147 }
                r13[r9] = r10     // Catch:{ Exception -> 0x0147 }
                int r10 = r2.getHeight()     // Catch:{ Exception -> 0x0147 }
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x0147 }
                r14 = 3
                r13[r14] = r10     // Catch:{ Exception -> 0x0147 }
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r11, r12, r13)     // Catch:{ Exception -> 0x0147 }
                if (r0 == 0) goto L_0x01ab
                int r0 = r2.getWidth()     // Catch:{ Exception -> 0x0147 }
                float r0 = (float) r0     // Catch:{ Exception -> 0x0147 }
                android.graphics.Bitmap r10 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getRoundedCornerBitmap(r2, r3, r0)     // Catch:{ Exception -> 0x0147 }
                r4.close()     // Catch:{ IOException -> 0x019f }
                goto L_0x01e8
            L_0x019f:
                r0 = move-exception
                r2 = r0
                java.lang.String r0 = "MicroMsg.FTS.FTSImageLoader"
                java.lang.String r4 = ""
                java.lang.Object[] r5 = new java.lang.Object[r6]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r2, r4, r5)
                goto L_0x01e8
            L_0x01ab:
                r4.close()     // Catch:{ IOException -> 0x01af }
                goto L_0x01ba
            L_0x01af:
                r0 = move-exception
                r4 = r0
                java.lang.String r0 = "MicroMsg.FTS.FTSImageLoader"
                java.lang.String r5 = ""
                java.lang.Object[] r10 = new java.lang.Object[r6]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r4, r5, r10)
            L_0x01ba:
                r10 = r2
                goto L_0x01e8
            L_0x01bc:
                r0 = move-exception
                r2 = r0
                r10 = 0
                goto L_0x0225
            L_0x01c0:
                r0 = move-exception
                r4 = 0
            L_0x01c2:
                java.lang.String r2 = "MicroMsg.FTS.FTSImageLoader"
                java.lang.String r10 = ""
                java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ all -> 0x0143 }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r10, r11)     // Catch:{ all -> 0x0143 }
                java.lang.String r0 = "MicroMsg.FTS.FTSImageLoader"
                java.lang.String r2 = "get url:%s failed."
                java.lang.Object[] r10 = new java.lang.Object[r3]     // Catch:{ all -> 0x0143 }
                r10[r6] = r5     // Catch:{ all -> 0x0143 }
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r0, r2, r10)     // Catch:{ all -> 0x0143 }
                if (r4 == 0) goto L_0x01e7
                r4.close()     // Catch:{ IOException -> 0x01dc }
                goto L_0x01e7
            L_0x01dc:
                r0 = move-exception
                r2 = r0
                java.lang.String r0 = "MicroMsg.FTS.FTSImageLoader"
                java.lang.String r4 = ""
                java.lang.Object[] r5 = new java.lang.Object[r6]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r2, r4, r5)
            L_0x01e7:
                r10 = 0
            L_0x01e8:
                long r4 = java.lang.System.currentTimeMillis()
                java.lang.String r0 = "MicroMsg.FTS.FTSImageLoader"
                java.lang.String r2 = "Get image from net %s | localPath %s | use time %d"
                r11 = 3
                java.lang.Object[] r11 = new java.lang.Object[r11]
                java.lang.String r12 = r1.f270811d
                r11[r6] = r12
                java.lang.String r12 = r1.f270812e
                r11[r3] = r12
                long r4 = r4 - r7
                java.lang.Long r4 = java.lang.Long.valueOf(r4)
                r11[r9] = r4
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r2, r11)
                if (r10 == 0) goto L_0x021a
                com.tencent.mm.plugin.fts.e r0 = com.tencent.p014mm.plugin.fts.C93829e.this
                java.lang.String r2 = r1.f270817j
                java.lang.String r4 = r1.f270812e
                com.tencent.p014mm.plugin.fts.C93829e.m118497a(r0, r2, r4, r10)
                com.tencent.mm.plugin.fts.e$c r0 = r1.f270816i
                java.lang.String r2 = r1.f270817j
                com.tencent.mm.plugin.fts.d r0 = (com.tencent.p014mm.plugin.fts.C93827d) r0
                r0.mo128772a(r1, r2, r3)
                goto L_0x0223
            L_0x021a:
                com.tencent.mm.plugin.fts.e$c r0 = r1.f270816i
                java.lang.String r2 = r1.f270817j
                com.tencent.mm.plugin.fts.d r0 = (com.tencent.p014mm.plugin.fts.C93827d) r0
                r0.mo128772a(r1, r2, r6)
            L_0x0223:
                return
            L_0x0224:
                r2 = r0
            L_0x0225:
                if (r10 == 0) goto L_0x0236
                r10.close()     // Catch:{ IOException -> 0x022b }
                goto L_0x0236
            L_0x022b:
                r0 = move-exception
                r3 = r0
                java.lang.String r0 = "MicroMsg.FTS.FTSImageLoader"
                java.lang.String r4 = ""
                java.lang.Object[] r5 = new java.lang.Object[r6]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r3, r4, r5)
            L_0x0236:
                throw r2
            L_0x0237:
                r0 = move-exception
                monitor-exit(r4)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.fts.C93829e.C93831b.run():void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.e$c */
    public interface C93832c {
    }

    /* renamed from: com.tencent.mm.plugin.fts.e$d */
    public class C93833d implements Runnable {

        /* renamed from: d */
        public C93830a f270819d;

        public C93833d(C93829e eVar, C93830a aVar) {
            this.f270819d = aVar;
        }

        public void run() {
            Log.m105918d("MicroMsg.FTS.FTSImageLoader", "Start to run save bitmap job");
            try {
                if (!new C86009m1(this.f270819d.f270809a).mo119967g()) {
                    Bitmap bitmap = this.f270819d.f270810b;
                    if (bitmap == null || bitmap.isRecycled()) {
                        Log.m105918d("MicroMsg.FTS.FTSImageLoader", "Save Bitmap is Recycled");
                        return;
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    C93830a aVar = this.f270819d;
                    BitmapUtil.saveBitmapToImage(aVar.f270810b, 100, Bitmap.CompressFormat.PNG, aVar.f270809a, false);
                    Log.m105919d("MicroMsg.FTS.FTSImageLoader", "Save bitmap use time: %d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                }
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.FTS.FTSImageLoader", e, "", new Object[0]);
            }
        }
    }

    public C93829e() {
        this.f270802d = 0;
        this.f270803e = new MMHandler(Looper.getMainLooper());
        this.f270804f = new MMHandler[2];
        this.f270805g = null;
        this.f270806h = null;
        this.f270807i = null;
        Log.m105924i("MicroMsg.FTS.FTSImageLoader", "create SearchImageLoader");
        if (C11171e.m11046c(19)) {
            f270798k = 64;
        } else {
            f270798k = 32;
        }
        this.f270799a = new ConcurrentHashMap<>();
        this.f270800b = new Vector<>();
        this.f270805g = new ConcurrentHashMap<>();
        this.f270806h = new ConcurrentHashMap<>();
        this.f270808j = Collections.synchronizedSet(new HashSet());
        for (int i = 0; i < 2; i++) {
            MMHandler[] mMHandlerArr = this.f270804f;
            if (mMHandlerArr[i] == null) {
                mMHandlerArr[i] = new MMHandler("SearchImageLoader_loadImage_handler");
            }
        }
        this.f270807i = new MMHandler("SearchImageLoader_saveImage_handler");
    }

    /* renamed from: a */
    public static void m118497a(C93829e eVar, String str, String str2, Bitmap bitmap) {
        if (eVar.f270799a.size() > f270798k) {
            eVar.mo128778f(eVar.f270800b.lastElement());
        }
        C93830a aVar = new C93830a(eVar);
        aVar.f270809a = str2;
        aVar.f270810b = bitmap;
        eVar.f270799a.put(str, aVar);
        if (!new C86009m1(aVar.f270809a).mo119967g()) {
            eVar.f270807i.postDelayed(new C93833d(eVar, aVar), 200);
        }
    }

    /* renamed from: b */
    public void mo128774b() {
        Log.m105919d("MicroMsg.FTS.FTSImageLoader", "clearCacheAndTask %s", Integer.valueOf(this.f270799a.size()));
        mo128781i();
        for (Map.Entry<String, C93830a> key : this.f270799a.entrySet()) {
            mo128778f((String) key.getKey());
        }
        this.f270800b.clear();
        this.f270808j.clear();
    }

    /* renamed from: c */
    public void mo128775c() {
        mo128774b();
        Log.m105918d("MicroMsg.FTS.FTSImageLoader", "destoryLoader");
        for (int i = 0; i < 2; i++) {
            MMHandler mMHandler = this.f270804f[i];
            if (mMHandler != null) {
                mMHandler.quit();
            }
        }
        for (ByteArrayOutputStream close : this.f270805g.values()) {
            try {
                close.close();
            } catch (IOException unused) {
            }
        }
        this.f270805g.clear();
        this.f270806h.clear();
        this.f270807i.quit();
    }

    /* renamed from: d */
    public String mo128776d(String str, String str2, boolean z, int i, int i2) {
        String str3 = Util.nullAs(str, "null") + Util.nullAs(str2, "null") + z + i + "_" + i2;
        return "fts_search_" + C90193h.m112878f(str3.getBytes());
    }

    /* renamed from: e */
    public final Bitmap mo128777e(String str) {
        Bitmap bitmap;
        C93830a aVar = this.f270799a.get(str);
        if (!(aVar == null || (bitmap = aVar.f270810b) == null || bitmap.isRecycled())) {
            this.f270800b.remove(str);
            this.f270800b.add(0, str);
        }
        if (aVar == null) {
            return null;
        }
        return aVar.f270810b;
    }

    /* renamed from: f */
    public final void mo128778f(String str) {
        Bitmap bitmap;
        C93830a aVar = this.f270799a.get(str);
        this.f270800b.remove(str);
        this.f270799a.remove(str);
        if (aVar != null && (bitmap = aVar.f270810b) != null) {
            if (!bitmap.isRecycled()) {
                Log.m105925i("MicroMsg.FTS.FTSImageLoader", "bitmap recycle %s", aVar.f270810b);
                aVar.f270810b.recycle();
            }
            aVar.f270810b = null;
        }
    }

    /* renamed from: g */
    public void mo128779g() {
        Log.m105918d("MicroMsg.FTS.FTSImageLoader", "startLoadImage");
        this.f270801c = true;
    }

    /* renamed from: h */
    public void mo128780h() {
        Log.m105918d("MicroMsg.FTS.FTSImageLoader", "stopLoadImage");
        this.f270801c = false;
        mo128781i();
    }

    /* renamed from: i */
    public void mo128781i() {
        Log.m105918d("MicroMsg.FTS.FTSImageLoader", "stopLoadImageTask");
        for (int i = 0; i < 2; i++) {
            MMHandler mMHandler = this.f270804f[i];
            if (mMHandler != null) {
                mMHandler.removeCallbacksAndMessages((Object) null);
            }
        }
    }

    /* renamed from: j */
    public String mo128782j(ImageView imageView, String str, String str2, boolean z, int i, int i2) {
        String d = mo128776d(str, str2, z, i, i2);
        imageView.setTag(d);
        Log.m105919d("MicroMsg.FTS.FTSImageLoader", "update image view cache key: hashcode=%d | cacheKey=%s", Integer.valueOf(imageView.hashCode()), d);
        return d;
    }
}
