package ua1;

import com.tencent.p014mm.autogen.events.ExtStepCountEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ua1.d */
public enum C37360d implements C38174i<C37359c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98779d;

    public Object get() {
        Object obj = this.f98779d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98779d;
                if (obj == obj2) {
                    obj = new C37359c();
                    this.f98779d = obj;
                }
            }
        }
        return (C37359c) obj;
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
        return Objects.equals(obj, ExtStepCountEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C37359c.class.getName();
    }
}
