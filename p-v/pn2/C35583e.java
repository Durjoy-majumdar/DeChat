package pn2;

import com.tencent.p014mm.autogen.events.MusicActionEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: pn2.e */
public enum C35583e implements C38174i<C100826d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95135d;

    public Object get() {
        Object obj = this.f95135d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95135d;
                if (obj == obj2) {
                    obj = new C100826d();
                    this.f95135d = obj;
                }
            }
        }
        return (C100826d) obj;
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
        return Objects.equals(obj, MusicActionEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C100826d.class.getName();
    }
}
