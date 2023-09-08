package zl0;

import am0.C79589b;
import android.nfc.Tag;
import android.nfc.tech.TagTechnology;
import b34.C79664a;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import rx3.C13598b0;
import zl0.C91789o;

/* renamed from: zl0.i */
public final class C91783i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C91774e f262851d;

    /* renamed from: e */
    public final /* synthetic */ C32226l<C91789o<Integer>, C13598b0> f262852e;

    /* renamed from: f */
    public final /* synthetic */ String f262853f;

    public C91783i(C91774e eVar, C32226l<? super C91789o<Integer>, C13598b0> lVar, String str) {
        this.f262851d = eVar;
        this.f262852e = lVar;
        this.f262853f = str;
    }

    public final void run() {
        TagTechnology tagTechnology;
        C91774e eVar = this.f262851d;
        C32226l<C91789o<Integer>, C13598b0> lVar = this.f262852e;
        Tag a = C91774e.m115306a(eVar);
        if (a == null) {
            lVar.invoke(new C91789o.C91790a(13013, "NFC tag has not been discovered"));
        }
        if (a != null) {
            String str = this.f262853f;
            C32226l<C91789o<Integer>, C13598b0> lVar2 = this.f262852e;
            C79589b.f233384h.getClass();
            C79589b bVar = C79589b.f233385i.get(str);
            if (bVar == null) {
                lVar2.invoke(new C91789o.C91790a(13014, "invalid tech"));
            }
            if (bVar != null) {
                if (C79589b.NDEF == bVar) {
                    this.f262852e.invoke(new C91789o.C91790a(13024, "function not support"));
                    return;
                }
                String str2 = null;
                try {
                    Object obj = C79664a.m96762j(bVar.f233392e).mo109789b("get", a).f233575b;
                    if (obj != null) {
                        tagTechnology = (TagTechnology) obj;
                        if (tagTechnology != null) {
                            try {
                                Integer num = (Integer) C79664a.m96761i(tagTechnology).mo109789b("getMaxTransceiveLength", new Object[0]).f233575b;
                                C32226l<C91789o<Integer>, C13598b0> lVar3 = this.f262852e;
                                C87412m.m108593f(num, "length");
                                lVar3.invoke(new C91789o.C91791b(num));
                            } catch (Exception e) {
                                Throwable b = C91774e.m115307b(this.f262851d, e);
                                Log.m105928w("MicroMsg.AppBrand.NFCReadWriteManager", "getMaxTransceiveLength failed since " + b);
                                C32226l<C91789o<Integer>, C13598b0> lVar4 = this.f262852e;
                                StringBuilder sb = new StringBuilder();
                                sb.append("system internal error: ");
                                if (b != null) {
                                    str2 = b.getMessage();
                                }
                                sb.append(str2);
                                lVar4.invoke(new C91789o.C91790a(13017, sb.toString()));
                            }
                        }
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                } catch (Exception unused) {
                    this.f262852e.invoke(new C91789o.C91790a(13015, "unavailable tech"));
                    tagTechnology = null;
                }
            }
        }
    }
}
