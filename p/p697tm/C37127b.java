package p697tm;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: tm.b */
public enum C37127b implements C38174i<C37125a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98324d;

    /* renamed from: tm.b$a */
    public static final class C37128a {

        /* renamed from: a */
        public static final List<Object> f98325a = null;

        static {
            f98325a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f98324d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98324d;
                if (obj == obj2) {
                    obj = new C37125a();
                    this.f98324d = obj;
                }
            }
        }
        return (C37125a) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C37128a.f98325a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "name_wxa");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C37125a.class.getName();
    }
}
