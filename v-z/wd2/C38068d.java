package wd2;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: wd2.d */
public enum C38068d implements C38174i<C38066c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f100632d;

    public Object get() {
        Object obj = this.f100632d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f100632d;
                if (obj == obj2) {
                    obj = new C38066c();
                    this.f100632d = obj;
                }
            }
        }
        return (C38066c) obj;
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
        return Objects.equals(obj, "pat");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C38066c.class.getName();
    }
}
