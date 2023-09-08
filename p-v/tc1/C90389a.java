package tc1;

import android.os.Build;
import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import p206nj.C117627q;
import qe3.C89625d;

/* renamed from: tc1.a */
public class C90389a {

    /* renamed from: a */
    public static final String[] f259397a = {"A53", "A53m", "A53t", "A33m", "A33", "A33t", "R7Plust", "R7Plus", "A59t", "A59s", "A59m", "R9PlustA", "R9PlusmA", "R9PlustmA", "R9tm", "R9m", "R9km", "A37t", "A37m", "R7sPlus", "R7Plusm", "A53", "A51kc", "A51", "A30"};

    /* renamed from: b */
    public static final String[] f259398b = {"V1950A", "V1955A"};

    /* renamed from: c */
    public static final String[] f259399c = {"Hi3751V811", "IdeaHub"};

    /* renamed from: a */
    public static boolean m113187a() {
        String str;
        MultiProcessMMKV multiProcessMMKV = MultiProcessMMKV.getDefault();
        if (multiProcessMMKV != null) {
            String string = multiProcessMMKV.getString("fcm_last_anr_fg", "");
            if (!TextUtils.isEmpty(string)) {
                try {
                    str = C117627q.m165909b(Build.FINGERPRINT, "utf-8");
                } catch (Throwable unused) {
                    str = String.valueOf(C89625d.f257841g);
                }
                if (string.equals(str)) {
                    Log.m105924i("MicroMsg.FCM.FcmServiceHelper", "fcm anr happened: " + string);
                    return true;
                }
            }
        }
        Log.m105924i("MicroMsg.FCM.FcmServiceHelper", "not yet fcm anr happened");
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f3  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m113188b(android.content.Context r9) {
        /*
            boolean r0 = p206nj.C76866m.m92674c()
            java.lang.String r1 = "fcm service incompatible!"
            r2 = 1
            r3 = 0
            java.lang.String r4 = "MicroMsg.FCM.FcmServiceHelper"
            if (r0 == 0) goto L_0x0046
            int r0 = android.os.Build.VERSION.SDK_INT
            r5 = 21
            if (r0 == r5) goto L_0x0016
            r5 = 22
            if (r0 != r5) goto L_0x0046
        L_0x0016:
            java.lang.String[] r0 = f259397a
            r5 = 25
            r6 = 0
        L_0x001b:
            if (r6 >= r5) goto L_0x0046
            r7 = r0[r6]
            java.lang.String r8 = android.os.Build.DEVICE
            boolean r8 = r7.equalsIgnoreCase(r8)
            if (r8 != 0) goto L_0x0033
            java.lang.String r8 = android.os.Build.PRODUCT
            boolean r7 = r7.equalsIgnoreCase(r8)
            if (r7 == 0) goto L_0x0030
            goto L_0x0033
        L_0x0030:
            int r6 = r6 + 1
            goto L_0x001b
        L_0x0033:
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r1)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r1 = p156gj.C87203t.m108275k()
            r0[r3] = r1
            java.lang.String r1 = "for oppo firebase problem, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r1, r0)
        L_0x0043:
            r0 = 1
            goto L_0x00b8
        L_0x0046:
            boolean r0 = p206nj.C76866m.m92677f()
            r5 = 2
            if (r0 == 0) goto L_0x007f
            int r0 = android.os.Build.VERSION.SDK_INT
            r6 = 29
            if (r0 != r6) goto L_0x007f
            java.lang.String[] r0 = f259398b
            r6 = 0
        L_0x0056:
            if (r6 >= r5) goto L_0x007f
            r7 = r0[r6]
            java.lang.String r8 = android.os.Build.DEVICE
            boolean r8 = r7.equalsIgnoreCase(r8)
            if (r8 != 0) goto L_0x006e
            java.lang.String r8 = android.os.Build.PRODUCT
            boolean r7 = r7.equalsIgnoreCase(r8)
            if (r7 == 0) goto L_0x006b
            goto L_0x006e
        L_0x006b:
            int r6 = r6 + 1
            goto L_0x0056
        L_0x006e:
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r1)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r1 = p156gj.C87203t.m108275k()
            r0[r3] = r1
            java.lang.String r1 = "for vivo firebase problem, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r1, r0)
            goto L_0x0043
        L_0x007f:
            boolean r0 = p206nj.C76866m.m92673b()
            if (r0 == 0) goto L_0x00b7
            int r0 = android.os.Build.VERSION.SDK_INT
            r6 = 28
            if (r0 < r6) goto L_0x00b7
            java.lang.String[] r0 = f259399c
            r6 = 0
        L_0x008e:
            if (r6 >= r5) goto L_0x00b7
            r7 = r0[r6]
            java.lang.String r8 = android.os.Build.DEVICE
            boolean r8 = r7.equalsIgnoreCase(r8)
            if (r8 != 0) goto L_0x00a6
            java.lang.String r8 = android.os.Build.PRODUCT
            boolean r7 = r7.equalsIgnoreCase(r8)
            if (r7 == 0) goto L_0x00a3
            goto L_0x00a6
        L_0x00a3:
            int r6 = r6 + 1
            goto L_0x008e
        L_0x00a6:
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r1)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r1 = p156gj.C87203t.m108275k()
            r0[r3] = r1
            java.lang.String r1 = "for huawei firebase problem, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r1, r0)
            goto L_0x0043
        L_0x00b7:
            r0 = 0
        L_0x00b8:
            java.lang.String r1 = "fcm is available"
            if (r0 == 0) goto L_0x00f3
            java.lang.String r0 = "fcm-incompatible device"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r0)
            int r9 = com.google.android.gms.common.GooglePlayServicesUtil.isGooglePlayServicesAvailable(r9)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "check google play service available, code = "
            r0.append(r5)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            if (r9 == 0) goto L_0x00e1
            java.lang.String r9 = "fcm is NOT available"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r9)
            return r3
        L_0x00e1:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            boolean r9 = com.tencent.p014mm.sdk.platformtools.ChannelUtil.isGPVersion()
            if (r9 != 0) goto L_0x00f2
            boolean r9 = m113187a()
            if (r9 != 0) goto L_0x00f1
            goto L_0x00f2
        L_0x00f1:
            r2 = 0
        L_0x00f2:
            return r2
        L_0x00f3:
            java.lang.String r9 = "normal device"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r9)
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            boolean r9 = com.tencent.p014mm.sdk.platformtools.ChannelUtil.isGPVersion()
            if (r9 != 0) goto L_0x0109
            boolean r9 = m113187a()
            if (r9 != 0) goto L_0x0108
            goto L_0x0109
        L_0x0108:
            r2 = 0
        L_0x0109:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: tc1.C90389a.m113188b(android.content.Context):boolean");
    }
}
