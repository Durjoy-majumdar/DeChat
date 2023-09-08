package t73;

import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.file.XVFSFile;
import gy3.C87412m;

/* renamed from: t73.b */
public final class C48556b extends C86009m1 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48556b(String str) {
        super(str);
        C87412m.m108594g(str, "path");
    }

    /* renamed from: A */
    public final boolean mo73171A(String str) {
        C87412m.m108594g(str, "id");
        return C86013q1.m106450k(mo119976n() + XVFSFile.SEPARATOR_CHAR + str);
    }

    /* renamed from: B */
    public final C86009m1 mo73172B(String str) {
        C87412m.m108594g(str, "id");
        return new C86009m1(mo119976n() + XVFSFile.SEPARATOR_CHAR + str);
    }
}
