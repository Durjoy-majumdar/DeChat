package p743ws;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: ws.c */
public enum C38290c implements C38174i<C102490b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f101083d;

    public Object get() {
        Object obj = this.f101083d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f101083d;
                if (obj == obj2) {
                    obj = new C102490b();
                    this.f101083d = obj;
                }
            }
        }
        return (C102490b) obj;
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
        return "provider " + C102490b.class.getName();
    }
}
