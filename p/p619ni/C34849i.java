package p619ni;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ni.i */
public enum C34849i implements C38174i<C76859h> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93628d;

    public Object get() {
        Object obj = this.f93628d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93628d;
                if (obj == obj2) {
                    obj = new C76859h();
                    this.f93628d = obj;
                }
            }
        }
        return (C76859h) obj;
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
        return Objects.equals(obj, "roomtoolstips");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C76859h.class.getName();
    }
}
