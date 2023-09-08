package p776zm;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;
import ul0.C90694b;

/* renamed from: zm.j */
public enum C39391j implements C38174i<C53796i> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105839d;

    /* renamed from: zm.j$a */
    public static final class C39392a {

        /* renamed from: a */
        public static final List<Object> f105840a = null;

        static {
            f105840a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f105839d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f105839d;
                if (obj == obj2) {
                    obj = new C53796i();
                    this.f105839d = obj;
                }
            }
        }
        return (C53796i) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C39392a.f105840a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, Integer.valueOf(C90694b.CTRL_INDEX));
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C53796i.class.getName();
    }
}
