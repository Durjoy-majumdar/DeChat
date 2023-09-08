package uz0;

import com.tencent.p014mm.sdk.platformtools.Log;
import p391w3.C22857b;

/* renamed from: uz0.d */
public final class C102119d implements C22857b.C22863d {

    /* renamed from: a */
    public final /* synthetic */ C102120y f300703a;

    /* renamed from: b */
    public final /* synthetic */ int f300704b;

    public C102119d(C102120y yVar, int i) {
        this.f300703a = yVar;
        this.f300704b = i;
    }

    /* renamed from: a */
    public final void mo36027a(C22857b bVar) {
        if (bVar != null) {
            C22857b.C22862e eVar = bVar.f65701e;
            if (eVar != null) {
                this.f300703a.mo141622a(eVar.f65714d);
                return;
            }
            Log.m105924i("MicroMsg.CardViewUtils", "getPrimaryColor, palette generated but swatch is null");
            this.f300703a.mo141622a(this.f300704b);
            return;
        }
        Log.m105924i("MicroMsg.CardViewUtils", "getPrimaryColor, palette generated fail");
        this.f300703a.mo141622a(this.f300704b);
    }
}
