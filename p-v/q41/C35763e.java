package q41;

import java.util.Collections;
import p261wl.C38174i;
import q41.C101028a;

/* renamed from: q41.e */
public enum C35763e implements C38174i<C101028a.C101029a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95527d;

    public Object get() {
        Object obj = this.f95527d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95527d;
                if (obj == obj2) {
                    obj = new C101028a.C101029a();
                    this.f95527d = obj;
                }
            }
        }
        return (C101028a.C101029a) obj;
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
        return false;
    }

    public boolean hasNoKeys() {
        return true;
    }

    public String toString() {
        return "provider " + C101028a.C101029a.class.getName();
    }
}
