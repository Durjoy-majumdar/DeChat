package wm2;

import com.tencent.p014mm.autogen.events.ConfigUpdatedEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: wm2.c */
public enum C38235c implements C38174i<C38234b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f100963d;

    public Object get() {
        Object obj = this.f100963d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f100963d;
                if (obj == obj2) {
                    obj = new C38234b();
                    this.f100963d = obj;
                }
            }
        }
        return (C38234b) obj;
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
        return Objects.equals(obj, ConfigUpdatedEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C38234b.class.getName();
    }
}
