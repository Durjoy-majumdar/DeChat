package sb2;

import bl3.C39818r;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import la2.C61261g;
import la2.C99355b;
import p529fv.C59329p;
import p529fv.C59330q;
import p749xh.C102658n6;
import zt3.C119157j;

/* renamed from: sb2.d */
public final class C63751d implements C61261g.C61262a {

    /* renamed from: a */
    public final /* synthetic */ C63756e f180713a;

    /* renamed from: b */
    public final /* synthetic */ C99355b f180714b;

    /* renamed from: sb2.d$a */
    public static final class C63752a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C63756e f180715d;

        /* renamed from: e */
        public final /* synthetic */ String f180716e;

        public C63752a(C63756e eVar, String str) {
            this.f180715d = eVar;
            this.f180716e = str;
        }

        public final void run() {
            C102658n6 bp = ((C59330q) C86312j.m106911c(C59330q.class)).mo84438bp(this.f180715d.getActivity());
            if (bp != null) {
                ((C59329p) C86312j.m106911c(C59329p.class)).mo84019Ts(bp.field_musicId, bp.field_songAlbum, bp.field_songHAlbumUrl, this.f180716e, false, false);
            }
        }
    }

    public C63751d(C63756e eVar, C99355b bVar) {
        this.f180713a = eVar;
        this.f180714b = bVar;
    }

    /* renamed from: a */
    public final void mo86254a(String str) {
        C63756e eVar = this.f180713a;
        eVar.f180744i.f183910j = str;
        eVar.mo88573g3();
        C63756e eVar2 = this.f180713a;
        ((C63816o) C39818r.f106831a.mo62444c(this.f180713a.getActivity()).mo75002a(C63816o.class)).mo88612k3(eVar2.f180744i, eVar2.f180745j, false);
        String str2 = this.f180713a.f180740e;
        Log.m105924i(str2, "get lyric from MidLink " + str);
        ((C119157j) C119157j.f356862d).mo183875f(new C63752a(this.f180713a, str));
        ((C61261g) this.f180714b).mo86253w();
    }
}
