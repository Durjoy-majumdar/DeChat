package p678rq;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.SessionEdgeScriptChangeEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: rq.b */
public enum C36436b implements C38174i<C36435a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96946d;

    /* renamed from: rq.b$a */
    public static final class C36437a {

        /* renamed from: a */
        public static final List<Object> f96947a = null;

        static {
            f96947a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f96946d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96946d;
                if (obj == obj2) {
                    obj = new C36435a();
                    this.f96946d = obj;
                }
            }
        }
        return (C36435a) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C36437a.f96947a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, SessionEdgeScriptChangeEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C36435a.class.getName();
    }
}
