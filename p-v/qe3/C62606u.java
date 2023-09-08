package qe3;

import com.tencent.p014mm.sdk.platformtools.Log;
import qe3.C89631w;
import te3.C64255b9;

/* renamed from: qe3.u */
public class C62606u extends C89631w.C89634d implements C89631w.C89633b {

    /* renamed from: a */
    public C64255b9 f177799a = new C64255b9();

    /* renamed from: b */
    public byte[] f177800b;

    /* renamed from: c */
    public byte[] f177801c;

    public int getCmdId() {
        return 1000;
    }

    public int getFuncId() {
        return 1000;
    }

    public byte[] toProtoBuf() {
        this.f177799a.setBaseRequest(C89631w.m112065a(this));
        C64255b9 b9Var = this.f177799a;
        C64255b9 b9Var2 = this.f177799a;
        Log.m105919d("MicroMsg.MMBakchatCreateQRcodeOffline.Req", "key:%s  AddrCount:%s  AddrList:%s, PCName:%s, PCAcctName:%s, Scene:%s, DataSize:%s, WifiName:%s, Tickit:%s", this.f177800b, Integer.valueOf(this.f177799a.f182233d), b9Var.f182234e, b9Var.f182235f, b9Var.f182236g, Integer.valueOf(b9Var.f182237h), Long.valueOf(this.f177799a.f182238i), b9Var2.f182239j, b9Var2.f182240n);
        return this.f177799a.toByteArray();
    }
}
