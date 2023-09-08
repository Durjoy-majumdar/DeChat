package w52;

import com.tencent.p014mm.autogen.events.UpdatePackageEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: w52.o */
public enum C38027o implements C38174i<C38026n> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f100537d;

    public Object get() {
        Object obj = this.f100537d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f100537d;
                if (obj == obj2) {
                    obj = new C38026n();
                    this.f100537d = obj;
                }
            }
        }
        return (C38026n) obj;
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
        return "provider " + C38026n.class.getName();
    }
}
