package k91;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.tencent.p014mm.sdk.platformtools.Log;
import e91.C116711b;
import f91.C116850b;
import java.util.Iterator;
import l91.C117467h;
import op3.C117878c;
import op3.C117882j;
import te3.C118433ga3;
import te3.C118484zl2;

/* renamed from: k91.e */
public final class C117394e {
    /* renamed from: a */
    public static C118433ga3 m165535a() {
        byte[] a = C116850b.m164831a("mmkv_key_page_se_dao");
        if (a == null || a.length <= 0) {
            return null;
        }
        C118433ga3 ga32 = new C118433ga3();
        try {
            ga32.parseFrom(a);
            return ga32;
        } catch (Exception e) {
            Log.printErrStackTrace("HABBYGE-MALI.PageStateDao", e, "PageStateDao _doRead parse", new Object[0]);
            return null;
        }
    }

    /* renamed from: b */
    public static String m165536b(int i) {
        String str;
        C118433ga3 a = m165535a();
        if (a == null) {
            return null;
        }
        String valueOf = String.valueOf(i);
        Iterator<C118484zl2> it = a.f354025d.iterator();
        while (true) {
            if (!it.hasNext()) {
                str = null;
                break;
            }
            C118484zl2 next = it.next();
            if (next != null && valueOf.equals(next.f354630d)) {
                str = next.f354631e;
                break;
            }
        }
        if (str == null || str.equals("")) {
            return null;
        }
        String[] split = str.split("\\|");
        if (split.length != 3) {
            return null;
        }
        return split[0];
    }

    /* renamed from: c */
    public static C117878c<String, Boolean, String> m165537c(int i) {
        String str;
        C118433ga3 a = m165535a();
        if (a == null) {
            return null;
        }
        String valueOf = String.valueOf(i);
        Iterator<C118484zl2> it = a.f354025d.iterator();
        while (true) {
            if (!it.hasNext()) {
                str = null;
                break;
            }
            C118484zl2 next = it.next();
            if (next != null && valueOf.equals(next.f354630d)) {
                str = next.f354631e;
                break;
            }
        }
        if (str == null || str.equals("")) {
            return null;
        }
        String[] split = str.split("\\|");
        if (split.length != 3) {
            return null;
        }
        return C117882j.m166285d(split[0], Boolean.valueOf(split[1]), split[2]);
    }

    /* renamed from: d */
    public static void m165538d(String str, String str2, int i) {
        Fragment e;
        if (str != null && !str.isEmpty()) {
            String str3 = null;
            if (TextUtils.isEmpty(str2) && C116711b.m164587l(str) && (e = C117467h.m165690e(str)) != null) {
                str3 = e.getClass().getCanonicalName();
            }
            if (str3 == null) {
                str3 = "NULL";
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("|");
            sb.append(!str3.equals("NULL"));
            sb.append("|");
            sb.append(str3);
            String sb4 = sb.toString();
            String valueOf = String.valueOf(i);
            C118433ga3 a = m165535a();
            if (a == null) {
                a = new C118433ga3();
            }
            Iterator<C118484zl2> it = a.f354025d.iterator();
            while (true) {
                if (it.hasNext()) {
                    C118484zl2 next = it.next();
                    if (next != null && valueOf.equals(next.f354630d)) {
                        a.f354025d.remove(next);
                        break;
                    }
                } else {
                    break;
                }
            }
            C118484zl2 zl22 = new C118484zl2();
            zl22.f354630d = valueOf;
            zl22.f354631e = sb4;
            a.f354025d.add(zl22);
            try {
                C116850b.m164834d("mmkv_key_page_se_dao", a.toByteArray());
            } catch (Exception e2) {
                Log.printErrStackTrace("HABBYGE-MALI.PageStateDao", e2, "PageStateDao writeBack", new Object[0]);
            }
        }
    }
}
