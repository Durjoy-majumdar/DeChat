package p236sn;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: sn.p */
public enum C36734p implements C38174i<C13732o> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f97581d;

    /* renamed from: sn.p$a */
    public static final class C36735a {

        /* renamed from: a */
        public static final List<Object> f97582a = null;

        static {
            f97582a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f97581d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f97581d;
                if (obj == obj2) {
                    obj = new C13732o();
                    this.f97581d = obj;
                }
            }
        }
        return (C13732o) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C36735a.f97582a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "name_biz");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C13732o.class.getName();
    }
}
