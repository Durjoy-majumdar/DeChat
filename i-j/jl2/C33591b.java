package jl2;

import com.tencent.p014mm.autogen.events.CancelScanTranslationEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: jl2.b */
public enum C33591b implements C38174i<C98947a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90916d;

    public Object get() {
        Object obj = this.f90916d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90916d;
                if (obj == obj2) {
                    obj = new C98947a();
                    this.f90916d = obj;
                }
            }
        }
        return (C98947a) obj;
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
        return Objects.equals(obj, CancelScanTranslationEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C98947a.class.getName();
    }
}
