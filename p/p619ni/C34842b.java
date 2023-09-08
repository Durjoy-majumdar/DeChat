package p619ni;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ni.b */
public enum C34842b implements C38174i<C76857a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93610d;

    public Object get() {
        Object obj = this.f93610d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93610d;
                if (obj == obj2) {
                    obj = new C76857a();
                    this.f93610d = obj;
                }
            }
        }
        return (C76857a) obj;
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
        return Objects.equals(obj, "NewXmlChatRoomAccessVerifyApplication") || Objects.equals(obj, "NewXmlChatRoomAccessVerifyApproval") || Objects.equals(obj, "NewXmlOpenIMChatRoomAddChatRoomMemberApplication");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C76857a.class.getName();
    }
}
