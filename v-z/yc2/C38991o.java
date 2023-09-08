package yc2;

import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;
import pe3.C89349b;
import qe3.C47811h0;
import qe3.C47814k0;
import tc2.C118418g;
import te3.C51673vb0;
import te3.C51950xb0;
import uc2.C52525a;
import uc2.C52526b;

/* renamed from: yc2.o */
public class C38991o implements C11385n {
    /* renamed from: a */
    public final void mo61867a() {
        C86709a0.m107524d().mo123455a(3644, this);
        C86709a0.m107524d().mo123455a(3789, this);
        C86709a0.m107524d().mo123455a(836, this);
        C86709a0.m107524d().mo123455a(3944, this);
    }

    /* renamed from: b */
    public final void mo61868b() {
        C86709a0.m107524d().mo123470p(3644, this);
        C86709a0.m107524d().mo123470p(3789, this);
        C86709a0.m107524d().mo123470p(836, this);
        C86709a0.m107524d().mo123470p(3944, this);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C89349b bVar;
        C51673vb0 vb02;
        C89349b bVar2;
        C118418g gVar = C118418g.INSTANCE;
        Object[] objArr = new Object[4];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = Integer.valueOf(i2);
        objArr[2] = str;
        objArr[3] = Integer.valueOf(yVar == null ? -1 : yVar.getType());
        Log.m105924i("TrustRequestManager", String.format("onSceneEnd: errType = %s errCode = %s errMsg =  %s reqType = %s", objArr));
        if (i == 0 && i2 == 0) {
            if (yVar.getType() == 3644 || yVar.getType() == 3789) {
                C51950xb0 xb02 = ((C47814k0) ((C52526b) yVar).getReqResp().getRespObj()).f128378a;
                if (!(xb02 == null || (bVar = xb02.f144575d) == null)) {
                    byte[] f = bVar.mo123703f();
                    Log.m105919d("TrustRequestManager", "[debug] onScene end type:[init] dlen:[%d]", Integer.valueOf(f.length));
                    gVar.Yl0(f, 1, i2);
                }
            } else if (!((yVar.getType() != 836 && yVar.getType() != 3944) || (vb02 = ((C47811h0) ((C52525a) yVar).getReqResp().getRespObj()).f128372a) == null || (bVar2 = vb02.f143416d) == null)) {
                byte[] f2 = bVar2.mo123703f();
                Log.m105919d("TrustRequestManager", "[debug] onScene end type:[refesh] dlen:[%d]", Integer.valueOf(f2.length));
                gVar.Yl0(f2, 2, i2);
            }
        }
        if (i2 != 0) {
            gVar.Yl0((byte[]) null, 0, i2);
        }
        mo61868b();
    }
}
