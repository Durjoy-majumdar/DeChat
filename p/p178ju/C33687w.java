package p178ju;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ju.w */
public enum C33687w implements C38174i<C9527v> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91138d;

    /* renamed from: ju.w$a */
    public static final class C33688a {

        /* renamed from: a */
        public static final List<Object> f91139a = null;

        static {
            f91139a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f91138d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f91138d;
                if (obj == obj2) {
                    obj = new C9527v();
                    this.f91138d = obj;
                }
            }
        }
        return (C9527v) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C33688a.f91139a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "link_plain");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C9527v.class.getName();
    }
}
