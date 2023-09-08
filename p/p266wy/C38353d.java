package p266wy;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: wy.d */
public enum C38353d implements C38174i<C15603c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f101221d;

    /* renamed from: wy.d$a */
    public static final class C38354a {

        /* renamed from: a */
        public static final List<Object> f101222a = null;

        static {
            f101222a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f101221d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f101221d;
                if (obj == obj2) {
                    obj = new C15603c();
                    this.f101221d = obj;
                }
            }
        }
        return (C15603c) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C38354a.f101222a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "teenagermodeagreenauthorization");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C15603c.class.getName();
    }
}
