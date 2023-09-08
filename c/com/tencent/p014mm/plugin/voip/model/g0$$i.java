package com.tencent.p014mm.plugin.voip.model;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import nd3.C88930e;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.voip.model.g0$$i */
public final /* synthetic */ class g0$$i implements C88930e {

    /* renamed from: a */
    public final /* synthetic */ Context f21744a;

    public /* synthetic */ g0$$i(Context context) {
        this.f21744a = context;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Context context = this.f21744a;
        if (iArr[0] != 0) {
            C76879j.m92709C(context, context.getResources().getString(C0966R.string.f361130hi2), context.getResources().getString(C0966R.string.mxj), context.getResources().getString(C0966R.string.mzi), context.getResources().getString(C0966R.string.f8028zq), false, new g0$$b(context), new g0$$c());
        }
    }
}
