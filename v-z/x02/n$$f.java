package x02;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.File;
import v02.a$$d;

public class n$$f implements a$$d {

    /* renamed from: a */
    public final /* synthetic */ String f261339a;

    /* renamed from: b */
    public final /* synthetic */ File f261340b;

    /* renamed from: c */
    public final /* synthetic */ long f261341c;

    /* renamed from: d */
    public final /* synthetic */ C91124n f261342d;

    public n$$f(C91124n nVar, String str, File file, long j) {
        this.f261342d = nVar;
        this.f261339a = str;
        this.f261340b = file;
        this.f261341c = j;
    }

    /* renamed from: a */
    public void mo123260a(boolean z) {
        this.f261342d.f261328h.put(this.f261339a, Boolean.TRUE);
        Log.m105925i("Tinker.SyncResponseProcessor", "HdiffApk, onPatchResult, result.isSuccess = %s, isPatchFileRead = %s", Boolean.valueOf(z), Boolean.valueOf(this.f261342d.f261331n));
        if (this.f261342d.f261331n) {
            this.f261342d.mo125185c(this.f261340b, this.f261341c);
            this.f261342d.f261328h.remove(this.f261339a);
        }
    }
}
