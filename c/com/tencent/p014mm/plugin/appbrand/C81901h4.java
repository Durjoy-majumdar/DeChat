package com.tencent.p014mm.plugin.appbrand;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gt0.C87325b;

/* renamed from: com.tencent.mm.plugin.appbrand.h4 */
public class C81901h4 extends C87325b {

    /* renamed from: X */
    public final /* synthetic */ AppBrandRuntimeWC f240233X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C81901h4(Context context, AppBrandRuntimeWC appBrandRuntimeWC) {
        super(context);
        this.f240233X = appBrandRuntimeWC;
        setCanceledOnTouchOutside(false);
        setCancelable(false);
        mo107533r(MMApplicationContext.getString(appBrandRuntimeWC.mo121254q1() ? C0966R.string.a4q : C0966R.string.a4p));
        mo107541v(C0966R.string.a4o, new h4$$a(appBrandRuntimeWC));
    }
}
