package p198lt;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: lt.c */
public enum C34358c implements C38174i<C10651b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92556d;

    /* renamed from: lt.c$a */
    public static final class C34359a {

        /* renamed from: a */
        public static final List<Object> f92557a = null;

        static {
            f92557a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND});
        }
    }

    public Object get() {
        Object obj = this.f92556d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92556d;
                if (obj == obj2) {
                    obj = new C10651b();
                    this.f92556d = obj;
                }
            }
        }
        return (C10651b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C34359a.f92557a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return false;
    }

    public boolean hasNoKeys() {
        return true;
    }

    public String toString() {
        return "provider " + C10651b.class.getName();
    }
}
