package com.tencent.wework.api;

import com.tencent.wework.api.model.BaseMessage;

public interface IWWAPI {

    public enum WWAppType {
        WwAppTypeDefault,
        WwAppTypeWxwork,
        WwAppTypeLocal,
        WwAppTypeWxworkWithoutSaas
    }

    /* renamed from: a */
    boolean mo136603a(BaseMessage baseMessage, WWAppType wWAppType);

    /* renamed from: b */
    String mo136604b(WWAppType wWAppType);

    /* renamed from: c */
    boolean mo136605c();

    /* renamed from: d */
    boolean mo136606d();

    /* renamed from: e */
    boolean mo136607e(WWAppType wWAppType);
}
