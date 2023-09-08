package p594lk;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: lk.d */
public enum C34290d implements C38174i<C34289c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92417d;

    public Object get() {
        Object obj = this.f92417d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92417d;
                if (obj == obj2) {
                    obj = new C34289c();
                    this.f92417d = obj;
                }
            }
        }
        return (C34289c) obj;
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
        return Objects.equals(obj, 10002);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C34289c.class.getName();
    }
}
