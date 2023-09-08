package ga1;

import android.util.Pair;
import com.tencent.p014mm.sdk.platformtools.Log;
import f91.C116850b;
import te3.C22527qp1;

/* renamed from: ga1.b */
public final class C20822b {
    /* renamed from: a */
    public static C22527qp1 m22817a() {
        byte[] a = C116850b.m164831a("mmkv_key_hell_floatS");
        if (a != null && a.length > 0) {
            C22527qp1 qp12 = new C22527qp1();
            try {
                qp12.parseFrom(a);
                return qp12;
            } catch (Exception e) {
                Log.printErrStackTrace("HABBYGE-MALI.FloatSessionDao", e, "FloatSessionDao._read: %s", e.getMessage());
            }
        }
        return null;
    }

    /* renamed from: b */
    public static void m22818b(C22527qp1 qp12) {
        if (qp12 != null) {
            try {
                C116850b.m164834d("mmkv_key_hell_floatS", qp12.toByteArray());
            } catch (Exception e) {
                Log.printErrStackTrace("HABBYGE-MALI.FloatSessionDao", e, "FloatSessionDao._writeBack: %s", e.getMessage());
            }
        }
    }

    /* renamed from: c */
    public static Pair<Integer, Integer> m22819c() {
        C22527qp1 a = m22817a();
        if (a == null) {
            return null;
        }
        return Pair.create(Integer.valueOf(a.f64511f), Integer.valueOf(a.f64512g));
    }

    /* renamed from: d */
    public static void m22820d(boolean z) {
        C22527qp1 a = m22817a();
        if (a == null) {
            a = new C22527qp1();
        }
        a.f64513h = z;
        m22818b(a);
        Log.m105919d("HABBYGE-MALI.FloatSessionDao", "setClickMenuItem: %b", Boolean.valueOf(z));
    }

    /* renamed from: e */
    public static void m22821e(int i, int i2) {
        C22527qp1 a = m22817a();
        if (a == null) {
            a = new C22527qp1();
        }
        if (i != -1) {
            a.f64511f = i;
        }
        if (i2 != -1) {
            a.f64512g = i2;
        }
        m22818b(a);
    }
}
