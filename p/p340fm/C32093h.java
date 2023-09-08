package p340fm;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.ExptChangeEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: fm.h */
public enum C32093h implements C38174i<C32091g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85354d;

    /* renamed from: fm.h$a */
    public static final class C32094a {

        /* renamed from: a */
        public static final List<Object> f85355a = null;

        static {
            f85355a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f85354d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85354d;
                if (obj == obj2) {
                    obj = new C32091g();
                    this.f85354d = obj;
                }
            }
        }
        return (C32091g) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("onProcess".equals(str)) {
            return C32094a.f85355a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, ExptChangeEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C32091g.class.getName();
    }
}
