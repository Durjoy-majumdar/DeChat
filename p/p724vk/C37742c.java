package p724vk;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: vk.c */
public enum C37742c implements C38174i<C37741b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f99962d;

    public Object get() {
        Object obj = this.f99962d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f99962d;
                if (obj == obj2) {
                    obj = new C37741b();
                    this.f99962d = obj;
                }
            }
        }
        return (C37741b) obj;
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
        return "provider " + C37741b.class.getName();
    }
}
