package p219pm;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: pm.b */
public enum C35534b implements C38174i<C77109a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95017d;

    /* renamed from: pm.b$a */
    public static final class C35535a {

        /* renamed from: a */
        public static final List<Object> f95018a = null;

        static {
            f95018a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f95017d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95017d;
                if (obj == obj2) {
                    obj = new C77109a();
                    this.f95017d = obj;
                }
            }
        }
        return (C77109a) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C35535a.f95018a;
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
        return "provider " + C77109a.class.getName();
    }
}
