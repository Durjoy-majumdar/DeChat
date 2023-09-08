package qe3;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import qe3.C89631w;
import te3.C118468t33;

/* renamed from: qe3.u0 */
public class C118195u0 extends C89631w.C89636e implements C89631w.C89635c {

    /* renamed from: a */
    public C118468t33 f353324a = new C118468t33();

    /* renamed from: b */
    public byte[] f353325b;

    /* renamed from: c */
    public byte[] f353326c;

    /* renamed from: d */
    public byte[] f353327d;

    /* renamed from: e */
    public byte[] f353328e;

    /* renamed from: f */
    public int f353329f = 0;

    /* renamed from: a */
    public byte[] mo182990a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? new byte[0] : this.f353328e : this.f353327d : this.f353326c;
    }

    /* renamed from: b */
    public void mo182991b(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f353326c = bArr;
        this.f353327d = bArr2;
        this.f353328e = bArr3;
        Log.m105925i("MicroMsg.MMReg2.Resp", "summerauths setSession [%s] [%s] [%s]", Util.secPrint(Util.dumpHex(bArr)), Util.secPrint(Util.dumpHex(this.f353327d)), Util.secPrint(Util.dumpHex(this.f353328e)));
    }

    public int fromProtoBuf(byte[] bArr) {
        this.f353329f = 0;
        C118468t33 t332 = (C118468t33) new C118468t33().parseFrom(bArr);
        this.f353324a = t332;
        C89631w.m112066b(this, t332.getBaseResponse());
        this.f353329f = 0;
        return this.f353324a.getBaseResponse().f135955d;
    }

    public int getCmdId() {
        return 0;
    }
}
