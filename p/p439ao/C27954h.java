package p439ao;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ao.h */
public enum C27954h implements C38174i<C27952g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77184d;

    /* renamed from: ao.h$a */
    public static final class C27955a {

        /* renamed from: a */
        public static final List<Object> f77185a = null;

        static {
            f77185a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f77184d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77184d;
                if (obj == obj2) {
                    obj = new C27952g();
                    this.f77184d = obj;
                }
            }
        }
        return (C27952g) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C27955a.f77185a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "MMBizPaySubscribePayNotify");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C27952g.class.getName();
    }
}
