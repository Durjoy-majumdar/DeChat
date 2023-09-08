package p738wg;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.ExtRecordEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: wg.h */
public enum C38105h implements C38174i<C78593g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f100712d;

    /* renamed from: wg.h$a */
    public static final class C38106a {

        /* renamed from: a */
        public static final List<Object> f100713a = null;

        static {
            f100713a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f100712d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f100712d;
                if (obj == obj2) {
                    obj = new C78593g();
                    this.f100712d = obj;
                }
            }
        }
        return (C78593g) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C38106a.f100713a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, ExtRecordEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C78593g.class.getName();
    }
}
