package com.tencent.p014mm.plugin.vlog.p117ui;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.recordvideo.model.audio.AudioCacheInfo;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C8479f0;
import gy3.C87412m;
import j23.C108531a;
import j23.C60732b;
import kotlin.ResultKt;
import rx3.C13598b0;
import te3.C64899zy;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout$startMux$3$1", mo125469f = "MultiVideoFullScreenPluginLayout.kt", mo125470l = {1784}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.plugin.vlog.ui.f */
public final class C96576f extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f282695d;

    /* renamed from: e */
    public int f282696e;

    /* renamed from: f */
    public final /* synthetic */ MultiVideoFullScreenPluginLayout f282697f;

    /* renamed from: g */
    public final /* synthetic */ C8479f0<String> f282698g;

    /* renamed from: h */
    public final /* synthetic */ String f282699h;

    /* renamed from: i */
    public final /* synthetic */ C32228q<Boolean, C64899zy, Bitmap, C13598b0> f282700i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C96576f(MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout, C8479f0<String> f0Var, String str, C32228q<? super Boolean, ? super C64899zy, ? super Bitmap, C13598b0> qVar, C15601d<? super C96576f> dVar) {
        super(2, dVar);
        this.f282697f = multiVideoFullScreenPluginLayout;
        this.f282698g = f0Var;
        this.f282699h = str;
        this.f282700i = qVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C96576f(this.f282697f, this.f282698g, this.f282699h, this.f282700i, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C96576f) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(T t) {
        C8479f0<String> f0Var;
        T t2 = C15911a.COROUTINE_SUSPENDED;
        int i = this.f282696e;
        boolean z = true;
        if (i == 0) {
            ResultKt.throwOnFailure(t);
            C108531a aVar = this.f282697f.f316597w;
            if (aVar != null) {
                AudioCacheInfo audioCacheInfo = aVar.f324881p;
                FinderObject finderObject = audioCacheInfo != null ? audioCacheInfo.f163830y : null;
                if (finderObject != null) {
                    C8479f0<String> f0Var2 = this.f282698g;
                    String str = this.f282699h;
                    this.f282695d = f0Var2;
                    this.f282696e = 1;
                    t = C53895h.m60469g(C53872d1.f151119c, new C60732b(str, finderObject, aVar, (C15601d<? super C60732b>) null), this);
                    if (t == t2) {
                        return t2;
                    }
                    f0Var = f0Var2;
                }
                C32228q<Boolean, C64899zy, Bitmap, C13598b0> qVar = this.f282700i;
                int i2 = MultiVideoFullScreenPluginLayout.f316537o1;
                this.f282697f.mo152182n((String) this.f282698g.f27484d, qVar);
                return C13598b0.f38549a;
            }
            C87412m.m108603p("addMusicPlugin");
            throw null;
        } else if (i == 1) {
            f0Var = (C8479f0) this.f282695d;
            ResultKt.throwOnFailure(t);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f0Var.f27484d = t;
        CharSequence charSequence = (CharSequence) this.f282698g.f27484d;
        if (!(charSequence == null || charSequence.length() == 0)) {
            z = false;
        }
        if (z) {
            Log.m105920e("MicroMsg.MultiVideoFullScreenPluginLayout", "appendFinderMusicInfo fail, return");
            this.f282697f.f316539B.mo86128x();
            return C13598b0.f38549a;
        }
        C32228q<Boolean, C64899zy, Bitmap, C13598b0> qVar2 = this.f282700i;
        int i25 = MultiVideoFullScreenPluginLayout.f316537o1;
        this.f282697f.mo152182n((String) this.f282698g.f27484d, qVar2);
        return C13598b0.f38549a;
    }
}
