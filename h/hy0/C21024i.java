package hy0;

import com.tencent.p014mm.plugin.brandservice.p028ui.widget.MPExoVideoWrapper;
import com.tencent.p014mm.sdk.platformtools.Log;
import in0.C87760d;
import in0.d$$c;

/* renamed from: hy0.i */
public final class C21024i implements d$$c {

    /* renamed from: a */
    public final /* synthetic */ MPExoVideoWrapper f59494a;

    public C21024i(MPExoVideoWrapper mPExoVideoWrapper) {
        this.f59494a = mPExoVideoWrapper;
    }

    /* renamed from: a */
    public final void mo17990a(C87760d dVar, int i) {
        MPExoVideoWrapper mPExoVideoWrapper = this.f59494a;
        if (!mPExoVideoWrapper.f51531z) {
            Log.m105924i("MicroMsg.MPExoVideoWrapper", "onMediaPlayerBufferingUpdate, mp released");
            return;
        }
        if (i != mPExoVideoWrapper.f51498L) {
            mPExoVideoWrapper.f51498L = i;
            Log.m105925i("MicroMsg.MPExoVideoWrapper", "onBufferingUpdate, percent:%s", Integer.valueOf(i));
        }
        if (mPExoVideoWrapper.f51494H) {
            mPExoVideoWrapper.f51528x0 = i;
        }
    }
}
