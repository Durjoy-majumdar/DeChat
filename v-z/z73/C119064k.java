package z73;

import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.util.Map;
import p166hy.C117128b0;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;

/* renamed from: z73.k */
public final class C119064k implements C117128b0.C98560a {

    /* renamed from: a */
    public final /* synthetic */ C13855j f356594a;

    /* renamed from: b */
    public final /* synthetic */ C13851h1 f356595b;

    /* renamed from: c */
    public final /* synthetic */ String f356596c;

    /* renamed from: d */
    public final /* synthetic */ String f356597d;

    public C119064k(C13855j jVar, C13851h1 h1Var, String str, String str2) {
        this.f356594a = jVar;
        this.f356595b = h1Var;
        this.f356596c = str;
        this.f356597d = str2;
    }

    /* renamed from: a */
    public final void mo137932a(String str, boolean z, String str2, Bundle bundle) {
        try {
            Log.m105924i("MicroMsg.WebSearch.StartAdQRScanJSApi", "onClickDirect qr onFinish, isSuccess is " + z + ", errMsg is " + str2 + ", url is " + str);
            if (z) {
                C13849g gVar = this.f356594a.f39001d;
                String str3 = this.f356595b.f38990c;
                C119062j.f356588d.getClass();
                gVar.mo10774a(str3, "startAdQRScan:ok", (Map<String, Object>) null);
            } else if (Util.isEqual(str2, "inValid QRCode")) {
                C13849g gVar2 = this.f356594a.f39001d;
                String str4 = this.f356595b.f38990c;
                C119062j.f356588d.getClass();
                gVar2.mo10774a(str4, "startAdQRScan:failed. QR Type error", (Map<String, Object>) null);
            } else {
                ((C117128b0) C86312j.m106911c(C117128b0.class)).uo0(this.f356596c, 3, this.f356597d, bundle != null ? bundle.getInt("qr_url_type_key") : 0);
                C13849g gVar3 = this.f356594a.f39001d;
                String str5 = this.f356595b.f38990c;
                C119062j.f356588d.getClass();
                gVar3.mo10774a(str5, "startAdQRScan:failed", (Map<String, Object>) null);
            }
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.WebSearch.StartAdQRScanJSApi", "onFinish, exp is " + th);
        }
    }
}
