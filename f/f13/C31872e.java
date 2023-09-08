package f13;

import com.tencent.p014mm.autogen.events.TranslateMessageEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: f13.e */
public enum C31872e implements C38174i<C31871d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84939d;

    public Object get() {
        Object obj = this.f84939d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84939d;
                if (obj == obj2) {
                    obj = new C31871d();
                    this.f84939d = obj;
                }
            }
        }
        return (C31871d) obj;
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
        return Objects.equals(obj, TranslateMessageEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C31871d.class.getName();
    }
}
