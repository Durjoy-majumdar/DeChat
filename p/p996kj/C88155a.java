package p996kj;

import android.graphics.BitmapFactory;

/* renamed from: kj.a */
public class C88155a extends BitmapFactory {

    /* renamed from: a */
    public static C88156a f254941a;

    /* renamed from: kj.a$a */
    public interface C88156a {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: android.graphics.Bitmap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: android.graphics.Bitmap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: android.graphics.Bitmap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: android.graphics.Bitmap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: java.io.InputStream} */
    /* JADX WARNING: type inference failed for: r1v10, types: [android.graphics.Bitmap] */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003c, code lost:
        r1 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003e, code lost:
        r3 = r1;
        r1 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0032 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:14:0x002d] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x004d A[SYNTHETIC, Splitter:B:30:0x004d] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0055 A[SYNTHETIC, Splitter:B:37:0x0055] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x005d A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap decodeResource(android.content.res.Resources r3, int r4, android.graphics.BitmapFactory.Options r5) {
        /*
            kj.a$a r0 = f254941a
            r1 = 0
            if (r0 == 0) goto L_0x0021
            lg3.i$a r0 = (lg3.C88500i.C88501a) r0
            hi3.a r0 = r0.f255639a
            boolean r0 = r0.mo121968f(r3, r4)
            if (r0 == 0) goto L_0x001d
            r0 = 0
            if (r5 == 0) goto L_0x0018
            int r0 = r5.inDensity
            float r0 = (float) r0
            r2 = 1126170624(0x43200000, float:160.0)
            float r0 = r0 / r2
        L_0x0018:
            android.graphics.Bitmap r0 = hi3.C87515a.m108831a(r3, r4, r0)
            goto L_0x001e
        L_0x001d:
            r0 = r1
        L_0x001e:
            if (r0 == 0) goto L_0x0021
            return r0
        L_0x0021:
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.bindlowMemeryOption(r5)
            android.util.TypedValue r0 = new android.util.TypedValue     // Catch:{ Exception -> 0x0051, all -> 0x004a }
            r0.<init>()     // Catch:{ Exception -> 0x0051, all -> 0x004a }
            java.io.InputStream r4 = r3.openRawResource(r4, r0)     // Catch:{ Exception -> 0x0051, all -> 0x004a }
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeResourceStream(r3, r0, r4, r1, r5)     // Catch:{ Exception -> 0x0034, all -> 0x0032 }
            goto L_0x0035
        L_0x0032:
            r3 = move-exception
            goto L_0x003c
        L_0x0034:
        L_0x0035:
            if (r1 != 0) goto L_0x0042
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeStream(r4)     // Catch:{ Exception -> 0x003e, all -> 0x0032 }
            goto L_0x0042
        L_0x003c:
            r1 = r4
            goto L_0x004b
        L_0x003e:
            r3 = r1
            r1 = r4
            goto L_0x0053
        L_0x0042:
            if (r4 == 0) goto L_0x005b
            r4.close()     // Catch:{ IOException -> 0x0048 }
            goto L_0x005b
        L_0x0048:
            goto L_0x005b
        L_0x004a:
            r3 = move-exception
        L_0x004b:
            if (r1 == 0) goto L_0x0050
            r1.close()     // Catch:{ IOException -> 0x0050 }
        L_0x0050:
            throw r3
        L_0x0051:
            r3 = r1
        L_0x0053:
            if (r1 == 0) goto L_0x005a
            r1.close()     // Catch:{ IOException -> 0x0059 }
            goto L_0x005a
        L_0x0059:
        L_0x005a:
            r1 = r3
        L_0x005b:
            if (r1 != 0) goto L_0x0068
            if (r5 != 0) goto L_0x0060
            goto L_0x0068
        L_0x0060:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Problem decoding into existing bitmap"
            r3.<init>(r4)
            throw r3
        L_0x0068:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p996kj.C88155a.decodeResource(android.content.res.Resources, int, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }
}
