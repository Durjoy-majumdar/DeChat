package p665qq;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.ExptChangeEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: qq.d */
public enum C36047d implements C38174i<C36046c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96105d;

    /* renamed from: qq.d$a */
    public static final class C36048a {

        /* renamed from: a */
        public static final List<Object> f96106a = null;

        static {
            f96106a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f96105d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96105d;
                if (obj == obj2) {
                    obj = new C36046c();
                    this.f96105d = obj;
                }
            }
        }
        return (C36046c) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C36048a.f96106a;
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
        return "provider " + C36046c.class.getName();
    }
}
