package sa0;

import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import gy3.C87412m;
import kotlin.Result;
import te3.qf4;
import wx3.C15601d;

/* renamed from: sa0.c */
public final class C48324c implements CdnLogic.DownloadCallback {

    /* renamed from: d */
    public final /* synthetic */ qf4 f129387d;

    /* renamed from: e */
    public final /* synthetic */ String f129388e;

    /* renamed from: f */
    public final /* synthetic */ C86009m1 f129389f;

    /* renamed from: g */
    public final /* synthetic */ C15601d<String> f129390g;

    public C48324c(qf4 qf4, String str, C86009m1 m1Var, C15601d<? super String> dVar) {
        this.f129387d = qf4;
        this.f129388e = str;
        this.f129389f = m1Var;
        this.f129390g = dVar;
    }

    public void onC2CDownloadCompleted(String str, CdnLogic.C2CDownloadResult c2CDownloadResult) {
        if (C87412m.m108589b(str, this.f129387d.f140287f)) {
            boolean z = false;
            if (c2CDownloadResult != null && c2CDownloadResult.errorCode == 0) {
                z = true;
            }
            if (z) {
                Log.m105924i("MicroMsg.Maas.MusicVideoResManager", "onC2CDownloadCompleted: " + this.f129387d.f140287f + " download successful at " + this.f129388e + ", size: " + this.f129389f.mo119980r());
                C15601d<String> dVar = this.f129390g;
                Result.Companion companion = Result.Companion;
                dVar.resumeWith(Result.m168114constructorimpl(this.f129388e));
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("onC2CDownloadCompleted: resource ");
        sb.append(this.f129387d.f140287f);
        sb.append(" download error error code: ");
        sb.append(c2CDownloadResult != null ? Integer.valueOf(c2CDownloadResult.errorCode) : null);
        Log.m105920e("MicroMsg.Maas.MusicVideoResManager", sb.toString());
        C86013q1.m106447h(this.f129388e);
        this.f129390g.resumeWith(Result.m168114constructorimpl((Object) null));
    }

    public void onDownloadProgressChanged(String str, long j, long j2, boolean z) {
    }
}
