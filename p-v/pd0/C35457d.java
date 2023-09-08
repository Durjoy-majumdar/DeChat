package pd0;

import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: pd0.d */
public class C35457d implements C11385n {
    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C86709a0.m107524d().mo123470p(228, this);
        if (yVar instanceof C35454a) {
            Log.m105925i("MicroMsg.NewVoiceInputReportManager", "onSceneEnd errType = %s, errCode = %s, errMsg = %s ", Integer.valueOf(i), Integer.valueOf(i2), str);
        }
    }
}
