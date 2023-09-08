package u21;

import android.text.Spanned;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import w21.C102314l;

/* renamed from: u21.i */
public class C101957i implements Serializable {

    /* renamed from: f */
    public static final Pattern f300157f = Pattern.compile("\\r\\n|\\r|\\n");

    /* renamed from: d */
    public int f300158d = 0;

    /* renamed from: e */
    public final ArrayList<C102314l> f300159e = new ArrayList<>();

    public C101957i(Spanned spanned) {
        boolean z = false;
        if (spanned != null) {
            String obj = spanned.toString();
            this.f300158d = 1;
            Matcher matcher = f300157f.matcher(obj);
            int i = 0;
            while (matcher.find()) {
                this.f300159e.add(new C102314l(i, matcher.end(), this.f300158d == 1, false));
                i = matcher.end();
                this.f300158d++;
            }
            if (this.f300159e.size() < this.f300158d) {
                this.f300159e.add(new C102314l(i, obj.length(), this.f300158d == 1 ? true : z, true));
            }
        }
    }

    /* renamed from: a */
    public int mo141481a(int i) {
        int i2 = 0;
        while (i2 < this.f300158d && i >= this.f300159e.get(i2).f300152e) {
            i2++;
        }
        return Math.min(Math.max(0, i2), this.f300159e.size() - 1);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<C102314l> it = this.f300159e.iterator();
        int i = 1;
        while (it.hasNext()) {
            C102314l next = it.next();
            int i2 = i + 1;
            sb.append(i);
            sb.append(": ");
            sb.append(next.f300151d);
            sb.append("-");
            sb.append(next.f300152e);
            sb.append(next.f301332g ? "" : ", ");
            i = i2;
        }
        return sb.toString();
    }
}
