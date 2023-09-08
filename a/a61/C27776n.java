package a61;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.PostSyncTaskEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: a61.n */
public enum C27776n implements C38174i<C39496m> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f76842d;

    /* renamed from: a61.n$a */
    public static final class C27777a {

        /* renamed from: a */
        public static final List<Object> f76843a = null;

        static {
            f76843a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f76842d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f76842d;
                if (obj == obj2) {
                    obj = new C39496m();
                    this.f76842d = obj;
                }
            }
        }
        return (C39496m) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C27777a.f76843a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, PostSyncTaskEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C39496m.class.getName();
    }
}
