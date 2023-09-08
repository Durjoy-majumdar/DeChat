package com.tencent.p014mm.plugin.webview.modeltools;

import gy3.C87412m;
import kotlin.Result;
import nd3.C88930e;
import wx3.C15601d;

/* renamed from: com.tencent.mm.plugin.webview.modeltools.s */
public final class C6082s implements C88930e {

    /* renamed from: a */
    public final /* synthetic */ C15601d<Boolean> f22414a;

    public C6082s(C15601d<? super Boolean> dVar) {
        this.f22414a = dVar;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C87412m.m108594g(strArr, "permissions");
        C87412m.m108594g(iArr, "grantResults");
        int length = strArr.length;
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                z = true;
                break;
            } else if (iArr[i2] != 0) {
                break;
            } else {
                i2++;
            }
        }
        C15601d<Boolean> dVar = this.f22414a;
        Result.Companion companion = Result.Companion;
        dVar.resumeWith(Result.m168114constructorimpl(Boolean.valueOf(z)));
    }
}
