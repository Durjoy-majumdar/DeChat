package com.tencent.p014mm.sdk.platformtools;

import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\u001a\f\u0010\u0002\u001a\u00020\u0003*\u0004\u0018\u00010\u0001\u001a\f\u0010\u0004\u001a\u00020\u0005*\u0004\u0018\u00010\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, mo182094d2 = {"TAG", "", "safeToInt", "", "safeToLong", "", "wechat-internal-support_release"}, mo182095k = 2, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.sdk.platformtools.StringKtKt */
public final class StringKtKt {
    public static final String TAG = "MicroMsg.StringKt";

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0012 A[Catch:{ NumberFormatException -> 0x000d }] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0017 A[Catch:{ NumberFormatException -> 0x000d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int safeToInt(java.lang.String r3) {
        /*
            r0 = 1
            r1 = 0
            if (r3 == 0) goto L_0x000f
            boolean r2 = z04.C112551y.m153811k(r3)     // Catch:{ NumberFormatException -> 0x000d }
            if (r2 == 0) goto L_0x000b
            goto L_0x000f
        L_0x000b:
            r2 = 0
            goto L_0x0010
        L_0x000d:
            r3 = move-exception
            goto L_0x0026
        L_0x000f:
            r2 = 1
        L_0x0010:
            if (r2 == 0) goto L_0x0017
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x000d }
            goto L_0x001b
        L_0x0017:
            java.lang.Integer r3 = java.lang.Integer.decode(r3)     // Catch:{ NumberFormatException -> 0x000d }
        L_0x001b:
            java.lang.String r2 = "{\n        if (this.isNul…nteger.decode(this)\n    }"
            gy3.C87412m.m108593f(r3, r2)     // Catch:{ NumberFormatException -> 0x000d }
            int r1 = r3.intValue()     // Catch:{ NumberFormatException -> 0x000d }
            goto L_0x0035
        L_0x0026:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r3 = r3.getMessage()
            r0[r1] = r3
            java.lang.String r3 = "MicroMsg.StringKt"
            java.lang.String r2 = "safeToInt fail %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r2, r0)
        L_0x0035:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.platformtools.StringKtKt.safeToInt(java.lang.String):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0014 A[Catch:{ NumberFormatException -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0015 A[Catch:{ NumberFormatException -> 0x000f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long safeToLong(java.lang.String r5) {
        /*
            r0 = 0
            r2 = 0
            r3 = 1
            if (r5 == 0) goto L_0x0011
            boolean r4 = z04.C112551y.m153811k(r5)     // Catch:{ NumberFormatException -> 0x000f }
            if (r4 == 0) goto L_0x000d
            goto L_0x0011
        L_0x000d:
            r4 = 0
            goto L_0x0012
        L_0x000f:
            r5 = move-exception
            goto L_0x001a
        L_0x0011:
            r4 = 1
        L_0x0012:
            if (r4 == 0) goto L_0x0015
            goto L_0x0029
        L_0x0015:
            long r0 = java.lang.Long.parseLong(r5)     // Catch:{ NumberFormatException -> 0x000f }
            goto L_0x0029
        L_0x001a:
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r5 = r5.getMessage()
            r3[r2] = r5
            java.lang.String r5 = "MicroMsg.StringKt"
            java.lang.String r2 = "safeToLong fail %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r2, r3)
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.platformtools.StringKtKt.safeToLong(java.lang.String):long");
    }
}
