package c11;

import com.tencent.p014mm.autogen.events.InitEndEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: c11.f */
public enum C28468f implements C38174i<C28467e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f78254d;

    public Object get() {
        Object obj = this.f78254d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f78254d;
                if (obj == obj2) {
                    obj = new C28467e();
                    this.f78254d = obj;
                }
            }
        }
        return (C28467e) obj;
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
        return Objects.equals(obj, InitEndEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C28467e.class.getName();
    }
}
