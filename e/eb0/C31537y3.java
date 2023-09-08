package eb0;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: eb0.y3 */
public enum C31537y3 implements C38174i<C31532x3> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84295d;

    public Object get() {
        Object obj = this.f84295d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84295d;
                if (obj == obj2) {
                    obj = new C31532x3();
                    this.f84295d = obj;
                }
            }
        }
        return (C31532x3) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, 55) || Objects.equals(obj, 57) || Objects.equals(obj, 21) || Objects.equals(obj, 35) || Objects.equals(obj, 10000) || Objects.equals(obj, 1);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C31532x3.class.getName();
    }
}
