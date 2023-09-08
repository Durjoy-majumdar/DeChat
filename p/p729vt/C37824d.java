package p729vt;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: vt.d */
public enum C37824d implements C38174i<C65877c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f100168d;

    /* renamed from: vt.d$a */
    public static final class C37825a {

        /* renamed from: a */
        public static final List<Object> f100169a = null;

        static {
            f100169a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f100168d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f100168d;
                if (obj == obj2) {
                    obj = new C65877c();
                    this.f100168d = obj;
                }
            }
        }
        return (C65877c) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C37825a.f100169a;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, C31607a.ASYNC);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C65877c.class.getName();
    }
}
