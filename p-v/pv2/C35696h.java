package pv2;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.GetIsSupportSoterEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: pv2.h */
public enum C35696h implements C38174i<C12020g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95386d;

    /* renamed from: pv2.h$a */
    public static final class C35697a {

        /* renamed from: a */
        public static final List<Object> f95387a = null;

        static {
            f95387a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f95386d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95386d;
                if (obj == obj2) {
                    obj = new C12020g();
                    this.f95386d = obj;
                }
            }
        }
        return (C12020g) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C35697a.f95387a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, GetIsSupportSoterEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C12020g.class.getName();
    }
}
