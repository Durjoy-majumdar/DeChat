package tw2;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: tw2.d */
public enum C37293d implements C38174i<C37291c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98655d;

    public Object get() {
        Object obj = this.f98655d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98655d;
                if (obj == obj2) {
                    obj = new C37291c();
                    this.f98655d = obj;
                }
            }
        }
        return (C37291c) obj;
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
        return Objects.equals(obj, 38);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C37291c.class.getName();
    }
}
