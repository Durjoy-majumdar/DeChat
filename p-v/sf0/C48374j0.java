package sf0;

import android.util.Base64;
import com.tencent.p014mm.sdk.platformtools.Util;
import pe3.C89349b;
import te3.C51018qv3;
import te3.C51163rv3;

/* renamed from: sf0.j0 */
public final class C48374j0 {
    /* renamed from: a */
    public static C51018qv3 m53712a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        C51018qv3 qv32 = new C51018qv3();
        qv32.mo73350k(bArr);
        return qv32;
    }

    /* renamed from: b */
    public static String m53713b(C89349b bVar) {
        if (bVar == null) {
            return null;
        }
        return bVar.mo123705h();
    }

    /* renamed from: c */
    public static boolean m53714c(C51163rv3... rv3Arr) {
        if (rv3Arr == null) {
            return false;
        }
        for (C51163rv3 rv32 : rv3Arr) {
            if (rv32 == null || Util.isNullOrNil(m53718g(rv32))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static byte[] m53715d(C51018qv3 qv32) {
        C89349b bVar;
        if (qv32 == null || (bVar = qv32.f140574f) == null) {
            return null;
        }
        return bVar.mo123703f();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r0 = r0.f140574f;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m53716e(te3.C51018qv3 r0, byte[] r1) {
        /*
            if (r0 == 0) goto L_0x000c
            pe3.b r0 = r0.f140574f
            if (r0 != 0) goto L_0x0007
            goto L_0x000c
        L_0x0007:
            byte[] r0 = r0.mo123703f()
            return r0
        L_0x000c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: sf0.C48374j0.m53716e(te3.qv3, byte[]):byte[]");
    }

    /* renamed from: f */
    public static String m53717f(C51018qv3 qv32) {
        C89349b bVar;
        if (qv32 == null || (bVar = qv32.f140574f) == null) {
            return null;
        }
        return bVar.mo123705h();
    }

    /* renamed from: g */
    public static String m53718g(C51163rv3 rv32) {
        if (rv32 == null) {
            return null;
        }
        return rv32.f141175d;
    }

    /* renamed from: h */
    public static C51018qv3 m53719h(String str, boolean z) {
        if (str == null) {
            return null;
        }
        byte[] decode = z ? Base64.decode(str, 0) : str.getBytes();
        if (decode == null) {
            return null;
        }
        C51018qv3 qv32 = new C51018qv3();
        qv32.mo73350k(decode);
        return qv32;
    }

    /* renamed from: i */
    public static C51163rv3 m53720i(String str) {
        if (str == null) {
            return null;
        }
        C51163rv3 rv32 = new C51163rv3();
        rv32.mo73357f(str);
        return rv32;
    }
}
