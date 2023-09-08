package qe3;

import android.content.SharedPreferences;
import android.os.SystemClock;
import android.util.Base64;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.jni.utils.UtilsJni;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.wxmm.v2helper;
import f40.C86709a0;

/* renamed from: qe3.f */
public class C101127f {

    /* renamed from: a */
    public static boolean f296015a = false;

    /* renamed from: b */
    public static boolean f296016b = false;

    /* renamed from: c */
    public static int f296017c = 0;

    /* renamed from: d */
    public static byte[] f296018d = null;

    /* renamed from: e */
    public static byte[] f296019e = null;

    /* renamed from: f */
    public static int f296020f = 0;

    /* renamed from: g */
    public static int f296021g = 1;

    /* renamed from: h */
    public static long f296022h = 0;

    static {
        SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("auth_info_key_prefs", 4);
        f296015a = sharedPreferences.getBoolean("auth_info_prefs_use_new_ecdh", true);
        f296016b = sharedPreferences.getBoolean("auth_info_prefs_use_net_ml_cert", false);
        Log.m105925i("MicroMsg.EcdhMgr", "summerauths USE_ECDH[%s] USE_ML[%s]", Boolean.valueOf(f296015a), Boolean.valueOf(f296016b));
        m132552e();
    }

    /* renamed from: a */
    public static int m132548a() {
        SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("auth_info_key_prefs", 4);
        boolean z = false;
        int i = sharedPreferences.getInt("auth_info_prefs_test_ecdh_version", 0);
        if (i == 1) {
            boolean commit = sharedPreferences.edit().remove("auth_info_prefs_test_ecdh_version").commit();
            Log.m105918d("MicroMsg.EcdhMgr", "clear test ecdh version " + commit);
        }
        if (i == 1) {
            z = true;
        }
        if (!z) {
            return f296020f;
        }
        Log.m105918d("MicroMsg.EcdhMgr", "return test version 10010");
        return 10010;
    }

    /* renamed from: b */
    public static byte[] m132549b() {
        int i = f296021g;
        try {
            i = C86709a0.m107529k().f251779b.f256809d.mo55486o4();
        } catch (AssertionError | Exception e) {
            Log.m105920e("MicroMsg.EcdhMgr", e.getLocalizedMessage());
        }
        Log.m105924i("MicroMsg.EcdhMgr", "getEcdhKey cert region " + i + " current: " + f296021g);
        if (i != f296021g) {
            f296021g = i;
            m132551d(i);
        }
        return f296018d;
    }

    /* renamed from: c */
    public static long m132550c(byte[] bArr) {
        int i = f296017c;
        byte[] b = m132549b();
        int i2 = f296021g;
        try {
            i2 = C86709a0.m107529k().f251779b.f256809d.mo55486o4();
        } catch (AssertionError | Exception e) {
            Log.m105920e("MicroMsg.EcdhMgr", e.getLocalizedMessage());
        }
        Log.m105924i("MicroMsg.EcdhMgr", "getEcdsaKey cert region " + i2 + " current: " + f296021g + " " + f296020f);
        if (i2 != f296021g) {
            f296021g = i2;
            m132551d(i2);
        }
        long CreateHybridEcdhCryptoEngine = UtilsJni.CreateHybridEcdhCryptoEngine(i, b, f296019e, bArr);
        Object[] objArr = new Object[4];
        objArr[0] = Long.valueOf(CreateHybridEcdhCryptoEngine);
        objArr[1] = Integer.valueOf(bArr == null ? -1 : bArr.length);
        objArr[2] = Integer.valueOf(f296017c);
        objArr[3] = Util.getStack();
        Log.m105925i("MicroMsg.EcdhMgr", "summerauths getHybridEcdhCryptoEngine engine[%s] autoauth_key[%s] nid[%s] stack[%s]", objArr);
        return CreateHybridEcdhCryptoEngine;
    }

    /* renamed from: d */
    public static void m132551d(int i) {
        if (i == 1) {
            m132552e();
        } else if (i == 2) {
            f296020f = CdnLogic.kMediaTypeFavoriteBigFile;
            f296017c = v2helper.EMethodOutputVolumeScaleEnable;
            f296018d = Base64.decode("BOplP5sD+V3TlZJ3I9Kq19fvdwLRfsj/35JH45uCHI2LT1/Z52MOK5D1T3DH2HX6359Rj2yaKBj57FV106blwJQ=", 0);
            f296019e = Base64.decode("LS0tLS1CRUdJTiBQVUJMSUMgS0VZLS0tLS0KTUZrd0V3WUhLb1pJemowQ0FRWUlLb1pJemowREFRY0RRZ0FFZVlGbzdHZUxLUkZWYVBDVS82ZTZSanVQbWpSWgpaSFI1SmtIOHlCK3hzQVZzSHF3NFUzc2tHdUh6SUU2bW9HN2NlbUgxQVhjN0tVOW5VZWxnTytCaDdnPT0KLS0tLS1FTkQgUFVCTElDIEtFWS0tLS0tCg==", 0);
        }
    }

    /* renamed from: e */
    public static void m132552e() {
        if (f296016b) {
            f296020f = 10001;
            f296017c = v2helper.EMethodOutputVolumeScaleEnable;
            f296018d = Base64.decode("BJO0cjvgelbYHm8ZlKVVl63oMbeMYLjIqaWtZWvBBTSm7PzWslBMy8loLcnG9dITvDzD6YpddZdH1PnHxG8Kpvo=", 0);
            f296019e = Base64.decode("LS0tLS1CRUdJTiBQVUJMSUMgS0VZLS0tLS0KTUZrd0V3WUhLb1pJemowQ0FRWUlLb1pJemowREFRY0RRZ0FFQ0JvQVdmMC84ZVJEL0NKeWIxU3RKckhPeVcyVwo2Z3ZjaUh1TTZOZk82cWhLNDJKTjZSRmxucEtZbVAyTlBYbnd3L05VVFpMM05Qa3FZVEh2Q1AwSmtnPT0KLS0tLS1FTkQgUFVCTElDIEtFWS0tLS0tCg==", 0);
            return;
        }
        f296020f = 10009;
        f296017c = v2helper.EMethodOutputVolumeScaleEnable;
        f296018d = Base64.decode("BI2xbGdfzrMI1qWI8Yatcqv5Z1vFLwtLdm1DkHGEUh6ZzRqDMMVeQ4Xxy+YxgR8D/KPo6hGx5iaDKtdQs5XaeEE=", 0);
        f296019e = Base64.decode("LS0tLS1CRUdJTiBQVUJMSUMgS0VZLS0tLS0KTUZrd0V3WUhLb1pJemowQ0FRWUlLb1pJemowREFRY0RRZ0FFYmJLaC9KRGJxbnpLNWFPRzQ4cnF0YnlmQ2g5dAorMlNWZ3RsTGpUU2FwemFxUGlpY2RQUkVHSmM4L2xDaHUxU2cxa1hIcTRyNW1ieFpMcUxVVUhTODl3PT0KLS0tLS1FTkQgUFVCTElDIEtFWS0tLS0tCg==", 0);
    }

    /* renamed from: f */
    public static void m132553f(long j) {
        UtilsJni.ReleaseHybridEcdhCryptoEngine(j);
        Log.m105925i("MicroMsg.EcdhMgr", "summerauths releaseHybridEcdhCryptoEngine engine[%s] stack[%s]", Long.valueOf(j), Util.getStack());
    }

    /* renamed from: g */
    public static void m132554g(int i) {
        f296020f = i;
        SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("auth_info_key_prefs", 4);
        boolean commit = sharedPreferences.edit().putInt("auth_info_prefs_test_ecdh_version", 1).commit();
        int i2 = sharedPreferences.getInt("auth_info_prefs_test_ecdh_version", 0);
        Log.m105918d("MicroMsg.EcdhMgr", "set test ecdh version " + commit + " get version " + i2);
    }

    /* renamed from: h */
    public static synchronized boolean m132555h() {
        synchronized (C101127f.class) {
            Log.m105925i("MicroMsg.EcdhMgr", "summerauths switchCert LAST_SWITCH_TIME[%s] old USE_ML[%s] stack[%s]", Long.valueOf(f296022h), Boolean.valueOf(f296016b), Util.getStack());
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = f296022h;
            if (600000 < elapsedRealtime - j || j <= 0) {
                f296022h = SystemClock.elapsedRealtime();
                f296016b = !f296016b;
                SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("auth_info_key_prefs", 4);
                boolean commit = sharedPreferences.edit().putBoolean("auth_info_prefs_use_net_ml_cert", f296016b).commit();
                sharedPreferences.getBoolean("auth_info_prefs_use_net_ml_cert", false);
                Log.m105925i("MicroMsg.EcdhMgr", "summerauths switchCert to [%s] save sp[%s]", Boolean.valueOf(f296016b), Boolean.valueOf(commit));
                m132552e();
                return commit;
            }
            Log.m105925i("MicroMsg.EcdhMgr", "summerauths switchCert LAST_SWITCH_TIME freq limit [%s]ms ret false", Long.valueOf(elapsedRealtime - j));
            return false;
        }
    }
}
