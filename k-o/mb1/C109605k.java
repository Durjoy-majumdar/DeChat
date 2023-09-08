package mb1;

import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import jb1.C108680a;
import jb1.C108696c;
import jb1.C108697d;

/* renamed from: mb1.k */
public class C109605k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f328146d;

    /* renamed from: e */
    public final /* synthetic */ VideoTransPara f328147e;

    /* renamed from: f */
    public final /* synthetic */ byte[][] f328148f;

    /* renamed from: g */
    public final /* synthetic */ C117545m f328149g;

    public C109605k(C117545m mVar, int i, VideoTransPara videoTransPara, byte[][] bArr) {
        this.f328149g = mVar;
        this.f328146d = i;
        this.f328147e = videoTransPara;
        this.f328148f = bArr;
    }

    public void run() {
        C108680a e = C108680a.m147401e();
        e.f325471c.postToWorker(new C108696c(e, this.f328146d));
        C108680a e2 = C108680a.m147401e();
        e2.f325471c.postToWorker(new C108697d(e2, (float) this.f328147e.f267168f));
        C117545m mVar = this.f328149g;
        byte[][] bArr = this.f328148f;
        mVar.getClass();
        C109603j jVar = C109603j.f328125A;
        C109606l lVar = new C109606l(mVar, bArr);
        MMHandler mMHandler = jVar.f328139t;
        if (mMHandler != null) {
            mMHandler.post(lVar);
        }
    }
}
