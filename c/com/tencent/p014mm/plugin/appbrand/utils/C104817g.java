package com.tencent.p014mm.plugin.appbrand.utils;

import com.tencent.p014mm.accessibility.uitl.AccUtil;
import com.tencent.p014mm.sdk.observer.IMvvmObserver;
import com.tencent.p014mm.sdk.observer.MvvmObserverOwner;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.g */
public final class C104817g implements C84796y0 {

    /* renamed from: d */
    public static final C104817g f311301d = new C104817g();

    /* renamed from: e */
    public static final MvvmObserverOwner<IMvvmObserver<Boolean>, Boolean> f311302e = AccUtil.INSTANCE.getListenersOwner();

    /* renamed from: Q9 */
    public MvvmObserverOwner<IMvvmObserver<Boolean>, Boolean> mo117450Q9() {
        return f311302e;
    }

    public boolean isEnable() {
        return AccUtil.INSTANCE.isAccessibilityEnabled();
    }
}
