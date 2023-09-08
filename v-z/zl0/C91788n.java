package zl0;

import am0.C79589b;
import android.nfc.Tag;
import android.nfc.tech.TagTechnology;
import b34.C79664a;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import java.util.Arrays;
import rx3.C13598b0;
import zl0.C91789o;

/* renamed from: zl0.n */
public final class C91788n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C91774e f262865d;

    /* renamed from: e */
    public final /* synthetic */ C32226l<C91789o<byte[]>, C13598b0> f262866e;

    /* renamed from: f */
    public final /* synthetic */ String f262867f;

    /* renamed from: g */
    public final /* synthetic */ byte[] f262868g;

    public C91788n(C91774e eVar, C32226l<? super C91789o<byte[]>, C13598b0> lVar, String str, byte[] bArr) {
        this.f262865d = eVar;
        this.f262866e = lVar;
        this.f262867f = str;
        this.f262868g = bArr;
    }

    public final void run() {
        TagTechnology tagTechnology;
        String str;
        C91774e eVar = this.f262865d;
        C32226l<C91789o<byte[]>, C13598b0> lVar = this.f262866e;
        Tag a = C91774e.m115306a(eVar);
        if (a == null) {
            lVar.invoke(new C91789o.C91790a(13013, "NFC tag has not been discovered"));
        }
        if (a != null) {
            String str2 = this.f262867f;
            C32226l<C91789o<byte[]>, C13598b0> lVar2 = this.f262866e;
            C79589b.f233384h.getClass();
            C79589b bVar = C79589b.f233385i.get(str2);
            if (bVar == null) {
                lVar2.invoke(new C91789o.C91790a(13014, "invalid tech"));
            }
            if (bVar != null) {
                if (C79589b.NDEF == bVar) {
                    this.f262866e.invoke(new C91789o.C91790a(13024, "function not support"));
                    return;
                }
                String str3 = null;
                try {
                    Object obj = C79664a.m96762j(bVar.f233392e).mo109789b("get", a).f233575b;
                    if (obj != null) {
                        tagTechnology = (TagTechnology) obj;
                        if (tagTechnology != null) {
                            try {
                                byte[] bArr = (byte[]) C79664a.m96761i(tagTechnology).mo109789b("transceive", this.f262868g).f233575b;
                                StringBuilder sb = new StringBuilder();
                                sb.append("transceive, rspData: ");
                                if (bArr != null) {
                                    str = Arrays.toString(bArr);
                                    C87412m.m108593f(str, "toString(this)");
                                } else {
                                    str = null;
                                }
                                sb.append(str);
                                Log.m105918d("MicroMsg.AppBrand.NFCReadWriteManager", sb.toString());
                                C32226l<C91789o<byte[]>, C13598b0> lVar3 = this.f262866e;
                                C87412m.m108593f(bArr, "rspData");
                                lVar3.invoke(new C91789o.C91791b(bArr));
                            } catch (Exception e) {
                                Throwable b = C91774e.m115307b(this.f262865d, e);
                                Log.m105928w("MicroMsg.AppBrand.NFCReadWriteManager", "transceive failed since " + b);
                                C32226l<C91789o<byte[]>, C13598b0> lVar4 = this.f262866e;
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("system internal error: ");
                                if (b != null) {
                                    str3 = b.getMessage();
                                }
                                sb4.append(str3);
                                lVar4.invoke(new C91789o.C91790a(13017, sb4.toString()));
                            }
                        }
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                } catch (Exception unused) {
                    this.f262866e.invoke(new C91789o.C91790a(13015, "unavailable tech"));
                    tagTechnology = null;
                }
            }
        }
    }
}
