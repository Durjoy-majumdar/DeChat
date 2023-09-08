package com.tencent.matrix.lifecycle.owners;

import java.util.HashSet;
import java.util.Iterator;
import p1012ne.C88932a;
import rx3.C13598b0;

/* renamed from: com.tencent.matrix.lifecycle.owners.e */
public final class C80445e implements Runnable {

    /* renamed from: d */
    public static final C80445e f235406d = new C80445e();

    public final void run() {
        String str = ProcessUILifecycleOwner.f235376a;
        ProcessUILifecycleOwner.f235396u = false;
        HashSet<C88932a> hashSet = ProcessUILifecycleOwner.f235395t;
        synchronized (hashSet) {
            Iterator<C88932a> it = hashSet.iterator();
            while (it.hasNext()) {
                it.next().mo112097a(false);
            }
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }
}
