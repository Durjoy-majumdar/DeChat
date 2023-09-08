package com.tencent.p014mm.plugin.voiceprint.p118ui;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import k33.C117381q;
import kd0.C99125s;

/* renamed from: com.tencent.mm.plugin.voiceprint.ui.BaseVoicePrintUI$$c */
public class BaseVoicePrintUI$$c implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ BaseVoicePrintUI f347503d;

    public BaseVoicePrintUI$$c(BaseVoicePrintUI baseVoicePrintUI) {
        this.f347503d = baseVoicePrintUI;
    }

    public boolean onTimerExpired() {
        int i;
        C117381q qVar = this.f347503d.f347491i;
        if (qVar == null) {
            return true;
        }
        C99125s sVar = qVar.f351416a;
        if (sVar != null) {
            int d = sVar.mo107471d();
            if (d > C117381q.f351415i) {
                C117381q.f351415i = d;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(" map: ");
            sb.append(d);
            sb.append(" max:");
            sb.append(C117381q.f351415i);
            sb.append(" per:");
            int i2 = d * 100;
            sb.append(i2 / C117381q.f351415i);
            Log.m105918d("MicroMsg.VoicePrintRecoder", sb.toString());
            i = i2 / C117381q.f351415i;
        } else {
            i = 0;
        }
        BaseVoicePrintUI baseVoicePrintUI = this.f347503d;
        float f = (float) i;
        if (f < 10.0f) {
            f = 10.0f;
        }
        if (f > 100.0f) {
            f = 100.0f;
        }
        baseVoicePrintUI.f347489g.setVolume(f / 100.0f);
        return true;
    }
}
