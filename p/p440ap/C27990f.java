package p440ap;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ap.f */
public enum C27990f implements C38174i<C92049e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77260d;

    /* renamed from: ap.f$a */
    public static final class C27991a {

        /* renamed from: a */
        public static final List<Object> f77261a = null;

        static {
            f77261a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f77260d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77260d;
                if (obj == obj2) {
                    obj = new C92049e();
                    this.f77260d = obj;
                }
            }
        }
        return (C92049e) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C27991a.f77261a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, 4);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C92049e.class.getName();
    }
}
