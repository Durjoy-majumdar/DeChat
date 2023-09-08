package com.tencent.p014mm.plugin.sns.cover.preview;

import android.graphics.SurfaceTexture;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32228q;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.sns.cover.preview.a */
public final class C94819a extends C87413o implements C32228q<SurfaceTexture, Integer, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ SnsVideoBackPreview f274669d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C94819a(SnsVideoBackPreview snsVideoBackPreview) {
        super(3);
        this.f274669d = snsVideoBackPreview;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview$createVideoLayout$1$2$1");
        SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
        ((Number) obj2).intValue();
        ((Number) obj3).intValue();
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview$createVideoLayout$1$2$1");
        SnsVideoBackPreview.access$getThumbView(this.f274669d).setVisibility(8);
        Log.m105924i("Finder.SnsVideoBackPreview", "onFrameAvailable");
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview$createVideoLayout$1$2$1");
        C13598b0 b0Var = C13598b0.f38549a;
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview$createVideoLayout$1$2$1");
        return b0Var;
    }
}
