package yx0;

import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C117747y;
import ob0.C47350c;
import ob0.l0$$e;
import pe3.C47465a;
import te3.C49981je2;
import zt3.C119157j;

/* renamed from: yx0.g */
public final class C53628g implements l0$$e {

    /* renamed from: d */
    public static final C53628g f150674d = new C53628g();

    /* renamed from: a */
    public final int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
        Log.m105924i("MicroMsg.TransferRequestTokenManager", "[transferRequest] h5Auth errType: " + i + ", errCode: " + i2 + ", errMsg: " + str);
        if (i == 0 && i2 == 0) {
            C47465a aVar = cVar.f127056b.f127083a;
            C49981je2 je22 = aVar instanceof C49981je2 ? (C49981je2) aVar : null;
            if (je22 != null) {
                C53625f fVar = C53625f.f150666a;
                ((C119157j) C119157j.f356862d).mo183876g(new C53630i(je22), "TransferRequestTokenManager");
                return 0;
            }
        }
        C53625f fVar2 = C53625f.f150666a;
        ((C119157j) C119157j.f356862d).mo183876g(C53629h.f150675d, "TransferRequestTokenManager");
        return 0;
    }
}
