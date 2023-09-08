package p222qm;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.NotifyNewFriendRequestEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: qm.u0 */
public enum C35985u0 implements C38174i<C77366t0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95959d;

    /* renamed from: qm.u0$a */
    public static final class C35986a {

        /* renamed from: a */
        public static final List<Object> f95960a = null;

        static {
            f95960a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f95959d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95959d;
                if (obj == obj2) {
                    obj = new C77366t0();
                    this.f95959d = obj;
                }
            }
        }
        return (C77366t0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C35986a.f95960a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, NotifyNewFriendRequestEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C77366t0.class.getName();
    }
}
