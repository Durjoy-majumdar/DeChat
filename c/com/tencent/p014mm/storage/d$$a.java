package com.tencent.p014mm.storage;

import com.tencent.p014mm.sdk.storage.MStorageEventData;
import p261wl.C15510f;
import p261wl.C38172g;

/* renamed from: com.tencent.mm.storage.d$$a */
public final /* synthetic */ class d$$a implements C38172g {

    /* renamed from: a */
    public final /* synthetic */ MStorageEventData f82647a;

    public /* synthetic */ d$$a(MStorageEventData mStorageEventData) {
        this.f82647a = mStorageEventData;
    }

    public final boolean invoke(C15510f fVar) {
        MStorageEventData mStorageEventData = this.f82647a;
        ((d$$b) fVar).onNotifyChange(mStorageEventData.event, mStorageEventData);
        return false;
    }
}
