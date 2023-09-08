package com.tencent.p014mm.pluginsdk.p133ui;

import android.os.Bundle;
import android.os.Message;
import com.tencent.p014mm.modelvoiceaddr.C92866b;
import com.tencent.p014mm.pluginsdk.p133ui.VoiceInputLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import java.util.List;

/* renamed from: com.tencent.mm.pluginsdk.ui.e */
public class C19495e implements C92866b.C68146d {

    /* renamed from: a */
    public final /* synthetic */ VoiceInputLayout f55120a;

    public C19495e(VoiceInputLayout voiceInputLayout) {
        this.f55120a = voiceInputLayout;
    }

    /* renamed from: a */
    public void mo21933a() {
        Log.m105918d("MicroMsg.VoiceInputLayout", "onRecognize Finish");
        this.f55120a.f55025o.removeMessages(0);
        this.f55120a.f55025o.removeMessages(1);
        VoiceInputLayout.C19473e eVar = this.f55120a.f55017d;
        if (eVar != null) {
            eVar.mo25256f();
        }
        this.f55120a.mo25245i(false);
    }

    /* renamed from: b */
    public void mo21934b(String[] strArr, List<String> list) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            Log.m105919d("SucconRes", "str: %s.", strArr[i]);
        }
        VoiceInputLayout.C19473e eVar = this.f55120a.f55017d;
        if (eVar != null) {
            eVar.mo25254d(strArr, list);
        }
        this.f55120a.f55025o.removeMessages(0);
        VoiceInputLayout voiceInputLayout = this.f55120a;
        voiceInputLayout.f55025o.sendEmptyMessageDelayed(0, (long) voiceInputLayout.f55022i);
    }

    /* renamed from: c */
    public void mo21935c(int i, int i2, int i3, long j) {
        this.f55120a.f55025o.removeMessages(0);
        this.f55120a.f55025o.removeMessages(1);
        Message message = new Message();
        Bundle bundle = new Bundle();
        bundle.putInt("localCode", i);
        bundle.putInt("errType", i2);
        bundle.putInt("errCode", i3);
        message.setData(bundle);
        message.what = 1;
        this.f55120a.f55026p.sendMessage(message);
    }

    /* renamed from: d */
    public void mo21936d() {
        Log.m105919d("MicroMsg.VoiceInputLayout", "onRecordFin() onRecordFin currentState = %s", Integer.valueOf(this.f55120a.f55020g));
        MTimerHandler mTimerHandler = this.f55120a.f55027q;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
        }
        this.f55120a.f55026p.sendEmptyMessage(0);
    }
}
