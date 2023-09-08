package cm2;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: cm2.d */
public enum C28620d implements C38174i<C67404c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f78531d;

    public Object get() {
        Object obj = this.f78531d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f78531d;
                if (obj == obj2) {
                    obj = new C67404c();
                    this.f78531d = obj;
                }
            }
        }
        return (C67404c) obj;
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
        return Objects.equals(obj, 3);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C67404c.class.getName();
    }
}
