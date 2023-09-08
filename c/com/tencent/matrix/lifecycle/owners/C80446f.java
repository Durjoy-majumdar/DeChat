package com.tencent.matrix.lifecycle.owners;

import java.util.HashSet;
import java.util.Iterator;
import p1012ne.C88932a;
import rx3.C13598b0;

/* renamed from: com.tencent.matrix.lifecycle.owners.f */
public final class C80446f implements Runnable {

    /* renamed from: d */
    public static final C80446f f235407d = new C80446f();

    public final void run() {
        String str = ProcessUILifecycleOwner.f235376a;
        ProcessUILifecycleOwner.f235396u = true;
        HashSet<C88932a> hashSet = ProcessUILifecycleOwner.f235395t;
        synchronized (hashSet) {
            Iterator<C88932a> it = hashSet.iterator();
            while (it.hasNext()) {
                it.next().mo112097a(true);
            }
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }
}
