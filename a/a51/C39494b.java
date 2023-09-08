package a51;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.SyncTask;
import com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo;

/* renamed from: a51.b */
public class C39494b extends SyncTask<TMAssistantDownloadTaskInfo> {

    /* renamed from: a */
    public final /* synthetic */ String f106058a;

    /* renamed from: b */
    public final /* synthetic */ C39487a f106059b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39494b(C39487a aVar, long j, TMAssistantDownloadTaskInfo tMAssistantDownloadTaskInfo, String str) {
        super(j, tMAssistantDownloadTaskInfo);
        this.f106059b = aVar;
        this.f106058a = str;
    }

    public Object run() {
        try {
            return this.f106059b.mo62097i().getDownloadTaskState(this.f106058a);
        } catch (Exception e) {
            Log.m105920e("MicroMsg.FileDownloaderImplTMAssistant", "queryDownloadStateSync faile: " + e.toString());
            return null;
        }
    }
}
