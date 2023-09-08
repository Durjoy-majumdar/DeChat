package d62;

import java.util.regex.Pattern;

/* renamed from: d62.n */
public class C75340n {

    /* renamed from: a */
    public static final Pattern f221504a = Pattern.compile("(\\$\\{[^\\}]+\\})");

    /* renamed from: d62.n$a */
    public static class C75341a {

        /* renamed from: a */
        public String f221505a;

        /* renamed from: b */
        public String f221506b;

        public C75341a(String str, String str2) {
            this.f221505a = str;
            this.f221506b = str2;
        }

        public String toString() {
            return "group:" + this.f221505a + ",value:" + this.f221506b;
        }
    }
}
