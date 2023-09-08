package d01;

import android.content.Intent;
import di3.C86312j;
import e01.C107075a;
import f01.C58867a;
import gy3.C87412m;
import ob0.C11385n;
import ob0.C117747y;
import te3.C64226a81;
import te3.C64408gz0;
import yz0.C112509d;

/* renamed from: d01.e */
public final class C58008e implements C11385n {

    /* renamed from: d */
    public static final C58008e f165928d = new C58008e();

    public final void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C64226a81 a812;
        C87412m.m108592e(yVar, "null cannot be cast to non-null type com.tencent.mm.plugin.cast.netscene.NetSceneGetScreenCastAuthorization");
        C64408gz0 gz02 = ((C58867a) yVar).f168503f;
        if (gz02 != null && (a812 = gz02.f183381e) != null) {
            Intent intent = new Intent();
            intent.putExtra("remoteConfig", a812.f182038d);
            intent.putExtra("pc_ip", a812.f182039e);
            intent.putExtra("phone_ip", a812.f182040f);
            if (C112509d.f336921e == null) {
                C112509d.f336921e = new C107075a();
            }
            C107075a aVar = C112509d.f336921e;
            if (aVar != null) {
                aVar.f320495a = ((C112509d) C86312j.m106911c(C112509d.class)).wx0(intent);
            }
        }
    }
}
