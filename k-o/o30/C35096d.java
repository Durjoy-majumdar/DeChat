package o30;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: o30.d */
public enum C35096d implements C38174i<C76985c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94164d;

    /* renamed from: o30.d$a */
    public static final class C35097a {

        /* renamed from: a */
        public static final List<Object> f94165a = null;

        static {
            f94165a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f94164d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94164d;
                if (obj == obj2) {
                    obj = new C76985c();
                    this.f94164d = obj;
                }
            }
        }
        return (C76985c) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        if ("onProcess".equals(str)) {
            return C35097a.f94165a;
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
        return "provider " + C76985c.class.getName();
    }
}
