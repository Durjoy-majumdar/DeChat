package tc0;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C1805j;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;
import tc0.C77885p;

/* renamed from: tc0.q */
public enum C37010q implements C38174i<C77885p> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98125d;

    /* renamed from: tc0.q$a */
    public static final class C37011a {

        /* renamed from: a */
        public static final List<Object> f98126a = null;

        static {
            f98126a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f98125d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98125d;
                if (obj == obj2) {
                    obj = C77885p.C37009c.f98122a;
                    this.f98125d = obj;
                }
            }
        }
        return (C77885p) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return C77885p.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("onProcess".equals(str)) {
            return C37011a.f98126a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, Integer.valueOf(C1805j.CTRL_INDEX)) || Objects.equals(obj, 806);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C77885p.class.getName();
    }
}
