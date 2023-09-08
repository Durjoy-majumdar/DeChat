package p665qq;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.ManualAuthEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: qq.p */
public enum C36062p implements C38174i<C36061o> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96135d;

    /* renamed from: qq.p$a */
    public static final class C36063a {

        /* renamed from: a */
        public static final List<Object> f96136a = null;

        static {
            f96136a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f96135d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96135d;
                if (obj == obj2) {
                    obj = new C36061o();
                    this.f96135d = obj;
                }
            }
        }
        return (C36061o) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C36063a.f96136a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, ManualAuthEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C36061o.class.getName();
    }
}
