package p340fm;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.FindMoreFriendEntryRedDotEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: fm.p */
public enum C32112p implements C38174i<C32110o> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85394d;

    /* renamed from: fm.p$a */
    public static final class C32113a {

        /* renamed from: a */
        public static final List<Object> f85395a = null;

        static {
            f85395a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f85394d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85394d;
                if (obj == obj2) {
                    obj = new C32110o();
                    this.f85394d = obj;
                }
            }
        }
        return (C32110o) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("onProcess".equals(str)) {
            return C32113a.f85395a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, FindMoreFriendEntryRedDotEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C32110o.class.getName();
    }
}
