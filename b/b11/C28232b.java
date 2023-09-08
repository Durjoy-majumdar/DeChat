package b11;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: b11.b */
public enum C28232b implements C38174i<C28230a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77771d;

    /* renamed from: b11.b$a */
    public static final class C28233a {

        /* renamed from: a */
        public static final List<Object> f77772a = null;

        static {
            f77772a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f77771d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77771d;
                if (obj == obj2) {
                    obj = new C28230a();
                    this.f77771d = obj;
                }
            }
        }
        return (C28230a) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C28233a.f77772a;
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
        return "provider " + C28230a.class.getName();
    }
}
