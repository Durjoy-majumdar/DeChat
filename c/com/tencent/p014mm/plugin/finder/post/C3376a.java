package com.tencent.p014mm.plugin.finder.post;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import ao1.C0152g0;
import bl3.C39818r;
import com.tencent.p014mm.autogen.events.PostJumpInfoEvent;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.post.a */
public final class C3376a extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ PostJumpInfoEvent f15873d;

    /* renamed from: e */
    public final /* synthetic */ PostMainUIC f15874e;

    /* renamed from: f */
    public final /* synthetic */ AppCompatActivity f15875f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3376a(PostJumpInfoEvent postJumpInfoEvent, PostMainUIC postMainUIC, AppCompatActivity appCompatActivity) {
        super(0);
        this.f15873d = postJumpInfoEvent;
        this.f15874e = postMainUIC;
        this.f15875f = appCompatActivity;
    }

    public Object invoke() {
        PostJumpInfoEvent postJumpInfoEvent = this.f15873d;
        if (postJumpInfoEvent != null) {
            PostMainUIC postMainUIC = this.f15874e;
            AppCompatActivity appCompatActivity = this.f15875f;
            postMainUIC.mo78410F3().f152946D = postJumpInfoEvent.f9401d.f9402a;
            Intent intent = postMainUIC.getIntent();
            FinderJumpInfo finderJumpInfo = postMainUIC.mo78410F3().f152946D;
            intent.putExtra("JUMP_INFO", finderJumpInfo != null ? finderJumpInfo.toByteArray() : null);
            ((C0152g0) C39818r.f106831a.mo62444c(appCompatActivity).mo75002a(C0152g0.class)).mo145f3();
        }
        return C13598b0.f38549a;
    }
}
