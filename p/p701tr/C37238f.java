package p701tr;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: tr.f */
public enum C37238f implements C38174i<C37237e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98549d;

    /* renamed from: tr.f$a */
    public static final class C37239a {

        /* renamed from: a */
        public static final List<Object> f98550a = null;

        static {
            f98550a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f98549d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98549d;
                if (obj == obj2) {
                    obj = new C37237e();
                    this.f98549d = obj;
                }
            }
        }
        return (C37237e) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C37239a.f98550a;
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
        return "provider " + C37237e.class.getName();
    }
}
