package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82739n;
import com.tencent.p014mm.vfs.C86009m1;
import java.util.ArrayList;
import java.util.Collection;
import lp3.C46888b;
import p225rc.g$$e;
import rx3.C13598b0;
import sx3.C64186f0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.r */
public final class C82757r implements g$$e {

    /* renamed from: a */
    public final /* synthetic */ C46888b f242085a;

    public C82757r(C46888b bVar) {
        this.f242085a = bVar;
    }

    /* renamed from: a */
    public final void mo1626a(int i, Intent intent) {
        if (intent == null || i == 0) {
            this.f242085a.mo72093c(C82739n.C82740a.f242060a);
            return;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        Collection stringArrayListExtra = intent.getStringArrayListExtra("key_select_video_list");
        if (stringArrayListExtra == null) {
            stringArrayListExtra = C64186f0.f181907d;
        }
        arrayList.addAll(stringArrayListExtra);
        Collection stringArrayListExtra2 = intent.getStringArrayListExtra("CropImage_OutputPath_List");
        if (stringArrayListExtra2 == null) {
            stringArrayListExtra2 = C64186f0.f181907d;
        }
        arrayList.addAll(stringArrayListExtra2);
        C46888b bVar = this.f242085a;
        Object[] objArr = new Object[1];
        ArrayList arrayList2 = new ArrayList();
        for (String m1Var : arrayList) {
            arrayList2.add(new C86009m1(m1Var));
        }
        C13598b0 b0Var = C13598b0.f38549a;
        objArr[0] = new C82739n.C82742c(arrayList2, 1);
        bVar.mo72093c(objArr);
    }
}
