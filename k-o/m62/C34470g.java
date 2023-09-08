package m62;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: m62.g */
public enum C34470g implements C38174i<C46946f> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92780d;

    /* renamed from: m62.g$a */
    public static final class C34471a {

        /* renamed from: a */
        public static final List<Object> f92781a = null;

        static {
            f92781a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f92780d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92780d;
                if (obj == obj2) {
                    obj = new C46946f();
                    this.f92780d = obj;
                }
            }
        }
        return (C46946f) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C34471a.f92781a;
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
        return "provider " + C46946f.class.getName();
    }
}
