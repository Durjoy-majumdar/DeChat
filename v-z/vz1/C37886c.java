package vz1;

import com.tencent.p014mm.autogen.events.NotifyGroupSolitatireEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: vz1.c */
public enum C37886c implements C38174i<C78499b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f100285d;

    public Object get() {
        Object obj = this.f100285d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f100285d;
                if (obj == obj2) {
                    obj = new C78499b();
                    this.f100285d = obj;
                }
            }
        }
        return (C78499b) obj;
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
        return Objects.equals(obj, NotifyGroupSolitatireEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C78499b.class.getName();
    }
}
