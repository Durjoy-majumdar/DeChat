package p697tm;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.ExptChangeEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: tm.d1 */
public enum C37137d1 implements C38174i<C37133c1> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98345d;

    /* renamed from: tm.d1$a */
    public static final class C37138a {

        /* renamed from: a */
        public static final List<Object> f98346a = null;

        static {
            f98346a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f98345d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98345d;
                if (obj == obj2) {
                    obj = new C37133c1();
                    this.f98345d = obj;
                }
            }
        }
        return (C37133c1) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C37138a.f98346a;
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
        return "provider " + C37133c1.class.getName();
    }
}
