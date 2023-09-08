package com.tencent.p014mm.sdk.statecenter;

import com.tencent.p014mm.sdk.observer.IMvvmObserver;
import fy3.C32226l;
import kotlin.Metadata;

@Metadata(mo182095k = 3, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.sdk.statecenter.UIStateCenter$sam$com_tencent_mm_sdk_observer_IMvvmObserver$0 */
public final class UIStateCenter$sam$com_tencent_mm_sdk_observer_IMvvmObserver$0 implements IMvvmObserver {
    private final /* synthetic */ C32226l function;

    public UIStateCenter$sam$com_tencent_mm_sdk_observer_IMvvmObserver$0(C32226l lVar) {
        this.function = lVar;
    }

    public final /* synthetic */ void onChanged(Object obj) {
        this.function.invoke(obj);
    }
}
