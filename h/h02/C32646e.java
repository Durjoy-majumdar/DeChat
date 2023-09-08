package h02;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: h02.e */
public enum C32646e implements C38174i<C87416d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f86649d;

    /* renamed from: h02.e$a */
    public static final class C32647a {

        /* renamed from: a */
        public static final List<Object> f86650a = null;

        static {
            f86650a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f86649d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f86649d;
                if (obj == obj2) {
                    obj = new C87416d();
                    this.f86649d = obj;
                }
            }
        }
        return (C87416d) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        if ("onProcess".equals(str)) {
            return C32647a.f86650a;
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
        return "provider " + C87416d.class.getName();
    }
}
