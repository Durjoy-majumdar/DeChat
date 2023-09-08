package p340fm;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: fm.x */
public enum C32127x implements C38174i<C116887w> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85422d;

    /* renamed from: fm.x$a */
    public static final class C32128a {

        /* renamed from: a */
        public static final List<Object> f85423a = null;

        static {
            f85423a = Arrays.asList(new Object[]{C80625v0.MATCH_TOOLS});
        }
    }

    public Object get() {
        Object obj = this.f85422d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85422d;
                if (obj == obj2) {
                    obj = new C116887w();
                    this.f85422d = obj;
                }
            }
        }
        return (C116887w) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C32128a.f85423a;
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
        return "provider " + C116887w.class.getName();
    }
}
