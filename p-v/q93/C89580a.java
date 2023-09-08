package q93;

import com.tencent.mars.cdn.CronetLogic;
import com.tencent.p014mm.sdk.platformtools.Log;
import rx3.C48096k;
import t83.C13851h1;
import t83.C13855j;

/* renamed from: q93.a */
public final class C89580a implements CronetLogic.CronetTaskCallback {

    /* renamed from: a */
    public final /* synthetic */ C13855j f257779a;

    /* renamed from: b */
    public final /* synthetic */ C13851h1 f257780b;

    public C89580a(C13855j jVar, C13851h1 h1Var) {
        this.f257779a = jVar;
        this.f257780b = h1Var;
    }

    public void onCronetReceiveChunkedData(CronetLogic.ChunkedData chunkedData, long j) {
    }

    public int onCronetReceiveHeader(CronetLogic.ResponseHeader responseHeader, int i, String str) {
        return 0;
    }

    public void onCronetReceiveUploadProgress(long j, long j2) {
        throw new C48096k("An operation is not implemented: Not yet implemented");
    }

    public void onCronetTaskCompleted(String str, CronetLogic.CronetTaskResult cronetTaskResult, String str2) {
        boolean z = false;
        if (cronetTaskResult != null && cronetTaskResult.errorCode == 0) {
            z = true;
        }
        if (z) {
            Log.m105924i("MagicLiveCardDevTools.JsApiHandleDynamicCardDebugAction", "download debugPkgPath success!");
            C89581b.f257781d.mo123891g(this.f257779a, this.f257780b);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("download debugPkgPath fail errCode:");
        sb.append(cronetTaskResult != null ? Integer.valueOf(cronetTaskResult.errorCode) : null);
        sb.append('!');
        Log.m105920e("MagicLiveCardDevTools.JsApiHandleDynamicCardDebugAction", sb.toString());
        C89581b.f257781d.mo123889e(this.f257779a, this.f257780b);
    }

    public void onDownloadProgressChanged(String str, CronetLogic.CronetDownloadProgress cronetDownloadProgress) {
        StringBuilder sb = new StringBuilder();
        sb.append("onDownloadProgressChanged fileKey:");
        sb.append(str);
        sb.append(" currentWriteBytes:");
        Long l = null;
        sb.append(cronetDownloadProgress != null ? Long.valueOf(cronetDownloadProgress.currentWriteByte) : null);
        sb.append(" totalBytes:");
        if (cronetDownloadProgress != null) {
            l = Long.valueOf(cronetDownloadProgress.totalByte);
        }
        sb.append(l);
        Log.m105924i("MagicLiveCardDevTools.JsApiHandleDynamicCardDebugAction", sb.toString());
    }
}
