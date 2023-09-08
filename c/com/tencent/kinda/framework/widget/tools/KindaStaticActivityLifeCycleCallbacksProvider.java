package com.tencent.kinda.framework.widget.tools;

import ci3.C113366a;
import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

public enum KindaStaticActivityLifeCycleCallbacksProvider implements C38174i<KindaStaticActivityLifeCycleCallbacks> {
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

    private KindaStaticActivityLifeCycleCallbacks create() {
        return new KindaStaticActivityLifeCycleCallbacks();
    }

    public String getExtensionQualifierClassName() {
        return C113366a.class.getName();
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return LazyCache_onProcess.value;
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
        return "provider " + KindaStaticActivityLifeCycleCallbacks.class.getName();
    }

    public KindaStaticActivityLifeCycleCallbacks get() {
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
        return (KindaStaticActivityLifeCycleCallbacks) obj;
    }
}
