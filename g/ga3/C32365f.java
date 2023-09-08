package ga3;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ga3.f */
public enum C32365f implements C38174i<C8257e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85889d;

    public Object get() {
        Object obj = this.f85889d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85889d;
                if (obj == obj2) {
                    obj = new C8257e();
                    this.f85889d = obj;
                }
            }
        }
        return (C8257e) obj;
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
        return Objects.equals(obj, "goto_file_helper");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C8257e.class.getName();
    }
}
