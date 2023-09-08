package p489dh;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: dh.c */
public enum C31180c implements C38174i<C107033b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f83569d;

    public Object get() {
        Object obj = this.f83569d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f83569d;
                if (obj == obj2) {
                    obj = new C107033b();
                    this.f83569d = obj;
                }
            }
        }
        return (C107033b) obj;
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
        return "provider " + C107033b.class.getName();
    }
}
