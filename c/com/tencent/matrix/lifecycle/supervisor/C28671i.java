package com.tencent.matrix.lifecycle.supervisor;

import com.tencent.matrix.util.MemInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Map;
import rx3.C13598b0;

/* renamed from: com.tencent.matrix.lifecycle.supervisor.i */
public final class C28671i extends C87413o implements C32226l<Map.Entry<? extends ProcessToken, ? extends C28665d>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ ArrayList f78650d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28671i(ArrayList arrayList) {
        super(1);
        this.f78650d = arrayList;
    }

    public Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        C87412m.m108594g(entry, LocaleUtil.ITALIAN);
        MemInfo uY = ((C28665d) entry.getValue()).mo56257uY();
        if (uY != null) {
            this.f78650d.add(uY);
        }
        return C13598b0.f38549a;
    }
}
