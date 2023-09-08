package a61;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.CheckLanguageChangeEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: a61.f */
public enum C27759f implements C38174i<C27757e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f76802d;

    /* renamed from: a61.f$a */
    public static final class C27760a {

        /* renamed from: a */
        public static final List<Object> f76803a = null;

        static {
            f76803a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f76802d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f76802d;
                if (obj == obj2) {
                    obj = new C27757e();
                    this.f76802d = obj;
                }
            }
        }
        return (C27757e) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C27760a.f76803a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, CheckLanguageChangeEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C27757e.class.getName();
    }
}
