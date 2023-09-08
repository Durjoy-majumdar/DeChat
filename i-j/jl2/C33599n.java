package jl2;

import com.tencent.p014mm.autogen.events.ScanTranslationEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: jl2.n */
public enum C33599n implements C38174i<C117359m> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90937d;

    public Object get() {
        Object obj = this.f90937d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90937d;
                if (obj == obj2) {
                    obj = new C117359m();
                    this.f90937d = obj;
                }
            }
        }
        return (C117359m) obj;
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
        return Objects.equals(obj, ScanTranslationEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C117359m.class.getName();
    }
}
