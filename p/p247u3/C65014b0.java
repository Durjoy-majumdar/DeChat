package p247u3;

import a14.C0000n0;
import a14.C53896h0;
import com.google.firebase.analytics.FirebaseAnalytics;
import gy3.C87412m;
import java.util.concurrent.atomic.AtomicBoolean;
import p247u3.C65035c1;

/* renamed from: u3.b0 */
public final class C65014b0<K, V> {

    /* renamed from: a */
    public final AtomicBoolean f187160a = new AtomicBoolean(false);

    /* renamed from: b */
    public final C0000n0 f187161b;

    /* renamed from: u3.b0$a */
    public interface C65015a<K> {
    }

    /* renamed from: u3.b0$b */
    public interface C65016b<V> {
    }

    /* renamed from: u3.b0$c */
    public static final class C65017c extends C65035c1.C65040d {
        public C65017c(C65014b0 b0Var) {
        }
    }

    public C65014b0(C0000n0 n0Var, C65035c1.C65038c cVar, C65145q1<K, V> q1Var, C53896h0 h0Var, C53896h0 h0Var2, C65016b<V> bVar, C65015a<K> aVar) {
        C87412m.m108594g(n0Var, "pagedListScope");
        C87412m.m108594g(cVar, "config");
        C87412m.m108594g(q1Var, FirebaseAnalytics.C113379b.SOURCE);
        C87412m.m108594g(h0Var, "notifyDispatcher");
        C87412m.m108594g(h0Var2, "fetchDispatcher");
        C87412m.m108594g(bVar, "pageConsumer");
        C87412m.m108594g(aVar, "keyProvider");
        this.f187161b = n0Var;
        new C65017c(this);
    }
}
