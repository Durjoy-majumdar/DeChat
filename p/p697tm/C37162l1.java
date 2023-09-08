package p697tm;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.MsgInsertWithNewContactEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: tm.l1 */
public enum C37162l1 implements C38174i<C37158k1> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98401d;

    /* renamed from: tm.l1$a */
    public static final class C37163a {

        /* renamed from: a */
        public static final List<Object> f98402a = null;

        static {
            f98402a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f98401d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98401d;
                if (obj == obj2) {
                    obj = new C37158k1();
                    this.f98401d = obj;
                }
            }
        }
        return (C37158k1) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C37163a.f98402a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, MsgInsertWithNewContactEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C37158k1.class.getName();
    }
}
