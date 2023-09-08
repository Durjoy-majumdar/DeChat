package qn1;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: qn1.i */
public enum C36030i implements C38174i<C12891h> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96063d;

    public Object get() {
        Object obj = this.f96063d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96063d;
                if (obj == obj2) {
                    obj = new C12891h();
                    this.f96063d = obj;
                }
            }
        }
        return (C12891h) obj;
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
        return Objects.equals(obj, 9794);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C12891h.class.getName();
    }
}
