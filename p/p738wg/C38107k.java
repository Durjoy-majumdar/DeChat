package p738wg;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.ExtSimpleRecordEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: wg.k */
public enum C38107k implements C38174i<C102438j> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f100716d;

    /* renamed from: wg.k$a */
    public static final class C38108a {

        /* renamed from: a */
        public static final List<Object> f100717a = null;

        static {
            f100717a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f100716d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f100716d;
                if (obj == obj2) {
                    obj = new C102438j();
                    this.f100716d = obj;
                }
            }
        }
        return (C102438j) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C38108a.f100717a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, ExtSimpleRecordEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C102438j.class.getName();
    }
}
