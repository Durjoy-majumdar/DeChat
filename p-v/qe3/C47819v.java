package qe3;

import com.tencent.p014mm.sdk.platformtools.Log;
import qe3.C89631w;
import te3.C49112d9;

/* renamed from: qe3.v */
public class C47819v extends C89631w.C89636e implements C89631w.C89635c {

    /* renamed from: a */
    public C49112d9 f128383a = new C49112d9();

    public int fromProtoBuf(byte[] bArr) {
        C49112d9 d9Var = (C49112d9) new C49112d9().parseFrom(bArr);
        this.f128383a = d9Var;
        C49112d9 d9Var2 = this.f128383a;
        Log.m105919d("MicroMsg.MMBakchatCreateQRcodeOffline.Resp", "Ret:%d, QRCodeBuffer:%s, QRCodeUrl:%s", Integer.valueOf(d9Var.f132189d), d9Var2.f132190e, d9Var2.f132191f);
        return this.f128383a.f132189d;
    }

    public int getCmdId() {
        return 1000;
    }
}
