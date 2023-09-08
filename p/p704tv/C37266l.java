package p704tv;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: tv.l */
public enum C37266l implements C38174i<C37265k> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98610d;

    /* renamed from: tv.l$a */
    public static final class C37267a {

        /* renamed from: a */
        public static final List<Object> f98611a = null;

        static {
            f98611a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f98610d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98610d;
                if (obj == obj2) {
                    obj = new C37265k();
                    this.f98610d = obj;
                }
            }
        }
        return (C37265k) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C37267a.f98611a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, 453);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C37265k.class.getName();
    }
}
