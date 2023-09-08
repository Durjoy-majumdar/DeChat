package hd0;

import com.tencent.p014mm.sdk.platformtools.Log;
import ic3.C27512d;
import p1081gi.C98121d;
import p494dp.C97505b;

public final /* synthetic */ class u$$a implements C97505b.C97506a {

    /* renamed from: a */
    public final /* synthetic */ C98433u f288690a;

    /* renamed from: b */
    public final /* synthetic */ C27512d f288691b;

    /* renamed from: c */
    public final /* synthetic */ C98408n0 f288692c;

    /* renamed from: d */
    public final /* synthetic */ C98121d f288693d;

    /* renamed from: e */
    public final /* synthetic */ C98121d f288694e;

    public /* synthetic */ u$$a(C98433u uVar, C27512d dVar, C98408n0 n0Var, C98121d dVar2, C98121d dVar3) {
        this.f288690a = uVar;
        this.f288691b = dVar;
        this.f288692c = n0Var;
        this.f288693d = dVar2;
        this.f288694e = dVar3;
    }

    /* renamed from: a */
    public final void mo136780a(String str, int i, int i2) {
        C98433u uVar = this.f288690a;
        C27512d dVar = this.f288691b;
        C98408n0 n0Var = this.f288692c;
        C98121d dVar2 = this.f288693d;
        C98121d dVar3 = this.f288694e;
        uVar.getClass();
        Log.m105925i("MicroMsg.NetSceneUploadVideoOrigin", "on Md5 check, aeskey = %s, errType = %d, errCode = %d", str, Integer.valueOf(i), Integer.valueOf(i2));
        if (i == 0 && i2 == 0) {
            dVar.mo55210U(str);
            dVar.mo55212W(str);
            n0Var.f288575v = dVar.mo141118z();
            n0Var.f288548P = 2097152;
            C98429r0.m127808N(n0Var);
            Log.m105925i("MicroMsg.NetSceneUploadVideoOrigin", "on Md5 check, recv xml = %s", n0Var.mo137705i());
            uVar.mo137763j1(n0Var, dVar2, dVar3);
            return;
        }
        uVar.f288681j.mo127120a(4, 102);
        Log.m105924i("MicroMsg.NetSceneUploadVideoOrigin", "on Md5 chech failed, do reUpload");
    }
}
