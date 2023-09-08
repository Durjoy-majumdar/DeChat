package p442ar;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.CoreNetworkReadyEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ar.d */
public enum C28112d implements C38174i<C28111c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77512d;

    /* renamed from: ar.d$a */
    public static final class C28113a {

        /* renamed from: a */
        public static final List<Object> f77513a = null;

        static {
            f77513a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f77512d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77512d;
                if (obj == obj2) {
                    obj = new C28111c();
                    this.f77512d = obj;
                }
            }
        }
        return (C28111c) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C28113a.f77513a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, CoreNetworkReadyEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C28111c.class.getName();
    }
}
