package pv2;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.DynamicConfigUpdatedEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: pv2.l */
public enum C35699l implements C38174i<C35698k> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95390d;

    /* renamed from: pv2.l$a */
    public static final class C35700a {

        /* renamed from: a */
        public static final List<Object> f95391a = null;

        static {
            f95391a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f95390d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95390d;
                if (obj == obj2) {
                    obj = new C35698k();
                    this.f95390d = obj;
                }
            }
        }
        return (C35698k) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C35700a.f95391a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, DynamicConfigUpdatedEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C35698k.class.getName();
    }
}
