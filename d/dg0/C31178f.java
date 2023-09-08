package dg0;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: dg0.f */
public enum C31178f implements C38174i<C75398e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f83565d;

    /* renamed from: dg0.f$a */
    public static final class C31179a {

        /* renamed from: a */
        public static final List<Object> f83566a = null;

        static {
            f83566a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f83565d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f83565d;
                if (obj == obj2) {
                    obj = new C75398e();
                    this.f83565d = obj;
                }
            }
        }
        return (C75398e) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C31179a.f83566a;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, C31607a.ASYNC);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C75398e.class.getName();
    }
}
