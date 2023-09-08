package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.ArrayList;
import lp3.C46888b;
import p225rc.g$$i;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.o */
public final class C55514o implements g$$i {

    /* renamed from: a */
    public final /* synthetic */ C46888b f158107a;

    /* renamed from: b */
    public final /* synthetic */ ArrayList<String> f158108b;

    public C55514o(C46888b bVar, ArrayList<String> arrayList) {
        this.f158107a = bVar;
        this.f158108b = arrayList;
    }

    /* renamed from: c */
    public final void mo1686c(String[] strArr, int[] iArr) {
        C87412m.m108593f(iArr, "grantResults");
        C46888b bVar = this.f158107a;
        ArrayList<String> arrayList = this.f158108b;
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i2 + 1;
            if (iArr[i] != 0) {
                bVar.mo72091a(new IllegalAccessException("fail:system permission denied"));
                Log.m105920e("MicroMsg.AppBrand.ChooseMediaWorkFlow", "interrupt pipeline, " + arrayList.get(i2) + " denied by user");
                return;
            }
            i++;
            i2 = i3;
        }
        this.f158107a.mo72093c(Boolean.TRUE);
    }
}
