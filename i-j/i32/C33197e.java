package i32;

import com.tencent.p014mm.autogen.events.ChattingUIExitBeginForPayEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: i32.e */
public enum C33197e implements C38174i<C33196d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90088d;

    public Object get() {
        Object obj = this.f90088d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90088d;
                if (obj == obj2) {
                    obj = new C33196d();
                    this.f90088d = obj;
                }
            }
        }
        return (C33196d) obj;
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
        return Objects.equals(obj, ChattingUIExitBeginForPayEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C33196d.class.getName();
    }
}
