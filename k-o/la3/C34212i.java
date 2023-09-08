package la3;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: la3.i */
public enum C34212i implements C38174i<C99368h> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92258d;

    /* renamed from: la3.i$a */
    public static final class C34213a {

        /* renamed from: a */
        public static final List<Object> f92259a = null;

        static {
            f92259a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f92258d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92258d;
                if (obj == obj2) {
                    obj = new C99368h();
                    this.f92258d = obj;
                }
            }
        }
        return (C99368h) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("onProcess".equals(str)) {
            return C34213a.f92259a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "newabtestlabs");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C99368h.class.getName();
    }
}
