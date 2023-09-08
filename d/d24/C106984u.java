package d24;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: d24.u */
public final class C106984u {

    /* renamed from: b */
    public static final Pattern f320229b = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: c */
    public static final Pattern f320230c = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a */
    public final String f320231a;

    public C106984u(String str, String str2, String str3, String str4) {
        this.f320231a = str;
    }

    /* renamed from: a */
    public static C106984u m144738a(String str) {
        Matcher matcher = f320229b.matcher(str);
        if (matcher.lookingAt()) {
            String group = matcher.group(1);
            Locale locale = Locale.US;
            String lowerCase = group.toLowerCase(locale);
            String lowerCase2 = matcher.group(2).toLowerCase(locale);
            String str2 = null;
            Matcher matcher2 = f320230c.matcher(str);
            int end = matcher.end();
            while (end < str.length()) {
                matcher2.region(end, str.length());
                if (matcher2.lookingAt()) {
                    String group2 = matcher2.group(1);
                    if (group2 != null && group2.equalsIgnoreCase("charset")) {
                        String group3 = matcher2.group(2);
                        if (group3 == null) {
                            group3 = matcher2.group(3);
                        } else if (group3.startsWith("'") && group3.endsWith("'") && group3.length() > 2) {
                            group3 = group3.substring(1, group3.length() - 1);
                        }
                        if (str2 == null || group3.equalsIgnoreCase(str2)) {
                            str2 = group3;
                        } else {
                            throw new IllegalArgumentException("Multiple charsets defined: \"" + str2 + "\" and: \"" + group3 + "\" for: \"" + str + '\"');
                        }
                    }
                    end = matcher2.end();
                } else {
                    throw new IllegalArgumentException("Parameter is not formatted correctly: \"" + str.substring(end) + "\" for: \"" + str + '\"');
                }
            }
            return new C106984u(str, lowerCase, lowerCase2, str2);
        }
        throw new IllegalArgumentException("No subtype found for: \"" + str + '\"');
    }

    public boolean equals(Object obj) {
        return (obj instanceof C106984u) && ((C106984u) obj).f320231a.equals(this.f320231a);
    }

    public int hashCode() {
        return this.f320231a.hashCode();
    }

    public String toString() {
        return this.f320231a;
    }
}
