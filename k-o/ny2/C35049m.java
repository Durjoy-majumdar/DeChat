package ny2;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ny2.m */
public enum C35049m implements C38174i<C11316l> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94047d;

    /* renamed from: ny2.m$a */
    public static final class C35050a {

        /* renamed from: a */
        public static final List<Object> f94048a = null;

        static {
            f94048a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f94047d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94047d;
                if (obj == obj2) {
                    obj = new C11316l();
                    this.f94047d = obj;
                }
            }
        }
        return (C11316l) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C35050a.f94048a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, Integer.MAX_VALUE);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C11316l.class.getName();
    }
}
