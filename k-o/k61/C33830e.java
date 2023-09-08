package k61;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: k61.e */
public enum C33830e implements C38174i<C33828d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91449d;

    /* renamed from: k61.e$a */
    public static final class C33831a {

        /* renamed from: a */
        public static final List<Object> f91450a = null;

        static {
            f91450a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f91449d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f91449d;
                if (obj == obj2) {
                    obj = new C33828d();
                    this.f91449d = obj;
                }
            }
        }
        return (C33828d) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C33831a.f91450a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "emotionstore");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C33828d.class.getName();
    }
}
