package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import te3.C22495eh;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.q0 */
public final class C18334q0 extends C87413o implements C32226l<C22495eh, Boolean> {

    /* renamed from: d */
    public static final C18334q0 f50742d = new C18334q0();

    public C18334q0() {
        super(1);
    }

    public Object invoke(Object obj) {
        C22495eh ehVar = (C22495eh) obj;
        C87412m.m108594g(ehVar, "info");
        return Util.isNullOrNil(ehVar.f63794e) ? Boolean.FALSE : Util.isNullOrNil((List) ehVar.f63800n) ? Boolean.FALSE : Boolean.TRUE;
    }
}
