package p769yt;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: yt.c */
public enum C39159c implements C38174i<C39158b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105393d;

    public Object get() {
        Object obj = this.f105393d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f105393d;
                if (obj == obj2) {
                    obj = new C39158b();
                    this.f105393d = obj;
                }
            }
        }
        return (C39158b) obj;
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
        return "provider " + C39158b.class.getName();
    }
}
