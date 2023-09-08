package com.tencent.p014mm.plugin.magicbrush;

import com.tencent.p014mm.sdk.platformtools.Log;
import d42.C31068j;
import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;
import java.util.List;
import p52.C35370b;
import q52.C35765d;

@C86522b
/* renamed from: com.tencent.mm.plugin.magicbrush.r1 */
public final class C30224r1 extends C86301e implements C30204k0 {
    public C31068j wt0(String str, String str2) {
        C87412m.m108594g(str, "bizName");
        C35370b bVar = C35370b.f94703a;
        int i = C35370b.f94704b;
        if (i == 0) {
            Log.m105921e("MicroMsg.MagicBrushStorageFactory", "getOrCreateBizStorage uin invalid bizName:%s", str);
            return null;
        } else if (!C35765d.f95532b.contains(str) || str2 == null) {
            return bVar.mo60233a(str, i);
        } else {
            List list = C35370b.f94705c.get(str);
            if (list == null || !list.contains(str2)) {
                return null;
            }
            return bVar.mo60233a(str2, i);
        }
    }
}
