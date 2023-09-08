package f00;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: f00.g0 */
public enum C31763g0 implements C38174i<C45734f0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84804d;

    /* renamed from: f00.g0$a */
    public static final class C31764a {

        /* renamed from: a */
        public static final List<Object> f84805a = null;

        static {
            f84805a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f84804d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84804d;
                if (obj == obj2) {
                    obj = new C45734f0();
                    this.f84804d = obj;
                }
            }
        }
        return (C45734f0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C31764a.f84805a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, 2);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C45734f0.class.getName();
    }
}
