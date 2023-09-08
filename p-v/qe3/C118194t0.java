package qe3;

import android.text.TextUtils;
import com.tencent.p014mm.network.C114766b;
import com.tencent.p014mm.pointers.PByteArray;
import com.tencent.p014mm.protocal.MMProtocalJni;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.nio.charset.StandardCharsets;
import qe3.C89631w;
import tc2.C118418g;
import te3.C118465s33;
import te3.C49569gj3;
import te3.C51018qv3;
import te3.C64306d60;
import te3.lx4;

/* renamed from: qe3.t0 */
public class C118194t0 extends C89631w.C89634d implements C89631w.C89633b {

    /* renamed from: a */
    public C118465s33 f353322a = new C118465s33();

    /* renamed from: b */
    public byte[] f353323b;

    public int getCmdId() {
        return 0;
    }

    public int getFuncId() {
        return 126;
    }

    public byte[] toProtoBuf() {
        setRsaInfo(C101125b1.m132538d());
        C118465s33 s332 = this.f353322a;
        C51018qv3 qv32 = new C51018qv3();
        qv32.mo73350k(Util.getUuidRandom());
        s332.f354367u = qv32;
        this.f353322a.setBaseRequest(C89631w.m112065a(this));
        this.f353322a.f354361o = ChannelUtil.historyChannelId;
        C64306d60 d602 = new C64306d60();
        d602.f182634d = 713;
        PByteArray pByteArray = new PByteArray();
        PByteArray pByteArray2 = new PByteArray();
        int generateECKey = MMProtocalJni.generateECKey(d602.f182634d, pByteArray, pByteArray2);
        byte[] bArr = pByteArray.value;
        byte[] bArr2 = pByteArray2.value;
        this.f353323b = bArr2 != null ? bArr2 : new byte[0];
        Object[] objArr = new Object[6];
        objArr[0] = Integer.valueOf(d602.f182634d);
        objArr[1] = Integer.valueOf(generateECKey);
        int i = -1;
        objArr[2] = Integer.valueOf(bArr == null ? -1 : bArr.length);
        objArr[3] = Integer.valueOf(bArr2 == null ? -1 : bArr2.length);
        objArr[4] = Util.dumpHex(bArr);
        objArr[5] = Util.dumpHex(bArr2);
        Log.m105919d("MicroMsg.MMReg2.Req", "summerecdh nid:%d ret:%d, pub len: %d, pri len:%d, pub:%s, pri:%s", objArr);
        C51018qv3 qv33 = new C51018qv3();
        qv33.mo73350k(bArr);
        d602.f182635e = qv33;
        this.f353322a.f354337G = d602;
        try {
            C118418g gVar = C118418g.INSTANCE;
            byte[] hd = gVar.mo175821hd();
            Object[] objArr2 = new Object[1];
            if (hd != null) {
                i = hd.length;
            }
            objArr2[0] = Integer.valueOf(i);
            Log.m105919d("MicroMsg.MMReg2.Req", "[debug] ccd set on reg, len: %s", objArr2);
            lx4 lx4 = new lx4();
            C51018qv3 qv34 = new C51018qv3();
            qv34.mo73350k(hd);
            lx4.f354117f = qv34;
            C51018qv3 qv35 = new C51018qv3();
            qv35.mo73350k(gVar.b90());
            lx4.f354121j = qv35;
            Log.m105919d("MicroMsg.MMReg2.Req", "[debug] devtok on reg, len: %s", Integer.valueOf(qv35.f140572d));
            C118465s33 s333 = this.f353322a;
            C51018qv3 qv36 = new C51018qv3();
            qv36.mo73350k(lx4.toByteArray());
            s333.f354348S = qv36;
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.MMReg2.Req", th, "cc throws exception.", new Object[0]);
        }
        this.f353322a.f354352W = new C49569gj3();
        String a = C114766b.f344135e.mo174416a();
        if (!TextUtils.isEmpty(a)) {
            C49569gj3 gj32 = this.f353322a.f354352W;
            C114766b bVar = C114766b.f344135e;
            bVar.mo174417b();
            gj32.f134078d = bVar.f344136a.f134078d;
            C49569gj3 gj33 = this.f353322a.f354352W;
            C51018qv3 qv37 = new C51018qv3();
            qv37.mo73350k(a.getBytes(StandardCharsets.ISO_8859_1));
            gj33.f134079e = qv37;
        } else {
            C49569gj3 gj34 = this.f353322a.f354352W;
            gj34.f134078d = 0;
            C51018qv3 qv38 = new C51018qv3();
            qv38.mo73350k(new byte[0]);
            gj34.f134079e = qv38;
            Log.m105920e("MicroMsg.MMReg2.Req", "get sign key failed");
        }
        C114766b.C114767a aVar = new C114766b.C114767a();
        aVar.f344141b = C114766b.f344135e.mo174416a();
        C114766b bVar2 = C114766b.f344135e;
        bVar2.mo174417b();
        aVar.f344140a = bVar2.f344137b;
        setCGiVerifyKey(aVar);
        return this.f353322a.toByteArray();
    }
}
