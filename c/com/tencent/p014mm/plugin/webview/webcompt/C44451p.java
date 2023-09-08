package com.tencent.p014mm.plugin.webview.webcompt;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Arrays;

/* renamed from: com.tencent.mm.plugin.webview.webcompt.p */
public final class C44451p extends C87413o implements C32226l<Byte, CharSequence> {

    /* renamed from: d */
    public static final C44451p f120548d = new C44451p();

    public C44451p() {
        super(1);
    }

    public Object invoke(Object obj) {
        String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(((Number) obj).byteValue())}, 1));
        C87412m.m108593f(format, "format(this, *args)");
        return format;
    }
}
