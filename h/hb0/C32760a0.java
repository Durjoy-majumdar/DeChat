package hb0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: hb0.a0 */
public enum C32760a0 implements C38174i<C32797z> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f89163d;

    /* renamed from: hb0.a0$a */
    public static final class C32761a {

        /* renamed from: a */
        public static final List<Object> f89164a = null;

        static {
            f89164a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f89163d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f89163d;
                if (obj == obj2) {
                    obj = new C32797z();
                    this.f89163d = obj;
                }
            }
        }
        return (C32797z) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C32761a.f89164a;
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
        return "provider " + C32797z.class.getName();
    }
}
