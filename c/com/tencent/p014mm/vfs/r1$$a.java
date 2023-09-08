package com.tencent.p014mm.vfs;

import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.FileSystem;
import java.util.HashSet;
import qp3.C118196a;

/* renamed from: com.tencent.mm.vfs.r1$$a */
public final /* synthetic */ class r1$$a implements C118196a.C89789a {

    /* renamed from: a */
    public final /* synthetic */ HashSet f250491a;

    /* renamed from: b */
    public final /* synthetic */ boolean f250492b;

    /* renamed from: c */
    public final /* synthetic */ C116281f0.C116288h f250493c;

    public /* synthetic */ r1$$a(HashSet hashSet, boolean z, C116281f0.C116288h hVar) {
        this.f250491a = hashSet;
        this.f250492b = z;
        this.f250493c = hVar;
    }

    /* renamed from: a */
    public final Iterable mo119949a(Object obj) {
        HashSet hashSet = this.f250491a;
        boolean z = this.f250492b;
        C116281f0.C116288h hVar = this.f250493c;
        FileSystem.C85995c cVar = (FileSystem.C85995c) obj;
        if (!hashSet.add(cVar)) {
            return null;
        }
        String str = hVar.f348992b;
        return z ? C116299g2.m163860p(cVar, str, false, (C116299g2.C86006b<C86001b0>) null) : cVar.list(str);
    }
}
