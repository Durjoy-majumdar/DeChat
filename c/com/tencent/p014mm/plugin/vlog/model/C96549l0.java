package com.tencent.p014mm.plugin.vlog.model;

import gy3.C8480h;

/* renamed from: com.tencent.mm.plugin.vlog.model.l0 */
public class C96549l0 {

    /* renamed from: d */
    public static final C96550a f282563d = new C96550a((C8480h) null);

    /* renamed from: a */
    public int f282564a;

    /* renamed from: b */
    public int f282565b;

    /* renamed from: c */
    public int f282566c;

    /* renamed from: com.tencent.mm.plugin.vlog.model.l0$a */
    public static final class C96550a {
        public C96550a(C8480h hVar) {
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: java.lang.Integer} */
        /* JADX WARNING: type inference failed for: r8v0 */
        /* JADX WARNING: type inference failed for: r8v12, types: [com.tencent.mm.plugin.vlog.model.l0, java.lang.Object] */
        /* JADX WARNING: type inference failed for: r8v13 */
        /* JADX WARNING: type inference failed for: r8v14 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.util.List<com.tencent.p014mm.plugin.vlog.model.C96549l0> mo134607a(java.util.List<java.lang.String> r18, java.util.List<java.lang.Integer> r19, java.util.List<java.lang.Integer> r20) {
            /*
                r17 = this;
                r1 = r19
                r2 = r20
                java.lang.String r0 = "paths"
                r3 = r18
                gy3.C87412m.m108594g(r3, r0)
                java.lang.String r0 = "types"
                gy3.C87412m.m108594g(r1, r0)
                java.lang.String r0 = "sourceFrom"
                gy3.C87412m.m108594g(r2, r0)
                java.util.LinkedList r4 = new java.util.LinkedList
                r4.<init>()
                java.util.Iterator r3 = r18.iterator()
                r5 = 0
                r6 = 0
            L_0x0023:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L_0x0116
                java.lang.Object r0 = r3.next()
                int r7 = r6 + 1
                r8 = 0
                if (r6 < 0) goto L_0x0112
                r12 = r0
                java.lang.String r12 = (java.lang.String) r12
                java.lang.Object r0 = sx3.C110818d0.m150917O(r1, r6)
                java.lang.Integer r0 = (java.lang.Integer) r0
                r9 = 2
                java.lang.String r10 = "path"
                r11 = 90
                r13 = 270(0x10e, float:3.78E-43)
                if (r0 != 0) goto L_0x0046
                goto L_0x008f
            L_0x0046:
                int r0 = r0.intValue()
                if (r0 != r9) goto L_0x008f
                gy3.C87412m.m108594g(r12, r10)
                com.tencent.mm.plugin.recordvideo.util.MultiMediaVideoChecker r0 = com.tencent.p014mm.plugin.recordvideo.util.MultiMediaVideoChecker.f273077a     // Catch:{ Exception -> 0x0070 }
                rw.m$a r0 = r0.mo129930b(r12)     // Catch:{ Exception -> 0x0070 }
                if (r0 == 0) goto L_0x007c
                int r9 = r0.f180525a     // Catch:{ Exception -> 0x0070 }
                int r10 = r0.f180526b     // Catch:{ Exception -> 0x0070 }
                long r14 = r0.f180528d     // Catch:{ Exception -> 0x0070 }
                int r0 = r0.f180530f     // Catch:{ Exception -> 0x0070 }
                if (r0 == r11) goto L_0x0066
                if (r0 == r13) goto L_0x0066
                r11 = r10
                r10 = r9
                goto L_0x0067
            L_0x0066:
                r11 = r9
            L_0x0067:
                com.tencent.mm.plugin.vlog.model.z0 r0 = new com.tencent.mm.plugin.vlog.model.z0     // Catch:{ Exception -> 0x0070 }
                r9 = r0
                r13 = r14
                r9.<init>(r10, r11, r12, r13)     // Catch:{ Exception -> 0x0070 }
                r8 = r0
                goto L_0x007c
            L_0x0070:
                r0 = move-exception
                java.lang.Object[] r9 = new java.lang.Object[r5]
                int r10 = p213oh.C11412b.f33577a
                java.lang.String r10 = "MicroMsg.SourceMaterial"
                java.lang.String r11 = "createVideoSource error"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r10, r0, r11, r9)
            L_0x007c:
                if (r8 == 0) goto L_0x010f
                java.lang.Object r0 = r2.get(r6)
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                r8.f282566c = r0
                r4.add(r8)
                goto L_0x010f
            L_0x008f:
                gy3.C87412m.m108594g(r12, r10)
                android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
                r0.<init>()
                r9 = 1
                r0.inJustDecodeBounds = r9
                com.tencent.p014mm.graphics.MMBitmapFactory.m98735d(r12, r0)
                java.io.InputStream r10 = com.tencent.p014mm.vfs.C86013q1.m106423E(r12)
                if (r10 == 0) goto L_0x00b7
                androidx.exifinterface.media.ExifInterface r14 = new androidx.exifinterface.media.ExifInterface     // Catch:{ all -> 0x00ae }
                r14.<init>((java.io.InputStream) r10)     // Catch:{ all -> 0x00ae }
                rx3.b0 r15 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x00ae }
                cy3.C58003b.m67160a(r10, r8)
                goto L_0x00b8
            L_0x00ae:
                r0 = move-exception
                r1 = r0
                throw r1     // Catch:{ all -> 0x00b1 }
            L_0x00b1:
                r0 = move-exception
                r2 = r0
                cy3.C58003b.m67160a(r10, r1)
                throw r2
            L_0x00b7:
                r14 = r8
            L_0x00b8:
                if (r14 == 0) goto L_0x00c4
                java.lang.String r8 = "Orientation"
                int r8 = r14.getAttributeInt(r8, r9)
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            L_0x00c4:
                r9 = 6
                if (r8 != 0) goto L_0x00c8
                goto L_0x00d1
            L_0x00c8:
                int r10 = r8.intValue()
                if (r10 != r9) goto L_0x00d1
                r8 = 90
                goto L_0x00ed
            L_0x00d1:
                r9 = 3
                if (r8 != 0) goto L_0x00d5
                goto L_0x00de
            L_0x00d5:
                int r10 = r8.intValue()
                if (r10 != r9) goto L_0x00de
                r8 = 180(0xb4, float:2.52E-43)
                goto L_0x00ed
            L_0x00de:
                r9 = 8
                if (r8 != 0) goto L_0x00e3
                goto L_0x00ec
            L_0x00e3:
                int r8 = r8.intValue()
                if (r8 != r9) goto L_0x00ec
                r8 = 270(0x10e, float:3.78E-43)
                goto L_0x00ed
            L_0x00ec:
                r8 = 0
            L_0x00ed:
                int r9 = r0.outWidth
                int r0 = r0.outHeight
                if (r8 == r11) goto L_0x00f6
                if (r8 == r13) goto L_0x00f6
                goto L_0x00fb
            L_0x00f6:
                r16 = r9
                r9 = r0
                r0 = r16
            L_0x00fb:
                com.tencent.mm.plugin.vlog.model.b0 r8 = new com.tencent.mm.plugin.vlog.model.b0
                r8.<init>(r9, r0, r12)
                java.lang.Object r0 = r2.get(r6)
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                r8.f282566c = r0
                r4.add(r8)
            L_0x010f:
                r6 = r7
                goto L_0x0023
            L_0x0112:
                sx3.C64197v.m75542k()
                throw r8
            L_0x0116:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.vlog.model.C96549l0.C96550a.mo134607a(java.util.List, java.util.List, java.util.List):java.util.List");
        }
    }

    public C96549l0(int i, int i2, int i3, int i4, int i5, C8480h hVar) {
        i4 = (i5 & 8) != 0 ? 0 : i4;
        this.f282564a = i;
        this.f282565b = i2;
        this.f282566c = i4;
    }
}
