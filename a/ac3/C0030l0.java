package ac3;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.xweb.file.XVFSFile;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Map;
import te3.wz4;

/* renamed from: ac3.l0 */
public final class C0030l0 extends C87413o implements C32226l<Map.Entry<String, wz4>, CharSequence> {

    /* renamed from: d */
    public static final C0030l0 f36d = new C0030l0();

    public C0030l0() {
        super(1);
    }

    public Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        C87412m.m108594g(entry, LocaleUtil.ITALIAN);
        return ((String) entry.getKey()) + XVFSFile.PATH_SEPARATOR_CHAR + ((wz4) entry.getValue()).f144372f;
    }
}
