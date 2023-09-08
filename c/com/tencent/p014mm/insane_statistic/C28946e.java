package com.tencent.p014mm.insane_statistic;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.insane_statistic.e */
public enum C28946e implements C38174i<OnNetSceneUploadMsgImgEndService> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f79409d;

    public Object get() {
        Object obj = this.f79409d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f79409d;
                if (obj == obj2) {
                    obj = new OnNetSceneUploadMsgImgEndService();
                    this.f79409d = obj;
                }
            }
        }
        return (OnNetSceneUploadMsgImgEndService) obj;
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

    public String toString() {
        return "provider " + OnNetSceneUploadMsgImgEndService.class.getName();
    }
}
