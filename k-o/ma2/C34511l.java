package ma2;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import ma2.C99808k;
import p261wl.C38174i;

/* renamed from: ma2.l */
public enum C34511l implements C38174i<C99808k.C99809a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92869d;

    /* renamed from: ma2.l$a */
    public static final class C34512a {

        /* renamed from: a */
        public static final List<Object> f92870a = null;

        static {
            f92870a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f92869d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92869d;
                if (obj == obj2) {
                    obj = new C99808k.C99809a();
                    this.f92869d = obj;
                }
            }
        }
        return (C99808k.C99809a) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C34512a.f92870a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, 6) || Objects.equals(obj, 23);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C99808k.C99809a.class.getName();
    }
}
