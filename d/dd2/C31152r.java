package dd2;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.OmitAllFailSnsMsgEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: dd2.r */
public enum C31152r implements C38174i<C31151q> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f83515d;

    /* renamed from: dd2.r$a */
    public static final class C31153a {

        /* renamed from: a */
        public static final List<Object> f83516a = null;

        static {
            f83516a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f83515d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f83515d;
                if (obj == obj2) {
                    obj = new C31151q();
                    this.f83515d = obj;
                }
            }
        }
        return (C31151q) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C31153a.f83516a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, OmitAllFailSnsMsgEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C31151q.class.getName();
    }
}
