package d21;

import com.tencent.p014mm.autogen.events.AppActiveEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: d21.b */
public enum C31052b implements C38174i<C31051a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f83293d;

    public Object get() {
        Object obj = this.f83293d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f83293d;
                if (obj == obj2) {
                    obj = new C31051a();
                    this.f83293d = obj;
                }
            }
        }
        return (C31051a) obj;
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
        return Objects.equals(obj, AppActiveEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C31051a.class.getName();
    }
}
