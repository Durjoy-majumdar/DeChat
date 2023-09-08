package p466cn;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: cn.b */
public enum C28622b implements C38174i<C104381a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f78537d;

    public Object get() {
        Object obj = this.f78537d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f78537d;
                if (obj == obj2) {
                    obj = new C104381a();
                    this.f78537d = obj;
                }
            }
        }
        return (C104381a) obj;
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
        return false;
    }

    public boolean hasNoKeys() {
        return true;
    }

    public String toString() {
        return "provider " + C104381a.class.getName();
    }
}
