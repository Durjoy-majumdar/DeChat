package p222qm;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.SendMsgEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: qm.m1 */
public enum C35960m1 implements C38174i<C47868l1> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95907d;

    /* renamed from: qm.m1$a */
    public static final class C35961a {

        /* renamed from: a */
        public static final List<Object> f95908a = null;

        static {
            f95908a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f95907d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95907d;
                if (obj == obj2) {
                    obj = new C47868l1();
                    this.f95907d = obj;
                }
            }
        }
        return (C47868l1) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C35961a.f95908a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, SendMsgEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C47868l1.class.getName();
    }
}
