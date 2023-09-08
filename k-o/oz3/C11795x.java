package oz3;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: oz3.x */
public final class C11795x extends C87413o implements C32226l<String, CharSequence> {

    /* renamed from: d */
    public static final C11795x f34508d = new C11795x();

    public C11795x() {
        super(1);
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        C87412m.m108594g(str, LocaleUtil.ITALIAN);
        if (str.length() <= 1) {
            return str;
        }
        return 'L' + str + ';';
    }
}
