package jh3;

import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.service.CommonProcessService;
import com.tencent.xweb.IXWebBroadcastListener;

public final /* synthetic */ class a$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CommonProcessService.C116017a f351335d;

    /* renamed from: e */
    public final /* synthetic */ Intent f351336e;

    public /* synthetic */ a$$a(CommonProcessService.C116017a aVar, Intent intent) {
        this.f351335d = aVar;
        this.f351336e = intent;
    }

    public final void run() {
        CommonProcessService.C116017a aVar = this.f351335d;
        Intent intent = this.f351336e;
        aVar.getClass();
        intent.setExtrasClassLoader(CommonProcessService.class.getClassLoader());
        String stringExtra = intent.getStringExtra("class_name");
        try {
            CommonProcessService.m163136b(CommonProcessService.this, stringExtra).mo119618a(intent, IXWebBroadcastListener.STAGE_START);
            C87963c.m109462a(8, 1, false);
            Log.m105925i(CommonProcessService.this.mo174289c(), "startService() class_name = %s", stringExtra);
        } catch (Exception e) {
            Log.m105925i(CommonProcessService.this.mo174289c(), "startService()  Class.forName(%s) Exception: %s", stringExtra, e.getMessage());
        }
    }
}
