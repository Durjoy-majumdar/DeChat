package com.tencent.p014mm.mj_template.sns.compose.widget;

import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import te3.o74;

/* renamed from: com.tencent.mm.mj_template.sns.compose.widget.v */
public final class C55356v extends C87413o implements C32227p<Integer, C28971l<o74>, Object> {

    /* renamed from: d */
    public static final C55356v f157653d = new C55356v();

    public C55356v() {
        super(2);
    }

    public Object invoke(Object obj, Object obj2) {
        ((Number) obj).intValue();
        C28971l lVar = (C28971l) obj2;
        C87412m.m108594g(lVar, "item");
        String str = ((o74) lVar.f79451a).f139006d;
        C87412m.m108593f(str, "item.data.music_id");
        return str;
    }
}
