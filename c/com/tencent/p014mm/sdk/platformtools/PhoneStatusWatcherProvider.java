package com.tencent.p014mm.sdk.platformtools;

import ei3.C31607a;
import ei3.C86522b;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.sdk.platformtools.PhoneStatusWatcherProvider */
public enum PhoneStatusWatcherProvider implements C38174i<PhoneStatusWatcher> {
    INSTANCE;
    
    private volatile Object mInstance;

    private PhoneStatusWatcher create() {
        return new PhoneStatusWatcher();
    }

    public String getExtensionQualifierClassName() {
        return C86522b.class.getName();
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return null;
        }
        "onProcess".equals(str);
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, C31607a.ASYNC);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public void reset() {
        Object obj = this.mInstance;
        Object obj2 = C38174i.f100844M0;
        if (obj != obj2) {
            synchronized (this) {
                if (this.mInstance != obj2) {
                    this.mInstance = obj2;
                }
            }
        }
    }

    public String toString() {
        return "provider " + PhoneStatusWatcher.class.getName();
    }

    public PhoneStatusWatcher get() {
        Object obj = this.mInstance;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.mInstance;
                if (obj == obj2) {
                    obj = create();
                    this.mInstance = obj;
                }
            }
        }
        return (PhoneStatusWatcher) obj;
    }
}
