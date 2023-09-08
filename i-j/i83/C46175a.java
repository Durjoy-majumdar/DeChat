package i83;

import a70.C112760b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import java.util.regex.Pattern;

/* renamed from: i83.a */
public class C46175a {

    /* renamed from: a */
    public static final Pattern f124471a = Pattern.compile("(http|https)://" + WeChatHosts.domainString(C0966R.string.f360885fm3) + ".*");

    /* renamed from: b */
    public static final String f124472b;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(C112760b.m154195C());
        sb.append("vproxy");
        f124472b = sb.toString();
    }
}
