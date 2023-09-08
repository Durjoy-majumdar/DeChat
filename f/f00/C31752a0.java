package f00;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: f00.a0 */
public enum C31752a0 implements C38174i<C7969z> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84775d;

    /* renamed from: f00.a0$a */
    public static final class C31753a {

        /* renamed from: a */
        public static final List<Object> f84776a = null;

        static {
            f84776a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f84775d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84775d;
                if (obj == obj2) {
                    obj = new C7969z();
                    this.f84775d = obj;
                }
            }
        }
        return (C7969z) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C31753a.f84776a;
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
        return "provider " + C7969z.class.getName();
    }
}
