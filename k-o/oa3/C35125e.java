package oa3;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

/* renamed from: oa3.e */
public enum C35125e implements C38174i<C35123d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94221d;

    /* renamed from: oa3.e$a */
    public static final class C35126a {

        /* renamed from: a */
        public static final List<Object> f94222a = null;

        static {
            f94222a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f94221d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94221d;
                if (obj == obj2) {
                    obj = new C35123d();
                    this.f94221d = obj;
                }
            }
        }
        return (C35123d) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        if ("onProcess".equals(str)) {
            return C35126a.f94222a;
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
        return "provider " + C35123d.class.getName();
    }
}
