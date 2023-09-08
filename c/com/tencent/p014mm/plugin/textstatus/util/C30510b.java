package com.tencent.p014mm.plugin.textstatus.util;

import a70.C112760b;
import b03.C39701i;
import com.tencent.p014mm.autogen.events.LocalCheckResUpdateCacheFileEvent;
import com.tencent.p014mm.vfs.C86013q1;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.textstatus.util.b */
public final class C30510b extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ LocalCheckResUpdateCacheFileEvent f82195d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C30510b(LocalCheckResUpdateCacheFileEvent localCheckResUpdateCacheFileEvent) {
        super(0);
        this.f82195d = localCheckResUpdateCacheFileEvent;
    }

    public Object invoke() {
        String str = C112760b.m154225d() + "textstatus/icon";
        if (!C86013q1.m106450k(str)) {
            C86013q1.m106461v(str);
        }
        C86013q1.m106445f(str);
        C39701i iVar = C39701i.f106511a;
        String str2 = this.f82195d.f78859d.f78862c;
        C87412m.m108593f(str2, "event.data.filePath");
        iVar.mo62332Z(str2);
        return C13598b0.f38549a;
    }
}
