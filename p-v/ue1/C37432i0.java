package ue1;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ue1.i0 */
public enum C37432i0 implements C38174i<C37431h0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98939d;

    public Object get() {
        Object obj = this.f98939d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98939d;
                if (obj == obj2) {
                    obj = new C37431h0();
                    this.f98939d = obj;
                }
            }
        }
        return (C37431h0) obj;
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
        return Objects.equals(obj, "mmfinder_globalpush_newxml");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C37431h0.class.getName();
    }
}
