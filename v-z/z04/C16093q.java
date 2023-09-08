package z04;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: z04.q */
public final class C16093q extends C87413o implements C32226l<String, String> {

    /* renamed from: d */
    public final /* synthetic */ String f43245d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16093q(String str) {
        super(1);
        this.f43245d = str;
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        C87412m.m108594g(str, "line");
        return this.f43245d + str;
    }
}
