package dv1;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: dv1.h */
public enum C31300h implements C38174i<C31299g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f83811d;

    public Object get() {
        Object obj = this.f83811d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f83811d;
                if (obj == obj2) {
                    obj = new C31299g();
                    this.f83811d = obj;
                }
            }
        }
        return (C31299g) obj;
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
        return Objects.equals(obj, "NewXmlAddForcePush") || Objects.equals(obj, "NewXmlDelForcePush");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C31299g.class.getName();
    }
}
