package p579jt;

import com.tencent.p014mm.autogen.events.SendImageMsgEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: jt.c */
public enum C33661c implements C38174i<C76449b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91080d;

    public Object get() {
        Object obj = this.f91080d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f91080d;
                if (obj == obj2) {
                    obj = new C76449b();
                    this.f91080d = obj;
                }
            }
        }
        return (C76449b) obj;
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
        return Objects.equals(obj, SendImageMsgEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C76449b.class.getName();
    }
}
