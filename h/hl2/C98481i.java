package hl2;

import android.graphics.Point;
import te3.C101856vd;

/* renamed from: hl2.i */
public final class C98481i {

    /* renamed from: hl2.i$a */
    public interface C98482a {
        /* renamed from: a */
        void mo137842a(C98484c cVar);

        /* renamed from: b */
        void mo137843b(String str);
    }

    /* renamed from: hl2.i$b */
    public static final class C98483b {

        /* renamed from: a */
        public final int f288838a;

        /* renamed from: b */
        public String f288839b = "";

        /* renamed from: c */
        public Point f288840c;

        /* renamed from: d */
        public String f288841d = "";

        /* renamed from: e */
        public String f288842e = "";

        /* renamed from: f */
        public int f288843f;

        /* renamed from: g */
        public boolean f288844g;

        public C98483b(long j, int i) {
            this.f288838a = i;
        }

        /* renamed from: a */
        public final C101856vd mo137847a() {
            C101856vd vdVar = new C101856vd();
            int i = this.f288843f;
            if (i == 1) {
                vdVar.f299665d = 1;
            } else if (i == 0) {
                vdVar.f299665d = 2;
            }
            vdVar.f299668g = this.f288841d;
            vdVar.f299669h = this.f288842e;
            Point point = this.f288840c;
            vdVar.f299666e = point != null ? point.x : 0;
            vdVar.f299667f = point != null ? point.y : 0;
            vdVar.f299670i = 0;
            return vdVar;
        }
    }

    /* renamed from: hl2.i$c */
    public static final class C98484c {

        /* renamed from: a */
        public int f288845a;

        /* renamed from: b */
        public C101856vd f288846b;

        /* renamed from: c */
        public int f288847c = -1;

        /* renamed from: d */
        public int f288848d = -1;

        /* renamed from: e */
        public String f288849e = "";
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final hl2.C98481i.C98484c m127933a(hl2.C98481i.C98483b r8, int r9) {
        /*
            java.lang.String r0 = "checkRequest"
            gy3.C87412m.m108594g(r8, r0)
            hl2.i$c r0 = new hl2.i$c
            r0.<init>()
            java.lang.String r1 = r8.f288839b
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106450k(r1)
            android.graphics.Point r2 = r8.f288840c
            rx3.g r3 = hl2.C8596a.f27688a
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L_0x0019
            goto L_0x002e
        L_0x0019:
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r3] = r2
            java.lang.String r6 = "MicroMsg.AIScanImageCdnUploadUtil"
            java.lang.String r7 = "alvinluo isImageSizeLargerThanConfig image size: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r7, r5)
            int r5 = r2.x
            int r2 = r2.y
            int r5 = r5 * r2
            if (r5 <= r9) goto L_0x002e
            r9 = 1
            goto L_0x002f
        L_0x002e:
            r9 = 0
        L_0x002f:
            r2 = 2
            r5 = 3
            if (r1 == 0) goto L_0x0038
            if (r9 == 0) goto L_0x0038
            r0.f288845a = r4
            goto L_0x003f
        L_0x0038:
            if (r1 == 0) goto L_0x003d
            r0.f288845a = r2
            goto L_0x003f
        L_0x003d:
            r0.f288845a = r5
        L_0x003f:
            r9 = 6
            java.lang.Object[] r9 = new java.lang.Object[r9]
            int r6 = r8.f288838a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r9[r3] = r6
            int r3 = r8.f288843f
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r9[r4] = r3
            android.graphics.Point r3 = r8.f288840c
            r9[r2] = r3
            java.lang.String r8 = r8.f288839b
            r9[r5] = r8
            r8 = 4
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r9[r8] = r1
            r8 = 5
            int r1 = r0.f288845a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r9[r8] = r1
            java.lang.String r8 = "MicroMsg.AiScanImageCDNCheckHelper"
            java.lang.String r1 = "alvinluo checkImageValid imageSrc: %s, compressType: %d, imageSize: %s, imagePath: %s, fileExist: %s, checkResult: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r1, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hl2.C98481i.m127933a(hl2.i$b, int):hl2.i$c");
    }
}
