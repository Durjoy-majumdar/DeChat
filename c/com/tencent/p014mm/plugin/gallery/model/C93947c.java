package com.tencent.p014mm.plugin.gallery.model;

import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.gallery.model.C93951d;
import com.tencent.p014mm.plugin.gallery.model.C93974o;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.QueueWorkerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import hw1.C98551l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import qw1.C101316l;
import zt3.C119143b;

/* renamed from: com.tencent.mm.plugin.gallery.model.c */
public final class C93947c {

    /* renamed from: a */
    public C93951d f271113a = new C93951d();

    /* renamed from: b */
    public int f271114b = C93963i.f271176k;

    /* renamed from: c */
    public C98551l<String> f271115c = new C98551l<>();

    /* renamed from: d */
    public HashMap<String, C93950c> f271116d = new HashMap<>();

    /* renamed from: e */
    public int f271117e = (C93963i.f271176k / 2);

    /* renamed from: f */
    public C98551l<C93949b> f271118f = new C98551l<>();

    /* renamed from: g */
    public C98551l<C93949b> f271119g = new C98551l<>();

    /* renamed from: com.tencent.mm.plugin.gallery.model.c$a */
    public abstract class C93948a implements QueueWorkerThread.ThreadObject {
        public C93948a(C93947c cVar) {
        }

        public boolean onPostExecute() {
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.model.c$b */
    public class C93949b extends C93948a {

        /* renamed from: d */
        public String f271120d;

        /* renamed from: e */
        public int f271121e;

        /* renamed from: f */
        public String f271122f;

        /* renamed from: g */
        public long f271123g;

        /* renamed from: h */
        public int f271124h;

        /* renamed from: i */
        public volatile boolean f271125i;

        /* renamed from: j */
        public Bitmap f271126j;

        /* renamed from: n */
        public long f271127n;

        public C93949b(String str, int i, String str2, long j, int i2, long j2) {
            super(C93947c.this);
            this.f271120d = str;
            this.f271121e = i;
            this.f271122f = str2;
            this.f271123g = j;
            this.f271124h = i2;
            this.f271127n = j2;
        }

        public boolean doInBackground() {
            Log.m105918d("MicroMsg.PreDecodeFile", "start doInBackground.");
            if (this.f271125i) {
                return false;
            }
            Bitmap b = C93947c.this.f271113a.mo128884b(this.f271120d, this.f271122f, this.f271123g, (C93974o.C93980f) null, this.f271127n);
            this.f271126j = b;
            if (b != null && !b.isRecycled()) {
                Log.m105919d("MicroMsg.PreDecodeFile", "get bmp from disk cache ok, filePath[%s].", this.f271120d);
                return true;
            } else if (this.f271125i) {
                return false;
            } else {
                Bitmap d = C93969m.m118774d(this.f271123g, this.f271121e, this.f271120d, this.f271122f, 12288);
                this.f271126j = d;
                if (d == null || d.isRecycled()) {
                    return false;
                }
                Log.m105919d("MicroMsg.PreDecodeFile", "get bmp from file ok, filePath[%s].", this.f271120d);
                C93947c.this.f271113a.mo128885c(this.f271120d, this.f271122f, this.f271123g, this.f271126j, (C93974o.C93980f) null, this.f271127n);
                return true;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.model.c$c */
    public class C93950c extends C93948a {

        /* renamed from: d */
        public String f271129d;

        /* renamed from: e */
        public int f271130e;

        /* renamed from: f */
        public String f271131f;

        /* renamed from: g */
        public long f271132g;

        /* renamed from: h */
        public int f271133h = 12288;

        /* renamed from: i */
        public C93974o.C93980f f271134i;

        /* renamed from: j */
        public int f271135j;

        /* renamed from: n */
        public long f271136n;

        /* renamed from: o */
        public String f271137o;

        /* renamed from: p */
        public volatile boolean f271138p;

        /* renamed from: q */
        public Bitmap f271139q;

        public C93950c(String str, int i, String str2, long j, C93974o.C93980f fVar, int i2, long j2) {
            super(C93947c.this);
            this.f271129d = str;
            this.f271130e = i;
            this.f271131f = str2;
            this.f271132g = j;
            this.f271134i = fVar;
            this.f271135j = i2;
            this.f271136n = j2;
            this.f271137o = C101316l.m132905d(str, fVar, i2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:37:0x0102 A[SYNTHETIC, Splitter:B:37:0x0102] */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x011b A[SYNTHETIC, Splitter:B:47:0x011b] */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x0166  */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x0183  */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x0196  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean doInBackground() {
            /*
                r18 = this;
                r1 = r18
                r0 = 3
                java.lang.Object[] r2 = new java.lang.Object[r0]
                java.lang.String r3 = r1.f271137o
                r4 = 0
                r2[r4] = r3
                java.lang.String r3 = r1.f271129d
                r5 = 1
                r2[r5] = r3
                boolean r3 = r1.f271138p
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
                r6 = 2
                r2[r6] = r3
                java.lang.String r3 = "MicroMsg.CacheService"
                java.lang.String r7 = "task execute, mDecodeTaskKey: %s, filePath: %s, isCancel: %s."
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r7, r2)
                boolean r2 = r1.f271138p
                if (r2 == 0) goto L_0x0025
                return r4
            L_0x0025:
                com.tencent.mm.plugin.gallery.model.c r2 = com.tencent.p014mm.plugin.gallery.model.C93947c.this
                com.tencent.mm.plugin.gallery.model.d r7 = r2.f271113a
                java.lang.String r8 = r1.f271129d
                java.lang.String r9 = r1.f271131f
                long r10 = r1.f271132g
                com.tencent.mm.plugin.gallery.model.o$f r12 = r1.f271134i
                long r13 = r1.f271136n
                android.graphics.Bitmap r2 = r7.mo128884b(r8, r9, r10, r12, r13)
                r1.f271139q = r2
                if (r2 == 0) goto L_0x0051
                boolean r2 = r2.isRecycled()
                if (r2 != 0) goto L_0x0051
                java.lang.Object[] r0 = new java.lang.Object[r6]
                java.lang.String r2 = r1.f271137o
                r0[r4] = r2
                java.lang.String r2 = r1.f271129d
                r0[r5] = r2
                java.lang.String r2 = "get bmp from disk cache ok, mDecodeTaskKey[%s] filePath[%s]."
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r2, r0)
                return r5
            L_0x0051:
                boolean r2 = r1.f271138p
                if (r2 == 0) goto L_0x0056
                return r4
            L_0x0056:
                com.tencent.mm.plugin.gallery.model.o$f r2 = r1.f271134i
                if (r2 == 0) goto L_0x01a8
                java.lang.String r7 = r1.f271129d
                int r8 = com.tencent.p014mm.plugin.gallery.model.C93969m.f271188a
                boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
                java.lang.String r9 = "MicroMsg.MediaManager"
                r10 = 0
                if (r8 != 0) goto L_0x016e
                if (r2 == 0) goto L_0x016e
                int r8 = r2.f271224a
                if (r8 != 0) goto L_0x006f
                goto L_0x016e
            L_0x006f:
                r8 = 5
                java.lang.Object[] r8 = new java.lang.Object[r8]
                r8[r4] = r7
                double r11 = r2.f271225b
                java.lang.Double r11 = java.lang.Double.valueOf(r11)
                r8[r5] = r11
                double r11 = r2.f271226c
                java.lang.Double r11 = java.lang.Double.valueOf(r11)
                r8[r6] = r11
                double r11 = r2.f271227d
                java.lang.Double r11 = java.lang.Double.valueOf(r11)
                r8[r0] = r11
                r0 = 4
                double r11 = r2.f271228e
                java.lang.Double r11 = java.lang.Double.valueOf(r11)
                r8[r0] = r11
                java.lang.String r0 = "getPortraitBitmap, filePath: %s, cropArea: %f, %f, %f, %f."
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r0, r8)
                android.graphics.Rect r8 = new android.graphics.Rect
                r8.<init>()
                int r0 = r2.f271224a
                r11 = 4602678819172646912(0x3fe0000000000000, double:0.5)
                if (r0 == r5) goto L_0x00be
                if (r0 == r6) goto L_0x00a8
                goto L_0x00bb
            L_0x00a8:
                double r13 = r2.f271225b
                double r13 = r13 + r11
                int r0 = (int) r13
                double r13 = r2.f271226c
                double r13 = r13 + r11
                int r13 = (int) r13
                double r14 = r2.f271227d
                double r14 = r14 + r11
                int r14 = (int) r14
                double r5 = r2.f271228e
                double r5 = r5 + r11
                int r2 = (int) r5
                r8.set(r0, r13, r14, r2)
            L_0x00bb:
                r17 = r7
                goto L_0x00e9
            L_0x00be:
                android.graphics.BitmapFactory$Options r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getImageOptions(r7)     // Catch:{ Exception -> 0x00ed }
                double r5 = r2.f271225b     // Catch:{ Exception -> 0x00ed }
                int r13 = r0.outWidth     // Catch:{ Exception -> 0x00ed }
                double r13 = (double) r13     // Catch:{ Exception -> 0x00ed }
                double r5 = r5 * r13
                double r5 = r5 + r11
                int r5 = (int) r5     // Catch:{ Exception -> 0x00ed }
                r16 = r5
                double r4 = r2.f271226c     // Catch:{ Exception -> 0x00ed }
                int r0 = r0.outHeight     // Catch:{ Exception -> 0x00ed }
                r17 = r7
                double r6 = (double) r0
                double r4 = r4 * r6
                double r4 = r4 + r11
                int r0 = (int) r4
                double r4 = r2.f271227d     // Catch:{ Exception -> 0x00eb }
                double r4 = r4 * r13
                double r4 = r4 + r11
                int r4 = (int) r4     // Catch:{ Exception -> 0x00eb }
                double r13 = r2.f271228e     // Catch:{ Exception -> 0x00eb }
                double r13 = r13 * r6
                double r13 = r13 + r11
                int r2 = (int) r13     // Catch:{ Exception -> 0x00eb }
                r5 = r16
                r8.set(r5, r0, r4, r2)     // Catch:{ Exception -> 0x00eb }
            L_0x00e9:
                r2 = 0
                goto L_0x00f8
            L_0x00eb:
                r0 = move-exception
                goto L_0x00f0
            L_0x00ed:
                r0 = move-exception
                r17 = r7
            L_0x00f0:
                r2 = 0
                java.lang.Object[] r4 = new java.lang.Object[r2]
                java.lang.String r5 = "getPortraitBitmap, trans crop rel error."
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r9, r0, r5, r4)
            L_0x00f8:
                java.io.InputStream r0 = com.tencent.p014mm.vfs.C86013q1.m106423E(r17)     // Catch:{ Exception -> 0x0110 }
                android.graphics.BitmapRegionDecoder r0 = android.graphics.BitmapRegionDecoder.newInstance(r0, r2)     // Catch:{ Exception -> 0x0110 }
                if (r0 == 0) goto L_0x0118
                boolean r2 = r0.isRecycled()     // Catch:{ Exception -> 0x010d }
                if (r2 != 0) goto L_0x0118
                android.graphics.Bitmap r0 = r0.decodeRegion(r8, r10)     // Catch:{ Exception -> 0x010d }
                goto L_0x0119
            L_0x010d:
                r0 = move-exception
                r2 = 0
                goto L_0x0111
            L_0x0110:
                r0 = move-exception
            L_0x0111:
                java.lang.Object[] r4 = new java.lang.Object[r2]
                java.lang.String r2 = "getPortraitBitmap fail."
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r9, r0, r2, r4)
            L_0x0118:
                r0 = r10
            L_0x0119:
                if (r0 == 0) goto L_0x0166
                int r2 = r0.getWidth()     // Catch:{ OutOfMemoryError -> 0x015c }
                int r4 = r0.getHeight()     // Catch:{ OutOfMemoryError -> 0x015c }
                if (r2 < r4) goto L_0x013f
                int r2 = r0.getWidth()     // Catch:{ OutOfMemoryError -> 0x015c }
                r4 = 2
                int r2 = r2 / r4
                int r5 = r0.getHeight()     // Catch:{ OutOfMemoryError -> 0x015c }
                int r5 = r5 / r4
                int r2 = r2 - r5
                int r4 = r0.getHeight()     // Catch:{ OutOfMemoryError -> 0x015c }
                int r5 = r0.getHeight()     // Catch:{ OutOfMemoryError -> 0x015c }
                r6 = 0
                android.graphics.Bitmap r10 = android.graphics.Bitmap.createBitmap(r0, r2, r6, r4, r5)     // Catch:{ OutOfMemoryError -> 0x015c }
                goto L_0x0158
            L_0x013f:
                int r2 = r0.getHeight()     // Catch:{ OutOfMemoryError -> 0x015c }
                r4 = 2
                int r2 = r2 / r4
                int r5 = r0.getWidth()     // Catch:{ OutOfMemoryError -> 0x015c }
                int r5 = r5 / r4
                int r2 = r2 - r5
                int r4 = r0.getWidth()     // Catch:{ OutOfMemoryError -> 0x015c }
                int r5 = r0.getWidth()     // Catch:{ OutOfMemoryError -> 0x015c }
                r6 = 0
                android.graphics.Bitmap r10 = android.graphics.Bitmap.createBitmap(r0, r6, r2, r4, r5)     // Catch:{ OutOfMemoryError -> 0x015c }
            L_0x0158:
                r4 = r17
                r2 = 0
                goto L_0x0169
            L_0x015c:
                r0 = move-exception
                r2 = 0
                java.lang.Object[] r4 = new java.lang.Object[r2]
                java.lang.String r5 = "cropCenter err!!!"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r9, r0, r5, r4)
                goto L_0x0167
            L_0x0166:
                r2 = 0
            L_0x0167:
                r4 = r17
            L_0x0169:
                android.graphics.Bitmap r10 = com.tencent.p014mm.plugin.gallery.model.C93969m.m118775e(r4, r10)
                goto L_0x0179
            L_0x016e:
                r4 = r7
                r2 = 0
                java.lang.Object[] r0 = new java.lang.Object[r5]
                r0[r2] = r4
                java.lang.String r2 = "getPortraitBitmap err, filePath: %s."
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r2, r0)
            L_0x0179:
                r1.f271139q = r10
                if (r10 == 0) goto L_0x0196
                boolean r0 = r10.isRecycled()
                if (r0 != 0) goto L_0x0196
                r2 = 2
                java.lang.Object[] r0 = new java.lang.Object[r2]
                java.lang.String r2 = r1.f271137o
                r4 = 0
                r0[r4] = r2
                java.lang.String r2 = r1.f271129d
                r5 = 1
                r0[r5] = r2
                java.lang.String r2 = "getPortraitBitmap ok, mDecodeTaskKey[%s] filePath[%s]."
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r2, r0)
                return r5
            L_0x0196:
                r2 = 2
                r4 = 0
                r5 = 1
                java.lang.Object[] r0 = new java.lang.Object[r2]
                java.lang.String r2 = r1.f271137o
                r0[r4] = r2
                java.lang.String r2 = r1.f271129d
                r0[r5] = r2
                java.lang.String r2 = "getPortraitBitmap err, mDecodeTaskKey[%s] filePath[%s]."
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r2, r0)
            L_0x01a8:
                boolean r0 = r1.f271138p
                if (r0 == 0) goto L_0x01ad
                return r4
            L_0x01ad:
                long r7 = r1.f271132g
                int r9 = r1.f271130e
                java.lang.String r10 = r1.f271129d
                java.lang.String r11 = r1.f271131f
                r12 = 12288(0x3000, float:1.7219E-41)
                android.graphics.Bitmap r0 = com.tencent.p014mm.plugin.gallery.model.C93969m.m118774d(r7, r9, r10, r11, r12)
                r1.f271139q = r0
                if (r0 == 0) goto L_0x01da
                boolean r0 = r0.isRecycled()
                if (r0 != 0) goto L_0x01da
                com.tencent.mm.plugin.gallery.model.c r0 = com.tencent.p014mm.plugin.gallery.model.C93947c.this
                com.tencent.mm.plugin.gallery.model.d r2 = r0.f271113a
                java.lang.String r3 = r1.f271129d
                java.lang.String r4 = r1.f271131f
                long r5 = r1.f271132g
                android.graphics.Bitmap r7 = r1.f271139q
                com.tencent.mm.plugin.gallery.model.o$f r8 = r1.f271134i
                long r9 = r1.f271136n
                r2.mo128885c(r3, r4, r5, r7, r8, r9)
                r2 = 1
                return r2
            L_0x01da:
                r2 = 0
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.gallery.model.C93947c.C93950c.doInBackground():boolean");
        }

        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            if (obj instanceof C93950c) {
                return Util.nullAs(this.f271129d, "").equals(((C93950c) obj).f271129d);
            }
            return false;
        }

        public int hashCode() {
            return Util.nullAs(this.f271129d, "").hashCode();
        }
    }

    /* renamed from: a */
    public void mo128873a(C93951d.C93956e eVar) {
        C93951d dVar = this.f271113a;
        dVar.getClass();
        Log.m105919d("MicroMsg.GalleryCache", "try add listener[%s].", eVar);
        if (dVar.f271144d.size() > 256) {
            Log.m105919d("MicroMsg.GalleryCache", "start clear logic: %s.", Integer.valueOf(dVar.f271144d.size()));
            for (int i = 0; i < 128; i++) {
                String str = dVar.f271144d.get(i);
                if (!Util.isNullOrNil(str)) {
                    dVar.f271145e.remove(str);
                }
            }
            dVar.f271144d.subList(0, 128).clear();
            Log.m105919d("MicroMsg.GalleryCache", "finish clear logic: %s.", Integer.valueOf(dVar.f271144d.size()));
        }
        if (Util.isNullOrNil(eVar.mo128887a())) {
            Log.m105920e("MicroMsg.GalleryCache", "error! fileKey is invalid!!!");
        } else if (dVar.f271145e.containsKey(eVar.mo128887a())) {
            Log.m105919d("MicroMsg.GalleryCache", "listener already exist!!! %s, update!!!.", eVar);
            dVar.f271144d.remove(eVar.mo128887a());
            dVar.f271144d.add(eVar.mo128887a());
            dVar.f271145e.put(eVar.mo128887a(), eVar);
        } else {
            Log.m105919d("MicroMsg.GalleryCache", "add listener[%s] ok.", eVar);
            dVar.f271144d.add(eVar.mo128887a());
            dVar.f271145e.put(eVar.mo128887a(), eVar);
        }
    }

    /* renamed from: b */
    public void mo128874b() {
        Iterator<C93949b> it = this.f271119g.iterator();
        while (it.hasNext()) {
            C93949b next = it.next();
            if (next != null) {
                next.f271125i = true;
            }
        }
        this.f271119g.clear();
        this.f271118f.clear();
    }

    /* renamed from: c */
    public void mo128875c(List<String> list) {
        boolean contains;
        HashMap<String, C93950c> hashMap = this.f271116d;
        if (hashMap != null && !hashMap.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry next : this.f271116d.entrySet()) {
                if (!list.contains(next.getKey())) {
                    C93950c cVar = (C93950c) next.getValue();
                    if (cVar != null) {
                        cVar.f271138p = true;
                    }
                    Log.m105919d("MicroMsg.CacheService", "cancelTask, success : %s.", next.getKey());
                    arrayList.add((String) next.getKey());
                }
            }
            Log.m105919d("MicroMsg.CacheService", "cancelTask, counter: %s.", Integer.valueOf(arrayList.size()));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                C98551l<String> lVar = this.f271115c;
                synchronized (lVar.f289006d) {
                    synchronized (lVar.f289006d) {
                        contains = lVar.contains(str);
                    }
                    if (contains) {
                        lVar.remove(str);
                    }
                }
                this.f271116d.remove(str);
            }
        }
    }

    /* renamed from: d */
    public Bitmap mo128876d(String str, int i, String str2, long j, C93974o.C93980f fVar, int i2, long j2) {
        String str3 = str;
        C93974o.C93980f fVar2 = fVar;
        if (Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.CacheService", "file path is invalid.");
            return null;
        }
        String d = C101316l.m132905d(str3, fVar2, i2);
        Bitmap a = this.f271113a.mo128883a(C101316l.m132904c(str3, fVar2, j2));
        if (a != null) {
            Log.m105927v("MicroMsg.CacheService", "get bitmap from cache: %s.", str3);
            return a;
        }
        Log.m105919d("MicroMsg.CacheService", "waitingDecodeTask size is : [%d].", Integer.valueOf(this.f271116d.size()));
        if (this.f271116d.containsKey(d)) {
            Log.m105929w("MicroMsg.CacheService", "%s has already getting bitmap from file, %s.", d, str3);
            return null;
        }
        this.f271115c.add(d);
        C93950c cVar = r0;
        C93950c cVar2 = new C93950c(str, i, str2, j, fVar, i2, j2);
        this.f271116d.put(d, cVar);
        Log.m105919d("MicroMsg.CacheService", "add task: %s.", d);
        Log.m105919d("MicroMsg.CacheService", "filePathInService size: %s, waitingDecodeTask size: %s.", Integer.valueOf(this.f271115c.size()), Integer.valueOf(this.f271116d.size()));
        mo128879g();
        return null;
    }

    /* renamed from: e */
    public Bitmap mo128877e(String str, String str2, long j, C93974o.C93980f fVar, long j2) {
        if (Util.isNullOrNil(str)) {
            str = str2;
        }
        if (Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.CacheService", "file path is null or nil.");
            return null;
        }
        Bitmap a = this.f271113a.mo128883a(C101316l.m132904c(str, fVar, j2));
        if (a == null) {
            return null;
        }
        Log.m105927v("MicroMsg.CacheService", "get bitmap from cache: %s.", str);
        return a;
    }

    /* renamed from: f */
    public void mo128878f(C93951d.C93956e eVar) {
        C93951d dVar = this.f271113a;
        if (eVar == null) {
            dVar.f271144d.clear();
            dVar.f271145e.clear();
            dVar.f271143c.removeAll();
            return;
        }
        dVar.getClass();
        String a = eVar.mo128887a();
        if (dVar.f271145e.containsKey(eVar.mo128887a())) {
            dVar.f271145e.remove(a);
            dVar.f271144d.remove(a);
        }
    }

    /* renamed from: g */
    public final void mo128879g() {
        C93950c cVar;
        C93963i m = C93958f.m118753m();
        C98551l<String> lVar = this.f271115c;
        HashMap<String, C93950c> hashMap = this.f271116d;
        m.getClass();
        if (lVar != null && hashMap != null && m.f271183g != null) {
            while (true) {
                if ((C93958f.m118747g().f271114b > 0) && !lVar.isEmpty()) {
                    String f = lVar.mo137925f();
                    if (hashMap.containsKey(f) && (cVar = hashMap.get(f)) != null && !cVar.f271138p) {
                        C93947c g = C93958f.m118747g();
                        g.f271114b--;
                        ((C119143b) m.f271183g).execute(new C93959g(m, cVar, f));
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: h */
    public void mo128880h() {
        Log.m105919d("MicroMsg.CacheService", "tryStartPreDecode: %s %s.", Integer.valueOf(this.f271118f.size()), Integer.valueOf(this.f271119g.size()));
        C93963i m = C93958f.m118753m();
        C98551l<C93949b> lVar = this.f271118f;
        C98551l<C93949b> lVar2 = this.f271119g;
        m.getClass();
        if (lVar != null && lVar2 != null && m.f271184h != null) {
            while (true) {
                if ((C93958f.m118747g().f271117e > 0) && !lVar.isEmpty()) {
                    C93949b f = lVar.mo137925f();
                    if (f != null && !f.f271125i) {
                        lVar2.add(f);
                        C93947c g = C93958f.m118747g();
                        g.f271117e--;
                        ((C119143b) m.f271184h).execute(new C93961h(m, f));
                    }
                } else {
                    return;
                }
            }
        }
    }
}
