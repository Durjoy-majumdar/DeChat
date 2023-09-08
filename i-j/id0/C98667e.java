package id0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import hd0.C98389a1;
import hd0.C98398h0;
import hd0.C98447z0;
import ob0.C117747y;
import ob0.C35142u;

/* renamed from: id0.e */
public class C98667e implements C35142u {
    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        MMHandler mMHandler;
        C98447z0 Dx0 = C98398h0.Dx0();
        if (!Dx0.f288752e || (mMHandler = Dx0.f288751d) == null) {
            Log.m105920e("MicroMsg.VideoService", "onSceneEnd error!, handler or thread is null!");
        } else {
            mMHandler.post(new C98389a1(Dx0, yVar, i, i2));
        }
    }
}
