package p352jz;

import com.tencent.p014mm.autogen.events.JSApiOpenSpecificViewEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: jz.g */
public enum C33799g implements C38174i<C46592f> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91386d;

    public Object get() {
        Object obj = this.f91386d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f91386d;
                if (obj == obj2) {
                    obj = new C46592f();
                    this.f91386d = obj;
                }
            }
        }
        return (C46592f) obj;
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
        return Objects.equals(obj, JSApiOpenSpecificViewEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C46592f.class.getName();
    }
}
