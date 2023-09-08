package p281yz;

import com.tencent.p014mm.autogen.events.UpdatePackageEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: yz.o */
public enum C39261o implements C38174i<C39260n> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105622d;

    public Object get() {
        Object obj = this.f105622d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f105622d;
                if (obj == obj2) {
                    obj = new C39260n();
                    this.f105622d = obj;
                }
            }
        }
        return (C39260n) obj;
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
        return Objects.equals(obj, UpdatePackageEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C39260n.class.getName();
    }
}
