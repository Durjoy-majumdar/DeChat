package p783zv;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: zv.c */
public enum C39456c implements C38174i<C91939b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105973d;

    public Object get() {
        Object obj = this.f105973d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f105973d;
                if (obj == obj2) {
                    obj = new C91939b();
                    this.f105973d = obj;
                }
            }
        }
        return (C91939b) obj;
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
        return "provider " + C91939b.class.getName();
    }
}
