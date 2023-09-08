package p958eb;

import android.os.SystemClock;
import android.text.TextUtils;
import com.tencent.magicbrush.C80301a;
import com.tencent.p014mm.plugin.appbrand.jsapi.C83133y6;
import com.tencent.p014mm.plugin.appbrand.jsapi.C83137z6;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40480g;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83185u;
import com.tencent.p014mm.plugin.appbrand.utils.C84751i1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Locale;
import p1017od.C89157e;
import p284zb.C91635f;
import p963fc.C86812g;
import p992kb.C88125a;
import p992kb.C88126b;
import p992kb.C88127c;
import zt3.C119157j;

/* renamed from: eb.a$$j */
public class a$$j implements C80301a.C80304c, C80301a.C80302a {

    /* renamed from: a */
    public final /* synthetic */ C86470a f251298a;

    public a$$j(C86470a aVar, a$$b a__b) {
        this.f251298a = aVar;
    }

    /* renamed from: a */
    public void mo111582a(String str, String str2, int i) {
        Log.m105921e("Luggage.AppBrandGameServiceLogicImp", "[WAGame][AppBrand] message = [%s] stackTrace = [%s]", str, str2);
        C83185u uVar = (C83185u) ((C91635f) this.f251298a.mo124764Z()).getJsRuntime().mo63321n0(C83185u.class);
        if (i == uVar.mo115383z().getContextId()) {
            C83133y6.m101968a(((C91635f) this.f251298a.mo124764Z()).getJsRuntime(), "onError", String.format(Locale.ENGLISH, "{'message':'%s', 'stack': '%s'}", new Object[]{C84751i1.m104412a(str), C84751i1.m104412a(str2)}), 0);
            return;
        }
        C40480g F0 = uVar.mo115375F0(i);
        if (F0 != null) {
            C83137z6.m101976a(F0, "onError", String.format(Locale.ENGLISH, "{'message':'%s', 'stack': '%s'}", new Object[]{C84751i1.m104412a(str), C84751i1.m104412a(str2)}), 0);
            return;
        }
        throw new IllegalStateException("j2v8 not follow the pattern");
    }

    /* renamed from: b */
    public void mo111581b(int i) {
        C86470a aVar = this.f251298a;
        if (((C91635f) aVar.mo124764Z()).mo114335b0() || ((C91635f) aVar.mo124764Z()).isRunning()) {
            String g0 = aVar.mo125521g0();
            if (!TextUtils.isEmpty(g0)) {
                C88127c a = C88127c.m109723a(g0);
                C80301a U = aVar.mo120910U();
                a.getClass();
                a.f254887c = Util.currentTicks();
                try {
                    a.f254890f = U.f235059h;
                } catch (NullPointerException e) {
                    Log.printErrStackTrace("MicroMsg.MBNiReporter", e, "inspector null pointer!", new Object[0]);
                }
                C89157e eVar = a.f254890f;
                if (eVar != null) {
                    int b = eVar.mo123499b();
                    eVar.f256899b.put(b, SystemClock.elapsedRealtime());
                    a.f254891g = b;
                }
                ((C119157j) C119157j.f356862d).mo183875f(new C88125a(a));
                ((C119157j) C119157j.f356862d).mo183878i(new C88126b(a), 10);
            }
        }
    }

    /* renamed from: c */
    public void mo111583c(String str) {
        Log.m105925i("Luggage.AppBrandGameServiceLogicImp", "[WAGame][CONSOLE] output = [%s]", str);
        C86812g H0 = ((C91635f) this.f251298a.mo124764Z()).getRuntime();
        if (H0 == null || H0.mo113051d0() == null || H0.mo113051d0().f234889w) {
            this.f251298a.mo120894A().mo110168b(str);
        }
    }
}
