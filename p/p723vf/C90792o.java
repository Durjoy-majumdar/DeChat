package p723vf;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.xweb.file.XVFSFile;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import rx3.C13604l;
import y04.C112346d;
import y04.C112349m;
import y04.C15925h;
import z04.C112550d0;

/* renamed from: vf.o */
public final class C90792o extends C87413o implements C32226l<String, C15925h<? extends C13604l<? extends String, ? extends String>>> {

    /* renamed from: d */
    public static final C90792o f260722d = new C90792o();

    public C90792o() {
        super(1);
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        C87412m.m108594g(str, LocaleUtil.ITALIAN);
        List U = C112550d0.m153785U(str, new String[]{XVFSFile.PATH_SEPARATOR}, false, 0, 6, (Object) null);
        if (U.size() == 2) {
            return C112349m.m153282e(new C13604l(U.get(0), U.get(1)));
        }
        C118672d.m167352b("Matrix.MemoryInfoFactory", "ERROR : " + str, new Object[0]);
        return C112346d.f336375a;
    }
}
