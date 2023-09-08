package com.tencent.matrix.lifecycle.owners;

import android.app.Activity;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.WeakHashMap;

/* renamed from: com.tencent.matrix.lifecycle.owners.g */
public final class C80447g extends C87413o implements C32226l<WeakHashMap<Activity, Object>, Object> {

    /* renamed from: d */
    public final /* synthetic */ Activity f235408d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C80447g(Activity activity) {
        super(1);
        this.f235408d = activity;
    }

    public Object invoke(Object obj) {
        WeakHashMap weakHashMap = (WeakHashMap) obj;
        C87412m.m108594g(weakHashMap, "$receiver");
        ProcessUILifecycleOwner processUILifecycleOwner = ProcessUILifecycleOwner.f235399x;
        Activity activity = this.f235408d;
        processUILifecycleOwner.getClass();
        return weakHashMap.put(activity, ProcessUILifecycleOwner.f235381f);
    }
}
