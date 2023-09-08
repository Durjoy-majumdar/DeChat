package vq1;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: vq1.m */
public enum C37812m implements C38174i<C14962j> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f100136d;

    public Object get() {
        Object obj = this.f100136d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f100136d;
                if (obj == obj2) {
                    obj = new C14962j();
                    this.f100136d = obj;
                }
            }
        }
        return (C14962j) obj;
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
        return "provider " + C14962j.class.getName();
    }
}
