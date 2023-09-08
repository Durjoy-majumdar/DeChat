package oz0;

import com.tencent.p014mm.sdk.platformtools.Log;
import hz0.C46153l0;
import pz0.C47721j;

/* renamed from: oz0.c */
public class C47410c implements Runnable {
    public void run() {
        Log.m105924i("MicroMsg.ShareCardDataMgr", "begin to delelteAllIllegalStatusCard()");
        C47721j Lx0 = C46153l0.Lx0();
        Lx0.getClass();
        boolean execSQL = Lx0.f128213d.execSQL("ShareCardInfo", "delete from ShareCardInfo where (status=1 OR status=2 OR status=3 OR status=4 OR status=6)");
        Log.m105924i("MicroMsg.ShareCardInfoStorage", "delelteAllIllegalStatusCard updateRet is " + (execSQL ? 1 : 0));
        Log.m105924i("MicroMsg.ShareCardDataMgr", "end to delelteAllIllegalStatusCard()");
    }
}
