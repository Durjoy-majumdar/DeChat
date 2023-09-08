package p521fn;

import com.tencent.p014mm.autogen.events.ResendVoiceMsgEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: fn.c */
public enum C32138c implements C38174i<C75777b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85451d;

    public Object get() {
        Object obj = this.f85451d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85451d;
                if (obj == obj2) {
                    obj = new C75777b();
                    this.f85451d = obj;
                }
            }
        }
        return (C75777b) obj;
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
        return Objects.equals(obj, ResendVoiceMsgEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C75777b.class.getName();
    }
}
