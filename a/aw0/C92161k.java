package aw0;

import com.tencent.p014mm.sdk.platformtools.Log;
import p391w3.C22857b;
import p646pn.C100824i;

/* renamed from: aw0.k */
public class C92161k implements C22857b.C22863d {

    /* renamed from: a */
    public final /* synthetic */ C100824i.C100825a f263791a;

    /* renamed from: b */
    public final /* synthetic */ int f263792b;

    public C92161k(C100824i.C100825a aVar, int i) {
        this.f263791a = aVar;
        this.f263792b = i;
    }

    /* renamed from: a */
    public void mo36027a(C22857b bVar) {
        if (bVar != null) {
            C22857b.C22862e eVar = bVar.f65701e;
            if (eVar != null) {
                this.f263791a.mo23027a(eVar.f65714d);
                return;
            }
            Log.m105924i("MicroMsg.FloatBallUtil", "getPrimaryColor, palette generated but swatch is null");
            this.f263791a.mo23027a(this.f263792b);
            return;
        }
        Log.m105924i("MicroMsg.FloatBallUtil", "getPrimaryColor, palette generated fail");
        this.f263791a.mo23027a(this.f263792b);
    }
}
