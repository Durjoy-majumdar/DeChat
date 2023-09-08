package f81;

import ei3.C31607a;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: f81.e */
public enum C31960e implements C38174i<C116807d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85108d;

    public Object get() {
        Object obj = this.f85108d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85108d;
                if (obj == obj2) {
                    obj = new C116807d();
                    this.f85108d = obj;
                }
            }
        }
        return (C116807d) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        if ("onProcess".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, C31607a.ON_SPLASH);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C116807d.class.getName();
    }
}
