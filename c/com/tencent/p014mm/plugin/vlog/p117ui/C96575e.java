package com.tencent.p014mm.plugin.vlog.p117ui;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import android.graphics.Rect;
import com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager;
import com.tencent.p014mm.plugin.recordvideo.model.audio.AudioCacheInfo;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import j23.C108531a;
import j23.C60732b;
import java.util.ArrayList;
import kotlin.ResultKt;
import lw1.C99685b;
import rx3.C13598b0;
import th2.C110992d;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout$startMux$2$1", mo125469f = "MultiVideoFullScreenPluginLayout.kt", mo125470l = {1751}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.plugin.vlog.ui.e */
public final class C96575e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f282687d;

    /* renamed from: e */
    public final /* synthetic */ MultiVideoFullScreenPluginLayout f282688e;

    /* renamed from: f */
    public final /* synthetic */ String f282689f;

    /* renamed from: g */
    public final /* synthetic */ C99685b.C99690d f282690g;

    /* renamed from: h */
    public final /* synthetic */ String[] f282691h;

    /* renamed from: i */
    public final /* synthetic */ ArrayList<String> f282692i;

    /* renamed from: j */
    public final /* synthetic */ ArrayList<Rect> f282693j;

    /* renamed from: n */
    public final /* synthetic */ CaptureDataManager.CaptureVideoNormalModel f282694n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C96575e(MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout, String str, C99685b.C99690d dVar, String[] strArr, ArrayList<String> arrayList, ArrayList<Rect> arrayList2, CaptureDataManager.CaptureVideoNormalModel captureVideoNormalModel, C15601d<? super C96575e> dVar2) {
        super(2, dVar2);
        this.f282688e = multiVideoFullScreenPluginLayout;
        this.f282689f = str;
        this.f282690g = dVar;
        this.f282691h = strArr;
        this.f282692i = arrayList;
        this.f282693j = arrayList2;
        this.f282694n = captureVideoNormalModel;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C96575e(this.f282688e, this.f282689f, this.f282690g, this.f282691h, this.f282692i, this.f282693j, this.f282694n, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C96575e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f282687d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C108531a aVar2 = this.f282688e.f316597w;
            if (aVar2 != null) {
                AudioCacheInfo audioCacheInfo = aVar2.f324881p;
                FinderObject finderObject = audioCacheInfo != null ? audioCacheInfo.f163830y : null;
                if (finderObject != null) {
                    String str = this.f282689f;
                    this.f282687d = 1;
                    obj = C53895h.m60469g(C53872d1.f151119c, new C60732b(str, finderObject, aVar2, (C15601d<? super C60732b>) null), this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                CaptureDataManager.f272890c.mo129797d(true, C110992d.f332425a.mo162676j());
                MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout = this.f282688e;
                int i2 = MultiVideoFullScreenPluginLayout.f316537o1;
                multiVideoFullScreenPluginLayout.mo152191y(1);
                this.f282688e.mo152183o(this.f282690g, this.f282691h, this.f282692i, this.f282693j, this.f282694n, 0);
                return C13598b0.f38549a;
            }
            C87412m.m108603p("addMusicPlugin");
            throw null;
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        String str2 = (String) obj;
        if (str2 == null || str2.length() == 0) {
            Log.m105920e("MicroMsg.MultiVideoFullScreenPluginLayout", "appendFinderMusicInfo fail, return");
            this.f282688e.f316539B.mo86128x();
            return C13598b0.f38549a;
        }
        CaptureDataManager.f272890c.mo129797d(true, C110992d.f332425a.mo162676j());
        MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout2 = this.f282688e;
        int i25 = MultiVideoFullScreenPluginLayout.f316537o1;
        multiVideoFullScreenPluginLayout2.mo152191y(1);
        this.f282688e.mo152183o(this.f282690g, this.f282691h, this.f282692i, this.f282693j, this.f282694n, 0);
        return C13598b0.f38549a;
    }
}
