package pu0;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: pu0.c */
public enum C35684c implements C38174i<C110248b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95360d;

    /* renamed from: pu0.c$a */
    public static final class C35685a {

        /* renamed from: a */
        public static final List<Object> f95361a = null;

        static {
            f95361a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND});
        }
    }

    public Object get() {
        Object obj = this.f95360d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95360d;
                if (obj == obj2) {
                    obj = new C110248b();
                    this.f95360d = obj;
                }
            }
        }
        return (C110248b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C35685a.f95361a;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, C31607a.ON_SPLASH);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C110248b.class.getName();
    }
}
