package com.tencent.p014mm.p136ui.chatting.gallery;

import a14.C53916l;
import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.gallery.C97136u0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import gy3.C87412m;
import hd0.C98408n0;
import hd0.C98410o0;
import hd0.C98429r0;
import kotlin.Result;
import kotlin.ResultKt;
import p682rz.C101488s;
import p682rz.C101489t;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.ui.chatting.gallery.z0 */
public final class C97156z0 implements C101489t.C77595a {

    /* renamed from: d */
    public final /* synthetic */ C53916l<Boolean> f285098d;

    /* renamed from: e */
    public final /* synthetic */ C72963f4 f285099e;

    /* renamed from: f */
    public final /* synthetic */ C97136u0 f285100f;

    public C97156z0(C53916l<? super Boolean> lVar, C72963f4 f4Var, C97136u0 u0Var) {
        this.f285098d = lVar;
        this.f285099e = f4Var;
        this.f285100f = u0Var;
    }

    /* renamed from: d5 */
    public void mo102579d5(C101489t.C77595a.C77596a aVar) {
        Class cls = C101488s.class;
        C87412m.m108594g(aVar, "notifyInfo");
        if (!this.f285098d.mo74598c()) {
            C98408n0 o = C97052g.m124927o(this.f285099e);
            if (C87412m.m108589b(aVar.f226215a, o != null ? o.mo137700d() : null)) {
                C97136u0.C97137a aVar2 = this.f285100f.f285035s.get(aVar.f226215a);
                if (o == null || aVar2 == null) {
                    ((C98410o0) ((C101488s) C86312j.m106911c(cls)).Kj0()).mo137731u(this);
                    C53916l<Boolean> lVar = this.f285098d;
                    Result.Companion companion = Result.Companion;
                    lVar.resumeWith(Result.m168114constructorimpl(ResultKt.createFailure(new IllegalStateException("Couldn't find video info: info=" + o + ", item=" + aVar2))));
                    return;
                }
                Log.m105924i("MicroMsg.Imagegallery.handler.video.tp", "onNotifyChange, status:" + o.f288562i);
                if ((this.f285099e.mo100983V3() || !this.f285099e.mo100972K3()) && o.f288562i != 198) {
                    int h = C98429r0.m127817h(o);
                    C97087m1 h2 = this.f285100f.mo135877h(aVar2.f285043a);
                    if (this.f285100f.f284638d.f284714g.mo135768f8() == aVar2.f285043a && h2 != null) {
                        C97136u0.m125065E(this.f285100f, h2, h);
                    }
                    if (o.mo137710n()) {
                        this.f285100f.mo136045G(aVar2);
                        ((C98410o0) ((C101488s) C86312j.m106911c(cls)).Kj0()).mo137731u(this);
                        C53916l<Boolean> lVar2 = this.f285098d;
                        Result.Companion companion2 = Result.Companion;
                        lVar2.resumeWith(Result.m168114constructorimpl(Boolean.TRUE));
                        return;
                    }
                    return;
                }
                if (this.f285100f.mo136045G(aVar2)) {
                    C76701a.makeText((Context) this.f285100f.f284638d.f284714g, (int) C0966R.string.kab, 0).show();
                }
                ((C98410o0) ((C101488s) C86312j.m106911c(cls)).Kj0()).mo137731u(this);
                C53916l<Boolean> lVar3 = this.f285098d;
                Result.Companion companion3 = Result.Companion;
                lVar3.resumeWith(Result.m168114constructorimpl(ResultKt.createFailure(new IllegalStateException("Video is expired or failed to download"))));
            }
        }
    }
}
