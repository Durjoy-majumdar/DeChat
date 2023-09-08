package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.app.Activity;
import android.content.Intent;
import ck3.C67391b;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87413o;
import ht1.C60151b;
import ht1.C60200t1;
import ls3.C61397g;
import rx3.C13598b0;
import te3.C64623p81;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.g */
public final class C57755g extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Intent f165300d;

    /* renamed from: e */
    public final /* synthetic */ C67391b f165301e;

    /* renamed from: f */
    public final /* synthetic */ long f165302f;

    /* renamed from: g */
    public final /* synthetic */ long f165303g;

    /* renamed from: h */
    public final /* synthetic */ C60151b f165304h;

    /* renamed from: i */
    public final /* synthetic */ String f165305i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57755g(Intent intent, C67391b bVar, long j, long j2, C60151b bVar2, String str) {
        super(0);
        this.f165300d = intent;
        this.f165301e = bVar;
        this.f165302f = j;
        this.f165303g = j2;
        this.f165304h = bVar2;
        this.f165305i = str;
    }

    public Object invoke() {
        C61397g gVar = (C61397g) C86312j.m106911c(C61397g.class);
        Intent intent = this.f165300d;
        intent.putExtra("CURRENT_FEED_ID", this.f165302f);
        intent.putExtra("LAUNCH_WITH_ANIM", true);
        Activity f = this.f165301e.mo91565f();
        long j = this.f165302f;
        long j2 = this.f165303g;
        C64623p81 p812 = this.f165304h.f171698b;
        String str = p812.f184779e;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String str3 = p812.f184790s;
        if (str3 != null) {
            str2 = str3;
        }
        gVar.mo83482aR(intent, f, j, j2, str, str2, p812.f184782h, this.f165305i, ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76861l7().mo83771R5());
        return C13598b0.f38549a;
    }
}
