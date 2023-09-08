package tz2;

import b03.C39696f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import gy3.C87412m;
import p232rw.C36512k;
import su0.C13781a;
import uz2.C52718u;
import uz2.C78317u1;
import z04.C112551y;

/* renamed from: tz2.i */
public final class C78123i {

    /* renamed from: a */
    public static final C78123i f228932a = new C78123i();

    /* renamed from: a */
    public static final void m94326a(C78123i iVar, C78317u1 u1Var) {
        iVar.getClass();
        C52718u uVar = u1Var.f229448d;
        Integer valueOf = uVar != null ? Integer.valueOf(uVar.f147237f) : null;
        if (valueOf != null && valueOf.intValue() == 1) {
            String str = u1Var.f229452h;
            C39696f fVar = C39696f.f106501a;
            String a = C13781a.m13082a();
            C87412m.m108593f(a, "username()");
            C86013q1.m106442c(str, fVar.mo62321d("thumb", a));
            String str2 = u1Var.f229451g;
            String a2 = C13781a.m13082a();
            C87412m.m108593f(a2, "username()");
            C86013q1.m106442c(str2, fVar.mo62321d("image", a2));
        } else if (valueOf != null && valueOf.intValue() == 2) {
            String str3 = u1Var.f229452h;
            C39696f fVar2 = C39696f.f106501a;
            String a3 = C13781a.m13082a();
            C87412m.m108593f(a3, "username()");
            C86013q1.m106442c(str3, fVar2.mo62321d("thumb", a3));
            if (C86013q1.m106450k(u1Var.f229451g)) {
                String str4 = u1Var.f229451g;
                String a4 = C13781a.m13082a();
                C87412m.m108593f(a4, "username()");
                C86013q1.m106442c(str4, fVar2.mo62320c(a4));
            }
        }
    }

    /* renamed from: b */
    public final String mo108105b(String str) {
        if (str == null || C112551y.m153811k(str)) {
            return str;
        }
        String c = mo108106c(str, new C86009m1(((C36512k) C86312j.m106911c(C36512k.class)).mo60545eS()), 100);
        return (!C86013q1.m106450k(c) || C86013q1.m106451l(c) >= C86013q1.m106451l(str)) ? str : c;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: java.io.InputStream} */
    /* JADX WARNING: type inference failed for: r8v8, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r8v9 */
    /* JADX WARNING: type inference failed for: r8v15 */
    /* JADX WARNING: type inference failed for: r8v19 */
    /* JADX WARNING: type inference failed for: r8v21 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0153 A[SYNTHETIC, Splitter:B:54:0x0153] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x015a A[SYNTHETIC, Splitter:B:58:0x015a] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01d9 A[SYNTHETIC, Splitter:B:68:0x01d9] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01e0 A[SYNTHETIC, Splitter:B:72:0x01e0] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo108106c(java.lang.String r20, com.tencent.p014mm.vfs.C86009m1 r21, int r22) {
        /*
            r19 = this;
            r1 = r20
            java.lang.String r0 = "oriPath"
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "destFile"
            r2 = r21
            gy3.C87412m.m108594g(r2, r0)
            com.tencent.mm.vfs.m1 r3 = new com.tencent.mm.vfs.m1
            r3.<init>((java.lang.String) r1)
            r4 = 1
            java.lang.Object[] r0 = new java.lang.Object[r4]
            long r5 = r3.mo119980r()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r6 = 0
            r0[r6] = r5
            java.lang.String r5 = "MicroMsg.TextStatus.UploadPackHelper"
            java.lang.String r7 = "compressBitmap:origin file: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r7, r0)
            r7 = 0
            long r8 = r3.mo119980r()     // Catch:{ Exception -> 0x0142, all -> 0x013e }
            r10 = 32768(0x8000, double:1.61895E-319)
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x012d
            boolean r0 = r21.mo119967g()     // Catch:{ Exception -> 0x0142, all -> 0x013e }
            if (r0 == 0) goto L_0x004b
            java.lang.String r0 = "dst file %s exist!"
            java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0142, all -> 0x013e }
            java.lang.String r9 = r21.mo119971i()     // Catch:{ Exception -> 0x0142, all -> 0x013e }
            r8[r6] = r9     // Catch:{ Exception -> 0x0142, all -> 0x013e }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r0, r8)     // Catch:{ Exception -> 0x0142, all -> 0x013e }
            r8 = r7
            r0 = 1
            goto L_0x012f
        L_0x004b:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x0142, all -> 0x013e }
            float r0 = kg3.C76577a.m92156g(r0)     // Catch:{ Exception -> 0x0142, all -> 0x013e }
            java.lang.String r8 = r3.mo119971i()     // Catch:{ Exception -> 0x0142, all -> 0x013e }
            android.graphics.BitmapFactory$Options r8 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getImageOptions(r8)     // Catch:{ Exception -> 0x0142, all -> 0x013e }
            int r9 = r8.outWidth     // Catch:{ Exception -> 0x0142, all -> 0x013e }
            float r9 = (float) r9     // Catch:{ Exception -> 0x0142, all -> 0x013e }
            float r9 = r9 * r0
            r10 = 1067450368(0x3fa00000, float:1.25)
            float r9 = r9 * r10
            int r11 = r8.outHeight     // Catch:{ Exception -> 0x0142, all -> 0x013e }
            float r11 = (float) r11     // Catch:{ Exception -> 0x0142, all -> 0x013e }
            float r11 = r11 * r0
            float r11 = r11 * r10
            android.content.res.Resources r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getResources()     // Catch:{ Exception -> 0x0142, all -> 0x013e }
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()     // Catch:{ Exception -> 0x0142, all -> 0x013e }
            int r10 = r0.widthPixels     // Catch:{ Exception -> 0x0142, all -> 0x013e }
            float r10 = (float) r10     // Catch:{ Exception -> 0x0142, all -> 0x013e }
            int r12 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r12 >= 0) goto L_0x0081
            int r12 = r0.heightPixels     // Catch:{ Exception -> 0x0142, all -> 0x013e }
            float r12 = (float) r12     // Catch:{ Exception -> 0x0142, all -> 0x013e }
            int r12 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r12 < 0) goto L_0x0094
        L_0x0081:
            int r12 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r12 <= 0) goto L_0x008a
            int r0 = r0.heightPixels     // Catch:{ Exception -> 0x0142, all -> 0x013e }
            float r0 = (float) r0     // Catch:{ Exception -> 0x0142, all -> 0x013e }
            float r0 = r0 / r11
            goto L_0x008c
        L_0x008a:
            float r0 = r10 / r9
        L_0x008c:
            float r9 = r9 * r0
            int r9 = (int) r9     // Catch:{ Exception -> 0x0142, all -> 0x013e }
            float r9 = (float) r9     // Catch:{ Exception -> 0x0142, all -> 0x013e }
            float r11 = r11 * r0
            int r0 = (int) r11     // Catch:{ Exception -> 0x0142, all -> 0x013e }
            float r11 = (float) r0     // Catch:{ Exception -> 0x0142, all -> 0x013e }
        L_0x0094:
            java.lang.String r0 = "getSendThumbnailPath:options %s"
            java.lang.Object[] r10 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0142, all -> 0x013e }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0142, all -> 0x013e }
            r12.<init>()     // Catch:{ Exception -> 0x0142, all -> 0x013e }
            java.lang.String r13 = ""
            r12.append(r13)     // Catch:{ Exception -> 0x0142, all -> 0x013e }
            int r13 = r8.outWidth     // Catch:{ Exception -> 0x0142, all -> 0x013e }
            r12.append(r13)     // Catch:{ Exception -> 0x0142, all -> 0x013e }
            r13 = 45
            r12.append(r13)     // Catch:{ Exception -> 0x0142, all -> 0x013e }
            int r13 = r8.outHeight     // Catch:{ Exception -> 0x0142, all -> 0x013e }
            r12.append(r13)     // Catch:{ Exception -> 0x0142, all -> 0x013e }
            java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x0142, all -> 0x013e }
            r10[r6] = r12     // Catch:{ Exception -> 0x0142, all -> 0x013e }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r0, r10)     // Catch:{ Exception -> 0x0142, all -> 0x013e }
            int r0 = r8.outWidth     // Catch:{ Exception -> 0x0142, all -> 0x013e }
            float r0 = (float) r0     // Catch:{ Exception -> 0x0142, all -> 0x013e }
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x00f9
            int r0 = r8.outHeight     // Catch:{ Exception -> 0x0142, all -> 0x013e }
            float r0 = (float) r0     // Catch:{ Exception -> 0x0142, all -> 0x013e }
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c9
            goto L_0x00f9
        L_0x00c9:
            java.io.InputStream r8 = com.tencent.p014mm.vfs.C86013q1.m106422D(r3)     // Catch:{ Exception -> 0x0142, all -> 0x013e }
            r0 = 0
            int r9 = (int) r9
            int r10 = (int) r11
            android.graphics.Bitmap r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeStream(r8, r0, r9, r10)     // Catch:{ Exception -> 0x00f2, all -> 0x00ea }
            if (r0 == 0) goto L_0x00e3
            java.io.OutputStream r7 = com.tencent.p014mm.vfs.C86013q1.m106426H(r21)     // Catch:{ Exception -> 0x00f2, all -> 0x00ea }
            android.graphics.Bitmap$CompressFormat r9 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x00f2, all -> 0x00ea }
            r14 = r22
            boolean r0 = r0.compress(r9, r14, r7)     // Catch:{ Exception -> 0x00f2, all -> 0x00ea }
            goto L_0x00e4
        L_0x00e3:
            r0 = 0
        L_0x00e4:
            r18 = r8
            r8 = r7
            r7 = r18
            goto L_0x012f
        L_0x00ea:
            r0 = move-exception
            r18 = r8
            r8 = r7
            r7 = r18
            goto L_0x01d7
        L_0x00f2:
            r0 = move-exception
            r18 = r8
            r8 = r7
            r7 = r18
            goto L_0x0144
        L_0x00f9:
            r14 = r22
            java.lang.String r10 = r3.mo119971i()     // Catch:{ Exception -> 0x0142, all -> 0x013e }
            int r11 = (int) r11     // Catch:{ Exception -> 0x0142, all -> 0x013e }
            int r12 = (int) r9     // Catch:{ Exception -> 0x0142, all -> 0x013e }
            android.graphics.Bitmap$CompressFormat r13 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x0142, all -> 0x013e }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0142, all -> 0x013e }
            r0.<init>()     // Catch:{ Exception -> 0x0142, all -> 0x013e }
            com.tencent.mm.vfs.m1 r8 = r21.mo119974l()     // Catch:{ Exception -> 0x0142, all -> 0x013e }
            gy3.C87412m.m108591d(r8)     // Catch:{ Exception -> 0x0142, all -> 0x013e }
            java.lang.String r8 = r8.mo119971i()     // Catch:{ Exception -> 0x0142, all -> 0x013e }
            r0.append(r8)     // Catch:{ Exception -> 0x0142, all -> 0x013e }
            r8 = 47
            r0.append(r8)     // Catch:{ Exception -> 0x0142, all -> 0x013e }
            java.lang.String r15 = r0.toString()     // Catch:{ Exception -> 0x0142, all -> 0x013e }
            java.lang.String r16 = r21.getName()     // Catch:{ Exception -> 0x0142, all -> 0x013e }
            r17 = 1
            r14 = r22
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.createThumbNail((java.lang.String) r10, (int) r11, (int) r12, (android.graphics.Bitmap.CompressFormat) r13, (int) r14, (java.lang.String) r15, (java.lang.String) r16, (boolean) r17)     // Catch:{ Exception -> 0x0142, all -> 0x013e }
            r8 = r7
            goto L_0x012f
        L_0x012d:
            r8 = r7
            r0 = 0
        L_0x012f:
            if (r7 == 0) goto L_0x0136
            r7.close()     // Catch:{ IOException -> 0x0135 }
            goto L_0x0136
        L_0x0135:
        L_0x0136:
            if (r8 == 0) goto L_0x0160
            r8.close()     // Catch:{ IOException -> 0x013c }
            goto L_0x0160
        L_0x013c:
            goto L_0x0160
        L_0x013e:
            r0 = move-exception
            r8 = r7
            goto L_0x01d7
        L_0x0142:
            r0 = move-exception
            r8 = r7
        L_0x0144:
            java.lang.String r9 = "exception: %s"
            java.lang.Object[] r10 = new java.lang.Object[r4]     // Catch:{ all -> 0x01d6 }
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)     // Catch:{ all -> 0x01d6 }
            r10[r6] = r0     // Catch:{ all -> 0x01d6 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r9, r10)     // Catch:{ all -> 0x01d6 }
            if (r7 == 0) goto L_0x0158
            r7.close()     // Catch:{ IOException -> 0x0157 }
            goto L_0x0158
        L_0x0157:
        L_0x0158:
            if (r8 == 0) goto L_0x015f
            r8.close()     // Catch:{ IOException -> 0x015e }
            goto L_0x015f
        L_0x015e:
        L_0x015f:
            r0 = 0
        L_0x0160:
            r7 = 2
            r8 = 3
            r9 = 95
            if (r0 == 0) goto L_0x01a5
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r1)
            r10.append(r9)
            int r1 = r19.hashCode()
            r10.append(r1)
            java.lang.String r1 = r10.toString()
            r0[r6] = r1
            long r9 = r3.mo119980r()
            java.lang.Long r1 = java.lang.Long.valueOf(r9)
            r0[r4] = r1
            long r3 = r21.mo119980r()
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r0[r7] = r1
            java.lang.String r1 = r21.mo119971i()
            r0[r8] = r1
            java.lang.String r1 = "%s %s compress success: length=%d | path=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r1, r0)
            java.lang.String r0 = r21.mo119971i()
            goto L_0x01d5
        L_0x01a5:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r9)
            int r8 = r19.hashCode()
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            r0[r6] = r2
            long r8 = r3.mo119980r()
            java.lang.Long r2 = java.lang.Long.valueOf(r8)
            r0[r4] = r2
            java.lang.String r2 = r3.mo119971i()
            r0[r7] = r2
            java.lang.String r2 = "%s compress fail: origin length=%d | path=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r2, r0)
            r0 = r1
        L_0x01d5:
            return r0
        L_0x01d6:
            r0 = move-exception
        L_0x01d7:
            if (r7 == 0) goto L_0x01de
            r7.close()     // Catch:{ IOException -> 0x01dd }
            goto L_0x01de
        L_0x01dd:
        L_0x01de:
            if (r8 == 0) goto L_0x01e3
            r8.close()     // Catch:{ IOException -> 0x01e3 }
        L_0x01e3:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tz2.C78123i.mo108106c(java.lang.String, com.tencent.mm.vfs.m1, int):java.lang.String");
    }

    /* renamed from: d */
    public final String mo108107d(String str) {
        C87412m.m108594g(str, "thumbnailPath");
        C86009m1 m1Var = new C86009m1(str);
        C86009m1 l = m1Var.mo119974l();
        C86009m1 m1Var2 = new C86009m1(l, "thumb" + m1Var.getName());
        Log.m105924i("MicroMsg.TextStatus.UploadPackHelper", "[getSendThumbnail]");
        return mo108106c(str, m1Var2, 60);
    }
}
