package n12;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: n12.h */
public enum C34733h implements C38174i<C11109g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93385d;

    public Object get() {
        Object obj = this.f93385d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93385d;
                if (obj == obj2) {
                    obj = new C11109g();
                    this.f93385d = obj;
                }
            }
        }
        return (C11109g) obj;
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
        return Objects.equals(obj, "WCONotify");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C11109g.class.getName();
    }
}
