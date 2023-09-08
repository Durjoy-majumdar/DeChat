package com.tencent.p014mm.plugin.appbrand.utils;

import al3.C0086a;
import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import qo3.C77389a;
import qo3.C77398g;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.s0 */
public class C2048s0 {
    /* renamed from: a */
    public static C77398g m1999a(Context context, String str, String str2, DialogInterface.OnClickListener onClickListener) {
        C77389a aVar = new C77389a();
        aVar.f225644a = str;
        aVar.f225663t = str2;
        aVar.f225620C = onClickListener;
        C77398g gVar = new C77398g(context, C0966R.style.a66);
        gVar.mo107525e(aVar);
        gVar.show();
        return gVar;
    }

    /* renamed from: b */
    public static C77398g m2000b(Context context, String str, String str2, boolean z, DialogInterface.OnClickListener onClickListener) {
        C77389a aVar = new C77389a();
        aVar.f225644a = str2;
        aVar.f225660q = str;
        aVar.f225663t = C0086a.m38a(context).getString(C0966R.string.gky);
        aVar.f225620C = onClickListener;
        aVar.f225668y = z;
        C77398g gVar = new C77398g(context, C0966R.style.a66);
        gVar.mo107525e(aVar);
        gVar.show();
        return gVar;
    }
}
