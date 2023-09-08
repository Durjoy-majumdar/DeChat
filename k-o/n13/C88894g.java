package n13;

import com.tencent.p014mm.sdk.platformtools.Log;
import ef0.C31572a;
import gy3.C8478d0;
import gy3.C87412m;
import ni3.C88944a;
import ni3.C88949e;
import p271xn.C91299o;
import zt3.C119157j;

/* renamed from: n13.g */
public final class C88894g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f256386d;

    /* renamed from: e */
    public final /* synthetic */ String f256387e;

    /* renamed from: f */
    public final /* synthetic */ String f256388f;

    /* renamed from: g */
    public final /* synthetic */ C91299o f256389g;

    /* renamed from: n13.g$a */
    public static final class C88895a implements C88944a {
        /* renamed from: a */
        public int mo123280a(String str, String str2, String str3) {
            C87412m.m108594g(str, "oldFile");
            C87412m.m108594g(str2, "patch");
            C87412m.m108594g(str3, "new");
            return C31572a.m39461a(str, str2, str3);
        }
    }

    /* renamed from: n13.g$b */
    public static final class C88896b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C91299o f256390d;

        /* renamed from: e */
        public final /* synthetic */ C8478d0 f256391e;

        public C88896b(C91299o oVar, C8478d0 d0Var) {
            this.f256390d = oVar;
            this.f256391e = d0Var;
        }

        public final void run() {
            this.f256390d.mo123278a(this.f256391e.f27483d);
        }
    }

    public C88894g(String str, String str2, String str3, C91299o oVar) {
        this.f256386d = str;
        this.f256387e = str2;
        this.f256388f = str3;
        this.f256389g = oVar;
    }

    public final void run() {
        C8478d0 d0Var = new C8478d0();
        d0Var.f27483d = -1;
        try {
            String str = this.f256386d;
            String str2 = this.f256387e;
            String str3 = this.f256388f;
            C88895a aVar = new C88895a();
            C87412m.m108594g(str, "apkFilePath");
            C87412m.m108594g(str2, "cPatchPath");
            C87412m.m108594g(str3, "outPatchFilePath");
            d0Var.f27483d = C88949e.f256525a.mo123335a(str, str2, str3, aVar);
        } catch (Exception e) {
            throw e;
        } catch (Exception e2) {
            C88880b bVar = C88880b.f256362a;
            Log.printErrStackTrace("MicroMsg.Updater.ManualUpdaterProcessor", e2, "", new Object[0]);
        }
        ((C119157j) C119157j.f356862d).mo183895z(new C88896b(this.f256389g, d0Var));
    }
}
