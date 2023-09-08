package p598lq;

import com.tencent.p014mm.sdk.platformtools.Log;
import ma1.C117543a;
import ma1.C46977e;
import ob0.C117747y;
import ob0.C35142u;

/* renamed from: lq.a */
public class C34327a implements C35142u {
    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C117543a Cx0 = C117543a.Cx0();
        Cx0.getClass();
        Log.m105925i("MicroMsg.ExptService.Write", "scene[%d] errType[%d] errCode[%d] errMsg[%s]", Integer.valueOf(yVar.hashCode()), Integer.valueOf(i), Integer.valueOf(i2), str);
        if (yVar instanceof C46977e) {
            Cx0.f351661g = 0;
            Cx0.f351660f = 0;
        }
    }
}
