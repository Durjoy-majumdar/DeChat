package v22;

import com.tencent.p014mm.autogen.events.LocServForNoteEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: v22.q */
public enum C37660q implements C38174i<C37659p> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f99824d;

    public Object get() {
        Object obj = this.f99824d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f99824d;
                if (obj == obj2) {
                    obj = new C37659p();
                    this.f99824d = obj;
                }
            }
        }
        return (C37659p) obj;
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
        return Objects.equals(obj, LocServForNoteEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C37659p.class.getName();
    }
}
