package pi2;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: pi2.j */
public enum C35506j implements C38174i<C77090i> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94965d;

    /* renamed from: pi2.j$a */
    public static final class C35507a {

        /* renamed from: a */
        public static final List<Object> f94966a = null;

        static {
            f94966a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f94965d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94965d;
                if (obj == obj2) {
                    obj = new C77090i();
                    this.f94965d = obj;
                }
            }
        }
        return (C77090i) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C35507a.f94966a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "paymsg");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C77090i.class.getName();
    }
}
