package p738wg;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.ExtCursorForTimeLineEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: wg.b */
public enum C38099b implements C38174i<C102434a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f100700d;

    /* renamed from: wg.b$a */
    public static final class C38100a {

        /* renamed from: a */
        public static final List<Object> f100701a = null;

        static {
            f100701a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f100700d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f100700d;
                if (obj == obj2) {
                    obj = new C102434a();
                    this.f100700d = obj;
                }
            }
        }
        return (C102434a) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C38100a.f100701a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, ExtCursorForTimeLineEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C102434a.class.getName();
    }
}
