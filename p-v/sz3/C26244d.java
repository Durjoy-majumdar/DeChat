package sz3;

import com.tencent.xweb.file.XVFSFile;
import fy3.C32226l;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.List;
import qz3.C26055o;
import qz3.C26062p;
import rx3.C13605o;
import sx3.C110818d0;

/* renamed from: sz3.d */
public final class C26244d implements C26243c {

    /* renamed from: a */
    public final C26062p f73180a;

    /* renamed from: b */
    public final C26055o f73181b;

    public C26244d(C26062p pVar, C26055o oVar) {
        C87412m.m108594g(pVar, "strings");
        C87412m.m108594g(oVar, "qualifiedNames");
        this.f73180a = pVar;
        this.f73181b = oVar;
    }

    /* renamed from: a */
    public String mo53143a(int i) {
        C13605o<List<String>, List<String>, Boolean> c = mo53146c(i);
        List list = (List) c.f38557d;
        String S = C110818d0.m150921S((List) c.f38558e, ".", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null);
        if (list.isEmpty()) {
            return S;
        }
        return C110818d0.m150921S(list, "/", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null) + XVFSFile.SEPARATOR_CHAR + S;
    }

    /* renamed from: b */
    public boolean mo53144b(int i) {
        return ((Boolean) mo53146c(i).f38559f).booleanValue();
    }

    /* renamed from: c */
    public final C13605o<List<String>, List<String>, Boolean> mo53146c(int i) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z = false;
        while (i != -1) {
            C26055o.C26058c cVar = this.f73181b.f72731e.get(i);
            C26062p pVar = this.f73180a;
            String str = (String) pVar.f72757e.get(cVar.f72741g);
            C26055o.C26058c.C26061c cVar2 = cVar.f72742h;
            C87412m.m108591d(cVar2);
            int ordinal = cVar2.ordinal();
            if (ordinal == 0) {
                linkedList2.addFirst(str);
            } else if (ordinal == 1) {
                linkedList.addFirst(str);
            } else if (ordinal == 2) {
                linkedList2.addFirst(str);
                z = true;
            }
            i = cVar.f72740f;
        }
        return new C13605o<>(linkedList, linkedList2, Boolean.valueOf(z));
    }

    public String getString(int i) {
        String str = (String) this.f73180a.f72757e.get(i);
        C87412m.m108593f(str, "strings.getString(index)");
        return str;
    }
}
