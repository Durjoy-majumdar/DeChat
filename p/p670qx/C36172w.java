package p670qx;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.OnPrivacyPolicyAgreedEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: qx.w */
public enum C36172w implements C38174i<C36171v> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96362d;

    /* renamed from: qx.w$a */
    public static final class C36173a {

        /* renamed from: a */
        public static final List<Object> f96363a = null;

        static {
            f96363a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f96362d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96362d;
                if (obj == obj2) {
                    obj = new C36171v();
                    this.f96362d = obj;
                }
            }
        }
        return (C36171v) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C36173a.f96363a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, OnPrivacyPolicyAgreedEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C36171v.class.getName();
    }
}
