package pn1;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: pn1.f */
public enum C35573f implements C38174i<C35571e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95113d;

    /* renamed from: pn1.f$a */
    public static final class C35574a {

        /* renamed from: a */
        public static final List<Object> f95114a = null;

        static {
            f95114a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f95113d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95113d;
                if (obj == obj2) {
                    obj = new C35571e();
                    this.f95113d = obj;
                }
            }
        }
        return (C35571e) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C35574a.f95114a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "finderliveclosenotifymsg");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C35571e.class.getName();
    }
}
