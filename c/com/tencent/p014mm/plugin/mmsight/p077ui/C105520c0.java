package com.tencent.p014mm.plugin.mmsight.p077ui;

import com.tencent.p014mm.plugin.mmsight.p077ui.C105522d0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.mmsight.ui.c0 */
public class C105520c0 implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ C105522d0 f313904d;

    public C105520c0(C105522d0 d0Var) {
        this.f313904d = d0Var;
    }

    public boolean onTimerExpired() {
        C105522d0 d0Var = this.f313904d;
        float ticksToNow = ((((float) Util.ticksToNow(d0Var.f313913e)) / ((float) d0Var.f313915g)) * 100.0f) + d0Var.f313911c;
        d0Var.f313914f = ticksToNow;
        C105522d0.C105523a aVar = d0Var.f313917i;
        if (aVar != null) {
            C105546n nVar = (C105546n) aVar;
            if (ticksToNow <= 100.0f) {
                MMSightCircularProgressBar mMSightCircularProgressBar = nVar.f313954a;
                mMSightCircularProgressBar.f313762q = ticksToNow;
                if (mMSightCircularProgressBar.f313769x != null) {
                    mMSightCircularProgressBar.f313771z.clear();
                    MMSightCircularProgressBar mMSightCircularProgressBar2 = nVar.f313954a;
                    mMSightCircularProgressBar2.f313771z.addAll(mMSightCircularProgressBar2.f313770y);
                    MMSightCircularProgressBar mMSightCircularProgressBar3 = nVar.f313954a;
                    mMSightCircularProgressBar3.f313771z.add(Float.valueOf(mMSightCircularProgressBar3.f313762q));
                    MMSightCircularProgressBar mMSightCircularProgressBar4 = nVar.f313954a;
                    mMSightCircularProgressBar4.f313769x.mo128043b(mMSightCircularProgressBar4.f313771z);
                }
                nVar.f313954a.invalidate();
            }
        }
        C105522d0 d0Var2 = this.f313904d;
        if (d0Var2.f313916h) {
            float f = d0Var2.f313914f;
            if (f < d0Var2.f313912d) {
                return true;
            }
            d0Var2.f313916h = false;
            Log.m105925i("MicroMsg.ProgressHandlerAnimator", "reach end, currentValue: %s, end: %s, callback: %s", Float.valueOf(f), Float.valueOf(this.f313904d.f313912d), this.f313904d.f313917i);
            C105522d0.C105523a aVar2 = this.f313904d.f313917i;
            if (aVar2 != null) {
                C105546n nVar2 = (C105546n) aVar2;
                Log.m105925i("MicroMsg.MMSightCircularProgressBar", "onAnimationEnd %b", Boolean.valueOf(nVar2.f313954a.f313749A));
                MMHandlerThread.postToMainThread(new C105543m(nVar2));
            }
            return false;
        }
        Log.m105924i("MicroMsg.ProgressHandlerAnimator", "isStart is false now");
        return false;
    }
}
