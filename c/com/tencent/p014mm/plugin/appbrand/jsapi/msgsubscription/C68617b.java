package com.tencent.p014mm.plugin.appbrand.jsapi.msgsubscription;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import wt0.C78650e;
import zd0.C23466p;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.b */
public final class C68617b implements C23466p.C23484n {

    /* renamed from: a */
    public final /* synthetic */ GetSubscribeMsgListExecutor f197095a;

    public C68617b(GetSubscribeMsgListExecutor getSubscribeMsgListExecutor) {
        this.f197095a = getSubscribeMsgListExecutor;
    }

    /* renamed from: a */
    public void mo36964a(Context context, boolean z) {
        C87412m.m108594g(context, "context");
        String string = z ? MMApplicationContext.getResources().getString(C0966R.string.na9) : MMApplicationContext.getResources().getString(C0966R.string.na_);
        C87412m.m108593f(string, "if(isCheck) MMApplicatio…orce_notify_cancel_toast)");
        C78650e eVar = this.f197095a.f49391n;
        if (eVar != null) {
            eVar.dismiss();
        }
        GetSubscribeMsgListExecutor getSubscribeMsgListExecutor = this.f197095a;
        C78650e eVar2 = new C78650e(context, false);
        eVar2.mo108614a(string);
        eVar2.setFocusable(false);
        eVar2.mo108615b(1500);
        getSubscribeMsgListExecutor.f49391n = eVar2;
    }
}
