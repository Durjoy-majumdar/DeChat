package hy0;

import com.tencent.p014mm.plugin.brandservice.p028ui.widget.MPExoVideoWrapper;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import com.tencent.p014mm.sdk.platformtools.Log;
import in0.C87760d;
import in0.d$$l;

/* renamed from: hy0.h */
public final class C21023h implements d$$l {

    /* renamed from: a */
    public final /* synthetic */ MPExoVideoWrapper f59493a;

    public C21023h(MPExoVideoWrapper mPExoVideoWrapper) {
        this.f59493a = mPExoVideoWrapper;
    }

    /* renamed from: a */
    public final void mo17989a(C87760d dVar, int i, int i2) {
        MPExoVideoWrapper mPExoVideoWrapper = this.f59493a;
        if (!mPExoVideoWrapper.f51531z) {
            Log.m105924i("MicroMsg.MPExoVideoWrapper", "onMediaPlayerVideoSizeChanged, mp released");
            return;
        }
        Log.m105925i("MicroMsg.MPExoVideoWrapper", "onVideoSizeChanged, width:%d, height:%d", Integer.valueOf(i), Integer.valueOf(i2));
        mPExoVideoWrapper.getVideoDurationSec();
        C96814a.C57541b bVar = mPExoVideoWrapper.f51523t;
        if (bVar != null) {
            bVar.mo22964l0("", "", i, i2);
        }
        mPExoVideoWrapper.f51496J = i;
        mPExoVideoWrapper.f51497K = i2;
        mPExoVideoWrapper.f51512g.post(new C108273b(mPExoVideoWrapper));
    }
}
