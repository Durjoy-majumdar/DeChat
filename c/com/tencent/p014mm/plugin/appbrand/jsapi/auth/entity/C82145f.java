package com.tencent.p014mm.plugin.appbrand.jsapi.auth.entity;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import gt0.C87330d0;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.entity.f */
public final class C82145f<T> implements C1256g {

    /* renamed from: d */
    public final /* synthetic */ C82139c f240950d;

    /* renamed from: e */
    public final /* synthetic */ int f240951e;

    /* renamed from: f */
    public final /* synthetic */ ArrayList<C87330d0.C87331a> f240952f;

    /* renamed from: g */
    public final /* synthetic */ C82136a f240953g;

    public C82145f(C82139c cVar, int i, ArrayList<C87330d0.C87331a> arrayList, C82136a aVar) {
        this.f240950d = cVar;
        this.f240951e = i;
        this.f240952f = arrayList;
        this.f240953g = aVar;
    }

    /* renamed from: a */
    public void mo894a(Object obj) {
        MMHandlerThread.postToMainThread(new C82144e((IPCBoolean) obj, this.f240950d, this.f240951e, this.f240952f, this.f240953g));
    }
}
