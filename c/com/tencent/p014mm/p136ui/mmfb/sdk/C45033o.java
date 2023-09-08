package com.tencent.p014mm.p136ui.mmfb.sdk;

import java.util.Arrays;
import java.util.List;

/* renamed from: com.tencent.mm.ui.mmfb.sdk.o */
public final class C45033o {

    /* renamed from: a */
    public static final String f122134a = "com.facebook.platform.protocol.PROTOCOL_VERSION";

    /* renamed from: b */
    public static final String f122135b = "com.facebook.platform.protocol.CALL_ID";

    /* renamed from: c */
    public static final String f122136c = "com.facebook.platform.protocol.BRIDGE_ARGS";

    /* renamed from: d */
    public static final String f122137d = "com.facebook.platform.protocol.RESULT_ARGS";

    /* renamed from: e */
    public static final List<Integer> f122138e = Arrays.asList(new Integer[]{20170417, 20160327, 20141218, 20141107, 20141028, 20141001, 20140701, 20140324, 20140204, 20131107, 20130618, 20130502, 20121101});

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0042 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0043  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Intent m49877a(android.content.Intent r6, android.os.Bundle r7, java.lang.RuntimeException r8) {
        /*
            java.lang.String r0 = "action_id"
            r1 = 0
            r2 = 0
            if (r6 != 0) goto L_0x0007
            goto L_0x003f
        L_0x0007:
            java.lang.String r3 = f122134a
            int r3 = r6.getIntExtra(r3, r1)
            java.util.List<java.lang.Integer> r4 = f122138e
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L_0x0020
            r4 = 20140701(0x133529d, float:3.293638E-38)
            if (r3 < r4) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = 0
        L_0x0021:
            if (r3 == 0) goto L_0x0032
            java.lang.String r3 = f122136c
            android.os.Bundle r3 = r6.getBundleExtra(r3)
            if (r3 == 0) goto L_0x0030
            java.lang.String r3 = r3.getString(r0)
            goto L_0x0038
        L_0x0030:
            r3 = r2
            goto L_0x0038
        L_0x0032:
            java.lang.String r3 = f122135b
            java.lang.String r3 = r6.getStringExtra(r3)
        L_0x0038:
            if (r3 == 0) goto L_0x003f
            java.util.UUID r3 = java.util.UUID.fromString(r3)     // Catch:{ IllegalArgumentException -> 0x003f }
            goto L_0x0040
        L_0x003f:
            r3 = r2
        L_0x0040:
            if (r3 != 0) goto L_0x0043
            return r2
        L_0x0043:
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r4 = f122134a
            int r6 = r6.getIntExtra(r4, r1)
            r2.putExtra(r4, r6)
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            java.lang.String r1 = r3.toString()
            r6.putString(r0, r1)
            if (r8 == 0) goto L_0x0079
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r8 = r8.toString()
            java.lang.String r1 = "error_description"
            r0.putString(r1, r8)
            java.lang.String r8 = "error_type"
            java.lang.String r1 = "UserCanceled"
            r0.putString(r8, r1)
            java.lang.String r8 = "error"
            r6.putBundle(r8, r0)
        L_0x0079:
            java.lang.String r8 = f122136c
            r2.putExtra(r8, r6)
            if (r7 == 0) goto L_0x0085
            java.lang.String r6 = f122137d
            r2.putExtra(r6, r7)
        L_0x0085:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.mmfb.sdk.C45033o.m49877a(android.content.Intent, android.os.Bundle, java.lang.RuntimeException):android.content.Intent");
    }
}
