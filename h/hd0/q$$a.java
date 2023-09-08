package hd0;

import com.tencent.p014mm.sdk.platformtools.Log;
import ic3.C27512d;
import p1081gi.C98121d;
import p494dp.C97505b;

public final /* synthetic */ class q$$a implements C97505b.C97506a {

    /* renamed from: a */
    public final /* synthetic */ C98415q f288637a;

    /* renamed from: b */
    public final /* synthetic */ C27512d f288638b;

    /* renamed from: c */
    public final /* synthetic */ C98408n0 f288639c;

    /* renamed from: d */
    public final /* synthetic */ C98121d f288640d;

    public /* synthetic */ q$$a(C98415q qVar, C27512d dVar, C98408n0 n0Var, C98121d dVar2) {
        this.f288637a = qVar;
        this.f288638b = dVar;
        this.f288639c = n0Var;
        this.f288640d = dVar2;
    }

    /* renamed from: a */
    public final void mo136780a(String str, int i, int i2) {
        C98415q qVar = this.f288637a;
        C27512d dVar = this.f288638b;
        C98408n0 n0Var = this.f288639c;
        C98121d dVar2 = this.f288640d;
        qVar.getClass();
        Log.m105925i("MicroMsg.NetSceneUploadVideo", "on Md5 check, aeskey = %s, errType = %d, errCode = %d", str, Integer.valueOf(i), Integer.valueOf(i2));
        if (i == 0 && i2 == 0) {
            dVar.mo55210U(str);
            dVar.mo55212W(str);
            n0Var.f288575v = dVar.mo141118z();
            n0Var.f288548P = 2097152;
            C98429r0.m127808N(n0Var);
            Log.m105925i("MicroMsg.NetSceneUploadVideo", "on Md5 check, recv xml = %s", n0Var.mo137705i());
            qVar.mo137747n1(n0Var, dVar2);
            return;
        }
        qVar.f288617d.onSceneEnd(4, 102, "", qVar);
        Log.m105924i("MicroMsg.NetSceneUploadVideo", "on Md5 chech failed, do reUpload");
    }
}
