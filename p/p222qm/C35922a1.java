package p222qm;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.ResetBadgeCountEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: qm.a1 */
public enum C35922a1 implements C38174i<C36002z0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95822d;

    /* renamed from: qm.a1$a */
    public static final class C35923a {

        /* renamed from: a */
        public static final List<Object> f95823a = null;

        static {
            f95823a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f95822d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95822d;
                if (obj == obj2) {
                    obj = new C36002z0();
                    this.f95822d = obj;
                }
            }
        }
        return (C36002z0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C35923a.f95823a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, ResetBadgeCountEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C36002z0.class.getName();
    }
}
