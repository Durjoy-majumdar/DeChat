package y80;

import android.content.Context;
import gy3.C87412m;

/* renamed from: y80.e */
public final class C112404e extends C112399d {

    /* renamed from: O */
    public final String f336574O = "CommonCamera1ForFinderLive";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C112404e(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r6 = r9.f336574O;
        com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, "selectNoCropPreviewSize fail resolutionLimit:" + r10 + "!!");
        r10 = new i72.C108383i.C108387d();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x001e */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo143143F(int r10) {
        /*
            r9 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            boolean r3 = r9.mo143141C()     // Catch:{ CameraAccessException -> 0x00e7, Exception -> 0x00d0 }
            android.graphics.Point r4 = r9.mo164110D()     // Catch:{ CameraAccessException -> 0x00e7, Exception -> 0x00d0 }
            android.util.Size[] r5 = r9.mo143142E()     // Catch:{ CameraAccessException -> 0x00e7, Exception -> 0x00d0 }
            if (r5 != 0) goto L_0x0019
            java.lang.String r10 = r9.f336574O     // Catch:{ CameraAccessException -> 0x00e7, Exception -> 0x00d0 }
            java.lang.String r3 = "fuck, preview size null!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r3)     // Catch:{ CameraAccessException -> 0x00e7, Exception -> 0x00d0 }
            return r2
        L_0x0019:
            i72.i$d r10 = i72.C108383i.m146829c(r5, r4, r10, r3)     // Catch:{ Exception -> 0x001e }
            goto L_0x003e
        L_0x001e:
            java.lang.String r6 = r9.f336574O     // Catch:{ CameraAccessException -> 0x00e7, Exception -> 0x00d0 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ CameraAccessException -> 0x00e7, Exception -> 0x00d0 }
            r7.<init>()     // Catch:{ CameraAccessException -> 0x00e7, Exception -> 0x00d0 }
            java.lang.String r8 = "selectNoCropPreviewSize fail resolutionLimit:"
            r7.append(r8)     // Catch:{ CameraAccessException -> 0x00e7, Exception -> 0x00d0 }
            r7.append(r10)     // Catch:{ CameraAccessException -> 0x00e7, Exception -> 0x00d0 }
            java.lang.String r10 = "!!"
            r7.append(r10)     // Catch:{ CameraAccessException -> 0x00e7, Exception -> 0x00d0 }
            java.lang.String r10 = r7.toString()     // Catch:{ CameraAccessException -> 0x00e7, Exception -> 0x00d0 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r10)     // Catch:{ CameraAccessException -> 0x00e7, Exception -> 0x00d0 }
            i72.i$d r10 = new i72.i$d     // Catch:{ CameraAccessException -> 0x00e7, Exception -> 0x00d0 }
            r10.<init>()     // Catch:{ CameraAccessException -> 0x00e7, Exception -> 0x00d0 }
        L_0x003e:
            android.graphics.Point r6 = r10.f324531a     // Catch:{ CameraAccessException -> 0x00e7, Exception -> 0x00d0 }
            if (r6 != 0) goto L_0x0064
            java.lang.String r10 = r9.f336574O     // Catch:{ CameraAccessException -> 0x00e7, Exception -> 0x00d0 }
            java.lang.String r6 = "fuck, preview size still null!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r6)     // Catch:{ CameraAccessException -> 0x00e7, Exception -> 0x00d0 }
            android.graphics.Point r10 = new android.graphics.Point     // Catch:{ CameraAccessException -> 0x00e7, Exception -> 0x00d0 }
            int r6 = r4.x     // Catch:{ CameraAccessException -> 0x00e7, Exception -> 0x00d0 }
            int r7 = r4.y     // Catch:{ CameraAccessException -> 0x00e7, Exception -> 0x00d0 }
            int r6 = java.lang.Math.min(r6, r7)     // Catch:{ CameraAccessException -> 0x00e7, Exception -> 0x00d0 }
            int r7 = r4.x     // Catch:{ CameraAccessException -> 0x00e7, Exception -> 0x00d0 }
            int r4 = r4.y     // Catch:{ CameraAccessException -> 0x00e7, Exception -> 0x00d0 }
            int r4 = java.lang.Math.max(r7, r4)     // Catch:{ CameraAccessException -> 0x00e7, Exception -> 0x00d0 }
            r10.<init>(r6, r4)     // Catch:{ CameraAccessException -> 0x00e7, Exception -> 0x00d0 }
            int r4 = r9.f336530d     // Catch:{ CameraAccessException -> 0x00e7, Exception -> 0x00d0 }
            i72.i$d r10 = i72.C108383i.m146834h(r5, r10, r4, r3)     // Catch:{ CameraAccessException -> 0x00e7, Exception -> 0x00d0 }
        L_0x0064:
            android.graphics.Point r3 = r10.f324531a     // Catch:{ CameraAccessException -> 0x00e7, Exception -> 0x00d0 }
            if (r3 != 0) goto L_0x0083
            java.lang.String r3 = r9.f336574O     // Catch:{ CameraAccessException -> 0x00e7, Exception -> 0x00d0 }
            java.lang.String r4 = "checkMore start %s"
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ CameraAccessException -> 0x00e7, Exception -> 0x00d0 }
            java.lang.String r6 = r10.toString()     // Catch:{ CameraAccessException -> 0x00e7, Exception -> 0x00d0 }
            r5[r2] = r6     // Catch:{ CameraAccessException -> 0x00e7, Exception -> 0x00d0 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r5)     // Catch:{ CameraAccessException -> 0x00e7, Exception -> 0x00d0 }
            android.graphics.Point r3 = r10.f324534d     // Catch:{ CameraAccessException -> 0x00e7, Exception -> 0x00d0 }
            r10.f324531a = r3     // Catch:{ CameraAccessException -> 0x00e7, Exception -> 0x00d0 }
            android.graphics.Point r3 = r10.f324535e     // Catch:{ CameraAccessException -> 0x00e7, Exception -> 0x00d0 }
            r10.f324532b = r3     // Catch:{ CameraAccessException -> 0x00e7, Exception -> 0x00d0 }
            android.graphics.Point r3 = r10.f324536f     // Catch:{ CameraAccessException -> 0x00e7, Exception -> 0x00d0 }
            r10.f324533c = r3     // Catch:{ CameraAccessException -> 0x00e7, Exception -> 0x00d0 }
        L_0x0083:
            android.util.Size r3 = new android.util.Size     // Catch:{ CameraAccessException -> 0x00e7, Exception -> 0x00d0 }
            android.graphics.Point r4 = r10.f324531a     // Catch:{ CameraAccessException -> 0x00e7, Exception -> 0x00d0 }
            int r5 = r4.x     // Catch:{ CameraAccessException -> 0x00e7, Exception -> 0x00d0 }
            int r4 = r4.y     // Catch:{ CameraAccessException -> 0x00e7, Exception -> 0x00d0 }
            r3.<init>(r5, r4)     // Catch:{ CameraAccessException -> 0x00e7, Exception -> 0x00d0 }
            i72.s r4 = r9.f336537k     // Catch:{ CameraAccessException -> 0x00e7, Exception -> 0x00d0 }
            int r5 = r3.getWidth()     // Catch:{ CameraAccessException -> 0x00e7, Exception -> 0x00d0 }
            r4.f324562c = r5     // Catch:{ CameraAccessException -> 0x00e7, Exception -> 0x00d0 }
            i72.s r4 = r9.f336537k     // Catch:{ CameraAccessException -> 0x00e7, Exception -> 0x00d0 }
            int r5 = r3.getHeight()     // Catch:{ CameraAccessException -> 0x00e7, Exception -> 0x00d0 }
            r4.f324561b = r5     // Catch:{ CameraAccessException -> 0x00e7, Exception -> 0x00d0 }
            android.graphics.Point r10 = r10.f324533c     // Catch:{ CameraAccessException -> 0x00e7, Exception -> 0x00d0 }
            if (r10 == 0) goto L_0x00a4
            r9.f336545s = r10     // Catch:{ CameraAccessException -> 0x00e7, Exception -> 0x00d0 }
        L_0x00a4:
            int r10 = r3.getWidth()     // Catch:{ CameraAccessException -> 0x00e7, Exception -> 0x00d0 }
            int r4 = r3.getHeight()     // Catch:{ CameraAccessException -> 0x00e7, Exception -> 0x00d0 }
            r9.mo143144G(r10, r4)     // Catch:{ CameraAccessException -> 0x00e7, Exception -> 0x00d0 }
            java.lang.String r10 = r9.f336574O     // Catch:{ CameraAccessException -> 0x00e7, Exception -> 0x00d0 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ CameraAccessException -> 0x00e7, Exception -> 0x00d0 }
            r4.<init>()     // Catch:{ CameraAccessException -> 0x00e7, Exception -> 0x00d0 }
            java.lang.String r5 = "final set camera preview size: "
            r4.append(r5)     // Catch:{ CameraAccessException -> 0x00e7, Exception -> 0x00d0 }
            r4.append(r3)     // Catch:{ CameraAccessException -> 0x00e7, Exception -> 0x00d0 }
            java.lang.String r3 = ", cropSize: "
            r4.append(r3)     // Catch:{ CameraAccessException -> 0x00e7, Exception -> 0x00d0 }
            android.graphics.Point r3 = r9.f336545s     // Catch:{ CameraAccessException -> 0x00e7, Exception -> 0x00d0 }
            r4.append(r3)     // Catch:{ CameraAccessException -> 0x00e7, Exception -> 0x00d0 }
            java.lang.String r3 = r4.toString()     // Catch:{ CameraAccessException -> 0x00e7, Exception -> 0x00d0 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r3)     // Catch:{ CameraAccessException -> 0x00e7, Exception -> 0x00d0 }
            return r1
        L_0x00d0:
            r10 = move-exception
            java.lang.String r3 = r9.f336574O
            java.lang.Object[] r0 = new java.lang.Object[r0]
            android.os.Looper r4 = android.os.Looper.myLooper()
            r0[r2] = r4
            java.lang.String r4 = r10.getMessage()
            r0[r1] = r4
            java.lang.String r1 = "selectNoCropPreviewSize Exception, %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r10, r1, r0)
            return r2
        L_0x00e7:
            r10 = move-exception
            java.lang.String r3 = r9.f336574O
            java.lang.Object[] r0 = new java.lang.Object[r0]
            android.os.Looper r4 = android.os.Looper.myLooper()
            r0[r2] = r4
            java.lang.String r4 = r10.getMessage()
            r0[r1] = r4
            java.lang.String r1 = "selectNoCropPreviewSize Exception by camera access exception, %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r10, r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: y80.C112404e.mo143143F(int):boolean");
    }
}
