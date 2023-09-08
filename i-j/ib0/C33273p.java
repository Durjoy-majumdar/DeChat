package ib0;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.ActivateEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ib0.p */
public enum C33273p implements C38174i<C33272o> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90252d;

    /* renamed from: ib0.p$a */
    public static final class C33274a {

        /* renamed from: a */
        public static final List<Object> f90253a = null;

        static {
            f90253a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f90252d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90252d;
                if (obj == obj2) {
                    obj = new C33272o();
                    this.f90252d = obj;
                }
            }
        }
        return (C33272o) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C33274a.f90253a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, ActivateEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C33272o.class.getName();
    }
}
