package ha0;

import com.tencent.maas.camerafun.MJCamFunSession;
import com.tencent.maas.camerafun.MJRecordingFinishInfo;
import com.tencent.maas.instamovie.base.MJError;
import fy3.C32227p;
import ja0.C60784e;
import rx3.C13598b0;

/* renamed from: ha0.p */
public final class C108216p implements MJCamFunSession.OnStopRecording {

    /* renamed from: a */
    public final /* synthetic */ C32227p<MJRecordingFinishInfo, MJError, C13598b0> f324024a;

    public C108216p(C32227p<? super MJRecordingFinishInfo, ? super MJError, C13598b0> pVar) {
        this.f324024a = pVar;
    }

    public final void onStopRecording(MJRecordingFinishInfo mJRecordingFinishInfo, MJError mJError) {
        if (mJError != null) {
            C60784e eVar = C60784e.f173126a;
            eVar.mo85716a(mJError);
            eVar.mo85717b(4);
        }
        this.f324024a.invoke(mJRecordingFinishInfo, mJError);
    }
}
