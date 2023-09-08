package p195li;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: li.b */
public enum C34283b implements C38174i<C10529a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92406d;

    public Object get() {
        Object obj = this.f92406d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92406d;
                if (obj == obj2) {
                    obj = new C10529a();
                    this.f92406d = obj;
                }
            }
        }
        return (C10529a) obj;
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
        return Objects.equals(obj, "link_admin_explain");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C10529a.class.getName();
    }
}
