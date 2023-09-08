package dm2;

import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashMap;
import java.util.Map;
import pe3.C47465a;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: dm2.d */
public class C45420d<T extends C47465a> implements C45424g<T> {

    /* renamed from: a */
    public final int f122941a;

    /* renamed from: b */
    public final C13601g f122942b = C36568h.m40985a(C45421a.f122943d);

    /* renamed from: dm2.d$a */
    public static final class C45421a extends C87413o implements C32224a<HashMap<String, T>> {

        /* renamed from: d */
        public static final C45421a f122943d = new C45421a();

        public C45421a() {
            super(0);
        }

        public Object invoke() {
            return new HashMap();
        }
    }

    public C45420d(int i) {
        this.f122941a = i;
    }

    /* renamed from: a */
    public void mo70916a(String str, T t) {
        C87412m.m108594g(str, "key");
        C87412m.m108594g(t, "value");
        ((HashMap) ((C36570n) this.f122942b).getValue()).put(str, t);
    }

    /* renamed from: b */
    public Map<String, T> mo70917b() {
        return (HashMap) ((C36570n) this.f122942b).getValue();
    }

    /* renamed from: c */
    public void mo70918c(String str, String str2) {
        C87412m.m108594g(str, "fromKey");
        C87412m.m108594g(str2, "toKey");
        C47465a aVar = (C47465a) ((HashMap) ((C36570n) this.f122942b).getValue()).get(str);
        if (aVar != null) {
            ((HashMap) ((C36570n) this.f122942b).getValue()).put(str2, aVar);
        }
    }

    public int getType() {
        return this.f122941a;
    }
}
