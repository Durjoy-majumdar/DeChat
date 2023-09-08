package p600lu;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;
import yl0.C91483f;

/* renamed from: lu.e */
public enum C34364e implements C38174i<C34363d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92569d;

    /* renamed from: lu.e$a */
    public static final class C34365a {

        /* renamed from: a */
        public static final List<Object> f92570a = null;

        static {
            f92570a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f92569d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92569d;
                if (obj == obj2) {
                    obj = new C34363d();
                    this.f92569d = obj;
                }
            }
        }
        return (C34363d) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C34365a.f92570a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, Integer.valueOf(C91483f.CTRL_INDEX));
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C34363d.class.getName();
    }
}
