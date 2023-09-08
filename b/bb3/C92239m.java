package bb3;

import android.text.Spanned;
import db3.C97470n;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: bb3.m */
public class C92239m implements Serializable {

    /* renamed from: f */
    public static final Pattern f264002f = Pattern.compile("\\r\\n|\\r|\\n");

    /* renamed from: d */
    public int f264003d = 0;

    /* renamed from: e */
    public final ArrayList<C97470n> f264004e = new ArrayList<>();

    public C92239m(Spanned spanned) {
        boolean z = false;
        if (spanned != null) {
            String obj = spanned.toString();
            this.f264003d = 1;
            Matcher matcher = f264002f.matcher(obj);
            int i = 0;
            while (matcher.find()) {
                this.f264004e.add(new C97470n(i, matcher.end(), this.f264003d == 1, false));
                i = matcher.end();
                this.f264003d++;
            }
            if (this.f264004e.size() < this.f264003d) {
                this.f264004e.add(new C97470n(i, obj.length(), this.f264003d == 1 ? true : z, true));
            }
        }
    }

    /* renamed from: a */
    public int mo126235a(int i) {
        int i2 = 0;
        while (i2 < this.f264003d && i >= this.f264004e.get(i2).f263990e) {
            i2++;
        }
        return Math.min(Math.max(0, i2), this.f264004e.size() - 1);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<C97470n> it = this.f264004e.iterator();
        int i = 1;
        while (it.hasNext()) {
            C97470n next = it.next();
            int i2 = i + 1;
            sb.append(i);
            sb.append(": ");
            sb.append(next.f263989d);
            sb.append("-");
            sb.append(next.f263990e);
            sb.append(next.f286086g ? "" : ", ");
            i = i2;
        }
        return sb.toString();
    }
}
