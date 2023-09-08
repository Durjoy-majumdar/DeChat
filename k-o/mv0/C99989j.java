package mv0;

import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C97625j3;
import nv0.C47301e;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: mv0.j */
public class C99989j implements C11385n {

    /* renamed from: d */
    public final /* synthetic */ Runnable f292956d;

    /* renamed from: e */
    public final /* synthetic */ Runnable f292957e;

    /* renamed from: f */
    public final /* synthetic */ C99990k f292958f;

    public C99989j(C99990k kVar, Runnable runnable, Runnable runnable2) {
        this.f292958f = kVar;
        this.f292956d = runnable;
        this.f292957e = runnable2;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C99990k kVar = this.f292958f;
        if (yVar != kVar.f292965j) {
            Log.m105928w("MicroMsg.BakPcProcessMgr", "last canceded scene");
            return;
        }
        if (i == 0 && i2 == 0) {
            Log.m105924i("MicroMsg.BakPcProcessMgr", "getPcPwd OK");
            C99980a.m130643h().f303746f = ((C47301e) yVar).f126955g;
            this.f292956d.run();
        } else {
            kVar.mo139330b(10010, new String("getPcPwd Fail"));
            Log.m105924i("MicroMsg.BakPcProcessMgr", "getPcPwd Fail");
            this.f292957e.run();
        }
        C97625j3.m125815e().mo123470p(596, this);
    }
}
