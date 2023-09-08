package x02;

import com.tencent.p014mm.sdk.platformtools.Log;
import ef0.C31572a;
import gy3.C87412m;
import ni3.C88944a;
import ni3.C88949e;
import p271xn.C91299o;
import zt3.C119157j;

/* renamed from: x02.p */
public class C91126p implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f261345d;

    /* renamed from: e */
    public final /* synthetic */ String f261346e;

    /* renamed from: f */
    public final /* synthetic */ String f261347f;

    /* renamed from: g */
    public final /* synthetic */ C91299o f261348g;

    /* renamed from: x02.p$a */
    public class C91127a implements C88944a {
        public C91127a(C91126p pVar) {
        }

        /* renamed from: a */
        public int mo123280a(String str, String str2, String str3) {
            return C31572a.m39461a(str, str2, str3);
        }
    }

    /* renamed from: x02.p$b */
    public class C91128b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f261349d;

        public C91128b(int i) {
            this.f261349d = i;
        }

        public void run() {
            C91126p.this.f261348g.mo123278a(this.f261349d);
        }
    }

    public C91126p(C91124n nVar, String str, String str2, String str3, C91299o oVar) {
        this.f261345d = str;
        this.f261346e = str2;
        this.f261347f = str3;
        this.f261348g = oVar;
    }

    public void run() {
        int i;
        try {
            String str = this.f261345d;
            String str2 = this.f261346e;
            String str3 = this.f261347f;
            C91127a aVar = new C91127a(this);
            C87412m.m108594g(str, "apkFilePath");
            C87412m.m108594g(str2, "cPatchPath");
            C87412m.m108594g(str3, "outPatchFilePath");
            i = C88949e.f256525a.mo123335a(str, str2, str3, aVar);
        } catch (Exception e) {
            throw e;
        } catch (Exception e2) {
            Log.printErrStackTrace("Tinker.SyncResponseProcessor", e2, "", new Object[0]);
            i = -1;
        }
        ((C119157j) C119157j.f356862d).mo183895z(new C91128b(i));
    }
}
