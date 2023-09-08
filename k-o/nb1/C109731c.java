package nb1;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.facedetectaction.p046ui.FaceActionUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob1.C110011a;

/* renamed from: nb1.c */
public class C109731c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f328442d;

    /* renamed from: e */
    public final /* synthetic */ String f328443e;

    /* renamed from: f */
    public final /* synthetic */ C109734f f328444f;

    public C109731c(C109734f fVar, int i, String str) {
        this.f328444f = fVar;
        this.f328442d = i;
        this.f328443e = str;
    }

    public void run() {
        FaceActionUI faceActionUI = this.f328444f.f328448a;
        faceActionUI.f312691x = this.f328442d;
        faceActionUI.f312692y = this.f328443e;
        Log.m105918d("MicroMsg.FaceActionUI", "initCamera");
        C110011a aVar = new C110011a(faceActionUI, faceActionUI.f312665A);
        faceActionUI.f312693z = aVar;
        aVar.f329254y = faceActionUI.f312682o;
        aVar.f329255z = faceActionUI.f312679i;
        aVar.f329220A = faceActionUI.f312678h;
        aVar.f329248s = faceActionUI.f312691x;
        aVar.f329249t = faceActionUI.f312692y;
        aVar.f329223D = faceActionUI.f312684q;
        aVar.f329222C = faceActionUI.f312681n;
        aVar.mo161351g(faceActionUI.f312680j);
        faceActionUI.f312693z.mo161352h();
        FaceActionUI faceActionUI2 = this.f328444f.f328448a;
        faceActionUI2.getClass();
        Log.m105924i("MicroMsg.FaceActionUI", "preview");
        C110011a aVar2 = faceActionUI2.f312693z;
        if (aVar2 != null) {
            aVar2.f329246q = true;
            Log.m105924i("MicroMsg.FaceActionUI", "mCamera ！= null");
        }
        faceActionUI2.f312682o.setText(C0966R.string.ckb);
        this.f328444f.f328448a.f312668D++;
    }
}
