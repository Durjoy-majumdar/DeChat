package eu0;

import android.content.Context;
import com.tencent.p014mm.plugin.appbrand.launching.C83350j4;
import com.tencent.p014mm.sdk.platformtools.Log;
import di0.C86299o;
import di3.C86312j;
import eu0.C86683b;
import kr0.C76630x0;
import wi0.C66117m;

/* renamed from: eu0.d */
public final class C86689d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f251695d;

    /* renamed from: e */
    public final /* synthetic */ String f251696e;

    /* renamed from: f */
    public final /* synthetic */ String f251697f;

    /* renamed from: g */
    public final /* synthetic */ int f251698g;

    /* renamed from: h */
    public final /* synthetic */ Context f251699h;

    public C86689d(long j, String str, String str2, int i, C83350j4 j4Var, Context context) {
        this.f251695d = j;
        this.f251696e = str;
        this.f251697f = str2;
        this.f251698g = i;
        this.f251699h = context;
    }

    public final void run() {
        C86683b.C86685b bVar = C86683b.f251676c;
        boolean z = false;
        if (bVar != null && bVar.f251687f == this.f251695d) {
            z = true;
        }
        if (!z) {
            Log.m105924i("MicroMsg.WMPFVoip.WMPFVoipCallInManager", "[enterWxaVoipCallingPage] callingInstanceId is not match");
            return;
        }
        Log.m105924i("MicroMsg.WMPFVoip.WMPFVoipCallInManager", "[enterWxaVoipCallingPage] appId=" + this.f251696e + "  enterPath=" + this.f251697f + " versionType=" + this.f251698g + " callingInstanceId=" + this.f251695d);
        C86299o oVar = new C86299o();
        String str = this.f251696e;
        int i = this.f251698g;
        String str2 = this.f251697f;
        Context context = this.f251699h;
        oVar.f250930b = str;
        oVar.f250931c = i;
        oVar.f250934f = str2;
        oVar.f250928Q = C66117m.FORCE_DARK;
        oVar.f250939k = 1225;
        ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(context, oVar);
        C86683b.f251674a.mo121067d();
    }
}
