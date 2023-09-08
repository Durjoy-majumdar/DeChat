package i32;

import com.tencent.p014mm.autogen.events.ExptChangeEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: i32.g */
public enum C33199g implements C38174i<C33198f> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90091d;

    public Object get() {
        Object obj = this.f90091d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90091d;
                if (obj == obj2) {
                    obj = new C33198f();
                    this.f90091d = obj;
                }
            }
        }
        return (C33198f) obj;
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
        return Objects.equals(obj, ExptChangeEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C33198f.class.getName();
    }
}
