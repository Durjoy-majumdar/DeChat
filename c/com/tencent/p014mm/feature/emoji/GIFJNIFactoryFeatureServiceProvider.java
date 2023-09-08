package com.tencent.p014mm.feature.emoji;

import ei3.C86522b;
import java.util.Collections;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.feature.emoji.GIFJNIFactoryFeatureServiceProvider */
public enum GIFJNIFactoryFeatureServiceProvider implements C38174i<GIFJNIFactoryFeatureService> {
    INSTANCE;
    
    private volatile Object mInstance;

    private GIFJNIFactoryFeatureService create() {
        return new GIFJNIFactoryFeatureService();
    }

    public String getExtensionQualifierClassName() {
        return C86522b.class.getName();
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        if ("onProcess".equals(str)) {
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
        return "provider " + GIFJNIFactoryFeatureService.class.getName();
    }

    public GIFJNIFactoryFeatureService get() {
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
        return (GIFJNIFactoryFeatureService) obj;
    }
}
