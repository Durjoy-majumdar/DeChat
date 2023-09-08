package p375qh;

import com.tencent.p014mm.sdk.platformtools.Log;
import kd0.C76552z;
import ob0.C77002r;

/* renamed from: qh.m */
public class C77345m implements C77002r.C77003a {

    /* renamed from: a */
    public final /* synthetic */ C77340l f225519a;

    public C77345m(C77340l lVar) {
        this.f225519a = lVar;
    }

    /* renamed from: a */
    public void mo95814a() {
        this.f225519a.mo107475k();
        Log.m105920e("MicroMsg.SceneVoice.Recorder", "Record Failed file:" + this.f225519a.f225499e);
        C76552z.m92064b(this.f225519a.f225499e);
        C77002r.C77003a aVar = this.f225519a.f225510p;
        if (aVar != null) {
            aVar.mo95814a();
        }
    }
}
