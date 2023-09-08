package p222qm;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.LogoutEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: qm.s0 */
public enum C35978s0 implements C38174i<C89713r0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95945d;

    /* renamed from: qm.s0$a */
    public static final class C35979a {

        /* renamed from: a */
        public static final List<Object> f95946a = null;

        static {
            f95946a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f95945d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95945d;
                if (obj == obj2) {
                    obj = new C89713r0();
                    this.f95945d = obj;
                }
            }
        }
        return (C89713r0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C35979a.f95946a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, LogoutEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C89713r0.class.getName();
    }
}
