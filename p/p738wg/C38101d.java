package p738wg;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.ExtNetSceneSendMsgEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: wg.d */
public enum C38101d implements C38174i<C102435c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f100704d;

    /* renamed from: wg.d$a */
    public static final class C38102a {

        /* renamed from: a */
        public static final List<Object> f100705a = null;

        static {
            f100705a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f100704d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f100704d;
                if (obj == obj2) {
                    obj = new C102435c();
                    this.f100704d = obj;
                }
            }
        }
        return (C102435c) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C38102a.f100705a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, ExtNetSceneSendMsgEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C102435c.class.getName();
    }
}
