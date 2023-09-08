package gz0;

import com.tencent.p014mm.autogen.events.GiftCardEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: gz0.w */
public enum C32630w implements C38174i<C87414v> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f86620d;

    public Object get() {
        Object obj = this.f86620d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f86620d;
                if (obj == obj2) {
                    obj = new C87414v();
                    this.f86620d = obj;
                }
            }
        }
        return (C87414v) obj;
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
        return Objects.equals(obj, GiftCardEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C87414v.class.getName();
    }
}
