package h72;

import com.tencent.p014mm.autogen.events.SnsGetVideoThumbEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: h72.d */
public enum C32728d implements C38174i<C76145c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f86806d;

    public Object get() {
        Object obj = this.f86806d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f86806d;
                if (obj == obj2) {
                    obj = new C76145c();
                    this.f86806d = obj;
                }
            }
        }
        return (C76145c) obj;
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
        return Objects.equals(obj, SnsGetVideoThumbEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C76145c.class.getName();
    }
}
