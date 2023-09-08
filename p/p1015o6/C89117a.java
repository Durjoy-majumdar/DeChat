package p1015o6;

import android.text.TextUtils;
import com.github.henryye.nativeiv.ImageDecodeConfig;
import com.github.henryye.nativeiv.api.IImageDecodeService;
import com.github.henryye.nativeiv.bitmap.BitmapType;
import com.github.henryye.nativeiv.bitmap.IBitmap;
import com.github.henryye.nativeiv.comm.C80191a;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import p1019p6.C89314a;
import p1024q6.C89483b;
import p1024q6.C89484c;
import p1024q6.C89485d;
import p1030s6.C90132b;
import p673r6.C89876b;

/* renamed from: o6.a */
public class C89117a implements IImageDecodeService.C80187a {

    /* renamed from: a */
    public int f256771a = 2048;

    /* renamed from: b */
    public int f256772b = 2048;

    /* renamed from: c */
    public C89118b f256773c = new C89118b();

    /* renamed from: d */
    public BitmapType f256774d;

    /* renamed from: e */
    public IImageDecodeService.C80188b f256775e;

    /* renamed from: f */
    public volatile boolean f256776f = false;

    public C89117a() {
        C89118b bVar = this.f256773c;
        ((HashMap) bVar.f256777a).put(BitmapType.Native, new C80191a());
    }

    /* renamed from: a */
    public void mo111027a(IImageDecodeService.C80188b bVar) {
        this.f256775e = bVar;
    }

    /* renamed from: b */
    public void mo111028b(int i, int i2) {
        this.f256771a = i;
        this.f256772b = i2;
    }

    /* renamed from: c */
    public IBitmap mo111029c(String str, Object obj, C90132b bVar, ImageDecodeConfig imageDecodeConfig) {
        C89314a aVar = new C89314a();
        int i = this.f256771a;
        aVar.f257270d = this.f256772b;
        aVar.f257269c = i;
        aVar.f257271e = bVar.mo109801a();
        try {
            C90132b.C90133a b = bVar.mo109803b(obj, imageDecodeConfig);
            if (b.f258828a != null) {
                if (TextUtils.isEmpty(b.f258829b)) {
                    InputStream inputStream = b.f258828a;
                    C89122c d = mo123446d(this.f256773c, aVar);
                    d.f256780a = this.f256774d;
                    d.f256782c = this.f256775e;
                    IBitmap iBitmap = d.f256781b;
                    if (iBitmap != null) {
                        iBitmap.recycle();
                    }
                    C89485d a = inputStream != null ? d.mo123449a(inputStream) : null;
                    if (a == null) {
                        this.f256775e.mo109473b(str, IImageDecodeService.C80188b.C80189a.PRE_DECODE_ERROR, aVar);
                        return null;
                    } else if (a.f257554a == C89484c.UNKNOWN) {
                        this.f256775e.mo109473b(str, IImageDecodeService.C80188b.C80189a.UNSUPPORTED_IMG_FORMAT, aVar);
                        return null;
                    } else {
                        mo123447e(d, str, inputStream, imageDecodeConfig, a);
                        if (a.f257555b <= ((long) this.f256771a)) {
                            if (a.f257556c <= ((long) this.f256772b)) {
                                return d.f256781b;
                            }
                        }
                        this.f256775e.mo109473b(str, IImageDecodeService.C80188b.C80189a.HUGE_SIZE, aVar);
                        d.f256781b.recycle();
                        return null;
                    }
                }
            }
            aVar.f257272f = b.f258829b;
            this.f256775e.mo109473b(str, IImageDecodeService.C80188b.C80189a.NOT_EXIST, aVar);
            return null;
        } catch (Exception e) {
            this.f256775e.mo109473b(str, IImageDecodeService.C80188b.C80189a.THROW_EXCEPTION, aVar);
            C89876b.m112384a("DefaultBitmapDecoder", "ImageDecoder(%s) decode path[%s] error %s", bVar, obj.toString(), e.toString());
            return null;
        }
    }

    /* renamed from: d */
    public C89122c mo123446d(C89118b bVar, C89314a aVar) {
        return new C89122c(bVar, aVar);
    }

    public void destroy() {
        this.f256776f = true;
        C89118b bVar = this.f256773c;
        for (int i = 0; i < bVar.f256778b.size(); i++) {
            Map map = bVar.f256778b.get(bVar.f256778b.keyAt(i));
            if (map != null) {
                for (C89483b destroy : map.values()) {
                    destroy.destroy();
                }
            }
        }
        Map<BitmapType, C89483b> map2 = bVar.f256777a;
        if (map2 != null) {
            for (C89483b destroy2 : ((HashMap) map2).values()) {
                destroy2.destroy();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d0 A[SYNTHETIC, Splitter:B:35:0x00d0] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d5  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo123447e(p1015o6.C89122c r19, java.lang.String r20, java.io.InputStream r21, com.github.henryye.nativeiv.ImageDecodeConfig r22, p1024q6.C89485d r23) {
        /*
            r18 = this;
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r0 = r23
            q6.c r5 = r0.f257554a
            com.github.henryye.nativeiv.api.IImageDecodeService$b$a r6 = com.github.henryye.nativeiv.api.IImageDecodeService.C80188b.C80189a.NATIVE_DECODE_ERROR
            java.lang.String r7 = "hy: decode image exception"
            com.github.henryye.nativeiv.api.IImageDecodeService$b$a r8 = com.github.henryye.nativeiv.api.IImageDecodeService.C80188b.C80189a.OUT_OF_MEMORY
            com.github.henryye.nativeiv.api.IImageDecodeService$b$a r9 = com.github.henryye.nativeiv.api.IImageDecodeService.C80188b.C80189a.IO_ERROR
            java.lang.String r10 = "hy: decodeInputStream"
            java.lang.String r11 = "Ni.BitmapWrapper"
            if (r3 == 0) goto L_0x017e
            com.github.henryye.nativeiv.bitmap.BitmapType r0 = r1.f256780a
            if (r0 == 0) goto L_0x005e
            o6.b r0 = r1.f256784e
            int r13 = r19.hashCode()
            com.github.henryye.nativeiv.bitmap.BitmapType r14 = r1.f256780a
            android.util.SparseArray<java.util.Map<com.github.henryye.nativeiv.bitmap.BitmapType, q6.b>> r15 = r0.f256778b
            java.lang.Object r13 = r15.get(r13)
            java.util.Map r13 = (java.util.Map) r13
            if (r13 == 0) goto L_0x0041
            java.lang.Object r15 = r13.get(r14)
            if (r15 == 0) goto L_0x0041
            java.lang.Object r0 = r13.get(r14)
            q6.b r0 = (p1024q6.C89483b) r0
            com.github.henryye.nativeiv.bitmap.IBitmap r0 = r0.mo111043b()
            goto L_0x005b
        L_0x0041:
            java.util.Map<com.github.henryye.nativeiv.bitmap.BitmapType, q6.b> r13 = r0.f256777a
            java.util.HashMap r13 = (java.util.HashMap) r13
            java.lang.Object r13 = r13.get(r14)
            if (r13 == 0) goto L_0x005a
            java.util.Map<com.github.henryye.nativeiv.bitmap.BitmapType, q6.b> r0 = r0.f256777a
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.get(r14)
            q6.b r0 = (p1024q6.C89483b) r0
            com.github.henryye.nativeiv.bitmap.IBitmap r0 = r0.mo111043b()
            goto L_0x005b
        L_0x005a:
            r0 = 0
        L_0x005b:
            r1.f256781b = r0
            goto L_0x0080
        L_0x005e:
            o6.b r0 = r1.f256784e
            int r13 = r19.hashCode()
            android.graphics.Bitmap$Config r14 = r4.mConfig
            android.util.SparseArray<java.util.Map<com.github.henryye.nativeiv.bitmap.BitmapType, q6.b>> r15 = r0.f256778b
            java.lang.Object r13 = r15.get(r13)
            java.util.Map r13 = (java.util.Map) r13
            if (r13 == 0) goto L_0x0075
            com.github.henryye.nativeiv.bitmap.IBitmap r13 = r0.mo123448a(r3, r14, r5, r13)
            goto L_0x0076
        L_0x0075:
            r13 = 0
        L_0x0076:
            if (r13 != 0) goto L_0x007e
            java.util.Map<com.github.henryye.nativeiv.bitmap.BitmapType, q6.b> r13 = r0.f256777a
            com.github.henryye.nativeiv.bitmap.IBitmap r13 = r0.mo123448a(r3, r14, r5, r13)
        L_0x007e:
            r1.f256781b = r13
        L_0x0080:
            r13 = 1
            r14 = 0
            com.github.henryye.nativeiv.bitmap.IBitmap r0 = r1.f256781b     // Catch:{ IOException -> 0x00bb, OutOfMemoryError -> 0x00a8, all -> 0x0094 }
            r0.decodeInputStream(r3, r4, r5)     // Catch:{ IOException -> 0x00bb, OutOfMemoryError -> 0x00a8, all -> 0x0094 }
            com.github.henryye.nativeiv.bitmap.IBitmap r0 = r1.f256781b     // Catch:{ IOException -> 0x00bb, OutOfMemoryError -> 0x00a8, all -> 0x0094 }
            java.lang.Object r0 = r0.provide()     // Catch:{ IOException -> 0x00bb, OutOfMemoryError -> 0x00a8, all -> 0x0094 }
            if (r0 == 0) goto L_0x0090
            goto L_0x0091
        L_0x0090:
            r13 = 0
        L_0x0091:
            r15 = r13
            r13 = 0
            goto L_0x00ce
        L_0x0094:
            r0 = move-exception
            java.lang.Object[] r13 = new java.lang.Object[r14]
            p673r6.C89876b.m112386c(r11, r0, r7, r13)
            com.github.henryye.nativeiv.api.IImageDecodeService$b r0 = r1.f256782c
            p6.a r13 = r1.f256783d
            r0.mo109473b(r2, r6, r13)
            com.github.henryye.nativeiv.bitmap.IBitmap r0 = r1.f256781b
            r0.recycle()
            r13 = 0
            goto L_0x00cd
        L_0x00a8:
            r0 = move-exception
            java.lang.Object[] r15 = new java.lang.Object[r14]
            p673r6.C89876b.m112386c(r11, r0, r10, r15)
            com.github.henryye.nativeiv.api.IImageDecodeService$b r0 = r1.f256782c
            p6.a r15 = r1.f256783d
            r0.mo109473b(r2, r8, r15)
            com.github.henryye.nativeiv.bitmap.IBitmap r0 = r1.f256781b
            r0.recycle()
            goto L_0x00cd
        L_0x00bb:
            r0 = move-exception
            java.lang.Object[] r15 = new java.lang.Object[r14]
            p673r6.C89876b.m112386c(r11, r0, r10, r15)
            com.github.henryye.nativeiv.api.IImageDecodeService$b r0 = r1.f256782c
            p6.a r15 = r1.f256783d
            r0.mo109473b(r2, r9, r15)
            com.github.henryye.nativeiv.bitmap.IBitmap r0 = r1.f256781b
            r0.recycle()
        L_0x00cd:
            r15 = 0
        L_0x00ce:
            if (r13 == 0) goto L_0x00d5
            r21.close()     // Catch:{ IOException | IllegalStateException -> 0x0181 }
            goto L_0x0181
        L_0x00d5:
            r16 = 0
            int r0 = r21.available()     // Catch:{ IOException -> 0x00df, IllegalStateException -> 0x00dd }
            long r12 = (long) r0
            goto L_0x00e9
        L_0x00dd:
            r0 = move-exception
            goto L_0x00e0
        L_0x00df:
            r0 = move-exception
        L_0x00e0:
            java.lang.Object[] r12 = new java.lang.Object[r14]
            java.lang.String r13 = "hy: get stream len failed!"
            p673r6.C89876b.m112386c(r11, r0, r13, r12)
            r12 = r16
        L_0x00e9:
            if (r15 != 0) goto L_0x0142
            com.github.henryye.nativeiv.bitmap.IBitmap r0 = r1.f256781b
            com.github.henryye.nativeiv.bitmap.BitmapType r0 = r0.getType()
            com.github.henryye.nativeiv.bitmap.BitmapType r15 = com.github.henryye.nativeiv.bitmap.BitmapType.Native
            if (r0 != r15) goto L_0x0142
            java.lang.Object[] r0 = new java.lang.Object[r14]
            java.lang.String r15 = "hy: decode switch to legacy mode!"
            p673r6.C89876b.m112385b(r11, r15, r0)
            o6.b r0 = r1.f256784e
            java.util.Map<com.github.henryye.nativeiv.bitmap.BitmapType, q6.b> r0 = r0.f256777a
            com.github.henryye.nativeiv.bitmap.BitmapType r15 = com.github.henryye.nativeiv.bitmap.BitmapType.Legacy
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.get(r15)
            q6.b r0 = (p1024q6.C89483b) r0
            com.github.henryye.nativeiv.bitmap.IBitmap r0 = r0.mo111043b()
            r1.f256781b = r0
            r0.decodeInputStream(r3, r4, r5)     // Catch:{ IOException -> 0x0132, OutOfMemoryError -> 0x0123, all -> 0x0114 }
            goto L_0x0142
        L_0x0114:
            r0 = move-exception
            r4 = r0
            java.lang.Object[] r0 = new java.lang.Object[r14]
            p673r6.C89876b.m112386c(r11, r4, r7, r0)
            com.github.henryye.nativeiv.api.IImageDecodeService$b r0 = r1.f256782c
            p6.a r4 = r1.f256783d
            r0.mo109473b(r2, r6, r4)
            goto L_0x0142
        L_0x0123:
            r0 = move-exception
            r4 = r0
            java.lang.Object[] r0 = new java.lang.Object[r14]
            p673r6.C89876b.m112386c(r11, r4, r10, r0)
            com.github.henryye.nativeiv.api.IImageDecodeService$b r0 = r1.f256782c
            p6.a r4 = r1.f256783d
            r0.mo109473b(r2, r8, r4)
            goto L_0x0142
        L_0x0132:
            r0 = move-exception
            r4 = r0
            java.lang.Object[] r0 = new java.lang.Object[r14]
            java.lang.String r5 = "hy: IOException when use legacy"
            p673r6.C89876b.m112386c(r11, r4, r5, r0)
            com.github.henryye.nativeiv.api.IImageDecodeService$b r0 = r1.f256782c
            p6.a r4 = r1.f256783d
            r0.mo109473b(r2, r9, r4)
        L_0x0142:
            p6.a r0 = r1.f256783d
            r0.f257267a = r12
            com.github.henryye.nativeiv.bitmap.IBitmap r4 = r1.f256781b
            long r4 = r4.getDecodeTime()
            r0.f257268b = r4
            com.github.henryye.nativeiv.api.IImageDecodeService$b r0 = r1.f256782c
            com.github.henryye.nativeiv.api.IImageDecodeService$b$a r4 = com.github.henryye.nativeiv.api.IImageDecodeService.C80188b.C80189a.OK
            p6.a r5 = r1.f256783d
            r0.mo109473b(r2, r4, r5)
            com.github.henryye.nativeiv.bitmap.IBitmap r0 = r1.f256781b
            com.github.henryye.nativeiv.bitmap.BitmapType r0 = r0.getType()
            com.github.henryye.nativeiv.bitmap.BitmapType r4 = com.github.henryye.nativeiv.bitmap.BitmapType.Legacy
            if (r0 != r4) goto L_0x016a
            com.github.henryye.nativeiv.api.IImageDecodeService$b r0 = r1.f256782c
            com.github.henryye.nativeiv.api.IImageDecodeService$b$a r4 = com.github.henryye.nativeiv.api.IImageDecodeService.C80188b.C80189a.LEGACY_MODE
            p6.a r5 = r1.f256783d
            r0.mo109473b(r2, r4, r5)
        L_0x016a:
            com.github.henryye.nativeiv.bitmap.IBitmap r0 = r1.f256781b
            java.lang.Object r0 = r0.provide()
            if (r0 != 0) goto L_0x017a
            com.github.henryye.nativeiv.bitmap.IBitmap r0 = r1.f256781b
            r0.recycle()
            r2 = 0
            r1.f256781b = r2
        L_0x017a:
            r21.close()     // Catch:{ IOException | IllegalStateException -> 0x0181 }
            goto L_0x0181
        L_0x017e:
            r19.getClass()
        L_0x0181:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p1015o6.C89117a.mo123447e(o6.c, java.lang.String, java.io.InputStream, com.github.henryye.nativeiv.ImageDecodeConfig, q6.d):void");
    }

    public void forceSetUseType(BitmapType bitmapType) {
        this.f256774d = bitmapType;
    }

    public boolean isDestroyed() {
        return this.f256776f;
    }
}
