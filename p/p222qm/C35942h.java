package p222qm;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.CreateOrJoinChatroomEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: qm.h */
public enum C35942h implements C38174i<C89709g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95868d;

    /* renamed from: qm.h$a */
    public static final class C35943a {

        /* renamed from: a */
        public static final List<Object> f95869a = null;

        static {
            f95869a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f95868d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95868d;
                if (obj == obj2) {
                    obj = new C89709g();
                    this.f95868d = obj;
                }
            }
        }
        return (C89709g) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C35943a.f95869a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, CreateOrJoinChatroomEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C89709g.class.getName();
    }
}
