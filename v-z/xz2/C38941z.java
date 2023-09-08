package xz2;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: xz2.z */
public enum C38941z implements C38174i<C79025x> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f104941d;

    public Object get() {
        Object obj = this.f104941d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f104941d;
                if (obj == obj2) {
                    obj = new C79025x();
                    this.f104941d = obj;
                }
            }
        }
        return (C79025x) obj;
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
        return Objects.equals(obj, "12");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C79025x.class.getName();
    }
}
