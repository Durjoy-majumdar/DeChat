package xx1;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: xx1.l */
public enum C38885l implements C38174i<C53467k> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f104808d;

    public Object get() {
        Object obj = this.f104808d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f104808d;
                if (obj == obj2) {
                    obj = new C53467k();
                    this.f104808d = obj;
                }
            }
        }
        return (C53467k) obj;
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
        return Objects.equals(obj, "gamecenter");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C53467k.class.getName();
    }
}
