package com.tencent.p014mm.storage;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import ob0.C117747y;
import ob0.C47350c;
import ob0.l0$$e;
import te3.C64427hp3;

/* renamed from: com.tencent.mm.storage.n0 */
public final class C6714n0 implements l0$$e {

    /* renamed from: d */
    public final /* synthetic */ LinkedList<C64427hp3> f24125d;

    /* renamed from: e */
    public final /* synthetic */ int f24126e;

    public C6714n0(LinkedList<C64427hp3> linkedList, int i) {
        this.f24125d = linkedList;
        this.f24126e = i;
    }

    /* renamed from: a */
    public final int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
        Log.m105924i("MicroMsg.BizRecycleCardLogic", "recycleReport callback errType = " + i + ", errCode=" + i2 + ", size = " + this.f24125d.size() + ", fromScene=" + this.f24126e);
        return 0;
    }
}
