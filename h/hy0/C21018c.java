package hy0;

import com.tencent.p014mm.plugin.brandservice.p028ui.widget.MPExoVideoWrapper;
import com.tencent.p014mm.sdk.platformtools.Log;
import in0.C87760d;
import in0.d$$i;
import kn0.C21365k;

/* renamed from: hy0.c */
public final class C21018c implements d$$i {

    /* renamed from: a */
    public final /* synthetic */ MPExoVideoWrapper f59488a;

    public C21018c(MPExoVideoWrapper mPExoVideoWrapper) {
        this.f59488a = mPExoVideoWrapper;
    }

    /* renamed from: a */
    public final boolean mo17984a(C87760d dVar, int i, int i2) {
        MPExoVideoWrapper mPExoVideoWrapper = this.f59488a;
        if (!mPExoVideoWrapper.f51531z) {
            Log.m105924i("MicroMsg.MPExoVideoWrapper", "onMediaPlayerInfo, mp released");
        } else {
            Log.m105925i("MicroMsg.MPExoVideoWrapper", "onInfo, what:%d, extra:%d", Integer.valueOf(i), Integer.valueOf(i2));
            if (i == 701) {
                C21365k kVar = mPExoVideoWrapper.f51522s;
                if (kVar != null) {
                    mPExoVideoWrapper.f51490D = kVar.isPlaying();
                }
                Log.m105925i("MicroMsg.MPExoVideoWrapper", "onInfo, buffering start, isPlayingBeforeBuffering:%b", Boolean.valueOf(mPExoVideoWrapper.f51490D));
                mPExoVideoWrapper.mo23212m();
            } else if (i == 702) {
                C21365k kVar2 = mPExoVideoWrapper.f51522s;
                boolean isPlaying = kVar2 != null ? kVar2.isPlaying() : false;
                Log.m105925i("MicroMsg.MPExoVideoWrapper", "onInfo, buffering end, isPlayingBeforeBuffering:%b, isCurrentPlaying", Boolean.valueOf(mPExoVideoWrapper.f51490D), Boolean.valueOf(isPlaying));
                if (mPExoVideoWrapper.f51490D) {
                    mPExoVideoWrapper.f51490D = false;
                    if (isPlaying) {
                        Log.m105924i("MicroMsg.MPExoVideoWrapper", "onInfo, buffering end, notify video play");
                        mPExoVideoWrapper.mo23207h();
                    }
                } else if (!isPlaying) {
                    Log.m105924i("MicroMsg.MPExoVideoWrapper", "onInfo, buffering end, notify video pause");
                    mPExoVideoWrapper.mo23186g();
                }
                mPExoVideoWrapper.mo23182d();
            } else if (i2 == -1004) {
                Log.m105925i("MicroMsg.MPExoVideoWrapper", "onInfo, special error, what:%d, extra:%d", Integer.valueOf(i), Integer.valueOf(i2));
                mPExoVideoWrapper.mo23184f(i, i2);
            }
        }
        return false;
    }
}
