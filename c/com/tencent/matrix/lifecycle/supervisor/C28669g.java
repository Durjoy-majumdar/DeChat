package com.tencent.matrix.lifecycle.supervisor;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Map;
import rx3.C13598b0;

/* renamed from: com.tencent.matrix.lifecycle.supervisor.g */
public final class C28669g extends C87413o implements C32226l<Map.Entry<? extends ProcessToken, ? extends C28665d>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f78644d;

    /* renamed from: e */
    public final /* synthetic */ String f78645e;

    /* renamed from: f */
    public final /* synthetic */ int f78646f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28669g(String str, String str2, int i) {
        super(1);
        this.f78644d = str;
        this.f78645e = str2;
        this.f78646f = i;
    }

    public Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        C87412m.m108594g(entry, LocaleUtil.ITALIAN);
        ((C28665d) entry.getValue()).mo56256b9(this.f78644d, this.f78645e, this.f78646f);
        return C13598b0.f38549a;
    }
}
