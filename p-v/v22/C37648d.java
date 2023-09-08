package v22;

import com.tencent.p014mm.autogen.events.ExitTrackRoomEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: v22.d */
public enum C37648d implements C38174i<C78320c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f99794d;

    public Object get() {
        Object obj = this.f99794d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f99794d;
                if (obj == obj2) {
                    obj = new C78320c();
                    this.f99794d = obj;
                }
            }
        }
        return (C78320c) obj;
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
        return Objects.equals(obj, ExitTrackRoomEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C78320c.class.getName();
    }
}
