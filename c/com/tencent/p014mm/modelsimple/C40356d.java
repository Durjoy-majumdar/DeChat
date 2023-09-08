package com.tencent.p014mm.modelsimple;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89132b;
import pe3.C89349b;
import te3.C49335eu3;
import te3.C49966ja;
import te3.C51163rv3;
import te3.C51806wa0;
import te3.C51945xa0;

/* renamed from: com.tencent.mm.modelsimple.d */
public final class C40356d extends C89132b<C51945xa0> {
    public C40356d(C89349b bVar, int i, C1308r0 r0Var) {
        C87412m.m108594g(bVar, "extDeviceId");
        C87412m.m108594g(r0Var, "setting");
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        C51806wa0 wa02 = new C51806wa0();
        wa02.f143945d = bVar;
        wa02.f143946e = i;
        wa02.f143947f = 1;
        wa02.f143948g = r0Var.f10433d;
        C51945xa0 xa02 = new C51945xa0();
        xa02.setBaseResponse(new C49966ja());
        xa02.getBaseResponse().f135956e = new C51163rv3();
        bVar2.f127066a = wa02;
        bVar2.f127067b = xa02;
        bVar2.f127068c = "/cgi-bin/micromsg-bin/extdeviceoplog";
        bVar2.f127069d = 4048;
        mo123453j(bVar2.mo72403a());
        Log.m105924i("MicroMsg.CgiExtDeviceOplog", "opcode:" + wa02.f143947f + " setting:" + r0Var.f10433d);
    }

    /* renamed from: h */
    public void mo10094h(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C51945xa0 xa02 = (C51945xa0) eu32;
        Log.m105924i("MicroMsg.CgiExtDeviceOplog", "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str);
    }
}
