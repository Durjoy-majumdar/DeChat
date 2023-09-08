package vq0;

import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.file.XVFSFile;
import f40.C86709a0;
import gy3.C87412m;
import z04.C112550d0;

/* renamed from: vq0.l */
public final class C90865l {
    /* renamed from: a */
    public static final String m113956a(String str) {
        C87412m.m108594g(str, "appId");
        String str2 = m113957b() + XVFSFile.SEPARATOR_CHAR + str;
        C86013q1.m106461v(str2);
        return str2;
    }

    /* renamed from: b */
    public static final String m113957b() {
        String str = C86709a0.m107535s().f251807e;
        C87412m.m108593f(str, "path");
        if (!C112550d0.m153804x(str, XVFSFile.SEPARATOR_CHAR, false, 2, (Object) null)) {
            str = str + XVFSFile.SEPARATOR_CHAR;
        }
        String str2 = str + "appbrand/web_renderingcache";
        C87412m.m108593f(str2, "path");
        return str2;
    }
}
