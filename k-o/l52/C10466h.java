package l52;

import fy3.C32226l;
import fy3.C32227p;
import gy3.C87413o;
import java.util.List;

/* renamed from: l52.h */
public final class C10466h extends C87413o implements C32226l<Integer, Object> {

    /* renamed from: d */
    public final /* synthetic */ C32227p f31697d;

    /* renamed from: e */
    public final /* synthetic */ List f31698e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10466h(C32227p pVar, List list) {
        super(1);
        this.f31697d = pVar;
        this.f31698e = list;
    }

    public Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        return this.f31697d.invoke(Integer.valueOf(intValue), this.f31698e.get(intValue));
    }
}
