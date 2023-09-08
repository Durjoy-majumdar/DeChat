package sb2;

import com.tencent.p014mm.plugin.p081mv.p082ui.uic.MusicMvMakerFixEditUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import hb2.C59811e;
import ub2.C65257a;

/* renamed from: sb2.v */
public final class C63866v implements C65257a.C65259b {

    /* renamed from: a */
    public final /* synthetic */ MusicMvMakerFixEditUIC f181049a;

    public C63866v(MusicMvMakerFixEditUIC musicMvMakerFixEditUIC) {
        this.f181049a = musicMvMakerFixEditUIC;
    }

    /* renamed from: a */
    public void mo80443a(int i) {
        Log.m105924i("MicroMsg.Mv.MusicMvMakerFixEditUIC", "onPageSettle: " + i + ", last " + this.f181049a.f163341p);
        MusicMvMakerFixEditUIC musicMvMakerFixEditUIC = this.f181049a;
        if (musicMvMakerFixEditUIC.f163341p != i) {
            musicMvMakerFixEditUIC.mo80479k3(i);
            MusicMvMakerFixEditUIC.m65737c3(this.f181049a, i);
            MusicMvMakerFixEditUIC musicMvMakerFixEditUIC2 = this.f181049a;
            MusicMvMakerFixEditUIC.C57043d dVar = musicMvMakerFixEditUIC2.f163343r;
            if (dVar != null) {
                C59811e eVar = musicMvMakerFixEditUIC2.f163333e.get(i);
                C87412m.m108593f(eVar, "dataList[position]");
                dVar.mo80400d(i, eVar);
            }
        }
    }
}
