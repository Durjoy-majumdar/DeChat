package com.tencent.p014mm.plugin.appbrand.jsapi.file;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.type.IPCInteger;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.OpenFileRequest;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.f1 */
public class C82429f1 implements C1256g<IPCInteger> {

    /* renamed from: d */
    public final /* synthetic */ OpenFileRequest.C17886b f241516d;

    public C82429f1(OpenFileRequest.C17886b bVar) {
        this.f241516d = bVar;
    }

    /* renamed from: a */
    public void mo894a(Object obj) {
        IPCInteger iPCInteger = (IPCInteger) obj;
        if (iPCInteger == null) {
            Log.m105920e("MicroMsg.AppBrand.OpenFileRequest", "fav ipc callback data null");
            return;
        }
        int i = iPCInteger.f10313d;
        Log.m105925i("MicroMsg.AppBrand.OpenFileRequest", "fav result:%d", Integer.valueOf(i));
        MMActivity activityContext = this.f241516d.getActivityContext();
        if (i == 0) {
            MMHandlerThread.postToMainThread(new C82426e1(this, activityContext));
        }
    }
}
