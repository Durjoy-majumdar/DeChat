package zl0;

import am0.C79589b;
import android.nfc.Tag;
import android.nfc.tech.TagTechnology;
import b34.C79664a;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import rx3.C13598b0;
import zl0.C91789o;

/* renamed from: zl0.f */
public final class C91780f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C91774e f262841d;

    /* renamed from: e */
    public final /* synthetic */ C32226l<C91789o<C13598b0>, C13598b0> f262842e;

    /* renamed from: f */
    public final /* synthetic */ String f262843f;

    public C91780f(C91774e eVar, C32226l<? super C91789o<C13598b0>, C13598b0> lVar, String str) {
        this.f262841d = eVar;
        this.f262842e = lVar;
        this.f262843f = str;
    }

    public final void run() {
        TagTechnology tagTechnology;
        C91774e eVar = this.f262841d;
        C32226l<C91789o<C13598b0>, C13598b0> lVar = this.f262842e;
        Tag a = C91774e.m115306a(eVar);
        if (a == null) {
            lVar.invoke(new C91789o.C91790a(13013, "NFC tag has not been discovered"));
        }
        if (a != null) {
            String str = this.f262843f;
            C32226l<C91789o<C13598b0>, C13598b0> lVar2 = this.f262842e;
            C79589b.f233384h.getClass();
            C79589b bVar = C79589b.f233385i.get(str);
            if (bVar == null) {
                lVar2.invoke(new C91789o.C91790a(13014, "invalid tech"));
            }
            if (bVar != null) {
                if (!this.f262841d.f262836b.mo115089b().contains(bVar)) {
                    this.f262842e.invoke(new C91789o.C91790a(13023, "Tech has not connected"));
                    return;
                }
                try {
                    Object obj = C79664a.m96762j(bVar.f233392e).mo109789b("get", a).f233575b;
                    if (obj != null) {
                        tagTechnology = (TagTechnology) obj;
                        if (tagTechnology != null) {
                            try {
                                tagTechnology.close();
                            } catch (Exception e) {
                                Log.m105924i("MicroMsg.AppBrand.NFCReadWriteManager", "close failed since " + e);
                            }
                            this.f262841d.f262836b.mo115089b().remove(bVar);
                            this.f262842e.invoke(new C91789o.C91791b(C13598b0.f38549a));
                            return;
                        }
                        return;
                    }
                    throw new IllegalArgumentException("Required value was null.".toString());
                } catch (Exception unused) {
                    this.f262842e.invoke(new C91789o.C91790a(13015, "unavailable tech"));
                    tagTechnology = null;
                }
            }
        }
    }
}
