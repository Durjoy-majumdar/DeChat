package com.tencent.p014mm.plugin.appbrand.jsapi.auth.entity;

import android.content.Context;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.type.IPCInteger;
import com.tencent.p014mm.plugin.appbrand.jsapi.auth.entity.C82139c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import gt0.C87330d0;
import gy3.C87412m;
import java.util.ArrayList;
import nj3.C11184p0;
import nj3.C76912y0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.entity.j */
public final class C82148j implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C82139c f240956d;

    /* renamed from: e */
    public final /* synthetic */ int f240957e;

    public C82148j(C82139c cVar, int i) {
        this.f240956d = cVar;
        this.f240957e = i;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        C82139c cVar = this.f240956d;
        int i2 = this.f240957e;
        C82136a aVar = cVar.f240941h;
        cVar.getClass();
        Log.m105924i("WxaUserInfoListOperationController", "[deleteUser] index=" + i2);
        if (!NetStatusUtil.isConnected(MMApplicationContext.getContext())) {
            Context context = cVar.f240934a;
            C76912y0.makeText(context, (CharSequence) context.getResources().getString(C0966R.string.f360087a11), 1).show();
            if (aVar != null) {
                aVar.onStart();
            }
            if (aVar != null) {
                aVar.mo114579a(false);
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList(cVar.f240938e);
        arrayList.remove(i2);
        C87330d0.C87331a aVar2 = cVar.f240938e.get(i2);
        C87412m.m108593f(aVar2, "mCurrentItems[itemIndex]");
        C87330d0.C87331a aVar3 = aVar2;
        if (aVar3.f253109h == cVar.f240939f.get()) {
            ((C87330d0.C87331a) arrayList.get(0)).f253107f = true;
        }
        aVar3.f253107f = false;
        cVar.mo114582b(arrayList);
        MMHandlerThread.postToMainThread(new C82143d(aVar));
        C80907o.m98781d(WeChatProcess.PROCESS_MAIN, new IPCInteger(aVar3.f253109h), C82139c.C82140a.class, new C82145f(cVar, i2, arrayList, aVar));
    }
}
