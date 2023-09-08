package p822sa;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: sa.r */
public class C48321r implements C48320q {

    /* renamed from: b */
    public static final Pattern f129384b = Pattern.compile("^<<//([a-z]{0,10})//>>");

    /* renamed from: a */
    public C48319p f129385a;

    public C48321r(C48319p pVar) {
        this.f129385a = pVar;
    }

    /* renamed from: a */
    public String mo73017a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Matcher matcher = f129384b.matcher(str);
        String group = matcher.find() ? matcher.group(1) : null;
        if (group == null) {
            return null;
        }
        String replaceFirst = str.replaceFirst("^<<//([a-z]{0,10})//>>", "");
        boolean equals = group.equals("sync");
        C48318o oVar = this.f129385a.f129378b;
        if (equals) {
            return oVar.mo73015a(replaceFirst, true);
        }
        oVar.f129376b.post(new C48317n(oVar, replaceFirst));
        return "";
    }
}
