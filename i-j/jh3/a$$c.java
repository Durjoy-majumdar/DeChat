package jh3;

import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.service.CommonProcessService;
import com.tencent.p014mm.service.MMService;

public final /* synthetic */ class a$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CommonProcessService.C116017a f351339d;

    /* renamed from: e */
    public final /* synthetic */ Intent f351340e;

    public /* synthetic */ a$$c(CommonProcessService.C116017a aVar, Intent intent) {
        this.f351339d = aVar;
        this.f351340e = intent;
    }

    public final void run() {
        CommonProcessService.C116017a aVar = this.f351339d;
        Intent intent = this.f351340e;
        aVar.getClass();
        intent.setExtrasClassLoader(CommonProcessService.class.getClassLoader());
        String stringExtra = intent.getStringExtra("class_name");
        MMService mMService = CommonProcessService.f347997g.get(stringExtra);
        if (mMService != null) {
            mMService.mo119618a(intent, "unbind");
            C87963c.m109462a(54, 1, false);
        }
        Log.m105925i(CommonProcessService.this.mo174289c(), "unbindService() class_name = %s", stringExtra);
    }
}
