package com.tencent.p014mm.vfs;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: com.tencent.mm.vfs.x1 */
public final class C75069x1 extends C87413o implements C32226l<String, String> {

    /* renamed from: d */
    public final /* synthetic */ C75055a1 f220853d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C75069x1(C75055a1 a1Var) {
        super(1);
        this.f220853d = a1Var;
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        C87412m.m108594g(str, LocaleUtil.ITALIAN);
        return str + this.f220853d.f220815b;
    }
}
