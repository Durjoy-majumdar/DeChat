package com.tencent.p014mm.wallet_core.model;

import a14.C53916l;
import fy3.C32224a;
import gy3.C87413o;
import java.util.HashSet;
import kotlin.Result;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.wallet_core.model.w0 */
public final class C75153w0 extends C87413o implements C32224a<Boolean> {

    /* renamed from: d */
    public final /* synthetic */ String f221133d;

    /* renamed from: e */
    public final /* synthetic */ C53916l<C13598b0> f221134e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C75153w0(String str, C53916l<? super C13598b0> lVar) {
        super(0);
        this.f221133d = str;
        this.f221134e = lVar;
    }

    public Object invoke() {
        boolean z;
        C75142u0 u0Var = C75142u0.f221103a;
        String str = this.f221133d;
        u0Var.getClass();
        HashSet<String> hashSet = C75142u0.f221109g;
        synchronized (hashSet) {
            if (!hashSet.contains(str)) {
                hashSet.add(str);
                z = true;
            } else {
                C13598b0 b0Var = C13598b0.f38549a;
                z = false;
            }
        }
        if (z) {
            C53916l<C13598b0> lVar = this.f221134e;
            Result.Companion companion = Result.Companion;
            lVar.resumeWith(Result.m168114constructorimpl(C13598b0.f38549a));
        }
        return Boolean.valueOf(z);
    }
}
