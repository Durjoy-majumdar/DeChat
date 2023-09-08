package com.tencent.p014mm.vfs;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import z04.C112551y;

/* renamed from: com.tencent.mm.vfs.w1 */
public final class C75068w1 extends C87413o implements C32226l<String, String> {

    /* renamed from: d */
    public final /* synthetic */ C75055a1 f220852d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C75068w1(C75055a1 a1Var) {
        super(1);
        this.f220852d = a1Var;
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        C87412m.m108594g(str, LocaleUtil.ITALIAN);
        return C112551y.m153814n(str, "${dir}", this.f220852d.f220815b, false);
    }
}
