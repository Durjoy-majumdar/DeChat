package q71;

import com.tencent.p014mm.autogen.events.ExDeviceUploadXlogEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: q71.p */
public enum C35789p implements C38174i<C35788o> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95575d;

    public Object get() {
        Object obj = this.f95575d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95575d;
                if (obj == obj2) {
                    obj = new C35788o();
                    this.f95575d = obj;
                }
            }
        }
        return (C35788o) obj;
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
        return Objects.equals(obj, ExDeviceUploadXlogEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C35788o.class.getName();
    }
}
