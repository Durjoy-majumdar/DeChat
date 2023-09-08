package p718uy;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: uy.c */
public enum C37611c implements C38174i<C37610b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f99728d;

    public Object get() {
        Object obj = this.f99728d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f99728d;
                if (obj == obj2) {
                    obj = new C37610b();
                    this.f99728d = obj;
                }
            }
        }
        return (C37610b) obj;
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
        return "provider " + C37610b.class.getName();
    }
}
