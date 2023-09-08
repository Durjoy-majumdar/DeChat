package p697tm;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.LogoutEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: tm.j1 */
public enum C37155j1 implements C38174i<C90521i1> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98387d;

    /* renamed from: tm.j1$a */
    public static final class C37156a {

        /* renamed from: a */
        public static final List<Object> f98388a = null;

        static {
            f98388a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f98387d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98387d;
                if (obj == obj2) {
                    obj = new C90521i1();
                    this.f98387d = obj;
                }
            }
        }
        return (C90521i1) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C37156a.f98388a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, LogoutEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C90521i1.class.getName();
    }
}
