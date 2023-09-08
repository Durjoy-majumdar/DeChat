package p697tm;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: tm.n1 */
public enum C37169n1 implements C38174i<C90523m1> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98415d;

    /* renamed from: tm.n1$a */
    public static final class C37170a {

        /* renamed from: a */
        public static final List<Object> f98416a = null;

        static {
            f98416a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f98415d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98415d;
                if (obj == obj2) {
                    obj = new C90523m1();
                    this.f98415d = obj;
                }
            }
        }
        return (C90523m1) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C37170a.f98416a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return false;
    }

    public boolean hasNoKeys() {
        return true;
    }

    public String toString() {
        return "provider " + C90523m1.class.getName();
    }
}
