package p678rq;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.SessionEdgeSqlChangeEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: rq.d */
public enum C36439d implements C38174i<C36438c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96950d;

    /* renamed from: rq.d$a */
    public static final class C36440a {

        /* renamed from: a */
        public static final List<Object> f96951a = null;

        static {
            f96951a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f96950d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96950d;
                if (obj == obj2) {
                    obj = new C36438c();
                    this.f96950d = obj;
                }
            }
        }
        return (C36438c) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C36440a.f96951a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, SessionEdgeSqlChangeEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C36438c.class.getName();
    }
}
