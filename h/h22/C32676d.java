package h22;

import com.tencent.p014mm.autogen.events.BypNotifyActionEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: h22.d */
public enum C32676d implements C38174i<C32675c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f86699d;

    public Object get() {
        Object obj = this.f86699d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f86699d;
                if (obj == obj2) {
                    obj = new C32675c();
                    this.f86699d = obj;
                }
            }
        }
        return (C32675c) obj;
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
        return Objects.equals(obj, BypNotifyActionEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C32675c.class.getName();
    }
}
