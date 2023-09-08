package bb1;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: bb1.j */
public enum C28286j implements C38174i<C28285i> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77871d;

    public Object get() {
        Object obj = this.f77871d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77871d;
                if (obj == obj2) {
                    obj = new C28285i();
                    this.f77871d = obj;
                }
            }
        }
        return (C28285i) obj;
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
        return Objects.equals(obj, 22);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C28285i.class.getName();
    }
}
