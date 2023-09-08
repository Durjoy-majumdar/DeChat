package com.tencent.p014mm.sns_compose.page;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import p004b0.C103941f;
import p175j0.C108504h;
import p175j0.C60690y0;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.sns_compose.page.l */
public final class C57581l extends C87413o implements C32228q<C103941f, C108504h, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f164883d;

    /* renamed from: e */
    public final /* synthetic */ C60690y0<String> f164884e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57581l(String str, C60690y0<String> y0Var) {
        super(3);
        this.f164883d = str;
        this.f164884e = y0Var;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        C108504h hVar = (C108504h) obj2;
        int intValue = ((Number) obj3).intValue();
        C87412m.m108594g((C103941f) obj, "$this$item");
        if ((intValue & 81) != 16 || !hVar.mo51575a()) {
            String str = this.f164883d;
            C87412m.m108593f(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            C106620k.m143963b(str, this.f164884e, hVar, 48);
        } else {
            hVar.mo51581d();
        }
        return C13598b0.f38549a;
    }
}
