package wh0;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: wh0.c */
public enum C38127c implements C38174i<C78596b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f100761d;

    public Object get() {
        Object obj = this.f100761d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f100761d;
                if (obj == obj2) {
                    obj = new C78596b();
                    this.f100761d = obj;
                }
            }
        }
        return (C78596b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
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
        return "provider " + C78596b.class.getName();
    }
}
