package z33;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import l33.C109247e;
import p447aw.C103918d;

/* renamed from: z33.j */
public class C112597j {

    /* renamed from: a */
    public static long f337179a;

    /* renamed from: b */
    public static int f337180b;

    /* renamed from: c */
    public static long f337181c;

    /* renamed from: a */
    public static void m153936a(String str, String str2) {
        Log.m105918d(str, "[" + Thread.currentThread().getId() + "]" + str2);
    }

    /* renamed from: b */
    public static void m153937b(String str, String str2) {
        Log.m105920e(str, "[" + Thread.currentThread().getId() + "]" + str2);
    }

    /* renamed from: c */
    public static void m153938c(String str, String str2) {
        Log.m105924i(str, "[" + Thread.currentThread().getId() + "]" + str2);
    }

    /* renamed from: d */
    public static int m153939d(Context context) {
        int i;
        if (!((C103918d) C86312j.m106911c(C103918d.class)).Lb0(MMApplicationContext.getContext(), "android.permission.READ_PHONE_STATE")) {
            return 0;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) MMApplicationContext.getContext().getSystemService("phone");
            if (Build.VERSION.SDK_INT >= 24) {
                int dataNetworkType = telephonyManager.getDataNetworkType();
                switch (dataNetworkType) {
                    case 0:
                        break;
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                    case 16:
                        i = 1;
                        break;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                    case 17:
                        i = 3;
                        break;
                    case 13:
                    case 18:
                    case 19:
                        i = 5;
                        break;
                    case 20:
                        i = 6;
                        break;
                }
                i = 0;
                Log.m105925i("MicroMsg.VoipHelper", "ratioType:%s, getMobileType(2G/3G/4G/...): %s ", Integer.valueOf(dataNetworkType), Integer.valueOf(i));
                return i;
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.VoipHelper", e, "", new Object[0]);
        }
        return 0;
    }

    /* renamed from: e */
    public static int m153940e(Context context) {
        return m153941f(((ConnectivityManager) MMApplicationContext.getContext().getSystemService("connectivity")).getActiveNetworkInfo());
    }

    /* renamed from: f */
    public static int m153941f(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return 2;
        }
        try {
            Log.m105925i("MicroMsg.VoipHelper", "getNetType: %s %s", Integer.valueOf(networkInfo.getType()), Integer.valueOf(networkInfo.getSubtype()));
            int i = 4;
            if (networkInfo.getType() == 1) {
                return 4;
            }
            if (networkInfo.getType() == 9) {
                return 7;
            }
            if (networkInfo.getType() != 0) {
                return 2;
            }
            int subtype = networkInfo.getSubtype();
            switch (subtype) {
                case 0:
                    i = 2;
                    break;
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    i = 1;
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    i = 3;
                    break;
                case 13:
                case 18:
                case 19:
                    i = 5;
                    break;
                case 20:
                    i = 6;
                    break;
                default:
                    Log.m105924i("MicroMsg.VoipHelper", "NEWEST type, use wifi as default!");
                    break;
            }
            Log.m105925i("MicroMsg.VoipHelper", "steve: subType:%s, getMobileType(2G/3G/4G/...): %s ", Integer.valueOf(subtype), Integer.valueOf(i));
            return i;
        } catch (NullPointerException e) {
            Log.printErrStackTrace("MicroMsg.VoipHelper", e, "", new Object[0]);
            return 2;
        }
    }

    /* renamed from: g */
    public static int m153942g(String str) {
        return MultiProcessMMKV.getMMKV("static_cap_mmkv_key").getInt(str, 0);
    }

    /* renamed from: h */
    public static void m153943h(byte[] bArr, String str, int i) {
        if (Util.isNullOrNil(bArr)) {
            bArr = new byte[0];
        }
        String str2 = new String(bArr);
        if (i == 4) {
            Log.m105920e(str, str2);
        } else if (i == 2) {
            Log.m105924i(str, str2);
        } else {
            Log.m105918d(str, str2);
        }
        str.equals("MicroMsg.v2Core");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        if (p645pj.C77091b.m93026h() != false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (p645pj.C77091b.m93027i() != false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        r3 = 2;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m153944i(int r10) {
        /*
            r0 = 26
            boolean r0 = p206nj.C11171e.m11046c(r0)
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L_0x001d
            boolean r0 = p645pj.C77091b.m93021c()
            if (r0 == 0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 2
        L_0x0013:
            boolean r3 = p645pj.C77091b.m93027i()
            if (r3 == 0) goto L_0x001b
        L_0x0019:
            r3 = 1
            goto L_0x002d
        L_0x001b:
            r3 = 2
            goto L_0x002d
        L_0x001d:
            boolean r0 = p645pj.C77091b.m93020b()
            if (r0 == 0) goto L_0x0025
            r0 = 1
            goto L_0x0026
        L_0x0025:
            r0 = 2
        L_0x0026:
            boolean r3 = p645pj.C77091b.m93026h()
            if (r3 == 0) goto L_0x001b
            goto L_0x0019
        L_0x002d:
            com.tencent.mm.plugin.report.service.n r4 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r5 = 16366(0x3fee, float:2.2934E-41)
            r6 = 12
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r7 = 0
            com.tencent.mm.plugin.voip.model.h0 r8 = l33.C109247e.xx0()
            int r8 = r8.mo152615n()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r6[r7] = r8
            com.tencent.mm.plugin.voip.model.h0 r7 = l33.C109247e.xx0()
            long r7 = r7.mo152616o()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r6[r2] = r7
            com.tencent.mm.plugin.voip.model.h0 r7 = l33.C109247e.xx0()
            long r7 = r7.mo152617p()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r6[r1] = r7
            r7 = 3
            boolean r8 = yb0.C118950a.f356272a
            if (r8 == 0) goto L_0x0067
            r8 = 1
            goto L_0x0068
        L_0x0067:
            r8 = 2
        L_0x0068:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r6[r7] = r8
            r7 = 4
            boolean r8 = p645pj.C77091b.m93034p()
            if (r8 == 0) goto L_0x0077
            r8 = 1
            goto L_0x0078
        L_0x0077:
            r8 = 2
        L_0x0078:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r6[r7] = r8
            r7 = 5
            boolean r8 = p645pj.C77091b.m93035q()
            if (r8 == 0) goto L_0x0087
            r8 = 1
            goto L_0x0088
        L_0x0087:
            r8 = 2
        L_0x0088:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r6[r7] = r8
            r7 = 6
            android.content.SharedPreferences r8 = p645pj.C77091b.m93037s()
            java.lang.String r9 = "settings_voip_show_detail"
            boolean r8 = r8.getBoolean(r9, r2)
            if (r8 == 0) goto L_0x009d
            r8 = 1
            goto L_0x009e
        L_0x009d:
            r8 = 2
        L_0x009e:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r6[r7] = r8
            r7 = 7
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r7] = r0
            r0 = 8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6[r0] = r3
            r0 = 9
            boolean r3 = p645pj.C77091b.m93022d()
            if (r3 == 0) goto L_0x00bd
            r3 = 1
            goto L_0x00be
        L_0x00bd:
            r3 = 2
        L_0x00be:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6[r0] = r3
            r0 = 10
            boolean r3 = p645pj.C77091b.m93023e()
            if (r3 == 0) goto L_0x00cd
            r1 = 1
        L_0x00cd:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r6[r0] = r1
            r0 = 11
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r6[r0] = r10
            r4.mo160140o(r5, r2, r2, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z33.C112597j.m153944i(int):void");
    }

    /* renamed from: j */
    public static void m153945j(int i, long j, int i2, int i3) {
        if (!(C109247e.xx0().mo152615n() == 0 || C109247e.xx0().mo152616o() == 0)) {
            f337179a = C109247e.xx0().mo152617p();
            f337180b = i;
            f337181c = j;
        }
        C115669n.INSTANCE.mo160140o(16516, true, true, Long.valueOf(f337179a), Integer.valueOf(f337180b), Long.valueOf(f337181c), Integer.valueOf(i2), Integer.valueOf(i3));
        Log.m105924i("MicroMsg.VoipHelper", "room type " + f337179a + "room id" + f337180b + "room key" + f337181c + "call type " + i2 + "type " + i3);
    }

    /* renamed from: k */
    public static void m153946k(int i, long j, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i2;
        int i8 = i3;
        Log.m105925i("MicroMsg.VoipHelper", "before convert, beforeNetType:%s, afterNetType:%s", Integer.valueOf(i2), Integer.valueOf(i5));
        if (i7 == 2) {
            i7 = 4;
        } else if (i7 == 3) {
            i7 = 2;
        } else if (i7 == 4) {
            i7 = 5;
        } else if (i7 == 5) {
            i7 = 3;
        } else if (i7 == 6) {
            i7 = 6;
        }
        if (i8 == 2) {
            i8 = 4;
        } else if (i8 == 3) {
            i8 = 2;
        } else if (i8 == 4) {
            i8 = 5;
        } else if (i8 == 5) {
            i8 = 3;
        } else if (i8 == 6) {
            i8 = 6;
        }
        Log.m105925i("MicroMsg.VoipHelper", "after convert, beforeNetType:%s, afterNetType:%s", Integer.valueOf(i7), Integer.valueOf(i5));
        C115669n.INSTANCE.mo160140o(16519, true, true, Long.valueOf(C109247e.xx0().mo152617p()), Integer.valueOf(C109247e.xx0().mo152615n()), Long.valueOf(C109247e.xx0().mo152616o()), Integer.valueOf(i), Long.valueOf(j), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6));
        StringBuilder sb = new StringBuilder();
        sb.append("reportVoipNetChangeCost is memberIdx =");
        int i9 = i;
        sb.append(i);
        sb.append("|switchNetworkTimestamp ");
        sb.append(j);
        sb.append("|beforeNetType ");
        sb.append(i7);
        sb.append("|afterNetType");
        sb.append(i8);
        sb.append("|beforeNetStrength");
        sb.append(i4);
        sb.append("|afterNetStrength");
        sb.append(i5);
        sb.append("|avgNetStrength");
        sb.append(i6);
        Log.m105924i("MicroMsg.VoipHelper", sb.toString());
    }

    /* renamed from: l */
    public static void m153947l(String str, int i) {
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("static_cap_mmkv_key");
        mmkv.putInt(str, i);
        mmkv.apply();
    }

    /* renamed from: m */
    public static void m153948m(int i) {
        try {
            Thread.sleep((long) i);
        } catch (InterruptedException e) {
            Log.printErrStackTrace("MicroMsg.VoipHelper", e, "", new Object[0]);
        }
    }
}
