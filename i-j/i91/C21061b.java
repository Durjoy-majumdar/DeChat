package i91;

import com.tencent.p014mm.sdk.platformtools.Log;
import f91.C116850b;
import te3.C118471u1;

/* renamed from: i91.b */
public final class C21061b {
    /* renamed from: a */
    public static C118471u1 m23247a() {
        byte[] a = C116850b.m164831a("hell_astackd_mmkv_key");
        C118471u1 u1Var = null;
        if (a != null && a.length > 0) {
            C118471u1 u1Var2 = new C118471u1();
            try {
                u1Var2.parseFrom(a);
                u1Var = u1Var2;
            } catch (Exception e) {
                Log.printErrStackTrace("HABBYGE-MALI.ActivityStackDao", e, "ActivityStackDao read", new Object[0]);
            }
        }
        if (u1Var != null) {
            return u1Var;
        }
        C118471u1 u1Var3 = new C118471u1();
        m23248b(u1Var3);
        return u1Var3;
    }

    /* renamed from: b */
    public static void m23248b(C118471u1 u1Var) {
        if (u1Var != null) {
            byte[] bArr = null;
            try {
                bArr = u1Var.toByteArray();
            } catch (Exception e) {
                Log.printErrStackTrace("HABBYGE-MALI.ActivityStackDao", e, "ActivityStackDao write", new Object[0]);
            }
            C116850b.m164834d("hell_astackd_mmkv_key", bArr);
        }
    }
}
