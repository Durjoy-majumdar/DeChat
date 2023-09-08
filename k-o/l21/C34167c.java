package l21;

import com.tencent.p014mm.autogen.events.VoipCallEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: l21.c */
public enum C34167c implements C38174i<C88371b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92164d;

    public Object get() {
        Object obj = this.f92164d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92164d;
                if (obj == obj2) {
                    obj = new C88371b();
                    this.f92164d = obj;
                }
            }
        }
        return (C88371b) obj;
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
        return Objects.equals(obj, VoipCallEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C88371b.class.getName();
    }
}
