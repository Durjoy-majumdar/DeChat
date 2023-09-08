package p281yz;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: yz.s */
public enum C39274s implements C38174i<C39263r> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105629d;

    /* renamed from: yz.s$a */
    public static final class C39275a {

        /* renamed from: a */
        public static final List<Object> f105630a = null;

        static {
            f105630a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f105629d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f105629d;
                if (obj == obj2) {
                    obj = new C39263r();
                    this.f105629d = obj;
                }
            }
        }
        return (C39263r) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C39275a.f105630a;
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
        return "provider " + C39263r.class.getName();
    }
}
