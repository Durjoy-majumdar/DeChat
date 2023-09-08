package p302ch;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import nc3.C34767b;
import ou0.C110071c;
import p375qh.C22086d;
import pu0.C110248b;

/* renamed from: ch.a */
public final class C16928a extends C110071c {

    /* renamed from: l */
    public C34767b.C21622a f45748l;

    /* renamed from: m */
    public C34767b.C34768c f45749m;

    /* renamed from: n */
    public boolean f45750n = true;

    /* renamed from: o */
    public boolean f45751o = true;

    /* renamed from: p */
    public boolean f45752p;

    /* renamed from: q */
    public Context f45753q;

    /* renamed from: r */
    public boolean f45754r;

    /* renamed from: s */
    public C22086d f45755s;

    public C16928a(Context context, C34767b.C21622a aVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(aVar, "onAudioFocusChanged");
        this.f45748l = aVar;
        this.f45753q = context;
        mo157512y();
        C110248b.f329777h.mo161664i(this, "music");
    }

    /* renamed from: R */
    public void mo18021R(int i) {
        if (i == 2) {
            mo18028n(false);
        }
    }

    /* renamed from: e0 */
    public final boolean mo18022e0() {
        return this.f45754r;
    }

    /* renamed from: f0 */
    public final void mo18023f0(boolean z) {
        mo157511t();
        if (!z) {
            mo161477T("music");
        }
        if (this.f45752p) {
            C34767b.C34768c cVar = this.f45749m;
            if (cVar != null) {
                ((C34767b) C86312j.m106911c(C34767b.class)).b20(cVar);
            }
            this.f45749m = null;
            this.f45752p = false;
        }
    }

    /* renamed from: g0 */
    public final void mo18024g0() {
        C22086d dVar = this.f45755s;
        boolean z = false;
        if (dVar != null) {
            dVar.mo33331g(false);
        }
        if (this.f45750n) {
            C34767b.C34768c el = ((C34767b) C86312j.m106911c(C34767b.class)).mo34192el(C34767b.C34769b.C34785o.f93468c, this.f45748l);
            this.f45749m = el;
            if (el != null) {
                z = el.mo34198a();
            }
            this.f45752p = z;
        }
        this.f45751o = true;
        if (!C110248b.f329777h.mo161666k()) {
            mo161478U("music", 2);
        } else {
            mo161478U("music", 1);
        }
    }

    /* renamed from: h0 */
    public final void mo18025h0(C22086d dVar) {
        this.f45755s = dVar;
    }

    /* renamed from: i0 */
    public final void mo18026i0(boolean z) {
        this.f45754r = z;
    }

    /* renamed from: j0 */
    public final void mo18027j0(String str, int i) {
        C87412m.m108594g(str, "filepath");
        C22086d dVar = this.f45755s;
        C87412m.m108591d(dVar);
        if (!dVar.mo33325a(str, this.f45754r, i)) {
            Log.m105924i("MicroMsg.SceneVoiceAudioManager", "start play error fileName[" + str + "], [" + this.f45754r + ']');
            mo161477T("music");
        }
    }

    /* renamed from: n */
    public void mo18028n(boolean z) {
        C22086d dVar;
        if (this.f45754r != z && (dVar = this.f45755s) != null) {
            boolean z2 = true;
            if (dVar == null || !dVar.isPlaying()) {
                z2 = false;
            }
            if (z2) {
                mo107365b0(z);
                C22086d dVar2 = this.f45755s;
                if (dVar2 != null) {
                    dVar2.mo33327c(z);
                }
                this.f45754r = z;
            }
        }
    }
}
