package wl3;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: wl3.b */
public enum C38226b implements C38174i<C78624a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f100948d;

    public Object get() {
        Object obj = this.f100948d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f100948d;
                if (obj == obj2) {
                    obj = new C78624a();
                    this.f100948d = obj;
                }
            }
        }
        return (C78624a) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
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
        return "provider " + C78624a.class.getName();
    }
}
