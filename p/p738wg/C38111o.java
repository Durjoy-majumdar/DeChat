package p738wg;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.ExtVoiceMsgIdToFileNameEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: wg.o */
public enum C38111o implements C38174i<C102439n> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f100724d;

    /* renamed from: wg.o$a */
    public static final class C38112a {

        /* renamed from: a */
        public static final List<Object> f100725a = null;

        static {
            f100725a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f100724d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f100724d;
                if (obj == obj2) {
                    obj = new C102439n();
                    this.f100724d = obj;
                }
            }
        }
        return (C102439n) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C38112a.f100725a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, ExtVoiceMsgIdToFileNameEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C102439n.class.getName();
    }
}
