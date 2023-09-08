package lz1;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;
import p635os.C89291d;

/* renamed from: lz1.k */
public enum C34448k implements C38174i<C88684j> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92744d;

    /* renamed from: lz1.k$a */
    public static final class C34449a {

        /* renamed from: a */
        public static final List<Object> f92745a = null;

        static {
            f92745a = Arrays.asList(new Object[]{C89291d.class});
        }
    }

    /* renamed from: lz1.k$b */
    public static final class C34450b {

        /* renamed from: a */
        public static final List<Object> f92746a = null;

        static {
            f92746a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f92744d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92744d;
                if (obj == obj2) {
                    obj = new C88684j();
                    this.f92744d = obj;
                }
            }
        }
        return (C88684j) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C34450b.f92746a;
        }
        if ("dependencies".equals(str)) {
            return C34449a.f92745a;
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
        return "provider " + C88684j.class.getName();
    }
}
