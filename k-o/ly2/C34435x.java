package ly2;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ly2.x */
public enum C34435x implements C38174i<C34434w> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92711d;

    /* renamed from: ly2.x$a */
    public static final class C34436a {

        /* renamed from: a */
        public static final List<Object> f92712a = null;

        static {
            f92712a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f92711d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92711d;
                if (obj == obj2) {
                    obj = new C34434w();
                    this.f92711d = obj;
                }
            }
        }
        return (C34434w) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C34436a.f92712a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, 2) || Objects.equals(obj, 3);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C34434w.class.getName();
    }
}
