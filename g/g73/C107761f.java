package g73;

import android.util.Base64;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C85801v1;
import f40.C86709a0;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import te3.C64551mb3;
import te3.C64576nb3;

/* renamed from: g73.f */
public class C107761f {

    /* renamed from: a */
    public static long f322498a = -1;

    /* renamed from: a */
    public static C107763i m145984a() {
        C85801v1 i = C86709a0.m107535s().mo121142i();
        if (i == null) {
            return new C107763i();
        }
        Object e = i.mo119684e(339969, (Object) null);
        if (e == null) {
            return new C107763i();
        }
        C107763i iVar = new C107763i();
        iVar.mo158190a(C107762g.m145998f((String) e));
        return iVar;
    }

    /* renamed from: b */
    public static C64551mb3 m145985b() {
        C85801v1 i = C86709a0.m107535s().mo121142i();
        if (i == null) {
            return null;
        }
        String str = (String) i.mo119684e(339989, (Object) null);
        if (Util.isNullOrNil(str)) {
            return null;
        }
        try {
            return (C64551mb3) new C64551mb3().parseFrom(Base64.decode(str, 2));
        } catch (IllegalArgumentException e) {
            Log.printErrStackTrace("MicroMsg.GestureGuardInfoManager", e, "", new Object[0]);
            return null;
        } catch (IOException e2) {
            Log.printErrStackTrace("MicroMsg.GestureGuardInfoManager", e2, "", new Object[0]);
            return null;
        }
    }

    /* renamed from: c */
    public static C64576nb3 m145986c() {
        C85801v1 i = C86709a0.m107535s().mo121142i();
        if (i == null) {
            Log.m105920e("MicroMsg.GestureGuardInfoManager", "alvinluo configstg is null");
            return null;
        }
        String str = (String) i.mo119684e(339990, (Object) null);
        if (Util.isNullOrNil(str)) {
            return null;
        }
        try {
            return (C64576nb3) new C64576nb3().parseFrom(Base64.decode(str, 2));
        } catch (IllegalArgumentException e) {
            Log.printErrStackTrace("MicroMsg.GestureGuardInfoManager", e, "", new Object[0]);
            return null;
        } catch (IOException e2) {
            Log.printErrStackTrace("MicroMsg.GestureGuardInfoManager", e2, "", new Object[0]);
            return null;
        }
    }

    /* renamed from: d */
    public static void m145987d() {
        C85801v1 i = C86709a0.m107535s().mo121142i();
        if (i != null) {
            i.mo119676J(339969, (Object) null);
            i.mo119681a(true);
        }
    }

    /* renamed from: e */
    public static void m145988e() {
        C85801v1 i = C86709a0.m107535s().mo121142i();
        if (i != null) {
            i.mo119676J(339971, (Object) null);
            i.mo119681a(true);
        }
    }

    /* renamed from: f */
    public static void m145989f() {
        C85801v1 i = C86709a0.m107535s().mo121142i();
        if (i != null) {
            i.mo119676J(339972, (Object) null);
            i.mo119681a(true);
        }
    }

    /* renamed from: g */
    public static void m145990g(long j, long j2) {
        C85801v1 i = C86709a0.m107535s().mo121142i();
        if (i != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeLong(j);
                dataOutputStream.writeLong(j2);
                dataOutputStream.close();
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.TimeInfo", e, "", new Object[0]);
            }
            i.mo119676J(339969, C107762g.m145993a(byteArrayOutputStream.toByteArray()));
            i.mo119681a(true);
        }
    }

    /* renamed from: h */
    public static void m145991h(long j, long j2) {
        C85801v1 i = C86709a0.m107535s().mo121142i();
        if (i != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeLong(j);
                dataOutputStream.writeLong(j2);
                dataOutputStream.close();
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.TimeInfo", e, "", new Object[0]);
            }
            i.mo119676J(339971, C107762g.m145993a(byteArrayOutputStream.toByteArray()));
            i.mo119681a(true);
        }
    }

    /* renamed from: i */
    public static void m145992i(C64551mb3 mb32) {
        C85801v1 i = C86709a0.m107535s().mo121142i();
        if (i != null) {
            try {
                i.mo119676J(339989, Base64.encodeToString(mb32.toByteArray(), 2));
                i.mo119681a(true);
                Log.m105927v("MicroMsg.GestureGuardInfoManager", "alvinluo savePatternBuffer isUserSetGesturePwd: %b", Boolean.valueOf(C107762g.m145997e()));
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.GestureGuardInfoManager", e, "", new Object[0]);
            }
        }
    }
}
