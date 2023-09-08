package rx2;

import com.tencent.p014mm.autogen.events.TalkRoomServerEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: rx2.j */
public enum C36562j implements C38174i<C118251i> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f97245d;

    public Object get() {
        Object obj = this.f97245d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f97245d;
                if (obj == obj2) {
                    obj = new C118251i();
                    this.f97245d = obj;
                }
            }
        }
        return (C118251i) obj;
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
        return Objects.equals(obj, TalkRoomServerEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C118251i.class.getName();
    }
}
