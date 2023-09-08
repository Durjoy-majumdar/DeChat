package com.tencent.p014mm.plugin.appbrand.appusage;

import cc0.C92411b;
import com.tencent.p014mm.plugin.appbrand.appusage.C81481f0;
import com.tencent.p014mm.plugin.appbrand.utils.C84737f0;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import java.util.HashSet;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89144l0;
import ob0.l0$$e;
import p702ts.C78085c;
import te3.un4;
import te3.vn4;

/* renamed from: com.tencent.mm.plugin.appbrand.appusage.h0 */
public class C40432h0 implements C92411b.C92412a {

    /* renamed from: d */
    public int f108654d = 0;

    /* renamed from: com.tencent.mm.plugin.appbrand.appusage.h0$a */
    public class C40433a implements l0$$e {

        /* renamed from: d */
        public final /* synthetic */ float f108655d;

        /* renamed from: e */
        public final /* synthetic */ float f108656e;

        /* renamed from: f */
        public final /* synthetic */ double f108657f;

        public C40433a(C40432h0 h0Var, float f, float f2, double d) {
            this.f108655d = f;
            this.f108656e = f2;
            this.f108657f = d;
        }

        /* renamed from: a */
        public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
            Log.m105919d("MicroMsg.AppBrandPushNewOrRedDotLogic", "locationReport, errType %d, errCode %d, errMsg %s, longitude %f, latitude %f, accuracy %f", Integer.valueOf(i), Integer.valueOf(i2), str, Float.valueOf(this.f108655d), Float.valueOf(this.f108656e), Double.valueOf(this.f108657f));
            return 0;
        }
    }

    public C40432h0(C81481f0.C81484c cVar) {
    }

    public boolean onGetLocation(boolean z, float f, float f2, int i, double d, double d2, double d3) {
        ((HashSet) C84737f0.f247137a).remove(this);
        ((C78085c) C86312j.m106911c(C78085c.class)).mo108056ms().mo126408b(this);
        int i2 = this.f108654d;
        this.f108654d = i2 + 1;
        if (i2 < 1 && z) {
            C47350c.C47352b bVar = new C47350c.C47352b();
            bVar.f127068c = "/cgi-bin/mmbiz-bin/wxaapp/uploaduserlocationinfo";
            bVar.f127069d = 1154;
            bVar.f127067b = new vn4();
            un4 un4 = new un4();
            float f3 = f2;
            un4.f142968d = (double) f3;
            float f4 = f;
            un4.f142969e = (double) f4;
            double d4 = d2;
            un4.f142971g = d4;
            bVar.f127066a = un4;
            C89144l0.m111429e(bVar.mo72403a(), new C40433a(this, f4, f3, d4), true);
        }
        return true;
    }
}
