package com.tencent.p014mm.plugin.appbrand.extendplugin;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82531i;
import p830xc.C91165a;

/* renamed from: com.tencent.mm.plugin.appbrand.extendplugin.b$$d */
public class b$$d implements C82531i.C82534c {

    /* renamed from: d */
    public final /* synthetic */ C91165a.C53318a f240085d;

    public b$$d(C81823b bVar, C91165a.C53318a aVar) {
        this.f240085d = aVar;
    }

    public void onDestroy() {
        C91165a.C53318a aVar = this.f240085d;
        if (aVar != null) {
            aVar.onDestroy();
        }
    }
}
