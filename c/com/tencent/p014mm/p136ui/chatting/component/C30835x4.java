package com.tencent.p014mm.p136ui.chatting.component;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tenpay.android.wechat.PayuSecureEncrypt;
import eb0.C75576f4;
import f40.C86709a0;
import lc3.C10485b;

/* renamed from: com.tencent.mm.ui.chatting.component.x4 */
public class C30835x4 implements C75576f4.C75578b {

    /* renamed from: a */
    public final /* synthetic */ C73644w4 f82852a;

    public C30835x4(C73644w4 w4Var) {
        this.f82852a = w4Var;
    }

    /* renamed from: a */
    public void mo57753a(C114770g gVar) {
        if (gVar != null) {
            C73644w4 w4Var = this.f82852a;
            w4Var.getClass();
            Class cls = C10485b.class;
            String Q4 = gVar.mo55457Q4();
            long j = !Util.isNullOrNil(Q4) ? Util.getLong(Q4, 0) : 0;
            String str = "TypingTrigger";
            String str2 = "TypingInterval";
            if (j != 0) {
                str = str + "_ISP" + j;
                str2 = str2 + "_ISP" + j;
            }
            String str3 = PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT;
            String str4 = "15";
            if (C86709a0.m107523b().mo121114l()) {
                str3 = Util.nullAs(((C10485b) C86709a0.m107533q(cls)).vh0().mo107405c(str), str3);
                str4 = Util.nullAs(((C10485b) C86709a0.m107533q(cls)).vh0().mo107405c(str2), str4);
            }
            w4Var.f216246e = Util.getInt(str3, 0);
            w4Var.f216247f = Util.getInt(str4, 0);
            Log.m105925i("MicroMsg.SignallingComponent", "ispId: %d, trigger:%d, interval:%d", Long.valueOf(j), Integer.valueOf(w4Var.f216246e), Integer.valueOf(w4Var.f216247f));
            int i = w4Var.f216246e;
            if (!(i == -1 || i == -2 || i > 0)) {
                w4Var.f216246e = 10;
            }
            if (w4Var.f216247f <= 0) {
                w4Var.f216247f = 15;
            }
            gVar.mo55444B3((long) (w4Var.f216247f * 1000), 20000);
        }
    }
}
