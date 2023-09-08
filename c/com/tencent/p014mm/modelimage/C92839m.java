package com.tencent.p014mm.modelimage;

import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.p014mm.graphics.MMBitmapFactory;
import com.tencent.p014mm.modelimage.C68118i0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.pointers.PString;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.FilePathGenerator;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import f12.C7970a;
import f40.C86709a0;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import kg3.C76577a;
import ld2.C46848g;
import o90.C100301b;
import o90.C100308d;
import p158gt.C76054m;
import p158gt.C98210z;
import p232rw.C101475j;
import p753xp.C102704b;
import p823sg.C101610c;
import p823sg.C101611g;
import p823sg.C90193h;
import p867wp.C102479b;
import z51.C102975i;
import zh3.C91753f;

/* renamed from: com.tencent.mm.modelimage.m */
public class C92839m extends MStorage implements C76054m {

    /* renamed from: r */
    public static final String[] f267412r = {"CREATE TABLE IF NOT EXISTS ImgInfo ( id INTEGER PRIMARY KEY, msgSvrId LONG, offset INT, totalLen INT, bigImgPath TEXT, thumbImgPath TEXT )", "CREATE TABLE IF NOT EXISTS ImgInfo2 ( id INTEGER PRIMARY KEY, msgSvrId LONG, offset INT, totalLen INT, bigImgPath TEXT, thumbImgPath TEXT, createtime INT, msglocalid INT, status INT, nettimes INT, reserved1 int  , reserved2 int  , reserved3 text  , reserved4 text, hashdthumb int DEFAULT 0, iscomplete INT DEFAULT 1, origImgMD5 TEXT, compressType INT DEFAULT 0, midImgPath TEXT, forwardType INT DEFAULT 0, hevcPath TEXT, sendImgType INT DEFAULT 0 )", "CREATE INDEX IF NOT EXISTS  serverImgInfoIndex ON ImgInfo2 ( msgSvrId ) ", "CREATE INDEX IF NOT EXISTS  serverImgInfoHdIndex ON ImgInfo2 ( reserved1 ) ", "CREATE INDEX IF NOT EXISTS  msgLocalIdIndex ON ImgInfo2 ( msglocalid ) ", "insert into imginfo2 (id,msgSvrId , offset , totalLen , bigImgPath , thumbImgPath) select id, msgSvrId, offset ,totallen , bigimgpath , thumbimgpath from imginfo; ", "delete from ImgInfo ; ", "CREATE INDEX IF NOT EXISTS iscomplete_index ON ImgInfo2 ( iscomplete ) ", "CREATE INDEX IF NOT EXISTS origImgMD5_index ON ImgInfo2 ( origImgMD5 ) "};

    /* renamed from: s */
    public static int f267413s = 0;

    /* renamed from: t */
    public static long f267414t = 0;

    /* renamed from: d */
    public C101611g<String, Bitmap> f267415d;

    /* renamed from: e */
    public List<C92842c> f267416e;

    /* renamed from: f */
    public Map<Integer, WeakReference<ImageView>> f267417f;

    /* renamed from: g */
    public Map<Integer, WeakReference<ImageView>> f267418g;

    /* renamed from: h */
    public Map<Integer, WeakReference<View>> f267419h;

    /* renamed from: i */
    public Set<Integer> f267420i;

    /* renamed from: j */
    public MMHandler f267421j;

    /* renamed from: n */
    public Map<String, String> f267422n;

    /* renamed from: o */
    public C91753f f267423o = null;

    /* renamed from: p */
    public FrameLayout.LayoutParams f267424p;

    /* renamed from: q */
    public SoftReference<ColorDrawable> f267425q;

    /* renamed from: com.tencent.mm.modelimage.m$a */
    public class C92840a implements C101611g.C101612b<String, Bitmap> {
        public C92840a(C92839m mVar) {
        }

        public void preRemoveCallback(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            Bitmap bitmap = (Bitmap) obj2;
            Bitmap bitmap2 = (Bitmap) obj3;
            if (bitmap != null && !bitmap.isRecycled()) {
                Log.m105925i("MicroMsg.ImgInfoStorage", "[preRemoveCallback] key:%s remove bitmap without recycle! :%s size:%s", str, bitmap.toString(), Integer.valueOf(bitmap.getByteCount()));
            }
        }
    }

    /* renamed from: com.tencent.mm.modelimage.m$b */
    public static class C92841b extends BitmapDrawable {
        public C92841b(Resources resources, Bitmap bitmap) {
            super(resources, bitmap);
        }

        /* renamed from: a */
        public static void m117104a(Bitmap bitmap, ImageView imageView) {
            if (imageView != null && imageView.getResources() != null) {
                C92841b bVar = new C92841b(imageView.getResources(), bitmap);
                if (imageView.getLayerType() == 1) {
                    imageView.destroyDrawingCache();
                    imageView.setLayerType(0, (Paint) null);
                }
                imageView.setImageDrawable(bVar);
            }
        }

        public void draw(Canvas canvas) {
            if (getBitmap() != null && !getBitmap().isRecycled()) {
                super.draw(canvas);
            } else if (getBitmap() != null) {
                Log.m105921e("MicroMsg.ImgInfoStorage", "Cannot draw recycled bitmaps:%s", getBitmap().toString());
            }
        }
    }

    /* renamed from: com.tencent.mm.modelimage.m$c */
    public static class C92842c {

        /* renamed from: a */
        public int f267426a;

        /* renamed from: b */
        public String f267427b;

        /* renamed from: c */
        public int f267428c;

        /* renamed from: d */
        public int f267429d;

        public C92842c(int i, String str, int i2, int i3) {
            this.f267426a = i;
            this.f267427b = str;
            this.f267428c = i2;
            this.f267429d = i3;
        }
    }

    /* renamed from: com.tencent.mm.modelimage.m$d */
    public static final class C92843d {

        /* renamed from: a */
        public String f267430a;

        /* renamed from: b */
        public String f267431b;

        /* renamed from: c */
        public String[] f267432c;

        /* renamed from: d */
        public long[] f267433d = new long[2];

        /* renamed from: e */
        public AtomicLong f267434e;

        public C92843d(String str, String str2, String[] strArr, long j, long j2) {
            AtomicLong atomicLong = new AtomicLong(0);
            this.f267434e = atomicLong;
            this.f267430a = str2;
            this.f267431b = str;
            this.f267432c = strArr;
            long[] jArr = this.f267433d;
            jArr[0] = j;
            jArr[1] = j2;
            atomicLong.set(j);
        }
    }

    /* renamed from: com.tencent.mm.modelimage.m$e */
    public static final class C92844e {

        /* renamed from: a */
        public static final ArrayList<C92843d> f267435a = new ArrayList<>(3);

        /* renamed from: b */
        public static final MultiProcessMMKV f267436b = MultiProcessMMKV.getMMKV("db_max_id_record");

        static {
            m117107c("", "ImgInfo2", C92839m.f267412r, 1, 1000000000);
            m117107c("@findermsg", "finder_img_info_table", C92839m.m117078DN("finder_img_info_table"), 1000000001, 1001000001);
            m117107c("@gamelifesess", "gamelife_img_info_table", C92839m.m117078DN("gamelife_img_info_table"), 1001000002, 1002000002);
        }

        /* renamed from: a */
        public static String m117105a(long j) {
            Iterator<C92843d> it = f267435a.iterator();
            while (it.hasNext()) {
                C92843d next = it.next();
                long[] jArr = next.f267433d;
                if (jArr[0] <= j && j <= jArr[1]) {
                    return next.f267430a;
                }
            }
            ArrayList<C92843d> arrayList = f267435a;
            Log.m105925i("MicroMsg.ImgInfoStorage", "[getTableById] table=%s id=%s", arrayList.get(0).f267430a, Long.valueOf(j));
            return arrayList.get(0).f267430a;
        }

        /* renamed from: b */
        public static String m117106b(String str) {
            if (str == null) {
                Log.m105921e("MicroMsg.ImgInfoStorage", "[getTableByTalker] talker is null %s", Util.getStack());
                return f267435a.get(0).f267430a;
            }
            Iterator<C92843d> it = f267435a.iterator();
            while (it.hasNext()) {
                C92843d next = it.next();
                if (!next.f267431b.isEmpty() && str.toLowerCase().endsWith(next.f267431b)) {
                    return next.f267430a;
                }
            }
            ArrayList<C92843d> arrayList = f267435a;
            Log.m105925i("MicroMsg.ImgInfoStorage", "[getTableByTalker] table=%s talker=%s", arrayList.get(0).f267430a, str);
            return arrayList.get(0).f267430a;
        }

        /* renamed from: c */
        public static void m117107c(String str, String str2, String[] strArr, long j, long j2) {
            f267435a.add(new C92843d(str.toLowerCase(), str2, strArr, j, j2));
        }
    }

    public C92839m(C91753f fVar) {
        Iterator<C92843d> it;
        Iterator<C92843d> it4;
        boolean z;
        boolean z2;
        boolean z3;
        C92839m mVar = this;
        C91753f fVar2 = fVar;
        mVar.f267415d = new C100301b(40, new C92840a(mVar), C92839m.class);
        new C100308d(40);
        mVar.f267416e = new ArrayList();
        mVar.f267417f = new HashMap();
        mVar.f267418g = new HashMap();
        mVar.f267419h = new HashMap();
        mVar.f267420i = new HashSet();
        mVar.f267421j = new MMHandler(Looper.getMainLooper());
        mVar.f267422n = new HashMap();
        String[] strArr = null;
        mVar.f267424p = new FrameLayout.LayoutParams(-2, -2);
        Iterator<C92843d> it5 = C92844e.f267435a.iterator();
        while (it.hasNext()) {
            String str = it.next().f267430a;
            Cursor rawQuery = fVar2.rawQuery("PRAGMA table_info(" + str + ")", strArr, 2);
            int columnIndex = rawQuery.getColumnIndex("name");
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            boolean z8 = false;
            boolean z9 = false;
            boolean z15 = false;
            while (true) {
                it4 = it;
                z = z4;
                z2 = z5;
                z3 = z6;
                if (!rawQuery.moveToNext()) {
                    break;
                } else if (columnIndex >= 0) {
                    String string = rawQuery.getString(columnIndex);
                    z7 = "hashdthumb".equals(string) ? true : z7;
                    z8 = "iscomplete".equals(string) ? true : z8;
                    z9 = "origImgMD5".equals(string) ? true : z9;
                    z15 = "compressType".equals(string) ? true : z15;
                    z6 = "midImgPath".equals(string) ? true : z3;
                    z5 = "forwardType".equals(string) ? true : z2;
                    if ("hevcPath".equals(string)) {
                        z4 = true;
                        it = it4;
                    } else {
                        it = it4;
                        z4 = z;
                    }
                } else {
                    it = it4;
                    z4 = z;
                    z5 = z2;
                    z6 = z3;
                }
            }
            rawQuery.close();
            String str2 = "forwardType";
            long beginTransaction = C86709a0.m107535s().f251811i.beginTransaction(Thread.currentThread().getId());
            if (!z7) {
                fVar2.execSQL(str, "Alter table " + str + " add " + "hashdthumb" + " INT DEFAULT 0");
            }
            if (!z8) {
                fVar2.execSQL(str, "Alter table " + str + " add " + "iscomplete" + " INT DEFAULT 1");
            }
            if (!z9) {
                fVar2.execSQL(str, "Alter table " + str + " add " + "origImgMD5" + " TEXT");
            }
            if (!z15) {
                fVar2.execSQL(str, "Alter table " + str + " add " + "compressType" + " INT DEFAULT 0");
            }
            if (!z3) {
                fVar2.execSQL(str, "Alter table " + str + " add " + "midImgPath" + " TEXT");
            }
            if (!z2) {
                fVar2.execSQL(str, "Alter table " + str + " add " + str2 + " INT DEFAULT 0");
            }
            if (!z) {
                fVar2.execSQL(str, "Alter table " + str + " add " + "hevcPath" + " TEXT");
            }
            fVar2.execSQL(str, "Alter table " + str + " add " + "sendImgType" + " INT DEFAULT 0");
            if (beginTransaction > 0) {
                C86709a0.m107535s().f251811i.endTransaction(beginTransaction);
            }
            strArr = null;
            mVar = this;
            it5 = it4;
        }
        mVar.f267423o = fVar2;
        Ex0();
    }

    /* renamed from: DN */
    public static String[] m117078DN(String str) {
        return new String[]{"CREATE TABLE IF NOT EXISTS " + str + " ( " + "id" + " INTEGER PRIMARY KEY, " + "msgSvrId" + " LONG, " + "offset" + " INT, " + "totalLen" + " INT, " + "bigImgPath" + " TEXT, " + "thumbImgPath" + " TEXT, " + "createtime" + " INT, " + "msglocalid" + " INT, " + "status" + " INT, " + "nettimes" + " INT, " + "reserved1" + " int  , " + "reserved2" + " int  , " + "reserved3" + " text  , " + "reserved4" + " text, " + "hashdthumb" + " int DEFAULT 0, " + "iscomplete" + " INT DEFAULT 1, " + "origImgMD5" + " TEXT, " + "compressType" + " INT DEFAULT 0, " + "midImgPath" + " TEXT, " + "forwardType" + " INT DEFAULT 0, " + "hevcPath" + " TEXT, " + "sendImgType" + " INT DEFAULT 0 )", "CREATE INDEX IF NOT EXISTS " + str + "serverImgInfoIndex ON " + str + " ( " + "msgSvrId" + " ) ", "CREATE INDEX IF NOT EXISTS " + str + "serverImgInfoHdIndex ON " + str + " ( " + "reserved1" + " ) ", "CREATE INDEX IF NOT EXISTS " + str + "msgLocalIdIndex ON " + str + " ( " + "msglocalid" + " ) ", "CREATE INDEX IF NOT EXISTS " + str + "iscomplete_index ON " + str + " ( " + "iscomplete" + " ) ", "CREATE INDEX IF NOT EXISTS " + str + "origImgMD5_index ON " + str + " ( " + "origImgMD5" + " ) "};
    }

    /* renamed from: SE */
    public static synchronized String m117079SE() {
        String TE;
        synchronized (C92839m.class) {
            TE = m117080TE("");
        }
        return TE;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:6|7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0012 */
    /* renamed from: TE */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized java.lang.String m117080TE(java.lang.String r7) {
        /*
            java.lang.Class<com.tencent.mm.modelimage.m> r0 = com.tencent.p014mm.modelimage.C92839m.class
            monitor-enter(r0)
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0045 }
            long r3 = f267414t     // Catch:{ all -> 0x0045 }
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x0016
            r1 = 1
            java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x0012 }
        L_0x0012:
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0045 }
        L_0x0016:
            f267414t = r1     // Catch:{ all -> 0x0045 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0045 }
            r3.<init>()     // Catch:{ all -> 0x0045 }
            r3.append(r7)     // Catch:{ all -> 0x0045 }
            r3.append(r1)     // Catch:{ all -> 0x0045 }
            java.lang.String r7 = r3.toString()     // Catch:{ all -> 0x0045 }
            byte[] r7 = r7.getBytes()     // Catch:{ all -> 0x0045 }
            java.lang.String r7 = p823sg.C90193h.m112878f(r7)     // Catch:{ all -> 0x0045 }
            java.lang.String r3 = "MicroMsg.ImgInfoStorage"
            java.lang.String r4 = "generateMd5: %s, %s"
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x0045 }
            r6 = 0
            r5[r6] = r7     // Catch:{ all -> 0x0045 }
            r6 = 1
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0045 }
            r5[r6] = r1     // Catch:{ all -> 0x0045 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r5)     // Catch:{ all -> 0x0045 }
            monitor-exit(r0)
            return r7
        L_0x0045:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelimage.C92839m.m117080TE(java.lang.String):java.lang.String");
    }

    public String Ab0(String str) {
        return "THUMBNAIL_DIRPATH://th_" + str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0213, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105918d("MicroMsg.ImgInfoStorage", "create thumbnail, delete tmp file");
        com.tencent.p014mm.vfs.C86013q1.m106447h(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x024f, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105918d("MicroMsg.ImgInfoStorage", "create thumbnail, delete tmp file");
        com.tencent.p014mm.vfs.C86013q1.m106447h(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0096, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0097, code lost:
        r6 = r2;
        r9 = r3;
        r7 = r4;
        r4 = r17;
        r2 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01dd, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01de, code lost:
        r2 = r18;
        r7 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01e3, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01e4, code lost:
        r7 = r4;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x01bb */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x021b A[SYNTHETIC, Splitter:B:110:0x021b] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0257 A[SYNTHETIC, Splitter:B:133:0x0257] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0128 A[SYNTHETIC, Splitter:B:66:0x0128] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x015b A[Catch:{ IOException -> 0x01e6, Exception -> 0x01e3, all -> 0x01dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x015d A[Catch:{ IOException -> 0x01e6, Exception -> 0x01e3, all -> 0x01dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01b8 A[SYNTHETIC, Splitter:B:77:0x01b8] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01dd A[ExcHandler: all (th java.lang.Throwable), Splitter:B:21:0x00a0] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01e3 A[ExcHandler: Exception (e java.lang.Exception), Splitter:B:13:0x0080] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String Ax0(byte[] r19, int r20, android.graphics.Bitmap.CompressFormat r21, int r22, float r23, int r24, java.lang.String r25, boolean r26) {
        /*
            r18 = this;
            r1 = r18
            r2 = r19
            r3 = r21
            r0 = r22
            java.lang.String r4 = "save bitmap to image error, %s"
            java.lang.String r5 = "create thumbnail, delete tmp file"
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r19)
            r7 = 0
            java.lang.String r8 = "MicroMsg.ImgInfoStorage"
            if (r6 == 0) goto L_0x001d
            java.lang.String r0 = "save dir thumb error, thumbBuf is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
            return r7
        L_0x001d:
            long r9 = java.lang.System.currentTimeMillis()
            java.lang.String r6 = m117079SE()
            java.lang.String r11 = "th_"
            java.lang.String r12 = ""
            r13 = 1
            java.lang.String r11 = r1.mo127174TY(r6, r11, r12, r13)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r11)
            java.lang.String r14 = ".tmp"
            r12.append(r14)
            java.lang.String r12 = r12.toString()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "saveDirThumb, fullPath = "
            r14.append(r15)
            r14.append(r11)
            java.lang.String r14 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r14)
            int r14 = r2.length
            android.graphics.BitmapFactory$Options r15 = new android.graphics.BitmapFactory$Options
            r15.<init>()
            r15.inJustDecodeBounds = r13
            int r7 = r2.length
            r13 = 0
            android.graphics.BitmapFactory.decodeByteArray(r2, r13, r7, r15)
            int r7 = r15.outWidth
            int r13 = r15.outHeight
            if (r0 > r7) goto L_0x0079
            float r1 = (float) r0
            float r1 = r1 * r23
            r17 = r4
            float r4 = (float) r13
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x0073
            goto L_0x007b
        L_0x0073:
            int r1 = r0 * r13
            int r13 = r1 / r7
            r7 = r0
            goto L_0x007b
        L_0x0079:
            r17 = r4
        L_0x007b:
            r1 = 0
            java.io.OutputStream r4 = com.tencent.p014mm.vfs.C86013q1.m106429K(r12, r1)     // Catch:{ IOException -> 0x0221, Exception -> 0x01f6, all -> 0x01f1 }
            r4.write(r2)     // Catch:{ IOException -> 0x01e6, Exception -> 0x01e3, all -> 0x01dd }
            r4.flush()     // Catch:{ IOException -> 0x01e6, Exception -> 0x01e3, all -> 0x01dd }
            android.graphics.Bitmap r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeByteArray(r2, r7, r13)     // Catch:{ IOException -> 0x01e6, Exception -> 0x01e3, all -> 0x01dd }
            int r1 = r0.getWidth()     // Catch:{ IOException -> 0x01e6, Exception -> 0x01e3, all -> 0x01dd }
            if (r7 == r1) goto L_0x00a0
            r1 = 1
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createScaledBitmap(r0, r7, r13, r1)     // Catch:{ IOException -> 0x0096, Exception -> 0x01e3, all -> 0x01dd }
            goto L_0x00a0
        L_0x0096:
            r0 = move-exception
            r6 = r2
            r9 = r3
            r7 = r4
            r4 = r17
            r2 = r18
            goto L_0x0229
        L_0x00a0:
            int r1 = r0.getHeight()     // Catch:{ IOException -> 0x01e6, Exception -> 0x01e3, all -> 0x01dd }
            float r1 = (float) r1     // Catch:{ IOException -> 0x01e6, Exception -> 0x01e3, all -> 0x01dd }
            int r7 = r0.getWidth()     // Catch:{ IOException -> 0x01e6, Exception -> 0x01e3, all -> 0x01dd }
            float r7 = (float) r7
            float r7 = r7 * r23
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 <= 0) goto L_0x00c2
            int r1 = r0.getWidth()     // Catch:{ IOException -> 0x0096, Exception -> 0x01e3, all -> 0x01dd }
            int r7 = r0.getWidth()     // Catch:{ IOException -> 0x0096, Exception -> 0x01e3, all -> 0x01dd }
            float r7 = (float) r7     // Catch:{ IOException -> 0x0096, Exception -> 0x01e3, all -> 0x01dd }
            float r7 = r7 * r23
            int r7 = (int) r7     // Catch:{ IOException -> 0x0096, Exception -> 0x01e3, all -> 0x01dd }
            r13 = 0
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r13, r13, r1, r7)     // Catch:{ IOException -> 0x0096, Exception -> 0x01e3, all -> 0x01dd }
            goto L_0x00d3
        L_0x00c2:
            int r1 = r0.getHeight()     // Catch:{ IOException -> 0x01e6, Exception -> 0x01e3, all -> 0x01dd }
            float r1 = (float) r1     // Catch:{ IOException -> 0x01e6, Exception -> 0x01e3, all -> 0x01dd }
            float r1 = r1 / r23
            int r1 = (int) r1     // Catch:{ IOException -> 0x01e6, Exception -> 0x01e3, all -> 0x01dd }
            int r7 = r0.getHeight()     // Catch:{ IOException -> 0x01e6, Exception -> 0x01e3, all -> 0x01dd }
            r13 = 0
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r13, r13, r1, r7)     // Catch:{ IOException -> 0x01e6, Exception -> 0x01e3, all -> 0x01dd }
        L_0x00d3:
            int r1 = r2.length     // Catch:{ IOException -> 0x01e6, Exception -> 0x01e3, all -> 0x01dd }
            if (r0 == 0) goto L_0x01bc
            java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x011c, all -> 0x0118 }
            r7.<init>()     // Catch:{ Exception -> 0x011c, all -> 0x0118 }
            r13 = r20
            r0.compress(r3, r13, r7)     // Catch:{ Exception -> 0x0115 }
            r22 = r1
            byte[] r1 = r7.toByteArray()     // Catch:{ Exception -> 0x010f }
            int r1 = r1.length     // Catch:{ Exception -> 0x010f }
        L_0x00e7:
            r20 = r1
            byte[] r1 = r7.toByteArray()     // Catch:{ Exception -> 0x010c }
            int r1 = r1.length     // Catch:{ Exception -> 0x010c }
            r2 = r24
            if (r1 <= r2) goto L_0x0106
            r1 = 15
            if (r13 < r1) goto L_0x0106
            r7.reset()     // Catch:{ Exception -> 0x010c }
            int r13 = r13 + -5
            r0.compress(r3, r13, r7)     // Catch:{ Exception -> 0x010c }
            byte[] r1 = r7.toByteArray()     // Catch:{ Exception -> 0x010c }
            int r1 = r1.length     // Catch:{ Exception -> 0x010c }
            r2 = r19
            goto L_0x00e7
        L_0x0106:
            r7.close()     // Catch:{ Exception -> 0x0109, all -> 0x01dd }
        L_0x0109:
            r1 = r20
            goto L_0x012b
        L_0x010c:
            r1 = r20
            goto L_0x0121
        L_0x010f:
            r1 = r22
            goto L_0x0121
        L_0x0112:
            r0 = move-exception
            goto L_0x01b6
        L_0x0115:
            r22 = r1
            goto L_0x0121
        L_0x0118:
            r0 = move-exception
            r7 = 0
            goto L_0x01b6
        L_0x011c:
            r13 = r20
            r22 = r1
            r7 = 0
        L_0x0121:
            java.lang.String r2 = "compress bitmap failed."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r2)     // Catch:{ all -> 0x0112 }
            if (r7 == 0) goto L_0x012b
            r7.close()     // Catch:{ Exception -> 0x012b, all -> 0x01dd }
        L_0x012b:
            r2 = 1
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToImage(r0, r13, r3, r11, r2)     // Catch:{ IOException -> 0x01e6, Exception -> 0x01e3, all -> 0x01dd }
            java.lang.String r7 = "in ImgInfoStorage, extractThumbNail done: %s, %s, quality : %d"
            r2 = 3
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ IOException -> 0x01e6, Exception -> 0x01e3, all -> 0x01dd }
            r16 = 0
            r3[r16] = r12     // Catch:{ IOException -> 0x01e6, Exception -> 0x01e3, all -> 0x01dd }
            r16 = 1
            r3[r16] = r11     // Catch:{ IOException -> 0x01e6, Exception -> 0x01e3, all -> 0x01dd }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r13)     // Catch:{ IOException -> 0x01e6, Exception -> 0x01e3, all -> 0x01dd }
            r13 = 2
            r3[r13] = r11     // Catch:{ IOException -> 0x01e6, Exception -> 0x01e3, all -> 0x01dd }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r8, r7, r3)     // Catch:{ IOException -> 0x01e6, Exception -> 0x01e3, all -> 0x01dd }
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ IOException -> 0x01e6, Exception -> 0x01e3, all -> 0x01dd }
            r11 = 10
            java.lang.Object[] r11 = new java.lang.Object[r11]     // Catch:{ IOException -> 0x01e6, Exception -> 0x01e3, all -> 0x01dd }
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r25)     // Catch:{ IOException -> 0x01e6, Exception -> 0x01e3, all -> 0x01dd }
            java.lang.String r2 = "UTF-8"
            java.lang.String r2 = p206nj.C117627q.m165909b(r7, r2)     // Catch:{ IOException -> 0x01e6, Exception -> 0x01e3, all -> 0x01dd }
            r7 = 0
            r11[r7] = r2     // Catch:{ IOException -> 0x01e6, Exception -> 0x01e3, all -> 0x01dd }
            if (r26 == 0) goto L_0x015d
            r2 = 1
            goto L_0x015e
        L_0x015d:
            r2 = 0
        L_0x015e:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IOException -> 0x01e6, Exception -> 0x01e3, all -> 0x01dd }
            r7 = 1
            r11[r7] = r2     // Catch:{ IOException -> 0x01e6, Exception -> 0x01e3, all -> 0x01dd }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)     // Catch:{ IOException -> 0x01e6, Exception -> 0x01e3, all -> 0x01dd }
            r11[r13] = r2     // Catch:{ IOException -> 0x01e6, Exception -> 0x01e3, all -> 0x01dd }
            int r2 = r15.outHeight     // Catch:{ IOException -> 0x01e6, Exception -> 0x01e3, all -> 0x01dd }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IOException -> 0x01e6, Exception -> 0x01e3, all -> 0x01dd }
            r7 = 3
            r11[r7] = r2     // Catch:{ IOException -> 0x01e6, Exception -> 0x01e3, all -> 0x01dd }
            r2 = 4
            int r7 = r15.outWidth     // Catch:{ IOException -> 0x01e6, Exception -> 0x01e3, all -> 0x01dd }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ IOException -> 0x01e6, Exception -> 0x01e3, all -> 0x01dd }
            r11[r2] = r7     // Catch:{ IOException -> 0x01e6, Exception -> 0x01e3, all -> 0x01dd }
            r2 = 5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ IOException -> 0x01e6, Exception -> 0x01e3, all -> 0x01dd }
            r11[r2] = r1     // Catch:{ IOException -> 0x01e6, Exception -> 0x01e3, all -> 0x01dd }
            r1 = 6
            int r2 = r0.getHeight()     // Catch:{ IOException -> 0x01e6, Exception -> 0x01e3, all -> 0x01dd }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IOException -> 0x01e6, Exception -> 0x01e3, all -> 0x01dd }
            r11[r1] = r2     // Catch:{ IOException -> 0x01e6, Exception -> 0x01e3, all -> 0x01dd }
            r1 = 7
            int r0 = r0.getWidth()     // Catch:{ IOException -> 0x01e6, Exception -> 0x01e3, all -> 0x01dd }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x01e6, Exception -> 0x01e3, all -> 0x01dd }
            r11[r1] = r0     // Catch:{ IOException -> 0x01e6, Exception -> 0x01e3, all -> 0x01dd }
            r0 = 8
            r1 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch:{ IOException -> 0x01e6, Exception -> 0x01e3, all -> 0x01dd }
            r11[r0] = r2     // Catch:{ IOException -> 0x01e6, Exception -> 0x01e3, all -> 0x01dd }
            r0 = 9
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x01e6, Exception -> 0x01e3, all -> 0x01dd }
            long r1 = r1 - r9
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ IOException -> 0x01e6, Exception -> 0x01e3, all -> 0x01dd }
            r11[r0] = r1     // Catch:{ IOException -> 0x01e6, Exception -> 0x01e3, all -> 0x01dd }
            r0 = 16498(0x4072, float:2.3119E-41)
            r3.mo160131h(r0, r11)     // Catch:{ IOException -> 0x01e6, Exception -> 0x01e3, all -> 0x01dd }
            goto L_0x01bc
        L_0x01b6:
            if (r7 == 0) goto L_0x01bb
            r7.close()     // Catch:{ Exception -> 0x01bb, all -> 0x01dd }
        L_0x01bb:
            throw r0     // Catch:{ IOException -> 0x01e6, Exception -> 0x01e3, all -> 0x01dd }
        L_0x01bc:
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r12)
            if (r0 == 0) goto L_0x01c8
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r5)
            com.tencent.p014mm.vfs.C86013q1.m106447h(r12)
        L_0x01c8:
            r4.close()     // Catch:{ Exception -> 0x01cb }
        L_0x01cb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "THUMBNAIL_DIRPATH://th_"
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            return r0
        L_0x01dd:
            r0 = move-exception
            r2 = r18
            r7 = r4
            goto L_0x0249
        L_0x01e3:
            r0 = move-exception
            r7 = r4
            goto L_0x01f8
        L_0x01e6:
            r0 = move-exception
            r2 = r18
            r6 = r19
            r9 = r21
            r7 = r4
            r4 = r17
            goto L_0x0229
        L_0x01f1:
            r0 = move-exception
            r7 = 0
        L_0x01f3:
            r2 = r18
            goto L_0x0249
        L_0x01f6:
            r0 = move-exception
            r7 = 0
        L_0x01f8:
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ all -> 0x021f }
            r3 = 0
            r2[r3] = r0     // Catch:{ all -> 0x021f }
            r4 = r17
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r8, r4, r2)     // Catch:{ all -> 0x021f }
            r2 = r18
            r6 = r19
            r9 = r21
            java.lang.String r0 = r2.zx0(r6, r1, r9, r3)     // Catch:{ all -> 0x0248 }
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106450k(r12)
            if (r1 == 0) goto L_0x0219
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r5)
            com.tencent.p014mm.vfs.C86013q1.m106447h(r12)
        L_0x0219:
            if (r7 == 0) goto L_0x021e
            r7.close()     // Catch:{ Exception -> 0x021e }
        L_0x021e:
            return r0
        L_0x021f:
            r0 = move-exception
            goto L_0x01f3
        L_0x0221:
            r0 = move-exception
            r6 = r2
            r9 = r3
            r4 = r17
            r2 = r18
            r7 = 0
        L_0x0229:
            r1 = 1
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ all -> 0x0248 }
            r10 = 0
            r3[r10] = r0     // Catch:{ all -> 0x0248 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r8, r4, r3)     // Catch:{ all -> 0x0248 }
            java.lang.String r0 = r2.zx0(r6, r1, r9, r10)     // Catch:{ all -> 0x0248 }
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106450k(r12)
            if (r1 == 0) goto L_0x0242
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r5)
            com.tencent.p014mm.vfs.C86013q1.m106447h(r12)
        L_0x0242:
            if (r7 == 0) goto L_0x0247
            r7.close()     // Catch:{ Exception -> 0x0247 }
        L_0x0247:
            return r0
        L_0x0248:
            r0 = move-exception
        L_0x0249:
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106450k(r12)
            if (r1 == 0) goto L_0x0255
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r5)
            com.tencent.p014mm.vfs.C86013q1.m106447h(r12)
        L_0x0255:
            if (r7 == 0) goto L_0x025a
            r7.close()     // Catch:{ Exception -> 0x025a }
        L_0x025a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelimage.C92839m.Ax0(byte[], int, android.graphics.Bitmap$CompressFormat, int, float, int, java.lang.String, boolean):java.lang.String");
    }

    public boolean Bx0(ImageView imageView, String str, float f, int i, int i2, boolean z, int i3, ImageView imageView2, int i4, int i5, boolean z2, View view) {
        return Cx0(imageView, str, false, f, i, i2, z, i3, imageView2, i4, i5, z2, view);
    }

    /* renamed from: CP */
    public C92836k mo127160CP(long j) {
        C92836k kVar = new C92836k();
        Cursor vx02 = vx0("ImgInfo2", (String[]) null, "msgSvrId=?", new String[]{"" + j}, (String) null, (String) null, (String) null);
        if (vx02.moveToFirst()) {
            kVar.mo127131b(vx02);
        }
        vx02.close();
        return kVar;
    }

    /* renamed from: CZ */
    public final String mo127161CZ(String str) {
        String str2;
        if (str == null || str.length() <= 0) {
            return null;
        }
        String trim = str.trim();
        if (trim.startsWith("THUMBNAIL://")) {
            try {
                trim = mo127173TO(Integer.valueOf(trim.substring(12)).intValue()).f267380g;
            } catch (NumberFormatException e) {
                Log.m105920e("MicroMsg.ImgInfoStorage", "read img buf failed: " + e.getMessage());
                return null;
            }
        } else if (trim.startsWith("THUMBNAIL_DIRPATH://")) {
            trim = trim.substring(23);
            str2 = "th_";
            return mo127174TY(trim, str2, "", true);
        }
        str2 = "";
        return mo127174TY(trim, str2, "", true);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v33, resolved type: android.graphics.Bitmap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: android.graphics.Bitmap} */
    /* JADX WARNING: type inference failed for: r11v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r11v8 */
    /* JADX WARNING: type inference failed for: r11v10 */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0241, code lost:
        r5 = new java.lang.Object[1];
        r5[r11] = java.lang.Integer.valueOf(r4);
        com.tencent.p014mm.sdk.platformtools.Log.m105919d("MicroMsg.ImgInfoStorage", "pic to small height is %d ", r5);
        r4 = (int) r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0250, code lost:
        r5 = new android.widget.FrameLayout.LayoutParams(r7, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0255, code lost:
        if (r14 != 0) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0257, code lost:
        r5.gravity = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x025a, code lost:
        if (r14 != 1) goto L_0x025e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x025c, code lost:
        r5.gravity = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x025e, code lost:
        if (r15 == null) goto L_0x02ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0260, code lost:
        r15.setLayoutParams(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0264, code lost:
        r5 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0266, code lost:
        if (r30 == false) goto L_0x02a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0268, code lost:
        r1 = r9.f267425q;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x026a, code lost:
        if (r1 == null) goto L_0x0272;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0270, code lost:
        if (r1.get() != null) goto L_0x0281;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0272, code lost:
        r9.f267425q = new java.lang.ref.SoftReference<>(new android.graphics.drawable.ColorDrawable(-1118482));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0281, code lost:
        r0.setImageDrawable(r9.f267425q.get());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x028e, code lost:
        if (r10 <= 0) goto L_0x0291;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0290, code lost:
        r7 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0291, code lost:
        r2 = (int) ((((float) r7) * r22) * 1.25f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0297, code lost:
        if (r5 <= 0) goto L_0x029a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x029a, code lost:
        r5 = 75;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x029c, code lost:
        r5 = new android.widget.FrameLayout.LayoutParams(r2, (int) ((((float) r5) * r22) * 1.25f));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02a7, code lost:
        r0.setImageResource(r13);
        r5 = r9.f267424p;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02ac, code lost:
        r0.setLayoutParams(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02af, code lost:
        if (r8 != false) goto L_0x02c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02b1, code lost:
        cx0(r19, r27, r31, r6, r22, r25, r26);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02c3, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a4, code lost:
        if (r6.endsWith("hd") == false) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a6, code lost:
        r17 = ((o90.C100301b) r9.f267415d).mo139556b(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b2, code lost:
        if (r17 != null) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b4, code lost:
        r20 = r6;
        r11 = 0;
        cx0(r19, r27, r31, r6, r22, r25, r26);
        r6 = r20.substring(0, r20.length() - 2);
        r5 = r17;
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00db, code lost:
        r4 = r6;
        r11 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ef, code lost:
        if (((o90.C100301b) r9.f267415d).remove(r4.substring(0, r4.length() - 2)) == null) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00f1, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105918d("MicroMsg.ImgInfoStorage", "remove low quality thumb from cacheMap, path: " + r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0108, code lost:
        r6 = r4;
        r5 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x010c, code lost:
        r4 = r6;
        r11 = false;
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x010f, code lost:
        r8 = false;
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0110, code lost:
        if (r5 != null) goto L_0x011d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0112, code lost:
        r5 = ((o90.C100301b) r9.f267415d).mo139556b(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x011f, code lost:
        if (r5 == null) goto L_0x01d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0125, code lost:
        if (r5.isRecycled() != false) goto L_0x01d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0127, code lost:
        r7 = new java.lang.Object[3];
        r7[r11] = java.lang.Integer.valueOf(r5.getWidth());
        r7[1] = java.lang.Integer.valueOf(r5.getHeight());
        r7[2] = r6;
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.ImgInfoStorage", "[setbitmapFromUri] bitmap width %d, height %d url:%s", r7);
        r0.setBackgroundDrawable((android.graphics.drawable.Drawable) null);
        com.tencent.p014mm.modelimage.C92839m.C92841b.m117104a(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0155, code lost:
        if (r19.getLayoutParams().width == -2) goto L_0x015a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0157, code lost:
        r3 = r9.f267424p;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x015a, code lost:
        r3 = (android.widget.FrameLayout.LayoutParams) r19.getLayoutParams();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0160, code lost:
        if (r14 != 0) goto L_0x0165;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0162, code lost:
        r3.gravity = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0165, code lost:
        if (r14 != 1) goto L_0x0169;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0167, code lost:
        r3.gravity = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0169, code lost:
        r0.setLayoutParams(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x017c, code lost:
        if (((double) r5.getWidth()) < (((double) r5.getHeight()) * 2.5d)) goto L_0x0180;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x017e, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0180, code lost:
        r8 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0181, code lost:
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x018f, code lost:
        if (((double) r5.getHeight()) < (((double) r5.getWidth()) * 2.5d)) goto L_0x0192;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0191, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0192, code lost:
        if (r8 != false) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0194, code lost:
        if (r11 == false) goto L_0x019b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0196, code lost:
        r0.setScaleType(android.widget.ImageView.ScaleType.CENTER);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x019b, code lost:
        if (r12 == null) goto L_0x01b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x019d, code lost:
        r0 = new android.widget.FrameLayout.LayoutParams(r5.getWidth(), r5.getHeight());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01aa, code lost:
        if (r14 != 0) goto L_0x01af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01ac, code lost:
        r0.gravity = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01af, code lost:
        if (r14 != 1) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01b1, code lost:
        r0.gravity = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01b3, code lost:
        r12.setLayoutParams(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01b6, code lost:
        if (r15 == null) goto L_0x01d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01b8, code lost:
        r0 = new android.widget.FrameLayout.LayoutParams(r5.getWidth(), r5.getHeight());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01c5, code lost:
        if (r14 != 0) goto L_0x01ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01c7, code lost:
        r0.gravity = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01ca, code lost:
        if (r14 != 1) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01cc, code lost:
        r0.gravity = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01ce, code lost:
        r15.setLayoutParams(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01d1, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01d2, code lost:
        r7 = 120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01d7, code lost:
        if (r25 == false) goto L_0x0264;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01d9, code lost:
        if (r13 <= 0) goto L_0x0264;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01db, code lost:
        if (r30 == false) goto L_0x0264;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01dd, code lost:
        r0.setBackgroundResource(r13);
        r0.setImageDrawable((android.graphics.drawable.Drawable) null);
        r5 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01e8, code lost:
        if (r10 >= 160) goto L_0x0201;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01ea, code lost:
        if (r5 < 160) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01ed, code lost:
        if (r10 <= 0) goto L_0x01f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01ef, code lost:
        r7 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01f0, code lost:
        r7 = (int) ((((float) r7) * r22) * 1.25f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01f6, code lost:
        if (r5 <= 0) goto L_0x01f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01f9, code lost:
        r5 = 75;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01fb, code lost:
        r5 = (((float) r5) * r22) * 1.25f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0203, code lost:
        if (r5 <= r10) goto L_0x0207;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0205, code lost:
        r13 = (float) r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0207, code lost:
        r13 = (float) r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0208, code lost:
        r4 = 160.0f / r13;
        r10 = (int) (((float) r10) * r4);
        r4 = (int) (((float) r5) * r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0211, code lost:
        if (r10 <= 0) goto L_0x0214;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0213, code lost:
        r7 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0214, code lost:
        r7 = (int) (((float) r7) * r22);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0218, code lost:
        if (r4 <= 0) goto L_0x021c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x021a, code lost:
        r5 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x021c, code lost:
        r5 = 75;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x021e, code lost:
        r5 = ((float) r5) * r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0221, code lost:
        r4 = (int) r5;
        r10 = 60.0f * r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x022b, code lost:
        if (((float) r7) >= r10) goto L_0x023c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x022d, code lost:
        r5 = new java.lang.Object[1];
        r5[r11] = java.lang.Integer.valueOf(r7);
        com.tencent.p014mm.sdk.platformtools.Log.m105919d("MicroMsg.ImgInfoStorage", "pic to small width is %d ", r5);
        r7 = (int) r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x023f, code lost:
        if (((float) r4) >= r10) goto L_0x0250;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean Cx0(android.widget.ImageView r19, java.lang.String r20, boolean r21, float r22, int r23, int r24, boolean r25, int r26, android.widget.ImageView r27, int r28, int r29, boolean r30, android.view.View r31) {
        /*
            r18 = this;
            r9 = r18
            r0 = r19
            r1 = r20
            r10 = r23
            r11 = r24
            r12 = r27
            r13 = r28
            r14 = r29
            r15 = r31
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r20)
            r8 = 1
            r7 = 0
            if (r2 == 0) goto L_0x0027
            java.lang.String r0 = "MicroMsg.ImgInfoStorage"
            java.lang.String r2 = "invalid uri is %s"
            java.lang.Object[] r3 = new java.lang.Object[r8]
            r3[r7] = r1
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r2, r3)
            return r7
        L_0x0027:
            java.util.Map<java.lang.String, java.lang.String> r2 = r9.f267422n
            monitor-enter(r2)
            java.util.Map<java.lang.String, java.lang.String> r3 = r9.f267422n     // Catch:{ all -> 0x02c4 }
            java.util.HashMap r3 = (java.util.HashMap) r3     // Catch:{ all -> 0x02c4 }
            boolean r3 = r3.containsKey(r1)     // Catch:{ all -> 0x02c4 }
            r4 = r21
            java.lang.String r4 = r9.c40(r1, r4, r7)     // Catch:{ all -> 0x02c4 }
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)     // Catch:{ all -> 0x02c4 }
            if (r5 == 0) goto L_0x004f
            java.lang.String r0 = "MicroMsg.ImgInfoStorage"
            java.lang.String r3 = "getFullThumbPathByCache uri is null, uri:%s"
            java.lang.Object[] r4 = new java.lang.Object[r8]     // Catch:{ all -> 0x02c4 }
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r20)     // Catch:{ all -> 0x02c4 }
            r4[r7] = r1     // Catch:{ all -> 0x02c4 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r3, r4)     // Catch:{ all -> 0x02c4 }
            monitor-exit(r2)     // Catch:{ all -> 0x02c4 }
            return r7
        L_0x004f:
            if (r3 != 0) goto L_0x0099
            java.lang.String r3 = "hd"
            boolean r3 = r4.endsWith(r3)     // Catch:{ all -> 0x02c4 }
            if (r3 != 0) goto L_0x0099
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x02c4 }
            r3.<init>()     // Catch:{ all -> 0x02c4 }
            r3.append(r4)     // Catch:{ all -> 0x02c4 }
            java.lang.String r5 = "hd"
            r3.append(r5)     // Catch:{ all -> 0x02c4 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x02c4 }
            boolean r3 = com.tencent.p014mm.vfs.C86013q1.m106450k(r3)     // Catch:{ all -> 0x02c4 }
            if (r3 == 0) goto L_0x0099
            java.util.Map<java.lang.String, java.lang.String> r3 = r9.f267422n     // Catch:{ all -> 0x02c4 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x02c4 }
            r5.<init>()     // Catch:{ all -> 0x02c4 }
            r5.append(r4)     // Catch:{ all -> 0x02c4 }
            java.lang.String r6 = "hd"
            r5.append(r6)     // Catch:{ all -> 0x02c4 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x02c4 }
            java.util.HashMap r3 = (java.util.HashMap) r3     // Catch:{ all -> 0x02c4 }
            r3.put(r1, r5)     // Catch:{ all -> 0x02c4 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x02c4 }
            r1.<init>()     // Catch:{ all -> 0x02c4 }
            r1.append(r4)     // Catch:{ all -> 0x02c4 }
            java.lang.String r3 = "hd"
            r1.append(r3)     // Catch:{ all -> 0x02c4 }
            java.lang.String r4 = r1.toString()     // Catch:{ all -> 0x02c4 }
        L_0x0099:
            r6 = r4
            monitor-exit(r2)     // Catch:{ all -> 0x02c4 }
            java.lang.String r1 = "hd"
            boolean r1 = r6.endsWith(r1)
            r16 = 2
            r5 = 0
            if (r1 == 0) goto L_0x010c
            sg.g<java.lang.String, android.graphics.Bitmap> r1 = r9.f267415d
            o90.b r1 = (o90.C100301b) r1
            java.lang.Object r1 = r1.mo139556b(r6)
            r17 = r1
            android.graphics.Bitmap r17 = (android.graphics.Bitmap) r17
            if (r17 != 0) goto L_0x00db
            r1 = r18
            r2 = r19
            r3 = r27
            r4 = r31
            r11 = r5
            r5 = r6
            r20 = r6
            r6 = r22
            r11 = 0
            r7 = r25
            r8 = r26
            r1.cx0(r2, r3, r4, r5, r6, r7, r8)
            int r1 = r20.length()
            int r1 = r1 + -2
            r4 = r20
            java.lang.String r1 = r4.substring(r11, r1)
            r6 = r1
            r5 = r17
            r8 = 1
            goto L_0x0110
        L_0x00db:
            r4 = r6
            r11 = 0
            sg.g<java.lang.String, android.graphics.Bitmap> r1 = r9.f267415d
            int r2 = r4.length()
            int r2 = r2 + -2
            java.lang.String r2 = r4.substring(r11, r2)
            o90.b r1 = (o90.C100301b) r1
            java.lang.Object r1 = r1.remove(r2)
            if (r1 == 0) goto L_0x0108
            java.lang.String r1 = "MicroMsg.ImgInfoStorage"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "remove low quality thumb from cacheMap, path: "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r2)
        L_0x0108:
            r6 = r4
            r5 = r17
            goto L_0x010f
        L_0x010c:
            r4 = r6
            r11 = 0
            r5 = 0
        L_0x010f:
            r8 = 0
        L_0x0110:
            if (r5 != 0) goto L_0x011d
            sg.g<java.lang.String, android.graphics.Bitmap> r1 = r9.f267415d
            o90.b r1 = (o90.C100301b) r1
            java.lang.Object r1 = r1.mo139556b(r6)
            r5 = r1
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
        L_0x011d:
            r1 = 5
            r2 = 3
            if (r5 == 0) goto L_0x01d2
            boolean r3 = r5.isRecycled()
            if (r3 != 0) goto L_0x01d2
            java.lang.String r3 = "MicroMsg.ImgInfoStorage"
            java.lang.String r4 = "[setbitmapFromUri] bitmap width %d, height %d url:%s"
            java.lang.Object[] r7 = new java.lang.Object[r2]
            int r8 = r5.getWidth()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7[r11] = r8
            int r8 = r5.getHeight()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r10 = 1
            r7[r10] = r8
            r7[r16] = r6
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r7)
            r3 = 0
            r0.setBackgroundDrawable(r3)
            com.tencent.p014mm.modelimage.C92839m.C92841b.m117104a(r5, r0)
            android.view.ViewGroup$LayoutParams r3 = r19.getLayoutParams()
            int r3 = r3.width
            r4 = -2
            if (r3 == r4) goto L_0x015a
            android.widget.FrameLayout$LayoutParams r3 = r9.f267424p
            goto L_0x0160
        L_0x015a:
            android.view.ViewGroup$LayoutParams r3 = r19.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
        L_0x0160:
            if (r14 != 0) goto L_0x0165
            r3.gravity = r1
            goto L_0x0169
        L_0x0165:
            if (r14 != r10) goto L_0x0169
            r3.gravity = r2
        L_0x0169:
            r0.setLayoutParams(r3)
            int r3 = r5.getWidth()
            double r3 = (double) r3
            int r6 = r5.getHeight()
            double r6 = (double) r6
            r16 = 4612811918334230528(0x4004000000000000, double:2.5)
            double r6 = r6 * r16
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 < 0) goto L_0x0180
            r8 = 1
            goto L_0x0181
        L_0x0180:
            r8 = 0
        L_0x0181:
            int r3 = r5.getHeight()
            double r3 = (double) r3
            int r6 = r5.getWidth()
            double r6 = (double) r6
            double r6 = r6 * r16
            int r13 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r13 < 0) goto L_0x0192
            r11 = 1
        L_0x0192:
            if (r8 != 0) goto L_0x0196
            if (r11 == 0) goto L_0x019b
        L_0x0196:
            android.widget.ImageView$ScaleType r3 = android.widget.ImageView.ScaleType.CENTER
            r0.setScaleType(r3)
        L_0x019b:
            if (r12 == 0) goto L_0x01b6
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            int r3 = r5.getWidth()
            int r4 = r5.getHeight()
            r0.<init>(r3, r4)
            if (r14 != 0) goto L_0x01af
            r0.gravity = r1
            goto L_0x01b3
        L_0x01af:
            if (r14 != r10) goto L_0x01b3
            r0.gravity = r2
        L_0x01b3:
            r12.setLayoutParams(r0)
        L_0x01b6:
            if (r15 == 0) goto L_0x01d1
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            int r3 = r5.getWidth()
            int r4 = r5.getHeight()
            r0.<init>(r3, r4)
            if (r14 != 0) goto L_0x01ca
            r0.gravity = r1
            goto L_0x01ce
        L_0x01ca:
            if (r14 != r10) goto L_0x01ce
            r0.gravity = r2
        L_0x01ce:
            r15.setLayoutParams(r0)
        L_0x01d1:
            return r10
        L_0x01d2:
            r3 = 1
            r4 = 1067450368(0x3fa00000, float:1.25)
            r7 = 120(0x78, float:1.68E-43)
            if (r25 == 0) goto L_0x0264
            if (r13 <= 0) goto L_0x0264
            if (r30 == 0) goto L_0x0264
            r0.setBackgroundResource(r13)
            r13 = 0
            r0.setImageDrawable(r13)
            r13 = 160(0xa0, float:2.24E-43)
            r5 = r24
            if (r10 >= r13) goto L_0x0201
            if (r5 < r13) goto L_0x01ed
            goto L_0x0201
        L_0x01ed:
            if (r10 <= 0) goto L_0x01f0
            r7 = r10
        L_0x01f0:
            float r7 = (float) r7
            float r7 = r7 * r22
            float r7 = r7 * r4
            int r7 = (int) r7
            if (r5 <= 0) goto L_0x01f9
            goto L_0x01fb
        L_0x01f9:
            r5 = 75
        L_0x01fb:
            float r5 = (float) r5
            float r5 = r5 * r22
            float r5 = r5 * r4
            goto L_0x0221
        L_0x0201:
            r4 = 1126170624(0x43200000, float:160.0)
            if (r5 <= r10) goto L_0x0207
            float r13 = (float) r5
            goto L_0x0208
        L_0x0207:
            float r13 = (float) r10
        L_0x0208:
            float r4 = r4 / r13
            float r10 = (float) r10
            float r10 = r10 * r4
            int r10 = (int) r10
            float r5 = (float) r5
            float r5 = r5 * r4
            int r4 = (int) r5
            if (r10 <= 0) goto L_0x0214
            r7 = r10
        L_0x0214:
            float r5 = (float) r7
            float r5 = r5 * r22
            int r7 = (int) r5
            if (r4 <= 0) goto L_0x021c
            r5 = r4
            goto L_0x021e
        L_0x021c:
            r5 = 75
        L_0x021e:
            float r4 = (float) r5
            float r5 = r4 * r22
        L_0x0221:
            int r4 = (int) r5
            float r5 = (float) r7
            r10 = 1114636288(0x42700000, float:60.0)
            float r10 = r10 * r22
            java.lang.String r13 = "MicroMsg.ImgInfoStorage"
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 >= 0) goto L_0x023c
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r5[r11] = r7
            java.lang.String r7 = "pic to small width is %d "
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r13, r7, r5)
            int r7 = (int) r10
        L_0x023c:
            float r5 = (float) r4
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 >= 0) goto L_0x0250
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5[r11] = r4
            java.lang.String r4 = "pic to small height is %d "
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r13, r4, r5)
            int r4 = (int) r10
        L_0x0250:
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            r5.<init>(r7, r4)
            if (r14 != 0) goto L_0x025a
            r5.gravity = r1
            goto L_0x025e
        L_0x025a:
            if (r14 != r3) goto L_0x025e
            r5.gravity = r2
        L_0x025e:
            if (r15 == 0) goto L_0x02ac
            r15.setLayoutParams(r5)
            goto L_0x02ac
        L_0x0264:
            r5 = r24
            if (r30 == 0) goto L_0x02a7
            java.lang.ref.SoftReference<android.graphics.drawable.ColorDrawable> r1 = r9.f267425q
            if (r1 == 0) goto L_0x0272
            java.lang.Object r1 = r1.get()
            if (r1 != 0) goto L_0x0281
        L_0x0272:
            android.graphics.drawable.ColorDrawable r1 = new android.graphics.drawable.ColorDrawable
            r2 = -1118482(0xffffffffffeeeeee, float:NaN)
            r1.<init>(r2)
            java.lang.ref.SoftReference r2 = new java.lang.ref.SoftReference
            r2.<init>(r1)
            r9.f267425q = r2
        L_0x0281:
            java.lang.ref.SoftReference<android.graphics.drawable.ColorDrawable> r1 = r9.f267425q
            java.lang.Object r1 = r1.get()
            android.graphics.drawable.ColorDrawable r1 = (android.graphics.drawable.ColorDrawable) r1
            r0.setImageDrawable(r1)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            if (r10 <= 0) goto L_0x0291
            r7 = r10
        L_0x0291:
            float r2 = (float) r7
            float r2 = r2 * r22
            float r2 = r2 * r4
            int r2 = (int) r2
            if (r5 <= 0) goto L_0x029a
            goto L_0x029c
        L_0x029a:
            r5 = 75
        L_0x029c:
            float r3 = (float) r5
            float r3 = r3 * r22
            float r3 = r3 * r4
            int r3 = (int) r3
            r1.<init>(r2, r3)
            r5 = r1
            goto L_0x02ac
        L_0x02a7:
            r0.setImageResource(r13)
            android.widget.FrameLayout$LayoutParams r5 = r9.f267424p
        L_0x02ac:
            r0.setLayoutParams(r5)
            if (r8 != 0) goto L_0x02c3
            r1 = r18
            r2 = r19
            r3 = r27
            r4 = r31
            r5 = r6
            r6 = r22
            r7 = r25
            r8 = r26
            r1.cx0(r2, r3, r4, r5, r6, r7, r8)
        L_0x02c3:
            return r11
        L_0x02c4:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x02c4 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelimage.C92839m.Cx0(android.widget.ImageView, java.lang.String, boolean, float, int, int, boolean, int, android.widget.ImageView, int, int, boolean, android.view.View):boolean");
    }

    public int Dx0(Long l, C92836k kVar) {
        int i;
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        ContentValues c = kVar.mo127132c();
        if (c.size() == 0) {
            i = 1;
        } else {
            C91753f fVar = this.f267423o;
            String a = C92844e.m117105a(l.longValue());
            i = fVar.update(a, c, "id=?", new String[]{"" + l});
        }
        Log.m105925i("MicroMsg.ImgInfoStorage", "update last :%d values : %s %s", Long.valueOf(System.currentTimeMillis() - valueOf.longValue()), c.toString(), Integer.valueOf(i));
        if (i != -1) {
            kVar.mo127130a();
            doNotify();
        }
        return i;
    }

    public void Ex0() {
        MultiProcessMMKV multiProcessMMKV = C92844e.f267436b;
        Iterator<C92843d> it = C92844e.f267435a.iterator();
        while (it.hasNext()) {
            C92843d next = it.next();
            AtomicLong atomicLong = next.f267434e;
            C91753f fVar = this.f267423o;
            Cursor rawQuery = fVar.rawQuery("SELECT max(id) FROM " + next.f267430a, (String[]) null, 2);
            long j = rawQuery.moveToFirst() ? rawQuery.getLong(0) : 0;
            rawQuery.close();
            long max = Math.max(multiProcessMMKV.getLong("img." + next.f267430a, -1), j);
            synchronized (this) {
                if (max > atomicLong.get()) {
                    atomicLong.set(max);
                }
            }
            Log.m105925i("MicroMsg.ImgInfoStorage", "[updateLatestImgID] table=%s, loading new img id=%s", next.f267430a, Long.valueOf(atomicLong.get()));
        }
    }

    public long Jt0(String str, byte[] bArr, int i, long j, boolean z, String str2, int i2, String str3, PString pString, PInt pInt, PInt pInt2) {
        byte[] bArr2 = bArr;
        long j2 = j;
        int i3 = i2;
        String str4 = "SERVERID://" + j2;
        String f = C90193h.m112878f(str4.getBytes());
        String TY = mo127174TY(f, "th_", "", true);
        if (bArr2 != null && bArr2.length >= 0) {
            Bitmap decodeByteArray = BitmapUtil.decodeByteArray(bArr);
            if (decodeByteArray == null) {
                Log.m105920e("MicroMsg.ImgInfoStorage", "create decodeByteArray failed: " + new String(bArr2));
            }
            if (!z && decodeByteArray != null) {
                try {
                    Bitmap extractThumeNail = BitmapUtil.extractThumeNail(decodeByteArray, 120, 120, false);
                    pInt.value = extractThumeNail.getWidth();
                    pInt2.value = extractThumeNail.getHeight();
                    BitmapUtil.saveBitmapToImage(extractThumeNail, 90, Bitmap.CompressFormat.JPEG, TY, true);
                } catch (IOException unused) {
                    Log.m105920e("MicroMsg.ImgInfoStorage", "create thumbnail from byte failed: " + f + " " + new String(bArr2));
                }
            }
        }
        C92836k kVar = new C92836k();
        if (!Util.isNullOrNil(str2)) {
            kVar.mo127126C(i3);
            kVar.mo127129F(i3);
            str4 = str2;
        }
        kVar.mo127154y(mo127192mL(str));
        kVar.mo127147r(str4);
        kVar.mo127128E("THUMBNAIL_DIRPATH://th_" + f);
        pString.value = kVar.f267380g;
        if (z) {
            kVar.mo127125B(0);
            kVar.mo127149t(1);
        } else {
            kVar.mo127125B(j2);
            kVar.mo127149t(0);
        }
        kVar.mo127148s(str3);
        kVar.mo127150u((int) Util.nowSecond());
        String str5 = str;
        long wt02 = wt0(str, "id", kVar);
        if (wt02 != -1) {
            doNotify();
        }
        return wt02;
    }

    /* renamed from: LL */
    public String mo127166LL(C72963f4 f4Var) {
        C92836k kVar;
        if (f4Var == null) {
            Log.m105928w("MicroMsg.ImgInfoStorage", "[getBigPicPath] msg is null.");
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (f4Var.mo108769t2() == 1) {
            kVar = C92837k0.Bx0().mo127200vP(f4Var.mo108768t(), f4Var.getMsgId());
            if (kVar.f267374a == 0) {
                kVar = C92837k0.Bx0().mo127168NQ(f4Var.mo108768t(), f4Var.mo108774y2());
            }
        } else {
            kVar = C92837k0.Bx0().mo127168NQ(f4Var.mo108768t(), f4Var.mo108774y2());
        }
        if (C86709a0.m107535s().mo121147n()) {
            if (f4Var.mo108769t2() == 1) {
                String str = kVar.mo127145p() ? C92837k0.Bx0().mo127173TO(kVar.f267390q).f267378e : kVar.f267378e;
                String TY = C92837k0.Bx0().mo127174TY(str, "", "", true);
                if (str != null && str.length() > 0 && C86013q1.m106450k(TY)) {
                    return TY;
                }
                String str2 = kVar.f267378e;
                String TY2 = C92837k0.Bx0().mo127174TY(str2, "", "", true);
                if (str2 != null && str2.length() > 0 && C86013q1.m106450k(TY2)) {
                    return TY2;
                }
            } else if (kVar.mo127146q()) {
                String TY3 = C92837k0.Bx0().mo127174TY(kVar.f267378e, "", "", true);
                if (!kVar.mo127145p()) {
                    return TY3;
                }
                if (kVar.mo127145p()) {
                    kVar = C92837k0.Bx0().mo127173TO(kVar.f267390q);
                }
                if (kVar.f267374a <= 0 || !kVar.mo127146q()) {
                    return TY3;
                }
                String TY4 = C92837k0.Bx0().mo127174TY(kVar.f267378e, "", "", true);
                return C86013q1.m106450k(TY4) ? TY4 : TY3;
            }
        }
        Log.m105919d("MicroMsg.ImgInfoStorage", "getBigPicPath use time:%s", (System.currentTimeMillis() - currentTimeMillis) + "");
        return null;
    }

    /* renamed from: Lo */
    public Bitmap mo127167Lo(String str, boolean z, float f, boolean z2, boolean z3) {
        return mo127196qq(str, z, f, z2, z3, false, 0, true);
    }

    /* renamed from: NQ */
    public C92836k mo127168NQ(String str, long j) {
        C92836k kVar = new C92836k();
        String b = C92844e.m117106b(str);
        Cursor vx02 = vx0(b, (String[]) null, "msgSvrId=?", new String[]{"" + j}, (String) null, (String) null, (String) null);
        if (vx02.moveToFirst()) {
            kVar.mo127131b(vx02);
        }
        vx02.close();
        return kVar;
    }

    /* renamed from: Ow */
    public boolean mo127169Ow(String str, String str2, int i, int i2, int i3, int i4, int i5) {
        String str3;
        boolean z;
        String str4 = str2;
        Log.m105919d("MicroMsg.ImgInfoStorage", "createHDThumbNail bigPicPath:%s thumbPath:%s maskResId:%d, compressType:%d, stack[%s]", str, str4, Integer.valueOf(i), Integer.valueOf(i2), Util.getStack());
        long currentTimeMillis = System.currentTimeMillis();
        float g = C76577a.m92156g(MMApplicationContext.getContext());
        if (!Util.isNullOrNil(str) && !Util.isNullOrNil(str2)) {
            String h302 = h30(str4);
            if (Util.isNullOrNil(h302)) {
                return false;
            }
            if (!h302.endsWith("hd")) {
                str3 = h302 + "hd";
            } else {
                str3 = h302;
                h302 = h302.substring(0, h302.length() - 2);
            }
            BitmapFactory.Options imageOptions = BitmapUtil.getImageOptions(h302);
            if (imageOptions == null || imageOptions.outWidth <= 0 || imageOptions.outHeight <= 0) {
                C115669n nVar = C115669n.INSTANCE;
                nVar.idkeyStat(111, 185, 1, false);
                if (C86013q1.m106451l(h302) > 0) {
                    return false;
                }
                BitmapFactory.Options options = new BitmapFactory.Options();
                BitmapUtil.bindlowMemeryOption(options);
                Log.m105925i("MicroMsg.ImgInfoStorage", "createHDThumbNail old op is invaild but len is 0 need recreate[%s, %d, %d]", options, Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
                nVar.idkeyStat(111, 183, 1, false);
                imageOptions = options;
            }
            if (imageOptions.outWidth == 0) {
                imageOptions.outWidth = i3;
            }
            if (imageOptions.outHeight == 0) {
                imageOptions.outHeight = i4;
            }
            int i6 = (int) (((float) imageOptions.outWidth) * g * 1.25f);
            int i7 = (int) (((float) imageOptions.outHeight) * g * 1.25f);
            float f = (float) i6;
            float f2 = g * 160.0f;
            if (f >= f2 || ((float) i7) >= f2) {
                float f3 = i7 > i6 ? f2 / ((float) i7) : f2 / f;
                i6 = (int) (f * f3);
                i7 = (int) (((float) i7) * f3);
            }
            if (i2 == 0) {
                try {
                    z = BitmapUtil.createThumbNail(str, i7, i6, Bitmap.CompressFormat.JPEG, 80, str3, true, new PInt(), new PInt(), true, i5);
                } catch (Exception e) {
                    C115669n.INSTANCE.idkeyStat(111, 184, 1, false);
                    Log.m105921e("MicroMsg.ImgInfoStorage", "create hd thumbnail failed. %s", e.toString());
                }
            } else {
                z = BitmapUtil.createThumbNail(str, i7, i6, Bitmap.CompressFormat.JPEG, 80, str3, true, new PInt(), new PInt(), true, true, i5);
            }
            boolean z2 = z;
            Log.m105919d("MicroMsg.ImgInfoStorage", "createHDThumbNail user time %s, height %d, width %d, hasHDThumb:%b", (System.currentTimeMillis() - currentTimeMillis) + "", Integer.valueOf(i7), Integer.valueOf(i6), Boolean.valueOf(z2));
            String str5 = str3;
            mo127196qq(h302, true, C76577a.m92156g(MMApplicationContext.getContext()), true, false, true, i, false);
            if (z2) {
                synchronized (this.f267422n) {
                    if (((HashMap) this.f267422n).containsKey(str4) && !((String) ((HashMap) this.f267422n).get(str4)).endsWith("hd")) {
                        ((HashMap) this.f267422n).put(str4, str5);
                    }
                }
                C102479b as = ((C102704b) C86312j.m106911c(C102704b.class)).mo138751as(str5, 3, (String) null, (byte[]) null);
                Log.m105925i("MicroMsg.ImgInfoStorage", "check dup, ret:%s, hit:%s, copyRes:%s, replaceRes:%s", Integer.valueOf(as.f301760a), Boolean.valueOf(as.f301761b), Boolean.valueOf(as.f301762c), Long.valueOf(as.f301763d));
            } else {
                C115669n.INSTANCE.idkeyStat(111, 184, 1, false);
            }
            return z2;
        }
        return false;
    }

    public Bitmap P50(int i, int i2, int i3, int i4, boolean z) {
        String str = z ? "location_backgroup_key_from" : "location_backgroup_key_tor";
        Bitmap bitmap = (Bitmap) ((C100301b) this.f267415d).mo139556b(str);
        if (bitmap != null && !bitmap.isRecycled()) {
            return bitmap;
        }
        Bitmap createLocation = BitmapUtil.createLocation(i, i2, i3, i4);
        ((C100301b) this.f267415d).mo139557c(str, createLocation);
        return createLocation;
    }

    public final long Pq0(C98210z zVar) {
        Class cls = C101475j.class;
        int i = zVar.f287939d;
        if (i == 0) {
            C92836k bF = mo127180bF(zVar, true, -1);
            if (bF == null) {
                return -1;
            }
            zVar.f287942g.value = bF.f267380g;
            if (C86013q1.m106450k(zVar.f287938c)) {
                String wt = ((C102975i) C86312j.m106911c(C102975i.class)).mo141702wt(bF.f267378e);
                C86013q1.m106442c(zVar.f287938c, mo127174TY(wt, "", "", true));
                bF.mo127152w(wt);
            }
            long Rv0 = zVar.f287950o ? Rv0(zVar.f287936a, "id", bF) : wt0(zVar.f287936a, "id", bF);
            if (Rv0 != -1) {
                doNotify();
            }
            ((C101475j) C86312j.m106911c(cls)).pt0(zVar.f287937b);
            return Rv0;
        } else if (i != 1) {
            return 0;
        } else {
            C92836k bF2 = mo127180bF(zVar, true, -1);
            if (bF2 == null) {
                return -1;
            }
            C98210z zVar2 = new C98210z();
            zVar2.f287936a = zVar.f287936a;
            zVar2.f287937b = zVar.f287937b;
            zVar2.f287938c = zVar.f287938c;
            zVar2.f287940e = zVar.f287940e;
            zVar2.f287941f = zVar.f287941f;
            PString pString = zVar.f287942g;
            zVar2.f287942g = pString;
            zVar2.f287943h = zVar.f287943h;
            zVar2.f287944i = zVar.f287944i;
            zVar2.f287945j = zVar.f287945j;
            zVar2.f287946k = zVar.f287946k;
            zVar2.f287947l = zVar.f287947l;
            zVar2.f287948m = zVar.f287948m;
            zVar2.f287949n = zVar.f287949n;
            zVar.getClass();
            zVar2.f287950o = zVar.f287950o;
            zVar2.f287951p = zVar.f287951p;
            zVar2.f287952q = zVar.f287952q;
            zVar2.f287939d = 0;
            pString.value = bF2.f267380g;
            bF2.mo127124A(0);
            bF2.mo127125B(0);
            bF2.mo127129F((int) C86013q1.m106451l(mo127174TY(bF2.f267378e, "", "", true)));
            C92836k bF3 = mo127180bF(zVar2, false, -1);
            if (bF3 == null) {
                return 0;
            }
            bF3.mo127147r(bF2.f267378e);
            bF3.mo127128E(bF2.f267380g);
            bF3.mo127155z(bF2.f267379f);
            bF3.mo127129F(0);
            long beginTransaction = this.f267423o.beginTransaction(Thread.currentThread().getId());
            bF3.mo127151v((int) wt0(zVar.f287936a, "id", bF2));
            long Rv02 = zVar.f287950o ? Rv0(zVar.f287936a, "id", bF3) : wt0(zVar.f287936a, "id", bF3);
            Log.m105919d("MicroMsg.ImgInfoStorage", "summersafecdn insert ret[%d],  getLocalId[%d], getMsgLocalId[%d], getBigImgPath[%s], getMidImgPath[%s], getTotalLen[%d]", Long.valueOf(Rv02), Long.valueOf(bF3.f267374a), Long.valueOf(bF3.f267387n), bF3.f267378e, bF3.f267379f, Integer.valueOf(bF3.f267377d));
            if (beginTransaction > 0) {
                C86709a0.m107535s().f251811i.endTransaction(beginTransaction);
            }
            if (Rv02 != -1) {
                doNotify();
            }
            ((C101475j) C86312j.m106911c(cls)).pt0(zVar.f287937b);
            return Rv02;
        }
    }

    public final long Rv0(String str, String str2, C92836k kVar) {
        String b = C92844e.m117106b(str);
        long insertOrThrow = this.f267423o.mo125615f().insertOrThrow(b, "id", kVar.mo127132c());
        if (insertOrThrow != -1) {
            kVar.mo127130a();
        }
        Log.m105925i("MicroMsg.ImgInfoStorage", "insert img, table:%s result:%d, localId:%d, msgLocalId:%d, msgSvrId:%d, hdID:%d", b, Long.valueOf(insertOrThrow), Long.valueOf(kVar.f267374a), Long.valueOf(kVar.f267387n), Long.valueOf(kVar.f267375b), Integer.valueOf(kVar.f267390q));
        return insertOrThrow;
    }

    /* renamed from: TO */
    public C92836k mo127173TO(int i) {
        return mo127194nP(Long.valueOf((long) i));
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008d  */
    /* renamed from: TY */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo127174TY(java.lang.String r12, java.lang.String r13, java.lang.String r14, boolean r15) {
        /*
            r11 = this;
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.lang.String r0 = "SERVERID://"
            boolean r0 = r12.startsWith(r0)
            if (r0 == 0) goto L_0x0042
            r0 = 11
            java.lang.String r0 = r12.substring(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ NumberFormatException -> 0x0025 }
            long r2 = r0.longValue()     // Catch:{ NumberFormatException -> 0x0025 }
            com.tencent.mm.modelimage.k r0 = r11.mo127160CP(r2)     // Catch:{ NumberFormatException -> 0x0025 }
            java.lang.String r0 = r0.f267378e     // Catch:{ NumberFormatException -> 0x0025 }
            goto L_0x0044
        L_0x0025:
            r12 = move-exception
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "read img buf failed: "
            r13.append(r14)
            java.lang.String r12 = r12.getMessage()
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            java.lang.String r13 = "MicroMsg.ImgInfoStorage"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r12)
            return r1
        L_0x0042:
            java.lang.String r0 = ""
        L_0x0044:
            java.lang.String r1 = f12.C7970a.m8128b()
            java.lang.String r2 = "THUMBNAIL_DIRPATH://"
            boolean r2 = r12.startsWith(r2)
            java.lang.String r3 = "msgth_"
            if (r2 == 0) goto L_0x005d
            r13 = 23
            java.lang.String r12 = r12.substring(r13)
            java.lang.String r13 = "th_"
            goto L_0x0071
        L_0x005d:
            java.lang.String r2 = "THUMBNAIL_APPMSG_DIR://"
            boolean r2 = r12.startsWith(r2)
            if (r2 == 0) goto L_0x0071
            r13 = 29
            java.lang.String r12 = r12.substring(r13)
            java.lang.String r1 = ld2.C46848g.wx0()
            r6 = r3
            goto L_0x0072
        L_0x0071:
            r6 = r13
        L_0x0072:
            if (r6 == 0) goto L_0x0080
            boolean r13 = r6.equals(r3)
            if (r13 == 0) goto L_0x0080
            java.lang.String r13 = ld2.C46848g.wx0()
            r5 = r13
            goto L_0x0081
        L_0x0080:
            r5 = r1
        L_0x0081:
            java.lang.String r4 = f12.C7970a.m8127a()
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r13 == 0) goto L_0x008d
            r7 = r12
            goto L_0x008e
        L_0x008d:
            r7 = r0
        L_0x008e:
            r9 = 1
            r8 = r14
            r10 = r15
            java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.FilePathGenerator.defGenPathWithOld(r4, r5, r6, r7, r8, r9, r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelimage.C92839m.mo127174TY(java.lang.String, java.lang.String, java.lang.String, boolean):java.lang.String");
    }

    public final String Wa0(String str, String str2, int i) {
        C92836k fY = mo127184fY(str, C1299o.m1389a(str2), i);
        if (Util.isNullOrNil(fY.f267380g)) {
            return null;
        }
        String v102 = v10(fY.f267380g, true);
        if (C86013q1.m106450k(v102)) {
            return v102;
        }
        return null;
    }

    public Bitmap X90(long j, String str, int i, int i2, int i3, boolean z) {
        String str2;
        if (z) {
            str2 = "location_backgroup_key_from" + j;
        } else {
            str2 = "location_backgroup_key_tor" + j;
        }
        Bitmap bitmap = (Bitmap) ((C100301b) this.f267415d).mo139556b(str2);
        if (bitmap != null && !bitmap.isRecycled()) {
            return bitmap;
        }
        Bitmap createLocation = BitmapUtil.createLocation(str, i, i2, i3);
        ((C100301b) this.f267415d).mo139557c(str2, createLocation);
        return createLocation;
    }

    /* renamed from: Yt */
    public boolean mo127177Yt(C72963f4 f4Var, int i, int i2, int i3) {
        String LL = mo127166LL(f4Var);
        if (f4Var != null) {
            Log.m105925i("MicroMsg.ImgInfoStorage", "createHDThumbNail %s %s %s", Long.valueOf(f4Var.getMsgId()), f4Var.mo108765s2(), LL);
        }
        if (Util.isNullOrNil(LL)) {
            return false;
        }
        return mo127169Ow(LL, f4Var.mo108765s2(), i, i2, 0, 0, i3);
    }

    public String b00(String str) {
        return v10(str, true);
    }

    /* renamed from: bD */
    public String mo127179bD(byte[] bArr) {
        if (Util.isNullOrNil(bArr)) {
            Log.m105920e("MicroMsg.ImgInfoStorage", "save dir thumb error, thumbBuf is null");
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        MMBitmapFactory.m98733b(bArr, 0, bArr.length, options);
        if (options.outWidth < 0 || options.outHeight < 0) {
            Log.m105920e("MicroMsg.ImgInfoStorage", "Bad thumbBuf, perhaps it's not complete or damaged ??");
            return null;
        }
        String SE = m117079SE();
        String TY = mo127174TY(SE, "th_", "", true);
        Log.m105918d("MicroMsg.ImgInfoStorage", "saveDirThumb, fullPath = " + TY);
        C86013q1.m106447h(TY);
        C86013q1.m106438T(TY, bArr, 0, bArr.length);
        return "THUMBNAIL_DIRPATH://th_" + SE;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0322: MOVE  (r1v7 int) = (r31v0 int)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:122)
        	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:34)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:73)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:31)
        */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x019c  */
    /* renamed from: bF */
    public final com.tencent.p014mm.modelimage.C92836k mo127180bF(p158gt.C98210z r29, boolean r30, int r31) {
        /*
            r28 = this;
            r10 = r28
            r11 = r29
            r12 = r31
            java.lang.String r0 = r11.f287937b
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            r1 = 0
            if (r0 != 0) goto L_0x0010
            return r1
        L_0x0010:
            java.lang.String r0 = r11.f287937b
            java.lang.String r13 = com.tencent.p014mm.modelimage.C1299o.m1389a(r0)
            com.tencent.mm.pointers.PString r0 = r11.f287942g
            java.lang.String r0 = r0.value
            java.lang.String r1 = r11.f287945j
            r2 = 9
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = r11.f287936a
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = r11.f287937b
            r5 = 1
            r2[r5] = r3
            int r3 = r11.f287939d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6 = 2
            r2[r6] = r3
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r30)
            r7 = 3
            r2[r7] = r3
            int r3 = r11.f287941f
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r7 = 4
            r2[r7] = r3
            com.tencent.mm.pointers.PInt r3 = r11.f287943h
            r7 = 5
            r2[r7] = r3
            com.tencent.mm.pointers.PInt r3 = r11.f287944i
            r7 = 6
            r2[r7] = r3
            r3 = 7
            r2[r3] = r0
            r3 = 8
            r2[r3] = r1
            java.lang.String r14 = "MicroMsg.ImgInfoStorage"
            java.lang.String r3 = "genThumbImg, talker:%s orig:%s compressType:%s needImg:%s rotateCount:%s pThumbWidth:%s pThumbHeight:%s orgThumbPath:%s thumDigest:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r3, r2)
            java.lang.String r2 = r11.f287937b
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r2)
            if (r2 != 0) goto L_0x0074
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.String r1 = r11.f287937b
            r0[r4] = r1
            java.lang.String r1 = "file not exit:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r14, r1, r0)
            r0 = 0
            r12 = r0
            r23 = r13
            goto L_0x02b4
        L_0x0074:
            com.tencent.mm.modelimage.k r2 = r11.f287952q
            java.lang.String r3 = ""
            if (r2 == 0) goto L_0x0092
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r2 == 0) goto L_0x0092
            com.tencent.mm.modelimage.k r0 = r11.f287952q
            java.lang.String r0 = r0.f267380g
            java.lang.String r0 = r10.mo127174TY(r0, r3, r3, r5)
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r2[r4] = r0
            java.lang.String r8 = "set orgThumbPath %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r8, r2)
        L_0x0092:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r2 == 0) goto L_0x009c
            java.lang.String r1 = m117079SE()
        L_0x009c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r8 = "THUMBNAIL_DIRPATH://th_"
            r2.append(r8)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "th_"
            java.lang.String r8 = r10.mo127174TY(r1, r2, r3, r4)
            sg.c r9 = r11.f287949n
            if (r9 != 0) goto L_0x00bc
            java.lang.String r8 = r10.mo127174TY(r1, r2, r3, r5)
        L_0x00bc:
            if (r30 == 0) goto L_0x02b1
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            java.lang.String r3 = "hd"
            if (r2 != 0) goto L_0x0108
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            if (r2 != 0) goto L_0x00cd
            goto L_0x0108
        L_0x00cd:
            com.tencent.p014mm.vfs.C86013q1.m106443d(r0, r8, r5)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r3)
            java.lang.String r0 = r2.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r8)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            boolean r3 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            if (r3 == 0) goto L_0x0102
            com.tencent.p014mm.vfs.C86013q1.m106443d(r0, r2, r5)
            java.lang.Object[] r3 = new java.lang.Object[r6]
            r3[r4] = r0
            r3[r5] = r2
            java.lang.String r0 = "copy hd thumb img hdOrgThumbPath:%s hdThumbPath:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r0, r3)
        L_0x0102:
            r24 = r1
            r23 = r13
            goto L_0x029a
        L_0x0108:
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            java.lang.String r0 = r11.f287936a
            java.lang.String r2 = r11.f287937b
            int r6 = r11.f287939d
            int r9 = r11.f287941f
            com.tencent.mm.pointers.PInt r15 = r11.f287943h
            com.tencent.mm.pointers.PInt r7 = r11.f287944i
            sg.c r12 = r11.f287949n
            r23 = r13
            int r13 = r11.f287951p
            r24 = r1
            r1 = 6
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r16 = 0
            r1[r16] = r0
            r16 = 1
            r1[r16] = r2
            java.lang.Integer r16 = java.lang.Integer.valueOf(r6)
            r17 = 2
            r1[r17] = r16
            java.lang.Boolean r16 = java.lang.Boolean.TRUE
            r17 = 3
            r1[r17] = r16
            com.tencent.mm.sdk.platformtools.MMStack r16 = com.tencent.p014mm.sdk.platformtools.Util.getStack()
            r17 = 4
            r1[r17] = r16
            r16 = 5
            r1[r16] = r8
            r25 = r4
            java.lang.String r4 = "summersafecdn getPreSendBitmap talker[%s] origPath[%s], compressType[%d],needSave[%b], stack[%s], thumbPath: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r4, r1)
            sg.g<java.lang.String, android.graphics.Bitmap> r1 = r10.f267415d
            java.lang.String r4 = com.tencent.p014mm.modelimage.C1299o.m1389a(r2)
            o90.b r1 = (o90.C100301b) r1
            java.lang.Object r1 = r1.mo139556b(r4)
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            if (r1 == 0) goto L_0x0166
            boolean r4 = r1.isRecycled()
            if (r4 == 0) goto L_0x0164
            goto L_0x0166
        L_0x0164:
            r4 = 0
            goto L_0x01ac
        L_0x0166:
            java.lang.String r4 = r10.Wa0(r0, r2, r6)
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r5 != 0) goto L_0x017c
            boolean r5 = r4.endsWith(r3)
            if (r5 == 0) goto L_0x0178
            r5 = r4
            goto L_0x017d
        L_0x0178:
            android.graphics.Bitmap r1 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getBitmapNative((java.lang.String) r4)
        L_0x017c:
            r5 = r2
        L_0x017d:
            if (r1 == 0) goto L_0x0185
            boolean r16 = r1.isRecycled()
            if (r16 == 0) goto L_0x01ac
        L_0x0185:
            int r1 = com.tencent.p014mm.sdk.platformtools.LongBitmapHandler.isLongPicture((java.lang.String) r5)
            int r16 = com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil.ExifHelper.getExifOrientation(r5)
            int r9 = r9 * 90
            int r9 = r16 + r9
            if (r1 <= 0) goto L_0x019c
            android.graphics.Bitmap r1 = com.tencent.p014mm.sdk.platformtools.LongBitmapHandler.createLongPictureBitmap(r5, r1, r9)
            android.graphics.Bitmap r1 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.drawBackgroundInNeed(r1, r5, r13)
            goto L_0x01ac
        L_0x019c:
            r18 = 120(0x78, float:1.68E-43)
            r19 = 120(0x78, float:1.68E-43)
            r20 = 1
            r21 = 0
            r17 = r5
            r22 = r13
            android.graphics.Bitmap r1 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.createThumbBitmap(r17, r18, r19, r20, r21, r22)
        L_0x01ac:
            if (r1 == 0) goto L_0x0258
            sg.g<java.lang.String, android.graphics.Bitmap> r5 = r10.f267415d
            java.lang.String r9 = com.tencent.p014mm.modelimage.C1299o.m1389a(r2)
            o90.b r5 = (o90.C100301b) r5
            r5.mo139557c(r9, r1)
            int r5 = r1.getWidth()
            r15.value = r5
            int r5 = r1.getHeight()
            r7.value = r5
            if (r4 != 0) goto L_0x01cb
            java.lang.String r4 = r10.Wa0(r0, r2, r6)
        L_0x01cb:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r0 != 0) goto L_0x01e2
            boolean r0 = r4.endsWith(r3)
            if (r0 == 0) goto L_0x01e2
            int r0 = r4.length()
            int r0 = r0 + -2
            r2 = 0
            java.lang.String r4 = r4.substring(r2, r0)
        L_0x01e2:
            if (r12 == 0) goto L_0x01e7
            r12.mo141082a()
        L_0x01e7:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r0 != 0) goto L_0x020f
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r4)
            if (r0 == 0) goto L_0x020f
            long r5 = com.tencent.p014mm.vfs.C86013q1.m106451l(r4)
            r12 = 0
            int r0 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x020f
            com.tencent.p014mm.vfs.C86013q1.m106442c(r4, r8)
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r4
            r1 = 1
            r0[r1] = r8
            java.lang.String r1 = "copy from old thumbPath %s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r1, r0)
            goto L_0x0258
        L_0x020f:
            r0 = 1
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r2 != 0) goto L_0x022f
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r4)
            if (r2 == 0) goto L_0x022f
            java.lang.Object[] r0 = new java.lang.Object[r0]
            long r5 = com.tencent.p014mm.vfs.C86013q1.m106451l(r4)
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            r5 = 0
            r0[r5] = r2
            java.lang.String r2 = "oldThumbFile Length %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r2, r0)
        L_0x022f:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)     // Catch:{ IOException -> 0x0257 }
            if (r0 != 0) goto L_0x023d
            boolean r0 = r4.endsWith(r3)     // Catch:{ IOException -> 0x0257 }
            if (r0 == 0) goto L_0x023d
            r0 = 1
            goto L_0x023e
        L_0x023d:
            r0 = 0
        L_0x023e:
            if (r0 == 0) goto L_0x0243
            r0 = 80
            goto L_0x0245
        L_0x0243:
            r0 = 90
        L_0x0245:
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ IOException -> 0x0257 }
            r3 = 0
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToImage(r1, r0, r2, r8, r3)     // Catch:{ IOException -> 0x0257 }
            java.lang.String r0 = "saveBitmapToImage thumbPath %s"
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ IOException -> 0x0257 }
            r1[r3] = r8     // Catch:{ IOException -> 0x0257 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r0, r1)     // Catch:{ IOException -> 0x0257 }
            goto L_0x0258
        L_0x0257:
        L_0x0258:
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r8)
            if (r0 == 0) goto L_0x0295
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1 = 10921(0x2aa9, float:1.5304E-41)
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            long r3 = com.tencent.p014mm.vfs.C86013q1.m106451l(r8)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = r11.f287937b
            long r3 = com.tencent.p014mm.vfs.C86013q1.m106451l(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r4 = 1
            r2[r4] = r3
            r3 = 90
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 2
            r2[r4] = r3
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r25)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r4 = 3
            r2[r4] = r3
            r0.mo160131h(r1, r2)
            goto L_0x029a
        L_0x0295:
            java.lang.String r0 = " thumbImg not exits"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r0)
        L_0x029a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "insert: thumbName = "
            r0.append(r1)
            r1 = r24
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r14, r0)
            goto L_0x02b3
        L_0x02b1:
            r23 = r13
        L_0x02b3:
            r12 = r1
        L_0x02b4:
            r29.getClass()
            java.lang.String r8 = r11.f287946k
            sg.c r9 = r11.f287948m
            r29.getClass()
            com.tencent.mm.pointers.PString r13 = new com.tencent.mm.pointers.PString
            r13.<init>()
            com.tencent.mm.pointers.PString r15 = new com.tencent.mm.pointers.PString
            r15.<init>()
            com.tencent.mm.pointers.PString r7 = new com.tencent.mm.pointers.PString
            r7.<init>()
            com.tencent.mm.pointers.PString r6 = new com.tencent.mm.pointers.PString
            r6.<init>()
            r5 = 5
            r4 = 2
            r0 = r28
            r1 = r29
            r2 = r23
            r3 = r30
            r16 = r12
            r12 = 2
            r4 = r15
            r12 = 5
            r5 = r13
            r18 = r6
            r6 = r7
            r27 = r7
            r7 = r18
            java.lang.String r0 = r0.mo127191mI(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object[] r1 = new java.lang.Object[r12]
            java.lang.String r2 = r11.f287937b
            r3 = 0
            r1[r3] = r2
            int r2 = r11.f287940e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 1
            r1[r3] = r2
            int r2 = r11.f287939d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 2
            r1[r3] = r2
            r2 = r27
            java.lang.String r3 = r2.value
            r4 = 3
            r1[r4] = r3
            r3 = r18
            java.lang.String r3 = r3.value
            r5 = 4
            r1[r5] = r3
            java.lang.String r3 = "summersafecdn user change CompressType path %s, source:%d, compressType:%d, pMidImgName[%s], pMidImgPath[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r3, r1)
            long r6 = r11.f287947l
            r8 = 0
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 > 0) goto L_0x032c
            r1 = r31
            if (r1 > 0) goto L_0x0327
            goto L_0x032c
        L_0x0327:
            com.tencent.mm.modelimage.k r1 = r10.mo127173TO(r1)
            goto L_0x033f
        L_0x032c:
            com.tencent.mm.modelimage.k r1 = new com.tencent.mm.modelimage.k
            r1.<init>()
            java.lang.String r3 = r11.f287936a
            long r6 = r10.mo127192mL(r3)
            r1.mo127154y(r6)
            long r6 = r11.f287947l
            r1.mo127124A(r6)
        L_0x033f:
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r3 != 0) goto L_0x0348
            r1.mo127148s(r0)
        L_0x0348:
            r0 = 0
            r1.mo127153x(r0)
            int r0 = r11.f287940e
            r1.f267391r = r0
            r3 = 1
            r1.f267365H = r3
            if (r0 != r5) goto L_0x036c
            java.lang.String r0 = r11.f287937b
            java.lang.String r5 = com.tencent.p014mm.storage.C85802w1.m106019a()
            boolean r0 = r0.startsWith(r5)
            if (r0 == 0) goto L_0x0366
            r1.f267382i = r4
            r1.f267371N = r3
            goto L_0x0370
        L_0x0366:
            r0 = 2
            r1.f267382i = r0
            r1.f267371N = r3
            goto L_0x0370
        L_0x036c:
            r1.f267382i = r3
            r1.f267371N = r3
        L_0x0370:
            if (r30 == 0) goto L_0x03d5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = r15.value
            r0.append(r3)
            java.lang.String r3 = ".jpg"
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r1.mo127147r(r0)
            java.lang.String r0 = r2.value
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x03a4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r2.value
            r0.append(r2)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r1.mo127155z(r0)
        L_0x03a4:
            java.lang.String r0 = r1.f267380g
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x03b1
            r0 = r16
            r1.mo127128E(r0)
        L_0x03b1:
            java.lang.String r0 = r13.value
            long r2 = com.tencent.p014mm.vfs.C86013q1.m106451l(r0)
            int r0 = (int) r2
            r1.mo127129F(r0)
            int r0 = r1.f267377d
            if (r0 != 0) goto L_0x03ce
            r0 = 1
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.String r3 = r13.value
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = "thumb file totlen is 0 %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r3, r2)
            goto L_0x03cf
        L_0x03ce:
            r0 = 1
        L_0x03cf:
            r2 = r23
            r1.f267385l = r2
            r1.f267369L = r0
        L_0x03d5:
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            int r0 = (int) r2
            r1.mo127150u(r0)
            int r0 = r11.f287939d
            r1.mo127149t(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "fromPathToImgInfo insert: compress img size = "
            r0.append(r2)
            int r2 = r1.f267377d
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r14, r0)
            com.tencent.mm.modelimage.k r0 = r11.f287952q
            if (r0 == 0) goto L_0x040e
            com.tencent.mm.autogen.events.WxFileIndexDirtyEvent r0 = new com.tencent.mm.autogen.events.WxFileIndexDirtyEvent
            r0.<init>()
            com.tencent.mm.autogen.events.WxFileIndexDirtyEvent$a r2 = r0.f79070d
            com.tencent.mm.modelimage.k r3 = r11.f287952q
            long r3 = r3.f267387n
            r2.f79071a = r3
            java.lang.String r2 = "CopyImgFileLink"
            r0.asyncPublish((java.lang.String) r2)
        L_0x040e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelimage.C92839m.mo127180bF(gt.z, boolean, int):com.tencent.mm.modelimage.k");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: com.tencent.mm.modelimage.k} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v2, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003d, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
        r4 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0066, code lost:
        r4.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d A[ExcHandler: all (th java.lang.Throwable), Splitter:B:4:0x002b] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0066  */
    /* renamed from: bO */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.p014mm.modelimage.C92836k mo127181bO(int r14) {
        /*
            r13 = this;
            long r0 = (long) r14
            r2 = 0
            r3 = 1
            r4 = 0
            java.lang.String r6 = com.tencent.p014mm.modelimage.C92839m.C92844e.m117105a(r0)     // Catch:{ Exception -> 0x004c }
            r7 = 0
            java.lang.String r8 = "reserved1=?"
            java.lang.String[] r9 = new java.lang.String[r3]     // Catch:{ Exception -> 0x004c }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x004c }
            r0.<init>()     // Catch:{ Exception -> 0x004c }
            r0.append(r14)     // Catch:{ Exception -> 0x004c }
            java.lang.String r14 = ""
            r0.append(r14)     // Catch:{ Exception -> 0x004c }
            java.lang.String r14 = r0.toString()     // Catch:{ Exception -> 0x004c }
            r9[r2] = r14     // Catch:{ Exception -> 0x004c }
            r10 = 0
            r11 = 0
            r12 = 0
            r5 = r13
            android.database.Cursor r14 = r5.vx0(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x004c }
            if (r14 == 0) goto L_0x0044
            boolean r0 = r14.moveToFirst()     // Catch:{ Exception -> 0x0040, all -> 0x003d }
            if (r0 == 0) goto L_0x0044
            com.tencent.mm.modelimage.k r0 = new com.tencent.mm.modelimage.k     // Catch:{ Exception -> 0x0040, all -> 0x003d }
            r0.<init>()     // Catch:{ Exception -> 0x0040, all -> 0x003d }
            r0.mo127131b(r14)     // Catch:{ Exception -> 0x003b, all -> 0x003d }
            r4 = r0
            goto L_0x0044
        L_0x003b:
            r1 = move-exception
            goto L_0x0042
        L_0x003d:
            r0 = move-exception
            r4 = r14
            goto L_0x0064
        L_0x0040:
            r1 = move-exception
            r0 = r4
        L_0x0042:
            r4 = r14
            goto L_0x004e
        L_0x0044:
            if (r14 == 0) goto L_0x0063
            r14.close()
            goto L_0x0063
        L_0x004a:
            r0 = move-exception
            goto L_0x0064
        L_0x004c:
            r1 = move-exception
            r0 = r4
        L_0x004e:
            java.lang.String r14 = "MicroMsg.ImgInfoStorage"
            java.lang.String r5 = "Exception :%s"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x004a }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x004a }
            r3[r2] = r1     // Catch:{ all -> 0x004a }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r14, r5, r3)     // Catch:{ all -> 0x004a }
            if (r4 == 0) goto L_0x0062
            r4.close()
        L_0x0062:
            r4 = r0
        L_0x0063:
            return r4
        L_0x0064:
            if (r4 == 0) goto L_0x0069
            r4.close()
        L_0x0069:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelimage.C92839m.mo127181bO(int):com.tencent.mm.modelimage.k");
    }

    public String c40(String str, boolean z, boolean z2) {
        if (str != null && ((HashMap) this.f267422n).containsKey(str)) {
            return (String) ((HashMap) this.f267422n).get(str);
        }
        String v102 = z ? str : v10(str, z2);
        if (!Util.isNullOrNil(v102)) {
            ((HashMap) this.f267422n).put(str, v102);
        }
        return v102;
    }

    public final void cx0(ImageView imageView, ImageView imageView2, View view, String str, float f, boolean z, int i) {
        int i2;
        C92842c cVar;
        int i3;
        int hashCode = str.hashCode();
        int hashCode2 = imageView.hashCode();
        Iterator it = ((ArrayList) this.f267416e).iterator();
        do {
            int i4 = 0;
            if (it.hasNext()) {
                cVar = (C92842c) it.next();
                i3 = cVar.f267426a;
            } else {
                ((HashMap) this.f267417f).put(Integer.valueOf(hashCode2), new WeakReference(imageView));
                if (imageView2 != null) {
                    i2 = imageView2.hashCode();
                    ((HashMap) this.f267418g).put(Integer.valueOf(i2), new WeakReference(imageView2));
                } else {
                    i2 = 0;
                }
                if (view != null) {
                    i4 = view.hashCode();
                    ((HashMap) this.f267419h).put(Integer.valueOf(i4), new WeakReference(view));
                }
                ((ArrayList) this.f267416e).add(new C92842c(hashCode2, str, i2, i4));
                if (!((HashSet) this.f267420i).contains(Integer.valueOf(hashCode))) {
                    ((HashSet) this.f267420i).add(Integer.valueOf(hashCode));
                    C86709a0.m107528h();
                    C86709a0.m107525e().postToWorker(new C92846n(this, str, f, z, i));
                    return;
                }
                return;
            }
        } while (hashCode2 != i3);
        Log.m105925i("MicroMsg.ImgInfoStorage", "setbitmapFromUri  [%d, %s] ", Integer.valueOf(i3), cVar.f267427b);
        cVar.f267427b = str;
        if (!((HashSet) this.f267420i).contains(Integer.valueOf(hashCode))) {
            ((HashSet) this.f267420i).add(Integer.valueOf(hashCode));
            C86709a0.m107528h();
            C86709a0.m107525e().postToWorker(new C92846n(this, str, f, z, i));
        }
    }

    /* renamed from: fY */
    public C92836k mo127184fY(String str, String str2, int i) {
        C92836k kVar = new C92836k();
        String b = C92844e.m117106b(str);
        Cursor wx02 = wx0(b, (String[]) null, "origImgMD5=? AND compressType=?", new String[]{"" + str2, i + ""}, (String) null, (String) null, (String) null, false);
        if (wx02.moveToFirst()) {
            kVar.mo127131b(wx02);
        }
        wx02.close();
        return kVar;
    }

    public Bitmap fq0(String str, float f, Context context, int i) {
        int i2;
        int i3;
        float f2 = f;
        int i4 = i;
        Bitmap bitmap = null;
        if (str == null || str.length() <= 0) {
            return null;
        }
        String trim = str.trim();
        Bitmap bitmap2 = (Bitmap) ((C100301b) this.f267415d).mo139556b(trim);
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            return bitmap2;
        }
        Bitmap decodeFile = BackwardSupportUtil.BitmapFactory.decodeFile(trim, f2);
        if (decodeFile == null) {
            return decodeFile;
        }
        int width = decodeFile.getWidth();
        int height = decodeFile.getHeight();
        if (width >= height) {
            i3 = Math.round(f2 * ((float) 150));
            i2 = (int) ((((float) height) / ((float) width)) * ((float) i3));
        } else {
            int round = Math.round(f2 * ((float) 150));
            int i5 = (int) ((((float) width) / ((float) height)) * ((float) round));
            i2 = round;
            i3 = i5;
        }
        if (i3 <= 0 || i2 <= 0 || i3 > 2048 || i2 > 2048) {
            Log.m105921e("MicroMsg.ImgInfoStorage", "getVideoThumb, error Scale Size %d*%d", Integer.valueOf(i3), Integer.valueOf(i2));
            C115669n.INSTANCE.idkeyStat(111, 188, 1, false);
        } else {
            try {
                bitmap = Bitmap.createScaledBitmap(decodeFile, i3, i2, true);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.ImgInfoStorage", "getVideoThumb, Bitmap.createScaledBitmap Exception:%s", e.getMessage());
                C115669n.INSTANCE.idkeyStat(111, 188, 1, false);
            }
        }
        Bitmap createChattingImage = i4 != -1 ? BitmapUtil.createChattingImage(bitmap, i4) : bitmap;
        if (decodeFile != createChattingImage) {
            Log.m105925i("MicroMsg.ImgInfoStorage", "[getVideoThumb] bitmap:%s", decodeFile.toString());
            decodeFile.recycle();
        }
        Log.m105918d("MicroMsg.ImgInfoStorage", "cached file " + trim);
        ((C100301b) this.f267415d).mo139557c(trim, createChattingImage);
        return createChattingImage;
    }

    /* renamed from: gY */
    public String mo127186gY(String str, String str2, String str3) {
        return mo127174TY(str, str2, str3, true);
    }

    public String h30(String str) {
        return c40(str, false, true);
    }

    /* renamed from: jo */
    public Bitmap mo127188jo(String str, float f, boolean z) {
        return mo127196qq(str, false, f, z, false, false, -1, true);
    }

    /* renamed from: kD */
    public String mo127189kD(byte[] bArr) {
        if (Util.isNullOrNil(bArr)) {
            Log.m105920e("MicroMsg.ImgInfoStorage", "directSaveThumbBufForAppMsg save dir thumb error, thumbBuf is null");
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        MMBitmapFactory.m98733b(bArr, 0, bArr.length, options);
        if (options.outWidth < 0 || options.outHeight < 0) {
            Log.m105920e("MicroMsg.ImgInfoStorage", "directSaveThumbBufForAppMsg Bad thumbBuf, perhaps it's not complete or damaged ??");
            return null;
        }
        String SE = m117079SE();
        String TY = mo127174TY(SE, "msgth_", "", true);
        Log.m105918d("MicroMsg.ImgInfoStorage", "directSaveThumbBufForAppMsg, fullPath = " + TY);
        C86013q1.m106447h(TY);
        C86013q1.m106438T(TY, bArr, 0, bArr.length);
        return "THUMBNAIL_APPMSG_DIR://msgth_" + SE;
    }

    public List<C92836k> ko0() {
        ArrayList arrayList = new ArrayList();
        Iterator<C92843d> it = C92844e.f267435a.iterator();
        while (it.hasNext()) {
            Cursor rawQuery = this.f267423o.rawQuery(("select * " + " FROM " + it.next().f267430a) + " WHERE iscomplete= 0 AND totalLen != 0 ", (String[]) null);
            if (!rawQuery.moveToFirst()) {
                rawQuery.close();
            } else {
                do {
                    C92836k kVar = new C92836k();
                    kVar.mo127131b(rawQuery);
                    C92836k bO = mo127181bO((int) kVar.f267374a);
                    if (bO != null) {
                        if (!(bO.f267375b == 0 && bO.f267387n == 0)) {
                            arrayList.add(kVar);
                        }
                    } else if (!(kVar.f267375b == 0 && kVar.f267387n == 0)) {
                        arrayList.add(kVar);
                    }
                } while (rawQuery.moveToNext());
                rawQuery.close();
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:204:0x0616  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0645  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x06ac  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x06af  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x06b2  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x06b5  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x06de  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x06e1  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x07a5  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x07a7  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x07b1 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:261:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:263:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0270  */
    /* renamed from: mI */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo127191mI(p158gt.C98210z r50, java.lang.String r51, boolean r52, com.tencent.p014mm.pointers.PString r53, com.tencent.p014mm.pointers.PString r54, com.tencent.p014mm.pointers.PString r55, com.tencent.p014mm.pointers.PString r56, java.lang.String r57, p823sg.C101610c r58) {
        /*
            r49 = this;
            r1 = r49
            r2 = r50
            r0 = r51
            r3 = r53
            r4 = r54
            r5 = r55
            r6 = r56
            java.lang.Class<h81.h> r16 = h81.C32735h.class
            java.lang.Class<z51.i> r7 = z51.C102975i.class
            java.lang.Class<lc3.b> r17 = lc3.C10485b.class
            java.lang.String r8 = r2.f287936a
            java.lang.String r15 = r2.f287937b
            int r14 = r2.f287939d
            com.tencent.mm.pointers.PString r9 = r2.f287942g
            java.lang.String r9 = r9.value
            int r13 = r2.f287951p
            r12 = 5
            java.lang.Object[] r10 = new java.lang.Object[r12]
            r11 = 0
            r10[r11] = r15
            r12 = 1
            r10[r12] = r0
            java.lang.Integer r19 = java.lang.Integer.valueOf(r14)
            r12 = 2
            r10[r12] = r19
            r11 = 3
            r10[r11] = r9
            r9 = 4
            r10[r9] = r57
            java.lang.String r9 = "MicroMsg.ImgInfoStorage"
            java.lang.String r11 = "genBigImg orig:%s md5:%s compressType:%s orgThumbPath:%s dstName:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r11, r10)
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r57)
            if (r10 == 0) goto L_0x0055
            java.lang.String r10 = m117080TE(r15)
            java.lang.Object[] r11 = new java.lang.Object[r12]
            r12 = 0
            r11[r12] = r10
            r12 = 1
            r11[r12] = r15
            java.lang.String r12 = "genBigImg generateMd5: %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r12, r11)
            goto L_0x0057
        L_0x0055:
            r10 = r57
        L_0x0057:
            java.lang.String r11 = ""
            java.lang.String r12 = ".jpg"
            r2 = 0
            java.lang.String r24 = r1.mo127174TY(r10, r11, r12, r2)
            r2 = 1
            if (r58 != 0) goto L_0x0067
            java.lang.String r24 = r1.mo127174TY(r10, r11, r12, r2)
        L_0x0067:
            r57 = r12
            r12 = r24
            if (r14 != r2) goto L_0x006f
            r2 = 1
            goto L_0x0070
        L_0x006f:
            r2 = 0
        L_0x0070:
            di3.d r24 = di3.C86312j.m106911c(r7)
            z51.i r24 = (z51.C102975i) r24
            boolean r24 = r24.hq0()
            if (r24 == 0) goto L_0x0081
            if (r2 != 0) goto L_0x0081
            r24 = 1
            goto L_0x0083
        L_0x0081:
            r24 = 0
        L_0x0083:
            di3.d r25 = di3.C86312j.m106911c(r7)
            r6 = r25
            z51.i r6 = (z51.C102975i) r6
            java.lang.String r6 = r6.mo141702wt(r12)
            r5 = 6
            r25 = r13
            java.lang.Object[] r13 = new java.lang.Object[r5]
            r19 = 0
            r13[r19] = r8
            r20 = 1
            r13[r20] = r12
            r23 = 2
            r13[r23] = r15
            r22 = 3
            r13[r22] = r0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r21 = 4
            r13[r21] = r2
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r24)
            r18 = 5
            r13[r18] = r2
            java.lang.String r2 = "talker:%s fullPath:%s orig:%s md5:%s sendOrig:%s enableHevc:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r2, r13)
            long r26 = com.tencent.p014mm.vfs.C86013q1.m106451l(r12)
            r28 = 0
            r2 = 944(0x3b0, float:1.323E-42)
            r13 = 8
            int r30 = (r26 > r28 ? 1 : (r26 == r28 ? 0 : -1))
            if (r30 <= 0) goto L_0x00d2
            java.lang.String r5 = "genBigImg file already exist!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r5)
            com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r5.mo175911u(r2, r13)
        L_0x00d2:
            r3.value = r10
            r4.value = r12
            r5 = 0
            if (r52 == 0) goto L_0x016b
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r51)
            if (r10 != 0) goto L_0x016b
            if (r14 != 0) goto L_0x016b
            com.tencent.mm.modelimage.k r0 = r1.mo127184fY(r8, r0, r14)
            java.lang.String r8 = r0.f267378e
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r8 != 0) goto L_0x016b
            java.lang.String r8 = r0.f267378e
            r10 = 1
            java.lang.String r8 = r1.mo127174TY(r8, r11, r11, r10)
            if (r58 == 0) goto L_0x00f9
            r58.mo141082a()
        L_0x00f9:
            com.tencent.p014mm.vfs.C86013q1.m106442c(r8, r12)
            r13 = 2
            java.lang.Object[] r2 = new java.lang.Object[r13]
            r13 = 0
            r2[r13] = r8
            r2[r10] = r12
            java.lang.String r10 = "copy bigImg  %s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r10, r2)
            long r31 = com.tencent.p014mm.vfs.C86013q1.m106451l(r8)
            int r2 = (r31 > r28 ? 1 : (r31 == r28 ? 0 : -1))
            if (r2 <= 0) goto L_0x015d
            if (r24 == 0) goto L_0x0151
            di3.d r2 = di3.C86312j.m106911c(r7)
            z51.i r2 = (z51.C102975i) r2
            java.lang.String r2 = r2.mo141702wt(r8)
            boolean r3 = com.tencent.p014mm.vfs.C86013q1.m106450k(r2)
            if (r3 == 0) goto L_0x0135
            com.tencent.p014mm.vfs.C86013q1.m106442c(r2, r6)
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r2
            r2 = 1
            r3[r2] = r6
            java.lang.String r2 = "copy hevc  %s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r2, r3)
            goto L_0x0151
        L_0x0135:
            android.graphics.BitmapFactory$Options r2 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getImageOptions(r12)
            if (r2 == 0) goto L_0x0151
            int r3 = r2.outWidth
            if (r3 <= 0) goto L_0x0151
            int r3 = r2.outHeight
            if (r3 > 0) goto L_0x0144
            goto L_0x0151
        L_0x0144:
            di3.d r3 = di3.C86312j.m106911c(r7)
            z51.i r3 = (z51.C102975i) r3
            int r4 = r2.outWidth
            int r2 = r2.outHeight
            r3.Gq0(r15, r6, r4, r2)
        L_0x0151:
            java.lang.String r2 = r0.f267393t
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x015c
            java.lang.String r0 = r0.f267393t
            return r0
        L_0x015c:
            return r5
        L_0x015d:
            r2 = 2
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r2 = 0
            r0[r2] = r15
            r2 = 1
            r0[r2] = r12
            java.lang.String r2 = "ERR: copy old match file failed ,:%s ,%s "
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r9, r2, r0)
        L_0x016b:
            int r2 = com.tencent.p014mm.modelimage.C92806b.m116991e()
            android.graphics.Point r0 = com.tencent.p014mm.modelimage.C92806b.m116990d()
            int r7 = r0.x
            int r8 = r0.y
            r31 = 100
            k40.a r0 = f40.C86709a0.m107533q(r17)     // Catch:{ Exception -> 0x01fa }
            lc3.b r0 = (lc3.C10485b) r0     // Catch:{ Exception -> 0x01fa }
            pj.f r0 = r0.vh0()     // Catch:{ Exception -> 0x01fa }
            java.lang.String r13 = "UseOptImage"
            java.lang.String r0 = r0.mo107405c(r13)     // Catch:{ Exception -> 0x01fa }
            r13 = 0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r13)     // Catch:{ Exception -> 0x01fa }
            sg.q r13 = new sg.q     // Catch:{ Exception -> 0x01fa }
            f40.e r33 = f40.C86709a0.m107523b()     // Catch:{ Exception -> 0x01fa }
            int r5 = r33.mo121110g()     // Catch:{ Exception -> 0x01fa }
            r13.<init>((int) r5)     // Catch:{ Exception -> 0x01fa }
            long r34 = r13.longValue()     // Catch:{ Exception -> 0x01fa }
            r5 = r11
            long r10 = r34 / r31
            int r11 = (int) r10     // Catch:{ Exception -> 0x01f6 }
            r10 = 100
            int r11 = r11 % r10
            r10 = 1
            int r11 = r11 + r10
            if (r11 > r0) goto L_0x01ac
            r10 = 1
            goto L_0x01ad
        L_0x01ac:
            r10 = 0
        L_0x01ad:
            java.lang.String r11 = "fromPathToImgInfo useOpt:%b opt:%d uin:(%d,%d) debug:%b sdk:%d"
            r33 = r5
            r1 = 6
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x01f4 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r10)     // Catch:{ Exception -> 0x01f4 }
            r19 = 0
            r5[r19] = r1     // Catch:{ Exception -> 0x01f4 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x01f4 }
            r1 = 1
            r5[r1] = r0     // Catch:{ Exception -> 0x01f4 }
            long r0 = r13.longValue()     // Catch:{ Exception -> 0x01f4 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x01f4 }
            r1 = 2
            r5[r1] = r0     // Catch:{ Exception -> 0x01f4 }
            long r0 = r13.longValue()     // Catch:{ Exception -> 0x01f4 }
            long r0 = r0 / r31
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x01f4 }
            r1 = 3
            r5[r1] = r0     // Catch:{ Exception -> 0x01f4 }
            boolean r0 = com.tencent.p014mm.sdk.crash.CrashReportFactory.hasDebuger()     // Catch:{ Exception -> 0x01f4 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x01f4 }
            r1 = 4
            r5[r1] = r0     // Catch:{ Exception -> 0x01f4 }
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x01f4 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x01f4 }
            r1 = 5
            r5[r1] = r0     // Catch:{ Exception -> 0x01f4 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r11, r5)     // Catch:{ Exception -> 0x01f4 }
            r1 = 0
            goto L_0x020d
        L_0x01f4:
            r0 = move-exception
            goto L_0x01fd
        L_0x01f6:
            r0 = move-exception
            r33 = r5
            goto L_0x01fd
        L_0x01fa:
            r0 = move-exception
            r33 = r11
        L_0x01fd:
            r1 = 1
            java.lang.Object[] r5 = new java.lang.Object[r1]
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
            r1 = 0
            r5[r1] = r0
            java.lang.String r0 = "get useopt :%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r9, r0, r5)
            r10 = 0
        L_0x020d:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger()
            r5 = 2
            if (r0 == 0) goto L_0x0215
            r10 = 1
        L_0x0215:
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            r0[r1] = r5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r5 = 1
            r0[r5] = r1
            java.lang.String r1 = "genBigImg configLong:%d configShort:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r1, r0)
            k40.a r0 = f40.C86709a0.m107533q(r17)
            lc3.b r0 = (lc3.C10485b) r0
            pj.f r0 = r0.vh0()
            java.lang.String r1 = "PicCompressAvoidanceRemainderPerc"
            java.lang.String r0 = r0.mo107405c(r1)
            r1 = 10
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r1)
            if (r0 <= 0) goto L_0x0245
            r5 = 100
            if (r0 < r5) goto L_0x0247
        L_0x0245:
            r0 = 10
        L_0x0247:
            int r5 = com.tencent.p014mm.sdk.platformtools.MMNativeJpeg.queryQuality(r15)
            r7 = 5
            java.lang.Object[] r8 = new java.lang.Object[r7]
            r7 = 0
            r8[r7] = r15
            r7 = 1
            r8[r7] = r12
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r52)
            r11 = 2
            r8[r11] = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r14)
            r11 = 3
            r8[r11] = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            r11 = 4
            r8[r11] = r7
            java.lang.String r7 = "genBigImg insert : original img path: %s, fullpath:%s, needimg:%b,comresstype:%d Avoidance[%d] "
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r9, r7, r8)
            if (r52 == 0) goto L_0x093c
            android.graphics.BitmapFactory$Options r7 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getImageOptions(r15)
            if (r7 == 0) goto L_0x0920
            int r8 = r7.outWidth
            if (r8 == 0) goto L_0x0920
            int r8 = r7.outHeight
            if (r8 != 0) goto L_0x0285
            r3 = r9
            r27 = r15
            r1 = 2
            r8 = 0
            goto L_0x0925
        L_0x0285:
            com.tencent.mm.modelimage.b$a r8 = com.tencent.p014mm.modelimage.C92806b.m116989c(r15)
            int r13 = r8.f267238a
            int r11 = r8.f267239b
            int r1 = r8.f267241d
            int r8 = r8.f267240c
            java.lang.String r7 = r7.outMimeType
            long r35 = com.tencent.p014mm.vfs.C86013q1.m106451l(r15)
            boolean r37 = com.tencent.p014mm.sdk.platformtools.MMNativeJpeg.IsJpegFile(r15)
            r38 = r10
            if (r7 == 0) goto L_0x02cd
            java.lang.String r10 = "jpeg"
            boolean r10 = r7.endsWith(r10)
            if (r10 != 0) goto L_0x02ca
            java.lang.String r10 = "jpg"
            boolean r10 = r7.endsWith(r10)
            if (r10 != 0) goto L_0x02ca
            java.lang.String r10 = "bmp"
            boolean r10 = r7.endsWith(r10)
            if (r10 != 0) goto L_0x02ca
            java.lang.String r10 = "png"
            boolean r10 = r7.endsWith(r10)
            if (r10 != 0) goto L_0x02ca
            java.lang.String r10 = "gif"
            boolean r10 = r7.endsWith(r10)
            if (r10 == 0) goto L_0x02cd
        L_0x02ca:
            r4 = 6
            r10 = 1
            goto L_0x02cf
        L_0x02cd:
            r4 = 6
            r10 = 0
        L_0x02cf:
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.Integer r26 = java.lang.Integer.valueOf(r11)
            r19 = 0
            r3[r19] = r26
            java.lang.Integer r26 = java.lang.Integer.valueOf(r13)
            r20 = 1
            r3[r20] = r26
            java.lang.Integer r26 = java.lang.Integer.valueOf(r1)
            r23 = 2
            r3[r23] = r26
            java.lang.Integer r26 = java.lang.Integer.valueOf(r8)
            r22 = 3
            r3[r22] = r26
            java.lang.Long r26 = java.lang.Long.valueOf(r35)
            r21 = 4
            r3[r21] = r26
            r18 = 5
            r3[r18] = r7
            java.lang.String r7 = "genBigImg [%d, %d] -> target:[h,w]:[%d,%d], fileSize:%s, mime:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r7, r3)
            r3 = 9
            if (r14 != 0) goto L_0x0443
            int r4 = com.tencent.p014mm.modelimage.C92806b.m116988b()
            r39 = r8
            long r7 = (long) r4
            int r4 = (r35 > r7 ? 1 : (r35 == r7 ? 0 : -1))
            if (r4 <= 0) goto L_0x0440
            r4 = 55
            if (r5 < r4) goto L_0x031b
            if (r37 != 0) goto L_0x0318
            goto L_0x031b
        L_0x0318:
            r4 = r38
            goto L_0x031c
        L_0x031b:
            r4 = 0
        L_0x031c:
            if (r4 == 0) goto L_0x0321
            r7 = 18
            goto L_0x0323
        L_0x0321:
            r7 = 8
        L_0x0323:
            long r40 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            long r42 = com.tencent.p014mm.vfs.C86013q1.m106451l(r6)
            int r8 = (r42 > r28 ? 1 : (r42 == r28 ? 0 : -1))
            if (r8 <= 0) goto L_0x033c
            com.tencent.mm.plugin.report.service.n r8 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r33 = r7
            r7 = 944(0x3b0, float:1.323E-42)
            r8.mo175911u(r7, r3)
            com.tencent.p014mm.vfs.C86013q1.m106447h(r6)
            goto L_0x033e
        L_0x033c:
            r33 = r7
        L_0x033e:
            if (r58 == 0) goto L_0x0343
            r58.mo141082a()
        L_0x0343:
            com.tencent.mm.pointers.PBool r7 = new com.tencent.mm.pointers.PBool
            r7.<init>()
            r7.value = r4
            if (r24 == 0) goto L_0x036b
            r4 = r39
            boolean r8 = com.tencent.p014mm.modelimage.C92806b.m116995i(r15, r12, r6, r4, r1)
            if (r8 != 0) goto L_0x0369
            r50 = r15
            r51 = r12
            r52 = r6
            r53 = r4
            r54 = r1
            r55 = r7
            r56 = r2
            r57 = r25
            boolean r1 = com.tencent.p014mm.modelimage.C92806b.m116994h(r50, r51, r52, r53, r54, r55, r56, r57)
            goto L_0x037f
        L_0x0369:
            r1 = r8
            goto L_0x037f
        L_0x036b:
            r4 = r39
            r50 = r15
            r51 = r12
            r52 = r4
            r53 = r1
            r54 = r7
            r55 = r2
            r56 = r25
            boolean r1 = com.tencent.p014mm.modelimage.C92806b.m116993g(r50, r51, r52, r53, r54, r55, r56)
        L_0x037f:
            boolean r4 = r7.value
            r7 = 3
            java.lang.Object[] r8 = new java.lang.Object[r7]
            long r28 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r40)
            java.lang.Long r7 = java.lang.Long.valueOf(r28)
            r19 = 0
            r8[r19] = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            r20 = 1
            r8[r20] = r7
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
            r23 = 2
            r8[r23] = r7
            java.lang.String r7 = "genBigImg: cost %s, compress:%s, opt:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r7, r8)
            long r7 = com.tencent.p014mm.vfs.C86013q1.m106451l(r12)
            r50 = r1
            r3 = 5
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.Long r3 = java.lang.Long.valueOf(r35)
            r1[r19] = r3
            java.lang.Long r3 = java.lang.Long.valueOf(r7)
            r1[r20] = r3
            long r28 = r7 * r31
            long r28 = r28 / r35
            java.lang.Long r3 = java.lang.Long.valueOf(r28)
            r23 = 2
            r1[r23] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r22 = 3
            r1[r22] = r3
            r3 = 4
            r1[r3] = r12
            java.lang.String r3 = "genBigImg check use orig , orig:%d aftercomp:%d diff percent:[%d] picCompressAvoidanceRemainderPerc:%d  %s "
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r3, r1)
            if (r10 == 0) goto L_0x03f4
            long r7 = r35 - r7
            long r7 = r7 * r31
            long r0 = (long) r0
            long r0 = r0 * r35
            int r3 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r3 >= 0) goto L_0x03f4
            r1 = 1
            com.tencent.p014mm.vfs.C45113r1.m49956a(r15, r12, r1)
            if (r24 == 0) goto L_0x03ec
            com.tencent.p014mm.modelimage.C92806b.m116992f(r12, r6)
        L_0x03ec:
            r0 = 48
            r0 = 1
            r1 = 1
            r3 = 48
            r4 = 0
            goto L_0x03f9
        L_0x03f4:
            r0 = r50
            r3 = r33
            r1 = 0
        L_0x03f9:
            long r28 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r40)
            if (r0 != 0) goto L_0x0422
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1 = 111(0x6f, double:5.5E-322)
            r3 = 187(0xbb, double:9.24E-322)
            r5 = 1
            r7 = 0
            r50 = r0
            r51 = r1
            r53 = r3
            r55 = r5
            r57 = r7
            r50.idkeyStat(r51, r53, r55, r57)
            r1 = 1
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r7 = 0
            r0[r7] = r15
            java.lang.String r1 = "createThumbNail big pic fail: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r9, r1, r0)
            goto L_0x093a
        L_0x0422:
            r0 = r3
            r3 = r9
            r24 = r11
            r31 = r12
            r23 = r13
            r22 = r14
            r27 = r15
            r6 = 1
            r7 = 6
            r8 = 0
            r9 = 2
            r18 = 5
            r20 = 7
            r21 = 4
            r25 = 8
            r26 = 3
            r12 = r1
            r11 = r4
            goto L_0x06a6
        L_0x0440:
            r4 = r39
            goto L_0x0444
        L_0x0443:
            r4 = r8
        L_0x0444:
            r7 = 0
            r3 = 4
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r0[r7] = r3
            java.lang.Long r3 = java.lang.Long.valueOf(r35)
            r7 = 1
            r0[r7] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)
            r7 = 2
            r0[r7] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            r7 = 3
            r0[r7] = r3
            java.lang.String r3 = "summersafecdn createThumbNail big pic no compress, calculatedQuality:%d, origLen:%d oriWidth:%d oriHeight:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r3, r0)
            if (r10 == 0) goto L_0x04ad
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.net.Uri r0 = com.tencent.p014mm.sdk.platformtools.ScopedStorageUtil.Imports.getImageExternalUri((android.content.Context) r0, (java.lang.String) r15)
            if (r0 == 0) goto L_0x047b
            java.lang.String r0 = r0.toString()
            r3 = r0
            goto L_0x047c
        L_0x047b:
            r3 = r15
        L_0x047c:
            r7 = 1
            com.tencent.p014mm.vfs.C45113r1.m49956a(r3, r12, r7)
            if (r24 == 0) goto L_0x0485
            com.tencent.p014mm.modelimage.C92806b.m116992f(r12, r6)
        L_0x0485:
            di3.d r0 = di3.C86312j.m106911c(r16)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r6 = h81.C32735h.C32737c.clicfg_enable_remove_c2c_image_exif
            int r0 = r0.mo58779Qe(r6, r7)
            if (r0 != r7) goto L_0x04ab
            com.tencent.p014mm.sdk.platformtools.Util.clearExif(r12)     // Catch:{ IllegalArgumentException -> 0x0499, IOException -> 0x0497 }
            goto L_0x04ab
        L_0x0497:
            r0 = move-exception
            goto L_0x049a
        L_0x0499:
            r0 = move-exception
        L_0x049a:
            java.lang.Object[] r6 = new java.lang.Object[r7]
            java.lang.String r0 = r0.getMessage()
            r8 = 0
            r6[r8] = r0
            java.lang.String r0 = "clearExif error:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r0, r6)
            com.tencent.p014mm.vfs.C45113r1.m49956a(r3, r12, r7)
        L_0x04ab:
            r3 = 1
            goto L_0x04df
        L_0x04ad:
            com.tencent.mm.vfs.m1 r0 = new com.tencent.mm.vfs.m1
            r0.<init>((java.lang.String) r15)
            com.tencent.mm.vfs.m1 r3 = new com.tencent.mm.vfs.m1
            r3.<init>((java.lang.String) r12)
            android.graphics.Bitmap$CompressFormat r7 = android.graphics.Bitmap.CompressFormat.JPEG
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.convertImageFile((com.tencent.p014mm.vfs.C86009m1) r0, (com.tencent.p014mm.vfs.C86009m1) r3, (android.graphics.Bitmap.CompressFormat) r7)
            if (r0 != 0) goto L_0x04d9
            com.tencent.mm.plugin.report.service.n r40 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r41 = 111(0x6f, double:5.5E-322)
            r43 = 187(0xbb, double:9.24E-322)
            r45 = 1
            r47 = 0
            r40.idkeyStat(r41, r43, r45, r47)
            r3 = 1
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r1 = 0
            r0[r1] = r15
            java.lang.String r1 = "createThumbNail big pic fail (for cvrt to jpg): %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r9, r1, r0)
            goto L_0x093a
        L_0x04d9:
            r3 = 1
            if (r24 == 0) goto L_0x04df
            com.tencent.p014mm.modelimage.C92806b.m116992f(r12, r6)
        L_0x04df:
            if (r14 != r3) goto L_0x0689
            k40.a r0 = f40.C86709a0.m107533q(r17)     // Catch:{ Exception -> 0x04fa }
            lc3.b r0 = (lc3.C10485b) r0     // Catch:{ Exception -> 0x04fa }
            pj.f r0 = r0.vh0()     // Catch:{ Exception -> 0x04fa }
            java.lang.String r3 = "CompressMidPicLevel"
            java.lang.String r0 = r0.mo107405c(r3)     // Catch:{ Exception -> 0x04fa }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x04fa }
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x04fa }
            goto L_0x04fb
        L_0x04fa:
            r0 = 0
        L_0x04fb:
            k40.a r3 = f40.C86709a0.m107533q(r17)     // Catch:{ Exception -> 0x0514 }
            lc3.b r3 = (lc3.C10485b) r3     // Catch:{ Exception -> 0x0514 }
            pj.f r3 = r3.vh0()     // Catch:{ Exception -> 0x0514 }
            java.lang.String r6 = "CompressMidPicSize"
            java.lang.String r3 = r3.mo107405c(r6)     // Catch:{ Exception -> 0x0514 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0514 }
            int r3 = r3.intValue()     // Catch:{ Exception -> 0x0514 }
            goto L_0x0516
        L_0x0514:
            r3 = 0
        L_0x0516:
            r6 = 2
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r8 = 0
            r7[r8] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            r8 = 1
            r7[r8] = r6
            java.lang.String r6 = "summersafecdn CompressMidPicLevel-level:%d size:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r6, r7)
            r6 = 10
            if (r0 <= r6) goto L_0x0535
            r6 = 100
            if (r0 <= r6) goto L_0x0537
        L_0x0535:
            r0 = 52
        L_0x0537:
            if (r3 <= 0) goto L_0x053d
            r6 = 800(0x320, float:1.121E-42)
            if (r3 <= r6) goto L_0x053f
        L_0x053d:
            r3 = 800(0x320, float:1.121E-42)
        L_0x053f:
            if (r4 <= r3) goto L_0x0542
            r4 = r3
        L_0x0542:
            if (r1 <= r3) goto L_0x0545
            r1 = r3
        L_0x0545:
            if (r5 == 0) goto L_0x054b
            if (r5 > r0) goto L_0x054b
            r6 = 0
            goto L_0x054c
        L_0x054b:
            r6 = 1
        L_0x054c:
            if (r6 != 0) goto L_0x05a4
            r7 = 800(0x320, double:3.953E-321)
            int r10 = (r35 > r7 ? 1 : (r35 == r7 ? 0 : -1))
            if (r10 > 0) goto L_0x05a4
            if (r11 > r3) goto L_0x05a4
            if (r13 <= r3) goto L_0x0559
            goto L_0x05a4
        L_0x0559:
            r3 = r53
            java.lang.String r0 = r3.value
            r3 = r55
            r10 = 6
            r3.value = r0
            r7 = r54
            java.lang.String r0 = r7.value
            r8 = r56
            r8.value = r0
            r7 = 7
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r19 = 0
            r0[r19] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r11)
            r20 = 1
            r0[r20] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r13)
            r23 = 2
            r0[r23] = r6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r6 = 3
            r0[r6] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r4 = 4
            r0[r4] = r1
            java.lang.String r1 = r3.value
            r6 = 5
            r0[r6] = r1
            java.lang.String r1 = r8.value
            r0[r10] = r1
            java.lang.String r1 = "summersafecdn not need to compress mid pic needCompressByQuality[%b], [%d, %d; %d, %d] use big pMidImgName[%s], pMidImgPath[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r9, r1, r0)
            goto L_0x0689
        L_0x05a4:
            r3 = r55
            r8 = r56
            r7 = 7
            r10 = 6
            java.lang.String r6 = m117080TE(r15)
            r3.value = r6
            r7 = r49
            r24 = r11
            r31 = r12
            r10 = r33
            r12 = 1
            r11 = r57
            java.lang.String r6 = r7.mo127174TY(r6, r10, r11, r12)
            r8.value = r6
            r6 = r50
            com.tencent.mm.modelimage.k r11 = r6.f287952q
            if (r11 == 0) goto L_0x060f
            java.lang.String r11 = r11.f267379f
            java.lang.String r10 = r7.mo127174TY(r11, r10, r10, r12)
            boolean r11 = com.tencent.p014mm.vfs.C86013q1.m106450k(r10)
            if (r11 == 0) goto L_0x060f
            java.lang.String r11 = r8.value
            long r32 = com.tencent.p014mm.vfs.C86013q1.m106443d(r10, r11, r12)
            int r11 = (r32 > r28 ? 1 : (r32 == r28 ? 0 : -1))
            if (r11 < 0) goto L_0x05e0
            r11 = 4
            r12 = 1
            goto L_0x05e2
        L_0x05e0:
            r11 = 4
            r12 = 0
        L_0x05e2:
            java.lang.Object[] r7 = new java.lang.Object[r11]
            com.tencent.mm.modelimage.k r11 = r6.f287952q
            r51 = r12
            long r11 = r11.f267374a
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r12 = 0
            r7[r12] = r11
            com.tencent.mm.modelimage.k r6 = r6.f287952q
            r19 = r13
            long r12 = r6.f267387n
            java.lang.Long r6 = java.lang.Long.valueOf(r12)
            r12 = 1
            r7[r12] = r6
            r6 = 2
            r7[r6] = r10
            java.lang.String r10 = r8.value
            r11 = 3
            r7[r11] = r10
            java.lang.String r10 = "use preferlink for origin img transmit %s %s %s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r10, r7)
            r7 = r51
            goto L_0x0614
        L_0x060f:
            r19 = r13
            r6 = 2
            r11 = 3
            r7 = 0
        L_0x0614:
            if (r7 != 0) goto L_0x0645
            android.graphics.Bitmap$CompressFormat r13 = android.graphics.Bitmap.CompressFormat.JPEG
            java.lang.String r10 = r8.value
            r7 = 0
            r20 = 7
            r6 = r8
            r8 = r15
            r48 = r9
            r21 = 4
            r9 = r1
            r22 = r10
            r10 = r4
            r26 = 3
            r11 = r13
            r13 = 1
            r18 = 5
            r12 = r0
            r23 = r19
            r19 = r25
            r25 = 8
            r13 = r22
            r22 = r14
            r14 = r58
            r27 = r15
            r15 = r19
            int r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.createThumbNailMayUseOpt(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r12 = r0
            r7 = 6
            goto L_0x065a
        L_0x0645:
            r6 = r8
            r48 = r9
            r22 = r14
            r27 = r15
            r23 = r19
            r18 = 5
            r20 = 7
            r21 = 4
            r25 = 8
            r26 = 3
            r7 = 6
            r12 = 1
        L_0x065a:
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.String r3 = r3.value
            r8 = 0
            r0[r8] = r3
            java.lang.String r3 = r6.value
            r6 = 1
            r0[r6] = r3
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r9 = 2
            r0[r9] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)
            r0[r26] = r3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r21] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r0[r18] = r1
            java.lang.String r1 = "summersafecdn pMidImgName[%s], pMidImgPath[%s], useOpt[%b], ret[%b] [%d, %d]"
            r3 = r48
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r1, r0)
            r0 = 38
            r11 = 0
            goto L_0x06a6
        L_0x0689:
            r3 = r9
            r24 = r11
            r31 = r12
            r23 = r13
            r22 = r14
            r27 = r15
            r6 = 1
            r7 = 6
            r8 = 0
            r9 = 2
            r18 = 5
            r20 = 7
            r21 = 4
            r25 = 8
            r26 = 3
            r0 = 38
            r11 = 0
            r12 = 1
        L_0x06a6:
            android.graphics.BitmapFactory$Options r1 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getImageOptions(r31)
            if (r1 == 0) goto L_0x06af
            int r10 = r1.outWidth
            goto L_0x06b0
        L_0x06af:
            r10 = -1
        L_0x06b0:
            if (r1 == 0) goto L_0x06b5
            int r1 = r1.outHeight
            goto L_0x06b6
        L_0x06b5:
            r1 = -1
        L_0x06b6:
            long r13 = com.tencent.p014mm.vfs.C86013q1.m106451l(r31)
            int r15 = com.tencent.p014mm.sdk.platformtools.MMNativeJpeg.queryQuality(r31)
            boolean r19 = com.tencent.p014mm.sdk.platformtools.MMNativeJpeg.IsJpegFile(r31)
            com.tencent.mm.plugin.report.service.n r4 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r7 = 13
            java.lang.Object[] r9 = new java.lang.Object[r7]
            java.lang.Integer r32 = java.lang.Integer.valueOf(r12)
            r9[r8] = r32
            java.lang.Long r28 = java.lang.Long.valueOf(r28)
            r9[r6] = r28
            java.lang.Integer r28 = java.lang.Integer.valueOf(r0)
            r29 = 2
            r9[r29] = r28
            if (r37 == 0) goto L_0x06e1
            r28 = 1
            goto L_0x06e3
        L_0x06e1:
            r28 = 2
        L_0x06e3:
            java.lang.Integer r28 = java.lang.Integer.valueOf(r28)
            r9[r26] = r28
            java.lang.Long r28 = java.lang.Long.valueOf(r35)
            r9[r21] = r28
            java.lang.Integer r28 = java.lang.Integer.valueOf(r23)
            r9[r18] = r28
            java.lang.Integer r28 = java.lang.Integer.valueOf(r24)
            r29 = 6
            r9[r29] = r28
            java.lang.Integer r28 = java.lang.Integer.valueOf(r22)
            r9[r20] = r28
            java.lang.Long r28 = java.lang.Long.valueOf(r13)
            r9[r25] = r28
            java.lang.Integer r28 = java.lang.Integer.valueOf(r10)
            r29 = 9
            r9[r29] = r28
            java.lang.Integer r28 = java.lang.Integer.valueOf(r1)
            r29 = 10
            r9[r29] = r28
            java.lang.Integer r28 = java.lang.Integer.valueOf(r5)
            r29 = 11
            r9[r29] = r28
            java.lang.Integer r28 = java.lang.Integer.valueOf(r15)
            r32 = 12
            r9[r32] = r28
            r7 = 11713(0x2dc1, float:1.6413E-41)
            r4.mo160131h(r7, r9)
            r9 = 15
            java.lang.Object[] r7 = new java.lang.Object[r9]
            java.lang.Integer r28 = java.lang.Integer.valueOf(r12)
            r7[r8] = r28
            java.lang.Boolean r28 = java.lang.Boolean.valueOf(r11)
            r7[r6] = r28
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r28 = 2
            r7[r28] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r23)
            r7[r26] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r24)
            r7[r21] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r7[r18] = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r35)
            r28 = 6
            r7[r28] = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r37)
            r7[r20] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r7[r25] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r28 = 9
            r7[r28] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
            r28 = 10
            r7[r28] = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r13)
            r7[r29] = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r19)
            r7[r32] = r0
            r0 = 13
            r7[r0] = r27
            r0 = 14
            r9 = r31
            r7[r0] = r9
            java.lang.String r0 = "genBigImg ret:%d useOpt:%b scene:%d [%d,%d,%d,%d,%b]->[%d,%d,%d,%d,%b] [%s]->[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r0, r7)
            di3.d r0 = di3.C86312j.m106911c(r16)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r7 = h81.C32735h.C32737c.clicfg_image_convert_progressive_flag
            int r0 = r0.mo58779Qe(r7, r8)
            if (r0 != r6) goto L_0x07a7
            r0 = 1
            goto L_0x07a8
        L_0x07a7:
            r0 = 0
        L_0x07a8:
            if (r22 != 0) goto L_0x093c
            r38 = 40960(0xa000, double:2.0237E-319)
            int r7 = (r13 > r38 ? 1 : (r13 == r38 ? 0 : -1))
            if (r7 < 0) goto L_0x093c
            if (r19 == 0) goto L_0x093c
            boolean r7 = com.tencent.p014mm.sdk.platformtools.MMNativeJpeg.isProgressive(r9)
            if (r7 != 0) goto L_0x093c
            if (r0 == 0) goto L_0x093c
            k40.a r0 = f40.C86709a0.m107533q(r17)
            lc3.b r0 = (lc3.C10485b) r0
            pj.f r0 = r0.vh0()
            java.lang.String r7 = "EnableCDNUploadImg"
            java.lang.String r0 = r0.mo107405c(r7)
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r7 != 0) goto L_0x093c
            java.lang.String r7 = "1"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x093c
            long r16 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            if (r11 == 0) goto L_0x0806
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r9)
            java.lang.String r7 = ".prog"
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.vfs.C86013q1.m106442c(r9, r0)
            boolean r7 = com.tencent.p014mm.sdk.platformtools.ImageOptimLib.convertToProgressive(r0, r9, r2)
            com.tencent.p014mm.vfs.C86013q1.m106447h(r0)
            if (r7 != 0) goto L_0x0803
            r0 = 29
            boolean r7 = com.tencent.p014mm.sdk.platformtools.MMNativeJpeg.convertToProgressive(r9, r2)
            goto L_0x080c
        L_0x0803:
            r0 = 19
            goto L_0x080c
        L_0x0806:
            boolean r7 = com.tencent.p014mm.sdk.platformtools.MMNativeJpeg.convertToProgressive(r9, r2)
            r0 = 9
        L_0x080c:
            long r38 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            long r38 = r38 - r16
            long r16 = com.tencent.p014mm.vfs.C86013q1.m106451l(r9)
            r2 = 14
            java.lang.Object[] r6 = new java.lang.Object[r2]
            if (r7 == 0) goto L_0x081e
            r2 = 1
            goto L_0x081f
        L_0x081e:
            r2 = -1
        L_0x081f:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6[r8] = r2
            java.lang.Long r2 = java.lang.Long.valueOf(r38)
            r28 = 1
            r6[r28] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r28 = 2
            r6[r28] = r2
            if (r37 == 0) goto L_0x0839
            r2 = 1
            goto L_0x083a
        L_0x0839:
            r2 = 2
        L_0x083a:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6[r26] = r2
            java.lang.Long r2 = java.lang.Long.valueOf(r35)
            r6[r21] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r23)
            r6[r18] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r24)
            r28 = 6
            r6[r28] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r22)
            r6[r20] = r2
            java.lang.Long r2 = java.lang.Long.valueOf(r13)
            r6[r25] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            r22 = 9
            r6[r22] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r22 = 10
            r6[r22] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            r6[r29] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)
            r6[r32] = r2
            java.lang.Long r2 = java.lang.Long.valueOf(r16)
            r22 = 13
            r6[r22] = r2
            r2 = 11713(0x2dc1, float:1.6413E-41)
            r4.mo160131h(r2, r6)
            r2 = 17
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r12)
            r2[r8] = r6
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r7)
            r12 = 1
            r2[r12] = r6
            java.lang.Long r6 = java.lang.Long.valueOf(r16)
            r12 = 2
            r2[r12] = r6
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r11)
            r2[r26] = r6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2[r21] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r23)
            r2[r18] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r24)
            r6 = 6
            r2[r6] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r2[r20] = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r35)
            r2[r25] = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r37)
            r5 = 9
            r2[r5] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r5 = 10
            r2[r5] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r2[r29] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
            r2[r32] = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r13)
            r1 = 13
            r2[r1] = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r19)
            r1 = 14
            r2[r1] = r0
            r0 = 15
            r2[r0] = r27
            r0 = 16
            r2[r0] = r9
            java.lang.String r0 = "genBigImg PROGRESS ret:%d progret:%b size:%d useOpt:%b scene:%d [%d,%d,%d,%d,%b]->[%d,%d,%d,%d,%b] [%s]->[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r0, r2)
            if (r7 != 0) goto L_0x093c
            r0 = 111(0x6f, double:5.5E-322)
            r5 = 186(0xba, double:9.2E-322)
            r10 = 1
            r2 = 0
            r50 = r4
            r51 = r0
            r53 = r5
            r55 = r10
            r57 = r2
            r50.idkeyStat(r51, r53, r55, r57)
            r1 = 1
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r0[r8] = r9
            java.lang.String r1 = "genBigImg convert to progressive failed %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r1, r0)
            goto L_0x093c
        L_0x0920:
            r3 = r9
            r27 = r15
            r8 = 0
            r1 = 2
        L_0x0925:
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r0[r8] = r27
            if (r7 != 0) goto L_0x092d
            r11 = 1
            goto L_0x092e
        L_0x092d:
            r11 = 0
        L_0x092e:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r11)
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = "genBigImg getImageOptions error:%s, origOptions_null:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r3, r1, r0)
        L_0x093a:
            r1 = 0
            return r1
        L_0x093c:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelimage.C92839m.mo127191mI(gt.z, java.lang.String, boolean, com.tencent.mm.pointers.PString, com.tencent.mm.pointers.PString, com.tencent.mm.pointers.PString, com.tencent.mm.pointers.PString, java.lang.String, sg.c):java.lang.String");
    }

    /* renamed from: mL */
    public long mo127192mL(String str) {
        C92843d dVar;
        if (str != null) {
            Iterator<C92843d> it = C92844e.f267435a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    ArrayList<C92843d> arrayList = C92844e.f267435a;
                    Log.m105925i("MicroMsg.ImgInfoStorage", "[getIdCreator] table=%s talker=%s", arrayList.get(0).f267430a, str);
                    dVar = arrayList.get(0);
                    break;
                }
                C92843d next = it.next();
                if (!next.f267431b.isEmpty() && str.toLowerCase().endsWith(next.f267431b)) {
                    Log.m105925i("MicroMsg.ImgInfoStorage", "[getIdCreator] table=%s talker=%s", next.f267430a, str);
                    dVar = next;
                    break;
                }
            }
        } else {
            ArrayList<C92843d> arrayList2 = C92844e.f267435a;
            Log.m105921e("MicroMsg.ImgInfoStorage", "[getIdCreator] talker is null %s", Util.getStack());
            dVar = C92844e.f267435a.get(0);
        }
        long incrementAndGet = dVar.f267434e.incrementAndGet();
        MultiProcessMMKV multiProcessMMKV = C92844e.f267436b;
        multiProcessMMKV.putLong("img." + dVar.f267430a, incrementAndGet);
        return incrementAndGet;
    }

    /* renamed from: mf */
    public String mo127193mf(String str) {
        String str2;
        if (Util.isNullOrNil(str)) {
            return null;
        }
        String b = C7970a.m8128b();
        String str3 = "th_";
        if (str.startsWith("SERVERID://")) {
            try {
                str2 = mo127160CP(Long.valueOf(str.substring(11)).longValue()).f267378e;
            } catch (NumberFormatException e) {
                Log.m105920e("MicroMsg.ImgInfoStorage", "read img buf failed: " + e.getMessage());
                return null;
            }
        } else if (str.startsWith("THUMBNAIL_APPMSG_DIR://")) {
            str2 = str.substring(29);
            b = C46848g.wx0();
            str3 = "msgth_";
        } else {
            str2 = "";
        }
        return FilePathGenerator.defGenPathWithOld(C7970a.m8127a(), b, str3, Util.isNullOrNil(str2) ? str : str2, "", 1);
    }

    /* renamed from: nP */
    public C92836k mo127194nP(Long l) {
        C92836k kVar = new C92836k();
        String a = C92844e.m117105a(l.longValue());
        Cursor wx02 = wx0(a, (String[]) null, "id=?", new String[]{"" + l}, (String) null, (String) null, (String) null, false);
        if (wx02 != null && wx02.moveToFirst()) {
            kVar.mo127131b(wx02);
        }
        wx02.close();
        return kVar;
    }

    public long ov0(C98210z zVar) {
        return Pq0(zVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:76:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01b6  */
    /* renamed from: qq */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap mo127196qq(java.lang.String r16, boolean r17, float r18, boolean r19, boolean r20, boolean r21, int r22, boolean r23) {
        /*
            r15 = this;
            r0 = r15
            r1 = r18
            if (r17 != 0) goto L_0x000a
            java.lang.String r2 = r15.h30(r16)
            goto L_0x000c
        L_0x000a:
            r2 = r16
        L_0x000c:
            r3 = 0
            if (r2 != 0) goto L_0x0011
            goto L_0x01d2
        L_0x0011:
            r4 = 0
            r5 = 1
            r6 = 2
            java.lang.String r7 = "MicroMsg.ImgInfoStorage"
            if (r23 == 0) goto L_0x0032
            sg.g<java.lang.String, android.graphics.Bitmap> r3 = r0.f267415d
            o90.b r3 = (o90.C100301b) r3
            java.lang.Object r3 = r3.mo139556b(r2)
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            if (r3 != 0) goto L_0x0032
            java.lang.Object[] r8 = new java.lang.Object[r6]
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            r8[r4] = r9
            r8[r5] = r2
            java.lang.String r9 = "userCache but bm is null  url:%s"
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r7, r9, r8)
        L_0x0032:
            if (r3 == 0) goto L_0x003c
            boolean r8 = r3.isRecycled()
            if (r8 != 0) goto L_0x003c
            goto L_0x01d2
        L_0x003c:
            android.graphics.Bitmap r8 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getBitmapNative((java.lang.String) r2, (float) r1)
            if (r8 != 0) goto L_0x0048
            java.util.Vector<java.lang.ref.WeakReference<xs.b$a>> r8 = sf0.C101594c0.f297416a
            android.graphics.Bitmap r8 = sf0.C101594c0.C101596b.m133443e(r2)
        L_0x0048:
            if (r8 == 0) goto L_0x01bf
            long r9 = java.lang.System.currentTimeMillis()
            int r3 = r8.getWidth()
            int r11 = r8.getHeight()
            if (r20 == 0) goto L_0x007f
            int r12 = f267413s
            if (r12 != 0) goto L_0x0069
            android.content.Context r12 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r13 = 2131166389(0x7f0704b5, float:1.7947022E38)
            int r12 = kg3.C76577a.m92155f(r12, r13)
            f267413s = r12
        L_0x0069:
            int r12 = f267413s
            if (r3 > r12) goto L_0x006f
            if (r11 <= r12) goto L_0x007f
        L_0x006f:
            if (r3 <= r11) goto L_0x0076
            int r11 = r11 * r12
            int r11 = r11 / r3
            r3 = r12
            goto L_0x007f
        L_0x0076:
            if (r3 != r11) goto L_0x007b
            r3 = r12
            r11 = r3
            goto L_0x007f
        L_0x007b:
            int r3 = r3 * r12
            int r3 = r3 / r11
            r11 = r12
        L_0x007f:
            if (r21 == 0) goto L_0x012c
            java.lang.String r12 = "hd"
            boolean r12 = r2.endsWith(r12)
            if (r12 != 0) goto L_0x009f
            int r3 = r8.getWidth()
            float r3 = (float) r3
            float r3 = r3 * r1
            r11 = 1067450368(0x3fa00000, float:1.25)
            float r3 = r3 * r11
            int r3 = (int) r3
            int r12 = r8.getHeight()
            float r12 = (float) r12
            float r12 = r12 * r1
            float r12 = r12 * r11
            int r11 = (int) r12
        L_0x009f:
            float r12 = (float) r3
            r13 = 1126170624(0x43200000, float:160.0)
            float r13 = r13 * r1
            int r14 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r14 >= 0) goto L_0x00ad
            float r14 = (float) r11
            int r14 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
            if (r14 < 0) goto L_0x00ba
        L_0x00ad:
            if (r11 <= r3) goto L_0x00b2
            float r3 = (float) r11
            float r13 = r13 / r3
            goto L_0x00b3
        L_0x00b2:
            float r13 = r13 / r12
        L_0x00b3:
            float r12 = r12 * r13
            int r3 = (int) r12
            float r11 = (float) r11
            float r11 = r11 * r13
            int r11 = (int) r11
        L_0x00ba:
            float r12 = (float) r3
            r13 = 1114636288(0x42700000, float:60.0)
            float r13 = r13 * r1
            int r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r12 >= 0) goto L_0x00d2
            java.lang.Object[] r12 = new java.lang.Object[r5]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r12[r4] = r3
            java.lang.String r3 = "pic to small width is %d "
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r7, r3, r12)
            int r3 = (int) r13
        L_0x00d2:
            float r12 = (float) r11
            int r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r12 >= 0) goto L_0x00e6
            java.lang.Object[] r12 = new java.lang.Object[r5]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r12[r4] = r11
            java.lang.String r11 = "pic to small height is %d "
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r7, r11, r12)
            int r11 = (int) r13
        L_0x00e6:
            com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r12 = 1125515264(0x43160000, float:150.0)
            r13 = 1117126656(0x42960000, float:75.0)
            r14 = 1073741824(0x40000000, float:2.0)
            if (r11 < r3) goto L_0x010e
            float r11 = (float) r11
            float r3 = (float) r3
            float r11 = r11 / r3
            int r3 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r3 > 0) goto L_0x0103
            float r1 = r1 * r12
            int r1 = java.lang.Math.round(r1)
            float r3 = (float) r1
            float r3 = r3 / r11
            int r3 = (int) r3
        L_0x0101:
            r11 = r1
            goto L_0x012c
        L_0x0103:
            float r1 = r1 * r13
            int r1 = java.lang.Math.round(r1)
            float r3 = (float) r1
            float r3 = r3 * r11
            int r3 = (int) r3
            goto L_0x011e
        L_0x010e:
            float r3 = (float) r3
            float r11 = (float) r11
            float r3 = r3 / r11
            int r11 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r11 > 0) goto L_0x0121
            float r1 = r1 * r12
            int r1 = java.lang.Math.round(r1)
            float r11 = (float) r1
            float r11 = r11 / r3
            int r3 = (int) r11
        L_0x011e:
            r11 = r3
            r3 = r1
            goto L_0x012c
        L_0x0121:
            float r1 = r1 * r13
            int r1 = java.lang.Math.round(r1)
            float r11 = (float) r1
            float r11 = r11 * r3
            int r3 = (int) r11
            goto L_0x0101
        L_0x012c:
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createScaledBitmap(r8, r3, r11, r5)     // Catch:{ IllegalArgumentException | OutOfMemoryError -> 0x0131 }
            goto L_0x0133
        L_0x0131:
            r1 = r8
        L_0x0133:
            java.lang.String r3 = "[bitmapFromUriPath]:bitmap recycle %s"
            if (r8 == r1) goto L_0x0145
            java.lang.Object[] r11 = new java.lang.Object[r5]
            java.lang.String r12 = r8.toString()
            r11[r4] = r12
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r3, r11)
            r8.recycle()
        L_0x0145:
            r8 = 3
            if (r21 == 0) goto L_0x014f
            r11 = r22
            android.graphics.Bitmap r1 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.createChattingImage(r1, r11)
            goto L_0x016d
        L_0x014f:
            if (r19 == 0) goto L_0x016d
            android.content.Context r11 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r11 = kg3.C76577a.m92151b(r11, r8)
            float r11 = (float) r11
            android.graphics.Bitmap r11 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getRoundedCornerBitmap(r1, r5, r11)
            java.lang.Object[] r12 = new java.lang.Object[r5]
            java.lang.String r13 = r1.toString()
            r12[r4] = r13
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r3, r12)
            r1.recycle()
            goto L_0x016e
        L_0x016d:
            r11 = r1
        L_0x016e:
            java.lang.String r1 = ""
            if (r11 == 0) goto L_0x0192
            java.lang.Object[] r3 = new java.lang.Object[r8]
            int r12 = r11.getWidth()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r3[r4] = r12
            int r12 = r11.getHeight()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r3[r5] = r12
            r3[r6] = r11
            java.lang.String r12 = "width:%s height:%s %s"
            java.lang.String r3 = java.lang.String.format(r12, r3)
            goto L_0x0193
        L_0x0192:
            r3 = r1
        L_0x0193:
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r4] = r2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            long r12 = java.lang.System.currentTimeMillis()
            long r12 = r12 - r9
            r4.append(r12)
            java.lang.String r1 = r4.toString()
            r8[r5] = r1
            r8[r6] = r3
            java.lang.String r1 = "cached file :%s bitmap time:%s bitmap:[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r1, r8)
            if (r11 == 0) goto L_0x01bd
            sg.g<java.lang.String, android.graphics.Bitmap> r1 = r0.f267415d
            o90.b r1 = (o90.C100301b) r1
            r1.mo139557c(r2, r11)
        L_0x01bd:
            r3 = r11
            goto L_0x01d2
        L_0x01bf:
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r1[r4] = r2
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1[r5] = r2
            java.lang.String r2 = "img maybe delete, %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r2, r1)
        L_0x01d2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelimage.C92839m.mo127196qq(java.lang.String, boolean, float, boolean, boolean, boolean, int, boolean):android.graphics.Bitmap");
    }

    public String r50(String str, C92836k kVar) {
        String str2 = null;
        if (kVar == null) {
            return null;
        }
        if (kVar.mo127145p()) {
            Cursor vx02 = vx0(C92844e.m117106b(str), new String[]{"bigImgPath"}, "id=? and totalLen = offset", new String[]{"" + kVar.f267390q}, (String) null, (String) null, (String) null);
            if (vx02.moveToFirst()) {
                str2 = vx02.getString(0);
            }
            vx02.close();
        }
        return str2;
    }

    /* renamed from: uP */
    public C92836k mo127198uP(C72963f4 f4Var) {
        C92836k vP = mo127200vP(f4Var.mo108768t(), f4Var.getMsgId());
        if (vP.f267374a == 0) {
            vP = mo127168NQ(f4Var.mo108768t(), f4Var.mo108774y2());
            if (vP.f267374a == 0) {
                Log.m105920e("MicroMsg.ImgInfoStorage", "deleteByMsg can't find correspond imgInfo");
                return null;
            }
        }
        return vP;
    }

    public String v10(String str, boolean z) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        String trim = str.trim();
        if (trim.startsWith("THUMBNAIL://")) {
            try {
                trim = mo127173TO(Integer.valueOf(trim.substring(12)).intValue()).f267380g;
            } catch (NumberFormatException e) {
                Log.m105920e("MicroMsg.ImgInfoStorage", "read img buf failed: " + e.getMessage());
                return null;
            }
        } else if (trim.startsWith("THUMBNAIL_DIRPATH://")) {
            trim = trim.substring(20);
            if (trim.startsWith("th_")) {
                return mo127174TY(trim.substring(3), "th_", "", z);
            }
        }
        return mo127174TY(trim, "", "", z);
    }

    /* renamed from: vP */
    public C92836k mo127200vP(String str, long j) {
        C92836k kVar = new C92836k();
        String b = C92844e.m117106b(str);
        Cursor vx02 = vx0(b, (String[]) null, "msglocalid=?", new String[]{"" + j}, (String) null, (String) null, (String) null);
        if (vx02.moveToLast()) {
            kVar.mo127131b(vx02);
        }
        vx02.close();
        return kVar;
    }

    public final Cursor vx0(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        return wx0(str, strArr, str2, strArr2, str3, str4, str5, true);
    }

    public long wt0(String str, String str2, C92836k kVar) {
        String b = C92844e.m117106b(str);
        long q = this.f267423o.mo125627q(b, str2, kVar.mo127132c(), false);
        if (q != -1) {
            kVar.mo127130a();
        }
        Log.m105925i("MicroMsg.ImgInfoStorage", "insert img,table:%s result:%d, localId:%d, msgLocalId:%d, msgSvrId:%d, hdID:%d", b, Long.valueOf(q), Long.valueOf(kVar.f267374a), Long.valueOf(kVar.f267387n), Long.valueOf(kVar.f267375b), Integer.valueOf(kVar.f267390q));
        return q;
    }

    public final Cursor wx0(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, boolean z) {
        return this.f267423o.query(str, strArr, str2, strArr2, str3, str4, str5);
    }

    public long xs0(String str, String str2, int i, int i2, int i3, PString pString, PInt pInt, PInt pInt2) {
        return zs0(str, str2, i, i2, i3, pString, pInt, pInt2, "", "", -1, (C101610c) null, (C101610c) null, (C68118i0.C68119a) null, 0);
    }

    public Bitmap xx0(String str) {
        return BitmapUtil.getBitmapNative(h30(str), C76577a.m92156g(MMApplicationContext.getContext()));
    }

    public long yu0(String str, byte[] bArr, int i, long j, boolean z, String str2, PString pString, PInt pInt, PInt pInt2) {
        return Jt0(str, bArr, i, j, z, "", 0, str2, pString, pInt, pInt2);
    }

    public String yx0(byte[] bArr, int i, Bitmap.CompressFormat compressFormat) {
        if (Util.isNullOrNil(bArr)) {
            Log.m105920e("MicroMsg.ImgInfoStorage", "save dir thumb error, thumbBuf is null");
            return null;
        }
        String SE = m117079SE();
        String TY = mo127174TY(SE, "th_", "", true);
        Log.m105919d("MicroMsg.ImgInfoStorage", "saveDirThumb, fullPath = %s", TY);
        try {
            BitmapUtil.saveBitmapToImage(BitmapFactory.decodeByteArray(bArr, 0, bArr.length), i, compressFormat, TY, true);
            return "THUMBNAIL_DIRPATH://th_" + SE;
        } catch (IOException e) {
            Log.m105921e("MicroMsg.ImgInfoStorage", "save bitmap to image error, %s", e);
            return zx0(bArr, true, compressFormat, false);
        } catch (Exception e2) {
            Log.m105921e("MicroMsg.ImgInfoStorage", "save bitmap to image error, %s", e2);
            return zx0(bArr, true, compressFormat, false);
        }
    }

    public long zs0(String str, String str2, int i, int i2, int i3, PString pString, PInt pInt, PInt pInt2, String str3, String str4, long j, C101610c cVar, C101610c cVar2, C68118i0.C68119a aVar, int i4) {
        C98210z zVar = new C98210z();
        zVar.f287936a = str;
        zVar.f287937b = str2;
        zVar.f287939d = i;
        zVar.f287940e = i2;
        zVar.f287941f = i3;
        zVar.f287942g = pString;
        zVar.f287943h = pInt;
        zVar.f287944i = pInt2;
        zVar.f287945j = str3;
        zVar.f287946k = str4;
        zVar.f287947l = j;
        zVar.f287948m = cVar;
        zVar.f287949n = cVar2;
        zVar.f287950o = false;
        zVar.f287951p = i4;
        return Pq0(zVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ea A[SYNTHETIC, Splitter:B:41:0x00ea] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00fc A[SYNTHETIC, Splitter:B:49:0x00fc] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String zx0(byte[] r19, boolean r20, android.graphics.Bitmap.CompressFormat r21, boolean r22) {
        /*
            r18 = this;
            java.lang.String r1 = "create thumbnail, delete tmp file"
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r19)
            r2 = 0
            java.lang.String r3 = "MicroMsg.ImgInfoStorage"
            if (r0 == 0) goto L_0x0012
            java.lang.String r0 = "save dir thumb error, thumbBuf is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
            return r2
        L_0x0012:
            java.lang.String r4 = m117079SE()
            java.lang.String r0 = "th_"
            java.lang.String r5 = ""
            r6 = 1
            r7 = r18
            java.lang.String r0 = r7.mo127174TY(r4, r0, r5, r6)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            java.lang.String r8 = ".tmp"
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "saveDirThumb, fullPath = "
            r8.append(r9)
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r8)
            r8 = 0
            java.io.OutputStream r9 = com.tencent.p014mm.vfs.C86013q1.m106429K(r5, r8)     // Catch:{ Exception -> 0x00ad, all -> 0x00ab }
            r10 = r19
            r9.write(r10)     // Catch:{ Exception -> 0x00a9 }
            r9.flush()     // Catch:{ Exception -> 0x00a9 }
            r10 = 128(0x80, float:1.794E-43)
            r11 = 120(0x78, float:1.68E-43)
            if (r20 == 0) goto L_0x005e
            r12 = 128(0x80, float:1.794E-43)
            goto L_0x0060
        L_0x005e:
            r12 = 120(0x78, float:1.68E-43)
        L_0x0060:
            if (r20 == 0) goto L_0x0063
            goto L_0x0065
        L_0x0063:
            r10 = 120(0x78, float:1.68E-43)
        L_0x0065:
            if (r22 == 0) goto L_0x006c
            android.graphics.Bitmap r10 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeFile(r5, r2)     // Catch:{ Exception -> 0x00a9 }
            goto L_0x0070
        L_0x006c:
            android.graphics.Bitmap r10 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.extractThumbNail(r5, r12, r10, r8)     // Catch:{ Exception -> 0x00a9 }
        L_0x0070:
            if (r10 == 0) goto L_0x0085
            r11 = 90
            r12 = r21
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToImage(r10, r11, r12, r0, r6)     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r10 = "in ImgInfoStorage, extractThumbNail done: %s, %s"
            r11 = 2
            java.lang.Object[] r11 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x00a9 }
            r11[r8] = r5     // Catch:{ Exception -> 0x00a9 }
            r11[r6] = r0     // Catch:{ Exception -> 0x00a9 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r10, r11)     // Catch:{ Exception -> 0x00a9 }
        L_0x0085:
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r5)
            if (r0 == 0) goto L_0x0091
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r1)
            com.tencent.p014mm.vfs.C86013q1.m106447h(r5)
        L_0x0091:
            r9.close()     // Catch:{ Exception -> 0x0094 }
        L_0x0094:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "THUMBNAIL_DIRPATH://th_"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            return r0
        L_0x00a6:
            r0 = move-exception
            r2 = r9
            goto L_0x00ee
        L_0x00a9:
            r0 = move-exception
            goto L_0x00af
        L_0x00ab:
            r0 = move-exception
            goto L_0x00ee
        L_0x00ad:
            r0 = move-exception
            r9 = r2
        L_0x00af:
            com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x00a6 }
            r11 = 111(0x6f, double:5.5E-322)
            r13 = 189(0xbd, double:9.34E-322)
            r15 = 1
            r17 = 0
            r10.idkeyStat(r11, r13, r15, r17)     // Catch:{ all -> 0x00a6 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a6 }
            r6.<init>()     // Catch:{ all -> 0x00a6 }
            java.lang.String r8 = "create thumbnail from byte failed: th_"
            r6.append(r8)     // Catch:{ all -> 0x00a6 }
            r6.append(r4)     // Catch:{ all -> 0x00a6 }
            java.lang.String r4 = ", ex = "
            r6.append(r4)     // Catch:{ all -> 0x00a6 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x00a6 }
            r6.append(r0)     // Catch:{ all -> 0x00a6 }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x00a6 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)     // Catch:{ all -> 0x00a6 }
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r5)
            if (r0 == 0) goto L_0x00e8
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r1)
            com.tencent.p014mm.vfs.C86013q1.m106447h(r5)
        L_0x00e8:
            if (r9 == 0) goto L_0x00ed
            r9.close()     // Catch:{ Exception -> 0x00ed }
        L_0x00ed:
            return r2
        L_0x00ee:
            boolean r4 = com.tencent.p014mm.vfs.C86013q1.m106450k(r5)
            if (r4 == 0) goto L_0x00fa
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r1)
            com.tencent.p014mm.vfs.C86013q1.m106447h(r5)
        L_0x00fa:
            if (r2 == 0) goto L_0x00ff
            r2.close()     // Catch:{ Exception -> 0x00ff }
        L_0x00ff:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelimage.C92839m.zx0(byte[], boolean, android.graphics.Bitmap$CompressFormat, boolean):java.lang.String");
    }
}
