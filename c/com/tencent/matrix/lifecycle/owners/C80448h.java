package com.tencent.matrix.lifecycle.owners;

import android.app.Activity;
import com.tencent.matrix.lifecycle.IForegroundStatefulOwner;
import com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.WeakHashMap;
import rx3.C13598b0;

/* renamed from: com.tencent.matrix.lifecycle.owners.h */
public final class C80448h extends C87413o implements C32226l<WeakHashMap<Activity, Object>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Activity f235409d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C80448h(Activity activity) {
        super(1);
        this.f235409d = activity;
    }

    public Object invoke(Object obj) {
        WeakHashMap weakHashMap = (WeakHashMap) obj;
        C87412m.m108594g(weakHashMap, "$receiver");
        weakHashMap.remove(this.f235409d);
        if (weakHashMap.isEmpty()) {
            ProcessUILifecycleOwner.f235399x.getClass();
            IForegroundStatefulOwner iForegroundStatefulOwner = ProcessUILifecycleOwner.f235388m;
            if (iForegroundStatefulOwner != null) {
                ((ProcessUILifecycleOwner.AsyncOwner) iForegroundStatefulOwner).turnOffAsync();
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner.AsyncOwner");
            }
        }
        return C13598b0.f38549a;
    }
}
