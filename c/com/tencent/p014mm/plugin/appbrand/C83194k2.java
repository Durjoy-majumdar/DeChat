package com.tencent.p014mm.plugin.appbrand;

import android.webkit.ValueCallback;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.appbrand.k2 */
public class C83194k2 implements ValueCallback<String> {

    /* renamed from: a */
    public final /* synthetic */ long f242995a;

    /* renamed from: b */
    public final /* synthetic */ C81925i2 f242996b;

    public C83194k2(C81925i2 i2Var, long j) {
        this.f242996b = i2Var;
        this.f242995a = j;
    }

    public void onReceiveValue(Object obj) {
        boolean parseBoolean = Boolean.parseBoolean((String) obj);
        if (parseBoolean) {
            C81925i2.C81929d dVar = this.f242996b.f240288G;
            dVar.f240301b = this.f242995a;
            dVar.f240302c = Util.nowMilliSecond();
            this.f242996b.f240288G.f240303d = null;
        }
        C81925i2.C81929d dVar2 = this.f242996b.f240288G;
        Log.m105925i("MicroMsg.AppBrandService", "notifyWxConfigReadyIfNeed end by evaluateJavascript, applied=%b, hash=%d, reportWxConfigInjectEnd cost=%dms", Boolean.valueOf(parseBoolean), Integer.valueOf(this.f242996b.hashCode()), Long.valueOf(dVar2.f240302c - dVar2.f240301b));
        C81925i2 i2Var = this.f242996b;
        C81925i2.C81929d dVar3 = i2Var.f240288G;
        i2Var.mo114326B0(dVar3.f240300a, dVar3.f240301b, dVar3.f240302c, dVar3.f240303d);
    }
}
