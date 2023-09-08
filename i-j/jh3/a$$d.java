package jh3;

import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.service.C116018a;
import com.tencent.p014mm.service.CommonProcessService;

public final /* synthetic */ class a$$d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CommonProcessService.C116017a f351341d;

    /* renamed from: e */
    public final /* synthetic */ Intent f351342e;

    /* renamed from: f */
    public final /* synthetic */ C116018a f351343f;

    public /* synthetic */ a$$d(CommonProcessService.C116017a aVar, Intent intent, C116018a aVar2) {
        this.f351341d = aVar;
        this.f351342e = intent;
        this.f351343f = aVar2;
    }

    public final void run() {
        CommonProcessService.C116017a aVar = this.f351341d;
        Intent intent = this.f351342e;
        C116018a aVar2 = this.f351343f;
        aVar.getClass();
        intent.setExtrasClassLoader(CommonProcessService.class.getClassLoader());
        String stringExtra = intent.getStringExtra("class_name");
        try {
            IBinder a = CommonProcessService.m163136b(CommonProcessService.this, stringExtra).mo119618a(intent, "bind");
            if (aVar2 != null) {
                try {
                    aVar2.mo176874Gy(a);
                } catch (RemoteException e) {
                    Log.m105925i(CommonProcessService.this.mo174289c(), "bindService() immserviceConnectionStubAIDL RemoteException: %s", e.getMessage());
                }
            }
            C87963c.m109462a(39, 1, false);
            Log.m105925i(CommonProcessService.this.mo174289c(), "bindService() class_name = %s", stringExtra);
        } catch (Exception e2) {
            Log.m105925i(CommonProcessService.this.mo174289c(), "bindService()  Class.forName(%s) Exception: %s", stringExtra, e2.getMessage());
        }
    }
}
