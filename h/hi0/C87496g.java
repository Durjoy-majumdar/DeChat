package hi0;

import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import ii0.C87732a;
import te3.e75;
import te3.j75;
import wi0.C91000y;

/* renamed from: hi0.g */
public final class C87496g extends C87491a<Boolean, j75> {
    /* renamed from: b */
    public Object mo58858b(String str, String str2, Object obj) {
        j75 j75 = (j75) obj;
        if (str2 == null || str2.length() == 0) {
            return Boolean.FALSE;
        }
        String str3 = j75 != null ? j75.f135916e : null;
        if (str3 == null) {
            return Boolean.FALSE;
        }
        C87732a.INSTANCE.mo122144a(j75.f135915d.f132768f, 215);
        return Boolean.valueOf(((C91000y) C81161g2.Bx0(C91000y.class)).mo125063Yt(str2, str3, C91000y.C91001a.Polling));
    }

    /* renamed from: d */
    public e75 mo58859d(Object obj) {
        j75 j75 = (j75) obj;
        if (j75 != null) {
            return j75.f135915d;
        }
        return null;
    }

    /* renamed from: e */
    public String mo58860e() {
        return "CmdGetExptInfo";
    }
}
