package ma2;

import ca2.C92388b;
import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: ma2.n0 */
public enum C34518n0 implements C38174i<C34515m0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92881d;

    /* renamed from: ma2.n0$a */
    public static final class C34519a {

        /* renamed from: a */
        public static final List<Object> f92882a = null;

        static {
            f92882a = Arrays.asList(new Object[]{C92388b.class});
        }
    }

    /* renamed from: ma2.n0$b */
    public static final class C34520b {

        /* renamed from: a */
        public static final List<Object> f92883a = null;

        static {
            f92883a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f92881d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92881d;
                if (obj == obj2) {
                    obj = new C34515m0();
                    this.f92881d = obj;
                }
            }
        }
        return (C34515m0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return C34519a.f92882a;
        }
        if ("onProcess".equals(str)) {
            return C34520b.f92883a;
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
        return "provider " + C34515m0.class.getName();
    }
}
