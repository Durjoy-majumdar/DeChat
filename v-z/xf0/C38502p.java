package xf0;

import com.tencent.p014mm.autogen.events.ReceiveAANewXmlEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: xf0.p */
public enum C38502p implements C38174i<C38501o> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f101529d;

    public Object get() {
        Object obj = this.f101529d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f101529d;
                if (obj == obj2) {
                    obj = new C38501o();
                    this.f101529d = obj;
                }
            }
        }
        return (C38501o) obj;
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
        return Objects.equals(obj, ReceiveAANewXmlEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C38501o.class.getName();
    }
}
