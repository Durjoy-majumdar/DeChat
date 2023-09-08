package p826uc;

import android.text.TextUtils;
import android.util.Pair;
import android.webkit.WebResourceResponse;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.regex.Pattern;

/* renamed from: uc.b */
public class C52511b {

    /* renamed from: a */
    public final LinkedList<Pair<C52512c, Pattern>> f146669a = new LinkedList<>();

    /* renamed from: a */
    public void mo73445a(C52512c cVar) {
        String b = cVar.mo25134b();
        this.f146669a.add(new Pair(cVar, TextUtils.isEmpty(b) ? null : Pattern.compile(b)));
    }

    /* renamed from: b */
    public WebResourceResponse mo73446b(String str) {
        WebResourceResponse a;
        Iterator<Pair<C52512c, Pattern>> it = this.f146669a.iterator();
        while (it.hasNext()) {
            Pair next = it.next();
            C52512c cVar = (C52512c) next.first;
            Pattern pattern = (Pattern) next.second;
            if (pattern != null && pattern.matcher(str).matches() && (a = cVar.mo25133a(str)) != null) {
                return a;
            }
        }
        return null;
    }
}
