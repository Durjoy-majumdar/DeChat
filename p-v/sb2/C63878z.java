package sb2;

import com.tencent.p014mm.plugin.p081mv.p082ui.uic.MusicMvMakerFixEditUIC;
import hb2.C59811e;
import hb2.C59826g;

/* renamed from: sb2.z */
public final class C63878z implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MusicMvMakerFixEditUIC f181079d;

    /* renamed from: e */
    public final /* synthetic */ int f181080e;

    /* renamed from: f */
    public final /* synthetic */ C59811e f181081f;

    public C63878z(MusicMvMakerFixEditUIC musicMvMakerFixEditUIC, int i, C59811e eVar) {
        this.f181079d = musicMvMakerFixEditUIC;
        this.f181080e = i;
        this.f181081f = eVar;
    }

    public final void run() {
        MusicMvMakerFixEditUIC.C57043d dVar = this.f181079d.f163343r;
        if (dVar != null) {
            dVar.mo80397a();
        }
        MusicMvMakerFixEditUIC.C57043d dVar2 = this.f181079d.f163343r;
        if (dVar2 != null) {
            dVar2.mo80398b(this.f181080e, this.f181081f, true, (C59826g) null);
        }
    }
}
