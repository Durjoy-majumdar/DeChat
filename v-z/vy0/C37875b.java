package vy0;

import com.tencent.p014mm.autogen.events.BypNewSyncEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: vy0.b */
public enum C37875b implements C38174i<C37874a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f100257d;

    public Object get() {
        Object obj = this.f100257d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f100257d;
                if (obj == obj2) {
                    obj = new C37874a();
                    this.f100257d = obj;
                }
            }
        }
        return (C37874a) obj;
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
        return Objects.equals(obj, BypNewSyncEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C37874a.class.getName();
    }
}
