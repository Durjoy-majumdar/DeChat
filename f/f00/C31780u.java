package f00;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: f00.u */
public enum C31780u implements C38174i<C7963t> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84836d;

    /* renamed from: f00.u$a */
    public static final class C31781a {

        /* renamed from: a */
        public static final List<Object> f84837a = null;

        static {
            f84837a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f84836d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84836d;
                if (obj == obj2) {
                    obj = new C7963t();
                    this.f84836d = obj;
                }
            }
        }
        return (C7963t) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C31781a.f84837a;
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
        return "provider " + C7963t.class.getName();
    }
}
