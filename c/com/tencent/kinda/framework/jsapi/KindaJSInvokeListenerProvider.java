package com.tencent.kinda.framework.jsapi;

import ci3.C113366a;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.KindaJSInvokeEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

public enum KindaJSInvokeListenerProvider implements C38174i<KindaJSInvokeListener> {
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

    private KindaJSInvokeListener create() {
        return new KindaJSInvokeListener();
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
        return Objects.equals(obj, KindaJSInvokeEvent.class);
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
        return "provider " + KindaJSInvokeListener.class.getName();
    }

    public KindaJSInvokeListener get() {
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
        return (KindaJSInvokeListener) obj;
    }
}
