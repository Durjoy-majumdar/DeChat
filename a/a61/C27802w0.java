package a61;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import f40.C86709a0;
import j61.C98910u;
import ob0.C117747y;
import ob0.C35142u;
import p441aq.C92054g;

/* renamed from: a61.w0 */
public class C27802w0 implements C35142u {
    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (C86709a0.m107522a()) {
            Log.m105925i("MicroMsg.EmojiFeatureService", "errType %d,errCode %d,errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), str);
            if (yVar instanceof C98910u) {
                ((C92054g) C86312j.m106911c(C92054g.class)).Ax0(i, i2);
                return;
            }
            return;
        }
        Log.m105929w("MicroMsg.EmojiFeatureService", "received onSceneEnd when account was not ready, errType %d,errCode %d,errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), str);
    }
}
