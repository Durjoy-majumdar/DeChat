package j12;

import com.tencent.p014mm.plugin.ipcall.model.C105385g;
import com.tencent.p014mm.plugin.ipcall.p065ui.C105420i2;
import com.tencent.p014mm.plugin.voip.model.C106336d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import l12.C109121b;
import l12.C109124d;
import m12.C109468b;
import ou0.C110070b;
import p206nj.C100115c;
import pu0.C110248b;
import qu0.C110472b;

/* renamed from: j12.a */
public final class C108528a extends C110070b {

    /* renamed from: l */
    public C108529a f324867l;

    /* renamed from: m */
    public C109121b f324868m = new C109121b(this);

    /* renamed from: n */
    public C109124d f324869n = new C109124d();

    /* renamed from: o */
    public final C100115c f324870o;

    /* renamed from: p */
    public boolean f324871p;

    /* renamed from: q */
    public boolean f324872q;

    /* renamed from: r */
    public boolean f324873r;

    /* renamed from: j12.a$a */
    public interface C108529a {
    }

    public C108528a() {
        C100115c cVar = new C100115c(MMApplicationContext.getContext());
        this.f324870o = cVar;
        mo157512y();
        cVar.mo139415b();
        C110248b.f329777h.mo161664i(this, "ipcall");
    }

    /* renamed from: R */
    public void mo18021R(int i) {
        C108529a aVar;
        C108529a aVar2;
        C108529a aVar3;
        C108529a aVar4;
        super.mo18021R(i);
        switch (i) {
            case 1:
            case 3:
            case 6:
            case 7:
                if (!mo161474P(3) && (aVar = this.f324867l) != null) {
                    ((C105420i2) aVar).mo150162d(false);
                    return;
                }
                return;
            case 2:
                if (C110472b.f330365a.mo161951b() && (aVar2 = this.f324867l) != null && aVar2 != null) {
                    ((C105420i2) aVar2).mo150162d(true);
                    return;
                }
                return;
            case 8:
                Log.m105924i("MicroMsg.IPCallAudioManager", "onHeadsetPlug connected");
                if (!mo161474P(4) && (aVar3 = this.f324867l) != null) {
                    ((C105420i2) aVar3).mo150163e(true);
                    return;
                }
                return;
            case 9:
                Log.m105924i("MicroMsg.IPCallAudioManager", "onHeadsetPlug disconnect");
                if (!mo161474P(4) && (aVar4 = this.f324867l) != null) {
                    ((C105420i2) aVar4).mo150163e(false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: n */
    public void mo18028n(boolean z) {
        C109121b bVar = this.f324868m;
        if (bVar != null) {
            Log.m105925i("MicroMsg.IPCallAudioPlayer", "setSpeakerPhoneOn, old isSpeakerPhoneOn: %b, new isSpeakerPhoneOn: %b", Boolean.valueOf(bVar.f326753d), Boolean.valueOf(z));
            bVar.f326754e.mo107365b0(z);
            C109468b zx02 = C105385g.zx0();
            int z2 = z ? zx02.f327640a.mo152852z(401) : zx02.f327640a.mo152852z(402);
            if (z2 < 0) {
                Log.m105921e("MicroMsg.IPCallEngineManager", "setSpeakerPhoneOn, failed, ret: %d", Integer.valueOf(z2));
            }
            if (z != bVar.f326753d) {
                bVar.f326753d = z;
                C106336d dVar = bVar.f326750a;
                if (dVar != null && dVar.f317196a) {
                    dVar.mo152552k(z);
                }
            }
        }
        this.f324871p = mo161485s();
    }
}
