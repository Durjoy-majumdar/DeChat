package hh0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: hh0.g */
public enum C32914g implements C38174i<C20942f> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f89489d;

    /* renamed from: hh0.g$a */
    public static final class C32915a {

        /* renamed from: a */
        public static final List<Object> f89490a = null;

        static {
            f89490a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS});
        }
    }

    public Object get() {
        Object obj = this.f89489d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f89489d;
                if (obj == obj2) {
                    obj = new C20942f();
                    this.f89489d = obj;
                }
            }
        }
        return (C20942f) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        if ("onProcess".equals(str)) {
            return C32915a.f89490a;
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
        return "provider " + C20942f.class.getName();
    }
}
