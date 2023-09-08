package p688ss;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: ss.c */
public enum C36785c implements C38174i<C118301b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f97687d;

    public Object get() {
        Object obj = this.f97687d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f97687d;
                if (obj == obj2) {
                    obj = new C118301b();
                    this.f97687d = obj;
                }
            }
        }
        return (C118301b) obj;
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
        return "provider " + C118301b.class.getName();
    }
}
