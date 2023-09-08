package com.tencent.kinda.framework;

import com.tencent.p014mm.app.C80625v0;
import ei3.C86522b;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p261wl.C38174i;

public enum HKOfflinePayServicesProvider implements C38174i<HKOfflinePayServices> {
    INSTANCE;
    
    private volatile Object mInstance;

    public static final class LazyCache_onProcess {
        public static final List<Object> value = null;

        static {
            value = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }

        private LazyCache_onProcess() {
        }
    }

    private HKOfflinePayServices create() {
        return new HKOfflinePayServices();
    }

    public String getExtensionQualifierClassName() {
        return C86522b.class.getName();
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return LazyCache_onProcess.value;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return false;
    }

    public boolean hasNoKeys() {
        return true;
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
        return "provider " + HKOfflinePayServices.class.getName();
    }

    public HKOfflinePayServices get() {
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
        return (HKOfflinePayServices) obj;
    }
}
