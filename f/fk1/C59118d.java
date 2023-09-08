package fk1;

import com.tencent.p014mm.live.core.view.LiveVideoView;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import rx3.C13598b0;
import up1.C37521f;
import wh1.C66114a;

/* renamed from: fk1.d */
public final class C59118d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C59119e f169093d;

    /* renamed from: e */
    public final /* synthetic */ LiveVideoView f169094e;

    /* renamed from: f */
    public final /* synthetic */ C32226l<Boolean, C13598b0> f169095f;

    public C59118d(C59119e eVar, LiveVideoView liveVideoView, C32226l<? super Boolean, C13598b0> lVar) {
        this.f169093d = eVar;
        this.f169094e = liveVideoView;
        this.f169095f = lVar;
    }

    public final void run() {
        Log.m105924i(this.f169093d.f181104e, "switchInLiveRoom switch view success. #2");
        C37521f.f99374d.getClass();
        boolean z = false;
        if (C37521f.f99135B6.mo60266n().intValue() == 1) {
            C37521f.f99374d.getClass();
            if (C37521f.f99578z6.mo60266n().intValue() == 1 && !C85875k4.m106157N() && !C85875k4.m106167X()) {
                z = true;
            }
        }
        if (z) {
            C66114a.f190029a.mo90155g(this.f169094e);
        }
        this.f169095f.invoke(Boolean.FALSE);
        this.f169093d.mo84332p();
        Log.m105924i(this.f169093d.f181104e, "switchInLiveRoom switch view success. #3");
    }
}
