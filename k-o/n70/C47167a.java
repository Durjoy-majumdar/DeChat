package n70;

import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import iy3.C60641c;
import lg3.C88494d;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: n70.a */
public final class C47167a {

    /* renamed from: a */
    public static final C13601g f126711a = C36568h.m40985a(C47168a.f126712d);

    /* renamed from: n70.a$a */
    public static final class C47168a extends C87413o implements C32224a<Float> {

        /* renamed from: d */
        public static final C47168a f126712d = new C47168a();

        public C47168a() {
            super(0);
        }

        public Object invoke() {
            return Float.valueOf(MMApplicationContext.isMainProcess() ? MMApplicationContext.getContext().getResources().getDisplayMetrics().density : C88494d.m110348d().density);
        }
    }

    /* renamed from: a */
    public static final int m52444a(Number number) {
        C87412m.m108594g(number, "<this>");
        return C60641c.m70921b(number.floatValue() / ((Number) ((C36570n) f126711a).getValue()).floatValue());
    }

    /* renamed from: b */
    public static final int m52445b(Number number) {
        C87412m.m108594g(number, "<this>");
        return C60641c.m70921b(number.floatValue() * ((Number) ((C36570n) f126711a).getValue()).floatValue());
    }
}
