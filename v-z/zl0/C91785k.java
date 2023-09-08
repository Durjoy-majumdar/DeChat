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

/* renamed from: zl0.k */
public final class C91785k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C91774e f262857d;

    /* renamed from: e */
    public final /* synthetic */ C32226l<C91789o<C13598b0>, C13598b0> f262858e;

    /* renamed from: f */
    public final /* synthetic */ String f262859f;

    /* renamed from: g */
    public final /* synthetic */ int f262860g;

    public C91785k(C91774e eVar, C32226l<? super C91789o<C13598b0>, C13598b0> lVar, String str, int i) {
        this.f262857d = eVar;
        this.f262858e = lVar;
        this.f262859f = str;
        this.f262860g = i;
    }

    public final void run() {
        TagTechnology tagTechnology;
        boolean z;
        C91774e eVar = this.f262857d;
        C32226l<C91789o<C13598b0>, C13598b0> lVar = this.f262858e;
        Tag a = C91774e.m115306a(eVar);
        if (a == null) {
            lVar.invoke(new C91789o.C91790a(13013, "NFC tag has not been discovered"));
        }
        if (a != null) {
            String str = this.f262859f;
            C32226l<C91789o<C13598b0>, C13598b0> lVar2 = this.f262858e;
            C79589b.f233384h.getClass();
            C79589b bVar = C79589b.f233385i.get(str);
            if (bVar == null) {
                lVar2.invoke(new C91789o.C91790a(13014, "invalid tech"));
            }
            if (bVar != null) {
                Class[] clsArr = {Integer.TYPE};
                C79589b.C79591b bVar2 = new C79589b.C79591b("setTimeout", clsArr);
                Boolean bool = bVar.f233394g.get(bVar2);
                if (bool == null) {
                    try {
                        Class.forName(bVar.f233392e).getDeclaredMethod("setTimeout", (Class[]) Arrays.copyOf(clsArr, 1));
                        z = true;
                    } catch (Exception e) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("get ");
                        sb.append(bVar.f233392e);
                        sb.append('.');
                        sb.append("setTimeout");
                        sb.append('(');
                        String arrays = Arrays.toString(clsArr);
                        C87412m.m108593f(arrays, "toString(this)");
                        sb.append(arrays);
                        sb.append(") failed since ");
                        sb.append(e);
                        Log.m105924i("MicroMsg.AppBrand.NFCTech", sb.toString());
                        z = false;
                    }
                    bVar.f233394g.put(bVar2, Boolean.valueOf(z));
                    bool = Boolean.valueOf(z);
                }
                C87412m.m108593f(bool, "MethodSignature(name, pa…            }()\n        }");
                if (!bool.booleanValue()) {
                    Log.m105924i("MicroMsg.AppBrand.NFCReadWriteManager", "setTimeout, " + bVar.f233391d + ".setTimeout is not supported");
                    this.f262858e.invoke(new C91789o.C91790a(13024, "function not support"));
                    return;
                }
                String str2 = null;
                try {
                    Object obj = C79664a.m96762j(bVar.f233392e).mo109789b("get", a).f233575b;
                    if (obj != null) {
                        tagTechnology = (TagTechnology) obj;
                        if (tagTechnology != null) {
                            try {
                                C79664a.m96761i(tagTechnology).mo109789b("setTimeout", Integer.valueOf(this.f262860g));
                                this.f262858e.invoke(new C91789o.C91791b(C13598b0.f38549a));
                            } catch (Exception e2) {
                                Throwable b = C91774e.m115307b(this.f262857d, e2);
                                Log.m105928w("MicroMsg.AppBrand.NFCReadWriteManager", "setTimeout failed since " + b);
                                C32226l<C91789o<C13598b0>, C13598b0> lVar3 = this.f262858e;
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("system internal error: ");
                                if (b != null) {
                                    str2 = b.getMessage();
                                }
                                sb4.append(str2);
                                lVar3.invoke(new C91789o.C91790a(13017, sb4.toString()));
                            }
                        }
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                } catch (Exception unused) {
                    this.f262858e.invoke(new C91789o.C91790a(13015, "unavailable tech"));
                    tagTechnology = null;
                }
            }
        }
    }
}
