package com.tencent.p014mm.pluginsdk.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMKVSlotManager;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import ex0.C45695b;
import gy3.C87412m;

/* renamed from: com.tencent.mm.pluginsdk.model.c */
public final class C44591c implements C45695b {

    /* renamed from: a */
    public final int f120901a;

    /* renamed from: b */
    public MTimerHandler f120902b;

    /* renamed from: com.tencent.mm.pluginsdk.model.c$a */
    public static final class C44592a implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ C44591c f120903d;

        /* renamed from: e */
        public final /* synthetic */ String f120904e;

        public C44592a(C44591c cVar, String str) {
            this.f120903d = cVar;
            this.f120904e = str;
        }

        public final boolean onTimerExpired() {
            C44591c cVar = this.f120903d;
            String str = this.f120904e;
            cVar.getClass();
            C87412m.m108594g(str, "bizUserName");
            Log.m105918d("MicroMsg.BizFinderLiveChecker", "checkBizFinderLives");
            C19428d.f54856a.mo25167a(str, false, cVar.f120901a, new C44589b(cVar));
            return true;
        }
    }

    public C44591c(int i) {
        this.f120901a = i;
    }

    /* renamed from: a */
    public void mo69386a(String str) {
        if (str != null && this.f120902b == null) {
            int decodeInt$default = MMKVSlotManager.decodeInt$default(C19428d.f54858c, C19428d.f54856a.mo25154G(str), 0, 2, (Object) null);
            if (decodeInt$default < 10) {
                decodeInt$default = 10;
            }
            long j = ((long) (decodeInt$default * 1000)) / 2;
            Log.m105918d("MicroMsg.BizFinderLiveChecker", "startCheck interval = " + j);
            MTimerHandler mTimerHandler = new MTimerHandler(str + "-live-UpdateTimer", (MTimerHandler.CallBack) new C44592a(this, str), true);
            this.f120902b = mTimerHandler;
            mTimerHandler.startTimer(0, j);
        }
    }

    public void stopCheck() {
        if (this.f120902b != null) {
            Log.m105918d("MicroMsg.BizFinderLiveChecker", "stopCheck");
            MTimerHandler mTimerHandler = this.f120902b;
            if (mTimerHandler != null) {
                mTimerHandler.stopTimer();
            }
            this.f120902b = null;
        }
    }
}
