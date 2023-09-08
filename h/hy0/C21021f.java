package hy0;

import com.tencent.p014mm.plugin.brandservice.p028ui.widget.MPExoVideoWrapper;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import com.tencent.p014mm.sdk.platformtools.Log;
import in0.C87760d;
import in0.d$$d;

/* renamed from: hy0.f */
public final class C21021f implements d$$d {

    /* renamed from: a */
    public final /* synthetic */ MPExoVideoWrapper f59491a;

    public C21021f(MPExoVideoWrapper mPExoVideoWrapper) {
        this.f59491a = mPExoVideoWrapper;
    }

    /* renamed from: a */
    public final void mo17987a(C87760d dVar) {
        MPExoVideoWrapper mPExoVideoWrapper = this.f59491a;
        if (!mPExoVideoWrapper.f51531z) {
            Log.m105924i("MicroMsg.MPExoVideoWrapper", "onMediaPlayerCompletion, mp released");
            return;
        }
        Log.m105924i("MicroMsg.MPExoVideoWrapper", "onCompletion");
        C96814a.C57541b bVar = mPExoVideoWrapper.f51523t;
        if (bVar != null) {
            bVar.mo22958L("", "");
        }
        Log.m105924i("MicroMsg.MPExoVideoWrapper", "onCompletion, video end playing");
        mPExoVideoWrapper.f51499M = false;
        mPExoVideoWrapper.f51495I = true;
        mPExoVideoWrapper.mo23217r(false);
        mPExoVideoWrapper.mo23215p();
        mPExoVideoWrapper.mo23211l(0, false);
    }
}
