package d01;

import com.tencent.p014mm.autogen.events.BannerOnInitEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: d01.b */
public enum C31035b implements C38174i<C75318a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f83263d;

    public Object get() {
        Object obj = this.f83263d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f83263d;
                if (obj == obj2) {
                    obj = new C75318a();
                    this.f83263d = obj;
                }
            }
        }
        return (C75318a) obj;
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
        return Objects.equals(obj, BannerOnInitEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C75318a.class.getName();
    }
}
