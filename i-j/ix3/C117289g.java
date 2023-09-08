package ix3;

import java.util.Locale;

/* renamed from: ix3.g */
public class C117289g {

    /* renamed from: e */
    public static C117289g f351151e;

    /* renamed from: a */
    public String f351152a = "";

    /* renamed from: b */
    public String f351153b = "";

    /* renamed from: c */
    public String f351154c = "";

    /* renamed from: d */
    public String f351155d = "";

    /* renamed from: a */
    public static C117289g m165354a() {
        if (f351151e == null) {
            f351151e = Locale.getDefault().toString().startsWith("zh") ? new C117290h() : new C117291i();
        }
        return f351151e;
    }
}
