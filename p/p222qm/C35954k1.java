package p222qm;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.SendAppMsgEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: qm.k1 */
public enum C35954k1 implements C38174i<C77365j1> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95893d;

    /* renamed from: qm.k1$a */
    public static final class C35955a {

        /* renamed from: a */
        public static final List<Object> f95894a = null;

        static {
            f95894a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f95893d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95893d;
                if (obj == obj2) {
                    obj = new C77365j1();
                    this.f95893d = obj;
                }
            }
        }
        return (C77365j1) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C35955a.f95894a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, SendAppMsgEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C77365j1.class.getName();
    }
}
