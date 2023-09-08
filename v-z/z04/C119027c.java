package z04;

import com.tencent.kinda.framework.app.KindaConfigCacheStg;
import gy3.C87412m;
import java.nio.charset.Charset;

/* renamed from: z04.c */
public final class C119027c {

    /* renamed from: a */
    public static final Charset f356488a;

    /* renamed from: b */
    public static final Charset f356489b;

    static {
        Charset forName = Charset.forName("UTF-8");
        C87412m.m108593f(forName, "forName(\"UTF-8\")");
        f356488a = forName;
        C87412m.m108593f(Charset.forName("UTF-16"), "forName(\"UTF-16\")");
        C87412m.m108593f(Charset.forName("UTF-16BE"), "forName(\"UTF-16BE\")");
        C87412m.m108593f(Charset.forName("UTF-16LE"), "forName(\"UTF-16LE\")");
        C87412m.m108593f(Charset.forName("US-ASCII"), "forName(\"US-ASCII\")");
        Charset forName2 = Charset.forName(KindaConfigCacheStg.SAVE_CHARSET);
        C87412m.m108593f(forName2, "forName(\"ISO-8859-1\")");
        f356489b = forName2;
    }
}
