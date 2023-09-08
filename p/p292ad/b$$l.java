package p292ad;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: ad.b$$l */
public final /* synthetic */ class b$$l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C79502b f233127d;

    public /* synthetic */ b$$l(C79502b bVar) {
        this.f233127d = bVar;
    }

    public final void run() {
        C79502b bVar = this.f233127d;
        Log.m105924i(bVar.mo109516v(), "muteIfIsUnMuted, set passive mute");
        bVar.f233112z = true;
    }
}
