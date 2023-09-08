package ny2;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ny2.k */
public enum C35047k implements C38174i<C11315j> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94043d;

    /* renamed from: ny2.k$a */
    public static final class C35048a {

        /* renamed from: a */
        public static final List<Object> f94044a = null;

        static {
            f94044a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f94043d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94043d;
                if (obj == obj2) {
                    obj = new C11315j();
                    this.f94043d = obj;
                }
            }
        }
        return (C11315j) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C35048a.f94044a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, 3);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C11315j.class.getName();
    }
}
