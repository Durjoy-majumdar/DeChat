package tg1;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.FinderLiveTipsBarEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;
import tg1.C37095e;

/* renamed from: tg1.j */
public enum C37109j implements C38174i<C37095e.C37100e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98294d;

    /* renamed from: tg1.j$a */
    public static final class C37110a {

        /* renamed from: a */
        public static final List<Object> f98295a = null;

        static {
            f98295a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f98294d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98294d;
                if (obj == obj2) {
                    obj = new C37095e.C37100e();
                    this.f98294d = obj;
                }
            }
        }
        return (C37095e.C37100e) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C37110a.f98295a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, FinderLiveTipsBarEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C37095e.C37100e.class.getName();
    }
}
