package com.tencent.p014mm.plugin.lite.logic;

import com.tencent.liteapp.storage.WxaLiteAppInfo;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.plugin.lite.api.C115477b;
import com.tencent.p014mm.plugin.lite.logic.C115492q;

/* renamed from: com.tencent.mm.plugin.lite.logic.r */
public class C115498r implements C115477b {

    /* renamed from: a */
    public final /* synthetic */ C1256g f346269a;

    public C115498r(C115492q.C115497e eVar, C1256g gVar) {
        this.f346269a = gVar;
    }

    /* renamed from: a */
    public void mo5700a(String str, int i) {
        this.f346269a.mo894a(new IPCBoolean(false));
    }

    /* renamed from: b */
    public void mo5701b(WxaLiteAppInfo wxaLiteAppInfo, int i) {
        this.f346269a.mo894a(new IPCBoolean(true));
    }
}
