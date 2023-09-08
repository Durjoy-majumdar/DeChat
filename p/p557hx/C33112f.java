package p557hx;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.ExptChangeEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: hx.f */
public enum C33112f implements C38174i<C33111e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f89905d;

    /* renamed from: hx.f$a */
    public static final class C33113a {

        /* renamed from: a */
        public static final List<Object> f89906a = null;

        static {
            f89906a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f89905d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f89905d;
                if (obj == obj2) {
                    obj = new C33111e();
                    this.f89905d = obj;
                }
            }
        }
        return (C33111e) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C33113a.f89906a;
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
        return "provider " + C33111e.class.getName();
    }
}
