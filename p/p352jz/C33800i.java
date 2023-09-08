package p352jz;

import com.tencent.p014mm.autogen.events.FinderTeenModeChangeEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: jz.i */
public enum C33800i implements C38174i<C108780h> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91389d;

    public Object get() {
        Object obj = this.f91389d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f91389d;
                if (obj == obj2) {
                    obj = new C108780h();
                    this.f91389d = obj;
                }
            }
        }
        return (C108780h) obj;
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
        return Objects.equals(obj, FinderTeenModeChangeEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C108780h.class.getName();
    }
}
