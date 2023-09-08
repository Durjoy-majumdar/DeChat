package hd0;

import com.tencent.p014mm.sdk.platformtools.Log;
import ic3.C27512d;
import p1081gi.C98121d;
import p494dp.C97505b;

public final /* synthetic */ class v$$a implements C97505b.C97506a {

    /* renamed from: a */
    public final /* synthetic */ C98435v f288711a;

    /* renamed from: b */
    public final /* synthetic */ C27512d f288712b;

    /* renamed from: c */
    public final /* synthetic */ C98408n0 f288713c;

    /* renamed from: d */
    public final /* synthetic */ C98121d f288714d;

    /* renamed from: e */
    public final /* synthetic */ C98121d f288715e;

    public /* synthetic */ v$$a(C98435v vVar, C27512d dVar, C98408n0 n0Var, C98121d dVar2, C98121d dVar3) {
        this.f288711a = vVar;
        this.f288712b = dVar;
        this.f288713c = n0Var;
        this.f288714d = dVar2;
        this.f288715e = dVar3;
    }

    /* renamed from: a */
    public final void mo136780a(String str, int i, int i2) {
        C98435v vVar = this.f288711a;
        C27512d dVar = this.f288712b;
        C98408n0 n0Var = this.f288713c;
        C98121d dVar2 = this.f288714d;
        C98121d dVar3 = this.f288715e;
        vVar.getClass();
        Log.m105925i("MicroMsg.NetSceneUploadVideoOriginCgi", "on Md5 check, aeskey = %s, errType = %d, errCode = %d", str, Integer.valueOf(i), Integer.valueOf(i2));
        if (i == 0 && i2 == 0) {
            dVar.mo55210U(str);
            dVar.mo55212W(str);
            n0Var.f288575v = dVar.mo141118z();
            Log.m105925i("MicroMsg.NetSceneUploadVideoOriginCgi", "on Md5 check, recv xml = %s", n0Var.mo137705i());
        }
        vVar.mo137768l1(n0Var, dVar2, dVar3);
    }
}
