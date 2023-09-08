package hk1;

import com.tencent.rtmp.TXLivePlayer;
import nc3.C34767b;

/* renamed from: hk1.f */
public final class C59937f implements C34767b.C21622a {

    /* renamed from: a */
    public final /* synthetic */ C59932c f171053a;

    public C59937f(C59932c cVar) {
        this.f171053a = cVar;
    }

    /* renamed from: a */
    public void mo17997a(boolean z) {
        TXLivePlayer tXLivePlayer = this.f171053a.f171043h;
        if (tXLivePlayer != null) {
            tXLivePlayer.setMute(true);
        }
    }

    public void onResume() {
        TXLivePlayer tXLivePlayer = this.f171053a.f171043h;
        if (tXLivePlayer != null) {
            tXLivePlayer.setMute(false);
        }
    }

    public void onStop() {
        TXLivePlayer tXLivePlayer = this.f171053a.f171043h;
        if (tXLivePlayer != null) {
            tXLivePlayer.setMute(true);
        }
    }
}
