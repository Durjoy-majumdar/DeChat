package p678rq;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.NewEdgeScriptDeleteEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: rq.l */
public enum C36448l implements C38174i<C36447k> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96972d;

    /* renamed from: rq.l$a */
    public static final class C36449a {

        /* renamed from: a */
        public static final List<Object> f96973a = null;

        static {
            f96973a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f96972d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96972d;
                if (obj == obj2) {
                    obj = new C36447k();
                    this.f96972d = obj;
                }
            }
        }
        return (C36447k) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C36449a.f96973a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, NewEdgeScriptDeleteEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C36447k.class.getName();
    }
}
