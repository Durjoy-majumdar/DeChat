package t04;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import ny3.C25235d;

/* renamed from: t04.t */
public abstract class C22431t<K, V> {

    /* renamed from: a */
    public final ConcurrentHashMap<C25235d<? extends K>, Integer> f63559a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public final AtomicInteger f63560b = new AtomicInteger(0);

    /* renamed from: t04.t$a */
    public static final class C22432a extends C87413o implements C32226l<C25235d<? extends K>, Integer> {

        /* renamed from: d */
        public final /* synthetic */ C22431t<K, V> f63561d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22432a(C22431t<K, V> tVar) {
            super(1);
            this.f63561d = tVar;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C25235d) obj, LocaleUtil.ITALIAN);
            return Integer.valueOf(this.f63561d.f63560b.getAndIncrement());
        }
    }

    /* renamed from: a */
    public abstract <T extends K> int mo33817a(ConcurrentHashMap<C25235d<? extends K>, Integer> concurrentHashMap, C25235d<T> dVar, C32226l<? super C25235d<? extends K>, Integer> lVar);

    /* renamed from: b */
    public final <T extends K> int mo35583b(C25235d<T> dVar) {
        C87412m.m108594g(dVar, "kClass");
        return mo33817a(this.f63559a, dVar, new C22432a(this));
    }
}
