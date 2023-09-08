package f34;

import e34.C116680b;
import j34.C117295b;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: f34.a */
public class C116799a {

    /* renamed from: a */
    public static final Pattern f350122a = Pattern.compile("oauth_token=([^&]+)");

    /* renamed from: b */
    public static final Pattern f350123b = Pattern.compile("oauth_token_secret=([^&]*)");

    /* renamed from: a */
    public final String mo180770a(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find() && matcher.groupCount() >= 1) {
            return C117295b.m165372a(matcher.group(1));
        }
        throw new C116680b("Response body is incorrect. Can't extract token and secret from this: '" + str + "'", (Exception) null);
    }
}
