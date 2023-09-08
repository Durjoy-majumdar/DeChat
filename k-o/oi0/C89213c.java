package oi0;

import com.tencent.p014mm.pointers.PBool;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import oi0.C89215e;

/* renamed from: oi0.c */
public class C89213c implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ PBool f257059d;

    /* renamed from: e */
    public final /* synthetic */ PBool f257060e;

    /* renamed from: f */
    public final /* synthetic */ C89215e f257061f;

    public C89213c(C89215e eVar, PBool pBool, PBool pBool2) {
        this.f257061f = eVar;
        this.f257059d = pBool;
        this.f257060e = pBool2;
    }

    public boolean onTimerExpired() {
        if (this.f257059d.value) {
            return false;
        }
        this.f257060e.value = true;
        this.f257061f.f257069a = false;
        Log.m105924i("MicroMsg.Recommend.AppBrandRecommendLocationGet", "onTimerExpired");
        C89215e.C89216a aVar = this.f257061f.f257070b;
        if (aVar != null) {
            aVar.mo123545a(C89215e.f257066c, C89215e.f257067d);
        }
        return false;
    }
}
