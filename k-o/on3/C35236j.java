package on3;

import com.tencent.p014mm.autogen.events.RevokeMsgEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: on3.j */
public enum C35236j implements C38174i<C35235i> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94446d;

    public Object get() {
        Object obj = this.f94446d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94446d;
                if (obj == obj2) {
                    obj = new C35235i();
                    this.f94446d = obj;
                }
            }
        }
        return (C35235i) obj;
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
        return Objects.equals(obj, RevokeMsgEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C35235i.class.getName();
    }
}
