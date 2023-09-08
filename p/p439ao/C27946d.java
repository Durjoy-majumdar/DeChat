package p439ao;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ao.d */
public enum C27946d implements C38174i<C27944c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77173d;

    /* renamed from: ao.d$a */
    public static final class C27947a {

        /* renamed from: a */
        public static final List<Object> f77174a = null;

        static {
            f77174a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f77173d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77173d;
                if (obj == obj2) {
                    obj = new C27944c();
                    this.f77173d = obj;
                }
            }
        }
        return (C27944c) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C27947a.f77174a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "bizlivenotify");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C27944c.class.getName();
    }
}
