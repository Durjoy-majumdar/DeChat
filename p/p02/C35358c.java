package p02;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: p02.c */
public enum C35358c implements C38174i<C35356b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94686d;

    /* renamed from: p02.c$a */
    public static final class C35359a {

        /* renamed from: a */
        public static final List<Object> f94687a = null;

        static {
            f94687a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f94686d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94686d;
                if (obj == obj2) {
                    obj = new C35356b();
                    this.f94686d = obj;
                }
            }
        }
        return (C35356b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C35359a.f94687a;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
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
        return "provider " + C35356b.class.getName();
    }
}
