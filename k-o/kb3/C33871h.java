package kb3;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: kb3.h */
public enum C33871h implements C38174i<C46670g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91525d;

    /* renamed from: kb3.h$a */
    public static final class C33872a {

        /* renamed from: a */
        public static final List<Object> f91526a = null;

        static {
            f91526a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS});
        }
    }

    public Object get() {
        Object obj = this.f91525d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f91525d;
                if (obj == obj2) {
                    obj = new C46670g();
                    this.f91525d = obj;
                }
            }
        }
        return (C46670g) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C33872a.f91526a;
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
        return "provider " + C46670g.class.getName();
    }
}
