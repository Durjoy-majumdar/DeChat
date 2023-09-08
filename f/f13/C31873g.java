package f13;

import com.tencent.p014mm.autogen.events.TranslateMessageQueryStatusEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: f13.g */
public enum C31873g implements C38174i<C75670f> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84942d;

    public Object get() {
        Object obj = this.f84942d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84942d;
                if (obj == obj2) {
                    obj = new C75670f();
                    this.f84942d = obj;
                }
            }
        }
        return (C75670f) obj;
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
        return Objects.equals(obj, TranslateMessageQueryStatusEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C75670f.class.getName();
    }
}
