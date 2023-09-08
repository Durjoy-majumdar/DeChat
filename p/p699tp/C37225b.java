package p699tp;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: tp.b */
public enum C37225b implements C38174i<C37222a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98522d;

    /* renamed from: tp.b$a */
    public static final class C37226a {

        /* renamed from: a */
        public static final List<Object> f98523a = null;

        static {
            f98523a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f98522d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98522d;
                if (obj == obj2) {
                    obj = new C37222a();
                    this.f98522d = obj;
                }
            }
        }
        return (C37222a) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C37226a.f98523a;
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
        return "provider " + C37222a.class.getName();
    }
}
