package com.tencent.p014mm.plugin.appbrand.jsapi.auth.entity;

import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.sdk.platformtools.Log;
import gt0.C87330d0;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.entity.e */
public final class C82144e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ IPCBoolean f240945d;

    /* renamed from: e */
    public final /* synthetic */ C82139c f240946e;

    /* renamed from: f */
    public final /* synthetic */ int f240947f;

    /* renamed from: g */
    public final /* synthetic */ ArrayList<C87330d0.C87331a> f240948g;

    /* renamed from: h */
    public final /* synthetic */ C82136a f240949h;

    public C82144e(IPCBoolean iPCBoolean, C82139c cVar, int i, ArrayList<C87330d0.C87331a> arrayList, C82136a aVar) {
        this.f240945d = iPCBoolean;
        this.f240946e = cVar;
        this.f240947f = i;
        this.f240948g = arrayList;
        this.f240949h = aVar;
    }

    public final void run() {
        IPCBoolean iPCBoolean = this.f240945d;
        boolean z = iPCBoolean != null ? iPCBoolean.f10312d : false;
        if (!z) {
            C82139c cVar = this.f240946e;
            cVar.mo114582b(cVar.f240938e);
            Log.m105925i("WxaUserInfoListOperationController", "delete avatar failed, revert delete item. index:" + this.f240947f, Integer.valueOf(this.f240947f));
        } else {
            this.f240946e.f240938e.clear();
            this.f240946e.f240938e.addAll(this.f240948g);
            Log.m105924i("WxaUserInfoListOperationController", "delete avatar success.index:" + this.f240947f + "  current szie=" + this.f240946e.f240938e.size());
        }
        C82136a aVar = this.f240949h;
        if (aVar != null) {
            aVar.mo114579a(z);
        }
    }
}
