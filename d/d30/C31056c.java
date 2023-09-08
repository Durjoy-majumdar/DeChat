package d30;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: d30.c */
public enum C31056c implements C38174i<C86168b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f83303d;

    /* renamed from: d30.c$a */
    public static final class C31057a {

        /* renamed from: a */
        public static final List<Object> f83304a = null;

        static {
            f83304a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f83303d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f83303d;
                if (obj == obj2) {
                    obj = new C86168b();
                    this.f83303d = obj;
                }
            }
        }
        return (C86168b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        if ("onProcess".equals(str)) {
            return C31057a.f83304a;
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
        return "provider " + C86168b.class.getName();
    }
}
