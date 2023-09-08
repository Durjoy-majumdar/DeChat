package jh3;

import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.service.CommonProcessService;
import com.tencent.p014mm.service.MMService;

public final /* synthetic */ class a$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CommonProcessService.C116017a f351337d;

    /* renamed from: e */
    public final /* synthetic */ Intent f351338e;

    public /* synthetic */ a$$b(CommonProcessService.C116017a aVar, Intent intent) {
        this.f351337d = aVar;
        this.f351338e = intent;
    }

    public final void run() {
        CommonProcessService.C116017a aVar = this.f351337d;
        Intent intent = this.f351338e;
        aVar.getClass();
        intent.setExtrasClassLoader(CommonProcessService.class.getClassLoader());
        String stringExtra = intent.getStringExtra("class_name");
        MMService mMService = CommonProcessService.f347997g.get(stringExtra);
        if (mMService != null) {
            mMService.mo119618a(intent, "stop");
            C87963c.m109462a(24, 1, false);
        }
        Log.m105925i(CommonProcessService.this.mo174289c(), "stopService() class_name = %s", stringExtra);
    }
}
