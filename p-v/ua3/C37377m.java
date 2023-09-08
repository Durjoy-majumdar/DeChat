package ua3;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ua3.m */
public enum C37377m implements C38174i<C37376l> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98815d;

    public Object get() {
        Object obj = this.f98815d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98815d;
                if (obj == obj2) {
                    obj = new C37376l();
                    this.f98815d = obj;
                }
            }
        }
        return (C37376l) obj;
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
        return Objects.equals(obj, 3);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C37376l.class.getName();
    }
}
