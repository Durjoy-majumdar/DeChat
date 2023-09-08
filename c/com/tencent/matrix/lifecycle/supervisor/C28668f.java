package com.tencent.matrix.lifecycle.supervisor;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Map;
import rx3.C13598b0;

/* renamed from: com.tencent.matrix.lifecycle.supervisor.f */
public final class C28668f extends C87413o implements C32226l<Map.Entry<? extends ProcessToken, ? extends C28665d>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f78640d;

    /* renamed from: e */
    public final /* synthetic */ String f78641e;

    /* renamed from: f */
    public final /* synthetic */ int f78642f;

    /* renamed from: g */
    public final /* synthetic */ boolean f78643g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28668f(String str, String str2, int i, boolean z) {
        super(1);
        this.f78640d = str;
        this.f78641e = str2;
        this.f78642f = i;
        this.f78643g = z;
    }

    public Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        C87412m.m108594g(entry, LocaleUtil.ITALIAN);
        ((C28665d) entry.getValue()).F60(this.f78640d, this.f78641e, this.f78642f, this.f78643g);
        return C13598b0.f38549a;
    }
}
