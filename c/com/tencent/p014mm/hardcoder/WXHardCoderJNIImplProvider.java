package com.tencent.p014mm.hardcoder;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import ei3.C86522b;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import jc3.C87948i;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.hardcoder.WXHardCoderJNIImplProvider */
public enum WXHardCoderJNIImplProvider implements C38174i<WXHardCoderJNIImpl> {
    INSTANCE;
    
    private volatile Object mInstance;

    /* renamed from: com.tencent.mm.hardcoder.WXHardCoderJNIImplProvider$LazyCache_dependencies */
    public static final class LazyCache_dependencies {
        public static final List<Object> value = null;

        static {
            value = Arrays.asList(new Object[]{C87948i.class});
        }

        private LazyCache_dependencies() {
        }
    }

    /* renamed from: com.tencent.mm.hardcoder.WXHardCoderJNIImplProvider$LazyCache_onProcess */
    public static final class LazyCache_onProcess {
        public static final List<Object> value = null;

        static {
            value = Arrays.asList(new Object[]{C80625v0.MATCH_NOT_PLAIN_PROCESSES});
        }

        private LazyCache_onProcess() {
        }
    }

    private WXHardCoderJNIImpl create() {
        return new WXHardCoderJNIImpl();
    }

    public String getExtensionQualifierClassName() {
        return C86522b.class.getName();
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return LazyCache_dependencies.value;
        }
        if ("onProcess".equals(str)) {
            return LazyCache_onProcess.value;
        }
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
        return "provider " + WXHardCoderJNIImpl.class.getName();
    }

    public WXHardCoderJNIImpl get() {
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
        return (WXHardCoderJNIImpl) obj;
    }
}
