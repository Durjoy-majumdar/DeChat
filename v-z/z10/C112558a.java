package z10;

import a70.C112760b;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import fy3.C32226l;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Iterator;
import java.util.List;
import rx3.C13598b0;
import sx3.C64197v;

/* renamed from: z10.a */
public final class C112558a {

    /* renamed from: a */
    public static final C112558a f336997a;

    /* renamed from: b */
    public static final List<C112559a> f336998b;

    /* renamed from: c */
    public static C112565e f336999c;

    /* renamed from: d */
    public static boolean f337000d;

    /* renamed from: z10.a$a */
    public static final class C112559a {

        /* renamed from: a */
        public final int f337001a;

        /* renamed from: b */
        public final String f337002b;

        /* renamed from: c */
        public final String f337003c;

        public C112559a(int i, String str, String str2) {
            C87412m.m108594g(str, "name");
            C87412m.m108594g(str2, DownloadInfo.FILENAME);
            this.f337001a = i;
            this.f337002b = str;
            this.f337003c = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C112559a)) {
                return false;
            }
            C112559a aVar = (C112559a) obj;
            return this.f337001a == aVar.f337001a && C87412m.m108589b(this.f337002b, aVar.f337002b) && C87412m.m108589b(this.f337003c, aVar.f337003c);
        }

        public int hashCode() {
            return (((this.f337001a * 31) + this.f337002b.hashCode()) * 31) + this.f337003c.hashCode();
        }

        public String toString() {
            return "FilterInfo(type=" + this.f337001a + ", name=" + this.f337002b + ", fileName=" + this.f337003c + ')';
        }
    }

    /* renamed from: z10.a$b */
    public static final class C112560b extends C87413o implements C32226l<Bitmap, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ Object f337004d;

        /* renamed from: e */
        public final /* synthetic */ C8479f0<Bitmap> f337005e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112560b(Object obj, C8479f0<Bitmap> f0Var) {
            super(1);
            this.f337004d = obj;
            this.f337005e = f0Var;
        }

        public Object invoke(Object obj) {
            T t = (Bitmap) obj;
            C87412m.m108594g(t, LocaleUtil.ITALIAN);
            Object obj2 = this.f337004d;
            C8479f0<Bitmap> f0Var = this.f337005e;
            synchronized (obj2) {
                f0Var.f27484d = t;
                obj2.notifyAll();
            }
            return C13598b0.f38549a;
        }
    }

    static {
        C112558a aVar = new C112558a();
        f336997a = aVar;
        String str = C112760b.m154231g() + "photoedit";
        String string = MMApplicationContext.getContext().getString(C0966R.string.hj7);
        C87412m.m108593f(string, "getContext().getString(R…photo_filter_name_origin)");
        String string2 = MMApplicationContext.getContext().getString(C0966R.string.hiz);
        C87412m.m108593f(string2, "getContext().getString(R…ring.photo_filter_name_0)");
        String string3 = MMApplicationContext.getContext().getString(C0966R.string.f361132hj0);
        C87412m.m108593f(string3, "getContext().getString(R…ring.photo_filter_name_1)");
        String string4 = MMApplicationContext.getContext().getString(C0966R.string.f361133hj1);
        C87412m.m108593f(string4, "getContext().getString(R…ring.photo_filter_name_2)");
        String string5 = MMApplicationContext.getContext().getString(C0966R.string.f361134hj2);
        C87412m.m108593f(string5, "getContext().getString(R…ring.photo_filter_name_3)");
        String string6 = MMApplicationContext.getContext().getString(C0966R.string.f361135hj3);
        C87412m.m108593f(string6, "getContext().getString(R…ring.photo_filter_name_4)");
        String string7 = MMApplicationContext.getContext().getString(C0966R.string.hj4);
        C87412m.m108593f(string7, "getContext().getString(R…ring.photo_filter_name_5)");
        String string8 = MMApplicationContext.getContext().getString(C0966R.string.hj5);
        C87412m.m108593f(string8, "getContext().getString(R…ring.photo_filter_name_6)");
        String string9 = MMApplicationContext.getContext().getString(C0966R.string.hj6);
        C87412m.m108593f(string9, "getContext().getString(R…ring.photo_filter_name_7)");
        f336998b = C64197v.m75537f(new C112559a(0, string, ""), new C112559a(1, string2, str + "/filter_source_0.png"), new C112559a(2, string3, str + "/filter_source_1.png"), new C112559a(3, string4, str + "/filter_source_2.png"), new C112559a(4, string5, str + "/filter_source_3.png"), new C112559a(5, string6, str + "/filter_source_4.png"), new C112559a(6, string7, str + "/filter_source_5.png"), new C112559a(7, string8, str + "/filter_source_6.png"), new C112559a(8, string9, str + "/filter_source_7.png"));
        AssetManager assets = MMApplicationContext.getContext().getAssets();
        C87412m.m108593f(assets, "getContext().assets");
        aVar.mo164287a(assets, "photofilters", str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        cy3.C58003b.m67160a(r11, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0043, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0046, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        cy3.C58003b.m67160a(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x004a, code lost:
        throw r12;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo164287a(android.content.res.AssetManager r10, java.lang.String r11, java.lang.String r12) {
        /*
            r9 = this;
            java.lang.String r0 = "assets"
            gy3.C87412m.m108594g(r10, r0)
            java.lang.String r0 = "assetsPath"
            gy3.C87412m.m108594g(r11, r0)
            java.lang.String r0 = "localPath"
            gy3.C87412m.m108594g(r12, r0)
            r0 = 0
            java.lang.String[] r1 = r10.list(r11)     // Catch:{ Exception -> 0x0082 }
            if (r1 != 0) goto L_0x0017
            return
        L_0x0017:
            int r2 = r1.length     // Catch:{ Exception -> 0x0082 }
            if (r2 != 0) goto L_0x001c
            r2 = 1
            goto L_0x001d
        L_0x001c:
            r2 = 0
        L_0x001d:
            if (r2 == 0) goto L_0x004b
            java.io.InputStream r10 = r10.open(r11)     // Catch:{ Exception -> 0x0082 }
            java.io.OutputStream r11 = com.tencent.p014mm.vfs.C86013q1.m106429K(r12, r0)     // Catch:{ all -> 0x0044 }
            java.lang.String r12 = "input"
            gy3.C87412m.m108593f(r10, r12)     // Catch:{ all -> 0x003d }
            java.lang.String r12 = "output"
            gy3.C87412m.m108593f(r11, r12)     // Catch:{ all -> 0x003d }
            r12 = 2
            r1 = 0
            cy3.C86147a.m106660b(r10, r11, r0, r12, r1)     // Catch:{ all -> 0x003d }
            cy3.C58003b.m67160a(r11, r1)     // Catch:{ all -> 0x0044 }
            cy3.C58003b.m67160a(r10, r1)     // Catch:{ Exception -> 0x0082 }
            goto L_0x008c
        L_0x003d:
            r12 = move-exception
            throw r12     // Catch:{ all -> 0x003f }
        L_0x003f:
            r1 = move-exception
            cy3.C58003b.m67160a(r11, r12)     // Catch:{ all -> 0x0044 }
            throw r1     // Catch:{ all -> 0x0044 }
        L_0x0044:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x0046 }
        L_0x0046:
            r12 = move-exception
            cy3.C58003b.m67160a(r10, r11)     // Catch:{ Exception -> 0x0082 }
            throw r12     // Catch:{ Exception -> 0x0082 }
        L_0x004b:
            com.tencent.p014mm.vfs.C86013q1.m106461v(r12)     // Catch:{ Exception -> 0x0082 }
            int r2 = r1.length     // Catch:{ Exception -> 0x0082 }
            r3 = 0
        L_0x0050:
            if (r3 >= r2) goto L_0x008c
            r4 = r1[r3]     // Catch:{ Exception -> 0x0082 }
            z10.a r5 = f336997a     // Catch:{ Exception -> 0x0082 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0082 }
            r6.<init>()     // Catch:{ Exception -> 0x0082 }
            r6.append(r11)     // Catch:{ Exception -> 0x0082 }
            r7 = 47
            r6.append(r7)     // Catch:{ Exception -> 0x0082 }
            r6.append(r4)     // Catch:{ Exception -> 0x0082 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0082 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0082 }
            r8.<init>()     // Catch:{ Exception -> 0x0082 }
            r8.append(r12)     // Catch:{ Exception -> 0x0082 }
            r8.append(r7)     // Catch:{ Exception -> 0x0082 }
            r8.append(r4)     // Catch:{ Exception -> 0x0082 }
            java.lang.String r4 = r8.toString()     // Catch:{ Exception -> 0x0082 }
            r5.mo164287a(r10, r6, r4)     // Catch:{ Exception -> 0x0082 }
            int r3 = r3 + 1
            goto L_0x0050
        L_0x0082:
            r10 = move-exception
            java.lang.Object[] r11 = new java.lang.Object[r0]
            java.lang.String r12 = "MicroMsg.BitmapFilter"
            java.lang.String r0 = "copyAssets"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r10, r0, r11)
        L_0x008c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z10.C112558a.mo164287a(android.content.res.AssetManager, java.lang.String, java.lang.String):void");
    }

    /* renamed from: b */
    public final Bitmap mo164288b(Bitmap bitmap, int i, int i2, int i3, float f) {
        String str;
        T t;
        boolean z;
        C87412m.m108594g(bitmap, "preBitmap");
        if (!f337000d) {
            mo164290d(bitmap);
        }
        if (f336999c != null) {
            long currentTimeMillis = System.currentTimeMillis();
            Iterator<T> it = f336998b.iterator();
            while (true) {
                str = null;
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (((C112559a) t).f337001a == i) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            C112559a aVar = (C112559a) t;
            if (aVar != null) {
                str = aVar.f337003c;
            }
            if (Util.isNullOrNil(str)) {
                if (i != 0) {
                    Log.m105920e("MicroMsg.BitmapFilter", "lut file not exist:" + str);
                }
                C112565e eVar = f336999c;
                C87412m.m108591d(eVar);
                return mo164289c(eVar.mo164298a(), i2, i3, i);
            }
            Object obj = new Object();
            C8479f0 f0Var = new C8479f0();
            C112565e eVar2 = f336999c;
            C87412m.m108591d(eVar2);
            C87412m.m108591d(str);
            eVar2.f337012a.post(new C112561b(eVar2, new C112560b(obj, f0Var), str, f));
            synchronized (obj) {
                if (f0Var.f27484d == null) {
                    obj.wait();
                }
                C13598b0 b0Var = C13598b0.f38549a;
            }
            T t2 = f0Var.f27484d;
            C87412m.m108591d(t2);
            Bitmap bitmap2 = (Bitmap) t2;
            if (i2 == bitmap2.getWidth() && i3 == bitmap2.getHeight()) {
                StringBuilder sb = new StringBuilder();
                sb.append("filterBitmap cost ");
                sb.append(System.currentTimeMillis() - currentTimeMillis);
                sb.append("ms, bitmap width:");
                C112565e eVar3 = f336999c;
                C87412m.m108591d(eVar3);
                sb.append(Integer.valueOf(eVar3.mo164298a().getWidth()));
                sb.append(", height:");
                C112565e eVar4 = f336999c;
                C87412m.m108591d(eVar4);
                sb.append(Integer.valueOf(eVar4.mo164298a().getHeight()));
                Log.m105924i("MicroMsg.BitmapFilter", sb.toString());
                T t3 = f0Var.f27484d;
                C87412m.m108591d(t3);
                return (Bitmap) t3;
            }
            Bitmap c = f336997a.mo164289c(bitmap2, i2, i3, 0);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("filterBitmap cost ");
            sb4.append(System.currentTimeMillis() - currentTimeMillis);
            sb4.append("ms, bitmap width:");
            C112565e eVar5 = f336999c;
            C87412m.m108591d(eVar5);
            sb4.append(Integer.valueOf(eVar5.mo164298a().getWidth()));
            sb4.append(", height:");
            C112565e eVar6 = f336999c;
            C87412m.m108591d(eVar6);
            sb4.append(Integer.valueOf(eVar6.mo164298a().getHeight()));
            sb4.append(", targetWidth:");
            sb4.append(i2);
            sb4.append(", targetHeight:");
            sb4.append(i3);
            Log.m105924i("MicroMsg.BitmapFilter", sb4.toString());
            return c;
        }
        Log.m105928w("MicroMsg.BitmapFilter", "filter render is null");
        Bitmap createBitmap = Bitmap.createBitmap(i2, i3, bitmap.getConfig());
        C87412m.m108593f(createBitmap, "createBitmap(targetWidth…Height, preBitmap.config)");
        return createBitmap;
    }

    /* renamed from: c */
    public final Bitmap mo164289c(Bitmap bitmap, int i, int i2, int i3) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, bitmap.getConfig());
        Canvas canvas = new Canvas(createBitmap);
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.set(i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? i3 != 5 ? new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f} : new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 100.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f} : new float[]{1.0f, 0.0f, 0.0f, 0.0f, 100.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f} : new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f} : new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f} : new float[]{2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f} : new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        Paint paint = new Paint();
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        canvas.drawBitmap(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), new Rect(0, 0, i, i2), paint);
        C87412m.m108593f(createBitmap, "retBitmap");
        return createBitmap;
    }

    /* renamed from: d */
    public final void mo164290d(Bitmap bitmap) {
        C87412m.m108594g(bitmap, "bitmap");
        if (!f337000d) {
            C112565e eVar = new C112565e();
            C87412m.m108593f(MMApplicationContext.getContext(), "getContext()");
            eVar.f337018g = bitmap;
            eVar.f337022k = bitmap.getWidth();
            eVar.f337023l = bitmap.getHeight();
            eVar.f337012a.post(new C112562c(eVar));
            f336999c = eVar;
        }
        f337000d = true;
    }
}
