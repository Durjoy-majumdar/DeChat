package p697tm;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: tm.j0 */
public enum C37153j0 implements C38174i<C118491i0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98383d;

    /* renamed from: tm.j0$a */
    public static final class C37154a {

        /* renamed from: a */
        public static final List<Object> f98384a = null;

        static {
            f98384a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f98383d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98383d;
                if (obj == obj2) {
                    obj = new C118491i0();
                    this.f98383d = obj;
                }
            }
        }
        return (C118491i0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C37154a.f98384a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return false;
    }

    public boolean hasNoKeys() {
        return true;
    }

    public String toString() {
        return "provider " + C118491i0.class.getName();
    }
}
