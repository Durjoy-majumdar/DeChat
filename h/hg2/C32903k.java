package hg2;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.RollbackTencentNewsEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: hg2.k */
public enum C32903k implements C38174i<C76192j> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f89451d;

    /* renamed from: hg2.k$a */
    public static final class C32904a {

        /* renamed from: a */
        public static final List<Object> f89452a = null;

        static {
            f89452a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f89451d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f89451d;
                if (obj == obj2) {
                    obj = new C76192j();
                    this.f89451d = obj;
                }
            }
        }
        return (C76192j) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C32904a.f89452a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, RollbackTencentNewsEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C76192j.class.getName();
    }
}
