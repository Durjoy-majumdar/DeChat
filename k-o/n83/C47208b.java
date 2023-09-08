package n83;

import com.tencent.mars.cdn.CronetLogic;
import com.tencent.p014mm.network.C81038d0;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: n83.b */
public final class C47208b implements CronetLogic.CronetTaskCallback {

    /* renamed from: a */
    public boolean f126765a;

    /* renamed from: b */
    public final /* synthetic */ C47207a f126766b;

    /* renamed from: c */
    public final /* synthetic */ C81038d0 f126767c;

    public C47208b(C47207a aVar, C81038d0 d0Var) {
        this.f126766b = aVar;
        this.f126767c = d0Var;
    }

    public void onCronetReceiveChunkedData(CronetLogic.ChunkedData chunkedData, long j) {
    }

    public int onCronetReceiveHeader(CronetLogic.ResponseHeader responseHeader, int i, String str) {
        Log.m105918d("MicroMsg.MMHttpDownloader", "downloadUrl onCronetReceiveHeader receiveHeaderCalled: " + this.f126765a + ", statusCode: " + i);
        if (this.f126765a) {
            return 0;
        }
        this.f126765a = true;
        return this.f126766b.mo72114a(this.f126767c, responseHeader, i, str);
    }

    public void onCronetReceiveUploadProgress(long j, long j2) {
    }

    public void onCronetTaskCompleted(String str, CronetLogic.CronetTaskResult cronetTaskResult, String str2) {
        Object[] objArr = new Object[1];
        objArr[0] = cronetTaskResult != null ? Integer.valueOf(cronetTaskResult.statusCode) : null;
        Log.m105919d("MicroMsg.MMHttpDownloader", "downloadUrl onCronetTaskCompleted statusCode: %s", objArr);
        this.f126766b.mo72116c(this.f126767c, str, cronetTaskResult, str2);
    }

    public void onDownloadProgressChanged(String str, CronetLogic.CronetDownloadProgress cronetDownloadProgress) {
    }
}
