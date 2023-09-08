package mk2;

import a70.C112760b;
import com.tencent.xweb.file.XVFSFile;
import gy3.C87412m;

/* renamed from: mk2.h */
public final class C34585h {

    /* renamed from: a */
    public static final C34585h f93003a = new C34585h();

    /* renamed from: b */
    public static final String f93004b = (C112760b.m154231g() + "so_res");

    /* renamed from: a */
    public final String mo59645a(String str, String str2) {
        C87412m.m108594g(str, "soName");
        C87412m.m108594g(str2, "patchId");
        return f93004b + XVFSFile.SEPARATOR_CHAR + str + XVFSFile.SEPARATOR_CHAR + str2 + "/lib" + str + ".so";
    }

    /* renamed from: b */
    public final String mo59646b(String str, String str2) {
        C87412m.m108594g(str, "soName");
        C87412m.m108594g(str2, "patchId");
        return f93004b + XVFSFile.SEPARATOR_CHAR + str + XVFSFile.SEPARATOR_CHAR + str2 + XVFSFile.SEPARATOR_CHAR;
    }

    /* renamed from: c */
    public final String mo59647c(String str) {
        C87412m.m108594g(str, "soName");
        return f93004b + XVFSFile.SEPARATOR_CHAR + str + XVFSFile.SEPARATOR_CHAR;
    }
}
