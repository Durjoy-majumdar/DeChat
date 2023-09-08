package u22;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: u22.e */
public enum C37327e implements C38174i<C37326d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98725d;

    /* renamed from: u22.e$a */
    public static final class C37328a {

        /* renamed from: a */
        public static final List<Object> f98726a = null;

        static {
            f98726a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f98725d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98725d;
                if (obj == obj2) {
                    obj = new C37326d();
                    this.f98725d = obj;
                }
            }
        }
        return (C37326d) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C37328a.f98726a;
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
        return "provider " + C37326d.class.getName();
    }
}
