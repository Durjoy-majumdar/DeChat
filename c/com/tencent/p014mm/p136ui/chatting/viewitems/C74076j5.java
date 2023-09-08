package com.tencent.p014mm.p136ui.chatting.viewitems;

import ck3.C67391b;
import com.tencent.p014mm.sdk.platformtools.Log;
import rd0.C22222c;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.j5 */
public class C74076j5 implements C22222c.C22224b {

    /* renamed from: a */
    public final /* synthetic */ ChattingItemDyeingTemplate f217397a;

    public C74076j5(ChattingItemDyeingTemplate chattingItemDyeingTemplate) {
        this.f217397a = chattingItemDyeingTemplate;
    }

    /* renamed from: a */
    public void mo35378a() {
        Log.m105920e("MicroMsg.ChattingItemDyeingTemplate", "alvinluo switchSubscribeStatus onError");
        C67391b bVar = this.f217397a.f216867v;
        if (bVar != null) {
            bVar.mo91540A();
        }
    }

    /* renamed from: b */
    public void mo35379b(String str, C22222c.C22225c cVar) {
        Log.m105925i("MicroMsg.ChattingItemDyeingTemplate", "alvinluo switchSubscribeStatus onFinish isSubscribed: %b, switchOpen: %b", Boolean.valueOf(cVar.f62963a), Boolean.valueOf(cVar.f62964b));
    }
}
