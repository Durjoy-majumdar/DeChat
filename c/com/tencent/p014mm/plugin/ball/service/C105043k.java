package com.tencent.p014mm.plugin.ball.service;

import com.tencent.p014mm.plugin.ball.model.BallInfo;
import p261wl.C15510f;
import p261wl.C38172g;
import xv0.C112183f;

/* renamed from: com.tencent.mm.plugin.ball.service.k */
public class C105043k implements C38172g<C112183f> {

    /* renamed from: a */
    public final /* synthetic */ BallInfo f311791a;

    /* renamed from: b */
    public final /* synthetic */ BallInfo f311792b;

    public C105043k(C105035c cVar, BallInfo ballInfo, BallInfo ballInfo2) {
        this.f311791a = ballInfo;
        this.f311792b = ballInfo2;
    }

    public boolean invoke(C15510f fVar) {
        ((C112183f) fVar).mo61808X4(this.f311791a, this.f311792b);
        return false;
    }
}
