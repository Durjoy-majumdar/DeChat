package p958eb;

import com.tencent.p014mm.appbrand.p942v8.C80669j;
import com.tencent.p014mm.plugin.appbrand.utils.C84754j1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import hr0.C87583a;
import java.util.concurrent.atomic.AtomicInteger;
import p1044ub.C90636f;
import p224ra.C89909e;
import p284zb.C91635f;

/* renamed from: eb.a$$c */
public class a$$c implements C84754j1.C84757c {

    /* renamed from: a */
    public final String f251282a;

    /* renamed from: b */
    public final String f251283b;

    /* renamed from: c */
    public final long f251284c;

    /* renamed from: d */
    public boolean f251285d = false;

    /* renamed from: e */
    public C80669j.C80676g f251286e = null;

    /* renamed from: f */
    public final AtomicInteger f251287f = new AtomicInteger(2);

    /* renamed from: g */
    public final /* synthetic */ int f251288g;

    /* renamed from: h */
    public final /* synthetic */ C86470a f251289h;

    public a$$c(C86470a aVar, String str, String str2, long j, int i, boolean z) {
        this.f251289h = aVar;
        this.f251288g = i;
        this.f251284c = j;
        this.f251282a = str;
        this.f251283b = str2;
    }

    /* renamed from: a */
    public void mo117481a(C80669j.C80676g gVar) {
        this.f251286e = gVar;
        mo120928c();
    }

    /* renamed from: b */
    public void mo114825b(String str) {
        Log.m105921e("Luggage.AppBrandGameServiceLogicImp", "Inject SDK WAGame Script Failed: %s", str);
        this.f251289h.getClass();
        ((C87583a) C89909e.m112439d(C87583a.class, true)).idkeyStat(778, 14, 1, false);
        this.f251285d = false;
        mo120928c();
    }

    /* renamed from: c */
    public final void mo120928c() {
        if (this.f251287f.decrementAndGet() == 0) {
            C80669j.C80676g gVar = this.f251286e;
            long j = gVar == null ? this.f251284c : gVar.f236058a;
            long currentTimeMillis = gVar == null ? System.currentTimeMillis() : gVar.f236059b;
            C90636f.C90637a aVar = new C90636f.C90637a();
            aVar.f260398i = this.f251282a;
            String str = this.f251283b;
            aVar.f260399j = str;
            aVar.f260400k = (long) Util.nullAsNil(str).length();
            ((C91635f) this.f251289h.mo124764Z()).mo122648L0(aVar, this.f251285d, j, currentTimeMillis, this.f251286e);
            this.f251289h.mo120909T0(this.f251285d, this.f251282a, this.f251286e);
        }
    }

    public void onSuccess(String str) {
        Log.m105925i("Luggage.AppBrandGameServiceLogicImp", "Inject SDK WAGame Script suc: %s, filelen: %d", str, Integer.valueOf(this.f251288g));
        this.f251289h.getClass();
        ((C87583a) C89909e.m112439d(C87583a.class, true)).idkeyStat(778, 15, 1, false);
        this.f251285d = true;
        mo120928c();
    }
}
