package b40;

import a40.C79462a;
import com.tencent.p014mm.kara.localfewshotlearning.xgb.XGBoost;
import x30.C91137a;
import x30.C91138b;
import y30.C91370a;

/* renamed from: b40.a */
public abstract class C79666a extends C79462a {

    /* renamed from: b */
    public C91370a f233576b;

    /* renamed from: c */
    public C91137a f233577c;

    public C79666a(C91370a aVar) {
        this.f233576b = aVar;
    }

    /* renamed from: d */
    public void mo109458d() {
        synchronized (this) {
            C91137a aVar = this.f233577c;
            if (aVar != null) {
                long j = ((C91138b) aVar).f261356b;
                if (j > 0) {
                    XGBoost.destoryModel(j);
                }
            }
        }
    }
}
