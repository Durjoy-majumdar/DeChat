package lg0;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.GetMFriendEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: lg0.n */
public enum C34248n implements C38174i<C10503m> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92345d;

    /* renamed from: lg0.n$a */
    public static final class C34249a {

        /* renamed from: a */
        public static final List<Object> f92346a = null;

        static {
            f92346a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f92345d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92345d;
                if (obj == obj2) {
                    obj = new C10503m();
                    this.f92345d = obj;
                }
            }
        }
        return (C10503m) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C34249a.f92346a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, GetMFriendEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C10503m.class.getName();
    }
}
