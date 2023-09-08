package p670qx;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.ActivateEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: qx.q */
public enum C36163q implements C38174i<C36162p> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96350d;

    /* renamed from: qx.q$a */
    public static final class C36164a {

        /* renamed from: a */
        public static final List<Object> f96351a = null;

        static {
            f96351a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f96350d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96350d;
                if (obj == obj2) {
                    obj = new C36162p();
                    this.f96350d = obj;
                }
            }
        }
        return (C36162p) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C36164a.f96351a;
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
        return "provider " + C36162p.class.getName();
    }
}
