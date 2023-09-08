package p704tv;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.GetOpenImUrlEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: tv.j */
public enum C37263j implements C38174i<C37262i> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98606d;

    /* renamed from: tv.j$a */
    public static final class C37264a {

        /* renamed from: a */
        public static final List<Object> f98607a = null;

        static {
            f98607a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f98606d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98606d;
                if (obj == obj2) {
                    obj = new C37262i();
                    this.f98606d = obj;
                }
            }
        }
        return (C37262i) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C37264a.f98607a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, GetOpenImUrlEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C37262i.class.getName();
    }
}
