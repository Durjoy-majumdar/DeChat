package com.tencent.p014mm.plugin.textstatus.util;

import b03.C39701i;
import com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import kj2.C117407d;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.textstatus.util.a */
public final class C30509a extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ CheckResUpdateCacheFileEvent f82194d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C30509a(CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent) {
        super(0);
        this.f82194d = checkResUpdateCacheFileEvent;
    }

    public Object invoke() {
        try {
            C39701i iVar = C39701i.f106511a;
            String str = this.f82194d.f78743d.f78746c;
            C87412m.m108593f(str, "event.data.filePath");
            iVar.mo62332Z(str);
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.TextStatus.StatusIconHelper", th, "updateRes exception", new Object[0]);
        }
        C117407d.INSTANCE.idkeyStat(1629, 9, 1, false);
        return C13598b0.f38549a;
    }
}
