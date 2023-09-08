package p222qm;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.AccountExpiredEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: qm.b */
public enum C35924b implements C38174i<C35920a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95826d;

    /* renamed from: qm.b$a */
    public static final class C35925a {

        /* renamed from: a */
        public static final List<Object> f95827a = null;

        static {
            f95827a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f95826d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95826d;
                if (obj == obj2) {
                    obj = new C35920a();
                    this.f95826d = obj;
                }
            }
        }
        return (C35920a) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C35925a.f95827a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, AccountExpiredEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C35920a.class.getName();
    }
}
