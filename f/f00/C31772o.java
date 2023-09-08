package f00;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: f00.o */
public enum C31772o implements C38174i<C31771n> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84824d;

    /* renamed from: f00.o$a */
    public static final class C31773a {

        /* renamed from: a */
        public static final List<Object> f84825a = null;

        static {
            f84825a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f84824d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84824d;
                if (obj == obj2) {
                    obj = new C31771n();
                    this.f84824d = obj;
                }
            }
        }
        return (C31771n) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C31773a.f84825a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, 5);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C31771n.class.getName();
    }
}
