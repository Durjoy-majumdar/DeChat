package oi0;

import cc0.C92411b;
import com.tencent.p014mm.plugin.appbrand.utils.C84737f0;
import com.tencent.p014mm.pointers.PBool;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.util.HashSet;
import oi0.C89215e;
import p702ts.C78085c;

/* renamed from: oi0.d */
public class C89214d implements C92411b.C92412a {

    /* renamed from: d */
    public int f257062d = 0;

    /* renamed from: e */
    public final /* synthetic */ PBool f257063e;

    /* renamed from: f */
    public final /* synthetic */ PBool f257064f;

    /* renamed from: g */
    public final /* synthetic */ C89215e f257065g;

    public C89214d(C89215e eVar, PBool pBool, PBool pBool2) {
        this.f257065g = eVar;
        this.f257063e = pBool;
        this.f257064f = pBool2;
    }

    public boolean onGetLocation(boolean z, float f, float f2, int i, double d, double d2, double d3) {
        ((HashSet) C84737f0.f247137a).remove(this);
        ((C78085c) C86312j.m106911c(C78085c.class)).mo108056ms().mo126408b(this);
        int i2 = this.f257062d + 1;
        this.f257062d = i2;
        if (i2 > 1 || this.f257063e.value) {
            return false;
        }
        this.f257064f.value = true;
        this.f257065g.f257069a = false;
        if (!z) {
            Log.m105924i("MicroMsg.Recommend.AppBrandRecommendLocationGet", "onGetLocation, fail");
            C89215e.C89216a aVar = this.f257065g.f257070b;
            if (aVar != null) {
                aVar.mo123545a(f, f2);
            }
            return false;
        }
        Log.m105924i("MicroMsg.Recommend.AppBrandRecommendLocationGet", "onGetLocation, success");
        C89215e.f257067d = f2;
        C89215e.f257066c = f;
        C89215e.f257068e = Util.nowMilliSecond();
        C89215e.C89216a aVar2 = this.f257065g.f257070b;
        if (aVar2 != null) {
            aVar2.mo123545a(f, f2);
        }
        return true;
    }
}
