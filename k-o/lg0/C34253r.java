package lg0;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.SetLocalQQMobileEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: lg0.r */
public enum C34253r implements C38174i<C10504q> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92353d;

    /* renamed from: lg0.r$a */
    public static final class C34254a {

        /* renamed from: a */
        public static final List<Object> f92354a = null;

        static {
            f92354a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f92353d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92353d;
                if (obj == obj2) {
                    obj = new C10504q();
                    this.f92353d = obj;
                }
            }
        }
        return (C10504q) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C34254a.f92354a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, SetLocalQQMobileEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C10504q.class.getName();
    }
}
