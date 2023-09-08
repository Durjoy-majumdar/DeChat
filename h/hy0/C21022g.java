package hy0;

import com.tencent.p014mm.plugin.brandservice.p028ui.widget.MPExoVideoWrapper;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import in0.C87760d;
import in0.d$$k;
import kn0.C21365k;

/* renamed from: hy0.g */
public final class C21022g implements d$$k {

    /* renamed from: a */
    public final /* synthetic */ MPExoVideoWrapper f59492a;

    public C21022g(MPExoVideoWrapper mPExoVideoWrapper) {
        this.f59492a = mPExoVideoWrapper;
    }

    /* renamed from: a */
    public final void mo17988a(C87760d dVar) {
        MPExoVideoWrapper mPExoVideoWrapper = this.f59492a;
        mPExoVideoWrapper.f51512g.post(new C21028l(mPExoVideoWrapper));
        if (!mPExoVideoWrapper.f51531z) {
            Log.m105924i("MicroMsg.MPExoVideoWrapper", "onMediaPlayerSeekComplete, mp released");
            return;
        }
        Log.m105924i("MicroMsg.MPExoVideoWrapper", "onSeekComplete");
        mPExoVideoWrapper.mo23182d();
        mPExoVideoWrapper.mo23217r(mPExoVideoWrapper.f51488B || mPExoVideoWrapper.f51489C);
        mPExoVideoWrapper.mo23216q(mPExoVideoWrapper.getCurrPosSec());
        if (mPExoVideoWrapper.f51488B) {
            Log.m105924i("MicroMsg.MPExoVideoWrapper", "onSeekComplete, start when seek complete");
            mPExoVideoWrapper.f51488B = false;
            mPExoVideoWrapper.mo23214o();
            mPExoVideoWrapper.mo23213n();
            return;
        }
        C21365k kVar = mPExoVideoWrapper.f51522s;
        C87412m.m108591d(kVar);
        boolean isPlaying = kVar.isPlaying();
        if (mPExoVideoWrapper.f51489C) {
            C21365k kVar2 = mPExoVideoWrapper.f51522s;
            C87412m.m108591d(kVar2);
            C21365k kVar3 = mPExoVideoWrapper.f51522s;
            C87412m.m108591d(kVar3);
            Log.m105925i("MicroMsg.MPExoVideoWrapper", "onSeekComplete, video playing before seeking, isCurrentPlaying:%b, position:%s, duration:%s", Boolean.valueOf(isPlaying), Integer.valueOf(kVar2.getCurrentPosition()), Integer.valueOf(kVar3.getDuration()));
            mPExoVideoWrapper.f51489C = false;
            C21365k kVar4 = mPExoVideoWrapper.f51522s;
            C87412m.m108591d(kVar4);
            int currentPosition = kVar4.getCurrentPosition() / 1000;
            C21365k kVar5 = mPExoVideoWrapper.f51522s;
            C87412m.m108591d(kVar5);
            if (currentPosition < kVar5.getDuration() / 1000) {
                Log.m105924i("MicroMsg.MPExoVideoWrapper", "onSeekComplete, video not end");
                if (isPlaying) {
                    Log.m105924i("MicroMsg.MPExoVideoWrapper", "onSeekComplete, dispatch play again");
                    mPExoVideoWrapper.mo23207h();
                    return;
                }
                C21365k kVar6 = mPExoVideoWrapper.f51522s;
                C87412m.m108591d(kVar6);
                kVar6.start();
                return;
            }
            Log.m105924i("MicroMsg.MPExoVideoWrapper", "onSeekComplete, video ends");
            C21365k kVar7 = mPExoVideoWrapper.f51522s;
            C87412m.m108591d(kVar7);
            kVar7.pause();
            C21365k kVar8 = mPExoVideoWrapper.f51522s;
            C87412m.m108591d(kVar8);
            kVar8.start();
            return;
        }
        Log.m105925i("MicroMsg.MPExoVideoWrapper", "onSeekComplete, video not playing before seeking, isCurrentPlaying:%b", Boolean.valueOf(isPlaying));
        if (!isPlaying) {
            Log.m105924i("MicroMsg.MPExoVideoWrapper", "onSeekComplete, dispatch pause again");
            mPExoVideoWrapper.mo23186g();
        }
    }
}
