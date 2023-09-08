package l33;

import com.tencent.p014mm.autogen.events.VoipEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: l33.i */
public enum C34177i implements C38174i<C109253h> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92188d;

    public Object get() {
        Object obj = this.f92188d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92188d;
                if (obj == obj2) {
                    obj = new C109253h();
                    this.f92188d = obj;
                }
            }
        }
        return (C109253h) obj;
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
        return Objects.equals(obj, VoipEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C109253h.class.getName();
    }
}
