package com.tencent.p014mm.plugin.webview.webcompt;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import te3.C48869bk2;

/* renamed from: com.tencent.mm.plugin.webview.webcompt.a0 */
public final class C44405a0 extends C87413o implements C32226l<C48869bk2, CharSequence> {

    /* renamed from: d */
    public static final C44405a0 f120355d = new C44405a0();

    public C44405a0() {
        super(1);
    }

    public Object invoke(Object obj) {
        C48869bk2 bk22 = (C48869bk2) obj;
        C87412m.m108594g(bk22, LocaleUtil.ITALIAN);
        return "name: " + bk22.f131168d + "\nmd5: " + bk22.f131170f + "\nurl: " + bk22.f131169e;
    }
}
