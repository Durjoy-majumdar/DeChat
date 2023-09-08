package com.tencent.p014mm.plugin.finder.feed.model;

import bl3.C39818r;
import com.tencent.p014mm.protocal.protobuf.FinderCommentInfo;
import java.util.LinkedList;
import rs1.C13282j2;

/* renamed from: com.tencent.mm.plugin.finder.feed.model.n */
public final class C2809n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C55776r f14038d;

    /* renamed from: e */
    public final /* synthetic */ long f14039e;

    /* renamed from: f */
    public final /* synthetic */ LinkedList<FinderCommentInfo> f14040f;

    public C2809n(C55776r rVar, long j, LinkedList<FinderCommentInfo> linkedList) {
        this.f14038d = rVar;
        this.f14039e = j;
        this.f14040f = linkedList;
    }

    public final void run() {
        C13282j2 j2Var = (C13282j2) C39818r.f106831a.mo62444c(this.f14038d.f158806g).mo62449e(C13282j2.class);
        if (j2Var != null) {
            j2Var.mo12733j3(this.f14039e).postValue(this.f14040f);
        }
    }
}
