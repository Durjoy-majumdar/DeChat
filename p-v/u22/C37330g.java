package u22;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: u22.g */
public enum C37330g implements C38174i<C37329f> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98729d;

    public Object get() {
        Object obj = this.f98729d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98729d;
                if (obj == obj2) {
                    obj = new C37329f();
                    this.f98729d = obj;
                }
            }
        }
        return (C37329f) obj;
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
        return Objects.equals(obj, "trackmsg");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C37329f.class.getName();
    }
}
