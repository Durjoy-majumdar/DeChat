package mi2;

import fy3.C32224a;
import gy3.C87413o;
import java.util.HashMap;
import java.util.List;
import rx3.C13601g;
import rx3.C36568h;
import sx3.C64197v;
import t83.C13853i;
import w83.C15053a;

/* renamed from: mi2.a */
public final class C10892a {

    /* renamed from: a */
    public static final C13601g f32514a = C36568h.m40985a(C10893a.f32515d);

    /* renamed from: mi2.a$a */
    public static final class C10893a extends C87413o implements C32224a<HashMap<String, C15053a>> {

        /* renamed from: d */
        public static final C10893a f32515d = new C10893a();

        public C10893a() {
            super(0);
        }

        public Object invoke() {
            int i = C13853i.f38997a;
            List<C15053a> f = C64197v.m75537f(C10894b.f32516d, C10896d.f32520d, C10895c.f32517d);
            HashMap hashMap = new HashMap();
            for (C15053a aVar : f) {
                hashMap.put(aVar.mo7288c(), aVar);
            }
            return hashMap;
        }
    }
}
