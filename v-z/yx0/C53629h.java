package yx0;

import com.tencent.p014mm.sdk.platformtools.Log;
import yx0.C53613a;

/* renamed from: yx0.h */
public final class C53629h implements Runnable {

    /* renamed from: d */
    public static final C53629h f150675d = new C53629h();

    public final void run() {
        Log.m105920e("MicroMsg.TransferRequestTokenManager", "[transferRequest] h5Auth onGetTokenFailed");
        C53625f.f150669d = false;
        C53625f.f150666a.mo74237a();
        for (C53613a.C53614a a : C53625f.f150668c) {
            a.mo74239a((C53613a.C53615b) null);
        }
        C53625f.f150668c.clear();
    }
}
