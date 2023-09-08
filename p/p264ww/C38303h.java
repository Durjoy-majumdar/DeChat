package p264ww;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ww.h */
public enum C38303h implements C38174i<C15596g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f101117d;

    /* renamed from: ww.h$a */
    public static final class C38304a {

        /* renamed from: a */
        public static final List<Object> f101118a = null;

        static {
            f101118a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f101117d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f101117d;
                if (obj == obj2) {
                    obj = new C15596g();
                    this.f101117d = obj;
                }
            }
        }
        return (C15596g) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C38304a.f101118a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, 575) || Objects.equals(obj, 576);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C15596g.class.getName();
    }
}
