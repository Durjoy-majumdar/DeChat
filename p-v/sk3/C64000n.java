package sk3;

import android.widget.ProgressBar;
import androidx.lifecycle.C0120a0;
import bl3.C39818r;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import p157gk.C59479c;
import rk3.C63462a;

/* renamed from: sk3.n */
public final class C64000n<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C63995m f181443d;

    public C64000n(C63995m mVar) {
        this.f181443d = mVar;
    }

    public void onChanged(Object obj) {
        C59479c cVar = (C59479c) obj;
        Log.m105924i("MicroMsg.FTSMultiImageUIC", "initIdentifyObserver >> change type " + cVar + ", " + Thread.currentThread() + ", " + this.f181443d.f181436q);
        C59479c cVar2 = C59479c.STOP;
        if (cVar == cVar2 && this.f181443d.f181436q == C59479c.RUNNING) {
            C63462a aVar = C63462a.f180011a;
            Log.m105924i("MicroMsg.FTSMultiReporter", "setImageLoadingFinish before >> " + C63462a.f180021k + ", " + C63462a.f180022l);
            C63462a.f180021k = System.currentTimeMillis();
            C63462a.f180023m = true;
            Log.m105924i("MicroMsg.FTSMultiReporter", "setImageLoadingFinish after >> " + C63462a.f180021k + ", " + C63462a.f180018h + ", " + C63462a.f180013c);
            C39818r rVar = C39818r.f106831a;
            ((C64024v) rVar.mo62444c(this.f181443d.getActivity()).mo75002a(C64024v.class)).mo88784j3(cVar2);
            C64009r0 r0Var = (C64009r0) rVar.mo62444c(this.f181443d.getActivity()).mo75002a(C64009r0.class);
            r0Var.getClass();
            Log.m105924i("MicroMsg.FTSMultiTabViewUIC", "setImageTabToShowDone");
            if (!r0Var.f181473w) {
                Log.m105924i("MicroMsg.FTSMultiTabViewUIC", "setImageTabToShowDone >> when done is no query");
                ProgressBar progressBar = r0Var.f181463j;
                if (progressBar != null) {
                    progressBar.setVisibility(8);
                }
            }
        }
        C63995m mVar = this.f181443d;
        C87412m.m108593f(cVar, LocaleUtil.ITALIAN);
        mVar.getClass();
        mVar.f181436q = cVar;
    }
}
