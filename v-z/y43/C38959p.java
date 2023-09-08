package y43;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.GetFTFNecessaryElementsEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: y43.p */
public enum C38959p implements C38174i<C79035o> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f104971d;

    /* renamed from: y43.p$a */
    public static final class C38960a {

        /* renamed from: a */
        public static final List<Object> f104972a = null;

        static {
            f104972a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f104971d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f104971d;
                if (obj == obj2) {
                    obj = new C79035o();
                    this.f104971d = obj;
                }
            }
        }
        return (C79035o) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C38960a.f104972a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, GetFTFNecessaryElementsEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C79035o.class.getName();
    }
}
