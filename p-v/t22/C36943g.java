package t22;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: t22.g */
public enum C36943g implements C38174i<C36942f> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98004d;

    public Object get() {
        Object obj = this.f98004d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98004d;
                if (obj == obj2) {
                    obj = new C36942f();
                    this.f98004d = obj;
                }
            }
        }
        return (C36942f) obj;
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
        return Objects.equals(obj, 48);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C36942f.class.getName();
    }
}
