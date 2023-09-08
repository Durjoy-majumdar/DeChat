package p660qi;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: qi.j */
public enum C35884j implements C38174i<C35883i> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95752d;

    public Object get() {
        Object obj = this.f95752d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95752d;
                if (obj == obj2) {
                    obj = new C35883i();
                    this.f95752d = obj;
                }
            }
        }
        return (C35883i) obj;
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
        return Objects.equals(obj, "@chatroom");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C35883i.class.getName();
    }
}
