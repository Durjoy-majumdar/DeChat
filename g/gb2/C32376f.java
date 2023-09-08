package gb2;

import com.tencent.p014mm.autogen.events.MusicPlayerEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: gb2.f */
public enum C32376f implements C38174i<C8258e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85913d;

    public Object get() {
        Object obj = this.f85913d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85913d;
                if (obj == obj2) {
                    obj = new C8258e();
                    this.f85913d = obj;
                }
            }
        }
        return (C8258e) obj;
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
        return "provider " + C8258e.class.getName();
    }
}
