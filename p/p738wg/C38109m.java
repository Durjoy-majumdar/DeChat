package p738wg;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.ExtVoiceFileNameToMsgIdEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: wg.m */
public enum C38109m implements C38174i<C78594l> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f100720d;

    /* renamed from: wg.m$a */
    public static final class C38110a {

        /* renamed from: a */
        public static final List<Object> f100721a = null;

        static {
            f100721a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f100720d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f100720d;
                if (obj == obj2) {
                    obj = new C78594l();
                    this.f100720d = obj;
                }
            }
        }
        return (C78594l) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C38110a.f100721a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, ExtVoiceFileNameToMsgIdEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C78594l.class.getName();
    }
}
