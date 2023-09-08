package de1;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: de1.q */
public enum C31166q implements C38174i<C7267b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f83537d;

    public Object get() {
        Object obj = this.f83537d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f83537d;
                if (obj == obj2) {
                    obj = C7267b.f25328d;
                    this.f83537d = obj;
                }
            }
        }
        return (C7267b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return C7300w.class;
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
        return "provider " + C7267b.class.getName();
    }
}
