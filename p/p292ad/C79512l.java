package p292ad;

import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.Log;
import p1066yc.C91422r;

/* renamed from: ad.l */
public class C79512l implements C91422r {

    /* renamed from: a */
    public final /* synthetic */ C79502b f233150a;

    public C79512l(C79502b bVar) {
        this.f233150a = bVar;
    }

    /* renamed from: b */
    public void mo109549b() {
        Log.m105918d(this.f233150a.mo109516v(), "playVideo");
        if (this.f233150a.f233091R.getAndSet(false)) {
            this.f233150a.mo109503D(new l$$a(this));
        }
    }

    /* renamed from: d */
    public void mo109550d() {
        Log.m105918d(this.f233150a.mo109516v(), "playAudio");
        if (!this.f233150a.f233091R.getAndSet(true)) {
            C79502b bVar = this.f233150a;
            l$$b l__b = new l$$b(this);
            bVar.getClass();
            C79506f fVar = new C79506f(bVar, l__b);
            Log.m105924i(bVar.mo109516v(), "getSnapshotAsync");
            if (bVar.f233097h == null) {
                Log.m105928w(bVar.mo109516v(), "getSnapshotAsync, mAdapter is null");
                fVar.mo109546a((Bitmap) null);
                return;
            }
            bVar.f233094U = fVar;
            bVar.f233097h.mo33722h(true, new C79505e(bVar));
        }
    }
}
