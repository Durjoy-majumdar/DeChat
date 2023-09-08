package com.tencent.p014mm.pluginsdk.p133ui.tools;

import com.tencent.p014mm.pluginsdk.p133ui.tools.FileSelectorUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import kv1.C99260q;
import lv1.C76728k;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.a0 */
public final class C96864a0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FileSelectorUI.C96826a f283839d;

    public C96864a0(FileSelectorUI.C96826a aVar) {
        this.f283839d = aVar;
    }

    public final void run() {
        Class cls = C99260q.class;
        long currentTimeMillis = System.currentTimeMillis();
        FileSelectorUI.C96826a aVar = this.f283839d;
        boolean z = aVar.f283732h;
        if (!z) {
            aVar.f283732h = true;
            if (aVar.f283722p != null) {
                ((C99260q) C86312j.m106911c(cls)).mo128757ki(aVar.f283722p);
            }
            C76728k kVar = new C76728k();
            kVar.f224468c = "query_app_msg_file";
            kVar.f224469d = null;
            kVar.f224473h = new int[]{42};
            kVar.f224478m = aVar;
            kVar.f224479n = aVar.f283721o;
            kVar.f224467b = 256;
            aVar.f283722p = ((C99260q) C86312j.m106911c(cls)).Xn0(3, kVar);
            Log.m105925i("MicroMsg.FileSelectorUI", "do search %s", "query_app_msg_file");
        } else {
            aVar.mo135140d();
        }
        Log.m105924i("MicroMsg.FileSelectorUI", "[isInit:" + z + "] chatting load data end:" + (System.currentTimeMillis() - currentTimeMillis) + ", startIndex:" + this.f283839d.f283733i);
    }
}
