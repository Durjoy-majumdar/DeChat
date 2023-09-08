package t73;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.xweb.file.XVFSFile;
import gy3.C87412m;
import z04.C112551y;

/* renamed from: t73.p */
public final class C48572p {
    /* renamed from: a */
    public static final String m53970a(String str) {
        C87412m.m108594g(str, "host");
        return "_manifest_" + str.hashCode();
    }

    /* renamed from: b */
    public static final String m53971b(C48555a aVar) {
        C87412m.m108594g(aVar, "<this>");
        String str = aVar.f129888b.f141131i;
        boolean z = true;
        if (!(str == null || str.length() == 0)) {
            C87412m.m108593f(str, "realAppId");
            return str;
        }
        String str2 = aVar.f129888b.f141126d;
        if (!(str2 == null || str2.length() == 0)) {
            z = false;
        }
        String str3 = "";
        if (z) {
            String str4 = aVar.f129887a.f140537d;
            return str4 == null ? str3 : str4;
        }
        String str5 = aVar.f129888b.f141126d;
        C87412m.m108593f(str5, LocaleUtil.ITALIAN);
        if (!C112551y.m153819s(str5, "/", false)) {
            str5 = XVFSFile.SEPARATOR_CHAR + str5;
        }
        C87412m.m108593f(str5, "manifest.Path.let {\n    …/\")) \"/$it\" else it\n    }");
        String n = C112551y.m153814n(str5, "/", "_", false);
        StringBuilder sb = new StringBuilder();
        String str6 = aVar.f129887a.f140537d;
        if (str6 != null) {
            str3 = str6;
        }
        sb.append(str3);
        sb.append(n);
        return sb.toString();
    }
}
