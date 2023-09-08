package com.tencent.p014mm.plugin.finder.feed.model;

import androidx.lifecycle.C54219z;
import bl3.C39818r;
import com.tencent.p014mm.protocal.protobuf.FinderCommentInfo;
import java.util.LinkedList;
import rs1.C13282j2;

/* renamed from: com.tencent.mm.plugin.finder.feed.model.p */
public final class C2812p implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C55776r f14047d;

    /* renamed from: e */
    public final /* synthetic */ long f14048e;

    /* renamed from: f */
    public final /* synthetic */ FinderCommentInfo f14049f;

    public C2812p(C55776r rVar, long j, FinderCommentInfo finderCommentInfo) {
        this.f14047d = rVar;
        this.f14048e = j;
        this.f14049f = finderCommentInfo;
    }

    public final void run() {
        C13282j2 j2Var = (C13282j2) C39818r.f106831a.mo62444c(this.f14047d.f158806g).mo62449e(C13282j2.class);
        if (j2Var != null) {
            C54219z<LinkedList<FinderCommentInfo>> j3 = j2Var.mo12733j3(this.f14048e);
            LinkedList linkedList = new LinkedList();
            linkedList.add(this.f14049f);
            j3.postValue(linkedList);
        }
    }
}
