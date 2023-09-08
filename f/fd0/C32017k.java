package fd0;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: fd0.k */
public enum C32017k implements C38174i<C75744j> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85242d;

    public Object get() {
        Object obj = this.f85242d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85242d;
                if (obj == obj2) {
                    obj = new C75744j();
                    this.f85242d = obj;
                }
            }
        }
        return (C75744j) obj;
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
        return Objects.equals(obj, 37) || Objects.equals(obj, 65);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C75744j.class.getName();
    }
}
