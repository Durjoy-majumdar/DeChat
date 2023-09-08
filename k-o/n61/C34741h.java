package n61;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C30790w2;
import di3.C86312j;
import p441aq.C92054g;
import te3.C49817i92;
import wh3.C38148w;

/* renamed from: n61.h */
public final class C34741h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C49817i92 f93399d;

    /* renamed from: e */
    public final /* synthetic */ C100095g f93400e;

    public C34741h(C49817i92 i922, C100095g gVar) {
        this.f93399d = i922;
        this.f93400e = gVar;
    }

    public final void run() {
        C38148w wVar;
        if (this.f93399d != null) {
            Log.m105918d("MicroMsg.EmojiStoreV3HomeBaseDataRepo", "save Cache type: " + this.f93400e.f293229d);
            ((C92054g) C86312j.m106911c(C92054g.class)).getClass();
            C30790w2 h = C30790w2.m39221h();
            synchronized (h.f82769a) {
                wVar = h.f82775g;
            }
            wVar.mo61548jo(this.f93400e.f293229d, this.f93399d);
        }
    }
}
