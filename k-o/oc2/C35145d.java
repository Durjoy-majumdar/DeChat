package oc2;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: oc2.d */
public enum C35145d implements C38174i<C47363c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94263d;

    /* renamed from: oc2.d$a */
    public static final class C35146a {

        /* renamed from: a */
        public static final List<Object> f94264a = null;

        static {
            f94264a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f94263d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94263d;
                if (obj == obj2) {
                    obj = new C47363c();
                    this.f94263d = obj;
                }
            }
        }
        return (C47363c) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C35146a.f94264a;
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
        return "provider " + C47363c.class.getName();
    }
}
