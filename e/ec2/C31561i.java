package ec2;

import com.tencent.p014mm.autogen.events.LbsroomLogicEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ec2.i */
public enum C31561i implements C38174i<C75606h> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84361d;

    public Object get() {
        Object obj = this.f84361d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84361d;
                if (obj == obj2) {
                    obj = new C75606h();
                    this.f84361d = obj;
                }
            }
        }
        return (C75606h) obj;
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
        return Objects.equals(obj, LbsroomLogicEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C75606h.class.getName();
    }
}
