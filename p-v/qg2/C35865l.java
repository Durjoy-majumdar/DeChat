package qg2;

import com.tencent.p014mm.autogen.events.QueryRecordMsgMediaListEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: qg2.l */
public enum C35865l implements C38174i<C101149k> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95723d;

    public Object get() {
        Object obj = this.f95723d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95723d;
                if (obj == obj2) {
                    obj = new C101149k();
                    this.f95723d = obj;
                }
            }
        }
        return (C101149k) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, QueryRecordMsgMediaListEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C101149k.class.getName();
    }
}
