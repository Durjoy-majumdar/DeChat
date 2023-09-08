package com.tencent.maas.utils;

import android.content.Context;
import java.util.concurrent.Callable;

public final /* synthetic */ class MaasSDKResolverUtils$$a implements Callable {

    /* renamed from: d */
    public final /* synthetic */ Object[] f309912d;

    /* renamed from: e */
    public final /* synthetic */ Context f309913e;

    public /* synthetic */ MaasSDKResolverUtils$$a(Object[] objArr, Context context) {
        this.f309912d = objArr;
        this.f309913e = context;
    }

    public final Object call() {
        return MaasSDKResolverUtils.lambda$getCities$0(this.f309912d, this.f309913e);
    }
}
