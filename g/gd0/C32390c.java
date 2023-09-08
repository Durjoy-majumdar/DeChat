package gd0;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.FMessageConversationStateOpEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: gd0.c */
public enum C32390c implements C38174i<C75904b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85939d;

    /* renamed from: gd0.c$a */
    public static final class C32391a {

        /* renamed from: a */
        public static final List<Object> f85940a = null;

        static {
            f85940a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f85939d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85939d;
                if (obj == obj2) {
                    obj = new C75904b();
                    this.f85939d = obj;
                }
            }
        }
        return (C75904b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C32391a.f85940a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, FMessageConversationStateOpEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C75904b.class.getName();
    }
}
