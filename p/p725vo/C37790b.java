package p725vo;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: vo.b */
public enum C37790b implements C38174i<C52973a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f100101d;

    public Object get() {
        Object obj = this.f100101d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f100101d;
                if (obj == obj2) {
                    obj = new C52973a();
                    this.f100101d = obj;
                }
            }
        }
        return (C52973a) obj;
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
        return "provider " + C52973a.class.getName();
    }
}
