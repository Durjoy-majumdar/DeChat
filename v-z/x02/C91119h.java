package x02;

import com.tencent.p014mm.sdk.platformtools.Log;
import ef0.C31572a;
import gy3.C87412m;
import ni3.C88944a;
import ni3.C88949e;
import p271xn.C91299o;
import zt3.C119157j;

/* renamed from: x02.h */
public class C91119h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f261316d;

    /* renamed from: e */
    public final /* synthetic */ String f261317e;

    /* renamed from: f */
    public final /* synthetic */ String f261318f;

    /* renamed from: g */
    public final /* synthetic */ C91299o f261319g;

    /* renamed from: x02.h$a */
    public class C91120a implements C88944a {
        public C91120a(C91119h hVar) {
        }

        /* renamed from: a */
        public int mo123280a(String str, String str2, String str3) {
            return C31572a.m39461a(str, str2, str3);
        }
    }

    /* renamed from: x02.h$b */
    public class C91121b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f261320d;

        public C91121b(int i) {
            this.f261320d = i;
        }

        public void run() {
            C91119h.this.f261319g.mo123278a(this.f261320d);
        }
    }

    public C91119h(C91118g gVar, String str, String str2, String str3, C91299o oVar) {
        this.f261316d = str;
        this.f261317e = str2;
        this.f261318f = str3;
        this.f261319g = oVar;
    }

    public void run() {
        int i;
        try {
            String str = this.f261316d;
            String str2 = this.f261317e;
            String str3 = this.f261318f;
            C91120a aVar = new C91120a(this);
            C87412m.m108594g(str, "apkFilePath");
            C87412m.m108594g(str2, "cPatchPath");
            C87412m.m108594g(str3, "outPatchFilePath");
            i = C88949e.f256525a.mo123335a(str, str2, str3, aVar);
        } catch (Exception e) {
            throw e;
        } catch (Exception e2) {
            Log.printErrStackTrace("Tinker.HotPatchApplyService", e2, "", new Object[0]);
            i = -1;
        }
        ((C119157j) C119157j.f356862d).mo183895z(new C91121b(i));
    }
}
