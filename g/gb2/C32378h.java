package gb2;

import com.tencent.p014mm.autogen.events.MusicPlayerEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: gb2.h */
public enum C32378h implements C38174i<C32377g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85916d;

    public Object get() {
        Object obj = this.f85916d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85916d;
                if (obj == obj2) {
                    obj = new C32377g();
                    this.f85916d = obj;
                }
            }
        }
        return (C32377g) obj;
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
        return Objects.equals(obj, MusicPlayerEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C32377g.class.getName();
    }
}
