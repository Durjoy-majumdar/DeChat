package qi2;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.RevokeMsgEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: qi2.j */
public enum C35900j implements C38174i<C35899i> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95790d;

    /* renamed from: qi2.j$a */
    public static final class C35901a {

        /* renamed from: a */
        public static final List<Object> f95791a = null;

        static {
            f95791a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f95790d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95790d;
                if (obj == obj2) {
                    obj = new C35899i();
                    this.f95790d = obj;
                }
            }
        }
        return (C35899i) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C35901a.f95791a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, RevokeMsgEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C35899i.class.getName();
    }
}
