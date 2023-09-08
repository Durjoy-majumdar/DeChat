package pn2;

import com.tencent.p014mm.autogen.events.SwitcherEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: pn2.i */
public enum C35586i implements C38174i<C47513h> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95141d;

    public Object get() {
        Object obj = this.f95141d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95141d;
                if (obj == obj2) {
                    obj = new C47513h();
                    this.f95141d = obj;
                }
            }
        }
        return (C47513h) obj;
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
        return Objects.equals(obj, SwitcherEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C47513h.class.getName();
    }
}
