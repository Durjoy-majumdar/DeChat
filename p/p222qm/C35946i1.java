package p222qm;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.SDKOpenWebviewEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: qm.i1 */
public enum C35946i1 implements C38174i<C89710h1> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95878d;

    /* renamed from: qm.i1$a */
    public static final class C35947a {

        /* renamed from: a */
        public static final List<Object> f95879a = null;

        static {
            f95879a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f95878d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95878d;
                if (obj == obj2) {
                    obj = new C89710h1();
                    this.f95878d = obj;
                }
            }
        }
        return (C89710h1) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C35947a.f95879a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, SDKOpenWebviewEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C89710h1.class.getName();
    }
}
