package lg0;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.GetContactUsernameByMobileEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: lg0.p */
public enum C34251p implements C38174i<C34250o> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92349d;

    /* renamed from: lg0.p$a */
    public static final class C34252a {

        /* renamed from: a */
        public static final List<Object> f92350a = null;

        static {
            f92350a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f92349d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92349d;
                if (obj == obj2) {
                    obj = new C34250o();
                    this.f92349d = obj;
                }
            }
        }
        return (C34250o) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C34252a.f92350a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, GetContactUsernameByMobileEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C34250o.class.getName();
    }
}
