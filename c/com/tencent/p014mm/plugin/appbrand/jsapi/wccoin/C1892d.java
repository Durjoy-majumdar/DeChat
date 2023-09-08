package com.tencent.p014mm.plugin.appbrand.jsapi.wccoin;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.type.IPCLong;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import m53.C10762h;
import te3.C50943qc2;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.wccoin.d */
public final class C1892d implements C10762h<C50943qc2> {

    /* renamed from: a */
    public final /* synthetic */ C1893e f11734a;

    /* renamed from: b */
    public final /* synthetic */ C1256g<IPCLong> f11735b;

    public C1892d(C1893e eVar, C1256g<IPCLong> gVar) {
        this.f11734a = eVar;
        this.f11735b = gVar;
    }

    /* renamed from: a */
    public void mo605a(int i, int i2, String str) {
        String str2 = this.f11734a.f11736d;
        Log.m105924i(str2, "[WeCoin] getWeCoinBalance onFailed,errorType:" + i + ",errorCode:" + i2 + ",msg:" + str);
        this.f11735b.mo894a(new IPCLong(-1));
    }

    public void onSuccess(Object obj) {
        C50943qc2 qc22 = (C50943qc2) obj;
        C87412m.m108594g(qc22, "data");
        String str = this.f11734a.f11736d;
        Log.m105924i(str, "[WeCoin] getWeCoinBalance onSuccess,data:" + qc22);
        this.f11735b.mo894a(new IPCLong(qc22.f140241d));
    }
}
