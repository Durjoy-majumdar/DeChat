package p608mo;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.SetRecvTmpMsgOptionEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: mo.l */
public enum C34623l implements C38174i<C34622k> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93124d;

    /* renamed from: mo.l$a */
    public static final class C34624a {

        /* renamed from: a */
        public static final List<Object> f93125a = null;

        static {
            f93125a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f93124d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93124d;
                if (obj == obj2) {
                    obj = new C34622k();
                    this.f93124d = obj;
                }
            }
        }
        return (C34622k) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C34624a.f93125a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, SetRecvTmpMsgOptionEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C34622k.class.getName();
    }
}
