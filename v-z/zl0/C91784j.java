package zl0;

import am0.C79589b;
import android.nfc.Tag;
import android.nfc.tech.TagTechnology;
import b34.C79664a;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import rx3.C13598b0;
import zl0.C91789o;

/* renamed from: zl0.j */
public final class C91784j implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C91774e f262854d;

    /* renamed from: e */
    public final /* synthetic */ C32226l<C91789o<Boolean>, C13598b0> f262855e;

    /* renamed from: f */
    public final /* synthetic */ String f262856f;

    public C91784j(C91774e eVar, C32226l<? super C91789o<Boolean>, C13598b0> lVar, String str) {
        this.f262854d = eVar;
        this.f262855e = lVar;
        this.f262856f = str;
    }

    public final void run() {
        TagTechnology tagTechnology;
        C91774e eVar = this.f262854d;
        C32226l<C91789o<Boolean>, C13598b0> lVar = this.f262855e;
        Tag a = C91774e.m115306a(eVar);
        if (a == null) {
            lVar.invoke(new C91789o.C91790a(13013, "NFC tag has not been discovered"));
        }
        if (a != null) {
            String str = this.f262856f;
            C32226l<C91789o<Boolean>, C13598b0> lVar2 = this.f262855e;
            C79589b.f233384h.getClass();
            C79589b bVar = C79589b.f233385i.get(str);
            if (bVar == null) {
                lVar2.invoke(new C91789o.C91790a(13014, "invalid tech"));
            }
            if (bVar != null) {
                try {
                    Object obj = C79664a.m96762j(bVar.f233392e).mo109789b("get", a).f233575b;
                    if (obj != null) {
                        tagTechnology = (TagTechnology) obj;
                        if (tagTechnology != null) {
                            try {
                                this.f262855e.invoke(new C91789o.C91791b(Boolean.valueOf(tagTechnology.isConnected())));
                            } catch (Exception e) {
                                Log.m105924i("MicroMsg.AppBrand.NFCReadWriteManager", "check isConnected failed since " + e);
                                C32226l<C91789o<Boolean>, C13598b0> lVar3 = this.f262855e;
                                lVar3.invoke(new C91789o.C91790a(13017, "system internal error: " + e.getMessage()));
                            }
                        }
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                } catch (Exception unused) {
                    this.f262855e.invoke(new C91789o.C91790a(13015, "unavailable tech"));
                    tagTechnology = null;
                }
            }
        }
    }
}
