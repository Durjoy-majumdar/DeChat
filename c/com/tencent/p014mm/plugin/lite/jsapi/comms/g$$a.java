package com.tencent.p014mm.plugin.lite.jsapi.comms;

import java.util.HashMap;
import kr0.C76633z0;

/* renamed from: com.tencent.mm.plugin.lite.jsapi.comms.g$$a */
public final /* synthetic */ class g$$a implements C76633z0.C10404a {

    /* renamed from: a */
    public final /* synthetic */ C4786g f19828a;

    public /* synthetic */ g$$a(C4786g gVar) {
        this.f19828a = gVar;
    }

    /* renamed from: a */
    public final void mo5695a(int i, String str) {
        C4786g gVar = this.f19828a;
        gVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("retCode", Integer.valueOf(i));
        hashMap.put("errMsg", str);
        gVar.f19815f.mo5691c(hashMap);
    }
}
