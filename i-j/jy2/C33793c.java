package jy2;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: jy2.c */
public enum C33793c implements C38174i<C33792b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91370d;

    /* renamed from: jy2.c$a */
    public static final class C33794a {

        /* renamed from: a */
        public static final List<Object> f91371a = null;

        static {
            f91371a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND});
        }
    }

    public Object get() {
        Object obj = this.f91370d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f91370d;
                if (obj == obj2) {
                    obj = new C33792b();
                    this.f91370d = obj;
                }
            }
        }
        return (C33792b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C33794a.f91371a;
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
        return "provider " + C33792b.class.getName();
    }
}
