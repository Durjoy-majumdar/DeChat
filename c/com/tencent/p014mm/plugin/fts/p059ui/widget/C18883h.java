package com.tencent.p014mm.plugin.fts.p059ui.widget;

import android.os.Bundle;
import android.os.Message;
import com.tencent.p014mm.modelvoiceaddr.C17800a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.fts.ui.widget.h */
public class C18883h implements C17800a.C17801a {

    /* renamed from: a */
    public final /* synthetic */ VoiceInputLayout f52939a;

    public C18883h(VoiceInputLayout voiceInputLayout) {
        this.f52939a = voiceInputLayout;
    }

    /* renamed from: a */
    public void mo21933a() {
        Log.m105918d("MicroMsg.VoiceInputLayout", "onRecognize Finish");
        this.f52939a.f52897n.removeMessages(0);
        this.f52939a.f52897n.removeMessages(1);
        this.f52939a.f52890d.mo23873f();
        this.f52939a.mo23863k(false);
    }

    /* renamed from: b */
    public void mo21934b(String[] strArr, List<String> list) {
        this.f52939a.f52890d.mo23871d(strArr, list);
        this.f52939a.f52897n.removeMessages(0);
        VoiceInputLayout voiceInputLayout = this.f52939a;
        voiceInputLayout.f52897n.sendEmptyMessageDelayed(0, (long) voiceInputLayout.f52894h);
    }

    /* renamed from: c */
    public void mo21935c(int i, int i2, int i3, long j) {
        this.f52939a.f52897n.removeMessages(0);
        this.f52939a.f52897n.removeMessages(1);
        Message message = new Message();
        Bundle bundle = new Bundle();
        bundle.putInt("localCode", i);
        bundle.putInt("errType", i2);
        bundle.putInt("errCode", i3);
        message.setData(bundle);
        message.what = 1;
        this.f52939a.f52898o.sendMessage(message);
    }

    /* renamed from: d */
    public void mo21936d() {
        Log.m105919d("MicroMsg.VoiceInputLayout", "onRecordFin() onRecordFin currentState = %s", Integer.valueOf(this.f52939a.f52892f));
        MTimerHandler mTimerHandler = this.f52939a.f52899p;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
        }
        this.f52939a.f52898o.sendEmptyMessage(0);
    }
}
