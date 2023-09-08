package com.tencent.p014mm.storage;

import com.tencent.p014mm.sdk.storage.MStorageEx;
import p261wl.C15510f;
import p261wl.C38172g;

/* renamed from: com.tencent.mm.storage.v1$$a */
public final /* synthetic */ class v1$$a implements C38172g {

    /* renamed from: a */
    public final /* synthetic */ int f82762a;

    /* renamed from: b */
    public final /* synthetic */ MStorageEx f82763b;

    /* renamed from: c */
    public final /* synthetic */ Object f82764c;

    public /* synthetic */ v1$$a(int i, MStorageEx mStorageEx, Object obj) {
        this.f82762a = i;
        this.f82763b = mStorageEx;
        this.f82764c = obj;
    }

    public final boolean invoke(C15510f fVar) {
        ((v1$$c) fVar).onNotifyChange(this.f82762a, this.f82763b, this.f82764c);
        return false;
    }
}
