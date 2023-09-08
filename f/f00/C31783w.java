package f00;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: f00.w */
public enum C31783w implements C38174i<C31782v> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84840d;

    /* renamed from: f00.w$a */
    public static final class C31784a {

        /* renamed from: a */
        public static final List<Object> f84841a = null;

        static {
            f84841a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f84840d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84840d;
                if (obj == obj2) {
                    obj = new C31782v();
                    this.f84840d = obj;
                }
            }
        }
        return (C31782v) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C31784a.f84841a;
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
        return "provider " + C31782v.class.getName();
    }
}
