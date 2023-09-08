package cj1;

import fy3.C32226l;
import gy3.C87413o;
import java.util.List;

/* renamed from: cj1.e4 */
public final class C54750e4 extends C87413o implements C32226l<Integer, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ List<Integer> f153461d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54750e4(List<Integer> list) {
        super(1);
        this.f153461d = list;
    }

    public Object invoke(Object obj) {
        return Boolean.valueOf(!C54757f4.m61614a(((Number) obj).intValue(), this.f153461d));
    }
}
