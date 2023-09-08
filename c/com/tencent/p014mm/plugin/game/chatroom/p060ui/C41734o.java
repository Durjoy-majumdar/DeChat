package com.tencent.p014mm.plugin.game.chatroom.p060ui;

import androidx.recyclerview.widget.RecyclerView;
import dx1.C45489f;
import gy3.C87412m;
import rx3.C13604l;

/* renamed from: com.tencent.mm.plugin.game.chatroom.ui.o */
public final class C41734o extends RecyclerView.C16631z {

    /* renamed from: A */
    public final String f112321A;

    /* renamed from: B */
    public final long f112322B;

    /* renamed from: C */
    public final long f112323C;

    /* renamed from: D */
    public C13604l<Boolean, String> f112324D;

    /* renamed from: z */
    public final C45489f f112325z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41734o(C45489f fVar, String str, long j, long j2) {
        super(fVar.f123129a);
        C87412m.m108594g(fVar, "binding");
        C87412m.m108594g(str, "chatroomName");
        this.f112325z = fVar;
        this.f112321A = str;
        this.f112322B = j;
        this.f112323C = j2;
    }
}
