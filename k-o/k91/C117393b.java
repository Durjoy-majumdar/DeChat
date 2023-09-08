package k91;

import com.tencent.p014mm.sdk.platformtools.Log;
import f91.C116850b;
import java.util.Iterator;
import te3.C118433ga3;
import te3.C118484zl2;

/* renamed from: k91.b */
public final class C117393b {
    /* renamed from: a */
    public static C118433ga3 m165532a() {
        byte[] a = C116850b.m164831a("hell_ac_ble_mmkv_key");
        if (a == null || a.length <= 0) {
            return null;
        }
        C118433ga3 ga32 = new C118433ga3();
        try {
            ga32.parseFrom(a);
            return ga32;
        } catch (Exception e) {
            Log.printErrStackTrace("HABBYGE-MALI.ActivityBundleDao", e, "ActivityBundleDao _doRead parse", new Object[0]);
            return null;
        }
    }

    /* renamed from: b */
    public static void m165533b(String str, String str2) {
        C118433ga3 a = m165532a();
        if (a == null) {
            a = new C118433ga3();
        }
        Iterator<C118484zl2> it = a.f354025d.iterator();
        while (true) {
            if (it.hasNext()) {
                C118484zl2 next = it.next();
                if (next != null && str.equals(next.f354630d)) {
                    a.f354025d.remove(next);
                    break;
                }
            } else {
                break;
            }
        }
        C118484zl2 zl22 = new C118484zl2();
        zl22.f354630d = str;
        zl22.f354631e = str2;
        a.f354025d.add(zl22);
        try {
            C116850b.m164834d("hell_ac_ble_mmkv_key", a.toByteArray());
        } catch (Exception e) {
            Log.printErrStackTrace("HABBYGE-MALI.ActivityBundleDao", e, "ActivityBundleDao writeBack", new Object[0]);
        }
    }

    /* renamed from: c */
    public static String m165534c(String str) {
        C118433ga3 a = m165532a();
        if (a == null || a.f354025d.isEmpty()) {
            return null;
        }
        Iterator<C118484zl2> it = a.f354025d.iterator();
        C118484zl2 zl22 = null;
        while (it.hasNext()) {
            C118484zl2 next = it.next();
            if (next != null && str.equals(next.f354630d)) {
                zl22 = next;
            }
        }
        if (zl22 == null) {
            return null;
        }
        return zl22.f354631e;
    }
}
