package com.tencent.p014mm.plugin.ball.service;

import com.tencent.p014mm.plugin.ball.model.BallInfo;
import p261wl.C15510f;
import p261wl.C38172g;
import xv0.C112183f;

/* renamed from: com.tencent.mm.plugin.ball.service.j */
public class C105042j implements C38172g<C112183f> {

    /* renamed from: a */
    public final /* synthetic */ BallInfo f311789a;

    /* renamed from: b */
    public final /* synthetic */ BallInfo f311790b;

    public C105042j(C105035c cVar, BallInfo ballInfo, BallInfo ballInfo2) {
        this.f311789a = ballInfo;
        this.f311790b = ballInfo2;
    }

    public boolean invoke(C15510f fVar) {
        ((C112183f) fVar).mo61808X4(this.f311789a, this.f311790b);
        return false;
    }
}
