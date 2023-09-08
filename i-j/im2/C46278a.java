package im2;

import com.tencent.p014mm.plugin.messenger.foundation.C69843t;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86301e;
import ei3.C86522b;
import f40.C86709a0;
import f62.C75700k0;
import g62.C32330n;
import java.io.IOException;
import java.nio.charset.Charset;
import jm2.C46563d;
import tc0.C77885p;
import te3.C48774ax;
import te3.C51018qv3;
import te3.C51461tx2;
import te3.C52315zw;
import te3.b35;

@C86522b(dependencies = {C69843t.class})
/* renamed from: im2.a */
public class C46278a extends C86301e implements C46563d {
    public void F80(int i, String str, int i2) {
        vx0(i, str, i2, (byte[]) null);
    }

    /* renamed from: Ko */
    public void mo71685Ko(int i, String str, int i2, int i3, String str2) {
        byte[] bArr;
        b35 b35 = new b35();
        b35.f130928d = i3;
        b35.f130929e = str2;
        try {
            bArr = b35.toByteArray();
        } catch (IOException e) {
            Log.m105929w("MicroMsg.ClipBordReportImpl", "getExtInfo exp %s", e.getMessage());
            bArr = null;
        }
        vx0(i, str, i2, bArr);
    }

    public void vx0(int i, String str, int i2, byte[] bArr) {
        if (str == null) {
            Log.m105928w("MicroMsg.ClipBordReportImpl", "operationInfo isNullOrNil");
        } else if (C86709a0.m107522a()) {
            C52315zw zwVar = new C52315zw();
            zwVar.f146244d = i;
            zwVar.f146246f = i2;
            byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
            C51018qv3 qv32 = new C51018qv3();
            qv32.mo73350k(bytes);
            zwVar.f146245e = qv32;
            if (!Util.isNullOrNil(bArr)) {
                C51018qv3 qv33 = new C51018qv3();
                qv33.mo73350k(bArr);
                zwVar.f146247g = qv33;
            }
            C48774ax axVar = new C48774ax();
            axVar.f130812e.add(zwVar);
            axVar.f130811d = axVar.f130812e.size();
            ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C32330n(211, axVar));
        }
    }

    /* renamed from: xz */
    public void mo71687xz(int i, int i2, String str, String str2) {
        byte[] bArr;
        C51461tx2 tx22 = new C51461tx2();
        tx22.f142466d = str;
        tx22.f142467e = str2;
        try {
            bArr = tx22.toByteArray();
        } catch (IOException e) {
            Log.m105929w("MicroMsg.ClipBordReportImpl", "getExtInfo exp %s", e.getMessage());
            bArr = null;
        }
        vx0(i, "", i2, bArr);
    }
}
