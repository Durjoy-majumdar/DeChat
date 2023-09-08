package p758xy;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: xy.q */
public enum C38901q implements C38174i<C38898p> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f104849d;

    /* renamed from: xy.q$a */
    public static final class C38902a {

        /* renamed from: a */
        public static final List<Object> f104850a = null;

        static {
            f104850a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f104849d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f104849d;
                if (obj == obj2) {
                    obj = new C38898p();
                    this.f104849d = obj;
                }
            }
        }
        return (C38898p) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C38902a.f104850a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, 302) || Objects.equals(obj, 4255);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C38898p.class.getName();
    }
}
