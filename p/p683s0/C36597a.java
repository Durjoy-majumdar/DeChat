package p683s0;

import fy3.C32226l;
import fy3.C32227p;
import gy3.C24564k0;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.List;

/* renamed from: s0.a */
public final class C36597a {

    /* renamed from: s0.a$a */
    public static final class C36598a extends C87413o implements C32227p<C36606n, Original, Object> {

        /* renamed from: d */
        public final /* synthetic */ C32227p<C36606n, Original, List<Saveable>> f97316d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36598a(C32227p<? super C36606n, ? super Original, ? extends List<? extends Saveable>> pVar) {
            super(2);
            this.f97316d = pVar;
        }

        public Object invoke(Object obj, Object obj2) {
            C36606n nVar = (C36606n) obj;
            C87412m.m108594g(nVar, "$this$Saver");
            List invoke = this.f97316d.invoke(nVar, obj2);
            int size = invoke.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                Object obj3 = invoke.get(i);
                if (obj3 == null || nVar.mo60751a(obj3)) {
                    i = i2;
                } else {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
            if (!invoke.isEmpty()) {
                return new ArrayList(invoke);
            }
            return null;
        }
    }

    /* renamed from: a */
    public static final <Original, Saveable> C36601l<Original, Object> m41001a(C32227p<? super C36606n, ? super Original, ? extends List<? extends Saveable>> pVar, C32226l<? super List<? extends Saveable>, ? extends Original> lVar) {
        C87412m.m108594g(pVar, "save");
        C87412m.m108594g(lVar, "restore");
        C36598a aVar = new C36598a(pVar);
        C24564k0.m30741e(lVar, 1);
        return C36602m.m41009a(aVar, lVar);
    }
}
