package xb3;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: xb3.j */
public enum C38482j implements C38174i<C15636i> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f101481d;

    /* renamed from: xb3.j$a */
    public static final class C38483a {

        /* renamed from: a */
        public static final List<Object> f101482a = null;

        static {
            f101482a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS});
        }
    }

    public Object get() {
        Object obj = this.f101481d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f101481d;
                if (obj == obj2) {
                    obj = new C15636i();
                    this.f101481d = obj;
                }
            }
        }
        return (C15636i) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C38483a.f101482a;
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
        return "provider " + C15636i.class.getName();
    }
}
