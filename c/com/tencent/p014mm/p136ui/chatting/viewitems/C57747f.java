package com.tencent.p014mm.p136ui.chatting.viewitems;

import a14.C0000n0;
import android.app.Activity;
import android.widget.ImageView;
import ck3.C67391b;
import di3.C86312j;
import fy3.C32227p;
import gy3.C87412m;
import ht1.C60151b;
import kotlin.ResultKt;
import p565ir.C60606n;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed$BaseChattingItemAppMsgFinderLiveFeed$fillActivityIcon$1$1", mo125469f = "ChatingItemAppMsgFinderLiveFeed.kt", mo125470l = {950}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.ui.chatting.viewitems.f */
public final class C57747f extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f165282d;

    /* renamed from: e */
    public final /* synthetic */ C67391b f165283e;

    /* renamed from: f */
    public final /* synthetic */ long f165284f;

    /* renamed from: g */
    public final /* synthetic */ C60151b f165285g;

    /* renamed from: h */
    public final /* synthetic */ ImageView f165286h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57747f(C67391b bVar, long j, C60151b bVar2, ImageView imageView, C15601d<? super C57747f> dVar) {
        super(2, dVar);
        this.f165283e = bVar;
        this.f165284f = j;
        this.f165285g = bVar2;
        this.f165286h = imageView;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C57747f(this.f165283e, this.f165284f, this.f165285g, this.f165286h, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C57747f) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f165282d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C60606n nVar = (C60606n) C86312j.m106911c(C60606n.class);
            Activity f = this.f165283e.mo91565f();
            C87412m.m108593f(f, "chattingContext.context");
            long j = this.f165284f;
            String str = this.f165285g.f171698b.f184790s;
            if (str == null) {
                str = "";
            }
            ImageView imageView = this.f165286h;
            this.f165282d = 1;
            if (nVar.vj0(f, j, str, imageView, 2, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C13598b0.f38549a;
    }
}
