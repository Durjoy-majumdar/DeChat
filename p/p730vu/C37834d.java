package p730vu;

import com.tencent.p014mm.plugin.appbrand.jsapi.C1707k3;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1711l3;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: vu.d */
public enum C37834d implements C38174i<C37832c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f100184d;

    public Object get() {
        Object obj = this.f100184d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f100184d;
                if (obj == obj2) {
                    obj = new C37832c();
                    this.f100184d = obj;
                }
            }
        }
        return (C37832c) obj;
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
        return Objects.equals(obj, Integer.valueOf(C1707k3.CTRL_INDEX)) || Objects.equals(obj, Integer.valueOf(C1711l3.CTRL_INDEX)) || Objects.equals(obj, 987) || Objects.equals(obj, 986);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C37832c.class.getName();
    }
}
