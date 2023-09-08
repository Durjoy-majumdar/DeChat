package xz2;

import com.tenpay.android.wechat.PayuSecureEncrypt;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: xz2.l */
public enum C38937l implements C38174i<C66464k> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f104934d;

    public Object get() {
        Object obj = this.f104934d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f104934d;
                if (obj == obj2) {
                    obj = new C66464k();
                    this.f104934d = obj;
                }
            }
        }
        return (C66464k) obj;
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
        return Objects.equals(obj, "3") || Objects.equals(obj, PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C66464k.class.getName();
    }
}
