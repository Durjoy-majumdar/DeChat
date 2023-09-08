package com.tencent.p014mm.plugin.appbrand.ipc;

import android.os.Parcelable;
import com.tencent.p014mm.ipcinvoker.C1256g;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.appbrand.ipc.n */
public final class C81968n<T extends Parcelable> implements C1256g<T> {

    /* renamed from: d */
    public C1256g<T> f240371d;

    public C81968n(C1256g<T> gVar) {
        this.f240371d = gVar;
    }

    /* renamed from: a */
    public void mo894a(Object obj) {
        Parcelable parcelable = (Parcelable) obj;
        C87412m.m108594g(parcelable, "data");
        C1256g<T> gVar = this.f240371d;
        if (gVar != null) {
            gVar.mo894a(parcelable);
        }
    }
}
