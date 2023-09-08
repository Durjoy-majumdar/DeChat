package qy3;

import fy3.C32224a;
import java.lang.ref.SoftReference;

/* renamed from: qy3.n0 */
public class C25968n0 {

    /* renamed from: qy3.n0$a */
    public static class C25969a<T> extends C25971c<T> implements C32224a<T> {

        /* renamed from: e */
        public final C32224a<T> f72348e;

        /* renamed from: f */
        public volatile SoftReference<Object> f72349f;

        public C25969a(T t, C32224a<T> aVar) {
            if (aVar != null) {
                this.f72349f = null;
                this.f72348e = aVar;
                if (t != null) {
                    this.f72349f = new SoftReference<>(t);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal", "<init>"}));
        }

        public T invoke() {
            T t;
            SoftReference<Object> softReference = this.f72349f;
            if (softReference == null || (t = softReference.get()) == null) {
                T invoke = this.f72348e.invoke();
                this.f72349f = new SoftReference<>(invoke == null ? C25971c.f72352d : invoke);
                return invoke;
            } else if (t == C25971c.f72352d) {
                return null;
            } else {
                return t;
            }
        }
    }

    /* renamed from: qy3.n0$b */
    public static class C25970b<T> extends C25971c<T> {

        /* renamed from: e */
        public final C32224a<T> f72350e;

        /* renamed from: f */
        public volatile Object f72351f;

        public C25970b(C32224a<T> aVar) {
            if (aVar != null) {
                this.f72351f = null;
                this.f72350e = aVar;
                return;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazyVal", "<init>"}));
        }

        public T invoke() {
            T t = this.f72351f;
            if (t == null) {
                T invoke = this.f72350e.invoke();
                this.f72351f = invoke == null ? C25971c.f72352d : invoke;
                return invoke;
            } else if (t == C25971c.f72352d) {
                return null;
            } else {
                return t;
            }
        }
    }

    /* renamed from: qy3.n0$c */
    public static abstract class C25971c<T> {

        /* renamed from: d */
        public static final Object f72352d = new C25972a();

        /* renamed from: qy3.n0$c$a */
        public static class C25972a {
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m33135a(int i) {
        Object[] objArr = new Object[3];
        objArr[0] = "initializer";
        objArr[1] = "kotlin/reflect/jvm/internal/ReflectProperties";
        if (i == 1 || i == 2) {
            objArr[2] = "lazySoft";
        } else {
            objArr[2] = "lazy";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* renamed from: b */
    public static <T> C25970b<T> m33136b(C32224a<T> aVar) {
        if (aVar != null) {
            return new C25970b<>(aVar);
        }
        m33135a(0);
        throw null;
    }

    /* renamed from: c */
    public static <T> C25969a<T> m33137c(C32224a<T> aVar) {
        if (aVar != null) {
            return new C25969a<>(null, aVar);
        }
        m33135a(2);
        throw null;
    }
}
