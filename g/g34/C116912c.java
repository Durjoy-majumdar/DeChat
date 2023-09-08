package g34;

import java.util.HashMap;
import java.util.Map;

/* renamed from: g34.c */
public class C116912c extends C116915f {

    /* renamed from: g */
    public Map<String, String> f350332g = new HashMap();

    public C116912c(C87131j jVar, String str) {
        super(jVar, str);
    }

    /* renamed from: d */
    public void mo180876d(String str, String str2) {
        Map<String, String> map = this.f350332g;
        if (str.startsWith("oauth_") || str.equals("scope")) {
            ((HashMap) map).put(str, str2);
        } else {
            throw new IllegalArgumentException(String.format("OAuth parameters must either be '%s' or start with '%s'", new Object[]{"scope", "oauth_"}));
        }
    }

    public String toString() {
        return String.format("@OAuthRequest(%s, %s)", new Object[]{this.f350337b, this.f350336a});
    }
}
