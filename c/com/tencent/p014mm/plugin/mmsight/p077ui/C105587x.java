package com.tencent.p014mm.plugin.mmsight.p077ui;

import android.os.Looper;
import com.tencent.p014mm.plugin.mmsight.p077ui.C105562q;
import com.tencent.p014mm.plugin.mmsight.segment.C105475a;
import com.tencent.p014mm.plugin.mmsight.segment.RecyclerThumbSeekBar;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.plugin.mmsight.ui.x */
public class C105587x implements C105475a {

    /* renamed from: a */
    public final /* synthetic */ C105562q f314035a;

    /* renamed from: com.tencent.mm.plugin.mmsight.ui.x$a */
    public class C105588a implements Runnable {
        public C105588a() {
        }

        public void run() {
            C89779i0 i0Var = C105587x.this.f314035a.f313996o;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            C105562q.C105564b bVar = C105587x.this.f314035a.f313997p;
            if (bVar != null) {
                bVar.mo150277a();
            }
        }
    }

    public C105587x(C105562q qVar) {
        this.f314035a = qVar;
    }

    /* renamed from: a */
    public void mo139259a(boolean z) {
        if (z) {
            Log.m105920e("MicroMsg.MMSightVideoEditor", "Not Supported init SegmentSeekBar failed.");
            MMHandlerThread.postToMainThread(new C105588a());
            return;
        }
        C105562q qVar = this.f314035a;
        RecyclerThumbSeekBar recyclerThumbSeekBar = qVar.f313982a;
        if (recyclerThumbSeekBar != null) {
            qVar.f313984c = recyclerThumbSeekBar.getDurationMs();
            Log.m105925i("MicroMsg.MMSightVideoEditor", "thumbSeekBar onPrepared success %d", Integer.valueOf(this.f314035a.f313984c));
            try {
                C105562q qVar2 = this.f314035a;
                if (qVar2.f313989h != null) {
                    qVar2.f313985d = Math.round(((float) qVar2.f313984c) * qVar2.f313982a.mo150234c());
                    C105562q qVar3 = this.f314035a;
                    qVar3.f313986e = Math.round(((float) qVar3.f313984c) * qVar3.f313982a.mo150233b());
                    C105562q qVar4 = this.f314035a;
                    if (qVar4.f313986e <= 0) {
                        int i = qVar4.f313984c;
                        int i2 = qVar4.f314000s.f267170h;
                        if (i <= (i2 * 1000) + 500) {
                            qVar4.f313986e = i;
                        } else {
                            qVar4.f313986e = i2 * 1000;
                        }
                    }
                    Log.m105925i("MicroMsg.MMSightVideoEditor", "thumbSeekBar onPrepared, start: %s, end: %s, duration: %s", Integer.valueOf(qVar4.f313985d), Integer.valueOf(this.f314035a.f313986e), Integer.valueOf(this.f314035a.f313984c));
                }
                C105562q qVar5 = this.f314035a;
                qVar5.getClass();
                MTimerHandler mTimerHandler = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C105517a0(qVar5), true);
                qVar5.f313988g = mTimerHandler;
                mTimerHandler.startTimer(20);
            } catch (Exception unused) {
            }
        }
    }
}
