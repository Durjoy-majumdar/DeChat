package com.tencent.p014mm.plugin.scanner.model;

import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.scanner.api.ScanGoodsRequest;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.scanner.model.p0 */
public final class C106076p0 {

    /* renamed from: a */
    public static final C106076p0 f315823a = new C106076p0();

    /* renamed from: b */
    public static final HashMap<Long, C106075o0> f315824b = new HashMap<>();

    /* renamed from: c */
    public static final HashMap<Long, ScanGoodsRequest> f315825c = new HashMap<>();

    /* renamed from: d */
    public static final ConcurrentHashMap<String, Bitmap> f315826d = new ConcurrentHashMap<>();

    /* renamed from: e */
    public static final ConcurrentHashMap<String, Boolean> f315827e = new ConcurrentHashMap<>();

    /* renamed from: com.tencent.mm.plugin.scanner.model.p0$a */
    public static final class C106077a {

        /* renamed from: a */
        public final long f315828a;

        /* renamed from: b */
        public final ArrayList<C106079c> f315829b;

        /* renamed from: c */
        public int f315830c = -1;

        /* renamed from: d */
        public String f315831d = "";

        public C106077a(long j, ArrayList<C106079c> arrayList) {
            C87412m.m108594g(arrayList, "imageList");
            this.f315828a = j;
            this.f315829b = arrayList;
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.model.p0$b */
    public static final class C106078b implements Runnable {

        /* renamed from: d */
        public final C106079c f315832d;

        /* renamed from: e */
        public final C32227p<C106079c, Bitmap, C13598b0> f315833e;

        public C106078b(C106079c cVar, C32227p<? super C106079c, ? super Bitmap, C13598b0> pVar) {
            C87412m.m108594g(cVar, "info");
            C87412m.m108594g(pVar, "callback");
            this.f315832d = cVar;
            this.f315833e = pVar;
        }

        /* renamed from: a */
        public final void mo151635a(C106079c cVar, Bitmap bitmap) {
            cVar.f315836c = 2;
            if (bitmap != null && !bitmap.isRecycled()) {
                C106076p0.f315826d.put(cVar.f315834a, bitmap);
            }
            Log.m105919d("MicroMsg.ScanGoodsResourceManager", "alvinluo finishDecode image: %s, status: %d, result: %d", cVar.f315834a, Integer.valueOf(cVar.f315836c), Integer.valueOf(cVar.f315835b));
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x004d A[Catch:{ Exception -> 0x005c }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r12 = this;
                r0 = 1
                java.lang.Object[] r1 = new java.lang.Object[r0]
                com.tencent.mm.plugin.scanner.model.p0$c r2 = r12.f315832d
                java.lang.String r2 = r2.f315834a
                r3 = 0
                r1[r3] = r2
                java.lang.String r2 = "MicroMsg.ScanGoodsResourceManager"
                java.lang.String r4 = "alvinluo startDecode image: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r4, r1)
                com.tencent.mm.plugin.scanner.model.p0$c r1 = r12.f315832d
                r1.f315836c = r0
                fy3.p<com.tencent.mm.plugin.scanner.model.p0$c, android.graphics.Bitmap, rx3.b0> r4 = r12.f315833e
                java.lang.String r5 = r1.f315834a
                boolean r5 = com.tencent.p014mm.vfs.C86013q1.m106450k(r5)
                r6 = 2
                r7 = 0
                if (r5 != 0) goto L_0x0027
                r1.f315835b = r6
                r12.mo151635a(r1, r7)
                goto L_0x006c
            L_0x0027:
                r5 = 3
                java.lang.String r8 = r1.f315834a     // Catch:{ Exception -> 0x005f }
                android.graphics.Bitmap r8 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeFile(r8)     // Catch:{ Exception -> 0x005f }
                if (r8 == 0) goto L_0x0039
                boolean r9 = r8.isRecycled()     // Catch:{ Exception -> 0x005c }
                if (r9 != 0) goto L_0x0039
                r1.f315835b = r3     // Catch:{ Exception -> 0x005c }
                goto L_0x003b
            L_0x0039:
                r1.f315835b = r5     // Catch:{ Exception -> 0x005c }
            L_0x003b:
                java.lang.String r9 = "alvinluo decodeImage filePath: %s, decode result: %d, bitmap: %s"
                java.lang.Object[] r10 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x005c }
                java.lang.String r11 = r1.f315834a     // Catch:{ Exception -> 0x005c }
                r10[r3] = r11     // Catch:{ Exception -> 0x005c }
                int r11 = r1.f315835b     // Catch:{ Exception -> 0x005c }
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x005c }
                r10[r0] = r11     // Catch:{ Exception -> 0x005c }
                if (r8 == 0) goto L_0x0055
                int r0 = r8.getAllocationByteCount()     // Catch:{ Exception -> 0x005c }
                java.lang.Integer r7 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x005c }
            L_0x0055:
                r10[r6] = r7     // Catch:{ Exception -> 0x005c }
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r9, r10)     // Catch:{ Exception -> 0x005c }
                r7 = r8
                goto L_0x0069
            L_0x005c:
                r0 = move-exception
                r7 = r8
                goto L_0x0060
            L_0x005f:
                r0 = move-exception
            L_0x0060:
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.String r6 = "alvinluo decodeImage exception"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r6, r3)
                r1.f315835b = r5
            L_0x0069:
                r12.mo151635a(r1, r7)
            L_0x006c:
                r4.invoke(r1, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.scanner.model.C106076p0.C106078b.run():void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.model.p0$c */
    public static final class C106079c {

        /* renamed from: a */
        public final String f315834a;

        /* renamed from: b */
        public int f315835b = -1;

        /* renamed from: c */
        public int f315836c;

        public C106079c(String str) {
            C87412m.m108594g(str, "imagePath");
            this.f315834a = str;
        }
    }

    /* renamed from: a */
    public final String mo151632a(ScanGoodsRequest scanGoodsRequest) {
        String format = String.format("deco:%s,succ:%s,tips:%s", Arrays.copyOf(new Object[]{scanGoodsRequest.f248905p, scanGoodsRequest.f248906q, scanGoodsRequest.f248907r}, 3));
        C87412m.m108593f(format, "format(format, *args)");
        return format;
    }

    /* renamed from: b */
    public final Bitmap mo151633b(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return f315826d.get(str);
    }

    /* renamed from: c */
    public final void mo151634c(String str) {
        ConcurrentHashMap<String, Bitmap> concurrentHashMap = f315826d;
        Bitmap bitmap = concurrentHashMap.get(str);
        if (bitmap != null) {
            bitmap.recycle();
        }
        concurrentHashMap.remove(str);
    }
}
